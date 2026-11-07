package u0;

/* loaded from: classes.dex */
public final class n1 extends kotlin.jvm.internal.s implements eh.p<x0.j, Integer, pg.f0> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ long f29083a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ eh.p<x0.j, Integer, pg.f0> f29084b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f29085c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public n1(long j10, eh.p<? super x0.j, ? super Integer, pg.f0> pVar, int i10) {
        super(2);
        this.f29083a = j10;
        this.f29084b = pVar;
        this.f29085c = i10;
    }

    @Override // eh.p
    public final pg.f0 invoke(x0.j jVar, Integer num) {
        num.intValue();
        int iN = f3.i.n(this.f29085c | 1);
        t1.c(this.f29083a, this.f29084b, jVar, iN);
        return pg.f0.f21461a;
    }
}
