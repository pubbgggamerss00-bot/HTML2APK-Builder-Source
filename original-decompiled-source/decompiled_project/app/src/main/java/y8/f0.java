package y8;

import x0.j;
import x0.n1;

/* loaded from: classes.dex */
public final class f0 implements eh.p<x0.j, Integer, pg.f0> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ eh.a<pg.f0> f34119a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ n1<Boolean> f34120b;

    public f0(eh.a<pg.f0> aVar, n1<Boolean> n1Var) {
        this.f34119a = aVar;
        this.f34120b = n1Var;
    }

    @Override // eh.p
    public final pg.f0 invoke(x0.j jVar, Integer num) {
        x0.j jVar2 = jVar;
        if ((num.intValue() & 3) == 2 && jVar2.s()) {
            jVar2.v();
        } else {
            jVar2.L(284454774);
            final eh.a<pg.f0> aVar = this.f34119a;
            boolean zK = jVar2.K(aVar);
            Object objG = jVar2.g();
            if (zK || objG == j.a.f31715a) {
                final n1<Boolean> n1Var = this.f34120b;
                objG = new eh.a() { // from class: y8.e0
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
            t0.x0.d((eh.a) objG, null, false, null, null, null, a.f34024x, jVar2, 805306368, 510);
        }
        return pg.f0.f21461a;
    }
}
