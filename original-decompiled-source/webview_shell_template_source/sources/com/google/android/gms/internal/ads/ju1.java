package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final /* synthetic */ class ju1 implements nx1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6166a;

    @Override // com.google.android.gms.internal.ads.nx1
    public final ih1 a(lt1 lt1Var, Integer num) throws GeneralSecurityException {
        switch (this.f6166a) {
            case 0:
                mu1 mu1Var = (mu1) lt1Var;
                ey1 ey1Var = ku1.f6493a;
                int i6 = mu1Var.f7222a;
                if (i6 == 24) {
                    throw new GeneralSecurityException("192 bit AES GCM Parameters are not valid");
                }
                gu1 gu1Var = new gu1();
                gu1Var.f5166a = mu1Var;
                gu1Var.f5168c = num;
                gu1Var.f5167b = xj1.l(i6);
                return gu1Var.a();
            case 1:
                ey1 ey1Var2 = bv1.f3305a;
                return av1.m(((cv1) lt1Var).f3674a, xj1.l(32), num);
            default:
                px1 px1Var = px1.f8174b;
                x12 x12Var = ((ix1) lt1Var).f5876a.f8181b;
                xw1 xw1Var = xw1.f10733d;
                ct1 ct1VarC = xw1Var.c(x12Var.H());
                if (!((Boolean) xw1Var.f10735b.get(x12Var.H())).booleanValue()) {
                    throw new GeneralSecurityException("Creating new keys is not allowed.");
                }
                v12 v12VarA = ct1VarC.a(x12Var.G());
                return new hx1(oy1.a(v12VarA.F(), v12VarA.E(), v12VarA.C(), x12Var.F(), num));
        }
    }
}
