package com.htmltoapk.template;

import com.htmltoapk.template.WebViewActivity;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final /* synthetic */ class j1 implements Runnable {
    public final /* synthetic */ int s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ WebViewActivity f12576t;

    public /* synthetic */ j1(WebViewActivity webViewActivity, int i6) {
        this.s = i6;
        this.f12576t = webViewActivity;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.s) {
            case 0:
                WebViewActivity.setupSplash$lambda$111(this.f12576t);
                break;
            default:
                WebViewActivity.AnonymousClass13.onPageFinished$lambda$1(this.f12576t);
                break;
        }
    }
}
