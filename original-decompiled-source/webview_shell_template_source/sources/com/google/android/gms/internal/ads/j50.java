package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zze;
import com.google.android.gms.ads.rewardedinterstitial.RewardedInterstitialAdLoadCallback;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class j50 extends x40 {
    public final RewardedInterstitialAdLoadCallback s;

    /* renamed from: t, reason: collision with root package name */
    public final k50 f5950t;

    public j50(RewardedInterstitialAdLoadCallback rewardedInterstitialAdLoadCallback, k50 k50Var) {
        this.s = rewardedInterstitialAdLoadCallback;
        this.f5950t = k50Var;
    }

    @Override // com.google.android.gms.internal.ads.y40
    public final void zzf(zze zzeVar) {
        RewardedInterstitialAdLoadCallback rewardedInterstitialAdLoadCallback = this.s;
        if (rewardedInterstitialAdLoadCallback != null) {
            rewardedInterstitialAdLoadCallback.onAdFailedToLoad(zzeVar.zzb());
        }
    }

    @Override // com.google.android.gms.internal.ads.y40
    public final void zzg() {
        k50 k50Var;
        RewardedInterstitialAdLoadCallback rewardedInterstitialAdLoadCallback = this.s;
        if (rewardedInterstitialAdLoadCallback == null || (k50Var = this.f5950t) == null) {
            return;
        }
        rewardedInterstitialAdLoadCallback.onAdLoaded(k50Var);
    }

    @Override // com.google.android.gms.internal.ads.y40
    public final void zze(int i6) {
    }
}
