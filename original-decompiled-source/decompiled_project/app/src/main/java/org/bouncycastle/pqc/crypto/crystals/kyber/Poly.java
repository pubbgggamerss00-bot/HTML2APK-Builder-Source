package org.bouncycastle.pqc.crypto.crystals.kyber;

import org.bouncycastle.crypto.hpke.HPKE;
import org.jf.dexlib2.analysis.RegisterType;

/* loaded from: classes3.dex */
class Poly {
    private KyberEngine engine;
    private int eta1;
    private int polyCompressedBytes;
    private Symmetric symmetric;
    private short[] coeffs = new short[256];
    private int eta2 = KyberEngine.getKyberEta2();

    public Poly(KyberEngine kyberEngine) {
        this.engine = kyberEngine;
        this.polyCompressedBytes = kyberEngine.getKyberPolyCompressedBytes();
        this.eta1 = kyberEngine.getKyberEta1();
        this.symmetric = kyberEngine.getSymmetric();
    }

    public static void baseMultMontgomery(Poly poly, Poly poly2, Poly poly3) {
        for (int i10 = 0; i10 < 64; i10++) {
            int i11 = i10 * 4;
            short coeffIndex = poly2.getCoeffIndex(i11);
            int i12 = i11 + 1;
            short coeffIndex2 = poly2.getCoeffIndex(i12);
            short coeffIndex3 = poly3.getCoeffIndex(i11);
            short coeffIndex4 = poly3.getCoeffIndex(i12);
            short[] sArr = Ntt.nttZetas;
            int i13 = i10 + 64;
            Ntt.baseMult(poly, i11, coeffIndex, coeffIndex2, coeffIndex3, coeffIndex4, sArr[i13]);
            int i14 = i11 + 2;
            int i15 = i11 + 3;
            Ntt.baseMult(poly, i14, poly2.getCoeffIndex(i14), poly2.getCoeffIndex(i15), poly3.getCoeffIndex(i14), poly3.getCoeffIndex(i15), (short) (sArr[i13] * (-1)));
        }
    }

    public void addCoeffs(Poly poly) {
        for (int i10 = 0; i10 < 256; i10++) {
            setCoeffIndex(i10, (short) (getCoeffIndex(i10) + poly.getCoeffIndex(i10)));
        }
    }

    public byte[] compressPoly() {
        byte[] bArr = new byte[8];
        byte[] bArr2 = new byte[this.polyCompressedBytes];
        conditionalSubQ();
        int i10 = this.polyCompressedBytes;
        if (i10 == 128) {
            int i11 = 0;
            for (int i12 = 0; i12 < 32; i12++) {
                for (int i13 = 0; i13 < 8; i13++) {
                    bArr[i13] = (byte) (((((getCoeffIndex((i12 * 8) + i13) << 4) + 1665) * 80635) >> 28) & 15);
                }
                bArr2[i11] = (byte) (bArr[0] | (bArr[1] << 4));
                bArr2[i11 + 1] = (byte) (bArr[2] | (bArr[3] << 4));
                bArr2[i11 + 2] = (byte) (bArr[4] | (bArr[5] << 4));
                bArr2[i11 + 3] = (byte) (bArr[6] | (bArr[7] << 4));
                i11 += 4;
            }
        } else {
            if (i10 != 160) {
                throw new RuntimeException("PolyCompressedBytes is neither 128 or 160!");
            }
            int i14 = 0;
            for (int i15 = 0; i15 < 32; i15++) {
                for (int i16 = 0; i16 < 8; i16++) {
                    bArr[i16] = (byte) (((((getCoeffIndex((i15 * 8) + i16) << 5) + 1664) * 40318) >> 27) & 31);
                }
                bArr2[i14] = (byte) (bArr[0] | (bArr[1] << 5));
                bArr2[i14 + 1] = (byte) ((bArr[1] >> 3) | (bArr[2] << 2) | (bArr[3] << 7));
                bArr2[i14 + 2] = (byte) ((bArr[3] >> 1) | (bArr[4] << 4));
                bArr2[i14 + 3] = (byte) ((bArr[4] >> 4) | (bArr[5] << 1) | (bArr[6] << 6));
                bArr2[i14 + 4] = (byte) ((bArr[6] >> 2) | (bArr[7] << 3));
                i14 += 5;
            }
        }
        return bArr2;
    }

    public void conditionalSubQ() {
        for (int i10 = 0; i10 < 256; i10++) {
            setCoeffIndex(i10, Reduce.conditionalSubQ(getCoeffIndex(i10)));
        }
    }

    public void convertToMont() {
        for (int i10 = 0; i10 < 256; i10++) {
            setCoeffIndex(i10, Reduce.montgomeryReduce(getCoeffIndex(i10) * 1353));
        }
    }

    public void decompressPoly(byte[] bArr) {
        char c10 = 4;
        int i10 = 1;
        if (this.engine.getKyberPolyCompressedBytes() == 128) {
            int i11 = 0;
            for (int i12 = 0; i12 < 128; i12++) {
                int i13 = i12 * 2;
                setCoeffIndex(i13, (short) (((((short) (bArr[i11] & RegisterType.DOUBLE_HI)) * 3329) + 8) >> 4));
                setCoeffIndex(i13 + 1, (short) (((((short) ((bArr[i11] & 255) >> 4)) * 3329) + 8) >> 4));
                i11++;
            }
            return;
        }
        if (this.engine.getKyberPolyCompressedBytes() != 160) {
            throw new RuntimeException("PolyCompressedBytes is neither 128 or 160!");
        }
        int i14 = 0;
        int i15 = 0;
        while (i14 < 32) {
            byte b10 = bArr[i15];
            byte b11 = (byte) (b10 & 255);
            byte b12 = bArr[i15 + 1];
            byte b13 = (byte) (((b10 & 255) >> 5) | ((b12 & 255) << 3));
            byte b14 = (byte) ((b12 & 255) >> 2);
            byte b15 = bArr[i15 + 2];
            char c11 = c10;
            byte b16 = (byte) (((b15 & 255) << i10) | ((b12 & 255) >> 7));
            int i16 = (b15 & 255) >> 4;
            byte b17 = bArr[i15 + 3];
            int i17 = i10;
            byte b18 = (byte) (((b17 & 255) << 4) | i16);
            byte b19 = (byte) ((b17 & 255) >> 1);
            byte b20 = bArr[i15 + 4];
            byte b21 = (byte) (((b20 & 255) << 2) | ((b17 & 255) >> 6));
            byte[] bArr2 = new byte[8];
            bArr2[0] = b11;
            bArr2[i17] = b13;
            bArr2[2] = b14;
            bArr2[3] = b16;
            bArr2[c11] = b18;
            bArr2[5] = b19;
            bArr2[6] = b21;
            bArr2[7] = (byte) ((b20 & 255) >> 3);
            i15 += 5;
            for (int i18 = 0; i18 < 8; i18++) {
                setCoeffIndex((i14 * 8) + i18, (short) ((((bArr2[i18] & 31) * KyberEngine.KyberQ) + 16) >> 5));
            }
            i14++;
            c10 = c11;
            i10 = i17;
        }
    }

    public void fromBytes(byte[] bArr) {
        for (int i10 = 0; i10 < 128; i10++) {
            int i11 = i10 * 2;
            int i12 = i10 * 3;
            setCoeffIndex(i11, (short) (((bArr[i12] & 255) | ((bArr[i12 + 1] & 255) << 8)) & 4095));
            setCoeffIndex(i11 + 1, (short) ((((bArr[r4] & 255) >> 4) | ((bArr[i12 + 2] & 255) << 4)) & 4095));
        }
    }

    public void fromMsg(byte[] bArr) {
        if (bArr.length != 32) {
            throw new RuntimeException("KYBER_INDCPA_MSGBYTES must be equal to KYBER_N/8 bytes!");
        }
        for (int i10 = 0; i10 < 32; i10++) {
            for (int i11 = 0; i11 < 8; i11++) {
                setCoeffIndex((i10 * 8) + i11, (short) (((short) (((short) (((bArr[i10] & 255) >> i11) & 1)) * (-1))) & 1665));
            }
        }
    }

    public short getCoeffIndex(int i10) {
        return this.coeffs[i10];
    }

    public short[] getCoeffs() {
        return this.coeffs;
    }

    public void getEta1Noise(byte[] bArr, byte b10) {
        byte[] bArr2 = new byte[(this.eta1 * 256) / 4];
        this.symmetric.prf(bArr2, bArr, b10);
        CBD.kyberCBD(this, bArr2, this.eta1);
    }

    public void getEta2Noise(byte[] bArr, byte b10) {
        byte[] bArr2 = new byte[(this.eta2 * 256) / 4];
        this.symmetric.prf(bArr2, bArr, b10);
        CBD.kyberCBD(this, bArr2, this.eta2);
    }

    public void polyInverseNttToMont() {
        setCoeffs(Ntt.invNtt(getCoeffs()));
    }

    public void polyNtt() {
        setCoeffs(Ntt.ntt(getCoeffs()));
        reduce();
    }

    public void polySubtract(Poly poly) {
        for (int i10 = 0; i10 < 256; i10++) {
            setCoeffIndex(i10, (short) (poly.getCoeffIndex(i10) - getCoeffIndex(i10)));
        }
    }

    public void reduce() {
        for (int i10 = 0; i10 < 256; i10++) {
            setCoeffIndex(i10, Reduce.barretReduce(getCoeffIndex(i10)));
        }
    }

    public void setCoeffIndex(int i10, short s10) {
        this.coeffs[i10] = s10;
    }

    public void setCoeffs(short[] sArr) {
        this.coeffs = sArr;
    }

    public byte[] toBytes() {
        byte[] bArr = new byte[384];
        conditionalSubQ();
        for (int i10 = 0; i10 < 128; i10++) {
            int i11 = i10 * 2;
            short coeffIndex = getCoeffIndex(i11);
            short coeffIndex2 = getCoeffIndex(i11 + 1);
            int i12 = i10 * 3;
            bArr[i12] = (byte) coeffIndex;
            bArr[i12 + 1] = (byte) ((coeffIndex >> 8) | (coeffIndex2 << 4));
            bArr[i12 + 2] = (byte) (coeffIndex2 >> 4);
        }
        return bArr;
    }

    public byte[] toMsg() {
        byte[] bArr = new byte[KyberEngine.getKyberIndCpaMsgBytes()];
        conditionalSubQ();
        for (int i10 = 0; i10 < 32; i10++) {
            bArr[i10] = 0;
            for (int i11 = 0; i11 < 8; i11++) {
                bArr[i10] = (byte) (((byte) (((((((getCoeffIndex((i10 * 8) + i11) & HPKE.aead_EXPORT_ONLY) << 1) + 1665) * 80635) >> 28) & 1) << i11)) | bArr[i10]);
            }
        }
        return bArr;
    }

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer("[");
        int i10 = 0;
        while (true) {
            short[] sArr = this.coeffs;
            if (i10 >= sArr.length) {
                stringBuffer.append("]");
                return stringBuffer.toString();
            }
            stringBuffer.append((int) sArr[i10]);
            if (i10 != this.coeffs.length - 1) {
                stringBuffer.append(", ");
            }
            i10++;
        }
    }
}
