// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: images.proto

package com.othman.grpc.stubs;

public final class Images {
  private Images() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface StreamImageRequestOrBuilder extends
      // @@protoc_insertion_point(interface_extends:StreamImageRequest)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>int32 id = 1;</code>
     * @return The id.
     */
    int getId();
  }
  /**
   * Protobuf type {@code StreamImageRequest}
   */
  public  static final class StreamImageRequest extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:StreamImageRequest)
      StreamImageRequestOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use StreamImageRequest.newBuilder() to construct.
    private StreamImageRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private StreamImageRequest() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new StreamImageRequest();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private StreamImageRequest(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      this();
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
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
            case 8: {

              id_ = input.readInt32();
              break;
            }
            default: {
              if (!parseUnknownField(
                  input, unknownFields, extensionRegistry, tag)) {
                done = true;
              }
              break;
            }
          }
        }
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(this);
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(
            e).setUnfinishedMessage(this);
      } finally {
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.othman.grpc.stubs.Images.internal_static_StreamImageRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.othman.grpc.stubs.Images.internal_static_StreamImageRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.othman.grpc.stubs.Images.StreamImageRequest.class, com.othman.grpc.stubs.Images.StreamImageRequest.Builder.class);
    }

    public static final int ID_FIELD_NUMBER = 1;
    private int id_;
    /**
     * <code>int32 id = 1;</code>
     * @return The id.
     */
    public int getId() {
      return id_;
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
    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      if (id_ != 0) {
        output.writeInt32(1, id_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (id_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(1, id_);
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
      if (!(obj instanceof com.othman.grpc.stubs.Images.StreamImageRequest)) {
        return super.equals(obj);
      }
      com.othman.grpc.stubs.Images.StreamImageRequest other = (com.othman.grpc.stubs.Images.StreamImageRequest) obj;

      if (getId()
          != other.getId()) return false;
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
      hash = (37 * hash) + ID_FIELD_NUMBER;
      hash = (53 * hash) + getId();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static com.othman.grpc.stubs.Images.StreamImageRequest parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.othman.grpc.stubs.Images.StreamImageRequest parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.othman.grpc.stubs.Images.StreamImageRequest parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.othman.grpc.stubs.Images.StreamImageRequest parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.othman.grpc.stubs.Images.StreamImageRequest parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.othman.grpc.stubs.Images.StreamImageRequest parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.othman.grpc.stubs.Images.StreamImageRequest parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static com.othman.grpc.stubs.Images.StreamImageRequest parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static com.othman.grpc.stubs.Images.StreamImageRequest parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static com.othman.grpc.stubs.Images.StreamImageRequest parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static com.othman.grpc.stubs.Images.StreamImageRequest parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static com.othman.grpc.stubs.Images.StreamImageRequest parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    @java.lang.Override
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
    }
    public static Builder newBuilder(com.othman.grpc.stubs.Images.StreamImageRequest prototype) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }
    @java.lang.Override
    public Builder toBuilder() {
      return this == DEFAULT_INSTANCE
          ? new Builder() : new Builder().mergeFrom(this);
    }

    @java.lang.Override
    protected Builder newBuilderForType(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    /**
     * Protobuf type {@code StreamImageRequest}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:StreamImageRequest)
        com.othman.grpc.stubs.Images.StreamImageRequestOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return com.othman.grpc.stubs.Images.internal_static_StreamImageRequest_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return com.othman.grpc.stubs.Images.internal_static_StreamImageRequest_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                com.othman.grpc.stubs.Images.StreamImageRequest.class, com.othman.grpc.stubs.Images.StreamImageRequest.Builder.class);
      }

      // Construct using com.othman.grpc.stubs.Images.StreamImageRequest.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }

      private Builder(
          com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }
      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessageV3
                .alwaysUseFieldBuilders) {
        }
      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        id_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return com.othman.grpc.stubs.Images.internal_static_StreamImageRequest_descriptor;
      }

      @java.lang.Override
      public com.othman.grpc.stubs.Images.StreamImageRequest getDefaultInstanceForType() {
        return com.othman.grpc.stubs.Images.StreamImageRequest.getDefaultInstance();
      }

      @java.lang.Override
      public com.othman.grpc.stubs.Images.StreamImageRequest build() {
        com.othman.grpc.stubs.Images.StreamImageRequest result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public com.othman.grpc.stubs.Images.StreamImageRequest buildPartial() {
        com.othman.grpc.stubs.Images.StreamImageRequest result = new com.othman.grpc.stubs.Images.StreamImageRequest(this);
        result.id_ = id_;
        onBuilt();
        return result;
      }

      @java.lang.Override
      public Builder clone() {
        return super.clone();
      }
      @java.lang.Override
      public Builder setField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return super.setField(field, value);
      }
      @java.lang.Override
      public Builder clearField(
          com.google.protobuf.Descriptors.FieldDescriptor field) {
        return super.clearField(field);
      }
      @java.lang.Override
      public Builder clearOneof(
          com.google.protobuf.Descriptors.OneofDescriptor oneof) {
        return super.clearOneof(oneof);
      }
      @java.lang.Override
      public Builder setRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          int index, java.lang.Object value) {
        return super.setRepeatedField(field, index, value);
      }
      @java.lang.Override
      public Builder addRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return super.addRepeatedField(field, value);
      }
      @java.lang.Override
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof com.othman.grpc.stubs.Images.StreamImageRequest) {
          return mergeFrom((com.othman.grpc.stubs.Images.StreamImageRequest)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(com.othman.grpc.stubs.Images.StreamImageRequest other) {
        if (other == com.othman.grpc.stubs.Images.StreamImageRequest.getDefaultInstance()) return this;
        if (other.getId() != 0) {
          setId(other.getId());
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
        com.othman.grpc.stubs.Images.StreamImageRequest parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (com.othman.grpc.stubs.Images.StreamImageRequest) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private int id_ ;
      /**
       * <code>int32 id = 1;</code>
       * @return The id.
       */
      public int getId() {
        return id_;
      }
      /**
       * <code>int32 id = 1;</code>
       * @param value The id to set.
       * @return This builder for chaining.
       */
      public Builder setId(int value) {
        
        id_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>int32 id = 1;</code>
       * @return This builder for chaining.
       */
      public Builder clearId() {
        
        id_ = 0;
        onChanged();
        return this;
      }
      @java.lang.Override
      public final Builder setUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.setUnknownFields(unknownFields);
      }

      @java.lang.Override
      public final Builder mergeUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.mergeUnknownFields(unknownFields);
      }


      // @@protoc_insertion_point(builder_scope:StreamImageRequest)
    }

    // @@protoc_insertion_point(class_scope:StreamImageRequest)
    private static final com.othman.grpc.stubs.Images.StreamImageRequest DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new com.othman.grpc.stubs.Images.StreamImageRequest();
    }

    public static com.othman.grpc.stubs.Images.StreamImageRequest getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<StreamImageRequest>
        PARSER = new com.google.protobuf.AbstractParser<StreamImageRequest>() {
      @java.lang.Override
      public StreamImageRequest parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new StreamImageRequest(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<StreamImageRequest> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<StreamImageRequest> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public com.othman.grpc.stubs.Images.StreamImageRequest getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  public interface ImageChunkOrBuilder extends
      // @@protoc_insertion_point(interface_extends:ImageChunk)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>bytes chunkData = 1;</code>
     * @return The chunkData.
     */
    com.google.protobuf.ByteString getChunkData();
  }
  /**
   * Protobuf type {@code ImageChunk}
   */
  public  static final class ImageChunk extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:ImageChunk)
      ImageChunkOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use ImageChunk.newBuilder() to construct.
    private ImageChunk(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private ImageChunk() {
      chunkData_ = com.google.protobuf.ByteString.EMPTY;
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new ImageChunk();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private ImageChunk(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      this();
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
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

              chunkData_ = input.readBytes();
              break;
            }
            default: {
              if (!parseUnknownField(
                  input, unknownFields, extensionRegistry, tag)) {
                done = true;
              }
              break;
            }
          }
        }
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(this);
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(
            e).setUnfinishedMessage(this);
      } finally {
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.othman.grpc.stubs.Images.internal_static_ImageChunk_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.othman.grpc.stubs.Images.internal_static_ImageChunk_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.othman.grpc.stubs.Images.ImageChunk.class, com.othman.grpc.stubs.Images.ImageChunk.Builder.class);
    }

    public static final int CHUNKDATA_FIELD_NUMBER = 1;
    private com.google.protobuf.ByteString chunkData_;
    /**
     * <code>bytes chunkData = 1;</code>
     * @return The chunkData.
     */
    public com.google.protobuf.ByteString getChunkData() {
      return chunkData_;
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
    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      if (!chunkData_.isEmpty()) {
        output.writeBytes(1, chunkData_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (!chunkData_.isEmpty()) {
        size += com.google.protobuf.CodedOutputStream
          .computeBytesSize(1, chunkData_);
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
      if (!(obj instanceof com.othman.grpc.stubs.Images.ImageChunk)) {
        return super.equals(obj);
      }
      com.othman.grpc.stubs.Images.ImageChunk other = (com.othman.grpc.stubs.Images.ImageChunk) obj;

      if (!getChunkData()
          .equals(other.getChunkData())) return false;
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
      hash = (37 * hash) + CHUNKDATA_FIELD_NUMBER;
      hash = (53 * hash) + getChunkData().hashCode();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static com.othman.grpc.stubs.Images.ImageChunk parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.othman.grpc.stubs.Images.ImageChunk parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.othman.grpc.stubs.Images.ImageChunk parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.othman.grpc.stubs.Images.ImageChunk parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.othman.grpc.stubs.Images.ImageChunk parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.othman.grpc.stubs.Images.ImageChunk parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.othman.grpc.stubs.Images.ImageChunk parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static com.othman.grpc.stubs.Images.ImageChunk parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static com.othman.grpc.stubs.Images.ImageChunk parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static com.othman.grpc.stubs.Images.ImageChunk parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static com.othman.grpc.stubs.Images.ImageChunk parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static com.othman.grpc.stubs.Images.ImageChunk parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    @java.lang.Override
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
    }
    public static Builder newBuilder(com.othman.grpc.stubs.Images.ImageChunk prototype) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }
    @java.lang.Override
    public Builder toBuilder() {
      return this == DEFAULT_INSTANCE
          ? new Builder() : new Builder().mergeFrom(this);
    }

    @java.lang.Override
    protected Builder newBuilderForType(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    /**
     * Protobuf type {@code ImageChunk}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:ImageChunk)
        com.othman.grpc.stubs.Images.ImageChunkOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return com.othman.grpc.stubs.Images.internal_static_ImageChunk_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return com.othman.grpc.stubs.Images.internal_static_ImageChunk_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                com.othman.grpc.stubs.Images.ImageChunk.class, com.othman.grpc.stubs.Images.ImageChunk.Builder.class);
      }

      // Construct using com.othman.grpc.stubs.Images.ImageChunk.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }

      private Builder(
          com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }
      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessageV3
                .alwaysUseFieldBuilders) {
        }
      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        chunkData_ = com.google.protobuf.ByteString.EMPTY;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return com.othman.grpc.stubs.Images.internal_static_ImageChunk_descriptor;
      }

      @java.lang.Override
      public com.othman.grpc.stubs.Images.ImageChunk getDefaultInstanceForType() {
        return com.othman.grpc.stubs.Images.ImageChunk.getDefaultInstance();
      }

      @java.lang.Override
      public com.othman.grpc.stubs.Images.ImageChunk build() {
        com.othman.grpc.stubs.Images.ImageChunk result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public com.othman.grpc.stubs.Images.ImageChunk buildPartial() {
        com.othman.grpc.stubs.Images.ImageChunk result = new com.othman.grpc.stubs.Images.ImageChunk(this);
        result.chunkData_ = chunkData_;
        onBuilt();
        return result;
      }

      @java.lang.Override
      public Builder clone() {
        return super.clone();
      }
      @java.lang.Override
      public Builder setField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return super.setField(field, value);
      }
      @java.lang.Override
      public Builder clearField(
          com.google.protobuf.Descriptors.FieldDescriptor field) {
        return super.clearField(field);
      }
      @java.lang.Override
      public Builder clearOneof(
          com.google.protobuf.Descriptors.OneofDescriptor oneof) {
        return super.clearOneof(oneof);
      }
      @java.lang.Override
      public Builder setRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          int index, java.lang.Object value) {
        return super.setRepeatedField(field, index, value);
      }
      @java.lang.Override
      public Builder addRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return super.addRepeatedField(field, value);
      }
      @java.lang.Override
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof com.othman.grpc.stubs.Images.ImageChunk) {
          return mergeFrom((com.othman.grpc.stubs.Images.ImageChunk)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(com.othman.grpc.stubs.Images.ImageChunk other) {
        if (other == com.othman.grpc.stubs.Images.ImageChunk.getDefaultInstance()) return this;
        if (other.getChunkData() != com.google.protobuf.ByteString.EMPTY) {
          setChunkData(other.getChunkData());
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
        com.othman.grpc.stubs.Images.ImageChunk parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (com.othman.grpc.stubs.Images.ImageChunk) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private com.google.protobuf.ByteString chunkData_ = com.google.protobuf.ByteString.EMPTY;
      /**
       * <code>bytes chunkData = 1;</code>
       * @return The chunkData.
       */
      public com.google.protobuf.ByteString getChunkData() {
        return chunkData_;
      }
      /**
       * <code>bytes chunkData = 1;</code>
       * @param value The chunkData to set.
       * @return This builder for chaining.
       */
      public Builder setChunkData(com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  
        chunkData_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>bytes chunkData = 1;</code>
       * @return This builder for chaining.
       */
      public Builder clearChunkData() {
        
        chunkData_ = getDefaultInstance().getChunkData();
        onChanged();
        return this;
      }
      @java.lang.Override
      public final Builder setUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.setUnknownFields(unknownFields);
      }

      @java.lang.Override
      public final Builder mergeUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.mergeUnknownFields(unknownFields);
      }


      // @@protoc_insertion_point(builder_scope:ImageChunk)
    }

    // @@protoc_insertion_point(class_scope:ImageChunk)
    private static final com.othman.grpc.stubs.Images.ImageChunk DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new com.othman.grpc.stubs.Images.ImageChunk();
    }

    public static com.othman.grpc.stubs.Images.ImageChunk getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<ImageChunk>
        PARSER = new com.google.protobuf.AbstractParser<ImageChunk>() {
      @java.lang.Override
      public ImageChunk parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new ImageChunk(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<ImageChunk> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<ImageChunk> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public com.othman.grpc.stubs.Images.ImageChunk getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_StreamImageRequest_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_StreamImageRequest_fieldAccessorTable;
  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_ImageChunk_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_ImageChunk_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\014images.proto\" \n\022StreamImageRequest\022\n\n\002" +
      "id\030\001 \001(\005\"\037\n\nImageChunk\022\021\n\tchunkData\030\001 \001(" +
      "\0142G\n\014ImageService\0227\n\021StreamImageChunks\022\023" +
      ".StreamImageRequest\032\013.ImageChunk0\001B\027\n\025co" +
      "m.othman.grpc.stubsb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_StreamImageRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_StreamImageRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_StreamImageRequest_descriptor,
        new java.lang.String[] { "Id", });
    internal_static_ImageChunk_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_ImageChunk_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_ImageChunk_descriptor,
        new java.lang.String[] { "ChunkData", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
