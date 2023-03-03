/*
 * Copyright 2022 Holoinsight Project Authors. Licensed under Apache-2.0.
 */
// Generated by the protocol buffer compiler. DO NOT EDIT!
// source: opentelemetry/proto/metrics/v1/metrics.proto

package io.opentelemetry.proto.metrics.v1;

/**
 * <pre>
 * MetricsData represents the metrics data that can be stored in a persistent
 * storage, OR can be embedded by other protocols that transfer OTLP metrics
 * data but do not implement the OTLP protocol.
 * The main difference between this message and collector protocol is that
 * in this message there will not be any "control" or "metadata" specific to
 * OTLP protocol.
 * When new fields are added into this message, the OTLP request MUST be updated
 * as well.
 * </pre>
 *
 * Protobuf type {@code opentelemetry.proto.metrics.v1.MetricsData}
 */
public final class MetricsData extends com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:opentelemetry.proto.metrics.v1.MetricsData)
    MetricsDataOrBuilder {
  private static final long serialVersionUID = 0L;

  // Use MetricsData.newBuilder() to construct.
  private MetricsData(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private MetricsData() {
    resourceMetrics_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new MetricsData();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
    return this.unknownFields;
  }

  private MetricsData(com.google.protobuf.CodedInputStream input,
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
          case 10: {
            if (!((mutable_bitField0_ & 0x00000001) != 0)) {
              resourceMetrics_ =
                  new java.util.ArrayList<io.opentelemetry.proto.metrics.v1.ResourceMetrics>();
              mutable_bitField0_ |= 0x00000001;
            }
            resourceMetrics_.add(input.readMessage(
                io.opentelemetry.proto.metrics.v1.ResourceMetrics.parser(), extensionRegistry));
            break;
          }
          default: {
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
        resourceMetrics_ = java.util.Collections.unmodifiableList(resourceMetrics_);
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return io.opentelemetry.proto.metrics.v1.MetricsProto.internal_static_opentelemetry_proto_metrics_v1_MetricsData_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
    return io.opentelemetry.proto.metrics.v1.MetricsProto.internal_static_opentelemetry_proto_metrics_v1_MetricsData_fieldAccessorTable
        .ensureFieldAccessorsInitialized(io.opentelemetry.proto.metrics.v1.MetricsData.class,
            io.opentelemetry.proto.metrics.v1.MetricsData.Builder.class);
  }

  public static final int RESOURCE_METRICS_FIELD_NUMBER = 1;
  private java.util.List<io.opentelemetry.proto.metrics.v1.ResourceMetrics> resourceMetrics_;

  /**
   * <pre>
   * An array of ResourceMetrics.
   * For data coming from a single resource this array will typically contain
   * one element. Intermediary nodes that receive data from multiple origins
   * typically batch the data before forwarding further and in that case this
   * array will contain multiple elements.
   * </pre>
   *
   * <code>repeated .opentelemetry.proto.metrics.v1.ResourceMetrics resource_metrics = 1;</code>
   */
  public java.util.List<io.opentelemetry.proto.metrics.v1.ResourceMetrics> getResourceMetricsList() {
    return resourceMetrics_;
  }

  /**
   * <pre>
   * An array of ResourceMetrics.
   * For data coming from a single resource this array will typically contain
   * one element. Intermediary nodes that receive data from multiple origins
   * typically batch the data before forwarding further and in that case this
   * array will contain multiple elements.
   * </pre>
   *
   * <code>repeated .opentelemetry.proto.metrics.v1.ResourceMetrics resource_metrics = 1;</code>
   */
  public java.util.List<? extends io.opentelemetry.proto.metrics.v1.ResourceMetricsOrBuilder> getResourceMetricsOrBuilderList() {
    return resourceMetrics_;
  }

  /**
   * <pre>
   * An array of ResourceMetrics.
   * For data coming from a single resource this array will typically contain
   * one element. Intermediary nodes that receive data from multiple origins
   * typically batch the data before forwarding further and in that case this
   * array will contain multiple elements.
   * </pre>
   *
   * <code>repeated .opentelemetry.proto.metrics.v1.ResourceMetrics resource_metrics = 1;</code>
   */
  public int getResourceMetricsCount() {
    return resourceMetrics_.size();
  }

  /**
   * <pre>
   * An array of ResourceMetrics.
   * For data coming from a single resource this array will typically contain
   * one element. Intermediary nodes that receive data from multiple origins
   * typically batch the data before forwarding further and in that case this
   * array will contain multiple elements.
   * </pre>
   *
   * <code>repeated .opentelemetry.proto.metrics.v1.ResourceMetrics resource_metrics = 1;</code>
   */
  public io.opentelemetry.proto.metrics.v1.ResourceMetrics getResourceMetrics(int index) {
    return resourceMetrics_.get(index);
  }

  /**
   * <pre>
   * An array of ResourceMetrics.
   * For data coming from a single resource this array will typically contain
   * one element. Intermediary nodes that receive data from multiple origins
   * typically batch the data before forwarding further and in that case this
   * array will contain multiple elements.
   * </pre>
   *
   * <code>repeated .opentelemetry.proto.metrics.v1.ResourceMetrics resource_metrics = 1;</code>
   */
  public io.opentelemetry.proto.metrics.v1.ResourceMetricsOrBuilder getResourceMetricsOrBuilder(
      int index) {
    return resourceMetrics_.get(index);
  }

  private byte memoizedIsInitialized = -1;

  @java.lang.Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1)
      return true;
    if (isInitialized == 0)
      return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @java.lang.Override
  public void writeTo(com.google.protobuf.CodedOutputStream output) throws java.io.IOException {
    for (int i = 0; i < resourceMetrics_.size(); i++) {
      output.writeMessage(1, resourceMetrics_.get(i));
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1)
      return size;

    size = 0;
    for (int i = 0; i < resourceMetrics_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(1, resourceMetrics_.get(i));
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
    if (!(obj instanceof io.opentelemetry.proto.metrics.v1.MetricsData)) {
      return super.equals(obj);
    }
    io.opentelemetry.proto.metrics.v1.MetricsData other =
        (io.opentelemetry.proto.metrics.v1.MetricsData) obj;

    if (!getResourceMetricsList().equals(other.getResourceMetricsList()))
      return false;
    if (!unknownFields.equals(other.unknownFields))
      return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    if (getResourceMetricsCount() > 0) {
      hash = (37 * hash) + RESOURCE_METRICS_FIELD_NUMBER;
      hash = (53 * hash) + getResourceMetricsList().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static io.opentelemetry.proto.metrics.v1.MetricsData parseFrom(java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static io.opentelemetry.proto.metrics.v1.MetricsData parseFrom(java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static io.opentelemetry.proto.metrics.v1.MetricsData parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static io.opentelemetry.proto.metrics.v1.MetricsData parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static io.opentelemetry.proto.metrics.v1.MetricsData parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static io.opentelemetry.proto.metrics.v1.MetricsData parseFrom(byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static io.opentelemetry.proto.metrics.v1.MetricsData parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static io.opentelemetry.proto.metrics.v1.MetricsData parseFrom(java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input,
        extensionRegistry);
  }

  public static io.opentelemetry.proto.metrics.v1.MetricsData parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static io.opentelemetry.proto.metrics.v1.MetricsData parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input,
        extensionRegistry);
  }

  public static io.opentelemetry.proto.metrics.v1.MetricsData parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static io.opentelemetry.proto.metrics.v1.MetricsData parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input,
        extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() {
    return newBuilder();
  }

  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }

  public static Builder newBuilder(io.opentelemetry.proto.metrics.v1.MetricsData prototype) {
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
   * <pre>
   * MetricsData represents the metrics data that can be stored in a persistent
   * storage, OR can be embedded by other protocols that transfer OTLP metrics
   * data but do not implement the OTLP protocol.
   * The main difference between this message and collector protocol is that
   * in this message there will not be any "control" or "metadata" specific to
   * OTLP protocol.
   * When new fields are added into this message, the OTLP request MUST be updated
   * as well.
   * </pre>
   *
   * Protobuf type {@code opentelemetry.proto.metrics.v1.MetricsData}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:opentelemetry.proto.metrics.v1.MetricsData)
      io.opentelemetry.proto.metrics.v1.MetricsDataOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return io.opentelemetry.proto.metrics.v1.MetricsProto.internal_static_opentelemetry_proto_metrics_v1_MetricsData_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
      return io.opentelemetry.proto.metrics.v1.MetricsProto.internal_static_opentelemetry_proto_metrics_v1_MetricsData_fieldAccessorTable
          .ensureFieldAccessorsInitialized(io.opentelemetry.proto.metrics.v1.MetricsData.class,
              io.opentelemetry.proto.metrics.v1.MetricsData.Builder.class);
    }

    // Construct using io.opentelemetry.proto.metrics.v1.MetricsData.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }

    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders) {
        getResourceMetricsFieldBuilder();
      }
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      if (resourceMetricsBuilder_ == null) {
        resourceMetrics_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
      } else {
        resourceMetricsBuilder_.clear();
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return io.opentelemetry.proto.metrics.v1.MetricsProto.internal_static_opentelemetry_proto_metrics_v1_MetricsData_descriptor;
    }

    @java.lang.Override
    public io.opentelemetry.proto.metrics.v1.MetricsData getDefaultInstanceForType() {
      return io.opentelemetry.proto.metrics.v1.MetricsData.getDefaultInstance();
    }

    @java.lang.Override
    public io.opentelemetry.proto.metrics.v1.MetricsData build() {
      io.opentelemetry.proto.metrics.v1.MetricsData result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public io.opentelemetry.proto.metrics.v1.MetricsData buildPartial() {
      io.opentelemetry.proto.metrics.v1.MetricsData result =
          new io.opentelemetry.proto.metrics.v1.MetricsData(this);
      int from_bitField0_ = bitField0_;
      if (resourceMetricsBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          resourceMetrics_ = java.util.Collections.unmodifiableList(resourceMetrics_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.resourceMetrics_ = resourceMetrics_;
      } else {
        result.resourceMetrics_ = resourceMetricsBuilder_.build();
      }
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return super.clone();
    }

    @java.lang.Override
    public Builder setField(com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
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
    public Builder setRepeatedField(com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }

    @java.lang.Override
    public Builder addRepeatedField(com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof io.opentelemetry.proto.metrics.v1.MetricsData) {
        return mergeFrom((io.opentelemetry.proto.metrics.v1.MetricsData) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(io.opentelemetry.proto.metrics.v1.MetricsData other) {
      if (other == io.opentelemetry.proto.metrics.v1.MetricsData.getDefaultInstance())
        return this;
      if (resourceMetricsBuilder_ == null) {
        if (!other.resourceMetrics_.isEmpty()) {
          if (resourceMetrics_.isEmpty()) {
            resourceMetrics_ = other.resourceMetrics_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureResourceMetricsIsMutable();
            resourceMetrics_.addAll(other.resourceMetrics_);
          }
          onChanged();
        }
      } else {
        if (!other.resourceMetrics_.isEmpty()) {
          if (resourceMetricsBuilder_.isEmpty()) {
            resourceMetricsBuilder_.dispose();
            resourceMetricsBuilder_ = null;
            resourceMetrics_ = other.resourceMetrics_;
            bitField0_ = (bitField0_ & ~0x00000001);
            resourceMetricsBuilder_ = com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders
                ? getResourceMetricsFieldBuilder()
                : null;
          } else {
            resourceMetricsBuilder_.addAllMessages(other.resourceMetrics_);
          }
        }
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
    public Builder mergeFrom(com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry) throws java.io.IOException {
      io.opentelemetry.proto.metrics.v1.MetricsData parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (io.opentelemetry.proto.metrics.v1.MetricsData) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private int bitField0_;

    private java.util.List<io.opentelemetry.proto.metrics.v1.ResourceMetrics> resourceMetrics_ =
        java.util.Collections.emptyList();

    private void ensureResourceMetricsIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        resourceMetrics_ =
            new java.util.ArrayList<io.opentelemetry.proto.metrics.v1.ResourceMetrics>(
                resourceMetrics_);
        bitField0_ |= 0x00000001;
      }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<io.opentelemetry.proto.metrics.v1.ResourceMetrics, io.opentelemetry.proto.metrics.v1.ResourceMetrics.Builder, io.opentelemetry.proto.metrics.v1.ResourceMetricsOrBuilder> resourceMetricsBuilder_;

    /**
     * <pre>
     * An array of ResourceMetrics.
     * For data coming from a single resource this array will typically contain
     * one element. Intermediary nodes that receive data from multiple origins
     * typically batch the data before forwarding further and in that case this
     * array will contain multiple elements.
     * </pre>
     *
     * <code>repeated .opentelemetry.proto.metrics.v1.ResourceMetrics resource_metrics = 1;</code>
     */
    public java.util.List<io.opentelemetry.proto.metrics.v1.ResourceMetrics> getResourceMetricsList() {
      if (resourceMetricsBuilder_ == null) {
        return java.util.Collections.unmodifiableList(resourceMetrics_);
      } else {
        return resourceMetricsBuilder_.getMessageList();
      }
    }

    /**
     * <pre>
     * An array of ResourceMetrics.
     * For data coming from a single resource this array will typically contain
     * one element. Intermediary nodes that receive data from multiple origins
     * typically batch the data before forwarding further and in that case this
     * array will contain multiple elements.
     * </pre>
     *
     * <code>repeated .opentelemetry.proto.metrics.v1.ResourceMetrics resource_metrics = 1;</code>
     */
    public int getResourceMetricsCount() {
      if (resourceMetricsBuilder_ == null) {
        return resourceMetrics_.size();
      } else {
        return resourceMetricsBuilder_.getCount();
      }
    }

    /**
     * <pre>
     * An array of ResourceMetrics.
     * For data coming from a single resource this array will typically contain
     * one element. Intermediary nodes that receive data from multiple origins
     * typically batch the data before forwarding further and in that case this
     * array will contain multiple elements.
     * </pre>
     *
     * <code>repeated .opentelemetry.proto.metrics.v1.ResourceMetrics resource_metrics = 1;</code>
     */
    public io.opentelemetry.proto.metrics.v1.ResourceMetrics getResourceMetrics(int index) {
      if (resourceMetricsBuilder_ == null) {
        return resourceMetrics_.get(index);
      } else {
        return resourceMetricsBuilder_.getMessage(index);
      }
    }

    /**
     * <pre>
     * An array of ResourceMetrics.
     * For data coming from a single resource this array will typically contain
     * one element. Intermediary nodes that receive data from multiple origins
     * typically batch the data before forwarding further and in that case this
     * array will contain multiple elements.
     * </pre>
     *
     * <code>repeated .opentelemetry.proto.metrics.v1.ResourceMetrics resource_metrics = 1;</code>
     */
    public Builder setResourceMetrics(int index,
        io.opentelemetry.proto.metrics.v1.ResourceMetrics value) {
      if (resourceMetricsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureResourceMetricsIsMutable();
        resourceMetrics_.set(index, value);
        onChanged();
      } else {
        resourceMetricsBuilder_.setMessage(index, value);
      }
      return this;
    }

    /**
     * <pre>
     * An array of ResourceMetrics.
     * For data coming from a single resource this array will typically contain
     * one element. Intermediary nodes that receive data from multiple origins
     * typically batch the data before forwarding further and in that case this
     * array will contain multiple elements.
     * </pre>
     *
     * <code>repeated .opentelemetry.proto.metrics.v1.ResourceMetrics resource_metrics = 1;</code>
     */
    public Builder setResourceMetrics(int index,
        io.opentelemetry.proto.metrics.v1.ResourceMetrics.Builder builderForValue) {
      if (resourceMetricsBuilder_ == null) {
        ensureResourceMetricsIsMutable();
        resourceMetrics_.set(index, builderForValue.build());
        onChanged();
      } else {
        resourceMetricsBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }

    /**
     * <pre>
     * An array of ResourceMetrics.
     * For data coming from a single resource this array will typically contain
     * one element. Intermediary nodes that receive data from multiple origins
     * typically batch the data before forwarding further and in that case this
     * array will contain multiple elements.
     * </pre>
     *
     * <code>repeated .opentelemetry.proto.metrics.v1.ResourceMetrics resource_metrics = 1;</code>
     */
    public Builder addResourceMetrics(io.opentelemetry.proto.metrics.v1.ResourceMetrics value) {
      if (resourceMetricsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureResourceMetricsIsMutable();
        resourceMetrics_.add(value);
        onChanged();
      } else {
        resourceMetricsBuilder_.addMessage(value);
      }
      return this;
    }

    /**
     * <pre>
     * An array of ResourceMetrics.
     * For data coming from a single resource this array will typically contain
     * one element. Intermediary nodes that receive data from multiple origins
     * typically batch the data before forwarding further and in that case this
     * array will contain multiple elements.
     * </pre>
     *
     * <code>repeated .opentelemetry.proto.metrics.v1.ResourceMetrics resource_metrics = 1;</code>
     */
    public Builder addResourceMetrics(int index,
        io.opentelemetry.proto.metrics.v1.ResourceMetrics value) {
      if (resourceMetricsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureResourceMetricsIsMutable();
        resourceMetrics_.add(index, value);
        onChanged();
      } else {
        resourceMetricsBuilder_.addMessage(index, value);
      }
      return this;
    }

    /**
     * <pre>
     * An array of ResourceMetrics.
     * For data coming from a single resource this array will typically contain
     * one element. Intermediary nodes that receive data from multiple origins
     * typically batch the data before forwarding further and in that case this
     * array will contain multiple elements.
     * </pre>
     *
     * <code>repeated .opentelemetry.proto.metrics.v1.ResourceMetrics resource_metrics = 1;</code>
     */
    public Builder addResourceMetrics(
        io.opentelemetry.proto.metrics.v1.ResourceMetrics.Builder builderForValue) {
      if (resourceMetricsBuilder_ == null) {
        ensureResourceMetricsIsMutable();
        resourceMetrics_.add(builderForValue.build());
        onChanged();
      } else {
        resourceMetricsBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }

    /**
     * <pre>
     * An array of ResourceMetrics.
     * For data coming from a single resource this array will typically contain
     * one element. Intermediary nodes that receive data from multiple origins
     * typically batch the data before forwarding further and in that case this
     * array will contain multiple elements.
     * </pre>
     *
     * <code>repeated .opentelemetry.proto.metrics.v1.ResourceMetrics resource_metrics = 1;</code>
     */
    public Builder addResourceMetrics(int index,
        io.opentelemetry.proto.metrics.v1.ResourceMetrics.Builder builderForValue) {
      if (resourceMetricsBuilder_ == null) {
        ensureResourceMetricsIsMutable();
        resourceMetrics_.add(index, builderForValue.build());
        onChanged();
      } else {
        resourceMetricsBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }

    /**
     * <pre>
     * An array of ResourceMetrics.
     * For data coming from a single resource this array will typically contain
     * one element. Intermediary nodes that receive data from multiple origins
     * typically batch the data before forwarding further and in that case this
     * array will contain multiple elements.
     * </pre>
     *
     * <code>repeated .opentelemetry.proto.metrics.v1.ResourceMetrics resource_metrics = 1;</code>
     */
    public Builder addAllResourceMetrics(
        java.lang.Iterable<? extends io.opentelemetry.proto.metrics.v1.ResourceMetrics> values) {
      if (resourceMetricsBuilder_ == null) {
        ensureResourceMetricsIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(values, resourceMetrics_);
        onChanged();
      } else {
        resourceMetricsBuilder_.addAllMessages(values);
      }
      return this;
    }

    /**
     * <pre>
     * An array of ResourceMetrics.
     * For data coming from a single resource this array will typically contain
     * one element. Intermediary nodes that receive data from multiple origins
     * typically batch the data before forwarding further and in that case this
     * array will contain multiple elements.
     * </pre>
     *
     * <code>repeated .opentelemetry.proto.metrics.v1.ResourceMetrics resource_metrics = 1;</code>
     */
    public Builder clearResourceMetrics() {
      if (resourceMetricsBuilder_ == null) {
        resourceMetrics_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        resourceMetricsBuilder_.clear();
      }
      return this;
    }

    /**
     * <pre>
     * An array of ResourceMetrics.
     * For data coming from a single resource this array will typically contain
     * one element. Intermediary nodes that receive data from multiple origins
     * typically batch the data before forwarding further and in that case this
     * array will contain multiple elements.
     * </pre>
     *
     * <code>repeated .opentelemetry.proto.metrics.v1.ResourceMetrics resource_metrics = 1;</code>
     */
    public Builder removeResourceMetrics(int index) {
      if (resourceMetricsBuilder_ == null) {
        ensureResourceMetricsIsMutable();
        resourceMetrics_.remove(index);
        onChanged();
      } else {
        resourceMetricsBuilder_.remove(index);
      }
      return this;
    }

    /**
     * <pre>
     * An array of ResourceMetrics.
     * For data coming from a single resource this array will typically contain
     * one element. Intermediary nodes that receive data from multiple origins
     * typically batch the data before forwarding further and in that case this
     * array will contain multiple elements.
     * </pre>
     *
     * <code>repeated .opentelemetry.proto.metrics.v1.ResourceMetrics resource_metrics = 1;</code>
     */
    public io.opentelemetry.proto.metrics.v1.ResourceMetrics.Builder getResourceMetricsBuilder(
        int index) {
      return getResourceMetricsFieldBuilder().getBuilder(index);
    }

    /**
     * <pre>
     * An array of ResourceMetrics.
     * For data coming from a single resource this array will typically contain
     * one element. Intermediary nodes that receive data from multiple origins
     * typically batch the data before forwarding further and in that case this
     * array will contain multiple elements.
     * </pre>
     *
     * <code>repeated .opentelemetry.proto.metrics.v1.ResourceMetrics resource_metrics = 1;</code>
     */
    public io.opentelemetry.proto.metrics.v1.ResourceMetricsOrBuilder getResourceMetricsOrBuilder(
        int index) {
      if (resourceMetricsBuilder_ == null) {
        return resourceMetrics_.get(index);
      } else {
        return resourceMetricsBuilder_.getMessageOrBuilder(index);
      }
    }

    /**
     * <pre>
     * An array of ResourceMetrics.
     * For data coming from a single resource this array will typically contain
     * one element. Intermediary nodes that receive data from multiple origins
     * typically batch the data before forwarding further and in that case this
     * array will contain multiple elements.
     * </pre>
     *
     * <code>repeated .opentelemetry.proto.metrics.v1.ResourceMetrics resource_metrics = 1;</code>
     */
    public java.util.List<? extends io.opentelemetry.proto.metrics.v1.ResourceMetricsOrBuilder> getResourceMetricsOrBuilderList() {
      if (resourceMetricsBuilder_ != null) {
        return resourceMetricsBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(resourceMetrics_);
      }
    }

    /**
     * <pre>
     * An array of ResourceMetrics.
     * For data coming from a single resource this array will typically contain
     * one element. Intermediary nodes that receive data from multiple origins
     * typically batch the data before forwarding further and in that case this
     * array will contain multiple elements.
     * </pre>
     *
     * <code>repeated .opentelemetry.proto.metrics.v1.ResourceMetrics resource_metrics = 1;</code>
     */
    public io.opentelemetry.proto.metrics.v1.ResourceMetrics.Builder addResourceMetricsBuilder() {
      return getResourceMetricsFieldBuilder()
          .addBuilder(io.opentelemetry.proto.metrics.v1.ResourceMetrics.getDefaultInstance());
    }

    /**
     * <pre>
     * An array of ResourceMetrics.
     * For data coming from a single resource this array will typically contain
     * one element. Intermediary nodes that receive data from multiple origins
     * typically batch the data before forwarding further and in that case this
     * array will contain multiple elements.
     * </pre>
     *
     * <code>repeated .opentelemetry.proto.metrics.v1.ResourceMetrics resource_metrics = 1;</code>
     */
    public io.opentelemetry.proto.metrics.v1.ResourceMetrics.Builder addResourceMetricsBuilder(
        int index) {
      return getResourceMetricsFieldBuilder().addBuilder(index,
          io.opentelemetry.proto.metrics.v1.ResourceMetrics.getDefaultInstance());
    }

    /**
     * <pre>
     * An array of ResourceMetrics.
     * For data coming from a single resource this array will typically contain
     * one element. Intermediary nodes that receive data from multiple origins
     * typically batch the data before forwarding further and in that case this
     * array will contain multiple elements.
     * </pre>
     *
     * <code>repeated .opentelemetry.proto.metrics.v1.ResourceMetrics resource_metrics = 1;</code>
     */
    public java.util.List<io.opentelemetry.proto.metrics.v1.ResourceMetrics.Builder> getResourceMetricsBuilderList() {
      return getResourceMetricsFieldBuilder().getBuilderList();
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<io.opentelemetry.proto.metrics.v1.ResourceMetrics, io.opentelemetry.proto.metrics.v1.ResourceMetrics.Builder, io.opentelemetry.proto.metrics.v1.ResourceMetricsOrBuilder> getResourceMetricsFieldBuilder() {
      if (resourceMetricsBuilder_ == null) {
        resourceMetricsBuilder_ =
            new com.google.protobuf.RepeatedFieldBuilderV3<io.opentelemetry.proto.metrics.v1.ResourceMetrics, io.opentelemetry.proto.metrics.v1.ResourceMetrics.Builder, io.opentelemetry.proto.metrics.v1.ResourceMetricsOrBuilder>(
                resourceMetrics_, ((bitField0_ & 0x00000001) != 0), getParentForChildren(),
                isClean());
        resourceMetrics_ = null;
      }
      return resourceMetricsBuilder_;
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


    // @@protoc_insertion_point(builder_scope:opentelemetry.proto.metrics.v1.MetricsData)
  }

  // @@protoc_insertion_point(class_scope:opentelemetry.proto.metrics.v1.MetricsData)
  private static final io.opentelemetry.proto.metrics.v1.MetricsData DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new io.opentelemetry.proto.metrics.v1.MetricsData();
  }

  public static io.opentelemetry.proto.metrics.v1.MetricsData getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<MetricsData> PARSER =
      new com.google.protobuf.AbstractParser<MetricsData>() {
        @java.lang.Override
        public MetricsData parsePartialFrom(com.google.protobuf.CodedInputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
          return new MetricsData(input, extensionRegistry);
        }
      };

  public static com.google.protobuf.Parser<MetricsData> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<MetricsData> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public io.opentelemetry.proto.metrics.v1.MetricsData getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

