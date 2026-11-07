package f9;

import com.basitce.htmltoapk.R;

/* loaded from: classes.dex */
public final class s1 implements eh.q<z.n1, x0.j, Integer, pg.f0> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f10473a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ long f10474b;

    public s1(int i10, long j10) {
        this.f10473a = i10;
        this.f10474b = j10;
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
            t0.ff.b(f3.q.c(R.string.editor_html_replace, jVar2), null, this.f10473a > 0 ? this.f10474b : q1.b1.f21654h, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, jVar2, 0, 0, 131066);
        }
        return pg.f0.f21461a;
    }
}
