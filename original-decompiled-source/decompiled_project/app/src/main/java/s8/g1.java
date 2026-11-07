package s8;

import android.net.Uri;
import android.os.Bundle;
import b9.p3;

/* loaded from: classes.dex */
public final class g1 implements eh.r<r.n, p5.s, x0.j, Integer, pg.f0> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ p5.s0 f24668a;

    public g1(p5.s0 s0Var) {
        this.f24668a = s0Var;
    }

    @Override // eh.r
    public final pg.f0 f(r.n nVar, p5.s sVar, x0.j jVar, Integer num) {
        p5.s sVar2 = sVar;
        x0.j jVar2 = jVar;
        ji.a.a(num, nVar, "$this$page", sVar2, "entry");
        Bundle bundleA = sVar2.f21275h.a();
        String string = bundleA != null ? bundleA.getString("uri") : null;
        if (string == null) {
            string = "";
        }
        p3.b(this.f24668a, Uri.parse(string), null, jVar2, 0, 4);
        return pg.f0.f21461a;
    }
}
