package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zzbn;
import com.google.android.gms.ads.internal.client.zzby;
import com.google.android.gms.ads.internal.client.zze;
import com.google.android.gms.ads.internal.util.client.zzo;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class hf1 extends zzbn {
    public final /* synthetic */ ps1 s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ zzby f5376t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ if1 f5377u;

    public hf1(if1 if1Var, ps1 ps1Var, zzby zzbyVar) {
        this.s = ps1Var;
        this.f5376t = zzbyVar;
        this.f5377u = if1Var;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbo
    public final void zzb(zze zzeVar) {
        String string = zzeVar.zzb().toString();
        if1 if1Var = this.f5377u;
        zzo.zzj("Failed to load interstitial ad with error: " + string + " for ad unit: " + if1Var.f10961e.zza);
        yf1.g(if1Var, zzeVar);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbo
    public final void zzc() {
        this.s.e(this.f5376t);
    }
}
