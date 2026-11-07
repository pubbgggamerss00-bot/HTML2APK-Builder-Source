package com.google.android.gms.ads.internal.client;

import com.google.android.gms.ads.AdLoadCallback;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class zzh extends zzbn {
    private final AdLoadCallback zza;
    private final Object zzb;

    public zzh(AdLoadCallback adLoadCallback, Object obj) {
        this.zza = adLoadCallback;
        this.zzb = obj;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbo
    public final void zzb(zze zzeVar) {
        AdLoadCallback adLoadCallback = this.zza;
        if (adLoadCallback != null) {
            adLoadCallback.onAdFailedToLoad(zzeVar.zzb());
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zzbo
    public final void zzc() {
        Object obj;
        AdLoadCallback adLoadCallback = this.zza;
        if (adLoadCallback == null || (obj = this.zzb) == null) {
            return;
        }
        adLoadCallback.onAdLoaded(obj);
    }
}
