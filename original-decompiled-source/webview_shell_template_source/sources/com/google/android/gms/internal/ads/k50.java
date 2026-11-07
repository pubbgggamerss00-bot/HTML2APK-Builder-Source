package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.ads.FullScreenContentCallback;
import com.google.android.gms.ads.OnPaidEventListener;
import com.google.android.gms.ads.OnUserEarnedRewardListener;
import com.google.android.gms.ads.ResponseInfo;
import com.google.android.gms.ads.internal.client.zzbc;
import com.google.android.gms.ads.internal.client.zzdy;
import com.google.android.gms.ads.internal.client.zzei;
import com.google.android.gms.ads.internal.client.zzfr;
import com.google.android.gms.ads.internal.client.zzfs;
import com.google.android.gms.ads.internal.client.zzr;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.rewarded.OnAdMetadataChangedListener;
import com.google.android.gms.ads.rewarded.RewardItem;
import com.google.android.gms.ads.rewarded.ServerSideVerificationOptions;
import com.google.android.gms.ads.rewardedinterstitial.RewardedInterstitialAd;
import com.google.android.gms.ads.rewardedinterstitial.RewardedInterstitialAdLoadCallback;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class k50 extends RewardedInterstitialAd {

    /* renamed from: a, reason: collision with root package name */
    public final String f6247a;

    /* renamed from: b, reason: collision with root package name */
    public final r40 f6248b;

    /* renamed from: c, reason: collision with root package name */
    public final Context f6249c;

    /* renamed from: e, reason: collision with root package name */
    public FullScreenContentCallback f6251e;

    /* renamed from: f, reason: collision with root package name */
    public OnAdMetadataChangedListener f6252f;

    /* renamed from: g, reason: collision with root package name */
    public OnPaidEventListener f6253g;
    public final long h = System.currentTimeMillis();

    /* renamed from: d, reason: collision with root package name */
    public final i50 f6250d = new i50();

    public k50(Context context, String str) {
        this.f6247a = str;
        this.f6249c = context.getApplicationContext();
        this.f6248b = zzbc.zza().zzs(context, str, new dy());
    }

    public final void a(zzei zzeiVar, RewardedInterstitialAdLoadCallback rewardedInterstitialAdLoadCallback) {
        r40 r40Var = this.f6248b;
        if (r40Var != null) {
            try {
                zzeiVar.zzq(this.h);
                r40Var.zzg(zzr.zza.zza(this.f6249c, zzeiVar), new j50(rewardedInterstitialAdLoadCallback, this));
            } catch (RemoteException e6) {
                zzo.zzl("#007 Could not call remote method.", e6);
            }
        }
    }

    @Override // com.google.android.gms.ads.rewardedinterstitial.RewardedInterstitialAd
    public final Bundle getAdMetadata() {
        try {
            r40 r40Var = this.f6248b;
            if (r40Var != null) {
                return r40Var.zzb();
            }
        } catch (RemoteException e6) {
            zzo.zzl("#007 Could not call remote method.", e6);
        }
        return new Bundle();
    }

    @Override // com.google.android.gms.ads.rewardedinterstitial.RewardedInterstitialAd
    public final String getAdUnitId() {
        return this.f6247a;
    }

    @Override // com.google.android.gms.ads.rewardedinterstitial.RewardedInterstitialAd
    public final FullScreenContentCallback getFullScreenContentCallback() {
        return this.f6251e;
    }

    @Override // com.google.android.gms.ads.rewardedinterstitial.RewardedInterstitialAd
    public final OnAdMetadataChangedListener getOnAdMetadataChangedListener() {
        return this.f6252f;
    }

    @Override // com.google.android.gms.ads.rewardedinterstitial.RewardedInterstitialAd
    public final OnPaidEventListener getOnPaidEventListener() {
        return this.f6253g;
    }

    @Override // com.google.android.gms.ads.rewardedinterstitial.RewardedInterstitialAd
    public final ResponseInfo getResponseInfo() {
        zzdy zzdyVarZzc = null;
        try {
            r40 r40Var = this.f6248b;
            if (r40Var != null) {
                zzdyVarZzc = r40Var.zzc();
            }
        } catch (RemoteException e6) {
            zzo.zzl("#007 Could not call remote method.", e6);
        }
        return ResponseInfo.zzb(zzdyVarZzc);
    }

    @Override // com.google.android.gms.ads.rewardedinterstitial.RewardedInterstitialAd
    public final RewardItem getRewardItem() {
        try {
            r40 r40Var = this.f6248b;
            o40 o40VarZzd = r40Var != null ? r40Var.zzd() : null;
            if (o40VarZzd != null) {
                return new dh0(9, o40VarZzd);
            }
        } catch (RemoteException e6) {
            zzo.zzl("#007 Could not call remote method.", e6);
        }
        return RewardItem.DEFAULT_REWARD;
    }

    @Override // com.google.android.gms.ads.rewardedinterstitial.RewardedInterstitialAd
    public final void setFullScreenContentCallback(FullScreenContentCallback fullScreenContentCallback) {
        this.f6251e = fullScreenContentCallback;
        this.f6250d.s = fullScreenContentCallback;
    }

    @Override // com.google.android.gms.ads.rewardedinterstitial.RewardedInterstitialAd
    public final void setImmersiveMode(boolean z6) {
        try {
            r40 r40Var = this.f6248b;
            if (r40Var != null) {
                r40Var.zzh(z6);
            }
        } catch (RemoteException e6) {
            zzo.zzl("#007 Could not call remote method.", e6);
        }
    }

    @Override // com.google.android.gms.ads.rewardedinterstitial.RewardedInterstitialAd
    public final void setOnAdMetadataChangedListener(OnAdMetadataChangedListener onAdMetadataChangedListener) {
        this.f6252f = onAdMetadataChangedListener;
        try {
            r40 r40Var = this.f6248b;
            if (r40Var != null) {
                r40Var.zzi(new zzfr(onAdMetadataChangedListener));
            }
        } catch (RemoteException e6) {
            zzo.zzl("#007 Could not call remote method.", e6);
        }
    }

    @Override // com.google.android.gms.ads.rewardedinterstitial.RewardedInterstitialAd
    public final void setOnPaidEventListener(OnPaidEventListener onPaidEventListener) {
        this.f6253g = onPaidEventListener;
        try {
            r40 r40Var = this.f6248b;
            if (r40Var != null) {
                r40Var.zzj(new zzfs(onPaidEventListener));
            }
        } catch (RemoteException e6) {
            zzo.zzl("#007 Could not call remote method.", e6);
        }
    }

    @Override // com.google.android.gms.ads.rewardedinterstitial.RewardedInterstitialAd
    public final void setServerSideVerificationOptions(ServerSideVerificationOptions serverSideVerificationOptions) {
        try {
            r40 r40Var = this.f6248b;
            if (r40Var != null) {
                r40Var.zzl(new e50(serverSideVerificationOptions));
            }
        } catch (RemoteException e6) {
            zzo.zzl("#007 Could not call remote method.", e6);
        }
    }

    @Override // com.google.android.gms.ads.rewardedinterstitial.RewardedInterstitialAd
    public final void show(Activity activity, OnUserEarnedRewardListener onUserEarnedRewardListener) {
        i50 i50Var = this.f6250d;
        i50Var.f5562t = onUserEarnedRewardListener;
        r40 r40Var = this.f6248b;
        if (r40Var != null) {
            try {
                r40Var.zzk(i50Var);
                r40Var.zzm(new k3.b(activity));
            } catch (RemoteException e6) {
                zzo.zzl("#007 Could not call remote method.", e6);
            }
        }
    }
}
