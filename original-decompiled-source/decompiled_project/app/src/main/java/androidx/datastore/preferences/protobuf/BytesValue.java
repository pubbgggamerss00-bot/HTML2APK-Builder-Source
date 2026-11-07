package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.GeneratedMessageLite;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* loaded from: classes.dex */
public final class BytesValue extends GeneratedMessageLite<BytesValue, Builder> implements BytesValueOrBuilder {
    private static final BytesValue DEFAULT_INSTANCE;
    private static volatile h1<BytesValue> PARSER = null;
    public static final int VALUE_FIELD_NUMBER = 1;
    private j value_ = j.f2038b;

    public static final class Builder extends GeneratedMessageLite.Builder<BytesValue, Builder> implements BytesValueOrBuilder {
        public Builder clearValue() {
            copyOnWrite();
            ((BytesValue) this.instance).clearValue();
            return this;
        }

        @Override // androidx.datastore.preferences.protobuf.BytesValueOrBuilder
        public j getValue() {
            return ((BytesValue) this.instance).getValue();
        }

        public Builder setValue(j jVar) {
            copyOnWrite();
            ((BytesValue) this.instance).setValue(jVar);
            return this;
        }

        private Builder() {
            super(BytesValue.DEFAULT_INSTANCE);
        }
    }

    static {
        BytesValue bytesValue = new BytesValue();
        DEFAULT_INSTANCE = bytesValue;
        GeneratedMessageLite.registerDefaultInstance(BytesValue.class, bytesValue);
    }

    private BytesValue() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearValue() {
        this.value_ = getDefaultInstance().getValue();
    }

    public static BytesValue getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static BytesValue of(j jVar) {
        return newBuilder().setValue(jVar).build();
    }

    public static BytesValue parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (BytesValue) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static BytesValue parseFrom(ByteBuffer byteBuffer) throws e0 {
        return (BytesValue) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static h1<BytesValue> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setValue(j jVar) {
        jVar.getClass();
        this.value_ = jVar;
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
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\n", new Object[]{"value_"});
            case 3:
                return new BytesValue();
            case 4:
                return new Builder();
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                h1<BytesValue> h1Var = PARSER;
                if (h1Var != null) {
                    return h1Var;
                }
                synchronized (BytesValue.class) {
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

    @Override // androidx.datastore.preferences.protobuf.BytesValueOrBuilder
    public j getValue() {
        return this.value_;
    }

    public static Builder newBuilder(BytesValue bytesValue) {
        return DEFAULT_INSTANCE.createBuilder(bytesValue);
    }

    public static BytesValue parseDelimitedFrom(InputStream inputStream, t tVar) throws IOException {
        return (BytesValue) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, tVar);
    }

    public static BytesValue parseFrom(ByteBuffer byteBuffer, t tVar) throws e0 {
        return (BytesValue) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, tVar);
    }

    public static BytesValue parseFrom(j jVar) throws e0 {
        return (BytesValue) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, jVar);
    }

    public static BytesValue parseFrom(j jVar, t tVar) throws e0 {
        return (BytesValue) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, jVar, tVar);
    }

    public static BytesValue parseFrom(byte[] bArr) throws e0 {
        return (BytesValue) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static BytesValue parseFrom(byte[] bArr, t tVar) throws e0 {
        return (BytesValue) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, tVar);
    }

    public static BytesValue parseFrom(InputStream inputStream) throws IOException {
        return (BytesValue) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static BytesValue parseFrom(InputStream inputStream, t tVar) throws IOException {
        return (BytesValue) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, tVar);
    }

    public static BytesValue parseFrom(k kVar) throws IOException {
        return (BytesValue) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, kVar);
    }

    public static BytesValue parseFrom(k kVar, t tVar) throws IOException {
        return (BytesValue) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, kVar, tVar);
    }
}
