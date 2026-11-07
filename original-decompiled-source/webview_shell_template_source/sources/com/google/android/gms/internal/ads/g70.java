package com.google.android.gms.internal.ads;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class g70 implements ThreadFactory {

    /* renamed from: a, reason: collision with root package name */
    public final AtomicInteger f4921a = new AtomicInteger(1);

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f4922b;

    public g70(String str) {
        this.f4922b = str;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        return new Thread(runnable, "AdWorker(" + this.f4922b + ") #" + this.f4921a.getAndIncrement());
    }
}
