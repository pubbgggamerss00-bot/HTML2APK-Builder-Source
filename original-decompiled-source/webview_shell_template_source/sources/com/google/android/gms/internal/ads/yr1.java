package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class yr1 extends xr1 {

    /* renamed from: z, reason: collision with root package name */
    public final c5.a f11068z;

    public yr1(c5.a aVar) {
        aVar.getClass();
        this.f11068z = aVar;
    }

    @Override // com.google.android.gms.internal.ads.cr1, c5.a
    public final void addListener(Runnable runnable, Executor executor) {
        this.f11068z.addListener(runnable, executor);
    }

    @Override // com.google.android.gms.internal.ads.cr1, java.util.concurrent.Future
    public final boolean cancel(boolean z6) {
        return this.f11068z.cancel(z6);
    }

    @Override // com.google.android.gms.internal.ads.cr1, java.util.concurrent.Future
    public final Object get() {
        return this.f11068z.get();
    }

    @Override // com.google.android.gms.internal.ads.cr1, java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.f11068z.isCancelled();
    }

    @Override // com.google.android.gms.internal.ads.cr1, java.util.concurrent.Future
    public final boolean isDone() {
        return this.f11068z.isDone();
    }

    @Override // com.google.android.gms.internal.ads.cr1
    public final String toString() {
        return this.f11068z.toString();
    }

    @Override // com.google.android.gms.internal.ads.cr1, java.util.concurrent.Future
    public final Object get(long j6, TimeUnit timeUnit) {
        return this.f11068z.get(j6, timeUnit);
    }
}
