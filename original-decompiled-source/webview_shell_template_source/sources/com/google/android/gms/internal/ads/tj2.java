package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.RequestConfiguration;
import java.util.Comparator;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class tj2 extends vj2 implements Comparable {
    public final int A;
    public final int B;
    public final int C;
    public final int D;
    public final boolean E;

    /* renamed from: w, reason: collision with root package name */
    public final int f9313w;

    /* renamed from: x, reason: collision with root package name */
    public final boolean f9314x;

    /* renamed from: y, reason: collision with root package name */
    public final boolean f9315y;

    /* renamed from: z, reason: collision with root package name */
    public final boolean f9316z;

    public tj2(int i6, a00 a00Var, int i7, jj2 jj2Var, int i8, String str) {
        int iH;
        super(i6, a00Var, i7);
        int i9 = 0;
        this.f9314x = rj1.i(i8, false);
        int i10 = this.f9888v.f9971e;
        jj2Var.getClass();
        bo1 bo1Var = jj2Var.h;
        this.f9315y = 1 == (i10 & 1);
        this.f9316z = (i10 & 2) != 0;
        bo1 bo1VarN = bo1Var.isEmpty() ? bo1.n(RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED) : bo1Var;
        int i11 = 0;
        while (true) {
            if (i11 >= bo1VarN.size()) {
                iH = 0;
                i11 = Integer.MAX_VALUE;
                break;
            } else {
                iH = yj2.h(this.f9888v, (String) bo1VarN.get(i11), false);
                if (iH > 0) {
                    break;
                } else {
                    i11++;
                }
            }
        }
        this.A = i11;
        this.B = iH;
        int i12 = this.f9888v.f9972f;
        int i13 = jj2Var.f3756i;
        pn1 pn1Var = yj2.f11011j;
        int iBitCount = (i12 == 0 || i12 != i13) ? Integer.bitCount(i12 & i13) : Integer.MAX_VALUE;
        this.C = iBitCount;
        this.E = (this.f9888v.f9972f & 1088) != 0;
        int iH2 = yj2.h(this.f9888v, str, yj2.i(str) == null);
        this.D = iH2;
        boolean z6 = iH > 0 || (bo1Var.isEmpty() && iBitCount > 0) || this.f9315y || (this.f9316z && iH2 > 0);
        if (rj1.i(i8, jj2Var.f6092q) && z6) {
            i9 = 1;
        }
        this.f9313w = i9;
    }

    @Override // com.google.android.gms.internal.ads.vj2
    public final int a() {
        return this.f9313w;
    }

    @Override // com.google.android.gms.internal.ads.vj2
    public final /* bridge */ /* synthetic */ boolean b(vj2 vj2Var) {
        return false;
    }

    @Override // java.lang.Comparable
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final int compareTo(tj2 tj2Var) {
        tn1 tn1VarD = tn1.f9352a.d(this.f9314x, tj2Var.f9314x);
        Integer numValueOf = Integer.valueOf(this.A);
        Integer numValueOf2 = Integer.valueOf(tj2Var.A);
        Comparator comparator = zo1.s;
        comparator.getClass();
        kp1 kp1Var = kp1.s;
        tn1 tn1VarC = tn1VarD.c(numValueOf, numValueOf2, kp1Var);
        int i6 = tj2Var.B;
        int i7 = this.B;
        tn1 tn1VarB = tn1VarC.b(i7, i6);
        int i8 = tj2Var.C;
        int i9 = this.C;
        tn1 tn1VarD2 = tn1VarB.b(i9, i8).d(this.f9315y, tj2Var.f9315y);
        Boolean boolValueOf = Boolean.valueOf(this.f9316z);
        Boolean boolValueOf2 = Boolean.valueOf(tj2Var.f9316z);
        if (i7 != 0) {
            comparator = kp1Var;
        }
        tn1 tn1VarB2 = tn1VarD2.c(boolValueOf, boolValueOf2, comparator).b(this.D, tj2Var.D);
        if (i9 == 0) {
            tn1VarB2 = tn1VarB2.e(this.E, tj2Var.E);
        }
        return tn1VarB2.a();
    }
}
