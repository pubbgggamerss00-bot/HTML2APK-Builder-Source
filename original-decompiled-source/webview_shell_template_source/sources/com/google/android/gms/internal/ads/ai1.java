package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class ai1 extends yh1 {

    /* renamed from: a, reason: collision with root package name */
    public final String f2779a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f2780b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f2781c;

    /* renamed from: d, reason: collision with root package name */
    public final long f2782d;

    /* renamed from: e, reason: collision with root package name */
    public final long f2783e;

    public ai1(String str, boolean z6, boolean z7, long j6, long j7) {
        this.f2779a = str;
        this.f2780b = z6;
        this.f2781c = z7;
        this.f2782d = j6;
        this.f2783e = j7;
    }

    @Override // com.google.android.gms.internal.ads.yh1
    public final long a() {
        return this.f2783e;
    }

    @Override // com.google.android.gms.internal.ads.yh1
    public final long b() {
        return this.f2782d;
    }

    @Override // com.google.android.gms.internal.ads.yh1
    public final String c() {
        return this.f2779a;
    }

    @Override // com.google.android.gms.internal.ads.yh1
    public final boolean d() {
        return this.f2781c;
    }

    @Override // com.google.android.gms.internal.ads.yh1
    public final boolean e() {
        return this.f2780b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof yh1)) {
            return false;
        }
        yh1 yh1Var = (yh1) obj;
        return this.f2779a.equals(yh1Var.c()) && this.f2780b == yh1Var.e() && this.f2781c == yh1Var.d() && this.f2782d == yh1Var.b() && this.f2783e == yh1Var.a();
    }

    public final int hashCode() {
        return ((((((((((((this.f2779a.hashCode() ^ 1000003) * 1000003) ^ (true != this.f2780b ? 1237 : 1231)) * 1000003) ^ (true != this.f2781c ? 1237 : 1231)) * 1000003) ^ 1237) * 1000003) ^ ((int) this.f2782d)) * 1000003) ^ 1237) * 1000003) ^ ((int) this.f2783e);
    }

    public final String toString() {
        return "AdShield2Options{clientVersion=" + this.f2779a + ", shouldGetAdvertisingId=" + this.f2780b + ", isGooglePlayServicesAvailable=" + this.f2781c + ", enableQuerySignalsTimeout=false, querySignalsTimeoutMs=" + this.f2782d + ", enableQuerySignalsCache=false, querySignalsCacheTtlSeconds=" + this.f2783e + "}";
    }
}
