package ed;

import com.google.crypto.tink.shaded.protobuf.e1;
import com.google.crypto.tink.shaded.protobuf.h;
import com.google.crypto.tink.shaded.protobuf.w;
import com.google.crypto.tink.shaded.protobuf.z0;

/* loaded from: classes2.dex */
public final class g0 extends com.google.crypto.tink.shaded.protobuf.w<g0, a> implements com.google.crypto.tink.shaded.protobuf.q0 {
    private static final g0 DEFAULT_INSTANCE;
    public static final int OUTPUT_PREFIX_TYPE_FIELD_NUMBER = 3;
    private static volatile z0<g0> PARSER = null;
    public static final int TYPE_URL_FIELD_NUMBER = 1;
    public static final int VALUE_FIELD_NUMBER = 2;
    private int outputPrefixType_;
    private String typeUrl_ = "";
    private com.google.crypto.tink.shaded.protobuf.h value_ = com.google.crypto.tink.shaded.protobuf.h.f6665b;

    public static final class a extends w.a<g0, a> implements com.google.crypto.tink.shaded.protobuf.q0 {
        public a() {
            super(g0.DEFAULT_INSTANCE);
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
        g0 g0Var = new g0();
        DEFAULT_INSTANCE = g0Var;
        com.google.crypto.tink.shaded.protobuf.w.t(g0.class, g0Var);
    }

    public static a D() {
        return DEFAULT_INSTANCE.h();
    }

    public static void w(g0 g0Var, String str) {
        g0Var.getClass();
        str.getClass();
        g0Var.typeUrl_ = str;
    }

    public static void x(g0 g0Var, h.f fVar) {
        g0Var.getClass();
        g0Var.value_ = fVar;
    }

    public static void y(g0 g0Var, o0 o0Var) {
        g0Var.getClass();
        g0Var.outputPrefixType_ = o0Var.getNumber();
    }

    public static g0 z() {
        return DEFAULT_INSTANCE;
    }

    public final o0 A() {
        o0 o0VarA = o0.a(this.outputPrefixType_);
        return o0VarA == null ? o0.UNRECOGNIZED : o0VarA;
    }

    public final String B() {
        return this.typeUrl_;
    }

    public final com.google.crypto.tink.shaded.protobuf.h C() {
        return this.value_;
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
                return new e1(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002\n\u0003\f", new Object[]{"typeUrl_", "value_", "outputPrefixType_"});
            case 3:
                return new g0();
            case 4:
                return new a();
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                z0<g0> z0Var = PARSER;
                if (z0Var != null) {
                    return z0Var;
                }
                synchronized (g0.class) {
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
