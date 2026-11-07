package org.bouncycastle.pqc.crypto.crystals.kyber;

import org.bouncycastle.pqc.crypto.crystals.dilithium.DilithiumEngine;
import org.bouncycastle.util.Arrays;

/* loaded from: classes3.dex */
class PolyVec {
    private KyberEngine engine;
    private int kyberK;
    private int polyVecBytes;
    Poly[] vec;

    public PolyVec() throws Exception {
        throw new Exception("Requires Parameter");
    }

    public static void pointwiseAccountMontgomery(Poly poly, PolyVec polyVec, PolyVec polyVec2, KyberEngine kyberEngine) {
        Poly poly2 = new Poly(kyberEngine);
        Poly.baseMultMontgomery(poly, polyVec.getVectorIndex(0), polyVec2.getVectorIndex(0));
        for (int i10 = 1; i10 < kyberEngine.getKyberK(); i10++) {
            Poly.baseMultMontgomery(poly2, polyVec.getVectorIndex(i10), polyVec2.getVectorIndex(i10));
            poly.addCoeffs(poly2);
        }
        poly.reduce();
    }

    public void addPoly(PolyVec polyVec) {
        for (int i10 = 0; i10 < this.kyberK; i10++) {
            getVectorIndex(i10).addCoeffs(polyVec.getVectorIndex(i10));
        }
    }

    public byte[] compressPolyVec() {
        conditionalSubQ();
        byte[] bArr = new byte[this.engine.getKyberPolyVecCompressedBytes()];
        int i10 = 32;
        if (this.engine.getKyberPolyVecCompressedBytes() == this.kyberK * DilithiumEngine.DilithiumPolyT1PackedBytes) {
            short[] sArr = new short[4];
            int i11 = 0;
            for (int i12 = 0; i12 < this.kyberK; i12++) {
                for (int i13 = 0; i13 < 64; i13++) {
                    for (int i14 = 0; i14 < 4; i14++) {
                        sArr[i14] = (short) (((((getVectorIndex(i12).getCoeffIndex((i13 * 4) + i14) << 10) + 1665) * 1290167) >> 32) & 1023);
                    }
                    short s10 = sArr[0];
                    bArr[i11] = (byte) s10;
                    short s11 = sArr[1];
                    bArr[i11 + 1] = (byte) ((s10 >> 8) | (s11 << 2));
                    int i15 = s11 >> 6;
                    short s12 = sArr[2];
                    bArr[i11 + 2] = (byte) (i15 | (s12 << 4));
                    int i16 = s12 >> 4;
                    short s13 = sArr[3];
                    bArr[i11 + 3] = (byte) (i16 | (s13 << 6));
                    bArr[i11 + 4] = (byte) (s13 >> 2);
                    i11 += 5;
                }
            }
        } else {
            if (this.engine.getKyberPolyVecCompressedBytes() != this.kyberK * 352) {
                throw new RuntimeException("Kyber PolyVecCompressedBytes neither 320 * KyberK or 352 * KyberK!");
            }
            short[] sArr2 = new short[8];
            int i17 = 0;
            int i18 = 0;
            while (i17 < this.kyberK) {
                int i19 = 0;
                while (i19 < i10) {
                    for (int i20 = 0; i20 < 8; i20++) {
                        sArr2[i20] = (short) (((((getVectorIndex(i17).getCoeffIndex((i19 * 8) + i20) << 11) + 1664) * 645084) >> 31) & 2047);
                    }
                    short s14 = sArr2[0];
                    bArr[i18] = (byte) s14;
                    short s15 = sArr2[1];
                    bArr[i18 + 1] = (byte) ((s14 >> 8) | (s15 << 3));
                    short s16 = sArr2[2];
                    bArr[i18 + 2] = (byte) ((s15 >> 5) | (s16 << 6));
                    bArr[i18 + 3] = (byte) (s16 >> 2);
                    int i21 = s16 >> 10;
                    short s17 = sArr2[3];
                    bArr[i18 + 4] = (byte) (i21 | (s17 << 1));
                    short s18 = sArr2[4];
                    bArr[i18 + 5] = (byte) ((s17 >> 7) | (s18 << 4));
                    short s19 = sArr2[5];
                    bArr[i18 + 6] = (byte) ((s18 >> 4) | (s19 << 7));
                    bArr[i18 + 7] = (byte) (s19 >> 1);
                    int i22 = s19 >> 9;
                    short s20 = sArr2[6];
                    bArr[i18 + 8] = (byte) (i22 | (s20 << 2));
                    int i23 = s20 >> 6;
                    short s21 = sArr2[7];
                    bArr[i18 + 9] = (byte) (i23 | (s21 << 5));
                    bArr[i18 + 10] = (byte) (s21 >> 3);
                    i18 += 11;
                    i19++;
                    i10 = 32;
                }
                i17++;
                i10 = 32;
            }
        }
        return bArr;
    }

    public void conditionalSubQ() {
        for (int i10 = 0; i10 < this.kyberK; i10++) {
            getVectorIndex(i10).conditionalSubQ();
        }
    }

    public void decompressPolyVec(byte[] bArr) {
        int i10 = 3;
        int i11 = 6;
        short s10 = 2;
        short s11 = 4;
        short s12 = 1;
        if (this.engine.getKyberPolyVecCompressedBytes() == this.kyberK * DilithiumEngine.DilithiumPolyT1PackedBytes) {
            int i12 = 0;
            for (int i13 = 0; i13 < this.kyberK; i13++) {
                for (int i14 = 0; i14 < 64; i14++) {
                    int i15 = bArr[i12] & 255;
                    byte b10 = bArr[i12 + 1];
                    byte b11 = bArr[i12 + 2];
                    byte b12 = bArr[i12 + 3];
                    short[] sArr = {(short) (i15 | ((short) ((b10 & 255) << 8))), (short) (((b10 & 255) >> 2) | ((short) ((b11 & 255) << 6))), (short) (((b11 & 255) >> 4) | ((short) ((b12 & 255) << 4))), (short) (((b12 & 255) >> 6) | ((short) ((bArr[i12 + 4] & 255) << 2)))};
                    i12 += 5;
                    for (int i16 = 0; i16 < 4; i16++) {
                        this.vec[i13].setCoeffIndex((i14 * 4) + i16, (short) ((((sArr[i16] & 1023) * KyberEngine.KyberQ) + 512) >> 10));
                    }
                }
            }
            return;
        }
        if (this.engine.getKyberPolyVecCompressedBytes() != this.kyberK * 352) {
            throw new RuntimeException("Kyber PolyVecCompressedBytes neither 320 * KyberK or 352 * KyberK!");
        }
        int i17 = 0;
        for (int i18 = 0; i18 < this.kyberK; i18++) {
            int i19 = 0;
            while (i19 < 32) {
                int i20 = bArr[i17] & 255;
                byte b13 = bArr[i17 + 1];
                short s13 = (short) (i20 | (((short) (b13 & 255)) << 8));
                byte b14 = bArr[i17 + 2];
                short s14 = (short) (((b13 & 255) >> i10) | (((short) (b14 & 255)) << 5));
                int i21 = ((b14 & 255) >> i11) | (((short) (bArr[i17 + 3] & 255)) << s10);
                byte b15 = bArr[i17 + 4];
                int i22 = i10;
                short s15 = (short) (((short) ((b15 & 255) << 10)) | i21);
                int i23 = (b15 & 255) >> s12;
                byte b16 = bArr[i17 + 5];
                int i24 = i11;
                short s16 = (short) ((((short) (b16 & 255)) << 7) | i23);
                int i25 = (b16 & 255) >> s11;
                byte b17 = bArr[i17 + 6];
                short s17 = s10;
                short s18 = (short) ((((short) (b17 & 255)) << s11) | i25);
                int i26 = ((b17 & 255) >> 7) | (((short) (bArr[i17 + 7] & 255)) << s12);
                byte b18 = bArr[i17 + 8];
                short s19 = s11;
                short s20 = (short) (((short) ((b18 & 255) << 9)) | i26);
                int i27 = (b18 & 255) >> 2;
                byte b19 = bArr[i17 + 9];
                short s21 = s12;
                short s22 = (short) ((((short) (b19 & 255)) << 6) | i27);
                short s23 = (short) (((b19 & 255) >> 5) | (((short) (bArr[i17 + 10] & 255)) << 3));
                short[] sArr2 = new short[8];
                sArr2[0] = s13;
                sArr2[s21] = s14;
                sArr2[s17] = s15;
                sArr2[i22] = s16;
                sArr2[s19] = s18;
                sArr2[5] = s20;
                sArr2[i24] = s22;
                sArr2[7] = s23;
                i17 += 11;
                for (int i28 = 0; i28 < 8; i28++) {
                    this.vec[i18].setCoeffIndex((i19 * 8) + i28, (short) ((((sArr2[i28] & 2047) * KyberEngine.KyberQ) + 1024) >> 11));
                }
                i19++;
                i10 = i22;
                i11 = i24;
                s10 = s17;
                s11 = s19;
                s12 = s21;
            }
        }
    }

    public void fromBytes(byte[] bArr) {
        int i10 = 0;
        while (i10 < this.kyberK) {
            Poly vectorIndex = getVectorIndex(i10);
            int i11 = i10 * 384;
            i10++;
            vectorIndex.fromBytes(Arrays.copyOfRange(bArr, i11, i10 * 384));
        }
    }

    public Poly getVectorIndex(int i10) {
        return this.vec[i10];
    }

    public void polyVecInverseNttToMont() {
        for (int i10 = 0; i10 < this.kyberK; i10++) {
            getVectorIndex(i10).polyInverseNttToMont();
        }
    }

    public void polyVecNtt() {
        for (int i10 = 0; i10 < this.kyberK; i10++) {
            getVectorIndex(i10).polyNtt();
        }
    }

    public void reducePoly() {
        for (int i10 = 0; i10 < this.kyberK; i10++) {
            getVectorIndex(i10).reduce();
        }
    }

    public byte[] toBytes() {
        byte[] bArr = new byte[this.polyVecBytes];
        for (int i10 = 0; i10 < this.kyberK; i10++) {
            System.arraycopy(this.vec[i10].toBytes(), 0, bArr, i10 * 384, 384);
        }
        return bArr;
    }

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer("[");
        for (int i10 = 0; i10 < this.kyberK; i10++) {
            stringBuffer.append(this.vec[i10].toString());
            if (i10 != this.kyberK - 1) {
                stringBuffer.append(", ");
            }
        }
        stringBuffer.append("]");
        return stringBuffer.toString();
    }

    public PolyVec(KyberEngine kyberEngine) {
        this.engine = kyberEngine;
        this.kyberK = kyberEngine.getKyberK();
        this.polyVecBytes = kyberEngine.getKyberPolyVecBytes();
        this.vec = new Poly[this.kyberK];
        for (int i10 = 0; i10 < this.kyberK; i10++) {
            this.vec[i10] = new Poly(kyberEngine);
        }
    }
}
