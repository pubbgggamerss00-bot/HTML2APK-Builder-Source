package r;

import g2.g1;

/* loaded from: classes.dex */
public final class e extends kotlin.jvm.internal.s implements eh.l<g1.a, pg.f0> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ g2.g1 f22810a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ n0 f22811b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(g2.g1 g1Var, n0 n0Var) {
        super(1);
        this.f22810a = g1Var;
        this.f22811b = n0Var;
    }

    @Override // eh.l
    public final pg.f0 invoke(g1.a aVar) {
        aVar.d(this.f22810a, 0, 0, this.f22811b.f22890c.getFloatValue());
        return pg.f0.f21461a;
    }
}
