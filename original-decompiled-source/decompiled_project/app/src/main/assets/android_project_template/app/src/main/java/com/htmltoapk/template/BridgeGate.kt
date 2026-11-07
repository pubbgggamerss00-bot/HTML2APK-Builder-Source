package {{packageName}}

import android.util.Log
import java.net.IDN
import java.security.MessageDigest
import java.security.SecureRandom
import java.util.Locale
import java.util.concurrent.ConcurrentHashMap

/**
 * Uygulamanin kendi sayfalarinin origin'leri: yerel modda appassets, URL modunda baslangic adresinin
 * host'u ve alt alan adlari ("www." atilir, ust alan adina cikilmaz: foo.github.io github.io'yu acmasin).
 */
internal class TrustedOrigins private constructor(private val rules: List<Rule>) {

    private data class Rule(val scheme: String, val host: String, val port: Int, val subdomains: Boolean)

    fun matches(url: String?): Boolean {
        val origin = parseOrigin(url ?: return false) ?: return false
        return rules.any { rule ->
            rule.scheme == origin.scheme && rule.port == origin.port &&
                (origin.host == rule.host || (rule.subdomains && origin.host.endsWith(".${rule.host}")))
        }
    }

    /** WebViewCompat.addDocumentStartJavaScript allowedOriginRules bicimi. */
    fun documentStartRules(): Set<String> = rules.flatMap { rule ->
        val port = if (rule.port == defaultPort(rule.scheme)) "" else ":${rule.port}"
        val exact = "${rule.scheme}://${rule.host}$port"
        if (rule.subdomains) listOf(exact, "${rule.scheme}://*.${rule.host}$port") else listOf(exact)
    }.toSet()

    fun isEmpty(): Boolean = rules.isEmpty()

    private data class Origin(val scheme: String, val host: String, val port: Int)

    companion object {
        const val LOCAL_HOST = "appassets.androidplatform.net"

        private val ORIGIN_PATTERN =
            Regex("^([a-zA-Z][a-zA-Z0-9+.-]*)://(?:[^/?#@]*@)?(\\[[^\\]]+\\]|[^/?#:]+)(?::(\\d+))?")

        fun local(): TrustedOrigins = TrustedOrigins(listOf(Rule("https", LOCAL_HOST, 443, false)))

        fun forUrl(startUrl: String): TrustedOrigins {
            val origin = parseOrigin(startUrl.trim()) ?: return TrustedOrigins(emptyList())
            val host = origin.host
            val isNamedHost = host.contains('.') && !host.startsWith("[") && !host.all { it.isDigit() || it == '.' }
            val base = if (isNamedHost && host.startsWith("www.") && host.count { it == '.' } >= 2) {
                host.removePrefix("www.")
            } else {
                host
            }
            // Vararg mutableListOf(...) olusturmayin: Rule[] dizisi DEX'e [Lcom/htmltoapk/template/...; olarak
            // girer, DexRepackager onu tasimaz ve uretilen APK acilista ClassNotFoundException ile coker.
            val rules = ArrayList<Rule>(2)
            rules += Rule("https", base, if (origin.scheme == "https") origin.port else 443, isNamedHost)
            // http ile girilmis site http'de kalabilir; https adresine http asla guvenilmez.
            if (origin.scheme == "http") rules += Rule("http", base, origin.port, isNamedHost)
            return TrustedOrigins(rules)
        }

        private fun parseOrigin(url: String): Origin? {
            val match = ORIGIN_PATTERN.find(url) ?: return null
            val scheme = match.groupValues[1].lowercase(Locale.ROOT)
            if (scheme != "http" && scheme != "https") return null
            val rawHost = match.groupValues[2].lowercase(Locale.ROOT).trimEnd('.')
            if (rawHost.isEmpty()) return null
            val host = if (rawHost.startsWith("[")) rawHost else try {
                IDN.toASCII(rawHost).lowercase(Locale.ROOT)
            } catch (_: IllegalArgumentException) {
                return null
            }
            val port = match.groupValues[3].takeIf { it.isNotEmpty() }?.toIntOrNull() ?: defaultPort(scheme)
            return Origin(scheme, host, port)
        }

        private fun defaultPort(scheme: String): Int = if (scheme == "http") 80 else 443
    }
}

/**
 * AndroidAPI'yi uygulamanin kendi origin'ine kilitler.
 *
 * addJavascriptInterface nesneyi her belgeye ve her iframe'e verir; dis bir siteye gecildiginde ya da sayfada
 * reklam/gomulu iframe varsa o kod readAppFile, getLocation, httpGet... cagirabiliyordu. Java tarafi cagiran
 * frame'i goremez, bu yuzden:
 *  - DOCUMENT_START_SCRIPT varsa yalniz guvenilen origin'lere giden [documentStartScript] AndroidAPI'yi her
 *    cagrida gizli anahtarla kapiyi acip kapatan bir Proxy ile degistirir. Anahtarsiz (ham nesneye) gelen
 *    cagrilar reddedilir. Renderer'da JS tek is parcaciginda calistigi icin baska bir frame ac/kapa arasina
 *    giremez.
 *  - Yoksa (cok eski WebView) yalniz ana belgenin adresine bakilir.
 * Ana is parcacigindan gelen cagrilar yereldir (activity, izin sonuclari) ve her zaman gecer.
 */
internal class BridgeGate(
    private val origins: TrustedOrigins,
    private val isNativeCaller: () -> Boolean,
    /** Proje ayari (bridgeOwnOriginOnly); kapaliysa her sayfa ve iframe eskisi gibi tum API'yi kullanir. */
    val enforced: Boolean = true,
    private val token: String = newToken()
) {
    @Volatile var scriptScoped = false
        private set
    @Volatile private var mainFrameUrl: String? = null
    @Volatile private var openThread: Thread? = null
    @Volatile private var openedAtNanos = 0L
    private val loggedDenials = ConcurrentHashMap.newKeySet<String>()

    val documentStartRules: Set<String> get() = origins.documentStartRules()

    val documentStartScript: String
        get() = """
            (function() {
                if (window.__htmlToApkBridgeGate) return;
                var raw = window.AndroidAPI;
                if (!raw || typeof raw.$ENTER !== 'function') return;
                var token = '$token';
                var wrapped = {};
                var api = new Proxy(raw, {
                    get: function(target, name) {
                        if (name === '$ENTER' || name === '$EXIT') return undefined;
                        var value = target[name];
                        if (typeof name !== 'string' || typeof value !== 'function') return value;
                        if (!wrapped[name]) {
                            wrapped[name] = function() {
                                target.$ENTER(token);
                                try { return value.apply(target, arguments); }
                                finally { target.$EXIT(); }
                            };
                        }
                        return wrapped[name];
                    }
                });
                window.AndroidAPI = api;
                if (window.AndroidAPI !== api) {
                    try {
                        Object.defineProperty(window, 'AndroidAPI', { value: api, writable: true, configurable: true });
                    } catch (_) {}
                }
                Object.defineProperty(window, '__htmlToApkBridgeGate', { value: true });
            })();
        """.trimIndent()

    fun onDocumentStartScriptInstalled() {
        scriptScoped = true
    }

    /** Ana belge adresi; yalniz [scriptScoped] degilken cagri karari ve her zaman olay teslimi icin. */
    fun onMainFrameUrl(url: String?) {
        mainFrameUrl = url
    }

    fun isTrustedPage(url: String?): Boolean = !enforced || origins.matches(url)

    fun enter(candidate: String?) {
        val ok = candidate != null &&
            MessageDigest.isEqual(candidate.toByteArray(Charsets.UTF_8), token.toByteArray(Charsets.UTF_8))
        openedAtNanos = System.nanoTime()
        openThread = if (ok) Thread.currentThread() else null
    }

    fun exit() {
        openThread = null
    }

    fun allows(method: String): Boolean {
        if (!enforced || isNativeCaller()) return true
        val allowed = if (scriptScoped) {
            openThread === Thread.currentThread() && System.nanoTime() - openedAtNanos < OPEN_WINDOW_NANOS
        } else {
            origins.matches(mainFrameUrl)
        }
        if (!allowed && loggedDenials.add(method)) {
            try {
                Log.w(TAG, "AndroidAPI.$method blocked: caller is not the app's own origin")
            } catch (_: RuntimeException) {
                // JVM birim testlerinde android.util.Log yok.
            }
        }
        return allowed
    }

    companion object {
        private const val TAG = "BridgeGate"
        const val ENTER = "htmlToApkGateEnter"
        const val EXIT = "htmlToApkGateExit"
        // Kapi her cagrida hemen kapanir; bu sure yalniz EXIT hic gelmezse (sayfa olduruldu) ust sinirdir.
        private const val OPEN_WINDOW_NANOS = 30_000_000_000L

        private fun newToken(): String {
            val bytes = ByteArray(24)
            SecureRandom().nextBytes(bytes)
            return bytes.joinToString("") { "%02x".format(it) }
        }
    }
}
