package q1;

import i0.u2;

/* loaded from: classes.dex */
public interface u1 {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public static final a f21740a;

        /* renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ a[] f21741b;

        static {
            a aVar = new a("CounterClockwise", 0);
            f21740a = aVar;
            a[] aVarArr = {aVar, new a("Clockwise", 1)};
            f21741b = aVarArr;
            u2.e(aVarArr);
        }

        public a() {
            throw null;
        }

        public static a valueOf(String str) {
            return (a) Enum.valueOf(a.class, str);
        }

        public static a[] values() {
            return (a[]) f21741b.clone();
        }
    }

    static /* synthetic */ void f(u1 u1Var, p1.g gVar) {
        a aVar = a.f21740a;
        u1Var.k(gVar);
    }

    default void a(float f10, float f11, float f12, float f13) {
        g(f10, f11, f12, f13);
    }

    boolean b();

    void c(float f10, float f11);

    void close();

    void d(float f10, float f11, float f12, float f13, float f14, float f15);

    @pg.d
    void e(float f10, float f11, float f12, float f13);

    @pg.d
    void g(float f10, float f11, float f12, float f13);

    p1.e getBounds();

    void h(int i10);

    default void i(float f10, float f11, float f12, float f13) {
        e(f10, f11, f12, f13);
    }

    int j();

    void k(p1.g gVar);

    void l(float f10, float f11);

    void m(float f10, float f11, float f12, float f13, float f14, float f15);

    default void n() {
        reset();
    }

    void o(float f10, float f11);

    void p(float f10, float f11);

    void reset();
}
