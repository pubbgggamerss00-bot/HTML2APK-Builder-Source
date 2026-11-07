package com.google.android.gms.ads.rewardedinterstitial;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.FullScreenContentCallback;
import com.google.android.gms.ads.OnPaidEventListener;
import com.google.android.gms.ads.OnUserEarnedRewardListener;
import com.google.android.gms.ads.ResponseInfo;
import com.google.android.gms.ads.admanager.AdManagerAdRequest;
import com.google.android.gms.ads.internal.client.zzbe;
import com.google.android.gms.ads.rewarded.OnAdMetadataChangedListener;
import com.google.android.gms.ads.rewarded.RewardItem;
import com.google.android.gms.ads.rewarded.ServerSideVerificationOptions;
import com.google.android.gms.common.internal.l;
import com.google.android.gms.internal.ads.k50;
import com.google.android.gms.internal.ads.pp;
import com.google.android.gms.internal.ads.t20;
import com.google.android.gms.internal.ads.zn;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public abstract class RewardedInterstitialAd {
    public static void load(final Context context, final String str, final AdRequest adRequest, final RewardedInterstitialAdLoadCallback rewardedInterstitialAdLoadCallback) {
        l.g("Context cannot be null.", context);
        l.g("AdUnitId cannot be null.", str);
        l.g("AdRequest cannot be null.", adRequest);
        l.g("LoadCallback cannot be null.", rewardedInterstitialAdLoadCallback);
        l.d("#008 Must be called on the main UI thread.");
        zn.a(context);
        if (((Boolean) pp.f8124k.c()).booleanValue()) {
            if (((Boolean) zzbe.zzc().a(zn.ab)).booleanValue()) {
                com.google.android.gms.ads.internal.util.client.zzb.zzb.execute(new Runnable() { // from class: com.google.android.gms.ads.rewardedinterstitial.zzb
                    @Override // java.lang.Runnable
                    public final void run() {
                        Context context2 = context;
                        String str2 = str;
                        AdRequest adRequest2 = adRequest;
                        try {
                            new k50(context2, str2).a(adRequest2.zza(), rewardedInterstitialAdLoadCallback);
                        } catch (IllegalStateException e6) {
                            t20.a(context2).b("RewardedInterstitialAd.load", e6);
                        }
                    }
                });
                return;
            }
        }
        new k50(context, str).a(adRequest.zza(), rewardedInterstitialAdLoadCallback);
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

    public static void load(final Context context, final String str, final AdManagerAdRequest adManagerAdRequest, final RewardedInterstitialAdLoadCallback rewardedInterstitialAdLoadCallback) {
        l.g("Context cannot be null.", context);
        l.g("AdUnitId cannot be null.", str);
        l.g("AdManagerAdRequest cannot be null.", adManagerAdRequest);
        l.g("LoadCallback cannot be null.", rewardedInterstitialAdLoadCallback);
        l.d("#008 Must be called on the main UI thread.");
        zn.a(context);
        if (((Boolean) pp.f8124k.c()).booleanValue()) {
            if (((Boolean) zzbe.zzc().a(zn.ab)).booleanValue()) {
                com.google.android.gms.ads.internal.util.client.zzb.zzb.execute(new Runnable() { // from class: com.google.android.gms.ads.rewardedinterstitial.zza
                    @Override // java.lang.Runnable
                    public final void run() {
                        Context context2 = context;
                        String str2 = str;
                        AdManagerAdRequest adManagerAdRequest2 = adManagerAdRequest;
                        try {
                            new k50(context2, str2).a(adManagerAdRequest2.zza(), rewardedInterstitialAdLoadCallback);
                        } catch (IllegalStateException e6) {
                            t20.a(context2).b("RewardedInterstitialAdManager.load", e6);
                        }
                    }
                });
                return;
            }
        }
        new k50(context, str).a(adManagerAdRequest.zza(), rewardedInterstitialAdLoadCallback);
    }
}
