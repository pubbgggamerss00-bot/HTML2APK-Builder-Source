package {{packageName}}

import android.os.Handler
import android.os.Looper
import android.util.Log
import android.view.Gravity
import android.view.View
import android.widget.FrameLayout
import com.google.android.gms.ads.AdListener
import com.google.android.gms.ads.AdRequest
import com.google.android.gms.ads.AdSize
import com.google.android.gms.ads.AdView
import com.google.android.gms.ads.LoadAdError
import com.google.android.gms.ads.MobileAds
import com.google.android.gms.ads.OnUserEarnedRewardListener
import com.google.android.gms.ads.initialization.AdapterStatus
import com.google.android.gms.ads.interstitial.InterstitialAd
import com.google.android.gms.ads.interstitial.InterstitialAdLoadCallback
import com.google.android.gms.ads.rewarded.RewardedAd
import com.google.android.gms.ads.rewarded.RewardedAdLoadCallback
import org.json.JSONObject

object AdMobTestIds {
    const val APP_ID = "ca-app-pub-3940256099942544~3347511713"
    const val BANNER = "ca-app-pub-3940256099942544/6300978111"
    const val INTERSTITIAL = "ca-app-pub-3940256099942544/1033173712"
    const val REWARDED = "ca-app-pub-3940256099942544/5224354917"
}

class AdMobBridge(
    private val activity: MainActivity,
    private val config: MainActivity.DisplayConfig,
    private val emit: (String, JSONObject) -> Unit
) {

    private val mainHandler = Handler(Looper.getMainLooper())

    private var bannerAdView: AdView? = null
    @Volatile private var bannerLoaded = false
    private var bannerPosition: String = "bottom"

    @Volatile private var interstitialAd: InterstitialAd? = null
    @Volatile private var rewardedAd: RewardedAd? = null

    private var pageLoadCounter = 0
    private var lastInterstitialShowTime = 0L
    private val autoShowRunnable = Runnable { autoShowInterstitialTick() }

    val isEnabled: Boolean
        get() = config.admobEnabled && (config.admobUseTestAds || config.admobAppId.isNotBlank())

    val bannerId: String?
        get() = when {
            !config.admobEnabled -> null
            config.admobUseTestAds -> AdMobTestIds.BANNER
            config.admobBannerEnabled && config.admobBannerUnitId.isNotBlank() -> config.admobBannerUnitId.trim()
            else -> null
        }

    val interstitialId: String?
        get() = when {
            !config.admobEnabled -> null
            config.admobUseTestAds -> AdMobTestIds.INTERSTITIAL
            config.admobInterstitialEnabled && config.admobInterstitialUnitId.isNotBlank() -> config.admobInterstitialUnitId.trim()
            else -> null
        }

    val rewardedId: String?
        get() = when {
            !config.admobEnabled -> null
            config.admobUseTestAds -> AdMobTestIds.REWARDED
            config.admobRewardedEnabled && config.admobRewardedUnitId.isNotBlank() -> config.admobRewardedUnitId.trim()
            else -> null
        }

    fun isRewardedLoaded(): Boolean = rewardedAd != null
    fun isInterstitialLoaded(): Boolean = interstitialAd != null
    fun isBannerLoaded(): Boolean = bannerLoaded

    private var consent: ConsentManager? = null
    private val pendingLoads = PendingAdLoads()
    private val loading = mutableMapOf<String, Long>()
    // Unit (and banner position) of the in-flight load per format, so an identical
    // request coalesces into it instead of queuing a duplicate ad request.
    private val loadingKey = mutableMapOf<String, String>()
    private val activeLoads = mutableMapOf<String, () -> Unit>()
    private var ticketCounter = 0L
    private var adEpoch = 0L
    private var consentWasAllowed = false
    private var initializationStarted = false
    private var initializationError: String? = null
    private var resumed = false
    @Volatile var isInitialized = false
        private set
    private var initialLoadsScheduled = false
    @Volatile private var destroyed = false
    @Volatile private var bannerWanted = config.admobShowBannerOnStart

    init {
        if (isEnabled) {
            consent = ConsentManager(activity, config, emit, ::onConsentChanged)
            mainHandler.post { consent?.start() }
        }
    }

    fun canRequestAds(): Boolean = consent?.snapshot?.canRequestAds == true && !destroyed
    fun isPrivacyOptionsRequired(): Boolean = consent?.snapshot?.privacyOptionsRequired == true
    fun consentStatusJson(): JSONObject = consent?.json() ?: JSONObject().apply {
        put("success", false); put("error", "ads_disabled")
        put("canRequestAds", false); put("consentStatus", "UNKNOWN")
        put("privacyOptionsRequired", false); put("privacyOptionsStatus", "UNKNOWN")
        put("inProgress", false); put("debugEnabled", false)
    }
    fun initializeFromJs() {
        mainHandler.post {
            emit("adResult", consentStatusJson().put("initialized", isInitialized))
        }
    }
    fun showPrivacyOptions() {
        mainHandler.post {
            consent?.showPrivacyOptions() ?: emit("privacyOptionsResult", consentStatusJson())
        }
    }
    fun resetConsent() {
        mainHandler.post {
            consent?.resetConsent() ?: emit("consentResetResult", consentStatusJson())
        }
    }

    private fun onConsentChanged(snapshot: ConsentSnapshot) {
        if (destroyed) return
        val wasAllowed = consentWasAllowed
        consentWasAllowed = snapshot.canRequestAds
        if (!snapshot.canRequestAds) {
            if (wasAllowed) {
                adEpoch++
                activeLoads.forEach { (format, action) ->
                    val key = loadingKey[format].orEmpty()
                    if (!pendingLoads.contains(format)) pendingLoads.put(format) { withAdPermission(format, key, action) }
                    emit("adDeferred", adEventJson(format, "").put("error", "consent_pending"))
                }
                activeLoads.clear()
                loading.clear()
                loadingKey.clear()
                removeBanner() // stop SDK banner refresh too while the form is active
                interstitialAd = null
                rewardedAd = null
                initialLoadsScheduled = false
                mainHandler.removeCallbacks(autoShowRunnable)
            }
            if (!snapshot.inProgress) failPending("consent_required")
        } else {
            initializeSdkOnce()
            flushLoads()
        }
    }

    private fun initializeSdkOnce() {
        if (initializationStarted || destroyed) return
        initializationStarted = true
        try {
            MobileAds.setRequestConfiguration(adRequestConfiguration(config))
            MobileAds.initialize(activity) { status ->
                mainHandler.post {
                    if (destroyed || activity.isFinishing || activity.isDestroyed) return@post
                    isInitialized = true
                    val adapters = status.adapterStatusMap
                    val notReady = adapters.values.count { it.initializationState != AdapterStatus.State.READY }
                    emit("admobInitialized", JSONObject().apply {
                        put("success", notReady == 0); put("adapterCount", adapters.size)
                        put("notInitialized", notReady)
                        put("error", if (notReady > 0) "adapter_not_initialized" else "")
                    })
                    flushLoads()
                }
            }
        } catch (e: Exception) {
            initializationError = "ad_initialization_failed"
            Log.e("AdMobBridge", "Ad initialization failed", e)
            failPending("ad_initialization_failed")
            emit("adInitFailed", JSONObject().put("error", "ad_initialization_failed"))
        }
    }

    private fun flushLoads() {
        if (destroyed || !isInitialized || consent?.canLoadAds() != true) return
        if (!initialLoadsScheduled) {
            initialLoadsScheduled = true
            bannerId?.let { id -> if (!pendingLoads.contains("banner")) pendingLoads.put("banner") { loadBanner(id, config.admobBannerPosition) } }
            interstitialId?.let { id -> if (!pendingLoads.contains("interstitial")) pendingLoads.put("interstitial") { loadInterstitial(id) } }
            rewardedId?.let { id -> if (!pendingLoads.contains("rewarded")) pendingLoads.put("rewarded") { loadRewarded(id) } }
            scheduleAutoShowInterstitial()
        }
        pendingLoads.drain().forEach { it() }
    }

    private fun failPending(error: String) {
        pendingLoads.clear().forEach { format ->
            emit("adFailedToLoad", adEventJson(format, "").put("error", error).put("message", error))
        }
    }

    private fun withAdPermission(format: String, key: String, action: () -> Unit) {
        mainHandler.post {
            if (destroyed || activity.isDestroyed || activity.isFinishing) {
                emit("adFailedToLoad", adEventJson(format, "").put("error", "activity_destroyed"))
            } else if (!isEnabled) {
                emit("adFailedToLoad", adEventJson(format, "").put("error", "ads_disabled"))
            } else if (initializationError != null) {
                emit("adFailedToLoad", adEventJson(format, "").put("error", initializationError))
            } else if (loading.containsKey(format) && loadingKey[format] == key && consent?.canLoadAds() == true) {
                // The same unit is already being requested (e.g. HTML asks for the ad the
                // native start-up load is fetching). Its adLoaded/adFailedToLoad answers both.
                emit("adDeferred", adEventJson(format, "").put("error", "already_loading"))
            } else if (consent?.canLoadAds() != true || !isInitialized || loading.containsKey(format)) {
                if (consent?.snapshot?.inProgress == false && !canRequestAds()) {
                    emit("adFailedToLoad", adEventJson(format, "").put("error", "consent_required"))
                } else {
                    val replaced = pendingLoads.put(format) { withAdPermission(format, key, action) }
                    emit("adDeferred", adEventJson(format, "").put("error", if (replaced) "superseded" else "consent_or_sdk_pending"))
                }
            } else {
                try {
                    loadingKey[format] = key
                    activeLoads[format] = action
                    action()
                } catch (e: Exception) {
                    activeLoads.remove(format)
                    loading.remove(format)
                    emit("adFailedToLoad", adEventJson(format, "").put("error", "ad_load_failed").put("message", e.message.orEmpty()))
                }
            }
        }
    }

    private fun beginLoad(format: String): Long = (++ticketCounter).also { loading[format] = it }
    private fun acceptLoad(format: String, ticket: Long, epoch: Long): Boolean =
        !destroyed && adEpoch == epoch && loading[format] == ticket && consent?.canLoadAds() == true
    private fun finishLoad(format: String, ticket: Long) {
        if (loading[format] == ticket) {
            loading.remove(format)
            activeLoads.remove(format)
            mainHandler.post { flushLoads() }
        }
    }
    private fun allowShow(format: String): Boolean {
        if (!destroyed && !activity.isFinishing && !activity.isDestroyed && resumed && isInitialized && consent?.canLoadAds() == true) return true
        emit("adFailedToShow", adEventJson(format, "").put("error",
            if (destroyed || activity.isFinishing || activity.isDestroyed) "activity_destroyed" else if (!resumed) "activity_not_resumed" else if (!isEnabled) "ads_disabled" else if (consent?.snapshot?.inProgress == true) "consent_pending" else "consent_required"))
        return false
    }

    private fun runOnUiThread(action: () -> Unit) {
        mainHandler.post(action)
    }

    private fun buildAdRequest(): AdRequest {
        return AdRequest.Builder().build()
    }

    // --- Banner ---

    fun loadBanner(adUnitId: String, position: String) {
        val unitId = adUnitIdForRequest(config, "banner", adUnitId)
        if (!isEnabled) {
            emitAdError("adFailedToLoad", "AdMob not configured", "banner")
            return
        }
        withAdPermission("banner", "$unitId|$position") {
            val ticket = beginLoad("banner")
            val epoch = adEpoch
            removeBanner()
            bannerPosition = when {
                position == "top" -> "top"
                position == "bottom" -> "bottom"
                config.admobBannerPosition == "top" -> "top"
                else -> "bottom"
            }
            val adView = AdView(activity).apply {
                this.adUnitId = unitId
                setAdSize(AdSize.BANNER)
            }
            bannerAdView = adView
            adView.adListener = object : AdListener() {
                override fun onAdLoaded() {
                    if (destroyed || adEpoch != epoch || bannerAdView !== adView || consent?.canLoadAds() != true) return
                    finishLoad("banner", ticket)
                    bannerLoaded = true
                    emit("adLoaded", adEventJson("banner", unitId))
                }

                override fun onAdFailedToLoad(error: LoadAdError) {
                    if (destroyed || adEpoch != epoch || bannerAdView !== adView || consent?.canLoadAds() != true) return
                    finishLoad("banner", ticket)
                    bannerLoaded = false
                    emit("adFailedToLoad", adEventJson("banner", unitId).apply {
                        put("code", error.code)
                        put("message", error.message)
                    })
                }
            }
            adView.loadAd(buildAdRequest())
            if (bannerWanted) attachVisibleBanner()
        }
    }

    fun showBanner() {
        if (!isEnabled) {
            emitAdError("adFailedToLoad", "AdMob is disabled in Project Settings (Step 8: Ads). Please enable AdMob to display ads.", "banner")
            return
        }
        runOnUiThread {
            bannerWanted = true
            attachVisibleBanner()
        }
    }

    private fun attachVisibleBanner() {
            if (!bannerWanted || !resumed || destroyed) return
            if (!allowShow("banner")) {
                bannerId?.let { loadBanner(it, bannerPosition) }
                return
            }
            val adView = bannerAdView ?: run {
                bannerId?.let { id ->
                    loadBanner(id, bannerPosition)
                } ?: emitAdError("adFailedToLoad", "Banner ad is not enabled in Project Settings.", "banner")
                return
            }
            val root = activity.findViewById<FrameLayout>(android.R.id.content)
                ?: activity.findViewById<View>(R.id.webview)?.parent as? FrameLayout
            root?.let { attachBanner(it, adView) }
            adView.visibility = View.VISIBLE
            activity.updateBannerPadding(true, bannerPosition == "top")
    }

    fun hideBanner() {
        runOnUiThread {
            bannerWanted = false
            bannerAdView?.visibility = View.GONE
            activity.updateBannerPadding(false, bannerPosition == "top")
        }
    }

    private fun removeBanner() {
        bannerAdView?.let { old ->
            old.parent?.let { (it as? FrameLayout)?.removeView(old) }
            old.destroy()
        }
        bannerAdView = null
        bannerLoaded = false
        activity.updateBannerPadding(false, bannerPosition == "top")
    }

    fun setBannerPosition(position: String) {
        runOnUiThread {
            val pos = if (position.equals("top", ignoreCase = true)) "top" else "bottom"
            if (bannerPosition != pos) {
                bannerPosition = pos
                val adView = bannerAdView ?: return@runOnUiThread
                val parent = adView.parent as? FrameLayout
                if (parent != null) {
                    parent.removeView(adView)
                    attachBanner(parent, adView)
                }
            }
        }
    }

    fun updateBannerMargins() {
        runOnUiThread {
            val adView = bannerAdView ?: return@runOnUiThread
            val isTop = bannerPosition == "top"
            val insets = activity.getSystemBarInsets()
            val actionBarHeight = activity.getTopActionBarHeight()
            (adView.layoutParams as? FrameLayout.LayoutParams)?.let { params ->
                params.gravity = (if (isTop) Gravity.TOP else Gravity.BOTTOM) or Gravity.CENTER_HORIZONTAL
                if (isTop) {
                    params.topMargin = if (actionBarHeight > 0) actionBarHeight else insets.top
                    params.bottomMargin = 0
                } else {
                    params.topMargin = 0
                    params.bottomMargin = insets.bottom
                }
                adView.layoutParams = params
            }
        }
    }

    private fun attachBanner(root: FrameLayout, adView: AdView) {
        if (adView.parent != null) return
        val isTop = bannerPosition == "top"
        val insets = activity.getSystemBarInsets()
        val actionBarHeight = activity.getTopActionBarHeight()
        val params = FrameLayout.LayoutParams(
            FrameLayout.LayoutParams.WRAP_CONTENT,
            FrameLayout.LayoutParams.WRAP_CONTENT
        ).apply {
            gravity = (if (isTop) Gravity.TOP else Gravity.BOTTOM) or Gravity.CENTER_HORIZONTAL
            if (isTop) {
                topMargin = if (actionBarHeight > 0) actionBarHeight else insets.top
            } else {
                bottomMargin = insets.bottom
            }
        }
        root.addView(adView, params)
        activity.updateBannerPadding(true, isTop)
    }

    // --- Interstitial ---

    fun loadInterstitial(adUnitId: String) {
        val unitId = adUnitIdForRequest(config, "interstitial", adUnitId)
        if (!isEnabled) {
            emitAdError("adFailedToLoad", "AdMob not configured", "interstitial")
            return
        }
        withAdPermission("interstitial", unitId) {
            val ticket = beginLoad("interstitial")
            val epoch = adEpoch
            InterstitialAd.load(activity, unitId, buildAdRequest(), object : InterstitialAdLoadCallback() {
                override fun onAdLoaded(ad: InterstitialAd) {
                    if (!acceptLoad("interstitial", ticket, epoch)) return
                    finishLoad("interstitial", ticket)
                    interstitialAd = ad
                    ad.fullScreenContentCallback = fullScreenCallback("interstitial", unitId, ad)
                    emit("adLoaded", adEventJson("interstitial", unitId))
                }

                override fun onAdFailedToLoad(error: LoadAdError) {
                    if (!acceptLoad("interstitial", ticket, epoch)) return
                    finishLoad("interstitial", ticket)
                    interstitialAd = null
                    emit("adFailedToLoad", adEventJson("interstitial", unitId).apply {
                        put("code", error.code)
                        put("message", error.message)
                    })
                }
            })
        }
    }

    fun showInterstitial() {
        if (!isEnabled) {
            emitAdError("adFailedToShow", "AdMob is disabled in Project Settings (Step 8: Ads). Please enable AdMob to display ads.", "interstitial")
            return
        }
        runOnUiThread {
            if (!allowShow("interstitial")) return@runOnUiThread
            if (!canShowInterstitialNow()) {
                emit("adSkipped", adEventJson("interstitial", "").put("reason", "frequency_capped"))
                return@runOnUiThread
            }
            val ad = interstitialAd
            val id = interstitialId
            if (ad != null) {
                lastInterstitialShowTime = System.currentTimeMillis()
                ad.show(activity)
            } else {
                if (id != null) {
                    loadInterstitial(id)
                    emit("adFailedToShow", adEventJson("interstitial", id).apply {
                        put("message", "Interstitial ad is loading in background. Please try again in a few seconds.")
                    })
                } else {
                    emit("adFailedToShow", adEventJson("interstitial", "").apply {
                        put("message", "Interstitial ad is not enabled in Project Settings.")
                    })
                }
            }
        }
    }

    private fun canShowInterstitialNow(): Boolean {
        val intervalMs = config.admobInterstitialIntervalSeconds * 1000L
        if (intervalMs <= 0) return true
        return System.currentTimeMillis() - lastInterstitialShowTime >= intervalMs
    }

    private fun scheduleAutoShowInterstitial() {
        mainHandler.removeCallbacks(autoShowRunnable)
        val intervalMs = config.admobInterstitialIntervalSeconds * 1000L
        if (!destroyed && resumed && isInitialized && canRequestAds() && intervalMs > 0) {
            mainHandler.postDelayed(autoShowRunnable, intervalMs)
        }
    }

    private fun autoShowInterstitialTick() {
        val id = interstitialId ?: return
        if (canShowInterstitialNow()) {
            if (interstitialAd != null) {
                showInterstitial()
            } else {
                loadInterstitial(id)
            }
        }
        scheduleAutoShowInterstitial()
    }

    // Called from MainActivity on each page load
    fun onPageLoaded() {
        val pageCount = config.admobInterstitialPageCount
        if (pageCount <= 0) return
        pageLoadCounter++
        if (pageLoadCounter >= pageCount) {
            pageLoadCounter = 0
            val id = interstitialId ?: return
            if (interstitialAd != null) {
                showInterstitial()
            } else {
                loadInterstitial(id)
            }
        }
    }

    // --- Rewarded ---

    fun loadRewarded(adUnitId: String) {
        val unitId = adUnitIdForRequest(config, "rewarded", adUnitId)
        if (!isEnabled) {
            emitAdError("adFailedToLoad", "AdMob not configured", "rewarded")
            return
        }
        withAdPermission("rewarded", unitId) {
            val ticket = beginLoad("rewarded")
            val epoch = adEpoch
            RewardedAd.load(activity, unitId, buildAdRequest(), object : RewardedAdLoadCallback() {
                override fun onAdLoaded(ad: RewardedAd) {
                    if (!acceptLoad("rewarded", ticket, epoch)) return
                    finishLoad("rewarded", ticket)
                    rewardedAd = ad
                    ad.fullScreenContentCallback = fullScreenCallback("rewarded", unitId, ad)
                    emit("adLoaded", adEventJson("rewarded", unitId))
                }

                override fun onAdFailedToLoad(error: LoadAdError) {
                    if (!acceptLoad("rewarded", ticket, epoch)) return
                    finishLoad("rewarded", ticket)
                    rewardedAd = null
                    emit("adFailedToLoad", adEventJson("rewarded", unitId).apply {
                        put("code", error.code)
                        put("message", error.message)
                    })
                }
            })
        }
    }

    fun showRewarded(customCallback: String? = null) {
        runOnUiThread {
            if (!allowShow("rewarded")) return@runOnUiThread
            if (!isEnabled) {
                emitAdError("adFailedToShow", "AdMob is disabled in Project Settings (Step 8: Ads). Please enable AdMob to display ads.", "rewarded")
                return@runOnUiThread
            }
            val ad = rewardedAd
            val id = rewardedId
            if (ad != null) {
                val epoch = adEpoch
                ad.show(activity, OnUserEarnedRewardListener { reward ->
                    if (destroyed || activity.isDestroyed || activity.isFinishing || adEpoch != epoch) return@OnUserEarnedRewardListener
                    val data = JSONObject().apply {
                        put("type", reward.type)
                        put("amount", reward.amount)
                    }
                    emit("rewardEarned", data)
                    customCallback?.takeIf { activity.isTrustedPageShown() }?.let { cb ->
                        val script = "window.${cb} && window.${cb}(${reward.amount}, ${JSONObject.quote(reward.type)})"
                        activity.webView.evaluateJavascript(script, null)
                    }
                })
            } else {
                if (id != null) {
                    loadRewarded(id)
                    emit("adFailedToShow", adEventJson("rewarded", id).apply {
                        put("message", "Rewarded ad is loading in background. Please try again in a few seconds.")
                    })
                } else {
                    emit("adFailedToShow", adEventJson("rewarded", "").apply {
                        put("message", "Rewarded ad is not enabled in Project Settings.")
                    })
                }
            }
        }
    }

    // --- Lifecycle ---

    fun onPause() {
        resumed = false
        mainHandler.removeCallbacks(autoShowRunnable)
        bannerAdView?.pause()
    }

    fun onResume() {
        resumed = true
        mainHandler.post { if (resumed && !destroyed) consent?.onResume() }
        bannerAdView?.resume()
        if (bannerWanted && bannerAdView != null) attachVisibleBanner()
        scheduleAutoShowInterstitial()
    }

    fun destroy() {
        destroyed = true
        adEpoch++
        mainHandler.removeCallbacksAndMessages(null)
        consent?.destroy()
        failPending("activity_destroyed")
        activeLoads.keys.forEach { emit("adFailedToLoad", adEventJson(it, "").put("error", "activity_destroyed")) }
        activeLoads.clear()
        loading.clear()
        removeBanner()
        interstitialAd = null
        rewardedAd = null
    }

    // --- Helpers ---

    private fun fullScreenCallback(type: String, adUnitId: String, ad: Any): com.google.android.gms.ads.FullScreenContentCallback {
        val epoch = adEpoch
        return object : com.google.android.gms.ads.FullScreenContentCallback() {
            override fun onAdClicked() {}
            override fun onAdDismissedFullScreenContent() {
                if (destroyed || activity.isFinishing || activity.isDestroyed || adEpoch != epoch) return
                emit("adDismissed", adEventJson(type, adUnitId))
                if (type == "interstitial") {
                    if (interstitialAd === ad) interstitialAd = null
                    val id = interstitialId
                    if (interstitialAd == null && id != null && (config.admobAutoLoadInterstitial || config.admobInterstitialIntervalSeconds > 0 || config.admobInterstitialPageCount > 0)) {
                        loadInterstitial(id)
                    }
                }
                if (type == "rewarded") {
                    if (rewardedAd === ad) rewardedAd = null
                    val id = rewardedId
                    if (rewardedAd == null && id != null && (config.admobAutoLoadRewarded || config.admobRewardedEnabled)) {
                        loadRewarded(id)
                    }
                }
            }

            override fun onAdFailedToShowFullScreenContent(error: com.google.android.gms.ads.AdError) {
                if (destroyed || activity.isFinishing || activity.isDestroyed || adEpoch != epoch) return
                emit("adFailedToShow", adEventJson(type, adUnitId).apply {
                    put("code", error.code)
                    put("message", error.message)
                })
                if (type == "interstitial") {
                    if (interstitialAd === ad) interstitialAd = null
                    if (interstitialAd == null) interstitialId?.let { loadInterstitial(it) }
                }
                if (type == "rewarded") {
                    if (rewardedAd === ad) rewardedAd = null
                    if (rewardedAd == null) rewardedId?.let { loadRewarded(it) }
                }
            }

            override fun onAdImpression() {}
            override fun onAdShowedFullScreenContent() {
                emit("adShowedFullScreenContent", adEventJson(type, adUnitId))
            }
        }
    }

    private fun adEventJson(type: String, adUnitId: String): JSONObject {
        return JSONObject().apply {
            put("type", type)
            put("adUnitId", adUnitId)
        }
    }

    private fun emitAdError(event: String, message: String, type: String) {
        emit(event, adEventJson(type, "").apply { put("message", message) })
    }
}
