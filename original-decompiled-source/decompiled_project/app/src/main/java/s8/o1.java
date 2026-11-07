package s8;

/* loaded from: classes.dex */
public final class o1 implements eh.p<x0.j, Integer, pg.f0> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ q8.w0 f24702a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ v8.q f24703b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ p5.s0 f24704c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f24705d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f24706e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ float f24707f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ boolean f24708g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ String f24709h;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ boolean f24710j;

    public o1(q8.w0 w0Var, v8.q qVar, p5.s0 s0Var, boolean z10, long j10, float f10, boolean z11, String str, boolean z12) {
        this.f24702a = w0Var;
        this.f24703b = qVar;
        this.f24704c = s0Var;
        this.f24705d = z10;
        this.f24706e = j10;
        this.f24707f = f10;
        this.f24708g = z11;
        this.f24709h = str;
        this.f24710j = z12;
    }

    @Override // eh.p
    public final pg.f0 invoke(x0.j jVar, Integer num) {
        x0.j jVar2 = jVar;
        if ((num.intValue() & 3) == 2 && jVar2.s()) {
            jVar2.v();
        } else {
            q8.c.a(null, f1.c.b(1673347032, new n1(this.f24702a, this.f24703b, this.f24704c, this.f24705d, this.f24706e, this.f24707f, this.f24708g, this.f24709h, this.f24710j), jVar2), jVar2, 48);
        }
        return pg.f0.f21461a;
    }
}
