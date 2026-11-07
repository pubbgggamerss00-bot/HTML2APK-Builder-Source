package com.htmltoapk.template;

import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import org.json.JSONObject;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final /* synthetic */ class c1 implements p5.p, SwipeRefreshLayout.OnRefreshListener {
    public final /* synthetic */ WebViewActivity s;

    public /* synthetic */ c1(WebViewActivity webViewActivity) {
        this.s = webViewActivity;
    }

    @Override // p5.p
    public Object b(Object obj, Object obj2) {
        return WebViewActivity.jsEventEmitter$lambda$0(this.s, (String) obj, (JSONObject) obj2);
    }

    @Override // androidx.swiperefreshlayout.widget.SwipeRefreshLayout.OnRefreshListener
    public void onRefresh() {
        WebViewActivity.onCreate$lambda$32(this.s);
    }
}
