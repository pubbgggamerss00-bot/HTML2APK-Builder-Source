package com.google.android.gms.ads.internal.client;

import com.google.android.gms.ads.AdListener;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class zzg extends zzbk {
    private final AdListener zza;

    public zzg(AdListener adListener) {
        this.zza = adListener;
    }

    public final AdListener zzb() {
        return this.zza;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbl
    public final void zzc() {
        AdListener adListener = this.zza;
        if (adListener != null) {
            adListener.onAdClicked();
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zzbl
    public final void zzd() {
        AdListener adListener = this.zza;
        if (adListener != null) {
            adListener.onAdClosed();
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zzbl
    public final void zzf(zze zzeVar) {
        AdListener adListener = this.zza;
        if (adListener != null) {
            adListener.onAdFailedToLoad(zzeVar.zzb());
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zzbl
    public final void zzg() {
        AdListener adListener = this.zza;
        if (adListener != null) {
            adListener.onAdImpression();
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zzbl
    public final void zzi() {
        AdListener adListener = this.zza;
        if (adListener != null) {
            adListener.onAdLoaded();
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zzbl
    public final void zzj() {
        AdListener adListener = this.zza;
        if (adListener != null) {
            adListener.onAdOpened();
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zzbl
    public final void zzk() {
        AdListener adListener = this.zza;
        if (adListener != null) {
            adListener.onAdSwipeGestureClicked();
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zzbl
    public final void zzh() {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbl
    public final void zze(int i6) {
    }
}
