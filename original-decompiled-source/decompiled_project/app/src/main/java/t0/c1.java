package t0;

import x.o;
import x0.j;

/* loaded from: classes.dex */
public final class c1 {

    /* renamed from: a, reason: collision with root package name */
    public final float f25560a;

    /* renamed from: b, reason: collision with root package name */
    public final float f25561b;

    /* renamed from: c, reason: collision with root package name */
    public final float f25562c;

    /* renamed from: d, reason: collision with root package name */
    public final float f25563d;

    /* renamed from: e, reason: collision with root package name */
    public final float f25564e;

    /* renamed from: f, reason: collision with root package name */
    public final float f25565f;

    public c1(float f10, float f11, float f12, float f13, float f14, float f15) {
        this.f25560a = f10;
        this.f25561b = f11;
        this.f25562c = f12;
        this.f25563d = f13;
        this.f25564e = f14;
        this.f25565f = f15;
    }

    public final x0.r3 a(boolean z10, x.m mVar, x0.j jVar, int i10) {
        s.b bVar;
        jVar.L(-1763481333);
        jVar.L(-734838460);
        float f10 = this.f25560a;
        Object obj = j.a.f31715a;
        if (mVar == null) {
            Object objG = jVar.g();
            if (objG == obj) {
                objG = bg.b.h(new f3.h(f10));
                jVar.C(objG);
            }
            x0.n1 n1Var = (x0.n1) objG;
            jVar.B();
            jVar.B();
            return n1Var;
        }
        jVar.B();
        Object objG2 = jVar.g();
        if (objG2 == obj) {
            objG2 = new h1.u();
            jVar.C(objG2);
        }
        h1.u uVar = (h1.u) objG2;
        boolean z11 = true;
        boolean z12 = (((i10 & 112) ^ 48) > 32 && jVar.K(mVar)) || (i10 & 48) == 32;
        Object objG3 = jVar.g();
        if (z12 || objG3 == obj) {
            objG3 = new a1(mVar, uVar, null);
            jVar.C(objG3);
        }
        x0.o0.d((eh.p) objG3, mVar, jVar);
        x.k kVar = (x.k) qg.x.K(uVar);
        if (!z10) {
            f10 = this.f25565f;
        } else if (kVar instanceof o.b) {
            f10 = this.f25561b;
        } else if (kVar instanceof x.i) {
            f10 = this.f25563d;
        } else if (kVar instanceof x.e) {
            f10 = this.f25562c;
        } else if (kVar instanceof x.b) {
            f10 = this.f25564e;
        }
        Object objG4 = jVar.g();
        if (objG4 == obj) {
            objG4 = new s.b(new f3.h(f10), s.p2.f23870c, null, 12);
            jVar.C(objG4);
        }
        s.b bVar2 = (s.b) objG4;
        f3.h hVar = new f3.h(f10);
        boolean zL = jVar.l(bVar2) | jVar.h(f10) | ((((i10 & 14) ^ 6) > 4 && jVar.c(z10)) || (i10 & 6) == 4);
        if ((((i10 & 896) ^ 384) <= 256 || !jVar.K(this)) && (i10 & 384) != 256) {
            z11 = false;
        }
        boolean zL2 = zL | z11 | jVar.l(kVar);
        Object objG5 = jVar.g();
        if (zL2 || objG5 == obj) {
            bVar = bVar2;
            Object b1Var = new b1(bVar, f10, z10, this, kVar, null);
            jVar.C(b1Var);
            objG5 = b1Var;
        } else {
            bVar = bVar2;
        }
        x0.o0.d((eh.p) objG5, hVar, jVar);
        x0.r3 r3Var = bVar.f23654c;
        jVar.B();
        return r3Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof c1)) {
            return false;
        }
        c1 c1Var = (c1) obj;
        return f3.h.a(this.f25560a, c1Var.f25560a) && f3.h.a(this.f25561b, c1Var.f25561b) && f3.h.a(this.f25562c, c1Var.f25562c) && f3.h.a(this.f25563d, c1Var.f25563d) && f3.h.a(this.f25565f, c1Var.f25565f);
    }

    public final int hashCode() {
        return Float.hashCode(this.f25565f) + r.z1.a(this.f25563d, r.z1.a(this.f25562c, r.z1.a(this.f25561b, Float.hashCode(this.f25560a) * 31, 31), 31), 31);
    }
}
