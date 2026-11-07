package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.GeneratedMessageLite;
import androidx.datastore.preferences.protobuf.ListValue;
import androidx.datastore.preferences.protobuf.Struct;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* loaded from: classes.dex */
public final class Value extends GeneratedMessageLite<Value, Builder> implements ValueOrBuilder {
    public static final int BOOL_VALUE_FIELD_NUMBER = 4;
    private static final Value DEFAULT_INSTANCE;
    public static final int LIST_VALUE_FIELD_NUMBER = 6;
    public static final int NULL_VALUE_FIELD_NUMBER = 1;
    public static final int NUMBER_VALUE_FIELD_NUMBER = 2;
    private static volatile h1<Value> PARSER = null;
    public static final int STRING_VALUE_FIELD_NUMBER = 3;
    public static final int STRUCT_VALUE_FIELD_NUMBER = 5;
    private int kindCase_ = 0;
    private Object kind_;

    public static final class Builder extends GeneratedMessageLite.Builder<Value, Builder> implements ValueOrBuilder {
        public Builder clearBoolValue() {
            copyOnWrite();
            ((Value) this.instance).clearBoolValue();
            return this;
        }

        public Builder clearKind() {
            copyOnWrite();
            ((Value) this.instance).clearKind();
            return this;
        }

        public Builder clearListValue() {
            copyOnWrite();
            ((Value) this.instance).clearListValue();
            return this;
        }

        public Builder clearNullValue() {
            copyOnWrite();
            ((Value) this.instance).clearNullValue();
            return this;
        }

        public Builder clearNumberValue() {
            copyOnWrite();
            ((Value) this.instance).clearNumberValue();
            return this;
        }

        public Builder clearStringValue() {
            copyOnWrite();
            ((Value) this.instance).clearStringValue();
            return this;
        }

        public Builder clearStructValue() {
            copyOnWrite();
            ((Value) this.instance).clearStructValue();
            return this;
        }

        @Override // androidx.datastore.preferences.protobuf.ValueOrBuilder
        public boolean getBoolValue() {
            return ((Value) this.instance).getBoolValue();
        }

        @Override // androidx.datastore.preferences.protobuf.ValueOrBuilder
        public b getKindCase() {
            return ((Value) this.instance).getKindCase();
        }

        @Override // androidx.datastore.preferences.protobuf.ValueOrBuilder
        public ListValue getListValue() {
            return ((Value) this.instance).getListValue();
        }

        @Override // androidx.datastore.preferences.protobuf.ValueOrBuilder
        public g1 getNullValue() {
            return ((Value) this.instance).getNullValue();
        }

        @Override // androidx.datastore.preferences.protobuf.ValueOrBuilder
        public int getNullValueValue() {
            return ((Value) this.instance).getNullValueValue();
        }

        @Override // androidx.datastore.preferences.protobuf.ValueOrBuilder
        public double getNumberValue() {
            return ((Value) this.instance).getNumberValue();
        }

        @Override // androidx.datastore.preferences.protobuf.ValueOrBuilder
        public String getStringValue() {
            return ((Value) this.instance).getStringValue();
        }

        @Override // androidx.datastore.preferences.protobuf.ValueOrBuilder
        public j getStringValueBytes() {
            return ((Value) this.instance).getStringValueBytes();
        }

        @Override // androidx.datastore.preferences.protobuf.ValueOrBuilder
        public Struct getStructValue() {
            return ((Value) this.instance).getStructValue();
        }

        @Override // androidx.datastore.preferences.protobuf.ValueOrBuilder
        public boolean hasBoolValue() {
            return ((Value) this.instance).hasBoolValue();
        }

        @Override // androidx.datastore.preferences.protobuf.ValueOrBuilder
        public boolean hasListValue() {
            return ((Value) this.instance).hasListValue();
        }

        @Override // androidx.datastore.preferences.protobuf.ValueOrBuilder
        public boolean hasNullValue() {
            return ((Value) this.instance).hasNullValue();
        }

        @Override // androidx.datastore.preferences.protobuf.ValueOrBuilder
        public boolean hasNumberValue() {
            return ((Value) this.instance).hasNumberValue();
        }

        @Override // androidx.datastore.preferences.protobuf.ValueOrBuilder
        public boolean hasStringValue() {
            return ((Value) this.instance).hasStringValue();
        }

        @Override // androidx.datastore.preferences.protobuf.ValueOrBuilder
        public boolean hasStructValue() {
            return ((Value) this.instance).hasStructValue();
        }

        public Builder mergeListValue(ListValue listValue) {
            copyOnWrite();
            ((Value) this.instance).mergeListValue(listValue);
            return this;
        }

        public Builder mergeStructValue(Struct struct) {
            copyOnWrite();
            ((Value) this.instance).mergeStructValue(struct);
            return this;
        }

        public Builder setBoolValue(boolean z10) {
            copyOnWrite();
            ((Value) this.instance).setBoolValue(z10);
            return this;
        }

        public Builder setListValue(ListValue listValue) {
            copyOnWrite();
            ((Value) this.instance).setListValue(listValue);
            return this;
        }

        public Builder setNullValue(g1 g1Var) {
            copyOnWrite();
            ((Value) this.instance).setNullValue(g1Var);
            return this;
        }

        public Builder setNullValueValue(int i10) {
            copyOnWrite();
            ((Value) this.instance).setNullValueValue(i10);
            return this;
        }

        public Builder setNumberValue(double d10) {
            copyOnWrite();
            ((Value) this.instance).setNumberValue(d10);
            return this;
        }

        public Builder setStringValue(String str) {
            copyOnWrite();
            ((Value) this.instance).setStringValue(str);
            return this;
        }

        public Builder setStringValueBytes(j jVar) throws IllegalArgumentException {
            copyOnWrite();
            ((Value) this.instance).setStringValueBytes(jVar);
            return this;
        }

        public Builder setStructValue(Struct struct) {
            copyOnWrite();
            ((Value) this.instance).setStructValue(struct);
            return this;
        }

        private Builder() {
            super(Value.DEFAULT_INSTANCE);
        }

        public Builder setListValue(ListValue.Builder builder) {
            copyOnWrite();
            ((Value) this.instance).setListValue(builder.build());
            return this;
        }

        public Builder setStructValue(Struct.Builder builder) {
            copyOnWrite();
            ((Value) this.instance).setStructValue(builder.build());
            return this;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        public static final b f1940a;

        /* renamed from: b, reason: collision with root package name */
        public static final b f1941b;

        /* renamed from: c, reason: collision with root package name */
        public static final b f1942c;

        /* renamed from: d, reason: collision with root package name */
        public static final b f1943d;

        /* renamed from: e, reason: collision with root package name */
        public static final b f1944e;

        /* renamed from: f, reason: collision with root package name */
        public static final b f1945f;

        /* renamed from: g, reason: collision with root package name */
        public static final b f1946g;

        /* renamed from: h, reason: collision with root package name */
        public static final /* synthetic */ b[] f1947h;

        static {
            b bVar = new b("NULL_VALUE", 0);
            f1940a = bVar;
            b bVar2 = new b("NUMBER_VALUE", 1);
            f1941b = bVar2;
            b bVar3 = new b("STRING_VALUE", 2);
            f1942c = bVar3;
            b bVar4 = new b("BOOL_VALUE", 3);
            f1943d = bVar4;
            b bVar5 = new b("STRUCT_VALUE", 4);
            f1944e = bVar5;
            b bVar6 = new b("LIST_VALUE", 5);
            f1945f = bVar6;
            b bVar7 = new b("KIND_NOT_SET", 6);
            f1946g = bVar7;
            f1947h = new b[]{bVar, bVar2, bVar3, bVar4, bVar5, bVar6, bVar7};
        }

        public b() {
            throw null;
        }

        public static b valueOf(String str) {
            return (b) java.lang.Enum.valueOf(b.class, str);
        }

        public static b[] values() {
            return (b[]) f1947h.clone();
        }
    }

    static {
        Value value = new Value();
        DEFAULT_INSTANCE = value;
        GeneratedMessageLite.registerDefaultInstance(Value.class, value);
    }

    private Value() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearBoolValue() {
        if (this.kindCase_ == 4) {
            this.kindCase_ = 0;
            this.kind_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearKind() {
        this.kindCase_ = 0;
        this.kind_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearListValue() {
        if (this.kindCase_ == 6) {
            this.kindCase_ = 0;
            this.kind_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearNullValue() {
        if (this.kindCase_ == 1) {
            this.kindCase_ = 0;
            this.kind_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearNumberValue() {
        if (this.kindCase_ == 2) {
            this.kindCase_ = 0;
            this.kind_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearStringValue() {
        if (this.kindCase_ == 3) {
            this.kindCase_ = 0;
            this.kind_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearStructValue() {
        if (this.kindCase_ == 5) {
            this.kindCase_ = 0;
            this.kind_ = null;
        }
    }

    public static Value getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeListValue(ListValue listValue) {
        listValue.getClass();
        if (this.kindCase_ != 6 || this.kind_ == ListValue.getDefaultInstance()) {
            this.kind_ = listValue;
        } else {
            this.kind_ = ListValue.newBuilder((ListValue) this.kind_).mergeFrom((ListValue.Builder) listValue).buildPartial();
        }
        this.kindCase_ = 6;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeStructValue(Struct struct) {
        struct.getClass();
        if (this.kindCase_ != 5 || this.kind_ == Struct.getDefaultInstance()) {
            this.kind_ = struct;
        } else {
            this.kind_ = Struct.newBuilder((Struct) this.kind_).mergeFrom((Struct.Builder) struct).buildPartial();
        }
        this.kindCase_ = 5;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static Value parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (Value) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Value parseFrom(ByteBuffer byteBuffer) throws e0 {
        return (Value) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static h1<Value> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setBoolValue(boolean z10) {
        this.kindCase_ = 4;
        this.kind_ = Boolean.valueOf(z10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setListValue(ListValue listValue) {
        listValue.getClass();
        this.kind_ = listValue;
        this.kindCase_ = 6;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setNullValue(g1 g1Var) {
        this.kind_ = Integer.valueOf(g1Var.getNumber());
        this.kindCase_ = 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setNullValueValue(int i10) {
        this.kindCase_ = 1;
        this.kind_ = Integer.valueOf(i10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setNumberValue(double d10) {
        this.kindCase_ = 2;
        this.kind_ = Double.valueOf(d10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setStringValue(String str) {
        str.getClass();
        this.kindCase_ = 3;
        this.kind_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setStringValueBytes(j jVar) throws IllegalArgumentException {
        AbstractMessageLite.checkByteStringIsUtf8(jVar);
        this.kind_ = jVar.n();
        this.kindCase_ = 3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setStructValue(Struct struct) {
        struct.getClass();
        this.kind_ = struct;
        this.kindCase_ = 5;
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
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0006\u0001\u0000\u0001\u0006\u0006\u0000\u0000\u0000\u0001?\u0000\u00023\u0000\u0003Ȼ\u0000\u0004:\u0000\u0005<\u0000\u0006<\u0000", new Object[]{"kind_", "kindCase_", Struct.class, ListValue.class});
            case 3:
                return new Value();
            case 4:
                return new Builder();
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                h1<Value> h1Var = PARSER;
                if (h1Var != null) {
                    return h1Var;
                }
                synchronized (Value.class) {
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

    @Override // androidx.datastore.preferences.protobuf.ValueOrBuilder
    public boolean getBoolValue() {
        if (this.kindCase_ == 4) {
            return ((Boolean) this.kind_).booleanValue();
        }
        return false;
    }

    @Override // androidx.datastore.preferences.protobuf.ValueOrBuilder
    public b getKindCase() {
        switch (this.kindCase_) {
            case 0:
                return b.f1946g;
            case 1:
                return b.f1940a;
            case 2:
                return b.f1941b;
            case 3:
                return b.f1942c;
            case 4:
                return b.f1943d;
            case 5:
                return b.f1944e;
            case 6:
                return b.f1945f;
            default:
                return null;
        }
    }

    @Override // androidx.datastore.preferences.protobuf.ValueOrBuilder
    public ListValue getListValue() {
        return this.kindCase_ == 6 ? (ListValue) this.kind_ : ListValue.getDefaultInstance();
    }

    @Override // androidx.datastore.preferences.protobuf.ValueOrBuilder
    public g1 getNullValue() {
        int i10 = this.kindCase_;
        g1 g1Var = g1.NULL_VALUE;
        if (i10 == 1) {
            if (((Integer) this.kind_).intValue() != 0) {
                g1Var = null;
            }
            if (g1Var == null) {
                return g1.UNRECOGNIZED;
            }
        }
        return g1Var;
    }

    @Override // androidx.datastore.preferences.protobuf.ValueOrBuilder
    public int getNullValueValue() {
        if (this.kindCase_ == 1) {
            return ((Integer) this.kind_).intValue();
        }
        return 0;
    }

    @Override // androidx.datastore.preferences.protobuf.ValueOrBuilder
    public double getNumberValue() {
        if (this.kindCase_ == 2) {
            return ((Double) this.kind_).doubleValue();
        }
        return 0.0d;
    }

    @Override // androidx.datastore.preferences.protobuf.ValueOrBuilder
    public String getStringValue() {
        return this.kindCase_ == 3 ? (String) this.kind_ : "";
    }

    @Override // androidx.datastore.preferences.protobuf.ValueOrBuilder
    public j getStringValueBytes() {
        return j.d(this.kindCase_ == 3 ? (String) this.kind_ : "");
    }

    @Override // androidx.datastore.preferences.protobuf.ValueOrBuilder
    public Struct getStructValue() {
        return this.kindCase_ == 5 ? (Struct) this.kind_ : Struct.getDefaultInstance();
    }

    @Override // androidx.datastore.preferences.protobuf.ValueOrBuilder
    public boolean hasBoolValue() {
        return this.kindCase_ == 4;
    }

    @Override // androidx.datastore.preferences.protobuf.ValueOrBuilder
    public boolean hasListValue() {
        return this.kindCase_ == 6;
    }

    @Override // androidx.datastore.preferences.protobuf.ValueOrBuilder
    public boolean hasNullValue() {
        return this.kindCase_ == 1;
    }

    @Override // androidx.datastore.preferences.protobuf.ValueOrBuilder
    public boolean hasNumberValue() {
        return this.kindCase_ == 2;
    }

    @Override // androidx.datastore.preferences.protobuf.ValueOrBuilder
    public boolean hasStringValue() {
        return this.kindCase_ == 3;
    }

    @Override // androidx.datastore.preferences.protobuf.ValueOrBuilder
    public boolean hasStructValue() {
        return this.kindCase_ == 5;
    }

    public static Builder newBuilder(Value value) {
        return DEFAULT_INSTANCE.createBuilder(value);
    }

    public static Value parseDelimitedFrom(InputStream inputStream, t tVar) throws IOException {
        return (Value) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, tVar);
    }

    public static Value parseFrom(ByteBuffer byteBuffer, t tVar) throws e0 {
        return (Value) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, tVar);
    }

    public static Value parseFrom(j jVar) throws e0 {
        return (Value) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, jVar);
    }

    public static Value parseFrom(j jVar, t tVar) throws e0 {
        return (Value) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, jVar, tVar);
    }

    public static Value parseFrom(byte[] bArr) throws e0 {
        return (Value) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static Value parseFrom(byte[] bArr, t tVar) throws e0 {
        return (Value) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, tVar);
    }

    public static Value parseFrom(InputStream inputStream) throws IOException {
        return (Value) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Value parseFrom(InputStream inputStream, t tVar) throws IOException {
        return (Value) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, tVar);
    }

    public static Value parseFrom(k kVar) throws IOException {
        return (Value) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, kVar);
    }

    public static Value parseFrom(k kVar, t tVar) throws IOException {
        return (Value) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, kVar, tVar);
    }
}
