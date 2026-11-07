package t0;

/* loaded from: classes.dex */
public final class zc extends kotlin.jvm.internal.s implements eh.p<x0.j, Integer, pg.f0> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ eh.p<x0.j, Integer, pg.f0> f27602a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ f1.b f27603b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ eh.p<x0.j, Integer, pg.f0> f27604c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f27605d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f27606e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zc(eh.p pVar, f1.b bVar, eh.p pVar2, long j10, long j11) {
        super(2);
        this.f27602a = pVar;
        this.f27603b = bVar;
        this.f27604c = pVar2;
        this.f27605d = j10;
        this.f27606e = j11;
    }

    @Override // eh.p
    public final pg.f0 invoke(x0.j jVar, Integer num) {
        x0.j jVar2 = jVar;
        if ((num.intValue() & 3) == 2 && jVar2.s()) {
            jVar2.v();
        } else {
            t2.l0 l0VarA = of.a(v0.g0.f30288e, jVar2);
            t2.l0 l0VarA2 = of.a(v0.o0.f30413d, jVar2);
            x0.y.a(ff.f25892a.a(l0VarA), f1.c.b(835891690, new yc(this.f27602a, this.f27603b, this.f27604c, l0VarA2, this.f27605d, this.f27606e), jVar2), jVar2, 56);
        }
        return pg.f0.f21461a;
    }
}
