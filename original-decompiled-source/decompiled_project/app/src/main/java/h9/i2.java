package h9;

import x0.j;

/* loaded from: classes.dex */
public final class i2 implements eh.p<x0.j, Integer, pg.f0> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ x0.n1<Boolean> f12652a;

    public i2(x0.n1<Boolean> n1Var) {
        this.f12652a = n1Var;
    }

    @Override // eh.p
    public final pg.f0 invoke(x0.j jVar, Integer num) {
        x0.j jVar2 = jVar;
        if ((num.intValue() & 3) == 2 && jVar2.s()) {
            jVar2.v();
        } else {
            jVar2.L(2065743621);
            final x0.n1<Boolean> n1Var = this.f12652a;
            boolean zK = jVar2.K(n1Var);
            Object objG = jVar2.g();
            if (zK || objG == j.a.f31715a) {
                objG = new eh.a() { // from class: h9.h2
                    @Override // eh.a
                    public final Object invoke() {
                        n1Var.setValue(Boolean.FALSE);
                        return pg.f0.f21461a;
                    }
                };
                jVar2.C(objG);
            }
            jVar2.B();
            t0.x0.d((eh.a) objG, null, false, null, null, null, e.f12591e, jVar2, 805306368, 510);
        }
        return pg.f0.f21461a;
    }
}
