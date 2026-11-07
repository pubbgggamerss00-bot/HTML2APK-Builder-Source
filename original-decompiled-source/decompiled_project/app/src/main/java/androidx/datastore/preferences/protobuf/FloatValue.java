package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.GeneratedMessageLite;
import com.yalantis.ucrop.view.CropImageView;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* loaded from: classes.dex */
public final class FloatValue extends GeneratedMessageLite<FloatValue, Builder> implements FloatValueOrBuilder {
    private static final FloatValue DEFAULT_INSTANCE;
    private static volatile h1<FloatValue> PARSER = null;
    public static final int VALUE_FIELD_NUMBER = 1;
    private float value_;

    public static final class Builder extends GeneratedMessageLite.Builder<FloatValue, Builder> implements FloatValueOrBuilder {
        public Builder clearValue() {
            copyOnWrite();
            ((FloatValue) this.instance).clearValue();
            return this;
        }

        @Override // androidx.datastore.preferences.protobuf.FloatValueOrBuilder
        public float getValue() {
            return ((FloatValue) this.instance).getValue();
        }

        public Builder setValue(float f10) {
            copyOnWrite();
            ((FloatValue) this.instance).setValue(f10);
            return this;
        }

        private Builder() {
            super(FloatValue.DEFAULT_INSTANCE);
        }
    }

    static {
        FloatValue floatValue = new FloatValue();
        DEFAULT_INSTANCE = floatValue;
        GeneratedMessageLite.registerDefaultInstance(FloatValue.class, floatValue);
    }

    private FloatValue() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearValue() {
        this.value_ = CropImageView.DEFAULT_ASPECT_RATIO;
    }

    public static FloatValue getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static FloatValue of(float f10) {
        return newBuilder().setValue(f10).build();
    }

    public static FloatValue parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (FloatValue) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static FloatValue parseFrom(ByteBuffer byteBuffer) throws e0 {
        return (FloatValue) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static h1<FloatValue> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setValue(float f10) {
        this.value_ = f10;
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
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0001", new Object[]{"value_"});
            case 3:
                return new FloatValue();
            case 4:
                return new Builder();
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                h1<FloatValue> h1Var = PARSER;
                if (h1Var != null) {
                    return h1Var;
                }
                synchronized (FloatValue.class) {
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

    @Override // androidx.datastore.preferences.protobuf.FloatValueOrBuilder
    public float getValue() {
        return this.value_;
    }

    public static Builder newBuilder(FloatValue floatValue) {
        return DEFAULT_INSTANCE.createBuilder(floatValue);
    }

    public static FloatValue parseDelimitedFrom(InputStream inputStream, t tVar) throws IOException {
        return (FloatValue) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, tVar);
    }

    public static FloatValue parseFrom(ByteBuffer byteBuffer, t tVar) throws e0 {
        return (FloatValue) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, tVar);
    }

    public static FloatValue parseFrom(j jVar) throws e0 {
        return (FloatValue) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, jVar);
    }

    public static FloatValue parseFrom(j jVar, t tVar) throws e0 {
        return (FloatValue) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, jVar, tVar);
    }

    public static FloatValue parseFrom(byte[] bArr) throws e0 {
        return (FloatValue) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static FloatValue parseFrom(byte[] bArr, t tVar) throws e0 {
        return (FloatValue) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, tVar);
    }

    public static FloatValue parseFrom(InputStream inputStream) throws IOException {
        return (FloatValue) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static FloatValue parseFrom(InputStream inputStream, t tVar) throws IOException {
        return (FloatValue) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, tVar);
    }

    public static FloatValue parseFrom(k kVar) throws IOException {
        return (FloatValue) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, kVar);
    }

    public static FloatValue parseFrom(k kVar, t tVar) throws IOException {
        return (FloatValue) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, kVar, tVar);
    }
}
