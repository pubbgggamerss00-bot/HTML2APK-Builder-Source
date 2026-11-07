package s8;

import android.os.Bundle;
import f9.b8;

/* loaded from: classes.dex */
public final class f0 implements eh.r<r.n, p5.s, x0.j, Integer, pg.f0> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ p5.s0 f24662a;

    public f0(p5.s0 s0Var) {
        this.f24662a = s0Var;
    }

    @Override // eh.r
    public final pg.f0 f(r.n nVar, p5.s sVar, x0.j jVar, Integer num) {
        p5.s sVar2 = sVar;
        x0.j jVar2 = jVar;
        ji.a.a(num, nVar, "$this$page", sVar2, "backStackEntry");
        s5.c cVar = sVar2.f21275h;
        Bundle bundleA = cVar.a();
        long j10 = bundleA != null ? bundleA.getLong("projectId") : 0L;
        Bundle bundleA2 = cVar.a();
        boolean z10 = bundleA2 != null ? bundleA2.getBoolean("openHtmlEditor") : false;
        Bundle bundleA3 = cVar.a();
        String string = bundleA3 != null ? bundleA3.getString("initialHtmlUri") : null;
        if (string == null) {
            string = "";
        }
        b8.t(this.f24662a, j10, z10, string, null, null, jVar2, 0);
        return pg.f0.f21461a;
    }
}
