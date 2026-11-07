package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class us1 extends fs1 {

    /* renamed from: u, reason: collision with root package name */
    public final Callable f9622u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ vs1 f9623v;

    public us1(vs1 vs1Var, Callable callable) {
        this.f9623v = vs1Var;
        callable.getClass();
        this.f9622u = callable;
    }

    @Override // com.google.android.gms.internal.ads.fs1
    public final Object a() {
        return this.f9622u.call();
    }

    @Override // com.google.android.gms.internal.ads.fs1
    public final String b() {
        return this.f9622u.toString();
    }

    @Override // com.google.android.gms.internal.ads.fs1
    public final void d(Throwable th) {
        this.f9623v.f(th);
    }

    @Override // com.google.android.gms.internal.ads.fs1
    public final void e(Object obj) {
        this.f9623v.e(obj);
    }

    @Override // com.google.android.gms.internal.ads.fs1
    public final boolean f() {
        return this.f9623v.isDone();
    }
}
