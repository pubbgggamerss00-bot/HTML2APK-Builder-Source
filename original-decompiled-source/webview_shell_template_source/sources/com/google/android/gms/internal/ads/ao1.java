package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class ao1 extends bo1 {

    /* renamed from: u, reason: collision with root package name */
    public final transient int f2803u;

    /* renamed from: v, reason: collision with root package name */
    public final transient int f2804v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ bo1 f2805w;

    public ao1(bo1 bo1Var, int i6, int i7) {
        this.f2805w = bo1Var;
        this.f2803u = i6;
        this.f2804v = i7;
    }

    @Override // com.google.android.gms.internal.ads.wn1
    public final int d() {
        return this.f2805w.e() + this.f2803u + this.f2804v;
    }

    @Override // com.google.android.gms.internal.ads.wn1
    public final int e() {
        return this.f2805w.e() + this.f2803u;
    }

    @Override // java.util.List
    public final Object get(int i6) {
        sl1.a(i6, this.f2804v);
        return this.f2805w.get(i6 + this.f2803u);
    }

    @Override // com.google.android.gms.internal.ads.wn1
    public final boolean h() {
        return true;
    }

    @Override // com.google.android.gms.internal.ads.wn1
    public final Object[] i() {
        return this.f2805w.i();
    }

    @Override // com.google.android.gms.internal.ads.bo1, java.util.List
    /* renamed from: j */
    public final bo1 subList(int i6, int i7) {
        sl1.g(i6, i7, this.f2804v);
        int i8 = this.f2803u;
        return this.f2805w.subList(i6 + i8, i7 + i8);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f2804v;
    }
}
