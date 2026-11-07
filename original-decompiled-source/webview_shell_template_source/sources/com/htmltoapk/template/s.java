package com.htmltoapk.template;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final /* synthetic */ class s implements p5.a {
    public final /* synthetic */ int s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ AndroidAPI f12599t;

    public /* synthetic */ s(AndroidAPI androidAPI, int i6) {
        this.s = i6;
        this.f12599t = androidAPI;
    }

    @Override // p5.a
    public final Object a() {
        switch (this.s) {
            case 0:
                return AndroidAPI.startCameraPreview$lambda$67(this.f12599t);
            case 1:
                return AndroidAPI.openExactAlarmSettings$lambda$29(this.f12599t);
            default:
                return AndroidAPI.notificationManager_delegate$lambda$3(this.f12599t);
        }
    }
}
