package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class xf0 implements pk0 {
    public final tb1 s;

    /* renamed from: t, reason: collision with root package name */
    public final e70 f10555t;

    public xf0(tb1 tb1Var, e70 e70Var) {
        this.s = tb1Var;
        this.f10555t = e70Var;
    }

    @Override // com.google.android.gms.internal.ads.pk0
    public final void zza() {
        if (this.s.f9204r0) {
            e70 e70Var = this.f10555t;
            synchronized (e70Var.f4140a) {
                c70 c70Var = e70Var.f4143d;
                synchronized (c70Var.f3451f) {
                    c70Var.f3455k++;
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.pk0
    public final void zzb() {
    }

    @Override // com.google.android.gms.internal.ads.pk0
    public final void zzc() {
    }

    @Override // com.google.android.gms.internal.ads.pk0
    public final void zze() {
    }

    @Override // com.google.android.gms.internal.ads.pk0
    public final void zzf() {
    }

    @Override // com.google.android.gms.internal.ads.pk0
    public final void v(y30 y30Var, String str, String str2) {
    }
}
