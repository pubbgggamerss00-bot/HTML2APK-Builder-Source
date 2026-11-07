package x8;

import t0.w9;
import x0.j;

/* loaded from: classes.dex */
public final class a4 implements eh.p<x0.j, Integer, pg.f0> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ x0.n1<String> f32220a;

    public a4(x0.n1<String> n1Var) {
        this.f32220a = n1Var;
    }

    @Override // eh.p
    public final pg.f0 invoke(x0.j jVar, Integer num) {
        x0.j jVar2 = jVar;
        if ((num.intValue() & 3) == 2 && jVar2.s()) {
            jVar2.v();
        } else {
            final x0.n1<String> n1Var = this.f32220a;
            String value = n1Var.getValue();
            jVar2.L(1423514493);
            boolean zK = jVar2.K(n1Var);
            Object objG = jVar2.g();
            if (zK || objG == j.a.f31715a) {
                objG = new eh.l() { // from class: x8.z3
                    @Override // eh.l
                    public final Object invoke(Object obj) {
                        String it = (String) obj;
                        kotlin.jvm.internal.r.e(it, "it");
                        boolean z10 = g5.f32665a;
                        n1Var.setValue(it);
                        return pg.f0.f21461a;
                    }
                };
                jVar2.C(objG);
            }
            jVar2.B();
            w9.a(value, (eh.l) objG, null, false, false, null, c.f32361s, null, null, null, null, null, false, null, null, null, true, 0, 0, null, null, jVar2, 1572864, 12582912, 8257468);
        }
        return pg.f0.f21461a;
    }
}
