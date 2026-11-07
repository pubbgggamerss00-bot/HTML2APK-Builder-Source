package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.RemoteException;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.LoadAdError;
import com.google.android.gms.ads.RequestConfiguration;
import com.google.android.gms.ads.ResponseInfo;
import com.google.android.gms.ads.appopen.AppOpenAd;
import com.google.android.gms.ads.impl.R;
import com.google.android.gms.ads.internal.client.zzdt;
import com.google.android.gms.ads.internal.client.zzdy;
import com.google.android.gms.ads.internal.zzv;
import com.google.android.gms.ads.interstitial.InterstitialAd;
import com.google.android.gms.ads.nativead.MediaView;
import com.google.android.gms.ads.nativead.NativeAd;
import com.google.android.gms.ads.nativead.NativeAdView;
import com.google.android.gms.ads.rewarded.RewardedAd;
import com.google.android.gms.ads.rewardedinterstitial.RewardedInterstitialAd;
import java.lang.ref.WeakReference;
import java.util.HashMap;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class dw0 extends zzdt {
    public final HashMap s = new HashMap();

    /* renamed from: t, reason: collision with root package name */
    public final Context f4048t;

    /* renamed from: u, reason: collision with root package name */
    public final WeakReference f4049u;

    /* renamed from: v, reason: collision with root package name */
    public final vv0 f4050v;

    /* renamed from: w, reason: collision with root package name */
    public final hs1 f4051w;

    /* renamed from: x, reason: collision with root package name */
    public sv0 f4052x;

    public dw0(Context context, WeakReference weakReference, vv0 vv0Var, hs1 hs1Var) {
        this.f4048t = context;
        this.f4049u = weakReference;
        this.f4050v = vv0Var;
        this.f4051w = hs1Var;
    }

    public static AdRequest f2() {
        Bundle bundle = new Bundle();
        bundle.putString("request_origin", "inspector_ooct");
        return new AdRequest.Builder().addNetworkExtrasBundle(AdMobAdapter.class, bundle).build();
    }

    public static String g2(Object obj) {
        ResponseInfo responseInfo;
        zzdy zzdyVarZzc;
        if (obj instanceof LoadAdError) {
            responseInfo = ((LoadAdError) obj).getResponseInfo();
        } else if (obj instanceof AppOpenAd) {
            responseInfo = ((AppOpenAd) obj).getResponseInfo();
        } else if (obj instanceof InterstitialAd) {
            responseInfo = ((InterstitialAd) obj).getResponseInfo();
        } else if (obj instanceof RewardedAd) {
            responseInfo = ((RewardedAd) obj).getResponseInfo();
        } else if (obj instanceof RewardedInterstitialAd) {
            responseInfo = ((RewardedInterstitialAd) obj).getResponseInfo();
        } else if (obj instanceof AdView) {
            responseInfo = ((AdView) obj).getResponseInfo();
        } else {
            if (!(obj instanceof NativeAd)) {
                return RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
            }
            responseInfo = ((NativeAd) obj).getResponseInfo();
        }
        if (responseInfo == null || (zzdyVarZzc = responseInfo.zzc()) == null) {
            return RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
        }
        try {
            return zzdyVarZzc.zzh();
        } catch (RemoteException unused) {
            return RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
        }
    }

    public final Context e2() {
        Context context = (Context) this.f4049u.get();
        return context == null ? this.f4048t : context;
    }

    public final synchronized void h2(String str, String str2) {
        try {
            o70 o70VarA = this.f4052x.a(str);
            ni0 ni0Var = new ni0(this, str2, 12, false);
            o70VarA.addListener(new as1(0, o70VarA, ni0Var), this.f4051w);
        } catch (NullPointerException e6) {
            zzv.zzp().h("OutOfContextTester.setAdAsOutOfContext", e6);
            this.f4050v.b(str2);
        }
    }

    public final synchronized void i1(String str, String str2, Object obj) {
        this.s.put(str, obj);
        h2(g2(obj), str2);
    }

    public final synchronized void i2(String str, String str2) {
        try {
            o70 o70VarA = this.f4052x.a(str);
            lo loVar = new lo(this, str2, 5, false);
            o70VarA.addListener(new as1(0, o70VarA, loVar), this.f4051w);
        } catch (NullPointerException e6) {
            zzv.zzp().h("OutOfContextTester.setAdAsShown", e6);
            this.f4050v.b(str2);
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zzdu
    public final void zze(String str, k3.a aVar, k3.a aVar2) {
        Context context = (Context) k3.b.i1(aVar);
        ViewGroup viewGroup = (ViewGroup) k3.b.i1(aVar2);
        if (context == null || viewGroup == null) {
            return;
        }
        HashMap map = this.s;
        Object obj = map.get(str);
        if (obj != null) {
            map.remove(str);
        }
        if (obj instanceof AdView) {
            AdView adView = (AdView) obj;
            LinearLayout linearLayout = new LinearLayout(context);
            linearLayout.setTag("layout");
            ew0.b(linearLayout, -1, -1);
            linearLayout.setGravity(17);
            linearLayout.addView(adView);
            adView.setTag("ad_view");
            viewGroup.addView(linearLayout);
            return;
        }
        if (obj instanceof NativeAd) {
            NativeAd nativeAd = (NativeAd) obj;
            NativeAdView nativeAdView = new NativeAdView(context);
            nativeAdView.setTag("ad_view_tag");
            ew0.b(nativeAdView, -1, -1);
            viewGroup.addView(nativeAdView);
            LinearLayout linearLayout2 = new LinearLayout(context);
            linearLayout2.setTag("layout_tag");
            linearLayout2.setOrientation(1);
            ew0.b(linearLayout2, -1, -1);
            linearLayout2.setBackgroundColor(-1);
            nativeAdView.addView(linearLayout2);
            Resources resourcesB = zzv.zzp().b();
            linearLayout2.addView(ew0.a(context, resourcesB == null ? "Headline" : resourcesB.getString(R.string.native_headline), android.R.style.TextAppearance.Small, -9210245, 0.0f, "headline_header_tag"));
            String headline = nativeAd.getHeadline();
            if (headline == null) {
                headline = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
            }
            View viewA = ew0.a(context, headline, android.R.style.TextAppearance.Medium, -16777216, 12.0f, "headline_tag");
            nativeAdView.setHeadlineView(viewA);
            linearLayout2.addView(viewA);
            linearLayout2.addView(ew0.a(context, resourcesB == null ? "Body" : resourcesB.getString(R.string.native_body), android.R.style.TextAppearance.Small, -9210245, 0.0f, "body_header_tag"));
            String body = nativeAd.getBody();
            if (body == null) {
                body = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
            }
            View viewA2 = ew0.a(context, body, android.R.style.TextAppearance.Medium, -16777216, 12.0f, "body_tag");
            nativeAdView.setBodyView(viewA2);
            linearLayout2.addView(viewA2);
            linearLayout2.addView(ew0.a(context, resourcesB == null ? "Media View" : resourcesB.getString(R.string.native_media_view), android.R.style.TextAppearance.Small, -9210245, 0.0f, "media_view_header_tag"));
            MediaView mediaView = new MediaView(context);
            mediaView.setTag("media_view_tag");
            nativeAdView.setMediaView(mediaView);
            linearLayout2.addView(mediaView);
            nativeAdView.setNativeAd(nativeAd);
        }
    }
}
