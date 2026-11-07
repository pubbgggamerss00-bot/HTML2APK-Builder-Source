package f9;

import java.util.List;
import x0.j;

/* loaded from: classes.dex */
public final class e4 implements eh.p<x0.j, Integer, pg.f0> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ x0.l1 f9482a;

    public e4(x0.l1 l1Var) {
        this.f9482a = l1Var;
    }

    @Override // eh.p
    public final pg.f0 invoke(x0.j jVar, Integer num) {
        x0.j jVar2 = jVar;
        if ((num.intValue() & 3) == 2 && jVar2.s()) {
            jVar2.v();
        } else {
            List<String> list = d1.f9265a;
            x0.l1 l1Var = this.f9482a;
            int i10 = 1;
            boolean z10 = l1Var.g() == 0;
            jVar2.L(-1395161487);
            boolean zK = jVar2.K(l1Var);
            Object objG = jVar2.g();
            Object obj = j.a.f31715a;
            if (zK || objG == obj) {
                objG = new b9.d1(l1Var, 1);
                jVar2.C(objG);
            }
            jVar2.B();
            t0.he.b(z10, (eh.a) objG, null, false, c.F, c.G, 0L, 0L, jVar2, 221184, 460);
            boolean z11 = l1Var.g() == 1;
            jVar2.L(-1395149455);
            boolean zK2 = jVar2.K(l1Var);
            Object objG2 = jVar2.g();
            if (zK2 || objG2 == obj) {
                objG2 = new a9.i(l1Var, i10);
                jVar2.C(objG2);
            }
            jVar2.B();
            t0.he.b(z11, (eh.a) objG2, null, false, c.H, c.I, 0L, 0L, jVar2, 221184, 460);
        }
        return pg.f0.f21461a;
    }
}
