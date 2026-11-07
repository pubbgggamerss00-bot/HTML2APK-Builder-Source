package com.google.android.gms.internal.ads;

import java.util.Objects;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class gk2 {

    /* renamed from: a, reason: collision with root package name */
    public final int f5083a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f5084b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f5085c;

    /* renamed from: d, reason: collision with root package name */
    public final Object f5086d;

    /* renamed from: e, reason: collision with root package name */
    public final Object f5087e;

    public gk2(w1 w1Var, xj1 xj1Var, byte[] bArr, v1[] v1VarArr, int i6) {
        this.f5084b = w1Var;
        this.f5085c = xj1Var;
        this.f5086d = bArr;
        this.f5087e = v1VarArr;
        this.f5083a = i6;
    }

    public boolean a(gk2 gk2Var, int i6) {
        return gk2Var != null && Objects.equals(((rc2[]) this.f5084b)[i6], ((rc2[]) gk2Var.f5084b)[i6]) && Objects.equals(((ak2[]) this.f5085c)[i6], ((ak2[]) gk2Var.f5085c)[i6]);
    }

    public boolean b(int i6) {
        return ((rc2[]) this.f5084b)[i6] != null;
    }

    public gk2(rc2[] rc2VarArr, ak2[] ak2VarArr, w50 w50Var, ck2 ck2Var) {
        int length = rc2VarArr.length;
        y5.n(length == ak2VarArr.length);
        this.f5084b = rc2VarArr;
        this.f5085c = (ak2[]) ak2VarArr.clone();
        this.f5086d = w50Var;
        this.f5087e = ck2Var;
        this.f5083a = length;
    }
}
