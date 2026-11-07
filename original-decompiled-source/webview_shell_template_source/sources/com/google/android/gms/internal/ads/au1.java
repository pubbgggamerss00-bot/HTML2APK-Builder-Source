package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final /* synthetic */ class au1 implements nx1 {
    @Override // com.google.android.gms.internal.ads.nx1
    public final ih1 a(lt1 lt1Var, Integer num) throws GeneralSecurityException {
        fu1 fu1Var = (fu1) lt1Var;
        ey1 ey1Var = bu1.f3293a;
        int i6 = fu1Var.f4781a;
        if (i6 != 16 && i6 != 32) {
            throw new GeneralSecurityException("AES key size must be 16 or 32 bytes");
        }
        wt1 wt1Var = new wt1();
        wt1Var.f10270a = fu1Var;
        wt1Var.f10273d = num;
        wt1Var.f10271b = xj1.l(i6);
        wt1Var.f10272c = xj1.l(fu1Var.f4782b);
        return wt1Var.a();
    }
}
