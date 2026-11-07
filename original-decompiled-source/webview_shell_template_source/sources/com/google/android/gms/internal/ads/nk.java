package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class nk implements m52 {

    /* renamed from: a, reason: collision with root package name */
    public static final nk f7458a = new nk();

    @Override // com.google.android.gms.internal.ads.m52
    public final boolean a(int i6) {
        ok okVar;
        switch (i6) {
            case 0:
                okVar = ok.AD_INITIATER_UNSPECIFIED;
                break;
            case 1:
                okVar = ok.BANNER;
                break;
            case 2:
                okVar = ok.DFP_BANNER;
                break;
            case 3:
                okVar = ok.INTERSTITIAL;
                break;
            case 4:
                okVar = ok.DFP_INTERSTITIAL;
                break;
            case 5:
                okVar = ok.NATIVE_EXPRESS;
                break;
            case 6:
                okVar = ok.AD_LOADER;
                break;
            case 7:
                okVar = ok.REWARD_BASED_VIDEO_AD;
                break;
            case 8:
                okVar = ok.BANNER_SEARCH_ADS;
                break;
            case 9:
                okVar = ok.GOOGLE_MOBILE_ADS_SDK_ADAPTER;
                break;
            case 10:
                okVar = ok.APP_OPEN;
                break;
            case 11:
                okVar = ok.REWARDED_INTERSTITIAL;
                break;
            default:
                okVar = null;
                break;
        }
        return okVar != null;
    }
}
