package m0;

/* loaded from: classes.dex */
public final class z0 extends kotlin.jvm.internal.s implements eh.l<c2.b0, pg.f0> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ q f17599a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ e0 f17600b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.b0 f17601c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z0(q qVar, e0 e0Var, kotlin.jvm.internal.b0 b0Var) {
        super(1);
        this.f17599a = qVar;
        this.f17600b = e0Var;
        this.f17601c = b0Var;
    }

    @Override // eh.l
    public final pg.f0 invoke(c2.b0 b0Var) {
        c2.b0 b0Var2 = b0Var;
        if (this.f17599a.a(b0Var2.f4595c, this.f17600b)) {
            b0Var2.a();
            this.f17601c.f16318a = true;
        }
        return pg.f0.f21461a;
    }
}
