package com.htmltoapk.template;

import com.google.android.gms.ads.RequestConfiguration;
import com.htmltoapk.template.WebViewActivity;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class AdPrivacySettingsKt {
    public static final RequestConfiguration adRequestConfiguration(WebViewActivity.DisplayConfig displayConfig) {
        kotlin.jvm.internal.j.e("config", displayConfig);
        RequestConfiguration requestConfigurationBuild = new RequestConfiguration.Builder().setTestDeviceIds(displayConfig.getAdmobTestDeviceIds()).setTagForChildDirectedTreatment(displayConfig.getAdmobChildDirectedTreatment()).setTagForUnderAgeOfConsent(displayConfig.getAdmobUnderAgeOfConsent()).setMaxAdContentRating(displayConfig.getAdmobMaxAdContentRating()).build();
        kotlin.jvm.internal.j.d("build(...)", requestConfigurationBuild);
        return requestConfigurationBuild;
    }

    public static final String adUnitIdForRequest(WebViewActivity.DisplayConfig displayConfig, String str, String str2) {
        kotlin.jvm.internal.j.e("config", displayConfig);
        kotlin.jvm.internal.j.e("format", str);
        kotlin.jvm.internal.j.e("requested", str2);
        if (!displayConfig.getAdmobUseTestAds()) {
            return str2;
        }
        int iHashCode = str.hashCode();
        if (iHashCode != -1396342996) {
            if (iHashCode != -239580146) {
                if (iHashCode == 604727084 && str.equals("interstitial")) {
                    return AdMobTestIds.INTERSTITIAL;
                }
            } else if (str.equals("rewarded")) {
                return AdMobTestIds.REWARDED;
            }
        } else if (str.equals("banner")) {
            return AdMobTestIds.BANNER;
        }
        throw new IllegalStateException("Unknown ad format");
    }
}
