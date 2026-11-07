package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;
import java.util.concurrent.RunnableFuture;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class vs1 extends wr1 implements RunnableFuture {

    /* renamed from: z, reason: collision with root package name */
    public volatile fs1 f9931z;

    public vs1(Callable callable) {
        this.f9931z = new us1(this, callable);
    }

    @Override // com.google.android.gms.internal.ads.cr1
    public final String c() {
        fs1 fs1Var = this.f9931z;
        return fs1Var != null ? androidx.camera.camera2.internal.v0.b("task=[", fs1Var.toString(), "]") : super.c();
    }

    @Override // com.google.android.gms.internal.ads.cr1
    public final void d() {
        fs1 fs1Var;
        if (k() && (fs1Var = this.f9931z) != null) {
            fs1Var.g();
        }
        this.f9931z = null;
    }

    @Override // java.util.concurrent.RunnableFuture, java.lang.Runnable
    public final void run() {
        fs1 fs1Var = this.f9931z;
        if (fs1Var != null) {
            fs1Var.run();
        }
        this.f9931z = null;
    }
}
