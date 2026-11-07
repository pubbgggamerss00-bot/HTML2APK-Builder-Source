package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class nm implements m52 {

    /* renamed from: a, reason: collision with root package name */
    public static final nm f7468a = new nm();

    @Override // com.google.android.gms.internal.ads.m52
    public final boolean a(int i6) {
        om omVar;
        switch (i6) {
            case 0:
                omVar = om.AD_FORMAT_TYPE_UNSPECIFIED;
                break;
            case 1:
                omVar = om.BANNER;
                break;
            case 2:
                omVar = om.INTERSTITIAL;
                break;
            case 3:
                omVar = om.NATIVE_EXPRESS;
                break;
            case 4:
                omVar = om.NATIVE_CONTENT;
                break;
            case 5:
                omVar = om.NATIVE_APP_INSTALL;
                break;
            case 6:
                omVar = om.NATIVE_CUSTOM_TEMPLATE;
                break;
            case 7:
                omVar = om.DFP_BANNER;
                break;
            case 8:
                omVar = om.DFP_INTERSTITIAL;
                break;
            case 9:
                omVar = om.REWARD_BASED_VIDEO_AD;
                break;
            case 10:
                omVar = om.BANNER_SEARCH_ADS;
                break;
            default:
                omVar = null;
                break;
        }
        return omVar != null;
    }
}
