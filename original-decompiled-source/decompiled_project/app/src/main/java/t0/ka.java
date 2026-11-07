package t0;

/* loaded from: classes.dex */
public final class ka extends kotlin.jvm.internal.s implements eh.p<x0.j, Integer, pg.f0> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f26281a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ eh.p<x0.j, Integer, pg.f0> f26282b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ f1.b f26283c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ eh.p<x0.j, Integer, pg.f0> f26284d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ eh.p<x0.j, Integer, pg.f0> f26285e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ u0.t0 f26286f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ eh.p<x0.j, Integer, pg.f0> f26287g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ka(int i10, eh.p pVar, f1.b bVar, eh.p pVar2, eh.p pVar3, u0.t0 t0Var, eh.p pVar4) {
        super(2);
        this.f26281a = i10;
        this.f26282b = pVar;
        this.f26283c = bVar;
        this.f26284d = pVar2;
        this.f26285e = pVar3;
        this.f26286f = t0Var;
        this.f26287g = pVar4;
    }

    @Override // eh.p
    public final pg.f0 invoke(x0.j jVar, Integer num) {
        x0.j jVar2 = jVar;
        if ((num.intValue() & 3) == 2 && jVar2.s()) {
            jVar2.v();
        } else {
            ra.b(this.f26281a, this.f26282b, this.f26283c, this.f26284d, this.f26285e, this.f26286f, this.f26287g, jVar2, 0);
        }
        return pg.f0.f21461a;
    }
}
