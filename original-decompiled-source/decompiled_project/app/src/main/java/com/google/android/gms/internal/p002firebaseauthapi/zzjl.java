package com.google.android.gms.internal.p002firebaseauthapi;

import b6.a;
import java.security.GeneralSecurityException;

/* loaded from: classes2.dex */
public final class zzjl implements zzqc<zzbi, zzbi> {
    private static final zzjl zza = new zzjl();
    private static final zzpr<zzoe, zzbi> zzb = zzpr.zza(new zzpt() { // from class: com.google.android.gms.internal.firebase-auth-api.zzjo
        @Override // com.google.android.gms.internal.p002firebaseauthapi.zzpt
        public final Object zza(zzbm zzbmVar) {
            return zzjy.zza((zzoe) zzbmVar);
        }
    }, zzoe.class, zzbi.class);

    public static void zzc() throws GeneralSecurityException {
        zzoz.zza().zza(zza);
        zzoz.zza().zza(zzb);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzqc
    public final Class<zzbi> zza() {
        return zzbi.class;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzqc
    public final Class<zzbi> zzb() {
        return zzbi.class;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzqc
    public final /* synthetic */ zzbi zza(zzoa zzoaVar, zzoj zzojVar, zzqb<zzbi> zzqbVar) throws GeneralSecurityException {
        zzon zzonVarZza;
        zzon zzonVarZza2;
        zzaae zzaaeVarZzc;
        zzpq zzpqVar = new zzpq();
        for (int i10 = 0; i10 < zzoaVar.zza(); i10++) {
            zzod zzodVarZza = zzoaVar.zza(i10);
            if (zzodVarZza.zzc().equals(zzbo.zza)) {
                zzbi zzbiVarZza = zzqbVar.zza(zzodVarZza);
                zzbm zzbmVarZzb = zzodVarZza.zzb();
                if (zzbmVarZzb instanceof zzjj) {
                    zzaaeVarZzc = ((zzjj) zzbmVarZzb).zze();
                } else {
                    if (!(zzbmVarZzb instanceof zzoe)) {
                        throw new GeneralSecurityException(a.b("Cannot get output prefix for key of class ", zzbmVarZzb.getClass().getName(), " with parameters ", String.valueOf(zzbmVarZzb.zza())));
                    }
                    zzaaeVarZzc = ((zzoe) zzbmVarZzb).zzc();
                }
                zzpqVar.zza(zzaaeVarZzc, new zzjn(zzbiVarZza, zzodVarZza.zza()));
            }
        }
        if (zzojVar.zza()) {
            zzonVarZza = zzoq.zza;
            zzonVarZza2 = zzonVarZza;
        } else {
            zzoo zzooVarZza = zzov.zzb().zza();
            zzonVarZza = zzooVarZza.zza(zzoaVar, zzojVar, "daead", "encrypt");
            zzonVarZza2 = zzooVarZza.zza(zzoaVar, zzojVar, "daead", "decrypt");
        }
        return new zzjq(new zzjn(zzqbVar.zza(zzoaVar.zzc()), zzoaVar.zzc().zza()), zzpqVar.zza(), zzonVarZza, zzonVarZza2);
    }
}
