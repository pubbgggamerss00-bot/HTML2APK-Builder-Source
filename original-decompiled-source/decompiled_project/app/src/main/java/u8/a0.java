package u8;

import f9.je;
import x0.j;

/* loaded from: classes.dex */
public final class a0 implements eh.p<x0.j, Integer, pg.f0> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ d1 f29393a;

    public a0(d1 d1Var) {
        this.f29393a = d1Var;
    }

    @Override // eh.p
    public final pg.f0 invoke(x0.j jVar, Integer num) {
        x0.j jVar2 = jVar;
        if ((num.intValue() & 3) == 2 && jVar2.s()) {
            jVar2.v();
        } else {
            jVar2.L(480345538);
            d1 d1Var = this.f29393a;
            boolean zL = jVar2.l(d1Var);
            Object objG = jVar2.g();
            if (zL || objG == j.a.f31715a) {
                objG = new je(d1Var, 1);
                jVar2.C(objG);
            }
            jVar2.B();
            z.g1 g1Var = t0.m0.f26400a;
            t0.x0.a((eh.a) objG, null, false, null, t0.m0.a(c2.n0.c(4293571336L), 0L, 0L, jVar2, 14), null, null, null, e1.f29436a, jVar2, 805306368, 494);
        }
        return pg.f0.f21461a;
    }
}
