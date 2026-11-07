package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zze;
import com.google.android.gms.ads.rewarded.RewardedAdLoadCallback;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class d50 extends x40 {
    public final RewardedAdLoadCallback s;

    /* renamed from: t, reason: collision with root package name */
    public final a50 f3764t;

    public d50(RewardedAdLoadCallback rewardedAdLoadCallback, a50 a50Var) {
        this.s = rewardedAdLoadCallback;
        this.f3764t = a50Var;
    }

    @Override // com.google.android.gms.internal.ads.y40
    public final void zzf(zze zzeVar) {
        RewardedAdLoadCallback rewardedAdLoadCallback = this.s;
        if (rewardedAdLoadCallback != null) {
            rewardedAdLoadCallback.onAdFailedToLoad(zzeVar.zzb());
        }
    }

    @Override // com.google.android.gms.internal.ads.y40
    public final void zzg() {
        RewardedAdLoadCallback rewardedAdLoadCallback = this.s;
        if (rewardedAdLoadCallback != null) {
            rewardedAdLoadCallback.onAdLoaded(this.f3764t);
        }
    }

    @Override // com.google.android.gms.internal.ads.y40
    public final void zze(int i6) {
    }
}
