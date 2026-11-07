package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public class l1 implements m1 {

    /* renamed from: a, reason: collision with root package name */
    public final long f6553a;

    /* renamed from: b, reason: collision with root package name */
    public final k1 f6554b;

    public l1(long j6, long j7) {
        this.f6553a = j6;
        n1 n1Var = j7 == 0 ? n1.f7276c : new n1(0L, j7);
        this.f6554b = new k1(n1Var, n1Var);
    }

    @Override // com.google.android.gms.internal.ads.m1
    public final k1 b(long j6) {
        return this.f6554b;
    }

    @Override // com.google.android.gms.internal.ads.m1
    public final long zza() {
        return this.f6553a;
    }

    @Override // com.google.android.gms.internal.ads.m1
    public final boolean zzh() {
        return false;
    }
}
