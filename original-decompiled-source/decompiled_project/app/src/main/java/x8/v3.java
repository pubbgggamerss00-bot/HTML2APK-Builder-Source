package x8;

import x0.j;

/* loaded from: classes.dex */
public final class v3 implements eh.p<x0.j, Integer, pg.f0> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ x0.n1<Long> f33280a;

    public v3(x0.n1<Long> n1Var) {
        this.f33280a = n1Var;
    }

    @Override // eh.p
    public final pg.f0 invoke(x0.j jVar, Integer num) {
        x0.j jVar2 = jVar;
        if ((num.intValue() & 3) == 2 && jVar2.s()) {
            jVar2.v();
        } else {
            jVar2.L(1423496294);
            final x0.n1<Long> n1Var = this.f33280a;
            boolean zK = jVar2.K(n1Var);
            Object objG = jVar2.g();
            if (zK || objG == j.a.f31715a) {
                objG = new eh.a() { // from class: x8.u3
                    @Override // eh.a
                    public final Object invoke() {
                        boolean z10 = g5.f32665a;
                        n1Var.setValue(null);
                        return pg.f0.f21461a;
                    }
                };
                jVar2.C(objG);
            }
            jVar2.B();
            t0.x0.d((eh.a) objG, null, false, null, null, null, c.f32355m, jVar2, 805306368, 510);
        }
        return pg.f0.f21461a;
    }
}
