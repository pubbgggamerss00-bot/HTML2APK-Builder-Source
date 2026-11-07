package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.internal.p002firebaseauthapi.zzdk;
import com.google.android.gms.internal.p002firebaseauthapi.zzvy;
import com.google.android.gms.internal.p002firebaseauthapi.zzws;
import j2.y;
import java.security.GeneralSecurityException;
import m3.a;

/* loaded from: classes2.dex */
public final class zzgi {
    private static final zzaae zza;
    private static final zzpk<zzdk, zzqd> zzb;
    private static final zzpg<zzqd> zzc;
    private static final zznw<zzdd, zzqe> zzd;
    private static final zzns<zzqe> zze;

    static {
        zzaae zzaaeVarZzb = zzqq.zzb("type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey");
        zza = zzaaeVarZzb;
        zzb = zzpk.zza(new zzpm() { // from class: com.google.android.gms.internal.firebase-auth-api.zzgh
            @Override // com.google.android.gms.internal.p002firebaseauthapi.zzpm
            public final zzqi zza(zzce zzceVar) {
                zzdk zzdkVar = (zzdk) zzceVar;
                return zzqd.zzb((zzww) ((zzaky) zzww.zza().zza("type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey").zza(((zztd) ((zzaky) zztd.zza().zza((zztj) ((zzaky) zztj.zzb().zza((zztm) ((zzaky) zztm.zzb().zza(zzdkVar.zzd()).zze())).zza(zzdkVar.zzb()).zze())).zza((zzvv) ((zzaky) zzvv.zzc().zza(zzgi.zzb(zzdkVar)).zza(zzdkVar.zzc()).zze())).zze())).a_()).zza(zzgi.zza(zzdkVar.zzh())).zze()));
            }
        }, zzdk.class, zzqd.class);
        zzc = zzpg.zza(new zzpi() { // from class: com.google.android.gms.internal.firebase-auth-api.zzgk
            @Override // com.google.android.gms.internal.p002firebaseauthapi.zzpi
            public final zzce zza(zzqi zzqiVar) {
                return zzgi.zzb((zzqd) zzqiVar);
            }
        }, zzaaeVarZzb, zzqd.class);
        zzd = zznw.zza(new zzny() { // from class: com.google.android.gms.internal.firebase-auth-api.zzgj
            @Override // com.google.android.gms.internal.p002firebaseauthapi.zzny
            public final zzqi zza(zzbm zzbmVar, zzck zzckVar) {
                zzdd zzddVar = (zzdd) zzbmVar;
                return zzqe.zza("type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey", ((zzta) ((zzaky) zzta.zzb().zza((zztg) ((zzaky) zztg.zzb().zza((zztm) ((zzaky) zztm.zzb().zza(((zzdk) ((zzcx) zzddVar.zza())).zzd()).zze())).zza(zzajp.zza(zzddVar.zzf().zza(zzck.zza(zzckVar)))).zze())).zza((zzvs) ((zzaky) zzvs.zzb().zza(zzgi.zzb((zzdk) ((zzcx) zzddVar.zza()))).zza(zzajp.zza(zzddVar.zzg().zza(zzck.zza(zzckVar)))).zze())).zze())).a_(), zzws.zza.SYMMETRIC, zzgi.zza(((zzdk) ((zzcx) zzddVar.zza())).zzh()), zzddVar.zzb());
            }
        }, zzdd.class, zzqe.class);
        zze = zzns.zza(new zznu() { // from class: com.google.android.gms.internal.firebase-auth-api.zzgm
            @Override // com.google.android.gms.internal.p002firebaseauthapi.zznu
            public final zzbm zza(zzqi zzqiVar, zzck zzckVar) {
                return zzgi.zzb((zzqe) zzqiVar, zzckVar);
            }
        }, zzaaeVarZzb, zzqe.class);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static zzdd zzb(zzqe zzqeVar, zzck zzckVar) throws GeneralSecurityException {
        if (!zzqeVar.zzf().equals("type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey")) {
            throw new IllegalArgumentException("Wrong type URL in call to AesCtrHmacAeadProtoSerialization.parseKey");
        }
        try {
            zzta zztaVarZza = zzta.zza(zzqeVar.zzd(), zzakk.zza());
            if (zztaVarZza.zza() != 0) {
                throw new GeneralSecurityException("Only version 0 keys are accepted");
            }
            if (zztaVarZza.zzd().zza() != 0) {
                throw new GeneralSecurityException("Only version 0 keys inner AES CTR keys are accepted");
            }
            if (zztaVarZza.zze().zza() != 0) {
                throw new GeneralSecurityException("Only version 0 keys inner HMAC keys are accepted");
            }
            return zzdd.zze().zza(zzdk.zzf().zza(zztaVarZza.zzd().zzf().zzb()).zzb(zztaVarZza.zze().zzf().zzb()).zzc(zztaVarZza.zzd().zze().zza()).zzd(zztaVarZza.zze().zze().zza()).zza(zza(zztaVarZza.zze().zze().zzb())).zza(zza(zzqeVar.zzc())).zza()).zza(zzaaf.zza(zztaVarZza.zzd().zzf().zzd(), zzck.zza(zzckVar))).zzb(zzaaf.zza(zztaVarZza.zze().zzf().zzd(), zzck.zza(zzckVar))).zza(zzqeVar.zze()).zza();
        } catch (zzalf unused) {
            throw new GeneralSecurityException("Parsing AesCtrHmacAeadKey failed");
        }
    }

    private static zzdk.zzc zza(zzvt zzvtVar) throws GeneralSecurityException {
        int i10 = zzgl.zzb[zzvtVar.ordinal()];
        if (i10 == 1) {
            return zzdk.zzc.zza;
        }
        if (i10 == 2) {
            return zzdk.zzc.zzb;
        }
        if (i10 == 3) {
            return zzdk.zzc.zzc;
        }
        if (i10 == 4) {
            return zzdk.zzc.zzd;
        }
        if (i10 == 5) {
            return zzdk.zzc.zze;
        }
        throw new GeneralSecurityException(y.a(zzvtVar.zza(), "Unable to parse HashType: "));
    }

    private static zzdk.zzb zza(zzxu zzxuVar) throws GeneralSecurityException {
        int i10 = zzgl.zza[zzxuVar.ordinal()];
        if (i10 == 1) {
            return zzdk.zzb.zza;
        }
        if (i10 == 2 || i10 == 3) {
            return zzdk.zzb.zzb;
        }
        if (i10 == 4) {
            return zzdk.zzb.zzc;
        }
        throw new GeneralSecurityException(y.a(zzxuVar.zza(), "Unable to parse OutputPrefixType: "));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static zzdk zzb(zzqd zzqdVar) throws GeneralSecurityException {
        if (zzqdVar.zza().zzf().equals("type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey")) {
            try {
                zztd zztdVarZza = zztd.zza(zzqdVar.zza().zze(), zzakk.zza());
                if (zztdVarZza.zzd().zzb() == 0) {
                    return zzdk.zzf().zza(zztdVarZza.zzc().zza()).zzb(zztdVarZza.zzd().zza()).zzc(zztdVarZza.zzc().zze().zza()).zzd(zztdVarZza.zzd().zzf().zza()).zza(zza(zztdVarZza.zzd().zzf().zzb())).zza(zza(zzqdVar.zza().zzd())).zza();
                }
                throw new GeneralSecurityException("Only version 0 keys are accepted");
            } catch (zzalf e10) {
                throw new GeneralSecurityException("Parsing AesCtrHmacAeadParameters failed: ", e10);
            }
        }
        throw new IllegalArgumentException(a.a("Wrong type URL in call to AesCtrHmacAeadProtoSerialization.parseParameters: ", zzqdVar.zza().zzf()));
    }

    private static zzvy zzb(zzdk zzdkVar) throws GeneralSecurityException {
        zzvt zzvtVar;
        zzvy.zza zzaVarZza = zzvy.zzc().zza(zzdkVar.zze());
        zzdk.zzc zzcVarZzg = zzdkVar.zzg();
        if (zzdk.zzc.zza.equals(zzcVarZzg)) {
            zzvtVar = zzvt.SHA1;
        } else if (zzdk.zzc.zzb.equals(zzcVarZzg)) {
            zzvtVar = zzvt.SHA224;
        } else if (zzdk.zzc.zzc.equals(zzcVarZzg)) {
            zzvtVar = zzvt.SHA256;
        } else if (zzdk.zzc.zzd.equals(zzcVarZzg)) {
            zzvtVar = zzvt.SHA384;
        } else if (zzdk.zzc.zze.equals(zzcVarZzg)) {
            zzvtVar = zzvt.SHA512;
        } else {
            throw new GeneralSecurityException("Unable to serialize HashType ".concat(String.valueOf(zzcVarZzg)));
        }
        return (zzvy) ((zzaky) zzaVarZza.zza(zzvtVar).zze());
    }

    private static zzxu zza(zzdk.zzb zzbVar) throws GeneralSecurityException {
        if (zzdk.zzb.zza.equals(zzbVar)) {
            return zzxu.TINK;
        }
        if (zzdk.zzb.zzb.equals(zzbVar)) {
            return zzxu.CRUNCHY;
        }
        if (zzdk.zzb.zzc.equals(zzbVar)) {
            return zzxu.RAW;
        }
        throw new GeneralSecurityException("Unable to serialize variant: ".concat(String.valueOf(zzbVar)));
    }

    public static void zza() throws GeneralSecurityException {
        zzpc zzpcVarZza = zzpc.zza();
        zzpcVarZza.zza(zzb);
        zzpcVarZza.zza(zzc);
        zzpcVarZza.zza(zzd);
        zzpcVarZza.zza(zze);
    }
}
