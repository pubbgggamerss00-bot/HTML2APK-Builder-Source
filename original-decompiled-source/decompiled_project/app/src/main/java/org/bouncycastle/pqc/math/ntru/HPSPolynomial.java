package org.bouncycastle.pqc.math.ntru;

import org.bouncycastle.crypto.hpke.HPKE;
import org.bouncycastle.pqc.math.ntru.parameters.NTRUHPSParameterSet;

/* loaded from: classes3.dex */
public class HPSPolynomial extends Polynomial {
    public HPSPolynomial(NTRUHPSParameterSet nTRUHPSParameterSet) {
        super(nTRUHPSParameterSet);
    }

    @Override // org.bouncycastle.pqc.math.ntru.Polynomial
    public void lift(Polynomial polynomial) {
        short[] sArr = this.coeffs;
        System.arraycopy(polynomial.coeffs, 0, sArr, 0, sArr.length);
        z3ToZq();
    }

    @Override // org.bouncycastle.pqc.math.ntru.Polynomial
    public void sqFromBytes(byte[] bArr) {
        int length = this.coeffs.length;
        int i10 = 0;
        while (i10 < this.params.packDegree() / 8) {
            short[] sArr = this.coeffs;
            int i11 = i10 * 8;
            int i12 = i10 * 11;
            int i13 = bArr[i12] & 255;
            byte b10 = bArr[i12 + 1];
            sArr[i11] = (short) (i13 | ((((short) (b10 & 255)) & 7) << 8));
            byte b11 = bArr[i12 + 2];
            sArr[i11 + 1] = (short) (((b10 & 255) >>> 3) | ((((short) (b11 & 255)) & 63) << 5));
            int i14 = ((b11 & 255) >>> 6) | ((((short) (bArr[i12 + 3] & 255)) & 255) << 2);
            byte b12 = bArr[i12 + 4];
            sArr[i11 + 2] = (short) (i14 | ((((short) (b12 & 255)) & 1) << 10));
            int i15 = (b12 & 255) >>> 1;
            byte b13 = bArr[i12 + 5];
            sArr[i11 + 3] = (short) (i15 | ((((short) (b13 & 255)) & 15) << 7));
            int i16 = (b13 & 255) >>> 4;
            byte b14 = bArr[i12 + 6];
            sArr[i11 + 4] = (short) (((((short) (b14 & 255)) & 127) << 4) | i16);
            int i17 = ((b14 & 255) >>> 7) | ((((short) (bArr[i12 + 7] & 255)) & 255) << 1);
            byte b15 = bArr[i12 + 8];
            sArr[i11 + 5] = (short) (i17 | ((((short) (b15 & 255)) & 3) << 9));
            byte b16 = bArr[i12 + 9];
            sArr[i11 + 6] = (short) (((b15 & 255) >>> 2) | ((((short) (b16 & 255)) & 31) << 6));
            sArr[i11 + 7] = (short) (((b16 & 255) >>> 5) | ((((short) (bArr[i12 + 10] & 255)) & 255) << 3));
            i10++;
        }
        int iPackDegree = this.params.packDegree() & 7;
        if (iPackDegree == 2) {
            short[] sArr2 = this.coeffs;
            int i18 = i10 * 8;
            int i19 = i10 * 11;
            int i20 = bArr[i19] & 255;
            byte b17 = bArr[i19 + 1];
            sArr2[i18] = (short) (i20 | ((((short) (b17 & 255)) & 7) << 8));
            sArr2[i18 + 1] = (short) (((((short) (bArr[i19 + 2] & 255)) & 63) << 5) | ((b17 & 255) >>> 3));
        } else if (iPackDegree == 4) {
            short[] sArr3 = this.coeffs;
            int i21 = i10 * 8;
            int i22 = i10 * 11;
            int i23 = bArr[i22] & 255;
            byte b18 = bArr[i22 + 1];
            sArr3[i21] = (short) (i23 | ((((short) (b18 & 255)) & 7) << 8));
            byte b19 = bArr[i22 + 2];
            sArr3[i21 + 1] = (short) (((b18 & 255) >>> 3) | ((((short) (b19 & 255)) & 63) << 5));
            int i24 = ((((short) (bArr[i22 + 3] & 255)) & 255) << 2) | ((b19 & 255) >>> 6);
            byte b20 = bArr[i22 + 4];
            sArr3[i21 + 2] = (short) (i24 | ((((short) (b20 & 255)) & 1) << 10));
            sArr3[i21 + 3] = (short) (((((short) (bArr[i22 + 5] & 255)) & 15) << 7) | ((b20 & 255) >>> 1));
        }
        this.coeffs[length - 1] = 0;
    }

    @Override // org.bouncycastle.pqc.math.ntru.Polynomial
    public byte[] sqToBytes(int i10) {
        byte[] bArr = new byte[i10];
        short[] sArr = new short[8];
        int i11 = 0;
        while (i11 < this.params.packDegree() / 8) {
            for (int i12 = 0; i12 < 8; i12++) {
                sArr[i12] = (short) Polynomial.modQ(this.coeffs[(i11 * 8) + i12] & HPKE.aead_EXPORT_ONLY, this.params.q());
            }
            int i13 = i11 * 11;
            short s10 = sArr[0];
            bArr[i13] = (byte) (s10 & 255);
            short s11 = sArr[1];
            bArr[i13 + 1] = (byte) ((s10 >>> 8) | ((s11 & 31) << 3));
            int i14 = s11 >>> 5;
            short s12 = sArr[2];
            bArr[i13 + 2] = (byte) (i14 | ((s12 & 3) << 6));
            bArr[i13 + 3] = (byte) ((s12 >>> 2) & 255);
            int i15 = s12 >>> 10;
            short s13 = sArr[3];
            bArr[i13 + 4] = (byte) (i15 | ((s13 & 127) << 1));
            short s14 = sArr[4];
            bArr[i13 + 5] = (byte) ((s13 >>> 7) | ((s14 & 15) << 4));
            short s15 = sArr[5];
            bArr[i13 + 6] = (byte) ((s14 >>> 4) | ((s15 & 1) << 7));
            bArr[i13 + 7] = (byte) ((s15 >>> 1) & 255);
            int i16 = s15 >>> 9;
            short s16 = sArr[6];
            bArr[i13 + 8] = (byte) (i16 | ((s16 & 63) << 2));
            short s17 = sArr[7];
            bArr[i13 + 9] = (byte) ((s16 >>> 6) | ((s17 & 7) << 5));
            bArr[i13 + 10] = (byte) (s17 >>> 3);
            i11++;
        }
        int i17 = 0;
        while (true) {
            int i18 = i11 * 8;
            if (i17 >= this.params.packDegree() - i18) {
                break;
            }
            sArr[i17] = (short) Polynomial.modQ(this.coeffs[i18 + i17] & HPKE.aead_EXPORT_ONLY, this.params.q());
            i17++;
        }
        while (i17 < 8) {
            sArr[i17] = 0;
            i17++;
        }
        int iPackDegree = this.params.packDegree() & 7;
        if (iPackDegree == 2) {
            int i19 = i11 * 11;
            short s18 = sArr[0];
            bArr[i19] = (byte) (s18 & 255);
            int i20 = s18 >>> 8;
            short s19 = sArr[1];
            bArr[i19 + 1] = (byte) (i20 | ((s19 & 31) << 3));
            bArr[i19 + 2] = (byte) ((s19 >>> 5) | ((sArr[2] & 3) << 6));
            return bArr;
        }
        if (iPackDegree != 4) {
            return bArr;
        }
        int i21 = i11 * 11;
        short s20 = sArr[0];
        bArr[i21] = (byte) (s20 & 255);
        int i22 = s20 >>> 8;
        short s21 = sArr[1];
        bArr[i21 + 1] = (byte) (i22 | ((s21 & 31) << 3));
        short s22 = sArr[2];
        bArr[i21 + 2] = (byte) ((s21 >>> 5) | ((s22 & 3) << 6));
        bArr[i21 + 3] = (byte) ((s22 >>> 2) & 255);
        int i23 = s22 >>> 10;
        short s23 = sArr[3];
        bArr[i21 + 4] = (byte) (i23 | ((s23 & 127) << 1));
        bArr[i21 + 5] = (byte) ((s23 >>> 7) | ((sArr[4] & 15) << 4));
        return bArr;
    }
}
