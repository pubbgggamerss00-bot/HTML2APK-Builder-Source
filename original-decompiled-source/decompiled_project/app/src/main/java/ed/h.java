package ed;

import com.google.crypto.tink.shaded.protobuf.e1;
import com.google.crypto.tink.shaded.protobuf.w;
import com.google.crypto.tink.shaded.protobuf.z0;

/* loaded from: classes2.dex */
public final class h extends com.google.crypto.tink.shaded.protobuf.w<h, a> implements com.google.crypto.tink.shaded.protobuf.q0 {
    public static final int CIPHERTEXT_SEGMENT_SIZE_FIELD_NUMBER = 1;
    private static final h DEFAULT_INSTANCE;
    public static final int DERIVED_KEY_SIZE_FIELD_NUMBER = 2;
    public static final int HKDF_HASH_TYPE_FIELD_NUMBER = 3;
    public static final int HMAC_PARAMS_FIELD_NUMBER = 4;
    private static volatile z0<h> PARSER;
    private int ciphertextSegmentSize_;
    private int derivedKeySize_;
    private int hkdfHashType_;
    private d0 hmacParams_;

    public static final class a extends w.a<h, a> implements com.google.crypto.tink.shaded.protobuf.q0 {
        public a() {
            super(h.DEFAULT_INSTANCE);
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
        h hVar = new h();
        DEFAULT_INSTANCE = hVar;
        com.google.crypto.tink.shaded.protobuf.w.t(h.class, hVar);
    }

    public static h B() {
        return DEFAULT_INSTANCE;
    }

    public static a F() {
        return DEFAULT_INSTANCE.h();
    }

    public static void w(h hVar, int i10) {
        hVar.ciphertextSegmentSize_ = i10;
    }

    public static void x(h hVar, int i10) {
        hVar.derivedKeySize_ = i10;
    }

    public static void y(h hVar) {
        hVar.getClass();
        hVar.hkdfHashType_ = a0.SHA256.getNumber();
    }

    public static void z(h hVar, d0 d0Var) {
        hVar.getClass();
        hVar.hmacParams_ = d0Var;
    }

    public final int A() {
        return this.ciphertextSegmentSize_;
    }

    public final int C() {
        return this.derivedKeySize_;
    }

    public final a0 D() {
        a0 a0VarA = a0.a(this.hkdfHashType_);
        return a0VarA == null ? a0.UNRECOGNIZED : a0VarA;
    }

    public final d0 E() {
        d0 d0Var = this.hmacParams_;
        return d0Var == null ? d0.y() : d0Var;
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
                return new e1(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001\u000b\u0002\u000b\u0003\f\u0004\t", new Object[]{"ciphertextSegmentSize_", "derivedKeySize_", "hkdfHashType_", "hmacParams_"});
            case 3:
                return new h();
            case 4:
                return new a();
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                z0<h> z0Var = PARSER;
                if (z0Var != null) {
                    return z0Var;
                }
                synchronized (h.class) {
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
}
