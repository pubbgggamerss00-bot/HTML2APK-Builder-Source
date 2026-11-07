package z8;

import androidx.compose.ui.d;
import com.basitce.htmltoapk.R;
import t0.ff;
import t0.t4;
import z.n1;

/* loaded from: classes.dex */
public final class v implements eh.q<n1, x0.j, Integer, pg.f0> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ boolean f34859a;

    public v(boolean z10) {
        this.f34859a = z10;
    }

    @Override // eh.q
    public final pg.f0 b(n1 n1Var, x0.j jVar, Integer num) {
        n1 Button = n1Var;
        x0.j jVar2 = jVar;
        int iIntValue = num.intValue();
        kotlin.jvm.internal.r.e(Button, "$this$Button");
        if ((iIntValue & 17) == 16 && jVar2.s()) {
            jVar2.v();
        } else {
            boolean z10 = this.f34859a;
            ff.b(f3.q.c(z10 ? R.string.onboarding_get_started : R.string.common_next, jVar2), null, 0L, 0L, x2.p.f32033f, null, 0L, null, 0L, 0, false, 0, 0, null, jVar2, 196608, 0, 131038);
            p1.d.b(androidx.compose.foundation.layout.g.r(d.a.f1143b, 8), jVar2);
            t4.b(z10 ? p0.n1.a() : n0.c.a(), null, null, 0L, jVar2, 48, 12);
        }
        return pg.f0.f21461a;
    }
}
