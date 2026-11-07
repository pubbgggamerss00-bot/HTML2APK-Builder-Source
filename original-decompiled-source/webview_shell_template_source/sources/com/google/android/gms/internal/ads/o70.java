package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.zzv;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public class o70 implements c5.a {
    public final ps1 s = new ps1();

    public final boolean a(Object obj) {
        boolean zE = this.s.e(obj);
        if (!zE) {
            zzv.zzp().g("SettableFuture", new IllegalStateException("Provided SettableFuture with multiple values."));
        }
        return zE;
    }

    @Override // c5.a
    public final void addListener(Runnable runnable, Executor executor) {
        this.s.addListener(runnable, executor);
    }

    public final boolean b(Throwable th) {
        boolean zF = this.s.f(th);
        if (!zF) {
            zzv.zzp().g("SettableFuture", new IllegalStateException("Provided SettableFuture with multiple values."));
        }
        return zF;
    }

    @Override // java.util.concurrent.Future
    public boolean cancel(boolean z6) {
        return this.s.cancel(z6);
    }

    @Override // java.util.concurrent.Future
    public final Object get() {
        return this.s.get();
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.s.s instanceof sq1;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return this.s.isDone();
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j6, TimeUnit timeUnit) {
        return this.s.get(j6, timeUnit);
    }
}
