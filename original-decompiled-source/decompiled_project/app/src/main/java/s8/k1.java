package s8;

import android.os.Bundle;

/* loaded from: classes.dex */
public final class k1 implements eh.r<r.n, p5.s, x0.j, Integer, pg.f0> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ p5.s0 f24676a;

    public k1(p5.s0 s0Var) {
        this.f24676a = s0Var;
    }

    @Override // eh.r
    public final pg.f0 f(r.n nVar, p5.s sVar, x0.j jVar, Integer num) {
        String string;
        p5.s sVar2 = sVar;
        x0.j jVar2 = jVar;
        ji.a.a(num, nVar, "$this$page", sVar2, "backStackEntry");
        Bundle bundleA = sVar2.f21275h.a();
        if (bundleA == null || (string = bundleA.getString("templateId")) == null) {
            string = "";
        }
        j9.d0.g(this.f24676a, string, null, null, jVar2, 0);
        return pg.f0.f21461a;
    }
}
