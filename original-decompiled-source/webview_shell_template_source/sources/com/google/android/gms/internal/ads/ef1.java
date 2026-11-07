package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zze;
import com.google.android.gms.ads.internal.client.zzft;
import com.google.android.gms.ads.internal.util.client.zzo;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class ef1 extends jj {
    public final /* synthetic */ ps1 s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ zzft f4269t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ ff1 f4270u;

    public ef1(ff1 ff1Var, ps1 ps1Var, zzft zzftVar) {
        this.s = ps1Var;
        this.f4269t = zzftVar;
        this.f4270u = ff1Var;
    }

    @Override // com.google.android.gms.internal.ads.kj
    public final void p1(zze zzeVar) {
        zzo.zzj("Failed to load app open ad with error parcel: " + zzeVar.zzb().toString() + " for ad unit: " + this.f4269t.zza);
        yf1.g(this.f4270u, zzeVar);
    }

    @Override // com.google.android.gms.internal.ads.kj
    public final void z(hj hjVar) {
        this.s.e(hjVar);
    }

    @Override // com.google.android.gms.internal.ads.kj
    public final void zzb(int i6) {
    }
}
