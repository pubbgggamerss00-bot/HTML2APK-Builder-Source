package org.bouncycastle.pqc.math.ntru;

import org.bouncycastle.crypto.hpke.HPKE;
import org.bouncycastle.pqc.math.ntru.parameters.NTRUParameterSet;

/* loaded from: classes3.dex */
public abstract class Polynomial {
    public short[] coeffs;
    protected NTRUParameterSet params;

    public Polynomial(NTRUParameterSet nTRUParameterSet) {
        this.coeffs = new short[nTRUParameterSet.n()];
        this.params = nTRUParameterSet;
    }

    public static short bothNegativeMask(short s10, short s11) {
        return (short) ((s10 & s11) >>> 15);
    }

    public static byte mod3(byte b10) {
        return (byte) ((b10 & 255) % 3);
    }

    public static int modQ(int i10, int i11) {
        return i10 % i11;
    }

    private void r2InvToRqInv(Polynomial polynomial, Polynomial polynomial2, Polynomial polynomial3, Polynomial polynomial4, Polynomial polynomial5) {
        int length = this.coeffs.length;
        for (int i10 = 0; i10 < length; i10++) {
            polynomial3.coeffs[i10] = (short) (-polynomial2.coeffs[i10]);
        }
        for (int i11 = 0; i11 < length; i11++) {
            this.coeffs[i11] = polynomial.coeffs[i11];
        }
        polynomial4.rqMul(this, polynomial3);
        short[] sArr = polynomial4.coeffs;
        sArr[0] = (short) (sArr[0] + 2);
        polynomial5.rqMul(polynomial4, this);
        polynomial4.rqMul(polynomial5, polynomial3);
        short[] sArr2 = polynomial4.coeffs;
        sArr2[0] = (short) (sArr2[0] + 2);
        rqMul(polynomial4, polynomial5);
        polynomial4.rqMul(this, polynomial3);
        short[] sArr3 = polynomial4.coeffs;
        sArr3[0] = (short) (sArr3[0] + 2);
        polynomial5.rqMul(polynomial4, this);
        polynomial4.rqMul(polynomial5, polynomial3);
        short[] sArr4 = polynomial4.coeffs;
        sArr4[0] = (short) (sArr4[0] + 2);
        rqMul(polynomial4, polynomial5);
    }

    public abstract void lift(Polynomial polynomial);

    public void mod3PhiN() {
        int iN = this.params.n();
        for (int i10 = 0; i10 < iN; i10++) {
            short[] sArr = this.coeffs;
            sArr[i10] = mod3((short) ((sArr[iN - 1] * 2) + sArr[i10]));
        }
    }

    public void modQPhiN() {
        int iN = this.params.n();
        for (int i10 = 0; i10 < iN; i10++) {
            short[] sArr = this.coeffs;
            sArr[i10] = (short) (sArr[i10] - sArr[iN - 1]);
        }
    }

    public void r2Inv(Polynomial polynomial) {
        r2Inv(polynomial, this.params.createPolynomial(), this.params.createPolynomial(), this.params.createPolynomial(), this.params.createPolynomial());
    }

    public void rqInv(Polynomial polynomial) {
        rqInv(polynomial, this.params.createPolynomial(), this.params.createPolynomial(), this.params.createPolynomial(), this.params.createPolynomial());
    }

    public void rqMul(Polynomial polynomial, Polynomial polynomial2) {
        int i10;
        int length = this.coeffs.length;
        int i11 = 0;
        while (i11 < length) {
            this.coeffs[i11] = 0;
            for (int i12 = 1; i12 < length - i11; i12++) {
                short[] sArr = this.coeffs;
                sArr[i11] = (short) ((polynomial.coeffs[i11 + i12] * polynomial2.coeffs[length - i12]) + sArr[i11]);
            }
            int i13 = 0;
            while (true) {
                i10 = i11 + 1;
                if (i13 < i10) {
                    short[] sArr2 = this.coeffs;
                    sArr2[i11] = (short) ((polynomial.coeffs[i11 - i13] * polynomial2.coeffs[i13]) + sArr2[i11]);
                    i13++;
                }
            }
            i11 = i10;
        }
    }

    public void rqSumZeroFromBytes(byte[] bArr) {
        int length = this.coeffs.length;
        sqFromBytes(bArr);
        int i10 = length - 1;
        this.coeffs[i10] = 0;
        for (int i11 = 0; i11 < this.params.packDegree(); i11++) {
            short[] sArr = this.coeffs;
            sArr[i10] = (short) (sArr[i10] - sArr[i11]);
        }
    }

    public byte[] rqSumZeroToBytes(int i10) {
        return sqToBytes(i10);
    }

    public void rqToS3(Polynomial polynomial) {
        int length = this.coeffs.length;
        for (int i10 = 0; i10 < length; i10++) {
            this.coeffs[i10] = (short) modQ(polynomial.coeffs[i10] & HPKE.aead_EXPORT_ONLY, this.params.q());
            short sLogQ = (short) (this.coeffs[i10] >>> (this.params.logQ() - 1));
            short[] sArr = this.coeffs;
            sArr[i10] = (short) (sArr[i10] + (sLogQ << (1 - (this.params.logQ() & 1))));
        }
        mod3PhiN();
    }

    public void s3FromBytes(byte[] bArr) {
        int length = this.coeffs.length;
        for (int i10 = 0; i10 < this.params.packDegree() / 5; i10++) {
            byte b10 = bArr[i10];
            short[] sArr = this.coeffs;
            int i11 = i10 * 5;
            sArr[i11] = b10;
            int i12 = b10 & 255;
            sArr[i11 + 1] = (short) ((i12 * 171) >>> 9);
            sArr[i11 + 2] = (short) ((i12 * 57) >>> 9);
            sArr[i11 + 3] = (short) ((i12 * 19) >>> 9);
            sArr[i11 + 4] = (short) ((i12 * 203) >>> 14);
        }
        if (this.params.packDegree() > (this.params.packDegree() / 5) * 5) {
            int iPackDegree = this.params.packDegree() / 5;
            byte b11 = bArr[iPackDegree];
            int i13 = 0;
            while (true) {
                int i14 = (iPackDegree * 5) + i13;
                if (i14 >= this.params.packDegree()) {
                    break;
                }
                this.coeffs[i14] = b11;
                b11 = (byte) (((b11 & 255) * 171) >> 9);
                i13++;
            }
        }
        this.coeffs[length - 1] = 0;
        mod3PhiN();
    }

    public void s3Inv(Polynomial polynomial) {
        s3Inv(polynomial, this.params.createPolynomial(), this.params.createPolynomial(), this.params.createPolynomial(), this.params.createPolynomial());
    }

    public void s3Mul(Polynomial polynomial, Polynomial polynomial2) {
        rqMul(polynomial, polynomial2);
        mod3PhiN();
    }

    public byte[] s3ToBytes(int i10) {
        byte[] bArr = new byte[i10];
        byte b10 = 0;
        for (int i11 = 0; i11 < this.params.packDegree() / 5; i11++) {
            short[] sArr = this.coeffs;
            int i12 = i11 * 5;
            bArr[i11] = (byte) (((((byte) (((((byte) (((((byte) (((((byte) (sArr[i12 + 4] & 255)) * 3) + sArr[i12 + 3]) & 255)) * 3) + sArr[i12 + 2]) & 255)) * 3) + sArr[i12 + 1]) & 255)) * 3) + sArr[i12]) & 255);
        }
        if (this.params.packDegree() > (this.params.packDegree() / 5) * 5) {
            int iPackDegree = this.params.packDegree() / 5;
            int i13 = iPackDegree * 5;
            for (int iPackDegree2 = (this.params.packDegree() - i13) - 1; iPackDegree2 >= 0; iPackDegree2--) {
                b10 = (byte) (((b10 * 3) + this.coeffs[i13 + iPackDegree2]) & 255);
            }
            bArr[iPackDegree] = b10;
        }
        return bArr;
    }

    public abstract void sqFromBytes(byte[] bArr);

    public void sqMul(Polynomial polynomial, Polynomial polynomial2) {
        rqMul(polynomial, polynomial2);
        modQPhiN();
    }

    public abstract byte[] sqToBytes(int i10);

    public void trinaryZqToZ3() {
        int length = this.coeffs.length;
        for (int i10 = 0; i10 < length; i10++) {
            short[] sArr = this.coeffs;
            sArr[i10] = (short) modQ(sArr[i10] & HPKE.aead_EXPORT_ONLY, this.params.q());
            short[] sArr2 = this.coeffs;
            short s10 = sArr2[i10];
            sArr2[i10] = (short) ((s10 ^ (s10 >>> (this.params.logQ() - 1))) & 3);
        }
    }

    public void z3ToZq() {
        int length = this.coeffs.length;
        for (int i10 = 0; i10 < length; i10++) {
            short[] sArr = this.coeffs;
            short s10 = sArr[i10];
            sArr[i10] = (short) (s10 | ((-(s10 >>> 1)) & (this.params.q() - 1)));
        }
    }

    public static short mod3(short s10) {
        return (short) ((s10 & HPKE.aead_EXPORT_ONLY) % 3);
    }

    public void r2Inv(Polynomial polynomial, Polynomial polynomial2, Polynomial polynomial3, Polynomial polynomial4, Polynomial polynomial5) {
        int i10;
        int length = this.coeffs.length;
        short s10 = 0;
        polynomial5.coeffs[0] = 1;
        for (int i11 = 0; i11 < length; i11++) {
            polynomial2.coeffs[i11] = 1;
        }
        int i12 = 0;
        while (true) {
            i10 = length - 1;
            if (i12 >= i10) {
                break;
            }
            short[] sArr = polynomial.coeffs;
            polynomial3.coeffs[(length - 2) - i12] = (short) ((sArr[i10] ^ sArr[i12]) & 1);
            i12++;
        }
        polynomial3.coeffs[i10] = 0;
        int i13 = 0;
        short s11 = 1;
        for (int i14 = 1; i13 < (i10 * 2) - i14; i14 = 1) {
            for (int i15 = i10; i15 > 0; i15--) {
                short[] sArr2 = polynomial4.coeffs;
                sArr2[i15] = sArr2[i15 - 1];
            }
            polynomial4.coeffs[s10] = s10;
            short s12 = polynomial3.coeffs[s10];
            short s13 = (short) (polynomial2.coeffs[s10] & s12);
            int i16 = -s11;
            short sBothNegativeMask = bothNegativeMask((short) i16, (short) (-s12));
            s11 = (short) (((short) (s11 ^ ((i16 ^ s11) & sBothNegativeMask))) + i14);
            int i17 = s10;
            short s14 = s10;
            while (i17 < length) {
                short[] sArr3 = polynomial2.coeffs;
                short s15 = sArr3[i17];
                short s16 = s14;
                short[] sArr4 = polynomial3.coeffs;
                short s17 = (short) (sBothNegativeMask & (s15 ^ sArr4[i17]));
                sArr3[i17] = (short) (s15 ^ s17);
                sArr4[i17] = (short) (s17 ^ sArr4[i17]);
                short[] sArr5 = polynomial4.coeffs;
                short s18 = sArr5[i17];
                short[] sArr6 = polynomial5.coeffs;
                short s19 = (short) ((sArr6[i17] ^ s18) & sBothNegativeMask);
                sArr5[i17] = (short) (s18 ^ s19);
                sArr6[i17] = (short) (sArr6[i17] ^ s19);
                i17++;
                s14 = s16;
            }
            short s20 = s14;
            for (int i18 = s14; i18 < length; i18++) {
                short[] sArr7 = polynomial3.coeffs;
                sArr7[i18] = (short) (sArr7[i18] ^ (polynomial2.coeffs[i18] & s13));
            }
            for (int i19 = s20; i19 < length; i19++) {
                short[] sArr8 = polynomial5.coeffs;
                sArr8[i19] = (short) (sArr8[i19] ^ (polynomial4.coeffs[i19] & s13));
            }
            int i20 = s20;
            while (i20 < i10) {
                short[] sArr9 = polynomial3.coeffs;
                int i21 = i20 + 1;
                sArr9[i20] = sArr9[i21];
                i20 = i21;
            }
            polynomial3.coeffs[i10] = s20;
            i13++;
            s10 = s20;
        }
        short s21 = s10;
        for (int i22 = s21; i22 < i10; i22++) {
            this.coeffs[i22] = polynomial4.coeffs[(length - 2) - i22];
        }
        this.coeffs[i10] = s21;
    }

    public void rqInv(Polynomial polynomial, Polynomial polynomial2, Polynomial polynomial3, Polynomial polynomial4, Polynomial polynomial5) {
        polynomial2.r2Inv(polynomial);
        r2InvToRqInv(polynomial2, polynomial, polynomial3, polynomial4, polynomial5);
    }

    public void s3Inv(Polynomial polynomial, Polynomial polynomial2, Polynomial polynomial3, Polynomial polynomial4, Polynomial polynomial5) {
        int i10;
        int length = this.coeffs.length;
        short s10 = 0;
        polynomial5.coeffs[0] = 1;
        for (int i11 = 0; i11 < length; i11++) {
            polynomial2.coeffs[i11] = 1;
        }
        int i12 = 0;
        while (true) {
            i10 = length - 1;
            if (i12 >= i10) {
                break;
            }
            short[] sArr = polynomial.coeffs;
            polynomial3.coeffs[(length - 2) - i12] = mod3((short) (((sArr[i10] & 3) * 2) + (sArr[i12] & 3)));
            i12++;
        }
        polynomial3.coeffs[i10] = 0;
        int i13 = 0;
        short s11 = 1;
        for (int i14 = 1; i13 < (i10 * 2) - i14; i14 = 1) {
            for (int i15 = i10; i15 > 0; i15--) {
                short[] sArr2 = polynomial4.coeffs;
                sArr2[i15] = sArr2[i15 - 1];
            }
            polynomial4.coeffs[s10] = s10;
            short sMod3 = mod3((byte) (polynomial3.coeffs[s10] * 2 * polynomial2.coeffs[s10]));
            int i16 = -s11;
            short sBothNegativeMask = bothNegativeMask((short) i16, (short) (-polynomial3.coeffs[s10]));
            s11 = (short) (((short) (s11 ^ ((i16 ^ s11) & sBothNegativeMask))) + i14);
            int i17 = s10;
            short s12 = s10;
            while (i17 < length) {
                short[] sArr3 = polynomial2.coeffs;
                short s13 = sArr3[i17];
                short s14 = s12;
                short[] sArr4 = polynomial3.coeffs;
                short s15 = (short) (sBothNegativeMask & (s13 ^ sArr4[i17]));
                sArr3[i17] = (short) (s13 ^ s15);
                sArr4[i17] = (short) (s15 ^ sArr4[i17]);
                short[] sArr5 = polynomial4.coeffs;
                short s16 = sArr5[i17];
                short[] sArr6 = polynomial5.coeffs;
                short s17 = (short) ((sArr6[i17] ^ s16) & sBothNegativeMask);
                sArr5[i17] = (short) (s16 ^ s17);
                sArr6[i17] = (short) (sArr6[i17] ^ s17);
                i17++;
                s12 = s14;
            }
            short s18 = s12;
            for (int i18 = s12; i18 < length; i18++) {
                polynomial3.coeffs[i18] = mod3((byte) ((polynomial2.coeffs[i18] * sMod3) + r8[i18]));
            }
            for (int i19 = s18; i19 < length; i19++) {
                polynomial5.coeffs[i19] = mod3((byte) ((polynomial4.coeffs[i19] * sMod3) + r8[i19]));
            }
            int i20 = s18;
            while (i20 < i10) {
                short[] sArr7 = polynomial3.coeffs;
                int i21 = i20 + 1;
                sArr7[i20] = sArr7[i21];
                i20 = i21;
            }
            polynomial3.coeffs[i10] = s18;
            i13++;
            s10 = s18;
        }
        short s19 = s10;
        short s20 = polynomial2.coeffs[s19];
        for (int i22 = s19; i22 < i10; i22++) {
            this.coeffs[i22] = mod3((byte) (polynomial4.coeffs[(length - 2) - i22] * s20));
        }
        this.coeffs[i10] = s19;
    }
}
