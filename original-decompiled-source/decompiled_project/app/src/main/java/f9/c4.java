package f9;

/* loaded from: classes.dex */
public final class c4 implements eh.p<x0.j, Integer, pg.f0> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ph f9211a;

    public c4(ph phVar) {
        this.f9211a = phVar;
    }

    @Override // eh.p
    public final pg.f0 invoke(x0.j jVar, Integer num) {
        x0.j jVar2 = jVar;
        if ((num.intValue() & 3) == 2 && jVar2.s()) {
            jVar2.v();
        } else {
            t0.ff.b(this.f9211a.f10256a, null, 0L, 0L, x2.p.f32032e, x2.f.f32016c, 0L, null, 0L, 0, false, 0, 0, null, jVar2, 196608, 0, 130974);
        }
        return pg.f0.f21461a;
    }
}
