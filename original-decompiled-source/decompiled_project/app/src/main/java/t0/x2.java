package t0;

/* loaded from: classes.dex */
public final class x2 extends kotlin.jvm.internal.s implements eh.p<x0.j, Integer, pg.f0> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ a3 f27355a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ androidx.compose.ui.d f27356b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f27357c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ s.s0<Boolean> f27358d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ x0.n1<q1.l2> f27359e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ t.u1 f27360f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ q1.f2 f27361g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ long f27362h;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ float f27363j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ float f27364k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ t.v f27365l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ f1.b f27366m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x2(a3 a3Var, androidx.compose.ui.d dVar, boolean z10, s.s0 s0Var, x0.n1 n1Var, t.u1 u1Var, q1.f2 f2Var, long j10, float f10, float f11, t.v vVar, f1.b bVar) {
        super(2);
        this.f27355a = a3Var;
        this.f27356b = dVar;
        this.f27357c = z10;
        this.f27358d = s0Var;
        this.f27359e = n1Var;
        this.f27360f = u1Var;
        this.f27361g = f2Var;
        this.f27362h = j10;
        this.f27363j = f10;
        this.f27364k = f11;
        this.f27365l = vVar;
        this.f27366m = bVar;
    }

    @Override // eh.p
    public final pg.f0 invoke(x0.j jVar, Integer num) {
        x0.j jVar2 = jVar;
        if ((num.intValue() & 3) == 2 && jVar2.s()) {
            jVar2.v();
        } else {
            z5.a(this.f27355a.b(this.f27356b, this.f27357c), this.f27358d, this.f27359e, this.f27360f, this.f27361g, this.f27362h, this.f27363j, this.f27364k, this.f27365l, this.f27366m, jVar2, 384);
        }
        return pg.f0.f21461a;
    }
}
