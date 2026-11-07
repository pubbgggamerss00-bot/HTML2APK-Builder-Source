package y5;

import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.LockSupport;
import y5.m0;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class c0 extends m0 implements Runnable {
    public static final c0 A;
    public static final long B;
    private static volatile Thread _thread;
    private static volatile int debugStatus;

    static {
        Long l4;
        c0 c0Var = new c0();
        A = c0Var;
        c0Var.A(false);
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        try {
            l4 = Long.getLong("kotlinx.coroutines.DefaultExecutor.keepAlive", 1000L);
        } catch (SecurityException unused) {
            l4 = 1000L;
        }
        B = timeUnit.toNanos(l4.longValue());
    }

    @Override // y5.n0
    public final Thread C() {
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
                thread.setDaemon(true);
                thread.start();
            }
        }
        return thread;
    }

    @Override // y5.n0
    public final void D(long j6, m0.a aVar) {
        throw new RejectedExecutionException("DefaultExecutor was shut down. This error indicates that Dispatchers.shutdown() was invoked prior to completion of exiting coroutines, leaving coroutines in incomplete state. Please refer to Dispatchers.shutdown documentation for more details");
    }

    @Override // y5.m0
    public final void E(Runnable runnable) {
        if (debugStatus == 4) {
            throw new RejectedExecutionException("DefaultExecutor was shut down. This error indicates that Dispatchers.shutdown() was invoked prior to completion of exiting coroutines, leaving coroutines in incomplete state. Please refer to Dispatchers.shutdown documentation for more details");
        }
        super.E(runnable);
    }

    public final synchronized void I() {
        int i6 = debugStatus;
        if (i6 == 2 || i6 == 3) {
            debugStatus = 3;
            m0.f15363x.set(this, null);
            m0.f15364y.set(this, null);
            notifyAll();
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean zG;
        l1.f15362a.set(this);
        try {
            synchronized (this) {
                int i6 = debugStatus;
                if (i6 == 2 || i6 == 3) {
                    if (zG) {
                        return;
                    } else {
                        return;
                    }
                }
                debugStatus = 1;
                notifyAll();
                long j6 = Long.MAX_VALUE;
                while (true) {
                    Thread.interrupted();
                    long jH = H();
                    if (jH == Long.MAX_VALUE) {
                        long jNanoTime = System.nanoTime();
                        if (j6 == Long.MAX_VALUE) {
                            j6 = B + jNanoTime;
                        }
                        long j7 = j6 - jNanoTime;
                        if (j7 <= 0) {
                            _thread = null;
                            I();
                            if (G()) {
                                return;
                            }
                            C();
                            return;
                        }
                        if (jH > j7) {
                            jH = j7;
                        }
                    } else {
                        j6 = Long.MAX_VALUE;
                    }
                    if (jH > 0) {
                        int i7 = debugStatus;
                        if (i7 == 2 || i7 == 3) {
                            _thread = null;
                            I();
                            if (G()) {
                                return;
                            }
                            C();
                            return;
                        }
                        LockSupport.parkNanos(this, jH);
                    }
                }
            }
        } finally {
            _thread = null;
            I();
            if (!G()) {
                C();
            }
        }
    }

    @Override // y5.m0, y5.l0
    public final void shutdown() {
        debugStatus = 4;
        super.shutdown();
    }
}
