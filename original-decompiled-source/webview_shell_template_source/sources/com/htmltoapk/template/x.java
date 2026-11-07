package com.htmltoapk.template;

import com.htmltoapk.template.WebViewActivity;
import java.io.IOException;
import org.json.JSONException;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final /* synthetic */ class x implements Runnable {
    public final /* synthetic */ int s = 0;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ String f12620t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ Object f12621u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ Object f12622v;

    public /* synthetic */ x(AndroidAPI androidAPI, String str, String str2) {
        this.f12620t = str;
        this.f12622v = androidAPI;
        this.f12621u = str2;
    }

    @Override // java.lang.Runnable
    public final void run() throws JSONException, IOException {
        switch (this.s) {
            case 0:
                AndroidAPI.httpGet$lambda$130(this.f12620t, (AndroidAPI) this.f12622v, (String) this.f12621u);
                break;
            default:
                WebViewActivity.pickFileLauncher$lambda$20$lambda$19$lambda$18((WebViewActivity) this.f12621u, this.f12620t, (WebViewActivity.UriReadResult.Error) this.f12622v);
                break;
        }
    }

    public /* synthetic */ x(WebViewActivity webViewActivity, String str, WebViewActivity.UriReadResult.Error error) {
        this.f12621u = webViewActivity;
        this.f12620t = str;
        this.f12622v = error;
    }
}
