package t0;

/* loaded from: classes.dex */
public final class nc extends kotlin.jvm.internal.s implements eh.p<x0.j, Integer, pg.f0> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ic f26535a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nc(ic icVar) {
        super(2);
        f1.b bVar = m2.f26421a;
        this.f26535a = icVar;
    }

    @Override // eh.p
    public final pg.f0 invoke(x0.j jVar, Integer num) {
        x0.j jVar2 = jVar;
        if ((num.intValue() & 3) == 2 && jVar2.s()) {
            jVar2.v();
        } else {
            f1.b bVar = m2.f26421a;
            ic icVar = this.f26535a;
            kotlin.jvm.internal.r.b(icVar);
            bVar.b(icVar, jVar2, 0);
        }
        return pg.f0.f21461a;
    }
}
