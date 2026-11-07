package j2;

/* loaded from: classes.dex */
public final class h5 extends kotlin.jvm.internal.s implements eh.a<pg.f0> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ a f14745a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ i5 f14746b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ g5 f14747c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h5(a aVar, i5 i5Var, g5 g5Var) {
        super(0);
        this.f14745a = aVar;
        this.f14746b = i5Var;
        this.f14747c = g5Var;
    }

    @Override // eh.a
    public final pg.f0 invoke() {
        i5 i5Var = this.f14746b;
        a aVar = this.f14745a;
        aVar.removeOnAttachStateChangeListener(i5Var);
        p4.a.b(aVar).f21187a.remove(this.f14747c);
        return pg.f0.f21461a;
    }
}
