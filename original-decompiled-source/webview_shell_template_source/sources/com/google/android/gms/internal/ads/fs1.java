package com.google.android.gms.internal.ads;

import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.locks.LockSupport;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public abstract class fs1 extends AtomicReference implements Runnable {
    public static final l80 s = new l80(1);

    /* renamed from: t, reason: collision with root package name */
    public static final l80 f4776t = new l80(1);

    public abstract Object a();

    public abstract String b();

    public final void c(Thread thread) {
        Runnable runnable = (Runnable) get();
        es1 es1Var = null;
        boolean z6 = false;
        int i6 = 0;
        while (true) {
            boolean z7 = runnable instanceof es1;
            l80 l80Var = f4776t;
            if (!z7) {
                if (runnable != l80Var) {
                    break;
                }
            } else {
                es1Var = (es1) runnable;
            }
            i6++;
            if (i6 <= 1000) {
                Thread.yield();
            } else if (runnable == l80Var || compareAndSet(runnable, l80Var)) {
                z6 = Thread.interrupted() || z6;
                LockSupport.park(es1Var);
            }
            runnable = (Runnable) get();
        }
        if (z6) {
            thread.interrupt();
        }
    }

    public abstract void d(Throwable th);

    public abstract void e(Object obj);

    public abstract boolean f();

    public final void g() {
        l80 l80Var = f4776t;
        l80 l80Var2 = s;
        Runnable runnable = (Runnable) get();
        if (runnable instanceof Thread) {
            es1 es1Var = new es1(this);
            es1Var.setExclusiveOwnerThread(Thread.currentThread());
            if (compareAndSet(runnable, es1Var)) {
                try {
                    Thread thread = (Thread) runnable;
                    thread.interrupt();
                    if (((Runnable) getAndSet(l80Var2)) == l80Var) {
                        LockSupport.unpark(thread);
                    }
                } catch (Throwable th) {
                    if (((Runnable) getAndSet(l80Var2)) == l80Var) {
                        LockSupport.unpark((Thread) runnable);
                    }
                    throw th;
                }
            }
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        Thread threadCurrentThread = Thread.currentThread();
        Object objA = null;
        if (compareAndSet(null, threadCurrentThread)) {
            boolean zF = f();
            l80 l80Var = s;
            if (!zF) {
                try {
                    objA = a();
                } catch (Throwable th) {
                    try {
                        if (th instanceof InterruptedException) {
                            Thread.currentThread().interrupt();
                        }
                        if (!compareAndSet(threadCurrentThread, l80Var)) {
                            c(threadCurrentThread);
                        }
                        d(th);
                        return;
                    } catch (Throwable th2) {
                        if (!compareAndSet(threadCurrentThread, l80Var)) {
                            c(threadCurrentThread);
                        }
                        e(null);
                        throw th2;
                    }
                }
            }
            if (!compareAndSet(threadCurrentThread, l80Var)) {
                c(threadCurrentThread);
            }
            if (zF) {
                return;
            }
            e(objA);
        }
    }

    @Override // java.util.concurrent.atomic.AtomicReference
    public final String toString() {
        Runnable runnable = (Runnable) get();
        return androidx.activity.m.d(runnable == s ? "running=[DONE]" : runnable instanceof es1 ? "running=[INTERRUPTED]" : runnable instanceof Thread ? androidx.camera.camera2.internal.v0.b("running=[RUNNING ON ", ((Thread) runnable).getName(), "]") : "running=[NOT STARTED YET]", ", ", b());
    }
}
