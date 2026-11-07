package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.DescriptorProtos$FeatureSet;
import androidx.datastore.preferences.protobuf.DescriptorProtos$UninterpretedOption;
import androidx.datastore.preferences.protobuf.GeneratedMessageLite;
import androidx.datastore.preferences.protobuf.d0;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public final class DescriptorProtos$MethodOptions extends GeneratedMessageLite.ExtendableMessage<DescriptorProtos$MethodOptions, Builder> implements DescriptorProtos$MethodOptionsOrBuilder {
    private static final DescriptorProtos$MethodOptions DEFAULT_INSTANCE;
    public static final int DEPRECATED_FIELD_NUMBER = 33;
    public static final int FEATURES_FIELD_NUMBER = 35;
    public static final int IDEMPOTENCY_LEVEL_FIELD_NUMBER = 34;
    private static volatile h1<DescriptorProtos$MethodOptions> PARSER = null;
    public static final int UNINTERPRETED_OPTION_FIELD_NUMBER = 999;
    private int bitField0_;
    private boolean deprecated_;
    private DescriptorProtos$FeatureSet features_;
    private int idempotencyLevel_;
    private byte memoizedIsInitialized = 2;
    private d0.j<DescriptorProtos$UninterpretedOption> uninterpretedOption_ = GeneratedMessageLite.emptyProtobufList();

    public static final class Builder extends GeneratedMessageLite.ExtendableBuilder<DescriptorProtos$MethodOptions, Builder> implements DescriptorProtos$MethodOptionsOrBuilder {
        public Builder addAllUninterpretedOption(Iterable<? extends DescriptorProtos$UninterpretedOption> iterable) {
            copyOnWrite();
            ((DescriptorProtos$MethodOptions) this.instance).addAllUninterpretedOption(iterable);
            return this;
        }

        public Builder addUninterpretedOption(DescriptorProtos$UninterpretedOption descriptorProtos$UninterpretedOption) {
            copyOnWrite();
            ((DescriptorProtos$MethodOptions) this.instance).addUninterpretedOption(descriptorProtos$UninterpretedOption);
            return this;
        }

        public Builder clearDeprecated() {
            copyOnWrite();
            ((DescriptorProtos$MethodOptions) this.instance).clearDeprecated();
            return this;
        }

        public Builder clearFeatures() {
            copyOnWrite();
            ((DescriptorProtos$MethodOptions) this.instance).clearFeatures();
            return this;
        }

        public Builder clearIdempotencyLevel() {
            copyOnWrite();
            ((DescriptorProtos$MethodOptions) this.instance).clearIdempotencyLevel();
            return this;
        }

        public Builder clearUninterpretedOption() {
            copyOnWrite();
            ((DescriptorProtos$MethodOptions) this.instance).clearUninterpretedOption();
            return this;
        }

        @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$MethodOptionsOrBuilder
        public boolean getDeprecated() {
            return ((DescriptorProtos$MethodOptions) this.instance).getDeprecated();
        }

        @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$MethodOptionsOrBuilder
        public DescriptorProtos$FeatureSet getFeatures() {
            return ((DescriptorProtos$MethodOptions) this.instance).getFeatures();
        }

        @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$MethodOptionsOrBuilder
        public a getIdempotencyLevel() {
            return ((DescriptorProtos$MethodOptions) this.instance).getIdempotencyLevel();
        }

        @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$MethodOptionsOrBuilder
        public DescriptorProtos$UninterpretedOption getUninterpretedOption(int i10) {
            return ((DescriptorProtos$MethodOptions) this.instance).getUninterpretedOption(i10);
        }

        @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$MethodOptionsOrBuilder
        public int getUninterpretedOptionCount() {
            return ((DescriptorProtos$MethodOptions) this.instance).getUninterpretedOptionCount();
        }

        @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$MethodOptionsOrBuilder
        public List<DescriptorProtos$UninterpretedOption> getUninterpretedOptionList() {
            return Collections.unmodifiableList(((DescriptorProtos$MethodOptions) this.instance).getUninterpretedOptionList());
        }

        @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$MethodOptionsOrBuilder
        public boolean hasDeprecated() {
            return ((DescriptorProtos$MethodOptions) this.instance).hasDeprecated();
        }

        @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$MethodOptionsOrBuilder
        public boolean hasFeatures() {
            return ((DescriptorProtos$MethodOptions) this.instance).hasFeatures();
        }

        @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$MethodOptionsOrBuilder
        public boolean hasIdempotencyLevel() {
            return ((DescriptorProtos$MethodOptions) this.instance).hasIdempotencyLevel();
        }

        public Builder mergeFeatures(DescriptorProtos$FeatureSet descriptorProtos$FeatureSet) {
            copyOnWrite();
            ((DescriptorProtos$MethodOptions) this.instance).mergeFeatures(descriptorProtos$FeatureSet);
            return this;
        }

        public Builder removeUninterpretedOption(int i10) {
            copyOnWrite();
            ((DescriptorProtos$MethodOptions) this.instance).removeUninterpretedOption(i10);
            return this;
        }

        public Builder setDeprecated(boolean z10) {
            copyOnWrite();
            ((DescriptorProtos$MethodOptions) this.instance).setDeprecated(z10);
            return this;
        }

        public Builder setFeatures(DescriptorProtos$FeatureSet descriptorProtos$FeatureSet) {
            copyOnWrite();
            ((DescriptorProtos$MethodOptions) this.instance).setFeatures(descriptorProtos$FeatureSet);
            return this;
        }

        public Builder setIdempotencyLevel(a aVar) {
            copyOnWrite();
            ((DescriptorProtos$MethodOptions) this.instance).setIdempotencyLevel(aVar);
            return this;
        }

        public Builder setUninterpretedOption(int i10, DescriptorProtos$UninterpretedOption descriptorProtos$UninterpretedOption) {
            copyOnWrite();
            ((DescriptorProtos$MethodOptions) this.instance).setUninterpretedOption(i10, descriptorProtos$UninterpretedOption);
            return this;
        }

        private Builder() {
            super(DescriptorProtos$MethodOptions.DEFAULT_INSTANCE);
        }

        public Builder addUninterpretedOption(int i10, DescriptorProtos$UninterpretedOption descriptorProtos$UninterpretedOption) {
            copyOnWrite();
            ((DescriptorProtos$MethodOptions) this.instance).addUninterpretedOption(i10, descriptorProtos$UninterpretedOption);
            return this;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public Builder setFeatures(DescriptorProtos$FeatureSet.Builder builder) {
            copyOnWrite();
            ((DescriptorProtos$MethodOptions) this.instance).setFeatures((DescriptorProtos$FeatureSet) builder.build());
            return this;
        }

        public Builder setUninterpretedOption(int i10, DescriptorProtos$UninterpretedOption.Builder builder) {
            copyOnWrite();
            ((DescriptorProtos$MethodOptions) this.instance).setUninterpretedOption(i10, builder.build());
            return this;
        }

        public Builder addUninterpretedOption(DescriptorProtos$UninterpretedOption.Builder builder) {
            copyOnWrite();
            ((DescriptorProtos$MethodOptions) this.instance).addUninterpretedOption(builder.build());
            return this;
        }

        public Builder addUninterpretedOption(int i10, DescriptorProtos$UninterpretedOption.Builder builder) {
            copyOnWrite();
            ((DescriptorProtos$MethodOptions) this.instance).addUninterpretedOption(i10, builder.build());
            return this;
        }
    }

    public enum a implements d0.c {
        IDEMPOTENCY_UNKNOWN(0),
        NO_SIDE_EFFECTS(1),
        IDEMPOTENT(2);


        /* renamed from: a, reason: collision with root package name */
        public final int f1885a;

        /* renamed from: androidx.datastore.preferences.protobuf.DescriptorProtos$MethodOptions$a$a, reason: collision with other inner class name */
        public static final class C0025a implements d0.e {

            /* renamed from: a, reason: collision with root package name */
            public static final C0025a f1886a = new C0025a();

            @Override // androidx.datastore.preferences.protobuf.d0.e
            public final boolean isInRange(int i10) {
                return a.a(i10) != null;
            }
        }

        a(int i10) {
            this.f1885a = i10;
        }

        public static a a(int i10) {
            if (i10 == 0) {
                return IDEMPOTENCY_UNKNOWN;
            }
            if (i10 == 1) {
                return NO_SIDE_EFFECTS;
            }
            if (i10 != 2) {
                return null;
            }
            return IDEMPOTENT;
        }

        @Override // androidx.datastore.preferences.protobuf.d0.c
        public final int getNumber() {
            return this.f1885a;
        }
    }

    static {
        DescriptorProtos$MethodOptions descriptorProtos$MethodOptions = new DescriptorProtos$MethodOptions();
        DEFAULT_INSTANCE = descriptorProtos$MethodOptions;
        GeneratedMessageLite.registerDefaultInstance(DescriptorProtos$MethodOptions.class, descriptorProtos$MethodOptions);
    }

    private DescriptorProtos$MethodOptions() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllUninterpretedOption(Iterable<? extends DescriptorProtos$UninterpretedOption> iterable) {
        ensureUninterpretedOptionIsMutable();
        AbstractMessageLite.addAll(iterable, this.uninterpretedOption_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addUninterpretedOption(DescriptorProtos$UninterpretedOption descriptorProtos$UninterpretedOption) {
        descriptorProtos$UninterpretedOption.getClass();
        ensureUninterpretedOptionIsMutable();
        this.uninterpretedOption_.add(descriptorProtos$UninterpretedOption);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDeprecated() {
        this.bitField0_ &= -2;
        this.deprecated_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearFeatures() {
        this.features_ = null;
        this.bitField0_ &= -5;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearIdempotencyLevel() {
        this.bitField0_ &= -3;
        this.idempotencyLevel_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearUninterpretedOption() {
        this.uninterpretedOption_ = GeneratedMessageLite.emptyProtobufList();
    }

    private void ensureUninterpretedOptionIsMutable() {
        d0.j<DescriptorProtos$UninterpretedOption> jVar = this.uninterpretedOption_;
        if (jVar.isModifiable()) {
            return;
        }
        this.uninterpretedOption_ = GeneratedMessageLite.mutableCopy(jVar);
    }

    public static DescriptorProtos$MethodOptions getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public void mergeFeatures(DescriptorProtos$FeatureSet descriptorProtos$FeatureSet) {
        descriptorProtos$FeatureSet.getClass();
        DescriptorProtos$FeatureSet descriptorProtos$FeatureSet2 = this.features_;
        if (descriptorProtos$FeatureSet2 == null || descriptorProtos$FeatureSet2 == DescriptorProtos$FeatureSet.getDefaultInstance()) {
            this.features_ = descriptorProtos$FeatureSet;
        } else {
            this.features_ = ((DescriptorProtos$FeatureSet.Builder) DescriptorProtos$FeatureSet.newBuilder(this.features_).mergeFrom((DescriptorProtos$FeatureSet.Builder) descriptorProtos$FeatureSet)).buildPartial();
        }
        this.bitField0_ |= 4;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static Builder newBuilder() {
        return (Builder) DEFAULT_INSTANCE.createBuilder();
    }

    public static DescriptorProtos$MethodOptions parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (DescriptorProtos$MethodOptions) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static DescriptorProtos$MethodOptions parseFrom(ByteBuffer byteBuffer) throws e0 {
        return (DescriptorProtos$MethodOptions) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static h1<DescriptorProtos$MethodOptions> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeUninterpretedOption(int i10) {
        ensureUninterpretedOptionIsMutable();
        this.uninterpretedOption_.remove(i10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDeprecated(boolean z10) {
        this.bitField0_ |= 1;
        this.deprecated_ = z10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setFeatures(DescriptorProtos$FeatureSet descriptorProtos$FeatureSet) {
        descriptorProtos$FeatureSet.getClass();
        this.features_ = descriptorProtos$FeatureSet;
        this.bitField0_ |= 4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setIdempotencyLevel(a aVar) {
        this.idempotencyLevel_ = aVar.f1885a;
        this.bitField0_ |= 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setUninterpretedOption(int i10, DescriptorProtos$UninterpretedOption descriptorProtos$UninterpretedOption) {
        descriptorProtos$UninterpretedOption.getClass();
        ensureUninterpretedOptionIsMutable();
        this.uninterpretedOption_.set(i10, descriptorProtos$UninterpretedOption);
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
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0004\u0000\u0001!ϧ\u0004\u0000\u0001\u0002!ဇ\u0000\"᠌\u0001#ᐉ\u0002ϧЛ", new Object[]{"bitField0_", "deprecated_", "idempotencyLevel_", a.C0025a.f1886a, "features_", "uninterpretedOption_", DescriptorProtos$UninterpretedOption.class});
            case 3:
                return new DescriptorProtos$MethodOptions();
            case 4:
                return new Builder();
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                h1<DescriptorProtos$MethodOptions> h1Var = PARSER;
                if (h1Var != null) {
                    return h1Var;
                }
                synchronized (DescriptorProtos$MethodOptions.class) {
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

    @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$MethodOptionsOrBuilder
    public boolean getDeprecated() {
        return this.deprecated_;
    }

    @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$MethodOptionsOrBuilder
    public DescriptorProtos$FeatureSet getFeatures() {
        DescriptorProtos$FeatureSet descriptorProtos$FeatureSet = this.features_;
        return descriptorProtos$FeatureSet == null ? DescriptorProtos$FeatureSet.getDefaultInstance() : descriptorProtos$FeatureSet;
    }

    @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$MethodOptionsOrBuilder
    public a getIdempotencyLevel() {
        a aVarA = a.a(this.idempotencyLevel_);
        return aVarA == null ? a.IDEMPOTENCY_UNKNOWN : aVarA;
    }

    @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$MethodOptionsOrBuilder
    public DescriptorProtos$UninterpretedOption getUninterpretedOption(int i10) {
        return this.uninterpretedOption_.get(i10);
    }

    @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$MethodOptionsOrBuilder
    public int getUninterpretedOptionCount() {
        return this.uninterpretedOption_.size();
    }

    @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$MethodOptionsOrBuilder
    public List<DescriptorProtos$UninterpretedOption> getUninterpretedOptionList() {
        return this.uninterpretedOption_;
    }

    public DescriptorProtos$UninterpretedOptionOrBuilder getUninterpretedOptionOrBuilder(int i10) {
        return this.uninterpretedOption_.get(i10);
    }

    public List<? extends DescriptorProtos$UninterpretedOptionOrBuilder> getUninterpretedOptionOrBuilderList() {
        return this.uninterpretedOption_;
    }

    @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$MethodOptionsOrBuilder
    public boolean hasDeprecated() {
        return (this.bitField0_ & 1) != 0;
    }

    @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$MethodOptionsOrBuilder
    public boolean hasFeatures() {
        return (this.bitField0_ & 4) != 0;
    }

    @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$MethodOptionsOrBuilder
    public boolean hasIdempotencyLevel() {
        return (this.bitField0_ & 2) != 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static Builder newBuilder(DescriptorProtos$MethodOptions descriptorProtos$MethodOptions) {
        return (Builder) DEFAULT_INSTANCE.createBuilder(descriptorProtos$MethodOptions);
    }

    public static DescriptorProtos$MethodOptions parseDelimitedFrom(InputStream inputStream, t tVar) throws IOException {
        return (DescriptorProtos$MethodOptions) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, tVar);
    }

    public static DescriptorProtos$MethodOptions parseFrom(ByteBuffer byteBuffer, t tVar) throws e0 {
        return (DescriptorProtos$MethodOptions) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, tVar);
    }

    public static DescriptorProtos$MethodOptions parseFrom(j jVar) throws e0 {
        return (DescriptorProtos$MethodOptions) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, jVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addUninterpretedOption(int i10, DescriptorProtos$UninterpretedOption descriptorProtos$UninterpretedOption) {
        descriptorProtos$UninterpretedOption.getClass();
        ensureUninterpretedOptionIsMutable();
        this.uninterpretedOption_.add(i10, descriptorProtos$UninterpretedOption);
    }

    public static DescriptorProtos$MethodOptions parseFrom(j jVar, t tVar) throws e0 {
        return (DescriptorProtos$MethodOptions) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, jVar, tVar);
    }

    public static DescriptorProtos$MethodOptions parseFrom(byte[] bArr) throws e0 {
        return (DescriptorProtos$MethodOptions) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static DescriptorProtos$MethodOptions parseFrom(byte[] bArr, t tVar) throws e0 {
        return (DescriptorProtos$MethodOptions) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, tVar);
    }

    public static DescriptorProtos$MethodOptions parseFrom(InputStream inputStream) throws IOException {
        return (DescriptorProtos$MethodOptions) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static DescriptorProtos$MethodOptions parseFrom(InputStream inputStream, t tVar) throws IOException {
        return (DescriptorProtos$MethodOptions) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, tVar);
    }

    public static DescriptorProtos$MethodOptions parseFrom(k kVar) throws IOException {
        return (DescriptorProtos$MethodOptions) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, kVar);
    }

    public static DescriptorProtos$MethodOptions parseFrom(k kVar, t tVar) throws IOException {
        return (DescriptorProtos$MethodOptions) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, kVar, tVar);
    }
}
