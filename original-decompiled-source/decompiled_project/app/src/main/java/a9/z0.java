package a9;

import com.basitce.htmltoapk.R;

/* loaded from: classes.dex */
public final class z0 implements eh.q<r.h0, x0.j, Integer, pg.f0> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ y f386a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f387b;

    public z0(y yVar, boolean z10) {
        this.f386a = yVar;
        this.f387b = z10;
    }

    @Override // eh.q
    public final pg.f0 b(r.h0 h0Var, x0.j jVar, Integer num) {
        r.h0 AnimatedVisibility = h0Var;
        x0.j jVar2 = jVar;
        num.intValue();
        kotlin.jvm.internal.r.e(AnimatedVisibility, "$this$AnimatedVisibility");
        y yVar = this.f386a;
        w1.d dVar = yVar.f366a;
        int i10 = yVar.f367b;
        v0.d(dVar, f3.q.c(i10, jVar2), v0.j(yVar, jVar2), this.f387b ? yVar.f370e : yVar.f371f, null, i10 == R.string.premium_feature_ai_desc, jVar2, 0, 16);
        return pg.f0.f21461a;
    }
}
