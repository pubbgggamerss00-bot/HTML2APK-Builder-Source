package com.htmltoapk.template;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final /* synthetic */ class j implements p5.a {
    public final /* synthetic */ int s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ String f12570t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ String f12571u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ Object f12572v;

    public /* synthetic */ j(Object obj, String str, String str2, int i6) {
        this.s = i6;
        this.f12572v = obj;
        this.f12570t = str;
        this.f12571u = str2;
    }

    @Override // p5.a
    public final Object a() {
        switch (this.s) {
            case 0:
                return AdMobBridge.loadBanner$lambda$26((AdMobBridge) this.f12572v, this.f12570t, this.f12571u);
            default:
                return AndroidAPI.requestPermission$lambda$37((AndroidAPI) this.f12572v, this.f12570t, this.f12571u);
        }
    }
}
