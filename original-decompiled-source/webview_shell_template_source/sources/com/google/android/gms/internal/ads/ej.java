package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.FullScreenContentCallback;
import com.google.android.gms.ads.internal.client.zze;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class ej extends nj {
    public FullScreenContentCallback s;

    @Override // com.google.android.gms.internal.ads.oj
    public final void zzb() {
        FullScreenContentCallback fullScreenContentCallback = this.s;
        if (fullScreenContentCallback != null) {
            fullScreenContentCallback.onAdClicked();
        }
    }

    @Override // com.google.android.gms.internal.ads.oj
    public final void zzc() {
        FullScreenContentCallback fullScreenContentCallback = this.s;
        if (fullScreenContentCallback != null) {
            fullScreenContentCallback.onAdDismissedFullScreenContent();
        }
    }

    @Override // com.google.android.gms.internal.ads.oj
    public final void zzd(zze zzeVar) {
        FullScreenContentCallback fullScreenContentCallback = this.s;
        if (fullScreenContentCallback != null) {
            fullScreenContentCallback.onAdFailedToShowFullScreenContent(zzeVar.zza());
        }
    }

    @Override // com.google.android.gms.internal.ads.oj
    public final void zze() {
        FullScreenContentCallback fullScreenContentCallback = this.s;
        if (fullScreenContentCallback != null) {
            fullScreenContentCallback.onAdImpression();
        }
    }

    @Override // com.google.android.gms.internal.ads.oj
    public final void zzf() {
        FullScreenContentCallback fullScreenContentCallback = this.s;
        if (fullScreenContentCallback != null) {
            fullScreenContentCallback.onAdShowedFullScreenContent();
        }
    }
}
