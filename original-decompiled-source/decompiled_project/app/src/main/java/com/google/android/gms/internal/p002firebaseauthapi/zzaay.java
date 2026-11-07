package com.google.android.gms.internal.p002firebaseauthapi;

import rd.n;

/* loaded from: classes2.dex */
final class zzaay implements zzafn<zzaix> {
    private final /* synthetic */ zzaeg zza;
    private final /* synthetic */ zzaam zzb;

    public zzaay(zzaam zzaamVar, zzaeg zzaegVar) {
        this.zza = zzaegVar;
        this.zzb = zzaamVar;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzafk
    public final void zza(String str) {
        this.zza.zza(n.a(str));
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzafn
    public final /* synthetic */ void zza(zzaix zzaixVar) {
        zzaix zzaixVar2 = zzaixVar;
        this.zzb.zza(new zzahn(zzaixVar2.zzc(), zzaixVar2.zzb(), Long.valueOf(zzaixVar2.zza()), "Bearer"), null, null, Boolean.valueOf(zzaixVar2.zzd()), null, this.zza, this);
    }
}
