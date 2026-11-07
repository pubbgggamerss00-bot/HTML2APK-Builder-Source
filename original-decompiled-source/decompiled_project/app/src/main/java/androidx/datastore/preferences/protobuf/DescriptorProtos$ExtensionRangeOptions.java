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
public final class DescriptorProtos$ExtensionRangeOptions extends GeneratedMessageLite.ExtendableMessage<DescriptorProtos$ExtensionRangeOptions, Builder> implements DescriptorProtos$ExtensionRangeOptionsOrBuilder {
    public static final int DECLARATION_FIELD_NUMBER = 2;
    private static final DescriptorProtos$ExtensionRangeOptions DEFAULT_INSTANCE;
    public static final int FEATURES_FIELD_NUMBER = 50;
    private static volatile h1<DescriptorProtos$ExtensionRangeOptions> PARSER = null;
    public static final int UNINTERPRETED_OPTION_FIELD_NUMBER = 999;
    public static final int VERIFICATION_FIELD_NUMBER = 3;
    private int bitField0_;
    private DescriptorProtos$FeatureSet features_;
    private byte memoizedIsInitialized = 2;
    private d0.j<DescriptorProtos$UninterpretedOption> uninterpretedOption_ = GeneratedMessageLite.emptyProtobufList();
    private d0.j<Declaration> declaration_ = GeneratedMessageLite.emptyProtobufList();
    private int verification_ = 1;

    public static final class Builder extends GeneratedMessageLite.ExtendableBuilder<DescriptorProtos$ExtensionRangeOptions, Builder> implements DescriptorProtos$ExtensionRangeOptionsOrBuilder {
        public Builder addAllDeclaration(Iterable<? extends Declaration> iterable) {
            copyOnWrite();
            ((DescriptorProtos$ExtensionRangeOptions) this.instance).addAllDeclaration(iterable);
            return this;
        }

        public Builder addAllUninterpretedOption(Iterable<? extends DescriptorProtos$UninterpretedOption> iterable) {
            copyOnWrite();
            ((DescriptorProtos$ExtensionRangeOptions) this.instance).addAllUninterpretedOption(iterable);
            return this;
        }

        public Builder addDeclaration(Declaration declaration) {
            copyOnWrite();
            ((DescriptorProtos$ExtensionRangeOptions) this.instance).addDeclaration(declaration);
            return this;
        }

        public Builder addUninterpretedOption(DescriptorProtos$UninterpretedOption descriptorProtos$UninterpretedOption) {
            copyOnWrite();
            ((DescriptorProtos$ExtensionRangeOptions) this.instance).addUninterpretedOption(descriptorProtos$UninterpretedOption);
            return this;
        }

        public Builder clearDeclaration() {
            copyOnWrite();
            ((DescriptorProtos$ExtensionRangeOptions) this.instance).clearDeclaration();
            return this;
        }

        public Builder clearFeatures() {
            copyOnWrite();
            ((DescriptorProtos$ExtensionRangeOptions) this.instance).clearFeatures();
            return this;
        }

        public Builder clearUninterpretedOption() {
            copyOnWrite();
            ((DescriptorProtos$ExtensionRangeOptions) this.instance).clearUninterpretedOption();
            return this;
        }

        public Builder clearVerification() {
            copyOnWrite();
            ((DescriptorProtos$ExtensionRangeOptions) this.instance).clearVerification();
            return this;
        }

        @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$ExtensionRangeOptionsOrBuilder
        public Declaration getDeclaration(int i10) {
            return ((DescriptorProtos$ExtensionRangeOptions) this.instance).getDeclaration(i10);
        }

        @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$ExtensionRangeOptionsOrBuilder
        public int getDeclarationCount() {
            return ((DescriptorProtos$ExtensionRangeOptions) this.instance).getDeclarationCount();
        }

        @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$ExtensionRangeOptionsOrBuilder
        public List<Declaration> getDeclarationList() {
            return Collections.unmodifiableList(((DescriptorProtos$ExtensionRangeOptions) this.instance).getDeclarationList());
        }

        @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$ExtensionRangeOptionsOrBuilder
        public DescriptorProtos$FeatureSet getFeatures() {
            return ((DescriptorProtos$ExtensionRangeOptions) this.instance).getFeatures();
        }

        @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$ExtensionRangeOptionsOrBuilder
        public DescriptorProtos$UninterpretedOption getUninterpretedOption(int i10) {
            return ((DescriptorProtos$ExtensionRangeOptions) this.instance).getUninterpretedOption(i10);
        }

        @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$ExtensionRangeOptionsOrBuilder
        public int getUninterpretedOptionCount() {
            return ((DescriptorProtos$ExtensionRangeOptions) this.instance).getUninterpretedOptionCount();
        }

        @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$ExtensionRangeOptionsOrBuilder
        public List<DescriptorProtos$UninterpretedOption> getUninterpretedOptionList() {
            return Collections.unmodifiableList(((DescriptorProtos$ExtensionRangeOptions) this.instance).getUninterpretedOptionList());
        }

        @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$ExtensionRangeOptionsOrBuilder
        public a getVerification() {
            return ((DescriptorProtos$ExtensionRangeOptions) this.instance).getVerification();
        }

        @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$ExtensionRangeOptionsOrBuilder
        public boolean hasFeatures() {
            return ((DescriptorProtos$ExtensionRangeOptions) this.instance).hasFeatures();
        }

        @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$ExtensionRangeOptionsOrBuilder
        public boolean hasVerification() {
            return ((DescriptorProtos$ExtensionRangeOptions) this.instance).hasVerification();
        }

        public Builder mergeFeatures(DescriptorProtos$FeatureSet descriptorProtos$FeatureSet) {
            copyOnWrite();
            ((DescriptorProtos$ExtensionRangeOptions) this.instance).mergeFeatures(descriptorProtos$FeatureSet);
            return this;
        }

        public Builder removeDeclaration(int i10) {
            copyOnWrite();
            ((DescriptorProtos$ExtensionRangeOptions) this.instance).removeDeclaration(i10);
            return this;
        }

        public Builder removeUninterpretedOption(int i10) {
            copyOnWrite();
            ((DescriptorProtos$ExtensionRangeOptions) this.instance).removeUninterpretedOption(i10);
            return this;
        }

        public Builder setDeclaration(int i10, Declaration declaration) {
            copyOnWrite();
            ((DescriptorProtos$ExtensionRangeOptions) this.instance).setDeclaration(i10, declaration);
            return this;
        }

        public Builder setFeatures(DescriptorProtos$FeatureSet descriptorProtos$FeatureSet) {
            copyOnWrite();
            ((DescriptorProtos$ExtensionRangeOptions) this.instance).setFeatures(descriptorProtos$FeatureSet);
            return this;
        }

        public Builder setUninterpretedOption(int i10, DescriptorProtos$UninterpretedOption descriptorProtos$UninterpretedOption) {
            copyOnWrite();
            ((DescriptorProtos$ExtensionRangeOptions) this.instance).setUninterpretedOption(i10, descriptorProtos$UninterpretedOption);
            return this;
        }

        public Builder setVerification(a aVar) {
            copyOnWrite();
            ((DescriptorProtos$ExtensionRangeOptions) this.instance).setVerification(aVar);
            return this;
        }

        private Builder() {
            super(DescriptorProtos$ExtensionRangeOptions.DEFAULT_INSTANCE);
        }

        public Builder addDeclaration(int i10, Declaration declaration) {
            copyOnWrite();
            ((DescriptorProtos$ExtensionRangeOptions) this.instance).addDeclaration(i10, declaration);
            return this;
        }

        public Builder addUninterpretedOption(int i10, DescriptorProtos$UninterpretedOption descriptorProtos$UninterpretedOption) {
            copyOnWrite();
            ((DescriptorProtos$ExtensionRangeOptions) this.instance).addUninterpretedOption(i10, descriptorProtos$UninterpretedOption);
            return this;
        }

        public Builder setDeclaration(int i10, Declaration.Builder builder) {
            copyOnWrite();
            ((DescriptorProtos$ExtensionRangeOptions) this.instance).setDeclaration(i10, builder.build());
            return this;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public Builder setFeatures(DescriptorProtos$FeatureSet.Builder builder) {
            copyOnWrite();
            ((DescriptorProtos$ExtensionRangeOptions) this.instance).setFeatures((DescriptorProtos$FeatureSet) builder.build());
            return this;
        }

        public Builder setUninterpretedOption(int i10, DescriptorProtos$UninterpretedOption.Builder builder) {
            copyOnWrite();
            ((DescriptorProtos$ExtensionRangeOptions) this.instance).setUninterpretedOption(i10, builder.build());
            return this;
        }

        public Builder addDeclaration(Declaration.Builder builder) {
            copyOnWrite();
            ((DescriptorProtos$ExtensionRangeOptions) this.instance).addDeclaration(builder.build());
            return this;
        }

        public Builder addUninterpretedOption(DescriptorProtos$UninterpretedOption.Builder builder) {
            copyOnWrite();
            ((DescriptorProtos$ExtensionRangeOptions) this.instance).addUninterpretedOption(builder.build());
            return this;
        }

        public Builder addDeclaration(int i10, Declaration.Builder builder) {
            copyOnWrite();
            ((DescriptorProtos$ExtensionRangeOptions) this.instance).addDeclaration(i10, builder.build());
            return this;
        }

        public Builder addUninterpretedOption(int i10, DescriptorProtos$UninterpretedOption.Builder builder) {
            copyOnWrite();
            ((DescriptorProtos$ExtensionRangeOptions) this.instance).addUninterpretedOption(i10, builder.build());
            return this;
        }
    }

    public static final class Declaration extends GeneratedMessageLite<Declaration, Builder> implements DeclarationOrBuilder {
        private static final Declaration DEFAULT_INSTANCE;
        public static final int FULL_NAME_FIELD_NUMBER = 2;
        public static final int NUMBER_FIELD_NUMBER = 1;
        private static volatile h1<Declaration> PARSER = null;
        public static final int REPEATED_FIELD_NUMBER = 6;
        public static final int RESERVED_FIELD_NUMBER = 5;
        public static final int TYPE_FIELD_NUMBER = 3;
        private int bitField0_;
        private int number_;
        private boolean repeated_;
        private boolean reserved_;
        private String fullName_ = "";
        private String type_ = "";

        public static final class Builder extends GeneratedMessageLite.Builder<Declaration, Builder> implements DeclarationOrBuilder {
            public Builder clearFullName() {
                copyOnWrite();
                ((Declaration) this.instance).clearFullName();
                return this;
            }

            public Builder clearNumber() {
                copyOnWrite();
                ((Declaration) this.instance).clearNumber();
                return this;
            }

            public Builder clearRepeated() {
                copyOnWrite();
                ((Declaration) this.instance).clearRepeated();
                return this;
            }

            public Builder clearReserved() {
                copyOnWrite();
                ((Declaration) this.instance).clearReserved();
                return this;
            }

            public Builder clearType() {
                copyOnWrite();
                ((Declaration) this.instance).clearType();
                return this;
            }

            @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$ExtensionRangeOptions.DeclarationOrBuilder
            public String getFullName() {
                return ((Declaration) this.instance).getFullName();
            }

            @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$ExtensionRangeOptions.DeclarationOrBuilder
            public j getFullNameBytes() {
                return ((Declaration) this.instance).getFullNameBytes();
            }

            @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$ExtensionRangeOptions.DeclarationOrBuilder
            public int getNumber() {
                return ((Declaration) this.instance).getNumber();
            }

            @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$ExtensionRangeOptions.DeclarationOrBuilder
            public boolean getRepeated() {
                return ((Declaration) this.instance).getRepeated();
            }

            @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$ExtensionRangeOptions.DeclarationOrBuilder
            public boolean getReserved() {
                return ((Declaration) this.instance).getReserved();
            }

            @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$ExtensionRangeOptions.DeclarationOrBuilder
            public String getType() {
                return ((Declaration) this.instance).getType();
            }

            @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$ExtensionRangeOptions.DeclarationOrBuilder
            public j getTypeBytes() {
                return ((Declaration) this.instance).getTypeBytes();
            }

            @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$ExtensionRangeOptions.DeclarationOrBuilder
            public boolean hasFullName() {
                return ((Declaration) this.instance).hasFullName();
            }

            @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$ExtensionRangeOptions.DeclarationOrBuilder
            public boolean hasNumber() {
                return ((Declaration) this.instance).hasNumber();
            }

            @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$ExtensionRangeOptions.DeclarationOrBuilder
            public boolean hasRepeated() {
                return ((Declaration) this.instance).hasRepeated();
            }

            @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$ExtensionRangeOptions.DeclarationOrBuilder
            public boolean hasReserved() {
                return ((Declaration) this.instance).hasReserved();
            }

            @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$ExtensionRangeOptions.DeclarationOrBuilder
            public boolean hasType() {
                return ((Declaration) this.instance).hasType();
            }

            public Builder setFullName(String str) {
                copyOnWrite();
                ((Declaration) this.instance).setFullName(str);
                return this;
            }

            public Builder setFullNameBytes(j jVar) {
                copyOnWrite();
                ((Declaration) this.instance).setFullNameBytes(jVar);
                return this;
            }

            public Builder setNumber(int i10) {
                copyOnWrite();
                ((Declaration) this.instance).setNumber(i10);
                return this;
            }

            public Builder setRepeated(boolean z10) {
                copyOnWrite();
                ((Declaration) this.instance).setRepeated(z10);
                return this;
            }

            public Builder setReserved(boolean z10) {
                copyOnWrite();
                ((Declaration) this.instance).setReserved(z10);
                return this;
            }

            public Builder setType(String str) {
                copyOnWrite();
                ((Declaration) this.instance).setType(str);
                return this;
            }

            public Builder setTypeBytes(j jVar) {
                copyOnWrite();
                ((Declaration) this.instance).setTypeBytes(jVar);
                return this;
            }

            private Builder() {
                super(Declaration.DEFAULT_INSTANCE);
            }
        }

        static {
            Declaration declaration = new Declaration();
            DEFAULT_INSTANCE = declaration;
            GeneratedMessageLite.registerDefaultInstance(Declaration.class, declaration);
        }

        private Declaration() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearFullName() {
            this.bitField0_ &= -3;
            this.fullName_ = getDefaultInstance().getFullName();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearNumber() {
            this.bitField0_ &= -2;
            this.number_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearRepeated() {
            this.bitField0_ &= -17;
            this.repeated_ = false;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearReserved() {
            this.bitField0_ &= -9;
            this.reserved_ = false;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearType() {
            this.bitField0_ &= -5;
            this.type_ = getDefaultInstance().getType();
        }

        public static Declaration getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static Declaration parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (Declaration) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static Declaration parseFrom(ByteBuffer byteBuffer) throws e0 {
            return (Declaration) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static h1<Declaration> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setFullName(String str) {
            str.getClass();
            this.bitField0_ |= 2;
            this.fullName_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setFullNameBytes(j jVar) {
            this.fullName_ = jVar.n();
            this.bitField0_ |= 2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setNumber(int i10) {
            this.bitField0_ |= 1;
            this.number_ = i10;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setRepeated(boolean z10) {
            this.bitField0_ |= 16;
            this.repeated_ = z10;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setReserved(boolean z10) {
            this.bitField0_ |= 8;
            this.reserved_ = z10;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setType(String str) {
            str.getClass();
            this.bitField0_ |= 4;
            this.type_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setTypeBytes(j jVar) {
            this.type_ = jVar.n();
            this.bitField0_ |= 4;
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
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0005\u0000\u0001\u0001\u0006\u0005\u0000\u0000\u0000\u0001င\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0005ဇ\u0003\u0006ဇ\u0004", new Object[]{"bitField0_", "number_", "fullName_", "type_", "reserved_", "repeated_"});
                case 3:
                    return new Declaration();
                case 4:
                    return new Builder();
                case 5:
                    return DEFAULT_INSTANCE;
                case 6:
                    h1<Declaration> h1Var = PARSER;
                    if (h1Var != null) {
                        return h1Var;
                    }
                    synchronized (Declaration.class) {
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

        @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$ExtensionRangeOptions.DeclarationOrBuilder
        public String getFullName() {
            return this.fullName_;
        }

        @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$ExtensionRangeOptions.DeclarationOrBuilder
        public j getFullNameBytes() {
            return j.d(this.fullName_);
        }

        @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$ExtensionRangeOptions.DeclarationOrBuilder
        public int getNumber() {
            return this.number_;
        }

        @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$ExtensionRangeOptions.DeclarationOrBuilder
        public boolean getRepeated() {
            return this.repeated_;
        }

        @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$ExtensionRangeOptions.DeclarationOrBuilder
        public boolean getReserved() {
            return this.reserved_;
        }

        @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$ExtensionRangeOptions.DeclarationOrBuilder
        public String getType() {
            return this.type_;
        }

        @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$ExtensionRangeOptions.DeclarationOrBuilder
        public j getTypeBytes() {
            return j.d(this.type_);
        }

        @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$ExtensionRangeOptions.DeclarationOrBuilder
        public boolean hasFullName() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$ExtensionRangeOptions.DeclarationOrBuilder
        public boolean hasNumber() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$ExtensionRangeOptions.DeclarationOrBuilder
        public boolean hasRepeated() {
            return (this.bitField0_ & 16) != 0;
        }

        @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$ExtensionRangeOptions.DeclarationOrBuilder
        public boolean hasReserved() {
            return (this.bitField0_ & 8) != 0;
        }

        @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$ExtensionRangeOptions.DeclarationOrBuilder
        public boolean hasType() {
            return (this.bitField0_ & 4) != 0;
        }

        public static Builder newBuilder(Declaration declaration) {
            return DEFAULT_INSTANCE.createBuilder(declaration);
        }

        public static Declaration parseDelimitedFrom(InputStream inputStream, t tVar) throws IOException {
            return (Declaration) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, tVar);
        }

        public static Declaration parseFrom(ByteBuffer byteBuffer, t tVar) throws e0 {
            return (Declaration) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, tVar);
        }

        public static Declaration parseFrom(j jVar) throws e0 {
            return (Declaration) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, jVar);
        }

        public static Declaration parseFrom(j jVar, t tVar) throws e0 {
            return (Declaration) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, jVar, tVar);
        }

        public static Declaration parseFrom(byte[] bArr) throws e0 {
            return (Declaration) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static Declaration parseFrom(byte[] bArr, t tVar) throws e0 {
            return (Declaration) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, tVar);
        }

        public static Declaration parseFrom(InputStream inputStream) throws IOException {
            return (Declaration) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static Declaration parseFrom(InputStream inputStream, t tVar) throws IOException {
            return (Declaration) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, tVar);
        }

        public static Declaration parseFrom(k kVar) throws IOException {
            return (Declaration) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, kVar);
        }

        public static Declaration parseFrom(k kVar, t tVar) throws IOException {
            return (Declaration) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, kVar, tVar);
        }
    }

    public interface DeclarationOrBuilder extends w0 {
        /* synthetic */ MessageLite getDefaultInstanceForType();

        String getFullName();

        j getFullNameBytes();

        int getNumber();

        boolean getRepeated();

        boolean getReserved();

        String getType();

        j getTypeBytes();

        boolean hasFullName();

        boolean hasNumber();

        boolean hasRepeated();

        boolean hasReserved();

        boolean hasType();

        @Override // androidx.datastore.preferences.protobuf.w0
        /* synthetic */ boolean isInitialized();
    }

    public enum a implements d0.c {
        DECLARATION(0),
        UNVERIFIED(1);


        /* renamed from: a, reason: collision with root package name */
        public final int f1772a;

        /* renamed from: androidx.datastore.preferences.protobuf.DescriptorProtos$ExtensionRangeOptions$a$a, reason: collision with other inner class name */
        public static final class C0020a implements d0.e {

            /* renamed from: a, reason: collision with root package name */
            public static final C0020a f1773a = new C0020a();

            @Override // androidx.datastore.preferences.protobuf.d0.e
            public final boolean isInRange(int i10) {
                return (i10 != 0 ? i10 != 1 ? null : a.UNVERIFIED : a.DECLARATION) != null;
            }
        }

        a(int i10) {
            this.f1772a = i10;
        }

        @Override // androidx.datastore.preferences.protobuf.d0.c
        public final int getNumber() {
            return this.f1772a;
        }
    }

    static {
        DescriptorProtos$ExtensionRangeOptions descriptorProtos$ExtensionRangeOptions = new DescriptorProtos$ExtensionRangeOptions();
        DEFAULT_INSTANCE = descriptorProtos$ExtensionRangeOptions;
        GeneratedMessageLite.registerDefaultInstance(DescriptorProtos$ExtensionRangeOptions.class, descriptorProtos$ExtensionRangeOptions);
    }

    private DescriptorProtos$ExtensionRangeOptions() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllDeclaration(Iterable<? extends Declaration> iterable) {
        ensureDeclarationIsMutable();
        AbstractMessageLite.addAll(iterable, this.declaration_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllUninterpretedOption(Iterable<? extends DescriptorProtos$UninterpretedOption> iterable) {
        ensureUninterpretedOptionIsMutable();
        AbstractMessageLite.addAll(iterable, this.uninterpretedOption_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addDeclaration(Declaration declaration) {
        declaration.getClass();
        ensureDeclarationIsMutable();
        this.declaration_.add(declaration);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addUninterpretedOption(DescriptorProtos$UninterpretedOption descriptorProtos$UninterpretedOption) {
        descriptorProtos$UninterpretedOption.getClass();
        ensureUninterpretedOptionIsMutable();
        this.uninterpretedOption_.add(descriptorProtos$UninterpretedOption);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDeclaration() {
        this.declaration_ = GeneratedMessageLite.emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearFeatures() {
        this.features_ = null;
        this.bitField0_ &= -2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearUninterpretedOption() {
        this.uninterpretedOption_ = GeneratedMessageLite.emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearVerification() {
        this.bitField0_ &= -3;
        this.verification_ = 1;
    }

    private void ensureDeclarationIsMutable() {
        d0.j<Declaration> jVar = this.declaration_;
        if (jVar.isModifiable()) {
            return;
        }
        this.declaration_ = GeneratedMessageLite.mutableCopy(jVar);
    }

    private void ensureUninterpretedOptionIsMutable() {
        d0.j<DescriptorProtos$UninterpretedOption> jVar = this.uninterpretedOption_;
        if (jVar.isModifiable()) {
            return;
        }
        this.uninterpretedOption_ = GeneratedMessageLite.mutableCopy(jVar);
    }

    public static DescriptorProtos$ExtensionRangeOptions getDefaultInstance() {
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
        this.bitField0_ |= 1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static Builder newBuilder() {
        return (Builder) DEFAULT_INSTANCE.createBuilder();
    }

    public static DescriptorProtos$ExtensionRangeOptions parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (DescriptorProtos$ExtensionRangeOptions) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static DescriptorProtos$ExtensionRangeOptions parseFrom(ByteBuffer byteBuffer) throws e0 {
        return (DescriptorProtos$ExtensionRangeOptions) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static h1<DescriptorProtos$ExtensionRangeOptions> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeDeclaration(int i10) {
        ensureDeclarationIsMutable();
        this.declaration_.remove(i10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeUninterpretedOption(int i10) {
        ensureUninterpretedOptionIsMutable();
        this.uninterpretedOption_.remove(i10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDeclaration(int i10, Declaration declaration) {
        declaration.getClass();
        ensureDeclarationIsMutable();
        this.declaration_.set(i10, declaration);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setFeatures(DescriptorProtos$FeatureSet descriptorProtos$FeatureSet) {
        descriptorProtos$FeatureSet.getClass();
        this.features_ = descriptorProtos$FeatureSet;
        this.bitField0_ |= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setUninterpretedOption(int i10, DescriptorProtos$UninterpretedOption descriptorProtos$UninterpretedOption) {
        descriptorProtos$UninterpretedOption.getClass();
        ensureUninterpretedOptionIsMutable();
        this.uninterpretedOption_.set(i10, descriptorProtos$UninterpretedOption);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setVerification(a aVar) {
        this.verification_ = aVar.f1772a;
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
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0004\u0000\u0001\u0002ϧ\u0004\u0000\u0002\u0002\u0002\u001b\u0003᠌\u00012ᐉ\u0000ϧЛ", new Object[]{"bitField0_", "declaration_", Declaration.class, "verification_", a.C0020a.f1773a, "features_", "uninterpretedOption_", DescriptorProtos$UninterpretedOption.class});
            case 3:
                return new DescriptorProtos$ExtensionRangeOptions();
            case 4:
                return new Builder();
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                h1<DescriptorProtos$ExtensionRangeOptions> h1Var = PARSER;
                if (h1Var != null) {
                    return h1Var;
                }
                synchronized (DescriptorProtos$ExtensionRangeOptions.class) {
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

    @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$ExtensionRangeOptionsOrBuilder
    public Declaration getDeclaration(int i10) {
        return this.declaration_.get(i10);
    }

    @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$ExtensionRangeOptionsOrBuilder
    public int getDeclarationCount() {
        return this.declaration_.size();
    }

    @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$ExtensionRangeOptionsOrBuilder
    public List<Declaration> getDeclarationList() {
        return this.declaration_;
    }

    public DeclarationOrBuilder getDeclarationOrBuilder(int i10) {
        return this.declaration_.get(i10);
    }

    public List<? extends DeclarationOrBuilder> getDeclarationOrBuilderList() {
        return this.declaration_;
    }

    @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$ExtensionRangeOptionsOrBuilder
    public DescriptorProtos$FeatureSet getFeatures() {
        DescriptorProtos$FeatureSet descriptorProtos$FeatureSet = this.features_;
        return descriptorProtos$FeatureSet == null ? DescriptorProtos$FeatureSet.getDefaultInstance() : descriptorProtos$FeatureSet;
    }

    @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$ExtensionRangeOptionsOrBuilder
    public DescriptorProtos$UninterpretedOption getUninterpretedOption(int i10) {
        return this.uninterpretedOption_.get(i10);
    }

    @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$ExtensionRangeOptionsOrBuilder
    public int getUninterpretedOptionCount() {
        return this.uninterpretedOption_.size();
    }

    @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$ExtensionRangeOptionsOrBuilder
    public List<DescriptorProtos$UninterpretedOption> getUninterpretedOptionList() {
        return this.uninterpretedOption_;
    }

    public DescriptorProtos$UninterpretedOptionOrBuilder getUninterpretedOptionOrBuilder(int i10) {
        return this.uninterpretedOption_.get(i10);
    }

    public List<? extends DescriptorProtos$UninterpretedOptionOrBuilder> getUninterpretedOptionOrBuilderList() {
        return this.uninterpretedOption_;
    }

    @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$ExtensionRangeOptionsOrBuilder
    public a getVerification() {
        int i10 = this.verification_;
        a aVar = a.UNVERIFIED;
        a aVar2 = i10 != 0 ? i10 != 1 ? null : aVar : a.DECLARATION;
        return aVar2 == null ? aVar : aVar2;
    }

    @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$ExtensionRangeOptionsOrBuilder
    public boolean hasFeatures() {
        return (this.bitField0_ & 1) != 0;
    }

    @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$ExtensionRangeOptionsOrBuilder
    public boolean hasVerification() {
        return (this.bitField0_ & 2) != 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static Builder newBuilder(DescriptorProtos$ExtensionRangeOptions descriptorProtos$ExtensionRangeOptions) {
        return (Builder) DEFAULT_INSTANCE.createBuilder(descriptorProtos$ExtensionRangeOptions);
    }

    public static DescriptorProtos$ExtensionRangeOptions parseDelimitedFrom(InputStream inputStream, t tVar) throws IOException {
        return (DescriptorProtos$ExtensionRangeOptions) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, tVar);
    }

    public static DescriptorProtos$ExtensionRangeOptions parseFrom(ByteBuffer byteBuffer, t tVar) throws e0 {
        return (DescriptorProtos$ExtensionRangeOptions) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, tVar);
    }

    public static DescriptorProtos$ExtensionRangeOptions parseFrom(j jVar) throws e0 {
        return (DescriptorProtos$ExtensionRangeOptions) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, jVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addDeclaration(int i10, Declaration declaration) {
        declaration.getClass();
        ensureDeclarationIsMutable();
        this.declaration_.add(i10, declaration);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addUninterpretedOption(int i10, DescriptorProtos$UninterpretedOption descriptorProtos$UninterpretedOption) {
        descriptorProtos$UninterpretedOption.getClass();
        ensureUninterpretedOptionIsMutable();
        this.uninterpretedOption_.add(i10, descriptorProtos$UninterpretedOption);
    }

    public static DescriptorProtos$ExtensionRangeOptions parseFrom(j jVar, t tVar) throws e0 {
        return (DescriptorProtos$ExtensionRangeOptions) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, jVar, tVar);
    }

    public static DescriptorProtos$ExtensionRangeOptions parseFrom(byte[] bArr) throws e0 {
        return (DescriptorProtos$ExtensionRangeOptions) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static DescriptorProtos$ExtensionRangeOptions parseFrom(byte[] bArr, t tVar) throws e0 {
        return (DescriptorProtos$ExtensionRangeOptions) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, tVar);
    }

    public static DescriptorProtos$ExtensionRangeOptions parseFrom(InputStream inputStream) throws IOException {
        return (DescriptorProtos$ExtensionRangeOptions) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static DescriptorProtos$ExtensionRangeOptions parseFrom(InputStream inputStream, t tVar) throws IOException {
        return (DescriptorProtos$ExtensionRangeOptions) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, tVar);
    }

    public static DescriptorProtos$ExtensionRangeOptions parseFrom(k kVar) throws IOException {
        return (DescriptorProtos$ExtensionRangeOptions) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, kVar);
    }

    public static DescriptorProtos$ExtensionRangeOptions parseFrom(k kVar, t tVar) throws IOException {
        return (DescriptorProtos$ExtensionRangeOptions) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, kVar, tVar);
    }
}
