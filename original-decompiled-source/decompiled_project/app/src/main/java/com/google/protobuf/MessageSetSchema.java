package com.google.protobuf;

import com.google.protobuf.ArrayDecoders;
import com.google.protobuf.FieldSet;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.LazyField;
import com.google.protobuf.WireFormat;
import java.io.IOException;
import java.util.Iterator;
import java.util.Map;

@CheckReturnValue
/* loaded from: classes2.dex */
final class MessageSetSchema<T> implements Schema<T> {
    private final MessageLite defaultInstance;
    private final ExtensionSchema<?> extensionSchema;
    private final boolean hasExtensions;
    private final UnknownFieldSchema<?, ?> unknownFieldSchema;

    private MessageSetSchema(UnknownFieldSchema<?, ?> unknownFieldSchema, ExtensionSchema<?> extensionSchema, MessageLite messageLite) {
        this.unknownFieldSchema = unknownFieldSchema;
        this.hasExtensions = extensionSchema.hasExtensions(messageLite);
        this.extensionSchema = extensionSchema;
        this.defaultInstance = messageLite;
    }

    private <UT, UB> int getUnknownFieldsSerializedSize(UnknownFieldSchema<UT, UB> unknownFieldSchema, T t3) {
        return unknownFieldSchema.getSerializedSizeAsMessageSet(unknownFieldSchema.getFromMessage(t3));
    }

    /* JADX WARN: Multi-variable type inference failed */
    private <UT, UB, ET extends FieldSet.FieldDescriptorLite<ET>> void mergeFromHelper(UnknownFieldSchema<UT, UB> unknownFieldSchema, ExtensionSchema<ET> extensionSchema, T t3, Reader reader, ExtensionRegistryLite extensionRegistryLite) throws Throwable {
        UnknownFieldSchema<UT, UB> unknownFieldSchema2;
        UB builderFromMessage = unknownFieldSchema.getBuilderFromMessage(t3);
        Object mutableExtensions = extensionSchema.getMutableExtensions(t3);
        while (reader.getFieldNumber() != Integer.MAX_VALUE) {
            try {
                unknownFieldSchema2 = unknownFieldSchema;
                ExtensionSchema<ET> extensionSchema2 = extensionSchema;
                Reader reader2 = reader;
                ExtensionRegistryLite extensionRegistryLite2 = extensionRegistryLite;
                try {
                    if (!parseMessageSetItemOrUnknownField(reader2, extensionRegistryLite2, extensionSchema2, mutableExtensions, unknownFieldSchema2, builderFromMessage)) {
                        unknownFieldSchema2.setBuilderToMessage(t3, builderFromMessage);
                        return;
                    }
                    reader = reader2;
                    extensionRegistryLite = extensionRegistryLite2;
                    extensionSchema = extensionSchema2;
                    unknownFieldSchema = unknownFieldSchema2;
                } catch (Throwable th2) {
                    th = th2;
                    Throwable th3 = th;
                    unknownFieldSchema2.setBuilderToMessage(t3, builderFromMessage);
                    throw th3;
                }
            } catch (Throwable th4) {
                th = th4;
                unknownFieldSchema2 = unknownFieldSchema;
            }
        }
        unknownFieldSchema.setBuilderToMessage(t3, builderFromMessage);
    }

    public static <T> MessageSetSchema<T> newSchema(UnknownFieldSchema<?, ?> unknownFieldSchema, ExtensionSchema<?> extensionSchema, MessageLite messageLite) {
        return new MessageSetSchema<>(unknownFieldSchema, extensionSchema, messageLite);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private <UT, UB, ET extends FieldSet.FieldDescriptorLite<ET>> boolean parseMessageSetItemOrUnknownField(Reader reader, ExtensionRegistryLite extensionRegistryLite, ExtensionSchema<ET> extensionSchema, FieldSet<ET> fieldSet, UnknownFieldSchema<UT, UB> unknownFieldSchema, UB ub2) throws IOException {
        int tag = reader.getTag();
        int uInt32 = 0;
        if (tag != WireFormat.MESSAGE_SET_ITEM_TAG) {
            if (WireFormat.getTagWireType(tag) != 2) {
                return reader.skipField();
            }
            Object objFindExtensionByNumber = extensionSchema.findExtensionByNumber(extensionRegistryLite, this.defaultInstance, WireFormat.getTagFieldNumber(tag));
            if (objFindExtensionByNumber == null) {
                return unknownFieldSchema.mergeOneFieldFrom(ub2, reader, 0);
            }
            extensionSchema.parseLengthPrefixedMessageSetItem(reader, objFindExtensionByNumber, extensionRegistryLite, fieldSet);
            return true;
        }
        Object objFindExtensionByNumber2 = null;
        ByteString bytes = null;
        while (reader.getFieldNumber() != Integer.MAX_VALUE) {
            int tag2 = reader.getTag();
            if (tag2 == WireFormat.MESSAGE_SET_TYPE_ID_TAG) {
                uInt32 = reader.readUInt32();
                objFindExtensionByNumber2 = extensionSchema.findExtensionByNumber(extensionRegistryLite, this.defaultInstance, uInt32);
            } else if (tag2 == WireFormat.MESSAGE_SET_MESSAGE_TAG) {
                if (objFindExtensionByNumber2 != null) {
                    extensionSchema.parseLengthPrefixedMessageSetItem(reader, objFindExtensionByNumber2, extensionRegistryLite, fieldSet);
                } else {
                    bytes = reader.readBytes();
                }
            } else if (!reader.skipField()) {
                break;
            }
        }
        if (reader.getTag() != WireFormat.MESSAGE_SET_ITEM_END_TAG) {
            throw InvalidProtocolBufferException.invalidEndTag();
        }
        if (bytes != null) {
            if (objFindExtensionByNumber2 != null) {
                extensionSchema.parseMessageSetItem(bytes, objFindExtensionByNumber2, extensionRegistryLite, fieldSet);
            } else {
                unknownFieldSchema.addLengthDelimited(ub2, uInt32, bytes);
            }
        }
        return true;
    }

    private <UT, UB> void writeUnknownFieldsHelper(UnknownFieldSchema<UT, UB> unknownFieldSchema, T t3, Writer writer) throws IOException {
        unknownFieldSchema.writeAsMessageSetTo(unknownFieldSchema.getFromMessage(t3), writer);
    }

    @Override // com.google.protobuf.Schema
    public boolean equals(T t3, T t10) {
        if (!this.unknownFieldSchema.getFromMessage(t3).equals(this.unknownFieldSchema.getFromMessage(t10))) {
            return false;
        }
        if (this.hasExtensions) {
            return this.extensionSchema.getExtensions(t3).equals(this.extensionSchema.getExtensions(t10));
        }
        return true;
    }

    @Override // com.google.protobuf.Schema
    public int getSerializedSize(T t3) {
        int unknownFieldsSerializedSize = getUnknownFieldsSerializedSize(this.unknownFieldSchema, t3);
        return this.hasExtensions ? unknownFieldsSerializedSize + this.extensionSchema.getExtensions(t3).getMessageSetSerializedSize() : unknownFieldsSerializedSize;
    }

    @Override // com.google.protobuf.Schema
    public int hashCode(T t3) {
        int iHashCode = this.unknownFieldSchema.getFromMessage(t3).hashCode();
        return this.hasExtensions ? (iHashCode * 53) + this.extensionSchema.getExtensions(t3).hashCode() : iHashCode;
    }

    @Override // com.google.protobuf.Schema
    public final boolean isInitialized(T t3) {
        return this.extensionSchema.getExtensions(t3).isInitialized();
    }

    @Override // com.google.protobuf.Schema
    public void makeImmutable(T t3) {
        this.unknownFieldSchema.makeImmutable(t3);
        this.extensionSchema.makeImmutable(t3);
    }

    @Override // com.google.protobuf.Schema
    public void mergeFrom(T t3, T t10) {
        SchemaUtil.mergeUnknownFields(this.unknownFieldSchema, t3, t10);
        if (this.hasExtensions) {
            SchemaUtil.mergeExtensions(this.extensionSchema, t3, t10);
        }
    }

    @Override // com.google.protobuf.Schema
    public T newInstance() {
        MessageLite messageLite = this.defaultInstance;
        return messageLite instanceof GeneratedMessageLite ? (T) ((GeneratedMessageLite) messageLite).newMutableInstance() : (T) messageLite.newBuilderForType().buildPartial();
    }

    @Override // com.google.protobuf.Schema
    public void writeTo(T t3, Writer writer) throws IOException {
        Iterator it = this.extensionSchema.getExtensions(t3).iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            FieldSet.FieldDescriptorLite fieldDescriptorLite = (FieldSet.FieldDescriptorLite) entry.getKey();
            if (fieldDescriptorLite.getLiteJavaType() != WireFormat.JavaType.MESSAGE || fieldDescriptorLite.isRepeated() || fieldDescriptorLite.isPacked()) {
                throw new IllegalStateException("Found invalid MessageSet item.");
            }
            if (entry instanceof LazyField.LazyEntry) {
                writer.writeMessageSetItem(fieldDescriptorLite.getNumber(), ((LazyField.LazyEntry) entry).getField().toByteString());
            } else {
                writer.writeMessageSetItem(fieldDescriptorLite.getNumber(), entry.getValue());
            }
        }
        writeUnknownFieldsHelper(this.unknownFieldSchema, t3, writer);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00cf A[EDGE_INSN: B:62:0x00cf->B:34:0x00cf BREAK  A[LOOP:1: B:17:0x006f->B:65:0x006f], SYNTHETIC] */
    @Override // com.google.protobuf.Schema
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void mergeFrom(T t3, byte[] bArr, int i10, int i11, ArrayDecoders.Registers registers) throws IOException {
        int iDecodeVarint32;
        GeneratedMessageLite generatedMessageLite = (GeneratedMessageLite) t3;
        UnknownFieldSetLite unknownFieldSetLiteNewInstance = generatedMessageLite.unknownFields;
        if (unknownFieldSetLiteNewInstance == UnknownFieldSetLite.getDefaultInstance()) {
            unknownFieldSetLiteNewInstance = UnknownFieldSetLite.newInstance();
            generatedMessageLite.unknownFields = unknownFieldSetLiteNewInstance;
        }
        UnknownFieldSetLite unknownFieldSetLite = unknownFieldSetLiteNewInstance;
        FieldSet<GeneratedMessageLite.ExtensionDescriptor> fieldSetEnsureExtensionsAreMutable = ((GeneratedMessageLite.ExtendableMessage) t3).ensureExtensionsAreMutable();
        GeneratedMessageLite.GeneratedExtension generatedExtension = null;
        while (i10 < i11) {
            int iDecodeVarint322 = ArrayDecoders.decodeVarint32(bArr, i10, registers);
            int i12 = registers.int1;
            if (i12 == WireFormat.MESSAGE_SET_ITEM_TAG) {
                int i13 = i11;
                ArrayDecoders.Registers registers2 = registers;
                int i14 = 0;
                ByteString byteString = null;
                while (true) {
                    if (iDecodeVarint322 >= i13) {
                        iDecodeVarint32 = iDecodeVarint322;
                        break;
                    }
                    iDecodeVarint32 = ArrayDecoders.decodeVarint32(bArr, iDecodeVarint322, registers2);
                    int i15 = registers2.int1;
                    int tagFieldNumber = WireFormat.getTagFieldNumber(i15);
                    int tagWireType = WireFormat.getTagWireType(i15);
                    if (tagFieldNumber != 2) {
                        if (tagFieldNumber == 3) {
                            if (generatedExtension != null) {
                                iDecodeVarint322 = ArrayDecoders.decodeMessageField(Protobuf.getInstance().schemaFor((Class) generatedExtension.getMessageDefaultInstance().getClass()), bArr, iDecodeVarint32, i13, registers2);
                                fieldSetEnsureExtensionsAreMutable.setField(generatedExtension.descriptor, registers2.object1);
                            } else if (tagWireType == 2) {
                                iDecodeVarint322 = ArrayDecoders.decodeBytes(bArr, iDecodeVarint32, registers2);
                                byteString = (ByteString) registers2.object1;
                            }
                        }
                        if (i15 != WireFormat.MESSAGE_SET_ITEM_END_TAG) {
                            break;
                        } else {
                            iDecodeVarint322 = ArrayDecoders.skipField(i15, bArr, iDecodeVarint32, i13, registers2);
                        }
                    } else if (tagWireType == 0) {
                        iDecodeVarint322 = ArrayDecoders.decodeVarint32(bArr, iDecodeVarint32, registers2);
                        i14 = registers2.int1;
                        generatedExtension = (GeneratedMessageLite.GeneratedExtension) this.extensionSchema.findExtensionByNumber(registers2.extensionRegistry, this.defaultInstance, i14);
                    } else if (i15 != WireFormat.MESSAGE_SET_ITEM_END_TAG) {
                    }
                }
                if (byteString != null) {
                    unknownFieldSetLite.storeField(WireFormat.makeTag(i14, 2), byteString);
                }
                i10 = iDecodeVarint32;
                i11 = i13;
                registers = registers2;
            } else if (WireFormat.getTagWireType(i12) == 2) {
                generatedExtension = (GeneratedMessageLite.GeneratedExtension) this.extensionSchema.findExtensionByNumber(registers.extensionRegistry, this.defaultInstance, WireFormat.getTagFieldNumber(i12));
                if (generatedExtension != null) {
                    i10 = ArrayDecoders.decodeMessageField(Protobuf.getInstance().schemaFor((Class) generatedExtension.getMessageDefaultInstance().getClass()), bArr, iDecodeVarint322, i11, registers);
                    fieldSetEnsureExtensionsAreMutable.setField(generatedExtension.descriptor, registers.object1);
                } else {
                    i10 = ArrayDecoders.decodeUnknownField(i12, bArr, iDecodeVarint322, i11, unknownFieldSetLite, registers);
                }
            } else {
                i10 = ArrayDecoders.skipField(i12, bArr, iDecodeVarint322, i11, registers);
            }
        }
        if (i10 != i11) {
            throw InvalidProtocolBufferException.parseFailure();
        }
    }

    @Override // com.google.protobuf.Schema
    public void mergeFrom(T t3, Reader reader, ExtensionRegistryLite extensionRegistryLite) throws Throwable {
        mergeFromHelper(this.unknownFieldSchema, this.extensionSchema, t3, reader, extensionRegistryLite);
    }
}
