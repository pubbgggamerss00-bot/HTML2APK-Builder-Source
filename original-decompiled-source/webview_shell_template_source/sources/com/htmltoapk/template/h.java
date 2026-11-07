package com.htmltoapk.template;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final /* synthetic */ class h implements p5.a {
    public final /* synthetic */ int s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ Object f12561t;

    public /* synthetic */ h(int i6, Object obj) {
        this.s = i6;
        this.f12561t = obj;
    }

    @Override // p5.a
    public final Object a() {
        switch (this.s) {
            case 0:
                return AdMobBridge.updateBannerMargins$lambda$37((AdMobBridge) this.f12561t);
            case 1:
                return AndroidAPI.geocoder_delegate$lambda$59((AndroidAPI) this.f12561t);
            case 2:
                return WebViewActivity.onCreate$lambda$54((WebViewActivity) this.f12561t);
            default:
                ((w2.a0) this.f12561t).c(true);
                return d5.j.f12745a;
        }
    }
}
