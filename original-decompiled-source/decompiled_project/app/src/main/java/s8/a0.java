package s8;

import t0.t4;

/* loaded from: classes.dex */
public final class a0 implements eh.p<x0.j, Integer, pg.f0> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ boolean f24602a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ w1.d f24603b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ w1.d f24604c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ e2 f24605d;

    public a0(boolean z10, w1.d dVar, w1.d dVar2, e2 e2Var) {
        this.f24602a = z10;
        this.f24603b = dVar;
        this.f24604c = dVar2;
        this.f24605d = e2Var;
    }

    @Override // eh.p
    public final pg.f0 invoke(x0.j jVar, Integer num) {
        x0.j jVar2 = jVar;
        if ((num.intValue() & 3) == 2 && jVar2.s()) {
            jVar2.v();
        } else {
            t4.b(this.f24602a ? this.f24603b : this.f24604c, f3.q.c(this.f24605d.f24628b, jVar2), null, 0L, jVar2, 0, 12);
        }
        return pg.f0.f21461a;
    }
}
