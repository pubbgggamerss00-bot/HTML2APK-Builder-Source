package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.DescriptorProtos$FeatureSet;
import androidx.datastore.preferences.protobuf.DescriptorProtos$UninterpretedOption;
import androidx.datastore.preferences.protobuf.GeneratedMessageLite;
import androidx.datastore.preferences.protobuf.d0;
import androidx.datastore.preferences.protobuf.p;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public final class DescriptorProtos$FieldOptions extends GeneratedMessageLite.ExtendableMessage<DescriptorProtos$FieldOptions, Builder> implements DescriptorProtos$FieldOptionsOrBuilder {
    public static final int CTYPE_FIELD_NUMBER = 1;
    public static final int DEBUG_REDACT_FIELD_NUMBER = 16;
    private static final DescriptorProtos$FieldOptions DEFAULT_INSTANCE;
    public static final int DEPRECATED_FIELD_NUMBER = 3;
    public static final int EDITION_DEFAULTS_FIELD_NUMBER = 20;
    public static final int FEATURES_FIELD_NUMBER = 21;
    public static final int FEATURE_SUPPORT_FIELD_NUMBER = 22;
    public static final int JSTYPE_FIELD_NUMBER = 6;
    public static final int LAZY_FIELD_NUMBER = 5;
    public static final int PACKED_FIELD_NUMBER = 2;
    private static volatile h1<DescriptorProtos$FieldOptions> PARSER = null;
    public static final int RETENTION_FIELD_NUMBER = 17;
    public static final int TARGETS_FIELD_NUMBER = 19;
    public static final int UNINTERPRETED_OPTION_FIELD_NUMBER = 999;
    public static final int UNVERIFIED_LAZY_FIELD_NUMBER = 15;
    public static final int WEAK_FIELD_NUMBER = 10;
    private static final d0.h.a<e> targets_converter_ = new a();
    private int bitField0_;
    private int ctype_;
    private boolean debugRedact_;
    private boolean deprecated_;
    private FeatureSupport featureSupport_;
    private DescriptorProtos$FeatureSet features_;
    private int jstype_;
    private boolean lazy_;
    private boolean packed_;
    private int retention_;
    private boolean unverifiedLazy_;
    private boolean weak_;
    private byte memoizedIsInitialized = 2;
    private d0.g targets_ = GeneratedMessageLite.emptyIntList();
    private d0.j<EditionDefault> editionDefaults_ = GeneratedMessageLite.emptyProtobufList();
    private d0.j<DescriptorProtos$UninterpretedOption> uninterpretedOption_ = GeneratedMessageLite.emptyProtobufList();

    public static final class Builder extends GeneratedMessageLite.ExtendableBuilder<DescriptorProtos$FieldOptions, Builder> implements DescriptorProtos$FieldOptionsOrBuilder {
        public Builder addAllEditionDefaults(Iterable<? extends EditionDefault> iterable) {
            copyOnWrite();
            ((DescriptorProtos$FieldOptions) this.instance).addAllEditionDefaults(iterable);
            return this;
        }

        public Builder addAllTargets(Iterable<? extends e> iterable) {
            copyOnWrite();
            ((DescriptorProtos$FieldOptions) this.instance).addAllTargets(iterable);
            return this;
        }

        public Builder addAllUninterpretedOption(Iterable<? extends DescriptorProtos$UninterpretedOption> iterable) {
            copyOnWrite();
            ((DescriptorProtos$FieldOptions) this.instance).addAllUninterpretedOption(iterable);
            return this;
        }

        public Builder addEditionDefaults(EditionDefault editionDefault) {
            copyOnWrite();
            ((DescriptorProtos$FieldOptions) this.instance).addEditionDefaults(editionDefault);
            return this;
        }

        public Builder addTargets(e eVar) {
            copyOnWrite();
            ((DescriptorProtos$FieldOptions) this.instance).addTargets(eVar);
            return this;
        }

        public Builder addUninterpretedOption(DescriptorProtos$UninterpretedOption descriptorProtos$UninterpretedOption) {
            copyOnWrite();
            ((DescriptorProtos$FieldOptions) this.instance).addUninterpretedOption(descriptorProtos$UninterpretedOption);
            return this;
        }

        public Builder clearCtype() {
            copyOnWrite();
            ((DescriptorProtos$FieldOptions) this.instance).clearCtype();
            return this;
        }

        public Builder clearDebugRedact() {
            copyOnWrite();
            ((DescriptorProtos$FieldOptions) this.instance).clearDebugRedact();
            return this;
        }

        public Builder clearDeprecated() {
            copyOnWrite();
            ((DescriptorProtos$FieldOptions) this.instance).clearDeprecated();
            return this;
        }

        public Builder clearEditionDefaults() {
            copyOnWrite();
            ((DescriptorProtos$FieldOptions) this.instance).clearEditionDefaults();
            return this;
        }

        public Builder clearFeatureSupport() {
            copyOnWrite();
            ((DescriptorProtos$FieldOptions) this.instance).clearFeatureSupport();
            return this;
        }

        public Builder clearFeatures() {
            copyOnWrite();
            ((DescriptorProtos$FieldOptions) this.instance).clearFeatures();
            return this;
        }

        public Builder clearJstype() {
            copyOnWrite();
            ((DescriptorProtos$FieldOptions) this.instance).clearJstype();
            return this;
        }

        public Builder clearLazy() {
            copyOnWrite();
            ((DescriptorProtos$FieldOptions) this.instance).clearLazy();
            return this;
        }

        public Builder clearPacked() {
            copyOnWrite();
            ((DescriptorProtos$FieldOptions) this.instance).clearPacked();
            return this;
        }

        public Builder clearRetention() {
            copyOnWrite();
            ((DescriptorProtos$FieldOptions) this.instance).clearRetention();
            return this;
        }

        public Builder clearTargets() {
            copyOnWrite();
            ((DescriptorProtos$FieldOptions) this.instance).clearTargets();
            return this;
        }

        public Builder clearUninterpretedOption() {
            copyOnWrite();
            ((DescriptorProtos$FieldOptions) this.instance).clearUninterpretedOption();
            return this;
        }

        public Builder clearUnverifiedLazy() {
            copyOnWrite();
            ((DescriptorProtos$FieldOptions) this.instance).clearUnverifiedLazy();
            return this;
        }

        public Builder clearWeak() {
            copyOnWrite();
            ((DescriptorProtos$FieldOptions) this.instance).clearWeak();
            return this;
        }

        @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$FieldOptionsOrBuilder
        public b getCtype() {
            return ((DescriptorProtos$FieldOptions) this.instance).getCtype();
        }

        @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$FieldOptionsOrBuilder
        public boolean getDebugRedact() {
            return ((DescriptorProtos$FieldOptions) this.instance).getDebugRedact();
        }

        @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$FieldOptionsOrBuilder
        public boolean getDeprecated() {
            return ((DescriptorProtos$FieldOptions) this.instance).getDeprecated();
        }

        @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$FieldOptionsOrBuilder
        public EditionDefault getEditionDefaults(int i10) {
            return ((DescriptorProtos$FieldOptions) this.instance).getEditionDefaults(i10);
        }

        @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$FieldOptionsOrBuilder
        public int getEditionDefaultsCount() {
            return ((DescriptorProtos$FieldOptions) this.instance).getEditionDefaultsCount();
        }

        @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$FieldOptionsOrBuilder
        public List<EditionDefault> getEditionDefaultsList() {
            return Collections.unmodifiableList(((DescriptorProtos$FieldOptions) this.instance).getEditionDefaultsList());
        }

        @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$FieldOptionsOrBuilder
        public FeatureSupport getFeatureSupport() {
            return ((DescriptorProtos$FieldOptions) this.instance).getFeatureSupport();
        }

        @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$FieldOptionsOrBuilder
        public DescriptorProtos$FeatureSet getFeatures() {
            return ((DescriptorProtos$FieldOptions) this.instance).getFeatures();
        }

        @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$FieldOptionsOrBuilder
        public c getJstype() {
            return ((DescriptorProtos$FieldOptions) this.instance).getJstype();
        }

        @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$FieldOptionsOrBuilder
        public boolean getLazy() {
            return ((DescriptorProtos$FieldOptions) this.instance).getLazy();
        }

        @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$FieldOptionsOrBuilder
        public boolean getPacked() {
            return ((DescriptorProtos$FieldOptions) this.instance).getPacked();
        }

        @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$FieldOptionsOrBuilder
        public d getRetention() {
            return ((DescriptorProtos$FieldOptions) this.instance).getRetention();
        }

        @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$FieldOptionsOrBuilder
        public e getTargets(int i10) {
            return ((DescriptorProtos$FieldOptions) this.instance).getTargets(i10);
        }

        @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$FieldOptionsOrBuilder
        public int getTargetsCount() {
            return ((DescriptorProtos$FieldOptions) this.instance).getTargetsCount();
        }

        @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$FieldOptionsOrBuilder
        public List<e> getTargetsList() {
            return ((DescriptorProtos$FieldOptions) this.instance).getTargetsList();
        }

        @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$FieldOptionsOrBuilder
        public DescriptorProtos$UninterpretedOption getUninterpretedOption(int i10) {
            return ((DescriptorProtos$FieldOptions) this.instance).getUninterpretedOption(i10);
        }

        @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$FieldOptionsOrBuilder
        public int getUninterpretedOptionCount() {
            return ((DescriptorProtos$FieldOptions) this.instance).getUninterpretedOptionCount();
        }

        @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$FieldOptionsOrBuilder
        public List<DescriptorProtos$UninterpretedOption> getUninterpretedOptionList() {
            return Collections.unmodifiableList(((DescriptorProtos$FieldOptions) this.instance).getUninterpretedOptionList());
        }

        @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$FieldOptionsOrBuilder
        public boolean getUnverifiedLazy() {
            return ((DescriptorProtos$FieldOptions) this.instance).getUnverifiedLazy();
        }

        @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$FieldOptionsOrBuilder
        public boolean getWeak() {
            return ((DescriptorProtos$FieldOptions) this.instance).getWeak();
        }

        @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$FieldOptionsOrBuilder
        public boolean hasCtype() {
            return ((DescriptorProtos$FieldOptions) this.instance).hasCtype();
        }

        @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$FieldOptionsOrBuilder
        public boolean hasDebugRedact() {
            return ((DescriptorProtos$FieldOptions) this.instance).hasDebugRedact();
        }

        @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$FieldOptionsOrBuilder
        public boolean hasDeprecated() {
            return ((DescriptorProtos$FieldOptions) this.instance).hasDeprecated();
        }

        @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$FieldOptionsOrBuilder
        public boolean hasFeatureSupport() {
            return ((DescriptorProtos$FieldOptions) this.instance).hasFeatureSupport();
        }

        @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$FieldOptionsOrBuilder
        public boolean hasFeatures() {
            return ((DescriptorProtos$FieldOptions) this.instance).hasFeatures();
        }

        @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$FieldOptionsOrBuilder
        public boolean hasJstype() {
            return ((DescriptorProtos$FieldOptions) this.instance).hasJstype();
        }

        @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$FieldOptionsOrBuilder
        public boolean hasLazy() {
            return ((DescriptorProtos$FieldOptions) this.instance).hasLazy();
        }

        @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$FieldOptionsOrBuilder
        public boolean hasPacked() {
            return ((DescriptorProtos$FieldOptions) this.instance).hasPacked();
        }

        @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$FieldOptionsOrBuilder
        public boolean hasRetention() {
            return ((DescriptorProtos$FieldOptions) this.instance).hasRetention();
        }

        @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$FieldOptionsOrBuilder
        public boolean hasUnverifiedLazy() {
            return ((DescriptorProtos$FieldOptions) this.instance).hasUnverifiedLazy();
        }

        @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$FieldOptionsOrBuilder
        public boolean hasWeak() {
            return ((DescriptorProtos$FieldOptions) this.instance).hasWeak();
        }

        public Builder mergeFeatureSupport(FeatureSupport featureSupport) {
            copyOnWrite();
            ((DescriptorProtos$FieldOptions) this.instance).mergeFeatureSupport(featureSupport);
            return this;
        }

        public Builder mergeFeatures(DescriptorProtos$FeatureSet descriptorProtos$FeatureSet) {
            copyOnWrite();
            ((DescriptorProtos$FieldOptions) this.instance).mergeFeatures(descriptorProtos$FeatureSet);
            return this;
        }

        public Builder removeEditionDefaults(int i10) {
            copyOnWrite();
            ((DescriptorProtos$FieldOptions) this.instance).removeEditionDefaults(i10);
            return this;
        }

        public Builder removeUninterpretedOption(int i10) {
            copyOnWrite();
            ((DescriptorProtos$FieldOptions) this.instance).removeUninterpretedOption(i10);
            return this;
        }

        public Builder setCtype(b bVar) {
            copyOnWrite();
            ((DescriptorProtos$FieldOptions) this.instance).setCtype(bVar);
            return this;
        }

        public Builder setDebugRedact(boolean z10) {
            copyOnWrite();
            ((DescriptorProtos$FieldOptions) this.instance).setDebugRedact(z10);
            return this;
        }

        public Builder setDeprecated(boolean z10) {
            copyOnWrite();
            ((DescriptorProtos$FieldOptions) this.instance).setDeprecated(z10);
            return this;
        }

        public Builder setEditionDefaults(int i10, EditionDefault editionDefault) {
            copyOnWrite();
            ((DescriptorProtos$FieldOptions) this.instance).setEditionDefaults(i10, editionDefault);
            return this;
        }

        public Builder setFeatureSupport(FeatureSupport featureSupport) {
            copyOnWrite();
            ((DescriptorProtos$FieldOptions) this.instance).setFeatureSupport(featureSupport);
            return this;
        }

        public Builder setFeatures(DescriptorProtos$FeatureSet descriptorProtos$FeatureSet) {
            copyOnWrite();
            ((DescriptorProtos$FieldOptions) this.instance).setFeatures(descriptorProtos$FeatureSet);
            return this;
        }

        public Builder setJstype(c cVar) {
            copyOnWrite();
            ((DescriptorProtos$FieldOptions) this.instance).setJstype(cVar);
            return this;
        }

        public Builder setLazy(boolean z10) {
            copyOnWrite();
            ((DescriptorProtos$FieldOptions) this.instance).setLazy(z10);
            return this;
        }

        public Builder setPacked(boolean z10) {
            copyOnWrite();
            ((DescriptorProtos$FieldOptions) this.instance).setPacked(z10);
            return this;
        }

        public Builder setRetention(d dVar) {
            copyOnWrite();
            ((DescriptorProtos$FieldOptions) this.instance).setRetention(dVar);
            return this;
        }

        public Builder setTargets(int i10, e eVar) {
            copyOnWrite();
            ((DescriptorProtos$FieldOptions) this.instance).setTargets(i10, eVar);
            return this;
        }

        public Builder setUninterpretedOption(int i10, DescriptorProtos$UninterpretedOption descriptorProtos$UninterpretedOption) {
            copyOnWrite();
            ((DescriptorProtos$FieldOptions) this.instance).setUninterpretedOption(i10, descriptorProtos$UninterpretedOption);
            return this;
        }

        public Builder setUnverifiedLazy(boolean z10) {
            copyOnWrite();
            ((DescriptorProtos$FieldOptions) this.instance).setUnverifiedLazy(z10);
            return this;
        }

        public Builder setWeak(boolean z10) {
            copyOnWrite();
            ((DescriptorProtos$FieldOptions) this.instance).setWeak(z10);
            return this;
        }

        private Builder() {
            super(DescriptorProtos$FieldOptions.DEFAULT_INSTANCE);
        }

        public Builder addEditionDefaults(int i10, EditionDefault editionDefault) {
            copyOnWrite();
            ((DescriptorProtos$FieldOptions) this.instance).addEditionDefaults(i10, editionDefault);
            return this;
        }

        public Builder addUninterpretedOption(int i10, DescriptorProtos$UninterpretedOption descriptorProtos$UninterpretedOption) {
            copyOnWrite();
            ((DescriptorProtos$FieldOptions) this.instance).addUninterpretedOption(i10, descriptorProtos$UninterpretedOption);
            return this;
        }

        public Builder setEditionDefaults(int i10, EditionDefault.Builder builder) {
            copyOnWrite();
            ((DescriptorProtos$FieldOptions) this.instance).setEditionDefaults(i10, builder.build());
            return this;
        }

        public Builder setFeatureSupport(FeatureSupport.Builder builder) {
            copyOnWrite();
            ((DescriptorProtos$FieldOptions) this.instance).setFeatureSupport(builder.build());
            return this;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public Builder setFeatures(DescriptorProtos$FeatureSet.Builder builder) {
            copyOnWrite();
            ((DescriptorProtos$FieldOptions) this.instance).setFeatures((DescriptorProtos$FeatureSet) builder.build());
            return this;
        }

        public Builder setUninterpretedOption(int i10, DescriptorProtos$UninterpretedOption.Builder builder) {
            copyOnWrite();
            ((DescriptorProtos$FieldOptions) this.instance).setUninterpretedOption(i10, builder.build());
            return this;
        }

        public Builder addEditionDefaults(EditionDefault.Builder builder) {
            copyOnWrite();
            ((DescriptorProtos$FieldOptions) this.instance).addEditionDefaults(builder.build());
            return this;
        }

        public Builder addUninterpretedOption(DescriptorProtos$UninterpretedOption.Builder builder) {
            copyOnWrite();
            ((DescriptorProtos$FieldOptions) this.instance).addUninterpretedOption(builder.build());
            return this;
        }

        public Builder addEditionDefaults(int i10, EditionDefault.Builder builder) {
            copyOnWrite();
            ((DescriptorProtos$FieldOptions) this.instance).addEditionDefaults(i10, builder.build());
            return this;
        }

        public Builder addUninterpretedOption(int i10, DescriptorProtos$UninterpretedOption.Builder builder) {
            copyOnWrite();
            ((DescriptorProtos$FieldOptions) this.instance).addUninterpretedOption(i10, builder.build());
            return this;
        }
    }

    public static final class EditionDefault extends GeneratedMessageLite<EditionDefault, Builder> implements EditionDefaultOrBuilder {
        private static final EditionDefault DEFAULT_INSTANCE;
        public static final int EDITION_FIELD_NUMBER = 3;
        private static volatile h1<EditionDefault> PARSER = null;
        public static final int VALUE_FIELD_NUMBER = 2;
        private int bitField0_;
        private int edition_;
        private String value_ = "";

        public static final class Builder extends GeneratedMessageLite.Builder<EditionDefault, Builder> implements EditionDefaultOrBuilder {
            public Builder clearEdition() {
                copyOnWrite();
                ((EditionDefault) this.instance).clearEdition();
                return this;
            }

            public Builder clearValue() {
                copyOnWrite();
                ((EditionDefault) this.instance).clearValue();
                return this;
            }

            @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$FieldOptions.EditionDefaultOrBuilder
            public p getEdition() {
                return ((EditionDefault) this.instance).getEdition();
            }

            @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$FieldOptions.EditionDefaultOrBuilder
            public String getValue() {
                return ((EditionDefault) this.instance).getValue();
            }

            @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$FieldOptions.EditionDefaultOrBuilder
            public j getValueBytes() {
                return ((EditionDefault) this.instance).getValueBytes();
            }

            @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$FieldOptions.EditionDefaultOrBuilder
            public boolean hasEdition() {
                return ((EditionDefault) this.instance).hasEdition();
            }

            @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$FieldOptions.EditionDefaultOrBuilder
            public boolean hasValue() {
                return ((EditionDefault) this.instance).hasValue();
            }

            public Builder setEdition(p pVar) {
                copyOnWrite();
                ((EditionDefault) this.instance).setEdition(pVar);
                return this;
            }

            public Builder setValue(String str) {
                copyOnWrite();
                ((EditionDefault) this.instance).setValue(str);
                return this;
            }

            public Builder setValueBytes(j jVar) {
                copyOnWrite();
                ((EditionDefault) this.instance).setValueBytes(jVar);
                return this;
            }

            private Builder() {
                super(EditionDefault.DEFAULT_INSTANCE);
            }
        }

        static {
            EditionDefault editionDefault = new EditionDefault();
            DEFAULT_INSTANCE = editionDefault;
            GeneratedMessageLite.registerDefaultInstance(EditionDefault.class, editionDefault);
        }

        private EditionDefault() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearEdition() {
            this.bitField0_ &= -2;
            this.edition_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearValue() {
            this.bitField0_ &= -3;
            this.value_ = getDefaultInstance().getValue();
        }

        public static EditionDefault getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static EditionDefault parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (EditionDefault) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static EditionDefault parseFrom(ByteBuffer byteBuffer) throws e0 {
            return (EditionDefault) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static h1<EditionDefault> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setEdition(p pVar) {
            this.edition_ = pVar.f2121a;
            this.bitField0_ |= 1;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setValue(String str) {
            str.getClass();
            this.bitField0_ |= 2;
            this.value_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setValueBytes(j jVar) {
            this.value_ = jVar.n();
            this.bitField0_ |= 2;
        }

        @Override // androidx.datastore.preferences.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.d dVar, Object obj, Object obj2) {
            h1 aVar;
            switch (dVar.ordinal()) {
                case 0:
                    return (byte) 1;
                case 1:
                    return null;
                case 2:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0002\u0000\u0001\u0002\u0003\u0002\u0000\u0000\u0000\u0002ဈ\u0001\u0003᠌\u0000", new Object[]{"bitField0_", "value_", "edition_", p.a.f2122a});
                case 3:
                    return new EditionDefault();
                case 4:
                    return new Builder();
                case 5:
                    return DEFAULT_INSTANCE;
                case 6:
                    h1<EditionDefault> h1Var = PARSER;
                    if (h1Var != null) {
                        return h1Var;
                    }
                    synchronized (EditionDefault.class) {
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

        @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$FieldOptions.EditionDefaultOrBuilder
        public p getEdition() {
            p pVarA = p.a(this.edition_);
            return pVarA == null ? p.EDITION_UNKNOWN : pVarA;
        }

        @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$FieldOptions.EditionDefaultOrBuilder
        public String getValue() {
            return this.value_;
        }

        @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$FieldOptions.EditionDefaultOrBuilder
        public j getValueBytes() {
            return j.d(this.value_);
        }

        @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$FieldOptions.EditionDefaultOrBuilder
        public boolean hasEdition() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$FieldOptions.EditionDefaultOrBuilder
        public boolean hasValue() {
            return (this.bitField0_ & 2) != 0;
        }

        public static Builder newBuilder(EditionDefault editionDefault) {
            return DEFAULT_INSTANCE.createBuilder(editionDefault);
        }

        public static EditionDefault parseDelimitedFrom(InputStream inputStream, t tVar) throws IOException {
            return (EditionDefault) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, tVar);
        }

        public static EditionDefault parseFrom(ByteBuffer byteBuffer, t tVar) throws e0 {
            return (EditionDefault) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, tVar);
        }

        public static EditionDefault parseFrom(j jVar) throws e0 {
            return (EditionDefault) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, jVar);
        }

        public static EditionDefault parseFrom(j jVar, t tVar) throws e0 {
            return (EditionDefault) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, jVar, tVar);
        }

        public static EditionDefault parseFrom(byte[] bArr) throws e0 {
            return (EditionDefault) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static EditionDefault parseFrom(byte[] bArr, t tVar) throws e0 {
            return (EditionDefault) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, tVar);
        }

        public static EditionDefault parseFrom(InputStream inputStream) throws IOException {
            return (EditionDefault) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static EditionDefault parseFrom(InputStream inputStream, t tVar) throws IOException {
            return (EditionDefault) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, tVar);
        }

        public static EditionDefault parseFrom(k kVar) throws IOException {
            return (EditionDefault) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, kVar);
        }

        public static EditionDefault parseFrom(k kVar, t tVar) throws IOException {
            return (EditionDefault) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, kVar, tVar);
        }
    }

    public interface EditionDefaultOrBuilder extends w0 {
        /* synthetic */ MessageLite getDefaultInstanceForType();

        p getEdition();

        String getValue();

        j getValueBytes();

        boolean hasEdition();

        boolean hasValue();

        @Override // androidx.datastore.preferences.protobuf.w0
        /* synthetic */ boolean isInitialized();
    }

    public static final class FeatureSupport extends GeneratedMessageLite<FeatureSupport, Builder> implements FeatureSupportOrBuilder {
        private static final FeatureSupport DEFAULT_INSTANCE;
        public static final int DEPRECATION_WARNING_FIELD_NUMBER = 3;
        public static final int EDITION_DEPRECATED_FIELD_NUMBER = 2;
        public static final int EDITION_INTRODUCED_FIELD_NUMBER = 1;
        public static final int EDITION_REMOVED_FIELD_NUMBER = 4;
        private static volatile h1<FeatureSupport> PARSER;
        private int bitField0_;
        private String deprecationWarning_ = "";
        private int editionDeprecated_;
        private int editionIntroduced_;
        private int editionRemoved_;

        public static final class Builder extends GeneratedMessageLite.Builder<FeatureSupport, Builder> implements FeatureSupportOrBuilder {
            public Builder clearDeprecationWarning() {
                copyOnWrite();
                ((FeatureSupport) this.instance).clearDeprecationWarning();
                return this;
            }

            public Builder clearEditionDeprecated() {
                copyOnWrite();
                ((FeatureSupport) this.instance).clearEditionDeprecated();
                return this;
            }

            public Builder clearEditionIntroduced() {
                copyOnWrite();
                ((FeatureSupport) this.instance).clearEditionIntroduced();
                return this;
            }

            public Builder clearEditionRemoved() {
                copyOnWrite();
                ((FeatureSupport) this.instance).clearEditionRemoved();
                return this;
            }

            @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$FieldOptions.FeatureSupportOrBuilder
            public String getDeprecationWarning() {
                return ((FeatureSupport) this.instance).getDeprecationWarning();
            }

            @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$FieldOptions.FeatureSupportOrBuilder
            public j getDeprecationWarningBytes() {
                return ((FeatureSupport) this.instance).getDeprecationWarningBytes();
            }

            @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$FieldOptions.FeatureSupportOrBuilder
            public p getEditionDeprecated() {
                return ((FeatureSupport) this.instance).getEditionDeprecated();
            }

            @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$FieldOptions.FeatureSupportOrBuilder
            public p getEditionIntroduced() {
                return ((FeatureSupport) this.instance).getEditionIntroduced();
            }

            @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$FieldOptions.FeatureSupportOrBuilder
            public p getEditionRemoved() {
                return ((FeatureSupport) this.instance).getEditionRemoved();
            }

            @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$FieldOptions.FeatureSupportOrBuilder
            public boolean hasDeprecationWarning() {
                return ((FeatureSupport) this.instance).hasDeprecationWarning();
            }

            @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$FieldOptions.FeatureSupportOrBuilder
            public boolean hasEditionDeprecated() {
                return ((FeatureSupport) this.instance).hasEditionDeprecated();
            }

            @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$FieldOptions.FeatureSupportOrBuilder
            public boolean hasEditionIntroduced() {
                return ((FeatureSupport) this.instance).hasEditionIntroduced();
            }

            @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$FieldOptions.FeatureSupportOrBuilder
            public boolean hasEditionRemoved() {
                return ((FeatureSupport) this.instance).hasEditionRemoved();
            }

            public Builder setDeprecationWarning(String str) {
                copyOnWrite();
                ((FeatureSupport) this.instance).setDeprecationWarning(str);
                return this;
            }

            public Builder setDeprecationWarningBytes(j jVar) {
                copyOnWrite();
                ((FeatureSupport) this.instance).setDeprecationWarningBytes(jVar);
                return this;
            }

            public Builder setEditionDeprecated(p pVar) {
                copyOnWrite();
                ((FeatureSupport) this.instance).setEditionDeprecated(pVar);
                return this;
            }

            public Builder setEditionIntroduced(p pVar) {
                copyOnWrite();
                ((FeatureSupport) this.instance).setEditionIntroduced(pVar);
                return this;
            }

            public Builder setEditionRemoved(p pVar) {
                copyOnWrite();
                ((FeatureSupport) this.instance).setEditionRemoved(pVar);
                return this;
            }

            private Builder() {
                super(FeatureSupport.DEFAULT_INSTANCE);
            }
        }

        static {
            FeatureSupport featureSupport = new FeatureSupport();
            DEFAULT_INSTANCE = featureSupport;
            GeneratedMessageLite.registerDefaultInstance(FeatureSupport.class, featureSupport);
        }

        private FeatureSupport() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearDeprecationWarning() {
            this.bitField0_ &= -5;
            this.deprecationWarning_ = getDefaultInstance().getDeprecationWarning();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearEditionDeprecated() {
            this.bitField0_ &= -3;
            this.editionDeprecated_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearEditionIntroduced() {
            this.bitField0_ &= -2;
            this.editionIntroduced_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearEditionRemoved() {
            this.bitField0_ &= -9;
            this.editionRemoved_ = 0;
        }

        public static FeatureSupport getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static FeatureSupport parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (FeatureSupport) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static FeatureSupport parseFrom(ByteBuffer byteBuffer) throws e0 {
            return (FeatureSupport) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static h1<FeatureSupport> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setDeprecationWarning(String str) {
            str.getClass();
            this.bitField0_ |= 4;
            this.deprecationWarning_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setDeprecationWarningBytes(j jVar) {
            this.deprecationWarning_ = jVar.n();
            this.bitField0_ |= 4;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setEditionDeprecated(p pVar) {
            this.editionDeprecated_ = pVar.f2121a;
            this.bitField0_ |= 2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setEditionIntroduced(p pVar) {
            this.editionIntroduced_ = pVar.f2121a;
            this.bitField0_ |= 1;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setEditionRemoved(p pVar) {
            this.editionRemoved_ = pVar.f2121a;
            this.bitField0_ |= 8;
        }

        @Override // androidx.datastore.preferences.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.d dVar, Object obj, Object obj2) {
            h1 aVar;
            switch (dVar.ordinal()) {
                case 0:
                    return (byte) 1;
                case 1:
                    return null;
                case 2:
                    p.a aVar2 = p.a.f2122a;
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001᠌\u0000\u0002᠌\u0001\u0003ဈ\u0002\u0004᠌\u0003", new Object[]{"bitField0_", "editionIntroduced_", aVar2, "editionDeprecated_", aVar2, "deprecationWarning_", "editionRemoved_", aVar2});
                case 3:
                    return new FeatureSupport();
                case 4:
                    return new Builder();
                case 5:
                    return DEFAULT_INSTANCE;
                case 6:
                    h1<FeatureSupport> h1Var = PARSER;
                    if (h1Var != null) {
                        return h1Var;
                    }
                    synchronized (FeatureSupport.class) {
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

        @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$FieldOptions.FeatureSupportOrBuilder
        public String getDeprecationWarning() {
            return this.deprecationWarning_;
        }

        @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$FieldOptions.FeatureSupportOrBuilder
        public j getDeprecationWarningBytes() {
            return j.d(this.deprecationWarning_);
        }

        @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$FieldOptions.FeatureSupportOrBuilder
        public p getEditionDeprecated() {
            p pVarA = p.a(this.editionDeprecated_);
            return pVarA == null ? p.EDITION_UNKNOWN : pVarA;
        }

        @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$FieldOptions.FeatureSupportOrBuilder
        public p getEditionIntroduced() {
            p pVarA = p.a(this.editionIntroduced_);
            return pVarA == null ? p.EDITION_UNKNOWN : pVarA;
        }

        @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$FieldOptions.FeatureSupportOrBuilder
        public p getEditionRemoved() {
            p pVarA = p.a(this.editionRemoved_);
            return pVarA == null ? p.EDITION_UNKNOWN : pVarA;
        }

        @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$FieldOptions.FeatureSupportOrBuilder
        public boolean hasDeprecationWarning() {
            return (this.bitField0_ & 4) != 0;
        }

        @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$FieldOptions.FeatureSupportOrBuilder
        public boolean hasEditionDeprecated() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$FieldOptions.FeatureSupportOrBuilder
        public boolean hasEditionIntroduced() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$FieldOptions.FeatureSupportOrBuilder
        public boolean hasEditionRemoved() {
            return (this.bitField0_ & 8) != 0;
        }

        public static Builder newBuilder(FeatureSupport featureSupport) {
            return DEFAULT_INSTANCE.createBuilder(featureSupport);
        }

        public static FeatureSupport parseDelimitedFrom(InputStream inputStream, t tVar) throws IOException {
            return (FeatureSupport) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, tVar);
        }

        public static FeatureSupport parseFrom(ByteBuffer byteBuffer, t tVar) throws e0 {
            return (FeatureSupport) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, tVar);
        }

        public static FeatureSupport parseFrom(j jVar) throws e0 {
            return (FeatureSupport) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, jVar);
        }

        public static FeatureSupport parseFrom(j jVar, t tVar) throws e0 {
            return (FeatureSupport) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, jVar, tVar);
        }

        public static FeatureSupport parseFrom(byte[] bArr) throws e0 {
            return (FeatureSupport) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static FeatureSupport parseFrom(byte[] bArr, t tVar) throws e0 {
            return (FeatureSupport) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, tVar);
        }

        public static FeatureSupport parseFrom(InputStream inputStream) throws IOException {
            return (FeatureSupport) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static FeatureSupport parseFrom(InputStream inputStream, t tVar) throws IOException {
            return (FeatureSupport) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, tVar);
        }

        public static FeatureSupport parseFrom(k kVar) throws IOException {
            return (FeatureSupport) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, kVar);
        }

        public static FeatureSupport parseFrom(k kVar, t tVar) throws IOException {
            return (FeatureSupport) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, kVar, tVar);
        }
    }

    public interface FeatureSupportOrBuilder extends w0 {
        /* synthetic */ MessageLite getDefaultInstanceForType();

        String getDeprecationWarning();

        j getDeprecationWarningBytes();

        p getEditionDeprecated();

        p getEditionIntroduced();

        p getEditionRemoved();

        boolean hasDeprecationWarning();

        boolean hasEditionDeprecated();

        boolean hasEditionIntroduced();

        boolean hasEditionRemoved();

        @Override // androidx.datastore.preferences.protobuf.w0
        /* synthetic */ boolean isInitialized();
    }

    public class a implements d0.h.a<e> {
    }

    public enum b implements d0.c {
        STRING(0),
        CORD(1),
        STRING_PIECE(2);


        /* renamed from: a, reason: collision with root package name */
        public final int f1842a;

        public static final class a implements d0.e {

            /* renamed from: a, reason: collision with root package name */
            public static final a f1843a = new a();

            @Override // androidx.datastore.preferences.protobuf.d0.e
            public final boolean isInRange(int i10) {
                return b.a(i10) != null;
            }
        }

        b(int i10) {
            this.f1842a = i10;
        }

        public static b a(int i10) {
            if (i10 == 0) {
                return STRING;
            }
            if (i10 == 1) {
                return CORD;
            }
            if (i10 != 2) {
                return null;
            }
            return STRING_PIECE;
        }

        @Override // androidx.datastore.preferences.protobuf.d0.c
        public final int getNumber() {
            return this.f1842a;
        }
    }

    public enum c implements d0.c {
        JS_NORMAL(0),
        JS_STRING(1),
        JS_NUMBER(2);


        /* renamed from: a, reason: collision with root package name */
        public final int f1848a;

        public static final class a implements d0.e {

            /* renamed from: a, reason: collision with root package name */
            public static final a f1849a = new a();

            @Override // androidx.datastore.preferences.protobuf.d0.e
            public final boolean isInRange(int i10) {
                return c.a(i10) != null;
            }
        }

        c(int i10) {
            this.f1848a = i10;
        }

        public static c a(int i10) {
            if (i10 == 0) {
                return JS_NORMAL;
            }
            if (i10 == 1) {
                return JS_STRING;
            }
            if (i10 != 2) {
                return null;
            }
            return JS_NUMBER;
        }

        @Override // androidx.datastore.preferences.protobuf.d0.c
        public final int getNumber() {
            return this.f1848a;
        }
    }

    public enum d implements d0.c {
        RETENTION_UNKNOWN(0),
        RETENTION_RUNTIME(1),
        RETENTION_SOURCE(2);


        /* renamed from: a, reason: collision with root package name */
        public final int f1854a;

        public static final class a implements d0.e {

            /* renamed from: a, reason: collision with root package name */
            public static final a f1855a = new a();

            @Override // androidx.datastore.preferences.protobuf.d0.e
            public final boolean isInRange(int i10) {
                return d.a(i10) != null;
            }
        }

        d(int i10) {
            this.f1854a = i10;
        }

        public static d a(int i10) {
            if (i10 == 0) {
                return RETENTION_UNKNOWN;
            }
            if (i10 == 1) {
                return RETENTION_RUNTIME;
            }
            if (i10 != 2) {
                return null;
            }
            return RETENTION_SOURCE;
        }

        @Override // androidx.datastore.preferences.protobuf.d0.c
        public final int getNumber() {
            return this.f1854a;
        }
    }

    public enum e implements d0.c {
        TARGET_TYPE_UNKNOWN(0),
        TARGET_TYPE_FILE(1),
        TARGET_TYPE_EXTENSION_RANGE(2),
        TARGET_TYPE_MESSAGE(3),
        TARGET_TYPE_FIELD(4),
        TARGET_TYPE_ONEOF(5),
        TARGET_TYPE_ENUM(6),
        TARGET_TYPE_ENUM_ENTRY(7),
        TARGET_TYPE_SERVICE(8),
        TARGET_TYPE_METHOD(9);


        /* renamed from: a, reason: collision with root package name */
        public final int f1867a;

        public static final class a implements d0.e {

            /* renamed from: a, reason: collision with root package name */
            public static final a f1868a = new a();

            @Override // androidx.datastore.preferences.protobuf.d0.e
            public final boolean isInRange(int i10) {
                return e.a(i10) != null;
            }
        }

        e(int i10) {
            this.f1867a = i10;
        }

        public static e a(int i10) {
            switch (i10) {
                case 0:
                    return TARGET_TYPE_UNKNOWN;
                case 1:
                    return TARGET_TYPE_FILE;
                case 2:
                    return TARGET_TYPE_EXTENSION_RANGE;
                case 3:
                    return TARGET_TYPE_MESSAGE;
                case 4:
                    return TARGET_TYPE_FIELD;
                case 5:
                    return TARGET_TYPE_ONEOF;
                case 6:
                    return TARGET_TYPE_ENUM;
                case 7:
                    return TARGET_TYPE_ENUM_ENTRY;
                case 8:
                    return TARGET_TYPE_SERVICE;
                case 9:
                    return TARGET_TYPE_METHOD;
                default:
                    return null;
            }
        }

        @Override // androidx.datastore.preferences.protobuf.d0.c
        public final int getNumber() {
            return this.f1867a;
        }
    }

    static {
        DescriptorProtos$FieldOptions descriptorProtos$FieldOptions = new DescriptorProtos$FieldOptions();
        DEFAULT_INSTANCE = descriptorProtos$FieldOptions;
        GeneratedMessageLite.registerDefaultInstance(DescriptorProtos$FieldOptions.class, descriptorProtos$FieldOptions);
    }

    private DescriptorProtos$FieldOptions() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllEditionDefaults(Iterable<? extends EditionDefault> iterable) {
        ensureEditionDefaultsIsMutable();
        AbstractMessageLite.addAll(iterable, this.editionDefaults_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllTargets(Iterable<? extends e> iterable) {
        ensureTargetsIsMutable();
        for (e eVar : iterable) {
            ((c0) this.targets_).addInt(eVar.f1867a);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllUninterpretedOption(Iterable<? extends DescriptorProtos$UninterpretedOption> iterable) {
        ensureUninterpretedOptionIsMutable();
        AbstractMessageLite.addAll(iterable, this.uninterpretedOption_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addEditionDefaults(EditionDefault editionDefault) {
        editionDefault.getClass();
        ensureEditionDefaultsIsMutable();
        this.editionDefaults_.add(editionDefault);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addTargets(e eVar) {
        eVar.getClass();
        ensureTargetsIsMutable();
        ((c0) this.targets_).addInt(eVar.f1867a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addUninterpretedOption(DescriptorProtos$UninterpretedOption descriptorProtos$UninterpretedOption) {
        descriptorProtos$UninterpretedOption.getClass();
        ensureUninterpretedOptionIsMutable();
        this.uninterpretedOption_.add(descriptorProtos$UninterpretedOption);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearCtype() {
        this.bitField0_ &= -2;
        this.ctype_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDebugRedact() {
        this.bitField0_ &= -129;
        this.debugRedact_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDeprecated() {
        this.bitField0_ &= -33;
        this.deprecated_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearEditionDefaults() {
        this.editionDefaults_ = GeneratedMessageLite.emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearFeatureSupport() {
        this.featureSupport_ = null;
        this.bitField0_ &= -1025;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearFeatures() {
        this.features_ = null;
        this.bitField0_ &= -513;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearJstype() {
        this.bitField0_ &= -5;
        this.jstype_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearLazy() {
        this.bitField0_ &= -9;
        this.lazy_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPacked() {
        this.bitField0_ &= -3;
        this.packed_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearRetention() {
        this.bitField0_ &= -257;
        this.retention_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTargets() {
        this.targets_ = GeneratedMessageLite.emptyIntList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearUninterpretedOption() {
        this.uninterpretedOption_ = GeneratedMessageLite.emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearUnverifiedLazy() {
        this.bitField0_ &= -17;
        this.unverifiedLazy_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearWeak() {
        this.bitField0_ &= -65;
        this.weak_ = false;
    }

    private void ensureEditionDefaultsIsMutable() {
        d0.j<EditionDefault> jVar = this.editionDefaults_;
        if (jVar.isModifiable()) {
            return;
        }
        this.editionDefaults_ = GeneratedMessageLite.mutableCopy(jVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void ensureTargetsIsMutable() {
        d0.g gVar = this.targets_;
        if (((androidx.datastore.preferences.protobuf.b) gVar).f1952a) {
            return;
        }
        this.targets_ = GeneratedMessageLite.mutableCopy(gVar);
    }

    private void ensureUninterpretedOptionIsMutable() {
        d0.j<DescriptorProtos$UninterpretedOption> jVar = this.uninterpretedOption_;
        if (jVar.isModifiable()) {
            return;
        }
        this.uninterpretedOption_ = GeneratedMessageLite.mutableCopy(jVar);
    }

    public static DescriptorProtos$FieldOptions getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeFeatureSupport(FeatureSupport featureSupport) {
        featureSupport.getClass();
        FeatureSupport featureSupport2 = this.featureSupport_;
        if (featureSupport2 == null || featureSupport2 == FeatureSupport.getDefaultInstance()) {
            this.featureSupport_ = featureSupport;
        } else {
            this.featureSupport_ = FeatureSupport.newBuilder(this.featureSupport_).mergeFrom((FeatureSupport.Builder) featureSupport).buildPartial();
        }
        this.bitField0_ |= 1024;
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
        this.bitField0_ |= 512;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static Builder newBuilder() {
        return (Builder) DEFAULT_INSTANCE.createBuilder();
    }

    public static DescriptorProtos$FieldOptions parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (DescriptorProtos$FieldOptions) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static DescriptorProtos$FieldOptions parseFrom(ByteBuffer byteBuffer) throws e0 {
        return (DescriptorProtos$FieldOptions) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static h1<DescriptorProtos$FieldOptions> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeEditionDefaults(int i10) {
        ensureEditionDefaultsIsMutable();
        this.editionDefaults_.remove(i10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeUninterpretedOption(int i10) {
        ensureUninterpretedOptionIsMutable();
        this.uninterpretedOption_.remove(i10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCtype(b bVar) {
        this.ctype_ = bVar.f1842a;
        this.bitField0_ |= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDebugRedact(boolean z10) {
        this.bitField0_ |= 128;
        this.debugRedact_ = z10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDeprecated(boolean z10) {
        this.bitField0_ |= 32;
        this.deprecated_ = z10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setEditionDefaults(int i10, EditionDefault editionDefault) {
        editionDefault.getClass();
        ensureEditionDefaultsIsMutable();
        this.editionDefaults_.set(i10, editionDefault);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setFeatureSupport(FeatureSupport featureSupport) {
        featureSupport.getClass();
        this.featureSupport_ = featureSupport;
        this.bitField0_ |= 1024;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setFeatures(DescriptorProtos$FeatureSet descriptorProtos$FeatureSet) {
        descriptorProtos$FeatureSet.getClass();
        this.features_ = descriptorProtos$FeatureSet;
        this.bitField0_ |= 512;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setJstype(c cVar) {
        this.jstype_ = cVar.f1848a;
        this.bitField0_ |= 4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLazy(boolean z10) {
        this.bitField0_ |= 8;
        this.lazy_ = z10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPacked(boolean z10) {
        this.bitField0_ |= 2;
        this.packed_ = z10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRetention(d dVar) {
        this.retention_ = dVar.f1854a;
        this.bitField0_ |= 256;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTargets(int i10, e eVar) {
        eVar.getClass();
        ensureTargetsIsMutable();
        ((c0) this.targets_).setInt(i10, eVar.f1867a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setUninterpretedOption(int i10, DescriptorProtos$UninterpretedOption descriptorProtos$UninterpretedOption) {
        descriptorProtos$UninterpretedOption.getClass();
        ensureUninterpretedOptionIsMutable();
        this.uninterpretedOption_.set(i10, descriptorProtos$UninterpretedOption);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setUnverifiedLazy(boolean z10) {
        this.bitField0_ |= 16;
        this.unverifiedLazy_ = z10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setWeak(boolean z10) {
        this.bitField0_ |= 64;
        this.weak_ = z10;
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
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u000e\u0000\u0001\u0001ϧ\u000e\u0000\u0003\u0002\u0001᠌\u0000\u0002ဇ\u0001\u0003ဇ\u0005\u0005ဇ\u0003\u0006᠌\u0002\nဇ\u0006\u000fဇ\u0004\u0010ဇ\u0007\u0011᠌\b\u0013ࠞ\u0014\u001b\u0015ᐉ\t\u0016ဉ\nϧЛ", new Object[]{"bitField0_", "ctype_", b.a.f1843a, "packed_", "deprecated_", "lazy_", "jstype_", c.a.f1849a, "weak_", "unverifiedLazy_", "debugRedact_", "retention_", d.a.f1855a, "targets_", e.a.f1868a, "editionDefaults_", EditionDefault.class, "features_", "featureSupport_", "uninterpretedOption_", DescriptorProtos$UninterpretedOption.class});
            case 3:
                return new DescriptorProtos$FieldOptions();
            case 4:
                return new Builder();
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                h1<DescriptorProtos$FieldOptions> h1Var = PARSER;
                if (h1Var != null) {
                    return h1Var;
                }
                synchronized (DescriptorProtos$FieldOptions.class) {
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

    @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$FieldOptionsOrBuilder
    public b getCtype() {
        b bVarA = b.a(this.ctype_);
        return bVarA == null ? b.STRING : bVarA;
    }

    @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$FieldOptionsOrBuilder
    public boolean getDebugRedact() {
        return this.debugRedact_;
    }

    @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$FieldOptionsOrBuilder
    public boolean getDeprecated() {
        return this.deprecated_;
    }

    @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$FieldOptionsOrBuilder
    public EditionDefault getEditionDefaults(int i10) {
        return this.editionDefaults_.get(i10);
    }

    @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$FieldOptionsOrBuilder
    public int getEditionDefaultsCount() {
        return this.editionDefaults_.size();
    }

    @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$FieldOptionsOrBuilder
    public List<EditionDefault> getEditionDefaultsList() {
        return this.editionDefaults_;
    }

    public EditionDefaultOrBuilder getEditionDefaultsOrBuilder(int i10) {
        return this.editionDefaults_.get(i10);
    }

    public List<? extends EditionDefaultOrBuilder> getEditionDefaultsOrBuilderList() {
        return this.editionDefaults_;
    }

    @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$FieldOptionsOrBuilder
    public FeatureSupport getFeatureSupport() {
        FeatureSupport featureSupport = this.featureSupport_;
        return featureSupport == null ? FeatureSupport.getDefaultInstance() : featureSupport;
    }

    @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$FieldOptionsOrBuilder
    public DescriptorProtos$FeatureSet getFeatures() {
        DescriptorProtos$FeatureSet descriptorProtos$FeatureSet = this.features_;
        return descriptorProtos$FeatureSet == null ? DescriptorProtos$FeatureSet.getDefaultInstance() : descriptorProtos$FeatureSet;
    }

    @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$FieldOptionsOrBuilder
    public c getJstype() {
        c cVarA = c.a(this.jstype_);
        return cVarA == null ? c.JS_NORMAL : cVarA;
    }

    @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$FieldOptionsOrBuilder
    public boolean getLazy() {
        return this.lazy_;
    }

    @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$FieldOptionsOrBuilder
    public boolean getPacked() {
        return this.packed_;
    }

    @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$FieldOptionsOrBuilder
    public d getRetention() {
        d dVarA = d.a(this.retention_);
        return dVarA == null ? d.RETENTION_UNKNOWN : dVarA;
    }

    @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$FieldOptionsOrBuilder
    public e getTargets(int i10) {
        e eVarA = e.a(((c0) this.targets_).getInt(i10));
        return eVarA == null ? e.TARGET_TYPE_UNKNOWN : eVarA;
    }

    @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$FieldOptionsOrBuilder
    public int getTargetsCount() {
        return ((c0) this.targets_).size();
    }

    @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$FieldOptionsOrBuilder
    public List<e> getTargetsList() {
        return new d0.h(this.targets_, targets_converter_);
    }

    @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$FieldOptionsOrBuilder
    public DescriptorProtos$UninterpretedOption getUninterpretedOption(int i10) {
        return this.uninterpretedOption_.get(i10);
    }

    @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$FieldOptionsOrBuilder
    public int getUninterpretedOptionCount() {
        return this.uninterpretedOption_.size();
    }

    @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$FieldOptionsOrBuilder
    public List<DescriptorProtos$UninterpretedOption> getUninterpretedOptionList() {
        return this.uninterpretedOption_;
    }

    public DescriptorProtos$UninterpretedOptionOrBuilder getUninterpretedOptionOrBuilder(int i10) {
        return this.uninterpretedOption_.get(i10);
    }

    public List<? extends DescriptorProtos$UninterpretedOptionOrBuilder> getUninterpretedOptionOrBuilderList() {
        return this.uninterpretedOption_;
    }

    @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$FieldOptionsOrBuilder
    public boolean getUnverifiedLazy() {
        return this.unverifiedLazy_;
    }

    @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$FieldOptionsOrBuilder
    public boolean getWeak() {
        return this.weak_;
    }

    @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$FieldOptionsOrBuilder
    public boolean hasCtype() {
        return (this.bitField0_ & 1) != 0;
    }

    @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$FieldOptionsOrBuilder
    public boolean hasDebugRedact() {
        return (this.bitField0_ & 128) != 0;
    }

    @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$FieldOptionsOrBuilder
    public boolean hasDeprecated() {
        return (this.bitField0_ & 32) != 0;
    }

    @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$FieldOptionsOrBuilder
    public boolean hasFeatureSupport() {
        return (this.bitField0_ & 1024) != 0;
    }

    @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$FieldOptionsOrBuilder
    public boolean hasFeatures() {
        return (this.bitField0_ & 512) != 0;
    }

    @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$FieldOptionsOrBuilder
    public boolean hasJstype() {
        return (this.bitField0_ & 4) != 0;
    }

    @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$FieldOptionsOrBuilder
    public boolean hasLazy() {
        return (this.bitField0_ & 8) != 0;
    }

    @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$FieldOptionsOrBuilder
    public boolean hasPacked() {
        return (this.bitField0_ & 2) != 0;
    }

    @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$FieldOptionsOrBuilder
    public boolean hasRetention() {
        return (this.bitField0_ & 256) != 0;
    }

    @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$FieldOptionsOrBuilder
    public boolean hasUnverifiedLazy() {
        return (this.bitField0_ & 16) != 0;
    }

    @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$FieldOptionsOrBuilder
    public boolean hasWeak() {
        return (this.bitField0_ & 64) != 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static Builder newBuilder(DescriptorProtos$FieldOptions descriptorProtos$FieldOptions) {
        return (Builder) DEFAULT_INSTANCE.createBuilder(descriptorProtos$FieldOptions);
    }

    public static DescriptorProtos$FieldOptions parseDelimitedFrom(InputStream inputStream, t tVar) throws IOException {
        return (DescriptorProtos$FieldOptions) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, tVar);
    }

    public static DescriptorProtos$FieldOptions parseFrom(ByteBuffer byteBuffer, t tVar) throws e0 {
        return (DescriptorProtos$FieldOptions) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, tVar);
    }

    public static DescriptorProtos$FieldOptions parseFrom(j jVar) throws e0 {
        return (DescriptorProtos$FieldOptions) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, jVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addEditionDefaults(int i10, EditionDefault editionDefault) {
        editionDefault.getClass();
        ensureEditionDefaultsIsMutable();
        this.editionDefaults_.add(i10, editionDefault);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addUninterpretedOption(int i10, DescriptorProtos$UninterpretedOption descriptorProtos$UninterpretedOption) {
        descriptorProtos$UninterpretedOption.getClass();
        ensureUninterpretedOptionIsMutable();
        this.uninterpretedOption_.add(i10, descriptorProtos$UninterpretedOption);
    }

    public static DescriptorProtos$FieldOptions parseFrom(j jVar, t tVar) throws e0 {
        return (DescriptorProtos$FieldOptions) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, jVar, tVar);
    }

    public static DescriptorProtos$FieldOptions parseFrom(byte[] bArr) throws e0 {
        return (DescriptorProtos$FieldOptions) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static DescriptorProtos$FieldOptions parseFrom(byte[] bArr, t tVar) throws e0 {
        return (DescriptorProtos$FieldOptions) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, tVar);
    }

    public static DescriptorProtos$FieldOptions parseFrom(InputStream inputStream) throws IOException {
        return (DescriptorProtos$FieldOptions) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static DescriptorProtos$FieldOptions parseFrom(InputStream inputStream, t tVar) throws IOException {
        return (DescriptorProtos$FieldOptions) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, tVar);
    }

    public static DescriptorProtos$FieldOptions parseFrom(k kVar) throws IOException {
        return (DescriptorProtos$FieldOptions) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, kVar);
    }

    public static DescriptorProtos$FieldOptions parseFrom(k kVar, t tVar) throws IOException {
        return (DescriptorProtos$FieldOptions) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, kVar, tVar);
    }
}
