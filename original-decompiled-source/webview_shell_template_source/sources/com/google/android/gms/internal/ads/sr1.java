package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class sr1 extends fs1 {

    /* renamed from: u, reason: collision with root package name */
    public final Executor f8998u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ tr1 f8999v;

    /* renamed from: w, reason: collision with root package name */
    public final Callable f9000w;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ tr1 f9001x;

    public sr1(tr1 tr1Var, Callable callable, Executor executor) {
        this.f9001x = tr1Var;
        this.f8999v = tr1Var;
        executor.getClass();
        this.f8998u = executor;
        this.f9000w = callable;
    }

    @Override // com.google.android.gms.internal.ads.fs1
    public final Object a() {
        return this.f9000w.call();
    }

    @Override // com.google.android.gms.internal.ads.fs1
    public final String b() {
        return this.f9000w.toString();
    }

    @Override // com.google.android.gms.internal.ads.fs1
    public final void d(Throwable th) {
        tr1 tr1Var = this.f8999v;
        tr1Var.H = null;
        if (th instanceof ExecutionException) {
            tr1Var.f(((ExecutionException) th).getCause());
        } else if (th instanceof CancellationException) {
            tr1Var.cancel(false);
        } else {
            tr1Var.f(th);
        }
    }

    @Override // com.google.android.gms.internal.ads.fs1
    public final void e(Object obj) {
        this.f8999v.H = null;
        this.f9001x.e(obj);
    }

    @Override // com.google.android.gms.internal.ads.fs1
    public final boolean f() {
        return this.f8999v.isDone();
    }
}
