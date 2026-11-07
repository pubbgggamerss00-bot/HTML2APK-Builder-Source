package com.google.android.gms.ads.admanager;

import android.content.Context;
import com.google.android.gms.ads.internal.client.zzbe;
import com.google.android.gms.ads.interstitial.InterstitialAd;
import com.google.android.gms.common.internal.l;
import com.google.android.gms.internal.ads.kw;
import com.google.android.gms.internal.ads.pp;
import com.google.android.gms.internal.ads.t20;
import com.google.android.gms.internal.ads.zn;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public abstract class AdManagerInterstitialAd extends InterstitialAd {
    public static void load(final Context context, final String str, final AdManagerAdRequest adManagerAdRequest, final AdManagerInterstitialAdLoadCallback adManagerInterstitialAdLoadCallback) {
        l.g("Context cannot be null.", context);
        l.g("AdUnitId cannot be null.", str);
        l.g("AdManagerAdRequest cannot be null.", adManagerAdRequest);
        l.g("LoadCallback cannot be null.", adManagerInterstitialAdLoadCallback);
        l.d("#008 Must be called on the main UI thread.");
        zn.a(context);
        if (((Boolean) pp.f8122i.c()).booleanValue()) {
            if (((Boolean) zzbe.zzc().a(zn.ab)).booleanValue()) {
                com.google.android.gms.ads.internal.util.client.zzb.zzb.execute(new Runnable() { // from class: com.google.android.gms.ads.admanager.zzc
                    @Override // java.lang.Runnable
                    public final void run() {
                        Context context2 = context;
                        String str2 = str;
                        AdManagerAdRequest adManagerAdRequest2 = adManagerAdRequest;
                        try {
                            new kw(context2, str2).a(adManagerAdRequest2.zza(), adManagerInterstitialAdLoadCallback);
                        } catch (IllegalStateException e6) {
                            t20.a(context2).b("AdManagerInterstitialAd.load", e6);
                        }
                    }
                });
                return;
            }
        }
        new kw(context, str).a(adManagerAdRequest.zza(), adManagerInterstitialAdLoadCallback);
    }

    public abstract AppEventListener getAppEventListener();

    public abstract void setAppEventListener(AppEventListener appEventListener);
}
