package q5;

/* loaded from: classes.dex */
public final class r implements eh.p<x0.j, Integer, pg.f0> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ g1.d f22037a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ f1.b f22038b;

    public r(g1.d dVar, f1.b bVar) {
        this.f22037a = dVar;
        this.f22038b = bVar;
    }

    @Override // eh.p
    public final pg.f0 invoke(x0.j jVar, Integer num) {
        x0.j jVar2 = jVar;
        if ((num.intValue() & 3) == 2 && jVar2.s()) {
            jVar2.v();
        } else {
            di.p0.b(this.f22037a, this.f22038b, jVar2, 0);
        }
        return pg.f0.f21461a;
    }
}
