package com.google.android.gms.ads.internal.util.client;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class e extends zzx {

    /* renamed from: a, reason: collision with root package name */
    public final int f2351a;

    /* renamed from: b, reason: collision with root package name */
    public final int f2352b;

    /* renamed from: c, reason: collision with root package name */
    public final double f2353c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f2354d;

    public e(int i6, int i7, double d7, boolean z6) {
        this.f2351a = i6;
        this.f2352b = i7;
        this.f2353c = d7;
        this.f2354d = z6;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof zzx) {
            zzx zzxVar = (zzx) obj;
            if (this.f2351a == zzxVar.zzc() && this.f2352b == zzxVar.zzb() && Double.doubleToLongBits(this.f2353c) == Double.doubleToLongBits(zzxVar.zza()) && this.f2354d == zzxVar.zzd()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        double d7 = this.f2353c;
        return ((((int) (Double.doubleToLongBits(d7) ^ (Double.doubleToLongBits(d7) >>> 32))) ^ ((((this.f2351a ^ 1000003) * 1000003) ^ this.f2352b) * 1000003)) * 1000003) ^ (true != this.f2354d ? 1237 : 1231);
    }

    public final String toString() {
        return "PingStrategy{maxAttempts=" + this.f2351a + ", initialBackoffMs=" + this.f2352b + ", backoffMultiplier=" + this.f2353c + ", bufferAfterMaxAttempts=" + this.f2354d + "}";
    }

    @Override // com.google.android.gms.ads.internal.util.client.zzx
    public final double zza() {
        return this.f2353c;
    }

    @Override // com.google.android.gms.ads.internal.util.client.zzx
    public final int zzb() {
        return this.f2352b;
    }

    @Override // com.google.android.gms.ads.internal.util.client.zzx
    public final int zzc() {
        return this.f2351a;
    }

    @Override // com.google.android.gms.ads.internal.util.client.zzx
    public final boolean zzd() {
        return this.f2354d;
    }
}
