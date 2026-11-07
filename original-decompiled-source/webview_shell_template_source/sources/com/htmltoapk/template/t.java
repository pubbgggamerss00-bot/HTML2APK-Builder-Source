package com.htmltoapk.template;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final /* synthetic */ class t implements p5.a {
    public final /* synthetic */ int s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ Object f12602t;

    public /* synthetic */ t(int i6, Object obj) {
        this.s = i6;
        this.f12602t = obj;
    }

    @Override // p5.a
    public final Object a() {
        switch (this.s) {
            case 0:
                return AndroidAPI.setTorch$lambda$10((AndroidAPI) this.f12602t);
            case 1:
                return AndroidAPI.sensorManager_delegate$lambda$1((AndroidAPI) this.f12602t);
            default:
                return AdMobBridge.showInterstitial$lambda$42((AdMobBridge) this.f12602t);
        }
    }
}
