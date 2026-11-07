package u6;

/* loaded from: classes.dex */
public final class f1 extends kotlin.jvm.internal.s implements eh.l<Throwable, pg.f0> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ androidx.work.c f29293a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ qc.m<Object> f29294b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f1(androidx.work.c cVar, qc.m<Object> mVar) {
        super(1);
        this.f29293a = cVar;
        this.f29294b = mVar;
    }

    @Override // eh.l
    public final pg.f0 invoke(Throwable th2) {
        Throwable th3 = th2;
        if (th3 instanceof w0) {
            this.f29293a.f3135c.compareAndSet(-256, ((w0) th3).f29357a);
        }
        this.f29294b.cancel(false);
        return pg.f0.f21461a;
    }
}
