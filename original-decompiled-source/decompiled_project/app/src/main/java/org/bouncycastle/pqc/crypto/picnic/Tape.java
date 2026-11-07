package org.bouncycastle.pqc.crypto.picnic;

import java.lang.reflect.Array;
import org.bouncycastle.util.Pack;

/* loaded from: classes3.dex */
class Tape {
    private PicnicEngine engine;
    int nTapes;
    int pos = 0;
    byte[][] tapes;

    public Tape(PicnicEngine picnicEngine) {
        this.engine = picnicEngine;
        this.tapes = (byte[][]) Array.newInstance((Class<?>) Byte.TYPE, picnicEngine.numMPCParties, picnicEngine.andSizeBytes * 2);
        this.nTapes = picnicEngine.numMPCParties;
    }

    private void tapesToParityBits(int[] iArr, int i10) {
        for (int i11 = 0; i11 < i10; i11++) {
            Utils.setBitInWordArray(iArr, i11, Utils.parity16(tapesToWord()));
        }
    }

    public void computeAuxTape(byte[] bArr) {
        int[] iArr = new int[16];
        int[] iArr2 = new int[16];
        int[] iArr3 = new int[16];
        int[] iArr4 = new int[16];
        int[] iArr5 = new int[16];
        PicnicEngine picnicEngine = this.engine;
        iArr5[picnicEngine.stateSizeWords - 1] = 0;
        tapesToParityBits(iArr5, picnicEngine.stateSizeBits);
        PicnicEngine picnicEngine2 = this.engine;
        KMatricesWithPointer kMatricesWithPointerKMatrixInv = picnicEngine2.lowmcConstants.KMatrixInv(picnicEngine2);
        this.engine.matrix_mul(iArr4, iArr5, kMatricesWithPointerKMatrixInv.getData(), kMatricesWithPointerKMatrixInv.getMatrixPointer());
        if (bArr != null) {
            Pack.intToLittleEndian(iArr4, 0, this.engine.stateSizeWords, bArr, 0);
        }
        for (int i10 = this.engine.numRounds; i10 > 0; i10--) {
            PicnicEngine picnicEngine3 = this.engine;
            KMatricesWithPointer kMatricesWithPointerKMatrix = picnicEngine3.lowmcConstants.KMatrix(picnicEngine3, i10);
            this.engine.matrix_mul(iArr, iArr4, kMatricesWithPointerKMatrix.getData(), kMatricesWithPointerKMatrix.getMatrixPointer());
            this.engine.xor_array(iArr2, iArr2, iArr, 0);
            PicnicEngine picnicEngine4 = this.engine;
            int i11 = i10 - 1;
            KMatricesWithPointer kMatricesWithPointerLMatrixInv = picnicEngine4.lowmcConstants.LMatrixInv(picnicEngine4, i11);
            this.engine.matrix_mul(iArr3, iArr2, kMatricesWithPointerLMatrixInv.getData(), kMatricesWithPointerLMatrixInv.getMatrixPointer());
            if (i10 == 1) {
                System.arraycopy(iArr5, 0, iArr2, 0, 16);
            } else {
                int i12 = this.engine.stateSizeBits;
                this.pos = i12 * 2 * i11;
                tapesToParityBits(iArr2, i12);
            }
            PicnicEngine picnicEngine5 = this.engine;
            int i13 = picnicEngine5.stateSizeBits;
            this.pos = (i13 * 2 * i11) + i13;
            picnicEngine5.aux_mpc_sbox(iArr2, iArr3, this);
        }
        this.pos = 0;
    }

    public void setAuxBits(byte[] bArr) {
        PicnicEngine picnicEngine = this.engine;
        int i10 = picnicEngine.numMPCParties - 1;
        int i11 = picnicEngine.stateSizeBits;
        int i12 = 0;
        for (int i13 = 0; i13 < this.engine.numRounds; i13++) {
            int i14 = 0;
            while (i14 < i11) {
                Utils.setBit(this.tapes[i10], (i11 * 2 * i13) + i11 + i14, Utils.getBit(bArr, i12));
                i14++;
                i12++;
            }
        }
    }

    public int tapesToWord() {
        int i10 = this.pos;
        int i11 = i10 >>> 3;
        int i12 = (i10 & 7) ^ 7;
        int i13 = 1 << i12;
        byte[][] bArr = this.tapes;
        int i14 = ((bArr[15][i11] & i13) << 8) | (bArr[7][i11] & i13) | ((bArr[0][i11] & i13) << 7) | ((bArr[1][i11] & i13) << 6) | ((bArr[2][i11] & i13) << 5) | ((bArr[3][i11] & i13) << 4) | ((bArr[4][i11] & i13) << 3) | ((bArr[5][i11] & i13) << 2) | ((bArr[6][i11] & i13) << 1) | ((bArr[8][i11] & i13) << 15) | ((bArr[9][i11] & i13) << 14) | ((bArr[10][i11] & i13) << 13) | ((bArr[11][i11] & i13) << 12) | ((bArr[12][i11] & i13) << 11) | ((bArr[13][i11] & i13) << 10) | ((bArr[14][i11] & i13) << 9);
        this.pos = i10 + 1;
        return i14 >>> i12;
    }
}
