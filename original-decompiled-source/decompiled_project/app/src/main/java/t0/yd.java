package t0;

/* loaded from: classes.dex */
public final class yd extends kotlin.jvm.internal.s implements eh.q<z.r, x0.j, Integer, pg.f0> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ eh.p<x0.j, Integer, pg.f0> f27496a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ eh.p<x0.j, Integer, pg.f0> f27497b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yd(eh.p pVar, f1.b bVar) {
        super(3);
        this.f27496a = bVar;
        this.f27497b = pVar;
    }

    @Override // eh.q
    public final pg.f0 b(z.r rVar, x0.j jVar, Integer num) {
        x0.j jVar2 = jVar;
        if ((num.intValue() & 17) == 16 && jVar2.s()) {
            jVar2.v();
        } else {
            he.d(this.f27496a, this.f27497b, jVar2, 0);
        }
        return pg.f0.f21461a;
    }
}
