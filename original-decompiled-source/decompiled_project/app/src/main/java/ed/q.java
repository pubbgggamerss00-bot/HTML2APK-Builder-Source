package ed;

import com.google.crypto.tink.shaded.protobuf.e1;
import com.google.crypto.tink.shaded.protobuf.w;
import com.google.crypto.tink.shaded.protobuf.z0;

/* loaded from: classes2.dex */
public final class q extends com.google.crypto.tink.shaded.protobuf.w<q, a> implements com.google.crypto.tink.shaded.protobuf.q0 {
    public static final int CIPHERTEXT_SEGMENT_SIZE_FIELD_NUMBER = 1;
    private static final q DEFAULT_INSTANCE;
    public static final int DERIVED_KEY_SIZE_FIELD_NUMBER = 2;
    public static final int HKDF_HASH_TYPE_FIELD_NUMBER = 3;
    private static volatile z0<q> PARSER;
    private int ciphertextSegmentSize_;
    private int derivedKeySize_;
    private int hkdfHashType_;

    public static final class a extends w.a<q, a> implements com.google.crypto.tink.shaded.protobuf.q0 {
        public a() {
            super(q.DEFAULT_INSTANCE);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.w.a, com.google.crypto.tink.shaded.protobuf.p0.a
        public final /* bridge */ /* synthetic */ com.google.crypto.tink.shaded.protobuf.w buildPartial() {
            return buildPartial();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.w.a
        public final /* bridge */ /* synthetic */ Object clone() throws CloneNotSupportedException {
            return clone();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.w.a, com.google.crypto.tink.shaded.protobuf.q0
        public final com.google.crypto.tink.shaded.protobuf.w getDefaultInstanceForType() {
            return this.f6807a;
        }
    }

    static {
        q qVar = new q();
        DEFAULT_INSTANCE = qVar;
        com.google.crypto.tink.shaded.protobuf.w.t(q.class, qVar);
    }

    public static q A() {
        return DEFAULT_INSTANCE;
    }

    public static a D() {
        return DEFAULT_INSTANCE.h();
    }

    public static void w(q qVar, int i10) {
        qVar.ciphertextSegmentSize_ = i10;
    }

    public static void x(q qVar, int i10) {
        qVar.derivedKeySize_ = i10;
    }

    public static void y(q qVar) {
        qVar.getClass();
        qVar.hkdfHashType_ = a0.SHA256.getNumber();
    }

    public final int B() {
        return this.derivedKeySize_;
    }

    public final a0 C() {
        a0 a0VarA = a0.a(this.hkdfHashType_);
        return a0VarA == null ? a0.UNRECOGNIZED : a0VarA;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.w, com.google.crypto.tink.shaded.protobuf.q0
    public final /* bridge */ /* synthetic */ com.google.crypto.tink.shaded.protobuf.w getDefaultInstanceForType() {
        return getDefaultInstanceForType();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.w
    public final Object i(w.f fVar) {
        z0 bVar;
        switch (fVar.ordinal()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return new e1(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002\u000b\u0003\f", new Object[]{"ciphertextSegmentSize_", "derivedKeySize_", "hkdfHashType_"});
            case 3:
                return new q();
            case 4:
                return new a();
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                z0<q> z0Var = PARSER;
                if (z0Var != null) {
                    return z0Var;
                }
                synchronized (q.class) {
                    try {
                        bVar = PARSER;
                        if (bVar == null) {
                            bVar = new w.b();
                            PARSER = bVar;
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                return bVar;
            default:
                throw new UnsupportedOperationException();
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.w, com.google.crypto.tink.shaded.protobuf.p0
    public final /* bridge */ /* synthetic */ w.a newBuilderForType() {
        return newBuilderForType();
    }

    public final int z() {
        return this.ciphertextSegmentSize_;
    }
}
