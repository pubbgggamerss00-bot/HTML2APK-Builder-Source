package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.ads.AdLoadCallback;
import com.google.android.gms.ads.FullScreenContentCallback;
import com.google.android.gms.ads.LoadAdError;
import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.ads.OnPaidEventListener;
import com.google.android.gms.ads.ResponseInfo;
import com.google.android.gms.ads.admanager.AdManagerInterstitialAd;
import com.google.android.gms.ads.admanager.AppEventListener;
import com.google.android.gms.ads.internal.client.zzbc;
import com.google.android.gms.ads.internal.client.zzbf;
import com.google.android.gms.ads.internal.client.zzby;
import com.google.android.gms.ads.internal.client.zzdy;
import com.google.android.gms.ads.internal.client.zzei;
import com.google.android.gms.ads.internal.client.zzfs;
import com.google.android.gms.ads.internal.client.zzh;
import com.google.android.gms.ads.internal.client.zzr;
import com.google.android.gms.ads.internal.client.zzs;
import com.google.android.gms.ads.internal.util.client.zzo;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class kw extends AdManagerInterstitialAd {

    /* renamed from: a, reason: collision with root package name */
    public final Context f6505a;

    /* renamed from: b, reason: collision with root package name */
    public final zzr f6506b;

    /* renamed from: c, reason: collision with root package name */
    public final zzby f6507c;

    /* renamed from: d, reason: collision with root package name */
    public final String f6508d;

    /* renamed from: e, reason: collision with root package name */
    public final long f6509e;

    /* renamed from: f, reason: collision with root package name */
    public AppEventListener f6510f;

    /* renamed from: g, reason: collision with root package name */
    public FullScreenContentCallback f6511g;
    public OnPaidEventListener h;

    public kw(Context context, String str) {
        dy dyVar = new dy();
        this.f6509e = System.currentTimeMillis();
        this.f6505a = context;
        this.f6508d = str;
        this.f6506b = zzr.zza;
        this.f6507c = zzbc.zza().zzf(context, new zzs(), str, dyVar);
    }

    public final void a(zzei zzeiVar, AdLoadCallback adLoadCallback) {
        zzby zzbyVar = this.f6507c;
        if (zzbyVar != null) {
            try {
                zzeiVar.zzq(this.f6509e);
                zzbyVar.zzy(this.f6506b.zza(this.f6505a, zzeiVar), new zzh(adLoadCallback, this));
            } catch (RemoteException e6) {
                zzo.zzl("#007 Could not call remote method.", e6);
                adLoadCallback.onAdFailedToLoad(new LoadAdError(0, "Internal Error.", MobileAds.ERROR_DOMAIN, null, null));
            }
        }
    }

    @Override // com.google.android.gms.ads.interstitial.InterstitialAd
    public final String getAdUnitId() {
        return this.f6508d;
    }

    @Override // com.google.android.gms.ads.admanager.AdManagerInterstitialAd
    public final AppEventListener getAppEventListener() {
        return this.f6510f;
    }

    @Override // com.google.android.gms.ads.interstitial.InterstitialAd
    public final FullScreenContentCallback getFullScreenContentCallback() {
        return this.f6511g;
    }

    @Override // com.google.android.gms.ads.interstitial.InterstitialAd
    public final OnPaidEventListener getOnPaidEventListener() {
        return this.h;
    }

    @Override // com.google.android.gms.ads.interstitial.InterstitialAd
    public final ResponseInfo getResponseInfo() {
        zzdy zzdyVarZzk = null;
        try {
            zzby zzbyVar = this.f6507c;
            if (zzbyVar != null) {
                zzdyVarZzk = zzbyVar.zzk();
            }
        } catch (RemoteException e6) {
            zzo.zzl("#007 Could not call remote method.", e6);
        }
        return ResponseInfo.zzb(zzdyVarZzk);
    }

    @Override // com.google.android.gms.ads.admanager.AdManagerInterstitialAd
    public final void setAppEventListener(AppEventListener appEventListener) {
        try {
            this.f6510f = appEventListener;
            zzby zzbyVar = this.f6507c;
            if (zzbyVar != null) {
                zzbyVar.zzG(appEventListener != null ? new gi(appEventListener) : null);
            }
        } catch (RemoteException e6) {
            zzo.zzl("#007 Could not call remote method.", e6);
        }
    }

    @Override // com.google.android.gms.ads.interstitial.InterstitialAd
    public final void setFullScreenContentCallback(FullScreenContentCallback fullScreenContentCallback) {
        try {
            this.f6511g = fullScreenContentCallback;
            zzby zzbyVar = this.f6507c;
            if (zzbyVar != null) {
                zzbyVar.zzJ(new zzbf(fullScreenContentCallback));
            }
        } catch (RemoteException e6) {
            zzo.zzl("#007 Could not call remote method.", e6);
        }
    }

    @Override // com.google.android.gms.ads.interstitial.InterstitialAd
    public final void setImmersiveMode(boolean z6) {
        try {
            zzby zzbyVar = this.f6507c;
            if (zzbyVar != null) {
                zzbyVar.zzL(z6);
            }
        } catch (RemoteException e6) {
            zzo.zzl("#007 Could not call remote method.", e6);
        }
    }

    @Override // com.google.android.gms.ads.interstitial.InterstitialAd
    public final void setOnPaidEventListener(OnPaidEventListener onPaidEventListener) {
        try {
            this.h = onPaidEventListener;
            zzby zzbyVar = this.f6507c;
            if (zzbyVar != null) {
                zzbyVar.zzP(new zzfs(onPaidEventListener));
            }
        } catch (RemoteException e6) {
            zzo.zzl("#007 Could not call remote method.", e6);
        }
    }

    @Override // com.google.android.gms.ads.interstitial.InterstitialAd
    public final void show(Activity activity) {
        if (activity == null) {
            zzo.zzj("The activity for show is null, will proceed with show using the context provided when loading the ad.");
        }
        try {
            zzby zzbyVar = this.f6507c;
            if (zzbyVar != null) {
                zzbyVar.zzW(new k3.b(activity));
            }
        } catch (RemoteException e6) {
            zzo.zzl("#007 Could not call remote method.", e6);
        }
    }

    public kw(Context context, String str, zzby zzbyVar) {
        new dy();
        this.f6509e = System.currentTimeMillis();
        this.f6505a = context;
        this.f6508d = str;
        this.f6506b = zzr.zza;
        this.f6507c = zzbyVar;
    }
}
