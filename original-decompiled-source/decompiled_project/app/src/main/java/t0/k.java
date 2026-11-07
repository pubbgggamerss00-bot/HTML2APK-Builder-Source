package t0;

/* loaded from: classes.dex */
public final class k extends kotlin.jvm.internal.s implements eh.p<x0.j, Integer, pg.f0> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ eh.p<x0.j, Integer, pg.f0> f26199a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ eh.p<x0.j, Integer, pg.f0> f26200b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ eh.p<x0.j, Integer, pg.f0> f26201c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ q1.f2 f26202d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f26203e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ float f26204f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ long f26205g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ long f26206h;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ long f26207j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ eh.p<x0.j, Integer, pg.f0> f26208k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ f1.b f26209l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(eh.p pVar, eh.p pVar2, eh.p pVar3, q1.f2 f2Var, long j10, float f10, long j11, long j12, long j13, eh.p pVar4, f1.b bVar) {
        super(2);
        this.f26199a = pVar;
        this.f26200b = pVar2;
        this.f26201c = pVar3;
        this.f26202d = f2Var;
        this.f26203e = j10;
        this.f26204f = f10;
        this.f26205g = j11;
        this.f26206h = j12;
        this.f26207j = j13;
        this.f26208k = pVar4;
        this.f26209l = bVar;
    }

    @Override // eh.p
    public final pg.f0 invoke(x0.j jVar, Integer num) {
        x0.j jVar2 = jVar;
        if ((num.intValue() & 3) == 2 && jVar2.s()) {
            jVar2.v();
        } else {
            f1.b bVarB = f1.c.b(1163543932, new j(this.f26208k, this.f26209l), jVar2);
            v0.c0 c0Var = v0.e.f30264a;
            p.a(bVarB, null, this.f26199a, this.f26200b, this.f26201c, this.f26202d, this.f26203e, this.f26204f, f2.e(v0.d.f30248m, jVar2), this.f26205g, this.f26206h, this.f26207j, jVar2, 6);
        }
        return pg.f0.f21461a;
    }
}
