package com.htmltoapk.template;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final /* synthetic */ class c implements p5.a {
    public final /* synthetic */ int s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ Object f12538t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ Object f12539u;

    public /* synthetic */ c(int i6, Object obj, Object obj2) {
        this.s = i6;
        this.f12539u = obj;
        this.f12538t = obj2;
    }

    @Override // p5.a
    public final Object a() {
        switch (this.s) {
            case 0:
                return AdMobBridge.loadRewarded$lambda$43((AdMobBridge) this.f12539u, (String) this.f12538t);
            case 1:
                return AndroidAPI.shareText$lambda$78((AndroidAPI) this.f12539u, (String) this.f12538t);
            default:
                return ConsentManager$backend$1.requiredForm$lambda$4((ConsentManager) this.f12539u, (p5.l) this.f12538t);
        }
    }
}
