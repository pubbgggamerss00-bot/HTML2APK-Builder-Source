package com.google.android.gms.internal.p002firebaseauthapi;

import android.text.TextUtils;
import com.google.android.gms.common.api.Status;
import qd.x;

/* loaded from: classes2.dex */
final class zzabd implements zzafn<zzajb> {
    private final /* synthetic */ zzaeg zza;
    private final /* synthetic */ zzafn zzb;
    private final /* synthetic */ zzabe zzc;

    public zzabd(zzabe zzabeVar, zzaeg zzaegVar, zzafn zzafnVar) {
        this.zza = zzaegVar;
        this.zzb = zzafnVar;
        this.zzc = zzabeVar;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzafk
    public final void zza(String str) {
        this.zzb.zza(str);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzafn
    public final void zza(zzajb zzajbVar) {
        zzajb zzajbVar2 = zzajbVar;
        if (TextUtils.isEmpty(zzajbVar2.zze())) {
            this.zzc.zza.zza(new zzahn(zzajbVar2.zzd(), zzajbVar2.zzb(), Long.valueOf(zzajbVar2.zza()), "Bearer"), null, "phone", Boolean.valueOf(zzajbVar2.zzf()), null, this.zza, this.zzb);
        } else {
            this.zza.zza(new Status(17025, null, null, null), new x(null, null, zzajbVar2.zzc(), zzajbVar2.zze(), true));
        }
    }
}
