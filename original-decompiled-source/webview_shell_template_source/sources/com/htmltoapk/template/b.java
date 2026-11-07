package com.htmltoapk.template;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final /* synthetic */ class b implements p5.a {
    public final /* synthetic */ int s = 0;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ String f12531t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ Object f12532u;

    public /* synthetic */ b(AdMobBridge adMobBridge, String str) {
        this.f12531t = str;
        this.f12532u = adMobBridge;
    }

    @Override // p5.a
    public final Object a() {
        switch (this.s) {
            case 0:
                return AdMobBridge.setBannerPosition$lambda$35(this.f12531t, (AdMobBridge) this.f12532u);
            default:
                return AndroidAPI.capturePhoto$lambda$61((AndroidAPI) this.f12532u, this.f12531t);
        }
    }

    public /* synthetic */ b(AndroidAPI androidAPI, String str) {
        this.f12532u = androidAPI;
        this.f12531t = str;
    }
}
