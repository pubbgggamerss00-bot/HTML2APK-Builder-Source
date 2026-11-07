package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class gj2 extends vj2 implements Comparable {

    /* renamed from: w, reason: collision with root package name */
    public final int f5078w;

    /* renamed from: x, reason: collision with root package name */
    public final int f5079x;

    public gj2(int i6, a00 a00Var, int i7, jj2 jj2Var, int i8) {
        int i9;
        super(i6, a00Var, i7);
        this.f5078w = rj1.i(i8, jj2Var.f6092q) ? 1 : 0;
        w wVar = this.f9888v;
        int i10 = wVar.f9984t;
        int i11 = -1;
        if (i10 != -1 && (i9 = wVar.f9985u) != -1) {
            i11 = i10 * i9;
        }
        this.f5079x = i11;
    }

    @Override // com.google.android.gms.internal.ads.vj2
    public final int a() {
        return this.f5078w;
    }

    @Override // com.google.android.gms.internal.ads.vj2
    public final /* bridge */ /* synthetic */ boolean b(vj2 vj2Var) {
        return false;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return Integer.compare(this.f5079x, ((gj2) obj).f5079x);
    }
}
