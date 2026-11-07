package ph;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* loaded from: classes2.dex */
public final class q1 extends x1 {

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f21579f = AtomicIntegerFieldUpdater.newUpdater(q1.class, "_invoked$volatile");
    private volatile /* synthetic */ int _invoked$volatile;

    /* renamed from: e, reason: collision with root package name */
    public final eh.l<Throwable, pg.f0> f21580e;

    /* JADX WARN: Multi-variable type inference failed */
    public q1(eh.l<? super Throwable, pg.f0> lVar) {
        this.f21580e = lVar;
    }

    @Override // ph.x1
    public final boolean j() {
        return true;
    }

    @Override // ph.x1
    public final void k(Throwable th2) {
        if (f21579f.compareAndSet(this, 0, 1)) {
            this.f21580e.invoke(th2);
        }
    }
}
