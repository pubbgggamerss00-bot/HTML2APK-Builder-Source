package com.google.android.gms.internal.ads;

import java.io.EOFException;
import java.io.InterruptedIOException;
import java.util.List;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class qa implements x0 {

    /* renamed from: a, reason: collision with root package name */
    public final ex0 f8282a = new ex0(4);

    /* renamed from: b, reason: collision with root package name */
    public final o1 f8283b = new o1(-1, -1, "image/webp");

    @Override // com.google.android.gms.internal.ads.x0
    public final void c(long j6, long j7) {
        this.f8283b.c(j6, j7);
    }

    @Override // com.google.android.gms.internal.ads.x0
    public final boolean d(y0 y0Var) throws EOFException, InterruptedIOException {
        ex0 ex0Var = this.f8282a;
        ex0Var.g(4);
        p0 p0Var = (p0) y0Var;
        p0Var.g(ex0Var.f4416a, 0, 4, false);
        if (ex0Var.D() == 1380533830) {
            p0Var.k(4, false);
            ex0Var.g(4);
            p0Var.g(ex0Var.f4416a, 0, 4, false);
            if (ex0Var.D() == 1464156752) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.x0
    public final int e(y0 y0Var, b1 b1Var) {
        return this.f8283b.e(y0Var, b1Var);
    }

    @Override // com.google.android.gms.internal.ads.x0
    public final void f(z0 z0Var) {
        this.f8283b.f(z0Var);
    }

    @Override // com.google.android.gms.internal.ads.x0
    public final List zzd() {
        zn1 zn1Var = bo1.f3236t;
        return cp1.f3636w;
    }
}
