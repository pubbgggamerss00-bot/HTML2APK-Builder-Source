package a9;

import com.basitce.htmltoapk.R;
import t0.ff;
import t0.nf;
import t0.of;

/* loaded from: classes.dex */
public final class y0 implements eh.q<r.h0, x0.j, Integer, pg.f0> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ boolean f372a;

    public y0(boolean z10) {
        this.f372a = z10;
    }

    @Override // eh.q
    public final pg.f0 b(r.h0 h0Var, x0.j jVar, Integer num) {
        r.h0 AnimatedVisibility = h0Var;
        x0.j jVar2 = jVar;
        num.intValue();
        kotlin.jvm.internal.r.e(AnimatedVisibility, "$this$AnimatedVisibility");
        String strC = f3.q.c(R.string.premium_crown_title, jVar2);
        t2.l0 l0Var = ((nf) jVar2.f(of.f26647a)).f26543f;
        ff.b(strC, null, c2.n0.c(this.f372a ? 4294956800L : 4290007817L), 0L, x2.p.f32033f, null, 0L, new e3.h(3), 0L, 0, false, 0, 0, l0Var, jVar2, 196608, 0, 64986);
        return pg.f0.f21461a;
    }
}
