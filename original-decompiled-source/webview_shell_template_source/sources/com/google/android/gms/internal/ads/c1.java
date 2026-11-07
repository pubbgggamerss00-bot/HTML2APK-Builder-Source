package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class c1 implements m1 {

    /* renamed from: a, reason: collision with root package name */
    public final d1 f3358a;

    /* renamed from: b, reason: collision with root package name */
    public final long f3359b;

    public c1(d1 d1Var, long j6) {
        this.f3358a = d1Var;
        this.f3359b = j6;
    }

    @Override // com.google.android.gms.internal.ads.m1
    public final k1 b(long j6) {
        d1 d1Var = this.f3358a;
        y5.k(d1Var.f3718k);
        ni0 ni0Var = d1Var.f3718k;
        long[] jArr = (long[]) ni0Var.f7447t;
        long[] jArr2 = (long[]) ni0Var.f7448u;
        int iJ = j31.j(jArr, Math.max(0L, Math.min((d1Var.f3713e * j6) / 1000000, d1Var.f3717j - 1)), false);
        long j7 = iJ == -1 ? 0L : jArr[iJ];
        long j8 = iJ != -1 ? jArr2[iJ] : 0L;
        int i6 = d1Var.f3713e;
        long j9 = (j7 * 1000000) / i6;
        long j10 = this.f3359b;
        n1 n1Var = new n1(j9, j8 + j10);
        if (j9 == j6 || iJ == jArr.length - 1) {
            return new k1(n1Var, n1Var);
        }
        int i7 = iJ + 1;
        return new k1(n1Var, new n1((jArr[i7] * 1000000) / i6, j10 + jArr2[i7]));
    }

    @Override // com.google.android.gms.internal.ads.m1
    public final long zza() {
        return this.f3358a.a();
    }

    @Override // com.google.android.gms.internal.ads.m1
    public final boolean zzh() {
        return true;
    }
}
