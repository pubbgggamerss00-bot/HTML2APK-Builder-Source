package s8;

import android.content.res.Resources;

/* loaded from: classes.dex */
public final class l1 implements eh.r<r.n, p5.s, x0.j, Integer, pg.f0> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ p5.s0 f24678a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ z.f1 f24679b;

    public l1(p5.s0 s0Var, z.f1 f1Var) {
        this.f24678a = s0Var;
        this.f24679b = f1Var;
    }

    @Override // eh.r
    public final pg.f0 f(r.n nVar, p5.s sVar, x0.j jVar, Integer num) throws Resources.NotFoundException {
        ji.a.a(num, nVar, "$this$page", sVar, "it");
        float fA = this.f24679b.a();
        d9.m.e(this.f24678a, fA, null, jVar, 0);
        return pg.f0.f21461a;
    }
}
