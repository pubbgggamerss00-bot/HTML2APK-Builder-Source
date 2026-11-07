package t8;

import t0.s4;

/* loaded from: classes.dex */
public final class r2 implements eh.p<x0.j, Integer, pg.f0> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ eh.a<pg.f0> f28427a;

    public r2(eh.a<pg.f0> aVar) {
        this.f28427a = aVar;
    }

    @Override // eh.p
    public final pg.f0 invoke(x0.j jVar, Integer num) {
        x0.j jVar2 = jVar;
        if ((num.intValue() & 3) == 2 && jVar2.s()) {
            jVar2.v();
        } else {
            s4.c(this.f28427a, null, false, null, c4.f28153e, jVar2, 196608, 30);
        }
        return pg.f0.f21461a;
    }
}
