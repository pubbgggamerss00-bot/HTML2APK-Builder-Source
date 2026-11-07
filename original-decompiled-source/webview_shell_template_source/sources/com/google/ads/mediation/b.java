package com.google.ads.mediation;

import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.LoadAdError;
import com.google.android.gms.ads.admanager.AppEventListener;
import com.google.android.gms.ads.internal.client.zza;
import com.google.android.gms.ads.mediation.MediationBannerListener;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class b extends AdListener implements AppEventListener, zza {
    public final AbstractAdViewAdapter s;

    /* renamed from: t, reason: collision with root package name */
    public final MediationBannerListener f2254t;

    public b(AbstractAdViewAdapter abstractAdViewAdapter, MediationBannerListener mediationBannerListener) {
        this.s = abstractAdViewAdapter;
        this.f2254t = mediationBannerListener;
    }

    @Override // com.google.android.gms.ads.AdListener, com.google.android.gms.ads.internal.client.zza
    public final void onAdClicked() {
        this.f2254t.onAdClicked(this.s);
    }

    @Override // com.google.android.gms.ads.AdListener
    public final void onAdClosed() {
        this.f2254t.onAdClosed(this.s);
    }

    @Override // com.google.android.gms.ads.AdListener
    public final void onAdFailedToLoad(LoadAdError loadAdError) {
        this.f2254t.onAdFailedToLoad(this.s, loadAdError);
    }

    @Override // com.google.android.gms.ads.AdListener
    public final void onAdLoaded() {
        this.f2254t.onAdLoaded(this.s);
    }

    @Override // com.google.android.gms.ads.AdListener
    public final void onAdOpened() {
        this.f2254t.onAdOpened(this.s);
    }

    @Override // com.google.android.gms.ads.admanager.AppEventListener
    public final void onAppEvent(String str, String str2) {
        this.f2254t.zzb(this.s, str, str2);
    }
}
