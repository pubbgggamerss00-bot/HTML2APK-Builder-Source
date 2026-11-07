package s8;

/* loaded from: classes.dex */
public final class z1 implements eh.p<x0.j, Integer, pg.f0> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ f1.b f24765a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ r.n f24766b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ p5.s f24767c;

    public z1(f1.b bVar, r.n nVar, p5.s sVar) {
        this.f24765a = bVar;
        this.f24766b = nVar;
        this.f24767c = sVar;
    }

    @Override // eh.p
    public final pg.f0 invoke(x0.j jVar, Integer num) {
        x0.j jVar2 = jVar;
        if ((num.intValue() & 3) == 2 && jVar2.s()) {
            jVar2.v();
        } else {
            this.f24765a.f(this.f24766b, this.f24767c, jVar2, 0);
        }
        return pg.f0.f21461a;
    }
}
