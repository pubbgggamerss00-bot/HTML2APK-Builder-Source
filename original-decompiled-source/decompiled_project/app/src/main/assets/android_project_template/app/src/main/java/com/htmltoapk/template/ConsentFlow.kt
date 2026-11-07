package {{packageName}}

/** SDK adapter is deliberately small so sequencing and cached-consent errors are testable. */
internal interface ConsentBackend {
    val canRequestAds: Boolean
    val consentStatus: String
    val privacyOptionsStatus: String
    fun update(success: () -> Unit, failure: (String) -> Unit)
    fun requiredForm(done: (String?) -> Unit)
    fun privacyForm(done: (String?) -> Unit)
    fun reset()
}

internal data class ConsentSnapshot(
    val canRequestAds: Boolean = false,
    val consentStatus: String = "UNKNOWN",
    val privacyOptionsStatus: String = "UNKNOWN",
    val inProgress: Boolean = false,
    val error: String = ""
) {
    val privacyOptionsRequired get() = privacyOptionsStatus == "REQUIRED"
}

/** All transitions run on main. Only the immutable snapshot is read by JavaBridge threads. */
internal class ConsentFlow(
    private val backend: ConsentBackend,
    private val changed: (ConsentSnapshot) -> Unit
) {
    // Avoid a shell-owned enum array descriptor: generated APKs relocate our
    // package. Integer states have no synthetic enum $values() array to relocate.
    private object Phase {
        const val IDLE = 0
        const val UPDATING = 1
        const val FORM = 2
        const val OPTIONS = 3
        const val COMPLETE = 4
        const val DESTROYED = 5
    }
    private var phase = Phase.IDLE
    private var generation = 0
    private var updateInvoked = false
    private var blockForRequiredForm = false
    @Volatile var snapshot = ConsentSnapshot()
        private set

    fun start() {
        if (phase != Phase.IDLE) return
        phase = Phase.UPDATING
        val token = ++generation
        publish()
        try {
            backend.update({
                if (generation != token || phase != Phase.UPDATING) return@update
                updateInvoked = true
                // A successful cached-consent refresh often needs no form. Do not
                // revoke/reload already requested ads for that immediate SDK check.
                blockForRequiredForm = backend.consentStatus == "REQUIRED" || !backend.canRequestAds
                phase = Phase.FORM
                publish()
                try {
                    backend.requiredForm { error ->
                        if (generation == token && phase == Phase.FORM) {
                            phase = Phase.COMPLETE
                            publish(error.orEmpty())
                        }
                    }
                } catch (_: Exception) {
                    if (generation == token && phase == Phase.FORM) {
                        phase = Phase.COMPLETE
                        publish("consent_form_failed")
                    }
                }
            }, { error ->
                if (generation == token && phase == Phase.UPDATING) {
                    updateInvoked = true
                    phase = Phase.COMPLETE
                    publish(error)
                }
            })
            // UMP restores the previous session synchronously after update() is invoked.
            // This is Google's cached-consent fast path, never a locally fabricated grant.
            updateInvoked = true
            if (generation == token && phase == Phase.UPDATING) publish()
        } catch (_: Exception) {
            if (generation == token && phase == Phase.UPDATING) {
                phase = Phase.COMPLETE
                publish("consent_update_failed")
            }
        }
    }

    fun privacyOptions(done: (String?) -> Unit) {
        if (phase == Phase.DESTROYED) { done("activity_destroyed"); return }
        if (phase != Phase.COMPLETE) { done("consent_in_progress"); return }
        if (!snapshot.privacyOptionsRequired) { done("privacy_options_not_required"); return }
        val token = ++generation
        phase = Phase.OPTIONS
        publish()
        try {
            backend.privacyForm { error ->
                if (generation == token && phase == Phase.OPTIONS) {
                    phase = Phase.COMPLETE
                    publish(error.orEmpty())
                    done(error)
                }
            }
        } catch (_: Exception) {
            phase = Phase.COMPLETE
            publish("privacy_options_failed")
            done("privacy_options_failed")
        }
    }

    fun reset(): Boolean {
        if (phase != Phase.COMPLETE) return false
        backend.reset()
        phase = Phase.IDLE
        updateInvoked = false
        generation++
        publish()
        start()
        return true
    }

    fun refresh(): ConsentSnapshot {
        if (phase != Phase.DESTROYED) publish(snapshot.error)
        return snapshot
    }

    fun destroy() {
        generation++
        phase = Phase.DESTROYED
        snapshot = ConsentSnapshot(error = "activity_destroyed")
    }

    private fun publish(error: String = "") {
        val queried = updateInvoked && phase != Phase.IDLE && phase != Phase.DESTROYED
        val next = ConsentSnapshot(
            canRequestAds = queried && !(phase == Phase.FORM && blockForRequiredForm) && phase != Phase.OPTIONS && backend.canRequestAds,
            consentStatus = if (queried) backend.consentStatus else "UNKNOWN",
            privacyOptionsStatus = if (queried) backend.privacyOptionsStatus else "UNKNOWN",
            inProgress = phase == Phase.UPDATING || phase == Phase.FORM || phase == Phase.OPTIONS,
            error = error
        )
        if (next != snapshot) { snapshot = next; changed(next) }
    }
}

/** At most one pending load per format; a newer request supersedes the old one. */
internal class PendingAdLoads {
    private val loads = linkedMapOf<String, () -> Unit>()
    fun put(format: String, action: () -> Unit): Boolean = loads.put(format, action) != null
    fun contains(format: String) = loads.containsKey(format)
    fun drain(): List<() -> Unit> = loads.values.toList().also { loads.clear() }
    fun clear(): Set<String> = loads.keys.toSet().also { loads.clear() }
}
