package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.internal.p002firebaseauthapi.zzix;
import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.util.Arrays;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;
import m.b;

/* loaded from: classes2.dex */
public final class zzzt implements zzso {
    private static final zzix.zza zza = zzix.zza.zza;
    private static final ThreadLocal<Cipher> zzb = new zzzw();
    private final SecretKey zzc;
    private byte[] zzd;
    private byte[] zze;

    public zzzt(byte[] bArr) throws GeneralSecurityException {
        zzzz.zza(bArr.length);
        SecretKeySpec secretKeySpec = new SecretKeySpec(bArr, "AES");
        this.zzc = secretKeySpec;
        Cipher cipherZza = zza();
        cipherZza.init(1, secretKeySpec);
        byte[] bArrZzb = zzse.zzb(cipherZza.doFinal(new byte[16]));
        this.zzd = bArrZzb;
        this.zze = zzse.zzb(bArrZzb);
    }

    private static Cipher zza() throws GeneralSecurityException {
        if (zza.zza()) {
            return zzb.get();
        }
        throw new GeneralSecurityException("Can not use AES-CMAC in FIPS-mode.");
    }

    private static void zza(byte[] bArr, byte[] bArr2, int i10, byte[] bArr3) {
        for (int i11 = 0; i11 < 16; i11++) {
            bArr3[i11] = (byte) (bArr[i11] ^ bArr2[i11 + i10]);
        }
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzso
    public final byte[] zza(byte[] bArr, int i10) throws GeneralSecurityException {
        byte[] bArrZza;
        if (i10 <= 16) {
            Cipher cipherZza = zza();
            cipherZza.init(1, this.zzc);
            int length = bArr.length;
            int iA = length == 0 ? 1 : b.a(length, 1, 16, 1);
            if ((iA << 4) == bArr.length) {
                bArrZza = zzyt.zza(bArr, (iA - 1) << 4, this.zzd, 0, 16);
            } else {
                bArrZza = zzyt.zza(zzse.zza(Arrays.copyOfRange(bArr, (iA - 1) << 4, bArr.length)), this.zze);
            }
            byte[] bArr2 = new byte[16];
            byte[] bArr3 = new byte[16];
            for (int i11 = 0; i11 < iA - 1; i11++) {
                zza(bArr2, bArr, i11 << 4, bArr3);
                if (cipherZza.doFinal(bArr3, 0, 16, bArr2) != 16) {
                    throw new IllegalStateException("Cipher didn't write full block");
                }
            }
            zza(bArr2, bArrZza, 0, bArr3);
            if (cipherZza.doFinal(bArr3, 0, 16, bArr2) == 16) {
                return 16 == i10 ? bArr2 : Arrays.copyOf(bArr2, i10);
            }
            throw new IllegalStateException("Cipher didn't write full block");
        }
        throw new InvalidAlgorithmParameterException("outputLength too large, max is 16 bytes");
    }
}
