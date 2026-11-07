package com.google.android.gms.internal.ads;

import java.io.EOFException;
import java.io.InterruptedIOException;
import java.util.List;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class v8 implements x0 {

    /* renamed from: c, reason: collision with root package name */
    public final ex0 f9751c;

    /* renamed from: d, reason: collision with root package name */
    public final l42 f9752d;

    /* renamed from: e, reason: collision with root package name */
    public z0 f9753e;

    /* renamed from: f, reason: collision with root package name */
    public long f9754f;
    public boolean h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f9756i;

    /* renamed from: a, reason: collision with root package name */
    public final w8 f9749a = new w8(null, 0, true);

    /* renamed from: b, reason: collision with root package name */
    public final ex0 f9750b = new ex0(2048);

    /* renamed from: g, reason: collision with root package name */
    public long f9755g = -1;

    public v8() {
        ex0 ex0Var = new ex0(10);
        this.f9751c = ex0Var;
        byte[] bArr = ex0Var.f4416a;
        this.f9752d = new l42(bArr.length, bArr);
    }

    @Override // com.google.android.gms.internal.ads.x0
    public final void c(long j6, long j7) {
        this.h = false;
        this.f9749a.zze();
        this.f9754f = j7;
    }

    @Override // com.google.android.gms.internal.ads.x0
    public final boolean d(y0 y0Var) throws EOFException, InterruptedIOException {
        ex0 ex0Var;
        p0 p0Var;
        int i6 = 0;
        while (true) {
            ex0Var = this.f9751c;
            p0Var = (p0) y0Var;
            p0Var.g(ex0Var.f4416a, 0, 10, false);
            ex0Var.j(0);
            if (ex0Var.x() != 4801587) {
                break;
            }
            ex0Var.k(3);
            int iU = ex0Var.u();
            i6 += iU + 10;
            p0Var.k(iU, false);
        }
        p0Var.f7910f = 0;
        p0Var.k(i6, false);
        if (this.f9755g == -1) {
            this.f9755g = i6;
        }
        int i7 = 0;
        int i8 = 0;
        int i9 = i6;
        do {
            p0Var.g(ex0Var.f4416a, 0, 2, false);
            ex0Var.j(0);
            if ((ex0Var.z() & 65526) == 65520) {
                i7++;
                if (i7 >= 4 && i8 > 188) {
                    return true;
                }
                p0Var.g(ex0Var.f4416a, 0, 4, false);
                l42 l42Var = this.f9752d;
                l42Var.B(14);
                int iW = l42Var.w(13);
                if (iW <= 6) {
                    i9++;
                    p0Var.f7910f = 0;
                    p0Var.k(i9, false);
                } else {
                    p0Var.k(iW - 6, false);
                    i8 += iW;
                }
            } else {
                i9++;
                p0Var.f7910f = 0;
                p0Var.k(i9, false);
            }
            i7 = 0;
            i8 = 0;
        } while (i9 - i6 < 8192);
        return false;
    }

    @Override // com.google.android.gms.internal.ads.x0
    public final int e(y0 y0Var, b1 b1Var) {
        y5.k(this.f9753e);
        ex0 ex0Var = this.f9750b;
        int iJ = y0Var.j(0, 2048, ex0Var.f4416a);
        if (!this.f9756i) {
            this.f9753e.f(new l1(-9223372036854775807L, 0L));
            this.f9756i = true;
        }
        if (iJ == -1) {
            return -1;
        }
        ex0Var.j(0);
        ex0Var.i(iJ);
        boolean z6 = this.h;
        w8 w8Var = this.f9749a;
        if (!z6) {
            w8Var.f10117t = this.f9754f;
            this.h = true;
        }
        w8Var.c(ex0Var);
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.x0
    public final void f(z0 z0Var) {
        this.f9753e = z0Var;
        this.f9749a.d(z0Var, new ea(Integer.MIN_VALUE, 0, 1));
        z0Var.d();
    }

    @Override // com.google.android.gms.internal.ads.x0
    public final List zzd() {
        zn1 zn1Var = bo1.f3236t;
        return cp1.f3636w;
    }
}
