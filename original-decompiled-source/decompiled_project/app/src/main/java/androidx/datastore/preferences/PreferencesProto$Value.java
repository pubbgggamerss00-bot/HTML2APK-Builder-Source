package androidx.datastore.preferences;

import androidx.datastore.preferences.PreferencesProto$StringSet;
import androidx.datastore.preferences.protobuf.GeneratedMessageLite;
import androidx.datastore.preferences.protobuf.e0;
import androidx.datastore.preferences.protobuf.h1;
import androidx.datastore.preferences.protobuf.j;
import androidx.datastore.preferences.protobuf.k;
import androidx.datastore.preferences.protobuf.t;
import com.yalantis.ucrop.view.CropImageView;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* loaded from: classes.dex */
public final class PreferencesProto$Value extends GeneratedMessageLite<PreferencesProto$Value, Builder> implements PreferencesProto$ValueOrBuilder {
    public static final int BOOLEAN_FIELD_NUMBER = 1;
    public static final int BYTES_FIELD_NUMBER = 8;
    private static final PreferencesProto$Value DEFAULT_INSTANCE;
    public static final int DOUBLE_FIELD_NUMBER = 7;
    public static final int FLOAT_FIELD_NUMBER = 2;
    public static final int INTEGER_FIELD_NUMBER = 3;
    public static final int LONG_FIELD_NUMBER = 4;
    private static volatile h1<PreferencesProto$Value> PARSER = null;
    public static final int STRING_FIELD_NUMBER = 5;
    public static final int STRING_SET_FIELD_NUMBER = 6;
    private int valueCase_ = 0;
    private Object value_;

    public static final class Builder extends GeneratedMessageLite.Builder<PreferencesProto$Value, Builder> implements PreferencesProto$ValueOrBuilder {
        public Builder clearBoolean() {
            copyOnWrite();
            ((PreferencesProto$Value) this.instance).clearBoolean();
            return this;
        }

        public Builder clearBytes() {
            copyOnWrite();
            ((PreferencesProto$Value) this.instance).clearBytes();
            return this;
        }

        public Builder clearDouble() {
            copyOnWrite();
            ((PreferencesProto$Value) this.instance).clearDouble();
            return this;
        }

        public Builder clearFloat() {
            copyOnWrite();
            ((PreferencesProto$Value) this.instance).clearFloat();
            return this;
        }

        public Builder clearInteger() {
            copyOnWrite();
            ((PreferencesProto$Value) this.instance).clearInteger();
            return this;
        }

        public Builder clearLong() {
            copyOnWrite();
            ((PreferencesProto$Value) this.instance).clearLong();
            return this;
        }

        public Builder clearString() {
            copyOnWrite();
            ((PreferencesProto$Value) this.instance).clearString();
            return this;
        }

        public Builder clearStringSet() {
            copyOnWrite();
            ((PreferencesProto$Value) this.instance).clearStringSet();
            return this;
        }

        public Builder clearValue() {
            copyOnWrite();
            ((PreferencesProto$Value) this.instance).clearValue();
            return this;
        }

        @Override // androidx.datastore.preferences.PreferencesProto$ValueOrBuilder
        public boolean getBoolean() {
            return ((PreferencesProto$Value) this.instance).getBoolean();
        }

        @Override // androidx.datastore.preferences.PreferencesProto$ValueOrBuilder
        public j getBytes() {
            return ((PreferencesProto$Value) this.instance).getBytes();
        }

        @Override // androidx.datastore.preferences.PreferencesProto$ValueOrBuilder
        public double getDouble() {
            return ((PreferencesProto$Value) this.instance).getDouble();
        }

        @Override // androidx.datastore.preferences.PreferencesProto$ValueOrBuilder
        public float getFloat() {
            return ((PreferencesProto$Value) this.instance).getFloat();
        }

        @Override // androidx.datastore.preferences.PreferencesProto$ValueOrBuilder
        public int getInteger() {
            return ((PreferencesProto$Value) this.instance).getInteger();
        }

        @Override // androidx.datastore.preferences.PreferencesProto$ValueOrBuilder
        public long getLong() {
            return ((PreferencesProto$Value) this.instance).getLong();
        }

        @Override // androidx.datastore.preferences.PreferencesProto$ValueOrBuilder
        public String getString() {
            return ((PreferencesProto$Value) this.instance).getString();
        }

        @Override // androidx.datastore.preferences.PreferencesProto$ValueOrBuilder
        public j getStringBytes() {
            return ((PreferencesProto$Value) this.instance).getStringBytes();
        }

        @Override // androidx.datastore.preferences.PreferencesProto$ValueOrBuilder
        public PreferencesProto$StringSet getStringSet() {
            return ((PreferencesProto$Value) this.instance).getStringSet();
        }

        @Override // androidx.datastore.preferences.PreferencesProto$ValueOrBuilder
        public a getValueCase() {
            return ((PreferencesProto$Value) this.instance).getValueCase();
        }

        @Override // androidx.datastore.preferences.PreferencesProto$ValueOrBuilder
        public boolean hasBoolean() {
            return ((PreferencesProto$Value) this.instance).hasBoolean();
        }

        @Override // androidx.datastore.preferences.PreferencesProto$ValueOrBuilder
        public boolean hasBytes() {
            return ((PreferencesProto$Value) this.instance).hasBytes();
        }

        @Override // androidx.datastore.preferences.PreferencesProto$ValueOrBuilder
        public boolean hasDouble() {
            return ((PreferencesProto$Value) this.instance).hasDouble();
        }

        @Override // androidx.datastore.preferences.PreferencesProto$ValueOrBuilder
        public boolean hasFloat() {
            return ((PreferencesProto$Value) this.instance).hasFloat();
        }

        @Override // androidx.datastore.preferences.PreferencesProto$ValueOrBuilder
        public boolean hasInteger() {
            return ((PreferencesProto$Value) this.instance).hasInteger();
        }

        @Override // androidx.datastore.preferences.PreferencesProto$ValueOrBuilder
        public boolean hasLong() {
            return ((PreferencesProto$Value) this.instance).hasLong();
        }

        @Override // androidx.datastore.preferences.PreferencesProto$ValueOrBuilder
        public boolean hasString() {
            return ((PreferencesProto$Value) this.instance).hasString();
        }

        @Override // androidx.datastore.preferences.PreferencesProto$ValueOrBuilder
        public boolean hasStringSet() {
            return ((PreferencesProto$Value) this.instance).hasStringSet();
        }

        public Builder mergeStringSet(PreferencesProto$StringSet preferencesProto$StringSet) {
            copyOnWrite();
            ((PreferencesProto$Value) this.instance).mergeStringSet(preferencesProto$StringSet);
            return this;
        }

        public Builder setBoolean(boolean z10) {
            copyOnWrite();
            ((PreferencesProto$Value) this.instance).setBoolean(z10);
            return this;
        }

        public Builder setBytes(j jVar) {
            copyOnWrite();
            ((PreferencesProto$Value) this.instance).setBytes(jVar);
            return this;
        }

        public Builder setDouble(double d10) {
            copyOnWrite();
            ((PreferencesProto$Value) this.instance).setDouble(d10);
            return this;
        }

        public Builder setFloat(float f10) {
            copyOnWrite();
            ((PreferencesProto$Value) this.instance).setFloat(f10);
            return this;
        }

        public Builder setInteger(int i10) {
            copyOnWrite();
            ((PreferencesProto$Value) this.instance).setInteger(i10);
            return this;
        }

        public Builder setLong(long j10) {
            copyOnWrite();
            ((PreferencesProto$Value) this.instance).setLong(j10);
            return this;
        }

        public Builder setString(String str) {
            copyOnWrite();
            ((PreferencesProto$Value) this.instance).setString(str);
            return this;
        }

        public Builder setStringBytes(j jVar) {
            copyOnWrite();
            ((PreferencesProto$Value) this.instance).setStringBytes(jVar);
            return this;
        }

        public Builder setStringSet(PreferencesProto$StringSet preferencesProto$StringSet) {
            copyOnWrite();
            ((PreferencesProto$Value) this.instance).setStringSet(preferencesProto$StringSet);
            return this;
        }

        private Builder() {
            super(PreferencesProto$Value.DEFAULT_INSTANCE);
        }

        public Builder setStringSet(PreferencesProto$StringSet.Builder builder) {
            copyOnWrite();
            ((PreferencesProto$Value) this.instance).setStringSet(builder.build());
            return this;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public static final a f1758a;

        /* renamed from: b, reason: collision with root package name */
        public static final a f1759b;

        /* renamed from: c, reason: collision with root package name */
        public static final a f1760c;

        /* renamed from: d, reason: collision with root package name */
        public static final a f1761d;

        /* renamed from: e, reason: collision with root package name */
        public static final a f1762e;

        /* renamed from: f, reason: collision with root package name */
        public static final a f1763f;

        /* renamed from: g, reason: collision with root package name */
        public static final a f1764g;

        /* renamed from: h, reason: collision with root package name */
        public static final a f1765h;

        /* renamed from: j, reason: collision with root package name */
        public static final a f1766j;

        /* renamed from: k, reason: collision with root package name */
        public static final /* synthetic */ a[] f1767k;

        static {
            a aVar = new a("BOOLEAN", 0);
            f1758a = aVar;
            a aVar2 = new a("FLOAT", 1);
            f1759b = aVar2;
            a aVar3 = new a("INTEGER", 2);
            f1760c = aVar3;
            a aVar4 = new a("LONG", 3);
            f1761d = aVar4;
            a aVar5 = new a("STRING", 4);
            f1762e = aVar5;
            a aVar6 = new a("STRING_SET", 5);
            f1763f = aVar6;
            a aVar7 = new a("DOUBLE", 6);
            f1764g = aVar7;
            a aVar8 = new a("BYTES", 7);
            f1765h = aVar8;
            a aVar9 = new a("VALUE_NOT_SET", 8);
            f1766j = aVar9;
            f1767k = new a[]{aVar, aVar2, aVar3, aVar4, aVar5, aVar6, aVar7, aVar8, aVar9};
        }

        public a() {
            throw null;
        }

        public static a valueOf(String str) {
            return (a) Enum.valueOf(a.class, str);
        }

        public static a[] values() {
            return (a[]) f1767k.clone();
        }
    }

    static {
        PreferencesProto$Value preferencesProto$Value = new PreferencesProto$Value();
        DEFAULT_INSTANCE = preferencesProto$Value;
        GeneratedMessageLite.registerDefaultInstance(PreferencesProto$Value.class, preferencesProto$Value);
    }

    private PreferencesProto$Value() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearBoolean() {
        if (this.valueCase_ == 1) {
            this.valueCase_ = 0;
            this.value_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearBytes() {
        if (this.valueCase_ == 8) {
            this.valueCase_ = 0;
            this.value_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDouble() {
        if (this.valueCase_ == 7) {
            this.valueCase_ = 0;
            this.value_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearFloat() {
        if (this.valueCase_ == 2) {
            this.valueCase_ = 0;
            this.value_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearInteger() {
        if (this.valueCase_ == 3) {
            this.valueCase_ = 0;
            this.value_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearLong() {
        if (this.valueCase_ == 4) {
            this.valueCase_ = 0;
            this.value_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearString() {
        if (this.valueCase_ == 5) {
            this.valueCase_ = 0;
            this.value_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearStringSet() {
        if (this.valueCase_ == 6) {
            this.valueCase_ = 0;
            this.value_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearValue() {
        this.valueCase_ = 0;
        this.value_ = null;
    }

    public static PreferencesProto$Value getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeStringSet(PreferencesProto$StringSet preferencesProto$StringSet) {
        preferencesProto$StringSet.getClass();
        if (this.valueCase_ != 6 || this.value_ == PreferencesProto$StringSet.getDefaultInstance()) {
            this.value_ = preferencesProto$StringSet;
        } else {
            this.value_ = PreferencesProto$StringSet.newBuilder((PreferencesProto$StringSet) this.value_).mergeFrom((PreferencesProto$StringSet.Builder) preferencesProto$StringSet).buildPartial();
        }
        this.valueCase_ = 6;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static PreferencesProto$Value parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (PreferencesProto$Value) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static PreferencesProto$Value parseFrom(ByteBuffer byteBuffer) throws e0 {
        return (PreferencesProto$Value) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static h1<PreferencesProto$Value> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setBoolean(boolean z10) {
        this.valueCase_ = 1;
        this.value_ = Boolean.valueOf(z10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setBytes(j jVar) {
        jVar.getClass();
        this.valueCase_ = 8;
        this.value_ = jVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDouble(double d10) {
        this.valueCase_ = 7;
        this.value_ = Double.valueOf(d10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setFloat(float f10) {
        this.valueCase_ = 2;
        this.value_ = Float.valueOf(f10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setInteger(int i10) {
        this.valueCase_ = 3;
        this.value_ = Integer.valueOf(i10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLong(long j10) {
        this.valueCase_ = 4;
        this.value_ = Long.valueOf(j10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setString(String str) {
        str.getClass();
        this.valueCase_ = 5;
        this.value_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setStringBytes(j jVar) {
        this.value_ = jVar.n();
        this.valueCase_ = 5;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setStringSet(PreferencesProto$StringSet preferencesProto$StringSet) {
        preferencesProto$StringSet.getClass();
        this.value_ = preferencesProto$StringSet;
        this.valueCase_ = 6;
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
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0001\b\u0001\u0000\u0001\b\b\u0000\u0000\u0000\u0001:\u0000\u00024\u0000\u00037\u0000\u00045\u0000\u0005;\u0000\u0006<\u0000\u00073\u0000\b=\u0000", new Object[]{"value_", "valueCase_", PreferencesProto$StringSet.class});
            case 3:
                return new PreferencesProto$Value();
            case 4:
                return new Builder();
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                h1<PreferencesProto$Value> h1Var = PARSER;
                if (h1Var != null) {
                    return h1Var;
                }
                synchronized (PreferencesProto$Value.class) {
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

    @Override // androidx.datastore.preferences.PreferencesProto$ValueOrBuilder
    public boolean getBoolean() {
        if (this.valueCase_ == 1) {
            return ((Boolean) this.value_).booleanValue();
        }
        return false;
    }

    @Override // androidx.datastore.preferences.PreferencesProto$ValueOrBuilder
    public j getBytes() {
        return this.valueCase_ == 8 ? (j) this.value_ : j.f2038b;
    }

    @Override // androidx.datastore.preferences.PreferencesProto$ValueOrBuilder
    public double getDouble() {
        if (this.valueCase_ == 7) {
            return ((Double) this.value_).doubleValue();
        }
        return 0.0d;
    }

    @Override // androidx.datastore.preferences.PreferencesProto$ValueOrBuilder
    public float getFloat() {
        return this.valueCase_ == 2 ? ((Float) this.value_).floatValue() : CropImageView.DEFAULT_ASPECT_RATIO;
    }

    @Override // androidx.datastore.preferences.PreferencesProto$ValueOrBuilder
    public int getInteger() {
        if (this.valueCase_ == 3) {
            return ((Integer) this.value_).intValue();
        }
        return 0;
    }

    @Override // androidx.datastore.preferences.PreferencesProto$ValueOrBuilder
    public long getLong() {
        if (this.valueCase_ == 4) {
            return ((Long) this.value_).longValue();
        }
        return 0L;
    }

    @Override // androidx.datastore.preferences.PreferencesProto$ValueOrBuilder
    public String getString() {
        return this.valueCase_ == 5 ? (String) this.value_ : "";
    }

    @Override // androidx.datastore.preferences.PreferencesProto$ValueOrBuilder
    public j getStringBytes() {
        return j.d(this.valueCase_ == 5 ? (String) this.value_ : "");
    }

    @Override // androidx.datastore.preferences.PreferencesProto$ValueOrBuilder
    public PreferencesProto$StringSet getStringSet() {
        return this.valueCase_ == 6 ? (PreferencesProto$StringSet) this.value_ : PreferencesProto$StringSet.getDefaultInstance();
    }

    @Override // androidx.datastore.preferences.PreferencesProto$ValueOrBuilder
    public a getValueCase() {
        switch (this.valueCase_) {
            case 0:
                return a.f1766j;
            case 1:
                return a.f1758a;
            case 2:
                return a.f1759b;
            case 3:
                return a.f1760c;
            case 4:
                return a.f1761d;
            case 5:
                return a.f1762e;
            case 6:
                return a.f1763f;
            case 7:
                return a.f1764g;
            case 8:
                return a.f1765h;
            default:
                return null;
        }
    }

    @Override // androidx.datastore.preferences.PreferencesProto$ValueOrBuilder
    public boolean hasBoolean() {
        return this.valueCase_ == 1;
    }

    @Override // androidx.datastore.preferences.PreferencesProto$ValueOrBuilder
    public boolean hasBytes() {
        return this.valueCase_ == 8;
    }

    @Override // androidx.datastore.preferences.PreferencesProto$ValueOrBuilder
    public boolean hasDouble() {
        return this.valueCase_ == 7;
    }

    @Override // androidx.datastore.preferences.PreferencesProto$ValueOrBuilder
    public boolean hasFloat() {
        return this.valueCase_ == 2;
    }

    @Override // androidx.datastore.preferences.PreferencesProto$ValueOrBuilder
    public boolean hasInteger() {
        return this.valueCase_ == 3;
    }

    @Override // androidx.datastore.preferences.PreferencesProto$ValueOrBuilder
    public boolean hasLong() {
        return this.valueCase_ == 4;
    }

    @Override // androidx.datastore.preferences.PreferencesProto$ValueOrBuilder
    public boolean hasString() {
        return this.valueCase_ == 5;
    }

    @Override // androidx.datastore.preferences.PreferencesProto$ValueOrBuilder
    public boolean hasStringSet() {
        return this.valueCase_ == 6;
    }

    public static Builder newBuilder(PreferencesProto$Value preferencesProto$Value) {
        return DEFAULT_INSTANCE.createBuilder(preferencesProto$Value);
    }

    public static PreferencesProto$Value parseDelimitedFrom(InputStream inputStream, t tVar) throws IOException {
        return (PreferencesProto$Value) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, tVar);
    }

    public static PreferencesProto$Value parseFrom(ByteBuffer byteBuffer, t tVar) throws e0 {
        return (PreferencesProto$Value) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, tVar);
    }

    public static PreferencesProto$Value parseFrom(j jVar) throws e0 {
        return (PreferencesProto$Value) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, jVar);
    }

    public static PreferencesProto$Value parseFrom(j jVar, t tVar) throws e0 {
        return (PreferencesProto$Value) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, jVar, tVar);
    }

    public static PreferencesProto$Value parseFrom(byte[] bArr) throws e0 {
        return (PreferencesProto$Value) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static PreferencesProto$Value parseFrom(byte[] bArr, t tVar) throws e0 {
        return (PreferencesProto$Value) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, tVar);
    }

    public static PreferencesProto$Value parseFrom(InputStream inputStream) throws IOException {
        return (PreferencesProto$Value) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static PreferencesProto$Value parseFrom(InputStream inputStream, t tVar) throws IOException {
        return (PreferencesProto$Value) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, tVar);
    }

    public static PreferencesProto$Value parseFrom(k kVar) throws IOException {
        return (PreferencesProto$Value) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, kVar);
    }

    public static PreferencesProto$Value parseFrom(k kVar, t tVar) throws IOException {
        return (PreferencesProto$Value) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, kVar, tVar);
    }
}
