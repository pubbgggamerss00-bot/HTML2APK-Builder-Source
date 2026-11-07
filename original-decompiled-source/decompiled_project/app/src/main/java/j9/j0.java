package j9;

import t0.s4;
import x0.j;

/* loaded from: classes.dex */
public final class j0 implements eh.p<x0.j, Integer, pg.f0> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ p5.x f15442a;

    public j0(p5.x xVar) {
        this.f15442a = xVar;
    }

    @Override // eh.p
    public final pg.f0 invoke(x0.j jVar, Integer num) {
        x0.j jVar2 = jVar;
        if ((num.intValue() & 3) == 2 && jVar2.s()) {
            jVar2.v();
        } else {
            jVar2.L(-810667363);
            p5.x xVar = this.f15442a;
            boolean zL = jVar2.l(xVar);
            Object objG = jVar2.g();
            if (zL || objG == j.a.f31715a) {
                objG = new i0(xVar, 0);
                jVar2.C(objG);
            }
            jVar2.B();
            s4.c((eh.a) objG, null, false, null, f.f15364e, jVar2, 196608, 30);
        }
        return pg.f0.f21461a;
    }
}
