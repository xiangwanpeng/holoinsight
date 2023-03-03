// Generated by the protocol buffer compiler. DO NOT EDIT!
// source: opentelemetry/proto/trace/v1/trace.proto

package io.opentelemetry.proto.trace.v1;

public interface ResourceSpansOrBuilder extends
    // @@protoc_insertion_point(interface_extends:opentelemetry.proto.trace.v1.ResourceSpans)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The resource for the spans in this message.
   * If this field is not set then no resource info is known.
   * </pre>
   *
   * <code>.opentelemetry.proto.resource.v1.Resource resource = 1;</code>
   */
  boolean hasResource();

  /**
   * <pre>
   * The resource for the spans in this message.
   * If this field is not set then no resource info is known.
   * </pre>
   *
   * <code>.opentelemetry.proto.resource.v1.Resource resource = 1;</code>
   */
  io.opentelemetry.proto.resource.v1.Resource getResource();

  /**
   * <pre>
   * The resource for the spans in this message.
   * If this field is not set then no resource info is known.
   * </pre>
   *
   * <code>.opentelemetry.proto.resource.v1.Resource resource = 1;</code>
   */
  io.opentelemetry.proto.resource.v1.ResourceOrBuilder getResourceOrBuilder();

  /**
   * <pre>
   * A list of ScopeSpans that originate from a resource.
   * </pre>
   *
   * <code>repeated .opentelemetry.proto.trace.v1.ScopeSpans scope_spans = 2;</code>
   */
  java.util.List<io.opentelemetry.proto.trace.v1.ScopeSpans> getScopeSpansList();

  /**
   * <pre>
   * A list of ScopeSpans that originate from a resource.
   * </pre>
   *
   * <code>repeated .opentelemetry.proto.trace.v1.ScopeSpans scope_spans = 2;</code>
   */
  io.opentelemetry.proto.trace.v1.ScopeSpans getScopeSpans(int index);

  /**
   * <pre>
   * A list of ScopeSpans that originate from a resource.
   * </pre>
   *
   * <code>repeated .opentelemetry.proto.trace.v1.ScopeSpans scope_spans = 2;</code>
   */
  int getScopeSpansCount();

  /**
   * <pre>
   * A list of ScopeSpans that originate from a resource.
   * </pre>
   *
   * <code>repeated .opentelemetry.proto.trace.v1.ScopeSpans scope_spans = 2;</code>
   */
  java.util.List<? extends io.opentelemetry.proto.trace.v1.ScopeSpansOrBuilder> getScopeSpansOrBuilderList();

  /**
   * <pre>
   * A list of ScopeSpans that originate from a resource.
   * </pre>
   *
   * <code>repeated .opentelemetry.proto.trace.v1.ScopeSpans scope_spans = 2;</code>
   */
  io.opentelemetry.proto.trace.v1.ScopeSpansOrBuilder getScopeSpansOrBuilder(int index);

  /**
   * <pre>
   * This schema_url applies to the data in the "resource" field. It does not apply
   * to the data in the "scope_spans" field which have their own schema_url field.
   * </pre>
   *
   * <code>string schema_url = 3;</code>
   */
  java.lang.String getSchemaUrl();

  /**
   * <pre>
   * This schema_url applies to the data in the "resource" field. It does not apply
   * to the data in the "scope_spans" field which have their own schema_url field.
   * </pre>
   *
   * <code>string schema_url = 3;</code>
   */
  com.google.protobuf.ByteString getSchemaUrlBytes();
}
