package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class c5 implements h5, m1 {

    /* renamed from: a, reason: collision with root package name */
    public final long f3402a;

    /* renamed from: b, reason: collision with root package name */
    public final long f3403b;

    /* renamed from: c, reason: collision with root package name */
    public final int f3404c;

    /* renamed from: d, reason: collision with root package name */
    public final long f3405d;

    /* renamed from: e, reason: collision with root package name */
    public final int f3406e;

    /* renamed from: f, reason: collision with root package name */
    public final long f3407f;

    /* renamed from: g, reason: collision with root package name */
    public final long f3408g;
    public final int h;

    /* renamed from: i, reason: collision with root package name */
    public final int f3409i;

    /* renamed from: j, reason: collision with root package name */
    public final long f3410j;

    public c5(int i6, int i7, long j6, long j7) {
        long jMax;
        this.f3402a = j6;
        this.f3403b = j7;
        this.f3404c = i7 == -1 ? 1 : i7;
        this.f3406e = i6;
        if (j6 == -1) {
            this.f3405d = -1L;
            jMax = -9223372036854775807L;
        } else {
            long j8 = j6 - j7;
            this.f3405d = j8;
            jMax = (Math.max(0L, j8) * 8000000) / i6;
        }
        this.f3407f = jMax;
        this.f3408g = j7;
        this.h = i6;
        this.f3409i = i7;
        this.f3410j = j6 == -1 ? -1L : j6;
    }

    @Override // com.google.android.gms.internal.ads.h5
    public final long a(long j6) {
        return (Math.max(0L, j6 - this.f3403b) * 8000000) / this.f3406e;
    }

    @Override // com.google.android.gms.internal.ads.m1
    public final k1 b(long j6) {
        long j7 = this.f3405d;
        long j8 = this.f3403b;
        if (j7 == -1) {
            n1 n1Var = new n1(0L, j8);
            return new k1(n1Var, n1Var);
        }
        int i6 = this.f3406e;
        long j9 = this.f3404c;
        long jMin = (((i6 * j6) / 8000000) / j9) * j9;
        if (j7 != -1) {
            jMin = Math.min(jMin, j7 - j9);
        }
        long jMax = Math.max(jMin, 0L) + j8;
        long jMax2 = (Math.max(0L, jMax - j8) * 8000000) / i6;
        n1 n1Var2 = new n1(jMax2, jMax);
        if (j7 != -1 && jMax2 < j6) {
            long j10 = jMax + j9;
            if (j10 < this.f3402a) {
                return new k1(n1Var2, new n1((Math.max(0L, j10 - j8) * 8000000) / i6, j10));
            }
        }
        return new k1(n1Var2, n1Var2);
    }

    @Override // com.google.android.gms.internal.ads.m1
    public final long zza() {
        return this.f3407f;
    }

    @Override // com.google.android.gms.internal.ads.h5
    public final int zzc() {
        return this.h;
    }

    @Override // com.google.android.gms.internal.ads.h5
    public final long zzd() {
        return this.f3410j;
    }

    @Override // com.google.android.gms.internal.ads.m1
    public final boolean zzh() {
        return this.f3405d != -1;
    }
}
