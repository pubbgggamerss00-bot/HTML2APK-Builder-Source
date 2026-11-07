package f9;

import androidx.compose.ui.d;
import com.basitce.htmltoapk.R;

/* loaded from: classes.dex */
public final class h9 implements eh.p<x0.j, Integer, pg.f0> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f9765a;

    public h9(String str) {
        this.f9765a = str;
    }

    @Override // eh.p
    public final pg.f0 invoke(x0.j jVar, Integer num) {
        x0.j jVar2 = jVar;
        if ((num.intValue() & 3) == 2 && jVar2.s()) {
            jVar2.v();
        } else {
            t0.ff.b(f3.q.d(R.string.editor_pasted_html, new Object[]{Integer.valueOf(this.f9765a.length())}, jVar2), androidx.compose.foundation.layout.f.i(d.a.f1143b, 8, 4), ((t0.e2) jVar2.f(t0.f2.f25858a)).f25757d, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, ((t0.nf) jVar2.f(t0.of.f26647a)).f26552o, jVar2, 48, 0, 65528);
        }
        return pg.f0.f21461a;
    }
}
