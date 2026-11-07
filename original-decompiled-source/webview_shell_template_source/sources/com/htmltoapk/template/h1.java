package com.htmltoapk.template;

import org.json.JSONException;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final /* synthetic */ class h1 implements Runnable {
    public final /* synthetic */ int s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ WebViewActivity f12564t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ String f12565u;

    public /* synthetic */ h1(WebViewActivity webViewActivity, String str, int i6) {
        this.s = i6;
        this.f12564t = webViewActivity;
        this.f12565u = str;
    }

    @Override // java.lang.Runnable
    public final void run() throws JSONException {
        switch (this.s) {
            case 0:
                WebViewActivity.createDocumentLauncher$lambda$26$lambda$25$lambda$23(this.f12564t, this.f12565u);
                break;
            default:
                WebViewActivity$captureFrontPhoto$1$1.onError$lambda$0(this.f12564t, this.f12565u);
                break;
        }
    }
}
