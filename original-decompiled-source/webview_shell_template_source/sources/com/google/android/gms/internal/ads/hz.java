package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.RequestConfiguration;
import com.google.android.gms.ads.VideoController;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.mediation.MediationBannerAdapter;
import com.google.android.gms.ads.mediation.MediationBannerListener;
import com.google.android.gms.ads.mediation.MediationInterstitialAdapter;
import com.google.android.gms.ads.mediation.MediationInterstitialListener;
import com.google.android.gms.ads.mediation.MediationNativeAdapter;
import com.google.android.gms.ads.mediation.MediationNativeListener;
import com.google.android.gms.ads.mediation.UnifiedNativeAdMapper;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class hz implements MediationBannerListener, MediationInterstitialListener, MediationNativeListener {

    /* renamed from: a, reason: collision with root package name */
    public final my f5516a;

    /* renamed from: b, reason: collision with root package name */
    public UnifiedNativeAdMapper f5517b;

    /* renamed from: c, reason: collision with root package name */
    public ur f5518c;

    public hz(my myVar) {
        this.f5516a = myVar;
    }

    @Override // com.google.android.gms.ads.mediation.MediationBannerListener
    public final void onAdClicked(MediationBannerAdapter mediationBannerAdapter) {
        com.google.android.gms.common.internal.l.d("#008 Must be called on the main UI thread.");
        zzo.zze("Adapter called onAdClicked.");
        try {
            this.f5516a.zze();
        } catch (RemoteException e6) {
            zzo.zzl("#007 Could not call remote method.", e6);
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationBannerListener
    public final void onAdClosed(MediationBannerAdapter mediationBannerAdapter) {
        com.google.android.gms.common.internal.l.d("#008 Must be called on the main UI thread.");
        zzo.zze("Adapter called onAdClosed.");
        try {
            this.f5516a.zzf();
        } catch (RemoteException e6) {
            zzo.zzl("#007 Could not call remote method.", e6);
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationBannerListener
    public final void onAdFailedToLoad(MediationBannerAdapter mediationBannerAdapter, int i6) {
        com.google.android.gms.common.internal.l.d("#008 Must be called on the main UI thread.");
        zzo.zze("Adapter called onAdFailedToLoad with error. " + i6);
        try {
            this.f5516a.a(i6);
        } catch (RemoteException e6) {
            zzo.zzl("#007 Could not call remote method.", e6);
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationNativeListener
    public final void onAdImpression(MediationNativeAdapter mediationNativeAdapter) {
        com.google.android.gms.common.internal.l.d("#008 Must be called on the main UI thread.");
        UnifiedNativeAdMapper unifiedNativeAdMapper = this.f5517b;
        if (this.f5518c == null) {
            if (unifiedNativeAdMapper == null) {
                zzo.zzl("#007 Could not call remote method.", null);
                return;
            } else if (!unifiedNativeAdMapper.getOverrideImpressionRecording()) {
                zzo.zze("Could not call onAdImpression since setOverrideImpressionRecording is not set to true");
                return;
            }
        }
        zzo.zze("Adapter called onAdImpression.");
        try {
            this.f5516a.zzm();
        } catch (RemoteException e6) {
            zzo.zzl("#007 Could not call remote method.", e6);
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationBannerListener
    public final void onAdLeftApplication(MediationBannerAdapter mediationBannerAdapter) {
        com.google.android.gms.common.internal.l.d("#008 Must be called on the main UI thread.");
        zzo.zze("Adapter called onAdLeftApplication.");
        try {
            this.f5516a.zzn();
        } catch (RemoteException e6) {
            zzo.zzl("#007 Could not call remote method.", e6);
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationBannerListener
    public final void onAdLoaded(MediationBannerAdapter mediationBannerAdapter) {
        com.google.android.gms.common.internal.l.d("#008 Must be called on the main UI thread.");
        zzo.zze("Adapter called onAdLoaded.");
        try {
            this.f5516a.zzo();
        } catch (RemoteException e6) {
            zzo.zzl("#007 Could not call remote method.", e6);
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationBannerListener
    public final void onAdOpened(MediationBannerAdapter mediationBannerAdapter) {
        com.google.android.gms.common.internal.l.d("#008 Must be called on the main UI thread.");
        zzo.zze("Adapter called onAdOpened.");
        try {
            this.f5516a.zzp();
        } catch (RemoteException e6) {
            zzo.zzl("#007 Could not call remote method.", e6);
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationNativeListener
    public final void onVideoEnd(MediationNativeAdapter mediationNativeAdapter) {
        com.google.android.gms.common.internal.l.d("#008 Must be called on the main UI thread.");
        zzo.zze("Adapter called onVideoEnd.");
        try {
            this.f5516a.zzv();
        } catch (RemoteException e6) {
            zzo.zzl("#007 Could not call remote method.", e6);
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationBannerListener
    public final void zzb(MediationBannerAdapter mediationBannerAdapter, String str, String str2) {
        com.google.android.gms.common.internal.l.d("#008 Must be called on the main UI thread.");
        zzo.zze("Adapter called onAppEvent.");
        try {
            this.f5516a.s1(str, str2);
        } catch (RemoteException e6) {
            zzo.zzl("#007 Could not call remote method.", e6);
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationNativeListener
    public final void zzd(MediationNativeAdapter mediationNativeAdapter, ur urVar) {
        String strZzi;
        com.google.android.gms.common.internal.l.d("#008 Must be called on the main UI thread.");
        urVar.getClass();
        try {
            strZzi = urVar.f9618a.zzi();
        } catch (RemoteException e6) {
            zzo.zzh(RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, e6);
            strZzi = null;
        }
        zzo.zze("Adapter called onAdLoaded with template id ".concat(String.valueOf(strZzi)));
        this.f5518c = urVar;
        try {
            this.f5516a.zzo();
        } catch (RemoteException e7) {
            zzo.zzl("#007 Could not call remote method.", e7);
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationNativeListener
    public final void zze(MediationNativeAdapter mediationNativeAdapter, ur urVar, String str) {
        try {
            this.f5516a.w1(urVar.f9618a, str);
        } catch (RemoteException e6) {
            zzo.zzl("#007 Could not call remote method.", e6);
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationInterstitialListener
    public final void onAdClicked(MediationInterstitialAdapter mediationInterstitialAdapter) {
        com.google.android.gms.common.internal.l.d("#008 Must be called on the main UI thread.");
        zzo.zze("Adapter called onAdClicked.");
        try {
            this.f5516a.zze();
        } catch (RemoteException e6) {
            zzo.zzl("#007 Could not call remote method.", e6);
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationInterstitialListener
    public final void onAdClosed(MediationInterstitialAdapter mediationInterstitialAdapter) {
        com.google.android.gms.common.internal.l.d("#008 Must be called on the main UI thread.");
        zzo.zze("Adapter called onAdClosed.");
        try {
            this.f5516a.zzf();
        } catch (RemoteException e6) {
            zzo.zzl("#007 Could not call remote method.", e6);
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationBannerListener
    public final void onAdFailedToLoad(MediationBannerAdapter mediationBannerAdapter, AdError adError) {
        com.google.android.gms.common.internal.l.d("#008 Must be called on the main UI thread.");
        zzo.zze("Adapter called onAdFailedToLoad with error. ErrorCode: " + adError.getCode() + ". ErrorMessage: " + adError.getMessage() + ". ErrorDomain: " + adError.getDomain());
        try {
            this.f5516a.T(adError.zza());
        } catch (RemoteException e6) {
            zzo.zzl("#007 Could not call remote method.", e6);
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationInterstitialListener
    public final void onAdLeftApplication(MediationInterstitialAdapter mediationInterstitialAdapter) {
        com.google.android.gms.common.internal.l.d("#008 Must be called on the main UI thread.");
        zzo.zze("Adapter called onAdLeftApplication.");
        try {
            this.f5516a.zzn();
        } catch (RemoteException e6) {
            zzo.zzl("#007 Could not call remote method.", e6);
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationInterstitialListener
    public final void onAdLoaded(MediationInterstitialAdapter mediationInterstitialAdapter) {
        com.google.android.gms.common.internal.l.d("#008 Must be called on the main UI thread.");
        zzo.zze("Adapter called onAdLoaded.");
        try {
            this.f5516a.zzo();
        } catch (RemoteException e6) {
            zzo.zzl("#007 Could not call remote method.", e6);
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationInterstitialListener
    public final void onAdOpened(MediationInterstitialAdapter mediationInterstitialAdapter) {
        com.google.android.gms.common.internal.l.d("#008 Must be called on the main UI thread.");
        zzo.zze("Adapter called onAdOpened.");
        try {
            this.f5516a.zzp();
        } catch (RemoteException e6) {
            zzo.zzl("#007 Could not call remote method.", e6);
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationNativeListener
    public final void onAdClicked(MediationNativeAdapter mediationNativeAdapter) {
        com.google.android.gms.common.internal.l.d("#008 Must be called on the main UI thread.");
        UnifiedNativeAdMapper unifiedNativeAdMapper = this.f5517b;
        if (this.f5518c == null) {
            if (unifiedNativeAdMapper == null) {
                zzo.zzl("#007 Could not call remote method.", null);
                return;
            } else if (!unifiedNativeAdMapper.getOverrideClickHandling()) {
                zzo.zze("Could not call onAdClicked since setOverrideClickHandling is not set to true");
                return;
            }
        }
        zzo.zze("Adapter called onAdClicked.");
        try {
            this.f5516a.zze();
        } catch (RemoteException e6) {
            zzo.zzl("#007 Could not call remote method.", e6);
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationNativeListener
    public final void onAdClosed(MediationNativeAdapter mediationNativeAdapter) {
        com.google.android.gms.common.internal.l.d("#008 Must be called on the main UI thread.");
        zzo.zze("Adapter called onAdClosed.");
        try {
            this.f5516a.zzf();
        } catch (RemoteException e6) {
            zzo.zzl("#007 Could not call remote method.", e6);
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationNativeListener
    public final void onAdLeftApplication(MediationNativeAdapter mediationNativeAdapter) {
        com.google.android.gms.common.internal.l.d("#008 Must be called on the main UI thread.");
        zzo.zze("Adapter called onAdLeftApplication.");
        try {
            this.f5516a.zzn();
        } catch (RemoteException e6) {
            zzo.zzl("#007 Could not call remote method.", e6);
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationNativeListener
    public final void onAdLoaded(MediationNativeAdapter mediationNativeAdapter, UnifiedNativeAdMapper unifiedNativeAdMapper) {
        com.google.android.gms.common.internal.l.d("#008 Must be called on the main UI thread.");
        zzo.zze("Adapter called onAdLoaded.");
        this.f5517b = unifiedNativeAdMapper;
        if (!(mediationNativeAdapter instanceof AdMobAdapter)) {
            VideoController videoController = new VideoController();
            videoController.zzb(new uy());
            if (unifiedNativeAdMapper != null && unifiedNativeAdMapper.hasVideoContent()) {
                unifiedNativeAdMapper.zze(videoController);
            }
        }
        try {
            this.f5516a.zzo();
        } catch (RemoteException e6) {
            zzo.zzl("#007 Could not call remote method.", e6);
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationNativeListener
    public final void onAdOpened(MediationNativeAdapter mediationNativeAdapter) {
        com.google.android.gms.common.internal.l.d("#008 Must be called on the main UI thread.");
        zzo.zze("Adapter called onAdOpened.");
        try {
            this.f5516a.zzp();
        } catch (RemoteException e6) {
            zzo.zzl("#007 Could not call remote method.", e6);
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationInterstitialListener
    public final void onAdFailedToLoad(MediationInterstitialAdapter mediationInterstitialAdapter, int i6) {
        com.google.android.gms.common.internal.l.d("#008 Must be called on the main UI thread.");
        zzo.zze("Adapter called onAdFailedToLoad with error " + i6 + ".");
        try {
            this.f5516a.a(i6);
        } catch (RemoteException e6) {
            zzo.zzl("#007 Could not call remote method.", e6);
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationInterstitialListener
    public final void onAdFailedToLoad(MediationInterstitialAdapter mediationInterstitialAdapter, AdError adError) {
        com.google.android.gms.common.internal.l.d("#008 Must be called on the main UI thread.");
        zzo.zze("Adapter called onAdFailedToLoad with error. ErrorCode: " + adError.getCode() + ". ErrorMessage: " + adError.getMessage() + ". ErrorDomain: " + adError.getDomain());
        try {
            this.f5516a.T(adError.zza());
        } catch (RemoteException e6) {
            zzo.zzl("#007 Could not call remote method.", e6);
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationNativeListener
    public final void onAdFailedToLoad(MediationNativeAdapter mediationNativeAdapter, int i6) {
        com.google.android.gms.common.internal.l.d("#008 Must be called on the main UI thread.");
        zzo.zze("Adapter called onAdFailedToLoad with error " + i6 + ".");
        try {
            this.f5516a.a(i6);
        } catch (RemoteException e6) {
            zzo.zzl("#007 Could not call remote method.", e6);
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationNativeListener
    public final void onAdFailedToLoad(MediationNativeAdapter mediationNativeAdapter, AdError adError) {
        com.google.android.gms.common.internal.l.d("#008 Must be called on the main UI thread.");
        zzo.zze("Adapter called onAdFailedToLoad with error. ErrorCode: " + adError.getCode() + ". ErrorMessage: " + adError.getMessage() + ". ErrorDomain: " + adError.getDomain());
        try {
            this.f5516a.T(adError.zza());
        } catch (RemoteException e6) {
            zzo.zzl("#007 Could not call remote method.", e6);
        }
    }
}
