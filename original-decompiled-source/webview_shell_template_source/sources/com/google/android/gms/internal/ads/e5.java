package com.google.android.gms.internal.ads;

import android.util.Pair;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class e5 implements h5 {

    /* renamed from: a, reason: collision with root package name */
    public final long[] f4119a;

    /* renamed from: b, reason: collision with root package name */
    public final long[] f4120b;

    /* renamed from: c, reason: collision with root package name */
    public final long f4121c;

    public e5(long j6, long[] jArr, long[] jArr2) {
        this.f4119a = jArr;
        this.f4120b = jArr2;
        this.f4121c = j6 == -9223372036854775807L ? j31.s(jArr2[jArr2.length - 1]) : j6;
    }

    public static Pair c(long j6, long[] jArr, long[] jArr2) {
        int iJ = j31.j(jArr, j6, true);
        long j7 = jArr[iJ];
        long j8 = jArr2[iJ];
        int i6 = iJ + 1;
        if (i6 == jArr.length) {
            return Pair.create(Long.valueOf(j7), Long.valueOf(j8));
        }
        return Pair.create(Long.valueOf(j6), Long.valueOf(((long) ((jArr[i6] == j7 ? 0.0d : (j6 - j7) / (r6 - j7)) * (jArr2[i6] - j8))) + j8));
    }

    @Override // com.google.android.gms.internal.ads.h5
    public final long a(long j6) {
        return j31.s(((Long) c(j6, this.f4119a, this.f4120b).second).longValue());
    }

    @Override // com.google.android.gms.internal.ads.m1
    public final k1 b(long j6) {
        Pair pairC = c(j31.v(Math.max(0L, Math.min(j6, this.f4121c))), this.f4120b, this.f4119a);
        n1 n1Var = new n1(j31.s(((Long) pairC.first).longValue()), ((Long) pairC.second).longValue());
        return new k1(n1Var, n1Var);
    }

    @Override // com.google.android.gms.internal.ads.m1
    public final long zza() {
        return this.f4121c;
    }

    @Override // com.google.android.gms.internal.ads.h5
    public final int zzc() {
        return -2147483647;
    }

    @Override // com.google.android.gms.internal.ads.h5
    public final long zzd() {
        return -1L;
    }

    @Override // com.google.android.gms.internal.ads.m1
    public final boolean zzh() {
        return true;
    }
}
