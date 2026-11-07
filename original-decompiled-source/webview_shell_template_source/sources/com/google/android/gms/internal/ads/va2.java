package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class va2 implements ub2 {
    public final vc2 s;

    /* renamed from: t, reason: collision with root package name */
    public final ob2 f9766t;

    /* renamed from: u, reason: collision with root package name */
    public pa2 f9767u;

    /* renamed from: v, reason: collision with root package name */
    public ub2 f9768v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f9769w;

    /* renamed from: x, reason: collision with root package name */
    public boolean f9770x;

    public va2(ob2 ob2Var) {
        this.f9766t = ob2Var;
        vc2 vc2Var = new vc2();
        vc2Var.f9811v = ip.f5817d;
        this.s = vc2Var;
        this.f9769w = true;
    }

    @Override // com.google.android.gms.internal.ads.ub2
    public final void a(ip ipVar) {
        ub2 ub2Var = this.f9768v;
        if (ub2Var != null) {
            ub2Var.a(ipVar);
            ipVar = this.f9768v.zzc();
        }
        this.s.a(ipVar);
    }

    @Override // com.google.android.gms.internal.ads.ub2
    public final long zza() {
        if (this.f9769w) {
            return this.s.zza();
        }
        ub2 ub2Var = this.f9768v;
        ub2Var.getClass();
        return ub2Var.zza();
    }

    @Override // com.google.android.gms.internal.ads.ub2
    public final ip zzc() {
        ub2 ub2Var = this.f9768v;
        return ub2Var != null ? ub2Var.zzc() : this.s.f9811v;
    }

    @Override // com.google.android.gms.internal.ads.ub2
    public final boolean zzj() {
        if (this.f9769w) {
            return false;
        }
        ub2 ub2Var = this.f9768v;
        ub2Var.getClass();
        return ub2Var.zzj();
    }
}
