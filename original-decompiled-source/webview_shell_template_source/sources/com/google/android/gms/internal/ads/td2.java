package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final /* synthetic */ class td2 implements Runnable {
    public final /* synthetic */ int s = 0;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ vd2 f9236t;

    public /* synthetic */ td2(vd2 vd2Var, int i6, long j6, long j7) {
        this.f9236t = vd2Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i6 = this.s;
        vd2 vd2Var = this.f9236t;
        vd2Var.getClass();
        switch (i6) {
            case 0:
                int i7 = j31.f5914a;
                bd2 bd2Var = vd2Var.f9836b.s.I;
                bd2Var.q(bd2Var.t(), 1011, new ih1(18));
                break;
            default:
                int i8 = j31.f5914a;
                bd2 bd2Var2 = vd2Var.f9836b.s.I;
                bd2Var2.q(bd2Var2.t(), 1008, new ih1(19));
                break;
        }
    }

    public /* synthetic */ td2(vd2 vd2Var, String str, long j6, long j7) {
        this.f9236t = vd2Var;
    }
}
