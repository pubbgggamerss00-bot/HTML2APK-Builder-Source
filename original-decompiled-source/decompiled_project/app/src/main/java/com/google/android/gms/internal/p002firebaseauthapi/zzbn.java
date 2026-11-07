package com.google.android.gms.internal.p002firebaseauthapi;

import java.security.GeneralSecurityException;

/* loaded from: classes2.dex */
public final class zzbn {
    private final zzce zza;

    private zzbn(zzce zzceVar) {
        this.zza = zzceVar;
    }

    public static zzbn zza(zzce zzceVar) throws GeneralSecurityException {
        return new zzbn(zzceVar);
    }

    private final zzww zzb() {
        try {
            zzce zzceVar = this.zza;
            return zzceVar instanceof zzoh ? ((zzoh) zzceVar).zzb().zza() : ((zzqd) zzpc.zza().zza((zzpc) this.zza, zzqd.class)).zza();
        } catch (GeneralSecurityException e10) {
            throw new zzqo("Parsing parameters failed in getProto(). You probably want to call some Tink register function for ".concat(String.valueOf(this.zza)), e10);
        }
    }

    public final zzce zza() throws GeneralSecurityException {
        zzce zzceVar = this.zza;
        return zzceVar != null ? zzceVar : zzcm.zza(zzb().zzk());
    }
}
