package org.bouncycastle.pqc.math.ntru;

import org.bouncycastle.crypto.hpke.HPKE;
import org.bouncycastle.pqc.math.ntru.parameters.NTRUHRSSParameterSet;

/* loaded from: classes3.dex */
public class HRSSPolynomial extends Polynomial {
    public HRSSPolynomial(NTRUHRSSParameterSet nTRUHRSSParameterSet) {
        super(nTRUHRSSParameterSet);
    }

    @Override // org.bouncycastle.pqc.math.ntru.Polynomial
    public void lift(Polynomial polynomial) {
        int length = this.coeffs.length;
        Polynomial polynomialCreatePolynomial = this.params.createPolynomial();
        short s10 = (short) (3 - (length % 3));
        short[] sArr = polynomialCreatePolynomial.coeffs;
        short[] sArr2 = polynomial.coeffs;
        int i10 = 0;
        int i11 = 2 - s10;
        int i12 = sArr2[0] * i11;
        short s11 = sArr2[1];
        short s12 = sArr2[2];
        sArr[0] = (short) ((s12 * s10) + i12);
        sArr[1] = (short) (s11 * i11);
        sArr[2] = (short) (s12 * i11);
        short s13 = 0;
        for (int i13 = 3; i13 < length; i13++) {
            short[] sArr3 = polynomialCreatePolynomial.coeffs;
            short s14 = sArr3[0];
            short[] sArr4 = polynomial.coeffs;
            sArr3[0] = (short) ((((s10 * 2) + s13) * sArr4[i13]) + s14);
            int i14 = s13 + s10;
            sArr3[1] = (short) ((sArr4[i13] * i14) + sArr3[1]);
            sArr3[2] = (short) ((sArr4[i13] * s13) + sArr3[2]);
            s13 = (short) (i14 % 3);
        }
        short[] sArr5 = polynomialCreatePolynomial.coeffs;
        short s15 = sArr5[1];
        short[] sArr6 = polynomial.coeffs;
        short s16 = sArr6[0];
        int i15 = s10 + s13;
        sArr5[1] = (short) ((s16 * i15) + s15);
        short s17 = (short) ((s16 * s13) + sArr5[2]);
        sArr5[2] = s17;
        sArr5[2] = (short) ((sArr6[1] * i15) + s17);
        for (int i16 = 3; i16 < length; i16++) {
            short[] sArr7 = polynomialCreatePolynomial.coeffs;
            short s18 = sArr7[i16 - 3];
            short[] sArr8 = polynomial.coeffs;
            sArr7[i16] = (short) (((sArr8[i16] + sArr8[i16 - 1] + sArr8[i16 - 2]) * 2) + s18);
        }
        polynomialCreatePolynomial.mod3PhiN();
        polynomialCreatePolynomial.z3ToZq();
        this.coeffs[0] = (short) (-polynomialCreatePolynomial.coeffs[0]);
        while (i10 < length - 1) {
            short[] sArr9 = this.coeffs;
            int i17 = i10 + 1;
            short[] sArr10 = polynomialCreatePolynomial.coeffs;
            sArr9[i17] = (short) (sArr10[i10] - sArr10[i17]);
            i10 = i17;
        }
    }

    @Override // org.bouncycastle.pqc.math.ntru.Polynomial
    public void sqFromBytes(byte[] bArr) {
        int i10 = 0;
        while (i10 < this.params.packDegree() / 8) {
            short[] sArr = this.coeffs;
            int i11 = i10 * 8;
            int i12 = i10 * 13;
            int i13 = bArr[i12] & 255;
            byte b10 = bArr[i12 + 1];
            sArr[i11] = (short) (i13 | ((((short) (b10 & 255)) & 31) << 8));
            int i14 = ((b10 & 255) >>> 5) | (((short) (bArr[i12 + 2] & 255)) << 3);
            byte b11 = bArr[i12 + 3];
            sArr[i11 + 1] = (short) (i14 | ((((short) (b11 & 255)) & 3) << 11));
            int i15 = (b11 & 255) >>> 2;
            byte b12 = bArr[i12 + 4];
            sArr[i11 + 2] = (short) (i15 | ((((short) (b12 & 255)) & 127) << 6));
            int i16 = ((b12 & 255) >>> 7) | (((short) (bArr[i12 + 5] & 255)) << 1);
            byte b13 = bArr[i12 + 6];
            sArr[i11 + 3] = (short) (i16 | ((((short) (b13 & 255)) & 15) << 9));
            int i17 = (((short) (bArr[i12 + 7] & 255)) << 4) | ((b13 & 255) >>> 4);
            byte b14 = bArr[i12 + 8];
            sArr[i11 + 4] = (short) (i17 | ((((short) (b14 & 255)) & 1) << 12));
            int i18 = (b14 & 255) >>> 1;
            byte b15 = bArr[i12 + 9];
            sArr[i11 + 5] = (short) (i18 | ((((short) (b15 & 255)) & 63) << 7));
            int i19 = (((short) (bArr[i12 + 10] & 255)) << 2) | ((b15 & 255) >>> 6);
            byte b16 = bArr[i12 + 11];
            sArr[i11 + 6] = (short) (i19 | ((((short) (b16 & 255)) & 7) << 10));
            sArr[i11 + 7] = (short) (((b16 & 255) >>> 3) | (((short) (bArr[i12 + 12] & 255)) << 5));
            i10++;
        }
        int iPackDegree = this.params.packDegree() & 7;
        if (iPackDegree == 2) {
            short[] sArr2 = this.coeffs;
            int i20 = i10 * 8;
            int i21 = i10 * 13;
            int i22 = bArr[i21] & 255;
            byte b17 = bArr[i21 + 1];
            sArr2[i20] = (short) (i22 | ((((short) (b17 & 255)) & 31) << 8));
            sArr2[i20 + 1] = (short) (((((short) (bArr[i21 + 3] & 255)) & 3) << 11) | ((b17 & 255) >>> 5) | (((short) (bArr[i21 + 2] & 255)) << 3));
        } else if (iPackDegree == 4) {
            short[] sArr3 = this.coeffs;
            int i23 = i10 * 8;
            int i24 = i10 * 13;
            int i25 = bArr[i24] & 255;
            byte b18 = bArr[i24 + 1];
            sArr3[i23] = (short) (i25 | ((((short) (b18 & 255)) & 31) << 8));
            int i26 = ((b18 & 255) >>> 5) | (((short) (bArr[i24 + 2] & 255)) << 3);
            byte b19 = bArr[i24 + 3];
            sArr3[i23 + 1] = (short) (i26 | ((((short) (b19 & 255)) & 3) << 11));
            byte b20 = bArr[i24 + 4];
            sArr3[i23 + 2] = (short) (((b19 & 255) >>> 2) | ((((short) (b20 & 255)) & 127) << 6));
            sArr3[i23 + 3] = (short) (((((short) (bArr[i24 + 6] & 255)) & 15) << 9) | ((b20 & 255) >>> 7) | (((short) (bArr[i24 + 5] & 255)) << 1));
        }
        this.coeffs[this.params.n() - 1] = 0;
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
            int i13 = i11 * 13;
            short s10 = sArr[0];
            bArr[i13] = (byte) (s10 & 255);
            short s11 = sArr[1];
            bArr[i13 + 1] = (byte) ((s10 >>> 8) | ((s11 & 7) << 5));
            bArr[i13 + 2] = (byte) ((s11 >>> 3) & 255);
            int i14 = s11 >>> 11;
            short s12 = sArr[2];
            bArr[i13 + 3] = (byte) (i14 | ((s12 & 63) << 2));
            short s13 = sArr[3];
            bArr[i13 + 4] = (byte) ((s12 >>> 6) | ((s13 & 1) << 7));
            bArr[i13 + 5] = (byte) ((s13 >>> 1) & 255);
            int i15 = s13 >>> 9;
            short s14 = sArr[4];
            bArr[i13 + 6] = (byte) (i15 | ((s14 & 15) << 4));
            bArr[i13 + 7] = (byte) ((s14 >>> 4) & 255);
            short s15 = sArr[5];
            bArr[i13 + 8] = (byte) ((s14 >>> 12) | ((s15 & 127) << 1));
            int i16 = s15 >>> 7;
            short s16 = sArr[6];
            bArr[i13 + 9] = (byte) (i16 | ((s16 & 3) << 6));
            bArr[i13 + 10] = (byte) ((s16 >>> 2) & 255);
            short s17 = sArr[7];
            bArr[i13 + 11] = (byte) ((s16 >>> 10) | ((s17 & 31) << 3));
            bArr[i13 + 12] = (byte) (s17 >>> 5);
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
        int iPackDegree = this.params.packDegree() - ((this.params.packDegree() / 8) * 8);
        if (iPackDegree != 2) {
            if (iPackDegree != 4) {
                return bArr;
            }
            int i19 = i11 * 13;
            short s18 = sArr[0];
            bArr[i19] = (byte) (s18 & 255);
            short s19 = sArr[1];
            bArr[i19 + 1] = (byte) ((s18 >>> 8) | ((s19 & 7) << 5));
            bArr[i19 + 2] = (byte) ((s19 >>> 3) & 255);
            int i20 = s19 >>> 11;
            short s20 = sArr[2];
            bArr[i19 + 3] = (byte) (i20 | ((s20 & 63) << 2));
            int i21 = s20 >>> 6;
            short s21 = sArr[3];
            bArr[i19 + 4] = (byte) (i21 | ((s21 & 1) << 7));
            bArr[i19 + 5] = (byte) ((s21 >>> 1) & 255);
            bArr[i19 + 6] = (byte) ((s21 >>> 9) | ((sArr[4] & 15) << 4));
        }
        int i22 = i11 * 13;
        short s22 = sArr[0];
        bArr[i22] = (byte) (s22 & 255);
        int i23 = s22 >>> 8;
        short s23 = sArr[1];
        bArr[i22 + 1] = (byte) (i23 | ((s23 & 7) << 5));
        bArr[i22 + 2] = (byte) ((s23 >>> 3) & 255);
        bArr[i22 + 3] = (byte) ((s23 >>> 11) | ((sArr[2] & 63) << 2));
        return bArr;
    }
}
