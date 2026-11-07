package t0;

/* loaded from: classes.dex */
public final class qe extends kotlin.jvm.internal.s implements eh.p<x0.j, Integer, pg.f0> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ eh.q<xd, x0.j, Integer, pg.f0> f26836a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ se f26837b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public qe(eh.q<? super xd, ? super x0.j, ? super Integer, pg.f0> qVar, se seVar) {
        super(2);
        this.f26836a = qVar;
        this.f26837b = seVar;
    }

    @Override // eh.p
    public final pg.f0 invoke(x0.j jVar, Integer num) {
        x0.j jVar2 = jVar;
        if ((num.intValue() & 3) == 2 && jVar2.s()) {
            jVar2.v();
        } else {
            this.f26836a.b(this.f26837b, jVar2, 6);
        }
        return pg.f0.f21461a;
    }
}
