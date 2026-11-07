package ed;

import com.google.crypto.tink.shaded.protobuf.d1;
import com.google.crypto.tink.shaded.protobuf.e1;
import com.google.crypto.tink.shaded.protobuf.w;
import com.google.crypto.tink.shaded.protobuf.y;
import com.google.crypto.tink.shaded.protobuf.z0;

@Deprecated
/* loaded from: classes2.dex */
public final class p0 extends com.google.crypto.tink.shaded.protobuf.w<p0, a> implements com.google.crypto.tink.shaded.protobuf.q0 {
    public static final int CONFIG_NAME_FIELD_NUMBER = 1;
    private static final p0 DEFAULT_INSTANCE;
    public static final int ENTRY_FIELD_NUMBER = 2;
    private static volatile z0<p0> PARSER;
    private String configName_ = "";
    private y.c<h0> entry_ = d1.f6644d;

    public static final class a extends w.a<p0, a> implements com.google.crypto.tink.shaded.protobuf.q0 {
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
        p0 p0Var = new p0();
        DEFAULT_INSTANCE = p0Var;
        com.google.crypto.tink.shaded.protobuf.w.t(p0.class, p0Var);
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
                return new e1(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001Ȉ\u0002\u001b", new Object[]{"configName_", "entry_", h0.class});
            case 3:
                return new p0();
            case 4:
                return new a(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                z0<p0> z0Var = PARSER;
                if (z0Var != null) {
                    return z0Var;
                }
                synchronized (p0.class) {
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
