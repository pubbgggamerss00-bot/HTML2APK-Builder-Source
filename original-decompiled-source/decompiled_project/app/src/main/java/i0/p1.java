package i0;

/* loaded from: classes.dex */
public final class p1 extends kotlin.jvm.internal.s implements eh.p<x0.j, Integer, pg.f0> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ m0.x2 f13498a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f13499b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f13500c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p1(m0.x2 x2Var, boolean z10, int i10) {
        super(2);
        this.f13498a = x2Var;
        this.f13499b = z10;
        this.f13500c = i10;
    }

    @Override // eh.p
    public final pg.f0 invoke(x0.j jVar, Integer num) {
        num.intValue();
        int iN = f3.i.n(this.f13500c | 1);
        q1.d(this.f13498a, this.f13499b, jVar, iN);
        return pg.f0.f21461a;
    }
}
