package com.google.android.gms.internal.ads;

import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class ag implements ThreadFactory {

    /* renamed from: a, reason: collision with root package name */
    public final ThreadFactory f2748a = Executors.defaultThreadFactory();

    /* renamed from: b, reason: collision with root package name */
    public final AtomicInteger f2749b = new AtomicInteger(1);

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        Thread threadNewThread = this.f2748a.newThread(runnable);
        threadNewThread.setName("gads-" + this.f2749b.getAndIncrement());
        return threadNewThread;
    }
}
