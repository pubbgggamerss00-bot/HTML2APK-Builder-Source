package s8;

import x0.j;

/* loaded from: classes.dex */
public final class d1 implements eh.r<r.n, p5.s, x0.j, Integer, pg.f0> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ p5.s0 f24620a;

    public d1(p5.s0 s0Var) {
        this.f24620a = s0Var;
    }

    @Override // eh.r
    public final pg.f0 f(r.n nVar, p5.s sVar, x0.j jVar, Integer num) {
        x0.j jVar2 = jVar;
        ji.a.a(num, nVar, "$this$composable", sVar, "it");
        jVar2.L(141075648);
        final p5.s0 s0Var = this.f24620a;
        boolean zL = jVar2.l(s0Var);
        Object objG = jVar2.g();
        if (zL || objG == j.a.f31715a) {
            objG = new eh.a() { // from class: s8.c1
                @Override // eh.a
                public final Object invoke() {
                    b2.e(s0Var);
                    return pg.f0.f21461a;
                }
            };
            jVar2.C(objG);
        }
        jVar2.B();
        u8.y.b((eh.a) objG, null, jVar2, 0);
        return pg.f0.f21461a;
    }
}
