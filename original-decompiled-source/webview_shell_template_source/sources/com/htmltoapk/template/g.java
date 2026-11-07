package com.htmltoapk.template;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final /* synthetic */ class g implements p5.a {
    public final /* synthetic */ int s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ AdMobBridge f12557t;

    public /* synthetic */ g(AdMobBridge adMobBridge, int i6) {
        this.s = i6;
        this.f12557t = adMobBridge;
    }

    @Override // p5.a
    public final Object a() {
        switch (this.s) {
            case 0:
                return AdMobBridge.showBanner$lambda$27(this.f12557t);
            default:
                return AdMobBridge.hideBanner$lambda$32(this.f12557t);
        }
    }
}
