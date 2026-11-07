package ed;

import com.google.crypto.tink.shaded.protobuf.e1;
import com.google.crypto.tink.shaded.protobuf.h;
import com.google.crypto.tink.shaded.protobuf.w;
import com.google.crypto.tink.shaded.protobuf.z0;

/* loaded from: classes2.dex */
public final class a extends com.google.crypto.tink.shaded.protobuf.w<a, C0089a> implements com.google.crypto.tink.shaded.protobuf.q0 {
    private static final a DEFAULT_INSTANCE;
    public static final int KEY_VALUE_FIELD_NUMBER = 2;
    public static final int PARAMS_FIELD_NUMBER = 3;
    private static volatile z0<a> PARSER = null;
    public static final int VERSION_FIELD_NUMBER = 1;
    private com.google.crypto.tink.shaded.protobuf.h keyValue_ = com.google.crypto.tink.shaded.protobuf.h.f6665b;
    private c params_;
    private int version_;

    /* renamed from: ed.a$a, reason: collision with other inner class name */
    public static final class C0089a extends w.a<a, C0089a> implements com.google.crypto.tink.shaded.protobuf.q0 {
        public C0089a() {
            super(a.DEFAULT_INSTANCE);
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
        a aVar = new a();
        DEFAULT_INSTANCE = aVar;
        com.google.crypto.tink.shaded.protobuf.w.t(a.class, aVar);
    }

    public static C0089a C() {
        return DEFAULT_INSTANCE.h();
    }

    public static a D(com.google.crypto.tink.shaded.protobuf.h hVar, com.google.crypto.tink.shaded.protobuf.o oVar) throws com.google.crypto.tink.shaded.protobuf.z {
        return (a) com.google.crypto.tink.shaded.protobuf.w.r(DEFAULT_INSTANCE, hVar, oVar);
    }

    public static void w(a aVar) {
        aVar.version_ = 0;
    }

    public static void x(a aVar, h.f fVar) {
        aVar.getClass();
        aVar.keyValue_ = fVar;
    }

    public static void y(a aVar, c cVar) {
        aVar.getClass();
        cVar.getClass();
        aVar.params_ = cVar;
    }

    public final c A() {
        c cVar = this.params_;
        return cVar == null ? c.x() : cVar;
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
                return new e1(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002\n\u0003\t", new Object[]{"version_", "keyValue_", "params_"});
            case 3:
                return new a();
            case 4:
                return new C0089a();
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                z0<a> z0Var = PARSER;
                if (z0Var != null) {
                    return z0Var;
                }
                synchronized (a.class) {
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
