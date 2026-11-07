package y8;

import x0.j;
import x0.n1;

/* loaded from: classes.dex */
public final class g0 implements eh.p<x0.j, Integer, pg.f0> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ n1<Boolean> f34136a;

    public g0(n1<Boolean> n1Var) {
        this.f34136a = n1Var;
    }

    @Override // eh.p
    public final pg.f0 invoke(x0.j jVar, Integer num) {
        x0.j jVar2 = jVar;
        if ((num.intValue() & 3) == 2 && jVar2.s()) {
            jVar2.v();
        } else {
            jVar2.L(284462666);
            Object objG = jVar2.g();
            if (objG == j.a.f31715a) {
                objG = new m9.g(this.f34136a, 1);
                jVar2.C(objG);
            }
            jVar2.B();
            t0.x0.d((eh.a) objG, null, false, null, null, null, a.f34025y, jVar2, 805306374, 510);
        }
        return pg.f0.f21461a;
    }
}
