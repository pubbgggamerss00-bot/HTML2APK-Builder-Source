package com.google.android.gms.internal.p002firebaseauthapi;

import java.security.GeneralSecurityException;
import java.util.Arrays;

/* loaded from: classes2.dex */
final class zzlp implements zzlq {
    private final zzdk zza;
    private final int zzb;

    public zzlp(zzdk zzdkVar) {
        this.zza = zzdkVar;
        this.zzb = zzdkVar.zzc() + zzdkVar.zzb();
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzlq
    public final int zza() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzlq
    public final byte[] zza(byte[] bArr, byte[] bArr2, int i10) throws GeneralSecurityException {
        if (bArr2.length < i10) {
            throw new GeneralSecurityException("ciphertext too short");
        }
        return zzze.zza(zzdd.zze().zza(this.zza).zza(zzaaf.zza(Arrays.copyOf(bArr, this.zza.zzb()), zzbj.zza())).zzb(zzaaf.zza(Arrays.copyOfRange(bArr, this.zza.zzb(), this.zza.zzc() + this.zza.zzb()), zzbj.zza())).zza()).zza(Arrays.copyOfRange(bArr2, i10, bArr2.length), zzlm.zza);
    }
}
