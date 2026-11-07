package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import android.webkit.ValueCallback;
import android.webkit.WebView;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.internal.zzv;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final /* synthetic */ class oi implements ValueCallback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ pi f7774a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ hi f7775b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ WebView f7776c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f7777d;

    public /* synthetic */ oi(pi piVar, hi hiVar, WebView webView, boolean z6) {
        this.f7774a = piVar;
        this.f7775b = hiVar;
        this.f7776c = webView;
        this.f7777d = z6;
    }

    @Override // android.webkit.ValueCallback
    public final void onReceiveValue(Object obj) {
        boolean z6;
        ri riVar = this.f7774a.f8080u;
        hi hiVar = this.f7775b;
        WebView webView = this.f7776c;
        String str = (String) obj;
        boolean z7 = this.f7777d;
        synchronized (hiVar.f5405g) {
            hiVar.f5410m--;
        }
        try {
            if (!TextUtils.isEmpty(str)) {
                String strOptString = new JSONObject(str).optString("text");
                if (riVar.F || TextUtils.isEmpty(webView.getTitle())) {
                    hiVar.a(strOptString, z7, webView.getX(), webView.getY(), webView.getWidth(), webView.getHeight());
                } else {
                    hiVar.a(webView.getTitle() + "\n" + strOptString, z7, webView.getX(), webView.getY(), webView.getWidth(), webView.getHeight());
                }
            }
            synchronized (hiVar.f5405g) {
                z6 = hiVar.f5410m == 0;
            }
            if (z6) {
                riVar.f8641v.b(hiVar);
            }
        } catch (JSONException unused) {
            zzo.zze("Json string may be malformed.");
        } catch (Throwable th) {
            zzo.zzf("Failed to get webview content.", th);
            zzv.zzp().h("ContentFetchTask.processWebViewContent", th);
        }
    }
}
