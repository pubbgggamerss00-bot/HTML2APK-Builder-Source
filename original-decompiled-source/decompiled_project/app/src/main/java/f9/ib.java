package f9;

import x0.j;

/* loaded from: classes.dex */
public final class ib implements eh.p<x0.j, Integer, pg.f0> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ fg f9804a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ p5.x f9805b;

    public ib(fg fgVar, p5.x xVar) {
        this.f9804a = fgVar;
        this.f9805b = xVar;
    }

    @Override // eh.p
    public final pg.f0 invoke(x0.j jVar, Integer num) {
        x0.j jVar2 = jVar;
        if ((num.intValue() & 3) == 2 && jVar2.s()) {
            jVar2.v();
        } else {
            jVar2.L(1257615133);
            fg fgVar = this.f9804a;
            boolean zL = jVar2.l(fgVar);
            p5.x xVar = this.f9805b;
            boolean zL2 = zL | jVar2.l(xVar);
            Object objG = jVar2.g();
            if (zL2 || objG == j.a.f31715a) {
                objG = new androidx.credentials.playservices.controllers.identityauth.createpublickeycredential.d(1, fgVar, xVar);
                jVar2.C(objG);
            }
            jVar2.B();
            t0.s4.c((eh.a) objG, null, false, null, e.f9338a, jVar2, 196608, 30);
        }
        return pg.f0.f21461a;
    }
}
