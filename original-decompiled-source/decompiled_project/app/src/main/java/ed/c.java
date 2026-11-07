package ed;

import com.google.crypto.tink.shaded.protobuf.e1;
import com.google.crypto.tink.shaded.protobuf.w;
import com.google.crypto.tink.shaded.protobuf.z0;

/* loaded from: classes2.dex */
public final class c extends com.google.crypto.tink.shaded.protobuf.w<c, a> implements com.google.crypto.tink.shaded.protobuf.q0 {
    private static final c DEFAULT_INSTANCE;
    private static volatile z0<c> PARSER = null;
    public static final int TAG_SIZE_FIELD_NUMBER = 1;
    private int tagSize_;

    public static final class a extends w.a<c, a> implements com.google.crypto.tink.shaded.protobuf.q0 {
        public a() {
            super(c.DEFAULT_INSTANCE);
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
        c cVar = new c();
        DEFAULT_INSTANCE = cVar;
        com.google.crypto.tink.shaded.protobuf.w.t(c.class, cVar);
    }

    public static void w(c cVar) {
        cVar.tagSize_ = 16;
    }

    public static c x() {
        return DEFAULT_INSTANCE;
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
                return new e1(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u000b", new Object[]{"tagSize_"});
            case 3:
                return new c();
            case 4:
                return new a();
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                z0<c> z0Var = PARSER;
                if (z0Var != null) {
                    return z0Var;
                }
                synchronized (c.class) {
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

    public final int y() {
        return this.tagSize_;
    }
}
