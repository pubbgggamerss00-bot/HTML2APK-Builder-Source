package org.bouncycastle.pqc.crypto.bike;

import java.security.SecureRandom;
import org.bouncycastle.crypto.digests.SHA3Digest;
import org.bouncycastle.crypto.digests.SHAKEDigest;
import org.bouncycastle.util.Arrays;
import org.bouncycastle.util.Bytes;

/* loaded from: classes3.dex */
class BIKEEngine {
    private int L_BYTE;
    private int R2_BYTE;
    private int R_BYTE;
    private final BIKERing bikeRing;
    private int hw;
    private int nbIter;

    /* renamed from: r, reason: collision with root package name */
    private int f20308r;

    /* renamed from: t, reason: collision with root package name */
    private int f20309t;
    private int tau;

    /* renamed from: w, reason: collision with root package name */
    private int f20310w;

    public BIKEEngine(int i10, int i11, int i12, int i13, int i14, int i15) {
        this.f20308r = i10;
        this.f20310w = i11;
        this.f20309t = i12;
        this.nbIter = i14;
        this.tau = i15;
        this.hw = i11 / 2;
        this.L_BYTE = i13 / 8;
        this.R_BYTE = (i10 + 7) >>> 3;
        this.R2_BYTE = ((i10 * 2) + 7) >>> 3;
        this.bikeRing = new BIKERing(i10);
    }

    private void BFIter(byte[] bArr, byte[] bArr2, int i10, int[] iArr, int[] iArr2, int[] iArr3, int[] iArr4, byte[] bArr3, byte[] bArr4, byte[] bArr5) {
        ctrAll(iArr3, bArr, bArr5);
        int i11 = bArr5[0] & 255;
        int i12 = ((i11 - i10) >> 31) + 1;
        int i13 = ((i11 - (i10 - this.tau)) >> 31) + 1;
        byte b10 = (byte) i12;
        bArr2[0] = (byte) (bArr2[0] ^ b10);
        bArr3[0] = b10;
        bArr4[0] = (byte) i13;
        int i14 = 1;
        while (true) {
            int i15 = this.f20308r;
            if (i14 >= i15) {
                break;
            }
            int i16 = bArr5[i14] & 255;
            int i17 = ((i16 - i10) >> 31) + 1;
            int i18 = ((i16 - (i10 - this.tau)) >> 31) + 1;
            int i19 = i15 - i14;
            byte b11 = (byte) i17;
            bArr2[i19] = (byte) (bArr2[i19] ^ b11);
            bArr3[i14] = b11;
            bArr4[i14] = (byte) i18;
            i14++;
        }
        ctrAll(iArr4, bArr, bArr5);
        int i20 = bArr5[0] & 255;
        int i21 = ((i20 - i10) >> 31) + 1;
        int i22 = ((i20 - (i10 - this.tau)) >> 31) + 1;
        int i23 = this.f20308r;
        byte b12 = (byte) i21;
        bArr2[i23] = (byte) (bArr2[i23] ^ b12);
        bArr3[i23] = b12;
        bArr4[i23] = (byte) i22;
        int i24 = 1;
        while (true) {
            int i25 = this.f20308r;
            if (i24 >= i25) {
                break;
            }
            int i26 = bArr5[i24] & 255;
            int i27 = ((i26 - i10) >> 31) + 1;
            int i28 = ((i26 - (i10 - this.tau)) >> 31) + 1;
            int i29 = (i25 + i25) - i24;
            byte b13 = (byte) i27;
            bArr2[i29] = (byte) (bArr2[i29] ^ b13);
            bArr3[i25 + i24] = b13;
            bArr4[i25 + i24] = (byte) i28;
            i24++;
        }
        for (int i30 = 0; i30 < this.f20308r * 2; i30++) {
            recomputeSyndrome(bArr, i30, iArr, iArr2, bArr3[i30] != 0);
        }
    }

    private void BFIter2(byte[] bArr, byte[] bArr2, int i10, int[] iArr, int[] iArr2, int[] iArr3, int[] iArr4, byte[] bArr3) {
        int[] iArr5 = new int[this.f20308r * 2];
        ctrAll(iArr3, bArr, bArr3);
        int i11 = (((bArr3[0] & 255) - i10) >> 31) + 1;
        bArr2[0] = (byte) (bArr2[0] ^ ((byte) i11));
        iArr5[0] = i11;
        int i12 = 1;
        while (true) {
            int i13 = this.f20308r;
            if (i12 >= i13) {
                break;
            }
            int i14 = (((bArr3[i12] & 255) - i10) >> 31) + 1;
            int i15 = i13 - i12;
            bArr2[i15] = (byte) (bArr2[i15] ^ ((byte) i14));
            iArr5[i12] = i14;
            i12++;
        }
        ctrAll(iArr4, bArr, bArr3);
        int i16 = (((bArr3[0] & 255) - i10) >> 31) + 1;
        int i17 = this.f20308r;
        bArr2[i17] = (byte) (bArr2[i17] ^ ((byte) i16));
        iArr5[i17] = i16;
        int i18 = 1;
        while (true) {
            int i19 = this.f20308r;
            if (i18 >= i19) {
                break;
            }
            int i20 = (((bArr3[i18] & 255) - i10) >> 31) + 1;
            int i21 = (i19 + i19) - i18;
            bArr2[i21] = (byte) (bArr2[i21] ^ ((byte) i20));
            iArr5[i19 + i18] = i20;
            i18++;
        }
        for (int i22 = 0; i22 < this.f20308r * 2; i22++) {
            recomputeSyndrome(bArr, i22, iArr, iArr2, iArr5[i22] == 1);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r2v7, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v8 */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1, types: [boolean] */
    /* JADX WARN: Type inference failed for: r4v2 */
    private void BFMaskedIter(byte[] bArr, byte[] bArr2, byte[] bArr3, int i10, int[] iArr, int[] iArr2, int[] iArr3, int[] iArr4) {
        int[] iArr5 = new int[this.f20308r * 2];
        int i11 = 0;
        while (true) {
            if (i11 >= this.f20308r) {
                break;
            }
            if (bArr3[i11] == 1) {
                ?? r42 = ctr(iArr3, bArr, i11) < i10 ? 0 : 1;
                updateNewErrorIndex(bArr2, i11, r42);
                iArr5[i11] = r42;
            }
            i11++;
        }
        int i12 = 0;
        while (true) {
            int i13 = this.f20308r;
            if (i12 >= i13) {
                break;
            }
            if (bArr3[i13 + i12] == 1) {
                ?? r22 = ctr(iArr4, bArr, i12) >= i10 ? 1 : 0;
                updateNewErrorIndex(bArr2, this.f20308r + i12, r22);
                iArr5[this.f20308r + i12] = r22;
            }
            i12++;
        }
        int i14 = 0;
        while (i14 < this.f20308r * 2) {
            int[] iArr6 = iArr;
            int[] iArr7 = iArr2;
            byte[] bArr4 = bArr;
            recomputeSyndrome(bArr4, i14, iArr6, iArr7, iArr5[i14] == 1);
            i14++;
            bArr = bArr4;
            iArr2 = iArr7;
            iArr = iArr6;
        }
    }

    private byte[] BGFDecoder(byte[] bArr, int[] iArr, int[] iArr2) {
        byte[] bArr2 = new byte[this.f20308r * 2];
        int[] columnFromCompactVersion = getColumnFromCompactVersion(iArr);
        int[] columnFromCompactVersion2 = getColumnFromCompactVersion(iArr2);
        int i10 = this.f20308r;
        byte[] bArr3 = new byte[i10 * 2];
        byte[] bArr4 = new byte[i10];
        byte[] bArr5 = new byte[i10 * 2];
        BIKEEngine bIKEEngine = this;
        bIKEEngine.BFIter(bArr, bArr2, threshold(BIKEUtils.getHammingWeight(bArr), this.f20308r), iArr, iArr2, columnFromCompactVersion, columnFromCompactVersion2, bArr3, bArr5, bArr4);
        int i11 = 1;
        bIKEEngine.BFMaskedIter(bArr, bArr2, bArr3, ((bIKEEngine.hw + 1) / 2) + 1, iArr, iArr2, columnFromCompactVersion, columnFromCompactVersion2);
        bIKEEngine.BFMaskedIter(bArr, bArr2, bArr5, ((bIKEEngine.hw + 1) / 2) + 1, iArr, iArr2, columnFromCompactVersion, columnFromCompactVersion2);
        while (i11 < bIKEEngine.nbIter) {
            Arrays.fill(bArr3, (byte) 0);
            bIKEEngine.BFIter2(bArr, bArr2, threshold(BIKEUtils.getHammingWeight(bArr), bIKEEngine.f20308r), iArr, iArr2, columnFromCompactVersion, columnFromCompactVersion2, bArr4);
            i11++;
            bIKEEngine = this;
        }
        if (BIKEUtils.getHammingWeight(bArr) == 0) {
            return bArr2;
        }
        return null;
    }

    private byte[] computeSyndrome(byte[] bArr, byte[] bArr2) {
        long[] jArrCreate = this.bikeRing.create();
        long[] jArrCreate2 = this.bikeRing.create();
        this.bikeRing.decodeBytes(bArr, jArrCreate);
        this.bikeRing.decodeBytes(bArr2, jArrCreate2);
        this.bikeRing.multiply(jArrCreate, jArrCreate2, jArrCreate);
        return this.bikeRing.encodeBitsTransposed(jArrCreate);
    }

    private void convertToCompact(int[] iArr, byte[] bArr) {
        int i10;
        int i11 = 0;
        for (int i12 = 0; i12 < this.R_BYTE; i12++) {
            for (int i13 = 0; i13 < 8 && (i10 = (i12 * 8) + i13) != this.f20308r; i13++) {
                int i14 = (bArr[i12] >> i13) & 1;
                int i15 = -i14;
                iArr[i11] = (i10 & i15) | ((~i15) & iArr[i11]);
                i11 = (i11 + i14) % this.hw;
            }
        }
    }

    private int ctr(int[] iArr, byte[] bArr, int i10) {
        int i11 = this.hw - 4;
        int i12 = 0;
        int i13 = 0;
        while (i12 <= i11) {
            int i14 = iArr[i12] + i10;
            int i15 = this.f20308r;
            int i16 = i14 - i15;
            int i17 = (iArr[i12 + 1] + i10) - i15;
            int i18 = (iArr[i12 + 2] + i10) - i15;
            int i19 = (iArr[i12 + 3] + i10) - i15;
            i13 = i13 + (bArr[i16 + ((i16 >> 31) & i15)] & 255) + (bArr[i17 + ((i17 >> 31) & i15)] & 255) + (bArr[i18 + ((i18 >> 31) & i15)] & 255) + (bArr[i19 + (i15 & (i19 >> 31))] & 255);
            i12 += 4;
        }
        while (i12 < this.hw) {
            int i20 = iArr[i12] + i10;
            int i21 = this.f20308r;
            int i22 = i20 - i21;
            i13 += bArr[i22 + (i21 & (i22 >> 31))] & 255;
            i12++;
        }
        return i13;
    }

    private void ctrAll(int[] iArr, byte[] bArr, byte[] bArr2) {
        int i10 = iArr[0];
        int i11 = this.f20308r - i10;
        System.arraycopy(bArr, i10, bArr2, 0, i11);
        System.arraycopy(bArr, 0, bArr2, i11, i10);
        for (int i12 = 1; i12 < this.hw; i12++) {
            int i13 = iArr[i12];
            int i14 = this.f20308r - i13;
            int i15 = i14 - 4;
            int i16 = 0;
            while (i16 <= i15) {
                int i17 = i13 + i16;
                bArr2[i16] = (byte) (bArr2[i16] + (bArr[i17] & 255));
                int i18 = i16 + 1;
                bArr2[i18] = (byte) (bArr2[i18] + (bArr[i17 + 1] & 255));
                int i19 = i16 + 2;
                bArr2[i19] = (byte) (bArr2[i19] + (bArr[i17 + 2] & 255));
                int i20 = i16 + 3;
                bArr2[i20] = (byte) (bArr2[i20] + (bArr[i17 + 3] & 255));
                i16 += 4;
            }
            while (i16 < i14) {
                bArr2[i16] = (byte) (bArr2[i16] + (bArr[i13 + i16] & 255));
                i16++;
            }
            int i21 = this.f20308r - 4;
            int i22 = i14;
            while (i22 <= i21) {
                bArr2[i22] = (byte) (bArr2[i22] + (bArr[i22 - i14] & 255));
                int i23 = i22 + 1;
                bArr2[i23] = (byte) (bArr2[i23] + (bArr[i23 - i14] & 255));
                int i24 = i22 + 2;
                bArr2[i24] = (byte) (bArr2[i24] + (bArr[i24 - i14] & 255));
                int i25 = i22 + 3;
                bArr2[i25] = (byte) (bArr2[i25] + (bArr[i25 - i14] & 255));
                i22 += 4;
            }
            while (i22 < this.f20308r) {
                bArr2[i22] = (byte) (bArr2[i22] + (bArr[i22 - i14] & 255));
                i22++;
            }
        }
    }

    private byte[] functionH(byte[] bArr) {
        byte[] bArr2 = new byte[this.R_BYTE * 2];
        SHAKEDigest sHAKEDigest = new SHAKEDigest(256);
        sHAKEDigest.update(bArr, 0, bArr.length);
        BIKEUtils.generateRandomByteArray(bArr2, this.f20308r * 2, this.f20309t, sHAKEDigest);
        return bArr2;
    }

    private void functionK(byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4) {
        byte[] bArr5 = new byte[48];
        SHA3Digest sHA3Digest = new SHA3Digest(384);
        sHA3Digest.update(bArr, 0, bArr.length);
        sHA3Digest.update(bArr2, 0, bArr2.length);
        sHA3Digest.update(bArr3, 0, bArr3.length);
        sHA3Digest.doFinal(bArr5, 0);
        System.arraycopy(bArr5, 0, bArr4, 0, this.L_BYTE);
    }

    private void functionL(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        byte[] bArr4 = new byte[48];
        SHA3Digest sHA3Digest = new SHA3Digest(384);
        sHA3Digest.update(bArr, 0, bArr.length);
        sHA3Digest.update(bArr2, 0, bArr2.length);
        sHA3Digest.doFinal(bArr4, 0);
        System.arraycopy(bArr4, 0, bArr3, 0, this.L_BYTE);
    }

    private int[] getColumnFromCompactVersion(int[] iArr) {
        int[] iArr2 = new int[this.hw];
        int i10 = 0;
        if (iArr[0] != 0) {
            while (true) {
                int i11 = this.hw;
                if (i10 >= i11) {
                    break;
                }
                iArr2[i10] = this.f20308r - iArr[(i11 - 1) - i10];
                i10++;
            }
        } else {
            iArr2[0] = 0;
            int i12 = 1;
            while (true) {
                int i13 = this.hw;
                if (i12 >= i13) {
                    break;
                }
                iArr2[i12] = this.f20308r - iArr[i13 - i12];
                i12++;
            }
        }
        return iArr2;
    }

    private void recomputeSyndrome(byte[] bArr, int i10, int[] iArr, int[] iArr2, boolean z10) {
        int i11 = 0;
        if (i10 < this.f20308r) {
            while (i11 < this.hw) {
                int i12 = iArr[i11];
                if (i12 <= i10) {
                    int i13 = i10 - i12;
                    bArr[i13] = (byte) (bArr[i13] ^ (z10 ? 1 : 0));
                } else {
                    int i14 = (this.f20308r + i10) - i12;
                    bArr[i14] = (byte) (bArr[i14] ^ (z10 ? 1 : 0));
                }
                i11++;
            }
            return;
        }
        while (i11 < this.hw) {
            int i15 = iArr2[i11];
            int i16 = this.f20308r;
            if (i15 <= i10 - i16) {
                int i17 = (i10 - i16) - i15;
                bArr[i17] = (byte) (bArr[i17] ^ (z10 ? 1 : 0));
            } else {
                int i18 = (i10 - i16) + (i16 - i15);
                bArr[i18] = (byte) (bArr[i18] ^ (z10 ? 1 : 0));
            }
            i11++;
        }
    }

    private void splitEBytes(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        int i10 = this.f20308r & 7;
        int i11 = 0;
        System.arraycopy(bArr, 0, bArr2, 0, this.R_BYTE - 1);
        int i12 = this.R_BYTE;
        byte b10 = bArr[i12 - 1];
        byte b11 = (byte) ((-1) << i10);
        bArr2[i12 - 1] = (byte) ((~b11) & b10);
        byte b12 = (byte) (b10 & b11);
        while (true) {
            int i13 = this.R_BYTE;
            if (i11 >= i13) {
                return;
            }
            byte b13 = bArr[i13 + i11];
            bArr3[i11] = (byte) (((b12 & 255) >>> i10) | (b13 << (8 - i10)));
            i11++;
            b12 = b13;
        }
    }

    private int threshold(int i10, int i11) {
        if (i11 == 12323) {
            return thresholdFromParameters(i10, 0.0069722d, 13.53d, 36);
        }
        if (i11 == 24659) {
            return thresholdFromParameters(i10, 0.005265d, 15.2588d, 52);
        }
        if (i11 == 40973) {
            return thresholdFromParameters(i10, 0.00402312d, 17.8785d, 69);
        }
        throw new IllegalArgumentException();
    }

    private static int thresholdFromParameters(int i10, double d10, double d11, int i11) {
        return Math.max(i11, (int) Math.floor((d10 * i10) + d11));
    }

    private void updateNewErrorIndex(byte[] bArr, int i10, boolean z10) {
        int i11;
        if (i10 != 0 && i10 != (i11 = this.f20308r)) {
            i10 = i10 > i11 ? ((i11 * 2) - i10) + i11 : i11 - i10;
        }
        bArr[i10] = (byte) ((z10 ? 1 : 0) ^ bArr[i10]);
    }

    public void decaps(byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, byte[] bArr5, byte[] bArr6) {
        int i10 = this.hw;
        int[] iArr = new int[i10];
        int[] iArr2 = new int[i10];
        convertToCompact(iArr, bArr2);
        convertToCompact(iArr2, bArr3);
        byte[] bArrBGFDecoder = BGFDecoder(computeSyndrome(bArr5, bArr2), iArr, iArr2);
        byte[] bArr7 = new byte[this.R_BYTE * 2];
        BIKEUtils.fromBitArrayToByteArray(bArr7, bArrBGFDecoder, 0, this.f20308r * 2);
        int i11 = this.R_BYTE;
        byte[] bArr8 = new byte[i11];
        byte[] bArr9 = new byte[i11];
        splitEBytes(bArr7, bArr8, bArr9);
        byte[] bArr10 = new byte[this.L_BYTE];
        functionL(bArr8, bArr9, bArr10);
        Bytes.xorTo(this.L_BYTE, bArr6, bArr10);
        byte[] bArrFunctionH = functionH(bArr10);
        int i12 = this.R2_BYTE;
        if (Arrays.areEqual(bArr7, 0, i12, bArrFunctionH, 0, i12)) {
            functionK(bArr10, bArr5, bArr6, bArr);
        } else {
            functionK(bArr4, bArr5, bArr6, bArr);
        }
    }

    public void encaps(byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, SecureRandom secureRandom) {
        byte[] bArr5 = new byte[this.L_BYTE];
        secureRandom.nextBytes(bArr5);
        byte[] bArrFunctionH = functionH(bArr5);
        int i10 = this.R_BYTE;
        byte[] bArr6 = new byte[i10];
        byte[] bArr7 = new byte[i10];
        splitEBytes(bArrFunctionH, bArr6, bArr7);
        long[] jArrCreate = this.bikeRing.create();
        long[] jArrCreate2 = this.bikeRing.create();
        this.bikeRing.decodeBytes(bArr6, jArrCreate);
        this.bikeRing.decodeBytes(bArr7, jArrCreate2);
        long[] jArrCreate3 = this.bikeRing.create();
        this.bikeRing.decodeBytes(bArr4, jArrCreate3);
        this.bikeRing.multiply(jArrCreate3, jArrCreate2, jArrCreate3);
        this.bikeRing.add(jArrCreate3, jArrCreate, jArrCreate3);
        this.bikeRing.encodeBytes(jArrCreate3, bArr);
        functionL(bArr6, bArr7, bArr2);
        Bytes.xorTo(this.L_BYTE, bArr5, bArr2);
        functionK(bArr5, bArr, bArr2, bArr3);
    }

    public void genKeyPair(byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, SecureRandom secureRandom) {
        byte[] bArr5 = new byte[64];
        secureRandom.nextBytes(bArr5);
        SHAKEDigest sHAKEDigest = new SHAKEDigest(256);
        sHAKEDigest.update(bArr5, 0, this.L_BYTE);
        BIKEUtils.generateRandomByteArray(bArr, this.f20308r, this.hw, sHAKEDigest);
        BIKEUtils.generateRandomByteArray(bArr2, this.f20308r, this.hw, sHAKEDigest);
        long[] jArrCreate = this.bikeRing.create();
        long[] jArrCreate2 = this.bikeRing.create();
        this.bikeRing.decodeBytes(bArr, jArrCreate);
        this.bikeRing.decodeBytes(bArr2, jArrCreate2);
        long[] jArrCreate3 = this.bikeRing.create();
        this.bikeRing.inv(jArrCreate, jArrCreate3);
        this.bikeRing.multiply(jArrCreate3, jArrCreate2, jArrCreate3);
        this.bikeRing.encodeBytes(jArrCreate3, bArr4);
        System.arraycopy(bArr5, this.L_BYTE, bArr3, 0, bArr3.length);
    }

    public int getSessionKeySize() {
        return this.L_BYTE;
    }
}
