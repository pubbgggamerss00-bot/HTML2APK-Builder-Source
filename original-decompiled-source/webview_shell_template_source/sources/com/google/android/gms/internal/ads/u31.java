package com.google.android.gms.internal.ads;

import java.util.Collections;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class u31 implements yz0 {

    /* renamed from: a, reason: collision with root package name */
    public final to f9452a;

    /* renamed from: b, reason: collision with root package name */
    public final hs1 f9453b;

    /* renamed from: c, reason: collision with root package name */
    public final ae1 f9454c;

    /* renamed from: d, reason: collision with root package name */
    public final x31 f9455d;

    public u31(ae1 ae1Var, hs1 hs1Var, to toVar, x31 x31Var) {
        this.f9454c = ae1Var;
        this.f9453b = hs1Var;
        this.f9452a = toVar;
        this.f9455d = x31Var;
    }

    @Override // com.google.android.gms.internal.ads.yz0
    public final boolean a(ac1 ac1Var, tb1 tb1Var) {
        xb1 xb1Var;
        return (this.f9452a == null || (xb1Var = tb1Var.s) == null || xb1Var.f10472a == null) ? false : true;
    }

    @Override // com.google.android.gms.internal.ads.yz0
    public final c5.a b(ac1 ac1Var, tb1 tb1Var) {
        o70 o70Var = new o70();
        dh0 dh0Var = new dh0(16);
        t31 t31Var = new t31(this, o70Var, ac1Var, tb1Var, dh0Var);
        synchronized (dh0Var) {
            dh0Var.f3937t = t31Var;
        }
        xb1 xb1Var = tb1Var.s;
        po poVar = new po(dh0Var, xb1Var.f10473b, xb1Var.f10472a);
        yd1 yd1Var = yd1.I;
        com.google.android.gms.ads.mediation.customevent.a aVar = new com.google.android.gms.ads.mediation.customevent.a(7, this, poVar);
        ae1 ae1Var = this.f9454c;
        wd1 wd1Var = new wd1(ae1Var, yd1Var, null, ae1.f2730d, Collections.EMPTY_LIST, this.f9453b.u(new e61(3, aVar)));
        wd1 wd1VarA = ae1Var.a(wd1Var.a(), yd1.J);
        rf0 rf0Var = new rf0(3, o70Var);
        h70 h70Var = i70.f5592g;
        return new wd1(wd1VarA.f10171f, wd1VarA.f10166a, null, wd1VarA.f10168c, wd1VarA.f10169d, bs1.p(wd1VarA.f10170e, rf0Var, h70Var)).a();
    }
}
