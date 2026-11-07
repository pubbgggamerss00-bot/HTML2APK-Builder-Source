package org.bouncycastle.crypto.engines;

import org.bouncycastle.asn1.cmc.BodyPartID;
import org.bouncycastle.util.Integers;
import org.bouncycastle.util.Pack;

/* loaded from: classes2.dex */
public class ChaChaEngine extends Salsa20Engine {
    public ChaChaEngine() {
    }

    public static void chachaCore(int i10, int[] iArr, int[] iArr2) {
        int i11 = 16;
        if (iArr.length != 16) {
            throw new IllegalArgumentException();
        }
        if (iArr2.length != 16) {
            throw new IllegalArgumentException();
        }
        if (i10 % 2 != 0) {
            throw new IllegalArgumentException("Number of rounds must be even");
        }
        int i12 = iArr[0];
        int i13 = iArr[1];
        int i14 = iArr[2];
        char c10 = 3;
        int i15 = iArr[3];
        char c11 = 4;
        int i16 = iArr[4];
        char c12 = 5;
        int i17 = iArr[5];
        char c13 = 6;
        int i18 = iArr[6];
        int i19 = 7;
        int i20 = iArr[7];
        int i21 = 8;
        int i22 = iArr[8];
        int i23 = iArr[9];
        int i24 = iArr[10];
        int i25 = iArr[11];
        int i26 = 12;
        int i27 = iArr[12];
        int i28 = iArr[13];
        int i29 = iArr[14];
        int iRotateLeft = iArr[15];
        int iRotateLeft2 = i29;
        int iRotateLeft3 = i28;
        int iRotateLeft4 = i27;
        int i30 = i25;
        int i31 = i24;
        int i32 = i23;
        int i33 = i22;
        int iRotateLeft5 = i20;
        int iRotateLeft6 = i18;
        int iRotateLeft7 = i17;
        int iRotateLeft8 = i16;
        int i34 = i15;
        int i35 = i14;
        int i36 = i13;
        int i37 = i12;
        int i38 = i10;
        while (i38 > 0) {
            int i39 = i37 + iRotateLeft8;
            char c14 = c10;
            int iRotateLeft9 = Integers.rotateLeft(iRotateLeft4 ^ i39, i11);
            int i40 = i33 + iRotateLeft9;
            int iRotateLeft10 = Integers.rotateLeft(iRotateLeft8 ^ i40, i26);
            int i41 = i39 + iRotateLeft10;
            int iRotateLeft11 = Integers.rotateLeft(iRotateLeft9 ^ i41, i21);
            int i42 = i40 + iRotateLeft11;
            int iRotateLeft12 = Integers.rotateLeft(iRotateLeft10 ^ i42, i19);
            int i43 = i36 + iRotateLeft7;
            char c15 = c11;
            int iRotateLeft13 = Integers.rotateLeft(iRotateLeft3 ^ i43, i11);
            int i44 = i32 + iRotateLeft13;
            char c16 = c12;
            int iRotateLeft14 = Integers.rotateLeft(iRotateLeft7 ^ i44, i26);
            int i45 = i43 + iRotateLeft14;
            int iRotateLeft15 = Integers.rotateLeft(iRotateLeft13 ^ i45, i21);
            int i46 = i44 + iRotateLeft15;
            int iRotateLeft16 = Integers.rotateLeft(iRotateLeft14 ^ i46, i19);
            int i47 = i35 + iRotateLeft6;
            char c17 = c13;
            int iRotateLeft17 = Integers.rotateLeft(iRotateLeft2 ^ i47, i11);
            int i48 = i31 + iRotateLeft17;
            int iRotateLeft18 = Integers.rotateLeft(iRotateLeft6 ^ i48, i26);
            int i49 = i47 + iRotateLeft18;
            int iRotateLeft19 = Integers.rotateLeft(iRotateLeft17 ^ i49, i21);
            int i50 = i48 + iRotateLeft19;
            int iRotateLeft20 = Integers.rotateLeft(iRotateLeft18 ^ i50, i19);
            int i51 = i34 + iRotateLeft5;
            int iRotateLeft21 = Integers.rotateLeft(iRotateLeft ^ i51, 16);
            int i52 = i30 + iRotateLeft21;
            int iRotateLeft22 = Integers.rotateLeft(iRotateLeft5 ^ i52, i26);
            int i53 = i51 + iRotateLeft22;
            int iRotateLeft23 = Integers.rotateLeft(iRotateLeft21 ^ i53, 8);
            int i54 = i52 + iRotateLeft23;
            int iRotateLeft24 = Integers.rotateLeft(iRotateLeft22 ^ i54, 7);
            int i55 = i41 + iRotateLeft16;
            int iRotateLeft25 = Integers.rotateLeft(iRotateLeft23 ^ i55, 16);
            int i56 = i50 + iRotateLeft25;
            int iRotateLeft26 = Integers.rotateLeft(iRotateLeft16 ^ i56, 12);
            i37 = i55 + iRotateLeft26;
            iRotateLeft = Integers.rotateLeft(iRotateLeft25 ^ i37, 8);
            i31 = i56 + iRotateLeft;
            iRotateLeft7 = Integers.rotateLeft(iRotateLeft26 ^ i31, 7);
            int i57 = i45 + iRotateLeft20;
            int iRotateLeft27 = Integers.rotateLeft(iRotateLeft11 ^ i57, 16);
            int i58 = i54 + iRotateLeft27;
            int iRotateLeft28 = Integers.rotateLeft(iRotateLeft20 ^ i58, 12);
            i36 = i57 + iRotateLeft28;
            iRotateLeft4 = Integers.rotateLeft(iRotateLeft27 ^ i36, 8);
            i30 = i58 + iRotateLeft4;
            iRotateLeft6 = Integers.rotateLeft(iRotateLeft28 ^ i30, 7);
            int i59 = i49 + iRotateLeft24;
            int iRotateLeft29 = Integers.rotateLeft(iRotateLeft15 ^ i59, 16);
            int i60 = i42 + iRotateLeft29;
            int iRotateLeft30 = Integers.rotateLeft(iRotateLeft24 ^ i60, 12);
            i35 = i59 + iRotateLeft30;
            iRotateLeft3 = Integers.rotateLeft(iRotateLeft29 ^ i35, 8);
            i33 = i60 + iRotateLeft3;
            iRotateLeft5 = Integers.rotateLeft(iRotateLeft30 ^ i33, 7);
            int i61 = i53 + iRotateLeft12;
            int iRotateLeft31 = Integers.rotateLeft(iRotateLeft19 ^ i61, 16);
            int i62 = i46 + iRotateLeft31;
            int iRotateLeft32 = Integers.rotateLeft(iRotateLeft12 ^ i62, 12);
            i34 = i61 + iRotateLeft32;
            iRotateLeft2 = Integers.rotateLeft(iRotateLeft31 ^ i34, 8);
            i32 = i62 + iRotateLeft2;
            iRotateLeft8 = Integers.rotateLeft(iRotateLeft32 ^ i32, 7);
            i38 -= 2;
            i11 = 16;
            c10 = c14;
            c11 = c15;
            c12 = c16;
            c13 = c17;
            i19 = 7;
            i21 = 8;
            i26 = 12;
        }
        char c18 = c10;
        char c19 = c11;
        char c20 = c12;
        char c21 = c13;
        iArr2[0] = i37 + iArr[0];
        iArr2[1] = i36 + iArr[1];
        iArr2[2] = i35 + iArr[2];
        iArr2[c18] = i34 + iArr[c18];
        iArr2[c19] = iRotateLeft8 + iArr[c19];
        iArr2[c20] = iRotateLeft7 + iArr[c20];
        iArr2[c21] = iRotateLeft6 + iArr[c21];
        iArr2[7] = iRotateLeft5 + iArr[7];
        iArr2[8] = i33 + iArr[8];
        iArr2[9] = i32 + iArr[9];
        iArr2[10] = i31 + iArr[10];
        iArr2[11] = i30 + iArr[11];
        iArr2[12] = iRotateLeft4 + iArr[12];
        iArr2[13] = iRotateLeft3 + iArr[13];
        iArr2[14] = iRotateLeft2 + iArr[14];
        iArr2[15] = iRotateLeft + iArr[15];
    }

    @Override // org.bouncycastle.crypto.engines.Salsa20Engine
    public void advanceCounter() {
        int[] iArr = this.engineState;
        int i10 = iArr[12] + 1;
        iArr[12] = i10;
        if (i10 == 0) {
            iArr[13] = iArr[13] + 1;
        }
    }

    @Override // org.bouncycastle.crypto.engines.Salsa20Engine
    public void generateKeyStream(byte[] bArr) {
        chachaCore(this.rounds, this.engineState, this.f19991x);
        Pack.intToLittleEndian(this.f19991x, bArr, 0);
    }

    @Override // org.bouncycastle.crypto.engines.Salsa20Engine, org.bouncycastle.crypto.StreamCipher
    public String getAlgorithmName() {
        return "ChaCha" + this.rounds;
    }

    @Override // org.bouncycastle.crypto.engines.Salsa20Engine
    public long getCounter() {
        int[] iArr = this.engineState;
        return (iArr[13] << 32) | (iArr[12] & BodyPartID.bodyIdMax);
    }

    @Override // org.bouncycastle.crypto.engines.Salsa20Engine
    public void resetCounter() {
        int[] iArr = this.engineState;
        iArr[13] = 0;
        iArr[12] = 0;
    }

    @Override // org.bouncycastle.crypto.engines.Salsa20Engine
    public void retreatCounter() {
        int[] iArr = this.engineState;
        int i10 = iArr[12];
        if (i10 == 0 && iArr[13] == 0) {
            throw new IllegalStateException("attempt to reduce counter past zero.");
        }
        int i11 = i10 - 1;
        iArr[12] = i11;
        if (i11 == -1) {
            iArr[13] = iArr[13] - 1;
        }
    }

    @Override // org.bouncycastle.crypto.engines.Salsa20Engine
    public void setKey(byte[] bArr, byte[] bArr2) {
        if (bArr != null) {
            if (bArr.length != 16 && bArr.length != 32) {
                throw new IllegalArgumentException(getAlgorithmName() + " requires 128 bit or 256 bit key");
            }
            packTauOrSigma(bArr.length, this.engineState, 0);
            Pack.littleEndianToInt(bArr, 0, this.engineState, 4, 4);
            Pack.littleEndianToInt(bArr, bArr.length - 16, this.engineState, 8, 4);
        }
        Pack.littleEndianToInt(bArr2, 0, this.engineState, 14, 2);
    }

    public ChaChaEngine(int i10) {
        super(i10);
    }

    @Override // org.bouncycastle.crypto.engines.Salsa20Engine
    public void advanceCounter(long j10) {
        int i10 = (int) (j10 >>> 32);
        int i11 = (int) j10;
        if (i10 > 0) {
            int[] iArr = this.engineState;
            iArr[13] = iArr[13] + i10;
        }
        int[] iArr2 = this.engineState;
        int i12 = iArr2[12];
        int i13 = i11 + i12;
        iArr2[12] = i13;
        if (i12 == 0 || i13 >= i12) {
            return;
        }
        iArr2[13] = iArr2[13] + 1;
    }

    @Override // org.bouncycastle.crypto.engines.Salsa20Engine
    public void retreatCounter(long j10) {
        int i10 = (int) (j10 >>> 32);
        int i11 = (int) j10;
        if (i10 != 0) {
            int[] iArr = this.engineState;
            int i12 = iArr[13];
            if ((i12 & BodyPartID.bodyIdMax) < (i10 & BodyPartID.bodyIdMax)) {
                throw new IllegalStateException("attempt to reduce counter past zero.");
            }
            iArr[13] = i12 - i10;
        }
        int[] iArr2 = this.engineState;
        int i13 = iArr2[12];
        if ((i13 & BodyPartID.bodyIdMax) >= (BodyPartID.bodyIdMax & i11)) {
            iArr2[12] = i13 - i11;
            return;
        }
        int i14 = iArr2[13];
        if (i14 == 0) {
            throw new IllegalStateException("attempt to reduce counter past zero.");
        }
        iArr2[13] = i14 - 1;
        iArr2[12] = i13 - i11;
    }
}
