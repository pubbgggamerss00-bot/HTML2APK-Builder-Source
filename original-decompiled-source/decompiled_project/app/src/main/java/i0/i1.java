package i0;

/* loaded from: classes.dex */
public final class i1 extends kotlin.jvm.internal.s implements eh.l<o1.h0, pg.f0> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ i2 f13327a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f13328b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f13329c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ y2.e0 f13330d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ y2.c0 f13331e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ y2.o f13332f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ y2.v f13333g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ m0.x2 f13334h;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ ph.i0 f13335j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ f0.a f13336k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i1(i2 i2Var, boolean z10, boolean z11, y2.e0 e0Var, y2.c0 c0Var, y2.o oVar, y2.v vVar, m0.x2 x2Var, ph.i0 i0Var, f0.a aVar) {
        super(1);
        this.f13327a = i2Var;
        this.f13328b = z10;
        this.f13329c = z11;
        this.f13330d = e0Var;
        this.f13331e = c0Var;
        this.f13332f = oVar;
        this.f13333g = vVar;
        this.f13334h = x2Var;
        this.f13335j = i0Var;
        this.f13336k = aVar;
    }

    @Override // eh.l
    public final pg.f0 invoke(o1.h0 h0Var) {
        l4 l4VarD;
        o1.h0 h0Var2 = h0Var;
        i2 i2Var = this.f13327a;
        if (i2Var.b() != h0Var2.b()) {
            i2Var.f13342f.setValue(Boolean.valueOf(h0Var2.b()));
            if (i2Var.b() && this.f13328b && !this.f13329c) {
                q1.f(this.f13330d, i2Var, this.f13331e, this.f13332f, this.f13333g);
            } else {
                q1.e(i2Var);
            }
            if (h0Var2.b() && (l4VarD = i2Var.d()) != null) {
                ph.h.c(this.f13335j, null, null, new h1(this.f13336k, this.f13331e, i2Var, l4VarD, this.f13333g, null), 3);
            }
            if (!h0Var2.b()) {
                this.f13334h.e(null);
            }
        }
        return pg.f0.f21461a;
    }
}
