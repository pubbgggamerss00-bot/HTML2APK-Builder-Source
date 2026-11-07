package {{packageName}}

import com.google.android.gms.ads.RequestConfiguration

/** Applied before MobileAds.initialize; never accepts JavaScript-supplied overrides. */
internal fun adRequestConfiguration(config: MainActivity.DisplayConfig): RequestConfiguration =
    RequestConfiguration.Builder()
        .setTestDeviceIds(config.admobTestDeviceIds)
        .setTagForChildDirectedTreatment(config.admobChildDirectedTreatment)
        .setTagForUnderAgeOfConsent(config.admobUnderAgeOfConsent)
        .setMaxAdContentRating(config.admobMaxAdContentRating)
        .build()

/** Even an explicit JavaScript unit ID cannot turn a test-only build into live ads. */
internal fun adUnitIdForRequest(config: MainActivity.DisplayConfig, format: String, requested: String): String =
    if (!config.admobUseTestAds) requested else when (format) {
        "banner" -> AdMobTestIds.BANNER
        "interstitial" -> AdMobTestIds.INTERSTITIAL
        "rewarded" -> AdMobTestIds.REWARDED
        else -> error("Unknown ad format")
    }
