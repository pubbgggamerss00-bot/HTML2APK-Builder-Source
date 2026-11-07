package ed;

import com.google.crypto.tink.shaded.protobuf.e1;
import com.google.crypto.tink.shaded.protobuf.w;
import com.google.crypto.tink.shaded.protobuf.z0;

/* loaded from: classes2.dex */
public final class d extends com.google.crypto.tink.shaded.protobuf.w<d, a> implements com.google.crypto.tink.shaded.protobuf.q0 {
    public static final int AES_CTR_KEY_FIELD_NUMBER = 2;
    private static final d DEFAULT_INSTANCE;
    public static final int HMAC_KEY_FIELD_NUMBER = 3;
    private static volatile z0<d> PARSER = null;
    public static final int VERSION_FIELD_NUMBER = 1;
    private i aesCtrKey_;
    private b0 hmacKey_;
    private int version_;

    public static final class a extends w.a<d, a> implements com.google.crypto.tink.shaded.protobuf.q0 {
        public a() {
            super(d.DEFAULT_INSTANCE);
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
        d dVar = new d();
        DEFAULT_INSTANCE = dVar;
        com.google.crypto.tink.shaded.protobuf.w.t(d.class, dVar);
    }

    public static a C() {
        return DEFAULT_INSTANCE.h();
    }

    public static d D(com.google.crypto.tink.shaded.protobuf.h hVar, com.google.crypto.tink.shaded.protobuf.o oVar) throws com.google.crypto.tink.shaded.protobuf.z {
        return (d) com.google.crypto.tink.shaded.protobuf.w.r(DEFAULT_INSTANCE, hVar, oVar);
    }

    public static void w(d dVar) {
        dVar.version_ = 0;
    }

    public static void x(d dVar, i iVar) {
        dVar.getClass();
        iVar.getClass();
        dVar.aesCtrKey_ = iVar;
    }

    public static void y(d dVar, b0 b0Var) {
        dVar.getClass();
        b0Var.getClass();
        dVar.hmacKey_ = b0Var;
    }

    public final b0 A() {
        b0 b0Var = this.hmacKey_;
        return b0Var == null ? b0.z() : b0Var;
    }

    public final int B() {
        return this.version_;
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
                return new e1(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002\t\u0003\t", new Object[]{"version_", "aesCtrKey_", "hmacKey_"});
            case 3:
                return new d();
            case 4:
                return new a();
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                z0<d> z0Var = PARSER;
                if (z0Var != null) {
                    return z0Var;
                }
                synchronized (d.class) {
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

    public final i z() {
        i iVar = this.aesCtrKey_;
        return iVar == null ? i.z() : iVar;
    }
}
