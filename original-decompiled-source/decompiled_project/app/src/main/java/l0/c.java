package l0;

import f3.r;
import qg.n0;
import t2.l0;
import x2.f;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: h, reason: collision with root package name */
    public static c f16565h;

    /* renamed from: a, reason: collision with root package name */
    public final r f16566a;

    /* renamed from: b, reason: collision with root package name */
    public final l0 f16567b;

    /* renamed from: c, reason: collision with root package name */
    public final f3.e f16568c;

    /* renamed from: d, reason: collision with root package name */
    public final f.a f16569d;

    /* renamed from: e, reason: collision with root package name */
    public final l0 f16570e;

    /* renamed from: f, reason: collision with root package name */
    public float f16571f = Float.NaN;

    /* renamed from: g, reason: collision with root package name */
    public float f16572g = Float.NaN;

    public static final class a {
        public static c a(c cVar, r rVar, l0 l0Var, f3.d dVar, f.a aVar) {
            if (cVar != null && rVar == cVar.f16566a && n0.e(l0Var, rVar).equals(cVar.f16567b) && dVar.getDensity() == cVar.f16568c.f8812a && aVar == cVar.f16569d) {
                return cVar;
            }
            c cVar2 = c.f16565h;
            if (cVar2 != null && rVar == cVar2.f16566a && n0.e(l0Var, rVar).equals(cVar2.f16567b) && dVar.getDensity() == cVar2.f16568c.f8812a && aVar == cVar2.f16569d) {
                return cVar2;
            }
            c cVar3 = new c(rVar, n0.e(l0Var, rVar), new f3.e(dVar.getDensity(), dVar.G0()), aVar);
            c.f16565h = cVar3;
            return cVar3;
        }
    }

    public c(r rVar, l0 l0Var, f3.e eVar, f.a aVar) {
        this.f16566a = rVar;
        this.f16567b = l0Var;
        this.f16568c = eVar;
        this.f16569d = aVar;
        this.f16570e = n0.e(l0Var, rVar);
    }

    public final long a(int i10, long j10) {
        int iJ;
        float f10 = this.f16572g;
        float f11 = this.f16571f;
        if (Float.isNaN(f10) || Float.isNaN(f11)) {
            String str = d.f16573a;
            long jB = f3.c.b(0, 0, 15);
            l0 l0Var = this.f16570e;
            f3.e eVar = this.f16568c;
            float fD = t2.r.a(str, l0Var, jB, eVar, this.f16569d, 1, 96).d();
            float fD2 = t2.r.a(d.f16574b, this.f16570e, f3.c.b(0, 0, 15), eVar, this.f16569d, 2, 96).d() - fD;
            this.f16572g = fD;
            this.f16571f = fD2;
            f11 = fD2;
            f10 = fD;
        }
        if (i10 != 1) {
            int iRound = Math.round((f11 * (i10 - 1)) + f10);
            iJ = iRound >= 0 ? iRound : 0;
            int iH = f3.b.h(j10);
            if (iJ > iH) {
                iJ = iH;
            }
        } else {
            iJ = f3.b.j(j10);
        }
        return f3.c.a(f3.b.k(j10), f3.b.i(j10), iJ, f3.b.h(j10));
    }
}
