// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: simple.proto

package com.reno.grpc;

public final class Simple {
  private Simple() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_reno_grpc_SimpleRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_com_reno_grpc_SimpleRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_reno_grpc_SimpleResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_com_reno_grpc_SimpleResponse_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\014simple.proto\022\rcom.reno.grpc\" \n\rSimpleR" +
      "equest\022\017\n\007message\030\001 \001(\t\"!\n\016SimpleRespons" +
      "e\022\017\n\007message\030\001 \001(\t2\\\n\rSimpleService\022K\n\ng" +
      "etRequest\022\034.com.reno.grpc.SimpleRequest\032" +
      "\035.com.reno.grpc.SimpleResponse\"\000B\021\n\rcom." +
      "reno.grpcP\001b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_com_reno_grpc_SimpleRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_com_reno_grpc_SimpleRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_com_reno_grpc_SimpleRequest_descriptor,
        new java.lang.String[] { "Message", });
    internal_static_com_reno_grpc_SimpleResponse_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_com_reno_grpc_SimpleResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_com_reno_grpc_SimpleResponse_descriptor,
        new java.lang.String[] { "Message", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
