package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class hj2 implements Comparable {
    public final boolean s;

    /* renamed from: t, reason: collision with root package name */
    public final boolean f5433t;

    public hj2(w wVar, int i6) {
        this.s = 1 == (wVar.f9971e & 1);
        this.f5433t = rj1.i(i6, false);
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        hj2 hj2Var = (hj2) obj;
        return tn1.f9352a.d(this.f5433t, hj2Var.f5433t).d(this.s, hj2Var.s).a();
    }
}
