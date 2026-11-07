package s8;

import android.os.Bundle;

/* loaded from: classes.dex */
public final class t0 implements eh.r<r.n, p5.s, x0.j, Integer, pg.f0> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ p5.s0 f24733a;

    public t0(p5.s0 s0Var) {
        this.f24733a = s0Var;
    }

    @Override // eh.r
    public final pg.f0 f(r.n nVar, p5.s sVar, x0.j jVar, Integer num) {
        p5.s sVar2 = sVar;
        x0.j jVar2 = jVar;
        ji.a.a(num, nVar, "$this$page", sVar2, "backStackEntry");
        Bundle bundleA = sVar2.f21275h.a();
        e9.q0.a(this.f24733a, bundleA != null ? bundleA.getLong("projectId") : 0L, null, jVar2, 0);
        return pg.f0.f21461a;
    }
}
