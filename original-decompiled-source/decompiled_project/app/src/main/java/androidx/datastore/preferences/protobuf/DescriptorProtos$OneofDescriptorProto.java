package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.DescriptorProtos$OneofOptions;
import androidx.datastore.preferences.protobuf.GeneratedMessageLite;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* loaded from: classes.dex */
public final class DescriptorProtos$OneofDescriptorProto extends GeneratedMessageLite<DescriptorProtos$OneofDescriptorProto, Builder> implements DescriptorProtos$OneofDescriptorProtoOrBuilder {
    private static final DescriptorProtos$OneofDescriptorProto DEFAULT_INSTANCE;
    public static final int NAME_FIELD_NUMBER = 1;
    public static final int OPTIONS_FIELD_NUMBER = 2;
    private static volatile h1<DescriptorProtos$OneofDescriptorProto> PARSER;
    private int bitField0_;
    private byte memoizedIsInitialized = 2;
    private String name_ = "";
    private DescriptorProtos$OneofOptions options_;

    public static final class Builder extends GeneratedMessageLite.Builder<DescriptorProtos$OneofDescriptorProto, Builder> implements DescriptorProtos$OneofDescriptorProtoOrBuilder {
        public Builder clearName() {
            copyOnWrite();
            ((DescriptorProtos$OneofDescriptorProto) this.instance).clearName();
            return this;
        }

        public Builder clearOptions() {
            copyOnWrite();
            ((DescriptorProtos$OneofDescriptorProto) this.instance).clearOptions();
            return this;
        }

        @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$OneofDescriptorProtoOrBuilder
        public String getName() {
            return ((DescriptorProtos$OneofDescriptorProto) this.instance).getName();
        }

        @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$OneofDescriptorProtoOrBuilder
        public j getNameBytes() {
            return ((DescriptorProtos$OneofDescriptorProto) this.instance).getNameBytes();
        }

        @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$OneofDescriptorProtoOrBuilder
        public DescriptorProtos$OneofOptions getOptions() {
            return ((DescriptorProtos$OneofDescriptorProto) this.instance).getOptions();
        }

        @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$OneofDescriptorProtoOrBuilder
        public boolean hasName() {
            return ((DescriptorProtos$OneofDescriptorProto) this.instance).hasName();
        }

        @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$OneofDescriptorProtoOrBuilder
        public boolean hasOptions() {
            return ((DescriptorProtos$OneofDescriptorProto) this.instance).hasOptions();
        }

        public Builder mergeOptions(DescriptorProtos$OneofOptions descriptorProtos$OneofOptions) {
            copyOnWrite();
            ((DescriptorProtos$OneofDescriptorProto) this.instance).mergeOptions(descriptorProtos$OneofOptions);
            return this;
        }

        public Builder setName(String str) {
            copyOnWrite();
            ((DescriptorProtos$OneofDescriptorProto) this.instance).setName(str);
            return this;
        }

        public Builder setNameBytes(j jVar) {
            copyOnWrite();
            ((DescriptorProtos$OneofDescriptorProto) this.instance).setNameBytes(jVar);
            return this;
        }

        public Builder setOptions(DescriptorProtos$OneofOptions descriptorProtos$OneofOptions) {
            copyOnWrite();
            ((DescriptorProtos$OneofDescriptorProto) this.instance).setOptions(descriptorProtos$OneofOptions);
            return this;
        }

        private Builder() {
            super(DescriptorProtos$OneofDescriptorProto.DEFAULT_INSTANCE);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public Builder setOptions(DescriptorProtos$OneofOptions.Builder builder) {
            copyOnWrite();
            ((DescriptorProtos$OneofDescriptorProto) this.instance).setOptions((DescriptorProtos$OneofOptions) builder.build());
            return this;
        }
    }

    static {
        DescriptorProtos$OneofDescriptorProto descriptorProtos$OneofDescriptorProto = new DescriptorProtos$OneofDescriptorProto();
        DEFAULT_INSTANCE = descriptorProtos$OneofDescriptorProto;
        GeneratedMessageLite.registerDefaultInstance(DescriptorProtos$OneofDescriptorProto.class, descriptorProtos$OneofDescriptorProto);
    }

    private DescriptorProtos$OneofDescriptorProto() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearName() {
        this.bitField0_ &= -2;
        this.name_ = getDefaultInstance().getName();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearOptions() {
        this.options_ = null;
        this.bitField0_ &= -3;
    }

    public static DescriptorProtos$OneofDescriptorProto getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public void mergeOptions(DescriptorProtos$OneofOptions descriptorProtos$OneofOptions) {
        descriptorProtos$OneofOptions.getClass();
        DescriptorProtos$OneofOptions descriptorProtos$OneofOptions2 = this.options_;
        if (descriptorProtos$OneofOptions2 == null || descriptorProtos$OneofOptions2 == DescriptorProtos$OneofOptions.getDefaultInstance()) {
            this.options_ = descriptorProtos$OneofOptions;
        } else {
            this.options_ = ((DescriptorProtos$OneofOptions.Builder) DescriptorProtos$OneofOptions.newBuilder(this.options_).mergeFrom((DescriptorProtos$OneofOptions.Builder) descriptorProtos$OneofOptions)).buildPartial();
        }
        this.bitField0_ |= 2;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static DescriptorProtos$OneofDescriptorProto parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (DescriptorProtos$OneofDescriptorProto) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static DescriptorProtos$OneofDescriptorProto parseFrom(ByteBuffer byteBuffer) throws e0 {
        return (DescriptorProtos$OneofDescriptorProto) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static h1<DescriptorProtos$OneofDescriptorProto> parser() {
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
    public void setOptions(DescriptorProtos$OneofOptions descriptorProtos$OneofOptions) {
        descriptorProtos$OneofOptions.getClass();
        this.options_ = descriptorProtos$OneofOptions;
        this.bitField0_ |= 2;
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
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0001\u0001ဈ\u0000\u0002ᐉ\u0001", new Object[]{"bitField0_", "name_", "options_"});
            case 3:
                return new DescriptorProtos$OneofDescriptorProto();
            case 4:
                return new Builder();
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                h1<DescriptorProtos$OneofDescriptorProto> h1Var = PARSER;
                if (h1Var != null) {
                    return h1Var;
                }
                synchronized (DescriptorProtos$OneofDescriptorProto.class) {
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

    @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$OneofDescriptorProtoOrBuilder
    public String getName() {
        return this.name_;
    }

    @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$OneofDescriptorProtoOrBuilder
    public j getNameBytes() {
        return j.d(this.name_);
    }

    @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$OneofDescriptorProtoOrBuilder
    public DescriptorProtos$OneofOptions getOptions() {
        DescriptorProtos$OneofOptions descriptorProtos$OneofOptions = this.options_;
        return descriptorProtos$OneofOptions == null ? DescriptorProtos$OneofOptions.getDefaultInstance() : descriptorProtos$OneofOptions;
    }

    @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$OneofDescriptorProtoOrBuilder
    public boolean hasName() {
        return (this.bitField0_ & 1) != 0;
    }

    @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$OneofDescriptorProtoOrBuilder
    public boolean hasOptions() {
        return (this.bitField0_ & 2) != 0;
    }

    public static Builder newBuilder(DescriptorProtos$OneofDescriptorProto descriptorProtos$OneofDescriptorProto) {
        return DEFAULT_INSTANCE.createBuilder(descriptorProtos$OneofDescriptorProto);
    }

    public static DescriptorProtos$OneofDescriptorProto parseDelimitedFrom(InputStream inputStream, t tVar) throws IOException {
        return (DescriptorProtos$OneofDescriptorProto) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, tVar);
    }

    public static DescriptorProtos$OneofDescriptorProto parseFrom(ByteBuffer byteBuffer, t tVar) throws e0 {
        return (DescriptorProtos$OneofDescriptorProto) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, tVar);
    }

    public static DescriptorProtos$OneofDescriptorProto parseFrom(j jVar) throws e0 {
        return (DescriptorProtos$OneofDescriptorProto) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, jVar);
    }

    public static DescriptorProtos$OneofDescriptorProto parseFrom(j jVar, t tVar) throws e0 {
        return (DescriptorProtos$OneofDescriptorProto) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, jVar, tVar);
    }

    public static DescriptorProtos$OneofDescriptorProto parseFrom(byte[] bArr) throws e0 {
        return (DescriptorProtos$OneofDescriptorProto) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static DescriptorProtos$OneofDescriptorProto parseFrom(byte[] bArr, t tVar) throws e0 {
        return (DescriptorProtos$OneofDescriptorProto) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, tVar);
    }

    public static DescriptorProtos$OneofDescriptorProto parseFrom(InputStream inputStream) throws IOException {
        return (DescriptorProtos$OneofDescriptorProto) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static DescriptorProtos$OneofDescriptorProto parseFrom(InputStream inputStream, t tVar) throws IOException {
        return (DescriptorProtos$OneofDescriptorProto) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, tVar);
    }

    public static DescriptorProtos$OneofDescriptorProto parseFrom(k kVar) throws IOException {
        return (DescriptorProtos$OneofDescriptorProto) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, kVar);
    }

    public static DescriptorProtos$OneofDescriptorProto parseFrom(k kVar, t tVar) throws IOException {
        return (DescriptorProtos$OneofDescriptorProto) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, kVar, tVar);
    }
}
