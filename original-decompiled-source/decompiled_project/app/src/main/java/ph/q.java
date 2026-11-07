package ph;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* loaded from: classes2.dex */
public final class q extends x1 {

    /* renamed from: e, reason: collision with root package name */
    public final m<?> f21578e;

    public q(m<?> mVar) {
        this.f21578e = mVar;
    }

    @Override // ph.x1
    public final boolean j() {
        return true;
    }

    @Override // ph.x1
    public final void k(Throwable th2) {
        y1 y1VarI = i();
        m<?> mVar = this.f21578e;
        Throwable thN = mVar.n(y1VarI);
        if (mVar.v()) {
            tg.e<?> eVar = mVar.f21566d;
            kotlin.jvm.internal.r.c(eVar, "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<*>");
            uh.f fVar = (uh.f) eVar;
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = uh.f.f29732h;
            loop0: while (true) {
                Object obj = atomicReferenceFieldUpdater.get(fVar);
                uh.v vVar = uh.g.f29738b;
                if (!kotlin.jvm.internal.r.a(obj, vVar)) {
                    if (!(obj instanceof Throwable)) {
                        while (!atomicReferenceFieldUpdater.compareAndSet(fVar, obj, null)) {
                            if (atomicReferenceFieldUpdater.get(fVar) != obj) {
                                break;
                            }
                        }
                        break loop0;
                    }
                    return;
                }
                while (!atomicReferenceFieldUpdater.compareAndSet(fVar, vVar, thN)) {
                    if (atomicReferenceFieldUpdater.get(fVar) != vVar) {
                        break;
                    }
                }
                return;
            }
        }
        mVar.cancel(thN);
        if (mVar.v()) {
            return;
        }
        mVar.k();
    }
}
