package q5;

import q5.e;

/* loaded from: classes.dex */
public final class l0 implements eh.p<x0.j, Integer, pg.f0> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ p5.s f22003a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ r.n f22004b;

    public l0(p5.s sVar, r.n nVar) {
        this.f22003a = sVar;
        this.f22004b = nVar;
    }

    @Override // eh.p
    public final pg.f0 invoke(x0.j jVar, Integer num) {
        x0.j jVar2 = jVar;
        if ((num.intValue() & 3) == 2 && jVar2.s()) {
            jVar2.v();
        } else {
            p5.s sVar = this.f22003a;
            p5.k0 k0Var = sVar.f21269b;
            kotlin.jvm.internal.r.c(k0Var, "null cannot be cast to non-null type androidx.navigation.compose.ComposeNavigator.Destination");
            ((e.a) k0Var).f21951f.f(this.f22004b, sVar, jVar2, 0);
        }
        return pg.f0.f21461a;
    }
}
