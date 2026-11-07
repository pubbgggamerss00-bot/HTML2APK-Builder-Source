package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import com.google.android.gms.ads.internal.client.zzbe;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.internal.util.zzs;
import com.google.android.gms.ads.internal.zzv;
import java.io.File;
import java.util.Collections;
import java.util.Map;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
@TargetApi(dn.zzm)
/* loaded from: classes.dex */
public final class tb0 extends eb0 {
    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.webkit.WebViewClient
    public final WebResourceResponse shouldInterceptRequest(WebView webView, WebResourceRequest webResourceRequest) {
        String str;
        if (webResourceRequest == null || webResourceRequest.getUrl() == null) {
            return null;
        }
        String string = webResourceRequest.getUrl().toString();
        Map<String, String> requestHeaders = webResourceRequest.getRequestHeaders();
        if (!(webView instanceof xa0)) {
            zzo.zzj("Tried to intercept request from a WebView that wasn't an AdWebView.");
            return null;
        }
        xa0 xa0Var = (xa0) webView;
        r50 r50Var = this.Q;
        if (r50Var != null) {
            r50Var.a(string, requestHeaders, 1);
        }
        int i6 = pj1.f8098a;
        if (!"mraid.js".equalsIgnoreCase(new File(string).getName())) {
            if (requestHeaders == null) {
                requestHeaders = Collections.EMPTY_MAP;
            }
            return G(string, requestHeaders);
        }
        if (xa0Var.zzN() != null) {
            eb0 eb0VarZzN = xa0Var.zzN();
            synchronized (eb0VarZzN.f4193v) {
                eb0VarZzN.D = false;
                eb0VarZzN.I = true;
                i70.f5591f.execute(new yh(5, eb0VarZzN));
            }
        }
        if (xa0Var.zzO().b()) {
            str = (String) zzbe.zzc().a(zn.f11350a0);
        } else if (xa0Var.x()) {
            str = (String) zzbe.zzc().a(zn.Z);
        } else {
            str = (String) zzbe.zzc().a(zn.Y);
        }
        zzv.zzq();
        return zzs.zzy(xa0Var.getContext(), xa0Var.zzn().afmaVersion, str);
    }
}
