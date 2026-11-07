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
import com.google.android.gms.ads.rewarded.RewardedAd;
import com.google.android.gms.ads.rewarded.RewardedAdLoadCallback;
import com.google.android.gms.ads.rewarded.ServerSideVerificationOptions;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class a50 extends RewardedAd {

    /* renamed from: a, reason: collision with root package name */
    public final String f2575a;

    /* renamed from: b, reason: collision with root package name */
    public final r40 f2576b;

    /* renamed from: c, reason: collision with root package name */
    public final Context f2577c;

    /* renamed from: d, reason: collision with root package name */
    public final i50 f2578d;

    /* renamed from: e, reason: collision with root package name */
    public OnAdMetadataChangedListener f2579e;

    /* renamed from: f, reason: collision with root package name */
    public OnPaidEventListener f2580f;

    /* renamed from: g, reason: collision with root package name */
    public FullScreenContentCallback f2581g;
    public final long h;

    public a50(Context context, String str) {
        this(context.getApplicationContext(), str, zzbc.zza().zzs(context, str, new dy()), new i50());
    }

    public final void a(zzei zzeiVar, RewardedAdLoadCallback rewardedAdLoadCallback) {
        r40 r40Var = this.f2576b;
        if (r40Var != null) {
            try {
                zzeiVar.zzq(this.h);
                r40Var.zzf(zzr.zza.zza(this.f2577c, zzeiVar), new d50(rewardedAdLoadCallback, this));
            } catch (RemoteException e6) {
                zzo.zzl("#007 Could not call remote method.", e6);
            }
        }
    }

    @Override // com.google.android.gms.ads.rewarded.RewardedAd
    public final Bundle getAdMetadata() {
        try {
            r40 r40Var = this.f2576b;
            if (r40Var != null) {
                return r40Var.zzb();
            }
        } catch (RemoteException e6) {
            zzo.zzl("#007 Could not call remote method.", e6);
        }
        return new Bundle();
    }

    @Override // com.google.android.gms.ads.rewarded.RewardedAd
    public final String getAdUnitId() {
        return this.f2575a;
    }

    @Override // com.google.android.gms.ads.rewarded.RewardedAd
    public final FullScreenContentCallback getFullScreenContentCallback() {
        return this.f2581g;
    }

    @Override // com.google.android.gms.ads.rewarded.RewardedAd
    public final OnAdMetadataChangedListener getOnAdMetadataChangedListener() {
        return this.f2579e;
    }

    @Override // com.google.android.gms.ads.rewarded.RewardedAd
    public final OnPaidEventListener getOnPaidEventListener() {
        return this.f2580f;
    }

    @Override // com.google.android.gms.ads.rewarded.RewardedAd
    public final ResponseInfo getResponseInfo() {
        zzdy zzdyVarZzc = null;
        try {
            r40 r40Var = this.f2576b;
            if (r40Var != null) {
                zzdyVarZzc = r40Var.zzc();
            }
        } catch (RemoteException e6) {
            zzo.zzl("#007 Could not call remote method.", e6);
        }
        return ResponseInfo.zzb(zzdyVarZzc);
    }

    @Override // com.google.android.gms.ads.rewarded.RewardedAd
    public final RewardItem getRewardItem() {
        try {
            r40 r40Var = this.f2576b;
            o40 o40VarZzd = r40Var != null ? r40Var.zzd() : null;
            return o40VarZzd == null ? RewardItem.DEFAULT_REWARD : new dh0(9, o40VarZzd);
        } catch (RemoteException e6) {
            zzo.zzl("#007 Could not call remote method.", e6);
            return RewardItem.DEFAULT_REWARD;
        }
    }

    @Override // com.google.android.gms.ads.rewarded.RewardedAd
    public final void setFullScreenContentCallback(FullScreenContentCallback fullScreenContentCallback) {
        this.f2581g = fullScreenContentCallback;
        this.f2578d.s = fullScreenContentCallback;
    }

    @Override // com.google.android.gms.ads.rewarded.RewardedAd
    public final void setImmersiveMode(boolean z6) {
        try {
            r40 r40Var = this.f2576b;
            if (r40Var != null) {
                r40Var.zzh(z6);
            }
        } catch (RemoteException e6) {
            zzo.zzl("#007 Could not call remote method.", e6);
        }
    }

    @Override // com.google.android.gms.ads.rewarded.RewardedAd
    public final void setOnAdMetadataChangedListener(OnAdMetadataChangedListener onAdMetadataChangedListener) {
        try {
            this.f2579e = onAdMetadataChangedListener;
            r40 r40Var = this.f2576b;
            if (r40Var != null) {
                r40Var.zzi(new zzfr(onAdMetadataChangedListener));
            }
        } catch (RemoteException e6) {
            zzo.zzl("#007 Could not call remote method.", e6);
        }
    }

    @Override // com.google.android.gms.ads.rewarded.RewardedAd
    public final void setOnPaidEventListener(OnPaidEventListener onPaidEventListener) {
        try {
            this.f2580f = onPaidEventListener;
            r40 r40Var = this.f2576b;
            if (r40Var != null) {
                r40Var.zzj(new zzfs(onPaidEventListener));
            }
        } catch (RemoteException e6) {
            zzo.zzl("#007 Could not call remote method.", e6);
        }
    }

    @Override // com.google.android.gms.ads.rewarded.RewardedAd
    public final void setServerSideVerificationOptions(ServerSideVerificationOptions serverSideVerificationOptions) {
        if (serverSideVerificationOptions != null) {
            try {
                r40 r40Var = this.f2576b;
                if (r40Var != null) {
                    r40Var.zzl(new e50(serverSideVerificationOptions));
                }
            } catch (RemoteException e6) {
                zzo.zzl("#007 Could not call remote method.", e6);
            }
        }
    }

    @Override // com.google.android.gms.ads.rewarded.RewardedAd
    public final void show(Activity activity, OnUserEarnedRewardListener onUserEarnedRewardListener) {
        i50 i50Var = this.f2578d;
        i50Var.f5562t = onUserEarnedRewardListener;
        if (activity == null) {
            zzo.zzj("The activity for show is null, will proceed with show using the context provided when loading the ad.");
        }
        r40 r40Var = this.f2576b;
        if (r40Var != null) {
            try {
                r40Var.zzk(i50Var);
                r40Var.zzm(new k3.b(activity));
            } catch (RemoteException e6) {
                zzo.zzl("#007 Could not call remote method.", e6);
            }
        }
    }

    public a50(Context context, String str, r40 r40Var, i50 i50Var) {
        this.h = System.currentTimeMillis();
        this.f2577c = context.getApplicationContext();
        this.f2575a = str;
        this.f2576b = r40Var;
        this.f2578d = i50Var;
    }
}
