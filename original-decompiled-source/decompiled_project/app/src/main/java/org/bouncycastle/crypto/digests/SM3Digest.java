package org.bouncycastle.crypto.digests;

import m.a;
import org.bouncycastle.crypto.CryptoServiceProperties;
import org.bouncycastle.crypto.CryptoServicePurpose;
import org.bouncycastle.crypto.CryptoServicesRegistrar;
import org.bouncycastle.util.Memoable;
import org.bouncycastle.util.Pack;

/* loaded from: classes2.dex */
public class SM3Digest extends GeneralDigest {
    private static final int BLOCK_SIZE = 16;
    private static final int DIGEST_LENGTH = 32;
    private static final int[] T = new int[64];
    private int[] V;
    private int[] W;
    private int[] inwords;
    private int xOff;

    static {
        int i10;
        int i11 = 0;
        while (true) {
            if (i11 >= 16) {
                break;
            }
            T[i11] = (2043430169 >>> (32 - i11)) | (2043430169 << i11);
            i11++;
        }
        for (i10 = 16; i10 < 64; i10++) {
            int i12 = i10 % 32;
            T[i10] = (2055708042 >>> (32 - i12)) | (2055708042 << i12);
        }
    }

    public SM3Digest() {
        this(CryptoServicePurpose.ANY);
    }

    private int FF0(int i10, int i11, int i12) {
        return (i10 ^ i11) ^ i12;
    }

    private int FF1(int i10, int i11, int i12) {
        return (i10 & (i11 | i12)) | (i11 & i12);
    }

    private int GG0(int i10, int i11, int i12) {
        return (i10 ^ i11) ^ i12;
    }

    private int GG1(int i10, int i11, int i12) {
        return ((~i10) & i12) | (i11 & i10);
    }

    private int P0(int i10) {
        return (i10 ^ ((i10 << 9) | (i10 >>> 23))) ^ ((i10 << 17) | (i10 >>> 15));
    }

    private int P1(int i10) {
        return (i10 ^ ((i10 << 15) | (i10 >>> 17))) ^ ((i10 << 23) | (i10 >>> 9));
    }

    private void copyIn(SM3Digest sM3Digest) {
        int[] iArr = sM3Digest.V;
        int[] iArr2 = this.V;
        System.arraycopy(iArr, 0, iArr2, 0, iArr2.length);
        int[] iArr3 = sM3Digest.inwords;
        int[] iArr4 = this.inwords;
        System.arraycopy(iArr3, 0, iArr4, 0, iArr4.length);
        this.xOff = sM3Digest.xOff;
    }

    @Override // org.bouncycastle.util.Memoable
    public Memoable copy() {
        return new SM3Digest(this);
    }

    @Override // org.bouncycastle.crypto.digests.GeneralDigest
    public CryptoServiceProperties cryptoServiceProperties() {
        return Utils.getDefaultProperties(this, 256, this.purpose);
    }

    @Override // org.bouncycastle.crypto.Digest
    public int doFinal(byte[] bArr, int i10) {
        finish();
        Pack.intToBigEndian(this.V, bArr, i10);
        reset();
        return 32;
    }

    @Override // org.bouncycastle.crypto.Digest
    public String getAlgorithmName() {
        return "SM3";
    }

    @Override // org.bouncycastle.crypto.Digest
    public int getDigestSize() {
        return 32;
    }

    @Override // org.bouncycastle.crypto.digests.GeneralDigest
    public void processBlock() {
        int i10;
        int i11 = 0;
        while (true) {
            i10 = 16;
            if (i11 >= 16) {
                break;
            }
            this.W[i11] = this.inwords[i11];
            i11++;
        }
        for (int i12 = 16; i12 < 68; i12++) {
            int[] iArr = this.W;
            int i13 = iArr[i12 - 3];
            int i14 = iArr[i12 - 13];
            iArr[i12] = (P1(((i13 >>> 17) | (i13 << 15)) ^ (iArr[i12 - 16] ^ iArr[i12 - 9])) ^ ((i14 >>> 25) | (i14 << 7))) ^ this.W[i12 - 6];
        }
        int[] iArr2 = this.V;
        int i15 = iArr2[0];
        int i16 = iArr2[1];
        int i17 = iArr2[2];
        char c10 = 3;
        int i18 = iArr2[3];
        char c11 = 4;
        int iP0 = iArr2[4];
        char c12 = 5;
        int i19 = iArr2[5];
        char c13 = 6;
        int i20 = iArr2[6];
        int i21 = iArr2[7];
        int i22 = i20;
        int i23 = 0;
        while (i23 < i10) {
            int i24 = (i15 << 12) | (i15 >>> 20);
            int i25 = i24 + iP0 + T[i23];
            int i26 = (i25 << 7) | (i25 >>> 25);
            char c14 = c10;
            int i27 = i26 ^ i24;
            char c15 = c11;
            int[] iArr3 = this.W;
            char c16 = c12;
            int i28 = iArr3[i23];
            int iA = a.a(FF0(i15, i16, i17), i18, i27, iArr3[i23 + 4] ^ i28);
            int iA2 = a.a(GG0(iP0, i19, i22), i21, i26, i28);
            int i29 = (i16 << 9) | (i16 >>> 23);
            int i30 = (i19 << 19) | (i19 >>> 13);
            i23++;
            i18 = i17;
            i19 = iP0;
            c11 = c15;
            c12 = c16;
            c13 = c13;
            iP0 = P0(iA2);
            i17 = i29;
            i21 = i22;
            i22 = i30;
            i10 = 16;
            i16 = i15;
            i15 = iA;
            c10 = c14;
        }
        char c17 = c10;
        char c18 = c11;
        char c19 = c12;
        char c20 = c13;
        int i31 = i21;
        int i32 = i22;
        int i33 = i15;
        int i34 = 16;
        while (i34 < 64) {
            int i35 = (i33 << 12) | (i33 >>> 20);
            int i36 = i35 + iP0 + T[i34];
            int i37 = (i36 >>> 25) | (i36 << 7);
            int[] iArr4 = this.W;
            int i38 = iArr4[i34];
            int iA3 = a.a(FF1(i33, i16, i17), i18, i35 ^ i37, iArr4[i34 + 4] ^ i38);
            int iA4 = a.a(GG1(iP0, i19, i32), i31, i37, i38);
            int i39 = (i19 << 19) | (i19 >>> 13);
            i34++;
            i18 = i17;
            i19 = iP0;
            iP0 = P0(iA4);
            i17 = (i16 >>> 23) | (i16 << 9);
            i31 = i32;
            i16 = i33;
            i33 = iA3;
            i32 = i39;
        }
        int[] iArr5 = this.V;
        iArr5[0] = i33 ^ iArr5[0];
        iArr5[1] = iArr5[1] ^ i16;
        iArr5[2] = iArr5[2] ^ i17;
        iArr5[c17] = iArr5[c17] ^ i18;
        iArr5[c18] = iArr5[c18] ^ iP0;
        iArr5[c19] = iArr5[c19] ^ i19;
        iArr5[c20] = i32 ^ iArr5[c20];
        iArr5[7] = iArr5[7] ^ i31;
        this.xOff = 0;
    }

    @Override // org.bouncycastle.crypto.digests.GeneralDigest
    public void processLength(long j10) {
        int i10 = this.xOff;
        if (i10 > 14) {
            this.inwords[i10] = 0;
            this.xOff = i10 + 1;
            processBlock();
        }
        while (true) {
            int i11 = this.xOff;
            if (i11 >= 14) {
                int[] iArr = this.inwords;
                int i12 = i11 + 1;
                this.xOff = i12;
                iArr[i11] = (int) (j10 >>> 32);
                this.xOff = i11 + 2;
                iArr[i12] = (int) j10;
                return;
            }
            this.inwords[i11] = 0;
            this.xOff = i11 + 1;
        }
    }

    @Override // org.bouncycastle.crypto.digests.GeneralDigest
    public void processWord(byte[] bArr, int i10) {
        int[] iArr = this.inwords;
        int i11 = this.xOff;
        this.xOff = i11 + 1;
        iArr[i11] = Pack.bigEndianToInt(bArr, i10);
        if (this.xOff >= 16) {
            processBlock();
        }
    }

    @Override // org.bouncycastle.crypto.digests.GeneralDigest, org.bouncycastle.crypto.Digest
    public void reset() {
        super.reset();
        int[] iArr = this.V;
        iArr[0] = 1937774191;
        iArr[1] = 1226093241;
        iArr[2] = 388252375;
        iArr[3] = -628488704;
        iArr[4] = -1452330820;
        iArr[5] = 372324522;
        iArr[6] = -477237683;
        iArr[7] = -1325724082;
        this.xOff = 0;
    }

    public SM3Digest(CryptoServicePurpose cryptoServicePurpose) {
        super(cryptoServicePurpose);
        this.V = new int[8];
        this.inwords = new int[16];
        this.W = new int[68];
        CryptoServicesRegistrar.checkConstraints(cryptoServiceProperties());
        reset();
    }

    @Override // org.bouncycastle.util.Memoable
    public void reset(Memoable memoable) {
        SM3Digest sM3Digest = (SM3Digest) memoable;
        super.copyIn((GeneralDigest) sM3Digest);
        copyIn(sM3Digest);
    }

    public SM3Digest(SM3Digest sM3Digest) {
        super(sM3Digest);
        this.V = new int[8];
        this.inwords = new int[16];
        this.W = new int[68];
        CryptoServicesRegistrar.checkConstraints(cryptoServiceProperties());
        copyIn(sM3Digest);
    }
}
