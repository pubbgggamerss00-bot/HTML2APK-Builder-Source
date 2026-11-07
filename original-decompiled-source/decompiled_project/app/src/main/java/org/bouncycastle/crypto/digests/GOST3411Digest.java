package org.bouncycastle.crypto.digests;

import java.lang.reflect.Array;
import org.bouncycastle.crypto.BlockCipher;
import org.bouncycastle.crypto.CryptoServiceProperties;
import org.bouncycastle.crypto.CryptoServicePurpose;
import org.bouncycastle.crypto.CryptoServicesRegistrar;
import org.bouncycastle.crypto.DataLengthException;
import org.bouncycastle.crypto.ExtendedDigest;
import org.bouncycastle.crypto.engines.GOST28147Engine;
import org.bouncycastle.crypto.params.KeyParameter;
import org.bouncycastle.crypto.params.ParametersWithSBox;
import org.bouncycastle.util.Arrays;
import org.bouncycastle.util.Memoable;
import org.bouncycastle.util.Pack;

/* loaded from: classes2.dex */
public class GOST3411Digest implements ExtendedDigest, Memoable {
    private static final byte[] C2 = {0, -1, 0, -1, 0, -1, 0, -1, -1, 0, -1, 0, -1, 0, -1, 0, 0, -1, -1, 0, -1, 0, 0, -1, -1, 0, 0, 0, -1, -1, 0, -1};
    private static final int DIGEST_LENGTH = 32;
    private byte[][] C;
    private byte[] H;
    private byte[] K;
    private byte[] L;
    private byte[] M;
    byte[] S;
    private byte[] Sum;
    byte[] U;
    byte[] V;
    byte[] W;

    /* renamed from: a, reason: collision with root package name */
    byte[] f19921a;
    private long byteCount;
    private BlockCipher cipher;
    private final CryptoServicePurpose purpose;
    private byte[] sBox;
    short[] wS;
    short[] w_S;
    private byte[] xBuf;
    private int xBufOff;

    public GOST3411Digest() {
        this(CryptoServicePurpose.ANY);
    }

    private byte[] A(byte[] bArr) {
        for (int i10 = 0; i10 < 8; i10++) {
            this.f19921a[i10] = (byte) (bArr[i10] ^ bArr[i10 + 8]);
        }
        System.arraycopy(bArr, 8, bArr, 0, 24);
        System.arraycopy(this.f19921a, 0, bArr, 24, 8);
        return bArr;
    }

    private void E(byte[] bArr, byte[] bArr2, int i10, byte[] bArr3, int i11) throws IllegalStateException, DataLengthException, IllegalArgumentException {
        this.cipher.init(true, new KeyParameter(bArr));
        this.cipher.processBlock(bArr3, i11, bArr2, i10);
    }

    private byte[] P(byte[] bArr) {
        for (int i10 = 0; i10 < 8; i10++) {
            byte[] bArr2 = this.K;
            int i11 = i10 * 4;
            bArr2[i11] = bArr[i10];
            bArr2[i11 + 1] = bArr[i10 + 8];
            bArr2[i11 + 2] = bArr[i10 + 16];
            bArr2[i11 + 3] = bArr[i10 + 24];
        }
        return this.K;
    }

    private void cpyBytesToShort(byte[] bArr, short[] sArr) {
        for (int i10 = 0; i10 < bArr.length / 2; i10++) {
            int i11 = i10 * 2;
            sArr[i10] = (short) ((bArr[i11] & 255) | ((bArr[i11 + 1] << 8) & 65280));
        }
    }

    private void cpyShortToBytes(short[] sArr, byte[] bArr) {
        for (int i10 = 0; i10 < bArr.length / 2; i10++) {
            int i11 = i10 * 2;
            short s10 = sArr[i10];
            bArr[i11 + 1] = (byte) (s10 >> 8);
            bArr[i11] = (byte) s10;
        }
    }

    private void finish() throws IllegalStateException, DataLengthException, IllegalArgumentException {
        Pack.longToLittleEndian(this.byteCount * 8, this.L, 0);
        while (this.xBufOff != 0) {
            update((byte) 0);
        }
        processBlock(this.L, 0);
        processBlock(this.Sum, 0);
    }

    private void fw(byte[] bArr) {
        cpyBytesToShort(bArr, this.wS);
        short[] sArr = this.w_S;
        short[] sArr2 = this.wS;
        sArr[15] = (short) (((((sArr2[0] ^ sArr2[1]) ^ sArr2[2]) ^ sArr2[3]) ^ sArr2[12]) ^ sArr2[15]);
        System.arraycopy(sArr2, 1, sArr, 0, 15);
        cpyShortToBytes(this.w_S, bArr);
    }

    private void sumByteArray(byte[] bArr) {
        int i10 = 0;
        int i11 = 0;
        while (true) {
            byte[] bArr2 = this.Sum;
            if (i10 == bArr2.length) {
                return;
            }
            int i12 = (bArr2[i10] & 255) + (bArr[i10] & 255) + i11;
            bArr2[i10] = (byte) i12;
            i11 = i12 >>> 8;
            i10++;
        }
    }

    @Override // org.bouncycastle.util.Memoable
    public Memoable copy() {
        return new GOST3411Digest(this);
    }

    public CryptoServiceProperties cryptoServiceProperties() {
        return Utils.getDefaultProperties(this, 256, this.purpose);
    }

    @Override // org.bouncycastle.crypto.Digest
    public int doFinal(byte[] bArr, int i10) throws IllegalStateException, DataLengthException, IllegalArgumentException {
        finish();
        byte[] bArr2 = this.H;
        System.arraycopy(bArr2, 0, bArr, i10, bArr2.length);
        reset();
        return 32;
    }

    @Override // org.bouncycastle.crypto.Digest
    public String getAlgorithmName() {
        return "GOST3411";
    }

    @Override // org.bouncycastle.crypto.ExtendedDigest
    public int getByteLength() {
        return 32;
    }

    @Override // org.bouncycastle.crypto.Digest
    public int getDigestSize() {
        return 32;
    }

    public void processBlock(byte[] bArr, int i10) throws IllegalStateException, DataLengthException, IllegalArgumentException {
        System.arraycopy(bArr, i10, this.M, 0, 32);
        System.arraycopy(this.H, 0, this.U, 0, 32);
        System.arraycopy(this.M, 0, this.V, 0, 32);
        for (int i11 = 0; i11 < 32; i11++) {
            this.W[i11] = (byte) (this.U[i11] ^ this.V[i11]);
        }
        E(P(this.W), this.S, 0, this.H, 0);
        for (int i12 = 1; i12 < 4; i12++) {
            byte[] bArrA = A(this.U);
            for (int i13 = 0; i13 < 32; i13++) {
                this.U[i13] = (byte) (bArrA[i13] ^ this.C[i12][i13]);
            }
            this.V = A(A(this.V));
            for (int i14 = 0; i14 < 32; i14++) {
                this.W[i14] = (byte) (this.U[i14] ^ this.V[i14]);
            }
            int i15 = i12 * 8;
            E(P(this.W), this.S, i15, this.H, i15);
        }
        for (int i16 = 0; i16 < 12; i16++) {
            fw(this.S);
        }
        for (int i17 = 0; i17 < 32; i17++) {
            byte[] bArr2 = this.S;
            bArr2[i17] = (byte) (bArr2[i17] ^ this.M[i17]);
        }
        fw(this.S);
        for (int i18 = 0; i18 < 32; i18++) {
            byte[] bArr3 = this.S;
            bArr3[i18] = (byte) (this.H[i18] ^ bArr3[i18]);
        }
        for (int i19 = 0; i19 < 61; i19++) {
            fw(this.S);
        }
        byte[] bArr4 = this.S;
        byte[] bArr5 = this.H;
        System.arraycopy(bArr4, 0, bArr5, 0, bArr5.length);
    }

    @Override // org.bouncycastle.crypto.Digest
    public void reset() {
        this.byteCount = 0L;
        this.xBufOff = 0;
        int i10 = 0;
        while (true) {
            byte[] bArr = this.H;
            if (i10 >= bArr.length) {
                break;
            }
            bArr[i10] = 0;
            i10++;
        }
        int i11 = 0;
        while (true) {
            byte[] bArr2 = this.L;
            if (i11 >= bArr2.length) {
                break;
            }
            bArr2[i11] = 0;
            i11++;
        }
        int i12 = 0;
        while (true) {
            byte[] bArr3 = this.M;
            if (i12 >= bArr3.length) {
                break;
            }
            bArr3[i12] = 0;
            i12++;
        }
        int i13 = 0;
        while (true) {
            byte[] bArr4 = this.C[1];
            if (i13 >= bArr4.length) {
                break;
            }
            bArr4[i13] = 0;
            i13++;
        }
        int i14 = 0;
        while (true) {
            byte[] bArr5 = this.C[3];
            if (i14 >= bArr5.length) {
                break;
            }
            bArr5[i14] = 0;
            i14++;
        }
        int i15 = 0;
        while (true) {
            byte[] bArr6 = this.Sum;
            if (i15 >= bArr6.length) {
                break;
            }
            bArr6[i15] = 0;
            i15++;
        }
        int i16 = 0;
        while (true) {
            byte[] bArr7 = this.xBuf;
            if (i16 >= bArr7.length) {
                byte[] bArr8 = C2;
                System.arraycopy(bArr8, 0, this.C[2], 0, bArr8.length);
                return;
            } else {
                bArr7[i16] = 0;
                i16++;
            }
        }
    }

    @Override // org.bouncycastle.crypto.Digest
    public void update(byte b10) throws IllegalStateException, DataLengthException, IllegalArgumentException {
        byte[] bArr = this.xBuf;
        int i10 = this.xBufOff;
        int i11 = i10 + 1;
        this.xBufOff = i11;
        bArr[i10] = b10;
        if (i11 == bArr.length) {
            sumByteArray(bArr);
            processBlock(this.xBuf, 0);
            this.xBufOff = 0;
        }
        this.byteCount++;
    }

    public GOST3411Digest(CryptoServicePurpose cryptoServicePurpose) throws IllegalArgumentException {
        this.H = new byte[32];
        this.L = new byte[32];
        this.M = new byte[32];
        this.Sum = new byte[32];
        this.C = (byte[][]) Array.newInstance((Class<?>) Byte.TYPE, 4, 32);
        this.xBuf = new byte[32];
        this.cipher = new GOST28147Engine();
        this.K = new byte[32];
        this.f19921a = new byte[8];
        this.wS = new short[16];
        this.w_S = new short[16];
        this.S = new byte[32];
        this.U = new byte[32];
        this.V = new byte[32];
        this.W = new byte[32];
        this.purpose = cryptoServicePurpose;
        CryptoServicesRegistrar.checkConstraints(cryptoServiceProperties());
        byte[] sBox = GOST28147Engine.getSBox("D-A");
        this.sBox = sBox;
        this.cipher.init(true, new ParametersWithSBox(null, sBox));
        reset();
    }

    @Override // org.bouncycastle.util.Memoable
    public void reset(Memoable memoable) throws IllegalArgumentException {
        GOST3411Digest gOST3411Digest = (GOST3411Digest) memoable;
        byte[] bArr = gOST3411Digest.sBox;
        this.sBox = bArr;
        this.cipher.init(true, new ParametersWithSBox(null, bArr));
        reset();
        byte[] bArr2 = gOST3411Digest.H;
        System.arraycopy(bArr2, 0, this.H, 0, bArr2.length);
        byte[] bArr3 = gOST3411Digest.L;
        System.arraycopy(bArr3, 0, this.L, 0, bArr3.length);
        byte[] bArr4 = gOST3411Digest.M;
        System.arraycopy(bArr4, 0, this.M, 0, bArr4.length);
        byte[] bArr5 = gOST3411Digest.Sum;
        System.arraycopy(bArr5, 0, this.Sum, 0, bArr5.length);
        byte[] bArr6 = gOST3411Digest.C[1];
        System.arraycopy(bArr6, 0, this.C[1], 0, bArr6.length);
        byte[] bArr7 = gOST3411Digest.C[2];
        System.arraycopy(bArr7, 0, this.C[2], 0, bArr7.length);
        byte[] bArr8 = gOST3411Digest.C[3];
        System.arraycopy(bArr8, 0, this.C[3], 0, bArr8.length);
        byte[] bArr9 = gOST3411Digest.xBuf;
        System.arraycopy(bArr9, 0, this.xBuf, 0, bArr9.length);
        this.xBufOff = gOST3411Digest.xBufOff;
        this.byteCount = gOST3411Digest.byteCount;
    }

    @Override // org.bouncycastle.crypto.Digest
    public void update(byte[] bArr, int i10, int i11) throws IllegalStateException, DataLengthException, IllegalArgumentException {
        while (this.xBufOff != 0 && i11 > 0) {
            update(bArr[i10]);
            i10++;
            i11--;
        }
        while (true) {
            byte[] bArr2 = this.xBuf;
            if (i11 < bArr2.length) {
                break;
            }
            System.arraycopy(bArr, i10, bArr2, 0, bArr2.length);
            sumByteArray(this.xBuf);
            processBlock(this.xBuf, 0);
            byte[] bArr3 = this.xBuf;
            i10 += bArr3.length;
            i11 -= bArr3.length;
            this.byteCount += bArr3.length;
        }
        while (i11 > 0) {
            update(bArr[i10]);
            i10++;
            i11--;
        }
    }

    public GOST3411Digest(GOST3411Digest gOST3411Digest) throws IllegalArgumentException {
        this.H = new byte[32];
        this.L = new byte[32];
        this.M = new byte[32];
        this.Sum = new byte[32];
        this.C = (byte[][]) Array.newInstance((Class<?>) Byte.TYPE, 4, 32);
        this.xBuf = new byte[32];
        this.cipher = new GOST28147Engine();
        this.K = new byte[32];
        this.f19921a = new byte[8];
        this.wS = new short[16];
        this.w_S = new short[16];
        this.S = new byte[32];
        this.U = new byte[32];
        this.V = new byte[32];
        this.W = new byte[32];
        this.purpose = gOST3411Digest.purpose;
        CryptoServicesRegistrar.checkConstraints(cryptoServiceProperties());
        reset(gOST3411Digest);
    }

    public GOST3411Digest(byte[] bArr) {
        this(bArr, CryptoServicePurpose.ANY);
    }

    public GOST3411Digest(byte[] bArr, CryptoServicePurpose cryptoServicePurpose) throws IllegalArgumentException {
        this.H = new byte[32];
        this.L = new byte[32];
        this.M = new byte[32];
        this.Sum = new byte[32];
        this.C = (byte[][]) Array.newInstance((Class<?>) Byte.TYPE, 4, 32);
        this.xBuf = new byte[32];
        this.cipher = new GOST28147Engine();
        this.K = new byte[32];
        this.f19921a = new byte[8];
        this.wS = new short[16];
        this.w_S = new short[16];
        this.S = new byte[32];
        this.U = new byte[32];
        this.V = new byte[32];
        this.W = new byte[32];
        this.purpose = cryptoServicePurpose;
        CryptoServicesRegistrar.checkConstraints(cryptoServiceProperties());
        byte[] bArrClone = Arrays.clone(bArr);
        this.sBox = bArrClone;
        this.cipher.init(true, new ParametersWithSBox(null, bArrClone));
        reset();
    }
}
