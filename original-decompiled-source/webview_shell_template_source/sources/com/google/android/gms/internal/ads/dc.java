package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class dc implements Comparator {
    public final /* synthetic */ int s;

    public /* synthetic */ dc(int i6) {
        this.s = i6;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.s) {
            case 0:
                return ((byte[]) obj).length - ((byte[]) obj2).length;
            case 1:
                List list = (List) obj;
                List list2 = (List) obj2;
                return qn1.f(new dc(2).compare((xj2) Collections.max(list, new dc(2)), (xj2) Collections.max(list2, new dc(2)))).b(list.size(), list2.size()).c((xj2) Collections.max(list, new wj2()), (xj2) Collections.max(list2, new wj2()), new wj2()).a();
            default:
                xj2 xj2Var = (xj2) obj;
                xj2 xj2Var2 = (xj2) obj2;
                tn1 tn1VarD = tn1.f9352a.d(xj2Var.f10623z, xj2Var2.f10623z);
                Integer numValueOf = Integer.valueOf(xj2Var.E);
                Integer numValueOf2 = Integer.valueOf(xj2Var2.E);
                zo1.s.getClass();
                kp1 kp1Var = kp1.s;
                tn1 tn1VarC = tn1VarD.c(numValueOf, numValueOf2, kp1Var).b(xj2Var.F, xj2Var2.F).b(xj2Var.G, xj2Var2.G).d(xj2Var.H, xj2Var2.H).b(xj2Var.I, xj2Var2.I).d(xj2Var.A, xj2Var2.A).d(xj2Var.f10620w, xj2Var2.f10620w).d(xj2Var.f10622y, xj2Var2.f10622y).c(Integer.valueOf(xj2Var.D), Integer.valueOf(xj2Var2.D), kp1Var);
                boolean z6 = xj2Var.K;
                tn1 tn1VarD2 = tn1VarC.d(z6, xj2Var2.K);
                boolean z7 = xj2Var.L;
                tn1 tn1VarD3 = tn1VarD2.d(z7, xj2Var2.L);
                if (z6 && z7) {
                    tn1VarD3 = tn1VarD3.b(xj2Var.M, xj2Var2.M);
                }
                return tn1VarD3.a();
        }
    }
}
