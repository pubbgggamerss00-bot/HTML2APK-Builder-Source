package com.google.android.gms.ads.internal.client;

import com.google.android.gms.ads.LoadAdError;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class q extends zzbd {
    public final /* synthetic */ zzel s;

    public q(zzel zzelVar) {
        this.s = zzelVar;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbd, com.google.android.gms.ads.AdListener
    public final void onAdFailedToLoad(LoadAdError loadAdError) {
        zzel zzelVar = this.s;
        zzelVar.zze.zzb(zzelVar.zzi());
        super.onAdFailedToLoad(loadAdError);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbd, com.google.android.gms.ads.AdListener
    public final void onAdLoaded() {
        zzel zzelVar = this.s;
        zzelVar.zze.zzb(zzelVar.zzi());
        super.onAdLoaded();
    }
}
