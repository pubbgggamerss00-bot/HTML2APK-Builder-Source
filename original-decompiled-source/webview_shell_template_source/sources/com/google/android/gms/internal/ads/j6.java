package com.google.android.gms.internal.ads;

import java.math.BigInteger;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class j6 implements m1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ k6 f5953a;

    @Override // com.google.android.gms.internal.ads.m1
    public final k1 b(long j6) {
        k6 k6Var = this.f5953a;
        long j7 = k6Var.f6259t;
        BigInteger bigIntegerValueOf = BigInteger.valueOf((k6Var.f6261v.f8811i * j6) / 1000000);
        n1 n1Var = new n1(j6, Math.max(j7, Math.min((bigIntegerValueOf.multiply(BigInteger.valueOf(r5 - j7)).divide(BigInteger.valueOf(k6Var.f6263x)).longValue() + j7) - 30000, k6Var.f6260u - 1)));
        return new k1(n1Var, n1Var);
    }

    @Override // com.google.android.gms.internal.ads.m1
    public final long zza() {
        k6 k6Var = this.f5953a;
        s6 s6Var = k6Var.f6261v;
        return (k6Var.f6263x * 1000000) / s6Var.f8811i;
    }

    @Override // com.google.android.gms.internal.ads.m1
    public final boolean zzh() {
        return true;
    }
}
