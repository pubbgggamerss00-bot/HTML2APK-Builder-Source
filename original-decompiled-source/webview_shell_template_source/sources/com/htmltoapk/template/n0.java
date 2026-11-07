package com.htmltoapk.template;

import java.util.Map;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final /* synthetic */ class n0 implements p5.l, d.b {
    public final /* synthetic */ Object s;

    public /* synthetic */ n0(Object obj) {
        this.s = obj;
    }

    @Override // d.b
    public void b(Object obj) {
        WebViewActivity.webPermissionLauncher$lambda$6((WebViewActivity) this.s, (Map) obj);
    }

    @Override // p5.l
    public Object invoke(Object obj) {
        return ConsentManager.flow$lambda$0((ConsentManager) this.s, (ConsentSnapshot) obj);
    }
}
