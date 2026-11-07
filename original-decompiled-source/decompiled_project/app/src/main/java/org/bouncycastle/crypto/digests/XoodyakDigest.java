package org.bouncycastle.crypto.digests;

import java.io.ByteArrayOutputStream;
import org.bouncycastle.crypto.DataLengthException;
import org.bouncycastle.crypto.Digest;
import org.bouncycastle.crypto.OutputLengthException;
import org.bouncycastle.pqc.crypto.crystals.dilithium.DilithiumEngine;
import org.bouncycastle.util.Arrays;
import org.bouncycastle.util.Pack;

/* loaded from: classes2.dex */
public class XoodyakDigest implements Digest {
    private int Rabsorb;
    private MODE mode;
    private int phase;
    private final int f_bPrime = 48;
    private final int Rhash = 16;
    private final int PhaseDown = 1;
    private final int PhaseUp = 2;
    private final int NLANES = 12;
    private final int NROWS = 3;
    private final int NCOLUMS = 4;
    private final int MAXROUNDS = 12;
    private final int TAGLEN = 16;
    private final int[] RC = {88, 56, 960, 208, 288, 20, 96, 44, 896, 240, DilithiumEngine.DilithiumPolyT0PackedBytes, 18};
    private final ByteArrayOutputStream buffer = new ByteArrayOutputStream();
    private byte[] state = new byte[48];

    public enum MODE {
        ModeHash,
        ModeKeyed
    }

    public XoodyakDigest() {
        reset();
    }

    private int ROTL32(int i10, int i11) {
        return (i10 >>> ((32 - i11) & 31)) ^ (i10 << (i11 & 31));
    }

    private void Up(byte[] bArr, int i10, int i11, int i12) {
        int i13;
        if (this.mode != MODE.ModeHash) {
            byte[] bArr2 = this.state;
            bArr2[47] = (byte) (bArr2[47] ^ i12);
        }
        int i14 = 12;
        int[] iArr = new int[12];
        Pack.littleEndianToInt(this.state, 0, iArr, 0, 12);
        int[] iArr2 = new int[12];
        int[] iArr3 = new int[4];
        int[] iArr4 = new int[4];
        for (int i15 = 0; i15 < i14; i15++) {
            for (int i16 = 0; i16 < 4; i16++) {
                iArr3[i16] = (iArr[index(i16, 1)] ^ iArr[index(i16, 0)]) ^ iArr[index(i16, 2)];
            }
            int i17 = 0;
            while (true) {
                i13 = 3;
                if (i17 >= 4) {
                    break;
                }
                int i18 = iArr3[3 & (i17 + 3)];
                iArr4[i17] = ROTL32(i18, 14) ^ ROTL32(i18, 5);
                i17++;
            }
            for (int i19 = 0; i19 < 4; i19++) {
                for (int i20 = 0; i20 < 3; i20++) {
                    int iIndex = index(i19, i20);
                    iArr[iIndex] = iArr[iIndex] ^ iArr4[i19];
                }
            }
            for (int i21 = 0; i21 < 4; i21++) {
                iArr2[index(i21, 0)] = iArr[index(i21, 0)];
                iArr2[index(i21, 1)] = iArr[index(i21 + 3, 1)];
                iArr2[index(i21, 2)] = ROTL32(iArr[index(i21, 2)], 11);
            }
            iArr2[0] = iArr2[0] ^ this.RC[i15];
            int i22 = 0;
            while (i22 < 4) {
                int i23 = 0;
                while (i23 < i13) {
                    int i24 = i23 + 1;
                    iArr[index(i22, i23)] = ((~iArr2[index(i22, i24)]) & iArr2[index(i22, i23 + 2)]) ^ iArr2[index(i22, i23)];
                    i23 = i24;
                    i13 = 3;
                }
                i22++;
                i13 = 3;
            }
            for (int i25 = 0; i25 < 4; i25++) {
                iArr2[index(i25, 0)] = iArr[index(i25, 0)];
                iArr2[index(i25, 1)] = ROTL32(iArr[index(i25, 1)], 1);
                iArr2[index(i25, 2)] = ROTL32(iArr[index(i25 + 2, 2)], 8);
            }
            i14 = 12;
            System.arraycopy(iArr2, 0, iArr, 0, 12);
        }
        Pack.intToLittleEndian(iArr, 0, i14, this.state, 0);
        this.phase = 2;
        if (bArr != null) {
            System.arraycopy(this.state, 0, bArr, i10, i11);
        }
    }

    private int index(int i10, int i11) {
        return (i10 % 4) + ((i11 % 3) * 4);
    }

    public void Down(byte[] bArr, int i10, int i11, int i12) {
        int i13 = 0;
        while (i13 < i11) {
            byte[] bArr2 = this.state;
            bArr2[i13] = (byte) (bArr[i10] ^ bArr2[i13]);
            i13++;
            i10++;
        }
        byte[] bArr3 = this.state;
        bArr3[i11] = (byte) (bArr3[i11] ^ 1);
        byte b10 = bArr3[47];
        if (this.mode == MODE.ModeHash) {
            i12 &= 1;
        }
        bArr3[47] = (byte) (b10 ^ i12);
        this.phase = 1;
    }

    @Override // org.bouncycastle.crypto.Digest
    public int doFinal(byte[] bArr, int i10) {
        if (i10 + 32 > bArr.length) {
            throw new OutputLengthException("output buffer is too short");
        }
        byte[] byteArray = this.buffer.toByteArray();
        int size = this.buffer.size();
        int i11 = 3;
        int i12 = 0;
        while (true) {
            if (this.phase != 2) {
                Up(null, 0, 0, 0);
            }
            int iMin = Math.min(size, this.Rabsorb);
            Down(byteArray, i12, iMin, i11);
            i12 += iMin;
            size -= iMin;
            if (size == 0) {
                Up(bArr, i10, 16, 64);
                Down(null, 0, 0, 0);
                Up(bArr, i10 + 16, 16, 0);
                return 32;
            }
            i11 = 0;
        }
    }

    @Override // org.bouncycastle.crypto.Digest
    public String getAlgorithmName() {
        return "Xoodyak Hash";
    }

    @Override // org.bouncycastle.crypto.Digest
    public int getDigestSize() {
        return 32;
    }

    @Override // org.bouncycastle.crypto.Digest
    public void reset() {
        Arrays.fill(this.state, (byte) 0);
        this.phase = 2;
        this.mode = MODE.ModeHash;
        this.Rabsorb = 16;
        this.buffer.reset();
    }

    @Override // org.bouncycastle.crypto.Digest
    public void update(byte b10) {
        this.buffer.write(b10);
    }

    @Override // org.bouncycastle.crypto.Digest
    public void update(byte[] bArr, int i10, int i11) {
        if (i10 + i11 > bArr.length) {
            throw new DataLengthException("input buffer too short");
        }
        this.buffer.write(bArr, i10, i11);
    }
}
