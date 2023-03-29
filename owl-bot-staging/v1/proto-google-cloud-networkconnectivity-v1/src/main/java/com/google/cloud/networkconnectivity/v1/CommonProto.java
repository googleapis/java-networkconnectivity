// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/networkconnectivity/v1/common.proto

package com.google.cloud.networkconnectivity.v1;

public final class CommonProto {
  private CommonProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_networkconnectivity_v1_OperationMetadata_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_networkconnectivity_v1_OperationMetadata_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n0google/cloud/networkconnectivity/v1/co" +
      "mmon.proto\022#google.cloud.networkconnecti" +
      "vity.v1\032\037google/api/field_behavior.proto" +
      "\032\031google/api/resource.proto\032\037google/prot" +
      "obuf/timestamp.proto\"\200\002\n\021OperationMetada" +
      "ta\0224\n\013create_time\030\001 \001(\0132\032.google.protobu" +
      "f.TimestampB\003\340A\003\0221\n\010end_time\030\002 \001(\0132\032.goo" +
      "gle.protobuf.TimestampB\003\340A\003\022\023\n\006target\030\003 " +
      "\001(\tB\003\340A\003\022\021\n\004verb\030\004 \001(\tB\003\340A\003\022\033\n\016status_me" +
      "ssage\030\005 \001(\tB\003\340A\003\022#\n\026requested_cancellati" +
      "on\030\006 \001(\010B\003\340A\003\022\030\n\013api_version\030\007 \001(\tB\003\340A\003B" +
      "\332\003\n\'com.google.cloud.networkconnectivity" +
      ".v1B\013CommonProtoP\001ZYcloud.google.com/go/" +
      "networkconnectivity/apiv1/networkconnect" +
      "ivitypb;networkconnectivitypb\252\002#Google.C" +
      "loud.NetworkConnectivity.V1\312\002#Google\\Clo" +
      "ud\\NetworkConnectivity\\V1\352\002&Google::Clou" +
      "d::NetworkConnectivity::V1\352Az\n-compute.g" +
      "oogleapis.com/InterconnectAttachment\022Ipr" +
      "ojects/{project}/regions/{region}/interc" +
      "onnectAttachments/{resource_id}\352AR\n\036comp" +
      "ute.googleapis.com/Network\0220projects/{pr" +
      "oject}/global/networks/{resource_id}b\006pr" +
      "oto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.api.FieldBehaviorProto.getDescriptor(),
          com.google.api.ResourceProto.getDescriptor(),
          com.google.protobuf.TimestampProto.getDescriptor(),
        });
    internal_static_google_cloud_networkconnectivity_v1_OperationMetadata_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_networkconnectivity_v1_OperationMetadata_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_networkconnectivity_v1_OperationMetadata_descriptor,
        new java.lang.String[] { "CreateTime", "EndTime", "Target", "Verb", "StatusMessage", "RequestedCancellation", "ApiVersion", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    registry.add(com.google.api.ResourceProto.resourceDefinition);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
    com.google.protobuf.TimestampProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
