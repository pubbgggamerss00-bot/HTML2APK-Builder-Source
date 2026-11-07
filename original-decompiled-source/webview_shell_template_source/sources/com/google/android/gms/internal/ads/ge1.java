package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.nonagon.signalgeneration.zzaa;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class ge1 {
    public static void a(c5.a aVar, de1 de1Var) {
        if (((Boolean) mp.f7199c.c()).booleanValue()) {
            xr1 xr1VarP = xr1.p(aVar);
            ck1 ck1Var = new ck1(13, de1Var);
            xr1VarP.addListener(new as1(0, xr1VarP, ck1Var), i70.f5592g);
        }
    }

    public static int b(ec1 ec1Var) {
        int iZzf = zzaa.zzf(ec1Var) - 1;
        return (iZzf == 0 || iZzf == 1) ? 7 : 23;
    }

    public static void c(c5.a aVar, he1 he1Var, de1 de1Var, boolean z6) {
        if (((Boolean) mp.f7199c.c()).booleanValue()) {
            xr1 xr1VarP = xr1.p(aVar);
            ha0 ha0Var = new ha0(he1Var, de1Var, z6);
            xr1VarP.addListener(new as1(0, xr1VarP, ha0Var), i70.f5592g);
        }
    }
}
