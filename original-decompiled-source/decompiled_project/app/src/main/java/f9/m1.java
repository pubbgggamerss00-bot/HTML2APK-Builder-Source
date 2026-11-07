package f9;

/* loaded from: classes.dex */
public final class m1 implements eh.p<x0.j, Integer, pg.f0> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ boolean f10016a;

    public m1(boolean z10) {
        this.f10016a = z10;
    }

    @Override // eh.p
    public final pg.f0 invoke(x0.j jVar, Integer num) {
        x0.j jVar2 = jVar;
        if ((num.intValue() & 3) == 2 && jVar2.s()) {
            jVar2.v();
        } else {
            t0.m1.a(this.f10016a, null, null, false, null, jVar2, 48, 60);
        }
        return pg.f0.f21461a;
    }
}
