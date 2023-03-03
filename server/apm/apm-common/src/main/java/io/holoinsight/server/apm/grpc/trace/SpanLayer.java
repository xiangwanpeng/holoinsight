// Generated by the protocol buffer compiler. DO NOT EDIT!
// source: trace/Tracing.proto

package io.holoinsight.server.apm.grpc.trace;

/**
 * <pre>
 * Map to the layer of span
 * </pre>
 *
 * Protobuf enum {@code io.holoinsight.server.apm.grpc.trace.SpanLayer}
 */
public enum SpanLayer implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <pre>
   * Unknown layer. Could be anything.
   * </pre>
   *
   * <code>Unknown = 0;</code>
   */
  Unknown(0),
  /**
   * <pre>
   * A database layer, used in tracing the database client component.
   * </pre>
   *
   * <code>Database = 1;</code>
   */
  Database(1),
  /**
   * <pre>
   * A RPC layer, used in both client and server sides of RPC component.
   * </pre>
   *
   * <code>RPCFramework = 2;</code>
   */
  RPCFramework(2),
  /**
   * <pre>
   * HTTP is a more specific RPCFramework.
   * </pre>
   *
   * <code>Http = 3;</code>
   */
  Http(3),
  /**
   * <pre>
   * A MQ layer, used in both producer and consuer sides of the MQ component.
   * </pre>
   *
   * <code>MQ = 4;</code>
   */
  MQ(4),
  /**
   * <pre>
   * A cache layer, used in tracing the cache client component.
   * </pre>
   *
   * <code>Cache = 5;</code>
   */
  Cache(5),
  /**
   * <pre>
   * A FAAS layer, used in function-as-a-Service platform.
   * </pre>
   *
   * <code>FAAS = 6;</code>
   */
  FAAS(6), UNRECOGNIZED(-1),;

  /**
   * <pre>
   * Unknown layer. Could be anything.
   * </pre>
   *
   * <code>Unknown = 0;</code>
   */
  public static final int Unknown_VALUE = 0;
  /**
   * <pre>
   * A database layer, used in tracing the database client component.
   * </pre>
   *
   * <code>Database = 1;</code>
   */
  public static final int Database_VALUE = 1;
  /**
   * <pre>
   * A RPC layer, used in both client and server sides of RPC component.
   * </pre>
   *
   * <code>RPCFramework = 2;</code>
   */
  public static final int RPCFramework_VALUE = 2;
  /**
   * <pre>
   * HTTP is a more specific RPCFramework.
   * </pre>
   *
   * <code>Http = 3;</code>
   */
  public static final int Http_VALUE = 3;
  /**
   * <pre>
   * A MQ layer, used in both producer and consuer sides of the MQ component.
   * </pre>
   *
   * <code>MQ = 4;</code>
   */
  public static final int MQ_VALUE = 4;
  /**
   * <pre>
   * A cache layer, used in tracing the cache client component.
   * </pre>
   *
   * <code>Cache = 5;</code>
   */
  public static final int Cache_VALUE = 5;
  /**
   * <pre>
   * A FAAS layer, used in function-as-a-Service platform.
   * </pre>
   *
   * <code>FAAS = 6;</code>
   */
  public static final int FAAS_VALUE = 6;


  public final int getNumber() {
    if (this == UNRECOGNIZED) {
      throw new java.lang.IllegalArgumentException(
          "Can't get the number of an unknown enum value.");
    }
    return value;
  }

  /**
   * @deprecated Use {@link #forNumber(int)} instead.
   */
  @java.lang.Deprecated
  public static SpanLayer valueOf(int value) {
    return forNumber(value);
  }

  public static SpanLayer forNumber(int value) {
    switch (value) {
      case 0:
        return Unknown;
      case 1:
        return Database;
      case 2:
        return RPCFramework;
      case 3:
        return Http;
      case 4:
        return MQ;
      case 5:
        return Cache;
      case 6:
        return FAAS;
      default:
        return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<SpanLayer> internalGetValueMap() {
    return internalValueMap;
  }

  private static final com.google.protobuf.Internal.EnumLiteMap<SpanLayer> internalValueMap =
      new com.google.protobuf.Internal.EnumLiteMap<SpanLayer>() {
        public SpanLayer findValueByNumber(int number) {
          return SpanLayer.forNumber(number);
        }
      };

  public final com.google.protobuf.Descriptors.EnumValueDescriptor getValueDescriptor() {
    return getDescriptor().getValues().get(ordinal());
  }

  public final com.google.protobuf.Descriptors.EnumDescriptor getDescriptorForType() {
    return getDescriptor();
  }

  public static final com.google.protobuf.Descriptors.EnumDescriptor getDescriptor() {
    return io.holoinsight.server.apm.grpc.trace.Tracing.getDescriptor().getEnumTypes().get(2);
  }

  private static final SpanLayer[] VALUES = values();

  public static SpanLayer valueOf(com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
    if (desc.getType() != getDescriptor()) {
      throw new java.lang.IllegalArgumentException("EnumValueDescriptor is not for this type.");
    }
    if (desc.getIndex() == -1) {
      return UNRECOGNIZED;
    }
    return VALUES[desc.getIndex()];
  }

  private final int value;

  private SpanLayer(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:io.holoinsight.server.apm.grpc.trace.SpanLayer)
}

