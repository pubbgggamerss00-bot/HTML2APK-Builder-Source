package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class ns1 extends ks1 implements is1 {

    /* renamed from: t, reason: collision with root package name */
    public final ScheduledExecutorService f7502t;

    public ns1(ScheduledExecutorService scheduledExecutorService) {
        super(scheduledExecutorService);
        this.f7502t = scheduledExecutorService;
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    /* renamed from: n, reason: merged with bridge method [inline-methods] */
    public final ls1 schedule(Callable callable, long j6, TimeUnit timeUnit) {
        vs1 vs1Var = new vs1(callable);
        return new ls1(vs1Var, this.f7502t.schedule(vs1Var, j6, timeUnit));
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public final ScheduledFuture schedule(Runnable runnable, long j6, TimeUnit timeUnit) {
        vs1 vs1Var = new vs1(Executors.callable(runnable, null));
        return new ls1(vs1Var, this.f7502t.schedule(vs1Var, j6, timeUnit));
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public final /* bridge */ /* synthetic */ ScheduledFuture scheduleAtFixedRate(Runnable runnable, long j6, long j7, TimeUnit timeUnit) {
        ms1 ms1Var = new ms1(runnable);
        return new ls1(ms1Var, this.f7502t.scheduleAtFixedRate(ms1Var, j6, j7, timeUnit));
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public final /* bridge */ /* synthetic */ ScheduledFuture scheduleWithFixedDelay(Runnable runnable, long j6, long j7, TimeUnit timeUnit) {
        ms1 ms1Var = new ms1(runnable);
        return new ls1(ms1Var, this.f7502t.scheduleWithFixedDelay(ms1Var, j6, j7, timeUnit));
    }
}
