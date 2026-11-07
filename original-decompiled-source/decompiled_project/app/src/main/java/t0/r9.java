package t0;

/* loaded from: classes.dex */
public final class r9 extends kotlin.jvm.internal.s implements eh.q<eh.p<? super x0.j, ? super Integer, ? extends pg.f0>, x0.j, Integer, pg.f0> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ y2.c0 f26885a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f26886b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f26887c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ y2.q0 f26888d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ x.m f26889e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f26890f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ eh.p<x0.j, Integer, pg.f0> f26891g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ eh.p<x0.j, Integer, pg.f0> f26892h;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ df f26893j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ q1.f2 f26894k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r9(y2.c0 c0Var, boolean z10, boolean z11, y2.q0 q0Var, x.m mVar, boolean z12, eh.p pVar, eh.p pVar2, df dfVar, q1.f2 f2Var) {
        super(3);
        this.f26885a = c0Var;
        this.f26886b = z10;
        this.f26887c = z11;
        this.f26888d = q0Var;
        this.f26889e = mVar;
        this.f26890f = z12;
        this.f26891g = pVar;
        this.f26892h = pVar2;
        this.f26893j = dfVar;
        this.f26894k = f2Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // eh.q
    public final pg.f0 b(eh.p<? super x0.j, ? super Integer, ? extends pg.f0> pVar, x0.j jVar, Integer num) {
        eh.p<? super x0.j, ? super Integer, ? extends pg.f0> pVar2 = pVar;
        x0.j jVar2 = jVar;
        int iIntValue = num.intValue();
        if ((iIntValue & 6) == 0) {
            iIntValue |= jVar2.l(pVar2) ? 4 : 2;
        }
        if ((iIntValue & 19) == 18 && jVar2.s()) {
            jVar2.v();
        } else {
            k9 k9Var = k9.f26240a;
            String str = this.f26885a.f33682a.f27761b;
            q1.f2 f2Var = this.f26894k;
            boolean z10 = this.f26886b;
            boolean z11 = this.f26890f;
            x.m mVar = this.f26889e;
            df dfVar = this.f26893j;
            k9Var.b(str, pVar2, z10, this.f26887c, this.f26888d, mVar, z11, null, null, null, null, null, this.f26891g, this.f26892h, dfVar, null, f1.c.b(255570733, new q9(z10, z11, mVar, dfVar, f2Var), jVar2), jVar2, (iIntValue << 3) & 112, 14155776, 32768);
        }
        return pg.f0.f21461a;
    }
}
