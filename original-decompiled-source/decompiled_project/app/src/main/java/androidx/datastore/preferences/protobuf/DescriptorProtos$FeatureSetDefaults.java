package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.DescriptorProtos$FeatureSet;
import androidx.datastore.preferences.protobuf.GeneratedMessageLite;
import androidx.datastore.preferences.protobuf.d0;
import androidx.datastore.preferences.protobuf.p;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public final class DescriptorProtos$FeatureSetDefaults extends GeneratedMessageLite<DescriptorProtos$FeatureSetDefaults, Builder> implements DescriptorProtos$FeatureSetDefaultsOrBuilder {
    public static final int DEFAULTS_FIELD_NUMBER = 1;
    private static final DescriptorProtos$FeatureSetDefaults DEFAULT_INSTANCE;
    public static final int MAXIMUM_EDITION_FIELD_NUMBER = 5;
    public static final int MINIMUM_EDITION_FIELD_NUMBER = 4;
    private static volatile h1<DescriptorProtos$FeatureSetDefaults> PARSER;
    private int bitField0_;
    private int maximumEdition_;
    private int minimumEdition_;
    private byte memoizedIsInitialized = 2;
    private d0.j<FeatureSetEditionDefault> defaults_ = GeneratedMessageLite.emptyProtobufList();

    public static final class Builder extends GeneratedMessageLite.Builder<DescriptorProtos$FeatureSetDefaults, Builder> implements DescriptorProtos$FeatureSetDefaultsOrBuilder {
        public Builder addAllDefaults(Iterable<? extends FeatureSetEditionDefault> iterable) {
            copyOnWrite();
            ((DescriptorProtos$FeatureSetDefaults) this.instance).addAllDefaults(iterable);
            return this;
        }

        public Builder addDefaults(FeatureSetEditionDefault featureSetEditionDefault) {
            copyOnWrite();
            ((DescriptorProtos$FeatureSetDefaults) this.instance).addDefaults(featureSetEditionDefault);
            return this;
        }

        public Builder clearDefaults() {
            copyOnWrite();
            ((DescriptorProtos$FeatureSetDefaults) this.instance).clearDefaults();
            return this;
        }

        public Builder clearMaximumEdition() {
            copyOnWrite();
            ((DescriptorProtos$FeatureSetDefaults) this.instance).clearMaximumEdition();
            return this;
        }

        public Builder clearMinimumEdition() {
            copyOnWrite();
            ((DescriptorProtos$FeatureSetDefaults) this.instance).clearMinimumEdition();
            return this;
        }

        @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$FeatureSetDefaultsOrBuilder
        public FeatureSetEditionDefault getDefaults(int i10) {
            return ((DescriptorProtos$FeatureSetDefaults) this.instance).getDefaults(i10);
        }

        @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$FeatureSetDefaultsOrBuilder
        public int getDefaultsCount() {
            return ((DescriptorProtos$FeatureSetDefaults) this.instance).getDefaultsCount();
        }

        @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$FeatureSetDefaultsOrBuilder
        public List<FeatureSetEditionDefault> getDefaultsList() {
            return Collections.unmodifiableList(((DescriptorProtos$FeatureSetDefaults) this.instance).getDefaultsList());
        }

        @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$FeatureSetDefaultsOrBuilder
        public p getMaximumEdition() {
            return ((DescriptorProtos$FeatureSetDefaults) this.instance).getMaximumEdition();
        }

        @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$FeatureSetDefaultsOrBuilder
        public p getMinimumEdition() {
            return ((DescriptorProtos$FeatureSetDefaults) this.instance).getMinimumEdition();
        }

        @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$FeatureSetDefaultsOrBuilder
        public boolean hasMaximumEdition() {
            return ((DescriptorProtos$FeatureSetDefaults) this.instance).hasMaximumEdition();
        }

        @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$FeatureSetDefaultsOrBuilder
        public boolean hasMinimumEdition() {
            return ((DescriptorProtos$FeatureSetDefaults) this.instance).hasMinimumEdition();
        }

        public Builder removeDefaults(int i10) {
            copyOnWrite();
            ((DescriptorProtos$FeatureSetDefaults) this.instance).removeDefaults(i10);
            return this;
        }

        public Builder setDefaults(int i10, FeatureSetEditionDefault featureSetEditionDefault) {
            copyOnWrite();
            ((DescriptorProtos$FeatureSetDefaults) this.instance).setDefaults(i10, featureSetEditionDefault);
            return this;
        }

        public Builder setMaximumEdition(p pVar) {
            copyOnWrite();
            ((DescriptorProtos$FeatureSetDefaults) this.instance).setMaximumEdition(pVar);
            return this;
        }

        public Builder setMinimumEdition(p pVar) {
            copyOnWrite();
            ((DescriptorProtos$FeatureSetDefaults) this.instance).setMinimumEdition(pVar);
            return this;
        }

        private Builder() {
            super(DescriptorProtos$FeatureSetDefaults.DEFAULT_INSTANCE);
        }

        public Builder addDefaults(int i10, FeatureSetEditionDefault featureSetEditionDefault) {
            copyOnWrite();
            ((DescriptorProtos$FeatureSetDefaults) this.instance).addDefaults(i10, featureSetEditionDefault);
            return this;
        }

        public Builder setDefaults(int i10, FeatureSetEditionDefault.Builder builder) {
            copyOnWrite();
            ((DescriptorProtos$FeatureSetDefaults) this.instance).setDefaults(i10, builder.build());
            return this;
        }

        public Builder addDefaults(FeatureSetEditionDefault.Builder builder) {
            copyOnWrite();
            ((DescriptorProtos$FeatureSetDefaults) this.instance).addDefaults(builder.build());
            return this;
        }

        public Builder addDefaults(int i10, FeatureSetEditionDefault.Builder builder) {
            copyOnWrite();
            ((DescriptorProtos$FeatureSetDefaults) this.instance).addDefaults(i10, builder.build());
            return this;
        }
    }

    public static final class FeatureSetEditionDefault extends GeneratedMessageLite<FeatureSetEditionDefault, Builder> implements FeatureSetEditionDefaultOrBuilder {
        private static final FeatureSetEditionDefault DEFAULT_INSTANCE;
        public static final int EDITION_FIELD_NUMBER = 3;
        public static final int FIXED_FEATURES_FIELD_NUMBER = 5;
        public static final int OVERRIDABLE_FEATURES_FIELD_NUMBER = 4;
        private static volatile h1<FeatureSetEditionDefault> PARSER;
        private int bitField0_;
        private int edition_;
        private DescriptorProtos$FeatureSet fixedFeatures_;
        private byte memoizedIsInitialized = 2;
        private DescriptorProtos$FeatureSet overridableFeatures_;

        public static final class Builder extends GeneratedMessageLite.Builder<FeatureSetEditionDefault, Builder> implements FeatureSetEditionDefaultOrBuilder {
            public Builder clearEdition() {
                copyOnWrite();
                ((FeatureSetEditionDefault) this.instance).clearEdition();
                return this;
            }

            public Builder clearFixedFeatures() {
                copyOnWrite();
                ((FeatureSetEditionDefault) this.instance).clearFixedFeatures();
                return this;
            }

            public Builder clearOverridableFeatures() {
                copyOnWrite();
                ((FeatureSetEditionDefault) this.instance).clearOverridableFeatures();
                return this;
            }

            @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$FeatureSetDefaults.FeatureSetEditionDefaultOrBuilder
            public p getEdition() {
                return ((FeatureSetEditionDefault) this.instance).getEdition();
            }

            @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$FeatureSetDefaults.FeatureSetEditionDefaultOrBuilder
            public DescriptorProtos$FeatureSet getFixedFeatures() {
                return ((FeatureSetEditionDefault) this.instance).getFixedFeatures();
            }

            @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$FeatureSetDefaults.FeatureSetEditionDefaultOrBuilder
            public DescriptorProtos$FeatureSet getOverridableFeatures() {
                return ((FeatureSetEditionDefault) this.instance).getOverridableFeatures();
            }

            @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$FeatureSetDefaults.FeatureSetEditionDefaultOrBuilder
            public boolean hasEdition() {
                return ((FeatureSetEditionDefault) this.instance).hasEdition();
            }

            @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$FeatureSetDefaults.FeatureSetEditionDefaultOrBuilder
            public boolean hasFixedFeatures() {
                return ((FeatureSetEditionDefault) this.instance).hasFixedFeatures();
            }

            @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$FeatureSetDefaults.FeatureSetEditionDefaultOrBuilder
            public boolean hasOverridableFeatures() {
                return ((FeatureSetEditionDefault) this.instance).hasOverridableFeatures();
            }

            public Builder mergeFixedFeatures(DescriptorProtos$FeatureSet descriptorProtos$FeatureSet) {
                copyOnWrite();
                ((FeatureSetEditionDefault) this.instance).mergeFixedFeatures(descriptorProtos$FeatureSet);
                return this;
            }

            public Builder mergeOverridableFeatures(DescriptorProtos$FeatureSet descriptorProtos$FeatureSet) {
                copyOnWrite();
                ((FeatureSetEditionDefault) this.instance).mergeOverridableFeatures(descriptorProtos$FeatureSet);
                return this;
            }

            public Builder setEdition(p pVar) {
                copyOnWrite();
                ((FeatureSetEditionDefault) this.instance).setEdition(pVar);
                return this;
            }

            public Builder setFixedFeatures(DescriptorProtos$FeatureSet descriptorProtos$FeatureSet) {
                copyOnWrite();
                ((FeatureSetEditionDefault) this.instance).setFixedFeatures(descriptorProtos$FeatureSet);
                return this;
            }

            public Builder setOverridableFeatures(DescriptorProtos$FeatureSet descriptorProtos$FeatureSet) {
                copyOnWrite();
                ((FeatureSetEditionDefault) this.instance).setOverridableFeatures(descriptorProtos$FeatureSet);
                return this;
            }

            private Builder() {
                super(FeatureSetEditionDefault.DEFAULT_INSTANCE);
            }

            /* JADX WARN: Multi-variable type inference failed */
            public Builder setFixedFeatures(DescriptorProtos$FeatureSet.Builder builder) {
                copyOnWrite();
                ((FeatureSetEditionDefault) this.instance).setFixedFeatures((DescriptorProtos$FeatureSet) builder.build());
                return this;
            }

            /* JADX WARN: Multi-variable type inference failed */
            public Builder setOverridableFeatures(DescriptorProtos$FeatureSet.Builder builder) {
                copyOnWrite();
                ((FeatureSetEditionDefault) this.instance).setOverridableFeatures((DescriptorProtos$FeatureSet) builder.build());
                return this;
            }
        }

        static {
            FeatureSetEditionDefault featureSetEditionDefault = new FeatureSetEditionDefault();
            DEFAULT_INSTANCE = featureSetEditionDefault;
            GeneratedMessageLite.registerDefaultInstance(FeatureSetEditionDefault.class, featureSetEditionDefault);
        }

        private FeatureSetEditionDefault() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearEdition() {
            this.bitField0_ &= -2;
            this.edition_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearFixedFeatures() {
            this.fixedFeatures_ = null;
            this.bitField0_ &= -5;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearOverridableFeatures() {
            this.overridableFeatures_ = null;
            this.bitField0_ &= -3;
        }

        public static FeatureSetEditionDefault getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX WARN: Multi-variable type inference failed */
        public void mergeFixedFeatures(DescriptorProtos$FeatureSet descriptorProtos$FeatureSet) {
            descriptorProtos$FeatureSet.getClass();
            DescriptorProtos$FeatureSet descriptorProtos$FeatureSet2 = this.fixedFeatures_;
            if (descriptorProtos$FeatureSet2 == null || descriptorProtos$FeatureSet2 == DescriptorProtos$FeatureSet.getDefaultInstance()) {
                this.fixedFeatures_ = descriptorProtos$FeatureSet;
            } else {
                this.fixedFeatures_ = ((DescriptorProtos$FeatureSet.Builder) DescriptorProtos$FeatureSet.newBuilder(this.fixedFeatures_).mergeFrom((DescriptorProtos$FeatureSet.Builder) descriptorProtos$FeatureSet)).buildPartial();
            }
            this.bitField0_ |= 4;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX WARN: Multi-variable type inference failed */
        public void mergeOverridableFeatures(DescriptorProtos$FeatureSet descriptorProtos$FeatureSet) {
            descriptorProtos$FeatureSet.getClass();
            DescriptorProtos$FeatureSet descriptorProtos$FeatureSet2 = this.overridableFeatures_;
            if (descriptorProtos$FeatureSet2 == null || descriptorProtos$FeatureSet2 == DescriptorProtos$FeatureSet.getDefaultInstance()) {
                this.overridableFeatures_ = descriptorProtos$FeatureSet;
            } else {
                this.overridableFeatures_ = ((DescriptorProtos$FeatureSet.Builder) DescriptorProtos$FeatureSet.newBuilder(this.overridableFeatures_).mergeFrom((DescriptorProtos$FeatureSet.Builder) descriptorProtos$FeatureSet)).buildPartial();
            }
            this.bitField0_ |= 2;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static FeatureSetEditionDefault parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (FeatureSetEditionDefault) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static FeatureSetEditionDefault parseFrom(ByteBuffer byteBuffer) throws e0 {
            return (FeatureSetEditionDefault) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static h1<FeatureSetEditionDefault> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setEdition(p pVar) {
            this.edition_ = pVar.f2121a;
            this.bitField0_ |= 1;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setFixedFeatures(DescriptorProtos$FeatureSet descriptorProtos$FeatureSet) {
            descriptorProtos$FeatureSet.getClass();
            this.fixedFeatures_ = descriptorProtos$FeatureSet;
            this.bitField0_ |= 4;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setOverridableFeatures(DescriptorProtos$FeatureSet descriptorProtos$FeatureSet) {
            descriptorProtos$FeatureSet.getClass();
            this.overridableFeatures_ = descriptorProtos$FeatureSet;
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
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0003\u0000\u0001\u0003\u0005\u0003\u0000\u0000\u0002\u0003᠌\u0000\u0004ᐉ\u0001\u0005ᐉ\u0002", new Object[]{"bitField0_", "edition_", p.a.f2122a, "overridableFeatures_", "fixedFeatures_"});
                case 3:
                    return new FeatureSetEditionDefault();
                case 4:
                    return new Builder();
                case 5:
                    return DEFAULT_INSTANCE;
                case 6:
                    h1<FeatureSetEditionDefault> h1Var = PARSER;
                    if (h1Var != null) {
                        return h1Var;
                    }
                    synchronized (FeatureSetEditionDefault.class) {
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

        @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$FeatureSetDefaults.FeatureSetEditionDefaultOrBuilder
        public p getEdition() {
            p pVarA = p.a(this.edition_);
            return pVarA == null ? p.EDITION_UNKNOWN : pVarA;
        }

        @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$FeatureSetDefaults.FeatureSetEditionDefaultOrBuilder
        public DescriptorProtos$FeatureSet getFixedFeatures() {
            DescriptorProtos$FeatureSet descriptorProtos$FeatureSet = this.fixedFeatures_;
            return descriptorProtos$FeatureSet == null ? DescriptorProtos$FeatureSet.getDefaultInstance() : descriptorProtos$FeatureSet;
        }

        @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$FeatureSetDefaults.FeatureSetEditionDefaultOrBuilder
        public DescriptorProtos$FeatureSet getOverridableFeatures() {
            DescriptorProtos$FeatureSet descriptorProtos$FeatureSet = this.overridableFeatures_;
            return descriptorProtos$FeatureSet == null ? DescriptorProtos$FeatureSet.getDefaultInstance() : descriptorProtos$FeatureSet;
        }

        @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$FeatureSetDefaults.FeatureSetEditionDefaultOrBuilder
        public boolean hasEdition() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$FeatureSetDefaults.FeatureSetEditionDefaultOrBuilder
        public boolean hasFixedFeatures() {
            return (this.bitField0_ & 4) != 0;
        }

        @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$FeatureSetDefaults.FeatureSetEditionDefaultOrBuilder
        public boolean hasOverridableFeatures() {
            return (this.bitField0_ & 2) != 0;
        }

        public static Builder newBuilder(FeatureSetEditionDefault featureSetEditionDefault) {
            return DEFAULT_INSTANCE.createBuilder(featureSetEditionDefault);
        }

        public static FeatureSetEditionDefault parseDelimitedFrom(InputStream inputStream, t tVar) throws IOException {
            return (FeatureSetEditionDefault) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, tVar);
        }

        public static FeatureSetEditionDefault parseFrom(ByteBuffer byteBuffer, t tVar) throws e0 {
            return (FeatureSetEditionDefault) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, tVar);
        }

        public static FeatureSetEditionDefault parseFrom(j jVar) throws e0 {
            return (FeatureSetEditionDefault) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, jVar);
        }

        public static FeatureSetEditionDefault parseFrom(j jVar, t tVar) throws e0 {
            return (FeatureSetEditionDefault) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, jVar, tVar);
        }

        public static FeatureSetEditionDefault parseFrom(byte[] bArr) throws e0 {
            return (FeatureSetEditionDefault) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static FeatureSetEditionDefault parseFrom(byte[] bArr, t tVar) throws e0 {
            return (FeatureSetEditionDefault) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, tVar);
        }

        public static FeatureSetEditionDefault parseFrom(InputStream inputStream) throws IOException {
            return (FeatureSetEditionDefault) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static FeatureSetEditionDefault parseFrom(InputStream inputStream, t tVar) throws IOException {
            return (FeatureSetEditionDefault) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, tVar);
        }

        public static FeatureSetEditionDefault parseFrom(k kVar) throws IOException {
            return (FeatureSetEditionDefault) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, kVar);
        }

        public static FeatureSetEditionDefault parseFrom(k kVar, t tVar) throws IOException {
            return (FeatureSetEditionDefault) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, kVar, tVar);
        }
    }

    public interface FeatureSetEditionDefaultOrBuilder extends w0 {
        /* synthetic */ MessageLite getDefaultInstanceForType();

        p getEdition();

        DescriptorProtos$FeatureSet getFixedFeatures();

        DescriptorProtos$FeatureSet getOverridableFeatures();

        boolean hasEdition();

        boolean hasFixedFeatures();

        boolean hasOverridableFeatures();

        @Override // androidx.datastore.preferences.protobuf.w0
        /* synthetic */ boolean isInitialized();
    }

    static {
        DescriptorProtos$FeatureSetDefaults descriptorProtos$FeatureSetDefaults = new DescriptorProtos$FeatureSetDefaults();
        DEFAULT_INSTANCE = descriptorProtos$FeatureSetDefaults;
        GeneratedMessageLite.registerDefaultInstance(DescriptorProtos$FeatureSetDefaults.class, descriptorProtos$FeatureSetDefaults);
    }

    private DescriptorProtos$FeatureSetDefaults() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllDefaults(Iterable<? extends FeatureSetEditionDefault> iterable) {
        ensureDefaultsIsMutable();
        AbstractMessageLite.addAll(iterable, this.defaults_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addDefaults(FeatureSetEditionDefault featureSetEditionDefault) {
        featureSetEditionDefault.getClass();
        ensureDefaultsIsMutable();
        this.defaults_.add(featureSetEditionDefault);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDefaults() {
        this.defaults_ = GeneratedMessageLite.emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearMaximumEdition() {
        this.bitField0_ &= -3;
        this.maximumEdition_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearMinimumEdition() {
        this.bitField0_ &= -2;
        this.minimumEdition_ = 0;
    }

    private void ensureDefaultsIsMutable() {
        d0.j<FeatureSetEditionDefault> jVar = this.defaults_;
        if (jVar.isModifiable()) {
            return;
        }
        this.defaults_ = GeneratedMessageLite.mutableCopy(jVar);
    }

    public static DescriptorProtos$FeatureSetDefaults getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static DescriptorProtos$FeatureSetDefaults parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (DescriptorProtos$FeatureSetDefaults) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static DescriptorProtos$FeatureSetDefaults parseFrom(ByteBuffer byteBuffer) throws e0 {
        return (DescriptorProtos$FeatureSetDefaults) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static h1<DescriptorProtos$FeatureSetDefaults> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeDefaults(int i10) {
        ensureDefaultsIsMutable();
        this.defaults_.remove(i10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDefaults(int i10, FeatureSetEditionDefault featureSetEditionDefault) {
        featureSetEditionDefault.getClass();
        ensureDefaultsIsMutable();
        this.defaults_.set(i10, featureSetEditionDefault);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMaximumEdition(p pVar) {
        this.maximumEdition_ = pVar.f2121a;
        this.bitField0_ |= 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMinimumEdition(p pVar) {
        this.minimumEdition_ = pVar.f2121a;
        this.bitField0_ |= 1;
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
                p.a aVar2 = p.a.f2122a;
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0003\u0000\u0001\u0001\u0005\u0003\u0000\u0001\u0001\u0001Л\u0004᠌\u0000\u0005᠌\u0001", new Object[]{"bitField0_", "defaults_", FeatureSetEditionDefault.class, "minimumEdition_", aVar2, "maximumEdition_", aVar2});
            case 3:
                return new DescriptorProtos$FeatureSetDefaults();
            case 4:
                return new Builder();
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                h1<DescriptorProtos$FeatureSetDefaults> h1Var = PARSER;
                if (h1Var != null) {
                    return h1Var;
                }
                synchronized (DescriptorProtos$FeatureSetDefaults.class) {
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

    @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$FeatureSetDefaultsOrBuilder
    public FeatureSetEditionDefault getDefaults(int i10) {
        return this.defaults_.get(i10);
    }

    @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$FeatureSetDefaultsOrBuilder
    public int getDefaultsCount() {
        return this.defaults_.size();
    }

    @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$FeatureSetDefaultsOrBuilder
    public List<FeatureSetEditionDefault> getDefaultsList() {
        return this.defaults_;
    }

    public FeatureSetEditionDefaultOrBuilder getDefaultsOrBuilder(int i10) {
        return this.defaults_.get(i10);
    }

    public List<? extends FeatureSetEditionDefaultOrBuilder> getDefaultsOrBuilderList() {
        return this.defaults_;
    }

    @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$FeatureSetDefaultsOrBuilder
    public p getMaximumEdition() {
        p pVarA = p.a(this.maximumEdition_);
        return pVarA == null ? p.EDITION_UNKNOWN : pVarA;
    }

    @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$FeatureSetDefaultsOrBuilder
    public p getMinimumEdition() {
        p pVarA = p.a(this.minimumEdition_);
        return pVarA == null ? p.EDITION_UNKNOWN : pVarA;
    }

    @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$FeatureSetDefaultsOrBuilder
    public boolean hasMaximumEdition() {
        return (this.bitField0_ & 2) != 0;
    }

    @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$FeatureSetDefaultsOrBuilder
    public boolean hasMinimumEdition() {
        return (this.bitField0_ & 1) != 0;
    }

    public static Builder newBuilder(DescriptorProtos$FeatureSetDefaults descriptorProtos$FeatureSetDefaults) {
        return DEFAULT_INSTANCE.createBuilder(descriptorProtos$FeatureSetDefaults);
    }

    public static DescriptorProtos$FeatureSetDefaults parseDelimitedFrom(InputStream inputStream, t tVar) throws IOException {
        return (DescriptorProtos$FeatureSetDefaults) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, tVar);
    }

    public static DescriptorProtos$FeatureSetDefaults parseFrom(ByteBuffer byteBuffer, t tVar) throws e0 {
        return (DescriptorProtos$FeatureSetDefaults) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, tVar);
    }

    public static DescriptorProtos$FeatureSetDefaults parseFrom(j jVar) throws e0 {
        return (DescriptorProtos$FeatureSetDefaults) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, jVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addDefaults(int i10, FeatureSetEditionDefault featureSetEditionDefault) {
        featureSetEditionDefault.getClass();
        ensureDefaultsIsMutable();
        this.defaults_.add(i10, featureSetEditionDefault);
    }

    public static DescriptorProtos$FeatureSetDefaults parseFrom(j jVar, t tVar) throws e0 {
        return (DescriptorProtos$FeatureSetDefaults) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, jVar, tVar);
    }

    public static DescriptorProtos$FeatureSetDefaults parseFrom(byte[] bArr) throws e0 {
        return (DescriptorProtos$FeatureSetDefaults) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static DescriptorProtos$FeatureSetDefaults parseFrom(byte[] bArr, t tVar) throws e0 {
        return (DescriptorProtos$FeatureSetDefaults) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, tVar);
    }

    public static DescriptorProtos$FeatureSetDefaults parseFrom(InputStream inputStream) throws IOException {
        return (DescriptorProtos$FeatureSetDefaults) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static DescriptorProtos$FeatureSetDefaults parseFrom(InputStream inputStream, t tVar) throws IOException {
        return (DescriptorProtos$FeatureSetDefaults) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, tVar);
    }

    public static DescriptorProtos$FeatureSetDefaults parseFrom(k kVar) throws IOException {
        return (DescriptorProtos$FeatureSetDefaults) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, kVar);
    }

    public static DescriptorProtos$FeatureSetDefaults parseFrom(k kVar, t tVar) throws IOException {
        return (DescriptorProtos$FeatureSetDefaults) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, kVar, tVar);
    }
}
