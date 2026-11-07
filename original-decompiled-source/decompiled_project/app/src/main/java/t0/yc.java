package t0;

/* loaded from: classes.dex */
public final class yc extends kotlin.jvm.internal.s implements eh.p<x0.j, Integer, pg.f0> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ eh.p<x0.j, Integer, pg.f0> f27490a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ f1.b f27491b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ eh.p<x0.j, Integer, pg.f0> f27492c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ t2.l0 f27493d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f27494e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ long f27495f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yc(eh.p pVar, f1.b bVar, eh.p pVar2, t2.l0 l0Var, long j10, long j11) {
        super(2);
        this.f27490a = pVar;
        this.f27491b = bVar;
        this.f27492c = pVar2;
        this.f27493d = l0Var;
        this.f27494e = j10;
        this.f27495f = j11;
    }

    @Override // eh.p
    public final pg.f0 invoke(x0.j jVar, Integer num) {
        x0.j jVar2 = jVar;
        if ((num.intValue() & 3) == 2 && jVar2.s()) {
            jVar2.v();
        } else {
            jVar2.L(-810701708);
            id.c(this.f27491b, this.f27490a, this.f27492c, this.f27493d, this.f27494e, this.f27495f, jVar2, 0);
            jVar2.B();
        }
        return pg.f0.f21461a;
    }
}
