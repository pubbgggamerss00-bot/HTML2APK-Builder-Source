package a9;

import androidx.compose.ui.d;
import com.basitce.htmltoapk.R;
import t0.ff;
import t0.z9;

/* loaded from: classes.dex */
public final class o implements eh.q<z.n1, x0.j, Integer, pg.f0> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ boolean f270a;

    public o(boolean z10) {
        this.f270a = z10;
    }

    @Override // eh.q
    public final pg.f0 b(z.n1 n1Var, x0.j jVar, Integer num) {
        z.n1 Button = n1Var;
        x0.j jVar2 = jVar;
        int iIntValue = num.intValue();
        kotlin.jvm.internal.r.e(Button, "$this$Button");
        if ((iIntValue & 17) == 16 && jVar2.s()) {
            jVar2.v();
        } else if (this.f270a) {
            jVar2.L(1626256588);
            z9.a(2, 0, 438, 24, p.f276a, 0L, androidx.compose.foundation.layout.g.n(d.a.f1143b, 18), jVar2);
            jVar2.B();
        } else {
            jVar2.L(191010703);
            ff.b(f3.q.c(R.string.credits_sign_in, jVar2), null, 0L, 0L, x2.p.f32033f, null, 0L, null, 0L, 0, false, 0, 0, null, jVar2, 196608, 0, 131038);
            jVar2.B();
        }
        return pg.f0.f21461a;
    }
}
