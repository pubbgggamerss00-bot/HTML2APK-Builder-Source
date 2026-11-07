package org.bouncycastle.pqc.crypto.hqc;

import org.bouncycastle.asn1.cmc.BodyPartID;
import org.bouncycastle.util.Arrays;
import org.bouncycastle.util.Pack;

/* loaded from: classes3.dex */
class HQCEngine {
    private int K_BYTE;
    private int K_BYTE_64;
    private int N1N2_BYTE;
    private int N1N2_BYTE_64;
    private int N1_BYTE;
    private int N1_BYTE_64;
    private int N_BYTE;
    private int N_BYTE_64;
    private long RED_MASK;
    private int delta;
    private int fft;

    /* renamed from: g, reason: collision with root package name */
    private int f20361g;
    private int[] generatorPoly;
    private GF2PolynomialCalculator gfCalculator;

    /* renamed from: k, reason: collision with root package name */
    private int f20362k;
    private int mulParam;

    /* renamed from: n, reason: collision with root package name */
    private int f20363n;

    /* renamed from: n1, reason: collision with root package name */
    private int f20364n1;
    private int n1n2;

    /* renamed from: n2, reason: collision with root package name */
    private int f20365n2;
    private int rejectionThreshold;

    /* renamed from: w, reason: collision with root package name */
    private int f20366w;

    /* renamed from: we, reason: collision with root package name */
    private int f20367we;
    private int wr;
    private int SEED_SIZE = 40;
    private byte G_FCT_DOMAIN = 3;
    private byte H_FCT_DOMAIN = 4;
    private byte K_FCT_DOMAIN = 5;
    private int GF_POLY_WT = 5;
    private int GF_POLY_M2 = 4;
    private int SALT_SIZE_BYTES = 16;
    private int SALT_SIZE_64 = 2;
    private int SHA512_BYTES = 64;

    public HQCEngine(int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18, int i19, int i20, int[] iArr) {
        this.f20363n = i10;
        this.f20362k = i13;
        this.delta = i15;
        this.f20366w = i16;
        this.wr = i17;
        this.f20367we = i18;
        this.f20364n1 = i11;
        this.f20365n2 = i12;
        int i21 = i11 * i12;
        this.n1n2 = i21;
        this.generatorPoly = iArr;
        this.f20361g = i14;
        this.rejectionThreshold = i19;
        this.fft = i20;
        this.mulParam = (int) Math.ceil(i12 / 128);
        this.N_BYTE = Utils.getByteSizeFromBitSize(i10);
        this.K_BYTE = i13;
        this.N_BYTE_64 = Utils.getByte64SizeFromBitSize(i10);
        this.K_BYTE_64 = Utils.getByteSizeFromBitSize(i13);
        this.N1_BYTE_64 = Utils.getByteSizeFromBitSize(i11);
        this.N1N2_BYTE_64 = Utils.getByte64SizeFromBitSize(i21);
        this.N1N2_BYTE = Utils.getByteSizeFromBitSize(i21);
        this.N1_BYTE = Utils.getByteSizeFromBitSize(i11);
        long j10 = (1 << ((int) (i10 % 64))) - 1;
        this.RED_MASK = j10;
        this.gfCalculator = new GF2PolynomialCalculator(this.N_BYTE_64, i10, j10);
    }

    private void decrypt(byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, long[] jArr) {
        long[] jArr2 = new long[this.N_BYTE_64];
        Utils.fromByteArrayToLongArray(jArr2, bArr3);
        int i10 = this.N1N2_BYTE_64;
        long[] jArr3 = new long[i10];
        Utils.fromByteArrayToLongArray(jArr3, bArr4);
        long[] jArr4 = new long[this.N_BYTE_64];
        System.arraycopy(jArr3, 0, jArr4, 0, i10);
        long[] jArr5 = new long[this.N_BYTE_64];
        this.gfCalculator.multLongs(jArr5, jArr, jArr2);
        GF2PolynomialCalculator.addLongs(jArr5, jArr5, jArr4);
        int i11 = this.f20364n1;
        byte[] bArr5 = new byte[i11];
        ReedMuller.decode(bArr5, jArr5, i11, this.mulParam);
        ReedSolomon.decode(bArr2, bArr5, this.f20364n1, this.fft, this.delta, this.f20362k, this.f20361g);
        System.arraycopy(bArr2, 0, bArr, 0, bArr.length);
    }

    private void encrypt(byte[] bArr, long[] jArr, long[] jArr2, byte[] bArr2, byte[] bArr3, byte[] bArr4) {
        KeccakRandomGenerator keccakRandomGenerator = new KeccakRandomGenerator(256);
        keccakRandomGenerator.seedExpanderInit(bArr4, this.SEED_SIZE);
        int i10 = this.N_BYTE_64;
        long[] jArr3 = new long[i10];
        long[] jArr4 = new long[i10];
        long[] jArr5 = new long[i10];
        generateRandomFixedWeight(jArr4, keccakRandomGenerator, this.wr);
        generateRandomFixedWeight(jArr5, keccakRandomGenerator, this.wr);
        generateRandomFixedWeight(jArr3, keccakRandomGenerator, this.f20367we);
        long[] jArr6 = new long[this.N_BYTE_64];
        this.gfCalculator.multLongs(jArr6, jArr5, jArr2);
        GF2PolynomialCalculator.addLongs(jArr6, jArr6, jArr4);
        Utils.fromLongArrayToByteArray(bArr, jArr6);
        int i11 = this.f20364n1;
        byte[] bArr5 = new byte[i11];
        int i12 = this.N1N2_BYTE_64;
        long[] jArr7 = new long[i12];
        long[] jArr8 = new long[this.N_BYTE_64];
        ReedSolomon.encode(bArr5, bArr3, this.K_BYTE * 8, i11, this.f20362k, this.f20361g, this.generatorPoly);
        ReedMuller.encode(jArr7, bArr5, this.f20364n1, this.mulParam);
        System.arraycopy(jArr7, 0, jArr8, 0, i12);
        long[] jArr9 = new long[this.N_BYTE_64];
        Utils.fromByteArrayToLongArray(jArr9, bArr2);
        long[] jArr10 = new long[this.N_BYTE_64];
        this.gfCalculator.multLongs(jArr10, jArr5, jArr9);
        GF2PolynomialCalculator.addLongs(jArr10, jArr10, jArr8);
        GF2PolynomialCalculator.addLongs(jArr10, jArr10, jArr3);
        int i13 = this.n1n2;
        int i14 = this.f20363n;
        int i15 = this.N1N2_BYTE_64;
        Utils.resizeArray(jArr, i13, jArr10, i14, i15, i15);
    }

    private void extractCiphertexts(byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, byte[] bArr5) {
        System.arraycopy(bArr5, 0, bArr, 0, bArr.length);
        System.arraycopy(bArr5, bArr.length, bArr2, 0, bArr2.length);
        System.arraycopy(bArr5, bArr.length + bArr2.length, bArr3, 0, bArr3.length);
        System.arraycopy(bArr5, bArr.length + bArr2.length + bArr3.length, bArr4, 0, bArr4.length);
    }

    private void extractKeysFromSecretKeys(long[] jArr, long[] jArr2, byte[] bArr, byte[] bArr2) {
        int i10 = this.SEED_SIZE;
        byte[] bArr3 = new byte[i10];
        System.arraycopy(bArr2, 0, bArr3, 0, i10);
        KeccakRandomGenerator keccakRandomGenerator = new KeccakRandomGenerator(256);
        keccakRandomGenerator.seedExpanderInit(bArr3, i10);
        generateRandomFixedWeight(jArr, keccakRandomGenerator, this.f20366w);
        generateRandomFixedWeight(jArr2, keccakRandomGenerator, this.f20366w);
        System.arraycopy(bArr2, this.SEED_SIZE, bArr, 0, bArr.length);
    }

    private void extractPublicKeys(long[] jArr, byte[] bArr, byte[] bArr2) {
        int i10 = this.SEED_SIZE;
        byte[] bArr3 = new byte[i10];
        System.arraycopy(bArr2, 0, bArr3, 0, i10);
        KeccakRandomGenerator keccakRandomGenerator = new KeccakRandomGenerator(256);
        keccakRandomGenerator.seedExpanderInit(bArr3, i10);
        long[] jArr2 = new long[this.N_BYTE_64];
        generatePublicKeyH(jArr2, keccakRandomGenerator);
        System.arraycopy(jArr2, 0, jArr, 0, jArr.length);
        System.arraycopy(bArr2, 40, bArr, 0, bArr.length);
    }

    private void generateRandomFixedWeight(long[] jArr, KeccakRandomGenerator keccakRandomGenerator, int i10) {
        int i11 = this.wr;
        byte[] bArr = new byte[i11 * 4];
        int[] iArr = new int[i11];
        int[] iArr2 = new int[i11];
        long[] jArr2 = new long[i11];
        keccakRandomGenerator.expandSeed(bArr, i10 * 4);
        Pack.littleEndianToInt(bArr, 0, new int[i11], 0, i11);
        for (int i12 = 0; i12 < i10; i12++) {
            iArr[i12] = (int) (((r1[i12] & BodyPartID.bodyIdMax) % (this.f20363n - i12)) + i12);
        }
        for (int i13 = i10 - 1; i13 >= 0; i13--) {
            int i14 = 0;
            for (int i15 = i13 + 1; i15 < i10; i15++) {
                if (iArr[i15] == iArr[i13]) {
                    i14 = 1;
                }
            }
            int i16 = -i14;
            iArr[i13] = ((~i16) & iArr[i13]) ^ (i16 & i13);
        }
        for (int i17 = 0; i17 < i10; i17++) {
            iArr2[i17] = iArr[i17] >>> 6;
            jArr2[i17] = 1 << (iArr[i17] & 63);
        }
        for (int i18 = 0; i18 < this.N_BYTE_64; i18++) {
            long j10 = 0;
            for (int i19 = 0; i19 < i10; i19++) {
                int i20 = i18 - iArr2[i19];
                j10 |= (-(((i20 | (-i20)) >>> 31) ^ 1)) & jArr2[i19];
            }
            jArr[i18] = j10 | jArr[i18];
        }
    }

    public void decaps(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        int i10 = this.N_BYTE_64;
        long[] jArr = new long[i10];
        byte[] bArr4 = new byte[this.N_BYTE + 40];
        extractKeysFromSecretKeys(new long[i10], jArr, bArr4, bArr3);
        byte[] bArr5 = new byte[this.N_BYTE];
        byte[] bArr6 = new byte[this.N1N2_BYTE];
        byte[] bArr7 = new byte[this.SHA512_BYTES];
        byte[] bArr8 = new byte[this.SALT_SIZE_BYTES];
        extractCiphertexts(bArr5, bArr6, bArr7, bArr8, bArr2);
        int i11 = this.f20362k;
        byte[] bArr9 = new byte[i11];
        decrypt(bArr9, bArr9, bArr5, bArr6, jArr);
        byte[] bArr10 = new byte[this.SHA512_BYTES];
        int i12 = this.K_BYTE + this.SALT_SIZE_BYTES + this.SEED_SIZE;
        byte[] bArr11 = new byte[i12];
        System.arraycopy(bArr9, 0, bArr11, 0, i11);
        System.arraycopy(bArr4, 0, bArr11, this.K_BYTE, this.SEED_SIZE);
        System.arraycopy(bArr8, 0, bArr11, this.K_BYTE + this.SEED_SIZE, this.SALT_SIZE_BYTES);
        KeccakRandomGenerator keccakRandomGenerator = new KeccakRandomGenerator(256);
        keccakRandomGenerator.SHAKE256_512_ds(bArr10, bArr11, i12, new byte[]{this.G_FCT_DOMAIN});
        long[] jArr2 = new long[this.N_BYTE_64];
        byte[] bArr12 = new byte[this.N_BYTE];
        extractPublicKeys(jArr2, bArr12, bArr4);
        byte[] bArr13 = new byte[this.N_BYTE];
        byte[] bArr14 = new byte[this.N1N2_BYTE];
        long[] jArr3 = new long[this.N1N2_BYTE_64];
        encrypt(bArr13, jArr3, jArr2, bArr12, bArr9, bArr10);
        Utils.fromLongArrayToByteArray(bArr14, jArr3);
        byte[] bArr15 = new byte[this.SHA512_BYTES];
        keccakRandomGenerator.SHAKE256_512_ds(bArr15, bArr9, i11, new byte[]{this.H_FCT_DOMAIN});
        byte[] bArr16 = new byte[this.K_BYTE + this.N_BYTE + this.N1N2_BYTE];
        byte[] bArrConcatenate = Arrays.concatenate(Arrays.concatenate(bArr9, bArr5), bArr6);
        keccakRandomGenerator.SHAKE256_512_ds(bArr, bArrConcatenate, bArrConcatenate.length, new byte[]{this.K_FCT_DOMAIN});
        boolean zAreEqual = Arrays.areEqual(bArr5, bArr13);
        if (!Arrays.areEqual(bArr6, bArr14)) {
            zAreEqual = false;
        }
        if (!Arrays.areEqual(bArr7, bArr15)) {
            zAreEqual = false;
        }
        if (zAreEqual) {
            return;
        }
        for (int i13 = 0; i13 < getSessionKeySize(); i13++) {
            bArr[i13] = 0;
        }
    }

    public void encaps(byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, byte[] bArr5, byte[] bArr6, byte[] bArr7) {
        int i10 = this.K_BYTE;
        byte[] bArr8 = new byte[i10];
        byte[] bArr9 = new byte[this.SEED_SIZE];
        KeccakRandomGenerator keccakRandomGenerator = new KeccakRandomGenerator(256);
        keccakRandomGenerator.randomGeneratorInit(bArr6, null, bArr6.length, 0);
        keccakRandomGenerator.squeeze(bArr9, 40);
        keccakRandomGenerator.squeeze(new byte[this.SEED_SIZE], 40);
        keccakRandomGenerator.squeeze(bArr8, this.K_BYTE);
        byte[] bArr10 = new byte[this.SHA512_BYTES];
        int i11 = this.K_BYTE + this.SEED_SIZE;
        int i12 = this.SALT_SIZE_BYTES;
        int i13 = i11 + i12;
        byte[] bArr11 = new byte[i13];
        keccakRandomGenerator.squeeze(bArr7, i12);
        System.arraycopy(bArr8, 0, bArr11, 0, i10);
        System.arraycopy(bArr5, 0, bArr11, this.K_BYTE, this.SEED_SIZE);
        System.arraycopy(bArr7, 0, bArr11, this.K_BYTE + this.SEED_SIZE, this.SALT_SIZE_BYTES);
        KeccakRandomGenerator keccakRandomGenerator2 = new KeccakRandomGenerator(256);
        keccakRandomGenerator2.SHAKE256_512_ds(bArr10, bArr11, i13, new byte[]{this.G_FCT_DOMAIN});
        long[] jArr = new long[this.N_BYTE_64];
        byte[] bArr12 = new byte[this.N_BYTE];
        extractPublicKeys(jArr, bArr12, bArr5);
        long[] jArr2 = new long[this.N1N2_BYTE_64];
        encrypt(bArr, jArr2, jArr, bArr12, bArr8, bArr10);
        Utils.fromLongArrayToByteArray(bArr2, jArr2);
        keccakRandomGenerator2.SHAKE256_512_ds(bArr4, bArr8, i10, new byte[]{this.H_FCT_DOMAIN});
        byte[] bArr13 = new byte[this.K_BYTE + this.N_BYTE + this.N1N2_BYTE];
        byte[] bArrConcatenate = Arrays.concatenate(Arrays.concatenate(bArr8, bArr), bArr2);
        keccakRandomGenerator2.SHAKE256_512_ds(bArr3, bArrConcatenate, bArrConcatenate.length, new byte[]{this.K_FCT_DOMAIN});
    }

    public void genKeyPair(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        int i10 = this.SEED_SIZE;
        byte[] bArr4 = new byte[i10];
        KeccakRandomGenerator keccakRandomGenerator = new KeccakRandomGenerator(256);
        keccakRandomGenerator.randomGeneratorInit(bArr3, null, bArr3.length, 0);
        keccakRandomGenerator.squeeze(bArr4, 40);
        KeccakRandomGenerator keccakRandomGenerator2 = new KeccakRandomGenerator(256);
        keccakRandomGenerator2.seedExpanderInit(bArr4, i10);
        int i11 = this.N_BYTE_64;
        long[] jArr = new long[i11];
        long[] jArr2 = new long[i11];
        generateRandomFixedWeight(jArr, keccakRandomGenerator2, this.f20366w);
        generateRandomFixedWeight(jArr2, keccakRandomGenerator2, this.f20366w);
        int i12 = this.SEED_SIZE;
        byte[] bArr5 = new byte[i12];
        keccakRandomGenerator.squeeze(bArr5, 40);
        KeccakRandomGenerator keccakRandomGenerator3 = new KeccakRandomGenerator(256);
        keccakRandomGenerator3.seedExpanderInit(bArr5, i12);
        long[] jArr3 = new long[this.N_BYTE_64];
        generatePublicKeyH(jArr3, keccakRandomGenerator3);
        long[] jArr4 = new long[this.N_BYTE_64];
        this.gfCalculator.multLongs(jArr4, jArr2, jArr3);
        GF2PolynomialCalculator.addLongs(jArr4, jArr4, jArr);
        byte[] bArr6 = new byte[this.N_BYTE];
        Utils.fromLongArrayToByteArray(bArr6, jArr4);
        byte[] bArrConcatenate = Arrays.concatenate(bArr5, bArr6);
        byte[] bArrConcatenate2 = Arrays.concatenate(bArr4, bArrConcatenate);
        System.arraycopy(bArrConcatenate, 0, bArr, 0, bArrConcatenate.length);
        System.arraycopy(bArrConcatenate2, 0, bArr2, 0, bArrConcatenate2.length);
    }

    public void generatePublicKeyH(long[] jArr, KeccakRandomGenerator keccakRandomGenerator) {
        int i10 = this.N_BYTE;
        byte[] bArr = new byte[i10];
        keccakRandomGenerator.expandSeed(bArr, i10);
        long[] jArr2 = new long[this.N_BYTE_64];
        Utils.fromByteArrayToLongArray(jArr2, bArr);
        int i11 = this.N_BYTE_64 - 1;
        jArr2[i11] = jArr2[i11] & Utils.bitMask(this.f20363n, 64L);
        System.arraycopy(jArr2, 0, jArr, 0, jArr.length);
    }

    public int getSessionKeySize() {
        return this.SHA512_BYTES;
    }
}
