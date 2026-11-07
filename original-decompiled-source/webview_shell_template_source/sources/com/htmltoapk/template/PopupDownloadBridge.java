package com.htmltoapk.template;

import android.webkit.JavascriptInterface;
import android.webkit.WebView;
import org.json.JSONException;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class PopupDownloadBridge {
    public static final Companion Companion = new Companion(null);
    public static final String NAME = "HtmlToApkDownloads";
    private final WebViewActivity activity;
    private final AndroidAPI api;
    private final WebView target;

    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    public static final class Companion {
        public /* synthetic */ Companion(kotlin.jvm.internal.f fVar) {
            this();
        }

        private Companion() {
        }
    }

    public PopupDownloadBridge(WebViewActivity webViewActivity, AndroidAPI androidAPI, WebView webView) {
        kotlin.jvm.internal.j.e("activity", webViewActivity);
        kotlin.jvm.internal.j.e("api", androidAPI);
        kotlin.jvm.internal.j.e("target", webView);
        this.activity = webViewActivity;
        this.api = androidAPI;
        this.target = webView;
    }

    @JavascriptInterface
    public final void downloadBlobUrl(String str, String str2, String str3) {
        kotlin.jvm.internal.j.e("blobUrl", str);
        kotlin.jvm.internal.j.e("fileName", str2);
        kotlin.jvm.internal.j.e("mimeType", str3);
        this.api.downloadBlobUrlIn(this.target, NAME, str, str2, str3);
    }

    @JavascriptInterface
    public final void downloadDataUri(String str, String str2, String str3) {
        kotlin.jvm.internal.j.e("dataUri", str);
        kotlin.jvm.internal.j.e("fileName", str2);
        kotlin.jvm.internal.j.e("mimeType", str3);
        this.activity.downloadDataUri(str, str2, str3);
    }

    @JavascriptInterface
    public final void onBlobDownloadError(String str) throws JSONException {
        kotlin.jvm.internal.j.e("message", str);
        this.api.onBlobDownloadError(str);
    }

    @JavascriptInterface
    public final void onBlobDownloaded(String str, String str2, String str3) {
        kotlin.jvm.internal.j.e("dataUrl", str);
        kotlin.jvm.internal.j.e("fileName", str2);
        kotlin.jvm.internal.j.e("mimeType", str3);
        this.activity.downloadDataUri(str, str2, str3);
    }
}
