package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.ads.RequestConfiguration;
import com.google.android.gms.ads.internal.client.zzbe;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import com.google.android.gms.ads.internal.overlay.zzc;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.internal.util.zzs;
import com.google.android.gms.ads.internal.zzv;
import com.google.android.gms.ads.mediation.MediationAdRequest;
import com.google.android.gms.ads.mediation.MediationInterstitialAdapter;
import com.google.android.gms.ads.mediation.MediationInterstitialListener;
import p.e;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class zzbrw implements MediationInterstitialAdapter {

    /* renamed from: a, reason: collision with root package name */
    public Activity f11613a;

    /* renamed from: b, reason: collision with root package name */
    public MediationInterstitialListener f11614b;

    /* renamed from: c, reason: collision with root package name */
    public Uri f11615c;

    @Override // com.google.android.gms.ads.mediation.MediationAdapter
    public final void onDestroy() {
        zzo.zze("Destroying AdMobCustomTabsAdapter adapter.");
    }

    @Override // com.google.android.gms.ads.mediation.MediationAdapter
    public final void onPause() {
        zzo.zze("Pausing AdMobCustomTabsAdapter adapter.");
    }

    @Override // com.google.android.gms.ads.mediation.MediationAdapter
    public final void onResume() {
        zzo.zze("Resuming AdMobCustomTabsAdapter adapter.");
    }

    @Override // com.google.android.gms.ads.mediation.MediationInterstitialAdapter
    public final void requestInterstitialAd(Context context, MediationInterstitialListener mediationInterstitialListener, Bundle bundle, MediationAdRequest mediationAdRequest, Bundle bundle2) {
        this.f11614b = mediationInterstitialListener;
        if (mediationInterstitialListener == null) {
            zzo.zzj("Listener not set for mediation. Returning.");
            return;
        }
        if (!(context instanceof Activity)) {
            zzo.zzj("AdMobCustomTabs can only work with Activity context. Bailing out.");
            this.f11614b.onAdFailedToLoad(this, 0);
            return;
        }
        if (!xo.a(context)) {
            zzo.zzj("Default browser does not support custom tabs. Bailing out.");
            this.f11614b.onAdFailedToLoad(this, 0);
            return;
        }
        String string = bundle.getString("tab_url");
        if (TextUtils.isEmpty(string)) {
            zzo.zzj("The tab_url retrieved from mediation metadata is empty. Bailing out.");
            this.f11614b.onAdFailedToLoad(this, 0);
        } else {
            this.f11613a = (Activity) context;
            this.f11615c = Uri.parse(string);
            this.f11614b.onAdLoaded(this);
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationInterstitialAdapter
    public final void showInterstitial() {
        p.e eVarA = new e.d().a();
        eVarA.f14043a.setData(this.f11615c);
        zzs.zza.post(new bb(3, this, new AdOverlayInfoParcel(new zzc(eVarA.f14043a, null), null, new p00(this), null, new VersionInfoParcel(0, 0, false), null, null, RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED)));
        a70 a70Var = zzv.zzp().f2956l;
        a70Var.getClass();
        long jA = zzv.zzC().a();
        synchronized (a70Var.f2592a) {
            try {
                if (a70Var.f2594c == 3) {
                    if (a70Var.f2593b + ((Long) zzbe.zzc().a(zn.P5)).longValue() <= jA) {
                        a70Var.f2594c = 1;
                    }
                }
            } finally {
            }
        }
        long jA2 = zzv.zzC().a();
        synchronized (a70Var.f2592a) {
            try {
                if (a70Var.f2594c != 2) {
                    return;
                }
                a70Var.f2594c = 3;
                if (a70Var.f2594c == 3) {
                    a70Var.f2593b = jA2;
                }
            } finally {
            }
        }
    }
}
