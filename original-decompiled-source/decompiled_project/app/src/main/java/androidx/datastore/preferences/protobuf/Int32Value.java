package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.GeneratedMessageLite;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* loaded from: classes.dex */
public final class Int32Value extends GeneratedMessageLite<Int32Value, Builder> implements Int32ValueOrBuilder {
    private static final Int32Value DEFAULT_INSTANCE;
    private static volatile h1<Int32Value> PARSER = null;
    public static final int VALUE_FIELD_NUMBER = 1;
    private int value_;

    public static final class Builder extends GeneratedMessageLite.Builder<Int32Value, Builder> implements Int32ValueOrBuilder {
        public Builder clearValue() {
            copyOnWrite();
            ((Int32Value) this.instance).clearValue();
            return this;
        }

        @Override // androidx.datastore.preferences.protobuf.Int32ValueOrBuilder
        public int getValue() {
            return ((Int32Value) this.instance).getValue();
        }

        public Builder setValue(int i10) {
            copyOnWrite();
            ((Int32Value) this.instance).setValue(i10);
            return this;
        }

        private Builder() {
            super(Int32Value.DEFAULT_INSTANCE);
        }
    }

    static {
        Int32Value int32Value = new Int32Value();
        DEFAULT_INSTANCE = int32Value;
        GeneratedMessageLite.registerDefaultInstance(Int32Value.class, int32Value);
    }

    private Int32Value() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearValue() {
        this.value_ = 0;
    }

    public static Int32Value getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static Int32Value of(int i10) {
        return newBuilder().setValue(i10).build();
    }

    public static Int32Value parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (Int32Value) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Int32Value parseFrom(ByteBuffer byteBuffer) throws e0 {
        return (Int32Value) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static h1<Int32Value> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setValue(int i10) {
        this.value_ = i10;
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
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0004", new Object[]{"value_"});
            case 3:
                return new Int32Value();
            case 4:
                return new Builder();
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                h1<Int32Value> h1Var = PARSER;
                if (h1Var != null) {
                    return h1Var;
                }
                synchronized (Int32Value.class) {
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

    @Override // androidx.datastore.preferences.protobuf.Int32ValueOrBuilder
    public int getValue() {
        return this.value_;
    }

    public static Builder newBuilder(Int32Value int32Value) {
        return DEFAULT_INSTANCE.createBuilder(int32Value);
    }

    public static Int32Value parseDelimitedFrom(InputStream inputStream, t tVar) throws IOException {
        return (Int32Value) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, tVar);
    }

    public static Int32Value parseFrom(ByteBuffer byteBuffer, t tVar) throws e0 {
        return (Int32Value) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, tVar);
    }

    public static Int32Value parseFrom(j jVar) throws e0 {
        return (Int32Value) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, jVar);
    }

    public static Int32Value parseFrom(j jVar, t tVar) throws e0 {
        return (Int32Value) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, jVar, tVar);
    }

    public static Int32Value parseFrom(byte[] bArr) throws e0 {
        return (Int32Value) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static Int32Value parseFrom(byte[] bArr, t tVar) throws e0 {
        return (Int32Value) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, tVar);
    }

    public static Int32Value parseFrom(InputStream inputStream) throws IOException {
        return (Int32Value) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Int32Value parseFrom(InputStream inputStream, t tVar) throws IOException {
        return (Int32Value) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, tVar);
    }

    public static Int32Value parseFrom(k kVar) throws IOException {
        return (Int32Value) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, kVar);
    }

    public static Int32Value parseFrom(k kVar, t tVar) throws IOException {
        return (Int32Value) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, kVar, tVar);
    }
}
