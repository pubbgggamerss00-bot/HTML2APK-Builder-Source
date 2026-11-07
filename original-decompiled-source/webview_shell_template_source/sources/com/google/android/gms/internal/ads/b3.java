package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class b3 implements z0 {
    public final long s;

    /* renamed from: t, reason: collision with root package name */
    public final z0 f2905t;

    public b3(long j6, z0 z0Var) {
        this.s = j6;
        this.f2905t = z0Var;
    }

    @Override // com.google.android.gms.internal.ads.z0
    public final void d() {
        this.f2905t.d();
    }

    @Override // com.google.android.gms.internal.ads.z0
    public final void f(m1 m1Var) {
        this.f2905t.f(new a3(this, m1Var, m1Var));
    }

    @Override // com.google.android.gms.internal.ads.z0
    public final s1 g(int i6, int i7) {
        return this.f2905t.g(i6, i7);
    }
}
