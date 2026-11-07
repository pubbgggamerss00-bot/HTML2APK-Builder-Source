package com.google.android.gms.ads.internal.client;

import com.google.android.gms.ads.AdValue;
import com.google.android.gms.ads.OnPaidEventListener;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class zzfs extends zzdq {
    private final OnPaidEventListener zza;

    public zzfs(OnPaidEventListener onPaidEventListener) {
        this.zza = onPaidEventListener;
    }

    @Override // com.google.android.gms.ads.internal.client.zzdr
    public final void zze(zzu zzuVar) {
        OnPaidEventListener onPaidEventListener = this.zza;
        if (onPaidEventListener != null) {
            onPaidEventListener.onPaidEvent(AdValue.zza(zzuVar.zzb, zzuVar.zzc, zzuVar.zzd));
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zzdr
    public final boolean zzf() {
        return this.zza == null;
    }
}
