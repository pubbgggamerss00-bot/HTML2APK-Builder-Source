package com.google.android.gms.internal.ads;

import android.content.Context;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.google.android.gms.ads.h5.H5AdsRequestHandler;
import com.google.android.gms.ads.internal.util.client.zzo;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class cv extends ru {

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ int f3670d = 0;

    /* renamed from: a, reason: collision with root package name */
    public WebViewClient f3671a;

    /* renamed from: b, reason: collision with root package name */
    public final H5AdsRequestHandler f3672b;

    /* renamed from: c, reason: collision with root package name */
    public final WebView f3673c;

    public cv(Context context, WebView webView) {
        context.getClass();
        webView.getClass();
        sl1.e("JavaScript must be enabled on the WebView.", webView.getSettings().getJavaScriptEnabled());
        this.f3673c = webView;
        this.f3672b = new H5AdsRequestHandler(context, new dh0(6, webView));
    }

    @Override // com.google.android.gms.internal.ads.ru
    public final WebViewClient getDelegate() {
        return this.f3671a;
    }

    @Override // com.google.android.gms.internal.ads.ru, android.webkit.WebViewClient
    public final void onLoadResource(WebView webView, String str) {
        if (!this.f3673c.equals(webView)) {
            zzo.zzg("H5AdsWebViewClient must be attached to the same WebVew which was passed in the constructor.");
        } else {
            if (this.f3672b.handleH5AdsRequest(str)) {
                return;
            }
            super.onLoadResource(webView, str);
        }
    }

    @Override // com.google.android.gms.internal.ads.ru, android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
        Object obj = this.f3673c;
        if (!obj.equals(obj)) {
            zzo.zzg("H5AdsWebViewClient must be attached to the same WebVew which was passed in the constructor.");
            return false;
        }
        if (this.f3672b.handleH5AdsRequest(webResourceRequest.getUrl().toString())) {
            return true;
        }
        return super.shouldOverrideUrlLoading(webView, webResourceRequest);
    }

    @Override // com.google.android.gms.internal.ads.ru, android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
        if (this.f3673c.equals(webView)) {
            if (this.f3672b.handleH5AdsRequest(str)) {
                return true;
            }
            return super.shouldOverrideUrlLoading(webView, str);
        }
        zzo.zzg("H5AdsWebViewClient must be attached to the same WebVew which was passed in the constructor.");
        return false;
    }
}
