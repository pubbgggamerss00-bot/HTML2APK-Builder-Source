package b9;

import t0.ff;

/* loaded from: classes.dex */
public final class q3 implements eh.p<x0.j, Integer, pg.f0> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f4071a;

    public q3(String str) {
        this.f4071a = str;
    }

    @Override // eh.p
    public final pg.f0 invoke(x0.j jVar, Integer num) {
        x0.j jVar2 = jVar;
        if ((num.intValue() & 3) == 2 && jVar2.s()) {
            jVar2.v();
        } else {
            ff.b(this.f4071a, null, 0L, 0L, x2.p.f32033f, null, 0L, null, 0L, 2, false, 1, 0, null, jVar2, 196608, 3120, 120798);
        }
        return pg.f0.f21461a;
    }
}
