package com.google.android.gms.internal.p002firebaseauthapi;

import qd.h0;
import rd.n;

/* loaded from: classes2.dex */
final class zzacb implements zzafn<zzahn> {
    private final /* synthetic */ h0 zza;
    private final /* synthetic */ zzaeg zzb;
    private final /* synthetic */ zzaam zzc;

    public zzacb(zzaam zzaamVar, h0 h0Var, zzaeg zzaegVar) {
        this.zza = h0Var;
        this.zzb = zzaegVar;
        this.zzc = zzaamVar;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzafk
    public final void zza(String str) {
        this.zzb.zza(n.a(str));
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzafn
    public final void zza(zzahn zzahnVar) {
        zzahn zzahnVar2 = zzahnVar;
        zzaid zzaidVar = new zzaid();
        zzaidVar.zzd(zzahnVar2.zzc());
        h0 h0Var = this.zza;
        if (h0Var.f22680c || h0Var.f22678a != null) {
            zzaidVar.zzb(h0Var.f22678a);
        }
        h0 h0Var2 = this.zza;
        if (h0Var2.f22681d || h0Var2.f22682e != null) {
            zzaidVar.zzg(h0Var2.f22679b);
        }
        zzaam.zza(this.zzc, this.zzb, zzahnVar2, zzaidVar, this);
    }
}
