/*
 * Copyright 2022 Holoinsight Project Authors. Licensed under Apache-2.0.
 */
// Generated by the protocol buffer compiler. DO NOT EDIT!
// source: common.proto

package io.holoinsight.server.common.grpc;

public interface CommonRequestHeaderOrBuilder extends
    // @@protoc_insertion_point(interface_extends:io.holoinsight.server.common.grpc.CommonRequestHeader)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string apikey = 1;</code>
   */
  java.lang.String getApikey();

  /**
   * <code>string apikey = 1;</code>
   */
  com.google.protobuf.ByteString getApikeyBytes();

  /**
   * <code>string trace_id = 2;</code>
   */
  java.lang.String getTraceId();

  /**
   * <code>string trace_id = 2;</code>
   */
  com.google.protobuf.ByteString getTraceIdBytes();

  /**
   * <code>map&lt;string, string&gt; header = 3;</code>
   */
  int getHeaderCount();

  /**
   * <code>map&lt;string, string&gt; header = 3;</code>
   */
  boolean containsHeader(java.lang.String key);

  /**
   * Use {@link #getHeaderMap()} instead.
   */
  @java.lang.Deprecated
  java.util.Map<java.lang.String, java.lang.String> getHeader();

  /**
   * <code>map&lt;string, string&gt; header = 3;</code>
   */
  java.util.Map<java.lang.String, java.lang.String> getHeaderMap();

  /**
   * <code>map&lt;string, string&gt; header = 3;</code>
   */

  java.lang.String getHeaderOrDefault(java.lang.String key, java.lang.String defaultValue);

  /**
   * <code>map&lt;string, string&gt; header = 3;</code>
   */

  java.lang.String getHeaderOrThrow(java.lang.String key);

  /**
   * <code>string workspace = 4;</code>
   */
  java.lang.String getWorkspace();

  /**
   * <code>string workspace = 4;</code>
   */
  com.google.protobuf.ByteString getWorkspaceBytes();
}
