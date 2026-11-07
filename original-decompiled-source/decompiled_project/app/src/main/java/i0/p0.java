package i0;

/* loaded from: classes.dex */
public final class p0 extends kotlin.jvm.internal.s implements eh.p<x0.j, Integer, pg.f0> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ m0.r1 f13496a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ f1.b f13497b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p0(m0.r1 r1Var, f1.b bVar, int i10) {
        super(2);
        this.f13496a = r1Var;
        this.f13497b = bVar;
    }

    @Override // eh.p
    public final pg.f0 invoke(x0.j jVar, Integer num) {
        num.intValue();
        int iN = f3.i.n(49);
        s0.a(this.f13496a, this.f13497b, jVar, iN);
        return pg.f0.f21461a;
    }
}
