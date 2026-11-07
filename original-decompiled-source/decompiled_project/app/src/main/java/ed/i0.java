package ed;

import com.google.crypto.tink.shaded.protobuf.c1;
import com.google.crypto.tink.shaded.protobuf.d1;
import com.google.crypto.tink.shaded.protobuf.e;
import com.google.crypto.tink.shaded.protobuf.e1;
import com.google.crypto.tink.shaded.protobuf.g1;
import com.google.crypto.tink.shaded.protobuf.i;
import com.google.crypto.tink.shaded.protobuf.m1;
import com.google.crypto.tink.shaded.protobuf.w;
import com.google.crypto.tink.shaded.protobuf.y;
import com.google.crypto.tink.shaded.protobuf.z0;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.util.List;

/* loaded from: classes2.dex */
public final class i0 extends com.google.crypto.tink.shaded.protobuf.w<i0, a> implements com.google.crypto.tink.shaded.protobuf.q0 {
    private static final i0 DEFAULT_INSTANCE;
    public static final int KEY_FIELD_NUMBER = 2;
    private static volatile z0<i0> PARSER = null;
    public static final int PRIMARY_KEY_ID_FIELD_NUMBER = 1;
    private y.c<b> key_ = d1.f6644d;
    private int primaryKeyId_;

    public static final class a extends w.a<i0, a> implements com.google.crypto.tink.shaded.protobuf.q0 {
        public a() {
            super(i0.DEFAULT_INSTANCE);
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

    public static final class b extends com.google.crypto.tink.shaded.protobuf.w<b, a> implements com.google.crypto.tink.shaded.protobuf.q0 {
        private static final b DEFAULT_INSTANCE;
        public static final int KEY_DATA_FIELD_NUMBER = 1;
        public static final int KEY_ID_FIELD_NUMBER = 3;
        public static final int OUTPUT_PREFIX_TYPE_FIELD_NUMBER = 4;
        private static volatile z0<b> PARSER = null;
        public static final int STATUS_FIELD_NUMBER = 2;
        private e0 keyData_;
        private int keyId_;
        private int outputPrefixType_;
        private int status_;

        public static final class a extends w.a<b, a> implements com.google.crypto.tink.shaded.protobuf.q0 {
            public a() {
                super(b.DEFAULT_INSTANCE);
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
            b bVar = new b();
            DEFAULT_INSTANCE = bVar;
            com.google.crypto.tink.shaded.protobuf.w.t(b.class, bVar);
        }

        public static a F() {
            return DEFAULT_INSTANCE.h();
        }

        public static void w(b bVar, e0 e0Var) {
            bVar.getClass();
            bVar.keyData_ = e0Var;
        }

        public static void x(b bVar, o0 o0Var) {
            bVar.getClass();
            bVar.outputPrefixType_ = o0Var.getNumber();
        }

        public static void y(b bVar) {
            bVar.getClass();
            bVar.status_ = f0.ENABLED.getNumber();
        }

        public static void z(b bVar, int i10) {
            bVar.keyId_ = i10;
        }

        public final e0 A() {
            e0 e0Var = this.keyData_;
            return e0Var == null ? e0.z() : e0Var;
        }

        public final int B() {
            return this.keyId_;
        }

        public final o0 C() {
            o0 o0VarA = o0.a(this.outputPrefixType_);
            return o0VarA == null ? o0.UNRECOGNIZED : o0VarA;
        }

        public final f0 D() {
            int i10 = this.status_;
            f0 f0Var = i10 != 0 ? i10 != 1 ? i10 != 2 ? i10 != 3 ? null : f0.DESTROYED : f0.DISABLED : f0.ENABLED : f0.UNKNOWN_STATUS;
            return f0Var == null ? f0.UNRECOGNIZED : f0Var;
        }

        public final boolean E() {
            return this.keyData_ != null;
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
                    return new e1(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001\t\u0002\f\u0003\u000b\u0004\f", new Object[]{"keyData_", "status_", "keyId_", "outputPrefixType_"});
                case 3:
                    return new b();
                case 4:
                    return new a();
                case 5:
                    return DEFAULT_INSTANCE;
                case 6:
                    z0<b> z0Var = PARSER;
                    if (z0Var != null) {
                        return z0Var;
                    }
                    synchronized (b.class) {
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

    static {
        i0 i0Var = new i0();
        DEFAULT_INSTANCE = i0Var;
        com.google.crypto.tink.shaded.protobuf.w.t(i0.class, i0Var);
    }

    public static a C() {
        return DEFAULT_INSTANCE.h();
    }

    public static i0 D(ByteArrayInputStream byteArrayInputStream, com.google.crypto.tink.shaded.protobuf.o oVar) throws IOException {
        com.google.crypto.tink.shaded.protobuf.w wVarS = com.google.crypto.tink.shaded.protobuf.w.s(DEFAULT_INSTANCE, new i.b(byteArrayInputStream), oVar);
        com.google.crypto.tink.shaded.protobuf.w.g(wVarS);
        return (i0) wVarS;
    }

    public static i0 E(byte[] bArr, com.google.crypto.tink.shaded.protobuf.o oVar) throws com.google.crypto.tink.shaded.protobuf.z {
        i0 i0Var = DEFAULT_INSTANCE;
        int length = bArr.length;
        i0 i0VarQ = i0Var.q();
        try {
            c1 c1Var = c1.f6638c;
            c1Var.getClass();
            g1 g1VarA = c1Var.a(i0VarQ.getClass());
            g1VarA.c(i0VarQ, bArr, 0, length, new e.a(oVar));
            g1VarA.makeImmutable(i0VarQ);
            com.google.crypto.tink.shaded.protobuf.w.g(i0VarQ);
            return i0VarQ;
        } catch (m1 e10) {
            throw new com.google.crypto.tink.shaded.protobuf.z(e10.getMessage());
        } catch (com.google.crypto.tink.shaded.protobuf.z e11) {
            if (e11.f6822a) {
                throw new com.google.crypto.tink.shaded.protobuf.z(e11.getMessage(), e11);
            }
            throw e11;
        } catch (IOException e12) {
            if (e12.getCause() instanceof com.google.crypto.tink.shaded.protobuf.z) {
                throw ((com.google.crypto.tink.shaded.protobuf.z) e12.getCause());
            }
            throw new com.google.crypto.tink.shaded.protobuf.z(e12.getMessage(), e12);
        } catch (IndexOutOfBoundsException unused) {
            throw com.google.crypto.tink.shaded.protobuf.z.g();
        }
    }

    public static void w(i0 i0Var, int i10) {
        i0Var.primaryKeyId_ = i10;
    }

    public static void x(i0 i0Var, b bVar) {
        i0Var.getClass();
        y.c<b> cVar = i0Var.key_;
        if (!cVar.isModifiable()) {
            int size = cVar.size();
            i0Var.key_ = cVar.mutableCopyWithCapacity(size == 0 ? 10 : size * 2);
        }
        i0Var.key_.add(bVar);
    }

    public final List<b> A() {
        return this.key_;
    }

    public final int B() {
        return this.primaryKeyId_;
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
                return new e1(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u000b\u0002\u001b", new Object[]{"primaryKeyId_", "key_", b.class});
            case 3:
                return new i0();
            case 4:
                return new a();
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                z0<i0> z0Var = PARSER;
                if (z0Var != null) {
                    return z0Var;
                }
                synchronized (i0.class) {
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

    public final b y(int i10) {
        return this.key_.get(i10);
    }

    public final int z() {
        return this.key_.size();
    }
}
