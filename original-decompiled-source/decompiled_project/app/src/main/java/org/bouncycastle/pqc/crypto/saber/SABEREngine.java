package org.bouncycastle.pqc.crypto.saber;

import java.lang.reflect.Array;
import java.security.SecureRandom;
import org.bouncycastle.pqc.crypto.crystals.dilithium.DilithiumEngine;
import org.bouncycastle.pqc.crypto.saber.Symmetric;
import org.bouncycastle.util.Arrays;

/* loaded from: classes3.dex */
class SABEREngine {
    public static final int SABER_EP = 10;
    private static final int SABER_HASHBYTES = 32;
    private static final int SABER_KEYBYTES = 32;
    public static final int SABER_N = 256;
    private static final int SABER_NOISE_SEEDBYTES = 32;
    private static final int SABER_SEEDBYTES = 32;
    private final int SABER_BYTES_CCA_DEC;
    private final int SABER_EQ;
    private final int SABER_ET;
    private final int SABER_INDCPA_PUBLICKEYBYTES;
    private final int SABER_INDCPA_SECRETKEYBYTES;
    private final int SABER_L;
    private final int SABER_MU;
    private final int SABER_POLYBYTES;
    private final int SABER_POLYCOINBYTES;
    private final int SABER_POLYCOMPRESSEDBYTES;
    private final int SABER_POLYVECBYTES;
    private final int SABER_POLYVECCOMPRESSEDBYTES;
    private final int SABER_PUBLICKEYBYTES;
    private final int SABER_SCALEBYTES_KEM;
    private final int SABER_SECRETKEYBYTES;
    private final int defaultKeySize;

    /* renamed from: h1, reason: collision with root package name */
    private final int f20423h1;

    /* renamed from: h2, reason: collision with root package name */
    private final int f20424h2;
    private final Poly poly;
    protected final Symmetric symmetric;
    private final boolean usingAES;
    protected final boolean usingEffectiveMasking;
    private final Utils utils;

    public SABEREngine(int i10, int i11, boolean z10, boolean z11) {
        int i12;
        this.defaultKeySize = i11;
        this.usingAES = z10;
        this.usingEffectiveMasking = z11;
        this.SABER_L = i10;
        if (i10 == 2) {
            this.SABER_MU = 10;
            this.SABER_ET = 3;
        } else {
            if (i10 == 3) {
                this.SABER_MU = 8;
                i12 = 4;
            } else {
                i12 = 6;
                this.SABER_MU = 6;
            }
            this.SABER_ET = i12;
        }
        this.symmetric = z10 ? new Symmetric.AesSymmetric() : new Symmetric.ShakeSymmetric();
        if (z11) {
            this.SABER_EQ = 12;
            this.SABER_POLYCOINBYTES = 64;
        } else {
            this.SABER_EQ = 13;
            this.SABER_POLYCOINBYTES = (this.SABER_MU * 256) / 8;
        }
        int i13 = this.SABER_EQ;
        int i14 = (i13 * 256) / 8;
        this.SABER_POLYBYTES = i14;
        int i15 = i14 * i10;
        this.SABER_POLYVECBYTES = i15;
        this.SABER_POLYCOMPRESSEDBYTES = DilithiumEngine.DilithiumPolyT1PackedBytes;
        int i16 = i10 * DilithiumEngine.DilithiumPolyT1PackedBytes;
        this.SABER_POLYVECCOMPRESSEDBYTES = i16;
        int i17 = this.SABER_ET;
        int i18 = (i17 * 256) / 8;
        this.SABER_SCALEBYTES_KEM = i18;
        int i19 = i16 + 32;
        this.SABER_INDCPA_PUBLICKEYBYTES = i19;
        this.SABER_INDCPA_SECRETKEYBYTES = i15;
        this.SABER_PUBLICKEYBYTES = i19;
        this.SABER_SECRETKEYBYTES = i15 + i19 + 64;
        this.SABER_BYTES_CCA_DEC = i16 + i18;
        int i20 = 1 << (i13 - 11);
        this.f20423h1 = i20;
        this.f20424h2 = (256 - (1 << (9 - i17))) + i20;
        this.utils = new Utils(this);
        this.poly = new Poly(this);
    }

    public static void cmov(byte[] bArr, byte[] bArr2, int i10, int i11, byte b10) {
        byte b11 = (byte) (-b10);
        for (int i12 = 0; i12 < i11; i12++) {
            byte b12 = bArr[i12];
            bArr[i12] = (byte) (b12 ^ ((bArr2[i12 + i10] ^ b12) & b11));
        }
    }

    private void indcpa_kem_dec(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        int[] iArr = {this.SABER_L, 256};
        Class cls = Short.TYPE;
        short[][] sArr = (short[][]) Array.newInstance((Class<?>) cls, iArr);
        short[][] sArr2 = (short[][]) Array.newInstance((Class<?>) cls, this.SABER_L, 256);
        short[] sArr3 = new short[256];
        short[] sArr4 = new short[256];
        this.utils.BS2POLVECq(bArr, 0, sArr);
        this.utils.BS2POLVECp(bArr2, sArr2);
        this.poly.InnerProd(sArr2, sArr, sArr3);
        this.utils.BS2POLT(bArr2, this.SABER_POLYVECCOMPRESSEDBYTES, sArr4);
        for (int i10 = 0; i10 < 256; i10++) {
            sArr3[i10] = (short) ((((sArr3[i10] + this.f20424h2) - (sArr4[i10] << (10 - this.SABER_ET))) & 65535) >> 9);
        }
        this.utils.POLmsg2BS(bArr3, sArr3);
    }

    private void indcpa_kem_enc(byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4) {
        int i10 = this.SABER_L;
        int[] iArr = {i10, i10, 256};
        Class cls = Short.TYPE;
        short[][][] sArr = (short[][][]) Array.newInstance((Class<?>) cls, iArr);
        short[][] sArr2 = (short[][]) Array.newInstance((Class<?>) cls, this.SABER_L, 256);
        short[][] sArr3 = (short[][]) Array.newInstance((Class<?>) cls, this.SABER_L, 256);
        short[][] sArr4 = (short[][]) Array.newInstance((Class<?>) cls, this.SABER_L, 256);
        short[] sArr5 = new short[256];
        short[] sArr6 = new short[256];
        this.poly.GenMatrix(sArr, Arrays.copyOfRange(bArr3, this.SABER_POLYVECCOMPRESSEDBYTES, bArr3.length));
        this.poly.GenSecret(sArr2, bArr2);
        this.poly.MatrixVectorMul(sArr, sArr2, sArr3, 0);
        for (int i11 = 0; i11 < this.SABER_L; i11++) {
            for (int i12 = 0; i12 < 256; i12++) {
                short[] sArr7 = sArr3[i11];
                sArr7[i12] = (short) (((sArr7[i12] + this.f20423h1) & 65535) >>> (this.SABER_EQ - 10));
            }
        }
        this.utils.POLVECp2BS(bArr4, sArr3);
        this.utils.BS2POLVECp(bArr3, sArr4);
        this.poly.InnerProd(sArr4, sArr2, sArr6);
        this.utils.BS2POLmsg(bArr, sArr5);
        for (int i13 = 0; i13 < 256; i13++) {
            sArr6[i13] = (short) ((((sArr6[i13] - (sArr5[i13] << 9)) + this.f20423h1) & 65535) >>> (10 - this.SABER_ET));
        }
        this.utils.POLT2BS(bArr4, this.SABER_POLYVECCOMPRESSEDBYTES, sArr6);
    }

    private void indcpa_kem_keypair(byte[] bArr, byte[] bArr2, SecureRandom secureRandom) {
        int i10 = this.SABER_L;
        int[] iArr = {i10, i10, 256};
        Class cls = Short.TYPE;
        short[][][] sArr = (short[][][]) Array.newInstance((Class<?>) cls, iArr);
        short[][] sArr2 = (short[][]) Array.newInstance((Class<?>) cls, this.SABER_L, 256);
        short[][] sArr3 = (short[][]) Array.newInstance((Class<?>) cls, this.SABER_L, 256);
        byte[] bArr3 = new byte[32];
        byte[] bArr4 = new byte[32];
        secureRandom.nextBytes(bArr3);
        this.symmetric.prf(bArr3, bArr3, 32, 32);
        secureRandom.nextBytes(bArr4);
        this.poly.GenMatrix(sArr, bArr3);
        this.poly.GenSecret(sArr2, bArr4);
        this.poly.MatrixVectorMul(sArr, sArr2, sArr3, 1);
        for (int i11 = 0; i11 < this.SABER_L; i11++) {
            for (int i12 = 0; i12 < 256; i12++) {
                short[] sArr4 = sArr3[i11];
                sArr4[i12] = (short) (((sArr4[i12] + this.f20423h1) & 65535) >>> (this.SABER_EQ - 10));
            }
        }
        this.utils.POLVECq2BS(bArr2, sArr2);
        this.utils.POLVECp2BS(bArr, sArr3);
        System.arraycopy(bArr3, 0, bArr, this.SABER_POLYVECCOMPRESSEDBYTES, 32);
    }

    public static int verify(byte[] bArr, byte[] bArr2, int i10) {
        long j10 = 0;
        for (int i11 = 0; i11 < i10; i11++) {
            j10 |= bArr[i11] ^ bArr2[i11];
        }
        return (int) ((-j10) >>> 63);
    }

    public int crypto_kem_dec(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        byte[] bArr4 = new byte[this.SABER_BYTES_CCA_DEC];
        byte[] bArr5 = new byte[64];
        byte[] bArr6 = new byte[64];
        byte[] bArrCopyOfRange = Arrays.copyOfRange(bArr3, this.SABER_INDCPA_SECRETKEYBYTES, bArr3.length);
        indcpa_kem_dec(bArr3, bArr2, bArr5);
        for (int i10 = 0; i10 < 32; i10++) {
            bArr5[i10 + 32] = bArr3[(this.SABER_SECRETKEYBYTES - 64) + i10];
        }
        this.symmetric.hash_g(bArr6, bArr5);
        indcpa_kem_enc(bArr5, Arrays.copyOfRange(bArr6, 32, 64), bArrCopyOfRange, bArr4);
        int iVerify = verify(bArr2, bArr4, this.SABER_BYTES_CCA_DEC);
        this.symmetric.hash_h(bArr6, bArr2, 32);
        cmov(bArr6, bArr3, this.SABER_SECRETKEYBYTES - 32, 32, (byte) iVerify);
        byte[] bArr7 = new byte[32];
        this.symmetric.hash_h(bArr7, bArr6, 0);
        System.arraycopy(bArr7, 0, bArr, 0, this.defaultKeySize / 8);
        return 0;
    }

    public int crypto_kem_enc(byte[] bArr, byte[] bArr2, byte[] bArr3, SecureRandom secureRandom) {
        byte[] bArr4 = new byte[64];
        byte[] bArr5 = new byte[64];
        byte[] bArr6 = new byte[32];
        secureRandom.nextBytes(bArr6);
        this.symmetric.hash_h(bArr6, bArr6, 0);
        System.arraycopy(bArr6, 0, bArr5, 0, 32);
        this.symmetric.hash_h(bArr5, bArr3, 32);
        this.symmetric.hash_g(bArr4, bArr5);
        indcpa_kem_enc(bArr5, Arrays.copyOfRange(bArr4, 32, 64), bArr3, bArr);
        this.symmetric.hash_h(bArr4, bArr, 32);
        byte[] bArr7 = new byte[32];
        this.symmetric.hash_h(bArr7, bArr4, 0);
        System.arraycopy(bArr7, 0, bArr2, 0, this.defaultKeySize / 8);
        return 0;
    }

    public int crypto_kem_keypair(byte[] bArr, byte[] bArr2, SecureRandom secureRandom) {
        indcpa_kem_keypair(bArr, bArr2, secureRandom);
        for (int i10 = 0; i10 < this.SABER_INDCPA_PUBLICKEYBYTES; i10++) {
            bArr2[this.SABER_INDCPA_SECRETKEYBYTES + i10] = bArr[i10];
        }
        this.symmetric.hash_h(bArr2, bArr, this.SABER_SECRETKEYBYTES - 64);
        byte[] bArr3 = new byte[32];
        secureRandom.nextBytes(bArr3);
        System.arraycopy(bArr3, 0, bArr2, this.SABER_SECRETKEYBYTES - 32, 32);
        return 0;
    }

    public int getCipherTextSize() {
        return this.SABER_BYTES_CCA_DEC;
    }

    public int getPrivateKeySize() {
        return this.SABER_SECRETKEYBYTES;
    }

    public int getPublicKeySize() {
        return this.SABER_PUBLICKEYBYTES;
    }

    public int getSABER_EP() {
        return 10;
    }

    public int getSABER_ET() {
        return this.SABER_ET;
    }

    public int getSABER_KEYBYTES() {
        return 32;
    }

    public int getSABER_L() {
        return this.SABER_L;
    }

    public int getSABER_MU() {
        return this.SABER_MU;
    }

    public int getSABER_N() {
        return 256;
    }

    public int getSABER_NOISE_SEEDBYTES() {
        return 32;
    }

    public int getSABER_POLYBYTES() {
        return this.SABER_POLYBYTES;
    }

    public int getSABER_POLYCOINBYTES() {
        return this.SABER_POLYCOINBYTES;
    }

    public int getSABER_POLYVECBYTES() {
        return this.SABER_POLYVECBYTES;
    }

    public int getSABER_SEEDBYTES() {
        return 32;
    }

    public int getSessionKeySize() {
        return this.defaultKeySize / 8;
    }

    public Utils getUtils() {
        return this.utils;
    }
}
