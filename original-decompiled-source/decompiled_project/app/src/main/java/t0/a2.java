package t0;

/* loaded from: classes.dex */
public final class a2 extends kotlin.jvm.internal.s implements eh.p<x0.j, Integer, pg.f0> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ua f25442a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f25443b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f25444c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ f1.b f25445d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ t2.l0 f25446e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ eh.p<x0.j, Integer, pg.f0> f25447f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ float f25448g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ z.f1 f25449h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a2(ua uaVar, boolean z10, boolean z11, f1.b bVar, t2.l0 l0Var, eh.p pVar, float f10, z.f1 f1Var) {
        super(2);
        this.f25442a = uaVar;
        this.f25443b = z10;
        this.f25444c = z11;
        this.f25445d = bVar;
        this.f25446e = l0Var;
        this.f25447f = pVar;
        this.f25448g = f10;
        this.f25449h = f1Var;
    }

    @Override // eh.p
    public final pg.f0 invoke(x0.j jVar, Integer num) {
        x0.j jVar2 = jVar;
        if ((num.intValue() & 3) == 2 && jVar2.s()) {
            jVar2.v();
        } else {
            ua uaVar = this.f25442a;
            boolean z10 = this.f25443b;
            boolean z11 = this.f25444c;
            d2.e(this.f25445d, this.f25446e, !z10 ? uaVar.f27154f : !z11 ? uaVar.f27150b : uaVar.f27159k, this.f25447f, !z10 ? uaVar.f27155g : !z11 ? uaVar.f27151c : uaVar.f27160l, !z10 ? uaVar.f27156h : !z11 ? uaVar.f27152d : uaVar.f27161m, this.f25448g, this.f25449h, jVar2, 0);
        }
        return pg.f0.f21461a;
    }
}
