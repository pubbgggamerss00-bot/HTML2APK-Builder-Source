package t0;

/* loaded from: classes.dex */
public final class l3 extends kotlin.jvm.internal.s implements eh.a<pg.f0> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ x0.n1<m5> f26354a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ eh.l<Boolean, pg.f0> f26355b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f26356c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l3(eh.l lVar, x0.n1 n1Var, boolean z10) {
        super(0);
        this.f26354a = n1Var;
        this.f26355b = lVar;
        this.f26356c = z10;
    }

    @Override // eh.a
    public final pg.f0 invoke() {
        this.f26354a.setValue(new m5());
        this.f26355b.invoke(Boolean.valueOf(!this.f26356c));
        return pg.f0.f21461a;
    }
}
