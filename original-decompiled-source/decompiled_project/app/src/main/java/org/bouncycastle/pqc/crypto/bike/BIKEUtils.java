package org.bouncycastle.pqc.crypto.bike;

import org.bouncycastle.asn1.cmc.BodyPartID;
import org.bouncycastle.crypto.Xof;
import org.bouncycastle.util.Pack;

/* loaded from: classes3.dex */
class BIKEUtils {
    public static int CHECK_BIT(byte[] bArr, int i10) {
        return (bArr[i10 / 8] >>> (i10 % 8)) & 1;
    }

    public static void SET_BIT(byte[] bArr, int i10) {
        bArr[i10 / 8] = (byte) (bArr[r0] | (1 << (i10 % 8)));
    }

    public static void fromBitArrayToByteArray(byte[] bArr, byte[] bArr2, int i10, int i11) {
        long j10 = i11;
        int i12 = 0;
        int i13 = 0;
        while (i12 < j10) {
            int i14 = i12 + 8;
            if (i14 >= i11) {
                int i15 = i10 + i12;
                int i16 = bArr2[i15];
                for (int i17 = (i11 - i12) - 1; i17 >= 1; i17--) {
                    i16 |= bArr2[i15 + i17] << i17;
                }
                bArr[i13] = (byte) i16;
            } else {
                int i18 = i12 + i10;
                int i19 = bArr2[i18];
                for (int i20 = 7; i20 >= 1; i20--) {
                    i19 |= bArr2[i18 + i20] << i20;
                }
                bArr[i13] = (byte) i19;
            }
            i13++;
            i12 = i14;
        }
    }

    public static void generateRandomByteArray(byte[] bArr, int i10, int i11, Xof xof) {
        byte[] bArr2 = new byte[4];
        for (int i12 = i11 - 1; i12 >= 0; i12--) {
            xof.doOutput(bArr2, 0, 4);
            int iLittleEndianToInt = ((int) (((Pack.littleEndianToInt(bArr2, 0) & BodyPartID.bodyIdMax) * (i10 - i12)) >> 32)) + i12;
            if (CHECK_BIT(bArr, iLittleEndianToInt) != 0) {
                iLittleEndianToInt = i12;
            }
            SET_BIT(bArr, iLittleEndianToInt);
        }
    }

    public static int getHammingWeight(byte[] bArr) {
        int i10 = 0;
        for (byte b10 : bArr) {
            i10 += b10;
        }
        return i10;
    }
}
