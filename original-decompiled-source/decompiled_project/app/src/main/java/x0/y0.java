package x0;

/* loaded from: classes.dex */
public final class y0 extends kotlin.jvm.internal.s implements eh.l<Throwable, pg.f0> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ z0 f31968a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ph.m f31969b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y0(z0 z0Var, ph.m mVar) {
        super(1);
        this.f31968a = z0Var;
        this.f31969b = mVar;
    }

    @Override // eh.l
    public final pg.f0 invoke(Throwable th2) {
        z0 z0Var = this.f31968a;
        Object obj = z0Var.f31980a;
        ph.m mVar = this.f31969b;
        synchronized (obj) {
            z0Var.f31981b.remove(mVar);
        }
        return pg.f0.f21461a;
    }
}
