package com.google.android.gms.internal.play_billing;

/* loaded from: classes2.dex */
final class zze {
    static final zze zza;
    static final zze zzb;
    final Throwable zzc;

    static {
        if (zzo.zza) {
            zzb = null;
            zza = null;
        } else {
            zzb = new zze(false, null);
            zza = new zze(true, null);
        }
    }

    public zze(boolean z10, Throwable th2) {
        this.zzc = th2;
    }
}
