/*
 * Copyright 2020 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/networkconnectivity/v1/hub.proto

package com.google.cloud.networkconnectivity.v1;

/**
 *
 *
 * <pre>
 * A collection of Cloud VPN tunnel resources. These resources should be
 * redundant HA VPN tunnels that all advertise the same prefixes to Google
 * Cloud. Alternatively, in a passive/active configuration, all tunnels
 * should be capable of advertising the same prefixes.
 * </pre>
 *
 * Protobuf type {@code google.cloud.networkconnectivity.v1.LinkedVpnTunnels}
 */
public final class LinkedVpnTunnels extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.networkconnectivity.v1.LinkedVpnTunnels)
    LinkedVpnTunnelsOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use LinkedVpnTunnels.newBuilder() to construct.
  private LinkedVpnTunnels(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private LinkedVpnTunnels() {
    uris_ = com.google.protobuf.LazyStringArrayList.EMPTY;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new LinkedVpnTunnels();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
    return this.unknownFields;
  }

  private LinkedVpnTunnels(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    int mutable_bitField0_ = 0;
    com.google.protobuf.UnknownFieldSet.Builder unknownFields =
        com.google.protobuf.UnknownFieldSet.newBuilder();
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          case 10:
            {
              java.lang.String s = input.readStringRequireUtf8();
              if (!((mutable_bitField0_ & 0x00000001) != 0)) {
                uris_ = new com.google.protobuf.LazyStringArrayList();
                mutable_bitField0_ |= 0x00000001;
              }
              uris_.add(s);
              break;
            }
          case 16:
            {
              siteToSiteDataTransfer_ = input.readBool();
              break;
            }
          default:
            {
              if (!parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
                done = true;
              }
              break;
            }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(e).setUnfinishedMessage(this);
    } finally {
      if (((mutable_bitField0_ & 0x00000001) != 0)) {
        uris_ = uris_.getUnmodifiableView();
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.networkconnectivity.v1.HubProto
        .internal_static_google_cloud_networkconnectivity_v1_LinkedVpnTunnels_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.networkconnectivity.v1.HubProto
        .internal_static_google_cloud_networkconnectivity_v1_LinkedVpnTunnels_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.networkconnectivity.v1.LinkedVpnTunnels.class,
            com.google.cloud.networkconnectivity.v1.LinkedVpnTunnels.Builder.class);
  }

  public static final int URIS_FIELD_NUMBER = 1;
  private com.google.protobuf.LazyStringList uris_;
  /**
   *
   *
   * <pre>
   * The URIs of linked VPN tunnel resources.
   * </pre>
   *
   * <code>repeated string uris = 1 [(.google.api.resource_reference) = { ... }</code>
   *
   * @return A list containing the uris.
   */
  public com.google.protobuf.ProtocolStringList getUrisList() {
    return uris_;
  }
  /**
   *
   *
   * <pre>
   * The URIs of linked VPN tunnel resources.
   * </pre>
   *
   * <code>repeated string uris = 1 [(.google.api.resource_reference) = { ... }</code>
   *
   * @return The count of uris.
   */
  public int getUrisCount() {
    return uris_.size();
  }
  /**
   *
   *
   * <pre>
   * The URIs of linked VPN tunnel resources.
   * </pre>
   *
   * <code>repeated string uris = 1 [(.google.api.resource_reference) = { ... }</code>
   *
   * @param index The index of the element to return.
   * @return The uris at the given index.
   */
  public java.lang.String getUris(int index) {
    return uris_.get(index);
  }
  /**
   *
   *
   * <pre>
   * The URIs of linked VPN tunnel resources.
   * </pre>
   *
   * <code>repeated string uris = 1 [(.google.api.resource_reference) = { ... }</code>
   *
   * @param index The index of the value to return.
   * @return The bytes of the uris at the given index.
   */
  public com.google.protobuf.ByteString getUrisBytes(int index) {
    return uris_.getByteString(index);
  }

  public static final int SITE_TO_SITE_DATA_TRANSFER_FIELD_NUMBER = 2;
  private boolean siteToSiteDataTransfer_;
  /**
   *
   *
   * <pre>
   * A value that controls whether site-to-site data transfer is enabled for
   * these resources. This field is set to false by default, but you must set it
   * to true. Note that data transfer is available only in supported locations.
   * </pre>
   *
   * <code>bool site_to_site_data_transfer = 2;</code>
   *
   * @return The siteToSiteDataTransfer.
   */
  @java.lang.Override
  public boolean getSiteToSiteDataTransfer() {
    return siteToSiteDataTransfer_;
  }

  private byte memoizedIsInitialized = -1;

  @java.lang.Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @java.lang.Override
  public void writeTo(com.google.protobuf.CodedOutputStream output) throws java.io.IOException {
    for (int i = 0; i < uris_.size(); i++) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, uris_.getRaw(i));
    }
    if (siteToSiteDataTransfer_ != false) {
      output.writeBool(2, siteToSiteDataTransfer_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    {
      int dataSize = 0;
      for (int i = 0; i < uris_.size(); i++) {
        dataSize += computeStringSizeNoTag(uris_.getRaw(i));
      }
      size += dataSize;
      size += 1 * getUrisList().size();
    }
    if (siteToSiteDataTransfer_ != false) {
      size += com.google.protobuf.CodedOutputStream.computeBoolSize(2, siteToSiteDataTransfer_);
    }
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
      return true;
    }
    if (!(obj instanceof com.google.cloud.networkconnectivity.v1.LinkedVpnTunnels)) {
      return super.equals(obj);
    }
    com.google.cloud.networkconnectivity.v1.LinkedVpnTunnels other =
        (com.google.cloud.networkconnectivity.v1.LinkedVpnTunnels) obj;

    if (!getUrisList().equals(other.getUrisList())) return false;
    if (getSiteToSiteDataTransfer() != other.getSiteToSiteDataTransfer()) return false;
    if (!unknownFields.equals(other.unknownFields)) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    if (getUrisCount() > 0) {
      hash = (37 * hash) + URIS_FIELD_NUMBER;
      hash = (53 * hash) + getUrisList().hashCode();
    }
    hash = (37 * hash) + SITE_TO_SITE_DATA_TRANSFER_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(getSiteToSiteDataTransfer());
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.networkconnectivity.v1.LinkedVpnTunnels parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.networkconnectivity.v1.LinkedVpnTunnels parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.networkconnectivity.v1.LinkedVpnTunnels parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.networkconnectivity.v1.LinkedVpnTunnels parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.networkconnectivity.v1.LinkedVpnTunnels parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.networkconnectivity.v1.LinkedVpnTunnels parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.networkconnectivity.v1.LinkedVpnTunnels parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.networkconnectivity.v1.LinkedVpnTunnels parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.networkconnectivity.v1.LinkedVpnTunnels parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.networkconnectivity.v1.LinkedVpnTunnels parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.networkconnectivity.v1.LinkedVpnTunnels parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.networkconnectivity.v1.LinkedVpnTunnels parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() {
    return newBuilder();
  }

  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }

  public static Builder newBuilder(
      com.google.cloud.networkconnectivity.v1.LinkedVpnTunnels prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }

  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   *
   *
   * <pre>
   * A collection of Cloud VPN tunnel resources. These resources should be
   * redundant HA VPN tunnels that all advertise the same prefixes to Google
   * Cloud. Alternatively, in a passive/active configuration, all tunnels
   * should be capable of advertising the same prefixes.
   * </pre>
   *
   * Protobuf type {@code google.cloud.networkconnectivity.v1.LinkedVpnTunnels}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.networkconnectivity.v1.LinkedVpnTunnels)
      com.google.cloud.networkconnectivity.v1.LinkedVpnTunnelsOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.networkconnectivity.v1.HubProto
          .internal_static_google_cloud_networkconnectivity_v1_LinkedVpnTunnels_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.networkconnectivity.v1.HubProto
          .internal_static_google_cloud_networkconnectivity_v1_LinkedVpnTunnels_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.networkconnectivity.v1.LinkedVpnTunnels.class,
              com.google.cloud.networkconnectivity.v1.LinkedVpnTunnels.Builder.class);
    }

    // Construct using com.google.cloud.networkconnectivity.v1.LinkedVpnTunnels.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }

    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders) {}
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      uris_ = com.google.protobuf.LazyStringArrayList.EMPTY;
      bitField0_ = (bitField0_ & ~0x00000001);
      siteToSiteDataTransfer_ = false;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.networkconnectivity.v1.HubProto
          .internal_static_google_cloud_networkconnectivity_v1_LinkedVpnTunnels_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.networkconnectivity.v1.LinkedVpnTunnels getDefaultInstanceForType() {
      return com.google.cloud.networkconnectivity.v1.LinkedVpnTunnels.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.networkconnectivity.v1.LinkedVpnTunnels build() {
      com.google.cloud.networkconnectivity.v1.LinkedVpnTunnels result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.networkconnectivity.v1.LinkedVpnTunnels buildPartial() {
      com.google.cloud.networkconnectivity.v1.LinkedVpnTunnels result =
          new com.google.cloud.networkconnectivity.v1.LinkedVpnTunnels(this);
      int from_bitField0_ = bitField0_;
      if (((bitField0_ & 0x00000001) != 0)) {
        uris_ = uris_.getUnmodifiableView();
        bitField0_ = (bitField0_ & ~0x00000001);
      }
      result.uris_ = uris_;
      result.siteToSiteDataTransfer_ = siteToSiteDataTransfer_;
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return super.clone();
    }

    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field, java.lang.Object value) {
      return super.setField(field, value);
    }

    @java.lang.Override
    public Builder clearField(com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }

    @java.lang.Override
    public Builder clearOneof(com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }

    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field, int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }

    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field, java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.google.cloud.networkconnectivity.v1.LinkedVpnTunnels) {
        return mergeFrom((com.google.cloud.networkconnectivity.v1.LinkedVpnTunnels) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.networkconnectivity.v1.LinkedVpnTunnels other) {
      if (other == com.google.cloud.networkconnectivity.v1.LinkedVpnTunnels.getDefaultInstance())
        return this;
      if (!other.uris_.isEmpty()) {
        if (uris_.isEmpty()) {
          uris_ = other.uris_;
          bitField0_ = (bitField0_ & ~0x00000001);
        } else {
          ensureUrisIsMutable();
          uris_.addAll(other.uris_);
        }
        onChanged();
      }
      if (other.getSiteToSiteDataTransfer() != false) {
        setSiteToSiteDataTransfer(other.getSiteToSiteDataTransfer());
      }
      this.mergeUnknownFields(other.unknownFields);
      onChanged();
      return this;
    }

    @java.lang.Override
    public final boolean isInitialized() {
      return true;
    }

    @java.lang.Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      com.google.cloud.networkconnectivity.v1.LinkedVpnTunnels parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage =
            (com.google.cloud.networkconnectivity.v1.LinkedVpnTunnels) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private int bitField0_;

    private com.google.protobuf.LazyStringList uris_ =
        com.google.protobuf.LazyStringArrayList.EMPTY;

    private void ensureUrisIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        uris_ = new com.google.protobuf.LazyStringArrayList(uris_);
        bitField0_ |= 0x00000001;
      }
    }
    /**
     *
     *
     * <pre>
     * The URIs of linked VPN tunnel resources.
     * </pre>
     *
     * <code>repeated string uris = 1 [(.google.api.resource_reference) = { ... }</code>
     *
     * @return A list containing the uris.
     */
    public com.google.protobuf.ProtocolStringList getUrisList() {
      return uris_.getUnmodifiableView();
    }
    /**
     *
     *
     * <pre>
     * The URIs of linked VPN tunnel resources.
     * </pre>
     *
     * <code>repeated string uris = 1 [(.google.api.resource_reference) = { ... }</code>
     *
     * @return The count of uris.
     */
    public int getUrisCount() {
      return uris_.size();
    }
    /**
     *
     *
     * <pre>
     * The URIs of linked VPN tunnel resources.
     * </pre>
     *
     * <code>repeated string uris = 1 [(.google.api.resource_reference) = { ... }</code>
     *
     * @param index The index of the element to return.
     * @return The uris at the given index.
     */
    public java.lang.String getUris(int index) {
      return uris_.get(index);
    }
    /**
     *
     *
     * <pre>
     * The URIs of linked VPN tunnel resources.
     * </pre>
     *
     * <code>repeated string uris = 1 [(.google.api.resource_reference) = { ... }</code>
     *
     * @param index The index of the value to return.
     * @return The bytes of the uris at the given index.
     */
    public com.google.protobuf.ByteString getUrisBytes(int index) {
      return uris_.getByteString(index);
    }
    /**
     *
     *
     * <pre>
     * The URIs of linked VPN tunnel resources.
     * </pre>
     *
     * <code>repeated string uris = 1 [(.google.api.resource_reference) = { ... }</code>
     *
     * @param index The index to set the value at.
     * @param value The uris to set.
     * @return This builder for chaining.
     */
    public Builder setUris(int index, java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      ensureUrisIsMutable();
      uris_.set(index, value);
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The URIs of linked VPN tunnel resources.
     * </pre>
     *
     * <code>repeated string uris = 1 [(.google.api.resource_reference) = { ... }</code>
     *
     * @param value The uris to add.
     * @return This builder for chaining.
     */
    public Builder addUris(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      ensureUrisIsMutable();
      uris_.add(value);
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The URIs of linked VPN tunnel resources.
     * </pre>
     *
     * <code>repeated string uris = 1 [(.google.api.resource_reference) = { ... }</code>
     *
     * @param values The uris to add.
     * @return This builder for chaining.
     */
    public Builder addAllUris(java.lang.Iterable<java.lang.String> values) {
      ensureUrisIsMutable();
      com.google.protobuf.AbstractMessageLite.Builder.addAll(values, uris_);
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The URIs of linked VPN tunnel resources.
     * </pre>
     *
     * <code>repeated string uris = 1 [(.google.api.resource_reference) = { ... }</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearUris() {
      uris_ = com.google.protobuf.LazyStringArrayList.EMPTY;
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The URIs of linked VPN tunnel resources.
     * </pre>
     *
     * <code>repeated string uris = 1 [(.google.api.resource_reference) = { ... }</code>
     *
     * @param value The bytes of the uris to add.
     * @return This builder for chaining.
     */
    public Builder addUrisBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);
      ensureUrisIsMutable();
      uris_.add(value);
      onChanged();
      return this;
    }

    private boolean siteToSiteDataTransfer_;
    /**
     *
     *
     * <pre>
     * A value that controls whether site-to-site data transfer is enabled for
     * these resources. This field is set to false by default, but you must set it
     * to true. Note that data transfer is available only in supported locations.
     * </pre>
     *
     * <code>bool site_to_site_data_transfer = 2;</code>
     *
     * @return The siteToSiteDataTransfer.
     */
    @java.lang.Override
    public boolean getSiteToSiteDataTransfer() {
      return siteToSiteDataTransfer_;
    }
    /**
     *
     *
     * <pre>
     * A value that controls whether site-to-site data transfer is enabled for
     * these resources. This field is set to false by default, but you must set it
     * to true. Note that data transfer is available only in supported locations.
     * </pre>
     *
     * <code>bool site_to_site_data_transfer = 2;</code>
     *
     * @param value The siteToSiteDataTransfer to set.
     * @return This builder for chaining.
     */
    public Builder setSiteToSiteDataTransfer(boolean value) {

      siteToSiteDataTransfer_ = value;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * A value that controls whether site-to-site data transfer is enabled for
     * these resources. This field is set to false by default, but you must set it
     * to true. Note that data transfer is available only in supported locations.
     * </pre>
     *
     * <code>bool site_to_site_data_transfer = 2;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearSiteToSiteDataTransfer() {

      siteToSiteDataTransfer_ = false;
      onChanged();
      return this;
    }

    @java.lang.Override
    public final Builder setUnknownFields(final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }

    // @@protoc_insertion_point(builder_scope:google.cloud.networkconnectivity.v1.LinkedVpnTunnels)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.networkconnectivity.v1.LinkedVpnTunnels)
  private static final com.google.cloud.networkconnectivity.v1.LinkedVpnTunnels DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.networkconnectivity.v1.LinkedVpnTunnels();
  }

  public static com.google.cloud.networkconnectivity.v1.LinkedVpnTunnels getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<LinkedVpnTunnels> PARSER =
      new com.google.protobuf.AbstractParser<LinkedVpnTunnels>() {
        @java.lang.Override
        public LinkedVpnTunnels parsePartialFrom(
            com.google.protobuf.CodedInputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
          return new LinkedVpnTunnels(input, extensionRegistry);
        }
      };

  public static com.google.protobuf.Parser<LinkedVpnTunnels> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<LinkedVpnTunnels> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.networkconnectivity.v1.LinkedVpnTunnels getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
