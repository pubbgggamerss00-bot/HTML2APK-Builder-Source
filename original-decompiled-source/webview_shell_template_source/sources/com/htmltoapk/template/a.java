package com.htmltoapk.template;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final /* synthetic */ class a implements Runnable {
    public final /* synthetic */ int s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ AdMobBridge f12526t;

    public /* synthetic */ a(AdMobBridge adMobBridge, int i6) {
        this.s = i6;
        this.f12526t = adMobBridge;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.s) {
            case 0:
                AdMobBridge.onResume$lambda$51(this.f12526t);
                break;
            default:
                AdMobBridge.autoShowRunnable$lambda$0(this.f12526t);
                break;
        }
    }
}
