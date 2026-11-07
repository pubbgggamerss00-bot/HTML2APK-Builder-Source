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
public final class DescriptorProtos$MessageOptions extends GeneratedMessageLite.ExtendableMessage<DescriptorProtos$MessageOptions, Builder> implements DescriptorProtos$MessageOptionsOrBuilder {
    private static final DescriptorProtos$MessageOptions DEFAULT_INSTANCE;
    public static final int DEPRECATED_FIELD_NUMBER = 3;
    public static final int DEPRECATED_LEGACY_JSON_FIELD_CONFLICTS_FIELD_NUMBER = 11;
    public static final int FEATURES_FIELD_NUMBER = 12;
    public static final int MAP_ENTRY_FIELD_NUMBER = 7;
    public static final int MESSAGE_SET_WIRE_FORMAT_FIELD_NUMBER = 1;
    public static final int NO_STANDARD_DESCRIPTOR_ACCESSOR_FIELD_NUMBER = 2;
    private static volatile h1<DescriptorProtos$MessageOptions> PARSER = null;
    public static final int UNINTERPRETED_OPTION_FIELD_NUMBER = 999;
    private int bitField0_;
    private boolean deprecatedLegacyJsonFieldConflicts_;
    private boolean deprecated_;
    private DescriptorProtos$FeatureSet features_;
    private boolean mapEntry_;
    private boolean messageSetWireFormat_;
    private boolean noStandardDescriptorAccessor_;
    private byte memoizedIsInitialized = 2;
    private d0.j<DescriptorProtos$UninterpretedOption> uninterpretedOption_ = GeneratedMessageLite.emptyProtobufList();

    public static final class Builder extends GeneratedMessageLite.ExtendableBuilder<DescriptorProtos$MessageOptions, Builder> implements DescriptorProtos$MessageOptionsOrBuilder {
        public Builder addAllUninterpretedOption(Iterable<? extends DescriptorProtos$UninterpretedOption> iterable) {
            copyOnWrite();
            ((DescriptorProtos$MessageOptions) this.instance).addAllUninterpretedOption(iterable);
            return this;
        }

        public Builder addUninterpretedOption(DescriptorProtos$UninterpretedOption descriptorProtos$UninterpretedOption) {
            copyOnWrite();
            ((DescriptorProtos$MessageOptions) this.instance).addUninterpretedOption(descriptorProtos$UninterpretedOption);
            return this;
        }

        public Builder clearDeprecated() {
            copyOnWrite();
            ((DescriptorProtos$MessageOptions) this.instance).clearDeprecated();
            return this;
        }

        @Deprecated
        public Builder clearDeprecatedLegacyJsonFieldConflicts() {
            copyOnWrite();
            ((DescriptorProtos$MessageOptions) this.instance).clearDeprecatedLegacyJsonFieldConflicts();
            return this;
        }

        public Builder clearFeatures() {
            copyOnWrite();
            ((DescriptorProtos$MessageOptions) this.instance).clearFeatures();
            return this;
        }

        public Builder clearMapEntry() {
            copyOnWrite();
            ((DescriptorProtos$MessageOptions) this.instance).clearMapEntry();
            return this;
        }

        public Builder clearMessageSetWireFormat() {
            copyOnWrite();
            ((DescriptorProtos$MessageOptions) this.instance).clearMessageSetWireFormat();
            return this;
        }

        public Builder clearNoStandardDescriptorAccessor() {
            copyOnWrite();
            ((DescriptorProtos$MessageOptions) this.instance).clearNoStandardDescriptorAccessor();
            return this;
        }

        public Builder clearUninterpretedOption() {
            copyOnWrite();
            ((DescriptorProtos$MessageOptions) this.instance).clearUninterpretedOption();
            return this;
        }

        @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$MessageOptionsOrBuilder
        public boolean getDeprecated() {
            return ((DescriptorProtos$MessageOptions) this.instance).getDeprecated();
        }

        @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$MessageOptionsOrBuilder
        @Deprecated
        public boolean getDeprecatedLegacyJsonFieldConflicts() {
            return ((DescriptorProtos$MessageOptions) this.instance).getDeprecatedLegacyJsonFieldConflicts();
        }

        @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$MessageOptionsOrBuilder
        public DescriptorProtos$FeatureSet getFeatures() {
            return ((DescriptorProtos$MessageOptions) this.instance).getFeatures();
        }

        @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$MessageOptionsOrBuilder
        public boolean getMapEntry() {
            return ((DescriptorProtos$MessageOptions) this.instance).getMapEntry();
        }

        @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$MessageOptionsOrBuilder
        public boolean getMessageSetWireFormat() {
            return ((DescriptorProtos$MessageOptions) this.instance).getMessageSetWireFormat();
        }

        @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$MessageOptionsOrBuilder
        public boolean getNoStandardDescriptorAccessor() {
            return ((DescriptorProtos$MessageOptions) this.instance).getNoStandardDescriptorAccessor();
        }

        @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$MessageOptionsOrBuilder
        public DescriptorProtos$UninterpretedOption getUninterpretedOption(int i10) {
            return ((DescriptorProtos$MessageOptions) this.instance).getUninterpretedOption(i10);
        }

        @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$MessageOptionsOrBuilder
        public int getUninterpretedOptionCount() {
            return ((DescriptorProtos$MessageOptions) this.instance).getUninterpretedOptionCount();
        }

        @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$MessageOptionsOrBuilder
        public List<DescriptorProtos$UninterpretedOption> getUninterpretedOptionList() {
            return Collections.unmodifiableList(((DescriptorProtos$MessageOptions) this.instance).getUninterpretedOptionList());
        }

        @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$MessageOptionsOrBuilder
        public boolean hasDeprecated() {
            return ((DescriptorProtos$MessageOptions) this.instance).hasDeprecated();
        }

        @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$MessageOptionsOrBuilder
        @Deprecated
        public boolean hasDeprecatedLegacyJsonFieldConflicts() {
            return ((DescriptorProtos$MessageOptions) this.instance).hasDeprecatedLegacyJsonFieldConflicts();
        }

        @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$MessageOptionsOrBuilder
        public boolean hasFeatures() {
            return ((DescriptorProtos$MessageOptions) this.instance).hasFeatures();
        }

        @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$MessageOptionsOrBuilder
        public boolean hasMapEntry() {
            return ((DescriptorProtos$MessageOptions) this.instance).hasMapEntry();
        }

        @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$MessageOptionsOrBuilder
        public boolean hasMessageSetWireFormat() {
            return ((DescriptorProtos$MessageOptions) this.instance).hasMessageSetWireFormat();
        }

        @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$MessageOptionsOrBuilder
        public boolean hasNoStandardDescriptorAccessor() {
            return ((DescriptorProtos$MessageOptions) this.instance).hasNoStandardDescriptorAccessor();
        }

        public Builder mergeFeatures(DescriptorProtos$FeatureSet descriptorProtos$FeatureSet) {
            copyOnWrite();
            ((DescriptorProtos$MessageOptions) this.instance).mergeFeatures(descriptorProtos$FeatureSet);
            return this;
        }

        public Builder removeUninterpretedOption(int i10) {
            copyOnWrite();
            ((DescriptorProtos$MessageOptions) this.instance).removeUninterpretedOption(i10);
            return this;
        }

        public Builder setDeprecated(boolean z10) {
            copyOnWrite();
            ((DescriptorProtos$MessageOptions) this.instance).setDeprecated(z10);
            return this;
        }

        @Deprecated
        public Builder setDeprecatedLegacyJsonFieldConflicts(boolean z10) {
            copyOnWrite();
            ((DescriptorProtos$MessageOptions) this.instance).setDeprecatedLegacyJsonFieldConflicts(z10);
            return this;
        }

        public Builder setFeatures(DescriptorProtos$FeatureSet descriptorProtos$FeatureSet) {
            copyOnWrite();
            ((DescriptorProtos$MessageOptions) this.instance).setFeatures(descriptorProtos$FeatureSet);
            return this;
        }

        public Builder setMapEntry(boolean z10) {
            copyOnWrite();
            ((DescriptorProtos$MessageOptions) this.instance).setMapEntry(z10);
            return this;
        }

        public Builder setMessageSetWireFormat(boolean z10) {
            copyOnWrite();
            ((DescriptorProtos$MessageOptions) this.instance).setMessageSetWireFormat(z10);
            return this;
        }

        public Builder setNoStandardDescriptorAccessor(boolean z10) {
            copyOnWrite();
            ((DescriptorProtos$MessageOptions) this.instance).setNoStandardDescriptorAccessor(z10);
            return this;
        }

        public Builder setUninterpretedOption(int i10, DescriptorProtos$UninterpretedOption descriptorProtos$UninterpretedOption) {
            copyOnWrite();
            ((DescriptorProtos$MessageOptions) this.instance).setUninterpretedOption(i10, descriptorProtos$UninterpretedOption);
            return this;
        }

        private Builder() {
            super(DescriptorProtos$MessageOptions.DEFAULT_INSTANCE);
        }

        public Builder addUninterpretedOption(int i10, DescriptorProtos$UninterpretedOption descriptorProtos$UninterpretedOption) {
            copyOnWrite();
            ((DescriptorProtos$MessageOptions) this.instance).addUninterpretedOption(i10, descriptorProtos$UninterpretedOption);
            return this;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public Builder setFeatures(DescriptorProtos$FeatureSet.Builder builder) {
            copyOnWrite();
            ((DescriptorProtos$MessageOptions) this.instance).setFeatures((DescriptorProtos$FeatureSet) builder.build());
            return this;
        }

        public Builder setUninterpretedOption(int i10, DescriptorProtos$UninterpretedOption.Builder builder) {
            copyOnWrite();
            ((DescriptorProtos$MessageOptions) this.instance).setUninterpretedOption(i10, builder.build());
            return this;
        }

        public Builder addUninterpretedOption(DescriptorProtos$UninterpretedOption.Builder builder) {
            copyOnWrite();
            ((DescriptorProtos$MessageOptions) this.instance).addUninterpretedOption(builder.build());
            return this;
        }

        public Builder addUninterpretedOption(int i10, DescriptorProtos$UninterpretedOption.Builder builder) {
            copyOnWrite();
            ((DescriptorProtos$MessageOptions) this.instance).addUninterpretedOption(i10, builder.build());
            return this;
        }
    }

    static {
        DescriptorProtos$MessageOptions descriptorProtos$MessageOptions = new DescriptorProtos$MessageOptions();
        DEFAULT_INSTANCE = descriptorProtos$MessageOptions;
        GeneratedMessageLite.registerDefaultInstance(DescriptorProtos$MessageOptions.class, descriptorProtos$MessageOptions);
    }

    private DescriptorProtos$MessageOptions() {
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
        this.bitField0_ &= -5;
        this.deprecated_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDeprecatedLegacyJsonFieldConflicts() {
        this.bitField0_ &= -17;
        this.deprecatedLegacyJsonFieldConflicts_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearFeatures() {
        this.features_ = null;
        this.bitField0_ &= -33;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearMapEntry() {
        this.bitField0_ &= -9;
        this.mapEntry_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearMessageSetWireFormat() {
        this.bitField0_ &= -2;
        this.messageSetWireFormat_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearNoStandardDescriptorAccessor() {
        this.bitField0_ &= -3;
        this.noStandardDescriptorAccessor_ = false;
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

    public static DescriptorProtos$MessageOptions getDefaultInstance() {
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
        this.bitField0_ |= 32;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static Builder newBuilder() {
        return (Builder) DEFAULT_INSTANCE.createBuilder();
    }

    public static DescriptorProtos$MessageOptions parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (DescriptorProtos$MessageOptions) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static DescriptorProtos$MessageOptions parseFrom(ByteBuffer byteBuffer) throws e0 {
        return (DescriptorProtos$MessageOptions) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static h1<DescriptorProtos$MessageOptions> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeUninterpretedOption(int i10) {
        ensureUninterpretedOptionIsMutable();
        this.uninterpretedOption_.remove(i10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDeprecated(boolean z10) {
        this.bitField0_ |= 4;
        this.deprecated_ = z10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDeprecatedLegacyJsonFieldConflicts(boolean z10) {
        this.bitField0_ |= 16;
        this.deprecatedLegacyJsonFieldConflicts_ = z10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setFeatures(DescriptorProtos$FeatureSet descriptorProtos$FeatureSet) {
        descriptorProtos$FeatureSet.getClass();
        this.features_ = descriptorProtos$FeatureSet;
        this.bitField0_ |= 32;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMapEntry(boolean z10) {
        this.bitField0_ |= 8;
        this.mapEntry_ = z10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMessageSetWireFormat(boolean z10) {
        this.bitField0_ |= 1;
        this.messageSetWireFormat_ = z10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setNoStandardDescriptorAccessor(boolean z10) {
        this.bitField0_ |= 2;
        this.noStandardDescriptorAccessor_ = z10;
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
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0007\u0000\u0001\u0001ϧ\u0007\u0000\u0001\u0002\u0001ဇ\u0000\u0002ဇ\u0001\u0003ဇ\u0002\u0007ဇ\u0003\u000bဇ\u0004\fᐉ\u0005ϧЛ", new Object[]{"bitField0_", "messageSetWireFormat_", "noStandardDescriptorAccessor_", "deprecated_", "mapEntry_", "deprecatedLegacyJsonFieldConflicts_", "features_", "uninterpretedOption_", DescriptorProtos$UninterpretedOption.class});
            case 3:
                return new DescriptorProtos$MessageOptions();
            case 4:
                return new Builder();
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                h1<DescriptorProtos$MessageOptions> h1Var = PARSER;
                if (h1Var != null) {
                    return h1Var;
                }
                synchronized (DescriptorProtos$MessageOptions.class) {
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

    @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$MessageOptionsOrBuilder
    public boolean getDeprecated() {
        return this.deprecated_;
    }

    @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$MessageOptionsOrBuilder
    @Deprecated
    public boolean getDeprecatedLegacyJsonFieldConflicts() {
        return this.deprecatedLegacyJsonFieldConflicts_;
    }

    @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$MessageOptionsOrBuilder
    public DescriptorProtos$FeatureSet getFeatures() {
        DescriptorProtos$FeatureSet descriptorProtos$FeatureSet = this.features_;
        return descriptorProtos$FeatureSet == null ? DescriptorProtos$FeatureSet.getDefaultInstance() : descriptorProtos$FeatureSet;
    }

    @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$MessageOptionsOrBuilder
    public boolean getMapEntry() {
        return this.mapEntry_;
    }

    @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$MessageOptionsOrBuilder
    public boolean getMessageSetWireFormat() {
        return this.messageSetWireFormat_;
    }

    @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$MessageOptionsOrBuilder
    public boolean getNoStandardDescriptorAccessor() {
        return this.noStandardDescriptorAccessor_;
    }

    @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$MessageOptionsOrBuilder
    public DescriptorProtos$UninterpretedOption getUninterpretedOption(int i10) {
        return this.uninterpretedOption_.get(i10);
    }

    @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$MessageOptionsOrBuilder
    public int getUninterpretedOptionCount() {
        return this.uninterpretedOption_.size();
    }

    @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$MessageOptionsOrBuilder
    public List<DescriptorProtos$UninterpretedOption> getUninterpretedOptionList() {
        return this.uninterpretedOption_;
    }

    public DescriptorProtos$UninterpretedOptionOrBuilder getUninterpretedOptionOrBuilder(int i10) {
        return this.uninterpretedOption_.get(i10);
    }

    public List<? extends DescriptorProtos$UninterpretedOptionOrBuilder> getUninterpretedOptionOrBuilderList() {
        return this.uninterpretedOption_;
    }

    @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$MessageOptionsOrBuilder
    public boolean hasDeprecated() {
        return (this.bitField0_ & 4) != 0;
    }

    @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$MessageOptionsOrBuilder
    @Deprecated
    public boolean hasDeprecatedLegacyJsonFieldConflicts() {
        return (this.bitField0_ & 16) != 0;
    }

    @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$MessageOptionsOrBuilder
    public boolean hasFeatures() {
        return (this.bitField0_ & 32) != 0;
    }

    @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$MessageOptionsOrBuilder
    public boolean hasMapEntry() {
        return (this.bitField0_ & 8) != 0;
    }

    @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$MessageOptionsOrBuilder
    public boolean hasMessageSetWireFormat() {
        return (this.bitField0_ & 1) != 0;
    }

    @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$MessageOptionsOrBuilder
    public boolean hasNoStandardDescriptorAccessor() {
        return (this.bitField0_ & 2) != 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static Builder newBuilder(DescriptorProtos$MessageOptions descriptorProtos$MessageOptions) {
        return (Builder) DEFAULT_INSTANCE.createBuilder(descriptorProtos$MessageOptions);
    }

    public static DescriptorProtos$MessageOptions parseDelimitedFrom(InputStream inputStream, t tVar) throws IOException {
        return (DescriptorProtos$MessageOptions) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, tVar);
    }

    public static DescriptorProtos$MessageOptions parseFrom(ByteBuffer byteBuffer, t tVar) throws e0 {
        return (DescriptorProtos$MessageOptions) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, tVar);
    }

    public static DescriptorProtos$MessageOptions parseFrom(j jVar) throws e0 {
        return (DescriptorProtos$MessageOptions) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, jVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addUninterpretedOption(int i10, DescriptorProtos$UninterpretedOption descriptorProtos$UninterpretedOption) {
        descriptorProtos$UninterpretedOption.getClass();
        ensureUninterpretedOptionIsMutable();
        this.uninterpretedOption_.add(i10, descriptorProtos$UninterpretedOption);
    }

    public static DescriptorProtos$MessageOptions parseFrom(j jVar, t tVar) throws e0 {
        return (DescriptorProtos$MessageOptions) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, jVar, tVar);
    }

    public static DescriptorProtos$MessageOptions parseFrom(byte[] bArr) throws e0 {
        return (DescriptorProtos$MessageOptions) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static DescriptorProtos$MessageOptions parseFrom(byte[] bArr, t tVar) throws e0 {
        return (DescriptorProtos$MessageOptions) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, tVar);
    }

    public static DescriptorProtos$MessageOptions parseFrom(InputStream inputStream) throws IOException {
        return (DescriptorProtos$MessageOptions) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static DescriptorProtos$MessageOptions parseFrom(InputStream inputStream, t tVar) throws IOException {
        return (DescriptorProtos$MessageOptions) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, tVar);
    }

    public static DescriptorProtos$MessageOptions parseFrom(k kVar) throws IOException {
        return (DescriptorProtos$MessageOptions) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, kVar);
    }

    public static DescriptorProtos$MessageOptions parseFrom(k kVar, t tVar) throws IOException {
        return (DescriptorProtos$MessageOptions) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, kVar, tVar);
    }
}
