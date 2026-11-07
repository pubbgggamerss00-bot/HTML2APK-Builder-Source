package com.google.android.gms.internal.ads;

import java.util.Comparator;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final /* synthetic */ class wj2 implements Comparator {
    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        Comparator lp1Var;
        xj2 xj2Var = (xj2) obj;
        xj2 xj2Var2 = (xj2) obj2;
        if (xj2Var.f10620w && xj2Var.f10623z) {
            lp1Var = yj2.f11011j;
        } else {
            pn1 pn1Var = yj2.f11011j;
            pn1Var.getClass();
            lp1Var = new lp1(pn1Var);
        }
        xj2Var.f10621x.getClass();
        return tn1.f9352a.c(Integer.valueOf(xj2Var.C), Integer.valueOf(xj2Var2.C), lp1Var).c(Integer.valueOf(xj2Var.B), Integer.valueOf(xj2Var2.B), lp1Var).a();
    }
}
