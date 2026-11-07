package s2;

import java.util.ArrayDeque;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class k implements Executor {

    /* renamed from: t, reason: collision with root package name */
    public final Executor f14363t;

    /* renamed from: v, reason: collision with root package name */
    public volatile Runnable f14365v;
    public final ArrayDeque<a> s = new ArrayDeque<>();

    /* renamed from: u, reason: collision with root package name */
    public final Object f14364u = new Object();

    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    public static class a implements Runnable {
        public final k s;

        /* renamed from: t, reason: collision with root package name */
        public final Runnable f14366t;

        public a(k kVar, Runnable runnable) {
            this.s = kVar;
            this.f14366t = runnable;
        }

        @Override // java.lang.Runnable
        public final void run() {
            k kVar = this.s;
            try {
                this.f14366t.run();
            } finally {
                kVar.a();
            }
        }
    }

    public k(Executor executor) {
        this.f14363t = executor;
    }

    public final void a() {
        synchronized (this.f14364u) {
            try {
                a aVarPoll = this.s.poll();
                this.f14365v = aVarPoll;
                if (aVarPoll != null) {
                    this.f14363t.execute(this.f14365v);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        synchronized (this.f14364u) {
            try {
                this.s.add(new a(this, runnable));
                if (this.f14365v == null) {
                    a();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
