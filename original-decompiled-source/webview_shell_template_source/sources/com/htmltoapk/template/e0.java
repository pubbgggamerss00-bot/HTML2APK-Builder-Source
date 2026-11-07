package com.htmltoapk.template;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final /* synthetic */ class e0 implements p5.a {
    public final /* synthetic */ int s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ Object f12552t;

    public /* synthetic */ e0(int i6, Object obj) {
        this.s = i6;
        this.f12552t = obj;
    }

    @Override // p5.a
    public final Object a() {
        switch (this.s) {
            case 0:
                return AndroidAPI.locationManager_delegate$lambda$2((AndroidAPI) this.f12552t);
            case 1:
                return AndroidAPI.showNotification$lambda$14((AndroidAPI) this.f12552t);
            default:
                return WebViewActivity.onCreate$lambda$39$lambda$38((WebViewActivity) this.f12552t);
        }
    }
}
