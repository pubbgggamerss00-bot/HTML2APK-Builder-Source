package f9;

/* loaded from: classes.dex */
public final class ua implements eh.p<x0.j, Integer, pg.f0> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ x0.n1<Boolean> f10724a;

    public ua(x0.n1<Boolean> n1Var) {
        this.f10724a = n1Var;
    }

    @Override // eh.p
    public final pg.f0 invoke(x0.j jVar, Integer num) {
        x0.j jVar2 = jVar;
        if ((num.intValue() & 3) == 2 && jVar2.s()) {
            jVar2.v();
        } else {
            t0.d3.f25640a.a(this.f10724a.getValue().booleanValue(), null, jVar2, 0);
        }
        return pg.f0.f21461a;
    }
}
