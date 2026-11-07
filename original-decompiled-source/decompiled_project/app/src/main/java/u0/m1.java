package u0;

/* loaded from: classes.dex */
public final class m1 extends kotlin.jvm.internal.s implements eh.p<x0.j, Integer, pg.f0> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ long f29070a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ t2.l0 f29071b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ eh.p<x0.j, Integer, pg.f0> f29072c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f29073d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public m1(long j10, t2.l0 l0Var, eh.p<? super x0.j, ? super Integer, pg.f0> pVar, int i10) {
        super(2);
        this.f29070a = j10;
        this.f29071b = l0Var;
        this.f29072c = pVar;
        this.f29073d = i10;
    }

    @Override // eh.p
    public final pg.f0 invoke(x0.j jVar, Integer num) {
        num.intValue();
        t1.b(this.f29070a, this.f29071b, this.f29072c, jVar, f3.i.n(this.f29073d | 1));
        return pg.f0.f21461a;
    }
}
