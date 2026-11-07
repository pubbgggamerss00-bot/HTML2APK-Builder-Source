package com.htmltoapk.template;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final /* synthetic */ class d0 implements p5.a {
    public final /* synthetic */ int s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ AndroidAPI f12547t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ String f12548u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ String f12549v;

    public /* synthetic */ d0(AndroidAPI androidAPI, String str, String str2, int i6) {
        this.s = i6;
        this.f12547t = androidAPI;
        this.f12548u = str;
        this.f12549v = str2;
    }

    @Override // p5.a
    public final Object a() {
        switch (this.s) {
            case 0:
                return AndroidAPI.capturePhoto$lambda$62(this.f12547t, this.f12548u, this.f12549v);
            default:
                return AndroidAPI.startSensor$lambda$102(this.f12547t, this.f12548u, this.f12549v);
        }
    }
}
