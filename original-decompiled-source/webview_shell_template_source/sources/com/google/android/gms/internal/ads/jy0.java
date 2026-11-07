package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class jy0 {

    /* renamed from: a, reason: collision with root package name */
    public final fy0 f6190a;

    /* renamed from: b, reason: collision with root package name */
    public final hs1 f6191b;

    public jy0(fy0 fy0Var, hs1 hs1Var) {
        this.f6190a = fy0Var;
        this.f6191b = hs1Var;
    }

    public final void a(td1 td1Var) {
        x60 x60Var = new x60(1, this.f6190a);
        hs1 hs1Var = this.f6191b;
        c5.a aVarU = hs1Var.u(x60Var);
        aVarU.addListener(new as1(0, aVarU, new iy0(td1Var)), hs1Var);
    }
}
