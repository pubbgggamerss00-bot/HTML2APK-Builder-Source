package t0;

import x0.j;

/* loaded from: classes.dex */
public final class ha {

    /* renamed from: a, reason: collision with root package name */
    public static final x0.s3 f26008a = new x0.s3(b.f26013a);

    /* renamed from: b, reason: collision with root package name */
    public static final x0.m0 f26009b = new x0.m0(a.f26012a);

    /* renamed from: c, reason: collision with root package name */
    public static final ia f26010c;

    /* renamed from: d, reason: collision with root package name */
    public static final ia f26011d;

    public static final class a extends kotlin.jvm.internal.s implements eh.a<fa> {

        /* renamed from: a, reason: collision with root package name */
        public static final a f26012a = new a(0);

        @Override // eh.a
        public final fa invoke() {
            return new fa();
        }
    }

    public static final class b extends kotlin.jvm.internal.s implements eh.a<Boolean> {

        /* renamed from: a, reason: collision with root package name */
        public static final b f26013a = new b(0);

        @Override // eh.a
        public final /* bridge */ /* synthetic */ Boolean invoke() {
            return Boolean.FALSE;
        }
    }

    static {
        long j10 = q1.b1.f21654h;
        f26010c = new ia(true, Float.NaN, j10);
        f26011d = new ia(false, Float.NaN, j10);
    }

    public static final t.u0 a(boolean z10, float f10, long j10, x0.j jVar, int i10, int i11) {
        t.u0 iaVar;
        boolean z11 = true;
        if ((i11 & 1) != 0) {
            z10 = true;
        }
        if ((i11 & 2) != 0) {
            f10 = Float.NaN;
        }
        if ((i11 & 4) != 0) {
            j10 = q1.b1.f21654h;
        }
        jVar.L(-1280632857);
        if (((Boolean) jVar.f(f26008a)).booleanValue()) {
            s.m2<Float> m2Var = s0.q.f24137a;
            x0.n1 n1VarK = bg.b.k(new q1.b1(j10), jVar);
            boolean z12 = (((i10 & 14) ^ 6) > 4 && jVar.c(z10)) || (i10 & 6) == 4;
            if ((((i10 & 112) ^ 48) <= 32 || !jVar.h(f10)) && (i10 & 48) != 32) {
                z11 = false;
            }
            boolean z13 = z12 | z11;
            Object objG = jVar.g();
            if (z13 || objG == j.a.f31715a) {
                objG = new s0.f(z10, f10, n1VarK);
                jVar.C(objG);
            }
            iaVar = (s0.f) objG;
        } else if (f3.h.a(f10, Float.NaN) && q1.b1.d(j10, q1.b1.f21654h)) {
            iaVar = z10 ? f26010c : f26011d;
        } else {
            iaVar = new ia(z10, f10, j10);
        }
        jVar.B();
        return iaVar;
    }
}
