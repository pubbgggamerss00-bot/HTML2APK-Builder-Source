package j9;

import j9.x1;
import t0.ff;

/* loaded from: classes.dex */
public final class h0 implements eh.p<x0.j, Integer, pg.f0> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ x1.a f15412a;

    public h0(x1.a aVar) {
        this.f15412a = aVar;
    }

    @Override // eh.p
    public final pg.f0 invoke(x0.j jVar, Integer num) {
        x0.j jVar2 = jVar;
        if ((num.intValue() & 3) == 2 && jVar2.s()) {
            jVar2.v();
        } else {
            ff.b(this.f15412a.f15637b, null, 0L, 0L, x2.p.f32033f, null, 0L, null, 0L, 2, false, 1, 0, null, jVar2, 196608, 3120, 120798);
        }
        return pg.f0.f21461a;
    }
}
