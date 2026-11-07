package t0;

/* loaded from: classes.dex */
public final class ce extends kotlin.jvm.internal.s implements eh.p<x0.j, Integer, pg.f0> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ eh.p<x0.j, Integer, pg.f0> f25616a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public ce(eh.p<? super x0.j, ? super Integer, pg.f0> pVar) {
        super(2);
        this.f25616a = pVar;
    }

    @Override // eh.p
    public final pg.f0 invoke(x0.j jVar, Integer num) {
        x0.j jVar2 = jVar;
        if ((num.intValue() & 3) == 2 && jVar2.s()) {
            jVar2.v();
        } else {
            ff.a(t2.l0.a(of.a(v0.z.f30531f, jVar2), 0L, 0L, null, null, 0L, 0L, null, null, 16744447), this.f25616a, jVar2, 0);
        }
        return pg.f0.f21461a;
    }
}
