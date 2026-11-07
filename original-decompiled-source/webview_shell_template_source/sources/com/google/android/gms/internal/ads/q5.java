package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class q5 implements n5 {

    /* renamed from: a, reason: collision with root package name */
    public final int f8228a;

    /* renamed from: b, reason: collision with root package name */
    public final int f8229b;

    /* renamed from: c, reason: collision with root package name */
    public final ex0 f8230c;

    public q5(j61 j61Var, w wVar) {
        ex0 ex0Var = j61Var.f5954b;
        this.f8230c = ex0Var;
        ex0Var.j(12);
        int iY = ex0Var.y();
        if ("audio/raw".equals(wVar.f9978m)) {
            int iN = j31.n(wVar.D) * wVar.B;
            if (iY == 0 || iY % iN != 0) {
                qs0.f("BoxParsers", "Audio sample size mismatch. stsd sample size: " + iN + ", stsz sample size: " + iY);
                iY = iN;
            }
        }
        this.f8228a = iY == 0 ? -1 : iY;
        this.f8229b = ex0Var.y();
    }

    @Override // com.google.android.gms.internal.ads.n5
    public final int zza() {
        return this.f8228a;
    }

    @Override // com.google.android.gms.internal.ads.n5
    public final int zzb() {
        return this.f8229b;
    }

    @Override // com.google.android.gms.internal.ads.n5
    public final int zzc() {
        int i6 = this.f8228a;
        return i6 == -1 ? this.f8230c.y() : i6;
    }
}
