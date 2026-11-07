package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.GeneratedMessageLite;
import androidx.datastore.preferences.protobuf.d0;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* loaded from: classes.dex */
public final class DescriptorProtos$FeatureSet extends GeneratedMessageLite.ExtendableMessage<DescriptorProtos$FeatureSet, Builder> implements DescriptorProtos$FeatureSetOrBuilder {
    private static final DescriptorProtos$FeatureSet DEFAULT_INSTANCE;
    public static final int ENUM_TYPE_FIELD_NUMBER = 2;
    public static final int FIELD_PRESENCE_FIELD_NUMBER = 1;
    public static final int JSON_FORMAT_FIELD_NUMBER = 6;
    public static final int MESSAGE_ENCODING_FIELD_NUMBER = 5;
    private static volatile h1<DescriptorProtos$FeatureSet> PARSER = null;
    public static final int REPEATED_FIELD_ENCODING_FIELD_NUMBER = 3;
    public static final int UTF8_VALIDATION_FIELD_NUMBER = 4;
    private int bitField0_;
    private int enumType_;
    private int fieldPresence_;
    private int jsonFormat_;
    private byte memoizedIsInitialized = 2;
    private int messageEncoding_;
    private int repeatedFieldEncoding_;
    private int utf8Validation_;

    public static final class Builder extends GeneratedMessageLite.ExtendableBuilder<DescriptorProtos$FeatureSet, Builder> implements DescriptorProtos$FeatureSetOrBuilder {
        public Builder clearEnumType() {
            copyOnWrite();
            ((DescriptorProtos$FeatureSet) this.instance).clearEnumType();
            return this;
        }

        public Builder clearFieldPresence() {
            copyOnWrite();
            ((DescriptorProtos$FeatureSet) this.instance).clearFieldPresence();
            return this;
        }

        public Builder clearJsonFormat() {
            copyOnWrite();
            ((DescriptorProtos$FeatureSet) this.instance).clearJsonFormat();
            return this;
        }

        public Builder clearMessageEncoding() {
            copyOnWrite();
            ((DescriptorProtos$FeatureSet) this.instance).clearMessageEncoding();
            return this;
        }

        public Builder clearRepeatedFieldEncoding() {
            copyOnWrite();
            ((DescriptorProtos$FeatureSet) this.instance).clearRepeatedFieldEncoding();
            return this;
        }

        public Builder clearUtf8Validation() {
            copyOnWrite();
            ((DescriptorProtos$FeatureSet) this.instance).clearUtf8Validation();
            return this;
        }

        @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$FeatureSetOrBuilder
        public a getEnumType() {
            return ((DescriptorProtos$FeatureSet) this.instance).getEnumType();
        }

        @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$FeatureSetOrBuilder
        public b getFieldPresence() {
            return ((DescriptorProtos$FeatureSet) this.instance).getFieldPresence();
        }

        @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$FeatureSetOrBuilder
        public c getJsonFormat() {
            return ((DescriptorProtos$FeatureSet) this.instance).getJsonFormat();
        }

        @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$FeatureSetOrBuilder
        public d getMessageEncoding() {
            return ((DescriptorProtos$FeatureSet) this.instance).getMessageEncoding();
        }

        @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$FeatureSetOrBuilder
        public e getRepeatedFieldEncoding() {
            return ((DescriptorProtos$FeatureSet) this.instance).getRepeatedFieldEncoding();
        }

        @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$FeatureSetOrBuilder
        public f getUtf8Validation() {
            return ((DescriptorProtos$FeatureSet) this.instance).getUtf8Validation();
        }

        @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$FeatureSetOrBuilder
        public boolean hasEnumType() {
            return ((DescriptorProtos$FeatureSet) this.instance).hasEnumType();
        }

        @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$FeatureSetOrBuilder
        public boolean hasFieldPresence() {
            return ((DescriptorProtos$FeatureSet) this.instance).hasFieldPresence();
        }

        @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$FeatureSetOrBuilder
        public boolean hasJsonFormat() {
            return ((DescriptorProtos$FeatureSet) this.instance).hasJsonFormat();
        }

        @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$FeatureSetOrBuilder
        public boolean hasMessageEncoding() {
            return ((DescriptorProtos$FeatureSet) this.instance).hasMessageEncoding();
        }

        @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$FeatureSetOrBuilder
        public boolean hasRepeatedFieldEncoding() {
            return ((DescriptorProtos$FeatureSet) this.instance).hasRepeatedFieldEncoding();
        }

        @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$FeatureSetOrBuilder
        public boolean hasUtf8Validation() {
            return ((DescriptorProtos$FeatureSet) this.instance).hasUtf8Validation();
        }

        public Builder setEnumType(a aVar) {
            copyOnWrite();
            ((DescriptorProtos$FeatureSet) this.instance).setEnumType(aVar);
            return this;
        }

        public Builder setFieldPresence(b bVar) {
            copyOnWrite();
            ((DescriptorProtos$FeatureSet) this.instance).setFieldPresence(bVar);
            return this;
        }

        public Builder setJsonFormat(c cVar) {
            copyOnWrite();
            ((DescriptorProtos$FeatureSet) this.instance).setJsonFormat(cVar);
            return this;
        }

        public Builder setMessageEncoding(d dVar) {
            copyOnWrite();
            ((DescriptorProtos$FeatureSet) this.instance).setMessageEncoding(dVar);
            return this;
        }

        public Builder setRepeatedFieldEncoding(e eVar) {
            copyOnWrite();
            ((DescriptorProtos$FeatureSet) this.instance).setRepeatedFieldEncoding(eVar);
            return this;
        }

        public Builder setUtf8Validation(f fVar) {
            copyOnWrite();
            ((DescriptorProtos$FeatureSet) this.instance).setUtf8Validation(fVar);
            return this;
        }

        private Builder() {
            super(DescriptorProtos$FeatureSet.DEFAULT_INSTANCE);
        }
    }

    public enum a implements d0.c {
        ENUM_TYPE_UNKNOWN(0),
        OPEN(1),
        CLOSED(2);


        /* renamed from: a, reason: collision with root package name */
        public final int f1778a;

        /* renamed from: androidx.datastore.preferences.protobuf.DescriptorProtos$FeatureSet$a$a, reason: collision with other inner class name */
        public static final class C0021a implements d0.e {

            /* renamed from: a, reason: collision with root package name */
            public static final C0021a f1779a = new C0021a();

            @Override // androidx.datastore.preferences.protobuf.d0.e
            public final boolean isInRange(int i10) {
                return a.a(i10) != null;
            }
        }

        a(int i10) {
            this.f1778a = i10;
        }

        public static a a(int i10) {
            if (i10 == 0) {
                return ENUM_TYPE_UNKNOWN;
            }
            if (i10 == 1) {
                return OPEN;
            }
            if (i10 != 2) {
                return null;
            }
            return CLOSED;
        }

        @Override // androidx.datastore.preferences.protobuf.d0.c
        public final int getNumber() {
            return this.f1778a;
        }
    }

    public enum b implements d0.c {
        FIELD_PRESENCE_UNKNOWN(0),
        EXPLICIT(1),
        IMPLICIT(2),
        LEGACY_REQUIRED(3);


        /* renamed from: a, reason: collision with root package name */
        public final int f1785a;

        public static final class a implements d0.e {

            /* renamed from: a, reason: collision with root package name */
            public static final a f1786a = new a();

            @Override // androidx.datastore.preferences.protobuf.d0.e
            public final boolean isInRange(int i10) {
                return b.a(i10) != null;
            }
        }

        b(int i10) {
            this.f1785a = i10;
        }

        public static b a(int i10) {
            if (i10 == 0) {
                return FIELD_PRESENCE_UNKNOWN;
            }
            if (i10 == 1) {
                return EXPLICIT;
            }
            if (i10 == 2) {
                return IMPLICIT;
            }
            if (i10 != 3) {
                return null;
            }
            return LEGACY_REQUIRED;
        }

        @Override // androidx.datastore.preferences.protobuf.d0.c
        public final int getNumber() {
            return this.f1785a;
        }
    }

    public enum c implements d0.c {
        JSON_FORMAT_UNKNOWN(0),
        ALLOW(1),
        LEGACY_BEST_EFFORT(2);


        /* renamed from: a, reason: collision with root package name */
        public final int f1791a;

        public static final class a implements d0.e {

            /* renamed from: a, reason: collision with root package name */
            public static final a f1792a = new a();

            @Override // androidx.datastore.preferences.protobuf.d0.e
            public final boolean isInRange(int i10) {
                return c.a(i10) != null;
            }
        }

        c(int i10) {
            this.f1791a = i10;
        }

        public static c a(int i10) {
            if (i10 == 0) {
                return JSON_FORMAT_UNKNOWN;
            }
            if (i10 == 1) {
                return ALLOW;
            }
            if (i10 != 2) {
                return null;
            }
            return LEGACY_BEST_EFFORT;
        }

        @Override // androidx.datastore.preferences.protobuf.d0.c
        public final int getNumber() {
            return this.f1791a;
        }
    }

    public enum d implements d0.c {
        MESSAGE_ENCODING_UNKNOWN(0),
        LENGTH_PREFIXED(1),
        DELIMITED(2);


        /* renamed from: a, reason: collision with root package name */
        public final int f1797a;

        public static final class a implements d0.e {

            /* renamed from: a, reason: collision with root package name */
            public static final a f1798a = new a();

            @Override // androidx.datastore.preferences.protobuf.d0.e
            public final boolean isInRange(int i10) {
                return d.a(i10) != null;
            }
        }

        d(int i10) {
            this.f1797a = i10;
        }

        public static d a(int i10) {
            if (i10 == 0) {
                return MESSAGE_ENCODING_UNKNOWN;
            }
            if (i10 == 1) {
                return LENGTH_PREFIXED;
            }
            if (i10 != 2) {
                return null;
            }
            return DELIMITED;
        }

        @Override // androidx.datastore.preferences.protobuf.d0.c
        public final int getNumber() {
            return this.f1797a;
        }
    }

    public enum e implements d0.c {
        REPEATED_FIELD_ENCODING_UNKNOWN(0),
        PACKED(1),
        EXPANDED(2);


        /* renamed from: a, reason: collision with root package name */
        public final int f1803a;

        public static final class a implements d0.e {

            /* renamed from: a, reason: collision with root package name */
            public static final a f1804a = new a();

            @Override // androidx.datastore.preferences.protobuf.d0.e
            public final boolean isInRange(int i10) {
                return e.a(i10) != null;
            }
        }

        e(int i10) {
            this.f1803a = i10;
        }

        public static e a(int i10) {
            if (i10 == 0) {
                return REPEATED_FIELD_ENCODING_UNKNOWN;
            }
            if (i10 == 1) {
                return PACKED;
            }
            if (i10 != 2) {
                return null;
            }
            return EXPANDED;
        }

        @Override // androidx.datastore.preferences.protobuf.d0.c
        public final int getNumber() {
            return this.f1803a;
        }
    }

    public enum f implements d0.c {
        UTF8_VALIDATION_UNKNOWN(0),
        VERIFY(2),
        NONE(3);


        /* renamed from: a, reason: collision with root package name */
        public final int f1809a;

        public static final class a implements d0.e {

            /* renamed from: a, reason: collision with root package name */
            public static final a f1810a = new a();

            @Override // androidx.datastore.preferences.protobuf.d0.e
            public final boolean isInRange(int i10) {
                return f.a(i10) != null;
            }
        }

        f(int i10) {
            this.f1809a = i10;
        }

        public static f a(int i10) {
            if (i10 == 0) {
                return UTF8_VALIDATION_UNKNOWN;
            }
            if (i10 == 2) {
                return VERIFY;
            }
            if (i10 != 3) {
                return null;
            }
            return NONE;
        }

        @Override // androidx.datastore.preferences.protobuf.d0.c
        public final int getNumber() {
            return this.f1809a;
        }
    }

    static {
        DescriptorProtos$FeatureSet descriptorProtos$FeatureSet = new DescriptorProtos$FeatureSet();
        DEFAULT_INSTANCE = descriptorProtos$FeatureSet;
        GeneratedMessageLite.registerDefaultInstance(DescriptorProtos$FeatureSet.class, descriptorProtos$FeatureSet);
    }

    private DescriptorProtos$FeatureSet() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearEnumType() {
        this.bitField0_ &= -3;
        this.enumType_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearFieldPresence() {
        this.bitField0_ &= -2;
        this.fieldPresence_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearJsonFormat() {
        this.bitField0_ &= -33;
        this.jsonFormat_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearMessageEncoding() {
        this.bitField0_ &= -17;
        this.messageEncoding_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearRepeatedFieldEncoding() {
        this.bitField0_ &= -5;
        this.repeatedFieldEncoding_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearUtf8Validation() {
        this.bitField0_ &= -9;
        this.utf8Validation_ = 0;
    }

    public static DescriptorProtos$FeatureSet getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static Builder newBuilder() {
        return (Builder) DEFAULT_INSTANCE.createBuilder();
    }

    public static DescriptorProtos$FeatureSet parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (DescriptorProtos$FeatureSet) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static DescriptorProtos$FeatureSet parseFrom(ByteBuffer byteBuffer) throws e0 {
        return (DescriptorProtos$FeatureSet) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static h1<DescriptorProtos$FeatureSet> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setEnumType(a aVar) {
        this.enumType_ = aVar.f1778a;
        this.bitField0_ |= 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setFieldPresence(b bVar) {
        this.fieldPresence_ = bVar.f1785a;
        this.bitField0_ |= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setJsonFormat(c cVar) {
        this.jsonFormat_ = cVar.f1791a;
        this.bitField0_ |= 32;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMessageEncoding(d dVar) {
        this.messageEncoding_ = dVar.f1797a;
        this.bitField0_ |= 16;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRepeatedFieldEncoding(e eVar) {
        this.repeatedFieldEncoding_ = eVar.f1803a;
        this.bitField0_ |= 4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setUtf8Validation(f fVar) {
        this.utf8Validation_ = fVar.f1809a;
        this.bitField0_ |= 8;
    }

    @Override // androidx.datastore.preferences.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.d dVar, Object obj, Object obj2) {
        h1 aVar;
        switch (dVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.memoizedIsInitialized);
            case 1:
                this.memoizedIsInitialized = (byte) (obj == null ? 0 : 1);
                return null;
            case 2:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001᠌\u0000\u0002᠌\u0001\u0003᠌\u0002\u0004᠌\u0003\u0005᠌\u0004\u0006᠌\u0005", new Object[]{"bitField0_", "fieldPresence_", b.a.f1786a, "enumType_", a.C0021a.f1779a, "repeatedFieldEncoding_", e.a.f1804a, "utf8Validation_", f.a.f1810a, "messageEncoding_", d.a.f1798a, "jsonFormat_", c.a.f1792a});
            case 3:
                return new DescriptorProtos$FeatureSet();
            case 4:
                return new Builder();
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                h1<DescriptorProtos$FeatureSet> h1Var = PARSER;
                if (h1Var != null) {
                    return h1Var;
                }
                synchronized (DescriptorProtos$FeatureSet.class) {
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

    @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$FeatureSetOrBuilder
    public a getEnumType() {
        a aVarA = a.a(this.enumType_);
        return aVarA == null ? a.ENUM_TYPE_UNKNOWN : aVarA;
    }

    @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$FeatureSetOrBuilder
    public b getFieldPresence() {
        b bVarA = b.a(this.fieldPresence_);
        return bVarA == null ? b.FIELD_PRESENCE_UNKNOWN : bVarA;
    }

    @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$FeatureSetOrBuilder
    public c getJsonFormat() {
        c cVarA = c.a(this.jsonFormat_);
        return cVarA == null ? c.JSON_FORMAT_UNKNOWN : cVarA;
    }

    @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$FeatureSetOrBuilder
    public d getMessageEncoding() {
        d dVarA = d.a(this.messageEncoding_);
        return dVarA == null ? d.MESSAGE_ENCODING_UNKNOWN : dVarA;
    }

    @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$FeatureSetOrBuilder
    public e getRepeatedFieldEncoding() {
        e eVarA = e.a(this.repeatedFieldEncoding_);
        return eVarA == null ? e.REPEATED_FIELD_ENCODING_UNKNOWN : eVarA;
    }

    @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$FeatureSetOrBuilder
    public f getUtf8Validation() {
        f fVarA = f.a(this.utf8Validation_);
        return fVarA == null ? f.UTF8_VALIDATION_UNKNOWN : fVarA;
    }

    @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$FeatureSetOrBuilder
    public boolean hasEnumType() {
        return (this.bitField0_ & 2) != 0;
    }

    @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$FeatureSetOrBuilder
    public boolean hasFieldPresence() {
        return (this.bitField0_ & 1) != 0;
    }

    @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$FeatureSetOrBuilder
    public boolean hasJsonFormat() {
        return (this.bitField0_ & 32) != 0;
    }

    @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$FeatureSetOrBuilder
    public boolean hasMessageEncoding() {
        return (this.bitField0_ & 16) != 0;
    }

    @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$FeatureSetOrBuilder
    public boolean hasRepeatedFieldEncoding() {
        return (this.bitField0_ & 4) != 0;
    }

    @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$FeatureSetOrBuilder
    public boolean hasUtf8Validation() {
        return (this.bitField0_ & 8) != 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static Builder newBuilder(DescriptorProtos$FeatureSet descriptorProtos$FeatureSet) {
        return (Builder) DEFAULT_INSTANCE.createBuilder(descriptorProtos$FeatureSet);
    }

    public static DescriptorProtos$FeatureSet parseDelimitedFrom(InputStream inputStream, t tVar) throws IOException {
        return (DescriptorProtos$FeatureSet) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, tVar);
    }

    public static DescriptorProtos$FeatureSet parseFrom(ByteBuffer byteBuffer, t tVar) throws e0 {
        return (DescriptorProtos$FeatureSet) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, tVar);
    }

    public static DescriptorProtos$FeatureSet parseFrom(j jVar) throws e0 {
        return (DescriptorProtos$FeatureSet) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, jVar);
    }

    public static DescriptorProtos$FeatureSet parseFrom(j jVar, t tVar) throws e0 {
        return (DescriptorProtos$FeatureSet) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, jVar, tVar);
    }

    public static DescriptorProtos$FeatureSet parseFrom(byte[] bArr) throws e0 {
        return (DescriptorProtos$FeatureSet) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static DescriptorProtos$FeatureSet parseFrom(byte[] bArr, t tVar) throws e0 {
        return (DescriptorProtos$FeatureSet) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, tVar);
    }

    public static DescriptorProtos$FeatureSet parseFrom(InputStream inputStream) throws IOException {
        return (DescriptorProtos$FeatureSet) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static DescriptorProtos$FeatureSet parseFrom(InputStream inputStream, t tVar) throws IOException {
        return (DescriptorProtos$FeatureSet) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, tVar);
    }

    public static DescriptorProtos$FeatureSet parseFrom(k kVar) throws IOException {
        return (DescriptorProtos$FeatureSet) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, kVar);
    }

    public static DescriptorProtos$FeatureSet parseFrom(k kVar, t tVar) throws IOException {
        return (DescriptorProtos$FeatureSet) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, kVar, tVar);
    }
}
