package com.google.android.gms.internal.play_billing;

/* loaded from: classes2.dex */
public final class zzu {
    public static zzcz zza(zzr zzrVar) {
        zzp zzpVar = new zzp();
        zzt zztVar = new zzt(zzpVar);
        zzpVar.zzb = zztVar;
        zzpVar.zza = zzrVar.getClass();
        try {
            zzpVar.zza = zzrVar.zza(zzpVar);
            return zztVar;
        } catch (Exception e10) {
            zztVar.zzc(e10);
            return zztVar;
        }
    }
}
