package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class uh2 implements ak2 {

    /* renamed from: a, reason: collision with root package name */
    public final ak2 f9564a;

    /* renamed from: b, reason: collision with root package name */
    public final a00 f9565b;

    public uh2(ak2 ak2Var, a00 a00Var) {
        this.f9564a = ak2Var;
        this.f9565b = a00Var;
    }

    @Override // com.google.android.gms.internal.ads.ek2
    public final int a(int i6) {
        return this.f9564a.a(i6);
    }

    @Override // com.google.android.gms.internal.ads.ek2
    public final int b(int i6) {
        return this.f9564a.b(i6);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof uh2)) {
            return false;
        }
        uh2 uh2Var = (uh2) obj;
        return this.f9564a.equals(uh2Var.f9564a) && this.f9565b.equals(uh2Var.f9565b);
    }

    public final int hashCode() {
        return this.f9564a.hashCode() + ((this.f9565b.hashCode() + 527) * 31);
    }

    @Override // com.google.android.gms.internal.ads.ak2
    public final int zzb() {
        return this.f9564a.zzb();
    }

    @Override // com.google.android.gms.internal.ads.ek2
    public final int zzd() {
        return this.f9564a.zzd();
    }

    @Override // com.google.android.gms.internal.ads.ek2
    public final w zze(int i6) {
        return this.f9565b.f2534d[this.f9564a.a(i6)];
    }

    @Override // com.google.android.gms.internal.ads.ak2
    public final w zzf() {
        return this.f9565b.f2534d[this.f9564a.zzb()];
    }

    @Override // com.google.android.gms.internal.ads.ek2
    public final a00 zzg() {
        return this.f9565b;
    }
}
