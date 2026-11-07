package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class r5 implements n5 {

    /* renamed from: a, reason: collision with root package name */
    public final ex0 f8544a;

    /* renamed from: b, reason: collision with root package name */
    public final int f8545b;

    /* renamed from: c, reason: collision with root package name */
    public final int f8546c;

    /* renamed from: d, reason: collision with root package name */
    public int f8547d;

    /* renamed from: e, reason: collision with root package name */
    public int f8548e;

    public r5(j61 j61Var) {
        ex0 ex0Var = j61Var.f5954b;
        this.f8544a = ex0Var;
        ex0Var.j(12);
        this.f8546c = ex0Var.y() & 255;
        this.f8545b = ex0Var.y();
    }

    @Override // com.google.android.gms.internal.ads.n5
    public final int zza() {
        return -1;
    }

    @Override // com.google.android.gms.internal.ads.n5
    public final int zzb() {
        return this.f8545b;
    }

    @Override // com.google.android.gms.internal.ads.n5
    public final int zzc() {
        ex0 ex0Var = this.f8544a;
        int i6 = this.f8546c;
        if (i6 == 8) {
            return ex0Var.v();
        }
        if (i6 == 16) {
            return ex0Var.z();
        }
        int i7 = this.f8547d;
        this.f8547d = i7 + 1;
        if (i7 % 2 != 0) {
            return this.f8548e & 15;
        }
        int iV = ex0Var.v();
        this.f8548e = iV;
        return (iV & 240) >> 4;
    }
}
