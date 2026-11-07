package com.google.android.gms.ads.h5;

import android.content.Context;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.google.android.gms.internal.ads.cv;
import com.google.android.gms.internal.ads.ru;
import com.google.android.gms.internal.ads.sl1;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class H5AdsWebViewClient extends ru {
    private final cv zza;

    public H5AdsWebViewClient(Context context, WebView webView) {
        this.zza = new cv(context, webView);
    }

    public void clearAdObjects() {
        this.zza.f3672b.clearAdObjects();
    }

    @Override // com.google.android.gms.internal.ads.ru
    public WebViewClient getDelegate() {
        return this.zza;
    }

    public WebViewClient getDelegateWebViewClient() {
        return this.zza.f3671a;
    }

    public void setDelegateWebViewClient(WebViewClient webViewClient) {
        cv cvVar = this.zza;
        cvVar.getClass();
        sl1.e("Delegate cannot be itself.", webViewClient != cvVar);
        cvVar.f3671a = webViewClient;
    }
}
