package com.google.android.gms.ads.interstitial;

import android.app.Activity;
import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.FullScreenContentCallback;
import com.google.android.gms.ads.OnPaidEventListener;
import com.google.android.gms.ads.ResponseInfo;
import com.google.android.gms.ads.internal.client.zzbe;
import com.google.android.gms.ads.internal.client.zzby;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.zzb;
import com.google.android.gms.common.internal.l;
import com.google.android.gms.internal.ads.kw;
import com.google.android.gms.internal.ads.pp;
import com.google.android.gms.internal.ads.t20;
import com.google.android.gms.internal.ads.zn;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public abstract class InterstitialAd {
    public static boolean isAdAvailable(Context context, String str) {
        try {
            return zzb.zza(context).zzk(str);
        } catch (RemoteException e6) {
            zzo.zzl("#007 Could not call remote method.", e6);
            return false;
        }
    }

    public static void load(final Context context, final String str, final AdRequest adRequest, final InterstitialAdLoadCallback interstitialAdLoadCallback) {
        l.g("Context cannot be null.", context);
        l.g("AdUnitId cannot be null.", str);
        l.g("AdRequest cannot be null.", adRequest);
        l.g("LoadCallback cannot be null.", interstitialAdLoadCallback);
        l.d("#008 Must be called on the main UI thread.");
        zn.a(context);
        if (((Boolean) pp.f8122i.c()).booleanValue()) {
            if (((Boolean) zzbe.zzc().a(zn.ab)).booleanValue()) {
                com.google.android.gms.ads.internal.util.client.zzb.zzb.execute(new Runnable() { // from class: com.google.android.gms.ads.interstitial.zza
                    @Override // java.lang.Runnable
                    public final void run() {
                        Context context2 = context;
                        String str2 = str;
                        AdRequest adRequest2 = adRequest;
                        try {
                            new kw(context2, str2).a(adRequest2.zza(), interstitialAdLoadCallback);
                        } catch (IllegalStateException e6) {
                            t20.a(context2).b("InterstitialAd.load", e6);
                        }
                    }
                });
                return;
            }
        }
        new kw(context, str).a(adRequest.zza(), interstitialAdLoadCallback);
    }

    public static InterstitialAd pollAd(Context context, String str) {
        try {
            zzby zzbyVarZzf = zzb.zza(context).zzf(str);
            if (zzbyVarZzf != null) {
                return new kw(context, str, zzbyVarZzf);
            }
            zzo.zzl("Failed to obtain an Interstitial Ad from the preloader.", null);
            return null;
        } catch (RemoteException e6) {
            zzo.zzl("#007 Could not call remote method.", e6);
            return null;
        }
    }

    public abstract String getAdUnitId();

    public abstract FullScreenContentCallback getFullScreenContentCallback();

    public abstract OnPaidEventListener getOnPaidEventListener();

    public abstract ResponseInfo getResponseInfo();

    public abstract void setFullScreenContentCallback(FullScreenContentCallback fullScreenContentCallback);

    public abstract void setImmersiveMode(boolean z6);

    public abstract void setOnPaidEventListener(OnPaidEventListener onPaidEventListener);

    public abstract void show(Activity activity);
}
