package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final /* synthetic */ class ud2 implements Runnable {
    public final /* synthetic */ int s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ vd2 f9538t;

    public /* synthetic */ ud2(vd2 vd2Var, Object obj, int i6) {
        this.s = i6;
        this.f9538t = vd2Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i6 = this.s;
        vd2 vd2Var = this.f9538t;
        vd2Var.getClass();
        switch (i6) {
            case 0:
                int i7 = j31.f5914a;
                bd2 bd2Var = vd2Var.f9836b.s.I;
                bd2Var.q(bd2Var.t(), 1031, new aa1(22));
                break;
            default:
                int i8 = j31.f5914a;
                bd2 bd2Var2 = vd2Var.f9836b.s.I;
                bd2Var2.q(bd2Var2.t(), 1012, new sj1(16));
                break;
        }
    }
}
