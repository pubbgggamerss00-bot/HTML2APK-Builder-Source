package com.htmltoapk.template;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final /* synthetic */ class m implements p5.a {
    public final /* synthetic */ int s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ String f12585t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ Object f12586u;

    public /* synthetic */ m(int i6, Object obj, String str) {
        this.s = i6;
        this.f12586u = obj;
        this.f12585t = str;
    }

    @Override // p5.a
    public final Object a() {
        switch (this.s) {
            case 0:
                return AdMobBridge.flushLoads$lambda$13$lambda$12((AdMobBridge) this.f12586u, this.f12585t);
            default:
                return AndroidAPI.startAudioRecording$lambda$70((AndroidAPI) this.f12586u, this.f12585t);
        }
    }
}
