// Generated by the protocol buffer compiler. DO NOT EDIT!
// source: opentelemetry/proto/common/v1/common.proto

package io.opentelemetry.proto.common.v1;

public interface KeyValueOrBuilder extends
    // @@protoc_insertion_point(interface_extends:opentelemetry.proto.common.v1.KeyValue)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string key = 1;</code>
   */
  java.lang.String getKey();

  /**
   * <code>string key = 1;</code>
   */
  com.google.protobuf.ByteString getKeyBytes();

  /**
   * <code>.opentelemetry.proto.common.v1.AnyValue value = 2;</code>
   */
  boolean hasValue();

  /**
   * <code>.opentelemetry.proto.common.v1.AnyValue value = 2;</code>
   */
  io.opentelemetry.proto.common.v1.AnyValue getValue();

  /**
   * <code>.opentelemetry.proto.common.v1.AnyValue value = 2;</code>
   */
  io.opentelemetry.proto.common.v1.AnyValueOrBuilder getValueOrBuilder();
}
