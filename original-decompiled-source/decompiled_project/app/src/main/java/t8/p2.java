package t8;

import x0.j;

/* loaded from: classes.dex */
public final class p2 implements eh.p<x0.j, Integer, pg.f0> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ x0.n1<Boolean> f28384a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ m3 f28385b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ p5.x f28386c;

    public p2(x0.n1<Boolean> n1Var, m3 m3Var, p5.x xVar) {
        this.f28384a = n1Var;
        this.f28385b = m3Var;
        this.f28386c = xVar;
    }

    @Override // eh.p
    public final pg.f0 invoke(x0.j jVar, Integer num) {
        x0.j jVar2 = jVar;
        if ((num.intValue() & 3) == 2 && jVar2.s()) {
            jVar2.v();
        } else {
            jVar2.L(2044976634);
            x0.n1<Boolean> n1Var = this.f28384a;
            boolean zK = jVar2.K(n1Var);
            m3 m3Var = this.f28385b;
            boolean zL = zK | jVar2.l(m3Var);
            p5.x xVar = this.f28386c;
            boolean zL2 = zL | jVar2.l(xVar);
            Object objG = jVar2.g();
            if (zL2 || objG == j.a.f31715a) {
                objG = new androidx.credentials.playservices.controllers.identitycredentials.createpublickeycredential.m(m3Var, xVar, n1Var, 1);
                jVar2.C(objG);
            }
            jVar2.B();
            t0.x0.d((eh.a) objG, null, false, null, null, null, c4.f28150b, jVar2, 805306368, 510);
        }
        return pg.f0.f21461a;
    }
}
