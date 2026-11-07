package q8;

import com.basitce.htmltoapk.R;
import t0.ff;

/* loaded from: classes.dex */
public final class n1 implements eh.q<z.n1, x0.j, Integer, pg.f0> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ l1 f22322a;

    public n1(l1 l1Var) {
        this.f22322a = l1Var;
    }

    @Override // eh.q
    public final pg.f0 b(z.n1 n1Var, x0.j jVar, Integer num) {
        z.n1 TextButton = n1Var;
        x0.j jVar2 = jVar;
        int iIntValue = num.intValue();
        kotlin.jvm.internal.r.e(TextButton, "$this$TextButton");
        if ((iIntValue & 17) == 16 && jVar2.s()) {
            jVar2.v();
        } else {
            ff.b(f3.q.c(R.string.home_limit_upgrade, jVar2), null, this.f22322a.f22292a, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, jVar2, 0, 0, 131066);
        }
        return pg.f0.f21461a;
    }
}
