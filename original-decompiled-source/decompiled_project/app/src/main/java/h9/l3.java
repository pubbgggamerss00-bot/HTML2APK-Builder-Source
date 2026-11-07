package h9;

import x0.j;

/* loaded from: classes.dex */
public final class l3 implements eh.p<x0.j, Integer, pg.f0> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ x0.n1<Boolean> f12721a;

    public l3(x0.n1<Boolean> n1Var) {
        this.f12721a = n1Var;
    }

    @Override // eh.p
    public final pg.f0 invoke(x0.j jVar, Integer num) {
        x0.j jVar2 = jVar;
        if ((num.intValue() & 3) == 2 && jVar2.s()) {
            jVar2.v();
        } else {
            jVar2.L(2065619080);
            x0.n1<Boolean> n1Var = this.f12721a;
            boolean zK = jVar2.K(n1Var);
            Object objG = jVar2.g();
            if (zK || objG == j.a.f31715a) {
                objG = new k3(n1Var, 0);
                jVar2.C(objG);
            }
            jVar2.B();
            t0.x0.d((eh.a) objG, null, false, null, null, null, e.f12587a, jVar2, 805306368, 510);
        }
        return pg.f0.f21461a;
    }
}
