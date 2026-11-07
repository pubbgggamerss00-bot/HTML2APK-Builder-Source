package b9;

/* loaded from: classes.dex */
public final class l2 implements eh.p<x0.j, Integer, pg.f0> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ y2 f3929a;

    public l2(y2 y2Var) {
        this.f3929a = y2Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // eh.p
    public final pg.f0 invoke(x0.j jVar, Integer num) {
        x0.j jVar2 = jVar;
        if ((num.intValue() & 3) == 2 && jVar2.s()) {
            jVar2.v();
        } else {
            Boolean bool = (Boolean) this.f3929a.f4163g.getValue();
            bool.booleanValue();
            f1.b bVar = a.f3685a;
            r.t0.a(bool, null, null, "nightIcon", jVar2, 27648);
        }
        return pg.f0.f21461a;
    }
}
