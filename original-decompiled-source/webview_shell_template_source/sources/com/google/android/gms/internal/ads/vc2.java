package com.google.android.gms.internal.ads;

import android.os.SystemClock;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class vc2 implements ub2 {
    public boolean s;

    /* renamed from: t, reason: collision with root package name */
    public long f9809t;

    /* renamed from: u, reason: collision with root package name */
    public long f9810u;

    /* renamed from: v, reason: collision with root package name */
    public ip f9811v;

    @Override // com.google.android.gms.internal.ads.ub2
    public final void a(ip ipVar) {
        if (this.s) {
            b(zza());
        }
        this.f9811v = ipVar;
    }

    public final void b(long j6) {
        this.f9809t = j6;
        if (this.s) {
            this.f9810u = SystemClock.elapsedRealtime();
        }
    }

    @Override // com.google.android.gms.internal.ads.ub2
    public final long zza() {
        long j6 = this.f9809t;
        if (!this.s) {
            return j6;
        }
        long jElapsedRealtime = SystemClock.elapsedRealtime() - this.f9810u;
        return (this.f9811v.f5818a == 1.0f ? j31.s(jElapsedRealtime) : jElapsedRealtime * r4.f5820c) + j6;
    }

    @Override // com.google.android.gms.internal.ads.ub2
    public final ip zzc() {
        return this.f9811v;
    }

    @Override // com.google.android.gms.internal.ads.ub2
    public final /* synthetic */ boolean zzj() {
        return false;
    }
}
