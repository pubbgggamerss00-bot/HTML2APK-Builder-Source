package com.htmltoapk.template;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final /* synthetic */ class q implements p5.a {
    public final /* synthetic */ int s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ Object f12596t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ String f12597u;

    public /* synthetic */ q(int i6, Object obj, String str) {
        this.s = i6;
        this.f12596t = obj;
        this.f12597u = str;
    }

    @Override // p5.a
    public final Object a() {
        switch (this.s) {
            case 0:
                return AndroidAPI.showToast$lambda$5((AndroidAPI) this.f12596t, this.f12597u);
            case 1:
                return AndroidAPI.copyToClipboard$lambda$76((AndroidAPI) this.f12596t, this.f12597u);
            case 2:
                return AndroidAPI.getLocation$lambda$47((AndroidAPI) this.f12596t, this.f12597u);
            default:
                return AdMobBridge.showRewarded$lambda$50((AdMobBridge) this.f12596t, this.f12597u);
        }
    }
}
