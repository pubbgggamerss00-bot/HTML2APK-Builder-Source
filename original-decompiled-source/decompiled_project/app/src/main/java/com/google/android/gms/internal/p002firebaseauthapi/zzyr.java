package com.google.android.gms.internal.p002firebaseauthapi;

import ad.b;
import com.google.android.gms.internal.p002firebaseauthapi.zzix;
import java.security.GeneralSecurityException;
import java.security.InvalidKeyException;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Collection;
import javax.crypto.AEADBadTagException;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* loaded from: classes2.dex */
public final class zzyr implements zzbi {
    private static final zzix.zza zza = zzix.zza.zza;
    private static final Collection<Integer> zzb = Arrays.asList(64);
    private static final byte[] zzc = new byte[16];
    private static final ThreadLocal<Cipher> zzd = new zzyu();
    private final zzzt zze;
    private final byte[] zzf;
    private final byte[] zzg;

    private zzyr(byte[] bArr, zzaae zzaaeVar) throws GeneralSecurityException {
        if (!zza.zza()) {
            throw new GeneralSecurityException("Can not use AES-SIV in FIPS-mode.");
        }
        if (!zzb.contains(Integer.valueOf(bArr.length))) {
            throw new InvalidKeyException(b.b(bArr.length, "invalid key size: ", " bytes; key must have 64 bytes"));
        }
        byte[] bArrCopyOfRange = Arrays.copyOfRange(bArr, 0, bArr.length / 2);
        this.zzf = Arrays.copyOfRange(bArr, bArr.length / 2, bArr.length);
        this.zze = new zzzt(bArrCopyOfRange);
        this.zzg = zzaaeVar.zzb();
    }

    public static zzbi zza(zzja zzjaVar) throws GeneralSecurityException {
        return new zzyr(zzjaVar.zzf().zza(zzbj.zza()), zzjaVar.zze());
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzbi
    public final byte[] zza(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        byte[] bArrZza;
        int length = bArr.length;
        byte[] bArr3 = this.zzg;
        if (length >= bArr3.length + 16) {
            if (zzqq.zza(bArr3, bArr)) {
                Cipher cipher = zzd.get();
                byte[] bArr4 = this.zzg;
                byte[] bArrCopyOfRange = Arrays.copyOfRange(bArr, bArr4.length, bArr4.length + 16);
                byte[] bArr5 = (byte[]) bArrCopyOfRange.clone();
                bArr5[8] = (byte) (bArr5[8] & Byte.MAX_VALUE);
                bArr5[12] = (byte) (bArr5[12] & Byte.MAX_VALUE);
                cipher.init(2, new SecretKeySpec(this.zzf, "AES"), new IvParameterSpec(bArr5));
                int length2 = this.zzg.length + 16;
                int length3 = bArr.length - length2;
                byte[] bArrDoFinal = cipher.doFinal(bArr, length2, length3);
                if (length3 == 0 && bArrDoFinal == null && zzaaa.zza()) {
                    bArrDoFinal = new byte[0];
                }
                byte[][] bArr6 = {bArr2, bArrDoFinal};
                byte[] bArrZza2 = this.zze.zza(zzc, 16);
                for (int i10 = 0; i10 <= 0; i10++) {
                    byte[] bArr7 = bArr6[i10];
                    if (bArr7 == null) {
                        bArr7 = new byte[0];
                    }
                    bArrZza2 = zzyt.zza(zzse.zzb(bArrZza2), this.zze.zza(bArr7, 16));
                }
                byte[] bArr8 = bArr6[1];
                if (bArr8.length >= 16) {
                    if (bArr8.length >= bArrZza2.length) {
                        int length4 = bArr8.length - bArrZza2.length;
                        bArrZza = Arrays.copyOf(bArr8, bArr8.length);
                        for (int i11 = 0; i11 < bArrZza2.length; i11++) {
                            int i12 = length4 + i11;
                            bArrZza[i12] = (byte) (bArrZza[i12] ^ bArrZza2[i11]);
                        }
                    } else {
                        throw new IllegalArgumentException("xorEnd requires a.length >= b.length");
                    }
                } else {
                    bArrZza = zzyt.zza(zzse.zza(bArr8), zzse.zzb(bArrZza2));
                }
                if (MessageDigest.isEqual(bArrCopyOfRange, this.zze.zza(bArrZza, 16))) {
                    return bArrDoFinal;
                }
                throw new AEADBadTagException("Integrity check failed.");
            }
            throw new GeneralSecurityException("Decryption failed (OutputPrefix mismatch).");
        }
        throw new GeneralSecurityException("Ciphertext too short.");
    }
}
