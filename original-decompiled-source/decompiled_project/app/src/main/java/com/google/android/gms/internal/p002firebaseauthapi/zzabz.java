package com.google.android.gms.internal.p002firebaseauthapi;

import rd.n;

/* loaded from: classes2.dex */
final class zzabz implements zzafn<zzaih> {
    private final /* synthetic */ zzaeg zza;
    private final /* synthetic */ zzaam zzb;

    public zzabz(zzaam zzaamVar, zzaeg zzaegVar) {
        this.zza = zzaegVar;
        this.zzb = zzaamVar;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzafk
    public final void zza(String str) {
        this.zza.zza(n.a(str));
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzafn
    public final /* synthetic */ void zza(zzaih zzaihVar) {
        zzaih zzaihVar2 = zzaihVar;
        this.zzb.zza(new zzahn(zzaihVar2.zzc(), zzaihVar2.zzb(), Long.valueOf(zzaihVar2.zza()), "Bearer"), null, null, Boolean.TRUE, null, this.zza, this);
    }
}
