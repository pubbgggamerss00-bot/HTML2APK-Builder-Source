package com.google.android.gms.ads.nonagon.signalgeneration;

import android.graphics.Bitmap;
import android.os.Build;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import androidx.activity.c0;
import com.google.android.gms.internal.ads.hs1;
import com.google.android.gms.internal.ads.ru;
import com.google.android.gms.internal.ads.zn;
import java.lang.reflect.InvocationTargetException;
import java.util.Locale;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class zzj extends ru {
    private final WebView zza;
    private final zzf zzb;
    private final Executor zzc;
    private WebViewClient zzd;

    public zzj(WebView webView, zzf zzfVar, hs1 hs1Var) {
        this.zza = webView;
        this.zzb = zzfVar;
        this.zzc = hs1Var;
    }

    private final void zzc() {
        this.zza.evaluateJavascript(String.format(Locale.getDefault(), (String) com.google.android.gms.ads.internal.client.zzbe.zzc().a(zn.F9), this.zzb.zza()), null);
    }

    @Override // com.google.android.gms.internal.ads.ru
    public final WebViewClient getDelegate() {
        return this.zzd;
    }

    @Override // com.google.android.gms.internal.ads.ru, android.webkit.WebViewClient
    public final void onPageFinished(WebView webView, String str) {
        zzc();
        super.onPageFinished(webView, str);
    }

    @Override // com.google.android.gms.internal.ads.ru, android.webkit.WebViewClient
    public final void onPageStarted(WebView webView, String str, Bitmap bitmap) {
        zzc();
        super.onPageStarted(webView, str, bitmap);
    }

    public final /* synthetic */ void zza() throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        WebViewClient webViewClientD;
        try {
            com.google.android.gms.ads.internal.zzv.zzq();
            WebView webView = this.zza;
            if (Build.VERSION.SDK_INT < 26) {
                if (c0.f("GET_WEB_VIEW_CLIENT")) {
                    try {
                        webViewClientD = h2.c.d(webView);
                    } catch (RuntimeException e6) {
                        com.google.android.gms.ads.internal.zzv.zzp().h("AdUtil.getWebViewClient", e6);
                    }
                }
                throw new IllegalStateException("getWebViewClient not supported");
            }
            webViewClientD = webView.getWebViewClient();
            if (webViewClientD == this) {
                return;
            }
            if (webViewClientD != null) {
                this.zzd = webViewClientD;
            }
            this.zza.setWebViewClient(this);
            zzc();
        } catch (IllegalStateException unused) {
        }
    }

    public final void zzb() {
        this.zzc.execute(new Runnable() { // from class: com.google.android.gms.ads.nonagon.signalgeneration.zzh
            @Override // java.lang.Runnable
            public final void run() throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
                this.zza.zza();
            }
        });
    }
}
