package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import com.google.android.gms.ads.AdLoader;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.OutOfContextTestingActivity;
import com.google.android.gms.ads.appopen.AppOpenAd;
import com.google.android.gms.ads.internal.client.zzbe;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.internal.util.zzs;
import com.google.android.gms.ads.internal.zzv;
import com.google.android.gms.ads.interstitial.InterstitialAd;
import com.google.android.gms.ads.nativead.NativeAd;
import com.google.android.gms.ads.rewarded.RewardedAd;
import com.google.android.gms.ads.rewardedinterstitial.RewardedInterstitialAd;
import java.lang.ref.WeakReference;
import java.util.Map;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class zt implements yt {
    public final /* synthetic */ int s;

    /* renamed from: t, reason: collision with root package name */
    public final Object f11574t;

    public /* synthetic */ zt(int i6, Object obj) {
        this.s = i6;
        this.f11574t = obj;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
     */
    /* JADX WARN: Removed duplicated region for block: B:82:0x01a5 A[DONT_GENERATE] */
    @Override // com.google.android.gms.internal.ads.yt
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void d(Object obj, Map map) throws NumberFormatException {
        Object obj2;
        switch (this.s) {
            case 0:
                if (map == null || !map.containsKey("persistentData") || TextUtils.isEmpty((CharSequence) map.get("persistentData"))) {
                    return;
                }
                sv0 sv0Var = (sv0) this.f11574t;
                String str = (String) map.get("persistentData");
                synchronized (sv0Var) {
                    sv0Var.f9030x = str;
                    zzv.zzp().d().zzC(sv0Var.f9030x);
                }
                return;
            case 1:
                if (((Boolean) zzbe.zzc().a(zn.l9)).booleanValue()) {
                    String str2 = (String) map.get("action");
                    String str3 = (String) map.get("adUnitId");
                    String str4 = (String) map.get("redirectUrl");
                    if (TextUtils.isEmpty(str2) || TextUtils.isEmpty(str3) || TextUtils.isEmpty(str4)) {
                        return;
                    }
                    String str5 = (String) map.get("format");
                    if (str2.equals("load") && !TextUtils.isEmpty(str5)) {
                        dw0 dw0Var = (dw0) this.f11574t;
                        synchronized (dw0Var) {
                            switch (str5.hashCode()) {
                                case -1999289321:
                                    if (!str5.equals("NATIVE")) {
                                        break;
                                    } else {
                                        AdLoader.Builder builder = new AdLoader.Builder(dw0Var.e2(), str3);
                                        builder.forNativeAd(new wv0(dw0Var, str3, str4));
                                        builder.withAdListener(new cw0(dw0Var, str4));
                                        builder.build().loadAd(dw0.f2());
                                        break;
                                    }
                                case -1372958932:
                                    if (str5.equals("INTERSTITIAL")) {
                                        InterstitialAd.load(dw0Var.e2(), str3, dw0.f2(), new zv0(dw0Var, str3, str4));
                                        break;
                                    }
                                    break;
                                case -428325382:
                                    if (str5.equals("APP_OPEN_AD")) {
                                        AppOpenAd.load(dw0Var.e2(), str3, dw0.f2(), 1, new xv0(dw0Var, str3, str4));
                                        break;
                                    }
                                    break;
                                case 543046670:
                                    if (str5.equals("REWARDED")) {
                                        RewardedAd.load(dw0Var.e2(), str3, dw0.f2(), new aw0(dw0Var, str3, str4));
                                        break;
                                    }
                                    break;
                                case 1854800829:
                                    if (str5.equals("REWARDED_INTERSTITIAL")) {
                                        RewardedInterstitialAd.load(dw0Var.e2(), str3, dw0.f2(), new bw0(dw0Var, str3, str4));
                                        break;
                                    }
                                    break;
                                case 1951953708:
                                    if (str5.equals("BANNER")) {
                                        AdView adView = new AdView(dw0Var.e2());
                                        adView.setAdSize(AdSize.BANNER);
                                        adView.setAdUnitId(str3);
                                        adView.setAdListener(new yv0(dw0Var, str3, adView, str4));
                                        adView.loadAd(dw0.f2());
                                        break;
                                    }
                                    break;
                            }
                        }
                        return;
                    }
                    if (str2.equals("show")) {
                        dw0 dw0Var2 = (dw0) this.f11574t;
                        synchronized (dw0Var2) {
                            try {
                                vv0 vv0Var = dw0Var2.f4050v;
                                xa0 xa0Var = vv0Var.f9946v;
                                Activity activityZzi = (xa0Var == null || xa0Var.o()) ? null : vv0Var.f9946v.zzi();
                                if (activityZzi != null && (obj2 = dw0Var2.s.get(str3)) != null) {
                                    nn nnVar = zn.m9;
                                    if (!((Boolean) zzbe.zzc().a(nnVar)).booleanValue() || (obj2 instanceof AppOpenAd) || (obj2 instanceof InterstitialAd) || (obj2 instanceof RewardedAd) || (obj2 instanceof RewardedInterstitialAd)) {
                                        dw0Var2.s.remove(str3);
                                    }
                                    dw0Var2.i2(dw0.g2(obj2), str4);
                                    if (obj2 instanceof AppOpenAd) {
                                        ((AppOpenAd) obj2).show(activityZzi);
                                        return;
                                    }
                                    if (obj2 instanceof InterstitialAd) {
                                        ((InterstitialAd) obj2).show(activityZzi);
                                        return;
                                    }
                                    if (obj2 instanceof RewardedAd) {
                                        ((RewardedAd) obj2).show(activityZzi, new fo(18));
                                        return;
                                    }
                                    if (obj2 instanceof RewardedInterstitialAd) {
                                        ((RewardedInterstitialAd) obj2).show(activityZzi, new f0(25));
                                        return;
                                    }
                                    if (((Boolean) zzbe.zzc().a(nnVar)).booleanValue() && ((obj2 instanceof AdView) || (obj2 instanceof NativeAd))) {
                                        Intent intent = new Intent();
                                        Context contextE2 = dw0Var2.e2();
                                        intent.setClassName(contextE2, OutOfContextTestingActivity.CLASS_NAME);
                                        intent.putExtra(OutOfContextTestingActivity.AD_UNIT_KEY, str3);
                                        zzv.zzq();
                                        zzs.zzT(contextE2, intent);
                                        return;
                                    }
                                }
                                return;
                            } finally {
                            }
                        }
                    }
                    return;
                }
                return;
            case 2:
                if (map != null) {
                    String str6 = (String) map.get("height");
                    if (TextUtils.isEmpty(str6)) {
                        return;
                    }
                    try {
                        int i6 = Integer.parseInt(str6);
                        synchronized (((mb0) this.f11574t)) {
                            try {
                                mb0 mb0Var = (mb0) this.f11574t;
                                if (mb0Var.f7044c0 != i6) {
                                    mb0Var.f7044c0 = i6;
                                    mb0Var.requestLayout();
                                }
                            } finally {
                            }
                        }
                        return;
                    } catch (Exception e6) {
                        zzo.zzk("Exception occurred while getting webview content height", e6);
                        return;
                    }
                }
                return;
            default:
                yo0 yo0Var = (yo0) ((WeakReference) this.f11574t).get();
                if (yo0Var == null) {
                    return;
                }
                nn0 nn0Var = yo0Var.f11042i;
                yo0Var.h.onAdClicked();
                if (((Boolean) zzbe.zzc().a(zn.Ea)).booleanValue()) {
                    nn0Var.O();
                    if (TextUtils.isEmpty((CharSequence) map.get("sccg"))) {
                        return;
                    }
                    nn0Var.zzu();
                    return;
                }
                return;
        }
    }

    public /* synthetic */ zt(yo0 yo0Var) {
        this.s = 3;
        this.f11574t = new WeakReference(yo0Var);
    }
}
