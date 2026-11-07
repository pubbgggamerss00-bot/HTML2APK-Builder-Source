package t0;

/* loaded from: classes.dex */
public final class s extends kotlin.jvm.internal.s implements eh.p<x0.j, Integer, pg.f0> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ androidx.compose.ui.d f26922a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ s.s0<Boolean> f26923b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ x0.n1<q1.l2> f26924c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ t.u1 f26925d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ q1.f2 f26926e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ long f26927f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ float f26928g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ float f26929h;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ t.v f26930j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ f1.b f26931k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(androidx.compose.ui.d dVar, s.s0 s0Var, x0.n1 n1Var, t.u1 u1Var, q1.f2 f2Var, long j10, float f10, float f11, t.v vVar, f1.b bVar) {
        super(2);
        this.f26922a = dVar;
        this.f26923b = s0Var;
        this.f26924c = n1Var;
        this.f26925d = u1Var;
        this.f26926e = f2Var;
        this.f26927f = j10;
        this.f26928g = f10;
        this.f26929h = f11;
        this.f26930j = vVar;
        this.f26931k = bVar;
    }

    @Override // eh.p
    public final pg.f0 invoke(x0.j jVar, Integer num) {
        x0.j jVar2 = jVar;
        if ((num.intValue() & 3) == 2 && jVar2.s()) {
            jVar2.v();
        } else {
            z5.a(this.f26922a, this.f26923b, this.f26924c, this.f26925d, this.f26926e, this.f26927f, this.f26928g, this.f26929h, this.f26930j, this.f26931k, jVar2, 384);
        }
        return pg.f0.f21461a;
    }
}
