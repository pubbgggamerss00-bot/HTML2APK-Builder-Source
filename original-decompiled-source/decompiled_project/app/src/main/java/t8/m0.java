package t8;

import x0.j;

/* loaded from: classes.dex */
public final class m0 implements eh.p<x0.j, Integer, pg.f0> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ x0.n1<Boolean> f28292a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ q0 f28293b;

    public m0(q0 q0Var, x0.n1 n1Var) {
        this.f28292a = n1Var;
        this.f28293b = q0Var;
    }

    @Override // eh.p
    public final pg.f0 invoke(x0.j jVar, Integer num) {
        x0.j jVar2 = jVar;
        if ((num.intValue() & 3) == 2 && jVar2.s()) {
            jVar2.v();
        } else {
            jVar2.L(-501451468);
            final x0.n1<Boolean> n1Var = this.f28292a;
            boolean zK = jVar2.K(n1Var);
            final q0 q0Var = this.f28293b;
            boolean zL = zK | jVar2.l(q0Var);
            Object objG = jVar2.g();
            if (zL || objG == j.a.f31715a) {
                objG = new eh.a() { // from class: t8.l0
                    @Override // eh.a
                    public final Object invoke() {
                        n1Var.setValue(Boolean.FALSE);
                        q0 q0Var2 = q0Var;
                        ae.m mVar = q0Var2.f28403b.f11600d;
                        if (mVar != null) {
                            ph.h.c(androidx.lifecycle.x0.a(q0Var2), null, null, new o0(mVar, null, q0Var2, null), 3);
                        }
                        return pg.f0.f21461a;
                    }
                };
                jVar2.C(objG);
            }
            jVar2.B();
            t0.x0.d((eh.a) objG, null, false, null, null, null, b4.f28124f, jVar2, 805306368, 510);
        }
        return pg.f0.f21461a;
    }
}
