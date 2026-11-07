package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final /* synthetic */ class s implements Runnable {
    public final /* synthetic */ y s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ Object f8747t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ long f8748u;

    public /* synthetic */ s(y yVar, Object obj, long j6) {
        this.s = yVar;
        this.f8747t = obj;
        this.f8748u = j6;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i6 = j31.f5914a;
        gb2 gb2Var = this.s.f10757b.s;
        bd2 bd2Var = gb2Var.I;
        xc2 xc2VarT = bd2Var.t();
        Object obj = this.f8747t;
        bd2Var.q(xc2VarT, 26, new xj0(xc2VarT, obj, this.f8748u));
        if (gb2Var.X == obj) {
            as0 as0Var = gb2Var.D;
            as0Var.c(26, new iu1(15));
            as0Var.b();
        }
    }
}
