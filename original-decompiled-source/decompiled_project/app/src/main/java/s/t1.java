package s;

/* loaded from: classes.dex */
public final class t1 extends kotlin.jvm.internal.s implements eh.l<Long, pg.f0> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.g0<k<Object, Object>> f23924a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ float f23925b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ h<Object, Object> f23926c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ n<Object, Object> f23927d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ eh.l<k<Object, Object>, pg.f0> f23928e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public t1(kotlin.jvm.internal.g0<k<Object, Object>> g0Var, float f10, h<Object, Object> hVar, n<Object, Object> nVar, eh.l<? super k<Object, Object>, pg.f0> lVar) {
        super(1);
        this.f23924a = g0Var;
        this.f23925b = f10;
        this.f23926c = hVar;
        this.f23927d = nVar;
        this.f23928e = lVar;
    }

    @Override // eh.l
    public final pg.f0 invoke(Long l10) {
        long jLongValue = l10.longValue();
        k<Object, Object> kVar = this.f23924a.f16327a;
        kotlin.jvm.internal.r.b(kVar);
        w1.g(kVar, jLongValue, this.f23925b, this.f23926c, this.f23927d, this.f23928e);
        return pg.f0.f21461a;
    }
}
