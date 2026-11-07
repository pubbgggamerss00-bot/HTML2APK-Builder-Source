package t8;

import androidx.compose.ui.d;
import com.basitce.htmltoapk.R;
import t0.ff;
import t0.nf;
import t0.of;
import t0.t4;

/* loaded from: classes.dex */
public final class p implements eh.q<z.n1, x0.j, Integer, pg.f0> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ boolean f28376a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f28377b;

    public p(boolean z10, boolean z11) {
        this.f28376a = z10;
        this.f28377b = z11;
    }

    @Override // eh.q
    public final pg.f0 b(z.n1 n1Var, x0.j jVar, Integer num) {
        z.n1 Button = n1Var;
        x0.j jVar2 = jVar;
        int iIntValue = num.intValue();
        kotlin.jvm.internal.r.e(Button, "$this$Button");
        if ((iIntValue & 17) == 16 && jVar2.s()) {
            jVar2.v();
        } else {
            t4.b(p0.y.a(), null, null, 0L, jVar2, 48, 12);
            p1.d.b(androidx.compose.foundation.layout.g.r(d.a.f1143b, 8), jVar2);
            ff.b(f3.q.c(!this.f28376a ? R.string.credits_sign_in : this.f28377b ? R.string.profile_buy_credits : R.string.ai_create_button, jVar2), null, 0L, 0L, x2.p.f32033f, null, 0L, null, 0L, 0, false, 0, 0, ((nf) jVar2.f(of.f26647a)).f26545h, jVar2, 196608, 0, 65502);
        }
        return pg.f0.f21461a;
    }
}
