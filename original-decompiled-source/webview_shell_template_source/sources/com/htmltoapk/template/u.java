package com.htmltoapk.template;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final /* synthetic */ class u implements p5.a {
    public final /* synthetic */ int s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ Object f12606t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ String f12607u;

    public /* synthetic */ u(int i6, Object obj, String str) {
        this.s = i6;
        this.f12606t = obj;
        this.f12607u = str;
    }

    @Override // p5.a
    public final Object a() {
        switch (this.s) {
            case 0:
                return AndroidAPI.startLocationUpdates$lambda$53((AndroidAPI) this.f12606t, this.f12607u);
            case 1:
                return AndroidAPI.stopAudioRecording$lambda$72((AndroidAPI) this.f12606t, this.f12607u);
            default:
                return AdMobBridge.loadInterstitial$lambda$39((AdMobBridge) this.f12606t, this.f12607u);
        }
    }
}
