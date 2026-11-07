package com.google.ads.mediation;

import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.LoadAdError;
import com.google.android.gms.ads.formats.UnifiedNativeAd;
import com.google.android.gms.ads.formats.zzf;
import com.google.android.gms.ads.formats.zzg;
import com.google.android.gms.ads.formats.zzi;
import com.google.android.gms.ads.mediation.MediationNativeListener;
import com.google.android.gms.internal.ads.ur;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class e extends AdListener implements zzi, zzg, zzf {
    public final AbstractAdViewAdapter s;

    /* renamed from: t, reason: collision with root package name */
    public final MediationNativeListener f2259t;

    public e(AbstractAdViewAdapter abstractAdViewAdapter, MediationNativeListener mediationNativeListener) {
        this.s = abstractAdViewAdapter;
        this.f2259t = mediationNativeListener;
    }

    @Override // com.google.android.gms.ads.AdListener, com.google.android.gms.ads.internal.client.zza
    public final void onAdClicked() {
        this.f2259t.onAdClicked(this.s);
    }

    @Override // com.google.android.gms.ads.AdListener
    public final void onAdClosed() {
        this.f2259t.onAdClosed(this.s);
    }

    @Override // com.google.android.gms.ads.AdListener
    public final void onAdFailedToLoad(LoadAdError loadAdError) {
        this.f2259t.onAdFailedToLoad(this.s, loadAdError);
    }

    @Override // com.google.android.gms.ads.AdListener
    public final void onAdImpression() {
        this.f2259t.onAdImpression(this.s);
    }

    @Override // com.google.android.gms.ads.AdListener
    public final void onAdOpened() {
        this.f2259t.onAdOpened(this.s);
    }

    @Override // com.google.android.gms.ads.formats.zzi
    public final void zza(UnifiedNativeAd unifiedNativeAd) {
        a aVar = new a();
        aVar.setHeadline(unifiedNativeAd.zzh());
        aVar.setImages(unifiedNativeAd.zzk());
        aVar.setBody(unifiedNativeAd.zzf());
        aVar.setIcon(unifiedNativeAd.zzb());
        aVar.setCallToAction(unifiedNativeAd.zzg());
        aVar.setAdvertiser(unifiedNativeAd.zze());
        aVar.setStarRating(unifiedNativeAd.zzc());
        aVar.setStore(unifiedNativeAd.zzj());
        aVar.setPrice(unifiedNativeAd.zzi());
        aVar.zzd(unifiedNativeAd.zzd());
        aVar.setOverrideImpressionRecording(true);
        aVar.setOverrideClickHandling(true);
        aVar.zze(unifiedNativeAd.zza());
        this.f2259t.onAdLoaded(this.s, aVar);
    }

    @Override // com.google.android.gms.ads.formats.zzf
    public final void zzb(ur urVar, String str) {
        this.f2259t.zze(this.s, urVar, str);
    }

    @Override // com.google.android.gms.ads.formats.zzg
    public final void zzc(ur urVar) {
        this.f2259t.zzd(this.s, urVar);
    }

    @Override // com.google.android.gms.ads.AdListener
    public final void onAdLoaded() {
    }
}
