package com.google.android.gms.internal.p002firebaseauthapi;

import qd.d;
import rd.n;

/* loaded from: classes2.dex */
final class zzaaq implements zzafn<zzahn> {
    private final /* synthetic */ d zza;
    private final /* synthetic */ String zzb;
    private final /* synthetic */ zzaeg zzc;
    private final /* synthetic */ zzaam zzd;

    public zzaaq(zzaam zzaamVar, d dVar, String str, zzaeg zzaegVar) {
        this.zza = dVar;
        this.zzb = str;
        this.zzc = zzaegVar;
        this.zzd = zzaamVar;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzafk
    public final void zza(String str) {
        this.zzc.zza(n.a(str));
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzafn
    public final /* synthetic */ void zza(zzahn zzahnVar) {
        this.zzd.zza(new zzagp(this.zza, zzahnVar.zzc(), this.zzb), this.zzc);
    }
}
