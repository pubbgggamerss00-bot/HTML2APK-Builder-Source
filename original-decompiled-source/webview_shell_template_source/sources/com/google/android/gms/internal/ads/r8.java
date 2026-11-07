package com.google.android.gms.internal.ads;

import java.io.EOFException;
import java.io.InterruptedIOException;
import java.util.List;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class r8 implements x0 {

    /* renamed from: a, reason: collision with root package name */
    public final s8 f8579a = new s8(null, 0);

    /* renamed from: b, reason: collision with root package name */
    public final ex0 f8580b = new ex0(2786);

    /* renamed from: c, reason: collision with root package name */
    public boolean f8581c;

    @Override // com.google.android.gms.internal.ads.x0
    public final void c(long j6, long j7) {
        this.f8581c = false;
        this.f8579a.zze();
    }

    @Override // com.google.android.gms.internal.ads.x0
    public final boolean d(y0 y0Var) throws EOFException, InterruptedIOException {
        p0 p0Var;
        int i6;
        ex0 ex0Var = new ex0(10);
        int i7 = 0;
        while (true) {
            p0Var = (p0) y0Var;
            p0Var.g(ex0Var.f4416a, 0, 10, false);
            ex0Var.j(0);
            if (ex0Var.x() != 4801587) {
                break;
            }
            ex0Var.k(3);
            int iU = ex0Var.u();
            i7 += iU + 10;
            p0Var.k(iU, false);
        }
        p0Var.f7910f = 0;
        p0Var.k(i7, false);
        int i8 = 0;
        int i9 = i7;
        while (true) {
            p0Var.g(ex0Var.f4416a, 0, 6, false);
            ex0Var.j(0);
            if (ex0Var.z() != 2935) {
                p0Var.f7910f = 0;
                i9++;
                if (i9 - i7 >= 8192) {
                    break;
                }
                p0Var.k(i9, false);
                i8 = 0;
            } else {
                i8++;
                if (i8 >= 4) {
                    return true;
                }
                byte[] bArr = ex0Var.f4416a;
                if (bArr.length < 6) {
                    i6 = -1;
                } else if (((bArr[5] & 248) >> 3) > 10) {
                    int i10 = (((bArr[2] & 7) << 8) | (bArr[3] & 255)) + 1;
                    i6 = i10 + i10;
                } else {
                    byte b7 = bArr[4];
                    i6 = d0.i((b7 & 192) >> 6, b7 & 63);
                }
                if (i6 == -1) {
                    break;
                }
                p0Var.k(i6 - 6, false);
            }
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.x0
    public final int e(y0 y0Var, b1 b1Var) {
        ex0 ex0Var = this.f8580b;
        int iJ = y0Var.j(0, 2786, ex0Var.f4416a);
        if (iJ == -1) {
            return -1;
        }
        ex0Var.j(0);
        ex0Var.i(iJ);
        boolean z6 = this.f8581c;
        s8 s8Var = this.f8579a;
        if (!z6) {
            s8Var.f8839m = 0L;
            this.f8581c = true;
        }
        s8Var.c(ex0Var);
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.x0
    public final void f(z0 z0Var) {
        this.f8579a.d(z0Var, new ea(Integer.MIN_VALUE, 0, 1));
        z0Var.d();
        z0Var.f(new l1(-9223372036854775807L, 0L));
    }

    @Override // com.google.android.gms.internal.ads.x0
    public final List zzd() {
        zn1 zn1Var = bo1.f3236t;
        return cp1.f3636w;
    }
}
