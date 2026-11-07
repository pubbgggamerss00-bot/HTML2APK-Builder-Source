package ed;

import com.google.crypto.tink.shaded.protobuf.e1;
import com.google.crypto.tink.shaded.protobuf.w;
import com.google.crypto.tink.shaded.protobuf.z0;

/* loaded from: classes2.dex */
public final class c0 extends com.google.crypto.tink.shaded.protobuf.w<c0, a> implements com.google.crypto.tink.shaded.protobuf.q0 {
    private static final c0 DEFAULT_INSTANCE;
    public static final int KEY_SIZE_FIELD_NUMBER = 2;
    public static final int PARAMS_FIELD_NUMBER = 1;
    private static volatile z0<c0> PARSER = null;
    public static final int VERSION_FIELD_NUMBER = 3;
    private int keySize_;
    private d0 params_;
    private int version_;

    public static final class a extends w.a<c0, a> implements com.google.crypto.tink.shaded.protobuf.q0 {
        public a() {
            super(c0.DEFAULT_INSTANCE);
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
        c0 c0Var = new c0();
        DEFAULT_INSTANCE = c0Var;
        com.google.crypto.tink.shaded.protobuf.w.t(c0.class, c0Var);
    }

    public static a B() {
        return DEFAULT_INSTANCE.h();
    }

    public static c0 C(com.google.crypto.tink.shaded.protobuf.h hVar, com.google.crypto.tink.shaded.protobuf.o oVar) throws com.google.crypto.tink.shaded.protobuf.z {
        return (c0) com.google.crypto.tink.shaded.protobuf.w.r(DEFAULT_INSTANCE, hVar, oVar);
    }

    public static void w(c0 c0Var, d0 d0Var) {
        c0Var.getClass();
        c0Var.params_ = d0Var;
    }

    public static void x(c0 c0Var, int i10) {
        c0Var.keySize_ = i10;
    }

    public static c0 y() {
        return DEFAULT_INSTANCE;
    }

    public final d0 A() {
        d0 d0Var = this.params_;
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
                return new e1(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\t\u0002\u000b\u0003\u000b", new Object[]{"params_", "keySize_", "version_"});
            case 3:
                return new c0();
            case 4:
                return new a();
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                z0<c0> z0Var = PARSER;
                if (z0Var != null) {
                    return z0Var;
                }
                synchronized (c0.class) {
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
        return this.keySize_;
    }
}
