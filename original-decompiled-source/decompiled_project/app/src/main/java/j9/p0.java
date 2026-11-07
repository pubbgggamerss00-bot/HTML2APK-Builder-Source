package j9;

import com.basitce.htmltoapk.R;
import t0.ff;

/* loaded from: classes.dex */
public final class p0 implements eh.q<z.n1, x0.j, Integer, pg.f0> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ x0.n1<Boolean> f15489a;

    public p0(x0.n1<Boolean> n1Var) {
        this.f15489a = n1Var;
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
            ff.b(f3.q.c(this.f15489a.getValue().booleanValue() ? R.string.catalog_collapse : R.string.catalog_expand, jVar2), null, 0L, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, jVar2, 0, 0, 131070);
        }
        return pg.f0.f21461a;
    }
}
