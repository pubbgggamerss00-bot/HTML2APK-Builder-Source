package s8;

import t0.t4;

/* loaded from: classes.dex */
public final class d implements eh.p<x0.j, Integer, pg.f0> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ boolean f24615a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ w1.d f24616b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ w1.d f24617c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ e2 f24618d;

    public d(boolean z10, w1.d dVar, w1.d dVar2, e2 e2Var) {
        this.f24615a = z10;
        this.f24616b = dVar;
        this.f24617c = dVar2;
        this.f24618d = e2Var;
    }

    @Override // eh.p
    public final pg.f0 invoke(x0.j jVar, Integer num) {
        x0.j jVar2 = jVar;
        if ((num.intValue() & 3) == 2 && jVar2.s()) {
            jVar2.v();
        } else {
            t4.b(this.f24615a ? this.f24616b : this.f24617c, f3.q.c(this.f24618d.f24628b, jVar2), null, 0L, jVar2, 0, 12);
        }
        return pg.f0.f21461a;
    }
}
