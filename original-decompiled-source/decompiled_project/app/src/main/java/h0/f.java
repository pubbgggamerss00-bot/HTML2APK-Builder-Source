package h0;

/* loaded from: classes.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public static final e f12083a;

    static {
        d dVar = new d(50);
        f12083a = new e(dVar, dVar, dVar, dVar);
    }

    public static final e a(float f10) {
        c cVar = new c(f10);
        return new e(cVar, cVar, cVar, cVar);
    }

    public static final e b(float f10, float f11, float f12, float f13) {
        return new e(new c(f10), new c(f11), new c(f12), new c(f13));
    }

    public static e c(float f10, float f11, float f12, float f13, int i10) {
        if ((i10 & 1) != 0) {
            f10 = 0;
        }
        if ((i10 & 2) != 0) {
            f11 = 0;
        }
        if ((i10 & 4) != 0) {
            f12 = 0;
        }
        if ((i10 & 8) != 0) {
            f13 = 0;
        }
        return b(f10, f11, f12, f13);
    }

    public static final e d() {
        return f12083a;
    }
}
