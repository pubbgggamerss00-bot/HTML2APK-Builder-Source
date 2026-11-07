package com.google.android.gms.internal.p002firebaseauthapi;

import j2.y;
import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;

/* loaded from: classes2.dex */
final class zzlk implements zzmb {
    private final int zza;

    public zzlk(int i10) throws InvalidAlgorithmParameterException {
        if (i10 != 16 && i10 != 32) {
            throw new InvalidAlgorithmParameterException(y.a(i10, "Unsupported key length: "));
        }
        this.zza = i10;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzmb
    public final int zza() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzmb
    public final int zzb() {
        return 12;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzmb
    public final byte[] zzc() throws GeneralSecurityException {
        int i10 = this.zza;
        if (i10 == 16) {
            return zzmn.zzi;
        }
        if (i10 == 32) {
            return zzmn.zzj;
        }
        throw new GeneralSecurityException("Could not determine HPKE AEAD ID");
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzmb
    public final byte[] zza(byte[] bArr, byte[] bArr2, byte[] bArr3, int i10, byte[] bArr4) throws GeneralSecurityException {
        if (bArr.length == this.zza) {
            return new zzhr(bArr).zza(bArr2, bArr3, i10, bArr4);
        }
        throw new InvalidAlgorithmParameterException(y.a(bArr.length, "Unexpected key length: "));
    }
}
