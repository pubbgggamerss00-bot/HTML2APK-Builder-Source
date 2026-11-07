package com.google.android.gms.internal.consent_sdk;

import android.util.Log;
import android.view.ViewGroup;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import java.util.Locale;
import java.util.Objects;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class t extends WebViewClient {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ u f11895a;

    public /* synthetic */ t(u uVar) {
        Objects.requireNonNull(uVar);
        this.f11895a = uVar;
    }

    @Override // android.webkit.WebViewClient
    public final void onLoadResource(WebView webView, String str) {
        int i6 = u.f11908v;
        if (str == null || !str.startsWith("consent://")) {
            return;
        }
        this.f11895a.f11909t.b(str);
    }

    @Override // android.webkit.WebViewClient
    public final void onPageFinished(WebView webView, String str) {
        u uVar = this.f11895a;
        if (uVar.f11910u) {
            return;
        }
        Log.d("UserMessagingPlatform", "Wall html loaded.");
        uVar.f11910u = true;
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedError(WebView webView, int i6, String str, String str2) {
        y yVar = this.f11895a.f11909t;
        yVar.getClass();
        Locale locale = Locale.US;
        yVar.f11942g.c(new f2(2, "WebResourceError(" + i6 + ", " + str2 + "): " + str));
    }

    @Override // android.webkit.WebViewClient
    public final boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
        if (webView == null) {
            return true;
        }
        String str = true != renderProcessGoneDetail.didCrash() ? "was stopped by system" : "crashed";
        Log.w("UserMessagingPlatform", "WebView render process " + str + ". Renderer priority at exit: " + renderProcessGoneDetail.rendererPriorityAtExit());
        ViewGroup viewGroup = (ViewGroup) webView.getParent();
        if (viewGroup != null) {
            viewGroup.removeView(webView);
        }
        webView.destroy();
        return true;
    }

    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
        String string = webResourceRequest.getUrl().toString();
        int i6 = u.f11908v;
        if (string == null || !string.startsWith("consent://")) {
            return false;
        }
        this.f11895a.f11909t.b(string);
        return true;
    }

    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
        int i6 = u.f11908v;
        if (str == null || !str.startsWith("consent://")) {
            return false;
        }
        this.f11895a.f11909t.b(str);
        return true;
    }
}
