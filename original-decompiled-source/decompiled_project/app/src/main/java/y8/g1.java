package y8;

import androidx.compose.ui.d;
import com.basitce.htmltoapk.R;
import t0.ff;
import t0.z9;
import z.n1;

/* loaded from: classes.dex */
public final class g1 implements eh.q<n1, x0.j, Integer, pg.f0> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ x0.n1<Boolean> f34137a;

    public g1(x0.n1<Boolean> n1Var) {
        this.f34137a = n1Var;
    }

    @Override // eh.q
    public final pg.f0 b(n1 n1Var, x0.j jVar, Integer num) {
        n1 TextButton = n1Var;
        x0.j jVar2 = jVar;
        int iIntValue = num.intValue();
        kotlin.jvm.internal.r.e(TextButton, "$this$TextButton");
        if ((iIntValue & 17) == 16 && jVar2.s()) {
            jVar2.v();
        } else if (this.f34137a.getValue().booleanValue()) {
            jVar2.L(-1761468283);
            z9.a(2, 0, 390, 26, 0L, 0L, androidx.compose.foundation.layout.g.n(d.a.f1143b, 18), jVar2);
            jVar2.B();
        } else {
            jVar2.L(-1761346050);
            ff.b(f3.q.c(R.string.keystore_pepk_generate, jVar2), null, 0L, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, jVar2, 0, 0, 131070);
            jVar2.B();
        }
        return pg.f0.f21461a;
    }
}
