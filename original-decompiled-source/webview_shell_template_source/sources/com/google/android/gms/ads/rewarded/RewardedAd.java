package com.google.android.gms.ads.rewarded;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.FullScreenContentCallback;
import com.google.android.gms.ads.OnPaidEventListener;
import com.google.android.gms.ads.OnUserEarnedRewardListener;
import com.google.android.gms.ads.ResponseInfo;
import com.google.android.gms.ads.admanager.AdManagerAdRequest;
import com.google.android.gms.ads.internal.client.zzbe;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.common.internal.l;
import com.google.android.gms.internal.ads.a50;
import com.google.android.gms.internal.ads.pp;
import com.google.android.gms.internal.ads.r40;
import com.google.android.gms.internal.ads.t20;
import com.google.android.gms.internal.ads.zn;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public abstract class RewardedAd {
    public static boolean isAdAvailable(Context context, String str) {
        l.g("Context cannot be null.", context);
        l.g("AdUnitId cannot be null.", str);
        a50 a50Var = new a50(context, str);
        try {
            return com.google.android.gms.ads.zzb.zza(a50Var.f2577c).zzl(a50Var.f2575a);
        } catch (RemoteException e6) {
            zzo.zzl("#007 Could not call remote method.", e6);
            return false;
        }
    }

    public static void load(final Context context, final String str, final AdRequest adRequest, final RewardedAdLoadCallback rewardedAdLoadCallback) {
        l.g("Context cannot be null.", context);
        l.g("AdUnitId cannot be null.", str);
        l.g("AdRequest cannot be null.", adRequest);
        l.g("LoadCallback cannot be null.", rewardedAdLoadCallback);
        l.d("#008 Must be called on the main UI thread.");
        zn.a(context);
        if (((Boolean) pp.f8124k.c()).booleanValue()) {
            if (((Boolean) zzbe.zzc().a(zn.ab)).booleanValue()) {
                com.google.android.gms.ads.internal.util.client.zzb.zzb.execute(new Runnable() { // from class: com.google.android.gms.ads.rewarded.zzc
                    @Override // java.lang.Runnable
                    public final void run() {
                        Context context2 = context;
                        String str2 = str;
                        AdRequest adRequest2 = adRequest;
                        try {
                            new a50(context2, str2).a(adRequest2.zza(), rewardedAdLoadCallback);
                        } catch (IllegalStateException e6) {
                            t20.a(context2).b("RewardedAd.load", e6);
                        }
                    }
                });
                return;
            }
        }
        zzo.zze("Loading on UI thread");
        new a50(context, str).a(adRequest.zza(), rewardedAdLoadCallback);
    }

    public static RewardedAd pollAd(Context context, String str) {
        l.g("Context cannot be null.", context);
        l.g("AdUnitId cannot be null.", str);
        a50 a50Var = new a50(context, str);
        String str2 = a50Var.f2575a;
        Context context2 = a50Var.f2577c;
        try {
            r40 r40VarZzg = com.google.android.gms.ads.zzb.zza(context2).zzg(str2);
            if (r40VarZzg != null) {
                return new a50(context2, str2, r40VarZzg, a50Var.f2578d);
            }
            zzo.zzl("Failed to obtain a Rewarded Ad from the preloader.", null);
            return null;
        } catch (RemoteException e6) {
            zzo.zzl("#007 Could not call remote method.", e6);
            return null;
        }
    }

    public abstract Bundle getAdMetadata();

    public abstract String getAdUnitId();

    public abstract FullScreenContentCallback getFullScreenContentCallback();

    public abstract OnAdMetadataChangedListener getOnAdMetadataChangedListener();

    public abstract OnPaidEventListener getOnPaidEventListener();

    public abstract ResponseInfo getResponseInfo();

    public abstract RewardItem getRewardItem();

    public abstract void setFullScreenContentCallback(FullScreenContentCallback fullScreenContentCallback);

    public abstract void setImmersiveMode(boolean z6);

    public abstract void setOnAdMetadataChangedListener(OnAdMetadataChangedListener onAdMetadataChangedListener);

    public abstract void setOnPaidEventListener(OnPaidEventListener onPaidEventListener);

    public abstract void setServerSideVerificationOptions(ServerSideVerificationOptions serverSideVerificationOptions);

    public abstract void show(Activity activity, OnUserEarnedRewardListener onUserEarnedRewardListener);

    public static void load(final Context context, final String str, final AdManagerAdRequest adManagerAdRequest, final RewardedAdLoadCallback rewardedAdLoadCallback) {
        l.g("Context cannot be null.", context);
        l.g("AdUnitId cannot be null.", str);
        l.g("AdManagerAdRequest cannot be null.", adManagerAdRequest);
        l.g("LoadCallback cannot be null.", rewardedAdLoadCallback);
        l.d("#008 Must be called on the main UI thread.");
        zn.a(context);
        if (((Boolean) pp.f8124k.c()).booleanValue()) {
            if (((Boolean) zzbe.zzc().a(zn.ab)).booleanValue()) {
                zzo.zze("Loading on background thread");
                com.google.android.gms.ads.internal.util.client.zzb.zzb.execute(new Runnable() { // from class: com.google.android.gms.ads.rewarded.zzb
                    @Override // java.lang.Runnable
                    public final void run() {
                        Context context2 = context;
                        String str2 = str;
                        AdManagerAdRequest adManagerAdRequest2 = adManagerAdRequest;
                        try {
                            new a50(context2, str2).a(adManagerAdRequest2.zza(), rewardedAdLoadCallback);
                        } catch (IllegalStateException e6) {
                            t20.a(context2).b("RewardedAd.loadAdManager", e6);
                        }
                    }
                });
                return;
            }
        }
        zzo.zze("Loading on UI thread");
        new a50(context, str).a(adManagerAdRequest.zza(), rewardedAdLoadCallback);
    }
}
