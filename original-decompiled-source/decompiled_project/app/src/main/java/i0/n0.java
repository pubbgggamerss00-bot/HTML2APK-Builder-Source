package i0;

/* loaded from: classes.dex */
public final class n0 extends kotlin.jvm.internal.s implements eh.p<x0.j, Integer, pg.f0> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ m0.x2 f13440a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ f1.b f13441b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f13442c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n0(m0.x2 x2Var, f1.b bVar, int i10) {
        super(2);
        this.f13440a = x2Var;
        this.f13441b = bVar;
        this.f13442c = i10;
    }

    @Override // eh.p
    public final pg.f0 invoke(x0.j jVar, Integer num) {
        num.intValue();
        int iN = f3.i.n(this.f13442c | 1);
        s0.b(this.f13440a, this.f13441b, jVar, iN);
        return pg.f0.f21461a;
    }
}
