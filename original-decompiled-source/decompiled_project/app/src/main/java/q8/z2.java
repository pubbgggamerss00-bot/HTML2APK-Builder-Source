package q8;

import x0.j;

/* loaded from: classes.dex */
public final class z2 implements eh.p<x0.j, Integer, pg.f0> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ eh.a<pg.f0> f22508a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ x0.n1<Boolean> f22509b;

    public z2(eh.a<pg.f0> aVar, x0.n1<Boolean> n1Var) {
        this.f22508a = aVar;
        this.f22509b = n1Var;
    }

    @Override // eh.p
    public final pg.f0 invoke(x0.j jVar, Integer num) {
        x0.j jVar2 = jVar;
        if ((num.intValue() & 3) == 2 && jVar2.s()) {
            jVar2.v();
        } else {
            Object obj = j.a.f31715a;
            final x0.n1<Boolean> n1Var = this.f22509b;
            final eh.a<pg.f0> aVar = this.f22508a;
            if (aVar != null) {
                jVar2.L(583599807);
                jVar2.L(-1228098299);
                boolean zK = jVar2.K(aVar);
                Object objG = jVar2.g();
                if (zK || objG == obj) {
                    objG = new eh.a() { // from class: q8.x2
                        @Override // eh.a
                        public final Object invoke() {
                            n1Var.setValue(Boolean.FALSE);
                            aVar.invoke();
                            return pg.f0.f21461a;
                        }
                    };
                    jVar2.C(objG);
                }
                jVar2.B();
                z.g1 g1Var = t0.m0.f26400a;
                t0.x0.a((eh.a) objG, null, false, null, t0.m0.a(((t0.e2) jVar2.f(t0.f2.f25858a)).f25751a, 0L, 0L, jVar2, 14), null, null, null, c0.f22140b, jVar2, 805306368, 494);
                jVar2.B();
            } else {
                jVar2.L(584153622);
                jVar2.L(-1228080429);
                Object objG2 = jVar2.g();
                if (objG2 == obj) {
                    objG2 = new eh.a() { // from class: q8.y2
                        @Override // eh.a
                        public final Object invoke() {
                            n1Var.setValue(Boolean.FALSE);
                            return pg.f0.f21461a;
                        }
                    };
                    jVar2.C(objG2);
                }
                jVar2.B();
                z.g1 g1Var2 = t0.m0.f26400a;
                t0.x0.a((eh.a) objG2, null, false, null, t0.m0.a(((t0.e2) jVar2.f(t0.f2.f25858a)).f25751a, 0L, 0L, jVar2, 14), null, null, null, c0.f22141c, jVar2, 805306374, 494);
                jVar2.B();
            }
        }
        return pg.f0.f21461a;
    }
}
