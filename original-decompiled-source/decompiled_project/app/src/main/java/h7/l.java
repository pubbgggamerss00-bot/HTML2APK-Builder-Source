package h7;

import com.yalantis.ucrop.view.CropImageView;
import g2.n1;
import nh.h;
import q1.c1;
import x0.v1;

/* loaded from: classes.dex */
public final class l extends v1.c {

    /* renamed from: f, reason: collision with root package name */
    public final v1.c f12328f;

    /* renamed from: g, reason: collision with root package name */
    public final g2.j f12329g;

    /* renamed from: h, reason: collision with root package name */
    public final long f12330h;

    /* renamed from: k, reason: collision with root package name */
    public final boolean f12332k;

    /* renamed from: m, reason: collision with root package name */
    public nh.a f12334m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f12335n;

    /* renamed from: q, reason: collision with root package name */
    public c1 f12337q;

    /* renamed from: r, reason: collision with root package name */
    public v1.c f12338r;

    /* renamed from: j, reason: collision with root package name */
    public final nh.h f12331j = h.a.f18824a;

    /* renamed from: l, reason: collision with root package name */
    public final v1 f12333l = new v1(0);

    /* renamed from: p, reason: collision with root package name */
    public float f12336p = 1.0f;

    public l(v1.c cVar, v1.c cVar2, g2.j jVar, long j10, boolean z10) {
        this.f12328f = cVar2;
        this.f12329g = jVar;
        this.f12330h = j10;
        this.f12332k = z10;
        this.f12338r = cVar;
    }

    @Override // v1.c
    public final boolean a(float f10) {
        this.f12336p = f10;
        return true;
    }

    @Override // v1.c
    public final boolean e(c1 c1Var) {
        this.f12337q = c1Var;
        return true;
    }

    @Override // v1.c
    public final long h() {
        v1.c cVar = this.f12338r;
        long jH = cVar != null ? cVar.h() : 0L;
        v1.c cVar2 = this.f12328f;
        long jH2 = cVar2 != null ? cVar2.h() : 0L;
        boolean z10 = jH != 9205357640488583168L;
        boolean z11 = jH2 != 9205357640488583168L;
        if (z10 && z11) {
            return d0.h.a(Math.max(p1.h.d(jH), p1.h.d(jH2)), Math.max(p1.h.b(jH), p1.h.b(jH2)));
        }
        return 9205357640488583168L;
    }

    @Override // v1.c
    public final void i(s1.e eVar) {
        boolean z10 = this.f12335n;
        v1.c cVar = this.f12328f;
        if (z10) {
            j(eVar, cVar, this.f12336p);
            return;
        }
        nh.a aVarA = this.f12334m;
        if (aVarA == null) {
            aVarA = this.f12331j.a();
            this.f12334m = aVarA;
        }
        float fD = nh.b.d(aVarA.N()) / nh.b.d(this.f12330h);
        float fL = jh.j.l(fD, CropImageView.DEFAULT_ASPECT_RATIO, 1.0f);
        float f10 = this.f12336p;
        float f11 = fL * f10;
        if (this.f12332k) {
            f10 -= f11;
        }
        this.f12335n = fD >= 1.0f;
        j(eVar, this.f12338r, f10);
        j(eVar, cVar, f11);
        if (this.f12335n) {
            this.f12338r = null;
        } else {
            v1 v1Var = this.f12333l;
            v1Var.f(v1Var.g() + 1);
        }
    }

    public final void j(s1.e eVar, v1.c cVar, float f10) {
        if (cVar == null || f10 <= CropImageView.DEFAULT_ASPECT_RATIO) {
            return;
        }
        long jI = eVar.i();
        long jH = cVar.h();
        long jA = (jH == 9205357640488583168L || p1.h.e(jH) || jI == 9205357640488583168L || p1.h.e(jI)) ? jI : n1.a(jH, this.f12329g.a(jH, jI));
        if (jI == 9205357640488583168L || p1.h.e(jI)) {
            cVar.g(eVar, jA, f10, this.f12337q);
            return;
        }
        float f11 = 2;
        float fD = (p1.h.d(jI) - p1.h.d(jA)) / f11;
        float fB = (p1.h.b(jI) - p1.h.b(jA)) / f11;
        eVar.Q0().f24180a.c(fD, fB, fD, fB);
        try {
            cVar.g(eVar, jA, f10, this.f12337q);
        } finally {
            s1.b bVar = eVar.Q0().f24180a;
            float f12 = -fD;
            float f13 = -fB;
            bVar.c(f12, f13, f12, f13);
        }
    }
}
