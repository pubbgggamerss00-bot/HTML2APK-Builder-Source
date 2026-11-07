package com.google.android.gms.internal.consent_sdk;

import java.lang.ref.WeakReference;
import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class l0 implements Executor {

    /* renamed from: t, reason: collision with root package name */
    public final ThreadPoolExecutor f11808t;
    public final AtomicInteger s = new AtomicInteger(1);

    /* renamed from: u, reason: collision with root package name */
    public WeakReference f11809u = new WeakReference(null);

    public l0() {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(1, 1, 30L, TimeUnit.SECONDS, new LinkedBlockingQueue(), new ThreadFactory() { // from class: com.google.android.gms.internal.consent_sdk.k0
            @Override // java.util.concurrent.ThreadFactory
            public final Thread newThread(Runnable runnable) {
                l0 l0Var = this.f11797a;
                Thread thread = new Thread(runnable, androidx.camera.camera2.internal.compat.workaround.c.d(l0Var.s.getAndIncrement(), "Google consent worker #"));
                l0Var.f11809u = new WeakReference(thread);
                return thread;
            }
        });
        this.f11808t = threadPoolExecutor;
        threadPoolExecutor.allowCoreThreadTimeOut(true);
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        if (Thread.currentThread() == this.f11809u.get()) {
            runnable.run();
        } else {
            this.f11808t.execute(runnable);
        }
    }
}
