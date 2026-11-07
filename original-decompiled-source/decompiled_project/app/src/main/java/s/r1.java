package s;

/* loaded from: classes.dex */
public final class r1 extends kotlin.jvm.internal.s implements eh.l<Long, pg.f0> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.g0<k<Object, Object>> f23908a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f23909b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ h<Object, Object> f23910c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f23911d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ n<Object, Object> f23912e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ float f23913f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ eh.l<k<Object, Object>, pg.f0> f23914g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public r1(kotlin.jvm.internal.g0<k<Object, Object>> g0Var, Object obj, h<Object, Object> hVar, Object obj2, n<Object, Object> nVar, float f10, eh.l<? super k<Object, Object>, pg.f0> lVar) {
        super(1);
        this.f23908a = g0Var;
        this.f23909b = obj;
        this.f23910c = hVar;
        this.f23911d = obj2;
        this.f23912e = nVar;
        this.f23913f = f10;
        this.f23914g = lVar;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [T, s.k] */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, s.s] */
    @Override // eh.l
    public final pg.f0 invoke(Long l10) {
        long jLongValue = l10.longValue();
        h<Object, Object> hVar = this.f23910c;
        ?? kVar = new k(this.f23909b, hVar.c(), this.f23911d, jLongValue, hVar.g(), jLongValue, new q1(this.f23912e));
        w1.g(kVar, jLongValue, this.f23913f, this.f23910c, this.f23912e, this.f23914g);
        this.f23908a.f16327a = kVar;
        return pg.f0.f21461a;
    }
}
