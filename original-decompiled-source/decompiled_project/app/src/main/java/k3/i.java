package k3;

import java.util.concurrent.ExecutionException;
import kotlin.jvm.internal.r;
import pg.q;
import qc.m;

/* loaded from: classes.dex */
public final class i<T> implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final m<T> f15977a;

    /* renamed from: b, reason: collision with root package name */
    public final ph.m f15978b;

    public i(m mVar, ph.m mVar2) {
        this.f15977a = mVar;
        this.f15978b = mVar2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        m<T> mVar = this.f15977a;
        boolean zIsCancelled = mVar.isCancelled();
        ph.m mVar2 = this.f15978b;
        if (zIsCancelled) {
            mVar2.cancel(null);
            return;
        }
        try {
            mVar2.resumeWith(c.g(mVar));
        } catch (ExecutionException e10) {
            Throwable cause = e10.getCause();
            if (cause != null) {
                mVar2.resumeWith(q.a(cause));
            } else {
                pg.h hVar = new pg.h();
                r.g(hVar, r.class.getName());
                throw hVar;
            }
        }
    }
}
