package u0;

/* loaded from: classes.dex */
public final class i1 extends kotlin.jvm.internal.s implements eh.p<x0.j, Integer, pg.f0> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ long f29029a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ eh.p<x0.j, Integer, pg.f0> f29030b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public i1(long j10, eh.p<? super x0.j, ? super Integer, pg.f0> pVar) {
        super(2);
        this.f29029a = j10;
        this.f29030b = pVar;
    }

    @Override // eh.p
    public final pg.f0 invoke(x0.j jVar, Integer num) {
        x0.j jVar2 = jVar;
        if ((num.intValue() & 3) == 2 && jVar2.s()) {
            jVar2.v();
        } else {
            t1.c(this.f29029a, this.f29030b, jVar2, 0);
        }
        return pg.f0.f21461a;
    }
}
