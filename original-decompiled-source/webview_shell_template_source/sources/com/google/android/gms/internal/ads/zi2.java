package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public class zi2 implements ak2 {

    /* renamed from: a, reason: collision with root package name */
    public final a00 f11304a;

    /* renamed from: b, reason: collision with root package name */
    public final int f11305b;

    /* renamed from: c, reason: collision with root package name */
    public final int[] f11306c;

    /* renamed from: d, reason: collision with root package name */
    public final w[] f11307d;

    /* renamed from: e, reason: collision with root package name */
    public int f11308e;

    public zi2(a00 a00Var, int[] iArr) {
        int length = iArr.length;
        y5.r(length > 0);
        a00Var.getClass();
        w[] wVarArr = a00Var.f2534d;
        this.f11304a = a00Var;
        this.f11305b = length;
        this.f11307d = new w[length];
        for (int i6 = 0; i6 < iArr.length; i6++) {
            this.f11307d[i6] = wVarArr[iArr[i6]];
        }
        Arrays.sort(this.f11307d, new h8(2));
        this.f11306c = new int[this.f11305b];
        for (int i7 = 0; i7 < this.f11305b; i7++) {
            int[] iArr2 = this.f11306c;
            w wVar = this.f11307d[i7];
            int i8 = 0;
            while (true) {
                if (i8 >= wVarArr.length) {
                    i8 = -1;
                    break;
                } else if (wVar == wVarArr[i8]) {
                    break;
                } else {
                    i8++;
                }
            }
            iArr2[i7] = i8;
        }
    }

    @Override // com.google.android.gms.internal.ads.ek2
    public final int a(int i6) {
        return this.f11306c[i6];
    }

    @Override // com.google.android.gms.internal.ads.ek2
    public final int b(int i6) {
        for (int i7 = 0; i7 < this.f11305b; i7++) {
            if (this.f11306c[i7] == i6) {
                return i7;
            }
        }
        return -1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            zi2 zi2Var = (zi2) obj;
            if (this.f11304a.equals(zi2Var.f11304a) && Arrays.equals(this.f11306c, zi2Var.f11306c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i6 = this.f11308e;
        if (i6 != 0) {
            return i6;
        }
        int iHashCode = Arrays.hashCode(this.f11306c) + (System.identityHashCode(this.f11304a) * 31);
        this.f11308e = iHashCode;
        return iHashCode;
    }

    @Override // com.google.android.gms.internal.ads.ak2
    public final int zzb() {
        return this.f11306c[0];
    }

    @Override // com.google.android.gms.internal.ads.ek2
    public final int zzd() {
        return this.f11306c.length;
    }

    @Override // com.google.android.gms.internal.ads.ek2
    public final w zze(int i6) {
        return this.f11307d[i6];
    }

    @Override // com.google.android.gms.internal.ads.ak2
    public final w zzf() {
        return this.f11307d[0];
    }

    @Override // com.google.android.gms.internal.ads.ek2
    public final a00 zzg() {
        return this.f11304a;
    }
}
