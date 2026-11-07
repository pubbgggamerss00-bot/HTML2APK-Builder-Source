package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.GeneratedMessageLite;
import androidx.datastore.preferences.protobuf.Option;
import androidx.datastore.preferences.protobuf.d0;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public final class Field extends GeneratedMessageLite<Field, Builder> implements FieldOrBuilder {
    public static final int CARDINALITY_FIELD_NUMBER = 2;
    private static final Field DEFAULT_INSTANCE;
    public static final int DEFAULT_VALUE_FIELD_NUMBER = 11;
    public static final int JSON_NAME_FIELD_NUMBER = 10;
    public static final int KIND_FIELD_NUMBER = 1;
    public static final int NAME_FIELD_NUMBER = 4;
    public static final int NUMBER_FIELD_NUMBER = 3;
    public static final int ONEOF_INDEX_FIELD_NUMBER = 7;
    public static final int OPTIONS_FIELD_NUMBER = 9;
    public static final int PACKED_FIELD_NUMBER = 8;
    private static volatile h1<Field> PARSER = null;
    public static final int TYPE_URL_FIELD_NUMBER = 6;
    private int cardinality_;
    private int kind_;
    private int number_;
    private int oneofIndex_;
    private boolean packed_;
    private String name_ = "";
    private String typeUrl_ = "";
    private d0.j<Option> options_ = GeneratedMessageLite.emptyProtobufList();
    private String jsonName_ = "";
    private String defaultValue_ = "";

    public static final class Builder extends GeneratedMessageLite.Builder<Field, Builder> implements FieldOrBuilder {
        public Builder addAllOptions(Iterable<? extends Option> iterable) {
            copyOnWrite();
            ((Field) this.instance).addAllOptions(iterable);
            return this;
        }

        public Builder addOptions(Option option) {
            copyOnWrite();
            ((Field) this.instance).addOptions(option);
            return this;
        }

        public Builder clearCardinality() {
            copyOnWrite();
            ((Field) this.instance).clearCardinality();
            return this;
        }

        public Builder clearDefaultValue() {
            copyOnWrite();
            ((Field) this.instance).clearDefaultValue();
            return this;
        }

        public Builder clearJsonName() {
            copyOnWrite();
            ((Field) this.instance).clearJsonName();
            return this;
        }

        public Builder clearKind() {
            copyOnWrite();
            ((Field) this.instance).clearKind();
            return this;
        }

        public Builder clearName() {
            copyOnWrite();
            ((Field) this.instance).clearName();
            return this;
        }

        public Builder clearNumber() {
            copyOnWrite();
            ((Field) this.instance).clearNumber();
            return this;
        }

        public Builder clearOneofIndex() {
            copyOnWrite();
            ((Field) this.instance).clearOneofIndex();
            return this;
        }

        public Builder clearOptions() {
            copyOnWrite();
            ((Field) this.instance).clearOptions();
            return this;
        }

        public Builder clearPacked() {
            copyOnWrite();
            ((Field) this.instance).clearPacked();
            return this;
        }

        public Builder clearTypeUrl() {
            copyOnWrite();
            ((Field) this.instance).clearTypeUrl();
            return this;
        }

        @Override // androidx.datastore.preferences.protobuf.FieldOrBuilder
        public b getCardinality() {
            return ((Field) this.instance).getCardinality();
        }

        @Override // androidx.datastore.preferences.protobuf.FieldOrBuilder
        public int getCardinalityValue() {
            return ((Field) this.instance).getCardinalityValue();
        }

        @Override // androidx.datastore.preferences.protobuf.FieldOrBuilder
        public String getDefaultValue() {
            return ((Field) this.instance).getDefaultValue();
        }

        @Override // androidx.datastore.preferences.protobuf.FieldOrBuilder
        public j getDefaultValueBytes() {
            return ((Field) this.instance).getDefaultValueBytes();
        }

        @Override // androidx.datastore.preferences.protobuf.FieldOrBuilder
        public String getJsonName() {
            return ((Field) this.instance).getJsonName();
        }

        @Override // androidx.datastore.preferences.protobuf.FieldOrBuilder
        public j getJsonNameBytes() {
            return ((Field) this.instance).getJsonNameBytes();
        }

        @Override // androidx.datastore.preferences.protobuf.FieldOrBuilder
        public c getKind() {
            return ((Field) this.instance).getKind();
        }

        @Override // androidx.datastore.preferences.protobuf.FieldOrBuilder
        public int getKindValue() {
            return ((Field) this.instance).getKindValue();
        }

        @Override // androidx.datastore.preferences.protobuf.FieldOrBuilder
        public String getName() {
            return ((Field) this.instance).getName();
        }

        @Override // androidx.datastore.preferences.protobuf.FieldOrBuilder
        public j getNameBytes() {
            return ((Field) this.instance).getNameBytes();
        }

        @Override // androidx.datastore.preferences.protobuf.FieldOrBuilder
        public int getNumber() {
            return ((Field) this.instance).getNumber();
        }

        @Override // androidx.datastore.preferences.protobuf.FieldOrBuilder
        public int getOneofIndex() {
            return ((Field) this.instance).getOneofIndex();
        }

        @Override // androidx.datastore.preferences.protobuf.FieldOrBuilder
        public Option getOptions(int i10) {
            return ((Field) this.instance).getOptions(i10);
        }

        @Override // androidx.datastore.preferences.protobuf.FieldOrBuilder
        public int getOptionsCount() {
            return ((Field) this.instance).getOptionsCount();
        }

        @Override // androidx.datastore.preferences.protobuf.FieldOrBuilder
        public List<Option> getOptionsList() {
            return Collections.unmodifiableList(((Field) this.instance).getOptionsList());
        }

        @Override // androidx.datastore.preferences.protobuf.FieldOrBuilder
        public boolean getPacked() {
            return ((Field) this.instance).getPacked();
        }

        @Override // androidx.datastore.preferences.protobuf.FieldOrBuilder
        public String getTypeUrl() {
            return ((Field) this.instance).getTypeUrl();
        }

        @Override // androidx.datastore.preferences.protobuf.FieldOrBuilder
        public j getTypeUrlBytes() {
            return ((Field) this.instance).getTypeUrlBytes();
        }

        public Builder removeOptions(int i10) {
            copyOnWrite();
            ((Field) this.instance).removeOptions(i10);
            return this;
        }

        public Builder setCardinality(b bVar) {
            copyOnWrite();
            ((Field) this.instance).setCardinality(bVar);
            return this;
        }

        public Builder setCardinalityValue(int i10) {
            copyOnWrite();
            ((Field) this.instance).setCardinalityValue(i10);
            return this;
        }

        public Builder setDefaultValue(String str) {
            copyOnWrite();
            ((Field) this.instance).setDefaultValue(str);
            return this;
        }

        public Builder setDefaultValueBytes(j jVar) throws IllegalArgumentException {
            copyOnWrite();
            ((Field) this.instance).setDefaultValueBytes(jVar);
            return this;
        }

        public Builder setJsonName(String str) {
            copyOnWrite();
            ((Field) this.instance).setJsonName(str);
            return this;
        }

        public Builder setJsonNameBytes(j jVar) throws IllegalArgumentException {
            copyOnWrite();
            ((Field) this.instance).setJsonNameBytes(jVar);
            return this;
        }

        public Builder setKind(c cVar) {
            copyOnWrite();
            ((Field) this.instance).setKind(cVar);
            return this;
        }

        public Builder setKindValue(int i10) {
            copyOnWrite();
            ((Field) this.instance).setKindValue(i10);
            return this;
        }

        public Builder setName(String str) {
            copyOnWrite();
            ((Field) this.instance).setName(str);
            return this;
        }

        public Builder setNameBytes(j jVar) throws IllegalArgumentException {
            copyOnWrite();
            ((Field) this.instance).setNameBytes(jVar);
            return this;
        }

        public Builder setNumber(int i10) {
            copyOnWrite();
            ((Field) this.instance).setNumber(i10);
            return this;
        }

        public Builder setOneofIndex(int i10) {
            copyOnWrite();
            ((Field) this.instance).setOneofIndex(i10);
            return this;
        }

        public Builder setOptions(int i10, Option option) {
            copyOnWrite();
            ((Field) this.instance).setOptions(i10, option);
            return this;
        }

        public Builder setPacked(boolean z10) {
            copyOnWrite();
            ((Field) this.instance).setPacked(z10);
            return this;
        }

        public Builder setTypeUrl(String str) {
            copyOnWrite();
            ((Field) this.instance).setTypeUrl(str);
            return this;
        }

        public Builder setTypeUrlBytes(j jVar) throws IllegalArgumentException {
            copyOnWrite();
            ((Field) this.instance).setTypeUrlBytes(jVar);
            return this;
        }

        private Builder() {
            super(Field.DEFAULT_INSTANCE);
        }

        public Builder addOptions(int i10, Option option) {
            copyOnWrite();
            ((Field) this.instance).addOptions(i10, option);
            return this;
        }

        public Builder setOptions(int i10, Option.Builder builder) {
            copyOnWrite();
            ((Field) this.instance).setOptions(i10, builder.build());
            return this;
        }

        public Builder addOptions(Option.Builder builder) {
            copyOnWrite();
            ((Field) this.instance).addOptions(builder.build());
            return this;
        }

        public Builder addOptions(int i10, Option.Builder builder) {
            copyOnWrite();
            ((Field) this.instance).addOptions(i10, builder.build());
            return this;
        }
    }

    public enum b implements d0.c {
        CARDINALITY_UNKNOWN(0),
        CARDINALITY_OPTIONAL(1),
        CARDINALITY_REQUIRED(2),
        CARDINALITY_REPEATED(3),
        UNRECOGNIZED(-1);


        /* renamed from: a, reason: collision with root package name */
        public final int f1893a;

        b(int i10) {
            this.f1893a = i10;
        }

        @Override // androidx.datastore.preferences.protobuf.d0.c
        public final int getNumber() {
            if (this != UNRECOGNIZED) {
                return this.f1893a;
            }
            throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
        }
    }

    public enum c implements d0.c {
        TYPE_UNKNOWN(0),
        TYPE_DOUBLE(1),
        TYPE_FLOAT(2),
        TYPE_INT64(3),
        TYPE_UINT64(4),
        TYPE_INT32(5),
        TYPE_FIXED64(6),
        TYPE_FIXED32(7),
        TYPE_BOOL(8),
        TYPE_STRING(9),
        TYPE_GROUP(10),
        TYPE_MESSAGE(11),
        TYPE_BYTES(12),
        TYPE_UINT32(13),
        TYPE_ENUM(14),
        TYPE_SFIXED32(15),
        TYPE_SFIXED64(16),
        TYPE_SINT32(17),
        TYPE_SINT64(18),
        UNRECOGNIZED(-1);


        /* renamed from: a, reason: collision with root package name */
        public final int f1915a;

        c(int i10) {
            this.f1915a = i10;
        }

        @Override // androidx.datastore.preferences.protobuf.d0.c
        public final int getNumber() {
            if (this != UNRECOGNIZED) {
                return this.f1915a;
            }
            throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
        }
    }

    static {
        Field field = new Field();
        DEFAULT_INSTANCE = field;
        GeneratedMessageLite.registerDefaultInstance(Field.class, field);
    }

    private Field() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllOptions(Iterable<? extends Option> iterable) {
        ensureOptionsIsMutable();
        AbstractMessageLite.addAll(iterable, this.options_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addOptions(Option option) {
        option.getClass();
        ensureOptionsIsMutable();
        this.options_.add(option);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearCardinality() {
        this.cardinality_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDefaultValue() {
        this.defaultValue_ = getDefaultInstance().getDefaultValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearJsonName() {
        this.jsonName_ = getDefaultInstance().getJsonName();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearKind() {
        this.kind_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearName() {
        this.name_ = getDefaultInstance().getName();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearNumber() {
        this.number_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearOneofIndex() {
        this.oneofIndex_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearOptions() {
        this.options_ = GeneratedMessageLite.emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPacked() {
        this.packed_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTypeUrl() {
        this.typeUrl_ = getDefaultInstance().getTypeUrl();
    }

    private void ensureOptionsIsMutable() {
        d0.j<Option> jVar = this.options_;
        if (jVar.isModifiable()) {
            return;
        }
        this.options_ = GeneratedMessageLite.mutableCopy(jVar);
    }

    public static Field getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static Field parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (Field) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Field parseFrom(ByteBuffer byteBuffer) throws e0 {
        return (Field) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static h1<Field> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeOptions(int i10) {
        ensureOptionsIsMutable();
        this.options_.remove(i10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCardinality(b bVar) {
        this.cardinality_ = bVar.getNumber();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCardinalityValue(int i10) {
        this.cardinality_ = i10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDefaultValue(String str) {
        str.getClass();
        this.defaultValue_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDefaultValueBytes(j jVar) throws IllegalArgumentException {
        AbstractMessageLite.checkByteStringIsUtf8(jVar);
        this.defaultValue_ = jVar.n();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setJsonName(String str) {
        str.getClass();
        this.jsonName_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setJsonNameBytes(j jVar) throws IllegalArgumentException {
        AbstractMessageLite.checkByteStringIsUtf8(jVar);
        this.jsonName_ = jVar.n();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setKind(c cVar) {
        this.kind_ = cVar.getNumber();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setKindValue(int i10) {
        this.kind_ = i10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setName(String str) {
        str.getClass();
        this.name_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setNameBytes(j jVar) throws IllegalArgumentException {
        AbstractMessageLite.checkByteStringIsUtf8(jVar);
        this.name_ = jVar.n();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setNumber(int i10) {
        this.number_ = i10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setOneofIndex(int i10) {
        this.oneofIndex_ = i10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setOptions(int i10, Option option) {
        option.getClass();
        ensureOptionsIsMutable();
        this.options_.set(i10, option);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPacked(boolean z10) {
        this.packed_ = z10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTypeUrl(String str) {
        str.getClass();
        this.typeUrl_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTypeUrlBytes(j jVar) throws IllegalArgumentException {
        AbstractMessageLite.checkByteStringIsUtf8(jVar);
        this.typeUrl_ = jVar.n();
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
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\n\u0000\u0000\u0001\u000b\n\u0000\u0001\u0000\u0001\f\u0002\f\u0003\u0004\u0004Ȉ\u0006Ȉ\u0007\u0004\b\u0007\t\u001b\nȈ\u000bȈ", new Object[]{"kind_", "cardinality_", "number_", "name_", "typeUrl_", "oneofIndex_", "packed_", "options_", Option.class, "jsonName_", "defaultValue_"});
            case 3:
                return new Field();
            case 4:
                return new Builder();
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                h1<Field> h1Var = PARSER;
                if (h1Var != null) {
                    return h1Var;
                }
                synchronized (Field.class) {
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

    @Override // androidx.datastore.preferences.protobuf.FieldOrBuilder
    public b getCardinality() {
        int i10 = this.cardinality_;
        b bVar = i10 != 0 ? i10 != 1 ? i10 != 2 ? i10 != 3 ? null : b.CARDINALITY_REPEATED : b.CARDINALITY_REQUIRED : b.CARDINALITY_OPTIONAL : b.CARDINALITY_UNKNOWN;
        return bVar == null ? b.UNRECOGNIZED : bVar;
    }

    @Override // androidx.datastore.preferences.protobuf.FieldOrBuilder
    public int getCardinalityValue() {
        return this.cardinality_;
    }

    @Override // androidx.datastore.preferences.protobuf.FieldOrBuilder
    public String getDefaultValue() {
        return this.defaultValue_;
    }

    @Override // androidx.datastore.preferences.protobuf.FieldOrBuilder
    public j getDefaultValueBytes() {
        return j.d(this.defaultValue_);
    }

    @Override // androidx.datastore.preferences.protobuf.FieldOrBuilder
    public String getJsonName() {
        return this.jsonName_;
    }

    @Override // androidx.datastore.preferences.protobuf.FieldOrBuilder
    public j getJsonNameBytes() {
        return j.d(this.jsonName_);
    }

    @Override // androidx.datastore.preferences.protobuf.FieldOrBuilder
    public c getKind() {
        c cVar;
        switch (this.kind_) {
            case 0:
                cVar = c.TYPE_UNKNOWN;
                break;
            case 1:
                cVar = c.TYPE_DOUBLE;
                break;
            case 2:
                cVar = c.TYPE_FLOAT;
                break;
            case 3:
                cVar = c.TYPE_INT64;
                break;
            case 4:
                cVar = c.TYPE_UINT64;
                break;
            case 5:
                cVar = c.TYPE_INT32;
                break;
            case 6:
                cVar = c.TYPE_FIXED64;
                break;
            case 7:
                cVar = c.TYPE_FIXED32;
                break;
            case 8:
                cVar = c.TYPE_BOOL;
                break;
            case 9:
                cVar = c.TYPE_STRING;
                break;
            case 10:
                cVar = c.TYPE_GROUP;
                break;
            case 11:
                cVar = c.TYPE_MESSAGE;
                break;
            case 12:
                cVar = c.TYPE_BYTES;
                break;
            case 13:
                cVar = c.TYPE_UINT32;
                break;
            case 14:
                cVar = c.TYPE_ENUM;
                break;
            case 15:
                cVar = c.TYPE_SFIXED32;
                break;
            case 16:
                cVar = c.TYPE_SFIXED64;
                break;
            case 17:
                cVar = c.TYPE_SINT32;
                break;
            case 18:
                cVar = c.TYPE_SINT64;
                break;
            default:
                cVar = null;
                break;
        }
        return cVar == null ? c.UNRECOGNIZED : cVar;
    }

    @Override // androidx.datastore.preferences.protobuf.FieldOrBuilder
    public int getKindValue() {
        return this.kind_;
    }

    @Override // androidx.datastore.preferences.protobuf.FieldOrBuilder
    public String getName() {
        return this.name_;
    }

    @Override // androidx.datastore.preferences.protobuf.FieldOrBuilder
    public j getNameBytes() {
        return j.d(this.name_);
    }

    @Override // androidx.datastore.preferences.protobuf.FieldOrBuilder
    public int getNumber() {
        return this.number_;
    }

    @Override // androidx.datastore.preferences.protobuf.FieldOrBuilder
    public int getOneofIndex() {
        return this.oneofIndex_;
    }

    @Override // androidx.datastore.preferences.protobuf.FieldOrBuilder
    public Option getOptions(int i10) {
        return this.options_.get(i10);
    }

    @Override // androidx.datastore.preferences.protobuf.FieldOrBuilder
    public int getOptionsCount() {
        return this.options_.size();
    }

    @Override // androidx.datastore.preferences.protobuf.FieldOrBuilder
    public List<Option> getOptionsList() {
        return this.options_;
    }

    public OptionOrBuilder getOptionsOrBuilder(int i10) {
        return this.options_.get(i10);
    }

    public List<? extends OptionOrBuilder> getOptionsOrBuilderList() {
        return this.options_;
    }

    @Override // androidx.datastore.preferences.protobuf.FieldOrBuilder
    public boolean getPacked() {
        return this.packed_;
    }

    @Override // androidx.datastore.preferences.protobuf.FieldOrBuilder
    public String getTypeUrl() {
        return this.typeUrl_;
    }

    @Override // androidx.datastore.preferences.protobuf.FieldOrBuilder
    public j getTypeUrlBytes() {
        return j.d(this.typeUrl_);
    }

    public static Builder newBuilder(Field field) {
        return DEFAULT_INSTANCE.createBuilder(field);
    }

    public static Field parseDelimitedFrom(InputStream inputStream, t tVar) throws IOException {
        return (Field) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, tVar);
    }

    public static Field parseFrom(ByteBuffer byteBuffer, t tVar) throws e0 {
        return (Field) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, tVar);
    }

    public static Field parseFrom(j jVar) throws e0 {
        return (Field) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, jVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addOptions(int i10, Option option) {
        option.getClass();
        ensureOptionsIsMutable();
        this.options_.add(i10, option);
    }

    public static Field parseFrom(j jVar, t tVar) throws e0 {
        return (Field) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, jVar, tVar);
    }

    public static Field parseFrom(byte[] bArr) throws e0 {
        return (Field) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static Field parseFrom(byte[] bArr, t tVar) throws e0 {
        return (Field) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, tVar);
    }

    public static Field parseFrom(InputStream inputStream) throws IOException {
        return (Field) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Field parseFrom(InputStream inputStream, t tVar) throws IOException {
        return (Field) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, tVar);
    }

    public static Field parseFrom(k kVar) throws IOException {
        return (Field) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, kVar);
    }

    public static Field parseFrom(k kVar, t tVar) throws IOException {
        return (Field) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, kVar, tVar);
    }
}
