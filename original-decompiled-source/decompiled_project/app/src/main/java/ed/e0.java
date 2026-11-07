package ed;

import com.google.crypto.tink.shaded.protobuf.e1;
import com.google.crypto.tink.shaded.protobuf.w;
import com.google.crypto.tink.shaded.protobuf.y;
import com.google.crypto.tink.shaded.protobuf.z0;

/* loaded from: classes2.dex */
public final class e0 extends com.google.crypto.tink.shaded.protobuf.w<e0, a> implements com.google.crypto.tink.shaded.protobuf.q0 {
    private static final e0 DEFAULT_INSTANCE;
    public static final int KEY_MATERIAL_TYPE_FIELD_NUMBER = 3;
    private static volatile z0<e0> PARSER = null;
    public static final int TYPE_URL_FIELD_NUMBER = 1;
    public static final int VALUE_FIELD_NUMBER = 2;
    private int keyMaterialType_;
    private String typeUrl_ = "";
    private com.google.crypto.tink.shaded.protobuf.h value_ = com.google.crypto.tink.shaded.protobuf.h.f6665b;

    public static final class a extends w.a<e0, a> implements com.google.crypto.tink.shaded.protobuf.q0 {
        public a() {
            super(e0.DEFAULT_INSTANCE);
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

    public enum b implements y.a {
        UNKNOWN_KEYMATERIAL(0),
        SYMMETRIC(1),
        ASYMMETRIC_PRIVATE(2),
        ASYMMETRIC_PUBLIC(3),
        REMOTE(4),
        UNRECOGNIZED(-1);


        /* renamed from: a, reason: collision with root package name */
        public final int f8682a;

        b(int i10) {
            this.f8682a = i10;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.y.a
        public final int getNumber() {
            if (this != UNRECOGNIZED) {
                return this.f8682a;
            }
            throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
        }
    }

    static {
        e0 e0Var = new e0();
        DEFAULT_INSTANCE = e0Var;
        com.google.crypto.tink.shaded.protobuf.w.t(e0.class, e0Var);
    }

    public static a D() {
        return DEFAULT_INSTANCE.h();
    }

    public static void w(e0 e0Var, String str) {
        e0Var.getClass();
        str.getClass();
        e0Var.typeUrl_ = str;
    }

    public static void x(e0 e0Var, com.google.crypto.tink.shaded.protobuf.h hVar) {
        e0Var.getClass();
        hVar.getClass();
        e0Var.value_ = hVar;
    }

    public static void y(e0 e0Var, b bVar) {
        e0Var.getClass();
        e0Var.keyMaterialType_ = bVar.getNumber();
    }

    public static e0 z() {
        return DEFAULT_INSTANCE;
    }

    public final b A() {
        int i10 = this.keyMaterialType_;
        b bVar = i10 != 0 ? i10 != 1 ? i10 != 2 ? i10 != 3 ? i10 != 4 ? null : b.REMOTE : b.ASYMMETRIC_PUBLIC : b.ASYMMETRIC_PRIVATE : b.SYMMETRIC : b.UNKNOWN_KEYMATERIAL;
        return bVar == null ? b.UNRECOGNIZED : bVar;
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
                return new e1(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002\n\u0003\f", new Object[]{"typeUrl_", "value_", "keyMaterialType_"});
            case 3:
                return new e0();
            case 4:
                return new a();
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                z0<e0> z0Var = PARSER;
                if (z0Var != null) {
                    return z0Var;
                }
                synchronized (e0.class) {
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
