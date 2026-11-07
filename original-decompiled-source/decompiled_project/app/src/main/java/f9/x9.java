package f9;

import androidx.compose.ui.d;
import com.basitce.htmltoapk.R;
import com.yalantis.ucrop.view.CropImageView;
import i2.e0;
import i2.g;
import j1.d;

/* loaded from: classes.dex */
public final class x9 implements eh.q<r.h0, x0.j, Integer, pg.f0> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f10940a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ eh.l<String, pg.f0> f10941b;

    public x9(eh.l lVar, String str) {
        this.f10940a = str;
        this.f10941b = lVar;
    }

    @Override // eh.q
    public final pg.f0 b(r.h0 h0Var, x0.j jVar, Integer num) {
        r.h0 AnimatedVisibility = h0Var;
        x0.j jVar2 = jVar;
        num.intValue();
        kotlin.jvm.internal.r.e(AnimatedVisibility, "$this$AnimatedVisibility");
        z.q qVarA = z.o.a(z.b.h(14), d.a.f14614m, jVar2, 6);
        int iD = jVar2.D();
        x0.a2 a2VarY = jVar2.y();
        androidx.compose.ui.d dVarC = androidx.compose.ui.c.c(d.a.f1143b, jVar2);
        i2.g.f13861o.getClass();
        e0.a aVar = g.a.f13863b;
        if (jVar2.t() == null) {
            c9.u1.d();
            throw null;
        }
        jVar2.r();
        if (jVar2.m()) {
            jVar2.w(aVar);
        } else {
            jVar2.z();
        }
        ph.v1.j(g.a.f13867f, qVarA, jVar2);
        ph.v1.j(g.a.f13866e, a2VarY, jVar2);
        g.a.C0128a c0128a = g.a.f13868g;
        if (jVar2.m() || !kotlin.jvm.internal.r.a(jVar2.g(), Integer.valueOf(iD))) {
            l9.i.a(iD, jVar2, iD, c0128a);
        }
        ph.v1.j(g.a.f13865d, dVarC, jVar2);
        b8.f(f3.q.c(R.string.editor_action_bar_color, jVar2), f3.q.c(R.string.editor_action_bar_color_hint, jVar2), this.f10940a, qg.p.j("#00E5CC", "#2196F3", "#9C27B0", "#FF6B6B", "#2ECC71", "#34495E"), this.f10941b, jVar2, 3072);
        t0.v2.a(null, CropImageView.DEFAULT_ASPECT_RATIO, ((t0.e2) jVar2.f(t0.f2.f25858a)).B, jVar2, 0, 3);
        jVar2.H();
        return pg.f0.f21461a;
    }
}
