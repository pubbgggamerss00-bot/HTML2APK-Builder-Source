package t0;

/* loaded from: classes.dex */
public final class k1 extends kotlin.jvm.internal.s implements eh.a<pg.f0> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ eh.l<Boolean, pg.f0> f26212a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f26213b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public k1(eh.l<? super Boolean, pg.f0> lVar, boolean z10) {
        super(0);
        this.f26212a = lVar;
        this.f26213b = z10;
    }

    @Override // eh.a
    public final pg.f0 invoke() {
        this.f26212a.invoke(Boolean.valueOf(!this.f26213b));
        return pg.f0.f21461a;
    }
}
