/*
 * Copyright 2022 Holoinsight Project Authors. Licensed under Apache-2.0.
 */
package io.holoinsight.server.apm.engine.elasticsearch.utils;

import io.holoinsight.server.apm.common.model.specification.sw.EndpointRelation;
import io.holoinsight.server.apm.common.model.specification.sw.ServiceRelation;
import io.holoinsight.server.apm.common.model.storage.annotation.Column;
import io.holoinsight.server.apm.common.model.storage.annotation.FlatColumn;
import io.holoinsight.server.apm.common.utils.GsonUtils;
import io.holoinsight.server.apm.engine.model.*;

import com.google.common.collect.Lists;
import com.google.gson.*;
import lombok.SneakyThrows;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.*;

/**
 * @author jiwliu
 * @version : GsonUtils.java, v 0.1 2022年09月30日 14:47 xiangwanpeng Exp $
 */
public class EsGsonUtils extends GsonUtils {
  public static ThreadLocal<Gson> esGs = new ThreadLocal<Gson>();

  public static Gson esGson() {
    Gson gson = esGs.get();
    if (gson == null) {
      gson = new GsonBuilder().disableHtmlEscaping()
          .setFieldNamingPolicy(FieldNamingPolicy.LOWER_CASE_WITH_UNDERSCORES)
          .registerTypeHierarchyAdapter(byte[].class, new ByteArrayToBase64TypeAdapter())
          .registerTypeHierarchyAdapter(SpanDO.class, new RecordTypeAdapter(SpanDO.class))
          .registerTypeHierarchyAdapter(ServiceRelationDO.class,
              new RecordTypeAdapter(ServiceRelationDO.class))
          .registerTypeHierarchyAdapter(ServiceInstanceRelationDO.class,
              new RecordTypeAdapter(ServiceInstanceRelationDO.class))
          .registerTypeHierarchyAdapter(EndpointRelationDO.class,
              new RecordTypeAdapter(EndpointRelationDO.class))
          .registerTypeHierarchyAdapter(SlowSqlDO.class, new RecordTypeAdapter(SlowSqlDO.class))
          .registerTypeHierarchyAdapter(ServiceErrorDO.class,
              new RecordTypeAdapter(ServiceErrorDO.class))
          .registerTypeHierarchyAdapter(NetworkAddressMappingDO.class,
              new RecordTypeAdapter(NetworkAddressMappingDO.class))
          .create();
      esGs.set(gson);
    }
    return gson;
  }

  private static class ByteArrayToBase64TypeAdapter
      implements JsonSerializer<byte[]>, JsonDeserializer<byte[]> {
    public byte[] deserialize(JsonElement json, Type typeOfT, JsonDeserializationContext context)
        throws JsonParseException {
      return Base64.getDecoder().decode(json.getAsString());
    }

    public JsonElement serialize(byte[] src, Type typeOfSrc, JsonSerializationContext context) {
      return new JsonPrimitive(Base64.getEncoder().encodeToString(src));
    }
  }

  private static class RecordTypeAdapter<T extends RecordDO>
      implements JsonSerializer<T>, JsonDeserializer<T> {


    private Class<T> cls;
    private List<Field> allFields;

    public RecordTypeAdapter(Class<T> cls) {
      this.cls = cls;
      this.allFields = scanAllFields();
    }

    private List<Field> scanAllFields() {
      Map<String, Field> fieldMap = new HashMap<>();
      Class<?> c = cls;
      while (c != Object.class) {
        Field[] fields = c.getDeclaredFields();
        if (fields.length > 0) {
          for (Field field : fields) {
            fieldMap.putIfAbsent(field.getName(), field);
          }
        }
        c = c.getSuperclass();
      }
      return Lists.newArrayList(fieldMap.values());
    }

    @SneakyThrows
    public T deserialize(JsonElement json, Type typeOfT, JsonDeserializationContext context)
        throws JsonParseException {

      if (json == null) {
        return null;
      }
      T spanEsDO = cls.newInstance();
      try {
        JsonObject jsonObject = json.getAsJsonObject();
        Field flatField = null;
        Map<String, String> map = new HashMap<>();
        for (Field field : allFields) {
          field.setAccessible(true);
          String fieldName = field.getName();
          Class<?> fieldType = field.getType();
          if (field.isAnnotationPresent(FlatColumn.class)) {
            flatField = field;
          } else if (field.isAnnotationPresent(Column.class)) {
            Column column = field.getAnnotation(Column.class);
            String columnName = column.name();
            JsonElement element = jsonObject.remove(columnName);
            if (fieldType == Double.class || fieldType == double.class) {
              field.set(spanEsDO, element.getAsNumber().doubleValue());
            } else if (fieldType == Float.class || fieldType == float.class) {
              field.set(spanEsDO, element.getAsNumber().floatValue());
            } else if (fieldType == Integer.class || fieldType == int.class) {
              field.set(spanEsDO, element.getAsNumber().intValue());
            } else if (fieldType == Long.class || fieldType == long.class) {
              field.set(spanEsDO, element.getAsNumber().longValue());
            } else if (fieldType == Byte.class || fieldType == byte.class) {
              field.set(spanEsDO, element.getAsNumber().byteValue());
            } else if (fieldType == Short.class || fieldType == short.class) {
              field.set(spanEsDO, element.getAsNumber().shortValue());
            } else if (fieldType == Boolean.class || fieldType == boolean.class) {
              field.set(spanEsDO, element.getAsBoolean());
            } else if (fieldType == Character.class || fieldType == char.class) {
              field.set(spanEsDO, element.getAsCharacter());
            } else if (fieldType == String.class) {
              field.set(spanEsDO, element.getAsString());
            } else {
              throw new IllegalArgumentException(
                  String.format("unsupported field type, %s:%s", fieldName, fieldType.getName()));
            }
          }
        }
        Set<String> remainKeys = jsonObject.keySet();
        if (flatField != null && !remainKeys.isEmpty()) {
          for (String key : remainKeys) {
            map.put(key, jsonObject.get(key).getAsString());
          }
          flatField.set(spanEsDO, map);
        }
      } catch (Exception e) {
        throw new RuntimeException(e);
      }
      return spanEsDO;
    }

    public JsonElement serialize(T src, Type typeOfSrc, JsonSerializationContext context) {
      if (src == null) {
        return null;
      }
      JsonObject jsonObject = new JsonObject();
      try {
        for (Field field : allFields) {
          String fieldName = field.getName();
          Class<?> fieldType = field.getType();
          field.setAccessible(true);
          Object value = field.get(src);
          if (field.isAnnotationPresent(FlatColumn.class)) {
            Map map = (Map) value;
            map.forEach((k, v) -> jsonObject.addProperty(String.valueOf(k), String.valueOf(v)));
          } else if (field.isAnnotationPresent(Column.class)) {
            Column column = field.getAnnotation(Column.class);
            String columnName = column.name();
            if (Number.class.isAssignableFrom(fieldType) || fieldType == int.class
                || fieldType == long.class || fieldType == short.class || fieldType == byte.class
                || fieldType == float.class || fieldType == double.class) {
              jsonObject.addProperty(columnName, (Number) value);
            } else if (fieldType == Boolean.class || fieldType == boolean.class) {
              jsonObject.addProperty(columnName, (Boolean) value);
            } else if (fieldType == Character.class || fieldType == char.class) {
              jsonObject.addProperty(columnName, (Character) value);
            } else if (fieldType == String.class) {
              jsonObject.addProperty(columnName, (String) value);
            } else {
              throw new IllegalArgumentException(
                  String.format("unsupported field type, %s:%s", fieldName, fieldType.getName()));
            }
          }
        }
      } catch (Exception e) {
        throw new RuntimeException(e);
      }
      return jsonObject;
    }
  }

}
