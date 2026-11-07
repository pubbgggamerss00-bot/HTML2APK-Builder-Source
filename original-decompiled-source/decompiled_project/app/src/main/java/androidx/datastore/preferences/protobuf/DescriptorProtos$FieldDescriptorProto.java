package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.DescriptorProtos$FieldOptions;
import androidx.datastore.preferences.protobuf.GeneratedMessageLite;
import androidx.datastore.preferences.protobuf.d0;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* loaded from: classes.dex */
public final class DescriptorProtos$FieldDescriptorProto extends GeneratedMessageLite<DescriptorProtos$FieldDescriptorProto, Builder> implements DescriptorProtos$FieldDescriptorProtoOrBuilder {
    private static final DescriptorProtos$FieldDescriptorProto DEFAULT_INSTANCE;
    public static final int DEFAULT_VALUE_FIELD_NUMBER = 7;
    public static final int EXTENDEE_FIELD_NUMBER = 2;
    public static final int JSON_NAME_FIELD_NUMBER = 10;
    public static final int LABEL_FIELD_NUMBER = 4;
    public static final int NAME_FIELD_NUMBER = 1;
    public static final int NUMBER_FIELD_NUMBER = 3;
    public static final int ONEOF_INDEX_FIELD_NUMBER = 9;
    public static final int OPTIONS_FIELD_NUMBER = 8;
    private static volatile h1<DescriptorProtos$FieldDescriptorProto> PARSER = null;
    public static final int PROTO3_OPTIONAL_FIELD_NUMBER = 17;
    public static final int TYPE_FIELD_NUMBER = 5;
    public static final int TYPE_NAME_FIELD_NUMBER = 6;
    private int bitField0_;
    private int number_;
    private int oneofIndex_;
    private DescriptorProtos$FieldOptions options_;
    private boolean proto3Optional_;
    private byte memoizedIsInitialized = 2;
    private String name_ = "";
    private int label_ = 1;
    private int type_ = 1;
    private String typeName_ = "";
    private String extendee_ = "";
    private String defaultValue_ = "";
    private String jsonName_ = "";

    public static final class Builder extends GeneratedMessageLite.Builder<DescriptorProtos$FieldDescriptorProto, Builder> implements DescriptorProtos$FieldDescriptorProtoOrBuilder {
        public Builder clearDefaultValue() {
            copyOnWrite();
            ((DescriptorProtos$FieldDescriptorProto) this.instance).clearDefaultValue();
            return this;
        }

        public Builder clearExtendee() {
            copyOnWrite();
            ((DescriptorProtos$FieldDescriptorProto) this.instance).clearExtendee();
            return this;
        }

        public Builder clearJsonName() {
            copyOnWrite();
            ((DescriptorProtos$FieldDescriptorProto) this.instance).clearJsonName();
            return this;
        }

        public Builder clearLabel() {
            copyOnWrite();
            ((DescriptorProtos$FieldDescriptorProto) this.instance).clearLabel();
            return this;
        }

        public Builder clearName() {
            copyOnWrite();
            ((DescriptorProtos$FieldDescriptorProto) this.instance).clearName();
            return this;
        }

        public Builder clearNumber() {
            copyOnWrite();
            ((DescriptorProtos$FieldDescriptorProto) this.instance).clearNumber();
            return this;
        }

        public Builder clearOneofIndex() {
            copyOnWrite();
            ((DescriptorProtos$FieldDescriptorProto) this.instance).clearOneofIndex();
            return this;
        }

        public Builder clearOptions() {
            copyOnWrite();
            ((DescriptorProtos$FieldDescriptorProto) this.instance).clearOptions();
            return this;
        }

        public Builder clearProto3Optional() {
            copyOnWrite();
            ((DescriptorProtos$FieldDescriptorProto) this.instance).clearProto3Optional();
            return this;
        }

        public Builder clearType() {
            copyOnWrite();
            ((DescriptorProtos$FieldDescriptorProto) this.instance).clearType();
            return this;
        }

        public Builder clearTypeName() {
            copyOnWrite();
            ((DescriptorProtos$FieldDescriptorProto) this.instance).clearTypeName();
            return this;
        }

        @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$FieldDescriptorProtoOrBuilder
        public String getDefaultValue() {
            return ((DescriptorProtos$FieldDescriptorProto) this.instance).getDefaultValue();
        }

        @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$FieldDescriptorProtoOrBuilder
        public j getDefaultValueBytes() {
            return ((DescriptorProtos$FieldDescriptorProto) this.instance).getDefaultValueBytes();
        }

        @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$FieldDescriptorProtoOrBuilder
        public String getExtendee() {
            return ((DescriptorProtos$FieldDescriptorProto) this.instance).getExtendee();
        }

        @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$FieldDescriptorProtoOrBuilder
        public j getExtendeeBytes() {
            return ((DescriptorProtos$FieldDescriptorProto) this.instance).getExtendeeBytes();
        }

        @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$FieldDescriptorProtoOrBuilder
        public String getJsonName() {
            return ((DescriptorProtos$FieldDescriptorProto) this.instance).getJsonName();
        }

        @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$FieldDescriptorProtoOrBuilder
        public j getJsonNameBytes() {
            return ((DescriptorProtos$FieldDescriptorProto) this.instance).getJsonNameBytes();
        }

        @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$FieldDescriptorProtoOrBuilder
        public a getLabel() {
            return ((DescriptorProtos$FieldDescriptorProto) this.instance).getLabel();
        }

        @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$FieldDescriptorProtoOrBuilder
        public String getName() {
            return ((DescriptorProtos$FieldDescriptorProto) this.instance).getName();
        }

        @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$FieldDescriptorProtoOrBuilder
        public j getNameBytes() {
            return ((DescriptorProtos$FieldDescriptorProto) this.instance).getNameBytes();
        }

        @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$FieldDescriptorProtoOrBuilder
        public int getNumber() {
            return ((DescriptorProtos$FieldDescriptorProto) this.instance).getNumber();
        }

        @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$FieldDescriptorProtoOrBuilder
        public int getOneofIndex() {
            return ((DescriptorProtos$FieldDescriptorProto) this.instance).getOneofIndex();
        }

        @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$FieldDescriptorProtoOrBuilder
        public DescriptorProtos$FieldOptions getOptions() {
            return ((DescriptorProtos$FieldDescriptorProto) this.instance).getOptions();
        }

        @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$FieldDescriptorProtoOrBuilder
        public boolean getProto3Optional() {
            return ((DescriptorProtos$FieldDescriptorProto) this.instance).getProto3Optional();
        }

        @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$FieldDescriptorProtoOrBuilder
        public b getType() {
            return ((DescriptorProtos$FieldDescriptorProto) this.instance).getType();
        }

        @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$FieldDescriptorProtoOrBuilder
        public String getTypeName() {
            return ((DescriptorProtos$FieldDescriptorProto) this.instance).getTypeName();
        }

        @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$FieldDescriptorProtoOrBuilder
        public j getTypeNameBytes() {
            return ((DescriptorProtos$FieldDescriptorProto) this.instance).getTypeNameBytes();
        }

        @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$FieldDescriptorProtoOrBuilder
        public boolean hasDefaultValue() {
            return ((DescriptorProtos$FieldDescriptorProto) this.instance).hasDefaultValue();
        }

        @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$FieldDescriptorProtoOrBuilder
        public boolean hasExtendee() {
            return ((DescriptorProtos$FieldDescriptorProto) this.instance).hasExtendee();
        }

        @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$FieldDescriptorProtoOrBuilder
        public boolean hasJsonName() {
            return ((DescriptorProtos$FieldDescriptorProto) this.instance).hasJsonName();
        }

        @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$FieldDescriptorProtoOrBuilder
        public boolean hasLabel() {
            return ((DescriptorProtos$FieldDescriptorProto) this.instance).hasLabel();
        }

        @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$FieldDescriptorProtoOrBuilder
        public boolean hasName() {
            return ((DescriptorProtos$FieldDescriptorProto) this.instance).hasName();
        }

        @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$FieldDescriptorProtoOrBuilder
        public boolean hasNumber() {
            return ((DescriptorProtos$FieldDescriptorProto) this.instance).hasNumber();
        }

        @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$FieldDescriptorProtoOrBuilder
        public boolean hasOneofIndex() {
            return ((DescriptorProtos$FieldDescriptorProto) this.instance).hasOneofIndex();
        }

        @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$FieldDescriptorProtoOrBuilder
        public boolean hasOptions() {
            return ((DescriptorProtos$FieldDescriptorProto) this.instance).hasOptions();
        }

        @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$FieldDescriptorProtoOrBuilder
        public boolean hasProto3Optional() {
            return ((DescriptorProtos$FieldDescriptorProto) this.instance).hasProto3Optional();
        }

        @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$FieldDescriptorProtoOrBuilder
        public boolean hasType() {
            return ((DescriptorProtos$FieldDescriptorProto) this.instance).hasType();
        }

        @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$FieldDescriptorProtoOrBuilder
        public boolean hasTypeName() {
            return ((DescriptorProtos$FieldDescriptorProto) this.instance).hasTypeName();
        }

        public Builder mergeOptions(DescriptorProtos$FieldOptions descriptorProtos$FieldOptions) {
            copyOnWrite();
            ((DescriptorProtos$FieldDescriptorProto) this.instance).mergeOptions(descriptorProtos$FieldOptions);
            return this;
        }

        public Builder setDefaultValue(String str) {
            copyOnWrite();
            ((DescriptorProtos$FieldDescriptorProto) this.instance).setDefaultValue(str);
            return this;
        }

        public Builder setDefaultValueBytes(j jVar) {
            copyOnWrite();
            ((DescriptorProtos$FieldDescriptorProto) this.instance).setDefaultValueBytes(jVar);
            return this;
        }

        public Builder setExtendee(String str) {
            copyOnWrite();
            ((DescriptorProtos$FieldDescriptorProto) this.instance).setExtendee(str);
            return this;
        }

        public Builder setExtendeeBytes(j jVar) {
            copyOnWrite();
            ((DescriptorProtos$FieldDescriptorProto) this.instance).setExtendeeBytes(jVar);
            return this;
        }

        public Builder setJsonName(String str) {
            copyOnWrite();
            ((DescriptorProtos$FieldDescriptorProto) this.instance).setJsonName(str);
            return this;
        }

        public Builder setJsonNameBytes(j jVar) {
            copyOnWrite();
            ((DescriptorProtos$FieldDescriptorProto) this.instance).setJsonNameBytes(jVar);
            return this;
        }

        public Builder setLabel(a aVar) {
            copyOnWrite();
            ((DescriptorProtos$FieldDescriptorProto) this.instance).setLabel(aVar);
            return this;
        }

        public Builder setName(String str) {
            copyOnWrite();
            ((DescriptorProtos$FieldDescriptorProto) this.instance).setName(str);
            return this;
        }

        public Builder setNameBytes(j jVar) {
            copyOnWrite();
            ((DescriptorProtos$FieldDescriptorProto) this.instance).setNameBytes(jVar);
            return this;
        }

        public Builder setNumber(int i10) {
            copyOnWrite();
            ((DescriptorProtos$FieldDescriptorProto) this.instance).setNumber(i10);
            return this;
        }

        public Builder setOneofIndex(int i10) {
            copyOnWrite();
            ((DescriptorProtos$FieldDescriptorProto) this.instance).setOneofIndex(i10);
            return this;
        }

        public Builder setOptions(DescriptorProtos$FieldOptions descriptorProtos$FieldOptions) {
            copyOnWrite();
            ((DescriptorProtos$FieldDescriptorProto) this.instance).setOptions(descriptorProtos$FieldOptions);
            return this;
        }

        public Builder setProto3Optional(boolean z10) {
            copyOnWrite();
            ((DescriptorProtos$FieldDescriptorProto) this.instance).setProto3Optional(z10);
            return this;
        }

        public Builder setType(b bVar) {
            copyOnWrite();
            ((DescriptorProtos$FieldDescriptorProto) this.instance).setType(bVar);
            return this;
        }

        public Builder setTypeName(String str) {
            copyOnWrite();
            ((DescriptorProtos$FieldDescriptorProto) this.instance).setTypeName(str);
            return this;
        }

        public Builder setTypeNameBytes(j jVar) {
            copyOnWrite();
            ((DescriptorProtos$FieldDescriptorProto) this.instance).setTypeNameBytes(jVar);
            return this;
        }

        private Builder() {
            super(DescriptorProtos$FieldDescriptorProto.DEFAULT_INSTANCE);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public Builder setOptions(DescriptorProtos$FieldOptions.Builder builder) {
            copyOnWrite();
            ((DescriptorProtos$FieldDescriptorProto) this.instance).setOptions((DescriptorProtos$FieldOptions) builder.build());
            return this;
        }
    }

    public enum a implements d0.c {
        LABEL_OPTIONAL(1),
        LABEL_REPEATED(3),
        LABEL_REQUIRED(2);


        /* renamed from: a, reason: collision with root package name */
        public final int f1815a;

        /* renamed from: androidx.datastore.preferences.protobuf.DescriptorProtos$FieldDescriptorProto$a$a, reason: collision with other inner class name */
        public static final class C0022a implements d0.e {

            /* renamed from: a, reason: collision with root package name */
            public static final C0022a f1816a = new C0022a();

            @Override // androidx.datastore.preferences.protobuf.d0.e
            public final boolean isInRange(int i10) {
                return a.a(i10) != null;
            }
        }

        a(int i10) {
            this.f1815a = i10;
        }

        public static a a(int i10) {
            if (i10 == 1) {
                return LABEL_OPTIONAL;
            }
            if (i10 == 2) {
                return LABEL_REQUIRED;
            }
            if (i10 != 3) {
                return null;
            }
            return LABEL_REPEATED;
        }

        @Override // androidx.datastore.preferences.protobuf.d0.c
        public final int getNumber() {
            return this.f1815a;
        }
    }

    public enum b implements d0.c {
        TYPE_DOUBLE(1),
        TYPE_FLOAT(2),
        TYPE_INT64(3),
        TYPE_UINT64(4),
        TYPE_INT32(5),
        TYPE_FIXED64(6),
        TYPE_FIXED32(7),
        TYPE_BOOL(8),
        TYPE_STRING(9),
        TYPE_GROUP(10),
        TYPE_MESSAGE(11),
        TYPE_BYTES(12),
        TYPE_UINT32(13),
        TYPE_ENUM(14),
        TYPE_SFIXED32(15),
        TYPE_SFIXED64(16),
        TYPE_SINT32(17),
        TYPE_SINT64(18);


        /* renamed from: a, reason: collision with root package name */
        public final int f1836a;

        public static final class a implements d0.e {

            /* renamed from: a, reason: collision with root package name */
            public static final a f1837a = new a();

            @Override // androidx.datastore.preferences.protobuf.d0.e
            public final boolean isInRange(int i10) {
                return b.a(i10) != null;
            }
        }

        b(int i10) {
            this.f1836a = i10;
        }

        public static b a(int i10) {
            switch (i10) {
                case 1:
                    return TYPE_DOUBLE;
                case 2:
                    return TYPE_FLOAT;
                case 3:
                    return TYPE_INT64;
                case 4:
                    return TYPE_UINT64;
                case 5:
                    return TYPE_INT32;
                case 6:
                    return TYPE_FIXED64;
                case 7:
                    return TYPE_FIXED32;
                case 8:
                    return TYPE_BOOL;
                case 9:
                    return TYPE_STRING;
                case 10:
                    return TYPE_GROUP;
                case 11:
                    return TYPE_MESSAGE;
                case 12:
                    return TYPE_BYTES;
                case 13:
                    return TYPE_UINT32;
                case 14:
                    return TYPE_ENUM;
                case 15:
                    return TYPE_SFIXED32;
                case 16:
                    return TYPE_SFIXED64;
                case 17:
                    return TYPE_SINT32;
                case 18:
                    return TYPE_SINT64;
                default:
                    return null;
            }
        }

        @Override // androidx.datastore.preferences.protobuf.d0.c
        public final int getNumber() {
            return this.f1836a;
        }
    }

    static {
        DescriptorProtos$FieldDescriptorProto descriptorProtos$FieldDescriptorProto = new DescriptorProtos$FieldDescriptorProto();
        DEFAULT_INSTANCE = descriptorProtos$FieldDescriptorProto;
        GeneratedMessageLite.registerDefaultInstance(DescriptorProtos$FieldDescriptorProto.class, descriptorProtos$FieldDescriptorProto);
    }

    private DescriptorProtos$FieldDescriptorProto() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDefaultValue() {
        this.bitField0_ &= -65;
        this.defaultValue_ = getDefaultInstance().getDefaultValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearExtendee() {
        this.bitField0_ &= -33;
        this.extendee_ = getDefaultInstance().getExtendee();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearJsonName() {
        this.bitField0_ &= -257;
        this.jsonName_ = getDefaultInstance().getJsonName();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearLabel() {
        this.bitField0_ &= -5;
        this.label_ = 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearName() {
        this.bitField0_ &= -2;
        this.name_ = getDefaultInstance().getName();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearNumber() {
        this.bitField0_ &= -3;
        this.number_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearOneofIndex() {
        this.bitField0_ &= -129;
        this.oneofIndex_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearOptions() {
        this.options_ = null;
        this.bitField0_ &= -513;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearProto3Optional() {
        this.bitField0_ &= -1025;
        this.proto3Optional_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearType() {
        this.bitField0_ &= -9;
        this.type_ = 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTypeName() {
        this.bitField0_ &= -17;
        this.typeName_ = getDefaultInstance().getTypeName();
    }

    public static DescriptorProtos$FieldDescriptorProto getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public void mergeOptions(DescriptorProtos$FieldOptions descriptorProtos$FieldOptions) {
        descriptorProtos$FieldOptions.getClass();
        DescriptorProtos$FieldOptions descriptorProtos$FieldOptions2 = this.options_;
        if (descriptorProtos$FieldOptions2 == null || descriptorProtos$FieldOptions2 == DescriptorProtos$FieldOptions.getDefaultInstance()) {
            this.options_ = descriptorProtos$FieldOptions;
        } else {
            this.options_ = ((DescriptorProtos$FieldOptions.Builder) DescriptorProtos$FieldOptions.newBuilder(this.options_).mergeFrom((DescriptorProtos$FieldOptions.Builder) descriptorProtos$FieldOptions)).buildPartial();
        }
        this.bitField0_ |= 512;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static DescriptorProtos$FieldDescriptorProto parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (DescriptorProtos$FieldDescriptorProto) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static DescriptorProtos$FieldDescriptorProto parseFrom(ByteBuffer byteBuffer) throws e0 {
        return (DescriptorProtos$FieldDescriptorProto) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static h1<DescriptorProtos$FieldDescriptorProto> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDefaultValue(String str) {
        str.getClass();
        this.bitField0_ |= 64;
        this.defaultValue_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDefaultValueBytes(j jVar) {
        this.defaultValue_ = jVar.n();
        this.bitField0_ |= 64;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setExtendee(String str) {
        str.getClass();
        this.bitField0_ |= 32;
        this.extendee_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setExtendeeBytes(j jVar) {
        this.extendee_ = jVar.n();
        this.bitField0_ |= 32;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setJsonName(String str) {
        str.getClass();
        this.bitField0_ |= 256;
        this.jsonName_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setJsonNameBytes(j jVar) {
        this.jsonName_ = jVar.n();
        this.bitField0_ |= 256;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLabel(a aVar) {
        this.label_ = aVar.f1815a;
        this.bitField0_ |= 4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setName(String str) {
        str.getClass();
        this.bitField0_ |= 1;
        this.name_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setNameBytes(j jVar) {
        this.name_ = jVar.n();
        this.bitField0_ |= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setNumber(int i10) {
        this.bitField0_ |= 2;
        this.number_ = i10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setOneofIndex(int i10) {
        this.bitField0_ |= 128;
        this.oneofIndex_ = i10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setOptions(DescriptorProtos$FieldOptions descriptorProtos$FieldOptions) {
        descriptorProtos$FieldOptions.getClass();
        this.options_ = descriptorProtos$FieldOptions;
        this.bitField0_ |= 512;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setProto3Optional(boolean z10) {
        this.bitField0_ |= 1024;
        this.proto3Optional_ = z10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setType(b bVar) {
        this.type_ = bVar.f1836a;
        this.bitField0_ |= 8;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTypeName(String str) {
        str.getClass();
        this.bitField0_ |= 16;
        this.typeName_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTypeNameBytes(j jVar) {
        this.typeName_ = jVar.n();
        this.bitField0_ |= 16;
    }

    @Override // androidx.datastore.preferences.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.d dVar, Object obj, Object obj2) {
        h1 aVar;
        switch (dVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.memoizedIsInitialized);
            case 1:
                this.memoizedIsInitialized = (byte) (obj == null ? 0 : 1);
                return null;
            case 2:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u000b\u0000\u0001\u0001\u0011\u000b\u0000\u0000\u0001\u0001ဈ\u0000\u0002ဈ\u0005\u0003င\u0001\u0004᠌\u0002\u0005᠌\u0003\u0006ဈ\u0004\u0007ဈ\u0006\bᐉ\t\tင\u0007\nဈ\b\u0011ဇ\n", new Object[]{"bitField0_", "name_", "extendee_", "number_", "label_", a.C0022a.f1816a, "type_", b.a.f1837a, "typeName_", "defaultValue_", "options_", "oneofIndex_", "jsonName_", "proto3Optional_"});
            case 3:
                return new DescriptorProtos$FieldDescriptorProto();
            case 4:
                return new Builder();
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                h1<DescriptorProtos$FieldDescriptorProto> h1Var = PARSER;
                if (h1Var != null) {
                    return h1Var;
                }
                synchronized (DescriptorProtos$FieldDescriptorProto.class) {
                    try {
                        aVar = PARSER;
                        if (aVar == null) {
                            aVar = new GeneratedMessageLite.a();
                            PARSER = aVar;
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                return aVar;
            default:
                throw new UnsupportedOperationException();
        }
    }

    @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$FieldDescriptorProtoOrBuilder
    public String getDefaultValue() {
        return this.defaultValue_;
    }

    @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$FieldDescriptorProtoOrBuilder
    public j getDefaultValueBytes() {
        return j.d(this.defaultValue_);
    }

    @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$FieldDescriptorProtoOrBuilder
    public String getExtendee() {
        return this.extendee_;
    }

    @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$FieldDescriptorProtoOrBuilder
    public j getExtendeeBytes() {
        return j.d(this.extendee_);
    }

    @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$FieldDescriptorProtoOrBuilder
    public String getJsonName() {
        return this.jsonName_;
    }

    @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$FieldDescriptorProtoOrBuilder
    public j getJsonNameBytes() {
        return j.d(this.jsonName_);
    }

    @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$FieldDescriptorProtoOrBuilder
    public a getLabel() {
        a aVarA = a.a(this.label_);
        return aVarA == null ? a.LABEL_OPTIONAL : aVarA;
    }

    @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$FieldDescriptorProtoOrBuilder
    public String getName() {
        return this.name_;
    }

    @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$FieldDescriptorProtoOrBuilder
    public j getNameBytes() {
        return j.d(this.name_);
    }

    @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$FieldDescriptorProtoOrBuilder
    public int getNumber() {
        return this.number_;
    }

    @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$FieldDescriptorProtoOrBuilder
    public int getOneofIndex() {
        return this.oneofIndex_;
    }

    @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$FieldDescriptorProtoOrBuilder
    public DescriptorProtos$FieldOptions getOptions() {
        DescriptorProtos$FieldOptions descriptorProtos$FieldOptions = this.options_;
        return descriptorProtos$FieldOptions == null ? DescriptorProtos$FieldOptions.getDefaultInstance() : descriptorProtos$FieldOptions;
    }

    @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$FieldDescriptorProtoOrBuilder
    public boolean getProto3Optional() {
        return this.proto3Optional_;
    }

    @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$FieldDescriptorProtoOrBuilder
    public b getType() {
        b bVarA = b.a(this.type_);
        return bVarA == null ? b.TYPE_DOUBLE : bVarA;
    }

    @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$FieldDescriptorProtoOrBuilder
    public String getTypeName() {
        return this.typeName_;
    }

    @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$FieldDescriptorProtoOrBuilder
    public j getTypeNameBytes() {
        return j.d(this.typeName_);
    }

    @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$FieldDescriptorProtoOrBuilder
    public boolean hasDefaultValue() {
        return (this.bitField0_ & 64) != 0;
    }

    @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$FieldDescriptorProtoOrBuilder
    public boolean hasExtendee() {
        return (this.bitField0_ & 32) != 0;
    }

    @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$FieldDescriptorProtoOrBuilder
    public boolean hasJsonName() {
        return (this.bitField0_ & 256) != 0;
    }

    @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$FieldDescriptorProtoOrBuilder
    public boolean hasLabel() {
        return (this.bitField0_ & 4) != 0;
    }

    @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$FieldDescriptorProtoOrBuilder
    public boolean hasName() {
        return (this.bitField0_ & 1) != 0;
    }

    @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$FieldDescriptorProtoOrBuilder
    public boolean hasNumber() {
        return (this.bitField0_ & 2) != 0;
    }

    @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$FieldDescriptorProtoOrBuilder
    public boolean hasOneofIndex() {
        return (this.bitField0_ & 128) != 0;
    }

    @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$FieldDescriptorProtoOrBuilder
    public boolean hasOptions() {
        return (this.bitField0_ & 512) != 0;
    }

    @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$FieldDescriptorProtoOrBuilder
    public boolean hasProto3Optional() {
        return (this.bitField0_ & 1024) != 0;
    }

    @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$FieldDescriptorProtoOrBuilder
    public boolean hasType() {
        return (this.bitField0_ & 8) != 0;
    }

    @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$FieldDescriptorProtoOrBuilder
    public boolean hasTypeName() {
        return (this.bitField0_ & 16) != 0;
    }

    public static Builder newBuilder(DescriptorProtos$FieldDescriptorProto descriptorProtos$FieldDescriptorProto) {
        return DEFAULT_INSTANCE.createBuilder(descriptorProtos$FieldDescriptorProto);
    }

    public static DescriptorProtos$FieldDescriptorProto parseDelimitedFrom(InputStream inputStream, t tVar) throws IOException {
        return (DescriptorProtos$FieldDescriptorProto) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, tVar);
    }

    public static DescriptorProtos$FieldDescriptorProto parseFrom(ByteBuffer byteBuffer, t tVar) throws e0 {
        return (DescriptorProtos$FieldDescriptorProto) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, tVar);
    }

    public static DescriptorProtos$FieldDescriptorProto parseFrom(j jVar) throws e0 {
        return (DescriptorProtos$FieldDescriptorProto) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, jVar);
    }

    public static DescriptorProtos$FieldDescriptorProto parseFrom(j jVar, t tVar) throws e0 {
        return (DescriptorProtos$FieldDescriptorProto) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, jVar, tVar);
    }

    public static DescriptorProtos$FieldDescriptorProto parseFrom(byte[] bArr) throws e0 {
        return (DescriptorProtos$FieldDescriptorProto) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static DescriptorProtos$FieldDescriptorProto parseFrom(byte[] bArr, t tVar) throws e0 {
        return (DescriptorProtos$FieldDescriptorProto) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, tVar);
    }

    public static DescriptorProtos$FieldDescriptorProto parseFrom(InputStream inputStream) throws IOException {
        return (DescriptorProtos$FieldDescriptorProto) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static DescriptorProtos$FieldDescriptorProto parseFrom(InputStream inputStream, t tVar) throws IOException {
        return (DescriptorProtos$FieldDescriptorProto) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, tVar);
    }

    public static DescriptorProtos$FieldDescriptorProto parseFrom(k kVar) throws IOException {
        return (DescriptorProtos$FieldDescriptorProto) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, kVar);
    }

    public static DescriptorProtos$FieldDescriptorProto parseFrom(k kVar, t tVar) throws IOException {
        return (DescriptorProtos$FieldDescriptorProto) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, kVar, tVar);
    }
}
