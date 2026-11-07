package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.GeneratedMessageLite;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* loaded from: classes.dex */
public final class UInt64Value extends GeneratedMessageLite<UInt64Value, Builder> implements UInt64ValueOrBuilder {
    private static final UInt64Value DEFAULT_INSTANCE;
    private static volatile h1<UInt64Value> PARSER = null;
    public static final int VALUE_FIELD_NUMBER = 1;
    private long value_;

    public static final class Builder extends GeneratedMessageLite.Builder<UInt64Value, Builder> implements UInt64ValueOrBuilder {
        public Builder clearValue() {
            copyOnWrite();
            ((UInt64Value) this.instance).clearValue();
            return this;
        }

        @Override // androidx.datastore.preferences.protobuf.UInt64ValueOrBuilder
        public long getValue() {
            return ((UInt64Value) this.instance).getValue();
        }

        public Builder setValue(long j10) {
            copyOnWrite();
            ((UInt64Value) this.instance).setValue(j10);
            return this;
        }

        private Builder() {
            super(UInt64Value.DEFAULT_INSTANCE);
        }
    }

    static {
        UInt64Value uInt64Value = new UInt64Value();
        DEFAULT_INSTANCE = uInt64Value;
        GeneratedMessageLite.registerDefaultInstance(UInt64Value.class, uInt64Value);
    }

    private UInt64Value() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearValue() {
        this.value_ = 0L;
    }

    public static UInt64Value getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static UInt64Value of(long j10) {
        return newBuilder().setValue(j10).build();
    }

    public static UInt64Value parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (UInt64Value) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static UInt64Value parseFrom(ByteBuffer byteBuffer) throws e0 {
        return (UInt64Value) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static h1<UInt64Value> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setValue(long j10) {
        this.value_ = j10;
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
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0003", new Object[]{"value_"});
            case 3:
                return new UInt64Value();
            case 4:
                return new Builder();
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                h1<UInt64Value> h1Var = PARSER;
                if (h1Var != null) {
                    return h1Var;
                }
                synchronized (UInt64Value.class) {
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

    @Override // androidx.datastore.preferences.protobuf.UInt64ValueOrBuilder
    public long getValue() {
        return this.value_;
    }

    public static Builder newBuilder(UInt64Value uInt64Value) {
        return DEFAULT_INSTANCE.createBuilder(uInt64Value);
    }

    public static UInt64Value parseDelimitedFrom(InputStream inputStream, t tVar) throws IOException {
        return (UInt64Value) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, tVar);
    }

    public static UInt64Value parseFrom(ByteBuffer byteBuffer, t tVar) throws e0 {
        return (UInt64Value) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, tVar);
    }

    public static UInt64Value parseFrom(j jVar) throws e0 {
        return (UInt64Value) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, jVar);
    }

    public static UInt64Value parseFrom(j jVar, t tVar) throws e0 {
        return (UInt64Value) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, jVar, tVar);
    }

    public static UInt64Value parseFrom(byte[] bArr) throws e0 {
        return (UInt64Value) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static UInt64Value parseFrom(byte[] bArr, t tVar) throws e0 {
        return (UInt64Value) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, tVar);
    }

    public static UInt64Value parseFrom(InputStream inputStream) throws IOException {
        return (UInt64Value) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static UInt64Value parseFrom(InputStream inputStream, t tVar) throws IOException {
        return (UInt64Value) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, tVar);
    }

    public static UInt64Value parseFrom(k kVar) throws IOException {
        return (UInt64Value) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, kVar);
    }

    public static UInt64Value parseFrom(k kVar, t tVar) throws IOException {
        return (UInt64Value) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, kVar, tVar);
    }
}
