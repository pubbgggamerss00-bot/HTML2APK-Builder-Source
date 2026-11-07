package f9;

import com.basitce.htmltoapk.R;

/* loaded from: classes.dex */
public final class j9 implements eh.q<z.n1, x0.j, Integer, pg.f0> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f9883a;

    public j9(String str) {
        this.f9883a = str;
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
            jVar2.L(-108327307);
            String strC = this.f9883a;
            if (mh.x.A(strC)) {
                strC = f3.q.c(R.string.pdf_select, jVar2);
            }
            jVar2.B();
            t0.ff.b(strC, null, 0L, 0L, null, null, 0L, null, 0L, 0, false, 2, 0, null, jVar2, 0, 3072, 122878);
        }
        return pg.f0.f21461a;
    }
}
