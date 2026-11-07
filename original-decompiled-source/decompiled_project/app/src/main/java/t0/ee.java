package t0;

/* loaded from: classes.dex */
public final class ee extends kotlin.jvm.internal.s implements eh.p<x0.j, Integer, pg.f0> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ eh.p<x0.j, Integer, pg.f0> f25818a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ eh.p<x0.j, Integer, pg.f0> f25819b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f25820c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public ee(eh.p<? super x0.j, ? super Integer, pg.f0> pVar, eh.p<? super x0.j, ? super Integer, pg.f0> pVar2, int i10) {
        super(2);
        this.f25818a = pVar;
        this.f25819b = pVar2;
        this.f25820c = i10;
    }

    @Override // eh.p
    public final pg.f0 invoke(x0.j jVar, Integer num) {
        num.intValue();
        int iN = f3.i.n(this.f25820c | 1);
        he.d(this.f25818a, this.f25819b, jVar, iN);
        return pg.f0.f21461a;
    }
}
