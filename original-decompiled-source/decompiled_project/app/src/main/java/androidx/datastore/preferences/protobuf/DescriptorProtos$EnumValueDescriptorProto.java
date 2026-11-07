package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.DescriptorProtos$EnumValueOptions;
import androidx.datastore.preferences.protobuf.GeneratedMessageLite;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* loaded from: classes.dex */
public final class DescriptorProtos$EnumValueDescriptorProto extends GeneratedMessageLite<DescriptorProtos$EnumValueDescriptorProto, Builder> implements DescriptorProtos$EnumValueDescriptorProtoOrBuilder {
    private static final DescriptorProtos$EnumValueDescriptorProto DEFAULT_INSTANCE;
    public static final int NAME_FIELD_NUMBER = 1;
    public static final int NUMBER_FIELD_NUMBER = 2;
    public static final int OPTIONS_FIELD_NUMBER = 3;
    private static volatile h1<DescriptorProtos$EnumValueDescriptorProto> PARSER;
    private int bitField0_;
    private byte memoizedIsInitialized = 2;
    private String name_ = "";
    private int number_;
    private DescriptorProtos$EnumValueOptions options_;

    public static final class Builder extends GeneratedMessageLite.Builder<DescriptorProtos$EnumValueDescriptorProto, Builder> implements DescriptorProtos$EnumValueDescriptorProtoOrBuilder {
        public Builder clearName() {
            copyOnWrite();
            ((DescriptorProtos$EnumValueDescriptorProto) this.instance).clearName();
            return this;
        }

        public Builder clearNumber() {
            copyOnWrite();
            ((DescriptorProtos$EnumValueDescriptorProto) this.instance).clearNumber();
            return this;
        }

        public Builder clearOptions() {
            copyOnWrite();
            ((DescriptorProtos$EnumValueDescriptorProto) this.instance).clearOptions();
            return this;
        }

        @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$EnumValueDescriptorProtoOrBuilder
        public String getName() {
            return ((DescriptorProtos$EnumValueDescriptorProto) this.instance).getName();
        }

        @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$EnumValueDescriptorProtoOrBuilder
        public j getNameBytes() {
            return ((DescriptorProtos$EnumValueDescriptorProto) this.instance).getNameBytes();
        }

        @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$EnumValueDescriptorProtoOrBuilder
        public int getNumber() {
            return ((DescriptorProtos$EnumValueDescriptorProto) this.instance).getNumber();
        }

        @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$EnumValueDescriptorProtoOrBuilder
        public DescriptorProtos$EnumValueOptions getOptions() {
            return ((DescriptorProtos$EnumValueDescriptorProto) this.instance).getOptions();
        }

        @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$EnumValueDescriptorProtoOrBuilder
        public boolean hasName() {
            return ((DescriptorProtos$EnumValueDescriptorProto) this.instance).hasName();
        }

        @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$EnumValueDescriptorProtoOrBuilder
        public boolean hasNumber() {
            return ((DescriptorProtos$EnumValueDescriptorProto) this.instance).hasNumber();
        }

        @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$EnumValueDescriptorProtoOrBuilder
        public boolean hasOptions() {
            return ((DescriptorProtos$EnumValueDescriptorProto) this.instance).hasOptions();
        }

        public Builder mergeOptions(DescriptorProtos$EnumValueOptions descriptorProtos$EnumValueOptions) {
            copyOnWrite();
            ((DescriptorProtos$EnumValueDescriptorProto) this.instance).mergeOptions(descriptorProtos$EnumValueOptions);
            return this;
        }

        public Builder setName(String str) {
            copyOnWrite();
            ((DescriptorProtos$EnumValueDescriptorProto) this.instance).setName(str);
            return this;
        }

        public Builder setNameBytes(j jVar) {
            copyOnWrite();
            ((DescriptorProtos$EnumValueDescriptorProto) this.instance).setNameBytes(jVar);
            return this;
        }

        public Builder setNumber(int i10) {
            copyOnWrite();
            ((DescriptorProtos$EnumValueDescriptorProto) this.instance).setNumber(i10);
            return this;
        }

        public Builder setOptions(DescriptorProtos$EnumValueOptions descriptorProtos$EnumValueOptions) {
            copyOnWrite();
            ((DescriptorProtos$EnumValueDescriptorProto) this.instance).setOptions(descriptorProtos$EnumValueOptions);
            return this;
        }

        private Builder() {
            super(DescriptorProtos$EnumValueDescriptorProto.DEFAULT_INSTANCE);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public Builder setOptions(DescriptorProtos$EnumValueOptions.Builder builder) {
            copyOnWrite();
            ((DescriptorProtos$EnumValueDescriptorProto) this.instance).setOptions((DescriptorProtos$EnumValueOptions) builder.build());
            return this;
        }
    }

    static {
        DescriptorProtos$EnumValueDescriptorProto descriptorProtos$EnumValueDescriptorProto = new DescriptorProtos$EnumValueDescriptorProto();
        DEFAULT_INSTANCE = descriptorProtos$EnumValueDescriptorProto;
        GeneratedMessageLite.registerDefaultInstance(DescriptorProtos$EnumValueDescriptorProto.class, descriptorProtos$EnumValueDescriptorProto);
    }

    private DescriptorProtos$EnumValueDescriptorProto() {
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
    public void clearOptions() {
        this.options_ = null;
        this.bitField0_ &= -5;
    }

    public static DescriptorProtos$EnumValueDescriptorProto getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public void mergeOptions(DescriptorProtos$EnumValueOptions descriptorProtos$EnumValueOptions) {
        descriptorProtos$EnumValueOptions.getClass();
        DescriptorProtos$EnumValueOptions descriptorProtos$EnumValueOptions2 = this.options_;
        if (descriptorProtos$EnumValueOptions2 == null || descriptorProtos$EnumValueOptions2 == DescriptorProtos$EnumValueOptions.getDefaultInstance()) {
            this.options_ = descriptorProtos$EnumValueOptions;
        } else {
            this.options_ = ((DescriptorProtos$EnumValueOptions.Builder) DescriptorProtos$EnumValueOptions.newBuilder(this.options_).mergeFrom((DescriptorProtos$EnumValueOptions.Builder) descriptorProtos$EnumValueOptions)).buildPartial();
        }
        this.bitField0_ |= 4;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static DescriptorProtos$EnumValueDescriptorProto parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (DescriptorProtos$EnumValueDescriptorProto) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static DescriptorProtos$EnumValueDescriptorProto parseFrom(ByteBuffer byteBuffer) throws e0 {
        return (DescriptorProtos$EnumValueDescriptorProto) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static h1<DescriptorProtos$EnumValueDescriptorProto> parser() {
        return DEFAULT_INSTANCE.getParserForType();
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
    public void setOptions(DescriptorProtos$EnumValueOptions descriptorProtos$EnumValueOptions) {
        descriptorProtos$EnumValueOptions.getClass();
        this.options_ = descriptorProtos$EnumValueOptions;
        this.bitField0_ |= 4;
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
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0001\u0001ဈ\u0000\u0002င\u0001\u0003ᐉ\u0002", new Object[]{"bitField0_", "name_", "number_", "options_"});
            case 3:
                return new DescriptorProtos$EnumValueDescriptorProto();
            case 4:
                return new Builder();
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                h1<DescriptorProtos$EnumValueDescriptorProto> h1Var = PARSER;
                if (h1Var != null) {
                    return h1Var;
                }
                synchronized (DescriptorProtos$EnumValueDescriptorProto.class) {
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

    @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$EnumValueDescriptorProtoOrBuilder
    public String getName() {
        return this.name_;
    }

    @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$EnumValueDescriptorProtoOrBuilder
    public j getNameBytes() {
        return j.d(this.name_);
    }

    @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$EnumValueDescriptorProtoOrBuilder
    public int getNumber() {
        return this.number_;
    }

    @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$EnumValueDescriptorProtoOrBuilder
    public DescriptorProtos$EnumValueOptions getOptions() {
        DescriptorProtos$EnumValueOptions descriptorProtos$EnumValueOptions = this.options_;
        return descriptorProtos$EnumValueOptions == null ? DescriptorProtos$EnumValueOptions.getDefaultInstance() : descriptorProtos$EnumValueOptions;
    }

    @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$EnumValueDescriptorProtoOrBuilder
    public boolean hasName() {
        return (this.bitField0_ & 1) != 0;
    }

    @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$EnumValueDescriptorProtoOrBuilder
    public boolean hasNumber() {
        return (this.bitField0_ & 2) != 0;
    }

    @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$EnumValueDescriptorProtoOrBuilder
    public boolean hasOptions() {
        return (this.bitField0_ & 4) != 0;
    }

    public static Builder newBuilder(DescriptorProtos$EnumValueDescriptorProto descriptorProtos$EnumValueDescriptorProto) {
        return DEFAULT_INSTANCE.createBuilder(descriptorProtos$EnumValueDescriptorProto);
    }

    public static DescriptorProtos$EnumValueDescriptorProto parseDelimitedFrom(InputStream inputStream, t tVar) throws IOException {
        return (DescriptorProtos$EnumValueDescriptorProto) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, tVar);
    }

    public static DescriptorProtos$EnumValueDescriptorProto parseFrom(ByteBuffer byteBuffer, t tVar) throws e0 {
        return (DescriptorProtos$EnumValueDescriptorProto) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, tVar);
    }

    public static DescriptorProtos$EnumValueDescriptorProto parseFrom(j jVar) throws e0 {
        return (DescriptorProtos$EnumValueDescriptorProto) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, jVar);
    }

    public static DescriptorProtos$EnumValueDescriptorProto parseFrom(j jVar, t tVar) throws e0 {
        return (DescriptorProtos$EnumValueDescriptorProto) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, jVar, tVar);
    }

    public static DescriptorProtos$EnumValueDescriptorProto parseFrom(byte[] bArr) throws e0 {
        return (DescriptorProtos$EnumValueDescriptorProto) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static DescriptorProtos$EnumValueDescriptorProto parseFrom(byte[] bArr, t tVar) throws e0 {
        return (DescriptorProtos$EnumValueDescriptorProto) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, tVar);
    }

    public static DescriptorProtos$EnumValueDescriptorProto parseFrom(InputStream inputStream) throws IOException {
        return (DescriptorProtos$EnumValueDescriptorProto) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static DescriptorProtos$EnumValueDescriptorProto parseFrom(InputStream inputStream, t tVar) throws IOException {
        return (DescriptorProtos$EnumValueDescriptorProto) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, tVar);
    }

    public static DescriptorProtos$EnumValueDescriptorProto parseFrom(k kVar) throws IOException {
        return (DescriptorProtos$EnumValueDescriptorProto) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, kVar);
    }

    public static DescriptorProtos$EnumValueDescriptorProto parseFrom(k kVar, t tVar) throws IOException {
        return (DescriptorProtos$EnumValueDescriptorProto) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, kVar, tVar);
    }
}
