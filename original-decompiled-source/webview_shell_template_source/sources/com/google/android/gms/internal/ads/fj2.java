package com.google.android.gms.internal.ads;

import android.content.res.Configuration;
import android.content.res.Resources;
import android.text.TextUtils;
import java.util.Comparator;
import java.util.Objects;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class fj2 extends vj2 implements Comparable {
    public final boolean A;
    public final int B;
    public final int C;
    public final int D;
    public final boolean E;
    public final int F;
    public final int G;
    public final boolean H;
    public final int I;
    public final int J;
    public final int K;
    public final int L;
    public final boolean M;
    public final boolean N;
    public final boolean O;

    /* renamed from: w, reason: collision with root package name */
    public final int f4710w;

    /* renamed from: x, reason: collision with root package name */
    public final boolean f4711x;

    /* renamed from: y, reason: collision with root package name */
    public final String f4712y;

    /* renamed from: z, reason: collision with root package name */
    public final jj2 f4713z;

    public fj2(int i6, a00 a00Var, int i7, jj2 jj2Var, int i8, boolean z6, ej2 ej2Var) {
        int i9;
        int iH;
        int iHashCode;
        int iH2;
        boolean z7;
        super(i6, a00Var, i7);
        this.f4713z = jj2Var;
        boolean z8 = jj2Var.f6090o;
        bo1 bo1Var = jj2Var.f3754f;
        bo1 bo1Var2 = jj2Var.f3753e;
        int i10 = 1;
        int i11 = true != z8 ? 16 : 24;
        this.f4712y = yj2.i(this.f9888v.f9970d);
        this.A = rj1.i(i8, false);
        int i12 = 0;
        while (true) {
            i9 = Integer.MAX_VALUE;
            if (i12 >= bo1Var2.size()) {
                iH = 0;
                i12 = Integer.MAX_VALUE;
                break;
            } else {
                iH = yj2.h(this.f9888v, (String) bo1Var2.get(i12), false);
                if (iH > 0) {
                    break;
                } else {
                    i12++;
                }
            }
        }
        this.C = i12;
        this.B = iH;
        int i13 = this.f9888v.f9972f;
        this.D = (i13 == 0 || i13 != 0) ? Integer.bitCount(0) : Integer.MAX_VALUE;
        w wVar = this.f9888v;
        int i14 = wVar.f9972f;
        this.E = i14 == 0 || (i14 & 1) != 0;
        this.H = 1 == (wVar.f9971e & 1);
        String str = wVar.f9978m;
        this.O = str != null && ((iHashCode = str.hashCode()) == -2123537834 ? str.equals("audio/eac3-joc") : !(iHashCode == 187078297 ? !str.equals("audio/ac4") : !(iHashCode == 1504698186 && str.equals("audio/iamf"))));
        this.I = wVar.B;
        this.J = wVar.C;
        this.K = wVar.f9974i;
        this.f4711x = ej2Var.zza(wVar);
        Configuration configuration = Resources.getSystem().getConfiguration();
        String[] strArrSplit = j31.f5914a >= 24 ? configuration.getLocales().toLanguageTags().split(",", -1) : new String[]{configuration.locale.toLanguageTag()};
        for (int i15 = 0; i15 < strArrSplit.length; i15++) {
            strArrSplit[i15] = j31.a(strArrSplit[i15]);
        }
        int i16 = 0;
        while (true) {
            if (i16 >= strArrSplit.length) {
                iH2 = 0;
                i16 = Integer.MAX_VALUE;
                break;
            } else {
                iH2 = yj2.h(this.f9888v, strArrSplit[i16], false);
                if (iH2 > 0) {
                    break;
                } else {
                    i16++;
                }
            }
        }
        this.F = i16;
        this.G = iH2;
        int i17 = 0;
        while (true) {
            if (i17 >= bo1Var.size()) {
                break;
            }
            String str2 = this.f9888v.f9978m;
            if (str2 != null && str2.equals(bo1Var.get(i17))) {
                i9 = i17;
                break;
            }
            i17++;
        }
        this.L = i9;
        this.M = (i8 & 384) == 128;
        this.N = (i8 & 64) == 64;
        jj2 jj2Var2 = this.f4713z;
        if (!rj1.i(i8, jj2Var2.f6092q) || (!(z7 = this.f4711x) && !jj2Var2.f6089n)) {
            i10 = 0;
        } else if (rj1.i(i8, false) && z7 && this.f9888v.f9974i != -1 && ((jj2Var2.f6093r || !z6) && (i11 & i8) != 0)) {
            i10 = 2;
        }
        this.f4710w = i10;
    }

    @Override // com.google.android.gms.internal.ads.vj2
    public final int a() {
        return this.f4710w;
    }

    @Override // com.google.android.gms.internal.ads.vj2
    public final /* bridge */ /* synthetic */ boolean b(vj2 vj2Var) {
        String str;
        int i6;
        fj2 fj2Var = (fj2) vj2Var;
        w wVar = fj2Var.f9888v;
        this.f4713z.getClass();
        w wVar2 = this.f9888v;
        int i7 = wVar2.B;
        return i7 != -1 && i7 == wVar.B && (str = wVar2.f9978m) != null && TextUtils.equals(str, wVar.f9978m) && (i6 = wVar2.C) != -1 && i6 == wVar.C && this.M == fj2Var.M && this.N == fj2Var.N;
    }

    @Override // java.lang.Comparable
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final int compareTo(fj2 fj2Var) {
        Comparator lp1Var;
        boolean z6 = this.A;
        boolean z7 = this.f4711x;
        if (z7 && z6) {
            lp1Var = yj2.f11011j;
        } else {
            pn1 pn1Var = yj2.f11011j;
            pn1Var.getClass();
            lp1Var = new lp1(pn1Var);
        }
        tn1 tn1VarD = tn1.f9352a.d(z6, fj2Var.A);
        Integer numValueOf = Integer.valueOf(this.C);
        Integer numValueOf2 = Integer.valueOf(fj2Var.C);
        zo1.s.getClass();
        kp1 kp1Var = kp1.s;
        tn1 tn1VarC = tn1VarD.c(numValueOf, numValueOf2, kp1Var).b(this.B, fj2Var.B).b(this.D, fj2Var.D).d(this.H, fj2Var.H).d(this.E, fj2Var.E).c(Integer.valueOf(this.F), Integer.valueOf(fj2Var.F), kp1Var).b(this.G, fj2Var.G).d(z7, fj2Var.f4711x).c(Integer.valueOf(this.L), Integer.valueOf(fj2Var.L), kp1Var);
        this.f4713z.getClass();
        tn1 tn1VarC2 = tn1VarC.d(this.M, fj2Var.M).d(this.N, fj2Var.N).d(this.O, fj2Var.O).c(Integer.valueOf(this.I), Integer.valueOf(fj2Var.I), lp1Var).c(Integer.valueOf(this.J), Integer.valueOf(fj2Var.J), lp1Var);
        if (Objects.equals(this.f4712y, fj2Var.f4712y)) {
            tn1VarC2 = tn1VarC2.c(Integer.valueOf(this.K), Integer.valueOf(fj2Var.K), lp1Var);
        }
        return tn1VarC2.a();
    }
}
