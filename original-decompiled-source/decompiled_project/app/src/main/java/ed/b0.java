package ed;

import com.google.crypto.tink.shaded.protobuf.e1;
import com.google.crypto.tink.shaded.protobuf.h;
import com.google.crypto.tink.shaded.protobuf.w;
import com.google.crypto.tink.shaded.protobuf.z0;

/* loaded from: classes2.dex */
public final class b0 extends com.google.crypto.tink.shaded.protobuf.w<b0, a> implements com.google.crypto.tink.shaded.protobuf.q0 {
    private static final b0 DEFAULT_INSTANCE;
    public static final int KEY_VALUE_FIELD_NUMBER = 3;
    public static final int PARAMS_FIELD_NUMBER = 2;
    private static volatile z0<b0> PARSER = null;
    public static final int VERSION_FIELD_NUMBER = 1;
    private com.google.crypto.tink.shaded.protobuf.h keyValue_ = com.google.crypto.tink.shaded.protobuf.h.f6665b;
    private d0 params_;
    private int version_;

    public static final class a extends w.a<b0, a> implements com.google.crypto.tink.shaded.protobuf.q0 {
        public a() {
            super(b0.DEFAULT_INSTANCE);
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
        b0 b0Var = new b0();
        DEFAULT_INSTANCE = b0Var;
        com.google.crypto.tink.shaded.protobuf.w.t(b0.class, b0Var);
    }

    public static a D() {
        return DEFAULT_INSTANCE.h();
    }

    public static b0 E(com.google.crypto.tink.shaded.protobuf.h hVar, com.google.crypto.tink.shaded.protobuf.o oVar) throws com.google.crypto.tink.shaded.protobuf.z {
        return (b0) com.google.crypto.tink.shaded.protobuf.w.r(DEFAULT_INSTANCE, hVar, oVar);
    }

    public static void w(b0 b0Var) {
        b0Var.version_ = 0;
    }

    public static void x(b0 b0Var, d0 d0Var) {
        b0Var.getClass();
        d0Var.getClass();
        b0Var.params_ = d0Var;
    }

    public static void y(b0 b0Var, h.f fVar) {
        b0Var.getClass();
        b0Var.keyValue_ = fVar;
    }

    public static b0 z() {
        return DEFAULT_INSTANCE;
    }

    public final com.google.crypto.tink.shaded.protobuf.h A() {
        return this.keyValue_;
    }

    public final d0 B() {
        d0 d0Var = this.params_;
        return d0Var == null ? d0.y() : d0Var;
    }

    public final int C() {
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
                return new e1(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002\t\u0003\n", new Object[]{"version_", "params_", "keyValue_"});
            case 3:
                return new b0();
            case 4:
                return new a();
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                z0<b0> z0Var = PARSER;
                if (z0Var != null) {
                    return z0Var;
                }
                synchronized (b0.class) {
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
