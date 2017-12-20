// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: PersonFactory.proto

package lymtest;

public final class MessageReadProto {
  private MessageReadProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
  }
  public interface MessageReadOrBuilder
      extends com.google.protobuf.MessageOrBuilder {

    // required int32 msgID = 1;
    /**
     * <code>required int32 msgID = 1;</code>
     */
    boolean hasMsgID();
    /**
     * <code>required int32 msgID = 1;</code>
     */
    int getMsgID();

    // required int32 type = 2;
    /**
     * <code>required int32 type = 2;</code>
     */
    boolean hasType();
    /**
     * <code>required int32 type = 2;</code>
     */
    int getType();

    // optional int32 itemID = 3;
    /**
     * <code>optional int32 itemID = 3;</code>
     */
    boolean hasItemID();
    /**
     * <code>optional int32 itemID = 3;</code>
     */
    int getItemID();

    // optional int32 suppID = 4;
    /**
     * <code>optional int32 suppID = 4;</code>
     */
    boolean hasSuppID();
    /**
     * <code>optional int32 suppID = 4;</code>
     */
    int getSuppID();

    // optional int32 typeID = 5;
    /**
     * <code>optional int32 typeID = 5;</code>
     */
    boolean hasTypeID();
    /**
     * <code>optional int32 typeID = 5;</code>
     */
    int getTypeID();

    // optional int32 limite = 6;
    /**
     * <code>optional int32 limite = 6;</code>
     */
    boolean hasLimite();
    /**
     * <code>optional int32 limite = 6;</code>
     */
    int getLimite();
  }
  /**
   * Protobuf type {@code MessageRead}
   */
  public static final class MessageRead extends
      com.google.protobuf.GeneratedMessage
      implements MessageReadOrBuilder {
    // Use MessageRead.newBuilder() to construct.
    private MessageRead(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
      super(builder);
      this.unknownFields = builder.getUnknownFields();
    }
    private MessageRead(boolean noInit) { this.unknownFields = com.google.protobuf.UnknownFieldSet.getDefaultInstance(); }

    private static final MessageRead defaultInstance;
    public static MessageRead getDefaultInstance() {
      return defaultInstance;
    }

    public MessageRead getDefaultInstanceForType() {
      return defaultInstance;
    }

    private final com.google.protobuf.UnknownFieldSet unknownFields;
    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
        getUnknownFields() {
      return this.unknownFields;
    }
    private MessageRead(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      initFields();
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
            default: {
              if (!parseUnknownField(input, unknownFields,
                                     extensionRegistry, tag)) {
                done = true;
              }
              break;
            }
            case 8: {
              bitField0_ |= 0x00000001;
              msgID_ = input.readInt32();
              break;
            }
            case 16: {
              bitField0_ |= 0x00000002;
              type_ = input.readInt32();
              break;
            }
            case 24: {
              bitField0_ |= 0x00000004;
              itemID_ = input.readInt32();
              break;
            }
            case 32: {
              bitField0_ |= 0x00000008;
              suppID_ = input.readInt32();
              break;
            }
            case 40: {
              bitField0_ |= 0x00000010;
              typeID_ = input.readInt32();
              break;
            }
            case 48: {
              bitField0_ |= 0x00000020;
              limite_ = input.readInt32();
              break;
            }
          }
        }
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(this);
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(
            e.getMessage()).setUnfinishedMessage(this);
      } finally {
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return lymtest.MessageReadProto.internal_static_MessageRead_descriptor;
    }

    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return lymtest.MessageReadProto.internal_static_MessageRead_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              lymtest.MessageReadProto.MessageRead.class, lymtest.MessageReadProto.MessageRead.Builder.class);
    }

    public static com.google.protobuf.Parser<MessageRead> PARSER =
        new com.google.protobuf.AbstractParser<MessageRead>() {
      public MessageRead parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new MessageRead(input, extensionRegistry);
      }
    };

    @java.lang.Override
    public com.google.protobuf.Parser<MessageRead> getParserForType() {
      return PARSER;
    }

    private int bitField0_;
    // required int32 msgID = 1;
    public static final int MSGID_FIELD_NUMBER = 1;
    private int msgID_;
    /**
     * <code>required int32 msgID = 1;</code>
     */
    public boolean hasMsgID() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    /**
     * <code>required int32 msgID = 1;</code>
     */
    public int getMsgID() {
      return msgID_;
    }

    // required int32 type = 2;
    public static final int TYPE_FIELD_NUMBER = 2;
    private int type_;
    /**
     * <code>required int32 type = 2;</code>
     */
    public boolean hasType() {
      return ((bitField0_ & 0x00000002) == 0x00000002);
    }
    /**
     * <code>required int32 type = 2;</code>
     */
    public int getType() {
      return type_;
    }

    // optional int32 itemID = 3;
    public static final int ITEMID_FIELD_NUMBER = 3;
    private int itemID_;
    /**
     * <code>optional int32 itemID = 3;</code>
     */
    public boolean hasItemID() {
      return ((bitField0_ & 0x00000004) == 0x00000004);
    }
    /**
     * <code>optional int32 itemID = 3;</code>
     */
    public int getItemID() {
      return itemID_;
    }

    // optional int32 suppID = 4;
    public static final int SUPPID_FIELD_NUMBER = 4;
    private int suppID_;
    /**
     * <code>optional int32 suppID = 4;</code>
     */
    public boolean hasSuppID() {
      return ((bitField0_ & 0x00000008) == 0x00000008);
    }
    /**
     * <code>optional int32 suppID = 4;</code>
     */
    public int getSuppID() {
      return suppID_;
    }

    // optional int32 typeID = 5;
    public static final int TYPEID_FIELD_NUMBER = 5;
    private int typeID_;
    /**
     * <code>optional int32 typeID = 5;</code>
     */
    public boolean hasTypeID() {
      return ((bitField0_ & 0x00000010) == 0x00000010);
    }
    /**
     * <code>optional int32 typeID = 5;</code>
     */
    public int getTypeID() {
      return typeID_;
    }

    // optional int32 limite = 6;
    public static final int LIMITE_FIELD_NUMBER = 6;
    private int limite_;
    /**
     * <code>optional int32 limite = 6;</code>
     */
    public boolean hasLimite() {
      return ((bitField0_ & 0x00000020) == 0x00000020);
    }
    /**
     * <code>optional int32 limite = 6;</code>
     */
    public int getLimite() {
      return limite_;
    }

    private void initFields() {
      msgID_ = 0;
      type_ = 0;
      itemID_ = 0;
      suppID_ = 0;
      typeID_ = 0;
      limite_ = 0;
    }
    private byte memoizedIsInitialized = -1;
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized != -1) return isInitialized == 1;

      if (!hasMsgID()) {
        memoizedIsInitialized = 0;
        return false;
      }
      if (!hasType()) {
        memoizedIsInitialized = 0;
        return false;
      }
      memoizedIsInitialized = 1;
      return true;
    }

    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      getSerializedSize();
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        output.writeInt32(1, msgID_);
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        output.writeInt32(2, type_);
      }
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        output.writeInt32(3, itemID_);
      }
      if (((bitField0_ & 0x00000008) == 0x00000008)) {
        output.writeInt32(4, suppID_);
      }
      if (((bitField0_ & 0x00000010) == 0x00000010)) {
        output.writeInt32(5, typeID_);
      }
      if (((bitField0_ & 0x00000020) == 0x00000020)) {
        output.writeInt32(6, limite_);
      }
      getUnknownFields().writeTo(output);
    }

    private int memoizedSerializedSize = -1;
    public int getSerializedSize() {
      int size = memoizedSerializedSize;
      if (size != -1) return size;

      size = 0;
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(1, msgID_);
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(2, type_);
      }
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(3, itemID_);
      }
      if (((bitField0_ & 0x00000008) == 0x00000008)) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(4, suppID_);
      }
      if (((bitField0_ & 0x00000010) == 0x00000010)) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(5, typeID_);
      }
      if (((bitField0_ & 0x00000020) == 0x00000020)) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(6, limite_);
      }
      size += getUnknownFields().getSerializedSize();
      memoizedSerializedSize = size;
      return size;
    }

    private static final long serialVersionUID = 0L;
    @java.lang.Override
    protected java.lang.Object writeReplace()
        throws java.io.ObjectStreamException {
      return super.writeReplace();
    }

    public static lymtest.MessageReadProto.MessageRead parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static lymtest.MessageReadProto.MessageRead parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static lymtest.MessageReadProto.MessageRead parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static lymtest.MessageReadProto.MessageRead parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static lymtest.MessageReadProto.MessageRead parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static lymtest.MessageReadProto.MessageRead parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }
    public static lymtest.MessageReadProto.MessageRead parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input);
    }
    public static lymtest.MessageReadProto.MessageRead parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input, extensionRegistry);
    }
    public static lymtest.MessageReadProto.MessageRead parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static lymtest.MessageReadProto.MessageRead parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }

    public static Builder newBuilder() { return Builder.create(); }
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder(lymtest.MessageReadProto.MessageRead prototype) {
      return newBuilder().mergeFrom(prototype);
    }
    public Builder toBuilder() { return newBuilder(this); }

    @java.lang.Override
    protected Builder newBuilderForType(
        com.google.protobuf.GeneratedMessage.BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    /**
     * Protobuf type {@code MessageRead}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessage.Builder<Builder>
       implements lymtest.MessageReadProto.MessageReadOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return lymtest.MessageReadProto.internal_static_MessageRead_descriptor;
      }

      protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return lymtest.MessageReadProto.internal_static_MessageRead_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                lymtest.MessageReadProto.MessageRead.class, lymtest.MessageReadProto.MessageRead.Builder.class);
      }

      // Construct using lymtest.MessageReadProto.MessageRead.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }

      private Builder(
          com.google.protobuf.GeneratedMessage.BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }
      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessage.alwaysUseFieldBuilders) {
        }
      }
      private static Builder create() {
        return new Builder();
      }

      public Builder clear() {
        super.clear();
        msgID_ = 0;
        bitField0_ = (bitField0_ & ~0x00000001);
        type_ = 0;
        bitField0_ = (bitField0_ & ~0x00000002);
        itemID_ = 0;
        bitField0_ = (bitField0_ & ~0x00000004);
        suppID_ = 0;
        bitField0_ = (bitField0_ & ~0x00000008);
        typeID_ = 0;
        bitField0_ = (bitField0_ & ~0x00000010);
        limite_ = 0;
        bitField0_ = (bitField0_ & ~0x00000020);
        return this;
      }

      public Builder clone() {
        return create().mergeFrom(buildPartial());
      }

      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return lymtest.MessageReadProto.internal_static_MessageRead_descriptor;
      }

      public lymtest.MessageReadProto.MessageRead getDefaultInstanceForType() {
        return lymtest.MessageReadProto.MessageRead.getDefaultInstance();
      }

      public lymtest.MessageReadProto.MessageRead build() {
        lymtest.MessageReadProto.MessageRead result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      public lymtest.MessageReadProto.MessageRead buildPartial() {
        lymtest.MessageReadProto.MessageRead result = new lymtest.MessageReadProto.MessageRead(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
          to_bitField0_ |= 0x00000001;
        }
        result.msgID_ = msgID_;
        if (((from_bitField0_ & 0x00000002) == 0x00000002)) {
          to_bitField0_ |= 0x00000002;
        }
        result.type_ = type_;
        if (((from_bitField0_ & 0x00000004) == 0x00000004)) {
          to_bitField0_ |= 0x00000004;
        }
        result.itemID_ = itemID_;
        if (((from_bitField0_ & 0x00000008) == 0x00000008)) {
          to_bitField0_ |= 0x00000008;
        }
        result.suppID_ = suppID_;
        if (((from_bitField0_ & 0x00000010) == 0x00000010)) {
          to_bitField0_ |= 0x00000010;
        }
        result.typeID_ = typeID_;
        if (((from_bitField0_ & 0x00000020) == 0x00000020)) {
          to_bitField0_ |= 0x00000020;
        }
        result.limite_ = limite_;
        result.bitField0_ = to_bitField0_;
        onBuilt();
        return result;
      }

      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof lymtest.MessageReadProto.MessageRead) {
          return mergeFrom((lymtest.MessageReadProto.MessageRead)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(lymtest.MessageReadProto.MessageRead other) {
        if (other == lymtest.MessageReadProto.MessageRead.getDefaultInstance()) return this;
        if (other.hasMsgID()) {
          setMsgID(other.getMsgID());
        }
        if (other.hasType()) {
          setType(other.getType());
        }
        if (other.hasItemID()) {
          setItemID(other.getItemID());
        }
        if (other.hasSuppID()) {
          setSuppID(other.getSuppID());
        }
        if (other.hasTypeID()) {
          setTypeID(other.getTypeID());
        }
        if (other.hasLimite()) {
          setLimite(other.getLimite());
        }
        this.mergeUnknownFields(other.getUnknownFields());
        return this;
      }

      public final boolean isInitialized() {
        if (!hasMsgID()) {
          
          return false;
        }
        if (!hasType()) {
          
          return false;
        }
        return true;
      }

      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        lymtest.MessageReadProto.MessageRead parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (lymtest.MessageReadProto.MessageRead) e.getUnfinishedMessage();
          throw e;
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      // required int32 msgID = 1;
      private int msgID_ ;
      /**
       * <code>required int32 msgID = 1;</code>
       */
      public boolean hasMsgID() {
        return ((bitField0_ & 0x00000001) == 0x00000001);
      }
      /**
       * <code>required int32 msgID = 1;</code>
       */
      public int getMsgID() {
        return msgID_;
      }
      /**
       * <code>required int32 msgID = 1;</code>
       */
      public Builder setMsgID(int value) {
        bitField0_ |= 0x00000001;
        msgID_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>required int32 msgID = 1;</code>
       */
      public Builder clearMsgID() {
        bitField0_ = (bitField0_ & ~0x00000001);
        msgID_ = 0;
        onChanged();
        return this;
      }

      // required int32 type = 2;
      private int type_ ;
      /**
       * <code>required int32 type = 2;</code>
       */
      public boolean hasType() {
        return ((bitField0_ & 0x00000002) == 0x00000002);
      }
      /**
       * <code>required int32 type = 2;</code>
       */
      public int getType() {
        return type_;
      }
      /**
       * <code>required int32 type = 2;</code>
       */
      public Builder setType(int value) {
        bitField0_ |= 0x00000002;
        type_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>required int32 type = 2;</code>
       */
      public Builder clearType() {
        bitField0_ = (bitField0_ & ~0x00000002);
        type_ = 0;
        onChanged();
        return this;
      }

      // optional int32 itemID = 3;
      private int itemID_ ;
      /**
       * <code>optional int32 itemID = 3;</code>
       */
      public boolean hasItemID() {
        return ((bitField0_ & 0x00000004) == 0x00000004);
      }
      /**
       * <code>optional int32 itemID = 3;</code>
       */
      public int getItemID() {
        return itemID_;
      }
      /**
       * <code>optional int32 itemID = 3;</code>
       */
      public Builder setItemID(int value) {
        bitField0_ |= 0x00000004;
        itemID_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional int32 itemID = 3;</code>
       */
      public Builder clearItemID() {
        bitField0_ = (bitField0_ & ~0x00000004);
        itemID_ = 0;
        onChanged();
        return this;
      }

      // optional int32 suppID = 4;
      private int suppID_ ;
      /**
       * <code>optional int32 suppID = 4;</code>
       */
      public boolean hasSuppID() {
        return ((bitField0_ & 0x00000008) == 0x00000008);
      }
      /**
       * <code>optional int32 suppID = 4;</code>
       */
      public int getSuppID() {
        return suppID_;
      }
      /**
       * <code>optional int32 suppID = 4;</code>
       */
      public Builder setSuppID(int value) {
        bitField0_ |= 0x00000008;
        suppID_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional int32 suppID = 4;</code>
       */
      public Builder clearSuppID() {
        bitField0_ = (bitField0_ & ~0x00000008);
        suppID_ = 0;
        onChanged();
        return this;
      }

      // optional int32 typeID = 5;
      private int typeID_ ;
      /**
       * <code>optional int32 typeID = 5;</code>
       */
      public boolean hasTypeID() {
        return ((bitField0_ & 0x00000010) == 0x00000010);
      }
      /**
       * <code>optional int32 typeID = 5;</code>
       */
      public int getTypeID() {
        return typeID_;
      }
      /**
       * <code>optional int32 typeID = 5;</code>
       */
      public Builder setTypeID(int value) {
        bitField0_ |= 0x00000010;
        typeID_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional int32 typeID = 5;</code>
       */
      public Builder clearTypeID() {
        bitField0_ = (bitField0_ & ~0x00000010);
        typeID_ = 0;
        onChanged();
        return this;
      }

      // optional int32 limite = 6;
      private int limite_ ;
      /**
       * <code>optional int32 limite = 6;</code>
       */
      public boolean hasLimite() {
        return ((bitField0_ & 0x00000020) == 0x00000020);
      }
      /**
       * <code>optional int32 limite = 6;</code>
       */
      public int getLimite() {
        return limite_;
      }
      /**
       * <code>optional int32 limite = 6;</code>
       */
      public Builder setLimite(int value) {
        bitField0_ |= 0x00000020;
        limite_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional int32 limite = 6;</code>
       */
      public Builder clearLimite() {
        bitField0_ = (bitField0_ & ~0x00000020);
        limite_ = 0;
        onChanged();
        return this;
      }

      // @@protoc_insertion_point(builder_scope:MessageRead)
    }

    static {
      defaultInstance = new MessageRead(true);
      defaultInstance.initFields();
    }

    // @@protoc_insertion_point(class_scope:MessageRead)
  }

  private static com.google.protobuf.Descriptors.Descriptor
    internal_static_MessageRead_descriptor;
  private static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_MessageRead_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\023PersonFactory.proto\"j\n\013MessageRead\022\r\n\005" +
      "msgID\030\001 \002(\005\022\014\n\004type\030\002 \002(\005\022\016\n\006itemID\030\003 \001(" +
      "\005\022\016\n\006suppID\030\004 \001(\005\022\016\n\006typeID\030\005 \001(\005\022\016\n\006lim" +
      "ite\030\006 \001(\005B\033\n\007lymtestB\020MessageReadProto"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
      new com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner() {
        public com.google.protobuf.ExtensionRegistry assignDescriptors(
            com.google.protobuf.Descriptors.FileDescriptor root) {
          descriptor = root;
          internal_static_MessageRead_descriptor =
            getDescriptor().getMessageTypes().get(0);
          internal_static_MessageRead_fieldAccessorTable = new
            com.google.protobuf.GeneratedMessage.FieldAccessorTable(
              internal_static_MessageRead_descriptor,
              new java.lang.String[] { "MsgID", "Type", "ItemID", "SuppID", "TypeID", "Limite", });
          return null;
        }
      };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        }, assigner);
  }

  // @@protoc_insertion_point(outer_class_scope)
}
