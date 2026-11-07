package u8;

import t0.ff;

/* loaded from: classes.dex */
public final class f0 implements eh.p<x0.j, Integer, pg.f0> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f29448a;

    public f0(String str) {
        this.f29448a = str;
    }

    @Override // eh.p
    public final pg.f0 invoke(x0.j jVar, Integer num) {
        x0.j jVar2 = jVar;
        if ((num.intValue() & 3) == 2 && jVar2.s()) {
            jVar2.v();
        } else {
            ff.b(this.f29448a, null, 0L, f3.u.c(14), null, null, 0L, null, 0L, 0, false, 0, 0, null, jVar2, 3072, 0, 131062);
        }
        return pg.f0.f21461a;
    }
}
