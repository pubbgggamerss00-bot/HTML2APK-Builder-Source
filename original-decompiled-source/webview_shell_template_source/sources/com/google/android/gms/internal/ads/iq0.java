package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final /* synthetic */ class iq0 implements Runnable {
    public final /* synthetic */ int s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ xa0 f5828t;

    public /* synthetic */ iq0(xa0 xa0Var, int i6) {
        this.s = i6;
        this.f5828t = xa0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.s) {
            case 0:
                this.f5828t.G("onSdkImpression", new w.a());
                break;
            default:
                this.f5828t.destroy();
                break;
        }
    }
}
