package h9;

import t0.s4;
import x0.j;

/* loaded from: classes.dex */
public final class e1 implements eh.p<x0.j, Integer, pg.f0> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ x0.n1<String> f12602a;

    public e1(x0.n1<String> n1Var) {
        this.f12602a = n1Var;
    }

    @Override // eh.p
    public final pg.f0 invoke(x0.j jVar, Integer num) {
        x0.j jVar2 = jVar;
        if ((num.intValue() & 3) == 2 && jVar2.s()) {
            jVar2.v();
        } else {
            jVar2.L(1934979431);
            x0.n1<String> n1Var = this.f12602a;
            boolean zK = jVar2.K(n1Var);
            Object objG = jVar2.g();
            if (zK || objG == j.a.f31715a) {
                objG = new d9.w(n1Var, 1);
                jVar2.C(objG);
            }
            jVar2.B();
            s4.c((eh.a) objG, null, false, null, c.f12549c, jVar2, 196608, 30);
        }
        return pg.f0.f21461a;
    }
}
