package com.google.android.gms.internal.p002firebaseauthapi;

import java.security.GeneralSecurityException;

/* loaded from: classes2.dex */
public final class zzmc implements zzbk {
    private zzmc(zzaae zzaaeVar, zzme zzmeVar, zzmf zzmfVar, zzmb zzmbVar, zzaae zzaaeVar2) {
        zzaaeVar.zzb();
        zzaaeVar2.zzb();
    }

    public static zzbk zza(zzkt zzktVar) throws GeneralSecurityException {
        zzki zzkiVar = (zzki) ((zzlj) zzktVar.zza());
        return new zzmc(zzktVar.zze(), zzmg.zza(zzkiVar.zze()), zzmg.zza(zzkiVar.zzd()), zzmg.zza(zzkiVar.zzb()), zzktVar.zzd());
    }
}
