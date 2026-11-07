package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.DescriptorProtos$MethodDescriptorProto;
import androidx.datastore.preferences.protobuf.DescriptorProtos$ServiceOptions;
import androidx.datastore.preferences.protobuf.GeneratedMessageLite;
import androidx.datastore.preferences.protobuf.d0;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public final class DescriptorProtos$ServiceDescriptorProto extends GeneratedMessageLite<DescriptorProtos$ServiceDescriptorProto, Builder> implements DescriptorProtos$ServiceDescriptorProtoOrBuilder {
    private static final DescriptorProtos$ServiceDescriptorProto DEFAULT_INSTANCE;
    public static final int METHOD_FIELD_NUMBER = 2;
    public static final int NAME_FIELD_NUMBER = 1;
    public static final int OPTIONS_FIELD_NUMBER = 3;
    private static volatile h1<DescriptorProtos$ServiceDescriptorProto> PARSER;
    private int bitField0_;
    private DescriptorProtos$ServiceOptions options_;
    private byte memoizedIsInitialized = 2;
    private String name_ = "";
    private d0.j<DescriptorProtos$MethodDescriptorProto> method_ = GeneratedMessageLite.emptyProtobufList();

    public static final class Builder extends GeneratedMessageLite.Builder<DescriptorProtos$ServiceDescriptorProto, Builder> implements DescriptorProtos$ServiceDescriptorProtoOrBuilder {
        public Builder addAllMethod(Iterable<? extends DescriptorProtos$MethodDescriptorProto> iterable) {
            copyOnWrite();
            ((DescriptorProtos$ServiceDescriptorProto) this.instance).addAllMethod(iterable);
            return this;
        }

        public Builder addMethod(DescriptorProtos$MethodDescriptorProto descriptorProtos$MethodDescriptorProto) {
            copyOnWrite();
            ((DescriptorProtos$ServiceDescriptorProto) this.instance).addMethod(descriptorProtos$MethodDescriptorProto);
            return this;
        }

        public Builder clearMethod() {
            copyOnWrite();
            ((DescriptorProtos$ServiceDescriptorProto) this.instance).clearMethod();
            return this;
        }

        public Builder clearName() {
            copyOnWrite();
            ((DescriptorProtos$ServiceDescriptorProto) this.instance).clearName();
            return this;
        }

        public Builder clearOptions() {
            copyOnWrite();
            ((DescriptorProtos$ServiceDescriptorProto) this.instance).clearOptions();
            return this;
        }

        @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$ServiceDescriptorProtoOrBuilder
        public DescriptorProtos$MethodDescriptorProto getMethod(int i10) {
            return ((DescriptorProtos$ServiceDescriptorProto) this.instance).getMethod(i10);
        }

        @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$ServiceDescriptorProtoOrBuilder
        public int getMethodCount() {
            return ((DescriptorProtos$ServiceDescriptorProto) this.instance).getMethodCount();
        }

        @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$ServiceDescriptorProtoOrBuilder
        public List<DescriptorProtos$MethodDescriptorProto> getMethodList() {
            return Collections.unmodifiableList(((DescriptorProtos$ServiceDescriptorProto) this.instance).getMethodList());
        }

        @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$ServiceDescriptorProtoOrBuilder
        public String getName() {
            return ((DescriptorProtos$ServiceDescriptorProto) this.instance).getName();
        }

        @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$ServiceDescriptorProtoOrBuilder
        public j getNameBytes() {
            return ((DescriptorProtos$ServiceDescriptorProto) this.instance).getNameBytes();
        }

        @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$ServiceDescriptorProtoOrBuilder
        public DescriptorProtos$ServiceOptions getOptions() {
            return ((DescriptorProtos$ServiceDescriptorProto) this.instance).getOptions();
        }

        @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$ServiceDescriptorProtoOrBuilder
        public boolean hasName() {
            return ((DescriptorProtos$ServiceDescriptorProto) this.instance).hasName();
        }

        @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$ServiceDescriptorProtoOrBuilder
        public boolean hasOptions() {
            return ((DescriptorProtos$ServiceDescriptorProto) this.instance).hasOptions();
        }

        public Builder mergeOptions(DescriptorProtos$ServiceOptions descriptorProtos$ServiceOptions) {
            copyOnWrite();
            ((DescriptorProtos$ServiceDescriptorProto) this.instance).mergeOptions(descriptorProtos$ServiceOptions);
            return this;
        }

        public Builder removeMethod(int i10) {
            copyOnWrite();
            ((DescriptorProtos$ServiceDescriptorProto) this.instance).removeMethod(i10);
            return this;
        }

        public Builder setMethod(int i10, DescriptorProtos$MethodDescriptorProto descriptorProtos$MethodDescriptorProto) {
            copyOnWrite();
            ((DescriptorProtos$ServiceDescriptorProto) this.instance).setMethod(i10, descriptorProtos$MethodDescriptorProto);
            return this;
        }

        public Builder setName(String str) {
            copyOnWrite();
            ((DescriptorProtos$ServiceDescriptorProto) this.instance).setName(str);
            return this;
        }

        public Builder setNameBytes(j jVar) {
            copyOnWrite();
            ((DescriptorProtos$ServiceDescriptorProto) this.instance).setNameBytes(jVar);
            return this;
        }

        public Builder setOptions(DescriptorProtos$ServiceOptions descriptorProtos$ServiceOptions) {
            copyOnWrite();
            ((DescriptorProtos$ServiceDescriptorProto) this.instance).setOptions(descriptorProtos$ServiceOptions);
            return this;
        }

        private Builder() {
            super(DescriptorProtos$ServiceDescriptorProto.DEFAULT_INSTANCE);
        }

        public Builder addMethod(int i10, DescriptorProtos$MethodDescriptorProto descriptorProtos$MethodDescriptorProto) {
            copyOnWrite();
            ((DescriptorProtos$ServiceDescriptorProto) this.instance).addMethod(i10, descriptorProtos$MethodDescriptorProto);
            return this;
        }

        public Builder setMethod(int i10, DescriptorProtos$MethodDescriptorProto.Builder builder) {
            copyOnWrite();
            ((DescriptorProtos$ServiceDescriptorProto) this.instance).setMethod(i10, builder.build());
            return this;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public Builder setOptions(DescriptorProtos$ServiceOptions.Builder builder) {
            copyOnWrite();
            ((DescriptorProtos$ServiceDescriptorProto) this.instance).setOptions((DescriptorProtos$ServiceOptions) builder.build());
            return this;
        }

        public Builder addMethod(DescriptorProtos$MethodDescriptorProto.Builder builder) {
            copyOnWrite();
            ((DescriptorProtos$ServiceDescriptorProto) this.instance).addMethod(builder.build());
            return this;
        }

        public Builder addMethod(int i10, DescriptorProtos$MethodDescriptorProto.Builder builder) {
            copyOnWrite();
            ((DescriptorProtos$ServiceDescriptorProto) this.instance).addMethod(i10, builder.build());
            return this;
        }
    }

    static {
        DescriptorProtos$ServiceDescriptorProto descriptorProtos$ServiceDescriptorProto = new DescriptorProtos$ServiceDescriptorProto();
        DEFAULT_INSTANCE = descriptorProtos$ServiceDescriptorProto;
        GeneratedMessageLite.registerDefaultInstance(DescriptorProtos$ServiceDescriptorProto.class, descriptorProtos$ServiceDescriptorProto);
    }

    private DescriptorProtos$ServiceDescriptorProto() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllMethod(Iterable<? extends DescriptorProtos$MethodDescriptorProto> iterable) {
        ensureMethodIsMutable();
        AbstractMessageLite.addAll(iterable, this.method_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addMethod(DescriptorProtos$MethodDescriptorProto descriptorProtos$MethodDescriptorProto) {
        descriptorProtos$MethodDescriptorProto.getClass();
        ensureMethodIsMutable();
        this.method_.add(descriptorProtos$MethodDescriptorProto);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearMethod() {
        this.method_ = GeneratedMessageLite.emptyProtobufList();
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

    private void ensureMethodIsMutable() {
        d0.j<DescriptorProtos$MethodDescriptorProto> jVar = this.method_;
        if (jVar.isModifiable()) {
            return;
        }
        this.method_ = GeneratedMessageLite.mutableCopy(jVar);
    }

    public static DescriptorProtos$ServiceDescriptorProto getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public void mergeOptions(DescriptorProtos$ServiceOptions descriptorProtos$ServiceOptions) {
        descriptorProtos$ServiceOptions.getClass();
        DescriptorProtos$ServiceOptions descriptorProtos$ServiceOptions2 = this.options_;
        if (descriptorProtos$ServiceOptions2 == null || descriptorProtos$ServiceOptions2 == DescriptorProtos$ServiceOptions.getDefaultInstance()) {
            this.options_ = descriptorProtos$ServiceOptions;
        } else {
            this.options_ = ((DescriptorProtos$ServiceOptions.Builder) DescriptorProtos$ServiceOptions.newBuilder(this.options_).mergeFrom((DescriptorProtos$ServiceOptions.Builder) descriptorProtos$ServiceOptions)).buildPartial();
        }
        this.bitField0_ |= 2;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static DescriptorProtos$ServiceDescriptorProto parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (DescriptorProtos$ServiceDescriptorProto) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static DescriptorProtos$ServiceDescriptorProto parseFrom(ByteBuffer byteBuffer) throws e0 {
        return (DescriptorProtos$ServiceDescriptorProto) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static h1<DescriptorProtos$ServiceDescriptorProto> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeMethod(int i10) {
        ensureMethodIsMutable();
        this.method_.remove(i10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMethod(int i10, DescriptorProtos$MethodDescriptorProto descriptorProtos$MethodDescriptorProto) {
        descriptorProtos$MethodDescriptorProto.getClass();
        ensureMethodIsMutable();
        this.method_.set(i10, descriptorProtos$MethodDescriptorProto);
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
    public void setOptions(DescriptorProtos$ServiceOptions descriptorProtos$ServiceOptions) {
        descriptorProtos$ServiceOptions.getClass();
        this.options_ = descriptorProtos$ServiceOptions;
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
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0002\u0001ဈ\u0000\u0002Л\u0003ᐉ\u0001", new Object[]{"bitField0_", "name_", "method_", DescriptorProtos$MethodDescriptorProto.class, "options_"});
            case 3:
                return new DescriptorProtos$ServiceDescriptorProto();
            case 4:
                return new Builder();
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                h1<DescriptorProtos$ServiceDescriptorProto> h1Var = PARSER;
                if (h1Var != null) {
                    return h1Var;
                }
                synchronized (DescriptorProtos$ServiceDescriptorProto.class) {
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

    @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$ServiceDescriptorProtoOrBuilder
    public DescriptorProtos$MethodDescriptorProto getMethod(int i10) {
        return this.method_.get(i10);
    }

    @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$ServiceDescriptorProtoOrBuilder
    public int getMethodCount() {
        return this.method_.size();
    }

    @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$ServiceDescriptorProtoOrBuilder
    public List<DescriptorProtos$MethodDescriptorProto> getMethodList() {
        return this.method_;
    }

    public DescriptorProtos$MethodDescriptorProtoOrBuilder getMethodOrBuilder(int i10) {
        return this.method_.get(i10);
    }

    public List<? extends DescriptorProtos$MethodDescriptorProtoOrBuilder> getMethodOrBuilderList() {
        return this.method_;
    }

    @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$ServiceDescriptorProtoOrBuilder
    public String getName() {
        return this.name_;
    }

    @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$ServiceDescriptorProtoOrBuilder
    public j getNameBytes() {
        return j.d(this.name_);
    }

    @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$ServiceDescriptorProtoOrBuilder
    public DescriptorProtos$ServiceOptions getOptions() {
        DescriptorProtos$ServiceOptions descriptorProtos$ServiceOptions = this.options_;
        return descriptorProtos$ServiceOptions == null ? DescriptorProtos$ServiceOptions.getDefaultInstance() : descriptorProtos$ServiceOptions;
    }

    @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$ServiceDescriptorProtoOrBuilder
    public boolean hasName() {
        return (this.bitField0_ & 1) != 0;
    }

    @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$ServiceDescriptorProtoOrBuilder
    public boolean hasOptions() {
        return (this.bitField0_ & 2) != 0;
    }

    public static Builder newBuilder(DescriptorProtos$ServiceDescriptorProto descriptorProtos$ServiceDescriptorProto) {
        return DEFAULT_INSTANCE.createBuilder(descriptorProtos$ServiceDescriptorProto);
    }

    public static DescriptorProtos$ServiceDescriptorProto parseDelimitedFrom(InputStream inputStream, t tVar) throws IOException {
        return (DescriptorProtos$ServiceDescriptorProto) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, tVar);
    }

    public static DescriptorProtos$ServiceDescriptorProto parseFrom(ByteBuffer byteBuffer, t tVar) throws e0 {
        return (DescriptorProtos$ServiceDescriptorProto) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, tVar);
    }

    public static DescriptorProtos$ServiceDescriptorProto parseFrom(j jVar) throws e0 {
        return (DescriptorProtos$ServiceDescriptorProto) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, jVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addMethod(int i10, DescriptorProtos$MethodDescriptorProto descriptorProtos$MethodDescriptorProto) {
        descriptorProtos$MethodDescriptorProto.getClass();
        ensureMethodIsMutable();
        this.method_.add(i10, descriptorProtos$MethodDescriptorProto);
    }

    public static DescriptorProtos$ServiceDescriptorProto parseFrom(j jVar, t tVar) throws e0 {
        return (DescriptorProtos$ServiceDescriptorProto) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, jVar, tVar);
    }

    public static DescriptorProtos$ServiceDescriptorProto parseFrom(byte[] bArr) throws e0 {
        return (DescriptorProtos$ServiceDescriptorProto) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static DescriptorProtos$ServiceDescriptorProto parseFrom(byte[] bArr, t tVar) throws e0 {
        return (DescriptorProtos$ServiceDescriptorProto) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, tVar);
    }

    public static DescriptorProtos$ServiceDescriptorProto parseFrom(InputStream inputStream) throws IOException {
        return (DescriptorProtos$ServiceDescriptorProto) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static DescriptorProtos$ServiceDescriptorProto parseFrom(InputStream inputStream, t tVar) throws IOException {
        return (DescriptorProtos$ServiceDescriptorProto) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, tVar);
    }

    public static DescriptorProtos$ServiceDescriptorProto parseFrom(k kVar) throws IOException {
        return (DescriptorProtos$ServiceDescriptorProto) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, kVar);
    }

    public static DescriptorProtos$ServiceDescriptorProto parseFrom(k kVar, t tVar) throws IOException {
        return (DescriptorProtos$ServiceDescriptorProto) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, kVar, tVar);
    }
}
