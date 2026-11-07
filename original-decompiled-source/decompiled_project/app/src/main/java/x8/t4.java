package x8;

import androidx.compose.ui.d;
import com.basitce.htmltoapk.R;
import t0.ff;

/* loaded from: classes.dex */
public final class t4 implements eh.p<x0.j, Integer, pg.f0> {
    @Override // eh.p
    public final pg.f0 invoke(x0.j jVar, Integer num) {
        x0.j jVar2 = jVar;
        if ((num.intValue() & 3) == 2 && jVar2.s()) {
            jVar2.v();
        } else {
            String strC = f3.q.c(R.string.projects_title, jVar2);
            x2.p pVar = x2.p.f32033f;
            long j10 = ((t0.e2) jVar2.f(t0.f2.f25858a)).f25769o;
            jVar2.L(-1154294676);
            jVar2.B();
            ff.b(strC, d.a.f1143b, j10, 0L, pVar, null, 0L, null, 0L, 0, false, 0, 0, null, jVar2, 196608, 0, 131032);
        }
        return pg.f0.f21461a;
    }
}
