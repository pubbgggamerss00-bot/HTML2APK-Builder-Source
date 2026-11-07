package q8;

import x0.j;

/* loaded from: classes.dex */
public final class d3 implements eh.p<x0.j, Integer, pg.f0> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ x0.n1<Boolean> f22171a;

    public d3(x0.n1<Boolean> n1Var) {
        this.f22171a = n1Var;
    }

    @Override // eh.p
    public final pg.f0 invoke(x0.j jVar, Integer num) {
        x0.j jVar2 = jVar;
        if ((num.intValue() & 3) == 2 && jVar2.s()) {
            jVar2.v();
        } else {
            jVar2.L(-1228063821);
            Object objG = jVar2.g();
            if (objG == j.a.f31715a) {
                objG = new c3(this.f22171a, 0);
                jVar2.C(objG);
            }
            jVar2.B();
            t0.x0.d((eh.a) objG, null, false, null, null, null, c0.f22139a, jVar2, 805306374, 510);
        }
        return pg.f0.f21461a;
    }
}
