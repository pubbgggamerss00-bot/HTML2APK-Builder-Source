package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.GeneratedMessageLite;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* loaded from: classes.dex */
public final class UInt32Value extends GeneratedMessageLite<UInt32Value, Builder> implements UInt32ValueOrBuilder {
    private static final UInt32Value DEFAULT_INSTANCE;
    private static volatile h1<UInt32Value> PARSER = null;
    public static final int VALUE_FIELD_NUMBER = 1;
    private int value_;

    public static final class Builder extends GeneratedMessageLite.Builder<UInt32Value, Builder> implements UInt32ValueOrBuilder {
        public Builder clearValue() {
            copyOnWrite();
            ((UInt32Value) this.instance).clearValue();
            return this;
        }

        @Override // androidx.datastore.preferences.protobuf.UInt32ValueOrBuilder
        public int getValue() {
            return ((UInt32Value) this.instance).getValue();
        }

        public Builder setValue(int i10) {
            copyOnWrite();
            ((UInt32Value) this.instance).setValue(i10);
            return this;
        }

        private Builder() {
            super(UInt32Value.DEFAULT_INSTANCE);
        }
    }

    static {
        UInt32Value uInt32Value = new UInt32Value();
        DEFAULT_INSTANCE = uInt32Value;
        GeneratedMessageLite.registerDefaultInstance(UInt32Value.class, uInt32Value);
    }

    private UInt32Value() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearValue() {
        this.value_ = 0;
    }

    public static UInt32Value getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static UInt32Value of(int i10) {
        return newBuilder().setValue(i10).build();
    }

    public static UInt32Value parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (UInt32Value) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static UInt32Value parseFrom(ByteBuffer byteBuffer) throws e0 {
        return (UInt32Value) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static h1<UInt32Value> parser() {
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
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u000b", new Object[]{"value_"});
            case 3:
                return new UInt32Value();
            case 4:
                return new Builder();
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                h1<UInt32Value> h1Var = PARSER;
                if (h1Var != null) {
                    return h1Var;
                }
                synchronized (UInt32Value.class) {
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

    @Override // androidx.datastore.preferences.protobuf.UInt32ValueOrBuilder
    public int getValue() {
        return this.value_;
    }

    public static Builder newBuilder(UInt32Value uInt32Value) {
        return DEFAULT_INSTANCE.createBuilder(uInt32Value);
    }

    public static UInt32Value parseDelimitedFrom(InputStream inputStream, t tVar) throws IOException {
        return (UInt32Value) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, tVar);
    }

    public static UInt32Value parseFrom(ByteBuffer byteBuffer, t tVar) throws e0 {
        return (UInt32Value) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, tVar);
    }

    public static UInt32Value parseFrom(j jVar) throws e0 {
        return (UInt32Value) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, jVar);
    }

    public static UInt32Value parseFrom(j jVar, t tVar) throws e0 {
        return (UInt32Value) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, jVar, tVar);
    }

    public static UInt32Value parseFrom(byte[] bArr) throws e0 {
        return (UInt32Value) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static UInt32Value parseFrom(byte[] bArr, t tVar) throws e0 {
        return (UInt32Value) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, tVar);
    }

    public static UInt32Value parseFrom(InputStream inputStream) throws IOException {
        return (UInt32Value) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static UInt32Value parseFrom(InputStream inputStream, t tVar) throws IOException {
        return (UInt32Value) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, tVar);
    }

    public static UInt32Value parseFrom(k kVar) throws IOException {
        return (UInt32Value) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, kVar);
    }

    public static UInt32Value parseFrom(k kVar, t tVar) throws IOException {
        return (UInt32Value) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, kVar, tVar);
    }
}
