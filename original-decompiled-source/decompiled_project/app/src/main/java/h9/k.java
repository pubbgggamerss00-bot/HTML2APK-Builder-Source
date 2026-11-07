package h9;

import androidx.compose.ui.d;
import t0.ff;
import t0.t4;

/* loaded from: classes.dex */
public final class k implements eh.q<z.n1, x0.j, Integer, pg.f0> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f12693a;

    public k(String str) {
        this.f12693a = str;
    }

    @Override // eh.q
    public final pg.f0 b(z.n1 n1Var, x0.j jVar, Integer num) {
        z.n1 FilledTonalButton = n1Var;
        x0.j jVar2 = jVar;
        int iIntValue = num.intValue();
        kotlin.jvm.internal.r.e(FilledTonalButton, "$this$FilledTonalButton");
        if ((iIntValue & 17) == 16 && jVar2.s()) {
            jVar2.v();
        } else {
            ff.b(this.f12693a, null, 0L, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, jVar2, 0, 0, 131070);
            t4.b(n0.c.a(), null, androidx.compose.foundation.layout.g.n(d.a.f1143b, 18), 0L, jVar2, 432, 8);
        }
        return pg.f0.f21461a;
    }
}
