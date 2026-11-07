package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.LoadAdError;
import com.google.android.gms.ads.interstitial.InterstitialAd;
import com.google.android.gms.ads.interstitial.InterstitialAdLoadCallback;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class zv0 extends InterstitialAdLoadCallback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f11586a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f11587b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ dw0 f11588c;

    public zv0(dw0 dw0Var, String str, String str2) {
        this.f11586a = str;
        this.f11587b = str2;
        this.f11588c = dw0Var;
    }

    @Override // com.google.android.gms.ads.AdLoadCallback
    public final void onAdFailedToLoad(LoadAdError loadAdError) {
        this.f11588c.h2(dw0.g2(loadAdError), this.f11587b);
    }

    @Override // com.google.android.gms.ads.AdLoadCallback
    public final /* bridge */ /* synthetic */ void onAdLoaded(InterstitialAd interstitialAd) {
        this.f11588c.i1(this.f11586a, this.f11587b, interstitialAd);
    }
}
