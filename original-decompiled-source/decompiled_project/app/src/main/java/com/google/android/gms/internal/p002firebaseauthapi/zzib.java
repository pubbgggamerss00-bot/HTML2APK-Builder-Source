package com.google.android.gms.internal.p002firebaseauthapi;

import java.util.Arrays;
import org.bouncycastle.asn1.cmc.BodyPartID;

/* loaded from: classes2.dex */
public final class zzib {
    private static long zza(byte[] bArr, int i10, int i11) {
        return (zza(bArr, i10) >> i11) & 67108863;
    }

    private static long zza(byte[] bArr, int i10) {
        return (((bArr[i10 + 3] & 255) << 24) | (bArr[i10] & 255) | ((bArr[i10 + 1] & 255) << 8) | ((bArr[i10 + 2] & 255) << 16)) & BodyPartID.bodyIdMax;
    }

    private static void zza(byte[] bArr, long j10, int i10) {
        int i11 = 0;
        while (i11 < 4) {
            bArr[i10 + i11] = (byte) (255 & j10);
            i11++;
            j10 >>= 8;
        }
    }

    public static byte[] zza(byte[] bArr, byte[] bArr2) {
        if (bArr.length == 32) {
            long jZza = zza(bArr, 0, 0) & 67108863;
            int i10 = 3;
            int i11 = 2;
            long jZza2 = zza(bArr, 3, 2) & 67108611;
            long jZza3 = zza(bArr, 6, 4) & 67092735;
            long jZza4 = zza(bArr, 9, 6) & 66076671;
            long jZza5 = zza(bArr, 12, 8) & 1048575;
            long j10 = jZza2 * 5;
            long j11 = jZza3 * 5;
            long j12 = jZza4 * 5;
            long j13 = jZza5 * 5;
            int i12 = 17;
            byte[] bArr3 = new byte[17];
            long j14 = 0;
            int i13 = 0;
            long j15 = 0;
            long j16 = 0;
            long j17 = 0;
            long j18 = 0;
            while (i13 < bArr2.length) {
                int iMin = Math.min(16, bArr2.length - i13);
                System.arraycopy(bArr2, i13, bArr3, 0, iMin);
                bArr3[iMin] = 1;
                if (iMin != 16) {
                    Arrays.fill(bArr3, iMin + 1, i12, (byte) 0);
                }
                long jZza6 = j18 + zza(bArr3, 0, 0);
                long jZza7 = j14 + zza(bArr3, i10, i11);
                long jZza8 = j15 + zza(bArr3, 6, 4);
                long jZza9 = j16 + zza(bArr3, 9, 6);
                long j19 = jZza2;
                long jZza10 = j17 + (zza(bArr3, 12, 8) | (bArr3[16] << 24));
                long j20 = (jZza10 * j10) + (jZza9 * j11) + (jZza8 * j12) + (jZza7 * j13) + (jZza6 * jZza);
                long j21 = (jZza10 * j11) + (jZza9 * j12) + (jZza8 * j13) + (jZza7 * jZza) + (jZza6 * j19);
                long j22 = (jZza10 * j12) + (jZza9 * j13) + (jZza8 * jZza) + (jZza7 * j19) + (jZza6 * jZza3);
                long j23 = (jZza10 * j13) + (jZza9 * jZza) + (jZza8 * j19) + (jZza7 * jZza3) + (jZza6 * jZza4);
                long j24 = jZza9 * j19;
                long j25 = jZza10 * jZza;
                long j26 = j21 + (j20 >> 26);
                long j27 = j22 + (j26 >> 26);
                long j28 = j23 + (j27 >> 26);
                long j29 = j25 + j24 + (jZza8 * jZza3) + (jZza7 * jZza4) + (jZza6 * jZza5) + (j28 >> 26);
                long j30 = j29 >> 26;
                j17 = j29 & 67108863;
                long j31 = (j30 * 5) + (j20 & 67108863);
                i13 += 16;
                j15 = j27 & 67108863;
                j16 = j28 & 67108863;
                i12 = 17;
                i10 = 3;
                j18 = j31 & 67108863;
                j14 = (j26 & 67108863) + (j31 >> 26);
                jZza2 = j19;
                i11 = 2;
            }
            long j32 = j15 + (j14 >> 26);
            long j33 = j32 & 67108863;
            long j34 = j16 + (j32 >> 26);
            long j35 = j34 & 67108863;
            long j36 = j17 + (j34 >> 26);
            long j37 = j36 & 67108863;
            long j38 = ((j36 >> 26) * 5) + j18;
            long j39 = j38 >> 26;
            long j40 = j38 & 67108863;
            long j41 = (j14 & 67108863) + j39;
            long j42 = j40 + 5;
            long j43 = j42 & 67108863;
            long j44 = (j42 >> 26) + j41;
            long j45 = j33 + (j44 >> 26);
            long j46 = j35 + (j45 >> 26);
            long j47 = (j37 + (j46 >> 26)) - 67108864;
            long j48 = j47 >> 63;
            long j49 = ~j48;
            long j50 = (j40 & j48) | (j43 & j49);
            long j51 = (j41 & j48) | (j44 & 67108863 & j49);
            long j52 = (j33 & j48) | (j45 & 67108863 & j49);
            long j53 = (j35 & j48) | (j46 & 67108863 & j49);
            long j54 = (j50 | (j51 << 26)) & BodyPartID.bodyIdMax;
            long j55 = ((j51 >> 6) | (j52 << 20)) & BodyPartID.bodyIdMax;
            long j56 = ((j52 >> 12) | (j53 << 14)) & BodyPartID.bodyIdMax;
            long j57 = ((((j47 & j49) | (j37 & j48)) << 8) | (j53 >> 18)) & BodyPartID.bodyIdMax;
            long jZza11 = j54 + zza(bArr, 16);
            long j58 = jZza11 & BodyPartID.bodyIdMax;
            long jZza12 = j55 + zza(bArr, 20) + (jZza11 >> 32);
            long j59 = jZza12 & BodyPartID.bodyIdMax;
            long jZza13 = j56 + zza(bArr, 24) + (jZza12 >> 32);
            long j60 = jZza13 & BodyPartID.bodyIdMax;
            long jZza14 = (j57 + zza(bArr, 28) + (jZza13 >> 32)) & BodyPartID.bodyIdMax;
            byte[] bArr4 = new byte[16];
            zza(bArr4, j58, 0);
            zza(bArr4, j59, 4);
            zza(bArr4, j60, 8);
            zza(bArr4, jZza14, 12);
            return bArr4;
        }
        throw new IllegalArgumentException("The key length in bytes must be 32.");
    }
}
