package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class j5 implements h5 {

    /* renamed from: a, reason: collision with root package name */
    public final long f5943a;

    /* renamed from: b, reason: collision with root package name */
    public final int f5944b;

    /* renamed from: c, reason: collision with root package name */
    public final long f5945c;

    /* renamed from: d, reason: collision with root package name */
    public final int f5946d;

    /* renamed from: e, reason: collision with root package name */
    public final long f5947e;

    /* renamed from: f, reason: collision with root package name */
    public final long f5948f;

    /* renamed from: g, reason: collision with root package name */
    public final long[] f5949g;

    public j5(long j6, int i6, long j7, int i7, long j8, long[] jArr) {
        this.f5943a = j6;
        this.f5944b = i6;
        this.f5945c = j7;
        this.f5946d = i7;
        this.f5947e = j8;
        this.f5949g = jArr;
        this.f5948f = j8 != -1 ? j6 + j8 : -1L;
    }

    @Override // com.google.android.gms.internal.ads.h5
    public final long a(long j6) {
        if (!zzh()) {
            return 0L;
        }
        long j7 = j6 - this.f5943a;
        if (j7 <= this.f5944b) {
            return 0L;
        }
        long[] jArr = this.f5949g;
        y5.k(jArr);
        double d7 = (j7 * 256.0d) / this.f5947e;
        int iJ = j31.j(jArr, (long) d7, true);
        long j8 = this.f5945c;
        long j9 = (iJ * j8) / 100;
        long j10 = jArr[iJ];
        int i6 = iJ + 1;
        long j11 = (j8 * i6) / 100;
        return Math.round((j10 == (iJ == 99 ? 256L : jArr[i6]) ? 0.0d : (d7 - j10) / (r0 - j10)) * (j11 - j9)) + j9;
    }

    @Override // com.google.android.gms.internal.ads.m1
    public final k1 b(long j6) {
        double d7;
        double d8;
        boolean zZzh = zzh();
        int i6 = this.f5944b;
        long j7 = this.f5943a;
        if (!zZzh) {
            n1 n1Var = new n1(0L, j7 + i6);
            return new k1(n1Var, n1Var);
        }
        long j8 = this.f5945c;
        long jMax = Math.max(0L, Math.min(j6, j8));
        double d9 = (jMax * 100.0d) / j8;
        double d10 = 0.0d;
        if (d9 <= 0.0d) {
            d7 = 256.0d;
        } else if (d9 >= 100.0d) {
            d7 = 256.0d;
            d10 = 256.0d;
        } else {
            int i7 = (int) d9;
            long[] jArr = this.f5949g;
            y5.k(jArr);
            double d11 = jArr[i7];
            if (i7 == 99) {
                d7 = 256.0d;
                d8 = 256.0d;
            } else {
                d7 = 256.0d;
                d8 = jArr[i7 + 1];
            }
            d10 = ((d8 - d11) * (d9 - i7)) + d11;
        }
        long j9 = this.f5947e;
        n1 n1Var2 = new n1(jMax, Math.max(i6, Math.min(Math.round((d10 / d7) * j9), j9 - 1)) + j7);
        return new k1(n1Var2, n1Var2);
    }

    @Override // com.google.android.gms.internal.ads.m1
    public final long zza() {
        return this.f5945c;
    }

    @Override // com.google.android.gms.internal.ads.h5
    public final int zzc() {
        return this.f5946d;
    }

    @Override // com.google.android.gms.internal.ads.h5
    public final long zzd() {
        return this.f5948f;
    }

    @Override // com.google.android.gms.internal.ads.m1
    public final boolean zzh() {
        return this.f5949g != null;
    }
}
