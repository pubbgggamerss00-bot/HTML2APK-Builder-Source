package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final /* synthetic */ class cz1 implements nx1 {
    @Override // com.google.android.gms.internal.ads.nx1
    public final ih1 a(lt1 lt1Var, Integer num) throws GeneralSecurityException {
        gz1 gz1Var = (gz1) lt1Var;
        int i6 = gz1Var.f5191a;
        if (i6 != 32) {
            throw new GeneralSecurityException("AesCmacKey size wrong, must be 32 bytes");
        }
        az1 az1Var = new az1();
        az1Var.f2876a = gz1Var;
        az1Var.f2877b = xj1.l(i6);
        az1Var.f2878c = num;
        return az1Var.a();
    }
}
