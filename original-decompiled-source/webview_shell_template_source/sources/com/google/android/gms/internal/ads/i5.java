package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class i5 implements h5 {

    /* renamed from: a, reason: collision with root package name */
    public final long[] f5557a;

    /* renamed from: b, reason: collision with root package name */
    public final long[] f5558b;

    /* renamed from: c, reason: collision with root package name */
    public final long f5559c;

    /* renamed from: d, reason: collision with root package name */
    public final long f5560d;

    /* renamed from: e, reason: collision with root package name */
    public final int f5561e;

    public i5(long[] jArr, long[] jArr2, long j6, long j7, int i6) {
        this.f5557a = jArr;
        this.f5558b = jArr2;
        this.f5559c = j6;
        this.f5560d = j7;
        this.f5561e = i6;
    }

    @Override // com.google.android.gms.internal.ads.h5
    public final long a(long j6) {
        return this.f5557a[j31.j(this.f5558b, j6, true)];
    }

    @Override // com.google.android.gms.internal.ads.m1
    public final k1 b(long j6) {
        long[] jArr = this.f5557a;
        int iJ = j31.j(jArr, j6, true);
        long j7 = jArr[iJ];
        long[] jArr2 = this.f5558b;
        n1 n1Var = new n1(j7, jArr2[iJ]);
        if (j7 >= j6 || iJ == jArr.length - 1) {
            return new k1(n1Var, n1Var);
        }
        int i6 = iJ + 1;
        return new k1(n1Var, new n1(jArr[i6], jArr2[i6]));
    }

    @Override // com.google.android.gms.internal.ads.m1
    public final long zza() {
        return this.f5559c;
    }

    @Override // com.google.android.gms.internal.ads.h5
    public final int zzc() {
        return this.f5561e;
    }

    @Override // com.google.android.gms.internal.ads.h5
    public final long zzd() {
        return this.f5560d;
    }

    @Override // com.google.android.gms.internal.ads.m1
    public final boolean zzh() {
        return true;
    }
}
