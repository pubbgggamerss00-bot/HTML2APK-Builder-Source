package com.google.android.gms.internal.ads;

import java.util.concurrent.Delayed;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class ls1 extends me implements ScheduledFuture, c5.a, Future {

    /* renamed from: t, reason: collision with root package name */
    public final cr1 f6848t;

    /* renamed from: u, reason: collision with root package name */
    public final ScheduledFuture f6849u;

    public ls1(cr1 cr1Var, ScheduledFuture scheduledFuture) {
        super(6);
        this.f6848t = cr1Var;
        this.f6849u = scheduledFuture;
    }

    @Override // c5.a
    public final void addListener(Runnable runnable, Executor executor) {
        this.f6848t.addListener(runnable, executor);
    }

    @Override // com.google.android.gms.internal.ads.me
    public final /* synthetic */ Object c() {
        return this.f6848t;
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z6) {
        boolean zCancel = this.f6848t.cancel(z6);
        if (zCancel) {
            this.f6849u.cancel(z6);
        }
        return zCancel;
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Delayed delayed) {
        return this.f6849u.compareTo(delayed);
    }

    @Override // java.util.concurrent.Future
    public final Object get() {
        return this.f6848t.get();
    }

    @Override // java.util.concurrent.Delayed
    public final long getDelay(TimeUnit timeUnit) {
        return this.f6849u.getDelay(timeUnit);
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.f6848t.isCancelled();
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return this.f6848t.isDone();
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j6, TimeUnit timeUnit) {
        return this.f6848t.get(j6, timeUnit);
    }
}
