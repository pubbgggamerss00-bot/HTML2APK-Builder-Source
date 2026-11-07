package {{packageName}}

import android.Manifest
import android.annotation.SuppressLint
import android.print.PrintManager
import android.print.PrintAttributes
import android.app.DownloadManager
import android.content.ContentValues
import android.content.Intent
import android.content.pm.ActivityInfo
import android.content.pm.PackageManager
import android.graphics.drawable.ColorDrawable
import android.net.Uri
import android.os.Build
import android.os.Bundle
import android.os.Environment
import android.os.Handler
import android.os.Looper
import android.os.Parcelable
import android.provider.MediaStore
import android.view.View
import android.view.ViewGroup
import android.view.Window
import android.view.WindowManager
import android.widget.FrameLayout
import android.widget.LinearLayout
import android.webkit.CookieManager
import android.webkit.GeolocationPermissions
import android.webkit.MimeTypeMap
import android.webkit.PermissionRequest
import android.webkit.ValueCallback
import android.webkit.ConsoleMessage
import android.webkit.WebChromeClient
import android.webkit.WebResourceError
import android.webkit.WebResourceRequest
import android.webkit.WebSettings
import android.webkit.URLUtil
import android.webkit.WebResourceResponse
import android.webkit.WebView
import android.webkit.WebViewClient
import android.widget.ImageView
import android.content.res.Configuration
import androidx.webkit.WebSettingsCompat
import androidx.webkit.WebViewAssetLoader
import androidx.webkit.WebViewCompat
import androidx.webkit.WebViewFeature
import android.widget.ProgressBar
import androidx.swiperefreshlayout.widget.CircularProgressDrawable
import android.util.Log
import androidx.activity.ComponentActivity
import androidx.activity.enableEdgeToEdge
import androidx.activity.addCallback
import androidx.activity.result.ActivityResultLauncher
import android.app.Dialog
import android.content.Context
import android.net.ConnectivityManager
import android.net.NetworkCapabilities
import android.widget.Toast
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout
import androidx.activity.result.contract.ActivityResultContracts
import androidx.camera.core.CameraSelector
import androidx.camera.core.ImageCapture
import androidx.camera.core.ImageCaptureException
import androidx.camera.core.Preview
import androidx.camera.lifecycle.ProcessCameraProvider
import androidx.camera.view.PreviewView
import androidx.core.content.ContextCompat
import androidx.core.content.FileProvider
import androidx.core.view.ViewCompat
import androidx.core.view.WindowCompat
import androidx.core.view.WindowInsetsCompat
import androidx.core.view.WindowInsetsControllerCompat
import androidx.core.view.updatePadding
import org.json.JSONObject
import java.io.ByteArrayOutputStream
import java.io.File
import java.io.IOException
import java.util.Locale
import java.util.concurrent.ExecutorService
import java.util.concurrent.Executors

private const val TAG = "MainActivity"
private const val PAGE_LOAD_TIMEOUT_MS = 20_000L
private const val CLEARTEXT_PROXY_PREFIX = "https://appassets.androidplatform.net/__cleartext_proxy__/?url="

private val CLEARTEXT_INTERCEPTOR_SCRIPT = """
    (function() {
        if (window.__htmlToApkCleartextHooked) return;
        window.__htmlToApkCleartextHooked = true;

        var PROXY_PREFIX = '$CLEARTEXT_PROXY_PREFIX';

        function toProxyUrl(url) {
            if (!url) return url;
            if (typeof url === 'string') {
                if (url.startsWith('http://')) {
                    return PROXY_PREFIX + encodeURIComponent(url);
                }
                return url;
            }
            try {
                var str = url.toString();
                if (str.startsWith('http://')) {
                    return PROXY_PREFIX + encodeURIComponent(str);
                }
            } catch (_) {}
            return url;
        }

        function fromProxyUrl(url) {
            if (!url || typeof url !== 'string') return url;
            if (url.startsWith(PROXY_PREFIX)) {
                try {
                    return decodeURIComponent(url.substring(PROXY_PREFIX.length));
                } catch (_) {}
            }
            return url;
        }

        if (typeof window.fetch === 'function') {
            var origFetch = window.fetch;
            window.fetch = function(input, init) {
                try {
                    if (typeof input === 'string') {
                        input = toProxyUrl(input);
                    } else if (typeof URL !== 'undefined' && input instanceof URL) {
                        input = toProxyUrl(input.toString());
                    } else if (input && typeof input.url === 'string' && input.url.startsWith('http://')) {
                        var newUrl = toProxyUrl(input.url);
                        input = new Request(newUrl, input);
                    }
                } catch (_) {}
                return origFetch.call(this, input, init);
            };
        }

        if (typeof window.XMLHttpRequest === 'function') {
            var origOpen = XMLHttpRequest.prototype.open;
            XMLHttpRequest.prototype.open = function(method, url, async, user, password) {
                this.__originalUrl = url;
                var proxied = toProxyUrl(typeof url === 'string' ? url : (url ? url.toString() : url));
                return origOpen.call(this, method, proxied, async !== false, user, password);
            };
        }

        try {
            var mediaProto = window.HTMLMediaElement && window.HTMLMediaElement.prototype;
            if (mediaProto) {
                var mediaSrcDesc = Object.getOwnPropertyDescriptor(mediaProto, 'src');
                if (mediaSrcDesc && mediaSrcDesc.set) {
                    var origMediaSet = mediaSrcDesc.set;
                    var origMediaGet = mediaSrcDesc.get;
                    Object.defineProperty(mediaProto, 'src', {
                        get: function() {
                            return fromProxyUrl(origMediaGet.call(this));
                        },
                        set: function(val) {
                            return origMediaSet.call(this, toProxyUrl(val));
                        },
                        configurable: true,
                        enumerable: true
                    });
                }
                var currentSrcDesc = Object.getOwnPropertyDescriptor(mediaProto, 'currentSrc');
                if (currentSrcDesc && currentSrcDesc.get) {
                    var origCurrentSrcGet = currentSrcDesc.get;
                    Object.defineProperty(mediaProto, 'currentSrc', {
                        get: function() {
                            return fromProxyUrl(origCurrentSrcGet.call(this));
                        },
                        configurable: true,
                        enumerable: true
                    });
                }
            }
        } catch (_) {}

        try {
            var sourceProto = window.HTMLSourceElement && window.HTMLSourceElement.prototype;
            if (sourceProto) {
                var sourceSrcDesc = Object.getOwnPropertyDescriptor(sourceProto, 'src');
                if (sourceSrcDesc && sourceSrcDesc.set) {
                    var origSourceSet = sourceSrcDesc.set;
                    var origSourceGet = sourceSrcDesc.get;
                    Object.defineProperty(sourceProto, 'src', {
                        get: function() {
                            return fromProxyUrl(origSourceGet.call(this));
                        },
                        set: function(val) {
                            return origSourceSet.call(this, toProxyUrl(val));
                        },
                        configurable: true,
                        enumerable: true
                    });
                }
            }
        } catch (_) {}

        try {
            var origSetAttr = Element.prototype.setAttribute;
            var origGetAttr = Element.prototype.getAttribute;
            Element.prototype.setAttribute = function(name, val) {
                if (typeof name === 'string' && name.toLowerCase() === 'src') {
                    var tag = this.tagName ? this.tagName.toLowerCase() : '';
                    if (tag === 'video' || tag === 'audio' || tag === 'source' || tag === 'img' || tag === 'iframe') {
                        val = toProxyUrl(val);
                    }
                }
                return origSetAttr.call(this, name, val);
            };
            Element.prototype.getAttribute = function(name) {
                var val = origGetAttr.call(this, name);
                if (typeof name === 'string' && name.toLowerCase() === 'src' && val) {
                    return fromProxyUrl(val);
                }
                return val;
            };
        } catch (_) {}

        function rewriteMediaElement(el) {
            try {
                if (!el || !el.getAttribute) return;
                var rawSrc = el.getAttribute('src');
                if (rawSrc && rawSrc.startsWith('http://')) {
                    el.src = toProxyUrl(rawSrc);
                }
            } catch (_) {}
        }

        function rewriteExistingTags() {
            try {
                var mediaEls = document.querySelectorAll('video, audio, source, img, iframe');
                for (var i = 0; i < mediaEls.length; i++) {
                    rewriteMediaElement(mediaEls[i]);
                }
            } catch (_) {}
        }

        if (document.readyState === 'loading') {
            document.addEventListener('DOMContentLoaded', rewriteExistingTags);
        } else {
            rewriteExistingTags();
        }

        try {
            if (typeof MutationObserver !== 'undefined') {
                var observer = new MutationObserver(function(mutations) {
                    for (var m = 0; m < mutations.length; m++) {
                        var mutation = mutations[m];
                        if (mutation.type === 'childList') {
                            for (var a = 0; a < mutation.addedNodes.length; a++) {
                                var node = mutation.addedNodes[a];
                                if (node.nodeType === 1) {
                                    var tag = node.tagName ? node.tagName.toLowerCase() : '';
                                    if (tag === 'video' || tag === 'audio' || tag === 'source' || tag === 'img' || tag === 'iframe') {
                                        rewriteMediaElement(node);
                                    }
                                    if (node.querySelectorAll) {
                                        var children = node.querySelectorAll('video, audio, source, img, iframe');
                                        for (var c = 0; c < children.length; c++) {
                                            rewriteMediaElement(children[c]);
                                        }
                                    }
                                }
                            }
                        }
                    }
                });
                observer.observe(document.documentElement || document, { childList: true, subtree: true });
            }
        } catch (_) {}
    })();
""".trimIndent()

private const val PRINT_INTERCEPTOR_SCRIPT = "window.print = function() { AndroidAPI.printPage(); };"

private const val WEB_COMPAT_BRIDGE_NAME = "HtmlToApkWebCompat"

// WebView'da olmayan (ya da hep reddeden) web API'lerini AndroidAPI karsiliklarina baglar; sayfa kodu
// Chrome'daki gibi navigator.share / Notification / screen.orientation.lock kullanmaya devam eder.
// AndroidAPI yoksa (popup) hicbir sey yapmaz.
private val WEB_API_SHIM_SCRIPT = """
    (function() {
        if (window.__htmlToApkWebApiShim || typeof AndroidAPI === 'undefined') return;
        window.__htmlToApkWebApiShim = true;
        var seq = 0;
        function nextId(prefix) { seq += 1; return prefix + '_' + Date.now() + '_' + seq; }
        function once(eventName, match, timeoutMs) {
            return new Promise(function(resolve, reject) {
                var timer = null;
                function handler(e) {
                    var d = e && e.detail;
                    if (match && !match(d)) return;
                    window.removeEventListener(eventName, handler);
                    if (timer) clearTimeout(timer);
                    resolve(d || {});
                }
                window.addEventListener(eventName, handler);
                if (timeoutMs) {
                    timer = setTimeout(function() {
                        window.removeEventListener(eventName, handler);
                        reject(new DOMException('Timed out', 'AbortError'));
                    }, timeoutMs);
                }
            });
        }

        // --- navigator.share ---
        if (!navigator.share) {
            var safeFileName = function(name) {
                var n = String(name || 'file').replace(/[\\\\/:*?"<>|]/g, '_').replace(/\.\.+/g, '_');
                return n || 'file';
            };
            var shareResult = function() {
                return once('shareResult', null, 30000).then(function(d) {
                    if (!d.success) throw new DOMException(d.error || 'share_failed', 'AbortError');
                });
            };
            navigator.canShare = function(data) {
                if (!data) return false;
                if (data.files && data.files.length) return data.files.length === 1;
                return !!(data.title || data.text || data.url);
            };
            navigator.share = function(data) {
                data = data || {};
                if (!navigator.canShare(data)) {
                    return Promise.reject(new TypeError('navigator.share: nothing to share'));
                }
                if (data.files && data.files.length) {
                    var file = data.files[0];
                    return new Promise(function(resolve, reject) {
                        var reader = new FileReader();
                        reader.onload = function() {
                            var pending = shareResult();
                            AndroidAPI.shareFileFromBase64(safeFileName(file.name), String(reader.result),
                                file.type || 'application/octet-stream');
                            pending.then(resolve, reject);
                        };
                        reader.onerror = function() { reject(new DOMException('read_failed', 'DataError')); };
                        reader.readAsDataURL(file);
                    });
                }
                var text = [data.title, data.text, data.url].filter(function(v) { return !!v; }).join('\n');
                var pending = shareResult();
                AndroidAPI.shareText(text);
                return pending;
            };
        }

        // --- Notification ---
        if (typeof window.Notification === 'undefined') {
            var NOTIF_PERMISSION = 'android.permission.POST_NOTIFICATIONS';
            var cachedPermission = null;
            var currentPermission = function() {
                if (cachedPermission) return cachedPermission;
                try { return AndroidAPI.hasPermission(NOTIF_PERMISSION) ? 'granted' : 'default'; } catch (_) { return 'default'; }
            };
            var ShimNotification = function(title, options) {
                if (!(this instanceof ShimNotification)) throw new TypeError("Failed to construct 'Notification'");
                options = options || {};
                this.title = String(title);
                this.body = options.body ? String(options.body) : '';
                this.tag = options.tag || '';
                this.data = options.data;
                this.onclick = null; this.onshow = null; this.onerror = null; this.onclose = null;
                this._listeners = {};
                this._id = null;
                var self = this;
                if (currentPermission() !== 'granted') {
                    setTimeout(function() { self._fire('error'); }, 0);
                    return;
                }
                once('notificationResult', function(d) { return d && d.action === 'post'; }, 10000).then(function(d) {
                    if (d.success) { self._id = d.notificationId; self._fire('show'); } else { self._fire('error'); }
                }, function() { self._fire('error'); });
                AndroidAPI.showNotification(this.title, this.body, '');
            };
            ShimNotification.prototype.addEventListener = function(type, fn) {
                (this._listeners[type] = this._listeners[type] || []).push(fn);
            };
            ShimNotification.prototype.removeEventListener = function(type, fn) {
                var list = this._listeners[type] || [];
                var i = list.indexOf(fn);
                if (i >= 0) list.splice(i, 1);
            };
            ShimNotification.prototype._fire = function(type) {
                var ev = { type: type, target: this };
                var handler = this['on' + type];
                if (typeof handler === 'function') { try { handler.call(this, ev); } catch (_) {} }
                (this._listeners[type] || []).slice().forEach(function(fn) { try { fn.call(this, ev); } catch (_) {} }, this);
            };
            ShimNotification.prototype.close = function() {
                if (this._id !== null) { try { AndroidAPI.cancelNotification(this._id); } catch (_) {} }
                this._fire('close');
            };
            Object.defineProperty(ShimNotification, 'permission', { get: currentPermission });
            ShimNotification.maxActions = 0;
            ShimNotification.requestPermission = function(callback) {
                var id = nextId('webNotification');
                var pending = once('permissionResult', function(d) { return d && d.callbackId === id; }, 120000)
                    .then(function(d) { cachedPermission = d.granted ? 'granted' : 'denied'; return cachedPermission; },
                          function() { return currentPermission(); });
                AndroidAPI.requestNotificationPermission(id);
                if (typeof callback === 'function') pending.then(callback);
                return pending;
            };
            window.Notification = ShimNotification;
        }

        // --- screen.orientation.lock / unlock ---
        if (typeof $WEB_COMPAT_BRIDGE_NAME !== 'undefined' && window.screen && screen.orientation) {
            try {
                screen.orientation.lock = function(type) {
                    var error = $WEB_COMPAT_BRIDGE_NAME.lockOrientation(String(type));
                    if (error) {
                        return Promise.reject(error === 'invalid_orientation'
                            ? new TypeError('Invalid orientation: ' + type)
                            : new DOMException(error, 'NotSupportedError'));
                    }
                    return Promise.resolve();
                };
                screen.orientation.unlock = function() { $WEB_COMPAT_BRIDGE_NAME.unlockOrientation(); };
            } catch (_) {}
        }
    })();
""".trimIndent()

private const val PULL_REFRESH_BRIDGE_NAME = "HtmlToApkPullRefresh"

// Asagi cekip yenileme yalniz sayfanin kendisi en usttayken tetiklenmeli: dokunus kaydirilmis bir ic alanda
// (sohbet, liste, harita) basliyorsa ya da sayfa CSS overscroll-behavior ile kapatmissa yenileme yapilmaz.
private val PULL_REFRESH_GUARD_SCRIPT = """
    (function() {
        if (window.__htmlToApkPullRefreshGuard || typeof $PULL_REFRESH_BRIDGE_NAME === 'undefined') return;
        window.__htmlToApkPullRefreshGuard = true;
        function optedOut() {
            try {
                var roots = [document.documentElement, document.body];
                for (var i = 0; i < roots.length; i++) {
                    if (!roots[i]) continue;
                    var ob = getComputedStyle(roots[i]).overscrollBehaviorY;
                    if (ob && ob !== 'auto') return true;
                }
            } catch (_) {}
            return false;
        }
        function innerScrolled(el) {
            var root = document.scrollingElement || document.documentElement;
            while (el && el.nodeType === 1 && el !== root && el !== document.body) {
                if (el.scrollTop > 0) {
                    var oy = getComputedStyle(el).overflowY;
                    if (oy === 'auto' || oy === 'scroll' || oy === 'overlay') return true;
                }
                el = el.parentElement;
            }
            return false;
        }
        document.addEventListener('touchstart', function(e) {
            var blocked = false;
            try { blocked = optedOut() || innerScrolled(e.target); } catch (_) {}
            try { $PULL_REFRESH_BRIDGE_NAME.setBlocked(blocked); } catch (_) {}
        }, { passive: true, capture: true });
    })();
""".trimIndent()

private val DOWNLOAD_INTERCEPTOR_SCRIPT = """
    (function() {
        if (window.__htmlToApkDownloadInterceptor) return;
        window.__htmlToApkDownloadInterceptor = true;

        // Popup'larda AndroidAPI yoktur; yalniz indirme yapabilen dar kopru verilir.
        function dlBridge() {
            if (typeof AndroidAPI !== 'undefined') return AndroidAPI;
            if (typeof HtmlToApkDownloads !== 'undefined') return HtmlToApkDownloads;
            return null;
        }

        var blobCache = (typeof Map !== 'undefined') ? new Map() : null;

        if (typeof URL !== 'undefined' && URL.createObjectURL) {
            var origCreate = URL.createObjectURL;
            URL.createObjectURL = function(blob) {
                var url = origCreate.call(URL, blob);
                if (blobCache && blob instanceof Blob) {
                    try {
                        blobCache.set(url, blob);
                        setTimeout(function() {
                            try { blobCache.delete(url); } catch (_) {}
                        }, 60000);
                    } catch (_) {}
                }
                return url;
            };

            if (URL.revokeObjectURL) {
                var origRevoke = URL.revokeObjectURL;
                URL.revokeObjectURL = function(url) {
                    setTimeout(function() {
                        try {
                            origRevoke.call(URL, url);
                        } catch (_) {}
                    }, 30000);
                };
            }
        }

        function guessFileName(href, name, mimeType) {
            if (name && typeof name === 'string' && name.trim() && name.trim() !== 'download') {
                var cleanName = name.trim();
                if (cleanName.indexOf('.') !== -1) return cleanName;
                var extFromName = (mimeType && mimeType.indexOf('json') !== -1) ? 'json' : 'bin';
                return cleanName + '.' + extFromName;
            }
            var ext = 'json';
            if (mimeType) {
                if (mimeType.indexOf('json') !== -1) ext = 'json';
                else if (mimeType.indexOf('csv') !== -1) ext = 'csv';
                else if (mimeType.indexOf('text') !== -1) ext = 'txt';
                else if (mimeType.indexOf('pdf') !== -1) ext = 'pdf';
                else if (mimeType.indexOf('zip') !== -1) ext = 'zip';
                else if (mimeType.indexOf('png') !== -1) ext = 'png';
                else if (mimeType.indexOf('jpeg') !== -1 || mimeType.indexOf('jpg') !== -1) ext = 'jpg';
            }
            return 'export_' + Date.now() + '.' + ext;
        }

        function handleDownload(href, filename, mimeType) {
            if (!href || typeof href !== 'string') return;
            var isBlob = href.startsWith('blob:');
            var isData = href.startsWith('data:');
            if (!isBlob && !isData) return;

            var safeName = guessFileName(href, filename, mimeType);

            if (isBlob && blobCache && blobCache.has(href)) {
                try {
                    var cachedBlob = blobCache.get(href);
                    var actualMime = (cachedBlob && cachedBlob.type) ? cachedBlob.type : (mimeType || 'application/json');
                    var reader = new FileReader();
                    reader.onloadend = function() {
                        if (reader.result && dlBridge() && dlBridge().onBlobDownloaded) {
                            dlBridge().onBlobDownloaded(reader.result, safeName, actualMime);
                        }
                    };
                    reader.onerror = function() {
                        if (dlBridge() && dlBridge().downloadBlobUrl) {
                            dlBridge().downloadBlobUrl(href, safeName, actualMime);
                        }
                    };
                    reader.readAsDataURL(cachedBlob);
                    return;
                } catch (_) {}
            }

            var bridge = dlBridge();
            if (bridge) {
                if (isData && bridge.downloadDataUri) {
                    bridge.downloadDataUri(href, safeName, mimeType || 'application/json');
                } else if (bridge.downloadBlobUrl) {
                    bridge.downloadBlobUrl(href, safeName, mimeType || 'application/json');
                }
            }
        }

        document.addEventListener('click', function(e) {
            var a = e.target && e.target.closest ? e.target.closest('a') : null;
            if (!a || typeof a.href !== 'string') return;
            if (a.href.startsWith('blob:') || a.href.startsWith('data:')) {
                e.preventDefault();
                e.stopPropagation();
                var dl = a.getAttribute('download') || a.download || '';
                handleDownload(a.href, dl, a.type || '');
            }
        }, true);

        try {
            var origClick = HTMLAnchorElement.prototype.click;
            HTMLAnchorElement.prototype.click = function() {
                var href = this.href;
                if (typeof href === 'string' && (href.startsWith('blob:') || href.startsWith('data:'))) {
                    var dl = this.getAttribute('download') || this.download || '';
                    handleDownload(href, dl, this.type || '');
                    return;
                }
                return origClick.apply(this, arguments);
            };
        } catch (_) {}

        try {
            var origDispatch = HTMLAnchorElement.prototype.dispatchEvent;
            HTMLAnchorElement.prototype.dispatchEvent = function(event) {
                if (event && (event.type === 'click' || event === 'click')) {
                    var href = this.href;
                    if (typeof href === 'string' && (href.startsWith('blob:') || href.startsWith('data:'))) {
                        var dl = this.getAttribute('download') || this.download || '';
                        handleDownload(href, dl, this.type || '');
                        return false;
                    }
                }
                return origDispatch.apply(this, arguments);
            };
        } catch (_) {}

        try {
            var origOpen = window.open;
            window.open = function(url) {
                if (typeof url === 'string' && (url.startsWith('blob:') || url.startsWith('data:'))) {
                    handleDownload(url, 'download', '');
                    return null;
                }
                return origOpen.apply(this, arguments);
            };
        } catch (_) {}

        if (!window.showSaveFilePicker) {
            window.showSaveFilePicker = async function(options) {
                var suggestedName = (options && options.suggestedName) ? options.suggestedName : 'export.json';
                var mime = 'application/json';
                if (options && options.types && options.types[0] && options.types[0].accept) {
                    var keys = Object.keys(options.types[0].accept);
                    if (keys.length > 0) mime = keys[0];
                }
                return {
                    name: suggestedName,
                    createWritable: async function() {
                        var chunks = [];
                        return {
                            write: async function(data) {
                                if (data instanceof Blob) {
                                    chunks.push(data);
                                } else if (typeof data === 'string') {
                                    chunks.push(new Blob([data], { type: mime }));
                                } else if (data instanceof ArrayBuffer || ArrayBuffer.isView(data)) {
                                    chunks.push(new Blob([data], { type: mime }));
                                }
                            },
                            close: async function() {
                                var finalBlob = new Blob(chunks, { type: mime });
                                var reader = new FileReader();
                                reader.onloadend = function() {
                                    if (reader.result && dlBridge() && dlBridge().onBlobDownloaded) {
                                        dlBridge().onBlobDownloaded(reader.result, suggestedName, mime);
                                    }
                                };
                                reader.readAsDataURL(finalBlob);
                            },
                            abort: async function() {
                                chunks = [];
                            }
                        };
                    }
                };
            };
        }
    })();
""".trimIndent()

class MainActivity : ComponentActivity() {

    private lateinit var progressBar: ProgressBar
    private lateinit var swipeRefreshLayout: SwipeRefreshLayout
    private var toolbar: View? = null
    private var toolbarTitle: android.widget.TextView? = null
    private var noInternetDialog: Dialog? = null
    private var lastPageLoadFailed = false
    private lateinit var splashView: ImageView
    lateinit var webView: WebView
        private set
    private lateinit var previewView: PreviewView
    private var customVideoView: View? = null
    private var customViewCallback: WebChromeClient.CustomViewCallback? = null
    // window.open / target=_blank icin ayri WebView; AndroidAPI koprusu bilerek verilmez (ucuncu taraf sayfa).
    private var popupContainer: FrameLayout? = null
    private var popupWebView: WebView? = null
    private lateinit var mainChromeClient: WebChromeClient
    private lateinit var mainWebViewClient: WebViewClient
    private val pullRefreshGuard = PullRefreshGuard()
    private var configuredOrientation = ActivityInfo.SCREEN_ORIENTATION_UNSPECIFIED

    /** Yalniz [WEB_API_SHIM_SCRIPT] icin (screen.orientation.lock); AndroidAPI sozlesmesine dahil degil. */
    private inner class WebCompatBridge {
        @android.webkit.JavascriptInterface
        fun lockOrientation(type: String): String {
            val target = webOrientationToActivity(type) ?: return "invalid_orientation"
            runOnUiThread { requestedOrientation = target }
            return ""
        }

        @android.webkit.JavascriptInterface
        fun unlockOrientation() {
            runOnUiThread { requestedOrientation = configuredOrientation }
        }
    }

    /** Yalniz [PULL_REFRESH_GUARD_SCRIPT] icin; AndroidAPI sozlesmesine dahil degil. */
    private class PullRefreshGuard {
        @Volatile
        var blocked = false
            private set

        @android.webkit.JavascriptInterface
        fun setBlocked(value: Boolean) {
            blocked = value
        }
    }
    private lateinit var downloadListener: android.webkit.DownloadListener
    private var popupInsets = androidx.core.graphics.Insets.NONE
    private var statusBarScrim: View? = null
    private var navBarScrim: View? = null
    private var lastTopBarInset = 0
    private var lastBottomBarInset = 0
    private var fullBleedUnderStatusBar = false
    private var appliedBarsSignature: Any? = null

    private lateinit var androidApi: AndroidAPI
    private lateinit var bridgeGate: BridgeGate
    private var pdfDocument: {{packageName}}.PdfReaderLayout? = null
    private lateinit var adMobBridge: AdMobBridge
    private lateinit var displayConfig: DisplayConfig
    private lateinit var cameraExecutor: ExecutorService

    private val jsEventEmitter: (String, JSONObject) -> Unit = { event, data ->
        if (::androidApi.isInitialized) {
            androidApi.emit(event, data)
        }
    }
    private var bannerPaddingTop = 0
    private var bannerPaddingBottom = 0
    private var cachedUserAgent: String = ""
    private var splashStartTime: Long = 0L
    private val splashHandler = Handler(Looper.getMainLooper())
    private var splashDismissRunnable: Runnable? = null

    fun updateBannerPadding(visible: Boolean, isTop: Boolean) {
        val heightPx = if (visible) (50 * resources.displayMetrics.density).toInt() else 0
        if (isTop) {
            bannerPaddingTop = heightPx
        } else {
            bannerPaddingBottom = heightPx
        }
        runOnUiThread {
            val rootLayout: View? = findViewById(R.id.root_layout)
            if (rootLayout != null) {
                ViewCompat.requestApplyInsets(rootLayout)
            } else {
                val contentContainer: View? = findViewById(R.id.main_content_container)
                if (contentContainer != null) {
                    ViewCompat.requestApplyInsets(contentContainer)
                } else if (::swipeRefreshLayout.isInitialized) {
                    ViewCompat.requestApplyInsets(swipeRefreshLayout)
                }
            }
        }
    }

    private var assetLoader: WebViewAssetLoader? = null
    var launchDeepLink: String? = null
        private set
    private val pageLoadHandler = Handler(Looper.getMainLooper())
    private val pageLoadTimeoutRunnable = Runnable { onPageLoadTimedOut() }
    private var pageLoadFinished = false
    private var pendingCameraCallbackId: String? = null
    private var pendingPhotoFile: File? = null
    private var pendingCameraFront = false
    private var pendingFileCallbackId: String? = null
    private var pendingWriteCallbackId: String? = null
    private var pendingWriteContent: String? = null
    private var pendingPermissionCallbackId: String? = null
    private var pendingPermission: String? = null
    private var pendingPermissionsCallbackId: String? = null
    private var filePathCallback: ValueCallback<Array<Uri>>? = null
    private var pendingWebCaptureFile: File? = null
    private lateinit var fileChooserLauncher: ActivityResultLauncher<Intent>
    private var currentWebBgColor: Int = android.graphics.Color.BLACK

    data class DisplayConfig(
        val mode: String = "local",
        val url: String = "",
        val showHeader: Boolean = true,
        val showActionBar: Boolean = false,
        val keepScreenOn: Boolean = false,
        val showCameraCutout: Boolean = false,
        val desktopMode: Boolean = false,
        val pullToRefresh: Boolean = true,
        val noInternetDialog: Boolean = true,
        val loadingIndicator: Boolean = false,
        val backHistoryNavigation: Boolean = true,
        val exitConfirmationDialog: Boolean = false,
        val bridgeOwnOriginOnly: Boolean = true,
        val orientation: String = "portrait",
        val primaryColor: String = "#2196F3",
        val hasSplash: Boolean = false,
        val splashBgColor: String = "#0F1318",
        val splashFadeOut: Boolean = true,
        val splashLoaderStyle: String = "circle",
        val splashIconSize: Int = 120,
        val splashIconRadius: Int = 16,
        val splashLoaderSize: Int = 48,
        val splashSpacing: Int = 28,
        val splashDuration: Int = 2,
        val splashLoaderThickness: Int = 4,
        val splashFadeDuration: Int = 400,
        val splashLoaderColor: String = "#00E5CC",
        val splashFullScreen: Boolean = false,
        val splashHideLoader: Boolean = false,
        val colorMode: String = "auto",
        val webBackgroundColor: String = "#000000",
        val statusBarColor: String = "",
        val statusBarAlpha: Int = 100,
        val statusBarIcons: String = "auto",
        val navBarColor: String = "",
        val navBarAlpha: Int = 100,
        val navBarIcons: String = "auto",
        val showWatermark: Boolean = false,
        val isPro: Boolean = false,
        val permissions: List<String> = emptyList(),
        val webViewSettings: WebViewSettings = WebViewSettings(),
        val admobChildDirectedTreatment: Int = -1,
        val admobUnderAgeOfConsent: Int = -1,
        val admobMaxAdContentRating: String = "",
        val umpDebugEnabled: Boolean = false,
        val umpDebugGeography: String = "DISABLED",
        val umpTestDeviceIds: List<String> = emptyList(),
        val admobEnabled: Boolean = false,
        val admobAppId: String = "",
        val admobBannerUnitId: String = "",
        val admobInterstitialUnitId: String = "",
        val admobRewardedUnitId: String = "",
        val admobBannerPosition: String = "bottom",
        val admobShowBannerOnStart: Boolean = false,
        val admobTestDeviceIds: List<String> = emptyList(),
        val admobAutoLoadInterstitial: Boolean = false,
        val admobAutoLoadRewarded: Boolean = false,
        val admobUseTestAds: Boolean = false,
        val admobBannerEnabled: Boolean = false,
        val admobInterstitialEnabled: Boolean = false,
        val admobRewardedEnabled: Boolean = false,
        val admobInterstitialIntervalSeconds: Int = 0,
        val admobInterstitialPageCount: Int = 0,
        /** Raw "pdfReader" object; parsed by the reader so the shell stays format-agnostic. */
        val pdfReaderJson: String = ""
    )

    data class WebViewSettings(
        val javaScriptEnabled: Boolean = true,
        val domStorageEnabled: Boolean = true,
        val allowFileAccess: Boolean = false,
        val allowContentAccess: Boolean = false,
        val allowUniversalAccessFromFileURLs: Boolean = true,
        val allowFileAccessFromFileURLs: Boolean = true,
        val builtInZoomControls: Boolean = true,
        val displayZoomControls: Boolean = false,
        val useWideViewPort: Boolean = true,
        val loadWithOverviewMode: Boolean = true,
        val cacheMode: Int = WebSettings.LOAD_DEFAULT,
        val mixedContentMode: Int = WebSettings.MIXED_CONTENT_ALWAYS_ALLOW,
        val userAgent: String? = null,
        val textZoom: Int = 100,
        val geolocationEnabled: Boolean = false
    )

    private var pendingWebPermissionRequest: PermissionRequest? = null

    private val permissionLauncher = registerForActivityResult(
        ActivityResultContracts.RequestPermission()
    ) { granted ->
        val camCallbackId = pendingCameraCallbackId
        if (camCallbackId != null && pendingPermission == Manifest.permission.CAMERA) {
            pendingPermission = null
            val front = pendingCameraFront
            pendingCameraCallbackId = null
            if (granted) {
                if (front) captureFrontPhoto(camCallbackId) else launchCameraIntent(camCallbackId)
            } else {
                androidApi.onCameraResult(camCallbackId, false, null, "permission_denied")
            }
            return@registerForActivityResult
        }
        val callbackId = pendingPermissionCallbackId ?: return@registerForActivityResult
        androidApi.onPermissionResult(callbackId, pendingPermission ?: "", granted)
        pendingPermissionCallbackId = null
        pendingPermission = null
    }

    // Separate launcher: sharing one launcher with requestPermissions() let a pending getUserMedia()
    // request swallow the JS batch result (and vice versa).
    private val webPermissionLauncher = registerForActivityResult(
        ActivityResultContracts.RequestMultiplePermissions()
    ) { results ->
        val webRequest = pendingWebPermissionRequest ?: return@registerForActivityResult
        pendingWebPermissionRequest = null
        val allGranted = webRequest.resources.all { res ->
            when (res) {
                PermissionRequest.RESOURCE_VIDEO_CAPTURE -> results[Manifest.permission.CAMERA] == true ||
                        ContextCompat.checkSelfPermission(this, Manifest.permission.CAMERA) == PackageManager.PERMISSION_GRANTED
                PermissionRequest.RESOURCE_AUDIO_CAPTURE -> results[Manifest.permission.RECORD_AUDIO] == true ||
                        ContextCompat.checkSelfPermission(this, Manifest.permission.RECORD_AUDIO) == PackageManager.PERMISSION_GRANTED
                else -> true
            }
        }
        runOnUiThread {
            if (allGranted) {
                webRequest.grant(webRequest.resources)
            } else {
                webRequest.deny()
            }
        }
    }

    // navigator.geolocation icin: Chrome gibi Android iznini sayfanin istegi uzerine sorar;
    // daha once izin verilmemisse WebView sessizce PERMISSION_DENIED donuyordu.
    private var pendingGeolocationOrigin: String? = null
    private var pendingGeolocationCallback: GeolocationPermissions.Callback? = null
    private val geolocationPermissionLauncher = registerForActivityResult(
        ActivityResultContracts.RequestMultiplePermissions()
    ) { _ ->
        val callback = pendingGeolocationCallback ?: return@registerForActivityResult
        val origin = pendingGeolocationOrigin
        pendingGeolocationCallback = null
        pendingGeolocationOrigin = null
        callback.invoke(origin, hasLocationPermission(), false)
    }

    private val multiplePermissionsLauncher = registerForActivityResult(
        ActivityResultContracts.RequestMultiplePermissions()
    ) { results ->
        val callbackId = pendingPermissionsCallbackId ?: return@registerForActivityResult
        androidApi.onPermissionsResult(callbackId, results)
        pendingPermissionsCallbackId = null
    }

    private val launchPermissionsLauncher = registerForActivityResult(
        ActivityResultContracts.RequestMultiplePermissions()
    ) { _ ->
        // Launch-time permissions are best-effort; individual APIs still request when needed.
    }

    private val takePictureLauncher = registerForActivityResult(
        ActivityResultContracts.TakePicture()
    ) { success ->
        val callbackId = pendingCameraCallbackId
        val file = pendingPhotoFile
        pendingCameraCallbackId = null
        pendingPhotoFile = null
        if (callbackId == null) return@registerForActivityResult
        if (!success) {
            try { file?.delete() } catch (_: Throwable) {}
            androidApi.onCameraResult(callbackId, false, null, "cancelled")
            return@registerForActivityResult
        }
        if (file == null || !file.exists() || file.length() == 0L) {
            androidApi.onCameraResult(callbackId, false, null, "capture_file_missing")
            return@registerForActivityResult
        }
        deliverPhotoFile(callbackId, file)
    }

    /**
     * Cekilen JPEG'i EXIF dondurmesiyle birlikte kucultup base64 data URL'e cevirir.
     * Intent (arka) ve CameraX (on) yakalama yollari ayni kodu paylasir.
     */
    private fun deliverPhotoFile(callbackId: String, file: File) {
        Thread {
            try {
                val bounds = android.graphics.BitmapFactory.Options().apply { inJustDecodeBounds = true }
                android.graphics.BitmapFactory.decodeFile(file.absolutePath, bounds)

                val reqMax = 1600
                var inSample = 1
                val maxDim = maxOf(bounds.outWidth, bounds.outHeight)
                while (maxDim / inSample > reqMax) {
                    inSample *= 2
                }

                val opts = android.graphics.BitmapFactory.Options().apply {
                    inSampleSize = inSample
                    inPreferredConfig = android.graphics.Bitmap.Config.RGB_565
                }
                var bitmap = android.graphics.BitmapFactory.decodeFile(file.absolutePath, opts)

                try {
                    val exif = android.media.ExifInterface(file.absolutePath)
                    val orientation = exif.getAttributeInt(
                        android.media.ExifInterface.TAG_ORIENTATION,
                        android.media.ExifInterface.ORIENTATION_NORMAL
                    )
                    val matrix = android.graphics.Matrix()
                    when (orientation) {
                        android.media.ExifInterface.ORIENTATION_ROTATE_90 -> matrix.postRotate(90f)
                        android.media.ExifInterface.ORIENTATION_ROTATE_180 -> matrix.postRotate(180f)
                        android.media.ExifInterface.ORIENTATION_ROTATE_270 -> matrix.postRotate(270f)
                    }
                    if (bitmap != null && !matrix.isIdentity) {
                        val rotated = android.graphics.Bitmap.createBitmap(bitmap, 0, 0, bitmap.width, bitmap.height, matrix, true)
                        if (rotated != bitmap) {
                            bitmap.recycle()
                            bitmap = rotated
                        }
                    }
                } catch (_: Throwable) {}

                val stream = ByteArrayOutputStream()
                bitmap?.compress(android.graphics.Bitmap.CompressFormat.JPEG, 80, stream)
                bitmap?.recycle()
                val bytes = stream.toByteArray()
                if (bytes.isEmpty()) {
                    try { file.delete() } catch (_: Throwable) {}
                    runOnUiThread {
                        androidApi.onCameraResult(callbackId, false, null, "encode_failed")
                    }
                    return@Thread
                }
                val base64 = android.util.Base64.encodeToString(bytes, android.util.Base64.NO_WRAP)
                try { file.delete() } catch (_: Throwable) {}
                runOnUiThread {
                    androidApi.onCameraResult(callbackId, true, "data:image/jpeg;base64,$base64")
                }
            } catch (t: Throwable) {
                Log.e(TAG, "Error processing captured photo", t)
                try { file.delete() } catch (_: Throwable) {}
                runOnUiThread {
                    androidApi.onCameraResult(callbackId, false, null, t.message ?: "decode_failed")
                }
            }
        }.start()
    }

    private val pickFileLauncher = registerForActivityResult(
        ActivityResultContracts.OpenDocument()
    ) { uri ->
        val callbackId = pendingFileCallbackId
        pendingFileCallbackId = null
        if (callbackId == null) return@registerForActivityResult
        if (uri == null) {
            androidApi.onFilePicked(callbackId, null, "cancelled")
            return@registerForActivityResult
        }
        Thread {
            when (val result = readUriContentResult(uri)) {
                is UriReadResult.Content -> runOnUiThread {
                    androidApi.onFilePicked(callbackId, result.base64, null)
                }
                is UriReadResult.Error -> runOnUiThread {
                    androidApi.onFilePicked(callbackId, null, result.code)
                }
            }
        }.start()
    }

    private var pendingPdfSave: File? = null
    private val pdfSaveLauncher = registerForActivityResult(
        ActivityResultContracts.CreateDocument("application/pdf")
    ) { uri ->
        val file = pendingPdfSave
        pendingPdfSave = null
        if (uri != null && file != null) {{packageName}}.PdfExport.saveTo(this, file, uri)
    }

    private val createDocumentLauncher = registerForActivityResult(
        ActivityResultContracts.CreateDocument("*/*")
    ) { uri ->
        val callbackId = pendingWriteCallbackId
        val content = pendingWriteContent
        pendingWriteCallbackId = null
        pendingWriteContent = null
        if (callbackId == null) return@registerForActivityResult
        if (uri == null || content == null) {
            androidApi.onFileWritten(callbackId, false, "cancelled")
            return@registerForActivityResult
        }
        Thread {
            try {
                contentResolver.openOutputStream(uri)?.use { out ->
                    out.write(content.toByteArray(Charsets.UTF_8))
                }
                runOnUiThread {
                    androidApi.onFileWritten(callbackId, true, null)
                }
            } catch (e: Exception) {
                runOnUiThread {
                    androidApi.onFileWritten(callbackId, false, e.message)
                }
            }
        }.start()
    }

    @SuppressLint("SetJavaScriptEnabled")
    override fun attachBaseContext(newBase: android.content.Context) {
        val mode = runCatching { JSONObject(readConfigJson(newBase)).optString("colorMode", "auto") }.getOrDefault("auto")
        val base = if (mode == "dark" || mode == "light") {
            val configuration = Configuration(newBase.resources.configuration)
            configuration.uiMode = (configuration.uiMode and Configuration.UI_MODE_NIGHT_MASK.inv()) or
                if (mode == "dark") Configuration.UI_MODE_NIGHT_YES else Configuration.UI_MODE_NIGHT_NO
            newBase.createConfigurationContext(configuration)
        } else newBase
        super.attachBaseContext(base)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        requestWindowFeature(Window.FEATURE_NO_TITLE)
        displayConfig = readDisplayConfig()
        if (displayConfig.colorMode in listOf("dark", "light")) {
            setTheme(if (displayConfig.colorMode == "dark") R.style.Theme_HTMLTemplate_Dark else R.style.Theme_HTMLTemplate_Light)
        }
        super.onCreate(savedInstanceState)
        actionBar?.hide()
        enableEdgeToEdge()
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.Q) {
            window.isNavigationBarContrastEnforced = false
        }
        cameraExecutor = Executors.newSingleThreadExecutor()

        // AlarmManager kayitlari reboot / uygulama guncellemesi / OEM kill ile siliniyor.
        // Boot alicisi izin secilmemisse hic calismaz; uygulama acildiginda kayitlari
        // her durumda geri kurmak hatirlatmanin "hic gelmemesi"ni engeller.
        Thread { AlarmReceiver.rescheduleAll(this) }.start()

        fileChooserLauncher = registerForActivityResult(ActivityResultContracts.StartActivityForResult()) { result ->
            val callback = filePathCallback
            filePathCallback = null
            if (callback == null) return@registerForActivityResult
            val captureFile = pendingWebCaptureFile
            pendingWebCaptureFile = null
            val data = result.data
            val accepted = result.resultCode == RESULT_OK
            var results: Array<Uri>? = when {
                !accepted || data == null -> null
                Build.VERSION.SDK_INT >= Build.VERSION_CODES.JELLY_BEAN_MR2 && data.clipData != null -> {
                    val clip = data.clipData!!
                    Array(clip.itemCount) { clip.getItemAt(it).uri }
                }
                data.data != null -> arrayOf(data.data!!)
                else -> null
            }
            // Camera apps launched through EXTRA_INITIAL_INTENTS usually return no data at all;
            // the photo only exists at the FileProvider URI we handed them via EXTRA_OUTPUT.
            var usedCaptureFile = false
            if (results == null && accepted && captureFile != null && captureFile.exists() && captureFile.length() > 0) {
                results = try {
                    usedCaptureFile = true
                    arrayOf(FileProvider.getUriForFile(this, "${packageName}.fileprovider", captureFile))
                } catch (e: Exception) {
                    Log.e(TAG, "Captured photo URI failed", e)
                    null
                }
            }
            if (!usedCaptureFile) {
                try { captureFile?.delete() } catch (_: Throwable) {}
            }
            callback.onReceiveValue(results)
        }

        if (intent.action == Intent.ACTION_VIEW &&
            (intent.type == "application/pdf" || PdfActivity.isPdf(intent.data))) {
            intent.data?.let { openPdf(it) }
        }

        val requestedOrientation = when (displayConfig.orientation) {
            "landscape" -> ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE
            "auto" -> ActivityInfo.SCREEN_ORIENTATION_SENSOR
            "portrait" -> ActivityInfo.SCREEN_ORIENTATION_PORTRAIT
            else -> ActivityInfo.SCREEN_ORIENTATION_UNSPECIFIED
        }
        if (requestedOrientation != ActivityInfo.SCREEN_ORIENTATION_UNSPECIFIED) {
            setRequestedOrientation(requestedOrientation)
        }
        configuredOrientation = requestedOrientation

        if (displayConfig.keepScreenOn) {
            window.addFlags(WindowManager.LayoutParams.FLAG_KEEP_SCREEN_ON)
        }

        val allowCutout = !displayConfig.showActionBar && displayConfig.showCameraCutout
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.R) {
            val lp = window.attributes
            lp.layoutInDisplayCutoutMode = if (allowCutout) {
                WindowManager.LayoutParams.LAYOUT_IN_DISPLAY_CUTOUT_MODE_ALWAYS
            } else {
                WindowManager.LayoutParams.LAYOUT_IN_DISPLAY_CUTOUT_MODE_DEFAULT
            }
            window.attributes = lp
        } else if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.P) {
            val lp = window.attributes
            @Suppress("DEPRECATION")
            lp.layoutInDisplayCutoutMode = if (allowCutout) {
                WindowManager.LayoutParams.LAYOUT_IN_DISPLAY_CUTOUT_MODE_SHORT_EDGES
            } else {
                WindowManager.LayoutParams.LAYOUT_IN_DISPLAY_CUTOUT_MODE_DEFAULT
            }
            window.attributes = lp
        }

        WindowCompat.setDecorFitsSystemWindows(window, false)
        setContentView(R.layout.activity_main)

        val toolbarView: View = findViewById(R.id.toolbar)
        val titleView: android.widget.TextView = findViewById(R.id.toolbar_title)
        toolbar = toolbarView
        toolbarTitle = titleView
        if (displayConfig.showActionBar) {
            toolbarView.visibility = View.VISIBLE
            toolbarView.layoutParams.height = ViewGroup.LayoutParams.WRAP_CONTENT
            titleView.text = applicationInfo.loadLabel(packageManager)
            applyPrimaryColor(displayConfig.primaryColor, true)
        } else {
            toolbarView.visibility = View.GONE
            toolbarView.layoutParams.height = 0
            toolbarView.setPadding(0, 0, 0, 0)
        }

        val isNightMode = (resources.configuration.uiMode and Configuration.UI_MODE_NIGHT_MASK) == Configuration.UI_MODE_NIGHT_YES
        updateSystemBarsAppearance(isNightMode)

        val rootLayout: FrameLayout = findViewById(R.id.root_layout)
        val contentContainer: LinearLayout = findViewById(R.id.main_content_container)
        statusBarScrim = findViewById(R.id.status_bar_scrim)
        navBarScrim = findViewById(R.id.nav_bar_scrim)
        swipeRefreshLayout = findViewById(R.id.swipe_refresh)
        webView = findViewById(R.id.webview)

        updateWebBackgroundColor(isNightMode)

        progressBar = findViewById(R.id.progress_bar)
        splashView = findViewById(R.id.splash_view)
        previewView = findViewById(R.id.preview_view)
        val watermarkView: android.widget.TextView = findViewById(R.id.watermark_view)
        watermarkView.visibility = if (displayConfig.showWatermark) android.view.View.VISIBLE else android.view.View.GONE
        // res/font XML niteligi API 26+; minSdk 24'te @fontFamily sessizce dusmesin diye tip yuzunden de verilir.
        // watermark_font.ttf yalniz bu metnin harflerini icerir (alt kume): metin degisirse font yeniden uretilmeli.
        try {
            androidx.core.content.res.ResourcesCompat.getFont(this, R.font.watermark_font)
                ?.let { watermarkView.typeface = it }
        } catch (_: Exception) {
        }

        val isUrlMode = displayConfig.mode == "url"
        val isLocalMode = !isUrlMode

        if (isUrlMode && displayConfig.pullToRefresh) {
            swipeRefreshLayout.isEnabled = true
            swipeRefreshLayout.setOnRefreshListener {
                webView.reload()
            }
            // Varsayilan kontrol WebView'in ic kaydirmasini goremedigi icin ic listeyi yukari kaydirmak
            // sayfayi yeniliyordu.
            swipeRefreshLayout.setOnChildScrollUpCallback { _, _ ->
                webView.scrollY > 0 || pullRefreshGuard.blocked || popupWebView != null
            }
        } else {
            swipeRefreshLayout.isEnabled = false
        }

        adMobBridge = AdMobBridge(this, displayConfig, jsEventEmitter)
        bridgeGate = BridgeGate(
            if (isUrlMode) TrustedOrigins.forUrl(displayConfig.url) else TrustedOrigins.local(),
            isNativeCaller = { Looper.myLooper() == Looper.getMainLooper() },
            enforced = displayConfig.bridgeOwnOriginOnly
        )
        androidApi = AndroidAPI(this, displayConfig.isPro, adMobBridge, bridgeGate)

        ViewCompat.setOnApplyWindowInsetsListener(rootLayout) { _, insets ->
            val systemBars = insets.getInsets(
                WindowInsetsCompat.Type.systemBars() or WindowInsetsCompat.Type.ime()
            )
            val cutout = insets.getInsets(WindowInsetsCompat.Type.displayCutout())
            val statusBarHeight = maxOf(cutout.top, systemBars.top)

            val isActionBarVisible = displayConfig.showActionBar && toolbar?.visibility != View.GONE
            // Aksiyon çubuğu açıksa çentik özelliği otomatik olarak görmezden gelinir!
            val effectiveShowCameraCutout = if (isActionBarVisible) false else displayConfig.showCameraCutout
            // Çentik modu bilinçli olarak içeriği durum çubuğunun altına çizer; varsayılan çubuk rengi
            // bu kullanıcıların görüntüsünü bozmasın diye ancak açıkça seçilmiş renk scrim uygular.
            fullBleedUnderStatusBar = displayConfig.showHeader && effectiveShowCameraCutout

            if (isActionBarVisible) {
                // Aksiyon çubuğu açık:
                // Durum çubuğu görünürse Toolbar'a üst dolgu verilir (böylece primaryColor durumu kaplar)
                val tbTopPadding = if (displayConfig.showHeader) statusBarHeight else 0
                toolbar?.visibility = View.VISIBLE
                toolbar?.layoutParams?.height = ViewGroup.LayoutParams.WRAP_CONTENT
                toolbar?.setPadding(
                    maxOf(cutout.left, systemBars.left),
                    tbTopPadding,
                    maxOf(cutout.right, systemBars.right),
                    0
                )

                // Web arayüzü doğrudan aksiyon çubuğunun bitiminden itibaren başlar
                swipeRefreshLayout.setPadding(
                    maxOf(cutout.left, systemBars.left),
                    bannerPaddingTop,
                    maxOf(cutout.right, systemBars.right),
                    systemBars.bottom + bannerPaddingBottom
                )
            } else {
                // Aksiyon çubuğu kapalı:
                toolbar?.visibility = View.GONE
                toolbar?.layoutParams?.height = 0
                toolbar?.setPadding(0, 0, 0, 0)

                val padTop = if (effectiveShowCameraCutout) {
                    bannerPaddingTop
                } else {
                    val safeTop = if (displayConfig.showHeader) statusBarHeight else maxOf(cutout.top, systemBars.top)
                    safeTop + bannerPaddingTop
                }

                val padLeft = if (effectiveShowCameraCutout) 0 else maxOf(cutout.left, systemBars.left)
                val padRight = if (effectiveShowCameraCutout) 0 else maxOf(cutout.right, systemBars.right)
                val padBottom = systemBars.bottom + bannerPaddingBottom

                swipeRefreshLayout.setPadding(
                    padLeft,
                    padTop,
                    padRight,
                    padBottom
                )
            }

            popupInsets = androidx.core.graphics.Insets.of(
                maxOf(cutout.left, systemBars.left),
                statusBarHeight,
                maxOf(cutout.right, systemBars.right),
                systemBars.bottom
            )
            popupContainer?.setPadding(popupInsets.left, popupInsets.top, popupInsets.right, popupInsets.bottom)

            if (::adMobBridge.isInitialized) {
                adMobBridge.updateBannerMargins()
            }
            // systemBars yukaride ime() iceriyor: klavye acikken alt scrim'i klavye yuksekligine
            // cikarmamak icin alt cubuk ayrica sadece systemBars()'dan okunur.
            applySystemBarScrims(statusBarHeight, insets.getInsets(WindowInsetsCompat.Type.systemBars()).bottom)
            WindowInsetsCompat.CONSUMED
        }

        rootLayout.post {
            ViewCompat.requestApplyInsets(rootLayout)
        }

        onBackPressedDispatcher.addCallback(this) {
            if (pdfDocument?.handleBack() == true) return@addCallback
            if (customVideoView != null) {
                hideCustomView()
                return@addCallback
            }
            if (previewView.visibility == View.VISIBLE) {
                stopCameraPreview()
                return@addCallback
            }
            popupWebView?.let { popup ->
                if (popup.canGoBack()) popup.goBack() else closePopupWebView()
                return@addCallback
            }
            // Yerel modda da gecmis kullanilir: cok sayfali HTML'de geri tusu Chrome gibi onceki sayfaya doner.
            if (displayConfig.backHistoryNavigation && webView.canGoBack()) {
                webView.goBack()
                return@addCallback
            }
            if (displayConfig.exitConfirmationDialog) {
                IosDialogHelper.showExitConfirmation(this@MainActivity) {
                    finish()
                }
                return@addCallback
            }
            finish()
        }

        val settings = displayConfig.webViewSettings
        webView.settings.apply {
            javaScriptEnabled = settings.javaScriptEnabled
            domStorageEnabled = settings.domStorageEnabled
            // databaseEnabled is required by some WebView implementations for
            // localStorage persistence even though it is deprecated.
            @Suppress("DEPRECATION")
            databaseEnabled = settings.domStorageEnabled
            allowFileAccess = isLocalMode && settings.allowFileAccess
            allowContentAccess = isLocalMode && settings.allowContentAccess
            // Local HTML needs these to call remote APIs (fetch/XHR) without CORS blocks.
            setAllowUniversalAccessFromFileURLs(isLocalMode && settings.allowUniversalAccessFromFileURLs)
            setAllowFileAccessFromFileURLs(isLocalMode && settings.allowFileAccessFromFileURLs)
            useWideViewPort = settings.useWideViewPort
            loadWithOverviewMode = settings.loadWithOverviewMode
            mixedContentMode = settings.mixedContentMode
            mediaPlaybackRequiresUserGesture = false
            // Varsayilan false: window.open sessizce null donuyor, OAuth/odeme popup'lari aciliyordu.
            // Acilan pencere onCreateWindow'da ayri bir WebView'a baglanir.
            javaScriptCanOpenWindowsAutomatically = true
            setSupportMultipleWindows(true)
            if (displayConfig.desktopMode) {
                val rawUa = userAgentString ?: ""
                val desktopUa = rawUa
                    .replace("Mobile", "")
                    .replace("Android", "")
                    .replace("; wv", "")
                    .trim()
                userAgentString = if (desktopUa.isNotBlank() && !desktopUa.contains("Linux; ;")) {
                    desktopUa
                } else {
                    "Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/124.0.0.0 Safari/537.36"
                }
                useWideViewPort = true
                loadWithOverviewMode = true
            }
            setSupportZoom(settings.builtInZoomControls)
            builtInZoomControls = settings.builtInZoomControls
            displayZoomControls = settings.displayZoomControls
            cacheMode = settings.cacheMode
            if (!settings.userAgent.isNullOrBlank()) {
                userAgentString = settings.userAgent
            }
            if (settings.textZoom != 100) {
                textZoom = settings.textZoom
            }
            setGeolocationEnabled(settings.geolocationEnabled || isLocationPermissionDeclared())
        }

        applyDarkMode((resources.configuration.uiMode and Configuration.UI_MODE_NIGHT_MASK) == Configuration.UI_MODE_NIGHT_YES)

        cachedUserAgent = webView.settings.userAgentString ?: ""
        // Ilk belge-basi betigi: AndroidAPI'yi yalniz uygulamanin kendi origin'inde acar (BridgeGate).
        // Kurulamazsa kapi ana belge adresine bakan eski korumaya duser.
        if (bridgeGate.enforced && WebViewFeature.isFeatureSupported(WebViewFeature.DOCUMENT_START_SCRIPT)) {
            try {
                WebViewCompat.addDocumentStartJavaScript(
                    webView,
                    bridgeGate.documentStartScript,
                    bridgeGate.documentStartRules
                )
                bridgeGate.onDocumentStartScriptInstalled()
            } catch (e: Exception) {
                Log.w(TAG, "Bridge gate script not installed, using main-frame check: ${e.message}")
            }
        }
        if (WebViewFeature.isFeatureSupported(WebViewFeature.DOCUMENT_START_SCRIPT)) {
            try {
                WebViewCompat.addDocumentStartJavaScript(
                    webView,
                    CLEARTEXT_INTERCEPTOR_SCRIPT,
                    setOf("*")
                )
            } catch (e: Exception) {
                Log.w(TAG, "addDocumentStartJavaScript broad origins failed: ${e.message}")
                try {
                    WebViewCompat.addDocumentStartJavaScript(
                        webView,
                        CLEARTEXT_INTERCEPTOR_SCRIPT,
                        setOf("https://appassets.androidplatform.net")
                    )
                } catch (e2: Exception) {
                    Log.w(TAG, "addDocumentStartJavaScript fallback failed: ${e2.message}")
                }
            }
        }

        try {
            CookieManager.getInstance().apply {
                setAcceptCookie(true)
                setAcceptThirdPartyCookies(webView, true)
            }
        } catch (_: Exception) {}

        if (isLocalMode) {
            assetLoader = WebViewAssetLoader.Builder()
                .addPathHandler("/assets/", WebViewAssetLoader.AssetsPathHandler(this))
                .build()
        }
        webView.addJavascriptInterface(androidApi, AndroidAPI.INTERFACE_NAME)
        webView.addJavascriptInterface(WebCompatBridge(), WEB_COMPAT_BRIDGE_NAME)
        val usePullRefreshGuard = isUrlMode && displayConfig.pullToRefresh
        if (usePullRefreshGuard) {
            webView.addJavascriptInterface(pullRefreshGuard, PULL_REFRESH_BRIDGE_NAME)
        }
        if (WebViewFeature.isFeatureSupported(WebViewFeature.DOCUMENT_START_SCRIPT)) {
            try {
                WebViewCompat.addDocumentStartJavaScript(webView, DOWNLOAD_INTERCEPTOR_SCRIPT, setOf("*"))
                WebViewCompat.addDocumentStartJavaScript(webView, PRINT_INTERCEPTOR_SCRIPT, setOf("*"))
                WebViewCompat.addDocumentStartJavaScript(webView, WEB_API_SHIM_SCRIPT, setOf("*"))
                if (usePullRefreshGuard) {
                    WebViewCompat.addDocumentStartJavaScript(webView, PULL_REFRESH_GUARD_SCRIPT, setOf("*"))
                }
            } catch (e: Exception) {
                Log.w(TAG, "Failed to add document start script: ${e.message}")
            }
        }

        mainWebViewClient = object : WebViewClient() {
            override fun onPageStarted(view: WebView?, url: String?, favicon: android.graphics.Bitmap?) {
                super.onPageStarted(view, url, favicon)
                bridgeGate.onMainFrameUrl(url)
                view?.setBackgroundColor(currentWebBgColor)
                pageLoadFinished = false
                lastPageLoadFailed = false
                injectCleartextInterceptor()
                injectBlobDownloadInterceptor()
                if (isUrlMode && displayConfig.loadingIndicator) {
                    progressBar.visibility = ProgressBar.VISIBLE
                    progressBar.progress = 10
                } else {
                    progressBar.visibility = ProgressBar.GONE
                }
                pageLoadHandler.removeCallbacks(pageLoadTimeoutRunnable)
                pageLoadHandler.postDelayed(pageLoadTimeoutRunnable, PAGE_LOAD_TIMEOUT_MS)
                Log.d(TAG, "WebView page started: $url")
            }

            override fun onPageFinished(view: WebView?, url: String?) {
                pageLoadFinished = true
                pageLoadHandler.removeCallbacks(pageLoadTimeoutRunnable)
                progressBar.visibility = ProgressBar.GONE
                if (displayConfig.hasSplash) {
                    val minDurationMs = displayConfig.splashDuration.coerceIn(1, 15) * 1000L
                    val elapsed = System.currentTimeMillis() - splashStartTime
                    val remaining = maxOf(0L, minDurationMs - elapsed)
                    splashDismissRunnable?.let { splashHandler.removeCallbacks(it) }
                    splashDismissRunnable = Runnable { hideSplash() }
                    splashHandler.postDelayed(splashDismissRunnable!!, remaining)
                } else {
                    hideSplash()
                }
                swipeRefreshLayout.isRefreshing = false
                // Hata oluştuysa veya ağ yoksa diyalogu kapatma; sadece başarılı yüklemede kapat
                if (!lastPageLoadFailed && isNetworkConnected()) {
                    if (noInternetDialog?.isShowing == true) {
                        noInternetDialog?.dismiss()
                        noInternetDialog = null
                    }
                }
                emitDeepLink()
                injectCleartextInterceptor()
                injectBlobDownloadInterceptor()
                view?.evaluateJavascript(PRINT_INTERCEPTOR_SCRIPT, null)
                view?.evaluateJavascript(WEB_API_SHIM_SCRIPT, null)
                if (isUrlMode && displayConfig.pullToRefresh) {
                    // DOCUMENT_START_SCRIPT desteklenmeyen WebView'lar icin; betik kendini tekrar kurmaz.
                    view?.evaluateJavascript(PULL_REFRESH_GUARD_SCRIPT, null)
                }
                if (::adMobBridge.isInitialized) adMobBridge.onPageLoaded()
                Log.d(TAG, "WebView page finished: $url")
            }

            override fun onReceivedError(
                view: WebView?,
                request: WebResourceRequest?,
                error: WebResourceError?
            ) {
                super.onReceivedError(view, request, error)
                Log.d(TAG, "WebView error on ${request?.url}: ${error?.description} (${error?.errorCode})")
                if (request?.isForMainFrame == true) {
                    swipeRefreshLayout.isRefreshing = false
                    lastPageLoadFailed = true
                    if (isUrlMode && displayConfig.noInternetDialog) {
                        showNoInternetDialog()
                    } else {
                        onPageLoadFailed(getString(R.string.error_page_load, error?.description ?: ""))
                    }
                }
            }

            override fun onReceivedHttpError(
                view: WebView?,
                request: WebResourceRequest?,
                errorResponse: WebResourceResponse?
            ) {
                super.onReceivedHttpError(view, request, errorResponse)
                Log.d(TAG, "WebView HTTP error on ${request?.url}: ${errorResponse?.statusCode}")
                // URL modunda sunucu kendi 404/500 sayfasini zaten gosterir (Chrome gibi); ustune Toast basmak
                // SPA'larin ozel hata sayfalarinda yaniltici oluyordu. Yerel modda eksik dosya hala bildirilir.
                if (request?.isForMainFrame == true && !isUrlMode) {
                    onPageLoadFailed(getString(R.string.error_server, errorResponse?.statusCode?.toString() ?: ""))
                }
            }

            override fun shouldOverrideUrlLoading(
                view: WebView?,
                request: WebResourceRequest?
            ): Boolean {
                val uri = request?.url
                if (request?.isForMainFrame == true && PdfActivity.isPdf(uri)) {
                    openPdf(uri!!)
                    return true
                }
                val handled = handleExternalNavigation(uri)
                // onPageStarted yeni belgenin ilk betiklerinden sonra gelebilir; adres burada da guncellenir.
                if (!handled && request?.isForMainFrame == true) bridgeGate.onMainFrameUrl(uri?.toString())
                return handled
            }

            override fun doUpdateVisitedHistory(view: WebView?, url: String?, isReload: Boolean) {
                super.doUpdateVisitedHistory(view, url, isReload)
                bridgeGate.onMainFrameUrl(url)
            }

            override fun shouldInterceptRequest(
                view: WebView?,
                request: WebResourceRequest?
            ): WebResourceResponse? {
                val url = request?.url ?: return super.shouldInterceptRequest(view, request)
                if (isLocalMode) {
                    val assetResponse = assetLoader?.shouldInterceptRequest(url)
                    if (assetResponse != null) {
                        val path = url.path ?: ""
                        val isHtml = assetResponse.mimeType?.contains("html", ignoreCase = true) == true ||
                                path.endsWith(".html", ignoreCase = true) ||
                                path.endsWith("/") ||
                                path == "/assets/www"
                        if (isHtml && assetResponse.data != null) {
                            try {
                                val scriptTag = "\n<script>\n$CLEARTEXT_INTERCEPTOR_SCRIPT\n$DOWNLOAD_INTERCEPTOR_SCRIPT\n$PRINT_INTERCEPTOR_SCRIPT\n$WEB_API_SHIM_SCRIPT\n</script>\n"
                                val modifiedHtml = HtmlScriptInjector.inject(assetResponse.data, scriptTag)
                                val headers = assetResponse.responseHeaders?.toMutableMap() ?: mutableMapOf()
                                headers["Cache-Control"] = "no-cache, no-store, must-revalidate"
                                return WebResourceResponse(
                                    "text/html",
                                    "UTF-8",
                                    assetResponse.statusCode.takeIf { it in 100..299 || it in 400..599 } ?: 200,
                                    assetResponse.reasonPhrase ?: "OK",
                                    headers,
                                    modifiedHtml
                                )
                            } catch (e: Exception) {
                                Log.e(TAG, "Failed to inject cleartext script into HTML: ${e.message}", e)
                                try {
                                    val cleanPath = "www/" + path.substringAfter("/assets/").removePrefix("www/").removePrefix("/").ifBlank { "index.html" }
                                    val assetStream = assets.open(cleanPath)
                                    return WebResourceResponse("text/html", "UTF-8", 200, "OK", null, assetStream)
                                } catch (_: Exception) {}
                            }
                        }
                        return assetResponse
                    }
                }

                val path = url.path ?: ""
                val host = url.host?.lowercase() ?: ""
                val isCleartextProxy = host == "appassets.androidplatform.net" && path.startsWith("/__cleartext_proxy__")
                val isDirectHttp = url.scheme?.equals("http", ignoreCase = true) == true && host != "appassets.androidplatform.net"

                if (isCleartextProxy || isDirectHttp) {
                    val targetUrl = if (isCleartextProxy) {
                        url.getQueryParameter("url")
                    } else {
                        url.toString()
                    }

                    if (!targetUrl.isNullOrBlank()) {
                        val proxyResponse = fetchProxyResource(targetUrl, request)
                        if (proxyResponse != null) return proxyResponse
                    }
                }
                return super.shouldInterceptRequest(view, request)
            }
        }

        webView.webViewClient = mainWebViewClient

        mainChromeClient = object : WebChromeClient() {
            override fun onCreateWindow(
                view: WebView?,
                isDialog: Boolean,
                isUserGesture: Boolean,
                resultMsg: android.os.Message?
            ): Boolean = attachPopupWindow(isUserGesture, resultMsg)

            override fun onShowCustomView(view: View?, callback: CustomViewCallback?) {
                if (customVideoView != null) {
                    callback?.onCustomViewHidden()
                    return
                }
                customVideoView = view
                customViewCallback = callback

                val rootLayout: FrameLayout = findViewById(R.id.root_layout)
                val contentContainer: View = findViewById(R.id.main_content_container)
                contentContainer.visibility = View.INVISIBLE
                if (view != null) {
                    view.layoutParams = FrameLayout.LayoutParams(
                        FrameLayout.LayoutParams.MATCH_PARENT,
                        FrameLayout.LayoutParams.MATCH_PARENT
                    )
                    rootLayout.addView(view)
                }
                val insetsController = WindowInsetsControllerCompat(window, window.decorView)
                insetsController.hide(WindowInsetsCompat.Type.systemBars())
                insetsController.systemBarsBehavior = WindowInsetsControllerCompat.BEHAVIOR_SHOW_TRANSIENT_BARS_BY_SWIPE
                applySystemBarScrims(lastTopBarInset, lastBottomBarInset)
            }

            override fun onHideCustomView() {
                hideCustomView()
            }
            override fun onProgressChanged(view: WebView?, newProgress: Int) {
                super.onProgressChanged(view, newProgress)
                if (isUrlMode && displayConfig.loadingIndicator) {
                    if (newProgress < 100) {
                        progressBar.visibility = ProgressBar.VISIBLE
                        progressBar.progress = newProgress
                    } else {
                        progressBar.visibility = ProgressBar.GONE
                    }
                }
            }

            override fun onConsoleMessage(message: ConsoleMessage?): Boolean {
                message?.let {
                    Log.d(TAG, "JS console [${it.messageLevel()}] ${it.sourceId()}:${it.lineNumber()} - ${it.message()}")
                }
                return super.onConsoleMessage(message)
            }

            override fun onGeolocationPermissionsShowPrompt(
                origin: String?,
                callback: GeolocationPermissions.Callback?
            ) {
                if (callback == null) return
                val declared = isLocationPermissionDeclared()
                when {
                    !settings.geolocationEnabled && !declared -> callback.invoke(origin, false, false)
                    hasLocationPermission() -> callback.invoke(origin, true, false)
                    // Bildirilmemis izin istenirse sistem diyalogsuz reddeder; sorulacak bir sey yok.
                    !declared -> callback.invoke(origin, false, false)
                    else -> {
                        pendingGeolocationCallback?.invoke(pendingGeolocationOrigin, false, false)
                        pendingGeolocationOrigin = origin
                        pendingGeolocationCallback = callback
                        try {
                            geolocationPermissionLauncher.launch(declaredLocationPermissions().toTypedArray())
                        } catch (e: Exception) {
                            Log.e(TAG, "Geolocation permission request failed", e)
                            pendingGeolocationCallback = null
                            pendingGeolocationOrigin = null
                            callback.invoke(origin, false, false)
                        }
                    }
                }
            }

            override fun onPermissionRequest(request: PermissionRequest?) {
                runOnUiThread {
                    if (request == null) return@runOnUiThread
                    val neededPermissions = mutableListOf<String>()
                    request.resources.forEach { resource ->
                        if (resource == PermissionRequest.RESOURCE_VIDEO_CAPTURE) {
                            neededPermissions.add(Manifest.permission.CAMERA)
                        } else if (resource == PermissionRequest.RESOURCE_AUDIO_CAPTURE) {
                            neededPermissions.add(Manifest.permission.RECORD_AUDIO)
                        }
                    }
                    val missing = neededPermissions.filter {
                        ContextCompat.checkSelfPermission(this@MainActivity, it) != PackageManager.PERMISSION_GRANTED
                    }
                    if (missing.isNotEmpty()) {
                        pendingWebPermissionRequest = request
                        webPermissionLauncher.launch(missing.toTypedArray())
                    } else {
                        request.grant(request.resources)
                    }
                }
            }

            override fun onShowFileChooser(
                webView: WebView?,
                filePathCallback: ValueCallback<Array<Uri>>?,
                fileChooserParams: FileChooserParams?
            ): Boolean {
                this@MainActivity.filePathCallback?.onReceiveValue(null)
                this@MainActivity.filePathCallback = filePathCallback

                val rawTypes = fileChooserParams?.acceptTypes?.filter { it.isNotBlank() } ?: emptyList()
                val mimeTypes = mutableListOf<String>()
                rawTypes.forEach { raw ->
                    val clean = raw.trim().lowercase(Locale.ROOT)
                    if (clean.startsWith(".")) {
                        val ext = clean.removePrefix(".")
                        val mime = MimeTypeMap.getSingleton().getMimeTypeFromExtension(ext)
                        if (mime != null) {
                            mimeTypes.add(mime)
                        } else if (ext == "json") {
                            mimeTypes.add("application/json")
                        } else {
                            mimeTypes.add("*/*")
                        }
                    } else if (clean.contains("/")) {
                        mimeTypes.add(clean)
                    }
                }

                val intent = Intent(Intent.ACTION_GET_CONTENT).apply {
                    addCategory(Intent.CATEGORY_OPENABLE)
                    if (mimeTypes.isEmpty()) {
                        type = "*/*"
                    } else if (mimeTypes.size == 1) {
                        type = mimeTypes[0]
                    } else {
                        type = "*/*"
                        putExtra(Intent.EXTRA_MIME_TYPES, mimeTypes.toTypedArray())
                    }
                    putExtra(Intent.EXTRA_ALLOW_MULTIPLE, fileChooserParams?.mode == FileChooserParams.MODE_OPEN_MULTIPLE)
                }

                // Without this the document picker is the only choice and <input capture> never
                // reaches the camera.
                val acceptsImage = shouldOfferCameraCapture(mimeTypes)
                val captureUri = if (acceptsImage) prepareWebCaptureUri() else null
                val chooser = Intent.createChooser(intent, "Choose file")
                if (captureUri != null) {
                    val cameraIntent = Intent(MediaStore.ACTION_IMAGE_CAPTURE).apply {
                        putExtra(MediaStore.EXTRA_OUTPUT, captureUri)
                        addFlags(
                            Intent.FLAG_GRANT_READ_URI_PERMISSION or
                                Intent.FLAG_GRANT_WRITE_URI_PERMISSION
                        )
                    }
                    chooser.putExtra(Intent.EXTRA_INITIAL_INTENTS, arrayOf<Parcelable>(cameraIntent))
                }

                try {
                    fileChooserLauncher.launch(chooser)
                    return true
                } catch (e: Exception) {
                    Log.e(TAG, "File chooser launch failed", e)
                    pendingWebCaptureFile = null
                    this@MainActivity.filePathCallback?.onReceiveValue(null)
                    this@MainActivity.filePathCallback = null
                    return false
                }
            }
        }

        webView.webChromeClient = mainChromeClient

        downloadListener = android.webkit.DownloadListener { url, userAgent, contentDisposition, mimetype, contentLength ->
            if (url.isNullOrBlank()) return@DownloadListener
            if (mimetype?.substringBefore(';')?.trim().equals("application/pdf", true) || PdfActivity.isPdf(Uri.parse(url))) {
                if (openPdf(Uri.parse(url))) return@DownloadListener
            }
            val trimmedUrl = url.trim()
            if (trimmedUrl.startsWith("blob:", ignoreCase = true)) {
                val guessed = URLUtil.guessFileName(trimmedUrl, contentDisposition, mimetype)
                // `export_*.json` gibi sabit bir uzantiya dusmek, gercek tur PNG/MP4 olan bir
                // blob'u okunamaz dosyaya ceviriyordu; ad sonucta MIME'a gore cozulur.
                val safeName = if (guessed.isNotBlank() && guessed != "downloadfile.bin") {
                    guessed
                } else {
                    "export_${System.currentTimeMillis()}"
                }
                androidApi.downloadBlobUrl(trimmedUrl, safeName, mimetype ?: "application/octet-stream")
                return@DownloadListener
            }
            if (trimmedUrl.startsWith("data:", ignoreCase = true)) {
                downloadDataUri(trimmedUrl, contentDisposition, mimetype)
                return@DownloadListener
            }
            if (!trimmedUrl.startsWith("http://", ignoreCase = true) && !trimmedUrl.startsWith("https://", ignoreCase = true)) {
                Log.w(TAG, "DownloadManager only supports HTTP/HTTPS, skipping scheme: $trimmedUrl")
                return@DownloadListener
            }
            try {
                val guessedName = contentDispositionFileName(contentDisposition)
                    ?.replace(Regex("[\\\\/:*?\"<>|]"), "_")
                    ?: URLUtil.guessFileName(trimmedUrl, contentDisposition, mimetype)
                val request = DownloadManager.Request(Uri.parse(trimmedUrl)).apply {
                    setMimeType(mimetype)
                    addRequestHeader("User-Agent", userAgent)
                    // DownloadManager WebView oturumunu bilmez; cerez olmadan girisli sitelerdeki
                    // dosyalar yerine giris sayfasinin HTML'i iniyordu.
                    try {
                        CookieManager.getInstance().getCookie(trimmedUrl)
                            ?.takeIf { it.isNotBlank() }
                            ?.let { addRequestHeader("Cookie", it) }
                    } catch (_: Exception) {}
                    webView.url?.takeIf { it.startsWith("http", ignoreCase = true) }
                        ?.let { addRequestHeader("Referer", it) }
                    setDescription("Downloading file…")
                    setTitle(guessedName)
                    setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED)
                    setDestinationInExternalPublicDir(Environment.DIRECTORY_DOWNLOADS, guessedName)
                }
                val dm = getSystemService(DOWNLOAD_SERVICE) as DownloadManager
                dm.enqueue(request)
                Toast.makeText(this, R.string.download_started, Toast.LENGTH_SHORT).show()
            } catch (e: Exception) {
                Log.e(TAG, "DownloadManager enqueue failed", e)
            }
        }
        webView.setDownloadListener(downloadListener)

        setupSplash()

        val targetUrl = when (displayConfig.mode) {
            "url" -> displayConfig.url
            else -> "https://appassets.androidplatform.net/assets/www/index.html"
        }
        if (isUrlMode && displayConfig.noInternetDialog && !isNetworkConnected()) {
            showNoInternetDialog()
        }
        if (displayConfig.mode == "pdf") {
            swipeRefreshLayout.isEnabled = false
            val readerOptions = {{packageName}}.PdfReaderOptions.fromJson(
                displayConfig.pdfReaderJson.takeIf { it.isNotBlank() }?.let { runCatching { JSONObject(it) }.getOrNull() },
                accentColor = pdfAccentColor(),
                colorMode = displayConfig.colorMode,
                // The generated manifest carries the real label; R.string.app_name stays the shell's.
                title = applicationInfo.loadLabel(packageManager).toString()
            )
            // Same reader screen as the HTML to APK app; the shell's action bar, when on, already shows the title.
            val document = {{packageName}}.PdfReaderLayout(
                this, readerOptions, "embedded_document", showTopBar = !displayConfig.showActionBar
            )
            if (readerOptions.allowExport) {
                document.document.useDefaultExport(this) { file ->
                    pendingPdfSave = file
                    try {
                        pdfSaveLauncher.launch({{packageName}}.PdfExport.fileName(readerOptions.title))
                    } catch (e: Exception) {
                        pendingPdfSave = null
                        Log.w(TAG, "No document picker for PDF save", e)
                        Toast.makeText(this, {{packageName}}.R.string.pdf_document_export_failed, Toast.LENGTH_SHORT).show()
                    }
                }
            }
            document.restoreState(savedInstanceState)
            pdfDocument = document
            // Keep the WebView attached for existing inset/ads/lifecycle integration,
            // but render PDF pages natively instead of feeding binary data to HTML.
            swipeRefreshLayout.removeView(webView)
            val container = FrameLayout(this)
            webView.visibility = View.GONE
            container.addView(webView, FrameLayout.LayoutParams(-1, -1))
            container.addView(document, FrameLayout.LayoutParams(-1, -1))
            swipeRefreshLayout.addView(container)
            document.onReady = {
                pageLoadFinished = true
                progressBar.visibility = View.GONE
                val remaining = if (displayConfig.hasSplash) {
                    maxOf(0L, displayConfig.splashDuration.coerceIn(1, 15) * 1000L -
                        (System.currentTimeMillis() - splashStartTime))
                } else 0L
                splashDismissRunnable?.let { splashHandler.removeCallbacks(it) }
                splashDismissRunnable = Runnable { hideSplash() }
                splashHandler.postDelayed(splashDismissRunnable!!, remaining)
                adMobBridge.onPageLoaded()
            }
            document.onError = { progressBar.visibility = View.GONE; hideSplash() }
            document.openAsset("www/document.pdf")
        } else {
            bridgeGate.onMainFrameUrl(targetUrl)
            webView.post { webView.loadUrl(targetUrl) }
        }

        launchDeepLink = intent?.data?.toString()

        requestLaunchPermissions(displayConfig.permissions)
    }

    private fun pdfAccentColor(): Int = runCatching { android.graphics.Color.parseColor(displayConfig.primaryColor) }
        .getOrDefault({{packageName}}.PdfReaderOptions.DEFAULT_ACCENT)

    /** Linked or shared PDFs open in the native reader, styled like the app. */
    private fun openPdf(uri: Uri): Boolean = PdfActivity.open(this, uri, pdfAccentColor(), displayConfig.colorMode)

    private fun isNetworkConnected(): Boolean {
        return try {
            val cm = getSystemService(Context.CONNECTIVITY_SERVICE) as? ConnectivityManager ?: return true
            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
                val network = cm.activeNetwork ?: return false
                val caps = cm.getNetworkCapabilities(network) ?: return false
                caps.hasCapability(NetworkCapabilities.NET_CAPABILITY_INTERNET)
            } else {
                @Suppress("DEPRECATION")
                val netInfo = cm.activeNetworkInfo
                @Suppress("DEPRECATION")
                netInfo != null && netInfo.isConnected
            }
        } catch (_: Exception) {
            true
        }
    }

    private fun showNoInternetDialog() {
        if (noInternetDialog?.isShowing == true || isFinishing || isDestroyed) return
        noInternetDialog = IosDialogHelper.showNoInternet(this) {
            if (isNetworkConnected()) {
                noInternetDialog?.dismiss()
                noInternetDialog = null
                lastPageLoadFailed = false
                val targetUrl = when (displayConfig.mode) {
                    "url" -> displayConfig.url
                    else -> "https://appassets.androidplatform.net/assets/www/index.html"
                }
                webView.loadUrl(targetUrl)
            } else {
                Toast.makeText(this, R.string.ios_dialog_no_internet_title, Toast.LENGTH_SHORT).show()
            }
        }
    }

    private fun hideCustomView() {
        val view = customVideoView ?: return
        val rootLayout: FrameLayout = findViewById(R.id.root_layout)
        val contentContainer: View = findViewById(R.id.main_content_container)
        rootLayout.removeView(view)
        contentContainer.visibility = View.VISIBLE
        customVideoView = null
        customViewCallback?.onCustomViewHidden()
        customViewCallback = null
        if (displayConfig.showHeader) {
            val insetsController = WindowInsetsControllerCompat(window, window.decorView)
            insetsController.show(WindowInsetsCompat.Type.systemBars())
        }
        applySystemBarScrims(lastTopBarInset, lastBottomBarInset)
    }

    private fun fetchProxyResource(targetUrl: String, request: WebResourceRequest): WebResourceResponse? {
        return try {
            val method = request.method ?: "GET"

            // Handle CORS preflight OPTIONS requests immediately
            if (method.equals("OPTIONS", ignoreCase = true)) {
                val headers = mutableMapOf(
                    "Access-Control-Allow-Origin" to "*",
                    "Access-Control-Allow-Methods" to "GET, POST, PUT, DELETE, HEAD, OPTIONS, PATCH",
                    "Access-Control-Allow-Headers" to "*",
                    "Access-Control-Allow-Credentials" to "true",
                    "Access-Control-Max-Age" to "86400"
                )
                return WebResourceResponse("text/plain", "UTF-8", 200, "OK", headers, "".byteInputStream())
            }

            var currentUrl = targetUrl
            var redirects = 0
            var conn: java.net.HttpURLConnection

            // Follow cross-protocol redirects manually (HTTP -> HTTPS or vice versa)
            while (true) {
                val urlObj = java.net.URL(currentUrl)
                conn = urlObj.openConnection() as java.net.HttpURLConnection
                conn.instanceFollowRedirects = false
                conn.connectTimeout = 15000
                conn.readTimeout = 60000
                conn.requestMethod = method

                request.requestHeaders?.forEach { (key, value) ->
                    val lowerKey = key.lowercase()
                    // Filter out headers that cause issues when proxying
                    if (lowerKey != "host" &&
                        lowerKey != "accept-encoding" &&
                        !lowerKey.startsWith("sec-fetch-") &&
                        !(lowerKey == "origin" && value.contains("appassets.androidplatform.net")) &&
                        !(lowerKey == "referer" && value.contains("appassets.androidplatform.net"))
                    ) {
                        try { conn.setRequestProperty(key, value) } catch (_: Throwable) {}
                    }
                }
                val ua = cachedUserAgent.ifBlank { "Mozilla/5.0 (Linux; Android 10; K) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/124.0.0.0 Mobile Safari/537.36" }
                if (conn.getRequestProperty("User-Agent").isNullOrBlank()) {
                    try { conn.setRequestProperty("User-Agent", ua) } catch (_: Throwable) {}
                }
                // WebView yakalanan isteklerde Cookie basligini vermez; proxy'lenen HTTP sitelerinde oturum
                // hic tasinmiyordu (giris, sepet, girisli indirme).
                val cookieManager = try { CookieManager.getInstance() } catch (_: Throwable) { null }
                if (conn.getRequestProperty("Cookie").isNullOrBlank()) {
                    cookieManager?.getCookie(currentUrl)?.takeIf { it.isNotBlank() }?.let {
                        try { conn.setRequestProperty("Cookie", it) } catch (_: Throwable) {}
                    }
                }

                conn.connect()
                val code = conn.responseCode
                conn.headerFields?.forEach { (key, values) ->
                    if (key != null && key.equals("Set-Cookie", ignoreCase = true)) {
                        values.forEach { cookie -> cookieManager?.setCookie(currentUrl, cookie) }
                    }
                }
                if ((code in 301..303 || code == 307 || code == 308) && redirects < 5) {
                    val location = conn.getHeaderField("Location")
                    if (!location.isNullOrBlank()) {
                        currentUrl = java.net.URL(urlObj, location).toString()
                        redirects++
                        conn.disconnect()
                        continue
                    }
                }
                break
            }

            val statusCode = conn.responseCode
            val statusMessage = conn.responseMessage?.takeIf { it.isNotBlank() } ?: when (statusCode) {
                200 -> "OK"
                206 -> "Partial Content"
                else -> "OK"
            }
            val rawContentType = conn.contentType ?: "application/octet-stream"
            val mimeType = rawContentType.substringBefore(";").trim()

            // CRITICAL: Hop-by-hop headers MUST NOT be forwarded to Chromium WebResourceResponse!
            // Forwarding Transfer-Encoding: chunked or Connection causes ERR_INVALID_CHUNKED_ENCODING.
            val hopByHopHeaders = setOf(
                "connection",
                "keep-alive",
                "transfer-encoding",
                "te",
                "trailer",
                "upgrade",
                "proxy-authenticate",
                "proxy-authorization"
            )

            val responseHeaders = mutableMapOf<String, String>()
            conn.headerFields?.forEach { (key, values) ->
                if (key != null && !hopByHopHeaders.contains(key.lowercase()) && values.isNotEmpty()) {
                    responseHeaders[key] = values.joinToString(", ")
                }
            }

            val contentEncoding = conn.contentEncoding?.lowercase() ?: ""
            val rawStream = if (statusCode >= 400) conn.errorStream ?: conn.inputStream else conn.inputStream

            // Handle decompression if compressed
            val inputStream = when {
                contentEncoding.contains("gzip") && rawStream != null -> java.util.zip.GZIPInputStream(rawStream)
                contentEncoding.contains("deflate") && rawStream != null -> java.util.zip.InflaterInputStream(rawStream)
                else -> rawStream
            }

            if (contentEncoding.contains("gzip") || contentEncoding.contains("deflate")) {
                val keysToRemove = responseHeaders.keys.filter {
                    it.equals("Content-Encoding", ignoreCase = true) || it.equals("Content-Length", ignoreCase = true)
                }
                keysToRemove.forEach { responseHeaders.remove(it) }
            }

            // CRITICAL: IPTV / HLS .m3u8 Playlist Rewriting
            // If the response is an M3U8 playlist, rewrite relative/HTTP URIs so every .ts segment goes through the proxy!
            val isM3u8 = mimeType.contains("mpegurl", ignoreCase = true) ||
                    targetUrl.substringBefore("?").endsWith(".m3u8", ignoreCase = true)

            if (isM3u8 && inputStream != null) {
                val playlistText = inputStream.bufferedReader().use { it.readText() }
                val baseUrl = java.net.URL(currentUrl)
                val rewrittenLines = playlistText.lineSequence().map { line ->
                    val trimmed = line.trim()
                    if (trimmed.isEmpty()) {
                        line
                    } else if (trimmed.startsWith("#")) {
                        if (trimmed.contains("URI=\"")) {
                            trimmed.replace(Regex("URI=\"([^\"]+)\"")) { matchResult ->
                                val uriVal = matchResult.groupValues[1]
                                val resolvedUri = try { java.net.URL(baseUrl, uriVal).toString() } catch (_: Exception) { uriVal }
                                val proxied = if (resolvedUri.startsWith("http://")) {
                                    CLEARTEXT_PROXY_PREFIX + java.net.URLEncoder.encode(resolvedUri, "UTF-8")
                                } else resolvedUri
                                "URI=\"$proxied\""
                            }
                        } else {
                            line
                        }
                    } else {
                        val resolvedUri = try { java.net.URL(baseUrl, trimmed).toString() } catch (_: Exception) { trimmed }
                        if (resolvedUri.startsWith("http://")) {
                            CLEARTEXT_PROXY_PREFIX + java.net.URLEncoder.encode(resolvedUri, "UTF-8")
                        } else {
                            resolvedUri
                        }
                    }
                }.joinToString("\n")

                val rewrittenBytes = rewrittenLines.toByteArray(Charsets.UTF_8)
                responseHeaders["Content-Length"] = rewrittenBytes.size.toString()
                responseHeaders["Access-Control-Allow-Origin"] = "*"
                responseHeaders["Access-Control-Allow-Methods"] = "GET, POST, PUT, DELETE, HEAD, OPTIONS, PATCH"
                responseHeaders["Access-Control-Allow-Headers"] = "*"
                responseHeaders["Access-Control-Allow-Credentials"] = "true"
                responseHeaders["Access-Control-Expose-Headers"] = "Content-Length, Content-Range, Accept-Ranges, Content-Type"
                responseHeaders["Accept-Ranges"] = "bytes"
                return WebResourceResponse(
                    "application/vnd.apple.mpegurl",
                    "UTF-8",
                    statusCode,
                    statusMessage,
                    responseHeaders,
                    rewrittenBytes.inputStream()
                )
            }

            // CRITICAL: Binary content (video, audio, images, TS chunks, streams) MUST have encoding = null!
            // Passing "UTF-8" causes Chromium media pipeline to fail with MEDIA_ERR_SRC_NOT_SUPPORTED!
            val isBinary = mimeType.startsWith("video/", ignoreCase = true) ||
                    mimeType.startsWith("audio/", ignoreCase = true) ||
                    mimeType.startsWith("image/", ignoreCase = true) ||
                    mimeType.equals("application/octet-stream", ignoreCase = true) ||
                    mimeType.equals("application/pdf", ignoreCase = true) ||
                    mimeType.equals("application/wasm", ignoreCase = true) ||
                    targetUrl.substringBefore("?").endsWith(".ts", ignoreCase = true) ||
                    targetUrl.substringBefore("?").endsWith(".mp4", ignoreCase = true)

            val encoding = if (isBinary) {
                null
            } else if (rawContentType.contains("charset=", ignoreCase = true)) {
                rawContentType.substringAfter("charset=", "").substringBefore(";").trim().takeIf { it.isNotBlank() }
            } else {
                null
            }

            responseHeaders["Access-Control-Allow-Origin"] = "*"
            responseHeaders["Access-Control-Allow-Methods"] = "GET, POST, PUT, DELETE, HEAD, OPTIONS, PATCH"
            responseHeaders["Access-Control-Allow-Headers"] = "*"
            responseHeaders["Access-Control-Allow-Credentials"] = "true"
            responseHeaders["Access-Control-Expose-Headers"] = "Content-Length, Content-Range, Accept-Ranges, Content-Type"
            responseHeaders["Accept-Ranges"] = "bytes"

            WebResourceResponse(mimeType, encoding, statusCode, statusMessage, responseHeaders, inputStream)
        } catch (e: Exception) {
            Log.e(TAG, "fetchProxyResource failed for $targetUrl: ${e.message}", e)
            null
        }
    }

    /** Ana belge uygulamanin kendi origin'inde mi; dis sitelere yerel sonuc/callback teslim edilmez. */
    internal fun isTrustedPageShown(): Boolean =
        ::bridgeGate.isInitialized && bridgeGate.isTrustedPage(webView.url)

    private fun emitDeepLink() {
        val link = launchDeepLink ?: return
        if (!isTrustedPageShown()) return
        val script = "window.onDeepLink && window.onDeepLink(${JSONObject.quote(link)})"
        webView.evaluateJavascript(script, null)
    }

    override fun onNewIntent(intent: Intent) {
        super.onNewIntent(intent)
        setIntent(intent)
        if (intent.action == Intent.ACTION_VIEW &&
            (intent.type == "application/pdf" || PdfActivity.isPdf(intent.data))) {
            intent.data?.let { openPdf(it) }
            return
        }
        launchDeepLink = intent.data?.toString()
        if (::webView.isInitialized) {
            emitDeepLink()
        }
    }

    override fun onResume() {
        super.onResume()
        if (::webView.isInitialized) {
            webView.onResume()
        }
        popupWebView?.onResume()
        if (::adMobBridge.isInitialized) {
            adMobBridge.onResume()
        }
    }

    override fun onPause() {
        if (::adMobBridge.isInitialized) {
            adMobBridge.onPause()
        }
        super.onPause()
        if (::webView.isInitialized) {
            webView.onPause()
        }
        popupWebView?.onPause()
        try {
            CookieManager.getInstance().flush()
        } catch (_: Exception) {}
        androidApi.stopAllSensors()
        androidApi.stopLocationUpdates()
    }

    override fun onSaveInstanceState(outState: Bundle) {
        pdfDocument?.saveState(outState)
        super.onSaveInstanceState(outState)
    }

    override fun onDestroy() {
        closePopupWebView()
        pendingGeolocationCallback = null
        pendingGeolocationOrigin = null
        pdfDocument?.release()
        pdfDocument = null
        super.onDestroy()
        splashDismissRunnable?.let { splashHandler.removeCallbacks(it) }
        pageLoadHandler.removeCallbacks(pageLoadTimeoutRunnable)
        cameraExecutor.shutdown()
        if (::adMobBridge.isInitialized) adMobBridge.destroy()
        try {
            CookieManager.getInstance().flush()
        } catch (_: Exception) {}
    }

    override fun onConfigurationChanged(newConfig: Configuration) {
        super.onConfigurationChanged(newConfig)
        val isNightMode = when (displayConfig.colorMode) {
            "dark" -> true
            "light" -> false
            else -> (newConfig.uiMode and Configuration.UI_MODE_NIGHT_MASK) == Configuration.UI_MODE_NIGHT_YES
        }
        applyDarkMode(isNightMode)
        updateWebBackgroundColor(isNightMode)
        updateSystemBarsAppearance(isNightMode)
    }

    private fun applyDarkMode(isNightMode: Boolean) {
        if (!::webView.isInitialized) return
        try {
            if (WebViewFeature.isFeatureSupported(WebViewFeature.ALGORITHMIC_DARKENING)) {
                WebSettingsCompat.setAlgorithmicDarkeningAllowed(webView.settings, isNightMode)
            } else if (WebViewFeature.isFeatureSupported(WebViewFeature.FORCE_DARK)) {
                val forceDark = if (isNightMode) {
                    WebSettingsCompat.FORCE_DARK_ON
                } else {
                    WebSettingsCompat.FORCE_DARK_OFF
                }
                @Suppress("DEPRECATION")
                WebSettingsCompat.setForceDark(webView.settings, forceDark)
            }
            if (WebViewFeature.isFeatureSupported(WebViewFeature.FORCE_DARK_STRATEGY)) {
                @Suppress("DEPRECATION")
                WebSettingsCompat.setForceDarkStrategy(
                    webView.settings,
                    WebSettingsCompat.DARK_STRATEGY_PREFER_WEB_THEME_OVER_USER_AGENT_DARKENING
                )
            }
        } catch (e: Exception) {
            Log.w(TAG, "applyDarkMode failed: ${e.message}")
        }
    }

    private fun updateWebBackgroundColor(isNightMode: Boolean) {
        currentWebBgColor = try {
            val hex = when {
                displayConfig.webBackgroundColor.isNotBlank() && displayConfig.webBackgroundColor != "#000000" -> displayConfig.webBackgroundColor
                displayConfig.hasSplash && displayConfig.splashBgColor.isNotBlank() -> displayConfig.splashBgColor
                else -> if (isNightMode) "#000000" else "#FFFFFF"
            }
            val cleanHex = if (hex.startsWith("#")) hex else "#$hex"
            android.graphics.Color.parseColor(cleanHex)
        } catch (_: Exception) {
            if (isNightMode) android.graphics.Color.BLACK else android.graphics.Color.WHITE
        }
        if (::webView.isInitialized) {
            webView.setBackgroundColor(currentWebBgColor)
        }
        if (::swipeRefreshLayout.isInitialized) {
            swipeRefreshLayout.setBackgroundColor(currentWebBgColor)
        }
        findViewById<LinearLayout?>(R.id.main_content_container)?.setBackgroundColor(currentWebBgColor)
    }

    private fun updateSystemBarsAppearance(isNightMode: Boolean) {
        val statusScrimActive = isStatusBarScrimActive()
        val navScrimActive = isNavBarScrimActive()
        val statusColor = resolveBarColor(displayConfig.statusBarColor, statusBar = true)
        val navColor = resolveBarColor(displayConfig.navBarColor, statusBar = false)
        val darkStatusIcons = barShouldUseDarkIcons(displayConfig.statusBarIcons, statusColor, statusScrimActive, isNightMode)
        val darkNavIcons = barShouldUseDarkIcons(displayConfig.navBarIcons, navColor, navScrimActive, isNightMode)
        val signature = listOf(displayConfig.showHeader, darkStatusIcons, darkNavIcons)
        if (signature == appliedBarsSignature) return
        appliedBarsSignature = signature

        val insetsController = WindowInsetsControllerCompat(window, window.decorView)
        insetsController.isAppearanceLightStatusBars = darkStatusIcons
        insetsController.isAppearanceLightNavigationBars = darkNavIcons

        if (!displayConfig.showHeader) {
            insetsController.hide(WindowInsetsCompat.Type.statusBars() or WindowInsetsCompat.Type.navigationBars())
            insetsController.systemBarsBehavior = WindowInsetsControllerCompat.BEHAVIOR_SHOW_TRANSIENT_BARS_BY_SWIPE
        }
    }

    private fun isStatusBarScrimActive(): Boolean =
        displayConfig.showHeader && customVideoView == null &&
            displayConfig.statusBarAlpha > 0 &&
            (displayConfig.statusBarColor.isNotBlank() || !fullBleedUnderStatusBar)

    private fun isNavBarScrimActive(): Boolean =
        displayConfig.showHeader && customVideoView == null && displayConfig.navBarAlpha > 0

    private fun parseBarColor(raw: String): Int? {
        val cleanHex = if (raw.startsWith("#")) raw else "#$raw"
        return try {
            android.graphics.Color.parseColor(cleanHex)
        } catch (_: Exception) {
            null
        }
    }

    /** Bos renk = auto: aksiyon çubuğu açıksa primaryColor (eski tek renkli çubuk yolu), değilse siyah. */
    private fun resolveBarColor(configured: String, statusBar: Boolean): Int {
        parseBarColor(configured)?.let { return it }
        if (statusBar && displayConfig.showActionBar) {
            parseBarColor(displayConfig.primaryColor)?.let { return it }
        }
        return android.graphics.Color.BLACK
    }

    /** "light" = açık renk ikonlar, "dark" = koyu ikonlar, "auto" = çubuğun gerçek renginin parlaklığı. */
    private fun barShouldUseDarkIcons(configured: String, barColor: Int, scrimActive: Boolean, isNightMode: Boolean): Boolean =
        when (configured.trim().lowercase()) {
            "dark" -> true
            "light" -> false
            else -> if (scrimActive) {
                androidx.core.graphics.ColorUtils.calculateLuminance(barColor) > 0.5
            } else {
                !isNightMode
            }
        }

    private fun applySystemBarScrims(topInset: Int, bottomInset: Int) {
        lastTopBarInset = topInset
        lastBottomBarInset = bottomInset
        applyBarScrim(
            scrim = statusBarScrim,
            inset = topInset,
            active = isStatusBarScrimActive(),
            color = resolveBarColor(displayConfig.statusBarColor, statusBar = true),
            alphaPercent = displayConfig.statusBarAlpha
        )
        applyBarScrim(
            scrim = navBarScrim,
            inset = bottomInset,
            active = isNavBarScrimActive(),
            color = resolveBarColor(displayConfig.navBarColor, statusBar = false),
            alphaPercent = displayConfig.navBarAlpha
        )
        updateSystemBarsAppearance(
            (resources.configuration.uiMode and Configuration.UI_MODE_NIGHT_MASK) == Configuration.UI_MODE_NIGHT_YES
        )
    }

    private fun applyBarScrim(scrim: View?, inset: Int, active: Boolean, color: Int, alphaPercent: Int) {
        val view = scrim ?: return
        val height = if (active) inset else 0
        if (height <= 0 || alphaPercent <= 0) {
            if (view.visibility != View.GONE) view.visibility = View.GONE
            val params = view.layoutParams
            if (params != null && params.height != 0) {
                params.height = 0
                view.layoutParams = params
            }
            return
        }
        view.setBackgroundColor(color)
        view.alpha = alphaPercent.coerceIn(0, 100) / 100f
        if (view.visibility != View.VISIBLE) view.visibility = View.VISIBLE
        val params = view.layoutParams
        if (params != null && params.height != height) {
            params.height = height
            view.layoutParams = params
        }
    }

    fun requestPermission(permission: String, callbackId: String) {
        pendingPermissionCallbackId = callbackId
        pendingPermission = permission
        permissionLauncher.launch(permission)
    }

    fun requestPermissions(permissions: Array<String>, callbackId: String) {
        pendingPermissionsCallbackId = callbackId
        multiplePermissionsLauncher.launch(permissions)
    }

    fun capturePhoto(callbackId: String, front: Boolean = false) {
        pendingCameraFront = front
        val granted = ContextCompat.checkSelfPermission(this, Manifest.permission.CAMERA) == PackageManager.PERMISSION_GRANTED
        if (front) {
            // On kamera ACTION_IMAGE_CAPTURE ile guvenilir secilemiyor (extra'lar ureticiye ozel),
            // bu yuzden CameraX ile uygulama icinden cekilir; CAMERA runtime izni sarttir.
            if (!granted) {
                if (isCameraPermissionDeclared()) {
                    pendingCameraCallbackId = callbackId
                    pendingPermission = Manifest.permission.CAMERA
                    permissionLauncher.launch(Manifest.permission.CAMERA)
                } else {
                    androidApi.onCameraResult(callbackId, false, null, "camera_permission_not_declared")
                }
                return
            }
            captureFrontPhoto(callbackId)
            return
        }
        // ACTION_IMAGE_CAPTURE is served by another app and needs no CAMERA permission. The runtime
        // request is only meaningful when the app itself declares CAMERA: AOSP and several OEM camera
        // apps refuse the intent when the caller declares the permission but does not hold it.
        if (isCameraPermissionDeclared() && !granted) {
            pendingCameraCallbackId = callbackId
            pendingPermission = Manifest.permission.CAMERA
            permissionLauncher.launch(Manifest.permission.CAMERA)
            return
        }
        launchCameraIntent(callbackId)
    }

    fun captureFrontPhoto(callbackId: String) {
        val file = File(cacheDir, "capture_front_${System.currentTimeMillis()}.jpg")
        try {
            file.parentFile?.mkdirs()
            val future = ProcessCameraProvider.getInstance(this)
            future.addListener({
                var provider: ProcessCameraProvider? = null
                try {
                    provider = future.get()
                    val imageCapture = ImageCapture.Builder()
                        .setCaptureMode(ImageCapture.CAPTURE_MODE_MINIMIZE_LATENCY)
                        .build()
                    provider!!.unbindAll()
                    provider!!.bindToLifecycle(this, CameraSelector.DEFAULT_FRONT_CAMERA, imageCapture)
                    val outputOptions = ImageCapture.OutputFileOptions.Builder(file).build()
                    imageCapture.takePicture(
                        outputOptions,
                        cameraExecutor,
                        object : ImageCapture.OnImageSavedCallback {
                            override fun onImageSaved(outputFileResults: ImageCapture.OutputFileResults) {
                                unbindCamera(provider)
                                deliverPhotoFile(callbackId, file)
                            }

                            override fun onError(exception: ImageCaptureException) {
                                Log.e(TAG, "Front camera capture failed", exception)
                                unbindCamera(provider)
                                try { file.delete() } catch (_: Throwable) {}
                                runOnUiThread {
                                    androidApi.onCameraResult(callbackId, false, null, "front_capture_failed")
                                }
                            }
                        }
                    )
                } catch (e: Exception) {
                    Log.e(TAG, "Front camera setup failed", e)
                    unbindCamera(provider)
                    try { file.delete() } catch (_: Throwable) {}
                    androidApi.onCameraResult(callbackId, false, null, e.message ?: "front_camera_unavailable")
                }
            }, ContextCompat.getMainExecutor(this))
        } catch (e: Exception) {
            Log.e(TAG, "captureFrontPhoto failed", e)
            try { file.delete() } catch (_: Throwable) {}
            androidApi.onCameraResult(callbackId, false, null, e.message ?: "front_camera_unavailable")
        }
    }

    private fun unbindCamera(provider: ProcessCameraProvider?) {
        try {
            provider?.unbindAll()
        } catch (_: Exception) {
        }
    }

    private fun isCameraPermissionDeclared(): Boolean {
        return try {
            @Suppress("DEPRECATION")
            val requested = packageManager.getPackageInfo(packageName, PackageManager.GET_PERMISSIONS).requestedPermissions
            requested?.contains(Manifest.permission.CAMERA) ?: true
        } catch (e: Exception) {
            Log.w(TAG, "requestedPermissions lookup failed, assuming CAMERA declared", e)
            true
        }
    }

    fun launchCameraIntent(callbackId: String) {
        try {
            val file = File(cacheDir, "capture_${System.currentTimeMillis()}.jpg").apply { parentFile?.mkdirs() }
            pendingPhotoFile = file
            pendingCameraCallbackId = callbackId
            val uri = FileProvider.getUriForFile(this, "${packageName}.fileprovider", file)
            takePictureLauncher.launch(uri)
        } catch (e: android.content.ActivityNotFoundException) {
            Log.e(TAG, "capturePhoto: no camera application available", e)
            pendingCameraCallbackId = null
            pendingPhotoFile = null
            androidApi.onCameraResult(callbackId, false, null, "no_camera_app")
        } catch (e: Exception) {
            Log.e(TAG, "capturePhoto launch failed", e)
            pendingCameraCallbackId = null
            pendingPhotoFile = null
            androidApi.onCameraResult(callbackId, false, null, e.message ?: "launch_failed")
        }
    }

    private fun prepareWebCaptureUri(): Uri? {
        return try {
            val file = File(cacheDir, "web_capture_${System.currentTimeMillis()}.jpg").apply { parentFile?.mkdirs() }
            pendingWebCaptureFile = file
            FileProvider.getUriForFile(this, "${packageName}.fileprovider", file)
        } catch (e: Exception) {
            Log.e(TAG, "File provider setup failed for <input capture>", e)
            pendingWebCaptureFile = null
            null
        }
    }

    fun startCameraPreview() {
        if (ContextCompat.checkSelfPermission(this, android.Manifest.permission.CAMERA) != android.content.pm.PackageManager.PERMISSION_GRANTED) {
            androidApi.onCameraPreviewResult(false, false, "permission_denied")
            return
        }
        previewView.visibility = View.VISIBLE
        val cameraProviderFuture = ProcessCameraProvider.getInstance(this)
        cameraProviderFuture.addListener({
            try {
                val cameraProvider = cameraProviderFuture.get()
                val preview = Preview.Builder()
                    .build()
                    .also { it.setSurfaceProvider(previewView.surfaceProvider) }
                val cameraSelector = CameraSelector.DEFAULT_BACK_CAMERA
                cameraProvider.unbindAll()
                cameraProvider.bindToLifecycle(this, cameraSelector, preview)
                androidApi.onCameraPreviewResult(true, true, null)
            } catch (e: Exception) {
                Log.e(TAG, "startCameraPreview failed", e)
                previewView.visibility = View.GONE
                androidApi.onCameraPreviewResult(false, false, e.message ?: "preview_failed")
            }
        }, ContextCompat.getMainExecutor(this))
    }

    fun stopCameraPreview() {
        previewView.visibility = View.GONE
        try {
            val cameraProvider = ProcessCameraProvider.getInstance(this).get()
            cameraProvider.unbindAll()
        } catch (e: Exception) {
            Log.w(TAG, "stopCameraPreview unbind failed", e)
        }
        androidApi.onCameraPreviewResult(true, false, null)
    }

    fun pickFile(mimeType: String, callbackId: String) {
        pendingFileCallbackId = callbackId
        pickFileLauncher.launch(arrayOf(mimeType))
    }

    fun createFile(fileName: String, mimeType: String, content: String, callbackId: String) {
        pendingWriteCallbackId = callbackId
        pendingWriteContent = content
        createDocumentLauncher.launch(fileName)
    }

    private fun requestLaunchPermissions(permissions: List<String>) {
        if (permissions.isEmpty()) return
        val runtimePerms = permissions.mapNotNull { toRuntimePermission(it) }.distinct()
        if (runtimePerms.isEmpty()) return
        launchPermissionsLauncher.launch(runtimePerms.toTypedArray())
    }

    private fun toRuntimePermission(permission: String): String? {
        return when (permission) {
            Manifest.permission.CAMERA,
            Manifest.permission.RECORD_AUDIO,
            Manifest.permission.ACCESS_FINE_LOCATION,
            Manifest.permission.ACCESS_COARSE_LOCATION,
            Manifest.permission.READ_PHONE_STATE -> permission
            Manifest.permission.POST_NOTIFICATIONS -> {
                if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.TIRAMISU) permission else null
            }
            Manifest.permission.ACTIVITY_RECOGNITION -> {
                if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.Q) permission else null
            }
            Manifest.permission.READ_EXTERNAL_STORAGE,
            Manifest.permission.WRITE_EXTERNAL_STORAGE -> {
                if (Build.VERSION.SDK_INT <= Build.VERSION_CODES.P) permission else null
            }
            else -> null
        }
    }

    @Suppress("DEPRECATION")
    private fun applyPrimaryColor(colorString: String, showActionBar: Boolean) {
        try {
            val color = android.graphics.Color.parseColor(colorString)
            if (showActionBar) {
                toolbar?.setBackgroundColor(color)
                val isLight = androidx.core.graphics.ColorUtils.calculateLuminance(color) > 0.5
                toolbarTitle?.setTextColor(if (isLight) android.graphics.Color.BLACK else android.graphics.Color.WHITE)
            }
        } catch (e: IllegalArgumentException) {
            // ignore invalid color
        }
    }

    private fun getActionBarHeight(): Int {
        return getTopActionBarHeight()
    }

    fun getSystemBarInsets(): androidx.core.graphics.Insets {
        if (!::webView.isInitialized) return androidx.core.graphics.Insets.NONE
        val rootInsets = ViewCompat.getRootWindowInsets(webView) ?: return androidx.core.graphics.Insets.NONE
        return rootInsets.getInsets(
            WindowInsetsCompat.Type.systemBars() or WindowInsetsCompat.Type.displayCutout()
        )
    }

    fun getTopActionBarHeight(): Int {
        if (!displayConfig.showActionBar) return 0
        val tb = toolbar ?: return 0
        if (tb.visibility != View.VISIBLE) return 0
        val measured = tb.height
        if (measured > 0) return measured
        val typedValue = android.util.TypedValue()
        val baseHeight = if (theme.resolveAttribute(android.R.attr.actionBarSize, typedValue, true)) {
            android.util.TypedValue.complexToDimensionPixelSize(typedValue.data, resources.displayMetrics)
        } else {
            (56 * resources.displayMetrics.density).toInt()
        }
        val statusBar = if (displayConfig.showHeader) {
            val rootInsets = ViewCompat.getRootWindowInsets(tb)
            rootInsets?.getInsets(WindowInsetsCompat.Type.statusBars())?.top ?: 0
        } else 0
        return baseHeight + statusBar
    }

    private fun readDisplayConfig(): DisplayConfig {
        return try {
            val json = readConfigJson()
            val obj = JSONObject(json)
            DisplayConfig(
                mode = obj.optString("mode", "local"),
                url = obj.optString("url", ""),
                showHeader = obj.optBoolean("showHeader", true),
                showActionBar = obj.optBoolean("showActionBar", false),
                keepScreenOn = obj.optBoolean("keepScreenOn", false),
                showCameraCutout = obj.optBoolean("showCameraCutout", false),
                desktopMode = obj.optBoolean("desktopMode", false),
                pullToRefresh = obj.optBoolean("pullToRefresh", true),
                noInternetDialog = obj.optBoolean("noInternetDialog", true),
                loadingIndicator = obj.optBoolean("loadingIndicator", false),
                backHistoryNavigation = obj.optBoolean("backHistoryNavigation", true),
                exitConfirmationDialog = obj.optBoolean("exitConfirmationDialog", false),
                bridgeOwnOriginOnly = obj.optBoolean("bridgeOwnOriginOnly", true),
                orientation = obj.optString("orientation", "portrait"),
                primaryColor = obj.optString("primaryColor", "#00E5CC"),
                hasSplash = obj.optBoolean("hasSplash", false),
                splashBgColor = obj.optString("splashBgColor", "#0F1318"),
                splashFadeOut = obj.optBoolean("splashFadeOut", true),
                splashLoaderStyle = obj.optString("splashLoaderStyle", "circle"),
                splashIconSize = obj.optInt("splashIconSize", 120),
                splashIconRadius = obj.optInt("splashIconRadius", 16),
                splashLoaderSize = obj.optInt("splashLoaderSize", 48),
                splashSpacing = obj.optInt("splashSpacing", 28),
                splashDuration = obj.optInt("splashDuration", 2),
                splashLoaderThickness = obj.optInt("splashLoaderThickness", 4),
                splashFadeDuration = obj.optInt("splashFadeDuration", 400),
                splashLoaderColor = obj.optString("splashLoaderColor", "#00E5CC"),
                splashFullScreen = obj.optBoolean("splashFullScreen", false),
                splashHideLoader = obj.optBoolean("splashHideLoader", false),
                colorMode = obj.optString("colorMode", "auto"),
                webBackgroundColor = obj.optString("webBackgroundColor", "#000000"),
                statusBarColor = obj.optString("statusBarColor", ""),
                statusBarAlpha = obj.optInt("statusBarAlpha", 100).coerceIn(0, 100),
                statusBarIcons = obj.optString("statusBarIcons", "auto"),
                navBarColor = obj.optString("navBarColor", ""),
                navBarAlpha = obj.optInt("navBarAlpha", 100).coerceIn(0, 100),
                navBarIcons = obj.optString("navBarIcons", "auto"),
                showWatermark = obj.optBoolean("showWatermark", false),
                isPro = obj.optBoolean("isPro", false),
                permissions = parsePermissions(obj.optJSONArray("permissions")),
                webViewSettings = parseWebViewSettings(obj.optJSONObject("webViewSettings")),
                admobChildDirectedTreatment = obj.optInt("admobChildDirectedTreatment", -1).takeIf { it in -1..1 } ?: -1,
                admobUnderAgeOfConsent = obj.optInt("admobUnderAgeOfConsent", -1).takeIf { it in -1..1 } ?: -1,
                admobMaxAdContentRating = obj.optString("admobMaxAdContentRating", "").takeIf { it in listOf("G", "PG", "T", "MA") } ?: "",
                umpDebugEnabled = obj.optBoolean("admobUseTestAds", false) && obj.optBoolean("umpDebugEnabled", false),
                umpDebugGeography = obj.optString("umpDebugGeography", "DISABLED"),
                umpTestDeviceIds = parseTestDeviceIds(obj.optJSONArray("umpTestDeviceIds")),
                admobEnabled = obj.optBoolean("admobEnabled", false),
                admobAppId = obj.optString("admobAppId", ""),
                admobBannerUnitId = obj.optString("admobBannerUnitId", ""),
                admobInterstitialUnitId = obj.optString("admobInterstitialUnitId", ""),
                admobRewardedUnitId = obj.optString("admobRewardedUnitId", ""),
                admobBannerPosition = obj.optString("admobBannerPosition", "bottom"),
                admobShowBannerOnStart = obj.optBoolean("admobShowBannerOnStart", false),
                admobTestDeviceIds = parseTestDeviceIds(obj.optJSONArray("admobTestDeviceIds")),
                admobAutoLoadInterstitial = obj.optBoolean("admobAutoLoadInterstitial", false),
                admobAutoLoadRewarded = obj.optBoolean("admobAutoLoadRewarded", false),
                admobUseTestAds = obj.optBoolean("admobUseTestAds", false),
                admobBannerEnabled = obj.optBoolean("admobBannerEnabled", false),
                admobInterstitialEnabled = obj.optBoolean("admobInterstitialEnabled", false),
                admobRewardedEnabled = obj.optBoolean("admobRewardedEnabled", false),
                admobInterstitialIntervalSeconds = obj.optInt("admobInterstitialIntervalSeconds", 0),
                admobInterstitialPageCount = obj.optInt("admobInterstitialPageCount", 0),
                pdfReaderJson = obj.optJSONObject("pdfReader")?.toString().orEmpty()
            )
        } catch (e: Exception) {
            DisplayConfig()
        }
    }

    private fun readConfigJson(context: android.content.Context = this): String {
        // Try the encrypted runtime config first.
        return try {
            val plain = context.assets.open("www/runtime.cache").use { ConfigCrypto.decryptConfig(it) }
            String(plain, Charsets.UTF_8)
        } catch (_: Exception) {
            // Fallback for old/unsigned/debug builds that still ship plaintext config.json.
            context.assets.open("www/config.json").bufferedReader().use { it.readText() }
        }
    }

    private fun parseWebViewSettings(obj: JSONObject?): WebViewSettings {
        if (obj == null) return WebViewSettings()
        return WebViewSettings(
            javaScriptEnabled = obj.optBoolean("javaScriptEnabled", true),
            domStorageEnabled = obj.optBoolean("domStorageEnabled", true),
            allowFileAccess = obj.optBoolean("allowFileAccess", false),
            allowContentAccess = obj.optBoolean("allowContentAccess", false),
            allowUniversalAccessFromFileURLs = obj.optBoolean("allowUniversalAccessFromFileURLs", true),
            allowFileAccessFromFileURLs = obj.optBoolean("allowFileAccessFromFileURLs", true),
            builtInZoomControls = obj.optBoolean("builtInZoomControls", true),
            displayZoomControls = obj.optBoolean("displayZoomControls", false),
            useWideViewPort = obj.optBoolean("useWideViewPort", true),
            loadWithOverviewMode = obj.optBoolean("loadWithOverviewMode", true),
            cacheMode = obj.optInt("cacheMode", WebSettings.LOAD_DEFAULT),
            mixedContentMode = obj.optInt("mixedContentMode", WebSettings.MIXED_CONTENT_ALWAYS_ALLOW),
            userAgent = obj.optString("userAgent").takeIf { it.isNotBlank() },
            textZoom = obj.optInt("textZoom", 100),
            geolocationEnabled = obj.optBoolean("geolocationEnabled", false)
        )
    }

    private fun parsePermissions(array: org.json.JSONArray?): List<String> {
        if (array == null) return emptyList()
        return (0 until array.length()).mapNotNull { array.optString(it) }.filter { it.isNotBlank() }
    }

    private fun parseTestDeviceIds(array: org.json.JSONArray?): List<String> {
        if (array == null) return emptyList()
        return (0 until array.length()).mapNotNull { array.optString(it) }.filter { it.isNotBlank() }
    }

    private sealed class UriReadResult {
        data class Content(val base64: String) : UriReadResult()
        data class Error(val code: String) : UriReadResult()
    }

    /**
     * Dosyayi sinirli bellekle okur. Eskiden readBytes() ile tum dosya RAM'e aliniyordu;
     * buyuk bir secim uygulamayi OOM ile deviriyordu.
     */
    private fun readUriContentResult(uri: Uri): UriReadResult {
        val limit = AndroidAPI.MAX_BASE64_FILE_BYTES
        return try {
            val stream = when (uri.scheme) {
                "content" -> contentResolver.openInputStream(uri)
                "file" -> uri.path?.let { File(it).inputStream() }
                else -> null
            } ?: return UriReadResult.Error("unreadable_uri")
            stream.use { input ->
                val buffer = java.io.ByteArrayOutputStream()
                val chunk = ByteArray(64 * 1024)
                while (true) {
                    val read = input.read(chunk)
                    if (read <= 0) break
                    if (buffer.size().toLong() + read > limit) return UriReadResult.Error("file_too_large")
                    buffer.write(chunk, 0, read)
                }
                UriReadResult.Content(android.util.Base64.encodeToString(buffer.toByteArray(), android.util.Base64.NO_WRAP))
            }
        } catch (e: Exception) {
            Log.e(TAG, "readUriContentResult failed", e)
            UriReadResult.Error(e.message ?: "read_failed")
        }
    }

    fun downloadDataUri(url: String, contentDisposition: String? = null, mimeType: String? = null) {
        Thread {
            try {
                val commaIndex = url.indexOf(',')
                if (commaIndex == -1) {
                    androidApi.onDownloadResult("", false, "invalid_data_uri")
                    return@Thread
                }
                val metadata = url.substring(0, commaIndex)
                val rawData = url.substring(commaIndex + 1)
                val isBase64 = metadata.contains(";base64", ignoreCase = true)
                val explicitMime = metadata.removePrefix("data:").substringBefore(';').trim().takeIf { it.isNotBlank() }
                    ?: mimeType?.takeIf { it.isNotBlank() }
                    ?: "application/octet-stream"

                val bytes: ByteArray = if (isBase64) {
                    android.util.Base64.decode(rawData.trim(), android.util.Base64.DEFAULT)
                } else {
                    try {
                        java.net.URLDecoder.decode(rawData, "UTF-8").toByteArray(Charsets.UTF_8)
                    } catch (_: Exception) {
                        rawData.toByteArray(Charsets.UTF_8)
                    }
                }
                if (bytes.isEmpty()) {
                    androidApi.onDownloadResult("", false, "empty_data")
                    return@Thread
                }

                val ext = extensionForMime(explicitMime)
                    ?: MimeTypeMap.getSingleton().getExtensionFromMimeType(explicitMime)
                    ?: "bin"
                val explicitName = contentDisposition?.let { cd ->
                    val clean = cd.trim()
                    if (clean.contains("filename=", ignoreCase = true)) {
                        clean.substringAfter("filename=").trim('"', ' ', ';')
                    } else if (!clean.startsWith("attachment", ignoreCase = true)) {
                        if (clean.contains(".")) clean.trim('"', ' ')
                        else "$clean.$ext"
                    } else {
                        null
                    }
                }
                val guessedName = explicitName ?: URLUtil.guessFileName(url, contentDisposition, explicitMime)
                var fileName = if (!explicitName.isNullOrBlank()) {
                    explicitName
                } else if (guessedName.isNotBlank() && guessedName != "downloadfile.bin" && !guessedName.contains(";base64")) {
                    guessedName
                } else {
                    "export_${System.currentTimeMillis()}.$ext"
                }

                // Gercek MIME ile celisen uzantiyi duzelt: sayfa download="veri.json" dese
                // bile blob bir PNG ise dosya .json olarak iniyordu ve "acilmiyor" diye bildiriliyordu.
                fileName = resolveDownloadName(fileName, explicitMime)

                saveBytesToDownloads(bytes, fileName, explicitMime)
            } catch (e: Exception) {
                Log.e(TAG, "Data URI download failed", e)
                androidApi.onDownloadResult("", false, e.message ?: "download_failed")
            }
        }.start()
    }

    fun saveBytesToDownloads(bytes: ByteArray, fileName: String, mimeType: String) {
        try {
            val resolver = contentResolver
            var saved = false

            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.Q) {
                try {
                    val collection = MediaStore.Downloads.getContentUri(MediaStore.VOLUME_EXTERNAL_PRIMARY)
                    val contentValues = ContentValues().apply {
                        put(MediaStore.MediaColumns.DISPLAY_NAME, fileName)
                        put(MediaStore.MediaColumns.MIME_TYPE, mimeType)
                        put(MediaStore.MediaColumns.RELATIVE_PATH, Environment.DIRECTORY_DOWNLOADS)
                        put(MediaStore.MediaColumns.IS_PENDING, 1)
                    }
                    val uri = resolver.insert(collection, contentValues)
                    if (uri != null) {
                        resolver.openOutputStream(uri)?.use { out ->
                            out.write(bytes)
                        }
                        contentValues.clear()
                        contentValues.put(MediaStore.MediaColumns.IS_PENDING, 0)
                        resolver.update(uri, contentValues, null, null)
                        saved = true
                    }
                } catch (e: Exception) {
                    Log.w(TAG, "MediaStore Q insert failed, attempting fallback: ${e.message}")
                }
            }

            if (!saved) {
                val downloadsDir = Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOWNLOADS)
                downloadsDir.mkdirs()
                val target = File(downloadsDir, fileName)
                target.writeBytes(bytes)
                saved = true
            }

            runOnUiThread {
                androidApi.onDownloadResult(fileName, true, null)
                Toast.makeText(this, getString(R.string.download_completed, fileName), Toast.LENGTH_SHORT).show()
            }
        } catch (e: Exception) {
            Log.e(TAG, "Failed to save file to downloads", e)
            try {
                val fallbackDir = getExternalFilesDir(Environment.DIRECTORY_DOWNLOADS) ?: filesDir
                val fallbackFile = File(fallbackDir, fileName)
                fallbackFile.writeBytes(bytes)
                runOnUiThread {
                    androidApi.onDownloadResult(fileName, true, "saved_to_app_storage")
                    Toast.makeText(this, getString(R.string.download_completed, fileName), Toast.LENGTH_SHORT).show()
                }
            } catch (ex: Exception) {
                runOnUiThread {
                    androidApi.onDownloadResult(fileName, false, ex.message ?: e.message ?: "save_failed")
                    Toast.makeText(this, getString(R.string.download_failed, e.message ?: ""), Toast.LENGTH_SHORT).show()
                }
            }
        }
    }

    private var activePrintJob: android.print.PrintJob? = null

    internal fun printCurrentPage(): String? {
        if (isFinishing || isDestroyed || !::webView.isInitialized || !pageLoadFinished || lastPageLoadFailed) {
            Log.w(TAG, "Printing requested before page is ready")
            Toast.makeText(this, R.string.print_launch_failed, Toast.LENGTH_SHORT).show()
            return "page_not_ready"
        }
        // WebView has one PDF exporter; a second job makes its onWrite throw
        // "printing is already pending" on the main thread and kills the app.
        activePrintJob?.let { job ->
            if (!job.isCompleted && !job.isCancelled && !job.isFailed) {
                Toast.makeText(this, R.string.print_in_progress, Toast.LENGTH_SHORT).show()
                return "print_in_progress"
            }
        }
        return try {
            val manager = getSystemService(Context.PRINT_SERVICE) as? PrintManager
                ?: error("Print service unavailable")
            val title = webView.title?.takeIf { it.isNotBlank() } ?: getString(R.string.app_name)
            val documentName = title.take(120)
            activePrintJob = checkNotNull(manager.print(documentName, webView.createPrintDocumentAdapter(documentName), PrintAttributes.Builder().build()))
            Log.d(TAG, "Android print dialog opened")
            null
        } catch (error: Exception) {
            Log.w(TAG, "Unable to open Android printing", error)
            Toast.makeText(this, R.string.print_launch_failed, Toast.LENGTH_SHORT).show()
            "launch_failed"
        }
    }

    private fun injectCleartextInterceptor() {
        if (!::webView.isInitialized) return
        runOnUiThread {
            webView.evaluateJavascript(CLEARTEXT_INTERCEPTOR_SCRIPT, null)
        }
    }

    private fun injectBlobDownloadInterceptor() {
        if (!::webView.isInitialized) return
        runOnUiThread {
            webView.evaluateJavascript(DOWNLOAD_INTERCEPTOR_SCRIPT, null)
        }
    }

    private fun hideSplash() {
        splashDismissRunnable?.let { splashHandler.removeCallbacks(it) }
        val circleView = findViewById<ImageView>(R.id.splash_loader_circle)
        (circleView?.drawable as? CircularProgressDrawable)?.stop()
        val container = findViewById<View>(R.id.splash_container)
        if (container != null && container.visibility == View.VISIBLE) {
            if (displayConfig.splashFadeOut) {
                val fadeDuration = displayConfig.splashFadeDuration.coerceIn(100, 2000).toLong()
                container.animate()
                    .alpha(0f)
                    .setDuration(fadeDuration)
                    .withEndAction {
                        container.visibility = View.GONE
                        splashView.visibility = ImageView.GONE
                    }
                    .start()
            } else {
                container.visibility = View.GONE
                splashView.visibility = ImageView.GONE
            }
        } else {
            splashView.visibility = ImageView.GONE
        }
    }

    private fun setupSplash() {
        if (!displayConfig.hasSplash) {
            findViewById<View>(R.id.splash_container)?.visibility = View.GONE
            splashView.visibility = ImageView.GONE
            return
        }
        splashStartTime = System.currentTimeMillis()
        val durationMs = displayConfig.splashDuration.coerceIn(1, 15) * 1000L

        val splashContainer = findViewById<View>(R.id.splash_container)
        val splashIconView = findViewById<ImageView>(R.id.splash_icon_view)
        val splashSpacingView = findViewById<View>(R.id.splash_spacing_view)
        val splashLoaderCircle = findViewById<ImageView>(R.id.splash_loader_circle)
        val splashLoaderBar = findViewById<ProgressBar>(R.id.splash_loader_bar)

        if (splashContainer == null || splashIconView == null) {
            try {
                splashView.setImageDrawable(null)
                val inputStream = assets.open("www/splash.png")
                val drawable = android.graphics.drawable.Drawable.createFromStream(inputStream, null)
                splashView.setImageDrawable(drawable)
                splashView.visibility = ImageView.VISIBLE
                splashDismissRunnable?.let { splashHandler.removeCallbacks(it) }
                splashDismissRunnable = Runnable { hideSplash() }
                splashHandler.postDelayed(splashDismissRunnable!!, durationMs)
            } catch (_: Exception) {
                splashView.visibility = ImageView.GONE
            }
            return
        }

        try {
            val bg = try {
                android.graphics.Color.parseColor(displayConfig.splashBgColor)
            } catch (_: Exception) {
                android.graphics.Color.parseColor("#0F1318")
            }
            splashContainer.setBackgroundColor(bg)

            val loaderColor = try {
                android.graphics.Color.parseColor(displayConfig.splashLoaderColor)
            } catch (_: Exception) {
                try {
                    android.graphics.Color.parseColor(displayConfig.primaryColor)
                } catch (_: Exception) {
                    android.graphics.Color.parseColor("#00E5CC")
                }
            }

            val density = resources.displayMetrics.density
            val iconSizePx = (displayConfig.splashIconSize * density).toInt()
            val iconRadiusPx = displayConfig.splashIconRadius * density
            val spacingPx = (displayConfig.splashSpacing * density).toInt()
            val loaderSizePx = (displayConfig.splashLoaderSize * density).toInt()
            val thicknessPx = (displayConfig.splashLoaderThickness.coerceIn(2, 24) * density).toInt()

            fun configureLoader() {
                when (displayConfig.splashLoaderStyle) {
                    "bar" -> {
                        (splashLoaderCircle?.drawable as? CircularProgressDrawable)?.stop()
                        splashLoaderCircle?.visibility = View.GONE
                        splashLoaderBar?.visibility = View.VISIBLE
                        splashLoaderBar?.layoutParams = LinearLayout.LayoutParams((loaderSizePx * 2.5f).toInt(), thicknessPx.coerceAtLeast(2)).apply {
                            gravity = android.view.Gravity.CENTER_HORIZONTAL
                        }
                        splashLoaderBar?.indeterminateTintList = android.content.res.ColorStateList.valueOf(loaderColor)
                    }
                    "none" -> {
                        (splashLoaderCircle?.drawable as? CircularProgressDrawable)?.stop()
                        splashLoaderCircle?.visibility = View.GONE
                        splashLoaderBar?.visibility = View.GONE
                        splashSpacingView?.visibility = View.GONE
                    }
                    else -> { // "circle"
                        splashLoaderCircle?.visibility = View.VISIBLE
                        splashLoaderBar?.visibility = View.GONE
                        splashLoaderCircle?.layoutParams = LinearLayout.LayoutParams(loaderSizePx, loaderSizePx).apply {
                            gravity = android.view.Gravity.CENTER_HORIZONTAL
                        }
                        val stroke = thicknessPx.toFloat().coerceIn(2f, (loaderSizePx / 3f))
                        val radius = maxOf(4f, (loaderSizePx / 2f) - stroke - 4f)
                        val progressDrawable = CircularProgressDrawable(this).apply {
                            strokeWidth = stroke
                            centerRadius = radius
                            setColorSchemeColors(loaderColor)
                            start()
                        }
                        splashLoaderCircle?.setImageDrawable(progressDrawable)
                    }
                }
            }

            if (displayConfig.splashFullScreen) {
                splashIconView.visibility = View.GONE
                splashSpacingView?.visibility = View.GONE
                try {
                    assets.open("www/splash.png").use { inputStream ->
                        val drawable = android.graphics.drawable.Drawable.createFromStream(inputStream, null)
                        splashView.setImageDrawable(drawable)
                        splashView.scaleType = ImageView.ScaleType.CENTER_CROP
                        splashView.visibility = ImageView.VISIBLE
                    }
                } catch (_: Exception) {
                    splashView.visibility = ImageView.GONE
                }

                if (displayConfig.splashHideLoader) {
                    (splashLoaderCircle?.drawable as? CircularProgressDrawable)?.stop()
                    splashLoaderCircle?.visibility = View.GONE
                    splashLoaderBar?.visibility = View.GONE
                    findViewById<View?>(R.id.splash_content)?.visibility = View.GONE
                } else {
                    findViewById<View?>(R.id.splash_content)?.visibility = View.VISIBLE
                    configureLoader()
                }
            } else {
                splashView.visibility = ImageView.GONE
                findViewById<View?>(R.id.splash_content)?.visibility = View.VISIBLE

                splashIconView.layoutParams = LinearLayout.LayoutParams(iconSizePx, iconSizePx).apply {
                    gravity = android.view.Gravity.CENTER_HORIZONTAL
                }
                splashIconView.outlineProvider = object : android.view.ViewOutlineProvider() {
                    override fun getOutline(view: View, outline: android.graphics.Outline) {
                        outline.setRoundRect(0, 0, view.width, view.height, iconRadiusPx)
                    }
                }
                splashIconView.clipToOutline = true
                splashSpacingView?.layoutParams = LinearLayout.LayoutParams(1, spacingPx)

                configureLoader()

                try {
                    assets.open("www/splash.png").use { inputStream ->
                        val drawable = android.graphics.drawable.Drawable.createFromStream(inputStream, null)
                        splashIconView.setImageDrawable(drawable)
                        splashIconView.visibility = View.VISIBLE
                    }
                } catch (_: Exception) {
                    splashIconView.visibility = View.GONE
                    splashSpacingView?.visibility = View.GONE
                }
            }

            splashContainer.visibility = View.VISIBLE
            splashContainer.alpha = 1f

            splashDismissRunnable?.let { splashHandler.removeCallbacks(it) }
            splashDismissRunnable = Runnable { hideSplash() }
            splashHandler.postDelayed(splashDismissRunnable!!, maxOf(durationMs, 10_000L))
        } catch (e: Exception) {
            splashContainer.visibility = View.GONE
            splashView.visibility = ImageView.GONE
        }
    }

    private fun onPageLoadFailed(message: String) {
        pageLoadFinished = true
        pageLoadHandler.removeCallbacks(pageLoadTimeoutRunnable)
        progressBar.visibility = ProgressBar.GONE
        hideSplash()
        Log.e(TAG, message)
        android.widget.Toast.makeText(this, message, android.widget.Toast.LENGTH_LONG).show()
    }

    private fun onPageLoadTimedOut() {
        if (pageLoadFinished) return
        lastPageLoadFailed = true
        if (displayConfig.mode == "url" && displayConfig.noInternetDialog) {
            showNoInternetDialog()
        } else {
            onPageLoadFailed(getString(R.string.page_load_timeout))
        }
    }

    /**
     * Decide whether a URL should be loaded inside the WebView or handed off
     * to an external app / the Play Store. This prevents errors such as
     * net::ERR_UNKNOWN_URL_SCHEME for intent:// links.
     */
    private fun handleExternalNavigation(uri: Uri?): Boolean {
        if (uri == null) return false
        val scheme = uri.scheme?.lowercase(Locale.ROOT) ?: return false

        return when {
            scheme == "http" || scheme == "https" -> {
                val host = uri.host?.lowercase(Locale.ROOT) ?: return false
                when {
                    host.contains("play.google.com") || host.contains("market.android.com") -> {
                        launchExternalApp(uri, "com.android.vending")
                    }
                    else -> false
                }
            }
            scheme == "blob" -> {
                // Uzanti blob.type'tan cozulur (downloadDataUri); sabit .json resim/video blob'larini bozuyordu.
                androidApi.downloadBlobUrl(uri.toString(), "export_${System.currentTimeMillis()}", "application/octet-stream")
                true
            }
            scheme == "data" -> {
                downloadDataUri(uri.toString())
                true
            }
            scheme == "intent" -> handleIntentUrl(uri.toString())
            scheme == "tel" -> launchExternalApp(Intent(Intent.ACTION_DIAL, uri))
            scheme == "mailto" -> launchExternalApp(Intent(Intent.ACTION_SENDTO, uri))
            scheme == "market" -> launchExternalApp(uri, "com.android.vending")
            else -> launchExternalApp(Intent(Intent.ACTION_VIEW, uri))
        }
    }

    private fun isLocationPermissionDeclared(): Boolean = declaredLocationPermissions().isNotEmpty()

    private fun declaredLocationPermissions(): List<String> {
        return try {
            @Suppress("DEPRECATION")
            val requested = packageManager.getPackageInfo(packageName, PackageManager.GET_PERMISSIONS)
                .requestedPermissions?.toSet() ?: emptySet()
            listOf(Manifest.permission.ACCESS_FINE_LOCATION, Manifest.permission.ACCESS_COARSE_LOCATION)
                .filter { it in requested }
        } catch (e: Exception) {
            Log.w(TAG, "requestedPermissions lookup failed", e)
            emptyList()
        }
    }

    private fun hasLocationPermission(): Boolean {
        return ContextCompat.checkSelfPermission(this, Manifest.permission.ACCESS_FINE_LOCATION) == PackageManager.PERMISSION_GRANTED ||
            ContextCompat.checkSelfPermission(this, Manifest.permission.ACCESS_COARSE_LOCATION) == PackageManager.PERMISSION_GRANTED
    }

    /**
     * window.open / target=_blank: Chrome yeni sekme acar; burada ana sayfanin ustune ayri bir WebView
     * yerlestirilir. window.opener korunur, boylece OAuth/odeme popup'lari postMessage ile sonucu
     * geri iletebilir. Chrome gibi kullanici hareketi olmadan acilan popup'lar engellenir.
     */
    private fun attachPopupWindow(isUserGesture: Boolean, resultMsg: android.os.Message?): Boolean {
        val transport = resultMsg?.obj as? WebView.WebViewTransport ?: return false
        if (!isUserGesture) {
            Log.d(TAG, "Popup blocked: no user gesture")
            return false
        }
        val popup = try {
            openPopupWebView()
        } catch (e: Exception) {
            Log.e(TAG, "Popup WebView creation failed", e)
            return false
        }
        transport.webView = popup
        resultMsg.sendToTarget()
        return true
    }

    @SuppressLint("SetJavaScriptEnabled")
    private fun openPopupWebView(): WebView {
        closePopupWebView()
        val main = webView.settings
        val popup = WebView(this)
        popup.settings.apply {
            javaScriptEnabled = main.javaScriptEnabled
            domStorageEnabled = main.domStorageEnabled
            javaScriptCanOpenWindowsAutomatically = true
            setSupportMultipleWindows(true)
            mixedContentMode = main.mixedContentMode
            mediaPlaybackRequiresUserGesture = false
            useWideViewPort = true
            loadWithOverviewMode = true
            setSupportZoom(true)
            builtInZoomControls = true
            displayZoomControls = false
            userAgentString = main.userAgentString
            setGeolocationEnabled(main.javaScriptEnabled && isLocationPermissionDeclared())
        }
        try {
            CookieManager.getInstance().setAcceptThirdPartyCookies(popup, true)
        } catch (_: Exception) {}
        popup.webViewClient = object : WebViewClient() {
            override fun shouldOverrideUrlLoading(view: WebView?, request: WebResourceRequest?): Boolean {
                val uri = request?.url
                val handled = if (request?.isForMainFrame == true && PdfActivity.isPdf(uri)) {
                    openPdf(uri!!)
                } else if (uri?.scheme.equals("blob", ignoreCase = true) && view != null) {
                    androidApi.downloadBlobUrlIn(view, PopupDownloadBridge.NAME, uri.toString(),
                        "export_${System.currentTimeMillis()}", "application/octet-stream")
                    true
                } else {
                    handleExternalNavigation(uri)
                }
                // Sadece harici uygulamaya yonlenen bos bir popup ekranda beyaz sayfa olarak kalmasin.
                // Blob okumasi popup belgesinde surer; o durumda kapatma.
                val isBlob = uri?.scheme.equals("blob", ignoreCase = true)
                if (handled && !isBlob && view != null && view.copyBackForwardList().size == 0) {
                    view.post { if (popupWebView === view) closePopupWebView() }
                }
                return handled
            }

            // Yerel asset'ler (appassets) ve cleartext proxy ana istemcide; popup'ta da ayni sekilde cozulsun.
            override fun shouldInterceptRequest(view: WebView?, request: WebResourceRequest?): WebResourceResponse? =
                mainWebViewClient.shouldInterceptRequest(view, request)
        }
        popup.webChromeClient = object : WebChromeClient() {
            override fun onCreateWindow(
                view: WebView?,
                isDialog: Boolean,
                isUserGesture: Boolean,
                resultMsg: android.os.Message?
            ): Boolean = attachPopupWindow(isUserGesture, resultMsg)

            override fun onCloseWindow(window: WebView?) {
                if (popupWebView === window) closePopupWebView()
            }

            override fun onShowFileChooser(
                webView: WebView?,
                filePathCallback: ValueCallback<Array<Uri>>?,
                fileChooserParams: FileChooserParams?
            ): Boolean = mainChromeClient.onShowFileChooser(webView, filePathCallback, fileChooserParams)

            override fun onPermissionRequest(request: PermissionRequest?) =
                mainChromeClient.onPermissionRequest(request)

            override fun onGeolocationPermissionsShowPrompt(
                origin: String?,
                callback: GeolocationPermissions.Callback?
            ) = mainChromeClient.onGeolocationPermissionsShowPrompt(origin, callback)

            override fun onShowCustomView(view: View?, callback: CustomViewCallback?) =
                mainChromeClient.onShowCustomView(view, callback)

            override fun onHideCustomView() = mainChromeClient.onHideCustomView()
        }
        popup.addJavascriptInterface(PopupDownloadBridge(this, androidApi, popup), PopupDownloadBridge.NAME)
        if (WebViewFeature.isFeatureSupported(WebViewFeature.DOCUMENT_START_SCRIPT)) {
            try {
                WebViewCompat.addDocumentStartJavaScript(popup, DOWNLOAD_INTERCEPTOR_SCRIPT, setOf("*"))
            } catch (e: Exception) {
                Log.w(TAG, "Popup download script failed: ${e.message}")
            }
        }
        popup.setDownloadListener { url, userAgent, contentDisposition, mimetype, contentLength ->
            val trimmed = url?.trim().orEmpty()
            if (trimmed.startsWith("blob:", ignoreCase = true)) {
                // Blob yalniz popup belgesinde okunabilir; ana WebView'dan fetch basarisiz olur.
                val guessed = URLUtil.guessFileName(trimmed, contentDisposition, mimetype)
                val safeName = guessed.takeIf { it.isNotBlank() && it != "downloadfile.bin" }
                    ?: "export_${System.currentTimeMillis()}"
                androidApi.downloadBlobUrlIn(popup, PopupDownloadBridge.NAME, trimmed, safeName, mimetype ?: "application/octet-stream")
            } else {
                downloadListener.onDownloadStart(url, userAgent, contentDisposition, mimetype, contentLength)
            }
        }

        val density = resources.displayMetrics.density
        val closeButton = android.widget.ImageButton(this).apply {
            setImageResource(android.R.drawable.ic_menu_close_clear_cancel)
            contentDescription = getString(android.R.string.cancel)
            background = android.graphics.drawable.GradientDrawable().apply {
                shape = android.graphics.drawable.GradientDrawable.OVAL
                setColor(android.graphics.Color.parseColor("#99000000"))
            }
            setColorFilter(android.graphics.Color.WHITE)
            setOnClickListener { closePopupWebView() }
        }
        val container = FrameLayout(this).apply {
            setBackgroundColor(android.graphics.Color.WHITE)
            isClickable = true
            setPadding(popupInsets.left, popupInsets.top, popupInsets.right, popupInsets.bottom)
            addView(popup, FrameLayout.LayoutParams(
                FrameLayout.LayoutParams.MATCH_PARENT,
                FrameLayout.LayoutParams.MATCH_PARENT
            ))
            val size = (40 * density).toInt()
            addView(closeButton, FrameLayout.LayoutParams(size, size, android.view.Gravity.TOP or android.view.Gravity.END).apply {
                val margin = (8 * density).toInt()
                setMargins(margin, margin, margin, margin)
            })
        }
        // Icerigin hemen ustune: sistem cubugu scrim'leri, splash, banner ve kamera onizlemesi ustte kalir.
        val rootLayout: FrameLayout = findViewById(R.id.root_layout)
        val contentIndex = rootLayout.indexOfChild(findViewById(R.id.main_content_container))
        rootLayout.addView(container, contentIndex + 1, FrameLayout.LayoutParams(
            FrameLayout.LayoutParams.MATCH_PARENT,
            FrameLayout.LayoutParams.MATCH_PARENT
        ))
        popupContainer = container
        popupWebView = popup
        return popup
    }

    private fun closePopupWebView() {
        val popup = popupWebView ?: return
        val container = popupContainer
        popupWebView = null
        popupContainer = null
        (container?.parent as? ViewGroup)?.removeView(container)
        try {
            popup.stopLoading()
            popup.webChromeClient = null
            popup.destroy()
        } catch (e: Exception) {
            Log.w(TAG, "Popup WebView destroy failed: ${e.message}")
        }
    }

    private fun handleIntentUrl(urlString: String): Boolean {
        return try {
            val intent = Intent.parseUri(urlString, Intent.URI_INTENT_SCHEME)
            val packageName = intent.`package`
            if (packageName != null && isPackageInstalled(packageName)) {
                launchExternalApp(intent)
            } else {
                val fallback = intent.getStringExtra("browser_fallback_url")
                    ?: intent.getStringExtra("S.browser_fallback_url")
                if (!fallback.isNullOrBlank()) {
                    launchExternalApp(Uri.parse(fallback))
                } else if (packageName != null) {
                    launchExternalApp(
                        Uri.parse("https://play.google.com/store/apps/details?id=$packageName"),
                        "com.android.vending"
                    )
                } else {
                    false
                }
            }
        } catch (_: Exception) {
            false
        }
    }

    private fun launchExternalApp(uri: Uri, preferredPackage: String? = null): Boolean {
        return launchExternalApp(Intent(Intent.ACTION_VIEW, uri), preferredPackage)
    }

    private fun launchExternalApp(intent: Intent, preferredPackage: String? = null): Boolean {
        return try {
            if (!preferredPackage.isNullOrBlank() && isPackageInstalled(preferredPackage)) {
                intent.setPackage(preferredPackage)
            }
            startActivity(intent)
            true
        } catch (_: Exception) {
            false
        }
    }

    @Suppress("DEPRECATION")
    private fun isPackageInstalled(packageName: String): Boolean {
        return try {
            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.TIRAMISU) {
                packageManager.getPackageInfo(packageName, PackageManager.PackageInfoFlags.of(0))
            } else {
                packageManager.getPackageInfo(packageName, 0)
            }
            true
        } catch (_: Exception) {
            false
        }
    }
}

// WebChromeClient.FileChooserParams exposes accept types but not the HTML "capture" attribute, so the
// camera entry is offered whenever the input can accept an image (mirrors Chrome's own chooser).
/** Screen Orientation API tipini Activity yonune cevirir; bilinmeyen tip null (JS TypeError). */
internal fun webOrientationToActivity(type: String): Int? = when (type.trim().lowercase(Locale.ROOT)) {
    "portrait" -> ActivityInfo.SCREEN_ORIENTATION_SENSOR_PORTRAIT
    "portrait-primary", "natural" -> ActivityInfo.SCREEN_ORIENTATION_PORTRAIT
    "portrait-secondary" -> ActivityInfo.SCREEN_ORIENTATION_REVERSE_PORTRAIT
    "landscape" -> ActivityInfo.SCREEN_ORIENTATION_SENSOR_LANDSCAPE
    "landscape-primary" -> ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE
    "landscape-secondary" -> ActivityInfo.SCREEN_ORIENTATION_REVERSE_LANDSCAPE
    "any" -> ActivityInfo.SCREEN_ORIENTATION_FULL_SENSOR
    else -> null
}

internal fun shouldOfferCameraCapture(mimeTypes: List<String>): Boolean {
    return mimeTypes.isEmpty() || mimeTypes.any { it == "*/*" || it.startsWith("image/") }
}

/**
 * MIME -> dosya uzantisi tablosu. MimeTypeMap'ce bilinmeyen (veya WebView'in undefined dondurdugu)
 * turler yuzunden "export_x.bin" ile inen kayitlar kullanci tarafindan acilamiyordu.
 */
private val MIME_TO_EXTENSION: Map<String, String> = mapOf(
    "image/png" to "png",
    "image/jpeg" to "jpg",
    "image/jpg" to "jpg",
    "image/pjpeg" to "jpg",
    "image/webp" to "webp",
    "image/gif" to "gif",
    "image/svg+xml" to "svg",
    "image/avif" to "avif",
    "image/x-icon" to "ico",
    "image/heic" to "heic",
    "video/mp4" to "mp4",
    "video/mpeg" to "mpeg",
    "video/webm" to "webm",
    "video/quicktime" to "mov",
    "audio/mpeg" to "mp3",
    "audio/mp3" to "mp3",
    "audio/wav" to "wav",
    "audio/x-wav" to "wav",
    "audio/wave" to "wav",
    "audio/ogg" to "ogg",
    "audio/mp4" to "m4a",
    "audio/aac" to "aac",
    "audio/webm" to "weba",
    "audio/flac" to "flac",
    "application/pdf" to "pdf",
    "application/zip" to "zip",
    "application/x-zip-compressed" to "zip",
    "application/json" to "json",
    "application/xml" to "xml",
    "application/octet-stream" to "bin",
    "application/vnd.openxmlformats-officedocument.spreadsheetml.sheet" to "xlsx",
    "application/vnd.ms-excel" to "xls",
    "text/xml" to "xml",
    "text/csv" to "csv",
    "text/html" to "html",
    "text/plain" to "txt",
    "text/css" to "css",
    "text/javascript" to "js",
    "text/markdown" to "md"
)

/** Bilinmeyen veya genetik (octet-stream) turler icin null: isim kullaniciya birakilir. */
internal fun extensionForMime(mimeType: String?): String? {
    val normalized = mimeType?.trim()?.lowercase()?.substringBefore(';')?.trim() ?: return null
    if (normalized.isEmpty() || normalized == "application/octet-stream") return null
    return MIME_TO_EXTENSION[normalized]
}

/**
 * Indirme adini gercek MIME turuyle uzlasik hale getirir: yasak karakterleri temizler,
 * uzanti yoksa ekler, uzanti turle celisiyorsa duzeltir. Tur bilinmiyorsa isme dokunmaz.
 */
/**
 * Sunucunun Content-Disposition'da verdigi dosya adi. URLUtil.guessFileName application/octet-stream
 * icin uzantiyi .bin'e ceviriyordu (Chrome sunucunun adini korur). RFC 5987 filename* onceliklidir.
 */
internal fun contentDispositionFileName(contentDisposition: String?): String? {
    if (contentDisposition.isNullOrBlank()) return null
    val extended = Regex("filename\\*\\s*=\\s*([^']*)'[^']*'([^;]+)", RegexOption.IGNORE_CASE)
        .find(contentDisposition)
    val raw = if (extended != null) {
        val charset = extended.groupValues[1].ifBlank { "UTF-8" }
        try {
            java.net.URLDecoder.decode(extended.groupValues[2].trim().replace("+", "%2B"), charset)
        } catch (_: Exception) {
            null
        }
    } else {
        null
    } ?: Regex("filename\\s*=\\s*(\"([^\"]*)\"|[^;]+)", RegexOption.IGNORE_CASE)
        .find(contentDisposition)
        ?.let { m -> m.groupValues[2].ifEmpty { m.groupValues[1] } }
    // Yol bilesenleri atilir; "../../x" gibi adlar Downloads disina yazamasin.
    val name = raw?.trim()?.trim('"')?.substringAfterLast('/')?.substringAfterLast('\\')?.trim()
    return name?.takeIf { it.isNotEmpty() && it != "." && it != ".." }
}

internal fun resolveDownloadName(fileName: String?, mimeType: String?): String {
    val cleaned = (fileName ?: "")
        .trim()
        .replace(Regex("[\\\\/:*?\"<>|]"), "_")
        .trim()
    val base = cleaned.ifBlank { "export_${System.currentTimeMillis()}" }
    val wanted = extensionForMime(mimeType)
    val currentExt = base.substringAfterLast('.', "")
    return when {
        wanted == null -> if (base.contains('.')) base else "$base.bin"
        currentExt.isEmpty() -> "$base.$wanted"
        currentExt.equals(wanted, ignoreCase = true) -> base
        currentExt.length in 1..5 && currentExt.all { it.isLetterOrDigit() } ->
            base.substringBeforeLast('.') + "." + wanted
        else -> base
    }
}
