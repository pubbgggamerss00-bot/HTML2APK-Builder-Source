package {{packageName}}

import org.json.JSONObject

/**
 * "noAds" flavor build'inin reklam köprüsü. Bu variedant Google Play Ads SDK'sini
 * hic çözmediği için gerçek AdMobBridge derlenemez; MainActivity ve AndroidAPI
 * aynı sınıf adını ve imzayı beklediklerinden burada karşılıksız bir sürüm duruyor.
 *
 * Sessizce hiçbir şey yapmamak yerine AndroidAPI'nin beklediği aynı event adlarini
 * ve JSON sözlesmesini yayinlar, boylece HTML tarafinda reklam çağıran bir proje
 * konsolda sebebi görür.
 */
class AdMobBridge(
    activity: MainActivity,
    config: MainActivity.DisplayConfig,
    private val emit: (String, JSONObject) -> Unit
) {

    val isInitialized: Boolean = false
    fun canRequestAds() = false
    fun isPrivacyOptionsRequired() = false
    fun consentStatusJson() = JSONObject().apply {
        put("success", false); put("error", "ads_disabled")
        put("canRequestAds", false); put("consentStatus", "UNKNOWN")
        put("privacyOptionsRequired", false); put("privacyOptionsStatus", "UNKNOWN")
        put("inProgress", false); put("debugEnabled", false)
    }
    fun initializeFromJs() = emit("adResult", consentStatusJson().put("initialized", false))
    fun showPrivacyOptions() = emit("privacyOptionsResult", consentStatusJson())
    fun resetConsent() = emit("consentResetResult", consentStatusJson())

    val isEnabled: Boolean = false

    val bannerId: String? = null

    val interstitialId: String? = null

    val rewardedId: String? = null

    fun isBannerLoaded(): Boolean = false

    fun isInterstitialLoaded(): Boolean = false

    fun isRewardedLoaded(): Boolean = false

    fun loadBanner(adUnitId: String, position: String) {
        emitError("adFailedToLoad", "banner")
    }

    fun showBanner() {
        emitError("adFailedToLoad", "banner")
    }

    fun hideBanner() = Unit

    fun setBannerPosition(position: String) = Unit

    fun updateBannerMargins() = Unit

    fun loadInterstitial(adUnitId: String) {
        emitError("adFailedToLoad", "interstitial")
    }

    fun showInterstitial() {
        emitError("adFailedToShow", "interstitial")
    }

    fun loadRewarded(adUnitId: String) {
        emitError("adFailedToLoad", "rewarded")
    }

    fun showRewarded(customCallback: String? = null) {
        emitError("adFailedToShow", "rewarded")
    }

    fun onPageLoaded() = Unit

    fun onResume() = Unit

    fun onPause() = Unit

    fun destroy() = Unit

    private fun emitError(event: String, type: String) {
        emit(
            event,
            JSONObject().apply {
                put("type", type)
                put("adUnitId", "")
                put(
                    "message",
                    "Ads are not included in this build. Enable Ads in Project Settings (Step 8: Ads) " +
                        "and rebuild the app to display ads."
                )
            }
        )
    }
}
