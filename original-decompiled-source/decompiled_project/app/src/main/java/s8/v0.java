package s8;

import android.os.Bundle;
import java.io.IOException;

/* loaded from: classes.dex */
public final class v0 implements eh.r<r.n, p5.s, x0.j, Integer, pg.f0> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ p5.s0 f24743a;

    public v0(p5.s0 s0Var) {
        this.f24743a = s0Var;
    }

    @Override // eh.r
    public final pg.f0 f(r.n nVar, p5.s sVar, x0.j jVar, Integer num) throws IOException {
        String string;
        p5.s sVar2 = sVar;
        x0.j jVar2 = jVar;
        ji.a.a(num, nVar, "$this$page", sVar2, "backStackEntry");
        s5.c cVar = sVar2.f21275h;
        Bundle bundleA = cVar.a();
        long j10 = bundleA != null ? bundleA.getLong("projectId") : 0L;
        Bundle bundleA2 = cVar.a();
        if (bundleA2 == null || (string = bundleA2.getString("outputPath")) == null) {
            string = "";
        }
        e9.q.a(this.f24743a, j10, string, null, jVar2, 0);
        return pg.f0.f21461a;
    }
}
