package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.mediation.MediationAppOpenAdCallback;
import com.google.android.gms.ads.mediation.MediationBannerAdCallback;
import com.google.android.gms.ads.mediation.MediationInterstitialAdCallback;
import com.google.android.gms.ads.mediation.MediationNativeAdCallback;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class vy implements MediationBannerAdCallback, MediationInterstitialAdCallback, MediationNativeAdCallback, MediationAppOpenAdCallback {

    /* renamed from: a, reason: collision with root package name */
    public final my f9961a;

    public vy(my myVar) {
        this.f9961a = myVar;
    }

    @Override // com.google.android.gms.ads.mediation.MediationAdCallback
    public final void onAdClosed() {
        com.google.android.gms.common.internal.l.d("#008 Must be called on the main UI thread.");
        zzo.zze("Adapter called onAdClosed.");
        try {
            this.f9961a.zzf();
        } catch (RemoteException e6) {
            zzo.zzl("#007 Could not call remote method.", e6);
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationInterstitialAdCallback, com.google.android.gms.ads.mediation.MediationRewardedAdCallback
    public final void onAdFailedToShow(AdError adError) {
        com.google.android.gms.common.internal.l.d("#008 Must be called on the main UI thread.");
        zzo.zze("Adapter called onAdFailedToShow.");
        zzo.zzj("Mediation ad failed to show: Error Code = " + adError.getCode() + ". Error Message = " + adError.getMessage() + " Error Domain = " + adError.getDomain());
        try {
            this.f9961a.M0(adError.zza());
        } catch (RemoteException e6) {
            zzo.zzl("#007 Could not call remote method.", e6);
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationBannerAdCallback, com.google.android.gms.ads.mediation.MediationInterstitialAdCallback, com.google.android.gms.ads.mediation.MediationNativeAdCallback
    public final void onAdLeftApplication() {
        com.google.android.gms.common.internal.l.d("#008 Must be called on the main UI thread.");
        zzo.zze("Adapter called onAdLeftApplication.");
        try {
            this.f9961a.zzn();
        } catch (RemoteException e6) {
            zzo.zzl("#007 Could not call remote method.", e6);
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationAdCallback
    public final void onAdOpened() {
        com.google.android.gms.common.internal.l.d("#008 Must be called on the main UI thread.");
        zzo.zze("Adapter called onAdOpened.");
        try {
            this.f9961a.zzp();
        } catch (RemoteException e6) {
            zzo.zzl("#007 Could not call remote method.", e6);
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationNativeAdCallback
    public final void onVideoComplete() {
        com.google.android.gms.common.internal.l.d("#008 Must be called on the main UI thread.");
        zzo.zze("Adapter called onVideoComplete.");
        try {
            this.f9961a.zzu();
        } catch (RemoteException e6) {
            zzo.zzl("#007 Could not call remote method.", e6);
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationNativeAdCallback
    public final void onVideoPause() {
        com.google.android.gms.common.internal.l.d("#008 Must be called on the main UI thread.");
        zzo.zze("Adapter called onVideoPause.");
        try {
            this.f9961a.c();
        } catch (RemoteException e6) {
            zzo.zzl("#007 Could not call remote method.", e6);
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationNativeAdCallback
    public final void onVideoPlay() {
        com.google.android.gms.common.internal.l.d("#008 Must be called on the main UI thread.");
        zzo.zze("Adapter called onVideoPlay.");
        try {
            this.f9961a.zzx();
        } catch (RemoteException e6) {
            zzo.zzl("#007 Could not call remote method.", e6);
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationAdCallback
    public final void reportAdClicked() {
        com.google.android.gms.common.internal.l.d("#008 Must be called on the main UI thread.");
        zzo.zze("Adapter called reportAdClicked.");
        try {
            this.f9961a.zze();
        } catch (RemoteException e6) {
            zzo.zzl("#007 Could not call remote method.", e6);
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationAdCallback
    public final void reportAdImpression() {
        com.google.android.gms.common.internal.l.d("#008 Must be called on the main UI thread.");
        zzo.zze("Adapter called reportAdImpression.");
        try {
            this.f9961a.zzm();
        } catch (RemoteException e6) {
            zzo.zzl("#007 Could not call remote method.", e6);
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationInterstitialAdCallback, com.google.android.gms.ads.mediation.MediationRewardedAdCallback
    public final void onAdFailedToShow(String str) {
        com.google.android.gms.common.internal.l.d("#008 Must be called on the main UI thread.");
        zzo.zze("Adapter called onAdFailedToShow.");
        zzo.zzj("Mediation ad failed to show: ".concat(String.valueOf(str)));
        try {
            this.f9961a.zzl(str);
        } catch (RemoteException e6) {
            zzo.zzl("#007 Could not call remote method.", e6);
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationNativeAdCallback
    public final void onVideoMute() {
    }

    @Override // com.google.android.gms.ads.mediation.MediationNativeAdCallback
    public final void onVideoUnmute() {
    }
}
