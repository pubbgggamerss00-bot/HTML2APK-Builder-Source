package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class ra1 implements bb1 {
    public final xc1 s;

    /* renamed from: t, reason: collision with root package name */
    public final Executor f8594t;

    /* renamed from: u, reason: collision with root package name */
    public final y5 f8595u = new y5(8);

    public ra1(xc1 xc1Var, h70 h70Var) {
        this.s = xc1Var;
        this.f8594t = h70Var;
    }

    public final c5.a a(com.google.android.gms.ads.mediation.customevent.a aVar, ab1 ab1Var, gk0 gk0Var) {
        c5.a aVarM;
        c5.a aVarJ;
        xc1 xc1Var = this.s;
        Executor executor = this.f8594t;
        xa1 xa1Var = new xa1(xc1Var, gk0Var, executor);
        va1 va1Var = xa1Var.f10454d;
        if (va1Var == null) {
            if (((Boolean) yp.f11059a.c()).booleanValue()) {
                fj0 fj0VarZzb = gk0Var.zzb();
                cd1 cd1Var = xc1Var.f10495b;
                dk0 dk0Var = fj0VarZzb.f4700i;
                vd1 vd1VarA = fj0VarZzb.f4695c.a(dk0Var.b(), yd1.M).c(new of0(1, fj0VarZzb, cd1Var)).a();
                ej0 ej0Var = new ej0(0, fj0VarZzb);
                vd1VarA.addListener(new as1(0, vd1VarA, ej0Var), fj0VarZzb.f4701j);
                aVarJ = bs1.j(bs1.o(xr1.p(vd1VarA), new ua1(0, xa1Var), executor), ix0.class, new ta1(0, xa1Var), executor);
            } else {
                va1 va1Var2 = new va1(null, xa1Var.a());
                xa1Var.f10454d = va1Var2;
                aVarJ = bs1.m(va1Var2);
            }
            aVarM = bs1.o(aVarJ, new xi0(1), executor);
        } else {
            aVarM = bs1.m(va1Var);
        }
        return bs1.j(bs1.p(xr1.p(aVarM), new ux0(2, this, gk0Var), executor), Exception.class, new pa1(0), executor);
    }

    @Override // com.google.android.gms.internal.ads.bb1
    public final /* bridge */ /* synthetic */ c5.a f(com.google.android.gms.ads.mediation.customevent.a aVar, ab1 ab1Var) {
        return a(aVar, ab1Var, null);
    }

    @Override // com.google.android.gms.internal.ads.bb1
    public final /* bridge */ /* synthetic */ Object zzd() {
        return null;
    }
}
