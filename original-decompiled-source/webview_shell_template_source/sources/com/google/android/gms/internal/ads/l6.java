package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class l6 implements q6 {
    public final d1 s;

    /* renamed from: t, reason: collision with root package name */
    public final ni0 f6583t;

    /* renamed from: u, reason: collision with root package name */
    public long f6584u = -1;

    /* renamed from: v, reason: collision with root package name */
    public long f6585v = -1;

    public l6(d1 d1Var, ni0 ni0Var) {
        this.s = d1Var;
        this.f6583t = ni0Var;
    }

    @Override // com.google.android.gms.internal.ads.q6
    public final long a(y0 y0Var) {
        long j6 = this.f6585v;
        if (j6 < 0) {
            return -1L;
        }
        this.f6585v = -1L;
        return -(j6 + 2);
    }

    @Override // com.google.android.gms.internal.ads.q6
    public final void b(long j6) {
        long[] jArr = (long[]) this.f6583t.f7447t;
        this.f6585v = jArr[j31.j(jArr, j6, true)];
    }

    @Override // com.google.android.gms.internal.ads.q6
    public final m1 zze() {
        y5.r(this.f6584u != -1);
        return new c1(this.s, this.f6584u);
    }
}
