package com.htmltoapk.template;

import android.net.Uri;
import java.io.IOException;
import org.json.JSONException;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final /* synthetic */ class b1 implements Runnable {
    public final /* synthetic */ int s = 1;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ WebViewActivity f12534t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ String f12535u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ String f12536v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ Comparable f12537w;

    public /* synthetic */ b1(WebViewActivity webViewActivity, Uri uri, String str, String str2) {
        this.f12534t = webViewActivity;
        this.f12537w = uri;
        this.f12535u = str;
        this.f12536v = str2;
    }

    @Override // java.lang.Runnable
    public final void run() throws JSONException, IOException {
        switch (this.s) {
            case 0:
                WebViewActivity.downloadDataUri$lambda$98(this.f12535u, this.f12534t, this.f12536v, (String) this.f12537w);
                break;
            default:
                WebViewActivity.createDocumentLauncher$lambda$26$lambda$25(this.f12534t, (Uri) this.f12537w, this.f12535u, this.f12536v);
                break;
        }
    }

    public /* synthetic */ b1(String str, WebViewActivity webViewActivity, String str2, String str3) {
        this.f12535u = str;
        this.f12534t = webViewActivity;
        this.f12536v = str2;
        this.f12537w = str3;
    }
}
