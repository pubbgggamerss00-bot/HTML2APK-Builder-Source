package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.internal.p002firebaseauthapi.zzww;

/* loaded from: classes2.dex */
public final class zzcy {
    public static final zzww zza = zza(16);
    public static final zzww zzb = zza(32);
    public static final zzww zzc;

    static {
        zza(16, 16);
        zza(32, 16);
        zzvt zzvtVar = zzvt.SHA256;
        zzc = zza(16, 16, 32, 16, zzvtVar);
        zza(32, 16, 32, 32, zzvtVar);
        zzww.zza zzaVarZza = zzww.zza().zza(zzel.zza());
        zzxu zzxuVar = zzxu.TINK;
    }

    private static zzww zza(int i10, int i11, int i12, int i13, zzvt zzvtVar) {
        zztj zztjVar = (zztj) ((zzaky) zztj.zzb().zza((zztm) ((zzaky) zztm.zzb().zza(16).zze())).zza(i10).zze());
        return (zzww) ((zzaky) zzww.zza().zza(((zztd) ((zzaky) zztd.zza().zza(zztjVar).zza((zzvv) ((zzaky) zzvv.zzc().zza((zzvy) ((zzaky) zzvy.zzc().zza(zzvtVar).zza(i13).zze())).zza(32).zze())).zze())).a_()).zza(zzdh.zza()).zza(zzxu.TINK).zze());
    }

    private static zzww zza(int i10, int i11) {
        return (zzww) ((zzaky) zzww.zza().zza(((zzts) ((zzaky) zzts.zzb().zza(i10).zza((zztv) ((zzaky) zztv.zzb().zza(16).zze())).zze())).a_()).zza(zzdp.zza()).zza(zzxu.TINK).zze());
    }

    private static zzww zza(int i10) {
        return (zzww) ((zzaky) zzww.zza().zza(((zzub) ((zzaky) zzub.zzc().zza(i10).zze())).a_()).zza(zzdw.zza()).zza(zzxu.TINK).zze());
    }
}
