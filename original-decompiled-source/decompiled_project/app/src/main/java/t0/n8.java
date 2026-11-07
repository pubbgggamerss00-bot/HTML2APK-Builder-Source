package t0;

/* loaded from: classes.dex */
public final class n8 extends kotlin.jvm.internal.s implements eh.l<q1.l1, pg.f0> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ boolean f26510a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ eh.a<Float> f26511b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n8(eh.a aVar, boolean z10) {
        super(1);
        this.f26510a = z10;
        this.f26511b = aVar;
    }

    @Override // eh.l
    public final pg.f0 invoke(q1.l1 l1Var) {
        l1Var.f(this.f26510a ? 1.0f : this.f26511b.invoke().floatValue());
        return pg.f0.f21461a;
    }
}
