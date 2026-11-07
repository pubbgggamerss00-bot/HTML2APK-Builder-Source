package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.LoadAdError;
import com.google.android.gms.ads.rewardedinterstitial.RewardedInterstitialAd;
import com.google.android.gms.ads.rewardedinterstitial.RewardedInterstitialAdLoadCallback;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class bw0 extends RewardedInterstitialAdLoadCallback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f3311a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f3312b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ dw0 f3313c;

    public bw0(dw0 dw0Var, String str, String str2) {
        this.f3311a = str;
        this.f3312b = str2;
        this.f3313c = dw0Var;
    }

    @Override // com.google.android.gms.ads.AdLoadCallback
    public final void onAdFailedToLoad(LoadAdError loadAdError) {
        this.f3313c.h2(dw0.g2(loadAdError), this.f3312b);
    }

    @Override // com.google.android.gms.ads.AdLoadCallback
    public final /* bridge */ /* synthetic */ void onAdLoaded(RewardedInterstitialAd rewardedInterstitialAd) {
        this.f3313c.i1(this.f3311a, this.f3312b, rewardedInterstitialAd);
    }
}
