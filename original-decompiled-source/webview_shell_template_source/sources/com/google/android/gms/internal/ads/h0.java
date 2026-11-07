package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class h0 implements m1 {

    /* renamed from: a, reason: collision with root package name */
    public final j0 f5194a;

    /* renamed from: b, reason: collision with root package name */
    public final long f5195b;

    /* renamed from: c, reason: collision with root package name */
    public final long f5196c;

    /* renamed from: d, reason: collision with root package name */
    public final long f5197d;

    /* renamed from: e, reason: collision with root package name */
    public final long f5198e;

    /* renamed from: f, reason: collision with root package name */
    public final long f5199f;

    public h0(j0 j0Var, long j6, long j7, long j8, long j9, long j10) {
        this.f5194a = j0Var;
        this.f5195b = j6;
        this.f5196c = j7;
        this.f5197d = j8;
        this.f5198e = j9;
        this.f5199f = j10;
    }

    @Override // com.google.android.gms.internal.ads.m1
    public final k1 b(long j6) {
        n1 n1Var = new n1(j6, i0.a(this.f5194a.c(j6), 0L, this.f5196c, this.f5197d, this.f5198e, this.f5199f));
        return new k1(n1Var, n1Var);
    }

    @Override // com.google.android.gms.internal.ads.m1
    public final long zza() {
        return this.f5195b;
    }

    @Override // com.google.android.gms.internal.ads.m1
    public final boolean zzh() {
        return true;
    }
}
