package com.htmltoapk.template;

import java.util.Map;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final /* synthetic */ class f1 implements d.b, p5.l {
    public final /* synthetic */ int s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ WebViewActivity f12556t;

    public /* synthetic */ f1(WebViewActivity webViewActivity, int i6) {
        this.s = i6;
        this.f12556t = webViewActivity;
    }

    @Override // d.b
    public void b(Object obj) {
        switch (this.s) {
            case 0:
                WebViewActivity.geolocationPermissionLauncher$lambda$7(this.f12556t, (Map) obj);
                break;
            default:
                WebViewActivity.onCreate$lambda$29(this.f12556t, (d.a) obj);
                break;
        }
    }

    @Override // p5.l
    public Object invoke(Object obj) {
        return WebViewActivity.onCreate$lambda$39(this.f12556t, (androidx.activity.f0) obj);
    }
}
