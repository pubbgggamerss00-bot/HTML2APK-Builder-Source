package q5;

import q5.o;

/* loaded from: classes.dex */
public final class l implements eh.p<x0.j, Integer, pg.f0> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ o.a f22001a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ p5.s f22002b;

    public l(o.a aVar, p5.s sVar) {
        this.f22001a = aVar;
        this.f22002b = sVar;
    }

    @Override // eh.p
    public final pg.f0 invoke(x0.j jVar, Integer num) {
        x0.j jVar2 = jVar;
        if ((num.intValue() & 3) == 2 && jVar2.s()) {
            jVar2.v();
        } else {
            this.f22001a.f22029g.b(this.f22002b, jVar2, 0);
        }
        return pg.f0.f21461a;
    }
}
