package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.LoadAdError;
import com.google.android.gms.ads.rewarded.RewardedAd;
import com.google.android.gms.ads.rewarded.RewardedAdLoadCallback;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class aw0 extends RewardedAdLoadCallback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f2861a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f2862b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ dw0 f2863c;

    public aw0(dw0 dw0Var, String str, String str2) {
        this.f2861a = str;
        this.f2862b = str2;
        this.f2863c = dw0Var;
    }

    @Override // com.google.android.gms.ads.AdLoadCallback
    public final void onAdFailedToLoad(LoadAdError loadAdError) {
        this.f2863c.h2(dw0.g2(loadAdError), this.f2862b);
    }

    @Override // com.google.android.gms.ads.AdLoadCallback
    public final /* bridge */ /* synthetic */ void onAdLoaded(RewardedAd rewardedAd) {
        this.f2863c.i1(this.f2861a, this.f2862b, rewardedAd);
    }
}
