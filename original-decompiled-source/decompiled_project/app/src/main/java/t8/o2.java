package t8;

import x0.j;

/* loaded from: classes.dex */
public final class o2 implements eh.p<x0.j, Integer, pg.f0> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ x0.n1<Boolean> f28364a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ p5.x f28365b;

    public o2(p5.x xVar, x0.n1 n1Var) {
        this.f28364a = n1Var;
        this.f28365b = xVar;
    }

    @Override // eh.p
    public final pg.f0 invoke(x0.j jVar, Integer num) {
        x0.j jVar2 = jVar;
        if ((num.intValue() & 3) == 2 && jVar2.s()) {
            jVar2.v();
        } else {
            jVar2.L(2044968275);
            x0.n1<Boolean> n1Var = this.f28364a;
            boolean zK = jVar2.K(n1Var);
            p5.x xVar = this.f28365b;
            boolean zL = zK | jVar2.l(xVar);
            Object objG = jVar2.g();
            if (zL || objG == j.a.f31715a) {
                objG = new androidx.credentials.playservices.controllers.identitycredentials.createpublickeycredential.l(2, xVar, n1Var);
                jVar2.C(objG);
            }
            jVar2.B();
            t0.x0.d((eh.a) objG, null, false, null, null, null, c4.f28149a, jVar2, 805306368, 510);
        }
        return pg.f0.f21461a;
    }
}
