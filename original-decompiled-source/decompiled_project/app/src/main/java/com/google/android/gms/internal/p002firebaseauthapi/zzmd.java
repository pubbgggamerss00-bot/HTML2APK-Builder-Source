package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.internal.p002firebaseauthapi.zzki;
import java.security.GeneralSecurityException;
import java.util.Arrays;

/* loaded from: classes2.dex */
public final class zzmd implements zzbh {
    private static final byte[] zza = new byte[0];
    private final zzmh zzb;
    private final zzme zzc;
    private final zzmf zzd;
    private final zzmb zze;
    private final int zzf;
    private final byte[] zzg;

    private zzmd(zzmh zzmhVar, zzme zzmeVar, zzmf zzmfVar, zzmb zzmbVar, int i10, zzaae zzaaeVar) {
        this.zzb = zzmhVar;
        this.zzc = zzmeVar;
        this.zzd = zzmfVar;
        this.zze = zzmbVar;
        this.zzf = i10;
        this.zzg = zzaaeVar.zzb();
    }

    public static zzbh zza(zzkl zzklVar) throws GeneralSecurityException {
        int i10;
        zzki zzkiVar = (zzki) ((zzlj) zzklVar.zza());
        zzme zzmeVarZza = zzmg.zza(zzkiVar.zze());
        zzmf zzmfVarZza = zzmg.zza(zzkiVar.zzd());
        zzmb zzmbVarZza = zzmg.zza(zzkiVar.zzb());
        zzki.zzd zzdVarZze = zzkiVar.zze();
        zzki.zzd zzdVar = zzki.zzd.zzd;
        if (zzdVarZze.equals(zzdVar)) {
            i10 = 32;
        } else if (zzdVarZze.equals(zzki.zzd.zza)) {
            i10 = 65;
        } else if (zzdVarZze.equals(zzki.zzd.zzb)) {
            i10 = 97;
        } else {
            if (!zzdVarZze.equals(zzki.zzd.zzc)) {
                throw new GeneralSecurityException("Unrecognized HPKE KEM identifier");
            }
            i10 = 133;
        }
        int i11 = i10;
        zzki.zzd zzdVarZze2 = ((zzki) ((zzlj) zzklVar.zza())).zze();
        if (zzdVarZze2.equals(zzdVar) || zzdVarZze2.equals(zzki.zzd.zza) || zzdVarZze2.equals(zzki.zzd.zzb) || zzdVarZze2.equals(zzki.zzd.zzc)) {
            return new zzmd(new zzmh(zzaae.zza(zzklVar.zzf().zza(zzbj.zza())), ((zzkt) ((zzll) zzklVar.zzc())).zze()), zzmeVarZza, zzmfVarZza, zzmbVarZza, i11, zzklVar.zzh());
        }
        throw new GeneralSecurityException("Unrecognized HPKE KEM identifier");
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzbh
    public final byte[] zza(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        byte[] bArr3 = this.zzg;
        int length = bArr3.length + this.zzf;
        if (bArr.length >= length) {
            if (zzqq.zza(bArr3, bArr)) {
                if (bArr2 == null) {
                    bArr2 = new byte[0];
                }
                return zzma.zza(Arrays.copyOfRange(bArr, this.zzg.length, length), this.zzb, this.zzc, this.zzd, this.zze, bArr2).zza(bArr, length, zza);
            }
            throw new GeneralSecurityException("Invalid ciphertext (output prefix mismatch)");
        }
        throw new GeneralSecurityException("Ciphertext is too short.");
    }
}
