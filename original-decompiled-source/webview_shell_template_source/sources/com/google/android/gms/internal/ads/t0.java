package com.google.android.gms.internal.ads;

import java.io.EOFException;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class t0 implements s1 {

    /* renamed from: a, reason: collision with root package name */
    public final byte[] f9053a = new byte[4096];

    @Override // com.google.android.gms.internal.ads.s1
    public final int c(gc2 gc2Var, int i6, boolean z6) throws EOFException {
        int iJ = gc2Var.j(0, Math.min(4096, i6), this.f9053a);
        if (iJ != -1) {
            return iJ;
        }
        if (z6) {
            return -1;
        }
        throw new EOFException();
    }

    @Override // com.google.android.gms.internal.ads.s1
    public final int d(gc2 gc2Var, int i6, boolean z6) {
        return c(gc2Var, i6, z6);
    }

    @Override // com.google.android.gms.internal.ads.s1
    public final void e(int i6, ex0 ex0Var) {
        ex0Var.k(i6);
    }

    @Override // com.google.android.gms.internal.ads.s1
    public final void f(ex0 ex0Var, int i6, int i7) {
        ex0Var.k(i6);
    }

    @Override // com.google.android.gms.internal.ads.s1
    public final void b(w wVar) {
    }

    @Override // com.google.android.gms.internal.ads.s1
    public final void a(long j6, int i6, int i7, int i8, r1 r1Var) {
    }
}
