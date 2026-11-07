package com.google.android.gms.internal.p002firebaseauthapi;

import rd.n;

/* loaded from: classes2.dex */
final class zzaaz implements zzafn<zzajb> {
    private final /* synthetic */ zzaeg zza;
    private final /* synthetic */ zzaam zzb;

    public zzaaz(zzaam zzaamVar, zzaeg zzaegVar) {
        this.zza = zzaegVar;
        this.zzb = zzaamVar;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzafk
    public final void zza(String str) {
        this.zza.zza(n.a(str));
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzafn
    public final /* synthetic */ void zza(zzajb zzajbVar) {
        zzajb zzajbVar2 = zzajbVar;
        this.zzb.zza(new zzahn(zzajbVar2.zzd(), zzajbVar2.zzb(), Long.valueOf(zzajbVar2.zza()), "Bearer"), null, null, Boolean.valueOf(zzajbVar2.zzf()), null, this.zza, this);
    }
}
