// Generated by the protocol buffer compiler. DO NOT EDIT!
// source: common/Common.proto

package io.holoinsight.server.apm.grpc.common;

public interface CommandOrBuilder extends
    // @@protoc_insertion_point(interface_extends:io.holoinsight.server.apm.grpc.common.Command)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string command = 1;</code>
   */
  java.lang.String getCommand();

  /**
   * <code>string command = 1;</code>
   */
  com.google.protobuf.ByteString getCommandBytes();

  /**
   * <code>repeated .io.holoinsight.server.apm.grpc.common.KeyStringValuePair args = 2;</code>
   */
  java.util.List<io.holoinsight.server.apm.grpc.common.KeyStringValuePair> getArgsList();

  /**
   * <code>repeated .io.holoinsight.server.apm.grpc.common.KeyStringValuePair args = 2;</code>
   */
  io.holoinsight.server.apm.grpc.common.KeyStringValuePair getArgs(int index);

  /**
   * <code>repeated .io.holoinsight.server.apm.grpc.common.KeyStringValuePair args = 2;</code>
   */
  int getArgsCount();

  /**
   * <code>repeated .io.holoinsight.server.apm.grpc.common.KeyStringValuePair args = 2;</code>
   */
  java.util.List<? extends io.holoinsight.server.apm.grpc.common.KeyStringValuePairOrBuilder> getArgsOrBuilderList();

  /**
   * <code>repeated .io.holoinsight.server.apm.grpc.common.KeyStringValuePair args = 2;</code>
   */
  io.holoinsight.server.apm.grpc.common.KeyStringValuePairOrBuilder getArgsOrBuilder(int index);
}
