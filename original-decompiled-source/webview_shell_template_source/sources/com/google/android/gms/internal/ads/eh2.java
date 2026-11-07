package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.util.Map;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class eh2 implements lo1 {

    /* renamed from: a, reason: collision with root package name */
    public final lo1 f4291a;

    /* renamed from: b, reason: collision with root package name */
    public final int f4292b;

    /* renamed from: c, reason: collision with root package name */
    public final bi2 f4293c;

    /* renamed from: d, reason: collision with root package name */
    public final byte[] f4294d;

    /* renamed from: e, reason: collision with root package name */
    public int f4295e;

    public eh2(lo1 lo1Var, int i6, bi2 bi2Var) {
        y5.n(i6 > 0);
        this.f4291a = lo1Var;
        this.f4292b = i6;
        this.f4293c = bi2Var;
        this.f4294d = new byte[1];
        this.f4295e = i6;
    }

    @Override // com.google.android.gms.internal.ads.lo1
    public final long c(os1 os1Var) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.android.gms.internal.ads.lo1
    public final void d(o52 o52Var) {
        o52Var.getClass();
        this.f4291a.d(o52Var);
    }

    @Override // com.google.android.gms.internal.ads.gc2
    public final int j(int i6, int i7, byte[] bArr) {
        long jMax;
        int i8 = this.f4295e;
        lo1 lo1Var = this.f4291a;
        if (i8 == 0) {
            int i9 = 0;
            byte[] bArr2 = this.f4294d;
            if (lo1Var.j(0, 1, bArr2) != -1) {
                int i10 = (bArr2[0] & 255) << 4;
                if (i10 != 0) {
                    byte[] bArr3 = new byte[i10];
                    int i11 = i10;
                    while (i11 > 0) {
                        int iJ = lo1Var.j(i9, i11, bArr3);
                        if (iJ != -1) {
                            i9 += iJ;
                            i11 -= iJ;
                        }
                    }
                    while (i10 > 0) {
                        int i12 = i10 - 1;
                        if (bArr3[i12] != 0) {
                            break;
                        }
                        i10 = i12;
                    }
                    if (i10 > 0) {
                        ex0 ex0Var = new ex0(i10, bArr3);
                        bi2 bi2Var = this.f4293c;
                        if (bi2Var.f3200l) {
                            ei2 ei2Var = bi2Var.f3201m;
                            Map map = ei2.f4304f0;
                            jMax = Math.max(ei2Var.n(true), bi2Var.f3197i);
                        } else {
                            jMax = bi2Var.f3197i;
                        }
                        long j6 = jMax;
                        int iO = ex0Var.o();
                        s1 s1Var = bi2Var.f3199k;
                        s1Var.getClass();
                        s1Var.e(iO, ex0Var);
                        s1Var.a(j6, 1, iO, 0, null);
                        bi2Var.f3200l = true;
                    }
                }
                i8 = this.f4292b;
                this.f4295e = i8;
            }
            return -1;
        }
        int iJ2 = lo1Var.j(i6, Math.min(i8, i7), bArr);
        if (iJ2 != -1) {
            this.f4295e -= iJ2;
        }
        return iJ2;
    }

    @Override // com.google.android.gms.internal.ads.lo1
    public final Uri zzc() {
        return this.f4291a.zzc();
    }

    @Override // com.google.android.gms.internal.ads.lo1
    public final void zzd() {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.android.gms.internal.ads.lo1
    public final Map zze() {
        return this.f4291a.zze();
    }
}
