package f9;

import com.basitce.htmltoapk.R;

/* loaded from: classes.dex */
public final class zd implements eh.q<z.n1, x0.j, Integer, pg.f0> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f11098a;

    public zd(int i10) {
        this.f11098a = i10;
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
            int i10 = this.f11098a;
            t0.ff.b(f3.q.d(R.string.editor_show_more_files, new Object[]{Integer.valueOf(Math.min(i10, 50)), Integer.valueOf(i10)}, jVar2), null, 0L, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, jVar2, 0, 0, 131070);
        }
        return pg.f0.f21461a;
    }
}
