package ed;

import com.google.crypto.tink.shaded.protobuf.d1;
import com.google.crypto.tink.shaded.protobuf.e1;
import com.google.crypto.tink.shaded.protobuf.w;
import com.google.crypto.tink.shaded.protobuf.y;
import com.google.crypto.tink.shaded.protobuf.z0;

/* loaded from: classes2.dex */
public final class j0 extends com.google.crypto.tink.shaded.protobuf.w<j0, a> implements com.google.crypto.tink.shaded.protobuf.q0 {
    private static final j0 DEFAULT_INSTANCE;
    public static final int KEY_INFO_FIELD_NUMBER = 2;
    private static volatile z0<j0> PARSER = null;
    public static final int PRIMARY_KEY_ID_FIELD_NUMBER = 1;
    private y.c<b> keyInfo_ = d1.f6644d;
    private int primaryKeyId_;

    public static final class a extends w.a<j0, a> implements com.google.crypto.tink.shaded.protobuf.q0 {
        public a() {
            super(j0.DEFAULT_INSTANCE);
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
        public static final int KEY_ID_FIELD_NUMBER = 3;
        public static final int OUTPUT_PREFIX_TYPE_FIELD_NUMBER = 4;
        private static volatile z0<b> PARSER = null;
        public static final int STATUS_FIELD_NUMBER = 2;
        public static final int TYPE_URL_FIELD_NUMBER = 1;
        private int keyId_;
        private int outputPrefixType_;
        private int status_;
        private String typeUrl_ = "";

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

        public static a B() {
            return DEFAULT_INSTANCE.h();
        }

        public static void w(b bVar, String str) {
            bVar.getClass();
            str.getClass();
            bVar.typeUrl_ = str;
        }

        public static void x(b bVar, o0 o0Var) {
            bVar.getClass();
            bVar.outputPrefixType_ = o0Var.getNumber();
        }

        public static void y(b bVar, f0 f0Var) {
            bVar.getClass();
            bVar.status_ = f0Var.getNumber();
        }

        public static void z(b bVar, int i10) {
            bVar.keyId_ = i10;
        }

        public final int A() {
            return this.keyId_;
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
                    return new e1(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001Ȉ\u0002\f\u0003\u000b\u0004\f", new Object[]{"typeUrl_", "status_", "keyId_", "outputPrefixType_"});
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
        j0 j0Var = new j0();
        DEFAULT_INSTANCE = j0Var;
        com.google.crypto.tink.shaded.protobuf.w.t(j0.class, j0Var);
    }

    public static void w(j0 j0Var, int i10) {
        j0Var.primaryKeyId_ = i10;
    }

    public static void x(j0 j0Var, b bVar) {
        j0Var.getClass();
        y.c<b> cVar = j0Var.keyInfo_;
        if (!cVar.isModifiable()) {
            int size = cVar.size();
            j0Var.keyInfo_ = cVar.mutableCopyWithCapacity(size == 0 ? 10 : size * 2);
        }
        j0Var.keyInfo_.add(bVar);
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
                return new e1(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u000b\u0002\u001b", new Object[]{"primaryKeyId_", "keyInfo_", b.class});
            case 3:
                return new j0();
            case 4:
                return new a();
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                z0<j0> z0Var = PARSER;
                if (z0Var != null) {
                    return z0Var;
                }
                synchronized (j0.class) {
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

    public final b y() {
        return this.keyInfo_.get(0);
    }
}
