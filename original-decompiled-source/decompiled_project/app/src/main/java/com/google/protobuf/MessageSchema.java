package com.google.protobuf;

import androidx.datastore.preferences.protobuf.a1;
import androidx.datastore.preferences.protobuf.y0;
import androidx.datastore.preferences.protobuf.z0;
import com.google.protobuf.ArrayDecoders;
import com.google.protobuf.ByteString;
import com.google.protobuf.Internal;
import com.google.protobuf.MapEntryLite;
import com.google.protobuf.WireFormat;
import com.google.protobuf.Writer;
import com.yalantis.ucrop.view.CropImageView;
import e.e;
import java.io.IOException;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.bouncycastle.asn1.eac.EACTags;
import sun.misc.Unsafe;

@CheckReturnValue
/* loaded from: classes2.dex */
final class MessageSchema<T> implements Schema<T> {
    private static final int CHECK_INITIALIZED_BIT = 1024;
    private static final int ENFORCE_UTF8_MASK = 536870912;
    private static final int FIELD_TYPE_MASK = 267386880;
    private static final int HAS_HAS_BIT = 4096;
    private static final int INTS_PER_FIELD = 3;
    private static final int LEGACY_ENUM_IS_CLOSED_BIT = 2048;
    private static final int LEGACY_ENUM_IS_CLOSED_MASK = Integer.MIN_VALUE;
    private static final int NO_PRESENCE_SENTINEL = 1048575;
    private static final int OFFSET_BITS = 20;
    private static final int OFFSET_MASK = 1048575;
    static final int ONEOF_TYPE_OFFSET = 51;
    private static final int REQUIRED_BIT = 256;
    private static final int REQUIRED_MASK = 268435456;
    private static final int UTF8_CHECK_BIT = 512;
    private final int[] buffer;
    private final int checkInitializedCount;
    private final MessageLite defaultInstance;
    private final ExtensionSchema<?> extensionSchema;
    private final boolean hasExtensions;
    private final int[] intArray;
    private final ListFieldSchema listFieldSchema;
    private final boolean lite;
    private final MapFieldSchema mapFieldSchema;
    private final int maxFieldNumber;
    private final int minFieldNumber;
    private final NewInstanceSchema newInstanceSchema;
    private final Object[] objects;
    private final int repeatedFieldOffsetStart;
    private final ProtoSyntax syntax;
    private final UnknownFieldSchema<?, ?> unknownFieldSchema;
    private final boolean useCachedSizeField;
    private static final int[] EMPTY_INT_ARRAY = new int[0];
    private static final Unsafe UNSAFE = UnsafeUtil.getUnsafe();

    /* renamed from: com.google.protobuf.MessageSchema$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$google$protobuf$WireFormat$FieldType;

        static {
            int[] iArr = new int[WireFormat.FieldType.values().length];
            $SwitchMap$com$google$protobuf$WireFormat$FieldType = iArr;
            try {
                iArr[WireFormat.FieldType.BOOL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[WireFormat.FieldType.BYTES.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[WireFormat.FieldType.DOUBLE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[WireFormat.FieldType.FIXED32.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[WireFormat.FieldType.SFIXED32.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[WireFormat.FieldType.FIXED64.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[WireFormat.FieldType.SFIXED64.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[WireFormat.FieldType.FLOAT.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[WireFormat.FieldType.ENUM.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[WireFormat.FieldType.INT32.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[WireFormat.FieldType.UINT32.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[WireFormat.FieldType.INT64.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[WireFormat.FieldType.UINT64.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[WireFormat.FieldType.MESSAGE.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[WireFormat.FieldType.SINT32.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[WireFormat.FieldType.SINT64.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[WireFormat.FieldType.STRING.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
        }
    }

    private MessageSchema(int[] iArr, Object[] objArr, int i10, int i11, MessageLite messageLite, ProtoSyntax protoSyntax, boolean z10, int[] iArr2, int i12, int i13, NewInstanceSchema newInstanceSchema, ListFieldSchema listFieldSchema, UnknownFieldSchema<?, ?> unknownFieldSchema, ExtensionSchema<?> extensionSchema, MapFieldSchema mapFieldSchema) {
        this.buffer = iArr;
        this.objects = objArr;
        this.minFieldNumber = i10;
        this.maxFieldNumber = i11;
        this.lite = messageLite instanceof GeneratedMessageLite;
        this.syntax = protoSyntax;
        this.hasExtensions = extensionSchema != null && extensionSchema.hasExtensions(messageLite);
        this.useCachedSizeField = z10;
        this.intArray = iArr2;
        this.checkInitializedCount = i12;
        this.repeatedFieldOffsetStart = i13;
        this.newInstanceSchema = newInstanceSchema;
        this.listFieldSchema = listFieldSchema;
        this.unknownFieldSchema = unknownFieldSchema;
        this.extensionSchema = extensionSchema;
        this.defaultInstance = messageLite;
        this.mapFieldSchema = mapFieldSchema;
    }

    private boolean arePresentForEquals(T t3, T t10, int i10) {
        return isFieldPresent(t3, i10) == isFieldPresent(t10, i10);
    }

    private static <T> boolean booleanAt(T t3, long j10) {
        return UnsafeUtil.getBoolean(t3, j10);
    }

    private static void checkMutable(Object obj) {
        if (!isMutable(obj)) {
            throw new IllegalArgumentException(z0.a(obj, "Mutating immutable message: "));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private <K, V> int decodeMapEntry(byte[] bArr, int i10, int i11, MapEntryLite.Metadata<K, V> metadata, Map<K, V> map, ArrayDecoders.Registers registers) throws IOException {
        int iDecodeVarint32 = ArrayDecoders.decodeVarint32(bArr, i10, registers);
        int i12 = registers.int1;
        if (i12 < 0 || i12 > i11 - iDecodeVarint32) {
            throw InvalidProtocolBufferException.truncatedMessage();
        }
        int i13 = iDecodeVarint32 + i12;
        Object obj = metadata.defaultKey;
        Object obj2 = metadata.defaultValue;
        while (iDecodeVarint32 < i13) {
            int iDecodeVarint322 = iDecodeVarint32 + 1;
            int i14 = bArr[iDecodeVarint32];
            if (i14 < 0) {
                iDecodeVarint322 = ArrayDecoders.decodeVarint32(i14, bArr, iDecodeVarint322, registers);
                i14 = registers.int1;
            }
            int i15 = iDecodeVarint322;
            int i16 = i14 >>> 3;
            int i17 = i14 & 7;
            if (i16 != 1) {
                if (i16 == 2 && i17 == metadata.valueType.getWireType()) {
                    iDecodeVarint32 = decodeMapEntryValue(bArr, i15, i11, metadata.valueType, metadata.defaultValue.getClass(), registers);
                    obj2 = registers.object1;
                } else {
                    iDecodeVarint32 = ArrayDecoders.skipField(i14, bArr, i15, i11, registers);
                }
            } else if (i17 == metadata.keyType.getWireType()) {
                iDecodeVarint32 = decodeMapEntryValue(bArr, i15, i11, metadata.keyType, null, registers);
                obj = registers.object1;
            } else {
                iDecodeVarint32 = ArrayDecoders.skipField(i14, bArr, i15, i11, registers);
            }
        }
        if (iDecodeVarint32 != i13) {
            throw InvalidProtocolBufferException.parseFailure();
        }
        map.put(obj, obj2);
        return i13;
    }

    private int decodeMapEntryValue(byte[] bArr, int i10, int i11, WireFormat.FieldType fieldType, Class<?> cls, ArrayDecoders.Registers registers) throws IOException {
        switch (AnonymousClass1.$SwitchMap$com$google$protobuf$WireFormat$FieldType[fieldType.ordinal()]) {
            case 1:
                int iDecodeVarint64 = ArrayDecoders.decodeVarint64(bArr, i10, registers);
                registers.object1 = Boolean.valueOf(registers.long1 != 0);
                return iDecodeVarint64;
            case 2:
                return ArrayDecoders.decodeBytes(bArr, i10, registers);
            case 3:
                registers.object1 = Double.valueOf(ArrayDecoders.decodeDouble(bArr, i10));
                return i10 + 8;
            case 4:
            case 5:
                registers.object1 = Integer.valueOf(ArrayDecoders.decodeFixed32(bArr, i10));
                return i10 + 4;
            case 6:
            case 7:
                registers.object1 = Long.valueOf(ArrayDecoders.decodeFixed64(bArr, i10));
                return i10 + 8;
            case 8:
                registers.object1 = Float.valueOf(ArrayDecoders.decodeFloat(bArr, i10));
                return i10 + 4;
            case 9:
            case 10:
            case 11:
                int iDecodeVarint32 = ArrayDecoders.decodeVarint32(bArr, i10, registers);
                registers.object1 = Integer.valueOf(registers.int1);
                return iDecodeVarint32;
            case 12:
            case 13:
                int iDecodeVarint642 = ArrayDecoders.decodeVarint64(bArr, i10, registers);
                registers.object1 = Long.valueOf(registers.long1);
                return iDecodeVarint642;
            case 14:
                return ArrayDecoders.decodeMessageField(Protobuf.getInstance().schemaFor((Class) cls), bArr, i10, i11, registers);
            case 15:
                int iDecodeVarint322 = ArrayDecoders.decodeVarint32(bArr, i10, registers);
                registers.object1 = Integer.valueOf(CodedInputStream.decodeZigZag32(registers.int1));
                return iDecodeVarint322;
            case 16:
                int iDecodeVarint643 = ArrayDecoders.decodeVarint64(bArr, i10, registers);
                registers.object1 = Long.valueOf(CodedInputStream.decodeZigZag64(registers.long1));
                return iDecodeVarint643;
            case 17:
                return ArrayDecoders.decodeStringRequireUtf8(bArr, i10, registers);
            default:
                throw new RuntimeException("unsupported field type.");
        }
    }

    private static <T> double doubleAt(T t3, long j10) {
        return UnsafeUtil.getDouble(t3, j10);
    }

    private <UT, UB> UB filterMapUnknownEnumValues(Object obj, int i10, UB ub2, UnknownFieldSchema<UT, UB> unknownFieldSchema, Object obj2) {
        Internal.EnumVerifier enumFieldVerifier;
        int iNumberAt = numberAt(i10);
        Object object = UnsafeUtil.getObject(obj, offset(typeAndOffsetAt(i10)));
        return (object == null || (enumFieldVerifier = getEnumFieldVerifier(i10)) == null) ? ub2 : (UB) filterUnknownEnumMap(i10, iNumberAt, this.mapFieldSchema.forMutableMapData(object), enumFieldVerifier, ub2, unknownFieldSchema, obj2);
    }

    private <K, V, UT, UB> UB filterUnknownEnumMap(int i10, int i11, Map<K, V> map, Internal.EnumVerifier enumVerifier, UB ub2, UnknownFieldSchema<UT, UB> unknownFieldSchema, Object obj) {
        MapEntryLite.Metadata<?, ?> metadataForMapMetadata = this.mapFieldSchema.forMapMetadata(getMapFieldDefaultEntry(i10));
        Iterator<Map.Entry<K, V>> it = map.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry<K, V> next = it.next();
            if (!enumVerifier.isInRange(((Integer) next.getValue()).intValue())) {
                if (ub2 == null) {
                    ub2 = unknownFieldSchema.getBuilderFromMessage(obj);
                }
                ByteString.CodedBuilder codedBuilderNewCodedBuilder = ByteString.newCodedBuilder(MapEntryLite.computeSerializedSize(metadataForMapMetadata, next.getKey(), next.getValue()));
                try {
                    MapEntryLite.writeTo(codedBuilderNewCodedBuilder.getCodedOutput(), metadataForMapMetadata, next.getKey(), next.getValue());
                    unknownFieldSchema.addLengthDelimited(ub2, i11, codedBuilderNewCodedBuilder.build());
                    it.remove();
                } catch (IOException e10) {
                    throw new RuntimeException(e10);
                }
            }
        }
        return ub2;
    }

    private static <T> float floatAt(T t3, long j10) {
        return UnsafeUtil.getFloat(t3, j10);
    }

    private Internal.EnumVerifier getEnumFieldVerifier(int i10) {
        return (Internal.EnumVerifier) this.objects[a1.b(i10, 3, 2, 1)];
    }

    private Object getMapFieldDefaultEntry(int i10) {
        return this.objects[(i10 / 3) * 2];
    }

    private Schema getMessageFieldSchema(int i10) {
        int i11 = (i10 / 3) * 2;
        Schema schema = (Schema) this.objects[i11];
        if (schema != null) {
            return schema;
        }
        Schema<T> schemaSchemaFor = Protobuf.getInstance().schemaFor((Class) this.objects[i11 + 1]);
        this.objects[i11] = schemaSchemaFor;
        return schemaSchemaFor;
    }

    public static UnknownFieldSetLite getMutableUnknownFields(Object obj) {
        GeneratedMessageLite generatedMessageLite = (GeneratedMessageLite) obj;
        UnknownFieldSetLite unknownFieldSetLite = generatedMessageLite.unknownFields;
        if (unknownFieldSetLite != UnknownFieldSetLite.getDefaultInstance()) {
            return unknownFieldSetLite;
        }
        UnknownFieldSetLite unknownFieldSetLiteNewInstance = UnknownFieldSetLite.newInstance();
        generatedMessageLite.unknownFields = unknownFieldSetLiteNewInstance;
        return unknownFieldSetLiteNewInstance;
    }

    private <UT, UB> int getUnknownFieldsSerializedSize(UnknownFieldSchema<UT, UB> unknownFieldSchema, T t3) {
        return unknownFieldSchema.getSerializedSize(unknownFieldSchema.getFromMessage(t3));
    }

    private static <T> int intAt(T t3, long j10) {
        return UnsafeUtil.getInt(t3, j10);
    }

    private static boolean isEnforceUtf8(int i10) {
        return (i10 & 536870912) != 0;
    }

    private boolean isFieldPresent(T t3, int i10, int i11, int i12, int i13) {
        return i11 == 1048575 ? isFieldPresent(t3, i10) : (i12 & i13) != 0;
    }

    private static boolean isLegacyEnumIsClosed(int i10) {
        return (i10 & Integer.MIN_VALUE) != 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private <N> boolean isListInitialized(Object obj, int i10, int i11) {
        List list = (List) UnsafeUtil.getObject(obj, offset(i10));
        if (list.isEmpty()) {
            return true;
        }
        Schema messageFieldSchema = getMessageFieldSchema(i11);
        for (int i12 = 0; i12 < list.size(); i12++) {
            if (!messageFieldSchema.isInitialized(list.get(i12))) {
                return false;
            }
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v12 */
    /* JADX WARN: Type inference failed for: r5v6 */
    /* JADX WARN: Type inference failed for: r5v7 */
    /* JADX WARN: Type inference failed for: r5v8, types: [com.google.protobuf.Schema] */
    private boolean isMapInitialized(T t3, int i10, int i11) {
        Map<?, ?> mapForMapData = this.mapFieldSchema.forMapData(UnsafeUtil.getObject(t3, offset(i10)));
        if (mapForMapData.isEmpty()) {
            return true;
        }
        if (this.mapFieldSchema.forMapMetadata(getMapFieldDefaultEntry(i11)).valueType.getJavaType() != WireFormat.JavaType.MESSAGE) {
            return true;
        }
        ?? SchemaFor = 0;
        for (Object obj : mapForMapData.values()) {
            SchemaFor = SchemaFor;
            if (SchemaFor == 0) {
                SchemaFor = Protobuf.getInstance().schemaFor((Class) obj.getClass());
            }
            if (!SchemaFor.isInitialized(obj)) {
                return false;
            }
        }
        return true;
    }

    private static boolean isMutable(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj instanceof GeneratedMessageLite) {
            return ((GeneratedMessageLite) obj).isMutable();
        }
        return true;
    }

    private boolean isOneofCaseEqual(T t3, T t10, int i10) {
        long jPresenceMaskAndOffsetAt = presenceMaskAndOffsetAt(i10) & 1048575;
        return UnsafeUtil.getInt(t3, jPresenceMaskAndOffsetAt) == UnsafeUtil.getInt(t10, jPresenceMaskAndOffsetAt);
    }

    private boolean isOneofPresent(T t3, int i10, int i11) {
        return UnsafeUtil.getInt(t3, (long) (presenceMaskAndOffsetAt(i11) & 1048575)) == i10;
    }

    private static boolean isRequired(int i10) {
        return (i10 & REQUIRED_MASK) != 0;
    }

    private static <T> long longAt(T t3, long j10) {
        return UnsafeUtil.getLong(t3, j10);
    }

    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:77)
        */
    private <UT, UB, ET extends com.google.protobuf.FieldSet.FieldDescriptorLite<ET>> void mergeFromHelper(com.google.protobuf.UnknownFieldSchema<UT, UB> r18, com.google.protobuf.ExtensionSchema<ET> r19, T r20, com.google.protobuf.Reader r21, com.google.protobuf.ExtensionRegistryLite r22) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 2040
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.MessageSchema.mergeFromHelper(com.google.protobuf.UnknownFieldSchema, com.google.protobuf.ExtensionSchema, java.lang.Object, com.google.protobuf.Reader, com.google.protobuf.ExtensionRegistryLite):void");
    }

    private final <K, V> void mergeMap(Object obj, int i10, Object obj2, ExtensionRegistryLite extensionRegistryLite, Reader reader) throws IOException {
        long jOffset = offset(typeAndOffsetAt(i10));
        Object object = UnsafeUtil.getObject(obj, jOffset);
        if (object == null) {
            object = this.mapFieldSchema.newMapField(obj2);
            UnsafeUtil.putObject(obj, jOffset, object);
        } else if (this.mapFieldSchema.isImmutable(object)) {
            Object objNewMapField = this.mapFieldSchema.newMapField(obj2);
            this.mapFieldSchema.mergeFrom(objNewMapField, object);
            UnsafeUtil.putObject(obj, jOffset, objNewMapField);
            object = objNewMapField;
        }
        reader.readMap(this.mapFieldSchema.forMutableMapData(object), this.mapFieldSchema.forMapMetadata(obj2), extensionRegistryLite);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void mergeMessage(T t3, T t10, int i10) {
        if (isFieldPresent(t10, i10)) {
            long jOffset = offset(typeAndOffsetAt(i10));
            Unsafe unsafe = UNSAFE;
            Object object = unsafe.getObject(t10, jOffset);
            if (object == null) {
                throw new IllegalStateException("Source subfield " + numberAt(i10) + " is present but null: " + t10);
            }
            Schema messageFieldSchema = getMessageFieldSchema(i10);
            if (!isFieldPresent(t3, i10)) {
                if (isMutable(object)) {
                    Object objNewInstance = messageFieldSchema.newInstance();
                    messageFieldSchema.mergeFrom(objNewInstance, object);
                    unsafe.putObject(t3, jOffset, objNewInstance);
                } else {
                    unsafe.putObject(t3, jOffset, object);
                }
                setFieldPresent(t3, i10);
                return;
            }
            Object object2 = unsafe.getObject(t3, jOffset);
            if (!isMutable(object2)) {
                Object objNewInstance2 = messageFieldSchema.newInstance();
                messageFieldSchema.mergeFrom(objNewInstance2, object2);
                unsafe.putObject(t3, jOffset, objNewInstance2);
                object2 = objNewInstance2;
            }
            messageFieldSchema.mergeFrom(object2, object);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void mergeOneofMessage(T t3, T t10, int i10) {
        int iNumberAt = numberAt(i10);
        if (isOneofPresent(t10, iNumberAt, i10)) {
            long jOffset = offset(typeAndOffsetAt(i10));
            Unsafe unsafe = UNSAFE;
            Object object = unsafe.getObject(t10, jOffset);
            if (object == null) {
                throw new IllegalStateException("Source subfield " + numberAt(i10) + " is present but null: " + t10);
            }
            Schema messageFieldSchema = getMessageFieldSchema(i10);
            if (!isOneofPresent(t3, iNumberAt, i10)) {
                if (isMutable(object)) {
                    Object objNewInstance = messageFieldSchema.newInstance();
                    messageFieldSchema.mergeFrom(objNewInstance, object);
                    unsafe.putObject(t3, jOffset, objNewInstance);
                } else {
                    unsafe.putObject(t3, jOffset, object);
                }
                setOneofPresent(t3, iNumberAt, i10);
                return;
            }
            Object object2 = unsafe.getObject(t3, jOffset);
            if (!isMutable(object2)) {
                Object objNewInstance2 = messageFieldSchema.newInstance();
                messageFieldSchema.mergeFrom(objNewInstance2, object2);
                unsafe.putObject(t3, jOffset, objNewInstance2);
                object2 = objNewInstance2;
            }
            messageFieldSchema.mergeFrom(object2, object);
        }
    }

    private void mergeSingleField(T t3, T t10, int i10) {
        int iTypeAndOffsetAt = typeAndOffsetAt(i10);
        long jOffset = offset(iTypeAndOffsetAt);
        int iNumberAt = numberAt(i10);
        switch (type(iTypeAndOffsetAt)) {
            case 0:
                if (isFieldPresent(t10, i10)) {
                    UnsafeUtil.putDouble(t3, jOffset, UnsafeUtil.getDouble(t10, jOffset));
                    setFieldPresent(t3, i10);
                    break;
                }
                break;
            case 1:
                if (isFieldPresent(t10, i10)) {
                    UnsafeUtil.putFloat(t3, jOffset, UnsafeUtil.getFloat(t10, jOffset));
                    setFieldPresent(t3, i10);
                    break;
                }
                break;
            case 2:
                if (isFieldPresent(t10, i10)) {
                    UnsafeUtil.putLong(t3, jOffset, UnsafeUtil.getLong(t10, jOffset));
                    setFieldPresent(t3, i10);
                    break;
                }
                break;
            case 3:
                if (isFieldPresent(t10, i10)) {
                    UnsafeUtil.putLong(t3, jOffset, UnsafeUtil.getLong(t10, jOffset));
                    setFieldPresent(t3, i10);
                    break;
                }
                break;
            case 4:
                if (isFieldPresent(t10, i10)) {
                    UnsafeUtil.putInt(t3, jOffset, UnsafeUtil.getInt(t10, jOffset));
                    setFieldPresent(t3, i10);
                    break;
                }
                break;
            case 5:
                if (isFieldPresent(t10, i10)) {
                    UnsafeUtil.putLong(t3, jOffset, UnsafeUtil.getLong(t10, jOffset));
                    setFieldPresent(t3, i10);
                    break;
                }
                break;
            case 6:
                if (isFieldPresent(t10, i10)) {
                    UnsafeUtil.putInt(t3, jOffset, UnsafeUtil.getInt(t10, jOffset));
                    setFieldPresent(t3, i10);
                    break;
                }
                break;
            case 7:
                if (isFieldPresent(t10, i10)) {
                    UnsafeUtil.putBoolean(t3, jOffset, UnsafeUtil.getBoolean(t10, jOffset));
                    setFieldPresent(t3, i10);
                    break;
                }
                break;
            case 8:
                if (isFieldPresent(t10, i10)) {
                    UnsafeUtil.putObject(t3, jOffset, UnsafeUtil.getObject(t10, jOffset));
                    setFieldPresent(t3, i10);
                    break;
                }
                break;
            case 9:
                mergeMessage(t3, t10, i10);
                break;
            case 10:
                if (isFieldPresent(t10, i10)) {
                    UnsafeUtil.putObject(t3, jOffset, UnsafeUtil.getObject(t10, jOffset));
                    setFieldPresent(t3, i10);
                    break;
                }
                break;
            case 11:
                if (isFieldPresent(t10, i10)) {
                    UnsafeUtil.putInt(t3, jOffset, UnsafeUtil.getInt(t10, jOffset));
                    setFieldPresent(t3, i10);
                    break;
                }
                break;
            case 12:
                if (isFieldPresent(t10, i10)) {
                    UnsafeUtil.putInt(t3, jOffset, UnsafeUtil.getInt(t10, jOffset));
                    setFieldPresent(t3, i10);
                    break;
                }
                break;
            case 13:
                if (isFieldPresent(t10, i10)) {
                    UnsafeUtil.putInt(t3, jOffset, UnsafeUtil.getInt(t10, jOffset));
                    setFieldPresent(t3, i10);
                    break;
                }
                break;
            case 14:
                if (isFieldPresent(t10, i10)) {
                    UnsafeUtil.putLong(t3, jOffset, UnsafeUtil.getLong(t10, jOffset));
                    setFieldPresent(t3, i10);
                    break;
                }
                break;
            case 15:
                if (isFieldPresent(t10, i10)) {
                    UnsafeUtil.putInt(t3, jOffset, UnsafeUtil.getInt(t10, jOffset));
                    setFieldPresent(t3, i10);
                    break;
                }
                break;
            case 16:
                if (isFieldPresent(t10, i10)) {
                    UnsafeUtil.putLong(t3, jOffset, UnsafeUtil.getLong(t10, jOffset));
                    setFieldPresent(t3, i10);
                    break;
                }
                break;
            case 17:
                mergeMessage(t3, t10, i10);
                break;
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
            case 24:
            case 25:
            case 26:
            case 27:
            case 28:
            case 29:
            case 30:
            case 31:
            case 32:
            case 33:
            case 34:
            case 35:
            case 36:
            case 37:
            case 38:
            case 39:
            case 40:
            case 41:
            case 42:
            case EACTags.DATE_OF_BIRTH /* 43 */:
            case 44:
            case 45:
            case 46:
            case EACTags.PIN_USAGE_POLICY /* 47 */:
            case 48:
            case 49:
                this.listFieldSchema.mergeListsAt(t3, t10, jOffset);
                break;
            case 50:
                SchemaUtil.mergeMap(this.mapFieldSchema, t3, t10, jOffset);
                break;
            case 51:
            case 52:
            case EACTags.SEX /* 53 */:
            case EACTags.CURRENCY_EXPONENT /* 54 */:
            case 55:
            case 56:
            case 57:
            case EACTags.DYNAMIC_INTERNAL_AUTHENTIFICATION /* 58 */:
            case EACTags.DYNAMIC_EXTERNAL_AUTHENTIFICATION /* 59 */:
                if (isOneofPresent(t10, iNumberAt, i10)) {
                    UnsafeUtil.putObject(t3, jOffset, UnsafeUtil.getObject(t10, jOffset));
                    setOneofPresent(t3, iNumberAt, i10);
                    break;
                }
                break;
            case 60:
                mergeOneofMessage(t3, t10, i10);
                break;
            case 61:
            case 62:
            case 63:
            case 64:
            case EACTags.ELEMENT_LIST /* 65 */:
            case EACTags.ADDRESS /* 66 */:
            case EACTags.CARDHOLDER_HANDWRITTEN_SIGNATURE /* 67 */:
                if (isOneofPresent(t10, iNumberAt, i10)) {
                    UnsafeUtil.putObject(t3, jOffset, UnsafeUtil.getObject(t10, jOffset));
                    setOneofPresent(t3, iNumberAt, i10);
                    break;
                }
                break;
            case 68:
                mergeOneofMessage(t3, t10, i10);
                break;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private Object mutableMessageFieldForMerge(T t3, int i10) {
        Schema messageFieldSchema = getMessageFieldSchema(i10);
        long jOffset = offset(typeAndOffsetAt(i10));
        if (!isFieldPresent(t3, i10)) {
            return messageFieldSchema.newInstance();
        }
        Object object = UNSAFE.getObject(t3, jOffset);
        if (isMutable(object)) {
            return object;
        }
        Object objNewInstance = messageFieldSchema.newInstance();
        if (object != null) {
            messageFieldSchema.mergeFrom(objNewInstance, object);
        }
        return objNewInstance;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private Object mutableOneofMessageFieldForMerge(T t3, int i10, int i11) {
        Schema messageFieldSchema = getMessageFieldSchema(i11);
        if (!isOneofPresent(t3, i10, i11)) {
            return messageFieldSchema.newInstance();
        }
        Object object = UNSAFE.getObject(t3, offset(typeAndOffsetAt(i11)));
        if (isMutable(object)) {
            return object;
        }
        Object objNewInstance = messageFieldSchema.newInstance();
        if (object != null) {
            messageFieldSchema.mergeFrom(objNewInstance, object);
        }
        return objNewInstance;
    }

    public static <T> MessageSchema<T> newSchema(Class<T> cls, MessageInfo messageInfo, NewInstanceSchema newInstanceSchema, ListFieldSchema listFieldSchema, UnknownFieldSchema<?, ?> unknownFieldSchema, ExtensionSchema<?> extensionSchema, MapFieldSchema mapFieldSchema) {
        return messageInfo instanceof RawMessageInfo ? newSchemaForRawMessageInfo((RawMessageInfo) messageInfo, newInstanceSchema, listFieldSchema, unknownFieldSchema, extensionSchema, mapFieldSchema) : newSchemaForMessageInfo((StructuralMessageInfo) messageInfo, newInstanceSchema, listFieldSchema, unknownFieldSchema, extensionSchema, mapFieldSchema);
    }

    public static <T> MessageSchema<T> newSchemaForMessageInfo(StructuralMessageInfo structuralMessageInfo, NewInstanceSchema newInstanceSchema, ListFieldSchema listFieldSchema, UnknownFieldSchema<?, ?> unknownFieldSchema, ExtensionSchema<?> extensionSchema, MapFieldSchema mapFieldSchema) {
        int fieldNumber;
        int fieldNumber2;
        int i10;
        FieldInfo[] fields = structuralMessageInfo.getFields();
        if (fields.length == 0) {
            fieldNumber = 0;
            fieldNumber2 = 0;
        } else {
            fieldNumber = fields[0].getFieldNumber();
            fieldNumber2 = fields[fields.length - 1].getFieldNumber();
        }
        int length = fields.length;
        int[] iArr = new int[length * 3];
        Object[] objArr = new Object[length * 2];
        int i11 = 0;
        int i12 = 0;
        for (FieldInfo fieldInfo : fields) {
            if (fieldInfo.getType() == FieldType.MAP) {
                i11++;
            } else if (fieldInfo.getType().id() >= 18 && fieldInfo.getType().id() <= 49) {
                i12++;
            }
        }
        int[] iArr2 = i11 > 0 ? new int[i11] : null;
        int[] iArr3 = i12 > 0 ? new int[i12] : null;
        int[] checkInitialized = structuralMessageInfo.getCheckInitialized();
        if (checkInitialized == null) {
            checkInitialized = EMPTY_INT_ARRAY;
        }
        int i13 = 0;
        int i14 = 0;
        int i15 = 0;
        int i16 = 0;
        int i17 = 0;
        while (i13 < fields.length) {
            FieldInfo fieldInfo2 = fields[i13];
            int fieldNumber3 = fieldInfo2.getFieldNumber();
            storeFieldData(fieldInfo2, iArr, i14, objArr);
            if (i15 < checkInitialized.length && checkInitialized[i15] == fieldNumber3) {
                checkInitialized[i15] = i14;
                i15++;
            }
            if (fieldInfo2.getType() == FieldType.MAP) {
                iArr2[i16] = i14;
                i16++;
            } else {
                if (fieldInfo2.getType().id() >= 18 && fieldInfo2.getType().id() <= 49) {
                    i10 = i14;
                    iArr3[i17] = (int) UnsafeUtil.objectFieldOffset(fieldInfo2.getField());
                    i17++;
                }
                i13++;
                i14 = i10 + 3;
            }
            i10 = i14;
            i13++;
            i14 = i10 + 3;
        }
        if (iArr2 == null) {
            iArr2 = EMPTY_INT_ARRAY;
        }
        if (iArr3 == null) {
            iArr3 = EMPTY_INT_ARRAY;
        }
        int[] iArr4 = new int[checkInitialized.length + iArr2.length + iArr3.length];
        System.arraycopy(checkInitialized, 0, iArr4, 0, checkInitialized.length);
        System.arraycopy(iArr2, 0, iArr4, checkInitialized.length, iArr2.length);
        System.arraycopy(iArr3, 0, iArr4, checkInitialized.length + iArr2.length, iArr3.length);
        return new MessageSchema<>(iArr, objArr, fieldNumber, fieldNumber2, structuralMessageInfo.getDefaultInstance(), structuralMessageInfo.getSyntax(), true, iArr4, checkInitialized.length, checkInitialized.length + iArr2.length, newInstanceSchema, listFieldSchema, unknownFieldSchema, extensionSchema, mapFieldSchema);
    }

    /* JADX WARN: Removed duplicated region for block: B:166:0x0359  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x03aa  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static <T> MessageSchema<T> newSchemaForRawMessageInfo(RawMessageInfo rawMessageInfo, NewInstanceSchema newInstanceSchema, ListFieldSchema listFieldSchema, UnknownFieldSchema<?, ?> unknownFieldSchema, ExtensionSchema<?> extensionSchema, MapFieldSchema mapFieldSchema) {
        int i10;
        int iCharAt;
        int i11;
        int i12;
        int i13;
        int i14;
        int[] iArr;
        int i15;
        int i16;
        int i17;
        char cCharAt;
        int i18;
        char cCharAt2;
        int i19;
        char cCharAt3;
        int i20;
        char cCharAt4;
        int i21;
        char cCharAt5;
        int i22;
        char cCharAt6;
        int i23;
        char cCharAt7;
        int i24;
        char cCharAt8;
        int i25;
        int i26;
        int i27;
        int i28;
        int i29;
        int i30;
        int iObjectFieldOffset;
        String str;
        char c10;
        int iObjectFieldOffset2;
        int i31;
        int i32;
        java.lang.reflect.Field fieldReflectField;
        char cCharAt9;
        int i33;
        int i34;
        java.lang.reflect.Field fieldReflectField2;
        java.lang.reflect.Field fieldReflectField3;
        int i35;
        char cCharAt10;
        int i36;
        char cCharAt11;
        int i37;
        char cCharAt12;
        int i38;
        char cCharAt13;
        String stringInfo = rawMessageInfo.getStringInfo();
        int length = stringInfo.length();
        char c11 = 55296;
        if (stringInfo.charAt(0) >= 55296) {
            int i39 = 1;
            while (true) {
                i10 = i39 + 1;
                if (stringInfo.charAt(i39) < 55296) {
                    break;
                }
                i39 = i10;
            }
        } else {
            i10 = 1;
        }
        int i40 = i10 + 1;
        int iCharAt2 = stringInfo.charAt(i10);
        if (iCharAt2 >= 55296) {
            int i41 = iCharAt2 & 8191;
            int i42 = 13;
            while (true) {
                i38 = i40 + 1;
                cCharAt13 = stringInfo.charAt(i40);
                if (cCharAt13 < 55296) {
                    break;
                }
                i41 |= (cCharAt13 & 8191) << i42;
                i42 += 13;
                i40 = i38;
            }
            iCharAt2 = i41 | (cCharAt13 << i42);
            i40 = i38;
        }
        if (iCharAt2 == 0) {
            i13 = 0;
            iCharAt = 0;
            i12 = 0;
            i16 = 0;
            i11 = 0;
            i15 = 0;
            iArr = EMPTY_INT_ARRAY;
            i14 = 0;
        } else {
            int i43 = i40 + 1;
            int iCharAt3 = stringInfo.charAt(i40);
            if (iCharAt3 >= 55296) {
                int i44 = iCharAt3 & 8191;
                int i45 = 13;
                while (true) {
                    i24 = i43 + 1;
                    cCharAt8 = stringInfo.charAt(i43);
                    if (cCharAt8 < 55296) {
                        break;
                    }
                    i44 |= (cCharAt8 & 8191) << i45;
                    i45 += 13;
                    i43 = i24;
                }
                iCharAt3 = i44 | (cCharAt8 << i45);
                i43 = i24;
            }
            int i46 = i43 + 1;
            int iCharAt4 = stringInfo.charAt(i43);
            if (iCharAt4 >= 55296) {
                int i47 = iCharAt4 & 8191;
                int i48 = 13;
                while (true) {
                    i23 = i46 + 1;
                    cCharAt7 = stringInfo.charAt(i46);
                    if (cCharAt7 < 55296) {
                        break;
                    }
                    i47 |= (cCharAt7 & 8191) << i48;
                    i48 += 13;
                    i46 = i23;
                }
                iCharAt4 = i47 | (cCharAt7 << i48);
                i46 = i23;
            }
            int i49 = i46 + 1;
            int iCharAt5 = stringInfo.charAt(i46);
            if (iCharAt5 >= 55296) {
                int i50 = iCharAt5 & 8191;
                int i51 = 13;
                while (true) {
                    i22 = i49 + 1;
                    cCharAt6 = stringInfo.charAt(i49);
                    if (cCharAt6 < 55296) {
                        break;
                    }
                    i50 |= (cCharAt6 & 8191) << i51;
                    i51 += 13;
                    i49 = i22;
                }
                iCharAt5 = i50 | (cCharAt6 << i51);
                i49 = i22;
            }
            int i52 = i49 + 1;
            int iCharAt6 = stringInfo.charAt(i49);
            if (iCharAt6 >= 55296) {
                int i53 = iCharAt6 & 8191;
                int i54 = 13;
                while (true) {
                    i21 = i52 + 1;
                    cCharAt5 = stringInfo.charAt(i52);
                    if (cCharAt5 < 55296) {
                        break;
                    }
                    i53 |= (cCharAt5 & 8191) << i54;
                    i54 += 13;
                    i52 = i21;
                }
                iCharAt6 = i53 | (cCharAt5 << i54);
                i52 = i21;
            }
            int i55 = i52 + 1;
            iCharAt = stringInfo.charAt(i52);
            if (iCharAt >= 55296) {
                int i56 = iCharAt & 8191;
                int i57 = 13;
                while (true) {
                    i20 = i55 + 1;
                    cCharAt4 = stringInfo.charAt(i55);
                    if (cCharAt4 < 55296) {
                        break;
                    }
                    i56 |= (cCharAt4 & 8191) << i57;
                    i57 += 13;
                    i55 = i20;
                }
                iCharAt = i56 | (cCharAt4 << i57);
                i55 = i20;
            }
            int i58 = i55 + 1;
            int iCharAt7 = stringInfo.charAt(i55);
            if (iCharAt7 >= 55296) {
                int i59 = iCharAt7 & 8191;
                int i60 = 13;
                while (true) {
                    i19 = i58 + 1;
                    cCharAt3 = stringInfo.charAt(i58);
                    if (cCharAt3 < 55296) {
                        break;
                    }
                    i59 |= (cCharAt3 & 8191) << i60;
                    i60 += 13;
                    i58 = i19;
                }
                iCharAt7 = i59 | (cCharAt3 << i60);
                i58 = i19;
            }
            int i61 = i58 + 1;
            int iCharAt8 = stringInfo.charAt(i58);
            if (iCharAt8 >= 55296) {
                int i62 = iCharAt8 & 8191;
                int i63 = 13;
                while (true) {
                    i18 = i61 + 1;
                    cCharAt2 = stringInfo.charAt(i61);
                    if (cCharAt2 < 55296) {
                        break;
                    }
                    i62 |= (cCharAt2 & 8191) << i63;
                    i63 += 13;
                    i61 = i18;
                }
                iCharAt8 = i62 | (cCharAt2 << i63);
                i61 = i18;
            }
            int i64 = i61 + 1;
            int iCharAt9 = stringInfo.charAt(i61);
            if (iCharAt9 >= 55296) {
                int i65 = iCharAt9 & 8191;
                int i66 = 13;
                while (true) {
                    i17 = i64 + 1;
                    cCharAt = stringInfo.charAt(i64);
                    if (cCharAt < 55296) {
                        break;
                    }
                    i65 |= (cCharAt & 8191) << i66;
                    i66 += 13;
                    i64 = i17;
                }
                iCharAt9 = i65 | (cCharAt << i66);
                i64 = i17;
            }
            int[] iArr2 = new int[iCharAt9 + iCharAt7 + iCharAt8];
            i11 = (iCharAt3 * 2) + iCharAt4;
            int i67 = iCharAt7;
            i12 = iCharAt5;
            i13 = i67;
            i14 = iCharAt3;
            iArr = iArr2;
            i15 = iCharAt9;
            i40 = i64;
            i16 = iCharAt6;
        }
        Unsafe unsafe = UNSAFE;
        Object[] objects = rawMessageInfo.getObjects();
        Class<?> cls = rawMessageInfo.getDefaultInstance().getClass();
        int[] iArr3 = new int[iCharAt * 3];
        Object[] objArr = new Object[iCharAt * 2];
        int i68 = i15 + i13;
        int i69 = i68;
        int i70 = i15;
        int i71 = 0;
        int i72 = 0;
        while (i40 < length) {
            int i73 = i40 + 1;
            int iCharAt10 = stringInfo.charAt(i40);
            if (iCharAt10 >= c11) {
                int i74 = iCharAt10 & 8191;
                int i75 = i73;
                int i76 = 13;
                while (true) {
                    i37 = i75 + 1;
                    cCharAt12 = stringInfo.charAt(i75);
                    if (cCharAt12 < c11) {
                        break;
                    }
                    i74 |= (cCharAt12 & 8191) << i76;
                    i76 += 13;
                    i75 = i37;
                }
                iCharAt10 = i74 | (cCharAt12 << i76);
                i25 = i37;
            } else {
                i25 = i73;
            }
            int i77 = i25 + 1;
            int iCharAt11 = stringInfo.charAt(i25);
            if (iCharAt11 >= c11) {
                int i78 = iCharAt11 & 8191;
                int i79 = i77;
                int i80 = 13;
                while (true) {
                    i36 = i79 + 1;
                    cCharAt11 = stringInfo.charAt(i79);
                    i26 = length;
                    if (cCharAt11 < 55296) {
                        break;
                    }
                    i78 |= (cCharAt11 & 8191) << i80;
                    i80 += 13;
                    i79 = i36;
                    length = i26;
                }
                iCharAt11 = i78 | (cCharAt11 << i80);
                i27 = i36;
            } else {
                i26 = length;
                i27 = i77;
            }
            int i81 = iCharAt11 & 255;
            int[] iArr4 = iArr3;
            if ((iCharAt11 & 1024) != 0) {
                iArr[i72] = i71;
                i72++;
            }
            int i82 = iCharAt10;
            if (i81 >= 51) {
                int i83 = i27 + 1;
                int iCharAt12 = stringInfo.charAt(i27);
                char c12 = 55296;
                if (iCharAt12 >= 55296) {
                    int i84 = iCharAt12 & 8191;
                    int i85 = 13;
                    while (true) {
                        i35 = i83 + 1;
                        cCharAt10 = stringInfo.charAt(i83);
                        if (cCharAt10 < c12) {
                            break;
                        }
                        i84 |= (cCharAt10 & 8191) << i85;
                        i85 += 13;
                        i83 = i35;
                        c12 = 55296;
                    }
                    iCharAt12 = i84 | (cCharAt10 << i85);
                    i83 = i35;
                }
                int i86 = i81 - 51;
                int i87 = iCharAt12;
                if (i86 == 9 || i86 == 17) {
                    i34 = i83;
                    objArr[a1.b(i71, 3, 2, 1)] = objects[i11];
                    i11++;
                } else if (i86 != 12 || (!rawMessageInfo.getSyntax().equals(ProtoSyntax.PROTO2) && (iCharAt11 & 2048) == 0)) {
                    i34 = i83;
                } else {
                    i34 = i83;
                    objArr[a1.b(i71, 3, 2, 1)] = objects[i11];
                    i11++;
                }
                int i88 = i87 * 2;
                Object obj = objects[i88];
                if (obj instanceof java.lang.reflect.Field) {
                    fieldReflectField2 = (java.lang.reflect.Field) obj;
                } else {
                    fieldReflectField2 = reflectField(cls, (String) obj);
                    objects[i88] = fieldReflectField2;
                }
                int iObjectFieldOffset3 = (int) unsafe.objectFieldOffset(fieldReflectField2);
                int i89 = i88 + 1;
                Object obj2 = objects[i89];
                if (obj2 instanceof java.lang.reflect.Field) {
                    fieldReflectField3 = (java.lang.reflect.Field) obj2;
                } else {
                    fieldReflectField3 = reflectField(cls, (String) obj2);
                    objects[i89] = fieldReflectField3;
                }
                int iObjectFieldOffset4 = (int) unsafe.objectFieldOffset(fieldReflectField3);
                i29 = i68;
                i40 = i34;
                iObjectFieldOffset = iObjectFieldOffset3;
                c10 = 2;
                str = stringInfo;
                iObjectFieldOffset2 = iObjectFieldOffset4;
                i28 = i14;
                i30 = i11;
                i32 = 0;
            } else {
                int i90 = i11 + 1;
                java.lang.reflect.Field fieldReflectField4 = reflectField(cls, (String) objects[i11]);
                if (i81 == 9 || i81 == 17) {
                    i28 = i14;
                    i29 = i68;
                    objArr[a1.b(i71, 3, 2, 1)] = fieldReflectField4.getType();
                } else {
                    if (i81 == 27 || i81 == 49) {
                        i28 = i14;
                        i29 = i68;
                        i33 = i11 + 2;
                        objArr[a1.b(i71, 3, 2, 1)] = objects[i90];
                    } else {
                        if (i81 == 12 || i81 == 30 || i81 == 44) {
                            i28 = i14;
                            if (rawMessageInfo.getSyntax() == ProtoSyntax.PROTO2 || (iCharAt11 & 2048) != 0) {
                                i29 = i68;
                                i33 = i11 + 2;
                                objArr[a1.b(i71, 3, 2, 1)] = objects[i90];
                            }
                        } else if (i81 == 50) {
                            int i91 = i70 + 1;
                            iArr[i70] = i71;
                            int i92 = (i71 / 3) * 2;
                            int i93 = i11 + 2;
                            objArr[i92] = objects[i90];
                            if ((iCharAt11 & 2048) != 0) {
                                objArr[i92 + 1] = objects[i93];
                                i28 = i14;
                                i29 = i68;
                                i70 = i91;
                                i30 = i11 + 3;
                            } else {
                                i28 = i14;
                                i30 = i93;
                                i29 = i68;
                                i70 = i91;
                            }
                            iObjectFieldOffset = (int) unsafe.objectFieldOffset(fieldReflectField4);
                            if ((iCharAt11 & 4096) == 0 || i81 > 17) {
                                str = stringInfo;
                                c10 = 2;
                                iObjectFieldOffset2 = 1048575;
                                i31 = i27;
                                i32 = 0;
                            } else {
                                int i94 = i27 + 1;
                                int iCharAt13 = stringInfo.charAt(i27);
                                if (iCharAt13 >= 55296) {
                                    int i95 = iCharAt13 & 8191;
                                    int i96 = 13;
                                    while (true) {
                                        i31 = i94 + 1;
                                        cCharAt9 = stringInfo.charAt(i94);
                                        if (cCharAt9 < 55296) {
                                            break;
                                        }
                                        i95 |= (cCharAt9 & 8191) << i96;
                                        i96 += 13;
                                        i94 = i31;
                                    }
                                    iCharAt13 = i95 | (cCharAt9 << i96);
                                } else {
                                    i31 = i94;
                                }
                                c10 = 2;
                                int i97 = (iCharAt13 / 32) + (i28 * 2);
                                Object obj3 = objects[i97];
                                if (obj3 instanceof java.lang.reflect.Field) {
                                    fieldReflectField = (java.lang.reflect.Field) obj3;
                                } else {
                                    fieldReflectField = reflectField(cls, (String) obj3);
                                    objects[i97] = fieldReflectField;
                                }
                                str = stringInfo;
                                int i98 = iCharAt13;
                                iObjectFieldOffset2 = (int) unsafe.objectFieldOffset(fieldReflectField);
                                i32 = i98 % 32;
                            }
                            if (i81 >= 18 && i81 <= 49) {
                                iArr[i69] = iObjectFieldOffset;
                                i69++;
                            }
                            i40 = i31;
                        } else {
                            i28 = i14;
                        }
                        i29 = i68;
                    }
                    i30 = i33;
                    iObjectFieldOffset = (int) unsafe.objectFieldOffset(fieldReflectField4);
                    if ((iCharAt11 & 4096) == 0) {
                        str = stringInfo;
                        c10 = 2;
                        iObjectFieldOffset2 = 1048575;
                        i31 = i27;
                        i32 = 0;
                        if (i81 >= 18) {
                            iArr[i69] = iObjectFieldOffset;
                            i69++;
                        }
                        i40 = i31;
                    }
                }
                i30 = i90;
                iObjectFieldOffset = (int) unsafe.objectFieldOffset(fieldReflectField4);
                if ((iCharAt11 & 4096) == 0) {
                }
            }
            int i99 = i71 + 1;
            iArr4[i71] = i82;
            int i100 = i71 + 2;
            int i101 = iObjectFieldOffset2;
            iArr4[i99] = ((iCharAt11 & 256) != 0 ? REQUIRED_MASK : 0) | ((iCharAt11 & 512) != 0 ? 536870912 : 0) | ((iCharAt11 & 2048) != 0 ? Integer.MIN_VALUE : 0) | (i81 << 20) | iObjectFieldOffset;
            i71 += 3;
            iArr4[i100] = (i32 << 20) | i101;
            i11 = i30;
            stringInfo = str;
            i68 = i29;
            iArr3 = iArr4;
            i14 = i28;
            length = i26;
            c11 = 55296;
        }
        return new MessageSchema<>(iArr3, objArr, i12, i16, rawMessageInfo.getDefaultInstance(), rawMessageInfo.getSyntax(), false, iArr, i15, i68, newInstanceSchema, listFieldSchema, unknownFieldSchema, extensionSchema, mapFieldSchema);
    }

    private int numberAt(int i10) {
        return this.buffer[i10];
    }

    private static long offset(int i10) {
        return i10 & 1048575;
    }

    private static <T> boolean oneofBooleanAt(T t3, long j10) {
        return ((Boolean) UnsafeUtil.getObject(t3, j10)).booleanValue();
    }

    private static <T> double oneofDoubleAt(T t3, long j10) {
        return ((Double) UnsafeUtil.getObject(t3, j10)).doubleValue();
    }

    private static <T> float oneofFloatAt(T t3, long j10) {
        return ((Float) UnsafeUtil.getObject(t3, j10)).floatValue();
    }

    private static <T> int oneofIntAt(T t3, long j10) {
        return ((Integer) UnsafeUtil.getObject(t3, j10)).intValue();
    }

    private static <T> long oneofLongAt(T t3, long j10) {
        return ((Long) UnsafeUtil.getObject(t3, j10)).longValue();
    }

    private <K, V> int parseMapField(T t3, byte[] bArr, int i10, int i11, int i12, long j10, ArrayDecoders.Registers registers) throws IOException {
        Unsafe unsafe = UNSAFE;
        Object mapFieldDefaultEntry = getMapFieldDefaultEntry(i12);
        Object object = unsafe.getObject(t3, j10);
        if (this.mapFieldSchema.isImmutable(object)) {
            Object objNewMapField = this.mapFieldSchema.newMapField(mapFieldDefaultEntry);
            this.mapFieldSchema.mergeFrom(objNewMapField, object);
            unsafe.putObject(t3, j10, objNewMapField);
            object = objNewMapField;
        }
        return decodeMapEntry(bArr, i10, i11, this.mapFieldSchema.forMapMetadata(mapFieldDefaultEntry), this.mapFieldSchema.forMutableMapData(object), registers);
    }

    private int parseOneofField(T t3, byte[] bArr, int i10, int i11, int i12, int i13, int i14, int i15, int i16, long j10, int i17, ArrayDecoders.Registers registers) throws IOException {
        Unsafe unsafe = UNSAFE;
        long j11 = this.buffer[i17 + 2] & 1048575;
        switch (i16) {
            case 51:
                if (i14 != 1) {
                    return i10;
                }
                unsafe.putObject(t3, j10, Double.valueOf(ArrayDecoders.decodeDouble(bArr, i10)));
                int i18 = i10 + 8;
                unsafe.putInt(t3, j11, i13);
                return i18;
            case 52:
                if (i14 != 5) {
                    return i10;
                }
                unsafe.putObject(t3, j10, Float.valueOf(ArrayDecoders.decodeFloat(bArr, i10)));
                int i19 = i10 + 4;
                unsafe.putInt(t3, j11, i13);
                return i19;
            case EACTags.SEX /* 53 */:
            case EACTags.CURRENCY_EXPONENT /* 54 */:
                if (i14 != 0) {
                    return i10;
                }
                int iDecodeVarint64 = ArrayDecoders.decodeVarint64(bArr, i10, registers);
                unsafe.putObject(t3, j10, Long.valueOf(registers.long1));
                unsafe.putInt(t3, j11, i13);
                return iDecodeVarint64;
            case 55:
            case 62:
                if (i14 != 0) {
                    return i10;
                }
                int iDecodeVarint32 = ArrayDecoders.decodeVarint32(bArr, i10, registers);
                unsafe.putObject(t3, j10, Integer.valueOf(registers.int1));
                unsafe.putInt(t3, j11, i13);
                return iDecodeVarint32;
            case 56:
            case EACTags.ELEMENT_LIST /* 65 */:
                if (i14 != 1) {
                    return i10;
                }
                unsafe.putObject(t3, j10, Long.valueOf(ArrayDecoders.decodeFixed64(bArr, i10)));
                int i20 = i10 + 8;
                unsafe.putInt(t3, j11, i13);
                return i20;
            case 57:
            case 64:
                if (i14 != 5) {
                    return i10;
                }
                unsafe.putObject(t3, j10, Integer.valueOf(ArrayDecoders.decodeFixed32(bArr, i10)));
                int i21 = i10 + 4;
                unsafe.putInt(t3, j11, i13);
                return i21;
            case EACTags.DYNAMIC_INTERNAL_AUTHENTIFICATION /* 58 */:
                if (i14 != 0) {
                    return i10;
                }
                int iDecodeVarint642 = ArrayDecoders.decodeVarint64(bArr, i10, registers);
                unsafe.putObject(t3, j10, Boolean.valueOf(registers.long1 != 0));
                unsafe.putInt(t3, j11, i13);
                return iDecodeVarint642;
            case EACTags.DYNAMIC_EXTERNAL_AUTHENTIFICATION /* 59 */:
                if (i14 != 2) {
                    return i10;
                }
                int iDecodeVarint322 = ArrayDecoders.decodeVarint32(bArr, i10, registers);
                int i22 = registers.int1;
                if (i22 == 0) {
                    unsafe.putObject(t3, j10, "");
                } else {
                    if ((i15 & 536870912) != 0 && !Utf8.isValidUtf8(bArr, iDecodeVarint322, iDecodeVarint322 + i22)) {
                        throw InvalidProtocolBufferException.invalidUtf8();
                    }
                    unsafe.putObject(t3, j10, new String(bArr, iDecodeVarint322, i22, Internal.UTF_8));
                    iDecodeVarint322 += i22;
                }
                unsafe.putInt(t3, j11, i13);
                return iDecodeVarint322;
            case 60:
                if (i14 != 2) {
                    return i10;
                }
                Object objMutableOneofMessageFieldForMerge = mutableOneofMessageFieldForMerge(t3, i13, i17);
                int iMergeMessageField = ArrayDecoders.mergeMessageField(objMutableOneofMessageFieldForMerge, getMessageFieldSchema(i17), bArr, i10, i11, registers);
                storeOneofMessageField(t3, i13, i17, objMutableOneofMessageFieldForMerge);
                return iMergeMessageField;
            case 61:
                if (i14 != 2) {
                    return i10;
                }
                int iDecodeBytes = ArrayDecoders.decodeBytes(bArr, i10, registers);
                unsafe.putObject(t3, j10, registers.object1);
                unsafe.putInt(t3, j11, i13);
                return iDecodeBytes;
            case 63:
                if (i14 != 0) {
                    return i10;
                }
                int iDecodeVarint323 = ArrayDecoders.decodeVarint32(bArr, i10, registers);
                int i23 = registers.int1;
                Internal.EnumVerifier enumFieldVerifier = getEnumFieldVerifier(i17);
                if (enumFieldVerifier != null && !enumFieldVerifier.isInRange(i23)) {
                    getMutableUnknownFields(t3).storeField(i12, Long.valueOf(i23));
                    return iDecodeVarint323;
                }
                unsafe.putObject(t3, j10, Integer.valueOf(i23));
                unsafe.putInt(t3, j11, i13);
                return iDecodeVarint323;
            case EACTags.ADDRESS /* 66 */:
                if (i14 != 0) {
                    return i10;
                }
                int iDecodeVarint324 = ArrayDecoders.decodeVarint32(bArr, i10, registers);
                unsafe.putObject(t3, j10, Integer.valueOf(CodedInputStream.decodeZigZag32(registers.int1)));
                unsafe.putInt(t3, j11, i13);
                return iDecodeVarint324;
            case EACTags.CARDHOLDER_HANDWRITTEN_SIGNATURE /* 67 */:
                if (i14 != 0) {
                    return i10;
                }
                int iDecodeVarint643 = ArrayDecoders.decodeVarint64(bArr, i10, registers);
                unsafe.putObject(t3, j10, Long.valueOf(CodedInputStream.decodeZigZag64(registers.long1)));
                unsafe.putInt(t3, j11, i13);
                return iDecodeVarint643;
            case 68:
                if (i14 == 3) {
                    Object objMutableOneofMessageFieldForMerge2 = mutableOneofMessageFieldForMerge(t3, i13, i17);
                    int iMergeGroupField = ArrayDecoders.mergeGroupField(objMutableOneofMessageFieldForMerge2, getMessageFieldSchema(i17), bArr, i10, i11, (i12 & (-8)) | 4, registers);
                    storeOneofMessageField(t3, i13, i17, objMutableOneofMessageFieldForMerge2);
                    return iMergeGroupField;
                }
                break;
        }
        return i10;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    private int parseRepeatedField(T t3, byte[] bArr, int i10, int i11, int i12, int i13, int i14, int i15, long j10, int i16, long j11, ArrayDecoders.Registers registers) throws IOException {
        int iDecodeVarint32List;
        Unsafe unsafe = UNSAFE;
        Internal.ProtobufList protobufListMutableCopyWithCapacity2 = (Internal.ProtobufList) unsafe.getObject(t3, j11);
        if (!protobufListMutableCopyWithCapacity2.isModifiable()) {
            int size = protobufListMutableCopyWithCapacity2.size();
            protobufListMutableCopyWithCapacity2 = protobufListMutableCopyWithCapacity2.mutableCopyWithCapacity2(size == 0 ? 10 : size * 2);
            unsafe.putObject(t3, j11, protobufListMutableCopyWithCapacity2);
        }
        Internal.ProtobufList protobufList = protobufListMutableCopyWithCapacity2;
        switch (i16) {
            case 18:
            case 35:
                if (i14 == 2) {
                    return ArrayDecoders.decodePackedDoubleList(bArr, i10, protobufList, registers);
                }
                if (i14 == 1) {
                    return ArrayDecoders.decodeDoubleList(i12, bArr, i10, i11, protobufList, registers);
                }
                return i10;
            case 19:
            case 36:
                if (i14 == 2) {
                    return ArrayDecoders.decodePackedFloatList(bArr, i10, protobufList, registers);
                }
                if (i14 == 5) {
                    return ArrayDecoders.decodeFloatList(i12, bArr, i10, i11, protobufList, registers);
                }
                return i10;
            case 20:
            case 21:
            case 37:
            case 38:
                if (i14 == 2) {
                    return ArrayDecoders.decodePackedVarint64List(bArr, i10, protobufList, registers);
                }
                if (i14 == 0) {
                    return ArrayDecoders.decodeVarint64List(i12, bArr, i10, i11, protobufList, registers);
                }
                return i10;
            case 22:
            case 29:
            case 39:
            case EACTags.DATE_OF_BIRTH /* 43 */:
                if (i14 == 2) {
                    return ArrayDecoders.decodePackedVarint32List(bArr, i10, protobufList, registers);
                }
                if (i14 == 0) {
                    return ArrayDecoders.decodeVarint32List(i12, bArr, i10, i11, protobufList, registers);
                }
                return i10;
            case 23:
            case 32:
            case 40:
            case 46:
                if (i14 == 2) {
                    return ArrayDecoders.decodePackedFixed64List(bArr, i10, protobufList, registers);
                }
                if (i14 == 1) {
                    return ArrayDecoders.decodeFixed64List(i12, bArr, i10, i11, protobufList, registers);
                }
                return i10;
            case 24:
            case 31:
            case 41:
            case 45:
                if (i14 == 2) {
                    return ArrayDecoders.decodePackedFixed32List(bArr, i10, protobufList, registers);
                }
                if (i14 == 5) {
                    return ArrayDecoders.decodeFixed32List(i12, bArr, i10, i11, protobufList, registers);
                }
                return i10;
            case 25:
            case 42:
                if (i14 == 2) {
                    return ArrayDecoders.decodePackedBoolList(bArr, i10, protobufList, registers);
                }
                if (i14 == 0) {
                    return ArrayDecoders.decodeBoolList(i12, bArr, i10, i11, protobufList, registers);
                }
                return i10;
            case 26:
                if (i14 == 2) {
                    return (j10 & 536870912) == 0 ? ArrayDecoders.decodeStringList(i12, bArr, i10, i11, protobufList, registers) : ArrayDecoders.decodeStringListRequireUtf8(i12, bArr, i10, i11, protobufList, registers);
                }
                return i10;
            case 27:
                if (i14 == 2) {
                    return ArrayDecoders.decodeMessageList(getMessageFieldSchema(i15), i12, bArr, i10, i11, protobufList, registers);
                }
                return i10;
            case 28:
                if (i14 == 2) {
                    return ArrayDecoders.decodeBytesList(i12, bArr, i10, i11, protobufList, registers);
                }
                return i10;
            case 30:
            case 44:
                if (i14 != 2) {
                    if (i14 == 0) {
                        iDecodeVarint32List = ArrayDecoders.decodeVarint32List(i12, bArr, i10, i11, protobufList, registers);
                    }
                    return i10;
                }
                iDecodeVarint32List = ArrayDecoders.decodePackedVarint32List(bArr, i10, protobufList, registers);
                SchemaUtil.filterUnknownEnumList((Object) t3, i13, (List<Integer>) protobufList, getEnumFieldVerifier(i15), (Object) null, (UnknownFieldSchema<UT, Object>) this.unknownFieldSchema);
                return iDecodeVarint32List;
            case 33:
            case EACTags.PIN_USAGE_POLICY /* 47 */:
                if (i14 == 2) {
                    return ArrayDecoders.decodePackedSInt32List(bArr, i10, protobufList, registers);
                }
                if (i14 == 0) {
                    return ArrayDecoders.decodeSInt32List(i12, bArr, i10, i11, protobufList, registers);
                }
                return i10;
            case 34:
            case 48:
                if (i14 == 2) {
                    return ArrayDecoders.decodePackedSInt64List(bArr, i10, protobufList, registers);
                }
                if (i14 == 0) {
                    return ArrayDecoders.decodeSInt64List(i12, bArr, i10, i11, protobufList, registers);
                }
                return i10;
            case 49:
                if (i14 == 3) {
                    return ArrayDecoders.decodeGroupList(getMessageFieldSchema(i15), i12, bArr, i10, i11, protobufList, registers);
                }
                return i10;
            default:
                return i10;
        }
    }

    private int positionForFieldNumber(int i10) {
        if (i10 < this.minFieldNumber || i10 > this.maxFieldNumber) {
            return -1;
        }
        return slowPositionForFieldNumber(i10, 0);
    }

    private int presenceMaskAndOffsetAt(int i10) {
        return this.buffer[i10 + 2];
    }

    private <E> void readGroupList(Object obj, long j10, Reader reader, Schema<E> schema, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        reader.readGroupList(this.listFieldSchema.mutableListAt(obj, j10), schema, extensionRegistryLite);
    }

    private <E> void readMessageList(Object obj, int i10, Reader reader, Schema<E> schema, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        reader.readMessageList(this.listFieldSchema.mutableListAt(obj, offset(i10)), schema, extensionRegistryLite);
    }

    private void readString(Object obj, int i10, Reader reader) throws IOException {
        if (isEnforceUtf8(i10)) {
            UnsafeUtil.putObject(obj, offset(i10), reader.readStringRequireUtf8());
        } else if (this.lite) {
            UnsafeUtil.putObject(obj, offset(i10), reader.readString());
        } else {
            UnsafeUtil.putObject(obj, offset(i10), reader.readBytes());
        }
    }

    private void readStringList(Object obj, int i10, Reader reader) throws IOException {
        if (isEnforceUtf8(i10)) {
            reader.readStringListRequireUtf8(this.listFieldSchema.mutableListAt(obj, offset(i10)));
        } else {
            reader.readStringList(this.listFieldSchema.mutableListAt(obj, offset(i10)));
        }
    }

    private static java.lang.reflect.Field reflectField(Class<?> cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (NoSuchFieldException unused) {
            java.lang.reflect.Field[] declaredFields = cls.getDeclaredFields();
            for (java.lang.reflect.Field field : declaredFields) {
                if (str.equals(field.getName())) {
                    return field;
                }
            }
            StringBuilder sbA = e.a("Field ", str, " for ");
            y0.a(cls, sbA, " not found. Known fields are ");
            sbA.append(Arrays.toString(declaredFields));
            throw new RuntimeException(sbA.toString());
        }
    }

    private void setFieldPresent(T t3, int i10) {
        int iPresenceMaskAndOffsetAt = presenceMaskAndOffsetAt(i10);
        long j10 = 1048575 & iPresenceMaskAndOffsetAt;
        if (j10 == 1048575) {
            return;
        }
        UnsafeUtil.putInt(t3, j10, (1 << (iPresenceMaskAndOffsetAt >>> 20)) | UnsafeUtil.getInt(t3, j10));
    }

    private void setOneofPresent(T t3, int i10, int i11) {
        UnsafeUtil.putInt(t3, presenceMaskAndOffsetAt(i11) & 1048575, i10);
    }

    private int slowPositionForFieldNumber(int i10, int i11) {
        int length = (this.buffer.length / 3) - 1;
        while (i11 <= length) {
            int i12 = (length + i11) >>> 1;
            int i13 = i12 * 3;
            int iNumberAt = numberAt(i13);
            if (i10 == iNumberAt) {
                return i13;
            }
            if (i10 < iNumberAt) {
                length = i12 - 1;
            } else {
                i11 = i12 + 1;
            }
        }
        return -1;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00bd  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void storeFieldData(FieldInfo fieldInfo, int[] iArr, int i10, Object[] objArr) {
        int iObjectFieldOffset;
        int iId;
        long jObjectFieldOffset;
        int iObjectFieldOffset2;
        int iNumberOfTrailingZeros;
        OneofInfo oneof = fieldInfo.getOneof();
        if (oneof == null) {
            FieldType type = fieldInfo.getType();
            iObjectFieldOffset = (int) UnsafeUtil.objectFieldOffset(fieldInfo.getField());
            iId = type.id();
            if (!type.isList() && !type.isMap()) {
                java.lang.reflect.Field presenceField = fieldInfo.getPresenceField();
                iObjectFieldOffset2 = presenceField == null ? 1048575 : (int) UnsafeUtil.objectFieldOffset(presenceField);
                iNumberOfTrailingZeros = Integer.numberOfTrailingZeros(fieldInfo.getPresenceMask());
            } else if (fieldInfo.getCachedSizeField() == null) {
                iObjectFieldOffset2 = 0;
                iNumberOfTrailingZeros = 0;
            } else {
                jObjectFieldOffset = UnsafeUtil.objectFieldOffset(fieldInfo.getCachedSizeField());
            }
            iArr[i10] = fieldInfo.getFieldNumber();
            iArr[i10 + 1] = (fieldInfo.isRequired() ? REQUIRED_MASK : 0) | (!fieldInfo.isEnforceUtf8() ? 536870912 : 0) | (iId << 20) | iObjectFieldOffset;
            iArr[i10 + 2] = iObjectFieldOffset2 | (iNumberOfTrailingZeros << 20);
            Class<?> messageFieldClass = fieldInfo.getMessageFieldClass();
            if (fieldInfo.getMapDefaultEntry() != null) {
                if (messageFieldClass != null) {
                    objArr[a1.b(i10, 3, 2, 1)] = messageFieldClass;
                    return;
                } else {
                    if (fieldInfo.getEnumVerifier() != null) {
                        objArr[a1.b(i10, 3, 2, 1)] = fieldInfo.getEnumVerifier();
                        return;
                    }
                    return;
                }
            }
            int i11 = (i10 / 3) * 2;
            objArr[i11] = fieldInfo.getMapDefaultEntry();
            if (messageFieldClass != null) {
                objArr[i11 + 1] = messageFieldClass;
                return;
            } else {
                if (fieldInfo.getEnumVerifier() != null) {
                    objArr[i11 + 1] = fieldInfo.getEnumVerifier();
                    return;
                }
                return;
            }
        }
        iId = fieldInfo.getType().id() + 51;
        iObjectFieldOffset = (int) UnsafeUtil.objectFieldOffset(oneof.getValueField());
        jObjectFieldOffset = UnsafeUtil.objectFieldOffset(oneof.getCaseField());
        iObjectFieldOffset2 = (int) jObjectFieldOffset;
        iNumberOfTrailingZeros = 0;
        iArr[i10] = fieldInfo.getFieldNumber();
        if (!fieldInfo.isEnforceUtf8()) {
        }
        iArr[i10 + 1] = (fieldInfo.isRequired() ? REQUIRED_MASK : 0) | (!fieldInfo.isEnforceUtf8() ? 536870912 : 0) | (iId << 20) | iObjectFieldOffset;
        iArr[i10 + 2] = iObjectFieldOffset2 | (iNumberOfTrailingZeros << 20);
        Class<?> messageFieldClass2 = fieldInfo.getMessageFieldClass();
        if (fieldInfo.getMapDefaultEntry() != null) {
        }
    }

    private void storeMessageField(T t3, int i10, Object obj) {
        UNSAFE.putObject(t3, offset(typeAndOffsetAt(i10)), obj);
        setFieldPresent(t3, i10);
    }

    private void storeOneofMessageField(T t3, int i10, int i11, Object obj) {
        UNSAFE.putObject(t3, offset(typeAndOffsetAt(i11)), obj);
        setOneofPresent(t3, i10, i11);
    }

    private static int type(int i10) {
        return (i10 & FIELD_TYPE_MASK) >>> 20;
    }

    private int typeAndOffsetAt(int i10) {
        return this.buffer[i10 + 1];
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void writeFieldsInAscendingOrder(T t3, Writer writer) throws IOException {
        Map.Entry<?, ?> entry;
        Iterator it;
        boolean z10;
        Map.Entry<?, ?> entry2;
        int i10;
        int i11;
        int i12;
        boolean z11;
        MessageSchema<T> messageSchema = this;
        if (messageSchema.hasExtensions) {
            FieldSet<T> extensions = messageSchema.extensionSchema.getExtensions(t3);
            if (extensions.isEmpty()) {
                entry = null;
                it = null;
            } else {
                Iterator it2 = extensions.iterator();
                entry = (Map.Entry) it2.next();
                it = it2;
            }
        }
        int length = messageSchema.buffer.length;
        Unsafe unsafe = UNSAFE;
        int i13 = 1048575;
        int i14 = 0;
        int i15 = 0;
        while (i14 < length) {
            int iTypeAndOffsetAt = messageSchema.typeAndOffsetAt(i14);
            int iNumberAt = messageSchema.numberAt(i14);
            int iType = type(iTypeAndOffsetAt);
            if (iType <= 17) {
                int i16 = messageSchema.buffer[i14 + 2];
                z10 = true;
                int i17 = i16 & 1048575;
                if (i17 != i13) {
                    i15 = i17 == 1048575 ? 0 : unsafe.getInt(t3, i17);
                    i13 = i17;
                }
                int i18 = 1 << (i16 >>> 20);
                entry2 = entry;
                i10 = i13;
                i11 = i15;
                i12 = i18;
            } else {
                z10 = true;
                entry2 = entry;
                i10 = i13;
                i11 = i15;
                i12 = 0;
            }
            while (entry2 != null && messageSchema.extensionSchema.extensionNumber(entry2) <= iNumberAt) {
                messageSchema.extensionSchema.serializeExtension(writer, entry2);
                entry2 = it.hasNext() ? (Map.Entry) it.next() : null;
            }
            long jOffset = offset(iTypeAndOffsetAt);
            switch (iType) {
                case 0:
                    if (!messageSchema.isFieldPresent(t3, i14, i10, i11, i12)) {
                        break;
                    } else {
                        writer.writeDouble(iNumberAt, doubleAt(t3, jOffset));
                        break;
                    }
                case 1:
                    if (messageSchema.isFieldPresent(t3, i14, i10, i11, i12)) {
                        writer.writeFloat(iNumberAt, floatAt(t3, jOffset));
                    }
                    messageSchema = this;
                    break;
                case 2:
                    if (messageSchema.isFieldPresent(t3, i14, i10, i11, i12)) {
                        writer.writeInt64(iNumberAt, unsafe.getLong(t3, jOffset));
                    }
                    messageSchema = this;
                    break;
                case 3:
                    if (messageSchema.isFieldPresent(t3, i14, i10, i11, i12)) {
                        writer.writeUInt64(iNumberAt, unsafe.getLong(t3, jOffset));
                    }
                    messageSchema = this;
                    break;
                case 4:
                    if (messageSchema.isFieldPresent(t3, i14, i10, i11, i12)) {
                        writer.writeInt32(iNumberAt, unsafe.getInt(t3, jOffset));
                    }
                    messageSchema = this;
                    break;
                case 5:
                    if (messageSchema.isFieldPresent(t3, i14, i10, i11, i12)) {
                        writer.writeFixed64(iNumberAt, unsafe.getLong(t3, jOffset));
                    }
                    messageSchema = this;
                    break;
                case 6:
                    if (messageSchema.isFieldPresent(t3, i14, i10, i11, i12)) {
                        writer.writeFixed32(iNumberAt, unsafe.getInt(t3, jOffset));
                    }
                    messageSchema = this;
                    break;
                case 7:
                    if (messageSchema.isFieldPresent(t3, i14, i10, i11, i12)) {
                        writer.writeBool(iNumberAt, booleanAt(t3, jOffset));
                    }
                    messageSchema = this;
                    break;
                case 8:
                    if (!messageSchema.isFieldPresent(t3, i14, i10, i11, i12)) {
                        break;
                    } else {
                        messageSchema.writeString(iNumberAt, unsafe.getObject(t3, jOffset), writer);
                        break;
                    }
                case 9:
                    if (!messageSchema.isFieldPresent(t3, i14, i10, i11, i12)) {
                        break;
                    } else {
                        writer.writeMessage(iNumberAt, unsafe.getObject(t3, jOffset), messageSchema.getMessageFieldSchema(i14));
                        break;
                    }
                case 10:
                    if (messageSchema.isFieldPresent(t3, i14, i10, i11, i12)) {
                        writer.writeBytes(iNumberAt, (ByteString) unsafe.getObject(t3, jOffset));
                    }
                    messageSchema = this;
                    break;
                case 11:
                    if (messageSchema.isFieldPresent(t3, i14, i10, i11, i12)) {
                        writer.writeUInt32(iNumberAt, unsafe.getInt(t3, jOffset));
                    }
                    messageSchema = this;
                    break;
                case 12:
                    if (messageSchema.isFieldPresent(t3, i14, i10, i11, i12)) {
                        writer.writeEnum(iNumberAt, unsafe.getInt(t3, jOffset));
                    }
                    messageSchema = this;
                    break;
                case 13:
                    if (messageSchema.isFieldPresent(t3, i14, i10, i11, i12)) {
                        writer.writeSFixed32(iNumberAt, unsafe.getInt(t3, jOffset));
                    }
                    messageSchema = this;
                    break;
                case 14:
                    if (messageSchema.isFieldPresent(t3, i14, i10, i11, i12)) {
                        writer.writeSFixed64(iNumberAt, unsafe.getLong(t3, jOffset));
                    }
                    messageSchema = this;
                    break;
                case 15:
                    if (messageSchema.isFieldPresent(t3, i14, i10, i11, i12)) {
                        writer.writeSInt32(iNumberAt, unsafe.getInt(t3, jOffset));
                    }
                    messageSchema = this;
                    break;
                case 16:
                    if (messageSchema.isFieldPresent(t3, i14, i10, i11, i12)) {
                        writer.writeSInt64(iNumberAt, unsafe.getLong(t3, jOffset));
                    }
                    messageSchema = this;
                    break;
                case 17:
                    if (!messageSchema.isFieldPresent(t3, i14, i10, i11, i12)) {
                        break;
                    } else {
                        writer.writeGroup(iNumberAt, unsafe.getObject(t3, jOffset), messageSchema.getMessageFieldSchema(i14));
                        break;
                    }
                case 18:
                    SchemaUtil.writeDoubleList(messageSchema.numberAt(i14), (List) unsafe.getObject(t3, jOffset), writer, false);
                    break;
                case 19:
                    SchemaUtil.writeFloatList(messageSchema.numberAt(i14), (List) unsafe.getObject(t3, jOffset), writer, false);
                    break;
                case 20:
                    SchemaUtil.writeInt64List(messageSchema.numberAt(i14), (List) unsafe.getObject(t3, jOffset), writer, false);
                    break;
                case 21:
                    SchemaUtil.writeUInt64List(messageSchema.numberAt(i14), (List) unsafe.getObject(t3, jOffset), writer, false);
                    break;
                case 22:
                    SchemaUtil.writeInt32List(messageSchema.numberAt(i14), (List) unsafe.getObject(t3, jOffset), writer, false);
                    break;
                case 23:
                    SchemaUtil.writeFixed64List(messageSchema.numberAt(i14), (List) unsafe.getObject(t3, jOffset), writer, false);
                    break;
                case 24:
                    SchemaUtil.writeFixed32List(messageSchema.numberAt(i14), (List) unsafe.getObject(t3, jOffset), writer, false);
                    break;
                case 25:
                    SchemaUtil.writeBoolList(messageSchema.numberAt(i14), (List) unsafe.getObject(t3, jOffset), writer, false);
                    break;
                case 26:
                    SchemaUtil.writeStringList(messageSchema.numberAt(i14), (List) unsafe.getObject(t3, jOffset), writer);
                    break;
                case 27:
                    SchemaUtil.writeMessageList(messageSchema.numberAt(i14), (List) unsafe.getObject(t3, jOffset), writer, messageSchema.getMessageFieldSchema(i14));
                    break;
                case 28:
                    SchemaUtil.writeBytesList(messageSchema.numberAt(i14), (List) unsafe.getObject(t3, jOffset), writer);
                    break;
                case 29:
                    z11 = false;
                    SchemaUtil.writeUInt32List(messageSchema.numberAt(i14), (List) unsafe.getObject(t3, jOffset), writer, false);
                    break;
                case 30:
                    z11 = false;
                    SchemaUtil.writeEnumList(messageSchema.numberAt(i14), (List) unsafe.getObject(t3, jOffset), writer, false);
                    break;
                case 31:
                    z11 = false;
                    SchemaUtil.writeSFixed32List(messageSchema.numberAt(i14), (List) unsafe.getObject(t3, jOffset), writer, false);
                    break;
                case 32:
                    z11 = false;
                    SchemaUtil.writeSFixed64List(messageSchema.numberAt(i14), (List) unsafe.getObject(t3, jOffset), writer, false);
                    break;
                case 33:
                    z11 = false;
                    SchemaUtil.writeSInt32List(messageSchema.numberAt(i14), (List) unsafe.getObject(t3, jOffset), writer, false);
                    break;
                case 34:
                    z11 = false;
                    SchemaUtil.writeSInt64List(messageSchema.numberAt(i14), (List) unsafe.getObject(t3, jOffset), writer, false);
                    break;
                case 35:
                    SchemaUtil.writeDoubleList(messageSchema.numberAt(i14), (List) unsafe.getObject(t3, jOffset), writer, z10);
                    break;
                case 36:
                    SchemaUtil.writeFloatList(messageSchema.numberAt(i14), (List) unsafe.getObject(t3, jOffset), writer, z10);
                    break;
                case 37:
                    SchemaUtil.writeInt64List(messageSchema.numberAt(i14), (List) unsafe.getObject(t3, jOffset), writer, z10);
                    break;
                case 38:
                    SchemaUtil.writeUInt64List(messageSchema.numberAt(i14), (List) unsafe.getObject(t3, jOffset), writer, z10);
                    break;
                case 39:
                    SchemaUtil.writeInt32List(messageSchema.numberAt(i14), (List) unsafe.getObject(t3, jOffset), writer, z10);
                    break;
                case 40:
                    SchemaUtil.writeFixed64List(messageSchema.numberAt(i14), (List) unsafe.getObject(t3, jOffset), writer, z10);
                    break;
                case 41:
                    SchemaUtil.writeFixed32List(messageSchema.numberAt(i14), (List) unsafe.getObject(t3, jOffset), writer, z10);
                    break;
                case 42:
                    SchemaUtil.writeBoolList(messageSchema.numberAt(i14), (List) unsafe.getObject(t3, jOffset), writer, z10);
                    break;
                case EACTags.DATE_OF_BIRTH /* 43 */:
                    SchemaUtil.writeUInt32List(messageSchema.numberAt(i14), (List) unsafe.getObject(t3, jOffset), writer, z10);
                    break;
                case 44:
                    SchemaUtil.writeEnumList(messageSchema.numberAt(i14), (List) unsafe.getObject(t3, jOffset), writer, z10);
                    break;
                case 45:
                    SchemaUtil.writeSFixed32List(messageSchema.numberAt(i14), (List) unsafe.getObject(t3, jOffset), writer, z10);
                    break;
                case 46:
                    SchemaUtil.writeSFixed64List(messageSchema.numberAt(i14), (List) unsafe.getObject(t3, jOffset), writer, z10);
                    break;
                case EACTags.PIN_USAGE_POLICY /* 47 */:
                    SchemaUtil.writeSInt32List(messageSchema.numberAt(i14), (List) unsafe.getObject(t3, jOffset), writer, z10);
                    break;
                case 48:
                    SchemaUtil.writeSInt64List(messageSchema.numberAt(i14), (List) unsafe.getObject(t3, jOffset), writer, z10);
                    break;
                case 49:
                    SchemaUtil.writeGroupList(messageSchema.numberAt(i14), (List) unsafe.getObject(t3, jOffset), writer, messageSchema.getMessageFieldSchema(i14));
                    break;
                case 50:
                    messageSchema.writeMapHelper(writer, iNumberAt, unsafe.getObject(t3, jOffset), i14);
                    break;
                case 51:
                    if (messageSchema.isOneofPresent(t3, iNumberAt, i14)) {
                        writer.writeDouble(iNumberAt, oneofDoubleAt(t3, jOffset));
                    }
                    break;
                case 52:
                    if (messageSchema.isOneofPresent(t3, iNumberAt, i14)) {
                        writer.writeFloat(iNumberAt, oneofFloatAt(t3, jOffset));
                    }
                    break;
                case EACTags.SEX /* 53 */:
                    if (messageSchema.isOneofPresent(t3, iNumberAt, i14)) {
                        writer.writeInt64(iNumberAt, oneofLongAt(t3, jOffset));
                    }
                    break;
                case EACTags.CURRENCY_EXPONENT /* 54 */:
                    if (messageSchema.isOneofPresent(t3, iNumberAt, i14)) {
                        writer.writeUInt64(iNumberAt, oneofLongAt(t3, jOffset));
                    }
                    break;
                case 55:
                    if (messageSchema.isOneofPresent(t3, iNumberAt, i14)) {
                        writer.writeInt32(iNumberAt, oneofIntAt(t3, jOffset));
                    }
                    break;
                case 56:
                    if (messageSchema.isOneofPresent(t3, iNumberAt, i14)) {
                        writer.writeFixed64(iNumberAt, oneofLongAt(t3, jOffset));
                    }
                    break;
                case 57:
                    if (messageSchema.isOneofPresent(t3, iNumberAt, i14)) {
                        writer.writeFixed32(iNumberAt, oneofIntAt(t3, jOffset));
                    }
                    break;
                case EACTags.DYNAMIC_INTERNAL_AUTHENTIFICATION /* 58 */:
                    if (messageSchema.isOneofPresent(t3, iNumberAt, i14)) {
                        writer.writeBool(iNumberAt, oneofBooleanAt(t3, jOffset));
                    }
                    break;
                case EACTags.DYNAMIC_EXTERNAL_AUTHENTIFICATION /* 59 */:
                    if (messageSchema.isOneofPresent(t3, iNumberAt, i14)) {
                        messageSchema.writeString(iNumberAt, unsafe.getObject(t3, jOffset), writer);
                    }
                    break;
                case 60:
                    if (messageSchema.isOneofPresent(t3, iNumberAt, i14)) {
                        writer.writeMessage(iNumberAt, unsafe.getObject(t3, jOffset), messageSchema.getMessageFieldSchema(i14));
                    }
                    break;
                case 61:
                    if (messageSchema.isOneofPresent(t3, iNumberAt, i14)) {
                        writer.writeBytes(iNumberAt, (ByteString) unsafe.getObject(t3, jOffset));
                    }
                    break;
                case 62:
                    if (messageSchema.isOneofPresent(t3, iNumberAt, i14)) {
                        writer.writeUInt32(iNumberAt, oneofIntAt(t3, jOffset));
                    }
                    break;
                case 63:
                    if (messageSchema.isOneofPresent(t3, iNumberAt, i14)) {
                        writer.writeEnum(iNumberAt, oneofIntAt(t3, jOffset));
                    }
                    break;
                case 64:
                    if (messageSchema.isOneofPresent(t3, iNumberAt, i14)) {
                        writer.writeSFixed32(iNumberAt, oneofIntAt(t3, jOffset));
                    }
                    break;
                case EACTags.ELEMENT_LIST /* 65 */:
                    if (messageSchema.isOneofPresent(t3, iNumberAt, i14)) {
                        writer.writeSFixed64(iNumberAt, oneofLongAt(t3, jOffset));
                    }
                    break;
                case EACTags.ADDRESS /* 66 */:
                    if (messageSchema.isOneofPresent(t3, iNumberAt, i14)) {
                        writer.writeSInt32(iNumberAt, oneofIntAt(t3, jOffset));
                    }
                    break;
                case EACTags.CARDHOLDER_HANDWRITTEN_SIGNATURE /* 67 */:
                    if (messageSchema.isOneofPresent(t3, iNumberAt, i14)) {
                        writer.writeSInt64(iNumberAt, oneofLongAt(t3, jOffset));
                    }
                    break;
                case 68:
                    if (messageSchema.isOneofPresent(t3, iNumberAt, i14)) {
                        writer.writeGroup(iNumberAt, unsafe.getObject(t3, jOffset), messageSchema.getMessageFieldSchema(i14));
                    }
                    break;
            }
            i14 += 3;
            i15 = i11;
            i13 = i10;
            entry = entry2;
        }
        while (entry != null) {
            messageSchema.extensionSchema.serializeExtension(writer, entry);
            entry = it.hasNext() ? (Map.Entry) it.next() : null;
        }
        messageSchema.writeUnknownInMessageTo(messageSchema.unknownFieldSchema, t3, writer);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void writeFieldsInDescendingOrder(T t3, Writer writer) throws IOException {
        Iterator itDescendingIterator;
        Map.Entry<?, ?> entry;
        writeUnknownInMessageTo(this.unknownFieldSchema, t3, writer);
        if (this.hasExtensions) {
            FieldSet<T> extensions = this.extensionSchema.getExtensions(t3);
            if (extensions.isEmpty()) {
                itDescendingIterator = null;
                entry = null;
            } else {
                itDescendingIterator = extensions.descendingIterator();
                entry = (Map.Entry) itDescendingIterator.next();
            }
        }
        for (int length = this.buffer.length - 3; length >= 0; length -= 3) {
            int iTypeAndOffsetAt = typeAndOffsetAt(length);
            int iNumberAt = numberAt(length);
            while (entry != null && this.extensionSchema.extensionNumber(entry) > iNumberAt) {
                this.extensionSchema.serializeExtension(writer, entry);
                entry = itDescendingIterator.hasNext() ? (Map.Entry) itDescendingIterator.next() : null;
            }
            switch (type(iTypeAndOffsetAt)) {
                case 0:
                    if (isFieldPresent(t3, length)) {
                        writer.writeDouble(iNumberAt, doubleAt(t3, offset(iTypeAndOffsetAt)));
                        break;
                    } else {
                        break;
                    }
                case 1:
                    if (isFieldPresent(t3, length)) {
                        writer.writeFloat(iNumberAt, floatAt(t3, offset(iTypeAndOffsetAt)));
                        break;
                    } else {
                        break;
                    }
                case 2:
                    if (isFieldPresent(t3, length)) {
                        writer.writeInt64(iNumberAt, longAt(t3, offset(iTypeAndOffsetAt)));
                        break;
                    } else {
                        break;
                    }
                case 3:
                    if (isFieldPresent(t3, length)) {
                        writer.writeUInt64(iNumberAt, longAt(t3, offset(iTypeAndOffsetAt)));
                        break;
                    } else {
                        break;
                    }
                case 4:
                    if (isFieldPresent(t3, length)) {
                        writer.writeInt32(iNumberAt, intAt(t3, offset(iTypeAndOffsetAt)));
                        break;
                    } else {
                        break;
                    }
                case 5:
                    if (isFieldPresent(t3, length)) {
                        writer.writeFixed64(iNumberAt, longAt(t3, offset(iTypeAndOffsetAt)));
                        break;
                    } else {
                        break;
                    }
                case 6:
                    if (isFieldPresent(t3, length)) {
                        writer.writeFixed32(iNumberAt, intAt(t3, offset(iTypeAndOffsetAt)));
                        break;
                    } else {
                        break;
                    }
                case 7:
                    if (isFieldPresent(t3, length)) {
                        writer.writeBool(iNumberAt, booleanAt(t3, offset(iTypeAndOffsetAt)));
                        break;
                    } else {
                        break;
                    }
                case 8:
                    if (isFieldPresent(t3, length)) {
                        writeString(iNumberAt, UnsafeUtil.getObject(t3, offset(iTypeAndOffsetAt)), writer);
                        break;
                    } else {
                        break;
                    }
                case 9:
                    if (isFieldPresent(t3, length)) {
                        writer.writeMessage(iNumberAt, UnsafeUtil.getObject(t3, offset(iTypeAndOffsetAt)), getMessageFieldSchema(length));
                        break;
                    } else {
                        break;
                    }
                case 10:
                    if (isFieldPresent(t3, length)) {
                        writer.writeBytes(iNumberAt, (ByteString) UnsafeUtil.getObject(t3, offset(iTypeAndOffsetAt)));
                        break;
                    } else {
                        break;
                    }
                case 11:
                    if (isFieldPresent(t3, length)) {
                        writer.writeUInt32(iNumberAt, intAt(t3, offset(iTypeAndOffsetAt)));
                        break;
                    } else {
                        break;
                    }
                case 12:
                    if (isFieldPresent(t3, length)) {
                        writer.writeEnum(iNumberAt, intAt(t3, offset(iTypeAndOffsetAt)));
                        break;
                    } else {
                        break;
                    }
                case 13:
                    if (isFieldPresent(t3, length)) {
                        writer.writeSFixed32(iNumberAt, intAt(t3, offset(iTypeAndOffsetAt)));
                        break;
                    } else {
                        break;
                    }
                case 14:
                    if (isFieldPresent(t3, length)) {
                        writer.writeSFixed64(iNumberAt, longAt(t3, offset(iTypeAndOffsetAt)));
                        break;
                    } else {
                        break;
                    }
                case 15:
                    if (isFieldPresent(t3, length)) {
                        writer.writeSInt32(iNumberAt, intAt(t3, offset(iTypeAndOffsetAt)));
                        break;
                    } else {
                        break;
                    }
                case 16:
                    if (isFieldPresent(t3, length)) {
                        writer.writeSInt64(iNumberAt, longAt(t3, offset(iTypeAndOffsetAt)));
                        break;
                    } else {
                        break;
                    }
                case 17:
                    if (isFieldPresent(t3, length)) {
                        writer.writeGroup(iNumberAt, UnsafeUtil.getObject(t3, offset(iTypeAndOffsetAt)), getMessageFieldSchema(length));
                        break;
                    } else {
                        break;
                    }
                case 18:
                    SchemaUtil.writeDoubleList(numberAt(length), (List) UnsafeUtil.getObject(t3, offset(iTypeAndOffsetAt)), writer, false);
                    break;
                case 19:
                    SchemaUtil.writeFloatList(numberAt(length), (List) UnsafeUtil.getObject(t3, offset(iTypeAndOffsetAt)), writer, false);
                    break;
                case 20:
                    SchemaUtil.writeInt64List(numberAt(length), (List) UnsafeUtil.getObject(t3, offset(iTypeAndOffsetAt)), writer, false);
                    break;
                case 21:
                    SchemaUtil.writeUInt64List(numberAt(length), (List) UnsafeUtil.getObject(t3, offset(iTypeAndOffsetAt)), writer, false);
                    break;
                case 22:
                    SchemaUtil.writeInt32List(numberAt(length), (List) UnsafeUtil.getObject(t3, offset(iTypeAndOffsetAt)), writer, false);
                    break;
                case 23:
                    SchemaUtil.writeFixed64List(numberAt(length), (List) UnsafeUtil.getObject(t3, offset(iTypeAndOffsetAt)), writer, false);
                    break;
                case 24:
                    SchemaUtil.writeFixed32List(numberAt(length), (List) UnsafeUtil.getObject(t3, offset(iTypeAndOffsetAt)), writer, false);
                    break;
                case 25:
                    SchemaUtil.writeBoolList(numberAt(length), (List) UnsafeUtil.getObject(t3, offset(iTypeAndOffsetAt)), writer, false);
                    break;
                case 26:
                    SchemaUtil.writeStringList(numberAt(length), (List) UnsafeUtil.getObject(t3, offset(iTypeAndOffsetAt)), writer);
                    break;
                case 27:
                    SchemaUtil.writeMessageList(numberAt(length), (List) UnsafeUtil.getObject(t3, offset(iTypeAndOffsetAt)), writer, getMessageFieldSchema(length));
                    break;
                case 28:
                    SchemaUtil.writeBytesList(numberAt(length), (List) UnsafeUtil.getObject(t3, offset(iTypeAndOffsetAt)), writer);
                    break;
                case 29:
                    SchemaUtil.writeUInt32List(numberAt(length), (List) UnsafeUtil.getObject(t3, offset(iTypeAndOffsetAt)), writer, false);
                    break;
                case 30:
                    SchemaUtil.writeEnumList(numberAt(length), (List) UnsafeUtil.getObject(t3, offset(iTypeAndOffsetAt)), writer, false);
                    break;
                case 31:
                    SchemaUtil.writeSFixed32List(numberAt(length), (List) UnsafeUtil.getObject(t3, offset(iTypeAndOffsetAt)), writer, false);
                    break;
                case 32:
                    SchemaUtil.writeSFixed64List(numberAt(length), (List) UnsafeUtil.getObject(t3, offset(iTypeAndOffsetAt)), writer, false);
                    break;
                case 33:
                    SchemaUtil.writeSInt32List(numberAt(length), (List) UnsafeUtil.getObject(t3, offset(iTypeAndOffsetAt)), writer, false);
                    break;
                case 34:
                    SchemaUtil.writeSInt64List(numberAt(length), (List) UnsafeUtil.getObject(t3, offset(iTypeAndOffsetAt)), writer, false);
                    break;
                case 35:
                    SchemaUtil.writeDoubleList(numberAt(length), (List) UnsafeUtil.getObject(t3, offset(iTypeAndOffsetAt)), writer, true);
                    break;
                case 36:
                    SchemaUtil.writeFloatList(numberAt(length), (List) UnsafeUtil.getObject(t3, offset(iTypeAndOffsetAt)), writer, true);
                    break;
                case 37:
                    SchemaUtil.writeInt64List(numberAt(length), (List) UnsafeUtil.getObject(t3, offset(iTypeAndOffsetAt)), writer, true);
                    break;
                case 38:
                    SchemaUtil.writeUInt64List(numberAt(length), (List) UnsafeUtil.getObject(t3, offset(iTypeAndOffsetAt)), writer, true);
                    break;
                case 39:
                    SchemaUtil.writeInt32List(numberAt(length), (List) UnsafeUtil.getObject(t3, offset(iTypeAndOffsetAt)), writer, true);
                    break;
                case 40:
                    SchemaUtil.writeFixed64List(numberAt(length), (List) UnsafeUtil.getObject(t3, offset(iTypeAndOffsetAt)), writer, true);
                    break;
                case 41:
                    SchemaUtil.writeFixed32List(numberAt(length), (List) UnsafeUtil.getObject(t3, offset(iTypeAndOffsetAt)), writer, true);
                    break;
                case 42:
                    SchemaUtil.writeBoolList(numberAt(length), (List) UnsafeUtil.getObject(t3, offset(iTypeAndOffsetAt)), writer, true);
                    break;
                case EACTags.DATE_OF_BIRTH /* 43 */:
                    SchemaUtil.writeUInt32List(numberAt(length), (List) UnsafeUtil.getObject(t3, offset(iTypeAndOffsetAt)), writer, true);
                    break;
                case 44:
                    SchemaUtil.writeEnumList(numberAt(length), (List) UnsafeUtil.getObject(t3, offset(iTypeAndOffsetAt)), writer, true);
                    break;
                case 45:
                    SchemaUtil.writeSFixed32List(numberAt(length), (List) UnsafeUtil.getObject(t3, offset(iTypeAndOffsetAt)), writer, true);
                    break;
                case 46:
                    SchemaUtil.writeSFixed64List(numberAt(length), (List) UnsafeUtil.getObject(t3, offset(iTypeAndOffsetAt)), writer, true);
                    break;
                case EACTags.PIN_USAGE_POLICY /* 47 */:
                    SchemaUtil.writeSInt32List(numberAt(length), (List) UnsafeUtil.getObject(t3, offset(iTypeAndOffsetAt)), writer, true);
                    break;
                case 48:
                    SchemaUtil.writeSInt64List(numberAt(length), (List) UnsafeUtil.getObject(t3, offset(iTypeAndOffsetAt)), writer, true);
                    break;
                case 49:
                    SchemaUtil.writeGroupList(numberAt(length), (List) UnsafeUtil.getObject(t3, offset(iTypeAndOffsetAt)), writer, getMessageFieldSchema(length));
                    break;
                case 50:
                    writeMapHelper(writer, iNumberAt, UnsafeUtil.getObject(t3, offset(iTypeAndOffsetAt)), length);
                    break;
                case 51:
                    if (isOneofPresent(t3, iNumberAt, length)) {
                        writer.writeDouble(iNumberAt, oneofDoubleAt(t3, offset(iTypeAndOffsetAt)));
                        break;
                    } else {
                        break;
                    }
                case 52:
                    if (isOneofPresent(t3, iNumberAt, length)) {
                        writer.writeFloat(iNumberAt, oneofFloatAt(t3, offset(iTypeAndOffsetAt)));
                        break;
                    } else {
                        break;
                    }
                case EACTags.SEX /* 53 */:
                    if (isOneofPresent(t3, iNumberAt, length)) {
                        writer.writeInt64(iNumberAt, oneofLongAt(t3, offset(iTypeAndOffsetAt)));
                        break;
                    } else {
                        break;
                    }
                case EACTags.CURRENCY_EXPONENT /* 54 */:
                    if (isOneofPresent(t3, iNumberAt, length)) {
                        writer.writeUInt64(iNumberAt, oneofLongAt(t3, offset(iTypeAndOffsetAt)));
                        break;
                    } else {
                        break;
                    }
                case 55:
                    if (isOneofPresent(t3, iNumberAt, length)) {
                        writer.writeInt32(iNumberAt, oneofIntAt(t3, offset(iTypeAndOffsetAt)));
                        break;
                    } else {
                        break;
                    }
                case 56:
                    if (isOneofPresent(t3, iNumberAt, length)) {
                        writer.writeFixed64(iNumberAt, oneofLongAt(t3, offset(iTypeAndOffsetAt)));
                        break;
                    } else {
                        break;
                    }
                case 57:
                    if (isOneofPresent(t3, iNumberAt, length)) {
                        writer.writeFixed32(iNumberAt, oneofIntAt(t3, offset(iTypeAndOffsetAt)));
                        break;
                    } else {
                        break;
                    }
                case EACTags.DYNAMIC_INTERNAL_AUTHENTIFICATION /* 58 */:
                    if (isOneofPresent(t3, iNumberAt, length)) {
                        writer.writeBool(iNumberAt, oneofBooleanAt(t3, offset(iTypeAndOffsetAt)));
                        break;
                    } else {
                        break;
                    }
                case EACTags.DYNAMIC_EXTERNAL_AUTHENTIFICATION /* 59 */:
                    if (isOneofPresent(t3, iNumberAt, length)) {
                        writeString(iNumberAt, UnsafeUtil.getObject(t3, offset(iTypeAndOffsetAt)), writer);
                        break;
                    } else {
                        break;
                    }
                case 60:
                    if (isOneofPresent(t3, iNumberAt, length)) {
                        writer.writeMessage(iNumberAt, UnsafeUtil.getObject(t3, offset(iTypeAndOffsetAt)), getMessageFieldSchema(length));
                        break;
                    } else {
                        break;
                    }
                case 61:
                    if (isOneofPresent(t3, iNumberAt, length)) {
                        writer.writeBytes(iNumberAt, (ByteString) UnsafeUtil.getObject(t3, offset(iTypeAndOffsetAt)));
                        break;
                    } else {
                        break;
                    }
                case 62:
                    if (isOneofPresent(t3, iNumberAt, length)) {
                        writer.writeUInt32(iNumberAt, oneofIntAt(t3, offset(iTypeAndOffsetAt)));
                        break;
                    } else {
                        break;
                    }
                case 63:
                    if (isOneofPresent(t3, iNumberAt, length)) {
                        writer.writeEnum(iNumberAt, oneofIntAt(t3, offset(iTypeAndOffsetAt)));
                        break;
                    } else {
                        break;
                    }
                case 64:
                    if (isOneofPresent(t3, iNumberAt, length)) {
                        writer.writeSFixed32(iNumberAt, oneofIntAt(t3, offset(iTypeAndOffsetAt)));
                        break;
                    } else {
                        break;
                    }
                case EACTags.ELEMENT_LIST /* 65 */:
                    if (isOneofPresent(t3, iNumberAt, length)) {
                        writer.writeSFixed64(iNumberAt, oneofLongAt(t3, offset(iTypeAndOffsetAt)));
                        break;
                    } else {
                        break;
                    }
                case EACTags.ADDRESS /* 66 */:
                    if (isOneofPresent(t3, iNumberAt, length)) {
                        writer.writeSInt32(iNumberAt, oneofIntAt(t3, offset(iTypeAndOffsetAt)));
                        break;
                    } else {
                        break;
                    }
                case EACTags.CARDHOLDER_HANDWRITTEN_SIGNATURE /* 67 */:
                    if (isOneofPresent(t3, iNumberAt, length)) {
                        writer.writeSInt64(iNumberAt, oneofLongAt(t3, offset(iTypeAndOffsetAt)));
                        break;
                    } else {
                        break;
                    }
                case 68:
                    if (isOneofPresent(t3, iNumberAt, length)) {
                        writer.writeGroup(iNumberAt, UnsafeUtil.getObject(t3, offset(iTypeAndOffsetAt)), getMessageFieldSchema(length));
                        break;
                    } else {
                        break;
                    }
            }
        }
        while (entry != null) {
            this.extensionSchema.serializeExtension(writer, entry);
            entry = itDescendingIterator.hasNext() ? (Map.Entry) itDescendingIterator.next() : null;
        }
    }

    private <K, V> void writeMapHelper(Writer writer, int i10, Object obj, int i11) throws IOException {
        if (obj != null) {
            writer.writeMap(i10, this.mapFieldSchema.forMapMetadata(getMapFieldDefaultEntry(i11)), this.mapFieldSchema.forMapData(obj));
        }
    }

    private void writeString(int i10, Object obj, Writer writer) throws IOException {
        if (obj instanceof String) {
            writer.writeString(i10, (String) obj);
        } else {
            writer.writeBytes(i10, (ByteString) obj);
        }
    }

    private <UT, UB> void writeUnknownInMessageTo(UnknownFieldSchema<UT, UB> unknownFieldSchema, T t3, Writer writer) throws IOException {
        unknownFieldSchema.writeTo(unknownFieldSchema.getFromMessage(t3), writer);
    }

    @Override // com.google.protobuf.Schema
    public boolean equals(T t3, T t10) {
        int length = this.buffer.length;
        for (int i10 = 0; i10 < length; i10 += 3) {
            if (!equals(t3, t10, i10)) {
                return false;
            }
        }
        if (!this.unknownFieldSchema.getFromMessage(t3).equals(this.unknownFieldSchema.getFromMessage(t10))) {
            return false;
        }
        if (this.hasExtensions) {
            return this.extensionSchema.getExtensions(t3).equals(this.extensionSchema.getExtensions(t10));
        }
        return true;
    }

    public int getSchemaSize() {
        return this.buffer.length * 3;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:251:0x0559 A[PHI: r0 r1
      0x0559: PHI (r0v2 com.google.protobuf.MessageSchema<T>) = 
      (r0v1 com.google.protobuf.MessageSchema<T>)
      (r0v1 com.google.protobuf.MessageSchema<T>)
      (r0v1 com.google.protobuf.MessageSchema<T>)
      (r0v26 com.google.protobuf.MessageSchema<T>)
      (r0v32 com.google.protobuf.MessageSchema<T>)
      (r0v1 com.google.protobuf.MessageSchema<T>)
      (r0v1 com.google.protobuf.MessageSchema<T>)
      (r0v1 com.google.protobuf.MessageSchema<T>)
      (r0v1 com.google.protobuf.MessageSchema<T>)
      (r0v1 com.google.protobuf.MessageSchema<T>)
      (r0v1 com.google.protobuf.MessageSchema<T>)
      (r0v1 com.google.protobuf.MessageSchema<T>)
      (r0v1 com.google.protobuf.MessageSchema<T>)
      (r0v1 com.google.protobuf.MessageSchema<T>)
      (r0v1 com.google.protobuf.MessageSchema<T>)
      (r0v1 com.google.protobuf.MessageSchema<T>)
      (r0v1 com.google.protobuf.MessageSchema<T>)
      (r0v1 com.google.protobuf.MessageSchema<T>)
      (r0v1 com.google.protobuf.MessageSchema<T>)
      (r0v1 com.google.protobuf.MessageSchema<T>)
      (r0v1 com.google.protobuf.MessageSchema<T>)
      (r0v1 com.google.protobuf.MessageSchema<T>)
      (r0v1 com.google.protobuf.MessageSchema<T>)
      (r0v1 com.google.protobuf.MessageSchema<T>)
      (r0v1 com.google.protobuf.MessageSchema<T>)
      (r0v1 com.google.protobuf.MessageSchema<T>)
      (r0v1 com.google.protobuf.MessageSchema<T>)
      (r0v1 com.google.protobuf.MessageSchema<T>)
      (r0v1 com.google.protobuf.MessageSchema<T>)
      (r0v1 com.google.protobuf.MessageSchema<T>)
      (r0v1 com.google.protobuf.MessageSchema<T>)
      (r0v1 com.google.protobuf.MessageSchema<T>)
      (r0v1 com.google.protobuf.MessageSchema<T>)
      (r0v1 com.google.protobuf.MessageSchema<T>)
      (r0v1 com.google.protobuf.MessageSchema<T>)
      (r0v1 com.google.protobuf.MessageSchema<T>)
      (r0v1 com.google.protobuf.MessageSchema<T>)
      (r0v1 com.google.protobuf.MessageSchema<T>)
     binds: [B:22:0x005b, B:249:0x054f, B:218:0x04b0, B:204:0x0467, B:196:0x0440, B:189:0x0419, B:166:0x0330, B:160:0x0312, B:154:0x02f4, B:148:0x02d6, B:142:0x02b8, B:136:0x029a, B:130:0x027c, B:124:0x025e, B:118:0x0240, B:112:0x0223, B:106:0x0206, B:100:0x01e9, B:94:0x01cc, B:87:0x01aa, B:82:0x0176, B:79:0x016a, B:76:0x015a, B:73:0x014a, B:70:0x013a, B:67:0x012e, B:64:0x0122, B:61:0x0115, B:54:0x00f5, B:50:0x00df, B:47:0x00ce, B:44:0x00bf, B:41:0x00b0, B:38:0x00a5, B:35:0x009a, B:32:0x008b, B:29:0x007c, B:25:0x0064] A[DONT_GENERATE, DONT_INLINE]
      0x0559: PHI (r1v4 T) = 
      (r1v1 T)
      (r1v1 T)
      (r1v1 T)
      (r1v5 T)
      (r1v1 T)
      (r1v1 T)
      (r1v1 T)
      (r1v1 T)
      (r1v1 T)
      (r1v1 T)
      (r1v1 T)
      (r1v1 T)
      (r1v1 T)
      (r1v1 T)
      (r1v1 T)
      (r1v1 T)
      (r1v1 T)
      (r1v1 T)
      (r1v1 T)
      (r1v1 T)
      (r1v1 T)
      (r1v1 T)
      (r1v1 T)
      (r1v1 T)
      (r1v1 T)
      (r1v1 T)
      (r1v1 T)
      (r1v1 T)
      (r1v1 T)
      (r1v1 T)
      (r1v1 T)
      (r1v1 T)
      (r1v1 T)
      (r1v1 T)
      (r1v1 T)
      (r1v1 T)
      (r1v1 T)
      (r1v1 T)
     binds: [B:22:0x005b, B:249:0x054f, B:218:0x04b0, B:204:0x0467, B:196:0x0440, B:189:0x0419, B:166:0x0330, B:160:0x0312, B:154:0x02f4, B:148:0x02d6, B:142:0x02b8, B:136:0x029a, B:130:0x027c, B:124:0x025e, B:118:0x0240, B:112:0x0223, B:106:0x0206, B:100:0x01e9, B:94:0x01cc, B:87:0x01aa, B:82:0x0176, B:79:0x016a, B:76:0x015a, B:73:0x014a, B:70:0x013a, B:67:0x012e, B:64:0x0122, B:61:0x0115, B:54:0x00f5, B:50:0x00df, B:47:0x00ce, B:44:0x00bf, B:41:0x00b0, B:38:0x00a5, B:35:0x009a, B:32:0x008b, B:29:0x007c, B:25:0x0064] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // com.google.protobuf.Schema
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public int getSerializedSize(T t3) {
        int i10;
        int iComputeDoubleSize;
        int iComputeFloatSize;
        int iComputeInt64Size;
        int iComputeSizeMessage;
        int iComputeSizeFixed64ListNoTag;
        int iComputeTagSize;
        int iComputeUInt32SizeNoTag;
        MessageSchema<T> messageSchema = this;
        T t10 = t3;
        Unsafe unsafe = UNSAFE;
        int i11 = 1048575;
        int i12 = 0;
        int i13 = 0;
        int iComputeBytesSize = 0;
        int i14 = 1048575;
        while (i12 < messageSchema.buffer.length) {
            int iTypeAndOffsetAt = messageSchema.typeAndOffsetAt(i12);
            int iType = type(iTypeAndOffsetAt);
            int iNumberAt = messageSchema.numberAt(i12);
            int i15 = messageSchema.buffer[i12 + 2];
            int i16 = i15 & i11;
            if (iType <= 17) {
                if (i16 != i14) {
                    i13 = i16 == i11 ? 0 : unsafe.getInt(t10, i16);
                    i14 = i16;
                }
                i10 = 1 << (i15 >>> 20);
            } else {
                i10 = 0;
            }
            int i17 = iComputeBytesSize;
            long jOffset = offset(iTypeAndOffsetAt);
            if (iType < FieldType.DOUBLE_LIST_PACKED.id() || iType > FieldType.SINT64_LIST_PACKED.id()) {
                i16 = 0;
            }
            switch (iType) {
                case 0:
                    if (messageSchema.isFieldPresent(t10, i12, i14, i13, i10)) {
                        iComputeDoubleSize = CodedOutputStream.computeDoubleSize(iNumberAt, 0.0d);
                        iComputeBytesSize = iComputeDoubleSize + i17;
                        break;
                    }
                    iComputeBytesSize = i17;
                    break;
                case 1:
                    if (messageSchema.isFieldPresent(t10, i12, i14, i13, i10)) {
                        iComputeFloatSize = CodedOutputStream.computeFloatSize(iNumberAt, CropImageView.DEFAULT_ASPECT_RATIO);
                        iComputeBytesSize = iComputeFloatSize + i17;
                        messageSchema = this;
                        t10 = t3;
                        break;
                    }
                    messageSchema = this;
                    t10 = t3;
                    iComputeBytesSize = i17;
                    break;
                case 2:
                    if (messageSchema.isFieldPresent(t10, i12, i14, i13, i10)) {
                        iComputeInt64Size = CodedOutputStream.computeInt64Size(iNumberAt, unsafe.getLong(t10, jOffset));
                        iComputeBytesSize = iComputeInt64Size + i17;
                        messageSchema = this;
                        break;
                    }
                    messageSchema = this;
                    iComputeBytesSize = i17;
                    break;
                case 3:
                    if (messageSchema.isFieldPresent(t10, i12, i14, i13, i10)) {
                        iComputeInt64Size = CodedOutputStream.computeUInt64Size(iNumberAt, unsafe.getLong(t10, jOffset));
                        iComputeBytesSize = iComputeInt64Size + i17;
                        messageSchema = this;
                        break;
                    }
                    messageSchema = this;
                    iComputeBytesSize = i17;
                    break;
                case 4:
                    if (messageSchema.isFieldPresent(t10, i12, i14, i13, i10)) {
                        iComputeInt64Size = CodedOutputStream.computeInt32Size(iNumberAt, unsafe.getInt(t10, jOffset));
                        iComputeBytesSize = iComputeInt64Size + i17;
                        messageSchema = this;
                        break;
                    }
                    messageSchema = this;
                    iComputeBytesSize = i17;
                    break;
                case 5:
                    if (messageSchema.isFieldPresent(t10, i12, i14, i13, i10)) {
                        iComputeFloatSize = CodedOutputStream.computeFixed64Size(iNumberAt, 0L);
                        iComputeBytesSize = iComputeFloatSize + i17;
                        messageSchema = this;
                        t10 = t3;
                        break;
                    }
                    messageSchema = this;
                    t10 = t3;
                    iComputeBytesSize = i17;
                    break;
                case 6:
                    if (messageSchema.isFieldPresent(t10, i12, i14, i13, i10)) {
                        iComputeFloatSize = CodedOutputStream.computeFixed32Size(iNumberAt, 0);
                        iComputeBytesSize = iComputeFloatSize + i17;
                        messageSchema = this;
                        t10 = t3;
                        break;
                    }
                    messageSchema = this;
                    t10 = t3;
                    iComputeBytesSize = i17;
                    break;
                case 7:
                    if (messageSchema.isFieldPresent(t10, i12, i14, i13, i10)) {
                        iComputeFloatSize = CodedOutputStream.computeBoolSize(iNumberAt, true);
                        iComputeBytesSize = iComputeFloatSize + i17;
                        messageSchema = this;
                        t10 = t3;
                        break;
                    }
                    messageSchema = this;
                    t10 = t3;
                    iComputeBytesSize = i17;
                    break;
                case 8:
                    if (messageSchema.isFieldPresent(t10, i12, i14, i13, i10)) {
                        Object object = unsafe.getObject(t10, jOffset);
                        iComputeBytesSize = (object instanceof ByteString ? CodedOutputStream.computeBytesSize(iNumberAt, (ByteString) object) : CodedOutputStream.computeStringSize(iNumberAt, (String) object)) + i17;
                        messageSchema = this;
                        break;
                    }
                    messageSchema = this;
                    iComputeBytesSize = i17;
                    break;
                case 9:
                    if (messageSchema.isFieldPresent(t10, i12, i14, i13, i10)) {
                        iComputeSizeMessage = SchemaUtil.computeSizeMessage(iNumberAt, unsafe.getObject(t10, jOffset), messageSchema.getMessageFieldSchema(i12));
                        iComputeBytesSize = i17 + iComputeSizeMessage;
                        break;
                    }
                    iComputeBytesSize = i17;
                    break;
                case 10:
                    if (messageSchema.isFieldPresent(t10, i12, i14, i13, i10)) {
                        iComputeInt64Size = CodedOutputStream.computeBytesSize(iNumberAt, (ByteString) unsafe.getObject(t10, jOffset));
                        iComputeBytesSize = iComputeInt64Size + i17;
                        messageSchema = this;
                        break;
                    }
                    messageSchema = this;
                    iComputeBytesSize = i17;
                    break;
                case 11:
                    if (messageSchema.isFieldPresent(t10, i12, i14, i13, i10)) {
                        iComputeInt64Size = CodedOutputStream.computeUInt32Size(iNumberAt, unsafe.getInt(t10, jOffset));
                        iComputeBytesSize = iComputeInt64Size + i17;
                        messageSchema = this;
                        break;
                    }
                    messageSchema = this;
                    iComputeBytesSize = i17;
                    break;
                case 12:
                    if (messageSchema.isFieldPresent(t10, i12, i14, i13, i10)) {
                        iComputeInt64Size = CodedOutputStream.computeEnumSize(iNumberAt, unsafe.getInt(t10, jOffset));
                        iComputeBytesSize = iComputeInt64Size + i17;
                        messageSchema = this;
                        break;
                    }
                    messageSchema = this;
                    iComputeBytesSize = i17;
                    break;
                case 13:
                    if (messageSchema.isFieldPresent(t10, i12, i14, i13, i10)) {
                        iComputeFloatSize = CodedOutputStream.computeSFixed32Size(iNumberAt, 0);
                        iComputeBytesSize = iComputeFloatSize + i17;
                        messageSchema = this;
                        t10 = t3;
                        break;
                    }
                    messageSchema = this;
                    t10 = t3;
                    iComputeBytesSize = i17;
                    break;
                case 14:
                    if (messageSchema.isFieldPresent(t10, i12, i14, i13, i10)) {
                        iComputeFloatSize = CodedOutputStream.computeSFixed64Size(iNumberAt, 0L);
                        iComputeBytesSize = iComputeFloatSize + i17;
                        messageSchema = this;
                        t10 = t3;
                        break;
                    }
                    messageSchema = this;
                    t10 = t3;
                    iComputeBytesSize = i17;
                    break;
                case 15:
                    if (messageSchema.isFieldPresent(t10, i12, i14, i13, i10)) {
                        iComputeInt64Size = CodedOutputStream.computeSInt32Size(iNumberAt, unsafe.getInt(t10, jOffset));
                        iComputeBytesSize = iComputeInt64Size + i17;
                        messageSchema = this;
                        break;
                    }
                    messageSchema = this;
                    iComputeBytesSize = i17;
                    break;
                case 16:
                    if (messageSchema.isFieldPresent(t10, i12, i14, i13, i10)) {
                        iComputeInt64Size = CodedOutputStream.computeSInt64Size(iNumberAt, unsafe.getLong(t10, jOffset));
                        iComputeBytesSize = iComputeInt64Size + i17;
                        messageSchema = this;
                        break;
                    }
                    messageSchema = this;
                    iComputeBytesSize = i17;
                    break;
                case 17:
                    if (messageSchema.isFieldPresent(t10, i12, i14, i13, i10)) {
                        iComputeDoubleSize = CodedOutputStream.computeGroupSize(iNumberAt, (MessageLite) unsafe.getObject(t10, jOffset), messageSchema.getMessageFieldSchema(i12));
                        iComputeBytesSize = iComputeDoubleSize + i17;
                        break;
                    }
                    iComputeBytesSize = i17;
                    break;
                case 18:
                    iComputeSizeMessage = SchemaUtil.computeSizeFixed64List(iNumberAt, (List) unsafe.getObject(t10, jOffset), false);
                    iComputeBytesSize = i17 + iComputeSizeMessage;
                    break;
                case 19:
                    iComputeSizeMessage = SchemaUtil.computeSizeFixed32List(iNumberAt, (List) unsafe.getObject(t10, jOffset), false);
                    iComputeBytesSize = i17 + iComputeSizeMessage;
                    break;
                case 20:
                    iComputeSizeMessage = SchemaUtil.computeSizeInt64List(iNumberAt, (List) unsafe.getObject(t10, jOffset), false);
                    iComputeBytesSize = i17 + iComputeSizeMessage;
                    break;
                case 21:
                    iComputeSizeMessage = SchemaUtil.computeSizeUInt64List(iNumberAt, (List) unsafe.getObject(t10, jOffset), false);
                    iComputeBytesSize = i17 + iComputeSizeMessage;
                    break;
                case 22:
                    iComputeSizeMessage = SchemaUtil.computeSizeInt32List(iNumberAt, (List) unsafe.getObject(t10, jOffset), false);
                    iComputeBytesSize = i17 + iComputeSizeMessage;
                    break;
                case 23:
                    iComputeSizeMessage = SchemaUtil.computeSizeFixed64List(iNumberAt, (List) unsafe.getObject(t10, jOffset), false);
                    iComputeBytesSize = i17 + iComputeSizeMessage;
                    break;
                case 24:
                    iComputeSizeMessage = SchemaUtil.computeSizeFixed32List(iNumberAt, (List) unsafe.getObject(t10, jOffset), false);
                    iComputeBytesSize = i17 + iComputeSizeMessage;
                    break;
                case 25:
                    iComputeSizeMessage = SchemaUtil.computeSizeBoolList(iNumberAt, (List) unsafe.getObject(t10, jOffset), false);
                    iComputeBytesSize = i17 + iComputeSizeMessage;
                    break;
                case 26:
                    iComputeSizeMessage = SchemaUtil.computeSizeStringList(iNumberAt, (List) unsafe.getObject(t10, jOffset));
                    iComputeBytesSize = i17 + iComputeSizeMessage;
                    break;
                case 27:
                    iComputeSizeMessage = SchemaUtil.computeSizeMessageList(iNumberAt, (List) unsafe.getObject(t10, jOffset), messageSchema.getMessageFieldSchema(i12));
                    iComputeBytesSize = i17 + iComputeSizeMessage;
                    break;
                case 28:
                    iComputeSizeMessage = SchemaUtil.computeSizeByteStringList(iNumberAt, (List) unsafe.getObject(t10, jOffset));
                    iComputeBytesSize = i17 + iComputeSizeMessage;
                    break;
                case 29:
                    iComputeSizeMessage = SchemaUtil.computeSizeUInt32List(iNumberAt, (List) unsafe.getObject(t10, jOffset), false);
                    iComputeBytesSize = i17 + iComputeSizeMessage;
                    break;
                case 30:
                    iComputeSizeMessage = SchemaUtil.computeSizeEnumList(iNumberAt, (List) unsafe.getObject(t10, jOffset), false);
                    iComputeBytesSize = i17 + iComputeSizeMessage;
                    break;
                case 31:
                    iComputeSizeMessage = SchemaUtil.computeSizeFixed32List(iNumberAt, (List) unsafe.getObject(t10, jOffset), false);
                    iComputeBytesSize = i17 + iComputeSizeMessage;
                    break;
                case 32:
                    iComputeSizeMessage = SchemaUtil.computeSizeFixed64List(iNumberAt, (List) unsafe.getObject(t10, jOffset), false);
                    iComputeBytesSize = i17 + iComputeSizeMessage;
                    break;
                case 33:
                    iComputeSizeMessage = SchemaUtil.computeSizeSInt32List(iNumberAt, (List) unsafe.getObject(t10, jOffset), false);
                    iComputeBytesSize = i17 + iComputeSizeMessage;
                    break;
                case 34:
                    iComputeSizeMessage = SchemaUtil.computeSizeSInt64List(iNumberAt, (List) unsafe.getObject(t10, jOffset), false);
                    iComputeBytesSize = i17 + iComputeSizeMessage;
                    break;
                case 35:
                    iComputeSizeFixed64ListNoTag = SchemaUtil.computeSizeFixed64ListNoTag((List) unsafe.getObject(t10, jOffset));
                    if (iComputeSizeFixed64ListNoTag > 0) {
                        if (messageSchema.useCachedSizeField) {
                            unsafe.putInt(t10, i16, iComputeSizeFixed64ListNoTag);
                        }
                        iComputeTagSize = CodedOutputStream.computeTagSize(iNumberAt);
                        iComputeUInt32SizeNoTag = CodedOutputStream.computeUInt32SizeNoTag(iComputeSizeFixed64ListNoTag);
                        iComputeBytesSize = iComputeUInt32SizeNoTag + iComputeTagSize + iComputeSizeFixed64ListNoTag + i17;
                        break;
                    }
                    iComputeBytesSize = i17;
                    break;
                case 36:
                    iComputeSizeFixed64ListNoTag = SchemaUtil.computeSizeFixed32ListNoTag((List) unsafe.getObject(t10, jOffset));
                    if (iComputeSizeFixed64ListNoTag > 0) {
                        if (messageSchema.useCachedSizeField) {
                            unsafe.putInt(t10, i16, iComputeSizeFixed64ListNoTag);
                        }
                        iComputeTagSize = CodedOutputStream.computeTagSize(iNumberAt);
                        iComputeUInt32SizeNoTag = CodedOutputStream.computeUInt32SizeNoTag(iComputeSizeFixed64ListNoTag);
                        iComputeBytesSize = iComputeUInt32SizeNoTag + iComputeTagSize + iComputeSizeFixed64ListNoTag + i17;
                        break;
                    }
                    iComputeBytesSize = i17;
                    break;
                case 37:
                    iComputeSizeFixed64ListNoTag = SchemaUtil.computeSizeInt64ListNoTag((List) unsafe.getObject(t10, jOffset));
                    if (iComputeSizeFixed64ListNoTag > 0) {
                        if (messageSchema.useCachedSizeField) {
                            unsafe.putInt(t10, i16, iComputeSizeFixed64ListNoTag);
                        }
                        iComputeTagSize = CodedOutputStream.computeTagSize(iNumberAt);
                        iComputeUInt32SizeNoTag = CodedOutputStream.computeUInt32SizeNoTag(iComputeSizeFixed64ListNoTag);
                        iComputeBytesSize = iComputeUInt32SizeNoTag + iComputeTagSize + iComputeSizeFixed64ListNoTag + i17;
                        break;
                    }
                    iComputeBytesSize = i17;
                    break;
                case 38:
                    iComputeSizeFixed64ListNoTag = SchemaUtil.computeSizeUInt64ListNoTag((List) unsafe.getObject(t10, jOffset));
                    if (iComputeSizeFixed64ListNoTag > 0) {
                        if (messageSchema.useCachedSizeField) {
                            unsafe.putInt(t10, i16, iComputeSizeFixed64ListNoTag);
                        }
                        iComputeTagSize = CodedOutputStream.computeTagSize(iNumberAt);
                        iComputeUInt32SizeNoTag = CodedOutputStream.computeUInt32SizeNoTag(iComputeSizeFixed64ListNoTag);
                        iComputeBytesSize = iComputeUInt32SizeNoTag + iComputeTagSize + iComputeSizeFixed64ListNoTag + i17;
                        break;
                    }
                    iComputeBytesSize = i17;
                    break;
                case 39:
                    iComputeSizeFixed64ListNoTag = SchemaUtil.computeSizeInt32ListNoTag((List) unsafe.getObject(t10, jOffset));
                    if (iComputeSizeFixed64ListNoTag > 0) {
                        if (messageSchema.useCachedSizeField) {
                            unsafe.putInt(t10, i16, iComputeSizeFixed64ListNoTag);
                        }
                        iComputeTagSize = CodedOutputStream.computeTagSize(iNumberAt);
                        iComputeUInt32SizeNoTag = CodedOutputStream.computeUInt32SizeNoTag(iComputeSizeFixed64ListNoTag);
                        iComputeBytesSize = iComputeUInt32SizeNoTag + iComputeTagSize + iComputeSizeFixed64ListNoTag + i17;
                        break;
                    }
                    iComputeBytesSize = i17;
                    break;
                case 40:
                    iComputeSizeFixed64ListNoTag = SchemaUtil.computeSizeFixed64ListNoTag((List) unsafe.getObject(t10, jOffset));
                    if (iComputeSizeFixed64ListNoTag > 0) {
                        if (messageSchema.useCachedSizeField) {
                            unsafe.putInt(t10, i16, iComputeSizeFixed64ListNoTag);
                        }
                        iComputeTagSize = CodedOutputStream.computeTagSize(iNumberAt);
                        iComputeUInt32SizeNoTag = CodedOutputStream.computeUInt32SizeNoTag(iComputeSizeFixed64ListNoTag);
                        iComputeBytesSize = iComputeUInt32SizeNoTag + iComputeTagSize + iComputeSizeFixed64ListNoTag + i17;
                        break;
                    }
                    iComputeBytesSize = i17;
                    break;
                case 41:
                    iComputeSizeFixed64ListNoTag = SchemaUtil.computeSizeFixed32ListNoTag((List) unsafe.getObject(t10, jOffset));
                    if (iComputeSizeFixed64ListNoTag > 0) {
                        if (messageSchema.useCachedSizeField) {
                            unsafe.putInt(t10, i16, iComputeSizeFixed64ListNoTag);
                        }
                        iComputeTagSize = CodedOutputStream.computeTagSize(iNumberAt);
                        iComputeUInt32SizeNoTag = CodedOutputStream.computeUInt32SizeNoTag(iComputeSizeFixed64ListNoTag);
                        iComputeBytesSize = iComputeUInt32SizeNoTag + iComputeTagSize + iComputeSizeFixed64ListNoTag + i17;
                        break;
                    }
                    iComputeBytesSize = i17;
                    break;
                case 42:
                    iComputeSizeFixed64ListNoTag = SchemaUtil.computeSizeBoolListNoTag((List) unsafe.getObject(t10, jOffset));
                    if (iComputeSizeFixed64ListNoTag > 0) {
                        if (messageSchema.useCachedSizeField) {
                            unsafe.putInt(t10, i16, iComputeSizeFixed64ListNoTag);
                        }
                        iComputeTagSize = CodedOutputStream.computeTagSize(iNumberAt);
                        iComputeUInt32SizeNoTag = CodedOutputStream.computeUInt32SizeNoTag(iComputeSizeFixed64ListNoTag);
                        iComputeBytesSize = iComputeUInt32SizeNoTag + iComputeTagSize + iComputeSizeFixed64ListNoTag + i17;
                        break;
                    }
                    iComputeBytesSize = i17;
                    break;
                case EACTags.DATE_OF_BIRTH /* 43 */:
                    iComputeSizeFixed64ListNoTag = SchemaUtil.computeSizeUInt32ListNoTag((List) unsafe.getObject(t10, jOffset));
                    if (iComputeSizeFixed64ListNoTag > 0) {
                        if (messageSchema.useCachedSizeField) {
                            unsafe.putInt(t10, i16, iComputeSizeFixed64ListNoTag);
                        }
                        iComputeTagSize = CodedOutputStream.computeTagSize(iNumberAt);
                        iComputeUInt32SizeNoTag = CodedOutputStream.computeUInt32SizeNoTag(iComputeSizeFixed64ListNoTag);
                        iComputeBytesSize = iComputeUInt32SizeNoTag + iComputeTagSize + iComputeSizeFixed64ListNoTag + i17;
                        break;
                    }
                    iComputeBytesSize = i17;
                    break;
                case 44:
                    iComputeSizeFixed64ListNoTag = SchemaUtil.computeSizeEnumListNoTag((List) unsafe.getObject(t10, jOffset));
                    if (iComputeSizeFixed64ListNoTag > 0) {
                        if (messageSchema.useCachedSizeField) {
                            unsafe.putInt(t10, i16, iComputeSizeFixed64ListNoTag);
                        }
                        iComputeTagSize = CodedOutputStream.computeTagSize(iNumberAt);
                        iComputeUInt32SizeNoTag = CodedOutputStream.computeUInt32SizeNoTag(iComputeSizeFixed64ListNoTag);
                        iComputeBytesSize = iComputeUInt32SizeNoTag + iComputeTagSize + iComputeSizeFixed64ListNoTag + i17;
                        break;
                    }
                    iComputeBytesSize = i17;
                    break;
                case 45:
                    iComputeSizeFixed64ListNoTag = SchemaUtil.computeSizeFixed32ListNoTag((List) unsafe.getObject(t10, jOffset));
                    if (iComputeSizeFixed64ListNoTag > 0) {
                        if (messageSchema.useCachedSizeField) {
                            unsafe.putInt(t10, i16, iComputeSizeFixed64ListNoTag);
                        }
                        iComputeTagSize = CodedOutputStream.computeTagSize(iNumberAt);
                        iComputeUInt32SizeNoTag = CodedOutputStream.computeUInt32SizeNoTag(iComputeSizeFixed64ListNoTag);
                        iComputeBytesSize = iComputeUInt32SizeNoTag + iComputeTagSize + iComputeSizeFixed64ListNoTag + i17;
                        break;
                    }
                    iComputeBytesSize = i17;
                    break;
                case 46:
                    iComputeSizeFixed64ListNoTag = SchemaUtil.computeSizeFixed64ListNoTag((List) unsafe.getObject(t10, jOffset));
                    if (iComputeSizeFixed64ListNoTag > 0) {
                        if (messageSchema.useCachedSizeField) {
                            unsafe.putInt(t10, i16, iComputeSizeFixed64ListNoTag);
                        }
                        iComputeTagSize = CodedOutputStream.computeTagSize(iNumberAt);
                        iComputeUInt32SizeNoTag = CodedOutputStream.computeUInt32SizeNoTag(iComputeSizeFixed64ListNoTag);
                        iComputeBytesSize = iComputeUInt32SizeNoTag + iComputeTagSize + iComputeSizeFixed64ListNoTag + i17;
                        break;
                    }
                    iComputeBytesSize = i17;
                    break;
                case EACTags.PIN_USAGE_POLICY /* 47 */:
                    iComputeSizeFixed64ListNoTag = SchemaUtil.computeSizeSInt32ListNoTag((List) unsafe.getObject(t10, jOffset));
                    if (iComputeSizeFixed64ListNoTag > 0) {
                        if (messageSchema.useCachedSizeField) {
                            unsafe.putInt(t10, i16, iComputeSizeFixed64ListNoTag);
                        }
                        iComputeTagSize = CodedOutputStream.computeTagSize(iNumberAt);
                        iComputeUInt32SizeNoTag = CodedOutputStream.computeUInt32SizeNoTag(iComputeSizeFixed64ListNoTag);
                        iComputeBytesSize = iComputeUInt32SizeNoTag + iComputeTagSize + iComputeSizeFixed64ListNoTag + i17;
                        break;
                    }
                    iComputeBytesSize = i17;
                    break;
                case 48:
                    iComputeSizeFixed64ListNoTag = SchemaUtil.computeSizeSInt64ListNoTag((List) unsafe.getObject(t10, jOffset));
                    if (iComputeSizeFixed64ListNoTag > 0) {
                        if (messageSchema.useCachedSizeField) {
                            unsafe.putInt(t10, i16, iComputeSizeFixed64ListNoTag);
                        }
                        iComputeTagSize = CodedOutputStream.computeTagSize(iNumberAt);
                        iComputeUInt32SizeNoTag = CodedOutputStream.computeUInt32SizeNoTag(iComputeSizeFixed64ListNoTag);
                        iComputeBytesSize = iComputeUInt32SizeNoTag + iComputeTagSize + iComputeSizeFixed64ListNoTag + i17;
                        break;
                    }
                    iComputeBytesSize = i17;
                    break;
                case 49:
                    iComputeSizeMessage = SchemaUtil.computeSizeGroupList(iNumberAt, (List) unsafe.getObject(t10, jOffset), messageSchema.getMessageFieldSchema(i12));
                    iComputeBytesSize = i17 + iComputeSizeMessage;
                    break;
                case 50:
                    iComputeSizeMessage = messageSchema.mapFieldSchema.getSerializedSize(iNumberAt, unsafe.getObject(t10, jOffset), messageSchema.getMapFieldDefaultEntry(i12));
                    iComputeBytesSize = i17 + iComputeSizeMessage;
                    break;
                case 51:
                    if (messageSchema.isOneofPresent(t10, iNumberAt, i12)) {
                        iComputeDoubleSize = CodedOutputStream.computeDoubleSize(iNumberAt, 0.0d);
                        iComputeBytesSize = iComputeDoubleSize + i17;
                        break;
                    }
                    iComputeBytesSize = i17;
                    break;
                case 52:
                    if (messageSchema.isOneofPresent(t10, iNumberAt, i12)) {
                        iComputeDoubleSize = CodedOutputStream.computeFloatSize(iNumberAt, CropImageView.DEFAULT_ASPECT_RATIO);
                        iComputeBytesSize = iComputeDoubleSize + i17;
                        break;
                    }
                    iComputeBytesSize = i17;
                    break;
                case EACTags.SEX /* 53 */:
                    if (messageSchema.isOneofPresent(t10, iNumberAt, i12)) {
                        iComputeDoubleSize = CodedOutputStream.computeInt64Size(iNumberAt, oneofLongAt(t10, jOffset));
                        iComputeBytesSize = iComputeDoubleSize + i17;
                        break;
                    }
                    iComputeBytesSize = i17;
                    break;
                case EACTags.CURRENCY_EXPONENT /* 54 */:
                    if (messageSchema.isOneofPresent(t10, iNumberAt, i12)) {
                        iComputeDoubleSize = CodedOutputStream.computeUInt64Size(iNumberAt, oneofLongAt(t10, jOffset));
                        iComputeBytesSize = iComputeDoubleSize + i17;
                        break;
                    }
                    iComputeBytesSize = i17;
                    break;
                case 55:
                    if (messageSchema.isOneofPresent(t10, iNumberAt, i12)) {
                        iComputeDoubleSize = CodedOutputStream.computeInt32Size(iNumberAt, oneofIntAt(t10, jOffset));
                        iComputeBytesSize = iComputeDoubleSize + i17;
                        break;
                    }
                    iComputeBytesSize = i17;
                    break;
                case 56:
                    if (messageSchema.isOneofPresent(t10, iNumberAt, i12)) {
                        iComputeDoubleSize = CodedOutputStream.computeFixed64Size(iNumberAt, 0L);
                        iComputeBytesSize = iComputeDoubleSize + i17;
                        break;
                    }
                    iComputeBytesSize = i17;
                    break;
                case 57:
                    if (messageSchema.isOneofPresent(t10, iNumberAt, i12)) {
                        iComputeDoubleSize = CodedOutputStream.computeFixed32Size(iNumberAt, 0);
                        iComputeBytesSize = iComputeDoubleSize + i17;
                        break;
                    }
                    iComputeBytesSize = i17;
                    break;
                case EACTags.DYNAMIC_INTERNAL_AUTHENTIFICATION /* 58 */:
                    if (messageSchema.isOneofPresent(t10, iNumberAt, i12)) {
                        iComputeDoubleSize = CodedOutputStream.computeBoolSize(iNumberAt, true);
                        iComputeBytesSize = iComputeDoubleSize + i17;
                        break;
                    }
                    iComputeBytesSize = i17;
                    break;
                case EACTags.DYNAMIC_EXTERNAL_AUTHENTIFICATION /* 59 */:
                    if (!messageSchema.isOneofPresent(t10, iNumberAt, i12)) {
                        iComputeBytesSize = i17;
                        break;
                    } else {
                        Object object2 = unsafe.getObject(t10, jOffset);
                        iComputeBytesSize = (object2 instanceof ByteString ? CodedOutputStream.computeBytesSize(iNumberAt, (ByteString) object2) : CodedOutputStream.computeStringSize(iNumberAt, (String) object2)) + i17;
                        break;
                    }
                case 60:
                    if (messageSchema.isOneofPresent(t10, iNumberAt, i12)) {
                        iComputeSizeMessage = SchemaUtil.computeSizeMessage(iNumberAt, unsafe.getObject(t10, jOffset), messageSchema.getMessageFieldSchema(i12));
                        iComputeBytesSize = i17 + iComputeSizeMessage;
                        break;
                    }
                    iComputeBytesSize = i17;
                    break;
                case 61:
                    if (messageSchema.isOneofPresent(t10, iNumberAt, i12)) {
                        iComputeDoubleSize = CodedOutputStream.computeBytesSize(iNumberAt, (ByteString) unsafe.getObject(t10, jOffset));
                        iComputeBytesSize = iComputeDoubleSize + i17;
                        break;
                    }
                    iComputeBytesSize = i17;
                    break;
                case 62:
                    if (messageSchema.isOneofPresent(t10, iNumberAt, i12)) {
                        iComputeDoubleSize = CodedOutputStream.computeUInt32Size(iNumberAt, oneofIntAt(t10, jOffset));
                        iComputeBytesSize = iComputeDoubleSize + i17;
                        break;
                    }
                    iComputeBytesSize = i17;
                    break;
                case 63:
                    if (messageSchema.isOneofPresent(t10, iNumberAt, i12)) {
                        iComputeDoubleSize = CodedOutputStream.computeEnumSize(iNumberAt, oneofIntAt(t10, jOffset));
                        iComputeBytesSize = iComputeDoubleSize + i17;
                        break;
                    }
                    iComputeBytesSize = i17;
                    break;
                case 64:
                    if (messageSchema.isOneofPresent(t10, iNumberAt, i12)) {
                        iComputeDoubleSize = CodedOutputStream.computeSFixed32Size(iNumberAt, 0);
                        iComputeBytesSize = iComputeDoubleSize + i17;
                        break;
                    }
                    iComputeBytesSize = i17;
                    break;
                case EACTags.ELEMENT_LIST /* 65 */:
                    if (messageSchema.isOneofPresent(t10, iNumberAt, i12)) {
                        iComputeDoubleSize = CodedOutputStream.computeSFixed64Size(iNumberAt, 0L);
                        iComputeBytesSize = iComputeDoubleSize + i17;
                        break;
                    }
                    iComputeBytesSize = i17;
                    break;
                case EACTags.ADDRESS /* 66 */:
                    if (messageSchema.isOneofPresent(t10, iNumberAt, i12)) {
                        iComputeDoubleSize = CodedOutputStream.computeSInt32Size(iNumberAt, oneofIntAt(t10, jOffset));
                        iComputeBytesSize = iComputeDoubleSize + i17;
                        break;
                    }
                    iComputeBytesSize = i17;
                    break;
                case EACTags.CARDHOLDER_HANDWRITTEN_SIGNATURE /* 67 */:
                    if (messageSchema.isOneofPresent(t10, iNumberAt, i12)) {
                        iComputeDoubleSize = CodedOutputStream.computeSInt64Size(iNumberAt, oneofLongAt(t10, jOffset));
                        iComputeBytesSize = iComputeDoubleSize + i17;
                        break;
                    }
                    iComputeBytesSize = i17;
                    break;
                case 68:
                    if (messageSchema.isOneofPresent(t10, iNumberAt, i12)) {
                        iComputeDoubleSize = CodedOutputStream.computeGroupSize(iNumberAt, (MessageLite) unsafe.getObject(t10, jOffset), messageSchema.getMessageFieldSchema(i12));
                        iComputeBytesSize = iComputeDoubleSize + i17;
                        break;
                    }
                    iComputeBytesSize = i17;
                    break;
            }
            i12 += 3;
            i11 = 1048575;
        }
        int unknownFieldsSerializedSize = iComputeBytesSize + messageSchema.getUnknownFieldsSerializedSize(messageSchema.unknownFieldSchema, t10);
        return messageSchema.hasExtensions ? unknownFieldsSerializedSize + messageSchema.extensionSchema.getExtensions(t10).getSerializedSize() : unknownFieldsSerializedSize;
    }

    @Override // com.google.protobuf.Schema
    public int hashCode(T t3) {
        int i10;
        int iHashLong;
        int i11;
        int iOneofIntAt;
        int length = this.buffer.length;
        int i12 = 0;
        for (int i13 = 0; i13 < length; i13 += 3) {
            int iTypeAndOffsetAt = typeAndOffsetAt(i13);
            int iNumberAt = numberAt(i13);
            long jOffset = offset(iTypeAndOffsetAt);
            int iHashCode = 37;
            switch (type(iTypeAndOffsetAt)) {
                case 0:
                    i10 = i12 * 53;
                    iHashLong = Internal.hashLong(Double.doubleToLongBits(UnsafeUtil.getDouble(t3, jOffset)));
                    i12 = iHashLong + i10;
                    break;
                case 1:
                    i10 = i12 * 53;
                    iHashLong = Float.floatToIntBits(UnsafeUtil.getFloat(t3, jOffset));
                    i12 = iHashLong + i10;
                    break;
                case 2:
                    i10 = i12 * 53;
                    iHashLong = Internal.hashLong(UnsafeUtil.getLong(t3, jOffset));
                    i12 = iHashLong + i10;
                    break;
                case 3:
                    i10 = i12 * 53;
                    iHashLong = Internal.hashLong(UnsafeUtil.getLong(t3, jOffset));
                    i12 = iHashLong + i10;
                    break;
                case 4:
                    i11 = i12 * 53;
                    iOneofIntAt = UnsafeUtil.getInt(t3, jOffset);
                    i12 = i11 + iOneofIntAt;
                    break;
                case 5:
                    i10 = i12 * 53;
                    iHashLong = Internal.hashLong(UnsafeUtil.getLong(t3, jOffset));
                    i12 = iHashLong + i10;
                    break;
                case 6:
                    i11 = i12 * 53;
                    iOneofIntAt = UnsafeUtil.getInt(t3, jOffset);
                    i12 = i11 + iOneofIntAt;
                    break;
                case 7:
                    i10 = i12 * 53;
                    iHashLong = Internal.hashBoolean(UnsafeUtil.getBoolean(t3, jOffset));
                    i12 = iHashLong + i10;
                    break;
                case 8:
                    i10 = i12 * 53;
                    iHashLong = ((String) UnsafeUtil.getObject(t3, jOffset)).hashCode();
                    i12 = iHashLong + i10;
                    break;
                case 9:
                    Object object = UnsafeUtil.getObject(t3, jOffset);
                    if (object != null) {
                        iHashCode = object.hashCode();
                    }
                    i12 = (i12 * 53) + iHashCode;
                    break;
                case 10:
                    i10 = i12 * 53;
                    iHashLong = UnsafeUtil.getObject(t3, jOffset).hashCode();
                    i12 = iHashLong + i10;
                    break;
                case 11:
                    i11 = i12 * 53;
                    iOneofIntAt = UnsafeUtil.getInt(t3, jOffset);
                    i12 = i11 + iOneofIntAt;
                    break;
                case 12:
                    i11 = i12 * 53;
                    iOneofIntAt = UnsafeUtil.getInt(t3, jOffset);
                    i12 = i11 + iOneofIntAt;
                    break;
                case 13:
                    i11 = i12 * 53;
                    iOneofIntAt = UnsafeUtil.getInt(t3, jOffset);
                    i12 = i11 + iOneofIntAt;
                    break;
                case 14:
                    i10 = i12 * 53;
                    iHashLong = Internal.hashLong(UnsafeUtil.getLong(t3, jOffset));
                    i12 = iHashLong + i10;
                    break;
                case 15:
                    i11 = i12 * 53;
                    iOneofIntAt = UnsafeUtil.getInt(t3, jOffset);
                    i12 = i11 + iOneofIntAt;
                    break;
                case 16:
                    i10 = i12 * 53;
                    iHashLong = Internal.hashLong(UnsafeUtil.getLong(t3, jOffset));
                    i12 = iHashLong + i10;
                    break;
                case 17:
                    Object object2 = UnsafeUtil.getObject(t3, jOffset);
                    if (object2 != null) {
                        iHashCode = object2.hashCode();
                    }
                    i12 = (i12 * 53) + iHashCode;
                    break;
                case 18:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                case 24:
                case 25:
                case 26:
                case 27:
                case 28:
                case 29:
                case 30:
                case 31:
                case 32:
                case 33:
                case 34:
                case 35:
                case 36:
                case 37:
                case 38:
                case 39:
                case 40:
                case 41:
                case 42:
                case EACTags.DATE_OF_BIRTH /* 43 */:
                case 44:
                case 45:
                case 46:
                case EACTags.PIN_USAGE_POLICY /* 47 */:
                case 48:
                case 49:
                    i10 = i12 * 53;
                    iHashLong = UnsafeUtil.getObject(t3, jOffset).hashCode();
                    i12 = iHashLong + i10;
                    break;
                case 50:
                    i10 = i12 * 53;
                    iHashLong = UnsafeUtil.getObject(t3, jOffset).hashCode();
                    i12 = iHashLong + i10;
                    break;
                case 51:
                    if (isOneofPresent(t3, iNumberAt, i13)) {
                        i10 = i12 * 53;
                        iHashLong = Internal.hashLong(Double.doubleToLongBits(oneofDoubleAt(t3, jOffset)));
                        i12 = iHashLong + i10;
                        break;
                    } else {
                        break;
                    }
                case 52:
                    if (isOneofPresent(t3, iNumberAt, i13)) {
                        i10 = i12 * 53;
                        iHashLong = Float.floatToIntBits(oneofFloatAt(t3, jOffset));
                        i12 = iHashLong + i10;
                        break;
                    } else {
                        break;
                    }
                case EACTags.SEX /* 53 */:
                    if (isOneofPresent(t3, iNumberAt, i13)) {
                        i10 = i12 * 53;
                        iHashLong = Internal.hashLong(oneofLongAt(t3, jOffset));
                        i12 = iHashLong + i10;
                        break;
                    } else {
                        break;
                    }
                case EACTags.CURRENCY_EXPONENT /* 54 */:
                    if (isOneofPresent(t3, iNumberAt, i13)) {
                        i10 = i12 * 53;
                        iHashLong = Internal.hashLong(oneofLongAt(t3, jOffset));
                        i12 = iHashLong + i10;
                        break;
                    } else {
                        break;
                    }
                case 55:
                    if (isOneofPresent(t3, iNumberAt, i13)) {
                        i11 = i12 * 53;
                        iOneofIntAt = oneofIntAt(t3, jOffset);
                        i12 = i11 + iOneofIntAt;
                        break;
                    } else {
                        break;
                    }
                case 56:
                    if (isOneofPresent(t3, iNumberAt, i13)) {
                        i10 = i12 * 53;
                        iHashLong = Internal.hashLong(oneofLongAt(t3, jOffset));
                        i12 = iHashLong + i10;
                        break;
                    } else {
                        break;
                    }
                case 57:
                    if (isOneofPresent(t3, iNumberAt, i13)) {
                        i11 = i12 * 53;
                        iOneofIntAt = oneofIntAt(t3, jOffset);
                        i12 = i11 + iOneofIntAt;
                        break;
                    } else {
                        break;
                    }
                case EACTags.DYNAMIC_INTERNAL_AUTHENTIFICATION /* 58 */:
                    if (isOneofPresent(t3, iNumberAt, i13)) {
                        i10 = i12 * 53;
                        iHashLong = Internal.hashBoolean(oneofBooleanAt(t3, jOffset));
                        i12 = iHashLong + i10;
                        break;
                    } else {
                        break;
                    }
                case EACTags.DYNAMIC_EXTERNAL_AUTHENTIFICATION /* 59 */:
                    if (isOneofPresent(t3, iNumberAt, i13)) {
                        i10 = i12 * 53;
                        iHashLong = ((String) UnsafeUtil.getObject(t3, jOffset)).hashCode();
                        i12 = iHashLong + i10;
                        break;
                    } else {
                        break;
                    }
                case 60:
                    if (isOneofPresent(t3, iNumberAt, i13)) {
                        i10 = i12 * 53;
                        iHashLong = UnsafeUtil.getObject(t3, jOffset).hashCode();
                        i12 = iHashLong + i10;
                        break;
                    } else {
                        break;
                    }
                case 61:
                    if (isOneofPresent(t3, iNumberAt, i13)) {
                        i10 = i12 * 53;
                        iHashLong = UnsafeUtil.getObject(t3, jOffset).hashCode();
                        i12 = iHashLong + i10;
                        break;
                    } else {
                        break;
                    }
                case 62:
                    if (isOneofPresent(t3, iNumberAt, i13)) {
                        i11 = i12 * 53;
                        iOneofIntAt = oneofIntAt(t3, jOffset);
                        i12 = i11 + iOneofIntAt;
                        break;
                    } else {
                        break;
                    }
                case 63:
                    if (isOneofPresent(t3, iNumberAt, i13)) {
                        i11 = i12 * 53;
                        iOneofIntAt = oneofIntAt(t3, jOffset);
                        i12 = i11 + iOneofIntAt;
                        break;
                    } else {
                        break;
                    }
                case 64:
                    if (isOneofPresent(t3, iNumberAt, i13)) {
                        i11 = i12 * 53;
                        iOneofIntAt = oneofIntAt(t3, jOffset);
                        i12 = i11 + iOneofIntAt;
                        break;
                    } else {
                        break;
                    }
                case EACTags.ELEMENT_LIST /* 65 */:
                    if (isOneofPresent(t3, iNumberAt, i13)) {
                        i10 = i12 * 53;
                        iHashLong = Internal.hashLong(oneofLongAt(t3, jOffset));
                        i12 = iHashLong + i10;
                        break;
                    } else {
                        break;
                    }
                case EACTags.ADDRESS /* 66 */:
                    if (isOneofPresent(t3, iNumberAt, i13)) {
                        i11 = i12 * 53;
                        iOneofIntAt = oneofIntAt(t3, jOffset);
                        i12 = i11 + iOneofIntAt;
                        break;
                    } else {
                        break;
                    }
                case EACTags.CARDHOLDER_HANDWRITTEN_SIGNATURE /* 67 */:
                    if (isOneofPresent(t3, iNumberAt, i13)) {
                        i10 = i12 * 53;
                        iHashLong = Internal.hashLong(oneofLongAt(t3, jOffset));
                        i12 = iHashLong + i10;
                        break;
                    } else {
                        break;
                    }
                case 68:
                    if (isOneofPresent(t3, iNumberAt, i13)) {
                        i10 = i12 * 53;
                        iHashLong = UnsafeUtil.getObject(t3, jOffset).hashCode();
                        i12 = iHashLong + i10;
                        break;
                    } else {
                        break;
                    }
            }
        }
        int iHashCode2 = this.unknownFieldSchema.getFromMessage(t3).hashCode() + (i12 * 53);
        return this.hasExtensions ? (iHashCode2 * 53) + this.extensionSchema.getExtensions(t3).hashCode() : iHashCode2;
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x007c  */
    @Override // com.google.protobuf.Schema
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean isInitialized(T t3) {
        int i10;
        int i11;
        int i12 = 1048575;
        int i13 = 0;
        int i14 = 0;
        while (i13 < this.checkInitializedCount) {
            int i15 = this.intArray[i13];
            int iNumberAt = numberAt(i15);
            int iTypeAndOffsetAt = typeAndOffsetAt(i15);
            int i16 = this.buffer[i15 + 2];
            int i17 = i16 & 1048575;
            int i18 = 1 << (i16 >>> 20);
            if (i17 != i12) {
                if (i17 != 1048575) {
                    i14 = UNSAFE.getInt(t3, i17);
                }
                i11 = i14;
                i10 = i17;
            } else {
                i10 = i12;
                i11 = i14;
            }
            T t10 = t3;
            if (isRequired(iTypeAndOffsetAt) && !isFieldPresent(t10, i15, i10, i11, i18)) {
                return false;
            }
            int iType = type(iTypeAndOffsetAt);
            if (iType == 9 || iType == 17) {
                if (isFieldPresent(t10, i15, i10, i11, i18) && !isInitialized(t10, iTypeAndOffsetAt, getMessageFieldSchema(i15))) {
                    return false;
                }
            } else if (iType == 27) {
                if (!isListInitialized(t10, iTypeAndOffsetAt, i15)) {
                    return false;
                }
            } else if (iType == 60 || iType == 68) {
                if (isOneofPresent(t10, iNumberAt, i15) && !isInitialized(t10, iTypeAndOffsetAt, getMessageFieldSchema(i15))) {
                    return false;
                }
            } else if (iType != 49) {
                if (iType == 50 && !isMapInitialized(t10, iTypeAndOffsetAt, i15)) {
                    return false;
                }
            }
            i13++;
            t3 = t10;
            i12 = i10;
            i14 = i11;
        }
        return !this.hasExtensions || this.extensionSchema.getExtensions(t3).isInitialized();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:25:0x006a  */
    @Override // com.google.protobuf.Schema
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void makeImmutable(T t3) {
        if (isMutable(t3)) {
            if (t3 instanceof GeneratedMessageLite) {
                GeneratedMessageLite generatedMessageLite = (GeneratedMessageLite) t3;
                generatedMessageLite.clearMemoizedSerializedSize();
                generatedMessageLite.clearMemoizedHashCode();
                generatedMessageLite.markImmutable();
            }
            int length = this.buffer.length;
            for (int i10 = 0; i10 < length; i10 += 3) {
                int iTypeAndOffsetAt = typeAndOffsetAt(i10);
                long jOffset = offset(iTypeAndOffsetAt);
                int iType = type(iTypeAndOffsetAt);
                if (iType != 9) {
                    if (iType != 60 && iType != 68) {
                        switch (iType) {
                            case 18:
                            case 19:
                            case 20:
                            case 21:
                            case 22:
                            case 23:
                            case 24:
                            case 25:
                            case 26:
                            case 27:
                            case 28:
                            case 29:
                            case 30:
                            case 31:
                            case 32:
                            case 33:
                            case 34:
                            case 35:
                            case 36:
                            case 37:
                            case 38:
                            case 39:
                            case 40:
                            case 41:
                            case 42:
                            case EACTags.DATE_OF_BIRTH /* 43 */:
                            case 44:
                            case 45:
                            case 46:
                            case EACTags.PIN_USAGE_POLICY /* 47 */:
                            case 48:
                            case 49:
                                this.listFieldSchema.makeImmutableListAt(t3, jOffset);
                                break;
                            case 50:
                                Unsafe unsafe = UNSAFE;
                                Object object = unsafe.getObject(t3, jOffset);
                                if (object != null) {
                                    unsafe.putObject(t3, jOffset, this.mapFieldSchema.toImmutable(object));
                                    break;
                                } else {
                                    break;
                                }
                        }
                    } else if (isOneofPresent(t3, numberAt(i10), i10)) {
                        getMessageFieldSchema(i10).makeImmutable(UNSAFE.getObject(t3, jOffset));
                    }
                } else if (isFieldPresent(t3, i10)) {
                    getMessageFieldSchema(i10).makeImmutable(UNSAFE.getObject(t3, jOffset));
                }
            }
            this.unknownFieldSchema.makeImmutable(t3);
            if (this.hasExtensions) {
                this.extensionSchema.makeImmutable(t3);
            }
        }
    }

    @Override // com.google.protobuf.Schema
    public void mergeFrom(T t3, T t10) {
        checkMutable(t3);
        t10.getClass();
        for (int i10 = 0; i10 < this.buffer.length; i10 += 3) {
            mergeSingleField(t3, t10, i10);
        }
        SchemaUtil.mergeUnknownFields(this.unknownFieldSchema, t3, t10);
        if (this.hasExtensions) {
            SchemaUtil.mergeExtensions(this.extensionSchema, t3, t10);
        }
    }

    @Override // com.google.protobuf.Schema
    public T newInstance() {
        return (T) this.newInstanceSchema.newInstance(this.defaultInstance);
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:27:0x009d. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:142:0x0410 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:147:0x0422  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x043e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public int parseMessage(T t3, byte[] bArr, int i10, int i11, int i12, ArrayDecoders.Registers registers) throws IOException {
        T t10;
        int i13;
        int i14;
        Unsafe unsafe;
        MessageSchema<T> messageSchema;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        ArrayDecoders.Registers registers2;
        T t11;
        int iDecodeUnknownField;
        int i21;
        long j10;
        ArrayDecoders.Registers registers3;
        int i22;
        Unsafe unsafe2;
        int i23;
        byte[] bArr2;
        int i24;
        Unsafe unsafe3;
        ArrayDecoders.Registers registers4;
        T t12;
        byte[] bArr3;
        int iDecodeVarint64;
        int i25;
        byte[] bArr4;
        int i26;
        ArrayDecoders.Registers registers5;
        int i27;
        int i28;
        MessageSchema<T> messageSchema2 = this;
        T t13 = t3;
        byte[] bArr5 = bArr;
        int i29 = i11;
        ArrayDecoders.Registers registers6 = registers;
        checkMutable(t13);
        Unsafe unsafe4 = UNSAFE;
        int i30 = -1;
        int iMergeGroupField = i10;
        int i31 = -1;
        int i32 = 0;
        int i33 = 0;
        int i34 = 0;
        int i35 = 1048575;
        while (true) {
            if (iMergeGroupField < i29) {
                int iDecodeVarint32 = iMergeGroupField + 1;
                int i36 = bArr5[iMergeGroupField];
                if (i36 < 0) {
                    iDecodeVarint32 = ArrayDecoders.decodeVarint32(i36, bArr5, iDecodeVarint32, registers6);
                    i36 = registers6.int1;
                }
                int i37 = iDecodeVarint32;
                i34 = i36;
                int i38 = i34 >>> 3;
                int i39 = i34 & 7;
                int iPositionForFieldNumber = i38 > i31 ? messageSchema2.positionForFieldNumber(i38, i32 / 3) : messageSchema2.positionForFieldNumber(i38);
                if (iPositionForFieldNumber == i30) {
                    i16 = i37;
                    i14 = i35;
                    unsafe = unsafe4;
                    i17 = i30;
                    i18 = i38;
                    i19 = 0;
                    messageSchema = messageSchema2;
                    i20 = i34;
                } else {
                    int i40 = messageSchema2.buffer[iPositionForFieldNumber + 1];
                    int i41 = i30;
                    int iType = type(i40);
                    long jOffset = offset(i40);
                    if (iType <= 17) {
                        int i42 = messageSchema2.buffer[iPositionForFieldNumber + 2];
                        int i43 = 1 << (i42 >>> 20);
                        int i44 = i42 & 1048575;
                        if (i44 != i35) {
                            i18 = i38;
                            j10 = jOffset;
                            if (i35 != 1048575) {
                                unsafe4.putInt(t13, i35, i33);
                            }
                            i33 = i44 == 1048575 ? 0 : unsafe4.getInt(t13, i44);
                        } else {
                            j10 = jOffset;
                            i18 = i38;
                            i44 = i35;
                        }
                        switch (iType) {
                            case 0:
                                registers3 = registers;
                                i22 = iPositionForFieldNumber;
                                unsafe2 = unsafe4;
                                i23 = i37;
                                long j11 = j10;
                                bArr2 = bArr;
                                if (i39 == 1) {
                                    UnsafeUtil.putDouble(t13, j11, ArrayDecoders.decodeDouble(bArr2, i23));
                                    i24 = i23 + 8;
                                    i33 |= i43;
                                    Unsafe unsafe5 = unsafe2;
                                    iMergeGroupField = i24;
                                    bArr5 = bArr2;
                                    unsafe4 = unsafe5;
                                    i29 = i11;
                                    registers6 = registers3;
                                    i35 = i44;
                                    i32 = i22;
                                    i30 = i41;
                                    i31 = i18;
                                    break;
                                } else {
                                    messageSchema = messageSchema2;
                                    unsafe = unsafe2;
                                    i14 = i44;
                                    i20 = i34;
                                    i16 = i23;
                                    i17 = i41;
                                    registers2 = registers3;
                                    i19 = i22;
                                    if (i20 != i12 && i12 != 0) {
                                        t10 = t3;
                                        i13 = i11;
                                        i34 = i20;
                                        i15 = i16;
                                        break;
                                    } else {
                                        if (!messageSchema.hasExtensions || registers2.extensionRegistry == ExtensionRegistryLite.getEmptyRegistry()) {
                                            t11 = t3;
                                            iDecodeUnknownField = ArrayDecoders.decodeUnknownField(i20, bArr, i16, i11, getMutableUnknownFields(t11), registers);
                                            i21 = i11;
                                        } else {
                                            iDecodeUnknownField = ArrayDecoders.decodeExtensionOrUnknownField(i20, bArr, i16, i11, t3, messageSchema.defaultInstance, messageSchema.unknownFieldSchema, registers2);
                                            t11 = t3;
                                            i21 = i11;
                                        }
                                        iMergeGroupField = iDecodeUnknownField;
                                        bArr5 = bArr;
                                        i34 = i20;
                                        t13 = t11;
                                        i29 = i21;
                                        i32 = i19;
                                        messageSchema2 = messageSchema;
                                        i35 = i14;
                                        i30 = i17;
                                        i31 = i18;
                                        unsafe4 = unsafe;
                                        registers6 = registers;
                                        break;
                                    }
                                }
                                break;
                            case 1:
                                registers3 = registers;
                                i22 = iPositionForFieldNumber;
                                unsafe2 = unsafe4;
                                i23 = i37;
                                long j12 = j10;
                                bArr2 = bArr;
                                if (i39 == 5) {
                                    UnsafeUtil.putFloat(t13, j12, ArrayDecoders.decodeFloat(bArr2, i23));
                                    i24 = i23 + 4;
                                    i33 |= i43;
                                    Unsafe unsafe52 = unsafe2;
                                    iMergeGroupField = i24;
                                    bArr5 = bArr2;
                                    unsafe4 = unsafe52;
                                    i29 = i11;
                                    registers6 = registers3;
                                    i35 = i44;
                                    i32 = i22;
                                    i30 = i41;
                                    i31 = i18;
                                    break;
                                } else {
                                    messageSchema = messageSchema2;
                                    unsafe = unsafe2;
                                    i14 = i44;
                                    i20 = i34;
                                    i16 = i23;
                                    i17 = i41;
                                    registers2 = registers3;
                                    i19 = i22;
                                    if (i20 != i12) {
                                    }
                                    if (messageSchema.hasExtensions) {
                                        t11 = t3;
                                        iDecodeUnknownField = ArrayDecoders.decodeUnknownField(i20, bArr, i16, i11, getMutableUnknownFields(t11), registers);
                                        i21 = i11;
                                        iMergeGroupField = iDecodeUnknownField;
                                        bArr5 = bArr;
                                        i34 = i20;
                                        t13 = t11;
                                        i29 = i21;
                                        i32 = i19;
                                        messageSchema2 = messageSchema;
                                        i35 = i14;
                                        i30 = i17;
                                        i31 = i18;
                                        unsafe4 = unsafe;
                                        registers6 = registers;
                                        break;
                                    }
                                }
                                break;
                            case 2:
                            case 3:
                                registers3 = registers;
                                i22 = iPositionForFieldNumber;
                                unsafe3 = unsafe4;
                                i23 = i37;
                                long j13 = j10;
                                if (i39 == 0) {
                                    int iDecodeVarint642 = ArrayDecoders.decodeVarint64(bArr, i23, registers3);
                                    T t14 = t13;
                                    unsafe3.putLong(t14, j13, registers3.long1);
                                    t13 = t14;
                                    i33 |= i43;
                                    i29 = i11;
                                    bArr5 = bArr;
                                    i32 = i22;
                                    i30 = i41;
                                    i31 = i18;
                                    unsafe4 = unsafe3;
                                    iMergeGroupField = iDecodeVarint642;
                                    registers6 = registers3;
                                    i35 = i44;
                                    break;
                                } else {
                                    unsafe2 = unsafe3;
                                    messageSchema = messageSchema2;
                                    unsafe = unsafe2;
                                    i14 = i44;
                                    i20 = i34;
                                    i16 = i23;
                                    i17 = i41;
                                    registers2 = registers3;
                                    i19 = i22;
                                    if (i20 != i12) {
                                    }
                                    if (messageSchema.hasExtensions) {
                                    }
                                }
                                break;
                            case 4:
                            case 11:
                                registers3 = registers;
                                i22 = iPositionForFieldNumber;
                                unsafe3 = unsafe4;
                                i23 = i37;
                                long j14 = j10;
                                if (i39 == 0) {
                                    int iDecodeVarint322 = ArrayDecoders.decodeVarint32(bArr, i23, registers3);
                                    unsafe3.putInt(t13, j14, registers3.int1);
                                    i33 |= i43;
                                    unsafe4 = unsafe3;
                                    bArr5 = bArr;
                                    i29 = i11;
                                    iMergeGroupField = iDecodeVarint322;
                                    registers6 = registers3;
                                    i35 = i44;
                                    i32 = i22;
                                    i30 = i41;
                                    i31 = i18;
                                    break;
                                } else {
                                    unsafe2 = unsafe3;
                                    messageSchema = messageSchema2;
                                    unsafe = unsafe2;
                                    i14 = i44;
                                    i20 = i34;
                                    i16 = i23;
                                    i17 = i41;
                                    registers2 = registers3;
                                    i19 = i22;
                                    if (i20 != i12) {
                                    }
                                    if (messageSchema.hasExtensions) {
                                    }
                                }
                                break;
                            case 5:
                            case 14:
                                T t15 = t13;
                                i22 = iPositionForFieldNumber;
                                i23 = i37;
                                long j15 = j10;
                                if (i39 == 1) {
                                    Unsafe unsafe6 = unsafe4;
                                    registers3 = registers;
                                    unsafe6.putLong(t15, j15, ArrayDecoders.decodeFixed64(bArr, i23));
                                    t13 = t15;
                                    iMergeGroupField = i23 + 8;
                                    i33 |= i43;
                                    unsafe4 = unsafe6;
                                    bArr5 = bArr;
                                    i29 = i11;
                                    registers6 = registers3;
                                    i35 = i44;
                                    i32 = i22;
                                    i30 = i41;
                                    i31 = i18;
                                    break;
                                } else {
                                    unsafe3 = unsafe4;
                                    registers3 = registers;
                                    unsafe2 = unsafe3;
                                    messageSchema = messageSchema2;
                                    unsafe = unsafe2;
                                    i14 = i44;
                                    i20 = i34;
                                    i16 = i23;
                                    i17 = i41;
                                    registers2 = registers3;
                                    i19 = i22;
                                    if (i20 != i12) {
                                    }
                                    if (messageSchema.hasExtensions) {
                                    }
                                }
                                break;
                            case 6:
                            case 13:
                                registers4 = registers;
                                t12 = t13;
                                i22 = iPositionForFieldNumber;
                                i23 = i37;
                                long j16 = j10;
                                bArr3 = bArr;
                                if (i39 == 5) {
                                    unsafe4.putInt(t12, j16, ArrayDecoders.decodeFixed32(bArr3, i23));
                                    iDecodeVarint64 = i23 + 4;
                                    i33 |= i43;
                                    i29 = i11;
                                    registers6 = registers4;
                                    i32 = i22;
                                    i30 = i41;
                                    i31 = i18;
                                    iMergeGroupField = iDecodeVarint64;
                                    bArr5 = bArr3;
                                    t13 = t12;
                                    i35 = i44;
                                    break;
                                } else {
                                    registers3 = registers4;
                                    unsafe2 = unsafe4;
                                    messageSchema = messageSchema2;
                                    unsafe = unsafe2;
                                    i14 = i44;
                                    i20 = i34;
                                    i16 = i23;
                                    i17 = i41;
                                    registers2 = registers3;
                                    i19 = i22;
                                    if (i20 != i12) {
                                    }
                                    if (messageSchema.hasExtensions) {
                                    }
                                }
                                break;
                            case 7:
                                registers4 = registers;
                                t12 = t13;
                                i22 = iPositionForFieldNumber;
                                i25 = i37;
                                long j17 = j10;
                                bArr3 = bArr;
                                if (i39 == 0) {
                                    iDecodeVarint64 = ArrayDecoders.decodeVarint64(bArr3, i25, registers4);
                                    UnsafeUtil.putBoolean(t12, j17, registers4.long1 != 0);
                                    i33 |= i43;
                                    i29 = i11;
                                    registers6 = registers4;
                                    i32 = i22;
                                    i30 = i41;
                                    i31 = i18;
                                    iMergeGroupField = iDecodeVarint64;
                                    bArr5 = bArr3;
                                    t13 = t12;
                                    i35 = i44;
                                    break;
                                } else {
                                    registers3 = registers4;
                                    unsafe2 = unsafe4;
                                    i23 = i25;
                                    messageSchema = messageSchema2;
                                    unsafe = unsafe2;
                                    i14 = i44;
                                    i20 = i34;
                                    i16 = i23;
                                    i17 = i41;
                                    registers2 = registers3;
                                    i19 = i22;
                                    if (i20 != i12) {
                                    }
                                    if (messageSchema.hasExtensions) {
                                    }
                                }
                                break;
                            case 8:
                                registers4 = registers;
                                t12 = t13;
                                i22 = iPositionForFieldNumber;
                                i25 = i37;
                                long j18 = j10;
                                bArr3 = bArr;
                                if (i39 == 2) {
                                    iDecodeVarint64 = isEnforceUtf8(i40) ? ArrayDecoders.decodeStringRequireUtf8(bArr3, i25, registers4) : ArrayDecoders.decodeString(bArr3, i25, registers4);
                                    unsafe4.putObject(t12, j18, registers4.object1);
                                    i33 |= i43;
                                    i29 = i11;
                                    registers6 = registers4;
                                    i32 = i22;
                                    i30 = i41;
                                    i31 = i18;
                                    iMergeGroupField = iDecodeVarint64;
                                    bArr5 = bArr3;
                                    t13 = t12;
                                    i35 = i44;
                                    break;
                                } else {
                                    registers3 = registers4;
                                    unsafe2 = unsafe4;
                                    i23 = i25;
                                    messageSchema = messageSchema2;
                                    unsafe = unsafe2;
                                    i14 = i44;
                                    i20 = i34;
                                    i16 = i23;
                                    i17 = i41;
                                    registers2 = registers3;
                                    i19 = i22;
                                    if (i20 != i12) {
                                    }
                                    if (messageSchema.hasExtensions) {
                                    }
                                }
                                break;
                            case 9:
                                i22 = iPositionForFieldNumber;
                                Unsafe unsafe7 = unsafe4;
                                if (i39 == 2) {
                                    T t16 = t13;
                                    Object objMutableMessageFieldForMerge = messageSchema2.mutableMessageFieldForMerge(t16, i22);
                                    t12 = t16;
                                    unsafe4 = unsafe7;
                                    iDecodeVarint64 = ArrayDecoders.mergeMessageField(objMutableMessageFieldForMerge, messageSchema2.getMessageFieldSchema(i22), bArr, i37, i11, registers);
                                    bArr3 = bArr;
                                    registers4 = registers;
                                    messageSchema2.storeMessageField(t12, i22, objMutableMessageFieldForMerge);
                                    i33 |= i43;
                                    i29 = i11;
                                    registers6 = registers4;
                                    i32 = i22;
                                    i30 = i41;
                                    i31 = i18;
                                    iMergeGroupField = iDecodeVarint64;
                                    bArr5 = bArr3;
                                    t13 = t12;
                                    i35 = i44;
                                    break;
                                } else {
                                    t12 = t13;
                                    bArr3 = bArr;
                                    unsafe4 = unsafe7;
                                    i25 = i37;
                                    registers4 = registers;
                                    registers3 = registers4;
                                    unsafe2 = unsafe4;
                                    i23 = i25;
                                    messageSchema = messageSchema2;
                                    unsafe = unsafe2;
                                    i14 = i44;
                                    i20 = i34;
                                    i16 = i23;
                                    i17 = i41;
                                    registers2 = registers3;
                                    i19 = i22;
                                    if (i20 != i12) {
                                    }
                                    if (messageSchema.hasExtensions) {
                                    }
                                }
                                break;
                            case 10:
                                bArr4 = bArr;
                                i22 = iPositionForFieldNumber;
                                unsafe3 = unsafe4;
                                i26 = i37;
                                long j19 = j10;
                                registers5 = registers;
                                if (i39 == 2) {
                                    iMergeGroupField = ArrayDecoders.decodeBytes(bArr4, i26, registers5);
                                    unsafe3.putObject(t13, j19, registers5.object1);
                                    i33 |= i43;
                                    i29 = i11;
                                    registers6 = registers5;
                                    i32 = i22;
                                    i30 = i41;
                                    i31 = i18;
                                    unsafe4 = unsafe3;
                                    bArr5 = bArr4;
                                    i35 = i44;
                                    break;
                                } else {
                                    registers3 = registers5;
                                    i23 = i26;
                                    unsafe2 = unsafe3;
                                    messageSchema = messageSchema2;
                                    unsafe = unsafe2;
                                    i14 = i44;
                                    i20 = i34;
                                    i16 = i23;
                                    i17 = i41;
                                    registers2 = registers3;
                                    i19 = i22;
                                    if (i20 != i12) {
                                    }
                                    if (messageSchema.hasExtensions) {
                                    }
                                }
                                break;
                            case 12:
                                bArr4 = bArr;
                                i22 = iPositionForFieldNumber;
                                unsafe3 = unsafe4;
                                i26 = i37;
                                long j20 = j10;
                                registers5 = registers;
                                if (i39 == 0) {
                                    iMergeGroupField = ArrayDecoders.decodeVarint32(bArr4, i26, registers5);
                                    int i45 = registers5.int1;
                                    Internal.EnumVerifier enumFieldVerifier = messageSchema2.getEnumFieldVerifier(i22);
                                    if (!isLegacyEnumIsClosed(i40) || enumFieldVerifier == null || enumFieldVerifier.isInRange(i45)) {
                                        unsafe3.putInt(t13, j20, i45);
                                        i33 |= i43;
                                        i29 = i11;
                                        registers6 = registers5;
                                        i32 = i22;
                                        i30 = i41;
                                        i31 = i18;
                                        unsafe4 = unsafe3;
                                        bArr5 = bArr4;
                                        i35 = i44;
                                        break;
                                    } else {
                                        getMutableUnknownFields(t13).storeField(i34, Long.valueOf(i45));
                                        i29 = i11;
                                        registers6 = registers5;
                                        i32 = i22;
                                        i30 = i41;
                                        i31 = i18;
                                        unsafe4 = unsafe3;
                                        bArr5 = bArr4;
                                        i35 = i44;
                                    }
                                } else {
                                    registers3 = registers5;
                                    i23 = i26;
                                    unsafe2 = unsafe3;
                                    messageSchema = messageSchema2;
                                    unsafe = unsafe2;
                                    i14 = i44;
                                    i20 = i34;
                                    i16 = i23;
                                    i17 = i41;
                                    registers2 = registers3;
                                    i19 = i22;
                                    if (i20 != i12) {
                                    }
                                    if (messageSchema.hasExtensions) {
                                    }
                                }
                                break;
                            case 15:
                                bArr4 = bArr;
                                i22 = iPositionForFieldNumber;
                                unsafe3 = unsafe4;
                                i26 = i37;
                                long j21 = j10;
                                registers5 = registers;
                                if (i39 == 0) {
                                    iMergeGroupField = ArrayDecoders.decodeVarint32(bArr4, i26, registers5);
                                    unsafe3.putInt(t13, j21, CodedInputStream.decodeZigZag32(registers5.int1));
                                    i33 |= i43;
                                    i29 = i11;
                                    registers6 = registers5;
                                    i32 = i22;
                                    i30 = i41;
                                    i31 = i18;
                                    unsafe4 = unsafe3;
                                    bArr5 = bArr4;
                                    i35 = i44;
                                    break;
                                } else {
                                    registers3 = registers5;
                                    i23 = i26;
                                    unsafe2 = unsafe3;
                                    messageSchema = messageSchema2;
                                    unsafe = unsafe2;
                                    i14 = i44;
                                    i20 = i34;
                                    i16 = i23;
                                    i17 = i41;
                                    registers2 = registers3;
                                    i19 = i22;
                                    if (i20 != i12) {
                                    }
                                    if (messageSchema.hasExtensions) {
                                    }
                                }
                                break;
                            case 16:
                                bArr4 = bArr;
                                i22 = iPositionForFieldNumber;
                                i26 = i37;
                                if (i39 == 0) {
                                    int iDecodeVarint643 = ArrayDecoders.decodeVarint64(bArr4, i26, registers);
                                    T t17 = t13;
                                    Unsafe unsafe8 = unsafe4;
                                    registers5 = registers;
                                    unsafe8.putLong(t17, j10, CodedInputStream.decodeZigZag64(registers.long1));
                                    unsafe3 = unsafe8;
                                    t13 = t17;
                                    i33 |= i43;
                                    i29 = i11;
                                    iMergeGroupField = iDecodeVarint643;
                                    registers6 = registers5;
                                    i32 = i22;
                                    i30 = i41;
                                    i31 = i18;
                                    unsafe4 = unsafe3;
                                    bArr5 = bArr4;
                                    i35 = i44;
                                    break;
                                } else {
                                    Unsafe unsafe9 = unsafe4;
                                    registers5 = registers;
                                    unsafe3 = unsafe9;
                                    registers3 = registers5;
                                    i23 = i26;
                                    unsafe2 = unsafe3;
                                    messageSchema = messageSchema2;
                                    unsafe = unsafe2;
                                    i14 = i44;
                                    i20 = i34;
                                    i16 = i23;
                                    i17 = i41;
                                    registers2 = registers3;
                                    i19 = i22;
                                    if (i20 != i12) {
                                    }
                                    if (messageSchema.hasExtensions) {
                                    }
                                }
                                break;
                            case 17:
                                if (i39 == 3) {
                                    Object objMutableMessageFieldForMerge2 = messageSchema2.mutableMessageFieldForMerge(t13, iPositionForFieldNumber);
                                    i22 = iPositionForFieldNumber;
                                    iMergeGroupField = ArrayDecoders.mergeGroupField(objMutableMessageFieldForMerge2, messageSchema2.getMessageFieldSchema(iPositionForFieldNumber), bArr, i37, i11, (i18 << 3) | 4, registers);
                                    messageSchema2.storeMessageField(t13, i22, objMutableMessageFieldForMerge2);
                                    i33 |= i43;
                                    i29 = i11;
                                    registers6 = registers;
                                    bArr5 = bArr;
                                    i35 = i44;
                                    i32 = i22;
                                    i30 = i41;
                                    i31 = i18;
                                    break;
                                } else {
                                    i22 = iPositionForFieldNumber;
                                    registers3 = registers;
                                    unsafe2 = unsafe4;
                                    i23 = i37;
                                    messageSchema = messageSchema2;
                                    unsafe = unsafe2;
                                    i14 = i44;
                                    i20 = i34;
                                    i16 = i23;
                                    i17 = i41;
                                    registers2 = registers3;
                                    i19 = i22;
                                    if (i20 != i12) {
                                    }
                                    if (messageSchema.hasExtensions) {
                                    }
                                }
                                break;
                            default:
                                registers3 = registers;
                                i22 = iPositionForFieldNumber;
                                unsafe2 = unsafe4;
                                i23 = i37;
                                messageSchema = messageSchema2;
                                unsafe = unsafe2;
                                i14 = i44;
                                i20 = i34;
                                i16 = i23;
                                i17 = i41;
                                registers2 = registers3;
                                i19 = i22;
                                if (i20 != i12) {
                                }
                                if (messageSchema.hasExtensions) {
                                }
                                break;
                        }
                    } else {
                        int i46 = i35;
                        i18 = i38;
                        i19 = iPositionForFieldNumber;
                        Unsafe unsafe10 = unsafe4;
                        if (iType != 27) {
                            i27 = i37;
                            if (iType <= 49) {
                                unsafe = unsafe10;
                                i14 = i46;
                                i17 = i41;
                                i28 = i33;
                                int repeatedField = messageSchema2.parseRepeatedField(t3, bArr, i27, i11, i34, i18, i39, i19, i40, iType, jOffset, registers);
                                i34 = i34;
                                if (repeatedField != i27) {
                                    messageSchema2 = this;
                                    t13 = t3;
                                    bArr5 = bArr;
                                    i29 = i11;
                                    iMergeGroupField = repeatedField;
                                    i32 = i19;
                                    i35 = i14;
                                    i33 = i28;
                                    i30 = i17;
                                    i31 = i18;
                                    unsafe4 = unsafe;
                                    registers6 = registers;
                                } else {
                                    messageSchema = this;
                                    i16 = repeatedField;
                                }
                            } else {
                                i34 = i34;
                                unsafe = unsafe10;
                                i14 = i46;
                                i17 = i41;
                                i28 = i33;
                                if (iType != 50) {
                                    registers2 = registers;
                                    int oneofField = parseOneofField(t3, bArr, i27, i11, i34, i18, i39, i40, iType, jOffset, i19, registers2);
                                    messageSchema = this;
                                    i20 = i34;
                                    i19 = i19;
                                    if (oneofField != i27) {
                                        t13 = t3;
                                        bArr5 = bArr;
                                        i29 = i11;
                                        iMergeGroupField = oneofField;
                                        i32 = i19;
                                        registers6 = registers2;
                                        i35 = i14;
                                        i33 = i28;
                                        i30 = i17;
                                        i31 = i18;
                                        i34 = i20;
                                        messageSchema2 = messageSchema;
                                    } else {
                                        i16 = oneofField;
                                        i33 = i28;
                                        if (i20 != i12) {
                                        }
                                        if (messageSchema.hasExtensions) {
                                        }
                                    }
                                } else if (i39 == 2) {
                                    int mapField = parseMapField(t3, bArr, i27, i11, i19, jOffset, registers);
                                    i19 = i19;
                                    if (mapField != i27) {
                                        messageSchema2 = this;
                                        t13 = t3;
                                        bArr5 = bArr;
                                        i29 = i11;
                                        registers6 = registers;
                                        iMergeGroupField = mapField;
                                        i32 = i19;
                                        i35 = i14;
                                        i33 = i28;
                                        i30 = i17;
                                        i31 = i18;
                                    } else {
                                        messageSchema = this;
                                        i16 = mapField;
                                    }
                                } else {
                                    messageSchema = this;
                                    i16 = i27;
                                }
                                unsafe4 = unsafe;
                            }
                        } else if (i39 == 2) {
                            Internal.ProtobufList protobufListMutableCopyWithCapacity2 = (Internal.ProtobufList) unsafe10.getObject(t13, jOffset);
                            if (!protobufListMutableCopyWithCapacity2.isModifiable()) {
                                int size = protobufListMutableCopyWithCapacity2.size();
                                protobufListMutableCopyWithCapacity2 = protobufListMutableCopyWithCapacity2.mutableCopyWithCapacity2(size == 0 ? 10 : size * 2);
                                unsafe10.putObject(t13, jOffset, protobufListMutableCopyWithCapacity2);
                            }
                            unsafe4 = unsafe10;
                            registers6 = registers;
                            i29 = i11;
                            iMergeGroupField = ArrayDecoders.decodeMessageList(messageSchema2.getMessageFieldSchema(i19), i34, bArr, i37, i11, protobufListMutableCopyWithCapacity2, registers6);
                            i32 = i19;
                            i35 = i46;
                            i30 = i41;
                            i31 = i18;
                            t13 = t3;
                            bArr5 = bArr;
                        } else {
                            unsafe = unsafe10;
                            i14 = i46;
                            i27 = i37;
                            i17 = i41;
                            i28 = i33;
                            messageSchema = this;
                            i16 = i27;
                        }
                        i20 = i34;
                        i33 = i28;
                    }
                }
                registers2 = registers;
                if (i20 != i12) {
                }
                if (messageSchema.hasExtensions) {
                }
            } else {
                t10 = t13;
                i13 = i29;
                i14 = i35;
                unsafe = unsafe4;
                messageSchema = messageSchema2;
                i15 = iMergeGroupField;
            }
        }
        int i47 = i14;
        if (i47 != 1048575) {
            unsafe.putInt(t10, i47, i33);
        }
        UnknownFieldSetLite unknownFieldSetLite = null;
        for (int i48 = messageSchema.checkInitializedCount; i48 < messageSchema.repeatedFieldOffsetStart; i48++) {
            unknownFieldSetLite = (UnknownFieldSetLite) messageSchema.filterMapUnknownEnumValues(t10, messageSchema.intArray[i48], unknownFieldSetLite, messageSchema.unknownFieldSchema, t3);
        }
        T t18 = t10;
        MessageSchema<T> messageSchema3 = messageSchema;
        if (unknownFieldSetLite != null) {
            messageSchema3.unknownFieldSchema.setBuilderToMessage(t18, unknownFieldSetLite);
        }
        if (i12 == 0) {
            if (i15 != i13) {
                throw InvalidProtocolBufferException.parseFailure();
            }
        } else if (i15 > i13 || i34 != i12) {
            throw InvalidProtocolBufferException.parseFailure();
        }
        return i15;
    }

    @Override // com.google.protobuf.Schema
    public void writeTo(T t3, Writer writer) throws IOException {
        if (writer.fieldOrder() == Writer.FieldOrder.DESCENDING) {
            writeFieldsInDescendingOrder(t3, writer);
        } else {
            writeFieldsInAscendingOrder(t3, writer);
        }
    }

    private boolean isFieldPresent(T t3, int i10) {
        boolean zEquals;
        int iPresenceMaskAndOffsetAt = presenceMaskAndOffsetAt(i10);
        long j10 = 1048575 & iPresenceMaskAndOffsetAt;
        if (j10 != 1048575) {
            return (UnsafeUtil.getInt(t3, j10) & (1 << (iPresenceMaskAndOffsetAt >>> 20))) != 0;
        }
        int iTypeAndOffsetAt = typeAndOffsetAt(i10);
        long jOffset = offset(iTypeAndOffsetAt);
        switch (type(iTypeAndOffsetAt)) {
            case 0:
                return Double.doubleToRawLongBits(UnsafeUtil.getDouble(t3, jOffset)) != 0;
            case 1:
                return Float.floatToRawIntBits(UnsafeUtil.getFloat(t3, jOffset)) != 0;
            case 2:
                return UnsafeUtil.getLong(t3, jOffset) != 0;
            case 3:
                return UnsafeUtil.getLong(t3, jOffset) != 0;
            case 4:
                return UnsafeUtil.getInt(t3, jOffset) != 0;
            case 5:
                return UnsafeUtil.getLong(t3, jOffset) != 0;
            case 6:
                return UnsafeUtil.getInt(t3, jOffset) != 0;
            case 7:
                return UnsafeUtil.getBoolean(t3, jOffset);
            case 8:
                Object object = UnsafeUtil.getObject(t3, jOffset);
                if (object instanceof String) {
                    zEquals = ((String) object).isEmpty();
                    break;
                } else {
                    if (!(object instanceof ByteString)) {
                        throw new IllegalArgumentException();
                    }
                    zEquals = ByteString.EMPTY.equals(object);
                    break;
                }
            case 9:
                return UnsafeUtil.getObject(t3, jOffset) != null;
            case 10:
                zEquals = ByteString.EMPTY.equals(UnsafeUtil.getObject(t3, jOffset));
                break;
            case 11:
                return UnsafeUtil.getInt(t3, jOffset) != 0;
            case 12:
                return UnsafeUtil.getInt(t3, jOffset) != 0;
            case 13:
                return UnsafeUtil.getInt(t3, jOffset) != 0;
            case 14:
                return UnsafeUtil.getLong(t3, jOffset) != 0;
            case 15:
                return UnsafeUtil.getInt(t3, jOffset) != 0;
            case 16:
                return UnsafeUtil.getLong(t3, jOffset) != 0;
            case 17:
                return UnsafeUtil.getObject(t3, jOffset) != null;
            default:
                throw new IllegalArgumentException();
        }
        return !zEquals;
    }

    private int positionForFieldNumber(int i10, int i11) {
        if (i10 < this.minFieldNumber || i10 > this.maxFieldNumber) {
            return -1;
        }
        return slowPositionForFieldNumber(i10, i11);
    }

    @Override // com.google.protobuf.Schema
    public void mergeFrom(T t3, Reader reader, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        extensionRegistryLite.getClass();
        checkMutable(t3);
        mergeFromHelper(this.unknownFieldSchema, this.extensionSchema, t3, reader, extensionRegistryLite);
    }

    private boolean equals(T t3, T t10, int i10) {
        int iTypeAndOffsetAt = typeAndOffsetAt(i10);
        long jOffset = offset(iTypeAndOffsetAt);
        switch (type(iTypeAndOffsetAt)) {
            case 0:
                if (!arePresentForEquals(t3, t10, i10) || Double.doubleToLongBits(UnsafeUtil.getDouble(t3, jOffset)) != Double.doubleToLongBits(UnsafeUtil.getDouble(t10, jOffset))) {
                }
                break;
            case 1:
                if (!arePresentForEquals(t3, t10, i10) || Float.floatToIntBits(UnsafeUtil.getFloat(t3, jOffset)) != Float.floatToIntBits(UnsafeUtil.getFloat(t10, jOffset))) {
                }
                break;
            case 2:
                if (!arePresentForEquals(t3, t10, i10) || UnsafeUtil.getLong(t3, jOffset) != UnsafeUtil.getLong(t10, jOffset)) {
                }
                break;
            case 3:
                if (!arePresentForEquals(t3, t10, i10) || UnsafeUtil.getLong(t3, jOffset) != UnsafeUtil.getLong(t10, jOffset)) {
                }
                break;
            case 4:
                if (!arePresentForEquals(t3, t10, i10) || UnsafeUtil.getInt(t3, jOffset) != UnsafeUtil.getInt(t10, jOffset)) {
                }
                break;
            case 5:
                if (!arePresentForEquals(t3, t10, i10) || UnsafeUtil.getLong(t3, jOffset) != UnsafeUtil.getLong(t10, jOffset)) {
                }
                break;
            case 6:
                if (!arePresentForEquals(t3, t10, i10) || UnsafeUtil.getInt(t3, jOffset) != UnsafeUtil.getInt(t10, jOffset)) {
                }
                break;
            case 7:
                if (!arePresentForEquals(t3, t10, i10) || UnsafeUtil.getBoolean(t3, jOffset) != UnsafeUtil.getBoolean(t10, jOffset)) {
                }
                break;
            case 8:
                if (!arePresentForEquals(t3, t10, i10) || !SchemaUtil.safeEquals(UnsafeUtil.getObject(t3, jOffset), UnsafeUtil.getObject(t10, jOffset))) {
                }
                break;
            case 9:
                if (!arePresentForEquals(t3, t10, i10) || !SchemaUtil.safeEquals(UnsafeUtil.getObject(t3, jOffset), UnsafeUtil.getObject(t10, jOffset))) {
                }
                break;
            case 10:
                if (!arePresentForEquals(t3, t10, i10) || !SchemaUtil.safeEquals(UnsafeUtil.getObject(t3, jOffset), UnsafeUtil.getObject(t10, jOffset))) {
                }
                break;
            case 11:
                if (!arePresentForEquals(t3, t10, i10) || UnsafeUtil.getInt(t3, jOffset) != UnsafeUtil.getInt(t10, jOffset)) {
                }
                break;
            case 12:
                if (!arePresentForEquals(t3, t10, i10) || UnsafeUtil.getInt(t3, jOffset) != UnsafeUtil.getInt(t10, jOffset)) {
                }
                break;
            case 13:
                if (!arePresentForEquals(t3, t10, i10) || UnsafeUtil.getInt(t3, jOffset) != UnsafeUtil.getInt(t10, jOffset)) {
                }
                break;
            case 14:
                if (!arePresentForEquals(t3, t10, i10) || UnsafeUtil.getLong(t3, jOffset) != UnsafeUtil.getLong(t10, jOffset)) {
                }
                break;
            case 15:
                if (!arePresentForEquals(t3, t10, i10) || UnsafeUtil.getInt(t3, jOffset) != UnsafeUtil.getInt(t10, jOffset)) {
                }
                break;
            case 16:
                if (!arePresentForEquals(t3, t10, i10) || UnsafeUtil.getLong(t3, jOffset) != UnsafeUtil.getLong(t10, jOffset)) {
                }
                break;
            case 17:
                if (!arePresentForEquals(t3, t10, i10) || !SchemaUtil.safeEquals(UnsafeUtil.getObject(t3, jOffset), UnsafeUtil.getObject(t10, jOffset))) {
                }
                break;
            case 51:
            case 52:
            case EACTags.SEX /* 53 */:
            case EACTags.CURRENCY_EXPONENT /* 54 */:
            case 55:
            case 56:
            case 57:
            case EACTags.DYNAMIC_INTERNAL_AUTHENTIFICATION /* 58 */:
            case EACTags.DYNAMIC_EXTERNAL_AUTHENTIFICATION /* 59 */:
            case 60:
            case 61:
            case 62:
            case 63:
            case 64:
            case EACTags.ELEMENT_LIST /* 65 */:
            case EACTags.ADDRESS /* 66 */:
            case EACTags.CARDHOLDER_HANDWRITTEN_SIGNATURE /* 67 */:
            case 68:
                if (!isOneofCaseEqual(t3, t10, i10) || !SchemaUtil.safeEquals(UnsafeUtil.getObject(t3, jOffset), UnsafeUtil.getObject(t10, jOffset))) {
                }
                break;
        }
        return true;
    }

    @Override // com.google.protobuf.Schema
    public void mergeFrom(T t3, byte[] bArr, int i10, int i11, ArrayDecoders.Registers registers) throws IOException {
        parseMessage(t3, bArr, i10, i11, 0, registers);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static boolean isInitialized(Object obj, int i10, Schema schema) {
        return schema.isInitialized(UnsafeUtil.getObject(obj, offset(i10)));
    }
}
