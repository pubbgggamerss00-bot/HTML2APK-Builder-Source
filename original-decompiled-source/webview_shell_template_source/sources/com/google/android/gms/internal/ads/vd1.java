package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class vd1 implements c5.a {
    public final Object s;

    /* renamed from: t, reason: collision with root package name */
    public final String f9833t;

    /* renamed from: u, reason: collision with root package name */
    public final c5.a f9834u;

    public vd1(Object obj, String str, c5.a aVar) {
        this.s = obj;
        this.f9833t = str;
        this.f9834u = aVar;
    }

    @Override // c5.a
    public final void addListener(Runnable runnable, Executor executor) {
        this.f9834u.addListener(runnable, executor);
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z6) {
        return this.f9834u.cancel(z6);
    }

    @Override // java.util.concurrent.Future
    public final Object get() {
        return this.f9834u.get();
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.f9834u.isCancelled();
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return this.f9834u.isDone();
    }

    public final String toString() {
        return this.f9833t + "@" + System.identityHashCode(this);
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j6, TimeUnit timeUnit) {
        return this.f9834u.get(j6, timeUnit);
    }
}
