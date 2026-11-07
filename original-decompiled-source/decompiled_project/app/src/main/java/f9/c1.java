package f9;

/* loaded from: classes.dex */
public final class c1 implements eh.p<x0.j, Integer, pg.f0> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ t0.e2 f9201a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f9202b;

    public c1(t0.e2 e2Var, String str) {
        this.f9201a = e2Var;
        this.f9202b = str;
    }

    @Override // eh.p
    public final pg.f0 invoke(x0.j jVar, Integer num) {
        x0.j jVar2 = jVar;
        if ((num.intValue() & 3) == 2 && jVar2.s()) {
            jVar2.v();
        } else {
            x2.r rVar = x2.f.f32016c;
            t2.l0 l0Var = new t2.l0(0L, f3.u.c(15), x2.p.f32032e, rVar, 0L, 0, 0L, 16777177);
            t0.ff.b(this.f9202b, null, this.f9201a.f25771q, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, l0Var, jVar2, 0, 0, 65530);
        }
        return pg.f0.f21461a;
    }
}
