package com.google.android.gms.ads.internal.util.client;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class d extends zzw {

    /* renamed from: a, reason: collision with root package name */
    public final int f2348a;

    /* renamed from: b, reason: collision with root package name */
    public final int f2349b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f2350c;

    public d(int i6, int i7, boolean z6) {
        this.f2348a = i6;
        this.f2349b = i7;
        this.f2350c = z6;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof zzw) {
            zzw zzwVar = (zzw) obj;
            if (this.f2348a == zzwVar.zzb() && this.f2349b == zzwVar.zza() && this.f2350c == zzwVar.zzc()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (true != this.f2350c ? 1237 : 1231) ^ ((((this.f2348a ^ 1000003) * 1000003) ^ this.f2349b) * 1000003);
    }

    public final String toString() {
        return "OfflineAdConfig{impressionPrerequisite=" + this.f2348a + ", clickPrerequisite=" + this.f2349b + ", notificationFlowEnabled=" + this.f2350c + "}";
    }

    @Override // com.google.android.gms.ads.internal.util.client.zzw
    public final int zza() {
        return this.f2349b;
    }

    @Override // com.google.android.gms.ads.internal.util.client.zzw
    public final int zzb() {
        return this.f2348a;
    }

    @Override // com.google.android.gms.ads.internal.util.client.zzw
    public final boolean zzc() {
        return this.f2350c;
    }
}
