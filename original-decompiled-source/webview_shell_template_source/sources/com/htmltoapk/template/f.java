package com.htmltoapk.template;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final /* synthetic */ class f implements Runnable {
    public final /* synthetic */ int s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ AdMobBridge f12554t;

    public /* synthetic */ f(AdMobBridge adMobBridge, int i6) {
        this.s = i6;
        this.f12554t = adMobBridge;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.s) {
            case 0:
                AdMobBridge.finishLoad$lambda$23(this.f12554t);
                break;
            default:
                AdMobBridge._init_$lambda$1(this.f12554t);
                break;
        }
    }
}
