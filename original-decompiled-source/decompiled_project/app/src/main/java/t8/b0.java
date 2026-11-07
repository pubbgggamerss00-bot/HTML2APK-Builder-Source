package t8;

import t0.s4;
import x0.j;

/* loaded from: classes.dex */
public final class b0 implements eh.p<x0.j, Integer, pg.f0> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ p5.x f28107a;

    public b0(p5.x xVar) {
        this.f28107a = xVar;
    }

    @Override // eh.p
    public final pg.f0 invoke(x0.j jVar, Integer num) {
        x0.j jVar2 = jVar;
        if ((num.intValue() & 3) == 2 && jVar2.s()) {
            jVar2.v();
        } else {
            jVar2.L(1437364419);
            p5.x xVar = this.f28107a;
            boolean zL = jVar2.l(xVar);
            Object objG = jVar2.g();
            if (zL || objG == j.a.f31715a) {
                objG = new s8.o0(xVar, 1);
                jVar2.C(objG);
            }
            jVar2.B();
            s4.c((eh.a) objG, null, false, null, b4.f28120b, jVar2, 196608, 30);
        }
        return pg.f0.f21461a;
    }
}
