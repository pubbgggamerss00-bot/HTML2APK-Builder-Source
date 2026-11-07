package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.FullScreenContentCallback;
import com.google.android.gms.ads.OnUserEarnedRewardListener;
import com.google.android.gms.ads.internal.client.zze;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class i50 extends t40 {
    public FullScreenContentCallback s;

    /* renamed from: t, reason: collision with root package name */
    public OnUserEarnedRewardListener f5562t;

    @Override // com.google.android.gms.internal.ads.u40
    public final void D1(zze zzeVar) {
        FullScreenContentCallback fullScreenContentCallback = this.s;
        if (fullScreenContentCallback != null) {
            fullScreenContentCallback.onAdFailedToShowFullScreenContent(zzeVar.zza());
        }
    }

    @Override // com.google.android.gms.internal.ads.u40
    public final void e0(o40 o40Var) {
        OnUserEarnedRewardListener onUserEarnedRewardListener = this.f5562t;
        if (onUserEarnedRewardListener != null) {
            onUserEarnedRewardListener.onUserEarnedReward(new dh0(9, o40Var));
        }
    }

    @Override // com.google.android.gms.internal.ads.u40
    public final void zze() {
        FullScreenContentCallback fullScreenContentCallback = this.s;
        if (fullScreenContentCallback != null) {
            fullScreenContentCallback.onAdClicked();
        }
    }

    @Override // com.google.android.gms.internal.ads.u40
    public final void zzf() {
        FullScreenContentCallback fullScreenContentCallback = this.s;
        if (fullScreenContentCallback != null) {
            fullScreenContentCallback.onAdImpression();
        }
    }

    @Override // com.google.android.gms.internal.ads.u40
    public final void zzg() {
        FullScreenContentCallback fullScreenContentCallback = this.s;
        if (fullScreenContentCallback != null) {
            fullScreenContentCallback.onAdDismissedFullScreenContent();
        }
    }

    @Override // com.google.android.gms.internal.ads.u40
    public final void zzj() {
        FullScreenContentCallback fullScreenContentCallback = this.s;
        if (fullScreenContentCallback != null) {
            fullScreenContentCallback.onAdShowedFullScreenContent();
        }
    }

    @Override // com.google.android.gms.internal.ads.u40
    public final void i(int i6) {
    }
}
