package com.htmltoapk.template;

import android.net.Uri;
import android.view.View;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import org.json.JSONException;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final /* synthetic */ class d1 implements d.b, SwipeRefreshLayout.OnChildScrollUpCallback {
    public final /* synthetic */ int s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ WebViewActivity f12550t;

    public /* synthetic */ d1(WebViewActivity webViewActivity, int i6) {
        this.s = i6;
        this.f12550t = webViewActivity;
    }

    @Override // d.b
    public void b(Object obj) throws JSONException {
        switch (this.s) {
            case 0:
                WebViewActivity.createDocumentLauncher$lambda$26(this.f12550t, (Uri) obj);
                break;
            default:
                WebViewActivity.takePictureLauncher$lambda$10(this.f12550t, ((Boolean) obj).booleanValue());
                break;
        }
    }

    @Override // androidx.swiperefreshlayout.widget.SwipeRefreshLayout.OnChildScrollUpCallback
    public boolean canChildScrollUp(SwipeRefreshLayout swipeRefreshLayout, View view) {
        return WebViewActivity.onCreate$lambda$33(this.f12550t, swipeRefreshLayout, view);
    }
}
