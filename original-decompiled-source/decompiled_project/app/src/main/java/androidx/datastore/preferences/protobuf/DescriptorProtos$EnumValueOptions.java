package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.DescriptorProtos$FeatureSet;
import androidx.datastore.preferences.protobuf.DescriptorProtos$FieldOptions;
import androidx.datastore.preferences.protobuf.DescriptorProtos$UninterpretedOption;
import androidx.datastore.preferences.protobuf.GeneratedMessageLite;
import androidx.datastore.preferences.protobuf.d0;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public final class DescriptorProtos$EnumValueOptions extends GeneratedMessageLite.ExtendableMessage<DescriptorProtos$EnumValueOptions, Builder> implements DescriptorProtos$EnumValueOptionsOrBuilder {
    public static final int DEBUG_REDACT_FIELD_NUMBER = 3;
    private static final DescriptorProtos$EnumValueOptions DEFAULT_INSTANCE;
    public static final int DEPRECATED_FIELD_NUMBER = 1;
    public static final int FEATURES_FIELD_NUMBER = 2;
    public static final int FEATURE_SUPPORT_FIELD_NUMBER = 4;
    private static volatile h1<DescriptorProtos$EnumValueOptions> PARSER = null;
    public static final int UNINTERPRETED_OPTION_FIELD_NUMBER = 999;
    private int bitField0_;
    private boolean debugRedact_;
    private boolean deprecated_;
    private DescriptorProtos$FieldOptions.FeatureSupport featureSupport_;
    private DescriptorProtos$FeatureSet features_;
    private byte memoizedIsInitialized = 2;
    private d0.j<DescriptorProtos$UninterpretedOption> uninterpretedOption_ = GeneratedMessageLite.emptyProtobufList();

    public static final class Builder extends GeneratedMessageLite.ExtendableBuilder<DescriptorProtos$EnumValueOptions, Builder> implements DescriptorProtos$EnumValueOptionsOrBuilder {
        public Builder addAllUninterpretedOption(Iterable<? extends DescriptorProtos$UninterpretedOption> iterable) {
            copyOnWrite();
            ((DescriptorProtos$EnumValueOptions) this.instance).addAllUninterpretedOption(iterable);
            return this;
        }

        public Builder addUninterpretedOption(DescriptorProtos$UninterpretedOption descriptorProtos$UninterpretedOption) {
            copyOnWrite();
            ((DescriptorProtos$EnumValueOptions) this.instance).addUninterpretedOption(descriptorProtos$UninterpretedOption);
            return this;
        }

        public Builder clearDebugRedact() {
            copyOnWrite();
            ((DescriptorProtos$EnumValueOptions) this.instance).clearDebugRedact();
            return this;
        }

        public Builder clearDeprecated() {
            copyOnWrite();
            ((DescriptorProtos$EnumValueOptions) this.instance).clearDeprecated();
            return this;
        }

        public Builder clearFeatureSupport() {
            copyOnWrite();
            ((DescriptorProtos$EnumValueOptions) this.instance).clearFeatureSupport();
            return this;
        }

        public Builder clearFeatures() {
            copyOnWrite();
            ((DescriptorProtos$EnumValueOptions) this.instance).clearFeatures();
            return this;
        }

        public Builder clearUninterpretedOption() {
            copyOnWrite();
            ((DescriptorProtos$EnumValueOptions) this.instance).clearUninterpretedOption();
            return this;
        }

        @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$EnumValueOptionsOrBuilder
        public boolean getDebugRedact() {
            return ((DescriptorProtos$EnumValueOptions) this.instance).getDebugRedact();
        }

        @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$EnumValueOptionsOrBuilder
        public boolean getDeprecated() {
            return ((DescriptorProtos$EnumValueOptions) this.instance).getDeprecated();
        }

        @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$EnumValueOptionsOrBuilder
        public DescriptorProtos$FieldOptions.FeatureSupport getFeatureSupport() {
            return ((DescriptorProtos$EnumValueOptions) this.instance).getFeatureSupport();
        }

        @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$EnumValueOptionsOrBuilder
        public DescriptorProtos$FeatureSet getFeatures() {
            return ((DescriptorProtos$EnumValueOptions) this.instance).getFeatures();
        }

        @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$EnumValueOptionsOrBuilder
        public DescriptorProtos$UninterpretedOption getUninterpretedOption(int i10) {
            return ((DescriptorProtos$EnumValueOptions) this.instance).getUninterpretedOption(i10);
        }

        @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$EnumValueOptionsOrBuilder
        public int getUninterpretedOptionCount() {
            return ((DescriptorProtos$EnumValueOptions) this.instance).getUninterpretedOptionCount();
        }

        @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$EnumValueOptionsOrBuilder
        public List<DescriptorProtos$UninterpretedOption> getUninterpretedOptionList() {
            return Collections.unmodifiableList(((DescriptorProtos$EnumValueOptions) this.instance).getUninterpretedOptionList());
        }

        @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$EnumValueOptionsOrBuilder
        public boolean hasDebugRedact() {
            return ((DescriptorProtos$EnumValueOptions) this.instance).hasDebugRedact();
        }

        @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$EnumValueOptionsOrBuilder
        public boolean hasDeprecated() {
            return ((DescriptorProtos$EnumValueOptions) this.instance).hasDeprecated();
        }

        @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$EnumValueOptionsOrBuilder
        public boolean hasFeatureSupport() {
            return ((DescriptorProtos$EnumValueOptions) this.instance).hasFeatureSupport();
        }

        @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$EnumValueOptionsOrBuilder
        public boolean hasFeatures() {
            return ((DescriptorProtos$EnumValueOptions) this.instance).hasFeatures();
        }

        public Builder mergeFeatureSupport(DescriptorProtos$FieldOptions.FeatureSupport featureSupport) {
            copyOnWrite();
            ((DescriptorProtos$EnumValueOptions) this.instance).mergeFeatureSupport(featureSupport);
            return this;
        }

        public Builder mergeFeatures(DescriptorProtos$FeatureSet descriptorProtos$FeatureSet) {
            copyOnWrite();
            ((DescriptorProtos$EnumValueOptions) this.instance).mergeFeatures(descriptorProtos$FeatureSet);
            return this;
        }

        public Builder removeUninterpretedOption(int i10) {
            copyOnWrite();
            ((DescriptorProtos$EnumValueOptions) this.instance).removeUninterpretedOption(i10);
            return this;
        }

        public Builder setDebugRedact(boolean z10) {
            copyOnWrite();
            ((DescriptorProtos$EnumValueOptions) this.instance).setDebugRedact(z10);
            return this;
        }

        public Builder setDeprecated(boolean z10) {
            copyOnWrite();
            ((DescriptorProtos$EnumValueOptions) this.instance).setDeprecated(z10);
            return this;
        }

        public Builder setFeatureSupport(DescriptorProtos$FieldOptions.FeatureSupport featureSupport) {
            copyOnWrite();
            ((DescriptorProtos$EnumValueOptions) this.instance).setFeatureSupport(featureSupport);
            return this;
        }

        public Builder setFeatures(DescriptorProtos$FeatureSet descriptorProtos$FeatureSet) {
            copyOnWrite();
            ((DescriptorProtos$EnumValueOptions) this.instance).setFeatures(descriptorProtos$FeatureSet);
            return this;
        }

        public Builder setUninterpretedOption(int i10, DescriptorProtos$UninterpretedOption descriptorProtos$UninterpretedOption) {
            copyOnWrite();
            ((DescriptorProtos$EnumValueOptions) this.instance).setUninterpretedOption(i10, descriptorProtos$UninterpretedOption);
            return this;
        }

        private Builder() {
            super(DescriptorProtos$EnumValueOptions.DEFAULT_INSTANCE);
        }

        public Builder addUninterpretedOption(int i10, DescriptorProtos$UninterpretedOption descriptorProtos$UninterpretedOption) {
            copyOnWrite();
            ((DescriptorProtos$EnumValueOptions) this.instance).addUninterpretedOption(i10, descriptorProtos$UninterpretedOption);
            return this;
        }

        public Builder setFeatureSupport(DescriptorProtos$FieldOptions.FeatureSupport.Builder builder) {
            copyOnWrite();
            ((DescriptorProtos$EnumValueOptions) this.instance).setFeatureSupport(builder.build());
            return this;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public Builder setFeatures(DescriptorProtos$FeatureSet.Builder builder) {
            copyOnWrite();
            ((DescriptorProtos$EnumValueOptions) this.instance).setFeatures((DescriptorProtos$FeatureSet) builder.build());
            return this;
        }

        public Builder setUninterpretedOption(int i10, DescriptorProtos$UninterpretedOption.Builder builder) {
            copyOnWrite();
            ((DescriptorProtos$EnumValueOptions) this.instance).setUninterpretedOption(i10, builder.build());
            return this;
        }

        public Builder addUninterpretedOption(DescriptorProtos$UninterpretedOption.Builder builder) {
            copyOnWrite();
            ((DescriptorProtos$EnumValueOptions) this.instance).addUninterpretedOption(builder.build());
            return this;
        }

        public Builder addUninterpretedOption(int i10, DescriptorProtos$UninterpretedOption.Builder builder) {
            copyOnWrite();
            ((DescriptorProtos$EnumValueOptions) this.instance).addUninterpretedOption(i10, builder.build());
            return this;
        }
    }

    static {
        DescriptorProtos$EnumValueOptions descriptorProtos$EnumValueOptions = new DescriptorProtos$EnumValueOptions();
        DEFAULT_INSTANCE = descriptorProtos$EnumValueOptions;
        GeneratedMessageLite.registerDefaultInstance(DescriptorProtos$EnumValueOptions.class, descriptorProtos$EnumValueOptions);
    }

    private DescriptorProtos$EnumValueOptions() {
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
    public void clearDebugRedact() {
        this.bitField0_ &= -5;
        this.debugRedact_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDeprecated() {
        this.bitField0_ &= -2;
        this.deprecated_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearFeatureSupport() {
        this.featureSupport_ = null;
        this.bitField0_ &= -9;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearFeatures() {
        this.features_ = null;
        this.bitField0_ &= -3;
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

    public static DescriptorProtos$EnumValueOptions getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeFeatureSupport(DescriptorProtos$FieldOptions.FeatureSupport featureSupport) {
        featureSupport.getClass();
        DescriptorProtos$FieldOptions.FeatureSupport featureSupport2 = this.featureSupport_;
        if (featureSupport2 == null || featureSupport2 == DescriptorProtos$FieldOptions.FeatureSupport.getDefaultInstance()) {
            this.featureSupport_ = featureSupport;
        } else {
            this.featureSupport_ = DescriptorProtos$FieldOptions.FeatureSupport.newBuilder(this.featureSupport_).mergeFrom((DescriptorProtos$FieldOptions.FeatureSupport.Builder) featureSupport).buildPartial();
        }
        this.bitField0_ |= 8;
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
        this.bitField0_ |= 2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static Builder newBuilder() {
        return (Builder) DEFAULT_INSTANCE.createBuilder();
    }

    public static DescriptorProtos$EnumValueOptions parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (DescriptorProtos$EnumValueOptions) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static DescriptorProtos$EnumValueOptions parseFrom(ByteBuffer byteBuffer) throws e0 {
        return (DescriptorProtos$EnumValueOptions) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static h1<DescriptorProtos$EnumValueOptions> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeUninterpretedOption(int i10) {
        ensureUninterpretedOptionIsMutable();
        this.uninterpretedOption_.remove(i10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDebugRedact(boolean z10) {
        this.bitField0_ |= 4;
        this.debugRedact_ = z10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDeprecated(boolean z10) {
        this.bitField0_ |= 1;
        this.deprecated_ = z10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setFeatureSupport(DescriptorProtos$FieldOptions.FeatureSupport featureSupport) {
        featureSupport.getClass();
        this.featureSupport_ = featureSupport;
        this.bitField0_ |= 8;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setFeatures(DescriptorProtos$FeatureSet descriptorProtos$FeatureSet) {
        descriptorProtos$FeatureSet.getClass();
        this.features_ = descriptorProtos$FeatureSet;
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
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0005\u0000\u0001\u0001ϧ\u0005\u0000\u0001\u0002\u0001ဇ\u0000\u0002ᐉ\u0001\u0003ဇ\u0002\u0004ဉ\u0003ϧЛ", new Object[]{"bitField0_", "deprecated_", "features_", "debugRedact_", "featureSupport_", "uninterpretedOption_", DescriptorProtos$UninterpretedOption.class});
            case 3:
                return new DescriptorProtos$EnumValueOptions();
            case 4:
                return new Builder();
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                h1<DescriptorProtos$EnumValueOptions> h1Var = PARSER;
                if (h1Var != null) {
                    return h1Var;
                }
                synchronized (DescriptorProtos$EnumValueOptions.class) {
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

    @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$EnumValueOptionsOrBuilder
    public boolean getDebugRedact() {
        return this.debugRedact_;
    }

    @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$EnumValueOptionsOrBuilder
    public boolean getDeprecated() {
        return this.deprecated_;
    }

    @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$EnumValueOptionsOrBuilder
    public DescriptorProtos$FieldOptions.FeatureSupport getFeatureSupport() {
        DescriptorProtos$FieldOptions.FeatureSupport featureSupport = this.featureSupport_;
        return featureSupport == null ? DescriptorProtos$FieldOptions.FeatureSupport.getDefaultInstance() : featureSupport;
    }

    @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$EnumValueOptionsOrBuilder
    public DescriptorProtos$FeatureSet getFeatures() {
        DescriptorProtos$FeatureSet descriptorProtos$FeatureSet = this.features_;
        return descriptorProtos$FeatureSet == null ? DescriptorProtos$FeatureSet.getDefaultInstance() : descriptorProtos$FeatureSet;
    }

    @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$EnumValueOptionsOrBuilder
    public DescriptorProtos$UninterpretedOption getUninterpretedOption(int i10) {
        return this.uninterpretedOption_.get(i10);
    }

    @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$EnumValueOptionsOrBuilder
    public int getUninterpretedOptionCount() {
        return this.uninterpretedOption_.size();
    }

    @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$EnumValueOptionsOrBuilder
    public List<DescriptorProtos$UninterpretedOption> getUninterpretedOptionList() {
        return this.uninterpretedOption_;
    }

    public DescriptorProtos$UninterpretedOptionOrBuilder getUninterpretedOptionOrBuilder(int i10) {
        return this.uninterpretedOption_.get(i10);
    }

    public List<? extends DescriptorProtos$UninterpretedOptionOrBuilder> getUninterpretedOptionOrBuilderList() {
        return this.uninterpretedOption_;
    }

    @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$EnumValueOptionsOrBuilder
    public boolean hasDebugRedact() {
        return (this.bitField0_ & 4) != 0;
    }

    @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$EnumValueOptionsOrBuilder
    public boolean hasDeprecated() {
        return (this.bitField0_ & 1) != 0;
    }

    @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$EnumValueOptionsOrBuilder
    public boolean hasFeatureSupport() {
        return (this.bitField0_ & 8) != 0;
    }

    @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$EnumValueOptionsOrBuilder
    public boolean hasFeatures() {
        return (this.bitField0_ & 2) != 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static Builder newBuilder(DescriptorProtos$EnumValueOptions descriptorProtos$EnumValueOptions) {
        return (Builder) DEFAULT_INSTANCE.createBuilder(descriptorProtos$EnumValueOptions);
    }

    public static DescriptorProtos$EnumValueOptions parseDelimitedFrom(InputStream inputStream, t tVar) throws IOException {
        return (DescriptorProtos$EnumValueOptions) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, tVar);
    }

    public static DescriptorProtos$EnumValueOptions parseFrom(ByteBuffer byteBuffer, t tVar) throws e0 {
        return (DescriptorProtos$EnumValueOptions) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, tVar);
    }

    public static DescriptorProtos$EnumValueOptions parseFrom(j jVar) throws e0 {
        return (DescriptorProtos$EnumValueOptions) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, jVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addUninterpretedOption(int i10, DescriptorProtos$UninterpretedOption descriptorProtos$UninterpretedOption) {
        descriptorProtos$UninterpretedOption.getClass();
        ensureUninterpretedOptionIsMutable();
        this.uninterpretedOption_.add(i10, descriptorProtos$UninterpretedOption);
    }

    public static DescriptorProtos$EnumValueOptions parseFrom(j jVar, t tVar) throws e0 {
        return (DescriptorProtos$EnumValueOptions) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, jVar, tVar);
    }

    public static DescriptorProtos$EnumValueOptions parseFrom(byte[] bArr) throws e0 {
        return (DescriptorProtos$EnumValueOptions) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static DescriptorProtos$EnumValueOptions parseFrom(byte[] bArr, t tVar) throws e0 {
        return (DescriptorProtos$EnumValueOptions) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, tVar);
    }

    public static DescriptorProtos$EnumValueOptions parseFrom(InputStream inputStream) throws IOException {
        return (DescriptorProtos$EnumValueOptions) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static DescriptorProtos$EnumValueOptions parseFrom(InputStream inputStream, t tVar) throws IOException {
        return (DescriptorProtos$EnumValueOptions) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, tVar);
    }

    public static DescriptorProtos$EnumValueOptions parseFrom(k kVar) throws IOException {
        return (DescriptorProtos$EnumValueOptions) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, kVar);
    }

    public static DescriptorProtos$EnumValueOptions parseFrom(k kVar, t tVar) throws IOException {
        return (DescriptorProtos$EnumValueOptions) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, kVar, tVar);
    }
}
