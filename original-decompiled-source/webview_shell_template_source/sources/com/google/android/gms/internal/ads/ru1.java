package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final /* synthetic */ class ru1 implements nx1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f8707a;

    @Override // com.google.android.gms.internal.ads.nx1
    public final ih1 a(lt1 lt1Var, Integer num) throws GeneralSecurityException {
        switch (this.f8707a) {
            case 0:
                uu1 uu1Var = (uu1) lt1Var;
                ey1 ey1Var = su1.f9004a;
                int i6 = uu1Var.f9634a;
                if (i6 == 24) {
                    throw new GeneralSecurityException("192 bit AES GCM Parameters are not valid");
                }
                nu1 nu1Var = new nu1();
                nu1Var.f7511a = uu1Var;
                nu1Var.f7513c = num;
                nu1Var.f7512b = xj1.l(i6);
                return nu1Var.a();
            default:
                qz1 qz1Var = (qz1) lt1Var;
                kz1 kz1Var = new kz1();
                kz1Var.f6536a = qz1Var;
                kz1Var.f6537b = xj1.l(qz1Var.f8488a);
                kz1Var.f6538c = num;
                return kz1Var.a();
        }
    }
}
