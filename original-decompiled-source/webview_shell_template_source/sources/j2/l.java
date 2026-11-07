package j2;

import android.annotation.SuppressLint;
import androidx.work.ListenableWorker;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class l implements Runnable {
    public final /* synthetic */ t2.c s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ String f13482t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ m f13483u;

    public l(m mVar, t2.c cVar, String str) {
        this.f13483u = mVar;
        this.s = cVar;
        this.f13482t = str;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.lang.Runnable
    @SuppressLint({"SyntheticAccessor"})
    public final void run() {
        String str = this.f13482t;
        m mVar = this.f13483u;
        try {
            try {
                ListenableWorker.a aVar = (ListenableWorker.a) this.s.get();
                if (aVar == null) {
                    androidx.work.k.c().b(m.L, mVar.f13487w.f14282c + " returned a null result. Treating it as a failure.", new Throwable[0]);
                } else {
                    androidx.work.k.c().a(m.L, String.format("%s returned a %s result.", mVar.f13487w.f14282c, aVar), new Throwable[0]);
                    mVar.f13490z = aVar;
                }
                mVar.c();
            } catch (InterruptedException e6) {
                e = e6;
                androidx.work.k.c().b(m.L, str + " failed because it threw an exception/error", e);
                mVar.c();
            } catch (CancellationException e7) {
                androidx.work.k.c().d(m.L, str + " was cancelled", e7);
                mVar.c();
            } catch (ExecutionException e8) {
                e = e8;
                androidx.work.k.c().b(m.L, str + " failed because it threw an exception/error", e);
                mVar.c();
            }
        } catch (Throwable th) {
            mVar.c();
            throw th;
        }
    }
}
