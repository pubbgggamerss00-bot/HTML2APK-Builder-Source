package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.GeneratedMessageLite;
import androidx.datastore.preferences.protobuf.d0;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public final class DescriptorProtos$UninterpretedOption extends GeneratedMessageLite<DescriptorProtos$UninterpretedOption, Builder> implements DescriptorProtos$UninterpretedOptionOrBuilder {
    public static final int AGGREGATE_VALUE_FIELD_NUMBER = 8;
    private static final DescriptorProtos$UninterpretedOption DEFAULT_INSTANCE;
    public static final int DOUBLE_VALUE_FIELD_NUMBER = 6;
    public static final int IDENTIFIER_VALUE_FIELD_NUMBER = 3;
    public static final int NAME_FIELD_NUMBER = 2;
    public static final int NEGATIVE_INT_VALUE_FIELD_NUMBER = 5;
    private static volatile h1<DescriptorProtos$UninterpretedOption> PARSER = null;
    public static final int POSITIVE_INT_VALUE_FIELD_NUMBER = 4;
    public static final int STRING_VALUE_FIELD_NUMBER = 7;
    private int bitField0_;
    private double doubleValue_;
    private long negativeIntValue_;
    private long positiveIntValue_;
    private byte memoizedIsInitialized = 2;
    private d0.j<NamePart> name_ = GeneratedMessageLite.emptyProtobufList();
    private String identifierValue_ = "";
    private j stringValue_ = j.f2038b;
    private String aggregateValue_ = "";

    public static final class Builder extends GeneratedMessageLite.Builder<DescriptorProtos$UninterpretedOption, Builder> implements DescriptorProtos$UninterpretedOptionOrBuilder {
        public Builder addAllName(Iterable<? extends NamePart> iterable) {
            copyOnWrite();
            ((DescriptorProtos$UninterpretedOption) this.instance).addAllName(iterable);
            return this;
        }

        public Builder addName(NamePart namePart) {
            copyOnWrite();
            ((DescriptorProtos$UninterpretedOption) this.instance).addName(namePart);
            return this;
        }

        public Builder clearAggregateValue() {
            copyOnWrite();
            ((DescriptorProtos$UninterpretedOption) this.instance).clearAggregateValue();
            return this;
        }

        public Builder clearDoubleValue() {
            copyOnWrite();
            ((DescriptorProtos$UninterpretedOption) this.instance).clearDoubleValue();
            return this;
        }

        public Builder clearIdentifierValue() {
            copyOnWrite();
            ((DescriptorProtos$UninterpretedOption) this.instance).clearIdentifierValue();
            return this;
        }

        public Builder clearName() {
            copyOnWrite();
            ((DescriptorProtos$UninterpretedOption) this.instance).clearName();
            return this;
        }

        public Builder clearNegativeIntValue() {
            copyOnWrite();
            ((DescriptorProtos$UninterpretedOption) this.instance).clearNegativeIntValue();
            return this;
        }

        public Builder clearPositiveIntValue() {
            copyOnWrite();
            ((DescriptorProtos$UninterpretedOption) this.instance).clearPositiveIntValue();
            return this;
        }

        public Builder clearStringValue() {
            copyOnWrite();
            ((DescriptorProtos$UninterpretedOption) this.instance).clearStringValue();
            return this;
        }

        @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$UninterpretedOptionOrBuilder
        public String getAggregateValue() {
            return ((DescriptorProtos$UninterpretedOption) this.instance).getAggregateValue();
        }

        @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$UninterpretedOptionOrBuilder
        public j getAggregateValueBytes() {
            return ((DescriptorProtos$UninterpretedOption) this.instance).getAggregateValueBytes();
        }

        @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$UninterpretedOptionOrBuilder
        public double getDoubleValue() {
            return ((DescriptorProtos$UninterpretedOption) this.instance).getDoubleValue();
        }

        @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$UninterpretedOptionOrBuilder
        public String getIdentifierValue() {
            return ((DescriptorProtos$UninterpretedOption) this.instance).getIdentifierValue();
        }

        @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$UninterpretedOptionOrBuilder
        public j getIdentifierValueBytes() {
            return ((DescriptorProtos$UninterpretedOption) this.instance).getIdentifierValueBytes();
        }

        @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$UninterpretedOptionOrBuilder
        public NamePart getName(int i10) {
            return ((DescriptorProtos$UninterpretedOption) this.instance).getName(i10);
        }

        @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$UninterpretedOptionOrBuilder
        public int getNameCount() {
            return ((DescriptorProtos$UninterpretedOption) this.instance).getNameCount();
        }

        @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$UninterpretedOptionOrBuilder
        public List<NamePart> getNameList() {
            return Collections.unmodifiableList(((DescriptorProtos$UninterpretedOption) this.instance).getNameList());
        }

        @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$UninterpretedOptionOrBuilder
        public long getNegativeIntValue() {
            return ((DescriptorProtos$UninterpretedOption) this.instance).getNegativeIntValue();
        }

        @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$UninterpretedOptionOrBuilder
        public long getPositiveIntValue() {
            return ((DescriptorProtos$UninterpretedOption) this.instance).getPositiveIntValue();
        }

        @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$UninterpretedOptionOrBuilder
        public j getStringValue() {
            return ((DescriptorProtos$UninterpretedOption) this.instance).getStringValue();
        }

        @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$UninterpretedOptionOrBuilder
        public boolean hasAggregateValue() {
            return ((DescriptorProtos$UninterpretedOption) this.instance).hasAggregateValue();
        }

        @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$UninterpretedOptionOrBuilder
        public boolean hasDoubleValue() {
            return ((DescriptorProtos$UninterpretedOption) this.instance).hasDoubleValue();
        }

        @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$UninterpretedOptionOrBuilder
        public boolean hasIdentifierValue() {
            return ((DescriptorProtos$UninterpretedOption) this.instance).hasIdentifierValue();
        }

        @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$UninterpretedOptionOrBuilder
        public boolean hasNegativeIntValue() {
            return ((DescriptorProtos$UninterpretedOption) this.instance).hasNegativeIntValue();
        }

        @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$UninterpretedOptionOrBuilder
        public boolean hasPositiveIntValue() {
            return ((DescriptorProtos$UninterpretedOption) this.instance).hasPositiveIntValue();
        }

        @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$UninterpretedOptionOrBuilder
        public boolean hasStringValue() {
            return ((DescriptorProtos$UninterpretedOption) this.instance).hasStringValue();
        }

        public Builder removeName(int i10) {
            copyOnWrite();
            ((DescriptorProtos$UninterpretedOption) this.instance).removeName(i10);
            return this;
        }

        public Builder setAggregateValue(String str) {
            copyOnWrite();
            ((DescriptorProtos$UninterpretedOption) this.instance).setAggregateValue(str);
            return this;
        }

        public Builder setAggregateValueBytes(j jVar) {
            copyOnWrite();
            ((DescriptorProtos$UninterpretedOption) this.instance).setAggregateValueBytes(jVar);
            return this;
        }

        public Builder setDoubleValue(double d10) {
            copyOnWrite();
            ((DescriptorProtos$UninterpretedOption) this.instance).setDoubleValue(d10);
            return this;
        }

        public Builder setIdentifierValue(String str) {
            copyOnWrite();
            ((DescriptorProtos$UninterpretedOption) this.instance).setIdentifierValue(str);
            return this;
        }

        public Builder setIdentifierValueBytes(j jVar) {
            copyOnWrite();
            ((DescriptorProtos$UninterpretedOption) this.instance).setIdentifierValueBytes(jVar);
            return this;
        }

        public Builder setName(int i10, NamePart namePart) {
            copyOnWrite();
            ((DescriptorProtos$UninterpretedOption) this.instance).setName(i10, namePart);
            return this;
        }

        public Builder setNegativeIntValue(long j10) {
            copyOnWrite();
            ((DescriptorProtos$UninterpretedOption) this.instance).setNegativeIntValue(j10);
            return this;
        }

        public Builder setPositiveIntValue(long j10) {
            copyOnWrite();
            ((DescriptorProtos$UninterpretedOption) this.instance).setPositiveIntValue(j10);
            return this;
        }

        public Builder setStringValue(j jVar) {
            copyOnWrite();
            ((DescriptorProtos$UninterpretedOption) this.instance).setStringValue(jVar);
            return this;
        }

        private Builder() {
            super(DescriptorProtos$UninterpretedOption.DEFAULT_INSTANCE);
        }

        public Builder addName(int i10, NamePart namePart) {
            copyOnWrite();
            ((DescriptorProtos$UninterpretedOption) this.instance).addName(i10, namePart);
            return this;
        }

        public Builder setName(int i10, NamePart.Builder builder) {
            copyOnWrite();
            ((DescriptorProtos$UninterpretedOption) this.instance).setName(i10, builder.build());
            return this;
        }

        public Builder addName(NamePart.Builder builder) {
            copyOnWrite();
            ((DescriptorProtos$UninterpretedOption) this.instance).addName(builder.build());
            return this;
        }

        public Builder addName(int i10, NamePart.Builder builder) {
            copyOnWrite();
            ((DescriptorProtos$UninterpretedOption) this.instance).addName(i10, builder.build());
            return this;
        }
    }

    public static final class NamePart extends GeneratedMessageLite<NamePart, Builder> implements NamePartOrBuilder {
        private static final NamePart DEFAULT_INSTANCE;
        public static final int IS_EXTENSION_FIELD_NUMBER = 2;
        public static final int NAME_PART_FIELD_NUMBER = 1;
        private static volatile h1<NamePart> PARSER;
        private int bitField0_;
        private boolean isExtension_;
        private byte memoizedIsInitialized = 2;
        private String namePart_ = "";

        public static final class Builder extends GeneratedMessageLite.Builder<NamePart, Builder> implements NamePartOrBuilder {
            public Builder clearIsExtension() {
                copyOnWrite();
                ((NamePart) this.instance).clearIsExtension();
                return this;
            }

            public Builder clearNamePart() {
                copyOnWrite();
                ((NamePart) this.instance).clearNamePart();
                return this;
            }

            @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$UninterpretedOption.NamePartOrBuilder
            public boolean getIsExtension() {
                return ((NamePart) this.instance).getIsExtension();
            }

            @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$UninterpretedOption.NamePartOrBuilder
            public String getNamePart() {
                return ((NamePart) this.instance).getNamePart();
            }

            @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$UninterpretedOption.NamePartOrBuilder
            public j getNamePartBytes() {
                return ((NamePart) this.instance).getNamePartBytes();
            }

            @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$UninterpretedOption.NamePartOrBuilder
            public boolean hasIsExtension() {
                return ((NamePart) this.instance).hasIsExtension();
            }

            @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$UninterpretedOption.NamePartOrBuilder
            public boolean hasNamePart() {
                return ((NamePart) this.instance).hasNamePart();
            }

            public Builder setIsExtension(boolean z10) {
                copyOnWrite();
                ((NamePart) this.instance).setIsExtension(z10);
                return this;
            }

            public Builder setNamePart(String str) {
                copyOnWrite();
                ((NamePart) this.instance).setNamePart(str);
                return this;
            }

            public Builder setNamePartBytes(j jVar) {
                copyOnWrite();
                ((NamePart) this.instance).setNamePartBytes(jVar);
                return this;
            }

            private Builder() {
                super(NamePart.DEFAULT_INSTANCE);
            }
        }

        static {
            NamePart namePart = new NamePart();
            DEFAULT_INSTANCE = namePart;
            GeneratedMessageLite.registerDefaultInstance(NamePart.class, namePart);
        }

        private NamePart() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearIsExtension() {
            this.bitField0_ &= -3;
            this.isExtension_ = false;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearNamePart() {
            this.bitField0_ &= -2;
            this.namePart_ = getDefaultInstance().getNamePart();
        }

        public static NamePart getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static NamePart parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (NamePart) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static NamePart parseFrom(ByteBuffer byteBuffer) throws e0 {
            return (NamePart) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static h1<NamePart> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setIsExtension(boolean z10) {
            this.bitField0_ |= 2;
            this.isExtension_ = z10;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setNamePart(String str) {
            str.getClass();
            this.bitField0_ |= 1;
            this.namePart_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setNamePartBytes(j jVar) {
            this.namePart_ = jVar.n();
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
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0002\u0001ᔈ\u0000\u0002ᔇ\u0001", new Object[]{"bitField0_", "namePart_", "isExtension_"});
                case 3:
                    return new NamePart();
                case 4:
                    return new Builder();
                case 5:
                    return DEFAULT_INSTANCE;
                case 6:
                    h1<NamePart> h1Var = PARSER;
                    if (h1Var != null) {
                        return h1Var;
                    }
                    synchronized (NamePart.class) {
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

        @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$UninterpretedOption.NamePartOrBuilder
        public boolean getIsExtension() {
            return this.isExtension_;
        }

        @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$UninterpretedOption.NamePartOrBuilder
        public String getNamePart() {
            return this.namePart_;
        }

        @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$UninterpretedOption.NamePartOrBuilder
        public j getNamePartBytes() {
            return j.d(this.namePart_);
        }

        @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$UninterpretedOption.NamePartOrBuilder
        public boolean hasIsExtension() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$UninterpretedOption.NamePartOrBuilder
        public boolean hasNamePart() {
            return (this.bitField0_ & 1) != 0;
        }

        public static Builder newBuilder(NamePart namePart) {
            return DEFAULT_INSTANCE.createBuilder(namePart);
        }

        public static NamePart parseDelimitedFrom(InputStream inputStream, t tVar) throws IOException {
            return (NamePart) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, tVar);
        }

        public static NamePart parseFrom(ByteBuffer byteBuffer, t tVar) throws e0 {
            return (NamePart) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, tVar);
        }

        public static NamePart parseFrom(j jVar) throws e0 {
            return (NamePart) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, jVar);
        }

        public static NamePart parseFrom(j jVar, t tVar) throws e0 {
            return (NamePart) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, jVar, tVar);
        }

        public static NamePart parseFrom(byte[] bArr) throws e0 {
            return (NamePart) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static NamePart parseFrom(byte[] bArr, t tVar) throws e0 {
            return (NamePart) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, tVar);
        }

        public static NamePart parseFrom(InputStream inputStream) throws IOException {
            return (NamePart) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static NamePart parseFrom(InputStream inputStream, t tVar) throws IOException {
            return (NamePart) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, tVar);
        }

        public static NamePart parseFrom(k kVar) throws IOException {
            return (NamePart) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, kVar);
        }

        public static NamePart parseFrom(k kVar, t tVar) throws IOException {
            return (NamePart) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, kVar, tVar);
        }
    }

    public interface NamePartOrBuilder extends w0 {
        /* synthetic */ MessageLite getDefaultInstanceForType();

        boolean getIsExtension();

        String getNamePart();

        j getNamePartBytes();

        boolean hasIsExtension();

        boolean hasNamePart();

        @Override // androidx.datastore.preferences.protobuf.w0
        /* synthetic */ boolean isInitialized();
    }

    static {
        DescriptorProtos$UninterpretedOption descriptorProtos$UninterpretedOption = new DescriptorProtos$UninterpretedOption();
        DEFAULT_INSTANCE = descriptorProtos$UninterpretedOption;
        GeneratedMessageLite.registerDefaultInstance(DescriptorProtos$UninterpretedOption.class, descriptorProtos$UninterpretedOption);
    }

    private DescriptorProtos$UninterpretedOption() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllName(Iterable<? extends NamePart> iterable) {
        ensureNameIsMutable();
        AbstractMessageLite.addAll(iterable, this.name_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addName(NamePart namePart) {
        namePart.getClass();
        ensureNameIsMutable();
        this.name_.add(namePart);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAggregateValue() {
        this.bitField0_ &= -33;
        this.aggregateValue_ = getDefaultInstance().getAggregateValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDoubleValue() {
        this.bitField0_ &= -9;
        this.doubleValue_ = 0.0d;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearIdentifierValue() {
        this.bitField0_ &= -2;
        this.identifierValue_ = getDefaultInstance().getIdentifierValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearName() {
        this.name_ = GeneratedMessageLite.emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearNegativeIntValue() {
        this.bitField0_ &= -5;
        this.negativeIntValue_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPositiveIntValue() {
        this.bitField0_ &= -3;
        this.positiveIntValue_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearStringValue() {
        this.bitField0_ &= -17;
        this.stringValue_ = getDefaultInstance().getStringValue();
    }

    private void ensureNameIsMutable() {
        d0.j<NamePart> jVar = this.name_;
        if (jVar.isModifiable()) {
            return;
        }
        this.name_ = GeneratedMessageLite.mutableCopy(jVar);
    }

    public static DescriptorProtos$UninterpretedOption getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static DescriptorProtos$UninterpretedOption parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (DescriptorProtos$UninterpretedOption) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static DescriptorProtos$UninterpretedOption parseFrom(ByteBuffer byteBuffer) throws e0 {
        return (DescriptorProtos$UninterpretedOption) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static h1<DescriptorProtos$UninterpretedOption> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeName(int i10) {
        ensureNameIsMutable();
        this.name_.remove(i10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAggregateValue(String str) {
        str.getClass();
        this.bitField0_ |= 32;
        this.aggregateValue_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAggregateValueBytes(j jVar) {
        this.aggregateValue_ = jVar.n();
        this.bitField0_ |= 32;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDoubleValue(double d10) {
        this.bitField0_ |= 8;
        this.doubleValue_ = d10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setIdentifierValue(String str) {
        str.getClass();
        this.bitField0_ |= 1;
        this.identifierValue_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setIdentifierValueBytes(j jVar) {
        this.identifierValue_ = jVar.n();
        this.bitField0_ |= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setName(int i10, NamePart namePart) {
        namePart.getClass();
        ensureNameIsMutable();
        this.name_.set(i10, namePart);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setNegativeIntValue(long j10) {
        this.bitField0_ |= 4;
        this.negativeIntValue_ = j10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPositiveIntValue(long j10) {
        this.bitField0_ |= 2;
        this.positiveIntValue_ = j10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setStringValue(j jVar) {
        jVar.getClass();
        this.bitField0_ |= 16;
        this.stringValue_ = jVar;
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
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0007\u0000\u0001\u0002\b\u0007\u0000\u0001\u0001\u0002Л\u0003ဈ\u0000\u0004ဃ\u0001\u0005ဂ\u0002\u0006က\u0003\u0007ည\u0004\bဈ\u0005", new Object[]{"bitField0_", "name_", NamePart.class, "identifierValue_", "positiveIntValue_", "negativeIntValue_", "doubleValue_", "stringValue_", "aggregateValue_"});
            case 3:
                return new DescriptorProtos$UninterpretedOption();
            case 4:
                return new Builder();
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                h1<DescriptorProtos$UninterpretedOption> h1Var = PARSER;
                if (h1Var != null) {
                    return h1Var;
                }
                synchronized (DescriptorProtos$UninterpretedOption.class) {
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

    @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$UninterpretedOptionOrBuilder
    public String getAggregateValue() {
        return this.aggregateValue_;
    }

    @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$UninterpretedOptionOrBuilder
    public j getAggregateValueBytes() {
        return j.d(this.aggregateValue_);
    }

    @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$UninterpretedOptionOrBuilder
    public double getDoubleValue() {
        return this.doubleValue_;
    }

    @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$UninterpretedOptionOrBuilder
    public String getIdentifierValue() {
        return this.identifierValue_;
    }

    @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$UninterpretedOptionOrBuilder
    public j getIdentifierValueBytes() {
        return j.d(this.identifierValue_);
    }

    @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$UninterpretedOptionOrBuilder
    public NamePart getName(int i10) {
        return this.name_.get(i10);
    }

    @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$UninterpretedOptionOrBuilder
    public int getNameCount() {
        return this.name_.size();
    }

    @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$UninterpretedOptionOrBuilder
    public List<NamePart> getNameList() {
        return this.name_;
    }

    public NamePartOrBuilder getNameOrBuilder(int i10) {
        return this.name_.get(i10);
    }

    public List<? extends NamePartOrBuilder> getNameOrBuilderList() {
        return this.name_;
    }

    @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$UninterpretedOptionOrBuilder
    public long getNegativeIntValue() {
        return this.negativeIntValue_;
    }

    @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$UninterpretedOptionOrBuilder
    public long getPositiveIntValue() {
        return this.positiveIntValue_;
    }

    @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$UninterpretedOptionOrBuilder
    public j getStringValue() {
        return this.stringValue_;
    }

    @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$UninterpretedOptionOrBuilder
    public boolean hasAggregateValue() {
        return (this.bitField0_ & 32) != 0;
    }

    @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$UninterpretedOptionOrBuilder
    public boolean hasDoubleValue() {
        return (this.bitField0_ & 8) != 0;
    }

    @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$UninterpretedOptionOrBuilder
    public boolean hasIdentifierValue() {
        return (this.bitField0_ & 1) != 0;
    }

    @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$UninterpretedOptionOrBuilder
    public boolean hasNegativeIntValue() {
        return (this.bitField0_ & 4) != 0;
    }

    @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$UninterpretedOptionOrBuilder
    public boolean hasPositiveIntValue() {
        return (this.bitField0_ & 2) != 0;
    }

    @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$UninterpretedOptionOrBuilder
    public boolean hasStringValue() {
        return (this.bitField0_ & 16) != 0;
    }

    public static Builder newBuilder(DescriptorProtos$UninterpretedOption descriptorProtos$UninterpretedOption) {
        return DEFAULT_INSTANCE.createBuilder(descriptorProtos$UninterpretedOption);
    }

    public static DescriptorProtos$UninterpretedOption parseDelimitedFrom(InputStream inputStream, t tVar) throws IOException {
        return (DescriptorProtos$UninterpretedOption) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, tVar);
    }

    public static DescriptorProtos$UninterpretedOption parseFrom(ByteBuffer byteBuffer, t tVar) throws e0 {
        return (DescriptorProtos$UninterpretedOption) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, tVar);
    }

    public static DescriptorProtos$UninterpretedOption parseFrom(j jVar) throws e0 {
        return (DescriptorProtos$UninterpretedOption) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, jVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addName(int i10, NamePart namePart) {
        namePart.getClass();
        ensureNameIsMutable();
        this.name_.add(i10, namePart);
    }

    public static DescriptorProtos$UninterpretedOption parseFrom(j jVar, t tVar) throws e0 {
        return (DescriptorProtos$UninterpretedOption) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, jVar, tVar);
    }

    public static DescriptorProtos$UninterpretedOption parseFrom(byte[] bArr) throws e0 {
        return (DescriptorProtos$UninterpretedOption) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static DescriptorProtos$UninterpretedOption parseFrom(byte[] bArr, t tVar) throws e0 {
        return (DescriptorProtos$UninterpretedOption) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, tVar);
    }

    public static DescriptorProtos$UninterpretedOption parseFrom(InputStream inputStream) throws IOException {
        return (DescriptorProtos$UninterpretedOption) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static DescriptorProtos$UninterpretedOption parseFrom(InputStream inputStream, t tVar) throws IOException {
        return (DescriptorProtos$UninterpretedOption) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, tVar);
    }

    public static DescriptorProtos$UninterpretedOption parseFrom(k kVar) throws IOException {
        return (DescriptorProtos$UninterpretedOption) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, kVar);
    }

    public static DescriptorProtos$UninterpretedOption parseFrom(k kVar, t tVar) throws IOException {
        return (DescriptorProtos$UninterpretedOption) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, kVar, tVar);
    }
}
