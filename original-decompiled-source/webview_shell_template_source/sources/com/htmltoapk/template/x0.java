package com.htmltoapk.template;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final /* synthetic */ class x0 implements Runnable {
    public final /* synthetic */ int s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ WebViewActivity f12623t;

    public /* synthetic */ x0(WebViewActivity webViewActivity, int i6) {
        this.s = i6;
        this.f12623t = webViewActivity;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.s) {
            case 0:
                WebViewActivity.updateBannerPadding$lambda$1(this.f12623t);
                break;
            case 1:
                this.f12623t.onPageLoadTimedOut();
                break;
            default:
                WebViewActivity.injectCleartextInterceptor$lambda$106(this.f12623t);
                break;
        }
    }
}
