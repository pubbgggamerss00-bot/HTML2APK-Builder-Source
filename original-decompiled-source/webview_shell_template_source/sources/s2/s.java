package s2;

import java.util.HashMap;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class s {

    /* renamed from: e, reason: collision with root package name */
    public static final String f14391e = androidx.work.k.e("WorkTimer");

    /* renamed from: a, reason: collision with root package name */
    public final ScheduledExecutorService f14392a;

    /* renamed from: b, reason: collision with root package name */
    public final HashMap f14393b;

    /* renamed from: c, reason: collision with root package name */
    public final HashMap f14394c;

    /* renamed from: d, reason: collision with root package name */
    public final Object f14395d;

    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    public class a implements ThreadFactory {

        /* renamed from: a, reason: collision with root package name */
        public int f14396a;

        @Override // java.util.concurrent.ThreadFactory
        public final Thread newThread(Runnable runnable) {
            Thread threadNewThread = Executors.defaultThreadFactory().newThread(runnable);
            threadNewThread.setName("WorkManager-WorkTimer-thread-" + this.f14396a);
            this.f14396a = this.f14396a + 1;
            return threadNewThread;
        }
    }

    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    public interface b {
        void a(String str);
    }

    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    public static class c implements Runnable {
        public final s s;

        /* renamed from: t, reason: collision with root package name */
        public final String f14397t;

        public c(s sVar, String str) {
            this.s = sVar;
            this.f14397t = str;
        }

        @Override // java.lang.Runnable
        public final void run() {
            synchronized (this.s.f14395d) {
                try {
                    if (((c) this.s.f14393b.remove(this.f14397t)) != null) {
                        b bVar = (b) this.s.f14394c.remove(this.f14397t);
                        if (bVar != null) {
                            bVar.a(this.f14397t);
                        }
                    } else {
                        androidx.work.k.c().a("WrkTimerRunnable", "Timer with " + this.f14397t + " is already marked as complete.", new Throwable[0]);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public s() {
        a aVar = new a();
        aVar.f14396a = 0;
        this.f14393b = new HashMap();
        this.f14394c = new HashMap();
        this.f14395d = new Object();
        this.f14392a = Executors.newSingleThreadScheduledExecutor(aVar);
    }

    public final void a(String str, l2.d dVar) {
        synchronized (this.f14395d) {
            androidx.work.k.c().a(f14391e, "Starting timer for " + str, new Throwable[0]);
            b(str);
            c cVar = new c(this, str);
            this.f14393b.put(str, cVar);
            this.f14394c.put(str, dVar);
            this.f14392a.schedule(cVar, 600000L, TimeUnit.MILLISECONDS);
        }
    }

    public final void b(String str) {
        synchronized (this.f14395d) {
            try {
                if (((c) this.f14393b.remove(str)) != null) {
                    androidx.work.k.c().a(f14391e, "Stopping timer for " + str, new Throwable[0]);
                    this.f14394c.remove(str);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
