package com.google.android.gms.internal.ads;

import java.io.EOFException;
import java.io.InterruptedIOException;
import java.util.List;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class t8 implements x0 {

    /* renamed from: a, reason: collision with root package name */
    public final u8 f9122a = new u8(null, 0);

    /* renamed from: b, reason: collision with root package name */
    public final ex0 f9123b = new ex0(16384);

    /* renamed from: c, reason: collision with root package name */
    public boolean f9124c;

    @Override // com.google.android.gms.internal.ads.x0
    public final void c(long j6, long j7) {
        this.f9124c = false;
        this.f9122a.zze();
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
            int i10 = 7;
            p0Var.g(ex0Var.f4416a, 0, 7, false);
            ex0Var.j(0);
            int iZ = ex0Var.z();
            if (iZ != 44096 && iZ != 44097) {
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
                if (bArr.length < 7) {
                    i6 = -1;
                } else {
                    int i11 = ((bArr[2] & 255) << 8) | (bArr[3] & 255);
                    if (i11 == 65535) {
                        i11 = ((bArr[4] & 255) << 16) | ((bArr[5] & 255) << 8) | (bArr[6] & 255);
                    } else {
                        i10 = 4;
                    }
                    if (iZ == 44097) {
                        i10 += 2;
                    }
                    i6 = i11 + i10;
                }
                if (i6 == -1) {
                    break;
                }
                p0Var.k(i6 - 7, false);
            }
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.x0
    public final int e(y0 y0Var, b1 b1Var) {
        ex0 ex0Var = this.f9123b;
        int iJ = y0Var.j(0, 16384, ex0Var.f4416a);
        if (iJ == -1) {
            return -1;
        }
        ex0Var.j(0);
        ex0Var.i(iJ);
        boolean z6 = this.f9124c;
        u8 u8Var = this.f9122a;
        if (!z6) {
            u8Var.f9489m = 0L;
            this.f9124c = true;
        }
        u8Var.c(ex0Var);
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.x0
    public final void f(z0 z0Var) {
        this.f9122a.d(z0Var, new ea(Integer.MIN_VALUE, 0, 1));
        z0Var.d();
        z0Var.f(new l1(-9223372036854775807L, 0L));
    }

    @Override // com.google.android.gms.internal.ads.x0
    public final List zzd() {
        zn1 zn1Var = bo1.f3236t;
        return cp1.f3636w;
    }
}
