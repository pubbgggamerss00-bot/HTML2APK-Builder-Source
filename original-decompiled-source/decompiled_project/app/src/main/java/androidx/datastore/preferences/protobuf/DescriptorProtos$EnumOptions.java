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
public final class DescriptorProtos$EnumOptions extends GeneratedMessageLite.ExtendableMessage<DescriptorProtos$EnumOptions, Builder> implements DescriptorProtos$EnumOptionsOrBuilder {
    public static final int ALLOW_ALIAS_FIELD_NUMBER = 2;
    private static final DescriptorProtos$EnumOptions DEFAULT_INSTANCE;
    public static final int DEPRECATED_FIELD_NUMBER = 3;
    public static final int DEPRECATED_LEGACY_JSON_FIELD_CONFLICTS_FIELD_NUMBER = 6;
    public static final int FEATURES_FIELD_NUMBER = 7;
    private static volatile h1<DescriptorProtos$EnumOptions> PARSER = null;
    public static final int UNINTERPRETED_OPTION_FIELD_NUMBER = 999;
    private boolean allowAlias_;
    private int bitField0_;
    private boolean deprecatedLegacyJsonFieldConflicts_;
    private boolean deprecated_;
    private DescriptorProtos$FeatureSet features_;
    private byte memoizedIsInitialized = 2;
    private d0.j<DescriptorProtos$UninterpretedOption> uninterpretedOption_ = GeneratedMessageLite.emptyProtobufList();

    public static final class Builder extends GeneratedMessageLite.ExtendableBuilder<DescriptorProtos$EnumOptions, Builder> implements DescriptorProtos$EnumOptionsOrBuilder {
        public Builder addAllUninterpretedOption(Iterable<? extends DescriptorProtos$UninterpretedOption> iterable) {
            copyOnWrite();
            ((DescriptorProtos$EnumOptions) this.instance).addAllUninterpretedOption(iterable);
            return this;
        }

        public Builder addUninterpretedOption(DescriptorProtos$UninterpretedOption descriptorProtos$UninterpretedOption) {
            copyOnWrite();
            ((DescriptorProtos$EnumOptions) this.instance).addUninterpretedOption(descriptorProtos$UninterpretedOption);
            return this;
        }

        public Builder clearAllowAlias() {
            copyOnWrite();
            ((DescriptorProtos$EnumOptions) this.instance).clearAllowAlias();
            return this;
        }

        public Builder clearDeprecated() {
            copyOnWrite();
            ((DescriptorProtos$EnumOptions) this.instance).clearDeprecated();
            return this;
        }

        @Deprecated
        public Builder clearDeprecatedLegacyJsonFieldConflicts() {
            copyOnWrite();
            ((DescriptorProtos$EnumOptions) this.instance).clearDeprecatedLegacyJsonFieldConflicts();
            return this;
        }

        public Builder clearFeatures() {
            copyOnWrite();
            ((DescriptorProtos$EnumOptions) this.instance).clearFeatures();
            return this;
        }

        public Builder clearUninterpretedOption() {
            copyOnWrite();
            ((DescriptorProtos$EnumOptions) this.instance).clearUninterpretedOption();
            return this;
        }

        @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$EnumOptionsOrBuilder
        public boolean getAllowAlias() {
            return ((DescriptorProtos$EnumOptions) this.instance).getAllowAlias();
        }

        @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$EnumOptionsOrBuilder
        public boolean getDeprecated() {
            return ((DescriptorProtos$EnumOptions) this.instance).getDeprecated();
        }

        @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$EnumOptionsOrBuilder
        @Deprecated
        public boolean getDeprecatedLegacyJsonFieldConflicts() {
            return ((DescriptorProtos$EnumOptions) this.instance).getDeprecatedLegacyJsonFieldConflicts();
        }

        @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$EnumOptionsOrBuilder
        public DescriptorProtos$FeatureSet getFeatures() {
            return ((DescriptorProtos$EnumOptions) this.instance).getFeatures();
        }

        @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$EnumOptionsOrBuilder
        public DescriptorProtos$UninterpretedOption getUninterpretedOption(int i10) {
            return ((DescriptorProtos$EnumOptions) this.instance).getUninterpretedOption(i10);
        }

        @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$EnumOptionsOrBuilder
        public int getUninterpretedOptionCount() {
            return ((DescriptorProtos$EnumOptions) this.instance).getUninterpretedOptionCount();
        }

        @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$EnumOptionsOrBuilder
        public List<DescriptorProtos$UninterpretedOption> getUninterpretedOptionList() {
            return Collections.unmodifiableList(((DescriptorProtos$EnumOptions) this.instance).getUninterpretedOptionList());
        }

        @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$EnumOptionsOrBuilder
        public boolean hasAllowAlias() {
            return ((DescriptorProtos$EnumOptions) this.instance).hasAllowAlias();
        }

        @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$EnumOptionsOrBuilder
        public boolean hasDeprecated() {
            return ((DescriptorProtos$EnumOptions) this.instance).hasDeprecated();
        }

        @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$EnumOptionsOrBuilder
        @Deprecated
        public boolean hasDeprecatedLegacyJsonFieldConflicts() {
            return ((DescriptorProtos$EnumOptions) this.instance).hasDeprecatedLegacyJsonFieldConflicts();
        }

        @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$EnumOptionsOrBuilder
        public boolean hasFeatures() {
            return ((DescriptorProtos$EnumOptions) this.instance).hasFeatures();
        }

        public Builder mergeFeatures(DescriptorProtos$FeatureSet descriptorProtos$FeatureSet) {
            copyOnWrite();
            ((DescriptorProtos$EnumOptions) this.instance).mergeFeatures(descriptorProtos$FeatureSet);
            return this;
        }

        public Builder removeUninterpretedOption(int i10) {
            copyOnWrite();
            ((DescriptorProtos$EnumOptions) this.instance).removeUninterpretedOption(i10);
            return this;
        }

        public Builder setAllowAlias(boolean z10) {
            copyOnWrite();
            ((DescriptorProtos$EnumOptions) this.instance).setAllowAlias(z10);
            return this;
        }

        public Builder setDeprecated(boolean z10) {
            copyOnWrite();
            ((DescriptorProtos$EnumOptions) this.instance).setDeprecated(z10);
            return this;
        }

        @Deprecated
        public Builder setDeprecatedLegacyJsonFieldConflicts(boolean z10) {
            copyOnWrite();
            ((DescriptorProtos$EnumOptions) this.instance).setDeprecatedLegacyJsonFieldConflicts(z10);
            return this;
        }

        public Builder setFeatures(DescriptorProtos$FeatureSet descriptorProtos$FeatureSet) {
            copyOnWrite();
            ((DescriptorProtos$EnumOptions) this.instance).setFeatures(descriptorProtos$FeatureSet);
            return this;
        }

        public Builder setUninterpretedOption(int i10, DescriptorProtos$UninterpretedOption descriptorProtos$UninterpretedOption) {
            copyOnWrite();
            ((DescriptorProtos$EnumOptions) this.instance).setUninterpretedOption(i10, descriptorProtos$UninterpretedOption);
            return this;
        }

        private Builder() {
            super(DescriptorProtos$EnumOptions.DEFAULT_INSTANCE);
        }

        public Builder addUninterpretedOption(int i10, DescriptorProtos$UninterpretedOption descriptorProtos$UninterpretedOption) {
            copyOnWrite();
            ((DescriptorProtos$EnumOptions) this.instance).addUninterpretedOption(i10, descriptorProtos$UninterpretedOption);
            return this;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public Builder setFeatures(DescriptorProtos$FeatureSet.Builder builder) {
            copyOnWrite();
            ((DescriptorProtos$EnumOptions) this.instance).setFeatures((DescriptorProtos$FeatureSet) builder.build());
            return this;
        }

        public Builder setUninterpretedOption(int i10, DescriptorProtos$UninterpretedOption.Builder builder) {
            copyOnWrite();
            ((DescriptorProtos$EnumOptions) this.instance).setUninterpretedOption(i10, builder.build());
            return this;
        }

        public Builder addUninterpretedOption(DescriptorProtos$UninterpretedOption.Builder builder) {
            copyOnWrite();
            ((DescriptorProtos$EnumOptions) this.instance).addUninterpretedOption(builder.build());
            return this;
        }

        public Builder addUninterpretedOption(int i10, DescriptorProtos$UninterpretedOption.Builder builder) {
            copyOnWrite();
            ((DescriptorProtos$EnumOptions) this.instance).addUninterpretedOption(i10, builder.build());
            return this;
        }
    }

    static {
        DescriptorProtos$EnumOptions descriptorProtos$EnumOptions = new DescriptorProtos$EnumOptions();
        DEFAULT_INSTANCE = descriptorProtos$EnumOptions;
        GeneratedMessageLite.registerDefaultInstance(DescriptorProtos$EnumOptions.class, descriptorProtos$EnumOptions);
    }

    private DescriptorProtos$EnumOptions() {
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
    public void clearAllowAlias() {
        this.bitField0_ &= -2;
        this.allowAlias_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDeprecated() {
        this.bitField0_ &= -3;
        this.deprecated_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDeprecatedLegacyJsonFieldConflicts() {
        this.bitField0_ &= -5;
        this.deprecatedLegacyJsonFieldConflicts_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearFeatures() {
        this.features_ = null;
        this.bitField0_ &= -9;
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

    public static DescriptorProtos$EnumOptions getDefaultInstance() {
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
        this.bitField0_ |= 8;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static Builder newBuilder() {
        return (Builder) DEFAULT_INSTANCE.createBuilder();
    }

    public static DescriptorProtos$EnumOptions parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (DescriptorProtos$EnumOptions) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static DescriptorProtos$EnumOptions parseFrom(ByteBuffer byteBuffer) throws e0 {
        return (DescriptorProtos$EnumOptions) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static h1<DescriptorProtos$EnumOptions> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeUninterpretedOption(int i10) {
        ensureUninterpretedOptionIsMutable();
        this.uninterpretedOption_.remove(i10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAllowAlias(boolean z10) {
        this.bitField0_ |= 1;
        this.allowAlias_ = z10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDeprecated(boolean z10) {
        this.bitField0_ |= 2;
        this.deprecated_ = z10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDeprecatedLegacyJsonFieldConflicts(boolean z10) {
        this.bitField0_ |= 4;
        this.deprecatedLegacyJsonFieldConflicts_ = z10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setFeatures(DescriptorProtos$FeatureSet descriptorProtos$FeatureSet) {
        descriptorProtos$FeatureSet.getClass();
        this.features_ = descriptorProtos$FeatureSet;
        this.bitField0_ |= 8;
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
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0005\u0000\u0001\u0002ϧ\u0005\u0000\u0001\u0002\u0002ဇ\u0000\u0003ဇ\u0001\u0006ဇ\u0002\u0007ᐉ\u0003ϧЛ", new Object[]{"bitField0_", "allowAlias_", "deprecated_", "deprecatedLegacyJsonFieldConflicts_", "features_", "uninterpretedOption_", DescriptorProtos$UninterpretedOption.class});
            case 3:
                return new DescriptorProtos$EnumOptions();
            case 4:
                return new Builder();
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                h1<DescriptorProtos$EnumOptions> h1Var = PARSER;
                if (h1Var != null) {
                    return h1Var;
                }
                synchronized (DescriptorProtos$EnumOptions.class) {
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

    @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$EnumOptionsOrBuilder
    public boolean getAllowAlias() {
        return this.allowAlias_;
    }

    @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$EnumOptionsOrBuilder
    public boolean getDeprecated() {
        return this.deprecated_;
    }

    @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$EnumOptionsOrBuilder
    @Deprecated
    public boolean getDeprecatedLegacyJsonFieldConflicts() {
        return this.deprecatedLegacyJsonFieldConflicts_;
    }

    @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$EnumOptionsOrBuilder
    public DescriptorProtos$FeatureSet getFeatures() {
        DescriptorProtos$FeatureSet descriptorProtos$FeatureSet = this.features_;
        return descriptorProtos$FeatureSet == null ? DescriptorProtos$FeatureSet.getDefaultInstance() : descriptorProtos$FeatureSet;
    }

    @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$EnumOptionsOrBuilder
    public DescriptorProtos$UninterpretedOption getUninterpretedOption(int i10) {
        return this.uninterpretedOption_.get(i10);
    }

    @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$EnumOptionsOrBuilder
    public int getUninterpretedOptionCount() {
        return this.uninterpretedOption_.size();
    }

    @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$EnumOptionsOrBuilder
    public List<DescriptorProtos$UninterpretedOption> getUninterpretedOptionList() {
        return this.uninterpretedOption_;
    }

    public DescriptorProtos$UninterpretedOptionOrBuilder getUninterpretedOptionOrBuilder(int i10) {
        return this.uninterpretedOption_.get(i10);
    }

    public List<? extends DescriptorProtos$UninterpretedOptionOrBuilder> getUninterpretedOptionOrBuilderList() {
        return this.uninterpretedOption_;
    }

    @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$EnumOptionsOrBuilder
    public boolean hasAllowAlias() {
        return (this.bitField0_ & 1) != 0;
    }

    @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$EnumOptionsOrBuilder
    public boolean hasDeprecated() {
        return (this.bitField0_ & 2) != 0;
    }

    @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$EnumOptionsOrBuilder
    @Deprecated
    public boolean hasDeprecatedLegacyJsonFieldConflicts() {
        return (this.bitField0_ & 4) != 0;
    }

    @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$EnumOptionsOrBuilder
    public boolean hasFeatures() {
        return (this.bitField0_ & 8) != 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static Builder newBuilder(DescriptorProtos$EnumOptions descriptorProtos$EnumOptions) {
        return (Builder) DEFAULT_INSTANCE.createBuilder(descriptorProtos$EnumOptions);
    }

    public static DescriptorProtos$EnumOptions parseDelimitedFrom(InputStream inputStream, t tVar) throws IOException {
        return (DescriptorProtos$EnumOptions) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, tVar);
    }

    public static DescriptorProtos$EnumOptions parseFrom(ByteBuffer byteBuffer, t tVar) throws e0 {
        return (DescriptorProtos$EnumOptions) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, tVar);
    }

    public static DescriptorProtos$EnumOptions parseFrom(j jVar) throws e0 {
        return (DescriptorProtos$EnumOptions) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, jVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addUninterpretedOption(int i10, DescriptorProtos$UninterpretedOption descriptorProtos$UninterpretedOption) {
        descriptorProtos$UninterpretedOption.getClass();
        ensureUninterpretedOptionIsMutable();
        this.uninterpretedOption_.add(i10, descriptorProtos$UninterpretedOption);
    }

    public static DescriptorProtos$EnumOptions parseFrom(j jVar, t tVar) throws e0 {
        return (DescriptorProtos$EnumOptions) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, jVar, tVar);
    }

    public static DescriptorProtos$EnumOptions parseFrom(byte[] bArr) throws e0 {
        return (DescriptorProtos$EnumOptions) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static DescriptorProtos$EnumOptions parseFrom(byte[] bArr, t tVar) throws e0 {
        return (DescriptorProtos$EnumOptions) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, tVar);
    }

    public static DescriptorProtos$EnumOptions parseFrom(InputStream inputStream) throws IOException {
        return (DescriptorProtos$EnumOptions) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static DescriptorProtos$EnumOptions parseFrom(InputStream inputStream, t tVar) throws IOException {
        return (DescriptorProtos$EnumOptions) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, tVar);
    }

    public static DescriptorProtos$EnumOptions parseFrom(k kVar) throws IOException {
        return (DescriptorProtos$EnumOptions) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, kVar);
    }

    public static DescriptorProtos$EnumOptions parseFrom(k kVar, t tVar) throws IOException {
        return (DescriptorProtos$EnumOptions) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, kVar, tVar);
    }
}
