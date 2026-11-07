package com.htmltoapk.template;

import android.hardware.camera2.CameraAccessException;
import android.net.Uri;
import android.view.View;
import org.json.JSONException;
import u0.r;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final /* synthetic */ class e1 implements d.b, r {
    public final /* synthetic */ int s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ WebViewActivity f12553t;

    public /* synthetic */ e1(WebViewActivity webViewActivity, int i6) {
        this.s = i6;
        this.f12553t = webViewActivity;
    }

    @Override // d.b
    public void b(Object obj) throws JSONException, CameraAccessException {
        switch (this.s) {
            case 0:
                WebViewActivity.permissionLauncher$lambda$3(this.f12553t, ((Boolean) obj).booleanValue());
                break;
            default:
                WebViewActivity.pdfSaveLauncher$lambda$21(this.f12553t, (Uri) obj);
                break;
        }
    }

    @Override // u0.r
    public u0.s0 d(View view, u0.s0 s0Var) {
        return WebViewActivity.onCreate$lambda$35(this.f12553t, view, s0Var);
    }
}
