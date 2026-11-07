package b0;

import d0.b2;

/* loaded from: classes.dex */
public final class t extends kotlin.jvm.internal.s implements eh.a<q> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ x0.g0 f3432a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ m0 f3433b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ f f3434c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(x0.g0 g0Var, m0 m0Var, f fVar) {
        super(0);
        this.f3432a = g0Var;
        this.f3433b = m0Var;
        this.f3434c = fVar;
    }

    @Override // eh.a
    public final q invoke() {
        m mVar = (m) this.f3432a.getValue();
        m0 m0Var = this.f3433b;
        return new q(m0Var, mVar, this.f3434c, new b2((jh.g) m0Var.f3385d.f3376e.getValue(), mVar));
    }
}
