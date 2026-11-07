package com.google.ads.mediation;

import com.google.android.gms.ads.FullScreenContentCallback;
import com.google.android.gms.ads.mediation.MediationInterstitialListener;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class d extends FullScreenContentCallback {

    /* renamed from: a, reason: collision with root package name */
    public final AbstractAdViewAdapter f2257a;

    /* renamed from: b, reason: collision with root package name */
    public final MediationInterstitialListener f2258b;

    public d(AbstractAdViewAdapter abstractAdViewAdapter, MediationInterstitialListener mediationInterstitialListener) {
        this.f2257a = abstractAdViewAdapter;
        this.f2258b = mediationInterstitialListener;
    }

    @Override // com.google.android.gms.ads.FullScreenContentCallback
    public final void onAdDismissedFullScreenContent() {
        this.f2258b.onAdClosed(this.f2257a);
    }

    @Override // com.google.android.gms.ads.FullScreenContentCallback
    public final void onAdShowedFullScreenContent() {
        this.f2258b.onAdOpened(this.f2257a);
    }
}
