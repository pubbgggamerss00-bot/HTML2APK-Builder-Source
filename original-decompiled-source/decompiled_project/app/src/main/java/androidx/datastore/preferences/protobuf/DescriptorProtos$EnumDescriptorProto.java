package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.DescriptorProtos$EnumOptions;
import androidx.datastore.preferences.protobuf.DescriptorProtos$EnumValueDescriptorProto;
import androidx.datastore.preferences.protobuf.GeneratedMessageLite;
import androidx.datastore.preferences.protobuf.d0;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public final class DescriptorProtos$EnumDescriptorProto extends GeneratedMessageLite<DescriptorProtos$EnumDescriptorProto, Builder> implements DescriptorProtos$EnumDescriptorProtoOrBuilder {
    private static final DescriptorProtos$EnumDescriptorProto DEFAULT_INSTANCE;
    public static final int NAME_FIELD_NUMBER = 1;
    public static final int OPTIONS_FIELD_NUMBER = 3;
    private static volatile h1<DescriptorProtos$EnumDescriptorProto> PARSER = null;
    public static final int RESERVED_NAME_FIELD_NUMBER = 5;
    public static final int RESERVED_RANGE_FIELD_NUMBER = 4;
    public static final int VALUE_FIELD_NUMBER = 2;
    private int bitField0_;
    private DescriptorProtos$EnumOptions options_;
    private byte memoizedIsInitialized = 2;
    private String name_ = "";
    private d0.j<DescriptorProtos$EnumValueDescriptorProto> value_ = GeneratedMessageLite.emptyProtobufList();
    private d0.j<EnumReservedRange> reservedRange_ = GeneratedMessageLite.emptyProtobufList();
    private d0.j<String> reservedName_ = GeneratedMessageLite.emptyProtobufList();

    public static final class Builder extends GeneratedMessageLite.Builder<DescriptorProtos$EnumDescriptorProto, Builder> implements DescriptorProtos$EnumDescriptorProtoOrBuilder {
        public Builder addAllReservedName(Iterable<String> iterable) {
            copyOnWrite();
            ((DescriptorProtos$EnumDescriptorProto) this.instance).addAllReservedName(iterable);
            return this;
        }

        public Builder addAllReservedRange(Iterable<? extends EnumReservedRange> iterable) {
            copyOnWrite();
            ((DescriptorProtos$EnumDescriptorProto) this.instance).addAllReservedRange(iterable);
            return this;
        }

        public Builder addAllValue(Iterable<? extends DescriptorProtos$EnumValueDescriptorProto> iterable) {
            copyOnWrite();
            ((DescriptorProtos$EnumDescriptorProto) this.instance).addAllValue(iterable);
            return this;
        }

        public Builder addReservedName(String str) {
            copyOnWrite();
            ((DescriptorProtos$EnumDescriptorProto) this.instance).addReservedName(str);
            return this;
        }

        public Builder addReservedNameBytes(j jVar) {
            copyOnWrite();
            ((DescriptorProtos$EnumDescriptorProto) this.instance).addReservedNameBytes(jVar);
            return this;
        }

        public Builder addReservedRange(EnumReservedRange enumReservedRange) {
            copyOnWrite();
            ((DescriptorProtos$EnumDescriptorProto) this.instance).addReservedRange(enumReservedRange);
            return this;
        }

        public Builder addValue(DescriptorProtos$EnumValueDescriptorProto descriptorProtos$EnumValueDescriptorProto) {
            copyOnWrite();
            ((DescriptorProtos$EnumDescriptorProto) this.instance).addValue(descriptorProtos$EnumValueDescriptorProto);
            return this;
        }

        public Builder clearName() {
            copyOnWrite();
            ((DescriptorProtos$EnumDescriptorProto) this.instance).clearName();
            return this;
        }

        public Builder clearOptions() {
            copyOnWrite();
            ((DescriptorProtos$EnumDescriptorProto) this.instance).clearOptions();
            return this;
        }

        public Builder clearReservedName() {
            copyOnWrite();
            ((DescriptorProtos$EnumDescriptorProto) this.instance).clearReservedName();
            return this;
        }

        public Builder clearReservedRange() {
            copyOnWrite();
            ((DescriptorProtos$EnumDescriptorProto) this.instance).clearReservedRange();
            return this;
        }

        public Builder clearValue() {
            copyOnWrite();
            ((DescriptorProtos$EnumDescriptorProto) this.instance).clearValue();
            return this;
        }

        @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$EnumDescriptorProtoOrBuilder
        public String getName() {
            return ((DescriptorProtos$EnumDescriptorProto) this.instance).getName();
        }

        @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$EnumDescriptorProtoOrBuilder
        public j getNameBytes() {
            return ((DescriptorProtos$EnumDescriptorProto) this.instance).getNameBytes();
        }

        @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$EnumDescriptorProtoOrBuilder
        public DescriptorProtos$EnumOptions getOptions() {
            return ((DescriptorProtos$EnumDescriptorProto) this.instance).getOptions();
        }

        @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$EnumDescriptorProtoOrBuilder
        public String getReservedName(int i10) {
            return ((DescriptorProtos$EnumDescriptorProto) this.instance).getReservedName(i10);
        }

        @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$EnumDescriptorProtoOrBuilder
        public j getReservedNameBytes(int i10) {
            return ((DescriptorProtos$EnumDescriptorProto) this.instance).getReservedNameBytes(i10);
        }

        @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$EnumDescriptorProtoOrBuilder
        public int getReservedNameCount() {
            return ((DescriptorProtos$EnumDescriptorProto) this.instance).getReservedNameCount();
        }

        @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$EnumDescriptorProtoOrBuilder
        public List<String> getReservedNameList() {
            return Collections.unmodifiableList(((DescriptorProtos$EnumDescriptorProto) this.instance).getReservedNameList());
        }

        @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$EnumDescriptorProtoOrBuilder
        public EnumReservedRange getReservedRange(int i10) {
            return ((DescriptorProtos$EnumDescriptorProto) this.instance).getReservedRange(i10);
        }

        @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$EnumDescriptorProtoOrBuilder
        public int getReservedRangeCount() {
            return ((DescriptorProtos$EnumDescriptorProto) this.instance).getReservedRangeCount();
        }

        @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$EnumDescriptorProtoOrBuilder
        public List<EnumReservedRange> getReservedRangeList() {
            return Collections.unmodifiableList(((DescriptorProtos$EnumDescriptorProto) this.instance).getReservedRangeList());
        }

        @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$EnumDescriptorProtoOrBuilder
        public DescriptorProtos$EnumValueDescriptorProto getValue(int i10) {
            return ((DescriptorProtos$EnumDescriptorProto) this.instance).getValue(i10);
        }

        @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$EnumDescriptorProtoOrBuilder
        public int getValueCount() {
            return ((DescriptorProtos$EnumDescriptorProto) this.instance).getValueCount();
        }

        @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$EnumDescriptorProtoOrBuilder
        public List<DescriptorProtos$EnumValueDescriptorProto> getValueList() {
            return Collections.unmodifiableList(((DescriptorProtos$EnumDescriptorProto) this.instance).getValueList());
        }

        @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$EnumDescriptorProtoOrBuilder
        public boolean hasName() {
            return ((DescriptorProtos$EnumDescriptorProto) this.instance).hasName();
        }

        @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$EnumDescriptorProtoOrBuilder
        public boolean hasOptions() {
            return ((DescriptorProtos$EnumDescriptorProto) this.instance).hasOptions();
        }

        public Builder mergeOptions(DescriptorProtos$EnumOptions descriptorProtos$EnumOptions) {
            copyOnWrite();
            ((DescriptorProtos$EnumDescriptorProto) this.instance).mergeOptions(descriptorProtos$EnumOptions);
            return this;
        }

        public Builder removeReservedRange(int i10) {
            copyOnWrite();
            ((DescriptorProtos$EnumDescriptorProto) this.instance).removeReservedRange(i10);
            return this;
        }

        public Builder removeValue(int i10) {
            copyOnWrite();
            ((DescriptorProtos$EnumDescriptorProto) this.instance).removeValue(i10);
            return this;
        }

        public Builder setName(String str) {
            copyOnWrite();
            ((DescriptorProtos$EnumDescriptorProto) this.instance).setName(str);
            return this;
        }

        public Builder setNameBytes(j jVar) {
            copyOnWrite();
            ((DescriptorProtos$EnumDescriptorProto) this.instance).setNameBytes(jVar);
            return this;
        }

        public Builder setOptions(DescriptorProtos$EnumOptions descriptorProtos$EnumOptions) {
            copyOnWrite();
            ((DescriptorProtos$EnumDescriptorProto) this.instance).setOptions(descriptorProtos$EnumOptions);
            return this;
        }

        public Builder setReservedName(int i10, String str) {
            copyOnWrite();
            ((DescriptorProtos$EnumDescriptorProto) this.instance).setReservedName(i10, str);
            return this;
        }

        public Builder setReservedRange(int i10, EnumReservedRange enumReservedRange) {
            copyOnWrite();
            ((DescriptorProtos$EnumDescriptorProto) this.instance).setReservedRange(i10, enumReservedRange);
            return this;
        }

        public Builder setValue(int i10, DescriptorProtos$EnumValueDescriptorProto descriptorProtos$EnumValueDescriptorProto) {
            copyOnWrite();
            ((DescriptorProtos$EnumDescriptorProto) this.instance).setValue(i10, descriptorProtos$EnumValueDescriptorProto);
            return this;
        }

        private Builder() {
            super(DescriptorProtos$EnumDescriptorProto.DEFAULT_INSTANCE);
        }

        public Builder addReservedRange(int i10, EnumReservedRange enumReservedRange) {
            copyOnWrite();
            ((DescriptorProtos$EnumDescriptorProto) this.instance).addReservedRange(i10, enumReservedRange);
            return this;
        }

        public Builder addValue(int i10, DescriptorProtos$EnumValueDescriptorProto descriptorProtos$EnumValueDescriptorProto) {
            copyOnWrite();
            ((DescriptorProtos$EnumDescriptorProto) this.instance).addValue(i10, descriptorProtos$EnumValueDescriptorProto);
            return this;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public Builder setOptions(DescriptorProtos$EnumOptions.Builder builder) {
            copyOnWrite();
            ((DescriptorProtos$EnumDescriptorProto) this.instance).setOptions((DescriptorProtos$EnumOptions) builder.build());
            return this;
        }

        public Builder setReservedRange(int i10, EnumReservedRange.Builder builder) {
            copyOnWrite();
            ((DescriptorProtos$EnumDescriptorProto) this.instance).setReservedRange(i10, builder.build());
            return this;
        }

        public Builder setValue(int i10, DescriptorProtos$EnumValueDescriptorProto.Builder builder) {
            copyOnWrite();
            ((DescriptorProtos$EnumDescriptorProto) this.instance).setValue(i10, builder.build());
            return this;
        }

        public Builder addReservedRange(EnumReservedRange.Builder builder) {
            copyOnWrite();
            ((DescriptorProtos$EnumDescriptorProto) this.instance).addReservedRange(builder.build());
            return this;
        }

        public Builder addValue(DescriptorProtos$EnumValueDescriptorProto.Builder builder) {
            copyOnWrite();
            ((DescriptorProtos$EnumDescriptorProto) this.instance).addValue(builder.build());
            return this;
        }

        public Builder addReservedRange(int i10, EnumReservedRange.Builder builder) {
            copyOnWrite();
            ((DescriptorProtos$EnumDescriptorProto) this.instance).addReservedRange(i10, builder.build());
            return this;
        }

        public Builder addValue(int i10, DescriptorProtos$EnumValueDescriptorProto.Builder builder) {
            copyOnWrite();
            ((DescriptorProtos$EnumDescriptorProto) this.instance).addValue(i10, builder.build());
            return this;
        }
    }

    public static final class EnumReservedRange extends GeneratedMessageLite<EnumReservedRange, Builder> implements EnumReservedRangeOrBuilder {
        private static final EnumReservedRange DEFAULT_INSTANCE;
        public static final int END_FIELD_NUMBER = 2;
        private static volatile h1<EnumReservedRange> PARSER = null;
        public static final int START_FIELD_NUMBER = 1;
        private int bitField0_;
        private int end_;
        private int start_;

        public static final class Builder extends GeneratedMessageLite.Builder<EnumReservedRange, Builder> implements EnumReservedRangeOrBuilder {
            public Builder clearEnd() {
                copyOnWrite();
                ((EnumReservedRange) this.instance).clearEnd();
                return this;
            }

            public Builder clearStart() {
                copyOnWrite();
                ((EnumReservedRange) this.instance).clearStart();
                return this;
            }

            @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$EnumDescriptorProto.EnumReservedRangeOrBuilder
            public int getEnd() {
                return ((EnumReservedRange) this.instance).getEnd();
            }

            @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$EnumDescriptorProto.EnumReservedRangeOrBuilder
            public int getStart() {
                return ((EnumReservedRange) this.instance).getStart();
            }

            @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$EnumDescriptorProto.EnumReservedRangeOrBuilder
            public boolean hasEnd() {
                return ((EnumReservedRange) this.instance).hasEnd();
            }

            @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$EnumDescriptorProto.EnumReservedRangeOrBuilder
            public boolean hasStart() {
                return ((EnumReservedRange) this.instance).hasStart();
            }

            public Builder setEnd(int i10) {
                copyOnWrite();
                ((EnumReservedRange) this.instance).setEnd(i10);
                return this;
            }

            public Builder setStart(int i10) {
                copyOnWrite();
                ((EnumReservedRange) this.instance).setStart(i10);
                return this;
            }

            private Builder() {
                super(EnumReservedRange.DEFAULT_INSTANCE);
            }
        }

        static {
            EnumReservedRange enumReservedRange = new EnumReservedRange();
            DEFAULT_INSTANCE = enumReservedRange;
            GeneratedMessageLite.registerDefaultInstance(EnumReservedRange.class, enumReservedRange);
        }

        private EnumReservedRange() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearEnd() {
            this.bitField0_ &= -3;
            this.end_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearStart() {
            this.bitField0_ &= -2;
            this.start_ = 0;
        }

        public static EnumReservedRange getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static EnumReservedRange parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (EnumReservedRange) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static EnumReservedRange parseFrom(ByteBuffer byteBuffer) throws e0 {
            return (EnumReservedRange) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static h1<EnumReservedRange> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setEnd(int i10) {
            this.bitField0_ |= 2;
            this.end_ = i10;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setStart(int i10) {
            this.bitField0_ |= 1;
            this.start_ = i10;
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
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001င\u0000\u0002င\u0001", new Object[]{"bitField0_", "start_", "end_"});
                case 3:
                    return new EnumReservedRange();
                case 4:
                    return new Builder();
                case 5:
                    return DEFAULT_INSTANCE;
                case 6:
                    h1<EnumReservedRange> h1Var = PARSER;
                    if (h1Var != null) {
                        return h1Var;
                    }
                    synchronized (EnumReservedRange.class) {
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

        @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$EnumDescriptorProto.EnumReservedRangeOrBuilder
        public int getEnd() {
            return this.end_;
        }

        @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$EnumDescriptorProto.EnumReservedRangeOrBuilder
        public int getStart() {
            return this.start_;
        }

        @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$EnumDescriptorProto.EnumReservedRangeOrBuilder
        public boolean hasEnd() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$EnumDescriptorProto.EnumReservedRangeOrBuilder
        public boolean hasStart() {
            return (this.bitField0_ & 1) != 0;
        }

        public static Builder newBuilder(EnumReservedRange enumReservedRange) {
            return DEFAULT_INSTANCE.createBuilder(enumReservedRange);
        }

        public static EnumReservedRange parseDelimitedFrom(InputStream inputStream, t tVar) throws IOException {
            return (EnumReservedRange) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, tVar);
        }

        public static EnumReservedRange parseFrom(ByteBuffer byteBuffer, t tVar) throws e0 {
            return (EnumReservedRange) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, tVar);
        }

        public static EnumReservedRange parseFrom(j jVar) throws e0 {
            return (EnumReservedRange) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, jVar);
        }

        public static EnumReservedRange parseFrom(j jVar, t tVar) throws e0 {
            return (EnumReservedRange) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, jVar, tVar);
        }

        public static EnumReservedRange parseFrom(byte[] bArr) throws e0 {
            return (EnumReservedRange) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static EnumReservedRange parseFrom(byte[] bArr, t tVar) throws e0 {
            return (EnumReservedRange) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, tVar);
        }

        public static EnumReservedRange parseFrom(InputStream inputStream) throws IOException {
            return (EnumReservedRange) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static EnumReservedRange parseFrom(InputStream inputStream, t tVar) throws IOException {
            return (EnumReservedRange) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, tVar);
        }

        public static EnumReservedRange parseFrom(k kVar) throws IOException {
            return (EnumReservedRange) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, kVar);
        }

        public static EnumReservedRange parseFrom(k kVar, t tVar) throws IOException {
            return (EnumReservedRange) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, kVar, tVar);
        }
    }

    public interface EnumReservedRangeOrBuilder extends w0 {
        /* synthetic */ MessageLite getDefaultInstanceForType();

        int getEnd();

        int getStart();

        boolean hasEnd();

        boolean hasStart();

        @Override // androidx.datastore.preferences.protobuf.w0
        /* synthetic */ boolean isInitialized();
    }

    static {
        DescriptorProtos$EnumDescriptorProto descriptorProtos$EnumDescriptorProto = new DescriptorProtos$EnumDescriptorProto();
        DEFAULT_INSTANCE = descriptorProtos$EnumDescriptorProto;
        GeneratedMessageLite.registerDefaultInstance(DescriptorProtos$EnumDescriptorProto.class, descriptorProtos$EnumDescriptorProto);
    }

    private DescriptorProtos$EnumDescriptorProto() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllReservedName(Iterable<String> iterable) {
        ensureReservedNameIsMutable();
        AbstractMessageLite.addAll(iterable, this.reservedName_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllReservedRange(Iterable<? extends EnumReservedRange> iterable) {
        ensureReservedRangeIsMutable();
        AbstractMessageLite.addAll(iterable, this.reservedRange_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllValue(Iterable<? extends DescriptorProtos$EnumValueDescriptorProto> iterable) {
        ensureValueIsMutable();
        AbstractMessageLite.addAll(iterable, this.value_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addReservedName(String str) {
        str.getClass();
        ensureReservedNameIsMutable();
        this.reservedName_.add(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addReservedNameBytes(j jVar) {
        ensureReservedNameIsMutable();
        this.reservedName_.add(jVar.n());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addReservedRange(EnumReservedRange enumReservedRange) {
        enumReservedRange.getClass();
        ensureReservedRangeIsMutable();
        this.reservedRange_.add(enumReservedRange);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addValue(DescriptorProtos$EnumValueDescriptorProto descriptorProtos$EnumValueDescriptorProto) {
        descriptorProtos$EnumValueDescriptorProto.getClass();
        ensureValueIsMutable();
        this.value_.add(descriptorProtos$EnumValueDescriptorProto);
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

    /* JADX INFO: Access modifiers changed from: private */
    public void clearReservedName() {
        this.reservedName_ = GeneratedMessageLite.emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearReservedRange() {
        this.reservedRange_ = GeneratedMessageLite.emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearValue() {
        this.value_ = GeneratedMessageLite.emptyProtobufList();
    }

    private void ensureReservedNameIsMutable() {
        d0.j<String> jVar = this.reservedName_;
        if (jVar.isModifiable()) {
            return;
        }
        this.reservedName_ = GeneratedMessageLite.mutableCopy(jVar);
    }

    private void ensureReservedRangeIsMutable() {
        d0.j<EnumReservedRange> jVar = this.reservedRange_;
        if (jVar.isModifiable()) {
            return;
        }
        this.reservedRange_ = GeneratedMessageLite.mutableCopy(jVar);
    }

    private void ensureValueIsMutable() {
        d0.j<DescriptorProtos$EnumValueDescriptorProto> jVar = this.value_;
        if (jVar.isModifiable()) {
            return;
        }
        this.value_ = GeneratedMessageLite.mutableCopy(jVar);
    }

    public static DescriptorProtos$EnumDescriptorProto getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public void mergeOptions(DescriptorProtos$EnumOptions descriptorProtos$EnumOptions) {
        descriptorProtos$EnumOptions.getClass();
        DescriptorProtos$EnumOptions descriptorProtos$EnumOptions2 = this.options_;
        if (descriptorProtos$EnumOptions2 == null || descriptorProtos$EnumOptions2 == DescriptorProtos$EnumOptions.getDefaultInstance()) {
            this.options_ = descriptorProtos$EnumOptions;
        } else {
            this.options_ = ((DescriptorProtos$EnumOptions.Builder) DescriptorProtos$EnumOptions.newBuilder(this.options_).mergeFrom((DescriptorProtos$EnumOptions.Builder) descriptorProtos$EnumOptions)).buildPartial();
        }
        this.bitField0_ |= 2;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static DescriptorProtos$EnumDescriptorProto parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (DescriptorProtos$EnumDescriptorProto) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static DescriptorProtos$EnumDescriptorProto parseFrom(ByteBuffer byteBuffer) throws e0 {
        return (DescriptorProtos$EnumDescriptorProto) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static h1<DescriptorProtos$EnumDescriptorProto> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeReservedRange(int i10) {
        ensureReservedRangeIsMutable();
        this.reservedRange_.remove(i10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeValue(int i10) {
        ensureValueIsMutable();
        this.value_.remove(i10);
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
    public void setOptions(DescriptorProtos$EnumOptions descriptorProtos$EnumOptions) {
        descriptorProtos$EnumOptions.getClass();
        this.options_ = descriptorProtos$EnumOptions;
        this.bitField0_ |= 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setReservedName(int i10, String str) {
        str.getClass();
        ensureReservedNameIsMutable();
        this.reservedName_.set(i10, str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setReservedRange(int i10, EnumReservedRange enumReservedRange) {
        enumReservedRange.getClass();
        ensureReservedRangeIsMutable();
        this.reservedRange_.set(i10, enumReservedRange);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setValue(int i10, DescriptorProtos$EnumValueDescriptorProto descriptorProtos$EnumValueDescriptorProto) {
        descriptorProtos$EnumValueDescriptorProto.getClass();
        ensureValueIsMutable();
        this.value_.set(i10, descriptorProtos$EnumValueDescriptorProto);
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
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0003\u0002\u0001ဈ\u0000\u0002Л\u0003ᐉ\u0001\u0004\u001b\u0005\u001a", new Object[]{"bitField0_", "name_", "value_", DescriptorProtos$EnumValueDescriptorProto.class, "options_", "reservedRange_", EnumReservedRange.class, "reservedName_"});
            case 3:
                return new DescriptorProtos$EnumDescriptorProto();
            case 4:
                return new Builder();
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                h1<DescriptorProtos$EnumDescriptorProto> h1Var = PARSER;
                if (h1Var != null) {
                    return h1Var;
                }
                synchronized (DescriptorProtos$EnumDescriptorProto.class) {
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

    @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$EnumDescriptorProtoOrBuilder
    public String getName() {
        return this.name_;
    }

    @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$EnumDescriptorProtoOrBuilder
    public j getNameBytes() {
        return j.d(this.name_);
    }

    @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$EnumDescriptorProtoOrBuilder
    public DescriptorProtos$EnumOptions getOptions() {
        DescriptorProtos$EnumOptions descriptorProtos$EnumOptions = this.options_;
        return descriptorProtos$EnumOptions == null ? DescriptorProtos$EnumOptions.getDefaultInstance() : descriptorProtos$EnumOptions;
    }

    @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$EnumDescriptorProtoOrBuilder
    public String getReservedName(int i10) {
        return this.reservedName_.get(i10);
    }

    @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$EnumDescriptorProtoOrBuilder
    public j getReservedNameBytes(int i10) {
        return j.d(this.reservedName_.get(i10));
    }

    @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$EnumDescriptorProtoOrBuilder
    public int getReservedNameCount() {
        return this.reservedName_.size();
    }

    @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$EnumDescriptorProtoOrBuilder
    public List<String> getReservedNameList() {
        return this.reservedName_;
    }

    @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$EnumDescriptorProtoOrBuilder
    public EnumReservedRange getReservedRange(int i10) {
        return this.reservedRange_.get(i10);
    }

    @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$EnumDescriptorProtoOrBuilder
    public int getReservedRangeCount() {
        return this.reservedRange_.size();
    }

    @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$EnumDescriptorProtoOrBuilder
    public List<EnumReservedRange> getReservedRangeList() {
        return this.reservedRange_;
    }

    public EnumReservedRangeOrBuilder getReservedRangeOrBuilder(int i10) {
        return this.reservedRange_.get(i10);
    }

    public List<? extends EnumReservedRangeOrBuilder> getReservedRangeOrBuilderList() {
        return this.reservedRange_;
    }

    @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$EnumDescriptorProtoOrBuilder
    public DescriptorProtos$EnumValueDescriptorProto getValue(int i10) {
        return this.value_.get(i10);
    }

    @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$EnumDescriptorProtoOrBuilder
    public int getValueCount() {
        return this.value_.size();
    }

    @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$EnumDescriptorProtoOrBuilder
    public List<DescriptorProtos$EnumValueDescriptorProto> getValueList() {
        return this.value_;
    }

    public DescriptorProtos$EnumValueDescriptorProtoOrBuilder getValueOrBuilder(int i10) {
        return this.value_.get(i10);
    }

    public List<? extends DescriptorProtos$EnumValueDescriptorProtoOrBuilder> getValueOrBuilderList() {
        return this.value_;
    }

    @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$EnumDescriptorProtoOrBuilder
    public boolean hasName() {
        return (this.bitField0_ & 1) != 0;
    }

    @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$EnumDescriptorProtoOrBuilder
    public boolean hasOptions() {
        return (this.bitField0_ & 2) != 0;
    }

    public static Builder newBuilder(DescriptorProtos$EnumDescriptorProto descriptorProtos$EnumDescriptorProto) {
        return DEFAULT_INSTANCE.createBuilder(descriptorProtos$EnumDescriptorProto);
    }

    public static DescriptorProtos$EnumDescriptorProto parseDelimitedFrom(InputStream inputStream, t tVar) throws IOException {
        return (DescriptorProtos$EnumDescriptorProto) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, tVar);
    }

    public static DescriptorProtos$EnumDescriptorProto parseFrom(ByteBuffer byteBuffer, t tVar) throws e0 {
        return (DescriptorProtos$EnumDescriptorProto) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, tVar);
    }

    public static DescriptorProtos$EnumDescriptorProto parseFrom(j jVar) throws e0 {
        return (DescriptorProtos$EnumDescriptorProto) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, jVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addReservedRange(int i10, EnumReservedRange enumReservedRange) {
        enumReservedRange.getClass();
        ensureReservedRangeIsMutable();
        this.reservedRange_.add(i10, enumReservedRange);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addValue(int i10, DescriptorProtos$EnumValueDescriptorProto descriptorProtos$EnumValueDescriptorProto) {
        descriptorProtos$EnumValueDescriptorProto.getClass();
        ensureValueIsMutable();
        this.value_.add(i10, descriptorProtos$EnumValueDescriptorProto);
    }

    public static DescriptorProtos$EnumDescriptorProto parseFrom(j jVar, t tVar) throws e0 {
        return (DescriptorProtos$EnumDescriptorProto) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, jVar, tVar);
    }

    public static DescriptorProtos$EnumDescriptorProto parseFrom(byte[] bArr) throws e0 {
        return (DescriptorProtos$EnumDescriptorProto) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static DescriptorProtos$EnumDescriptorProto parseFrom(byte[] bArr, t tVar) throws e0 {
        return (DescriptorProtos$EnumDescriptorProto) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, tVar);
    }

    public static DescriptorProtos$EnumDescriptorProto parseFrom(InputStream inputStream) throws IOException {
        return (DescriptorProtos$EnumDescriptorProto) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static DescriptorProtos$EnumDescriptorProto parseFrom(InputStream inputStream, t tVar) throws IOException {
        return (DescriptorProtos$EnumDescriptorProto) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, tVar);
    }

    public static DescriptorProtos$EnumDescriptorProto parseFrom(k kVar) throws IOException {
        return (DescriptorProtos$EnumDescriptorProto) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, kVar);
    }

    public static DescriptorProtos$EnumDescriptorProto parseFrom(k kVar, t tVar) throws IOException {
        return (DescriptorProtos$EnumDescriptorProto) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, kVar, tVar);
    }
}
