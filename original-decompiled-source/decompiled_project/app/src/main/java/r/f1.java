package r;

/* loaded from: classes.dex */
public final class f1 extends kotlin.jvm.internal.s implements eh.l<q1.l1, pg.f0> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ boolean f22817a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ eh.a<Boolean> f22818b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f1(eh.a aVar, boolean z10) {
        super(1);
        this.f22817a = z10;
        this.f22818b = aVar;
    }

    @Override // eh.l
    public final pg.f0 invoke(q1.l1 l1Var) {
        l1Var.C(!this.f22817a && this.f22818b.invoke().booleanValue());
        return pg.f0.f21461a;
    }
}
