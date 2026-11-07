package ph;

import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.LockSupport;
import ph.g1;

/* loaded from: classes2.dex */
public final class n0 extends g1 implements Runnable {
    private static volatile Thread _thread;
    private static volatile int debugStatus;

    /* renamed from: k, reason: collision with root package name */
    public static final n0 f21570k;

    /* renamed from: l, reason: collision with root package name */
    public static final long f21571l;

    static {
        Long l10;
        n0 n0Var = new n0();
        f21570k = n0Var;
        n0Var.J0(false);
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        try {
            l10 = Long.getLong("kotlinx.coroutines.DefaultExecutor.keepAlive", 1000L);
        } catch (SecurityException unused) {
            l10 = 1000L;
        }
        f21571l = timeUnit.toNanos(l10.longValue());
    }

    @Override // ph.h1
    public final Thread M0() {
        Thread thread;
        Thread thread2 = _thread;
        if (thread2 != null) {
            return thread2;
        }
        synchronized (this) {
            thread = _thread;
            if (thread == null) {
                thread = new Thread(this, "kotlinx.coroutines.DefaultExecutor");
                _thread = thread;
                thread.setContextClassLoader(f21570k.getClass().getClassLoader());
                thread.setDaemon(true);
                thread.start();
            }
        }
        return thread;
    }

    @Override // ph.h1
    public final void N0(long j10, g1.c cVar) {
        throw new RejectedExecutionException("DefaultExecutor was shut down. This error indicates that Dispatchers.shutdown() was invoked prior to completion of exiting coroutines, leaving coroutines in incomplete state. Please refer to Dispatchers.shutdown documentation for more details");
    }

    @Override // ph.g1
    public final void O0(Runnable runnable) {
        if (debugStatus == 4) {
            throw new RejectedExecutionException("DefaultExecutor was shut down. This error indicates that Dispatchers.shutdown() was invoked prior to completion of exiting coroutines, leaving coroutines in incomplete state. Please refer to Dispatchers.shutdown documentation for more details");
        }
        super.O0(runnable);
    }

    public final synchronized void T0() {
        int i10 = debugStatus;
        if (i10 == 2 || i10 == 3) {
            debugStatus = 3;
            g1.f21536g.set(this, null);
            g1.f21537h.set(this, null);
            notifyAll();
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean zR0;
        p2.f21577a.set(this);
        try {
            synchronized (this) {
                int i10 = debugStatus;
                if (i10 == 2 || i10 == 3) {
                    if (zR0) {
                        return;
                    } else {
                        return;
                    }
                }
                debugStatus = 1;
                notifyAll();
                long j10 = Long.MAX_VALUE;
                while (true) {
                    Thread.interrupted();
                    long jK0 = K0();
                    if (jK0 == Long.MAX_VALUE) {
                        long jNanoTime = System.nanoTime();
                        if (j10 == Long.MAX_VALUE) {
                            j10 = f21571l + jNanoTime;
                        }
                        long j11 = j10 - jNanoTime;
                        if (j11 <= 0) {
                            _thread = null;
                            T0();
                            if (R0()) {
                                return;
                            }
                            M0();
                            return;
                        }
                        if (jK0 > j11) {
                            jK0 = j11;
                        }
                    } else {
                        j10 = Long.MAX_VALUE;
                    }
                    if (jK0 > 0) {
                        int i11 = debugStatus;
                        if (i11 == 2 || i11 == 3) {
                            _thread = null;
                            T0();
                            if (R0()) {
                                return;
                            }
                            M0();
                            return;
                        }
                        LockSupport.parkNanos(this, jK0);
                    }
                }
            }
        } finally {
            _thread = null;
            T0();
            if (!R0()) {
                M0();
            }
        }
    }

    @Override // ph.g1, ph.f1
    public final void shutdown() {
        debugStatus = 4;
        super.shutdown();
    }

    @Override // ph.g0
    public final String toString() {
        return "DefaultExecutor";
    }

    @Override // ph.g1, ph.r0
    public final b1 z(long j10, Runnable runnable, tg.h hVar) {
        long j11 = j10 > 0 ? j10 >= 9223372036854L ? Long.MAX_VALUE : 1000000 * j10 : 0L;
        if (j11 >= 4611686018427387903L) {
            return f2.f21533a;
        }
        long jNanoTime = System.nanoTime();
        g1.b bVar = new g1.b(j11 + jNanoTime, runnable);
        S0(jNanoTime, bVar);
        return bVar;
    }
}
