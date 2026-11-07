package com.google.android.gms.internal.ads;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class rd1 implements ThreadFactory {

    /* renamed from: a, reason: collision with root package name */
    public final AtomicInteger f8612a = new AtomicInteger(1);

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        return new Thread(runnable, androidx.camera.camera2.internal.compat.workaround.c.d(this.f8612a.getAndIncrement(), "AdWorker(NG) #"));
    }
}
