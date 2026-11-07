package y8;

import com.basitce.htmltoapk.R;
import t0.ff;
import z.n1;

/* loaded from: classes.dex */
public final class k1 implements eh.q<n1, x0.j, Integer, pg.f0> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ x0.n1<String> f34164a;

    public k1(x0.n1<String> n1Var) {
        this.f34164a = n1Var;
    }

    @Override // eh.q
    public final pg.f0 b(n1 n1Var, x0.j jVar, Integer num) {
        n1 OutlinedButton = n1Var;
        x0.j jVar2 = jVar;
        int iIntValue = num.intValue();
        kotlin.jvm.internal.r.e(OutlinedButton, "$this$OutlinedButton");
        if ((iIntValue & 17) == 16 && jVar2.s()) {
            jVar2.v();
        } else {
            jVar2.L(957539893);
            x0.n1<String> n1Var2 = this.f34164a;
            String strC = mh.x.A(n1Var2.getValue()) ? f3.q.c(R.string.keystore_pepk_pick_pem, jVar2) : n1Var2.getValue();
            jVar2.B();
            ff.b(strC, null, 0L, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, jVar2, 0, 0, 131070);
        }
        return pg.f0.f21461a;
    }
}
