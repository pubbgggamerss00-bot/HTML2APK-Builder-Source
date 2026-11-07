package com.htmltoapk.template;

import android.util.Log;
import com.google.android.gms.ads.RequestConfiguration;
import java.nio.charset.Charset;
import java.security.MessageDigest;
import java.security.SecureRandom;
import java.util.Arrays;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class BridgeGate {
    public static final Companion Companion = new Companion(null);
    public static final String ENTER = "htmlToApkGateEnter";
    public static final String EXIT = "htmlToApkGateExit";
    private static final long OPEN_WINDOW_NANOS = 30000000000L;
    private static final String TAG = "BridgeGate";
    private final boolean enforced;
    private final p5.a<Boolean> isNativeCaller;
    private final ConcurrentHashMap.KeySetView<String, Boolean> loggedDenials;
    private volatile String mainFrameUrl;
    private volatile Thread openThread;
    private volatile long openedAtNanos;
    private final TrustedOrigins origins;
    private volatile boolean scriptScoped;
    private final String token;

    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    public static final class Companion {
        public /* synthetic */ Companion(kotlin.jvm.internal.f fVar) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final String newToken() {
            byte[] bArr = new byte[24];
            new SecureRandom().nextBytes(bArr);
            StringBuilder sb = new StringBuilder();
            sb.append((CharSequence) RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED);
            int i6 = 0;
            for (int i7 = 0; i7 < 24; i7++) {
                byte b7 = bArr[i7];
                i6++;
                if (i6 > 1) {
                    sb.append((CharSequence) RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED);
                }
                sb.append(newToken$lambda$0(b7));
            }
            sb.append((CharSequence) RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED);
            String string = sb.toString();
            kotlin.jvm.internal.j.d("toString(...)", string);
            return string;
        }

        private static final CharSequence newToken$lambda$0(byte b7) {
            return String.format("%02x", Arrays.copyOf(new Object[]{Byte.valueOf(b7)}, 1));
        }

        private Companion() {
        }
    }

    public BridgeGate(TrustedOrigins trustedOrigins, p5.a<Boolean> aVar, boolean z6, String str) {
        kotlin.jvm.internal.j.e("origins", trustedOrigins);
        kotlin.jvm.internal.j.e("isNativeCaller", aVar);
        kotlin.jvm.internal.j.e("token", str);
        this.origins = trustedOrigins;
        this.isNativeCaller = aVar;
        this.enforced = z6;
        this.token = str;
        this.loggedDenials = ConcurrentHashMap.newKeySet();
    }

    public final boolean allows(String str) {
        kotlin.jvm.internal.j.e("method", str);
        boolean zMatches = true;
        if (this.enforced && !this.isNativeCaller.a().booleanValue()) {
            if (!this.scriptScoped) {
                zMatches = this.origins.matches(this.mainFrameUrl);
            } else if (this.openThread != Thread.currentThread() || System.nanoTime() - this.openedAtNanos >= OPEN_WINDOW_NANOS) {
                zMatches = false;
            }
            if (!zMatches && this.loggedDenials.add(str)) {
                try {
                    Log.w(TAG, "AndroidAPI." + str + " blocked: caller is not the app's own origin");
                } catch (RuntimeException unused) {
                }
            }
        }
        return zMatches;
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x001e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void enter(String str) {
        boolean z6;
        if (str != null) {
            Charset charset = x5.a.f15157a;
            byte[] bytes = str.getBytes(charset);
            kotlin.jvm.internal.j.d("getBytes(...)", bytes);
            byte[] bytes2 = this.token.getBytes(charset);
            kotlin.jvm.internal.j.d("getBytes(...)", bytes2);
            z6 = MessageDigest.isEqual(bytes, bytes2);
        }
        this.openedAtNanos = System.nanoTime();
        this.openThread = z6 ? Thread.currentThread() : null;
    }

    public final void exit() {
        this.openThread = null;
    }

    public final Set<String> getDocumentStartRules() {
        return this.origins.documentStartRules();
    }

    public final String getDocumentStartScript() {
        return x5.h.h("\n            (function() {\n                if (window.__htmlToApkBridgeGate) return;\n                var raw = window.AndroidAPI;\n                if (!raw || typeof raw.htmlToApkGateEnter !== 'function') return;\n                var token = '" + this.token + "';\n                var wrapped = {};\n                var api = new Proxy(raw, {\n                    get: function(target, name) {\n                        if (name === 'htmlToApkGateEnter' || name === 'htmlToApkGateExit') return undefined;\n                        var value = target[name];\n                        if (typeof name !== 'string' || typeof value !== 'function') return value;\n                        if (!wrapped[name]) {\n                            wrapped[name] = function() {\n                                target.htmlToApkGateEnter(token);\n                                try { return value.apply(target, arguments); }\n                                finally { target.htmlToApkGateExit(); }\n                            };\n                        }\n                        return wrapped[name];\n                    }\n                });\n                window.AndroidAPI = api;\n                if (window.AndroidAPI !== api) {\n                    try {\n                        Object.defineProperty(window, 'AndroidAPI', { value: api, writable: true, configurable: true });\n                    } catch (_) {}\n                }\n                Object.defineProperty(window, '__htmlToApkBridgeGate', { value: true });\n            })();\n        ");
    }

    public final boolean getEnforced() {
        return this.enforced;
    }

    public final boolean getScriptScoped() {
        return this.scriptScoped;
    }

    public final boolean isTrustedPage(String str) {
        return !this.enforced || this.origins.matches(str);
    }

    public final void onDocumentStartScriptInstalled() {
        this.scriptScoped = true;
    }

    public final void onMainFrameUrl(String str) {
        this.mainFrameUrl = str;
    }

    public /* synthetic */ BridgeGate(TrustedOrigins trustedOrigins, p5.a aVar, boolean z6, String str, int i6, kotlin.jvm.internal.f fVar) {
        this(trustedOrigins, aVar, (i6 & 4) != 0 ? true : z6, (i6 & 8) != 0 ? Companion.newToken() : str);
    }
}
