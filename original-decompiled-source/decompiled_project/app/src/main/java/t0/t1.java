package t0;

/* loaded from: classes.dex */
public final class t1 extends kotlin.jvm.internal.s implements eh.p<x0.j, Integer, pg.f0> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ f1.b f27029a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ t2.l0 f27030b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f27031c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ eh.p<x0.j, Integer, pg.f0> f27032d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ o1 f27033e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f27034f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ float f27035g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ z.f1 f27036h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t1(f1.b bVar, t2.l0 l0Var, long j10, eh.p pVar, o1 o1Var, boolean z10, float f10, z.f1 f1Var) {
        super(2);
        this.f27029a = bVar;
        this.f27030b = l0Var;
        this.f27031c = j10;
        this.f27032d = pVar;
        this.f27033e = o1Var;
        this.f27034f = z10;
        this.f27035g = f10;
        this.f27036h = f1Var;
    }

    @Override // eh.p
    public final pg.f0 invoke(x0.j jVar, Integer num) {
        x0.j jVar2 = jVar;
        if ((num.intValue() & 3) == 2 && jVar2.s()) {
            jVar2.v();
        } else {
            o1 o1Var = this.f27033e;
            boolean z10 = this.f27034f;
            d2.e(this.f27029a, this.f27030b, this.f27031c, this.f27032d, z10 ? o1Var.f26567c : o1Var.f26571g, z10 ? o1Var.f26568d : o1Var.f26572h, this.f27035g, this.f27036h, jVar2, 24576);
        }
        return pg.f0.f21461a;
    }
}
