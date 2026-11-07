package u0;

/* loaded from: classes.dex */
public final class h1 extends kotlin.jvm.internal.s implements eh.p<x0.j, Integer, pg.f0> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ long f29018a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ t2.l0 f29019b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ eh.p<x0.j, Integer, pg.f0> f29020c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public h1(long j10, t2.l0 l0Var, eh.p<? super x0.j, ? super Integer, pg.f0> pVar) {
        super(2);
        this.f29018a = j10;
        this.f29019b = l0Var;
        this.f29020c = pVar;
    }

    @Override // eh.p
    public final pg.f0 invoke(x0.j jVar, Integer num) {
        x0.j jVar2 = jVar;
        if ((num.intValue() & 3) == 2 && jVar2.s()) {
            jVar2.v();
        } else {
            t1.b(this.f29018a, this.f29019b, this.f29020c, jVar2, 0);
        }
        return pg.f0.f21461a;
    }
}
