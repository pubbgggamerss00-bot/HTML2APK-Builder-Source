package i2;

/* loaded from: classes.dex */
public final class s0 extends kotlin.jvm.internal.s implements eh.a<pg.f0> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ p0 f14014a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ long f14015b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s0(p0 p0Var, long j10) {
        super(0);
        this.f14014a = p0Var;
        this.f14015b = j10;
    }

    @Override // eh.a
    public final pg.f0 invoke() {
        o0 o0VarG1 = this.f14014a.f13976f.a().g1();
        kotlin.jvm.internal.r.b(o0VarG1);
        o0VarG1.P(this.f14015b);
        return pg.f0.f21461a;
    }
}
