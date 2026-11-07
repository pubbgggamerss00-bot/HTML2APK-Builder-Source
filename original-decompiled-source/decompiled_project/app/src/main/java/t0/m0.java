package t0;

import com.yalantis.ucrop.view.CropImageView;

/* loaded from: classes.dex */
public final class m0 {

    /* renamed from: a, reason: collision with root package name */
    public static final z.g1 f26400a;

    /* renamed from: b, reason: collision with root package name */
    public static final z.g1 f26401b;

    /* renamed from: c, reason: collision with root package name */
    public static final float f26402c;

    /* renamed from: d, reason: collision with root package name */
    public static final float f26403d;

    static {
        float f10 = 24;
        float f11 = 8;
        f26400a = new z.g1(f10, f11, f10, f11);
        float f12 = 16;
        if (!((f10 >= CropImageView.DEFAULT_ASPECT_RATIO) & (f12 >= CropImageView.DEFAULT_ASPECT_RATIO) & (f11 >= CropImageView.DEFAULT_ASPECT_RATIO) & (f11 >= CropImageView.DEFAULT_ASPECT_RATIO))) {
            a0.a.a("Padding must be non-negative");
        }
        float f13 = 12;
        f26401b = new z.g1(f13, f11, f13, f11);
        if (!((f13 >= CropImageView.DEFAULT_ASPECT_RATIO) & (f11 >= CropImageView.DEFAULT_ASPECT_RATIO) & (f12 >= CropImageView.DEFAULT_ASPECT_RATIO) & (f11 >= CropImageView.DEFAULT_ASPECT_RATIO))) {
            a0.a.a("Padding must be non-negative");
        }
        f26402c = 58;
        f26403d = 40;
        float f14 = v0.k.f30320a;
    }

    public static l0 a(long j10, long j11, long j12, x0.j jVar, int i10) {
        if ((i10 & 2) != 0) {
            j11 = q1.b1.f21654h;
        }
        return b((e2) jVar.f(f2.f25858a)).a(j10, j11, (i10 & 4) != 0 ? q1.b1.f21654h : j12, q1.b1.f21654h);
    }

    public static l0 b(e2 e2Var) {
        l0 l0Var = e2Var.K;
        if (l0Var != null) {
            return l0Var;
        }
        float f10 = v0.k.f30320a;
        l0 l0Var2 = new l0(f2.d(e2Var, v0.d.f30248m), f2.d(e2Var, v0.k.f30327h), q1.b1.c(0.12f, f2.d(e2Var, v0.k.f30322c)), q1.b1.c(0.38f, f2.d(e2Var, v0.k.f30324e)));
        e2Var.K = l0Var2;
        return l0Var2;
    }

    public static l0 c(e2 e2Var) {
        l0 l0Var = e2Var.M;
        if (l0Var != null) {
            return l0Var;
        }
        long j10 = q1.b1.f21653g;
        float f10 = v0.w.f30496a;
        l0 l0Var2 = new l0(j10, f2.d(e2Var, v0.d.f30248m), j10, q1.b1.c(0.38f, f2.d(e2Var, v0.d.f30244h)));
        e2Var.M = l0Var2;
        return l0Var2;
    }

    public static l0 d(e2 e2Var) {
        l0 l0Var = e2Var.N;
        if (l0Var != null) {
            return l0Var;
        }
        long j10 = q1.b1.f21653g;
        l0 l0Var2 = new l0(j10, f2.d(e2Var, v0.d.f30248m), j10, q1.b1.c(0.38f, f2.d(e2Var, v0.d.f30244h)));
        e2Var.N = l0Var2;
        return l0Var2;
    }

    public static l0 e(long j10, x0.j jVar) {
        long j11 = q1.b1.f21654h;
        return c((e2) jVar.f(f2.f25858a)).a(j11, j10, j11, j11);
    }

    public static l0 f(long j10, long j11, x0.j jVar, int i10) {
        if ((i10 & 1) != 0) {
            j10 = q1.b1.f21654h;
        }
        long j12 = j10;
        long j13 = q1.b1.f21654h;
        return d((e2) jVar.f(f2.f25858a)).a(j12, j11, j13, j13);
    }
}
