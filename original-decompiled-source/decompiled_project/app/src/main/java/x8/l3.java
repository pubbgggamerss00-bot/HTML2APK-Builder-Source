package x8;

import androidx.compose.ui.d;
import com.basitce.htmltoapk.R;
import t0.ff;
import t0.nf;
import t0.of;

/* loaded from: classes.dex */
public final class l3 implements eh.q<c0.v, x0.j, Integer, pg.f0> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ x0.n1<String> f32908a;

    public l3(x0.n1<String> n1Var) {
        this.f32908a = n1Var;
    }

    @Override // eh.q
    public final pg.f0 b(c0.v vVar, x0.j jVar, Integer num) {
        c0.v item = vVar;
        x0.j jVar2 = jVar;
        int iIntValue = num.intValue();
        kotlin.jvm.internal.r.e(item, "$this$item");
        if ((iIntValue & 17) == 16 && jVar2.s()) {
            jVar2.v();
        } else {
            boolean z10 = g5.f32665a;
            ff.b(f3.q.c(this.f32908a.getValue() != null ? R.string.filter_empty : R.string.folder_empty, jVar2), androidx.compose.foundation.layout.f.i(androidx.compose.foundation.layout.g.d(d.a.f1143b, 1.0f), 16, 32), ((t0.e2) jVar2.f(t0.f2.f25858a)).f25773s, 0L, null, null, 0L, new e3.h(3), 0L, 0, false, 0, 0, ((nf) jVar2.f(of.f26647a)).f26548k, jVar2, 0, 0, 65016);
        }
        return pg.f0.f21461a;
    }
}
