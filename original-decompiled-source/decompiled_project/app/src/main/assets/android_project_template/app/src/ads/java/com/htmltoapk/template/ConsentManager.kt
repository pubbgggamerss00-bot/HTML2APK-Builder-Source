package {{packageName}}

import android.graphics.Color
import android.graphics.drawable.GradientDrawable
import android.util.Log
import android.view.Gravity
import android.view.View
import android.widget.FrameLayout
import android.widget.TextView
import androidx.lifecycle.Lifecycle
import com.google.android.ump.ConsentDebugSettings
import com.google.android.ump.ConsentInformation
import com.google.android.ump.ConsentRequestParameters
import com.google.android.ump.UserMessagingPlatform
import org.json.JSONObject

/** Activity-scoped UMP adapter. SDK and View calls are confined to the main thread. */
internal class ConsentManager(
    private val activity: MainActivity,
    private val config: MainActivity.DisplayConfig,
    private val emit: (String, JSONObject) -> Unit,
    private val changed: (ConsentSnapshot) -> Unit
) {
    private val information = UserMessagingPlatform.getConsentInformation(activity.applicationContext)
    val debugEnabled = config.admobUseTestAds && config.umpDebugEnabled
    private var pendingForm: (() -> Unit)? = null
    private var privacyButton: TextView? = null
    private var destroyed = false
    private var pendingPrivacyResult: ((String?) -> Unit)? = null

    private val backend = object : ConsentBackend {
        override val canRequestAds get() = information.canRequestAds()
        override val consentStatus get() = when (information.consentStatus) {
            ConsentInformation.ConsentStatus.NOT_REQUIRED -> "NOT_REQUIRED"
            ConsentInformation.ConsentStatus.REQUIRED -> "REQUIRED"
            ConsentInformation.ConsentStatus.OBTAINED -> "OBTAINED"
            else -> "UNKNOWN"
        }
        override val privacyOptionsStatus get() = information.privacyOptionsRequirementStatus.name
        override fun update(success: () -> Unit, failure: (String) -> Unit) {
            val params = ConsentRequestParameters.Builder()
                .setTagForUnderAgeOfConsent(config.admobUnderAgeOfConsent == 1)
            if (debugEnabled) {
                val debug = ConsentDebugSettings.Builder(activity)
                config.umpTestDeviceIds.forEach { debug.addTestDeviceHashedId(it) }
                debug.setDebugGeography(when (config.umpDebugGeography) {
                    "EEA" -> ConsentDebugSettings.DebugGeography.DEBUG_GEOGRAPHY_EEA
                    "REGULATED_US_STATE" -> ConsentDebugSettings.DebugGeography.DEBUG_GEOGRAPHY_REGULATED_US_STATE
                    "OTHER" -> ConsentDebugSettings.DebugGeography.DEBUG_GEOGRAPHY_OTHER
                    else -> ConsentDebugSettings.DebugGeography.DEBUG_GEOGRAPHY_DISABLED
                })
                params.setConsentDebugSettings(debug.build())
            }
            information.requestConsentInfoUpdate(activity, params.build(), success) { error ->
                Log.w("ConsentManager", "Consent update ${error.errorCode}: ${error.message}")
                failure("consent_update_failed")
            }
        }
        override fun requiredForm(done: (String?) -> Unit) {
            val show: () -> Unit = {
                try {
                    UserMessagingPlatform.loadAndShowConsentFormIfRequired(activity) { error ->
                        if (error != null) Log.w("ConsentManager", "Consent form ${error.errorCode}: ${error.message}")
                        done(if (error == null) null else "consent_form_failed")
                    }
                } catch (error: Exception) {
                    Log.w("ConsentManager", "Could not present consent form", error)
                    done("consent_form_failed")
                }
            }
            if (activity.lifecycle.currentState.isAtLeast(Lifecycle.State.RESUMED)) show()
            else pendingForm = show
        }
        override fun privacyForm(done: (String?) -> Unit) {
            UserMessagingPlatform.showPrivacyOptionsForm(activity) { error ->
                if (error != null) Log.w("ConsentManager", "Privacy options ${error.errorCode}: ${error.message}")
                done(if (error == null) null else "privacy_options_failed")
            }
        }
        override fun reset() = information.reset()
    }
    private val flow = ConsentFlow(backend) { snapshot ->
        updatePrivacyButton(snapshot)
        emit("consentStatusChanged", json(snapshot))
        changed(snapshot)
    }

    val snapshot get() = flow.snapshot
    fun start() { if (!destroyed && !activity.isFinishing && !activity.isDestroyed) flow.start() }
    fun canLoadAds(): Boolean = !destroyed && !activity.isFinishing && !activity.isDestroyed && flow.refresh().canRequestAds

    fun json(snapshot: ConsentSnapshot = this.snapshot, error: String = snapshot.error) = JSONObject().apply {
        put("success", error.isEmpty())
        put("error", error)
        put("canRequestAds", snapshot.canRequestAds)
        put("consentStatus", snapshot.consentStatus)
        put("privacyOptionsRequired", snapshot.privacyOptionsRequired)
        put("privacyOptionsStatus", snapshot.privacyOptionsStatus)
        put("inProgress", snapshot.inProgress)
        put("debugEnabled", debugEnabled)
    }

    fun showPrivacyOptions() {
        val error = when {
            destroyed || activity.isDestroyed || activity.isFinishing -> "activity_destroyed"
            !activity.lifecycle.currentState.isAtLeast(Lifecycle.State.RESUMED) -> "activity_not_resumed"
            pendingPrivacyResult != null -> "consent_in_progress"
            else -> null
        }
        if (error != null) { emit("privacyOptionsResult", json(error = error)); return }
        val result: (String?) -> Unit = { failure ->
            pendingPrivacyResult = null
            emit("privacyOptionsResult", json(error = failure.orEmpty()))
        }
        pendingPrivacyResult = result
        flow.privacyOptions(result)
    }

    fun resetConsent() {
        val error = when {
            destroyed || activity.isDestroyed || activity.isFinishing -> "activity_destroyed"
            !debugEnabled -> "debug_disabled"
            else -> null
        }
        if (error != null) { emit("consentResetResult", json(error = error)); return }
        try {
            val reset = flow.reset()
            emit("consentResetResult", json(error = if (reset) "" else "consent_in_progress"))
        } catch (_: Exception) { emit("consentResetResult", json(error = "consent_reset_failed")) }
    }

    fun onResume() {
        if (destroyed) return
        val show = pendingForm
        pendingForm = null
        show?.invoke()
        updatePrivacyButton(snapshot)
    }

    private fun updatePrivacyButton(snapshot: ConsentSnapshot) {
        if (destroyed || activity.isFinishing || activity.isDestroyed) return
        if (!snapshot.privacyOptionsRequired) {
            privacyButton?.visibility = View.GONE
            return
        }
        val root = activity.findViewById<FrameLayout>(android.R.id.content) ?: return
        val density = activity.resources.displayMetrics.density
        fun dp(value: Int) = (value * density).toInt()
        val button = privacyButton ?: TextView(activity).apply {
            text = activity.getString(R.string.ads_privacy_options)
            contentDescription = text
            textSize = 12f
            gravity = Gravity.CENTER
            setTextColor(Color.WHITE)
            setPadding(dp(12), 0, dp(12), 0)
            minimumHeight = dp(48)
            background = GradientDrawable().apply { cornerRadius = dp(24).toFloat(); setColor(0xdd303030.toInt()) }
            elevation = dp(4).toFloat()
            setOnClickListener { showPrivacyOptions() }
            root.addView(this)
            privacyButton = this
        }
        val top = activity.getSystemBarInsets().top + activity.getTopActionBarHeight() + dp(4)
        button.layoutParams = FrameLayout.LayoutParams(FrameLayout.LayoutParams.WRAP_CONTENT, dp(48), Gravity.TOP or Gravity.END).apply {
            topMargin = top
            marginEnd = dp(8)
        }
        button.visibility = View.VISIBLE
        button.isEnabled = !snapshot.inProgress
        button.bringToFront()
    }

    fun destroy() {
        destroyed = true
        pendingForm = null
        flow.destroy()
        pendingPrivacyResult?.invoke("activity_destroyed")
        pendingPrivacyResult = null
        privacyButton?.let { (it.parent as? FrameLayout)?.removeView(it) }
        privacyButton = null
    }
}
