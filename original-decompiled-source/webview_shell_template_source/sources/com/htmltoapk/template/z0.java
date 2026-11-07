package com.htmltoapk.template;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final /* synthetic */ class z0 implements p5.a {
    public final /* synthetic */ int s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ WebViewActivity f12631t;

    public /* synthetic */ z0(WebViewActivity webViewActivity, int i6) {
        this.s = i6;
        this.f12631t = webViewActivity;
    }

    @Override // p5.a
    public final Object a() {
        switch (this.s) {
            case 0:
                return WebViewActivity.showNoInternetDialog$lambda$58(this.f12631t);
            default:
                return WebViewActivity.onCreate$lambda$55(this.f12631t);
        }
    }
}
