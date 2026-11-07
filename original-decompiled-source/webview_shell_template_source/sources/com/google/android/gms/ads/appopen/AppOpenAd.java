package com.google.android.gms.ads.appopen;

import android.app.Activity;
import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.ads.AdLoadCallback;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.FullScreenContentCallback;
import com.google.android.gms.ads.OnPaidEventListener;
import com.google.android.gms.ads.ResponseInfo;
import com.google.android.gms.ads.admanager.AdManagerAdRequest;
import com.google.android.gms.ads.internal.client.zzbe;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.common.internal.l;
import com.google.android.gms.internal.ads.cj;
import com.google.android.gms.internal.ads.hj;
import com.google.android.gms.internal.ads.pj;
import com.google.android.gms.internal.ads.pp;
import com.google.android.gms.internal.ads.t20;
import com.google.android.gms.internal.ads.zn;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public abstract class AppOpenAd {
    public static final int APP_OPEN_AD_ORIENTATION_LANDSCAPE = 2;
    public static final int APP_OPEN_AD_ORIENTATION_PORTRAIT = 1;

    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    public static abstract class AppOpenAdLoadCallback extends AdLoadCallback<AppOpenAd> {
    }

    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    public @interface AppOpenAdOrientation {
    }

    public static boolean isAdAvailable(Context context, String str) {
        try {
            return com.google.android.gms.ads.zzb.zza(context).zzj(str);
        } catch (RemoteException e6) {
            zzo.zzl("#007 Could not call remote method.", e6);
            return false;
        }
    }

    @Deprecated
    public static void load(final Context context, final String str, final AdRequest adRequest, @AppOpenAdOrientation final int i6, final AppOpenAdLoadCallback appOpenAdLoadCallback) {
        l.g("Context cannot be null.", context);
        l.g("adUnitId cannot be null.", str);
        l.g("AdRequest cannot be null.", adRequest);
        l.d("#008 Must be called on the main UI thread.");
        zn.a(context);
        if (((Boolean) pp.f8118d.c()).booleanValue()) {
            if (((Boolean) zzbe.zzc().a(zn.ab)).booleanValue()) {
                com.google.android.gms.ads.internal.util.client.zzb.zzb.execute(new Runnable() { // from class: com.google.android.gms.ads.appopen.zzb
                    @Override // java.lang.Runnable
                    public final void run() {
                        Context context2 = context;
                        int i7 = i6;
                        String str2 = str;
                        AdRequest adRequest2 = adRequest;
                        try {
                            new pj(context2, str2, adRequest2.zza(), i7, appOpenAdLoadCallback).a();
                        } catch (IllegalStateException e6) {
                            t20.a(context2).b("AppOpenAd.load", e6);
                        }
                    }
                });
                return;
            }
        }
        new pj(context, str, adRequest.zza(), i6, appOpenAdLoadCallback).a();
    }

    public static AppOpenAd pollAd(Context context, String str) {
        try {
            hj hjVarZze = com.google.android.gms.ads.zzb.zza(context).zze(str);
            if (hjVarZze != null) {
                return new cj(hjVarZze, str);
            }
            zzo.zzl("Failed to obtain an App Open ad from the preloader.", null);
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

    public static void load(final Context context, final String str, final AdRequest adRequest, final AppOpenAdLoadCallback appOpenAdLoadCallback) {
        l.g("Context cannot be null.", context);
        l.g("adUnitId cannot be null.", str);
        l.g("AdRequest cannot be null.", adRequest);
        l.d("#008 Must be called on the main UI thread.");
        zn.a(context);
        if (((Boolean) pp.f8118d.c()).booleanValue()) {
            if (((Boolean) zzbe.zzc().a(zn.ab)).booleanValue()) {
                com.google.android.gms.ads.internal.util.client.zzb.zzb.execute(new Runnable() { // from class: com.google.android.gms.ads.appopen.zza
                    @Override // java.lang.Runnable
                    public final void run() {
                        Context context2 = context;
                        String str2 = str;
                        AdRequest adRequest2 = adRequest;
                        try {
                            new pj(context2, str2, adRequest2.zza(), 3, appOpenAdLoadCallback).a();
                        } catch (IllegalStateException e6) {
                            t20.a(context2).b("AppOpenAd.load", e6);
                        }
                    }
                });
                return;
            }
        }
        new pj(context, str, adRequest.zza(), 3, appOpenAdLoadCallback).a();
    }

    @Deprecated
    public static void load(final Context context, final String str, final AdManagerAdRequest adManagerAdRequest, @AppOpenAdOrientation final int i6, final AppOpenAdLoadCallback appOpenAdLoadCallback) {
        l.g("Context cannot be null.", context);
        l.g("adUnitId cannot be null.", str);
        l.g("AdManagerAdRequest cannot be null.", adManagerAdRequest);
        l.d("#008 Must be called on the main UI thread.");
        zn.a(context);
        if (((Boolean) pp.f8118d.c()).booleanValue()) {
            if (((Boolean) zzbe.zzc().a(zn.ab)).booleanValue()) {
                com.google.android.gms.ads.internal.util.client.zzb.zzb.execute(new Runnable() { // from class: com.google.android.gms.ads.appopen.zzc
                    @Override // java.lang.Runnable
                    public final void run() {
                        Context context2 = context;
                        int i7 = i6;
                        String str2 = str;
                        AdManagerAdRequest adManagerAdRequest2 = adManagerAdRequest;
                        try {
                            new pj(context2, str2, adManagerAdRequest2.zza(), i7, appOpenAdLoadCallback).a();
                        } catch (IllegalStateException e6) {
                            t20.a(context2).b("AppOpenAdManager.load", e6);
                        }
                    }
                });
                return;
            }
        }
        new pj(context, str, adManagerAdRequest.zza(), i6, appOpenAdLoadCallback).a();
    }
}
