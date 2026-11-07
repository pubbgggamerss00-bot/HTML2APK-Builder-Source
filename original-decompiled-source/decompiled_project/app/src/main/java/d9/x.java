package d9;

import androidx.compose.ui.d;
import com.basitce.htmltoapk.R;
import pg.f0;
import t0.e2;
import t0.f2;
import t0.ff;
import t0.z9;
import z.n1;

/* loaded from: classes.dex */
public final class x implements eh.q<n1, x0.j, Integer, f0> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ x0.n1 f7663a;

    public x(x0.n1 n1Var) {
        this.f7663a = n1Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // eh.q
    public final f0 b(n1 n1Var, x0.j jVar, Integer num) {
        n1 Button = n1Var;
        x0.j jVar2 = jVar;
        int iIntValue = num.intValue();
        kotlin.jvm.internal.r.e(Button, "$this$Button");
        if ((iIntValue & 17) == 16 && jVar2.s()) {
            jVar2.v();
        } else {
            h0.e eVar = m.f7624a;
            if (((Boolean) this.f7663a.getValue()).booleanValue()) {
                jVar2.L(-1451238379);
                z9.a(2, 0, 390, 24, ((e2) jVar2.f(f2.f25858a)).f25778x, 0L, androidx.compose.foundation.layout.g.n(d.a.f1143b, 18), jVar2);
                jVar2.B();
            } else {
                jVar2.L(-1847925156);
                ff.b(f3.q.c(R.string.profile_delete_account_confirm, jVar2), null, 0L, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, jVar2, 0, 0, 131070);
                jVar2.B();
            }
        }
        return f0.f21461a;
    }
}
