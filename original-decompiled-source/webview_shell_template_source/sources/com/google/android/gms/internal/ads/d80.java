package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final /* synthetic */ class d80 implements Runnable {
    public final /* synthetic */ int s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ boolean f3788t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ Object f3789u;

    public /* synthetic */ d80(Object obj, boolean z6, int i6) {
        this.s = i6;
        this.f3789u = obj;
        this.f3788t = z6;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i6 = this.s;
        boolean z6 = this.f3788t;
        Object obj = this.f3789u;
        switch (i6) {
            case 0:
                f80 f80Var = (f80) obj;
                f80Var.getClass();
                f80Var.c("windowFocusChanged", "hasWindowFocus", String.valueOf(z6));
                break;
            default:
                vd2 vd2Var = (vd2) obj;
                vd2Var.getClass();
                int i7 = j31.f5914a;
                gb2 gb2Var = vd2Var.f9836b.s;
                if (gb2Var.f4977d0 != z6) {
                    gb2Var.f4977d0 = z6;
                    as0 as0Var = gb2Var.D;
                    as0Var.c(23, new yz1(z6));
                    as0Var.b();
                    break;
                }
                break;
        }
    }
}
