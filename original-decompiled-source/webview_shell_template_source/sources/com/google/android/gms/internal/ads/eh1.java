package com.google.android.gms.internal.ads;

import android.util.Log;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebView;
import android.webkit.WebViewClient;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class eh1 extends WebViewClient {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ fh1 f4290a;

    public eh1(fh1 fh1Var) {
        this.f4290a = fh1Var;
    }

    @Override // android.webkit.WebViewClient
    public final boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
        Log.w("NativeBridge", "WebView renderer gone: " + renderProcessGoneDetail.toString() + "for WebView: " + String.valueOf(webView));
        fh1 fh1Var = this.f4290a;
        if (fh1Var.a() == webView) {
            Log.w("NativeBridge", "Deallocating the Native bridge as it is unusable. No further events will be generated for this session.");
            fh1Var.f3577b = new wh1(null);
        }
        webView.destroy();
        return true;
    }
}
