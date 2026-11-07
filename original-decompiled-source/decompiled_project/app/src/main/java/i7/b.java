package i7;

import androidx.compose.ui.d;
import com.yalantis.ucrop.view.CropImageView;
import g2.g1;
import g2.j;
import g2.k0;
import g2.m0;
import g2.m1;
import g2.n1;
import g2.o0;
import g2.p;
import h7.e;
import h7.k;
import i2.b0;
import i2.h0;
import i2.k2;
import i2.l0;
import i2.r;
import org.bouncycastle.asn1.cmc.BodyPartID;
import q1.c1;
import q2.a0;
import q2.d0;
import s1.a;

/* loaded from: classes.dex */
public abstract class b extends d.c implements r, b0, k2 {

    /* renamed from: q, reason: collision with root package name */
    public j1.d f14177q;

    /* renamed from: r, reason: collision with root package name */
    public j f14178r;

    /* renamed from: s, reason: collision with root package name */
    public float f14179s;

    /* renamed from: t, reason: collision with root package name */
    public c1 f14180t;

    /* renamed from: v, reason: collision with root package name */
    public boolean f14181v;

    /* renamed from: w, reason: collision with root package name */
    public String f14182w;

    /* renamed from: x, reason: collision with root package name */
    public k f14183x;

    @Override // i2.b0
    public final int F(l0 l0Var, p pVar, int i10) {
        long jB = f3.c.b(0, i10, 7);
        k kVar = this.f14183x;
        if (kVar != null) {
            kVar.A(jB);
        }
        if (((d) this).f14187y.h() == 9205357640488583168L) {
            return pVar.O(i10);
        }
        long jU1 = U1(jB);
        return Math.max(f3.b.k(jU1), pVar.O(i10));
    }

    @Override // i2.b0
    public final int G(l0 l0Var, p pVar, int i10) {
        long jB = f3.c.b(0, i10, 7);
        k kVar = this.f14183x;
        if (kVar != null) {
            kVar.A(jB);
        }
        if (((d) this).f14187y.h() == 9205357640488583168L) {
            return pVar.J(i10);
        }
        long jU1 = U1(jB);
        return Math.max(f3.b.k(jU1), pVar.J(i10));
    }

    @Override // androidx.compose.ui.d.c
    public final boolean I1() {
        return false;
    }

    public final long T1(long j10) {
        if (p1.h.e(j10)) {
            return 0L;
        }
        long jH = ((d) this).f14187y.h();
        if (jH == 9205357640488583168L) {
            return j10;
        }
        float fD = p1.h.d(jH);
        if (Float.isInfinite(fD) || Float.isNaN(fD)) {
            fD = p1.h.d(j10);
        }
        float fB = p1.h.b(jH);
        if (Float.isInfinite(fB) || Float.isNaN(fB)) {
            fB = p1.h.b(j10);
        }
        long jA = d0.h.a(fD, fB);
        long jA2 = this.f14178r.a(jA, j10);
        int i10 = m1.f11408a;
        float fIntBitsToFloat = Float.intBitsToFloat((int) (jA2 >> 32));
        if (Float.isInfinite(fIntBitsToFloat) || Float.isNaN(fIntBitsToFloat)) {
            return j10;
        }
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (BodyPartID.bodyIdMax & jA2));
        return (Float.isInfinite(fIntBitsToFloat2) || Float.isNaN(fIntBitsToFloat2)) ? j10 : n1.a(jA, jA2);
    }

    public final long U1(long j10) {
        float fK;
        int iJ;
        float fL;
        boolean zG = f3.b.g(j10);
        boolean zF = f3.b.f(j10);
        if (zG && zF) {
            return j10;
        }
        d dVar = (d) this;
        boolean z10 = f3.b.e(j10) && f3.b.d(j10);
        h7.e eVar = dVar.f14187y;
        long jH = eVar.h();
        if (jH == 9205357640488583168L) {
            return (!z10 || ((e.b) eVar.f12297y.f25021a.getValue()).a() == null) ? j10 : f3.b.b(j10, f3.b.i(j10), 0, f3.b.h(j10), 0, 10);
        }
        if (z10 && (zG || zF)) {
            fK = f3.b.i(j10);
            iJ = f3.b.h(j10);
        } else {
            float fD = p1.h.d(jH);
            float fB = p1.h.b(jH);
            if (Float.isInfinite(fD) || Float.isNaN(fD)) {
                fK = f3.b.k(j10);
            } else {
                int i10 = i.f14196b;
                fK = jh.j.l(fD, f3.b.k(j10), f3.b.i(j10));
            }
            if (!Float.isInfinite(fB) && !Float.isNaN(fB)) {
                int i11 = i.f14196b;
                fL = jh.j.l(fB, f3.b.j(j10), f3.b.h(j10));
                long jT1 = T1(d0.h.a(fK, fL));
                return f3.b.b(j10, f3.c.g(gh.a.b(p1.h.d(jT1)), j10), 0, f3.c.f(gh.a.b(p1.h.b(jT1)), j10), 0, 10);
            }
            iJ = f3.b.j(j10);
        }
        fL = iJ;
        long jT12 = T1(d0.h.a(fK, fL));
        return f3.b.b(j10, f3.c.g(gh.a.b(p1.h.d(jT12)), j10), 0, f3.c.f(gh.a.b(p1.h.b(jT12)), j10), 0, 10);
    }

    @Override // i2.k2
    public final void X(d0 d0Var) {
        String str = this.f14182w;
        if (str != null) {
            a0.d(d0Var, str);
            a0.e(d0Var, 5);
        }
    }

    @Override // i2.b0
    public final m0 m(o0 o0Var, k0 k0Var, long j10) {
        k kVar = this.f14183x;
        if (kVar != null) {
            kVar.A(j10);
        }
        g1 g1VarP = k0Var.P(U1(j10));
        return o0Var.i0(g1VarP.f11382a, g1VarP.f11383b, qg.a0.f22708a, new a(g1VarP, 0));
    }

    @Override // i2.b0
    public final int r(l0 l0Var, p pVar, int i10) {
        long jB = f3.c.b(i10, 0, 13);
        k kVar = this.f14183x;
        if (kVar != null) {
            kVar.A(jB);
        }
        if (((d) this).f14187y.h() == 9205357640488583168L) {
            return pVar.z(i10);
        }
        long jU1 = U1(jB);
        return Math.max(f3.b.j(jU1), pVar.z(i10));
    }

    @Override // i2.b0
    public final int w(l0 l0Var, p pVar, int i10) {
        long jB = f3.c.b(i10, 0, 13);
        k kVar = this.f14183x;
        if (kVar != null) {
            kVar.A(jB);
        }
        if (((d) this).f14187y.h() == 9205357640488583168L) {
            return pVar.b0(i10);
        }
        long jU1 = U1(jB);
        return Math.max(f3.b.j(jU1), pVar.b0(i10));
    }

    @Override // i2.r
    public final void z(h0 h0Var) {
        s1.a aVar = h0Var.f13901a;
        long jT1 = T1(aVar.i());
        j1.d dVar = this.f14177q;
        int i10 = i.f14196b;
        long jB = (gh.a.b(p1.h.d(jT1)) << 32) | (gh.a.b(p1.h.b(jT1)) & BodyPartID.bodyIdMax);
        long jI = aVar.i();
        long jA = dVar.a(jB, (gh.a.b(p1.h.d(jI)) << 32) | (gh.a.b(p1.h.b(jI)) & BodyPartID.bodyIdMax), h0Var.getLayoutDirection());
        int i11 = (int) (jA >> 32);
        int i12 = (int) (jA & BodyPartID.bodyIdMax);
        a.b bVar = aVar.f24173b;
        long jD = bVar.d();
        bVar.a().d();
        try {
            s1.b bVar2 = bVar.f24180a;
            a.b bVar3 = bVar2.f24183a;
            if (this.f14181v) {
                bVar2.b(CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, Float.intBitsToFloat((int) (bVar3.d() >> 32)), Float.intBitsToFloat((int) (bVar3.d() & BodyPartID.bodyIdMax)), 1);
            }
            bVar2.f(i11, i12);
            ((d) this).f14187y.g(h0Var, jT1, this.f14179s, this.f14180t);
            bVar.a().o();
            bVar.h(jD);
            h0Var.z1();
        } catch (Throwable th2) {
            t.r.a(bVar, jD);
            throw th2;
        }
    }
}
