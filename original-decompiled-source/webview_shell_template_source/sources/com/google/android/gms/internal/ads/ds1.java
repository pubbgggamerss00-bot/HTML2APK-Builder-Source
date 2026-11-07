package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class ds1 implements c5.a {

    /* renamed from: t, reason: collision with root package name */
    public static final ds1 f4001t = new ds1(null);

    /* renamed from: u, reason: collision with root package name */
    public static final gs1 f4002u = new gs1(ds1.class);
    public final Object s;

    public ds1(Object obj) {
        this.s = obj;
    }

    @Override // c5.a
    public final void addListener(Runnable runnable, Executor executor) {
        sl1.c("Runnable was null.", runnable);
        sl1.c("Executor was null.", executor);
        try {
            executor.execute(runnable);
        } catch (Exception e6) {
            f4002u.a().logp(Level.SEVERE, "com.google.common.util.concurrent.ImmediateFuture", "addListener", "RuntimeException while executing runnable " + String.valueOf(runnable) + " with executor " + String.valueOf(executor), (Throwable) e6);
        }
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z6) {
        return false;
    }

    @Override // java.util.concurrent.Future
    public final Object get() {
        return this.s;
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return false;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return true;
    }

    public final String toString() {
        return super.toString() + "[status=SUCCESS, result=[" + String.valueOf(this.s) + "]]";
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j6, TimeUnit timeUnit) {
        timeUnit.getClass();
        return this.s;
    }
}
