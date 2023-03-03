// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: common/Common.proto

package io.holoinsight.server.apm.grpc.common;

public final class Common {
  private Common() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_io_holoinsight_server_apm_grpc_common_KeyStringValuePair_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_io_holoinsight_server_apm_grpc_common_KeyStringValuePair_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_io_holoinsight_server_apm_grpc_common_CPU_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_io_holoinsight_server_apm_grpc_common_CPU_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_io_holoinsight_server_apm_grpc_common_Commands_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_io_holoinsight_server_apm_grpc_common_Commands_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_io_holoinsight_server_apm_grpc_common_Command_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_io_holoinsight_server_apm_grpc_common_Command_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_io_holoinsight_server_apm_grpc_common_CommonResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_io_holoinsight_server_apm_grpc_common_CommonResponse_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\023common/Common.proto\022%io.holoinsight.se" +
      "rver.apm.grpc.common\"0\n\022KeyStringValuePa" +
      "ir\022\013\n\003key\030\001 \001(\t\022\r\n\005value\030\002 \001(\t\"\033\n\003CPU\022\024\n" +
      "\014usagePercent\030\002 \001(\001\"L\n\010Commands\022@\n\010comma" +
      "nds\030\001 \003(\0132..io.holoinsight.server.apm.gr" +
      "pc.common.Command\"c\n\007Command\022\017\n\007command\030" +
      "\001 \001(\t\022G\n\004args\030\002 \003(\01329.io.holoinsight.ser" +
      "ver.apm.grpc.common.KeyStringValuePair\"/" +
      "\n\016CommonResponse\022\014\n\004code\030\001 \001(\005\022\017\n\007messag" +
      "e\030\002 \001(\t*0\n\013DetectPoint\022\n\n\006client\020\000\022\n\n\006se" +
      "rver\020\001\022\t\n\005proxy\020\002BI\n%io.holoinsight.serv" +
      "er.apm.grpc.commonP\001\252\002\035SkyWalking.Networ" +
      "kProtocol.V3b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_io_holoinsight_server_apm_grpc_common_KeyStringValuePair_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_io_holoinsight_server_apm_grpc_common_KeyStringValuePair_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_io_holoinsight_server_apm_grpc_common_KeyStringValuePair_descriptor,
        new java.lang.String[] { "Key", "Value", });
    internal_static_io_holoinsight_server_apm_grpc_common_CPU_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_io_holoinsight_server_apm_grpc_common_CPU_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_io_holoinsight_server_apm_grpc_common_CPU_descriptor,
        new java.lang.String[] { "UsagePercent", });
    internal_static_io_holoinsight_server_apm_grpc_common_Commands_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_io_holoinsight_server_apm_grpc_common_Commands_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_io_holoinsight_server_apm_grpc_common_Commands_descriptor,
        new java.lang.String[] { "Commands", });
    internal_static_io_holoinsight_server_apm_grpc_common_Command_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_io_holoinsight_server_apm_grpc_common_Command_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_io_holoinsight_server_apm_grpc_common_Command_descriptor,
        new java.lang.String[] { "Command", "Args", });
    internal_static_io_holoinsight_server_apm_grpc_common_CommonResponse_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_io_holoinsight_server_apm_grpc_common_CommonResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_io_holoinsight_server_apm_grpc_common_CommonResponse_descriptor,
        new java.lang.String[] { "Code", "Message", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
