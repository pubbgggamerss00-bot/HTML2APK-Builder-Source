package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.GeneratedMessageLite;
import androidx.datastore.preferences.protobuf.d0;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* loaded from: classes.dex */
public final class JavaFeaturesProto$JavaFeatures extends GeneratedMessageLite<JavaFeaturesProto$JavaFeatures, Builder> implements JavaFeaturesProto$JavaFeaturesOrBuilder {
    private static final JavaFeaturesProto$JavaFeatures DEFAULT_INSTANCE;
    public static final int LEGACY_CLOSED_ENUM_FIELD_NUMBER = 1;
    private static volatile h1<JavaFeaturesProto$JavaFeatures> PARSER = null;
    public static final int UTF8_VALIDATION_FIELD_NUMBER = 2;
    private int bitField0_;
    private boolean legacyClosedEnum_;
    private int utf8Validation_;

    public static final class Builder extends GeneratedMessageLite.Builder<JavaFeaturesProto$JavaFeatures, Builder> implements JavaFeaturesProto$JavaFeaturesOrBuilder {
        public Builder clearLegacyClosedEnum() {
            copyOnWrite();
            ((JavaFeaturesProto$JavaFeatures) this.instance).clearLegacyClosedEnum();
            return this;
        }

        public Builder clearUtf8Validation() {
            copyOnWrite();
            ((JavaFeaturesProto$JavaFeatures) this.instance).clearUtf8Validation();
            return this;
        }

        @Override // androidx.datastore.preferences.protobuf.JavaFeaturesProto$JavaFeaturesOrBuilder
        public boolean getLegacyClosedEnum() {
            return ((JavaFeaturesProto$JavaFeatures) this.instance).getLegacyClosedEnum();
        }

        @Override // androidx.datastore.preferences.protobuf.JavaFeaturesProto$JavaFeaturesOrBuilder
        public a getUtf8Validation() {
            return ((JavaFeaturesProto$JavaFeatures) this.instance).getUtf8Validation();
        }

        @Override // androidx.datastore.preferences.protobuf.JavaFeaturesProto$JavaFeaturesOrBuilder
        public boolean hasLegacyClosedEnum() {
            return ((JavaFeaturesProto$JavaFeatures) this.instance).hasLegacyClosedEnum();
        }

        @Override // androidx.datastore.preferences.protobuf.JavaFeaturesProto$JavaFeaturesOrBuilder
        public boolean hasUtf8Validation() {
            return ((JavaFeaturesProto$JavaFeatures) this.instance).hasUtf8Validation();
        }

        public Builder setLegacyClosedEnum(boolean z10) {
            copyOnWrite();
            ((JavaFeaturesProto$JavaFeatures) this.instance).setLegacyClosedEnum(z10);
            return this;
        }

        public Builder setUtf8Validation(a aVar) {
            copyOnWrite();
            ((JavaFeaturesProto$JavaFeatures) this.instance).setUtf8Validation(aVar);
            return this;
        }

        private Builder() {
            super(JavaFeaturesProto$JavaFeatures.DEFAULT_INSTANCE);
        }
    }

    public enum a implements d0.c {
        UTF8_VALIDATION_UNKNOWN(0),
        DEFAULT(1),
        VERIFY(2);


        /* renamed from: a, reason: collision with root package name */
        public final int f1937a;

        /* renamed from: androidx.datastore.preferences.protobuf.JavaFeaturesProto$JavaFeatures$a$a, reason: collision with other inner class name */
        public static final class C0026a implements d0.e {

            /* renamed from: a, reason: collision with root package name */
            public static final C0026a f1938a = new C0026a();

            @Override // androidx.datastore.preferences.protobuf.d0.e
            public final boolean isInRange(int i10) {
                return a.a(i10) != null;
            }
        }

        a(int i10) {
            this.f1937a = i10;
        }

        public static a a(int i10) {
            if (i10 == 0) {
                return UTF8_VALIDATION_UNKNOWN;
            }
            if (i10 == 1) {
                return DEFAULT;
            }
            if (i10 != 2) {
                return null;
            }
            return VERIFY;
        }

        @Override // androidx.datastore.preferences.protobuf.d0.c
        public final int getNumber() {
            return this.f1937a;
        }
    }

    static {
        JavaFeaturesProto$JavaFeatures javaFeaturesProto$JavaFeatures = new JavaFeaturesProto$JavaFeatures();
        DEFAULT_INSTANCE = javaFeaturesProto$JavaFeatures;
        GeneratedMessageLite.registerDefaultInstance(JavaFeaturesProto$JavaFeatures.class, javaFeaturesProto$JavaFeatures);
    }

    private JavaFeaturesProto$JavaFeatures() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearLegacyClosedEnum() {
        this.bitField0_ &= -2;
        this.legacyClosedEnum_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearUtf8Validation() {
        this.bitField0_ &= -3;
        this.utf8Validation_ = 0;
    }

    public static JavaFeaturesProto$JavaFeatures getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static JavaFeaturesProto$JavaFeatures parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (JavaFeaturesProto$JavaFeatures) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static JavaFeaturesProto$JavaFeatures parseFrom(ByteBuffer byteBuffer) throws e0 {
        return (JavaFeaturesProto$JavaFeatures) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static h1<JavaFeaturesProto$JavaFeatures> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLegacyClosedEnum(boolean z10) {
        this.bitField0_ |= 1;
        this.legacyClosedEnum_ = z10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setUtf8Validation(a aVar) {
        this.utf8Validation_ = aVar.f1937a;
        this.bitField0_ |= 2;
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
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဇ\u0000\u0002᠌\u0001", new Object[]{"bitField0_", "legacyClosedEnum_", "utf8Validation_", a.C0026a.f1938a});
            case 3:
                return new JavaFeaturesProto$JavaFeatures();
            case 4:
                return new Builder();
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                h1<JavaFeaturesProto$JavaFeatures> h1Var = PARSER;
                if (h1Var != null) {
                    return h1Var;
                }
                synchronized (JavaFeaturesProto$JavaFeatures.class) {
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

    @Override // androidx.datastore.preferences.protobuf.JavaFeaturesProto$JavaFeaturesOrBuilder
    public boolean getLegacyClosedEnum() {
        return this.legacyClosedEnum_;
    }

    @Override // androidx.datastore.preferences.protobuf.JavaFeaturesProto$JavaFeaturesOrBuilder
    public a getUtf8Validation() {
        a aVarA = a.a(this.utf8Validation_);
        return aVarA == null ? a.UTF8_VALIDATION_UNKNOWN : aVarA;
    }

    @Override // androidx.datastore.preferences.protobuf.JavaFeaturesProto$JavaFeaturesOrBuilder
    public boolean hasLegacyClosedEnum() {
        return (this.bitField0_ & 1) != 0;
    }

    @Override // androidx.datastore.preferences.protobuf.JavaFeaturesProto$JavaFeaturesOrBuilder
    public boolean hasUtf8Validation() {
        return (this.bitField0_ & 2) != 0;
    }

    public static Builder newBuilder(JavaFeaturesProto$JavaFeatures javaFeaturesProto$JavaFeatures) {
        return DEFAULT_INSTANCE.createBuilder(javaFeaturesProto$JavaFeatures);
    }

    public static JavaFeaturesProto$JavaFeatures parseDelimitedFrom(InputStream inputStream, t tVar) throws IOException {
        return (JavaFeaturesProto$JavaFeatures) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, tVar);
    }

    public static JavaFeaturesProto$JavaFeatures parseFrom(ByteBuffer byteBuffer, t tVar) throws e0 {
        return (JavaFeaturesProto$JavaFeatures) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, tVar);
    }

    public static JavaFeaturesProto$JavaFeatures parseFrom(j jVar) throws e0 {
        return (JavaFeaturesProto$JavaFeatures) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, jVar);
    }

    public static JavaFeaturesProto$JavaFeatures parseFrom(j jVar, t tVar) throws e0 {
        return (JavaFeaturesProto$JavaFeatures) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, jVar, tVar);
    }

    public static JavaFeaturesProto$JavaFeatures parseFrom(byte[] bArr) throws e0 {
        return (JavaFeaturesProto$JavaFeatures) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static JavaFeaturesProto$JavaFeatures parseFrom(byte[] bArr, t tVar) throws e0 {
        return (JavaFeaturesProto$JavaFeatures) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, tVar);
    }

    public static JavaFeaturesProto$JavaFeatures parseFrom(InputStream inputStream) throws IOException {
        return (JavaFeaturesProto$JavaFeatures) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static JavaFeaturesProto$JavaFeatures parseFrom(InputStream inputStream, t tVar) throws IOException {
        return (JavaFeaturesProto$JavaFeatures) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, tVar);
    }

    public static JavaFeaturesProto$JavaFeatures parseFrom(k kVar) throws IOException {
        return (JavaFeaturesProto$JavaFeatures) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, kVar);
    }

    public static JavaFeaturesProto$JavaFeatures parseFrom(k kVar, t tVar) throws IOException {
        return (JavaFeaturesProto$JavaFeatures) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, kVar, tVar);
    }
}
