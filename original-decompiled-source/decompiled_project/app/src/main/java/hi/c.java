package hi;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

/* loaded from: classes2.dex */
public class c extends m0 {

    /* renamed from: h, reason: collision with root package name */
    public static final ReentrantLock f13035h;

    /* renamed from: i, reason: collision with root package name */
    public static final Condition f13036i;

    /* renamed from: j, reason: collision with root package name */
    public static final long f13037j;

    /* renamed from: k, reason: collision with root package name */
    public static final long f13038k;

    /* renamed from: l, reason: collision with root package name */
    public static c f13039l;

    /* renamed from: e, reason: collision with root package name */
    public int f13040e;

    /* renamed from: f, reason: collision with root package name */
    public c f13041f;

    /* renamed from: g, reason: collision with root package name */
    public long f13042g;

    public static final class a {
        public static final void a(c cVar, long j10, boolean z10) {
            c cVar2;
            ReentrantLock reentrantLock = c.f13035h;
            if (c.f13039l == null) {
                c.f13039l = new c();
                b bVar = new b("Okio Watchdog");
                bVar.setDaemon(true);
                bVar.start();
            }
            long jNanoTime = System.nanoTime();
            if (j10 != 0 && z10) {
                cVar.f13042g = Math.min(j10, cVar.c() - jNanoTime) + jNanoTime;
            } else if (j10 != 0) {
                cVar.f13042g = j10 + jNanoTime;
            } else {
                if (!z10) {
                    throw new AssertionError();
                }
                cVar.f13042g = cVar.c();
            }
            long j11 = cVar.f13042g - jNanoTime;
            c cVar3 = c.f13039l;
            kotlin.jvm.internal.r.b(cVar3);
            while (true) {
                cVar2 = cVar3.f13041f;
                if (cVar2 == null || j11 < cVar2.f13042g - jNanoTime) {
                    break;
                }
                kotlin.jvm.internal.r.b(cVar2);
                cVar3 = cVar2;
            }
            cVar.f13041f = cVar2;
            cVar3.f13041f = cVar;
            if (cVar3 == c.f13039l) {
                c.f13036i.signal();
            }
        }

        public static c b() throws InterruptedException {
            c cVar = c.f13039l;
            kotlin.jvm.internal.r.b(cVar);
            c cVar2 = cVar.f13041f;
            if (cVar2 == null) {
                long jNanoTime = System.nanoTime();
                c.f13036i.await(c.f13037j, TimeUnit.MILLISECONDS);
                c cVar3 = c.f13039l;
                kotlin.jvm.internal.r.b(cVar3);
                if (cVar3.f13041f != null || System.nanoTime() - jNanoTime < c.f13038k) {
                    return null;
                }
                return c.f13039l;
            }
            long jNanoTime2 = cVar2.f13042g - System.nanoTime();
            if (jNanoTime2 > 0) {
                c.f13036i.await(jNanoTime2, TimeUnit.NANOSECONDS);
                return null;
            }
            c cVar4 = c.f13039l;
            kotlin.jvm.internal.r.b(cVar4);
            cVar4.f13041f = cVar2.f13041f;
            cVar2.f13041f = null;
            cVar2.f13040e = 2;
            return cVar2;
        }
    }

    public static final class b extends Thread {
        @Override // java.lang.Thread, java.lang.Runnable
        public final void run() {
            ReentrantLock reentrantLock;
            c cVarB;
            while (true) {
                try {
                    ReentrantLock reentrantLock2 = c.f13035h;
                    reentrantLock = c.f13035h;
                    reentrantLock.lock();
                    try {
                        cVarB = a.b();
                    } finally {
                        reentrantLock.unlock();
                    }
                } catch (InterruptedException unused) {
                    continue;
                }
                if (cVarB == c.f13039l) {
                    c.f13039l = null;
                    return;
                }
                pg.f0 f0Var = pg.f0.f21461a;
                reentrantLock.unlock();
                if (cVarB != null) {
                    cVarB.j();
                }
            }
        }
    }

    static {
        ReentrantLock reentrantLock = new ReentrantLock();
        f13035h = reentrantLock;
        Condition conditionNewCondition = reentrantLock.newCondition();
        kotlin.jvm.internal.r.d(conditionNewCondition, "newCondition(...)");
        f13036i = conditionNewCondition;
        long millis = TimeUnit.SECONDS.toMillis(60L);
        f13037j = millis;
        f13038k = TimeUnit.MILLISECONDS.toNanos(millis);
    }

    public final void h() {
        long j10 = this.f13097c;
        boolean z10 = this.f13095a;
        if (j10 != 0 || z10) {
            ReentrantLock reentrantLock = f13035h;
            reentrantLock.lock();
            try {
                if (this.f13040e != 0) {
                    throw new IllegalStateException("Unbalanced enter/exit");
                }
                this.f13040e = 1;
                a.a(this, j10, z10);
                pg.f0 f0Var = pg.f0.f21461a;
            } finally {
                reentrantLock.unlock();
            }
        }
    }

    public final boolean i() {
        ReentrantLock reentrantLock = f13035h;
        reentrantLock.lock();
        try {
            int i10 = this.f13040e;
            this.f13040e = 0;
            if (i10 != 1) {
                return i10 == 2;
            }
            c cVar = f13039l;
            while (cVar != null) {
                c cVar2 = cVar.f13041f;
                if (cVar2 == this) {
                    cVar.f13041f = this.f13041f;
                    this.f13041f = null;
                    return false;
                }
                cVar = cVar2;
            }
            throw new IllegalStateException("node was not found in the queue");
        } finally {
            reentrantLock.unlock();
        }
    }

    public void j() {
    }
}
