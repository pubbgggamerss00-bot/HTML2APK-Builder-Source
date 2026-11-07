package com.htmltoapk.template;

import com.google.android.gms.ads.RequestConfiguration;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.regex.Pattern;
import x5.d;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class WebViewActivityKt {
    private static final String CLEARTEXT_INTERCEPTOR_SCRIPT = "(function() {\n    if (window.__htmlToApkCleartextHooked) return;\n    window.__htmlToApkCleartextHooked = true;\n\n    var PROXY_PREFIX = 'https://appassets.androidplatform.net/__cleartext_proxy__/?url=';\n\n    function toProxyUrl(url) {\n        if (!url) return url;\n        if (typeof url === 'string') {\n            if (url.startsWith('http://')) {\n                return PROXY_PREFIX + encodeURIComponent(url);\n            }\n            return url;\n        }\n        try {\n            var str = url.toString();\n            if (str.startsWith('http://')) {\n                return PROXY_PREFIX + encodeURIComponent(str);\n            }\n        } catch (_) {}\n        return url;\n    }\n\n    function fromProxyUrl(url) {\n        if (!url || typeof url !== 'string') return url;\n        if (url.startsWith(PROXY_PREFIX)) {\n            try {\n                return decodeURIComponent(url.substring(PROXY_PREFIX.length));\n            } catch (_) {}\n        }\n        return url;\n    }\n\n    if (typeof window.fetch === 'function') {\n        var origFetch = window.fetch;\n        window.fetch = function(input, init) {\n            try {\n                if (typeof input === 'string') {\n                    input = toProxyUrl(input);\n                } else if (typeof URL !== 'undefined' && input instanceof URL) {\n                    input = toProxyUrl(input.toString());\n                } else if (input && typeof input.url === 'string' && input.url.startsWith('http://')) {\n                    var newUrl = toProxyUrl(input.url);\n                    input = new Request(newUrl, input);\n                }\n            } catch (_) {}\n            return origFetch.call(this, input, init);\n        };\n    }\n\n    if (typeof window.XMLHttpRequest === 'function') {\n        var origOpen = XMLHttpRequest.prototype.open;\n        XMLHttpRequest.prototype.open = function(method, url, async, user, password) {\n            this.__originalUrl = url;\n            var proxied = toProxyUrl(typeof url === 'string' ? url : (url ? url.toString() : url));\n            return origOpen.call(this, method, proxied, async !== false, user, password);\n        };\n    }\n\n    try {\n        var mediaProto = window.HTMLMediaElement && window.HTMLMediaElement.prototype;\n        if (mediaProto) {\n            var mediaSrcDesc = Object.getOwnPropertyDescriptor(mediaProto, 'src');\n            if (mediaSrcDesc && mediaSrcDesc.set) {\n                var origMediaSet = mediaSrcDesc.set;\n                var origMediaGet = mediaSrcDesc.get;\n                Object.defineProperty(mediaProto, 'src', {\n                    get: function() {\n                        return fromProxyUrl(origMediaGet.call(this));\n                    },\n                    set: function(val) {\n                        return origMediaSet.call(this, toProxyUrl(val));\n                    },\n                    configurable: true,\n                    enumerable: true\n                });\n            }\n            var currentSrcDesc = Object.getOwnPropertyDescriptor(mediaProto, 'currentSrc');\n            if (currentSrcDesc && currentSrcDesc.get) {\n                var origCurrentSrcGet = currentSrcDesc.get;\n                Object.defineProperty(mediaProto, 'currentSrc', {\n                    get: function() {\n                        return fromProxyUrl(origCurrentSrcGet.call(this));\n                    },\n                    configurable: true,\n                    enumerable: true\n                });\n            }\n        }\n    } catch (_) {}\n\n    try {\n        var sourceProto = window.HTMLSourceElement && window.HTMLSourceElement.prototype;\n        if (sourceProto) {\n            var sourceSrcDesc = Object.getOwnPropertyDescriptor(sourceProto, 'src');\n            if (sourceSrcDesc && sourceSrcDesc.set) {\n                var origSourceSet = sourceSrcDesc.set;\n                var origSourceGet = sourceSrcDesc.get;\n                Object.defineProperty(sourceProto, 'src', {\n                    get: function() {\n                        return fromProxyUrl(origSourceGet.call(this));\n                    },\n                    set: function(val) {\n                        return origSourceSet.call(this, toProxyUrl(val));\n                    },\n                    configurable: true,\n                    enumerable: true\n                });\n            }\n        }\n    } catch (_) {}\n\n    try {\n        var origSetAttr = Element.prototype.setAttribute;\n        var origGetAttr = Element.prototype.getAttribute;\n        Element.prototype.setAttribute = function(name, val) {\n            if (typeof name === 'string' && name.toLowerCase() === 'src') {\n                var tag = this.tagName ? this.tagName.toLowerCase() : '';\n                if (tag === 'video' || tag === 'audio' || tag === 'source' || tag === 'img' || tag === 'iframe') {\n                    val = toProxyUrl(val);\n                }\n            }\n            return origSetAttr.call(this, name, val);\n        };\n        Element.prototype.getAttribute = function(name) {\n            var val = origGetAttr.call(this, name);\n            if (typeof name === 'string' && name.toLowerCase() === 'src' && val) {\n                return fromProxyUrl(val);\n            }\n            return val;\n        };\n    } catch (_) {}\n\n    function rewriteMediaElement(el) {\n        try {\n            if (!el || !el.getAttribute) return;\n            var rawSrc = el.getAttribute('src');\n            if (rawSrc && rawSrc.startsWith('http://')) {\n                el.src = toProxyUrl(rawSrc);\n            }\n        } catch (_) {}\n    }\n\n    function rewriteExistingTags() {\n        try {\n            var mediaEls = document.querySelectorAll('video, audio, source, img, iframe');\n            for (var i = 0; i < mediaEls.length; i++) {\n                rewriteMediaElement(mediaEls[i]);\n            }\n        } catch (_) {}\n    }\n\n    if (document.readyState === 'loading') {\n        document.addEventListener('DOMContentLoaded', rewriteExistingTags);\n    } else {\n        rewriteExistingTags();\n    }\n\n    try {\n        if (typeof MutationObserver !== 'undefined') {\n            var observer = new MutationObserver(function(mutations) {\n                for (var m = 0; m < mutations.length; m++) {\n                    var mutation = mutations[m];\n                    if (mutation.type === 'childList') {\n                        for (var a = 0; a < mutation.addedNodes.length; a++) {\n                            var node = mutation.addedNodes[a];\n                            if (node.nodeType === 1) {\n                                var tag = node.tagName ? node.tagName.toLowerCase() : '';\n                                if (tag === 'video' || tag === 'audio' || tag === 'source' || tag === 'img' || tag === 'iframe') {\n                                    rewriteMediaElement(node);\n                                }\n                                if (node.querySelectorAll) {\n                                    var children = node.querySelectorAll('video, audio, source, img, iframe');\n                                    for (var c = 0; c < children.length; c++) {\n                                        rewriteMediaElement(children[c]);\n                                    }\n                                }\n                            }\n                        }\n                    }\n                }\n            });\n            observer.observe(document.documentElement || document, { childList: true, subtree: true });\n        }\n    } catch (_) {}\n})();";
    private static final String CLEARTEXT_PROXY_PREFIX = "https://appassets.androidplatform.net/__cleartext_proxy__/?url=";
    private static final String DOWNLOAD_INTERCEPTOR_SCRIPT = "(function() {\n    if (window.__htmlToApkDownloadInterceptor) return;\n    window.__htmlToApkDownloadInterceptor = true;\n\n    // Popup'larda AndroidAPI yoktur; yalniz indirme yapabilen dar kopru verilir.\n    function dlBridge() {\n        if (typeof AndroidAPI !== 'undefined') return AndroidAPI;\n        if (typeof HtmlToApkDownloads !== 'undefined') return HtmlToApkDownloads;\n        return null;\n    }\n\n    var blobCache = (typeof Map !== 'undefined') ? new Map() : null;\n\n    if (typeof URL !== 'undefined' && URL.createObjectURL) {\n        var origCreate = URL.createObjectURL;\n        URL.createObjectURL = function(blob) {\n            var url = origCreate.call(URL, blob);\n            if (blobCache && blob instanceof Blob) {\n                try {\n                    blobCache.set(url, blob);\n                    setTimeout(function() {\n                        try { blobCache.delete(url); } catch (_) {}\n                    }, 60000);\n                } catch (_) {}\n            }\n            return url;\n        };\n\n        if (URL.revokeObjectURL) {\n            var origRevoke = URL.revokeObjectURL;\n            URL.revokeObjectURL = function(url) {\n                setTimeout(function() {\n                    try {\n                        origRevoke.call(URL, url);\n                    } catch (_) {}\n                }, 30000);\n            };\n        }\n    }\n\n    function guessFileName(href, name, mimeType) {\n        if (name && typeof name === 'string' && name.trim() && name.trim() !== 'download') {\n            var cleanName = name.trim();\n            if (cleanName.indexOf('.') !== -1) return cleanName;\n            var extFromName = (mimeType && mimeType.indexOf('json') !== -1) ? 'json' : 'bin';\n            return cleanName + '.' + extFromName;\n        }\n        var ext = 'json';\n        if (mimeType) {\n            if (mimeType.indexOf('json') !== -1) ext = 'json';\n            else if (mimeType.indexOf('csv') !== -1) ext = 'csv';\n            else if (mimeType.indexOf('text') !== -1) ext = 'txt';\n            else if (mimeType.indexOf('pdf') !== -1) ext = 'pdf';\n            else if (mimeType.indexOf('zip') !== -1) ext = 'zip';\n            else if (mimeType.indexOf('png') !== -1) ext = 'png';\n            else if (mimeType.indexOf('jpeg') !== -1 || mimeType.indexOf('jpg') !== -1) ext = 'jpg';\n        }\n        return 'export_' + Date.now() + '.' + ext;\n    }\n\n    function handleDownload(href, filename, mimeType) {\n        if (!href || typeof href !== 'string') return;\n        var isBlob = href.startsWith('blob:');\n        var isData = href.startsWith('data:');\n        if (!isBlob && !isData) return;\n\n        var safeName = guessFileName(href, filename, mimeType);\n\n        if (isBlob && blobCache && blobCache.has(href)) {\n            try {\n                var cachedBlob = blobCache.get(href);\n                var actualMime = (cachedBlob && cachedBlob.type) ? cachedBlob.type : (mimeType || 'application/json');\n                var reader = new FileReader();\n                reader.onloadend = function() {\n                    if (reader.result && dlBridge() && dlBridge().onBlobDownloaded) {\n                        dlBridge().onBlobDownloaded(reader.result, safeName, actualMime);\n                    }\n                };\n                reader.onerror = function() {\n                    if (dlBridge() && dlBridge().downloadBlobUrl) {\n                        dlBridge().downloadBlobUrl(href, safeName, actualMime);\n                    }\n                };\n                reader.readAsDataURL(cachedBlob);\n                return;\n            } catch (_) {}\n        }\n\n        var bridge = dlBridge();\n        if (bridge) {\n            if (isData && bridge.downloadDataUri) {\n                bridge.downloadDataUri(href, safeName, mimeType || 'application/json');\n            } else if (bridge.downloadBlobUrl) {\n                bridge.downloadBlobUrl(href, safeName, mimeType || 'application/json');\n            }\n        }\n    }\n\n    document.addEventListener('click', function(e) {\n        var a = e.target && e.target.closest ? e.target.closest('a') : null;\n        if (!a || typeof a.href !== 'string') return;\n        if (a.href.startsWith('blob:') || a.href.startsWith('data:')) {\n            e.preventDefault();\n            e.stopPropagation();\n            var dl = a.getAttribute('download') || a.download || '';\n            handleDownload(a.href, dl, a.type || '');\n        }\n    }, true);\n\n    try {\n        var origClick = HTMLAnchorElement.prototype.click;\n        HTMLAnchorElement.prototype.click = function() {\n            var href = this.href;\n            if (typeof href === 'string' && (href.startsWith('blob:') || href.startsWith('data:'))) {\n                var dl = this.getAttribute('download') || this.download || '';\n                handleDownload(href, dl, this.type || '');\n                return;\n            }\n            return origClick.apply(this, arguments);\n        };\n    } catch (_) {}\n\n    try {\n        var origDispatch = HTMLAnchorElement.prototype.dispatchEvent;\n        HTMLAnchorElement.prototype.dispatchEvent = function(event) {\n            if (event && (event.type === 'click' || event === 'click')) {\n                var href = this.href;\n                if (typeof href === 'string' && (href.startsWith('blob:') || href.startsWith('data:'))) {\n                    var dl = this.getAttribute('download') || this.download || '';\n                    handleDownload(href, dl, this.type || '');\n                    return false;\n                }\n            }\n            return origDispatch.apply(this, arguments);\n        };\n    } catch (_) {}\n\n    try {\n        var origOpen = window.open;\n        window.open = function(url) {\n            if (typeof url === 'string' && (url.startsWith('blob:') || url.startsWith('data:'))) {\n                handleDownload(url, 'download', '');\n                return null;\n            }\n            return origOpen.apply(this, arguments);\n        };\n    } catch (_) {}\n\n    if (!window.showSaveFilePicker) {\n        window.showSaveFilePicker = async function(options) {\n            var suggestedName = (options && options.suggestedName) ? options.suggestedName : 'export.json';\n            var mime = 'application/json';\n            if (options && options.types && options.types[0] && options.types[0].accept) {\n                var keys = Object.keys(options.types[0].accept);\n                if (keys.length > 0) mime = keys[0];\n            }\n            return {\n                name: suggestedName,\n                createWritable: async function() {\n                    var chunks = [];\n                    return {\n                        write: async function(data) {\n                            if (data instanceof Blob) {\n                                chunks.push(data);\n                            } else if (typeof data === 'string') {\n                                chunks.push(new Blob([data], { type: mime }));\n                            } else if (data instanceof ArrayBuffer || ArrayBuffer.isView(data)) {\n                                chunks.push(new Blob([data], { type: mime }));\n                            }\n                        },\n                        close: async function() {\n                            var finalBlob = new Blob(chunks, { type: mime });\n                            var reader = new FileReader();\n                            reader.onloadend = function() {\n                                if (reader.result && dlBridge() && dlBridge().onBlobDownloaded) {\n                                    dlBridge().onBlobDownloaded(reader.result, suggestedName, mime);\n                                }\n                            };\n                            reader.readAsDataURL(finalBlob);\n                        },\n                        abort: async function() {\n                            chunks = [];\n                        }\n                    };\n                }\n            };\n        };\n    }\n})();";
    private static final Map<String, String> MIME_TO_EXTENSION;
    private static final long PAGE_LOAD_TIMEOUT_MS = 20000;
    private static final String PRINT_INTERCEPTOR_SCRIPT = "window.print = function() { AndroidAPI.printPage(); };";
    private static final String PULL_REFRESH_BRIDGE_NAME = "HtmlToApkPullRefresh";
    private static final String PULL_REFRESH_GUARD_SCRIPT = "(function() {\n    if (window.__htmlToApkPullRefreshGuard || typeof HtmlToApkPullRefresh === 'undefined') return;\n    window.__htmlToApkPullRefreshGuard = true;\n    function optedOut() {\n        try {\n            var roots = [document.documentElement, document.body];\n            for (var i = 0; i < roots.length; i++) {\n                if (!roots[i]) continue;\n                var ob = getComputedStyle(roots[i]).overscrollBehaviorY;\n                if (ob && ob !== 'auto') return true;\n            }\n        } catch (_) {}\n        return false;\n    }\n    function innerScrolled(el) {\n        var root = document.scrollingElement || document.documentElement;\n        while (el && el.nodeType === 1 && el !== root && el !== document.body) {\n            if (el.scrollTop > 0) {\n                var oy = getComputedStyle(el).overflowY;\n                if (oy === 'auto' || oy === 'scroll' || oy === 'overlay') return true;\n            }\n            el = el.parentElement;\n        }\n        return false;\n    }\n    document.addEventListener('touchstart', function(e) {\n        var blocked = false;\n        try { blocked = optedOut() || innerScrolled(e.target); } catch (_) {}\n        try { HtmlToApkPullRefresh.setBlocked(blocked); } catch (_) {}\n    }, { passive: true, capture: true });\n})();";
    private static final String TAG = "WebViewActivity";
    private static final String WEB_API_SHIM_SCRIPT = "(function() {\n    if (window.__htmlToApkWebApiShim || typeof AndroidAPI === 'undefined') return;\n    window.__htmlToApkWebApiShim = true;\n    var seq = 0;\n    function nextId(prefix) { seq += 1; return prefix + '_' + Date.now() + '_' + seq; }\n    function once(eventName, match, timeoutMs) {\n        return new Promise(function(resolve, reject) {\n            var timer = null;\n            function handler(e) {\n                var d = e && e.detail;\n                if (match && !match(d)) return;\n                window.removeEventListener(eventName, handler);\n                if (timer) clearTimeout(timer);\n                resolve(d || {});\n            }\n            window.addEventListener(eventName, handler);\n            if (timeoutMs) {\n                timer = setTimeout(function() {\n                    window.removeEventListener(eventName, handler);\n                    reject(new DOMException('Timed out', 'AbortError'));\n                }, timeoutMs);\n            }\n        });\n    }\n\n    // --- navigator.share ---\n    if (!navigator.share) {\n        var safeFileName = function(name) {\n            var n = String(name || 'file').replace(/[\\\\\\\\/:*?\"<>|]/g, '_').replace(/\\.\\.+/g, '_');\n            return n || 'file';\n        };\n        var shareResult = function() {\n            return once('shareResult', null, 30000).then(function(d) {\n                if (!d.success) throw new DOMException(d.error || 'share_failed', 'AbortError');\n            });\n        };\n        navigator.canShare = function(data) {\n            if (!data) return false;\n            if (data.files && data.files.length) return data.files.length === 1;\n            return !!(data.title || data.text || data.url);\n        };\n        navigator.share = function(data) {\n            data = data || {};\n            if (!navigator.canShare(data)) {\n                return Promise.reject(new TypeError('navigator.share: nothing to share'));\n            }\n            if (data.files && data.files.length) {\n                var file = data.files[0];\n                return new Promise(function(resolve, reject) {\n                    var reader = new FileReader();\n                    reader.onload = function() {\n                        var pending = shareResult();\n                        AndroidAPI.shareFileFromBase64(safeFileName(file.name), String(reader.result),\n                            file.type || 'application/octet-stream');\n                        pending.then(resolve, reject);\n                    };\n                    reader.onerror = function() { reject(new DOMException('read_failed', 'DataError')); };\n                    reader.readAsDataURL(file);\n                });\n            }\n            var text = [data.title, data.text, data.url].filter(function(v) { return !!v; }).join('\\n');\n            var pending = shareResult();\n            AndroidAPI.shareText(text);\n            return pending;\n        };\n    }\n\n    // --- Notification ---\n    if (typeof window.Notification === 'undefined') {\n        var NOTIF_PERMISSION = 'android.permission.POST_NOTIFICATIONS';\n        var cachedPermission = null;\n        var currentPermission = function() {\n            if (cachedPermission) return cachedPermission;\n            try { return AndroidAPI.hasPermission(NOTIF_PERMISSION) ? 'granted' : 'default'; } catch (_) { return 'default'; }\n        };\n        var ShimNotification = function(title, options) {\n            if (!(this instanceof ShimNotification)) throw new TypeError(\"Failed to construct 'Notification'\");\n            options = options || {};\n            this.title = String(title);\n            this.body = options.body ? String(options.body) : '';\n            this.tag = options.tag || '';\n            this.data = options.data;\n            this.onclick = null; this.onshow = null; this.onerror = null; this.onclose = null;\n            this._listeners = {};\n            this._id = null;\n            var self = this;\n            if (currentPermission() !== 'granted') {\n                setTimeout(function() { self._fire('error'); }, 0);\n                return;\n            }\n            once('notificationResult', function(d) { return d && d.action === 'post'; }, 10000).then(function(d) {\n                if (d.success) { self._id = d.notificationId; self._fire('show'); } else { self._fire('error'); }\n            }, function() { self._fire('error'); });\n            AndroidAPI.showNotification(this.title, this.body, '');\n        };\n        ShimNotification.prototype.addEventListener = function(type, fn) {\n            (this._listeners[type] = this._listeners[type] || []).push(fn);\n        };\n        ShimNotification.prototype.removeEventListener = function(type, fn) {\n            var list = this._listeners[type] || [];\n            var i = list.indexOf(fn);\n            if (i >= 0) list.splice(i, 1);\n        };\n        ShimNotification.prototype._fire = function(type) {\n            var ev = { type: type, target: this };\n            var handler = this['on' + type];\n            if (typeof handler === 'function') { try { handler.call(this, ev); } catch (_) {} }\n            (this._listeners[type] || []).slice().forEach(function(fn) { try { fn.call(this, ev); } catch (_) {} }, this);\n        };\n        ShimNotification.prototype.close = function() {\n            if (this._id !== null) { try { AndroidAPI.cancelNotification(this._id); } catch (_) {} }\n            this._fire('close');\n        };\n        Object.defineProperty(ShimNotification, 'permission', { get: currentPermission });\n        ShimNotification.maxActions = 0;\n        ShimNotification.requestPermission = function(callback) {\n            var id = nextId('webNotification');\n            var pending = once('permissionResult', function(d) { return d && d.callbackId === id; }, 120000)\n                .then(function(d) { cachedPermission = d.granted ? 'granted' : 'denied'; return cachedPermission; },\n                      function() { return currentPermission(); });\n            AndroidAPI.requestNotificationPermission(id);\n            if (typeof callback === 'function') pending.then(callback);\n            return pending;\n        };\n        window.Notification = ShimNotification;\n    }\n\n    // --- screen.orientation.lock / unlock ---\n    if (typeof HtmlToApkWebCompat !== 'undefined' && window.screen && screen.orientation) {\n        try {\n            screen.orientation.lock = function(type) {\n                var error = HtmlToApkWebCompat.lockOrientation(String(type));\n                if (error) {\n                    return Promise.reject(error === 'invalid_orientation'\n                        ? new TypeError('Invalid orientation: ' + type)\n                        : new DOMException(error, 'NotSupportedError'));\n                }\n                return Promise.resolve();\n            };\n            screen.orientation.unlock = function() { HtmlToApkWebCompat.unlockOrientation(); };\n        } catch (_) {}\n    }\n})();";
    private static final String WEB_COMPAT_BRIDGE_NAME = "HtmlToApkWebCompat";

    static {
        d5.c[] cVarArr = {new d5.c("image/png", "png"), new d5.c("image/jpeg", "jpg"), new d5.c("image/jpg", "jpg"), new d5.c("image/pjpeg", "jpg"), new d5.c("image/webp", "webp"), new d5.c("image/gif", "gif"), new d5.c("image/svg+xml", "svg"), new d5.c("image/avif", "avif"), new d5.c("image/x-icon", "ico"), new d5.c("image/heic", "heic"), new d5.c("video/mp4", "mp4"), new d5.c("video/mpeg", "mpeg"), new d5.c("video/webm", "webm"), new d5.c("video/quicktime", "mov"), new d5.c("audio/mpeg", "mp3"), new d5.c("audio/mp3", "mp3"), new d5.c("audio/wav", "wav"), new d5.c("audio/x-wav", "wav"), new d5.c("audio/wave", "wav"), new d5.c("audio/ogg", "ogg"), new d5.c("audio/mp4", "m4a"), new d5.c("audio/aac", "aac"), new d5.c("audio/webm", "weba"), new d5.c("audio/flac", "flac"), new d5.c("application/pdf", "pdf"), new d5.c("application/zip", "zip"), new d5.c("application/x-zip-compressed", "zip"), new d5.c("application/json", "json"), new d5.c("application/xml", "xml"), new d5.c("application/octet-stream", "bin"), new d5.c("application/vnd.openxmlformats-officedocument.spreadsheetml.sheet", "xlsx"), new d5.c("application/vnd.ms-excel", "xls"), new d5.c("text/xml", "xml"), new d5.c("text/csv", "csv"), new d5.c("text/html", "html"), new d5.c("text/plain", "txt"), new d5.c("text/css", "css"), new d5.c("text/javascript", "js"), new d5.c("text/markdown", "md")};
        LinkedHashMap linkedHashMap = new LinkedHashMap(e5.w.i(39));
        e5.x.j(linkedHashMap, cVarArr);
        MIME_TO_EXTENSION = linkedHashMap;
    }

    public static final String contentDispositionFileName(String str) throws UnsupportedEncodingException {
        String strDecode;
        String string;
        String string2;
        String strH;
        if (str == null || x5.o.v(str)) {
            return null;
        }
        x5.d dVarA = x5.e.a(new x5.e("filename\\*\\s*=\\s*([^']*)'[^']*'([^;]+)", 0), str);
        if (dVarA != null) {
            CharSequence charSequence = (CharSequence) ((d.a) dVarA.a()).get(1);
            if (x5.o.v(charSequence)) {
                charSequence = "UTF-8";
            }
            try {
                strDecode = URLDecoder.decode(x5.l.m(x5.o.G((String) ((d.a) dVarA.a()).get(2)).toString(), "+", "%2B"), (String) charSequence);
            } catch (Exception unused) {
            }
        } else {
            strDecode = null;
        }
        if (strDecode == null) {
            x5.d dVarA2 = x5.e.a(new x5.e("filename\\s*=\\s*(\"([^\"]*)\"|[^;]+)", 0), str);
            if (dVarA2 != null) {
                CharSequence charSequence2 = (CharSequence) ((d.a) dVarA2.a()).get(2);
                if (charSequence2.length() == 0) {
                    charSequence2 = (String) ((d.a) dVarA2.a()).get(1);
                }
                strDecode = (String) charSequence2;
            } else {
                strDecode = null;
            }
        }
        if (strDecode == null || (string2 = x5.o.G(strDecode).toString()) == null || (strH = x5.o.H(string2, '\"')) == null) {
            string = null;
        } else {
            String strD = x5.o.D(strH, '/', strH);
            string = x5.o.G(x5.o.D(strD, '\\', strD)).toString();
        }
        if (string == null || string.length() <= 0 || string.equals(".") || string.equals("..")) {
            return null;
        }
        return string;
    }

    public static final String extensionForMime(String str) {
        String string;
        if (str == null || (string = x5.o.G(str).toString()) == null) {
            return null;
        }
        String lowerCase = string.toLowerCase(Locale.ROOT);
        kotlin.jvm.internal.j.d("toLowerCase(...)", lowerCase);
        String string2 = x5.o.G(x5.o.E(lowerCase, ';')).toString();
        if (string2 == null || string2.length() == 0 || string2.equals("application/octet-stream")) {
            return null;
        }
        return MIME_TO_EXTENSION.get(string2);
    }

    public static final String resolveDownloadName(String str, String str2) {
        int length;
        if (str == null) {
            str = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
        }
        String string = x5.o.G(str).toString();
        Pattern patternCompile = Pattern.compile("[\\\\/:*?\"<>|]");
        kotlin.jvm.internal.j.d("compile(...)", patternCompile);
        kotlin.jvm.internal.j.e("input", string);
        String strReplaceAll = patternCompile.matcher(string).replaceAll("_");
        kotlin.jvm.internal.j.d("replaceAll(...)", strReplaceAll);
        String string2 = x5.o.G(strReplaceAll).toString();
        if (x5.o.v(string2)) {
            string2 = "export_" + System.currentTimeMillis();
        }
        String strExtensionForMime = extensionForMime(str2);
        String strD = x5.o.D(string2, '.', RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED);
        if (strExtensionForMime == null) {
            return x5.o.p(string2, '.') ? string2 : string2.concat(".bin");
        }
        if (strD.length() == 0) {
            return androidx.activity.m.d(string2, ".", strExtensionForMime);
        }
        if (strD.equalsIgnoreCase(strExtensionForMime) || 1 > (length = strD.length()) || length >= 6) {
            return string2;
        }
        for (int i6 = 0; i6 < strD.length(); i6++) {
            if (!Character.isLetterOrDigit(strD.charAt(i6))) {
                return string2;
            }
        }
        int iW = x5.o.w(string2, '.');
        if (iW != -1) {
            string2 = string2.substring(0, iW);
            kotlin.jvm.internal.j.d("substring(...)", string2);
        }
        return androidx.activity.m.d(string2, ".", strExtensionForMime);
    }

    public static final boolean shouldOfferCameraCapture(List<String> list) {
        kotlin.jvm.internal.j.e("mimeTypes", list);
        if (list.isEmpty()) {
            return true;
        }
        if (!list.isEmpty()) {
            for (String str : list) {
                if (kotlin.jvm.internal.j.a(str, "*/*") || x5.l.n(str, "image/", false)) {
                    return true;
                }
            }
        }
        return false;
    }

    public static final Integer webOrientationToActivity(String str) {
        kotlin.jvm.internal.j.e("type", str);
        String string = x5.o.G(str).toString();
        Locale locale = Locale.ROOT;
        kotlin.jvm.internal.j.d("ROOT", locale);
        String lowerCase = string.toLowerCase(locale);
        kotlin.jvm.internal.j.d("toLowerCase(...)", lowerCase);
        switch (lowerCase.hashCode()) {
            case -1228021296:
                if (!lowerCase.equals("portrait-primary")) {
                    return null;
                }
                break;
            case -147105566:
                return !lowerCase.equals("landscape-secondary") ? null : 8;
            case 96748:
                return !lowerCase.equals("any") ? null : 10;
            case 729267099:
                return !lowerCase.equals("portrait") ? null : 7;
            case 1430647483:
                return !lowerCase.equals("landscape") ? null : 6;
            case 1728911401:
                if (!lowerCase.equals("natural")) {
                    return null;
                }
                break;
            case 1862465776:
                return !lowerCase.equals("landscape-primary") ? null : 0;
            case 2012187074:
                return !lowerCase.equals("portrait-secondary") ? null : 9;
            default:
                return null;
        }
        return 1;
    }
}
