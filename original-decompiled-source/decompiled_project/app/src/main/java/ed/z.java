package ed;

import com.google.crypto.tink.shaded.protobuf.e1;
import com.google.crypto.tink.shaded.protobuf.h;
import com.google.crypto.tink.shaded.protobuf.i;
import com.google.crypto.tink.shaded.protobuf.w;
import com.google.crypto.tink.shaded.protobuf.z0;
import java.io.ByteArrayInputStream;
import java.io.IOException;

/* loaded from: classes2.dex */
public final class z extends com.google.crypto.tink.shaded.protobuf.w<z, a> implements com.google.crypto.tink.shaded.protobuf.q0 {
    private static final z DEFAULT_INSTANCE;
    public static final int ENCRYPTED_KEYSET_FIELD_NUMBER = 2;
    public static final int KEYSET_INFO_FIELD_NUMBER = 3;
    private static volatile z0<z> PARSER;
    private com.google.crypto.tink.shaded.protobuf.h encryptedKeyset_ = com.google.crypto.tink.shaded.protobuf.h.f6665b;
    private j0 keysetInfo_;

    public static final class a extends w.a<z, a> implements com.google.crypto.tink.shaded.protobuf.q0 {
        public a() {
            super(z.DEFAULT_INSTANCE);
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
        z zVar = new z();
        DEFAULT_INSTANCE = zVar;
        com.google.crypto.tink.shaded.protobuf.w.t(z.class, zVar);
    }

    public static z A(ByteArrayInputStream byteArrayInputStream, com.google.crypto.tink.shaded.protobuf.o oVar) throws IOException {
        com.google.crypto.tink.shaded.protobuf.w wVarS = com.google.crypto.tink.shaded.protobuf.w.s(DEFAULT_INSTANCE, new i.b(byteArrayInputStream), oVar);
        com.google.crypto.tink.shaded.protobuf.w.g(wVarS);
        return (z) wVarS;
    }

    public static void w(z zVar, h.f fVar) {
        zVar.getClass();
        zVar.encryptedKeyset_ = fVar;
    }

    public static void x(z zVar, j0 j0Var) {
        zVar.getClass();
        zVar.keysetInfo_ = j0Var;
    }

    public static a z() {
        return DEFAULT_INSTANCE.h();
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
                return new e1(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0002\u0003\u0002\u0000\u0000\u0000\u0002\n\u0003\t", new Object[]{"encryptedKeyset_", "keysetInfo_"});
            case 3:
                return new z();
            case 4:
                return new a();
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                z0<z> z0Var = PARSER;
                if (z0Var != null) {
                    return z0Var;
                }
                synchronized (z.class) {
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

    public final com.google.crypto.tink.shaded.protobuf.h y() {
        return this.encryptedKeyset_;
    }
}
