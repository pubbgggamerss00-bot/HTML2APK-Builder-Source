package org.bouncycastle.pqc.crypto.newhope;

import android.R;
import org.bouncycastle.crypto.digests.SHAKEDigest;
import org.bouncycastle.crypto.hpke.HPKE;
import org.bouncycastle.util.Pack;
import org.jf.dexlib2.analysis.RegisterType;

/* loaded from: classes3.dex */
class Poly {
    public static void add(short[] sArr, short[] sArr2, short[] sArr3) {
        for (int i10 = 0; i10 < 1024; i10++) {
            sArr3[i10] = Reduce.barrett((short) (sArr[i10] + sArr2[i10]));
        }
    }

    public static void fromBytes(short[] sArr, byte[] bArr) {
        for (int i10 = 0; i10 < 256; i10++) {
            int i11 = i10 * 7;
            int i12 = bArr[i11] & 255;
            byte b10 = bArr[i11 + 1];
            int i13 = bArr[i11 + 2] & 255;
            byte b11 = bArr[i11 + 3];
            int i14 = bArr[i11 + 4] & 255;
            byte b12 = bArr[i11 + 5];
            int i15 = bArr[i11 + 6] & 255;
            int i16 = i10 * 4;
            sArr[i16] = (short) (i12 | ((b10 & 63) << 8));
            sArr[i16 + 1] = (short) (((b10 & 255) >>> 6) | (i13 << 2) | ((b11 & RegisterType.DOUBLE_HI) << 10));
            sArr[i16 + 2] = (short) (((b11 & 255) >>> 4) | (i14 << 4) | ((b12 & 3) << 12));
            sArr[i16 + 3] = (short) ((i15 << 6) | ((b12 & 255) >>> 2));
        }
    }

    public static void fromNTT(short[] sArr) {
        NTT.bitReverse(sArr);
        NTT.core(sArr, Precomp.OMEGAS_INV_MONTGOMERY);
        NTT.mulCoefficients(sArr, Precomp.PSIS_INV_MONTGOMERY);
    }

    public static void getNoise(short[] sArr, byte[] bArr, byte b10) {
        byte[] bArr2 = new byte[8];
        bArr2[0] = b10;
        byte[] bArr3 = new byte[4096];
        ChaCha20.process(bArr, bArr2, bArr3, 0, 4096);
        for (int i10 = 0; i10 < 1024; i10++) {
            int iBigEndianToInt = Pack.bigEndianToInt(bArr3, i10 * 4);
            int i11 = 0;
            for (int i12 = 0; i12 < 8; i12++) {
                i11 += (iBigEndianToInt >> i12) & R.attr.cacheColorHint;
            }
            sArr[i10] = (short) (((((i11 >>> 24) + i11) & 255) + 12289) - (((i11 >>> 16) + (i11 >>> 8)) & 255));
        }
    }

    private static short normalize(short s10) {
        short sBarrett = Reduce.barrett(s10);
        int i10 = sBarrett - 12289;
        return (short) (((sBarrett ^ i10) & (i10 >> 31)) ^ i10);
    }

    public static void pointWise(short[] sArr, short[] sArr2, short[] sArr3) {
        for (int i10 = 0; i10 < 1024; i10++) {
            sArr3[i10] = Reduce.montgomery((sArr[i10] & HPKE.aead_EXPORT_ONLY) * (65535 & Reduce.montgomery((sArr2[i10] & HPKE.aead_EXPORT_ONLY) * 3186)));
        }
    }

    public static void toBytes(byte[] bArr, short[] sArr) {
        for (int i10 = 0; i10 < 256; i10++) {
            int i11 = i10 * 4;
            short sNormalize = normalize(sArr[i11]);
            short sNormalize2 = normalize(sArr[i11 + 1]);
            short sNormalize3 = normalize(sArr[i11 + 2]);
            short sNormalize4 = normalize(sArr[i11 + 3]);
            int i12 = i10 * 7;
            bArr[i12] = (byte) sNormalize;
            bArr[i12 + 1] = (byte) ((sNormalize >> 8) | (sNormalize2 << 6));
            bArr[i12 + 2] = (byte) (sNormalize2 >> 2);
            bArr[i12 + 3] = (byte) ((sNormalize2 >> 10) | (sNormalize3 << 4));
            bArr[i12 + 4] = (byte) (sNormalize3 >> 4);
            bArr[i12 + 5] = (byte) ((sNormalize3 >> 12) | (sNormalize4 << 2));
            bArr[i12 + 6] = (byte) (sNormalize4 >> 6);
        }
    }

    public static void toNTT(short[] sArr) {
        NTT.mulCoefficients(sArr, Precomp.PSIS_BITREV_MONTGOMERY);
        NTT.core(sArr, Precomp.OMEGAS_MONTGOMERY);
    }

    public static void uniform(short[] sArr, byte[] bArr) {
        SHAKEDigest sHAKEDigest = new SHAKEDigest(128);
        sHAKEDigest.update(bArr, 0, bArr.length);
        int i10 = 0;
        while (true) {
            byte[] bArr2 = new byte[256];
            sHAKEDigest.doOutput(bArr2, 0, 256);
            for (int i11 = 0; i11 < 256; i11 += 2) {
                int i12 = (bArr2[i11] & 255) | ((bArr2[i11 + 1] & 255) << 8);
                if (i12 < 61445) {
                    int i13 = i10 + 1;
                    sArr[i10] = (short) i12;
                    if (i13 == 1024) {
                        return;
                    } else {
                        i10 = i13;
                    }
                }
            }
        }
    }
}
