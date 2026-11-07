package com.google.android.gms.internal.ads;

import android.webkit.WebView;
import com.google.android.gms.ads.RequestConfiguration;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class pi implements Runnable {
    public final oi s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ WebView f8079t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ ri f8080u;

    public pi(ri riVar, hi hiVar, WebView webView, boolean z6) {
        this.f8079t = webView;
        this.f8080u = riVar;
        this.s = new oi(this, hiVar, webView, z6);
    }

    @Override // java.lang.Runnable
    public final void run() {
        oi oiVar = this.s;
        WebView webView = this.f8079t;
        if (webView.getSettings().getJavaScriptEnabled()) {
            try {
                webView.evaluateJavascript("(function() { return  {text:document.body.innerText}})();", oiVar);
            } catch (Throwable unused) {
                oiVar.onReceiveValue(RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED);
            }
        }
    }
}
