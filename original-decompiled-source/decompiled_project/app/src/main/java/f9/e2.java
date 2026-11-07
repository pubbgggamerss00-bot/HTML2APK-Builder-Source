package f9;

/* loaded from: classes.dex */
public final class e2 implements eh.p<x0.j, Integer, pg.f0> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ long f9479a;

    public e2(long j10) {
        this.f9479a = j10;
    }

    @Override // eh.p
    public final pg.f0 invoke(x0.j jVar, Integer num) {
        x0.j jVar2 = jVar;
        if ((num.intValue() & 3) == 2 && jVar2.s()) {
            jVar2.v();
        } else {
            t0.t4.b(r0.v0.a(), null, null, this.f9479a, jVar2, 48, 4);
        }
        return pg.f0.f21461a;
    }
}
