package org.bouncycastle.pqc.crypto.crystals.dilithium;

import org.bouncycastle.crypto.digests.SHAKEDigest;
import org.jf.dexlib2.analysis.RegisterType;

/* loaded from: classes3.dex */
class Poly {
    private final DilithiumEngine engine;
    private final int polyUniformNBlocks;
    private final Symmetric symmetric;
    private final int dilithiumN = 256;
    private int[] coeffs = new int[256];

    public Poly(DilithiumEngine dilithiumEngine) {
        this.engine = dilithiumEngine;
        Symmetric symmetricGetSymmetric = dilithiumEngine.GetSymmetric();
        this.symmetric = symmetricGetSymmetric;
        int i10 = symmetricGetSymmetric.stream128BlockBytes;
        this.polyUniformNBlocks = (i10 + 767) / i10;
    }

    private static int rejectEta(Poly poly, int i10, int i11, byte[] bArr, int i12, int i13) {
        int i14 = 0;
        int i15 = 0;
        while (i14 < i11 && i15 < i12) {
            byte b10 = bArr[i15];
            int i16 = b10 & RegisterType.DOUBLE_HI;
            i15++;
            int i17 = (b10 & 255) >> 4;
            if (i13 == 2) {
                if (i16 < 15) {
                    poly.setCoeffIndex(i10 + i14, 2 - (i16 - (((i16 * 205) >> 10) * 5)));
                    i14++;
                }
                if (i17 < 15 && i14 < i11) {
                    poly.setCoeffIndex(i10 + i14, 2 - (i17 - (((i17 * 205) >> 10) * 5)));
                    i14++;
                }
            } else if (i13 == 4) {
                if (i16 < 9) {
                    poly.setCoeffIndex(i10 + i14, 4 - i16);
                    i14++;
                }
                if (i17 < 9 && i14 < i11) {
                    poly.setCoeffIndex(i10 + i14, 4 - i17);
                    i14++;
                }
            }
        }
        return i14;
    }

    private static int rejectUniform(Poly poly, int i10, int i11, byte[] bArr, int i12) {
        int i13 = 0;
        int i14 = 0;
        while (i13 < i11 && i14 + 3 <= i12) {
            int i15 = i14 + 2;
            int i16 = ((bArr[i14 + 1] & 255) << 8) | (bArr[i14] & 255);
            i14 += 3;
            int i17 = (i16 | ((bArr[i15] & 255) << 16)) & 8388607;
            if (i17 < 8380417) {
                poly.setCoeffIndex(i10 + i13, i17);
                i13++;
            }
        }
        return i13;
    }

    private void unpackZ(byte[] bArr) {
        int i10 = 0;
        if (this.engine.getDilithiumGamma1() != 131072) {
            if (this.engine.getDilithiumGamma1() != 524288) {
                throw new RuntimeException("Wrong Dilithiumn Gamma1!");
            }
            while (i10 < this.dilithiumN / 2) {
                int i11 = i10 * 2;
                int i12 = i10 * 5;
                int i13 = i12 + 2;
                setCoeffIndex(i11, ((bArr[i12] & 255) | ((bArr[i12 + 1] & 255) << 8) | ((bArr[i13] & 255) << 16)) & 1048575);
                int i14 = i11 + 1;
                setCoeffIndex(i14, (((bArr[i12 + 4] & 255) << 12) | ((bArr[i13] & 255) >> 4) | ((bArr[i12 + 3] & 255) << 4)) & 1048575);
                setCoeffIndex(i11, this.engine.getDilithiumGamma1() - getCoeffIndex(i11));
                setCoeffIndex(i14, this.engine.getDilithiumGamma1() - getCoeffIndex(i14));
                i10++;
            }
            return;
        }
        while (i10 < this.dilithiumN / 4) {
            int i15 = i10 * 4;
            int i16 = i10 * 9;
            int i17 = i16 + 2;
            setCoeffIndex(i15, ((bArr[i16] & 255) | ((bArr[i16 + 1] & 255) << 8) | ((bArr[i17] & 255) << 16)) & 262143);
            int i18 = i15 + 1;
            int i19 = i16 + 4;
            setCoeffIndex(i18, (((bArr[i17] & 255) >> 2) | ((bArr[i16 + 3] & 255) << 6) | ((bArr[i19] & 255) << 14)) & 262143);
            int i20 = i15 + 2;
            int i21 = i16 + 6;
            setCoeffIndex(i20, (((bArr[i19] & 255) >> 4) | ((bArr[i16 + 5] & 255) << 4) | ((bArr[i21] & 255) << 12)) & 262143);
            int i22 = i15 + 3;
            setCoeffIndex(i22, (((bArr[i16 + 8] & 255) << 10) | ((bArr[i21] & 255) >> 6) | ((bArr[i16 + 7] & 255) << 2)) & 262143);
            setCoeffIndex(i15, this.engine.getDilithiumGamma1() - getCoeffIndex(i15));
            setCoeffIndex(i18, this.engine.getDilithiumGamma1() - getCoeffIndex(i18));
            setCoeffIndex(i20, this.engine.getDilithiumGamma1() - getCoeffIndex(i20));
            setCoeffIndex(i22, this.engine.getDilithiumGamma1() - getCoeffIndex(i22));
            i10++;
        }
    }

    public void addPoly(Poly poly) {
        for (int i10 = 0; i10 < this.dilithiumN; i10++) {
            setCoeffIndex(i10, getCoeffIndex(i10) + poly.getCoeffIndex(i10));
        }
    }

    public void challenge(byte[] bArr) {
        int i10;
        int i11;
        int i12;
        int i13;
        byte[] bArr2 = new byte[this.symmetric.stream256BlockBytes];
        SHAKEDigest sHAKEDigest = new SHAKEDigest(256);
        sHAKEDigest.update(bArr, 0, 32);
        sHAKEDigest.doOutput(bArr2, 0, this.symmetric.stream256BlockBytes);
        long j10 = 0;
        int i14 = 0;
        while (true) {
            i10 = 8;
            if (i14 >= 8) {
                break;
            }
            j10 |= (bArr2[i14] & 255) << (i14 * 8);
            i14++;
        }
        int i15 = 0;
        while (true) {
            i11 = this.dilithiumN;
            if (i15 >= i11) {
                break;
            }
            setCoeffIndex(i15, 0);
            i15++;
        }
        int dilithiumTau = i11 - this.engine.getDilithiumTau();
        while (dilithiumTau < this.dilithiumN) {
            while (true) {
                int i16 = this.symmetric.stream256BlockBytes;
                if (i10 >= i16) {
                    sHAKEDigest.doOutput(bArr2, 0, i16);
                    i10 = 0;
                }
                i12 = i10 + 1;
                i13 = bArr2[i10] & 255;
                if (i13 <= dilithiumTau) {
                    break;
                } else {
                    i10 = i12;
                }
            }
            setCoeffIndex(dilithiumTau, getCoeffIndex(i13));
            setCoeffIndex(i13, (int) (1 - ((j10 & 1) * 2)));
            j10 >>= 1;
            dilithiumTau++;
            i10 = i12;
        }
    }

    public boolean checkNorm(int i10) {
        if (i10 > 1047552) {
            return true;
        }
        for (int i11 = 0; i11 < this.dilithiumN; i11++) {
            if (getCoeffIndex(i11) - ((getCoeffIndex(i11) >> 31) & (getCoeffIndex(i11) * 2)) >= i10) {
                return true;
            }
        }
        return false;
    }

    public void conditionalAddQ() {
        for (int i10 = 0; i10 < this.dilithiumN; i10++) {
            setCoeffIndex(i10, Reduce.conditionalAddQ(getCoeffIndex(i10)));
        }
    }

    public void decompose(Poly poly) {
        for (int i10 = 0; i10 < this.dilithiumN; i10++) {
            int[] iArrDecompose = Rounding.decompose(getCoeffIndex(i10), this.engine.getDilithiumGamma2());
            setCoeffIndex(i10, iArrDecompose[1]);
            poly.setCoeffIndex(i10, iArrDecompose[0]);
        }
    }

    public int getCoeffIndex(int i10) {
        return this.coeffs[i10];
    }

    public int[] getCoeffs() {
        return this.coeffs;
    }

    public void invNttToMont() {
        setCoeffs(Ntt.invNttToMont(getCoeffs()));
    }

    public void pointwiseAccountMontgomery(PolyVecL polyVecL, PolyVecL polyVecL2) {
        Poly poly = new Poly(this.engine);
        pointwiseMontgomery(polyVecL.getVectorIndex(0), polyVecL2.getVectorIndex(0));
        for (int i10 = 1; i10 < this.engine.getDilithiumL(); i10++) {
            poly.pointwiseMontgomery(polyVecL.getVectorIndex(i10), polyVecL2.getVectorIndex(i10));
            addPoly(poly);
        }
    }

    public void pointwiseMontgomery(Poly poly, Poly poly2) {
        for (int i10 = 0; i10 < this.dilithiumN; i10++) {
            setCoeffIndex(i10, Reduce.montgomeryReduce(poly.getCoeffIndex(i10) * poly2.getCoeffIndex(i10)));
        }
    }

    public byte[] polyEtaPack(byte[] bArr, int i10) {
        byte[] bArr2 = new byte[8];
        if (this.engine.getDilithiumEta() == 2) {
            for (int i11 = 0; i11 < this.dilithiumN / 8; i11++) {
                int i12 = i11 * 8;
                bArr2[0] = (byte) (this.engine.getDilithiumEta() - getCoeffIndex(i12));
                bArr2[1] = (byte) (this.engine.getDilithiumEta() - getCoeffIndex(i12 + 1));
                bArr2[2] = (byte) (this.engine.getDilithiumEta() - getCoeffIndex(i12 + 2));
                bArr2[3] = (byte) (this.engine.getDilithiumEta() - getCoeffIndex(i12 + 3));
                bArr2[4] = (byte) (this.engine.getDilithiumEta() - getCoeffIndex(i12 + 4));
                bArr2[5] = (byte) (this.engine.getDilithiumEta() - getCoeffIndex(i12 + 5));
                bArr2[6] = (byte) (this.engine.getDilithiumEta() - getCoeffIndex(i12 + 6));
                bArr2[7] = (byte) (this.engine.getDilithiumEta() - getCoeffIndex(i12 + 7));
                int i13 = (i11 * 3) + i10;
                bArr[i13] = (byte) (bArr2[0] | (bArr2[1] << 3) | (bArr2[2] << 6));
                bArr[i13 + 1] = (byte) ((bArr2[3] << 1) | (bArr2[2] >> 2) | (bArr2[4] << 4) | (bArr2[5] << 7));
                bArr[i13 + 2] = (byte) ((bArr2[5] >> 1) | (bArr2[6] << 2) | (bArr2[7] << 5));
            }
        } else {
            if (this.engine.getDilithiumEta() != 4) {
                throw new RuntimeException("Eta needs to be 2 or 4!");
            }
            for (int i14 = 0; i14 < this.dilithiumN / 2; i14++) {
                int i15 = i14 * 2;
                bArr2[0] = (byte) (this.engine.getDilithiumEta() - getCoeffIndex(i15));
                byte dilithiumEta = (byte) (this.engine.getDilithiumEta() - getCoeffIndex(i15 + 1));
                bArr2[1] = dilithiumEta;
                bArr[i10 + i14] = (byte) ((dilithiumEta << 4) | bArr2[0]);
            }
        }
        return bArr;
    }

    public void polyEtaUnpack(byte[] bArr, int i10) {
        int dilithiumEta = this.engine.getDilithiumEta();
        int i11 = 0;
        if (this.engine.getDilithiumEta() != 2) {
            if (this.engine.getDilithiumEta() == 4) {
                while (i11 < this.dilithiumN / 2) {
                    int i12 = i11 * 2;
                    int i13 = i10 + i11;
                    setCoeffIndex(i12, bArr[i13] & RegisterType.DOUBLE_HI);
                    int i14 = i12 + 1;
                    setCoeffIndex(i14, (bArr[i13] & 255) >> 4);
                    setCoeffIndex(i12, dilithiumEta - getCoeffIndex(i12));
                    setCoeffIndex(i14, dilithiumEta - getCoeffIndex(i14));
                    i11++;
                }
                return;
            }
            return;
        }
        while (i11 < this.dilithiumN / 8) {
            int i15 = (i11 * 3) + i10;
            int i16 = i11 * 8;
            setCoeffIndex(i16, bArr[i15] & 7);
            int i17 = i16 + 1;
            setCoeffIndex(i17, ((bArr[i15] & 255) >> 3) & 7);
            int i18 = i16 + 2;
            int i19 = i15 + 1;
            setCoeffIndex(i18, ((bArr[i15] & 255) >> 6) | (((bArr[i19] & 255) << 2) & 7));
            int i20 = i16 + 3;
            setCoeffIndex(i20, ((bArr[i19] & 255) >> 1) & 7);
            int i21 = i16 + 4;
            setCoeffIndex(i21, ((bArr[i19] & 255) >> 4) & 7);
            int i22 = i16 + 5;
            int i23 = i15 + 2;
            setCoeffIndex(i22, ((bArr[i19] & 255) >> 7) | (((bArr[i23] & 255) << 1) & 7));
            int i24 = i16 + 6;
            setCoeffIndex(i24, ((bArr[i23] & 255) >> 2) & 7);
            int i25 = i16 + 7;
            setCoeffIndex(i25, ((bArr[i23] & 255) >> 5) & 7);
            setCoeffIndex(i16, dilithiumEta - getCoeffIndex(i16));
            setCoeffIndex(i17, dilithiumEta - getCoeffIndex(i17));
            setCoeffIndex(i18, dilithiumEta - getCoeffIndex(i18));
            setCoeffIndex(i20, dilithiumEta - getCoeffIndex(i20));
            setCoeffIndex(i21, dilithiumEta - getCoeffIndex(i21));
            setCoeffIndex(i22, dilithiumEta - getCoeffIndex(i22));
            setCoeffIndex(i24, dilithiumEta - getCoeffIndex(i24));
            setCoeffIndex(i25, dilithiumEta - getCoeffIndex(i25));
            i11++;
        }
    }

    public int polyMakeHint(Poly poly, Poly poly2) {
        int coeffIndex = 0;
        for (int i10 = 0; i10 < this.dilithiumN; i10++) {
            setCoeffIndex(i10, Rounding.makeHint(poly.getCoeffIndex(i10), poly2.getCoeffIndex(i10), this.engine));
            coeffIndex += getCoeffIndex(i10);
        }
        return coeffIndex;
    }

    public void polyNtt() {
        setCoeffs(Ntt.ntt(this.coeffs));
    }

    public void polyUseHint(Poly poly, Poly poly2) {
        for (int i10 = 0; i10 < this.dilithiumN; i10++) {
            setCoeffIndex(i10, Rounding.useHint(poly.getCoeffIndex(i10), poly2.getCoeffIndex(i10), this.engine.getDilithiumGamma2()));
        }
    }

    public byte[] polyt0Pack(byte[] bArr, int i10) {
        for (int i11 = 0; i11 < this.dilithiumN / 8; i11++) {
            int i12 = i11 * 8;
            int[] iArr = {4096 - getCoeffIndex(i12), 4096 - getCoeffIndex(i12 + 1), 4096 - getCoeffIndex(i12 + 2), 4096 - getCoeffIndex(i12 + 3), 4096 - getCoeffIndex(i12 + 4), 4096 - getCoeffIndex(i12 + 5), 4096 - getCoeffIndex(i12 + 6), 4096 - getCoeffIndex(i12 + 7)};
            int i13 = (i11 * 13) + i10;
            int i14 = iArr[0];
            bArr[i13] = (byte) i14;
            int i15 = i13 + 1;
            byte b10 = (byte) (i14 >> 8);
            bArr[i15] = b10;
            int i16 = iArr[1];
            bArr[i15] = (byte) (b10 | ((byte) (i16 << 5)));
            bArr[i13 + 2] = (byte) (i16 >> 3);
            int i17 = i13 + 3;
            byte b11 = (byte) (i16 >> 11);
            bArr[i17] = b11;
            int i18 = iArr[2];
            bArr[i17] = (byte) (b11 | ((byte) (i18 << 2)));
            int i19 = i13 + 4;
            byte b12 = (byte) (i18 >> 6);
            bArr[i19] = b12;
            int i20 = iArr[3];
            bArr[i19] = (byte) (b12 | ((byte) (i20 << 7)));
            bArr[i13 + 5] = (byte) (i20 >> 1);
            int i21 = i13 + 6;
            byte b13 = (byte) (i20 >> 9);
            bArr[i21] = b13;
            int i22 = iArr[4];
            bArr[i21] = (byte) (b13 | ((byte) (i22 << 4)));
            bArr[i13 + 7] = (byte) (i22 >> 4);
            int i23 = i13 + 8;
            byte b14 = (byte) (i22 >> 12);
            bArr[i23] = b14;
            int i24 = iArr[5];
            bArr[i23] = (byte) (b14 | ((byte) (i24 << 1)));
            int i25 = i13 + 9;
            byte b15 = (byte) (i24 >> 7);
            bArr[i25] = b15;
            int i26 = iArr[6];
            bArr[i25] = (byte) (b15 | ((byte) (i26 << 6)));
            bArr[i13 + 10] = (byte) (i26 >> 2);
            int i27 = i13 + 11;
            byte b16 = (byte) (i26 >> 10);
            bArr[i27] = b16;
            int i28 = iArr[7];
            bArr[i27] = (byte) (((byte) (i28 << 3)) | b16);
            bArr[i13 + 12] = (byte) (i28 >> 5);
        }
        return bArr;
    }

    public void polyt0Unpack(byte[] bArr, int i10) {
        for (int i11 = 0; i11 < this.dilithiumN / 8; i11++) {
            int i12 = (i11 * 13) + i10;
            int i13 = i11 * 8;
            int i14 = i12 + 1;
            setCoeffIndex(i13, ((bArr[i12] & 255) | ((bArr[i14] & 255) << 8)) & 8191);
            int i15 = i13 + 1;
            int i16 = i12 + 3;
            setCoeffIndex(i15, (((bArr[i14] & 255) >> 5) | ((bArr[i12 + 2] & 255) << 3) | ((bArr[i16] & 255) << 11)) & 8191);
            int i17 = i13 + 2;
            int i18 = i12 + 4;
            setCoeffIndex(i17, (((bArr[i16] & 255) >> 2) | ((bArr[i18] & 255) << 6)) & 8191);
            int i19 = i13 + 3;
            int i20 = i12 + 6;
            setCoeffIndex(i19, (((bArr[i18] & 255) >> 7) | ((bArr[i12 + 5] & 255) << 1) | ((bArr[i20] & 255) << 9)) & 8191);
            int i21 = i13 + 4;
            int i22 = i12 + 8;
            setCoeffIndex(i21, (((bArr[i20] & 255) >> 4) | ((bArr[i12 + 7] & 255) << 4) | ((bArr[i22] & 255) << 12)) & 8191);
            int i23 = i13 + 5;
            int i24 = i12 + 9;
            setCoeffIndex(i23, (((bArr[i22] & 255) >> 1) | ((bArr[i24] & 255) << 7)) & 8191);
            int i25 = i13 + 6;
            int i26 = i12 + 11;
            setCoeffIndex(i25, (((bArr[i24] & 255) >> 6) | ((bArr[i12 + 10] & 255) << 2) | ((bArr[i26] & 255) << 10)) & 8191);
            int i27 = i13 + 7;
            setCoeffIndex(i27, (((bArr[i12 + 12] & 255) << 5) | ((bArr[i26] & 255) >> 3)) & 8191);
            setCoeffIndex(i13, 4096 - getCoeffIndex(i13));
            setCoeffIndex(i15, 4096 - getCoeffIndex(i15));
            setCoeffIndex(i17, 4096 - getCoeffIndex(i17));
            setCoeffIndex(i19, 4096 - getCoeffIndex(i19));
            setCoeffIndex(i21, 4096 - getCoeffIndex(i21));
            setCoeffIndex(i23, 4096 - getCoeffIndex(i23));
            setCoeffIndex(i25, 4096 - getCoeffIndex(i25));
            setCoeffIndex(i27, 4096 - getCoeffIndex(i27));
        }
    }

    public byte[] polyt1Pack() {
        byte[] bArr = new byte[DilithiumEngine.DilithiumPolyT1PackedBytes];
        for (int i10 = 0; i10 < this.dilithiumN / 4; i10++) {
            int i11 = i10 * 5;
            int[] iArr = this.coeffs;
            int i12 = i10 * 4;
            int i13 = iArr[i12];
            bArr[i11] = (byte) i13;
            int i14 = iArr[i12 + 1];
            bArr[i11 + 1] = (byte) ((i13 >> 8) | (i14 << 2));
            int i15 = i14 >> 6;
            int i16 = iArr[i12 + 2];
            bArr[i11 + 2] = (byte) (i15 | (i16 << 4));
            int i17 = iArr[i12 + 3];
            bArr[i11 + 3] = (byte) ((i17 << 6) | (i16 >> 4));
            bArr[i11 + 4] = (byte) (i17 >> 2);
        }
        return bArr;
    }

    public void polyt1Unpack(byte[] bArr) {
        for (int i10 = 0; i10 < this.dilithiumN / 4; i10++) {
            int i11 = i10 * 4;
            int i12 = i10 * 5;
            int i13 = i12 + 1;
            setCoeffIndex(i11, ((bArr[i12] & 255) | ((bArr[i13] & 255) << 8)) & 1023);
            int i14 = i12 + 2;
            setCoeffIndex(i11 + 1, (((bArr[i13] & 255) >> 2) | ((bArr[i14] & 255) << 6)) & 1023);
            int i15 = (bArr[i14] & 255) >> 4;
            int i16 = i12 + 3;
            setCoeffIndex(i11 + 2, (i15 | ((bArr[i16] & 255) << 4)) & 1023);
            setCoeffIndex(i11 + 3, (((bArr[i12 + 4] & 255) << 2) | ((bArr[i16] & 255) >> 6)) & 1023);
        }
    }

    public void power2Round(Poly poly) {
        for (int i10 = 0; i10 < this.dilithiumN; i10++) {
            int[] iArrPower2Round = Rounding.power2Round(getCoeffIndex(i10));
            setCoeffIndex(i10, iArrPower2Round[0]);
            poly.setCoeffIndex(i10, iArrPower2Round[1]);
        }
    }

    public void reduce() {
        for (int i10 = 0; i10 < this.dilithiumN; i10++) {
            setCoeffIndex(i10, Reduce.reduce32(getCoeffIndex(i10)));
        }
    }

    public void setCoeffIndex(int i10, int i11) {
        this.coeffs[i10] = i11;
    }

    public void setCoeffs(int[] iArr) {
        this.coeffs = iArr;
    }

    public void shiftLeft() {
        for (int i10 = 0; i10 < this.dilithiumN; i10++) {
            setCoeffIndex(i10, getCoeffIndex(i10) << 13);
        }
    }

    public void subtract(Poly poly) {
        for (int i10 = 0; i10 < this.dilithiumN; i10++) {
            setCoeffIndex(i10, getCoeffIndex(i10) - poly.getCoeffIndex(i10));
        }
    }

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer("[");
        int i10 = 0;
        while (true) {
            int[] iArr = this.coeffs;
            if (i10 >= iArr.length) {
                stringBuffer.append("]");
                return stringBuffer.toString();
            }
            stringBuffer.append(iArr[i10]);
            if (i10 != this.coeffs.length - 1) {
                stringBuffer.append(", ");
            }
            i10++;
        }
    }

    public void uniformBlocks(byte[] bArr, short s10) {
        int i10 = this.polyUniformNBlocks;
        Symmetric symmetric = this.symmetric;
        int i11 = i10 * symmetric.stream128BlockBytes;
        byte[] bArr2 = new byte[i11 + 2];
        symmetric.stream128init(bArr, s10);
        this.symmetric.stream128squeezeBlocks(bArr2, 0, i11);
        int iRejectUniform = rejectUniform(this, 0, this.dilithiumN, bArr2, i11);
        while (iRejectUniform < this.dilithiumN) {
            int i12 = i11 % 3;
            for (int i13 = 0; i13 < i12; i13++) {
                bArr2[i13] = bArr2[(i11 - i12) + i13];
            }
            Symmetric symmetric2 = this.symmetric;
            symmetric2.stream128squeezeBlocks(bArr2, i12, symmetric2.stream128BlockBytes);
            i11 = this.symmetric.stream128BlockBytes + i12;
            iRejectUniform += rejectUniform(this, iRejectUniform, this.dilithiumN - iRejectUniform, bArr2, i11);
        }
    }

    public void uniformEta(byte[] bArr, short s10) {
        int i10;
        int i11;
        int dilithiumEta = this.engine.getDilithiumEta();
        if (this.engine.getDilithiumEta() == 2) {
            i10 = this.symmetric.stream256BlockBytes;
            i11 = i10 + 135;
        } else {
            if (this.engine.getDilithiumEta() != 4) {
                throw new RuntimeException("Wrong Dilithium Eta!");
            }
            i10 = this.symmetric.stream256BlockBytes;
            i11 = i10 + 226;
        }
        int i12 = i11 / i10;
        Symmetric symmetric = this.symmetric;
        int i13 = i12 * symmetric.stream256BlockBytes;
        byte[] bArr2 = new byte[i13];
        symmetric.stream256init(bArr, s10);
        this.symmetric.stream256squeezeBlocks(bArr2, 0, i13);
        Poly poly = this;
        int iRejectEta = rejectEta(poly, 0, this.dilithiumN, bArr2, i13, dilithiumEta);
        while (iRejectEta < 256) {
            Symmetric symmetric2 = poly.symmetric;
            symmetric2.stream256squeezeBlocks(bArr2, 0, symmetric2.stream256BlockBytes);
            iRejectEta += rejectEta(poly, iRejectEta, poly.dilithiumN - iRejectEta, bArr2, poly.symmetric.stream256BlockBytes, dilithiumEta);
            poly = this;
        }
    }

    public void uniformGamma1(byte[] bArr, short s10) {
        int polyUniformGamma1NBlocks = this.engine.getPolyUniformGamma1NBlocks();
        Symmetric symmetric = this.symmetric;
        byte[] bArr2 = new byte[polyUniformGamma1NBlocks * symmetric.stream256BlockBytes];
        symmetric.stream256init(bArr, s10);
        this.symmetric.stream256squeezeBlocks(bArr2, 0, this.engine.getPolyUniformGamma1NBlocks() * this.symmetric.stream256BlockBytes);
        unpackZ(bArr2);
    }

    public byte[] w1Pack() {
        byte[] bArr = new byte[this.engine.getDilithiumPolyW1PackedBytes()];
        int i10 = 0;
        if (this.engine.getDilithiumGamma2() == 95232) {
            while (i10 < this.dilithiumN / 4) {
                int i11 = i10 * 3;
                int i12 = i10 * 4;
                int i13 = i12 + 1;
                bArr[i11] = (byte) (((byte) getCoeffIndex(i12)) | (getCoeffIndex(i13) << 6));
                int i14 = i12 + 2;
                bArr[i11 + 1] = (byte) (((byte) (getCoeffIndex(i13) >> 2)) | (getCoeffIndex(i14) << 4));
                bArr[i11 + 2] = (byte) ((getCoeffIndex(i12 + 3) << 2) | ((byte) (getCoeffIndex(i14) >> 4)));
                i10++;
            }
        } else if (this.engine.getDilithiumGamma2() == 261888) {
            while (i10 < this.dilithiumN / 2) {
                int i15 = i10 * 2;
                bArr[i10] = (byte) ((getCoeffIndex(i15 + 1) << 4) | getCoeffIndex(i15));
                i10++;
            }
        }
        return bArr;
    }

    public byte[] zPack() {
        byte[] bArr = new byte[this.engine.getDilithiumPolyZPackedBytes()];
        int[] iArr = new int[4];
        if (this.engine.getDilithiumGamma1() == 131072) {
            for (int i10 = 0; i10 < this.dilithiumN / 4; i10++) {
                int i11 = i10 * 4;
                iArr[0] = this.engine.getDilithiumGamma1() - getCoeffIndex(i11);
                iArr[1] = this.engine.getDilithiumGamma1() - getCoeffIndex(i11 + 1);
                iArr[2] = this.engine.getDilithiumGamma1() - getCoeffIndex(i11 + 2);
                int dilithiumGamma1 = this.engine.getDilithiumGamma1() - getCoeffIndex(i11 + 3);
                iArr[3] = dilithiumGamma1;
                int i12 = i10 * 9;
                int i13 = iArr[0];
                bArr[i12] = (byte) i13;
                bArr[i12 + 1] = (byte) (i13 >> 8);
                int i14 = iArr[1];
                bArr[i12 + 2] = (byte) (((byte) (i13 >> 16)) | (i14 << 2));
                bArr[i12 + 3] = (byte) (i14 >> 6);
                byte b10 = (byte) (i14 >> 14);
                int i15 = iArr[2];
                bArr[i12 + 4] = (byte) (b10 | (i15 << 4));
                bArr[i12 + 5] = (byte) (i15 >> 4);
                bArr[i12 + 6] = (byte) (((byte) (i15 >> 12)) | (dilithiumGamma1 << 6));
                bArr[i12 + 7] = (byte) (dilithiumGamma1 >> 2);
                bArr[i12 + 8] = (byte) (dilithiumGamma1 >> 10);
            }
        } else {
            if (this.engine.getDilithiumGamma1() != 524288) {
                throw new RuntimeException("Wrong Dilithium Gamma1!");
            }
            for (int i16 = 0; i16 < this.dilithiumN / 2; i16++) {
                int i17 = i16 * 2;
                iArr[0] = this.engine.getDilithiumGamma1() - getCoeffIndex(i17);
                int dilithiumGamma12 = this.engine.getDilithiumGamma1() - getCoeffIndex(i17 + 1);
                iArr[1] = dilithiumGamma12;
                int i18 = i16 * 5;
                int i19 = iArr[0];
                bArr[i18] = (byte) i19;
                bArr[i18 + 1] = (byte) (i19 >> 8);
                bArr[i18 + 2] = (byte) (((byte) (i19 >> 16)) | (dilithiumGamma12 << 4));
                bArr[i18 + 3] = (byte) (dilithiumGamma12 >> 4);
                bArr[i18 + 4] = (byte) (dilithiumGamma12 >> 12);
            }
        }
        return bArr;
    }

    public void zUnpack(byte[] bArr) {
        int i10 = 0;
        if (this.engine.getDilithiumGamma1() != 131072) {
            if (this.engine.getDilithiumGamma1() != 524288) {
                throw new RuntimeException("Wrong Dilithium Gamma1!");
            }
            while (i10 < this.dilithiumN / 2) {
                int i11 = i10 * 2;
                int i12 = i10 * 5;
                int i13 = i12 + 2;
                setCoeffIndex(i11, ((bArr[i12] & 255) | ((bArr[i12 + 1] & 255) << 8) | ((bArr[i13] & 255) << 16)) & 1048575);
                int i14 = i11 + 1;
                setCoeffIndex(i14, (((bArr[i12 + 4] & 255) << 12) | ((bArr[i13] & 255) >>> 4) | ((bArr[i12 + 3] & 255) << 4)) & 1048575);
                setCoeffIndex(i11, this.engine.getDilithiumGamma1() - getCoeffIndex(i11));
                setCoeffIndex(i14, this.engine.getDilithiumGamma1() - getCoeffIndex(i14));
                i10++;
            }
            return;
        }
        while (i10 < this.dilithiumN / 4) {
            int i15 = i10 * 4;
            int i16 = i10 * 9;
            int i17 = i16 + 2;
            setCoeffIndex(i15, ((bArr[i16] & 255) | ((bArr[i16 + 1] & 255) << 8) | ((bArr[i17] & 255) << 16)) & 262143);
            int i18 = i15 + 1;
            int i19 = i16 + 4;
            setCoeffIndex(i18, (((bArr[i17] & 255) >>> 2) | ((bArr[i16 + 3] & 255) << 6) | ((bArr[i19] & 255) << 14)) & 262143);
            int i20 = i15 + 2;
            int i21 = i16 + 6;
            setCoeffIndex(i20, (((bArr[i19] & 255) >>> 4) | ((bArr[i16 + 5] & 255) << 4) | ((bArr[i21] & 255) << 12)) & 262143);
            int i22 = i15 + 3;
            setCoeffIndex(i22, (((bArr[i16 + 8] & 255) << 10) | ((bArr[i21] & 255) >>> 6) | ((bArr[i16 + 7] & 255) << 2)) & 262143);
            setCoeffIndex(i15, this.engine.getDilithiumGamma1() - getCoeffIndex(i15));
            setCoeffIndex(i18, this.engine.getDilithiumGamma1() - getCoeffIndex(i18));
            setCoeffIndex(i20, this.engine.getDilithiumGamma1() - getCoeffIndex(i20));
            setCoeffIndex(i22, this.engine.getDilithiumGamma1() - getCoeffIndex(i22));
            i10++;
        }
    }
}
