package com.htmltoapk.template;

import android.widget.FrameLayout;
import org.json.JSONException;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final /* synthetic */ class e implements Runnable {
    public final /* synthetic */ int s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ Object f12551t;

    public /* synthetic */ e(int i6, Object obj) {
        this.s = i6;
        this.f12551t = obj;
    }

    @Override // java.lang.Runnable
    public final void run() throws JSONException {
        switch (this.s) {
            case 0:
                AdMobBridge.showPrivacyOptions$lambda$4((AdMobBridge) this.f12551t);
                break;
            case 1:
                AndroidAPI.finishSingleLocation$default((AndroidAPI) this.f12551t, null, "timeout", false, 4, null);
                break;
            default:
                WebViewActivity.onCreate$lambda$36((FrameLayout) this.f12551t);
                break;
        }
    }
}
