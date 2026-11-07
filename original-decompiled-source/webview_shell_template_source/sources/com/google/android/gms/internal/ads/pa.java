package com.google.android.gms.internal.ads;

import java.math.RoundingMode;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class pa implements m1 {

    /* renamed from: a, reason: collision with root package name */
    public final ma f8002a;

    /* renamed from: b, reason: collision with root package name */
    public final int f8003b;

    /* renamed from: c, reason: collision with root package name */
    public final long f8004c;

    /* renamed from: d, reason: collision with root package name */
    public final long f8005d;

    /* renamed from: e, reason: collision with root package name */
    public final long f8006e;

    public pa(ma maVar, int i6, long j6, long j7) {
        this.f8002a = maVar;
        this.f8003b = i6;
        this.f8004c = j6;
        long j8 = (j7 - j6) / maVar.f7013c;
        this.f8005d = j8;
        this.f8006e = c(j8);
    }

    @Override // com.google.android.gms.internal.ads.m1
    public final k1 b(long j6) {
        long j7 = this.f8003b;
        ma maVar = this.f8002a;
        long j8 = (maVar.f7012b * j6) / (j7 * 1000000);
        long j9 = this.f8005d;
        long jMax = Math.max(0L, Math.min(j8, j9 - 1));
        long jC = c(jMax);
        long j10 = this.f8004c;
        n1 n1Var = new n1(jC, (maVar.f7013c * jMax) + j10);
        if (jC >= j6 || jMax == j9 - 1) {
            return new k1(n1Var, n1Var);
        }
        long j11 = jMax + 1;
        return new k1(n1Var, new n1(c(j11), (j11 * maVar.f7013c) + j10));
    }

    public final long c(long j6) {
        return j31.u(j6 * this.f8003b, 1000000L, this.f8002a.f7012b, RoundingMode.DOWN);
    }

    @Override // com.google.android.gms.internal.ads.m1
    public final long zza() {
        return this.f8006e;
    }

    @Override // com.google.android.gms.internal.ads.m1
    public final boolean zzh() {
        return true;
    }
}
