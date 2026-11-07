package x8;

import com.basitce.htmltoapk.R;
import t0.ff;
import x8.j6;

/* loaded from: classes.dex */
public final class d4 implements eh.q<z.n1, x0.j, Integer, pg.f0> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ j6.b f32498a;

    public d4(j6.b bVar) {
        this.f32498a = bVar;
    }

    @Override // eh.q
    public final pg.f0 b(z.n1 n1Var, x0.j jVar, Integer num) {
        long j10;
        z.n1 TextButton = n1Var;
        x0.j jVar2 = jVar;
        int iIntValue = num.intValue();
        kotlin.jvm.internal.r.e(TextButton, "$this$TextButton");
        if ((iIntValue & 17) == 16 && jVar2.s()) {
            jVar2.v();
        } else {
            String strC = f3.q.c(R.string.home_open_folder, jVar2);
            if (this.f32498a.f32804b != null) {
                jVar2.L(-1860046228);
                j10 = ((t0.e2) jVar2.f(t0.f2.f25858a)).f25751a;
            } else {
                jVar2.L(-1860044971);
                j10 = ((t0.e2) jVar2.f(t0.f2.f25858a)).f25773s;
            }
            jVar2.B();
            ff.b(strC, null, j10, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, jVar2, 0, 0, 131066);
        }
        return pg.f0.f21461a;
    }
}
