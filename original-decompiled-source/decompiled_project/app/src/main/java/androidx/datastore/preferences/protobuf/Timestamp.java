package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.GeneratedMessageLite;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* loaded from: classes.dex */
public final class Timestamp extends GeneratedMessageLite<Timestamp, Builder> implements TimestampOrBuilder {
    private static final Timestamp DEFAULT_INSTANCE;
    public static final int NANOS_FIELD_NUMBER = 2;
    private static volatile h1<Timestamp> PARSER = null;
    public static final int SECONDS_FIELD_NUMBER = 1;
    private int nanos_;
    private long seconds_;

    public static final class Builder extends GeneratedMessageLite.Builder<Timestamp, Builder> implements TimestampOrBuilder {
        public Builder clearNanos() {
            copyOnWrite();
            ((Timestamp) this.instance).clearNanos();
            return this;
        }

        public Builder clearSeconds() {
            copyOnWrite();
            ((Timestamp) this.instance).clearSeconds();
            return this;
        }

        @Override // androidx.datastore.preferences.protobuf.TimestampOrBuilder
        public int getNanos() {
            return ((Timestamp) this.instance).getNanos();
        }

        @Override // androidx.datastore.preferences.protobuf.TimestampOrBuilder
        public long getSeconds() {
            return ((Timestamp) this.instance).getSeconds();
        }

        public Builder setNanos(int i10) {
            copyOnWrite();
            ((Timestamp) this.instance).setNanos(i10);
            return this;
        }

        public Builder setSeconds(long j10) {
            copyOnWrite();
            ((Timestamp) this.instance).setSeconds(j10);
            return this;
        }

        private Builder() {
            super(Timestamp.DEFAULT_INSTANCE);
        }
    }

    static {
        Timestamp timestamp = new Timestamp();
        DEFAULT_INSTANCE = timestamp;
        GeneratedMessageLite.registerDefaultInstance(Timestamp.class, timestamp);
    }

    private Timestamp() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearNanos() {
        this.nanos_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSeconds() {
        this.seconds_ = 0L;
    }

    public static Timestamp getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static Timestamp parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (Timestamp) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Timestamp parseFrom(ByteBuffer byteBuffer) throws e0 {
        return (Timestamp) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static h1<Timestamp> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setNanos(int i10) {
        this.nanos_ = i10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSeconds(long j10) {
        this.seconds_ = j10;
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
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u0002\u0002\u0004", new Object[]{"seconds_", "nanos_"});
            case 3:
                return new Timestamp();
            case 4:
                return new Builder();
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                h1<Timestamp> h1Var = PARSER;
                if (h1Var != null) {
                    return h1Var;
                }
                synchronized (Timestamp.class) {
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

    @Override // androidx.datastore.preferences.protobuf.TimestampOrBuilder
    public int getNanos() {
        return this.nanos_;
    }

    @Override // androidx.datastore.preferences.protobuf.TimestampOrBuilder
    public long getSeconds() {
        return this.seconds_;
    }

    public static Builder newBuilder(Timestamp timestamp) {
        return DEFAULT_INSTANCE.createBuilder(timestamp);
    }

    public static Timestamp parseDelimitedFrom(InputStream inputStream, t tVar) throws IOException {
        return (Timestamp) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, tVar);
    }

    public static Timestamp parseFrom(ByteBuffer byteBuffer, t tVar) throws e0 {
        return (Timestamp) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, tVar);
    }

    public static Timestamp parseFrom(j jVar) throws e0 {
        return (Timestamp) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, jVar);
    }

    public static Timestamp parseFrom(j jVar, t tVar) throws e0 {
        return (Timestamp) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, jVar, tVar);
    }

    public static Timestamp parseFrom(byte[] bArr) throws e0 {
        return (Timestamp) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static Timestamp parseFrom(byte[] bArr, t tVar) throws e0 {
        return (Timestamp) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, tVar);
    }

    public static Timestamp parseFrom(InputStream inputStream) throws IOException {
        return (Timestamp) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Timestamp parseFrom(InputStream inputStream, t tVar) throws IOException {
        return (Timestamp) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, tVar);
    }

    public static Timestamp parseFrom(k kVar) throws IOException {
        return (Timestamp) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, kVar);
    }

    public static Timestamp parseFrom(k kVar, t tVar) throws IOException {
        return (Timestamp) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, kVar, tVar);
    }
}
