package u6;

import java.util.concurrent.ExecutionException;

/* loaded from: classes.dex */
public final class z<T> implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final qc.m<T> f29363a;

    /* renamed from: b, reason: collision with root package name */
    public final ph.m f29364b;

    public z(qc.m mVar, ph.m mVar2) {
        this.f29363a = mVar;
        this.f29364b = mVar2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        T t3;
        qc.m<T> mVar = this.f29363a;
        boolean zIsCancelled = mVar.isCancelled();
        ph.m mVar2 = this.f29364b;
        if (zIsCancelled) {
            mVar2.cancel(null);
            return;
        }
        boolean z10 = false;
        while (true) {
            try {
                try {
                    t3 = mVar.get();
                    break;
                } catch (InterruptedException unused) {
                    z10 = true;
                } catch (Throwable th2) {
                    if (z10) {
                        Thread.currentThread().interrupt();
                    }
                    throw th2;
                }
            } catch (ExecutionException e10) {
                Throwable cause = e10.getCause();
                kotlin.jvm.internal.r.b(cause);
                mVar2.resumeWith(pg.q.a(cause));
                return;
            }
        }
        if (z10) {
            Thread.currentThread().interrupt();
        }
        mVar2.resumeWith(t3);
    }
}
