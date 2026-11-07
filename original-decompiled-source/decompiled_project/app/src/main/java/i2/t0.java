package i2;

import g2.g1;

/* loaded from: classes.dex */
public final class t0 extends kotlin.jvm.internal.s implements eh.a<pg.f0> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ p0 f14018a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ v1 f14019b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f14020c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t0(p0 p0Var, v1 v1Var, long j10) {
        super(0);
        this.f14018a = p0Var;
        this.f14019b = v1Var;
        this.f14020c = j10;
    }

    @Override // eh.a
    public final pg.f0 invoke() {
        o0 o0VarG1;
        j0 j0Var = this.f14018a.f13976f;
        g1.a placementScope = null;
        if (f3.u.d(j0Var.f13914a) || j0Var.f13916c) {
            g1 g1Var = j0Var.a().f13878s;
            if (g1Var != null) {
                placementScope = g1Var.f13939j;
            }
        } else {
            g1 g1Var2 = j0Var.a().f13878s;
            if (g1Var2 != null && (o0VarG1 = g1Var2.g1()) != null) {
                placementScope = o0VarG1.f13939j;
            }
        }
        if (placementScope == null) {
            placementScope = this.f14019b.getPlacementScope();
        }
        o0 o0VarG12 = j0Var.a().g1();
        kotlin.jvm.internal.r.b(o0VarG12);
        g1.a.f(placementScope, o0VarG12, this.f14020c);
        return pg.f0.f21461a;
    }
}
