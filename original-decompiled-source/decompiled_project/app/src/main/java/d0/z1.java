package d0;

import x0.j;

/* loaded from: classes.dex */
public final class z1 {
    public static final void a(f1.b bVar, x0.j jVar, int i10) {
        x0.k kVarP = jVar.p(674185128);
        if (kVarP.A(i10 & 1, (i10 & 3) != 2)) {
            x0.e2 e2Var = g1.k.f11305a;
            g1.i iVar = (g1.i) kVarP.f(e2Var);
            g1.e eVarI = c2.n0.i(kVarP);
            Object[] objArr = {iVar};
            t1 t1Var = new t1(iVar, eVarI);
            g1.n nVar = g1.m.f11307a;
            g1.n nVar2 = new g1.n(s1.f7275a, t1Var);
            boolean zL = kVarP.l(iVar) | kVarP.l(eVarI);
            Object objG = kVarP.g();
            if (zL || objG == j.a.f31715a) {
                objG = new y1(iVar, eVarI);
                kVarP.C(objG);
            }
            r1 r1Var = (r1) b0.a0.d(objArr, nVar2, (eh.a) objG, kVarP, 0, 4);
            x0.y.a(e2Var.a(r1Var), f1.c.b(1863926504, new w1(bVar, r1Var), kVarP), kVarP, 56);
        } else {
            kVarP.v();
        }
        x0.h2 h2VarV = kVarP.V();
        if (h2VarV != null) {
            h2VarV.f31703d = new x1(bVar, i10);
        }
    }
}
