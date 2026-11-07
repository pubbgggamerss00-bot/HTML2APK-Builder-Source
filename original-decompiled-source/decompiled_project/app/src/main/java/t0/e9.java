package t0;

/* loaded from: classes.dex */
public final class e9 extends kotlin.jvm.internal.s implements eh.l<q1.l1, pg.f0> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ boolean f25808a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ eh.a<Float> f25809b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e9(eh.a aVar, boolean z10) {
        super(1);
        this.f25808a = z10;
        this.f25809b = aVar;
    }

    @Override // eh.l
    public final pg.f0 invoke(q1.l1 l1Var) {
        l1Var.f(this.f25808a ? 1.0f : this.f25809b.invoke().floatValue());
        return pg.f0.f21461a;
    }
}
