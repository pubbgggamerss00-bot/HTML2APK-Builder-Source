package org.bouncycastle.crypto.digests;

import org.bouncycastle.crypto.CryptoServicePurpose;
import org.bouncycastle.crypto.CryptoServicesRegistrar;
import org.bouncycastle.crypto.ExtendedDigest;
import org.bouncycastle.crypto.OutputLengthException;
import org.bouncycastle.util.Arrays;
import org.bouncycastle.util.Integers;
import org.bouncycastle.util.Pack;
import org.jf.dexlib2.analysis.RegisterType;

/* loaded from: classes2.dex */
public class Blake2sDigest implements ExtendedDigest {
    private static final int BLOCK_LENGTH_BYTES = 64;
    private static final int ROUNDS = 10;
    private static final int[] blake2s_IV = {1779033703, -1150833019, 1013904242, -1521486534, 1359893119, -1694144372, 528734635, 1541459225};
    private static final byte[][] blake2s_sigma = {new byte[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, RegisterType.FLOAT, 12, RegisterType.LONG_HI, RegisterType.DOUBLE_LO, RegisterType.DOUBLE_HI}, new byte[]{RegisterType.DOUBLE_LO, 10, 4, 8, 9, RegisterType.DOUBLE_HI, RegisterType.LONG_HI, 6, 1, 12, 0, 2, RegisterType.FLOAT, 7, 5, 3}, new byte[]{RegisterType.FLOAT, 8, 12, 0, 5, 2, RegisterType.DOUBLE_HI, RegisterType.LONG_HI, 10, RegisterType.DOUBLE_LO, 3, 6, 7, 1, 9, 4}, new byte[]{7, 9, 3, 1, RegisterType.LONG_HI, 12, RegisterType.FLOAT, RegisterType.DOUBLE_LO, 2, 6, 5, 10, 4, 0, RegisterType.DOUBLE_HI, 8}, new byte[]{9, 0, 5, 7, 2, 4, 10, RegisterType.DOUBLE_HI, RegisterType.DOUBLE_LO, 1, RegisterType.FLOAT, 12, 6, 8, 3, RegisterType.LONG_HI}, new byte[]{2, 12, 6, 10, 0, RegisterType.FLOAT, 8, 3, 4, RegisterType.LONG_HI, 7, 5, RegisterType.DOUBLE_HI, RegisterType.DOUBLE_LO, 1, 9}, new byte[]{12, 5, 1, RegisterType.DOUBLE_HI, RegisterType.DOUBLE_LO, RegisterType.LONG_HI, 4, 10, 0, 7, 6, 3, 9, 2, 8, RegisterType.FLOAT}, new byte[]{RegisterType.LONG_HI, RegisterType.FLOAT, 7, RegisterType.DOUBLE_LO, 12, 1, 3, 9, 5, 0, RegisterType.DOUBLE_HI, 4, 8, 6, 2, 10}, new byte[]{6, RegisterType.DOUBLE_HI, RegisterType.DOUBLE_LO, 9, RegisterType.FLOAT, 3, 0, 8, 12, 2, RegisterType.LONG_HI, 7, 1, 4, 10, 5}, new byte[]{10, 2, 8, 4, 7, 6, 1, 5, RegisterType.DOUBLE_HI, RegisterType.FLOAT, 9, RegisterType.DOUBLE_LO, 3, 12, RegisterType.LONG_HI, 0}};
    private byte[] buffer;
    private int bufferPos;
    private int[] chainValue;
    private int depth;
    private int digestLength;

    /* renamed from: f0, reason: collision with root package name */
    private int f19916f0;

    /* renamed from: f1, reason: collision with root package name */
    private int f19917f1;
    private int fanout;
    private int innerHashLength;
    private int[] internalState;
    private boolean isLastNode;
    private byte[] key;
    private int keyLength;
    private int leafLength;
    private int nodeDepth;
    private long nodeOffset;
    private byte[] personalization;
    private final CryptoServicePurpose purpose;
    private byte[] salt;

    /* renamed from: t0, reason: collision with root package name */
    private int f19918t0;

    /* renamed from: t1, reason: collision with root package name */
    private int f19919t1;

    public Blake2sDigest() {
        this(256, CryptoServicePurpose.ANY);
    }

    private void G(int i10, int i11, int i12, int i13, int i14, int i15) {
        int[] iArr = this.internalState;
        int i16 = iArr[i12] + iArr[i13] + i10;
        iArr[i12] = i16;
        iArr[i15] = Integers.rotateRight(iArr[i15] ^ i16, 16);
        int[] iArr2 = this.internalState;
        int i17 = iArr2[i14] + iArr2[i15];
        iArr2[i14] = i17;
        iArr2[i13] = Integers.rotateRight(i17 ^ iArr2[i13], 12);
        int[] iArr3 = this.internalState;
        int i18 = iArr3[i12] + iArr3[i13] + i11;
        iArr3[i12] = i18;
        iArr3[i15] = Integers.rotateRight(iArr3[i15] ^ i18, 8);
        int[] iArr4 = this.internalState;
        int i19 = iArr4[i14] + iArr4[i15];
        iArr4[i14] = i19;
        iArr4[i13] = Integers.rotateRight(i19 ^ iArr4[i13], 7);
    }

    private void compress(byte[] bArr, int i10) {
        initializeInternalState();
        int[] iArr = new int[16];
        Pack.littleEndianToInt(bArr, i10, iArr);
        int i11 = 0;
        for (int i12 = 0; i12 < 10; i12++) {
            byte[][] bArr2 = blake2s_sigma;
            byte[] bArr3 = bArr2[i12];
            G(iArr[bArr3[0]], iArr[bArr3[1]], 0, 4, 8, 12);
            byte[] bArr4 = bArr2[i12];
            G(iArr[bArr4[2]], iArr[bArr4[3]], 1, 5, 9, 13);
            byte[] bArr5 = bArr2[i12];
            G(iArr[bArr5[4]], iArr[bArr5[5]], 2, 6, 10, 14);
            byte[] bArr6 = bArr2[i12];
            G(iArr[bArr6[6]], iArr[bArr6[7]], 3, 7, 11, 15);
            byte[] bArr7 = bArr2[i12];
            G(iArr[bArr7[8]], iArr[bArr7[9]], 0, 5, 10, 15);
            byte[] bArr8 = bArr2[i12];
            G(iArr[bArr8[10]], iArr[bArr8[11]], 1, 6, 11, 12);
            byte[] bArr9 = bArr2[i12];
            G(iArr[bArr9[12]], iArr[bArr9[13]], 2, 7, 8, 13);
            byte[] bArr10 = bArr2[i12];
            G(iArr[bArr10[14]], iArr[bArr10[15]], 3, 4, 9, 14);
        }
        while (true) {
            int[] iArr2 = this.chainValue;
            if (i11 >= iArr2.length) {
                return;
            }
            int i13 = iArr2[i11];
            int[] iArr3 = this.internalState;
            iArr2[i11] = (i13 ^ iArr3[i11]) ^ iArr3[i11 + 8];
            i11++;
        }
    }

    private void init(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        this.buffer = new byte[64];
        if (bArr3 != null && bArr3.length > 0) {
            int length = bArr3.length;
            this.keyLength = length;
            if (length > 32) {
                throw new IllegalArgumentException("Keys > 32 bytes are not supported");
            }
            byte[] bArr4 = new byte[length];
            this.key = bArr4;
            System.arraycopy(bArr3, 0, bArr4, 0, length);
            System.arraycopy(bArr3, 0, this.buffer, 0, this.keyLength);
            this.bufferPos = 64;
        }
        if (this.chainValue == null) {
            this.chainValue = new int[]{iArr[0] ^ ((this.digestLength | (this.keyLength << 8)) | ((this.fanout << 16) | (this.depth << 24))), iArr[1] ^ this.leafLength, ((int) j) ^ iArr[2], ((i | (this.nodeDepth << 16)) | (this.innerHashLength << 24)) ^ i, iArr[4], iArr[5], 0, 0};
            int[] iArr = blake2s_IV;
            long j10 = this.nodeOffset;
            int i10 = (int) (j10 >> 32);
            int i11 = iArr[3];
            if (bArr != null) {
                if (bArr.length != 8) {
                    throw new IllegalArgumentException("Salt length must be exactly 8 bytes");
                }
                byte[] bArr5 = new byte[8];
                this.salt = bArr5;
                System.arraycopy(bArr, 0, bArr5, 0, bArr.length);
                int[] iArr2 = this.chainValue;
                iArr2[4] = iArr2[4] ^ Pack.littleEndianToInt(bArr, 0);
                int[] iArr3 = this.chainValue;
                iArr3[5] = Pack.littleEndianToInt(bArr, 4) ^ iArr3[5];
            }
            int[] iArr4 = this.chainValue;
            iArr4[6] = iArr[6];
            iArr4[7] = iArr[7];
            if (bArr2 != null) {
                if (bArr2.length != 8) {
                    throw new IllegalArgumentException("Personalization length must be exactly 8 bytes");
                }
                byte[] bArr6 = new byte[8];
                this.personalization = bArr6;
                System.arraycopy(bArr2, 0, bArr6, 0, bArr2.length);
                int[] iArr5 = this.chainValue;
                iArr5[6] = iArr5[6] ^ Pack.littleEndianToInt(bArr2, 0);
                int[] iArr6 = this.chainValue;
                iArr6[7] = Pack.littleEndianToInt(bArr2, 4) ^ iArr6[7];
            }
        }
    }

    private void initializeInternalState() {
        int[] iArr = this.chainValue;
        System.arraycopy(iArr, 0, this.internalState, 0, iArr.length);
        int[] iArr2 = blake2s_IV;
        System.arraycopy(iArr2, 0, this.internalState, this.chainValue.length, 4);
        int[] iArr3 = this.internalState;
        iArr3[12] = this.f19918t0 ^ iArr2[4];
        iArr3[13] = this.f19919t1 ^ iArr2[5];
        iArr3[14] = this.f19916f0 ^ iArr2[6];
        iArr3[15] = iArr2[7] ^ this.f19917f1;
    }

    public void clearKey() {
        byte[] bArr = this.key;
        if (bArr != null) {
            Arrays.fill(bArr, (byte) 0);
            Arrays.fill(this.buffer, (byte) 0);
        }
    }

    public void clearSalt() {
        byte[] bArr = this.salt;
        if (bArr != null) {
            Arrays.fill(bArr, (byte) 0);
        }
    }

    @Override // org.bouncycastle.crypto.Digest
    public int doFinal(byte[] bArr, int i10) {
        if (i10 > bArr.length - this.digestLength) {
            throw new OutputLengthException("output buffer too short");
        }
        this.f19916f0 = -1;
        if (this.isLastNode) {
            this.f19917f1 = -1;
        }
        int i11 = this.f19918t0;
        int i12 = this.bufferPos;
        int i13 = i11 + i12;
        this.f19918t0 = i13;
        if (i13 < 0 && i12 > (-i13)) {
            this.f19919t1++;
        }
        compress(this.buffer, 0);
        Arrays.fill(this.buffer, (byte) 0);
        Arrays.fill(this.internalState, 0);
        int i14 = this.digestLength;
        int i15 = i14 >>> 2;
        int i16 = i14 & 3;
        Pack.intToLittleEndian(this.chainValue, 0, i15, bArr, i10);
        if (i16 > 0) {
            byte[] bArr2 = new byte[4];
            Pack.intToLittleEndian(this.chainValue[i15], bArr2, 0);
            System.arraycopy(bArr2, 0, bArr, (i10 + this.digestLength) - i16, i16);
        }
        Arrays.fill(this.chainValue, 0);
        reset();
        return this.digestLength;
    }

    @Override // org.bouncycastle.crypto.Digest
    public String getAlgorithmName() {
        return "BLAKE2s";
    }

    @Override // org.bouncycastle.crypto.ExtendedDigest
    public int getByteLength() {
        return 64;
    }

    @Override // org.bouncycastle.crypto.Digest
    public int getDigestSize() {
        return this.digestLength;
    }

    @Override // org.bouncycastle.crypto.Digest
    public void reset() {
        this.bufferPos = 0;
        this.f19916f0 = 0;
        this.f19917f1 = 0;
        this.f19918t0 = 0;
        this.f19919t1 = 0;
        this.isLastNode = false;
        this.chainValue = null;
        Arrays.fill(this.buffer, (byte) 0);
        byte[] bArr = this.key;
        if (bArr != null) {
            System.arraycopy(bArr, 0, this.buffer, 0, bArr.length);
            this.bufferPos = 64;
        }
        init(this.salt, this.personalization, this.key);
    }

    public void setAsLastNode() {
        this.isLastNode = true;
    }

    @Override // org.bouncycastle.crypto.Digest
    public void update(byte b10) {
        int i10 = this.bufferPos;
        if (64 - i10 != 0) {
            this.buffer[i10] = b10;
            this.bufferPos = i10 + 1;
            return;
        }
        int i11 = this.f19918t0 + 64;
        this.f19918t0 = i11;
        if (i11 == 0) {
            this.f19919t1++;
        }
        compress(this.buffer, 0);
        Arrays.fill(this.buffer, (byte) 0);
        this.buffer[0] = b10;
        this.bufferPos = 1;
    }

    public Blake2sDigest(int i10) {
        this(i10, CryptoServicePurpose.ANY);
    }

    @Override // org.bouncycastle.crypto.Digest
    public void update(byte[] bArr, int i10, int i11) {
        int i12;
        if (bArr == null || i11 == 0) {
            return;
        }
        int i13 = this.bufferPos;
        if (i13 != 0) {
            i12 = 64 - i13;
            if (i12 >= i11) {
                System.arraycopy(bArr, i10, this.buffer, i13, i11);
                this.bufferPos += i11;
            }
            System.arraycopy(bArr, i10, this.buffer, i13, i12);
            int i14 = this.f19918t0 + 64;
            this.f19918t0 = i14;
            if (i14 == 0) {
                this.f19919t1++;
            }
            compress(this.buffer, 0);
            this.bufferPos = 0;
            Arrays.fill(this.buffer, (byte) 0);
        } else {
            i12 = 0;
        }
        int i15 = i11 + i10;
        int i16 = i15 - 64;
        int i17 = i10 + i12;
        while (i17 < i16) {
            int i18 = this.f19918t0 + 64;
            this.f19918t0 = i18;
            if (i18 == 0) {
                this.f19919t1++;
            }
            compress(bArr, i17);
            i17 += 64;
        }
        i11 = i15 - i17;
        System.arraycopy(bArr, i17, this.buffer, 0, i11);
        this.bufferPos += i11;
    }

    public Blake2sDigest(int i10, int i11, long j10) {
        this(i10, i11, j10, CryptoServicePurpose.ANY);
    }

    public Blake2sDigest(int i10, int i11, long j10, CryptoServicePurpose cryptoServicePurpose) {
        this.keyLength = 0;
        this.salt = null;
        this.personalization = null;
        this.key = null;
        this.isLastNode = false;
        this.buffer = null;
        this.bufferPos = 0;
        this.internalState = new int[16];
        this.chainValue = null;
        this.f19918t0 = 0;
        this.f19919t1 = 0;
        this.f19916f0 = 0;
        this.f19917f1 = 0;
        this.digestLength = i10;
        this.nodeOffset = j10;
        this.fanout = 0;
        this.depth = 0;
        this.leafLength = i11;
        this.innerHashLength = i11;
        this.nodeDepth = 0;
        this.purpose = cryptoServicePurpose;
        CryptoServicesRegistrar.checkConstraints(Utils.getDefaultProperties(this, i10 * 8, cryptoServicePurpose));
        init(null, null, null);
    }

    public Blake2sDigest(int i10, CryptoServicePurpose cryptoServicePurpose) {
        this.digestLength = 32;
        this.keyLength = 0;
        this.salt = null;
        this.personalization = null;
        this.key = null;
        this.fanout = 1;
        this.depth = 1;
        this.leafLength = 0;
        this.nodeOffset = 0L;
        this.nodeDepth = 0;
        this.innerHashLength = 0;
        this.isLastNode = false;
        this.buffer = null;
        this.bufferPos = 0;
        this.internalState = new int[16];
        this.chainValue = null;
        this.f19918t0 = 0;
        this.f19919t1 = 0;
        this.f19916f0 = 0;
        this.f19917f1 = 0;
        if (i10 < 8 || i10 > 256 || i10 % 8 != 0) {
            throw new IllegalArgumentException("BLAKE2s digest bit length must be a multiple of 8 and not greater than 256");
        }
        this.digestLength = i10 / 8;
        this.purpose = cryptoServicePurpose;
        CryptoServicesRegistrar.checkConstraints(Utils.getDefaultProperties(this, i10, cryptoServicePurpose));
        init(null, null, null);
    }

    public Blake2sDigest(int i10, byte[] bArr, byte[] bArr2, byte[] bArr3, long j10, CryptoServicePurpose cryptoServicePurpose) {
        this.keyLength = 0;
        this.salt = null;
        this.personalization = null;
        this.key = null;
        this.fanout = 1;
        this.depth = 1;
        this.leafLength = 0;
        this.nodeDepth = 0;
        this.innerHashLength = 0;
        this.isLastNode = false;
        this.buffer = null;
        this.bufferPos = 0;
        this.internalState = new int[16];
        this.chainValue = null;
        this.f19918t0 = 0;
        this.f19919t1 = 0;
        this.f19916f0 = 0;
        this.f19917f1 = 0;
        this.digestLength = i10;
        this.nodeOffset = j10;
        this.purpose = cryptoServicePurpose;
        CryptoServicesRegistrar.checkConstraints(Utils.getDefaultProperties(this, i10 * 8, cryptoServicePurpose));
        init(bArr2, bArr3, bArr);
    }

    public Blake2sDigest(Blake2sDigest blake2sDigest) {
        this.digestLength = 32;
        this.keyLength = 0;
        this.salt = null;
        this.personalization = null;
        this.key = null;
        this.fanout = 1;
        this.depth = 1;
        this.leafLength = 0;
        this.nodeOffset = 0L;
        this.nodeDepth = 0;
        this.innerHashLength = 0;
        this.isLastNode = false;
        this.buffer = null;
        this.bufferPos = 0;
        this.internalState = new int[16];
        this.chainValue = null;
        this.f19918t0 = 0;
        this.f19919t1 = 0;
        this.f19916f0 = 0;
        this.f19917f1 = 0;
        this.bufferPos = blake2sDigest.bufferPos;
        this.buffer = Arrays.clone(blake2sDigest.buffer);
        this.keyLength = blake2sDigest.keyLength;
        this.key = Arrays.clone(blake2sDigest.key);
        this.digestLength = blake2sDigest.digestLength;
        this.internalState = Arrays.clone(blake2sDigest.internalState);
        this.chainValue = Arrays.clone(blake2sDigest.chainValue);
        this.f19918t0 = blake2sDigest.f19918t0;
        this.f19919t1 = blake2sDigest.f19919t1;
        this.f19916f0 = blake2sDigest.f19916f0;
        this.salt = Arrays.clone(blake2sDigest.salt);
        this.personalization = Arrays.clone(blake2sDigest.personalization);
        this.fanout = blake2sDigest.fanout;
        this.depth = blake2sDigest.depth;
        this.leafLength = blake2sDigest.leafLength;
        this.nodeOffset = blake2sDigest.nodeOffset;
        this.nodeDepth = blake2sDigest.nodeDepth;
        this.innerHashLength = blake2sDigest.innerHashLength;
        this.purpose = blake2sDigest.purpose;
    }

    public Blake2sDigest(byte[] bArr) {
        this(bArr, CryptoServicePurpose.ANY);
    }

    public Blake2sDigest(byte[] bArr, int i10, byte[] bArr2, byte[] bArr3) {
        this(bArr, i10, bArr2, bArr3, CryptoServicePurpose.ANY);
    }

    public Blake2sDigest(byte[] bArr, int i10, byte[] bArr2, byte[] bArr3, CryptoServicePurpose cryptoServicePurpose) {
        this.digestLength = 32;
        this.keyLength = 0;
        this.salt = null;
        this.personalization = null;
        this.key = null;
        this.fanout = 1;
        this.depth = 1;
        this.leafLength = 0;
        this.nodeOffset = 0L;
        this.nodeDepth = 0;
        this.innerHashLength = 0;
        this.isLastNode = false;
        this.buffer = null;
        this.bufferPos = 0;
        this.internalState = new int[16];
        this.chainValue = null;
        this.f19918t0 = 0;
        this.f19919t1 = 0;
        this.f19916f0 = 0;
        this.f19917f1 = 0;
        if (i10 < 1 || i10 > 32) {
            throw new IllegalArgumentException("Invalid digest length (required: 1 - 32)");
        }
        this.digestLength = i10;
        this.purpose = cryptoServicePurpose;
        CryptoServicesRegistrar.checkConstraints(Utils.getDefaultProperties(this, i10 * 8, cryptoServicePurpose));
        init(bArr2, bArr3, bArr);
    }

    public Blake2sDigest(byte[] bArr, CryptoServicePurpose cryptoServicePurpose) {
        this.digestLength = 32;
        this.keyLength = 0;
        this.salt = null;
        this.personalization = null;
        this.key = null;
        this.fanout = 1;
        this.depth = 1;
        this.leafLength = 0;
        this.nodeOffset = 0L;
        this.nodeDepth = 0;
        this.innerHashLength = 0;
        this.isLastNode = false;
        this.buffer = null;
        this.bufferPos = 0;
        this.internalState = new int[16];
        this.chainValue = null;
        this.f19918t0 = 0;
        this.f19919t1 = 0;
        this.f19916f0 = 0;
        this.f19917f1 = 0;
        this.purpose = cryptoServicePurpose;
        CryptoServicesRegistrar.checkConstraints(Utils.getDefaultProperties(this, bArr.length * 8, cryptoServicePurpose));
        init(null, null, bArr);
    }

    public Blake2sDigest(byte[] bArr, byte[] bArr2) {
        this.digestLength = 32;
        this.keyLength = 0;
        this.salt = null;
        this.personalization = null;
        this.key = null;
        this.fanout = 1;
        this.depth = 1;
        this.leafLength = 0;
        this.nodeOffset = 0L;
        this.nodeDepth = 0;
        this.innerHashLength = 0;
        this.isLastNode = false;
        this.buffer = null;
        this.bufferPos = 0;
        this.internalState = new int[16];
        this.chainValue = null;
        this.f19918t0 = 0;
        this.f19919t1 = 0;
        this.f19916f0 = 0;
        this.f19917f1 = 0;
        this.purpose = CryptoServicePurpose.ANY;
        this.digestLength = bArr2[0];
        this.keyLength = bArr2[1];
        this.fanout = bArr2[2];
        this.depth = bArr2[3];
        this.leafLength = Pack.littleEndianToInt(bArr2, 4);
        this.nodeOffset |= Pack.littleEndianToInt(bArr2, 8);
        this.nodeDepth = bArr2[14];
        this.innerHashLength = bArr2[15];
        byte[] bArr3 = new byte[8];
        byte[] bArr4 = new byte[8];
        System.arraycopy(bArr2, 16, bArr3, 0, 8);
        System.arraycopy(bArr2, 24, bArr4, 0, 8);
        init(bArr3, bArr4, bArr);
    }
}
