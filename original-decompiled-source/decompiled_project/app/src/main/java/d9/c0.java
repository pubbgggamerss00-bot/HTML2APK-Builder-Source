package d9;

import androidx.compose.ui.d;
import com.basitce.htmltoapk.R;
import pg.f0;
import t0.ff;
import t0.z9;
import z.n1;

/* loaded from: classes.dex */
public final class c0 implements eh.q<n1, x0.j, Integer, f0> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ boolean f7597a;

    public c0(boolean z10) {
        this.f7597a = z10;
    }

    @Override // eh.q
    public final f0 b(n1 n1Var, x0.j jVar, Integer num) {
        n1 FilledTonalButton = n1Var;
        x0.j jVar2 = jVar;
        int iIntValue = num.intValue();
        kotlin.jvm.internal.r.e(FilledTonalButton, "$this$FilledTonalButton");
        if ((iIntValue & 17) == 16 && jVar2.s()) {
            jVar2.v();
        } else if (this.f7597a) {
            jVar2.L(2007628127);
            z9.a(2, 0, 390, 26, 0L, 0L, androidx.compose.foundation.layout.g.n(d.a.f1143b, 20), jVar2);
            jVar2.B();
        } else {
            jVar2.L(2007630986);
            ff.b(f3.q.c(R.string.ai_sign_in_google, jVar2), null, 0L, 0L, x2.p.f32033f, null, 0L, null, 0L, 0, false, 0, 0, null, jVar2, 196608, 0, 131038);
            jVar2.B();
        }
        return f0.f21461a;
    }
}
