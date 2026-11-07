package j9;

import t0.ff;

/* loaded from: classes.dex */
public final class v0 implements eh.p<x0.j, Integer, pg.f0> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f15562a;

    public v0(String str) {
        this.f15562a = str;
    }

    @Override // eh.p
    public final pg.f0 invoke(x0.j jVar, Integer num) {
        x0.j jVar2 = jVar;
        if ((num.intValue() & 3) == 2 && jVar2.s()) {
            jVar2.v();
        } else {
            ff.b(d0.k(this.f15562a, jVar2), null, 0L, 0L, x2.p.f32033f, null, 0L, null, 0L, 0, false, 0, 0, null, jVar2, 196608, 0, 131038);
        }
        return pg.f0.f21461a;
    }
}
