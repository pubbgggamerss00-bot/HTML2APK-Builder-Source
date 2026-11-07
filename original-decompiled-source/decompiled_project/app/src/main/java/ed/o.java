package ed;

import com.google.crypto.tink.shaded.protobuf.e1;
import com.google.crypto.tink.shaded.protobuf.h;
import com.google.crypto.tink.shaded.protobuf.w;
import com.google.crypto.tink.shaded.protobuf.z0;

/* loaded from: classes2.dex */
public final class o extends com.google.crypto.tink.shaded.protobuf.w<o, a> implements com.google.crypto.tink.shaded.protobuf.q0 {
    private static final o DEFAULT_INSTANCE;
    public static final int KEY_VALUE_FIELD_NUMBER = 3;
    public static final int PARAMS_FIELD_NUMBER = 2;
    private static volatile z0<o> PARSER = null;
    public static final int VERSION_FIELD_NUMBER = 1;
    private com.google.crypto.tink.shaded.protobuf.h keyValue_ = com.google.crypto.tink.shaded.protobuf.h.f6665b;
    private q params_;
    private int version_;

    public static final class a extends w.a<o, a> implements com.google.crypto.tink.shaded.protobuf.q0 {
        public a() {
            super(o.DEFAULT_INSTANCE);
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
        o oVar = new o();
        DEFAULT_INSTANCE = oVar;
        com.google.crypto.tink.shaded.protobuf.w.t(o.class, oVar);
    }

    public static a C() {
        return DEFAULT_INSTANCE.h();
    }

    public static o D(com.google.crypto.tink.shaded.protobuf.h hVar, com.google.crypto.tink.shaded.protobuf.o oVar) throws com.google.crypto.tink.shaded.protobuf.z {
        return (o) com.google.crypto.tink.shaded.protobuf.w.r(DEFAULT_INSTANCE, hVar, oVar);
    }

    public static void w(o oVar) {
        oVar.version_ = 0;
    }

    public static void x(o oVar, q qVar) {
        oVar.getClass();
        qVar.getClass();
        oVar.params_ = qVar;
    }

    public static void y(o oVar, h.f fVar) {
        oVar.getClass();
        oVar.keyValue_ = fVar;
    }

    public final q A() {
        q qVar = this.params_;
        return qVar == null ? q.A() : qVar;
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
                return new e1(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002\t\u0003\n", new Object[]{"version_", "params_", "keyValue_"});
            case 3:
                return new o();
            case 4:
                return new a();
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                z0<o> z0Var = PARSER;
                if (z0Var != null) {
                    return z0Var;
                }
                synchronized (o.class) {
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

    public final com.google.crypto.tink.shaded.protobuf.h z() {
        return this.keyValue_;
    }
}
