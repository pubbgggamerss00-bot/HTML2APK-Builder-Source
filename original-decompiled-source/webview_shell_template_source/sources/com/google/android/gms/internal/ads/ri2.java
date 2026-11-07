package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class ri2 implements mi2 {

    /* renamed from: a, reason: collision with root package name */
    public final mi2 f8648a;

    /* renamed from: b, reason: collision with root package name */
    public final long f8649b;

    public ri2(mi2 mi2Var, long j6) {
        this.f8648a = mi2Var;
        this.f8649b = j6;
    }

    @Override // com.google.android.gms.internal.ads.mi2
    public final int a(long j6) {
        return this.f8648a.a(j6 - this.f8649b);
    }

    @Override // com.google.android.gms.internal.ads.mi2
    public final int b(ro0 ro0Var, ja2 ja2Var, int i6) {
        int iB = this.f8648a.b(ro0Var, ja2Var, i6);
        if (iB != -4) {
            return iB;
        }
        ja2Var.f6005f += this.f8649b;
        return -4;
    }

    @Override // com.google.android.gms.internal.ads.mi2
    public final void zzd() {
        this.f8648a.zzd();
    }

    @Override // com.google.android.gms.internal.ads.mi2
    public final boolean zze() {
        return this.f8648a.zze();
    }
}
