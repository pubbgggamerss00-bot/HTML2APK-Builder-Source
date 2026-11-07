package org.bouncycastle.pqc.crypto.crystals.kyber;

import ad.b;
import java.security.SecureRandom;
import org.bouncycastle.pqc.crypto.crystals.dilithium.DilithiumEngine;
import org.bouncycastle.pqc.crypto.crystals.kyber.Symmetric;
import org.bouncycastle.util.Arrays;

/* loaded from: classes3.dex */
class KyberEngine {
    private static final int KyberEta2 = 2;
    private static final int KyberIndCpaMsgBytes = 32;
    public static final int KyberN = 256;
    public static final int KyberPolyBytes = 384;
    public static final int KyberQ = 3329;
    public static final int KyberQinv = 62209;
    private static final int KyberSharedSecretBytes = 32;
    public static final int KyberSymBytes = 32;
    private final int CryptoBytes;
    private final int CryptoCipherTextBytes;
    private final int CryptoPublicKeyBytes;
    private final int CryptoSecretKeyBytes;
    private final int KyberCipherTextBytes;
    private final int KyberEta1;
    private final int KyberIndCpaBytes;
    private final int KyberIndCpaPublicKeyBytes;
    private final int KyberIndCpaSecretKeyBytes;
    private final int KyberK;
    private final int KyberPolyCompressedBytes;
    private final int KyberPolyVecBytes;
    private final int KyberPolyVecCompressedBytes;
    private final int KyberPublicKeyBytes;
    private final int KyberSecretKeyBytes;
    private KyberIndCpa indCpa;
    private SecureRandom random;
    private final int sessionKeyLength;
    private final Symmetric symmetric;

    /* JADX WARN: Removed duplicated region for block: B:15:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0067  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public KyberEngine(int i10, boolean z10) {
        this.KyberK = i10;
        if (i10 == 2) {
            this.KyberEta1 = 3;
        } else {
            if (i10 != 3) {
                if (i10 != 4) {
                    throw new IllegalArgumentException(b.b(i10, "K: ", " is not supported for Crystals Kyber"));
                }
                this.KyberEta1 = 2;
                this.KyberPolyCompressedBytes = 160;
                this.KyberPolyVecCompressedBytes = i10 * 352;
                this.sessionKeyLength = 32;
                int i11 = i10 * 384;
                this.KyberPolyVecBytes = i11;
                int i12 = i11 + 32;
                this.KyberIndCpaPublicKeyBytes = i12;
                this.KyberIndCpaSecretKeyBytes = i11;
                int i13 = this.KyberPolyVecCompressedBytes + this.KyberPolyCompressedBytes;
                this.KyberIndCpaBytes = i13;
                this.KyberPublicKeyBytes = i12;
                int i14 = i11 + i12 + 64;
                this.KyberSecretKeyBytes = i14;
                this.KyberCipherTextBytes = i13;
                this.CryptoBytes = 32;
                this.CryptoSecretKeyBytes = i14;
                this.CryptoPublicKeyBytes = i12;
                this.CryptoCipherTextBytes = i13;
                this.symmetric = !z10 ? new Symmetric.AesSymmetric() : new Symmetric.ShakeSymmetric();
                this.indCpa = new KyberIndCpa(this);
            }
            this.KyberEta1 = 2;
        }
        this.KyberPolyCompressedBytes = 128;
        this.KyberPolyVecCompressedBytes = i10 * DilithiumEngine.DilithiumPolyT1PackedBytes;
        this.sessionKeyLength = 32;
        int i112 = i10 * 384;
        this.KyberPolyVecBytes = i112;
        int i122 = i112 + 32;
        this.KyberIndCpaPublicKeyBytes = i122;
        this.KyberIndCpaSecretKeyBytes = i112;
        int i132 = this.KyberPolyVecCompressedBytes + this.KyberPolyCompressedBytes;
        this.KyberIndCpaBytes = i132;
        this.KyberPublicKeyBytes = i122;
        int i142 = i112 + i122 + 64;
        this.KyberSecretKeyBytes = i142;
        this.KyberCipherTextBytes = i132;
        this.CryptoBytes = 32;
        this.CryptoSecretKeyBytes = i142;
        this.CryptoPublicKeyBytes = i122;
        this.CryptoCipherTextBytes = i132;
        this.symmetric = !z10 ? new Symmetric.AesSymmetric() : new Symmetric.ShakeSymmetric();
        this.indCpa = new KyberIndCpa(this);
    }

    private void cmov(byte[] bArr, byte[] bArr2, int i10, boolean z10) {
        if (z10) {
            System.arraycopy(bArr2, 0, bArr, 0, i10);
        } else {
            System.arraycopy(bArr, 0, bArr, 0, i10);
        }
    }

    public static int getKyberEta2() {
        return 2;
    }

    public static int getKyberIndCpaMsgBytes() {
        return 32;
    }

    public byte[][] generateKemKeyPair() {
        byte[][] bArrGenerateKeyPair = this.indCpa.generateKeyPair();
        int i10 = this.KyberIndCpaSecretKeyBytes;
        byte[] bArr = new byte[i10];
        System.arraycopy(bArrGenerateKeyPair[1], 0, bArr, 0, i10);
        byte[] bArr2 = new byte[32];
        this.symmetric.hash_h(bArr2, bArrGenerateKeyPair[0], 0);
        byte[] bArr3 = new byte[32];
        this.random.nextBytes(bArr3);
        int i11 = this.KyberIndCpaPublicKeyBytes;
        byte[] bArr4 = new byte[i11];
        System.arraycopy(bArrGenerateKeyPair[0], 0, bArr4, 0, i11);
        int i12 = i11 - 32;
        return new byte[][]{Arrays.copyOfRange(bArr4, 0, i12), Arrays.copyOfRange(bArr4, i12, i11), bArr, bArr2, bArr3};
    }

    public int getCryptoBytes() {
        return this.CryptoBytes;
    }

    public int getCryptoCipherTextBytes() {
        return this.CryptoCipherTextBytes;
    }

    public int getCryptoPublicKeyBytes() {
        return this.CryptoPublicKeyBytes;
    }

    public int getCryptoSecretKeyBytes() {
        return this.CryptoSecretKeyBytes;
    }

    public int getKyberCipherTextBytes() {
        return this.KyberCipherTextBytes;
    }

    public int getKyberEta1() {
        return this.KyberEta1;
    }

    public int getKyberIndCpaBytes() {
        return this.KyberIndCpaBytes;
    }

    public int getKyberIndCpaPublicKeyBytes() {
        return this.KyberIndCpaPublicKeyBytes;
    }

    public int getKyberIndCpaSecretKeyBytes() {
        return this.KyberIndCpaSecretKeyBytes;
    }

    public int getKyberK() {
        return this.KyberK;
    }

    public int getKyberPolyCompressedBytes() {
        return this.KyberPolyCompressedBytes;
    }

    public int getKyberPolyVecBytes() {
        return this.KyberPolyVecBytes;
    }

    public int getKyberPolyVecCompressedBytes() {
        return this.KyberPolyVecCompressedBytes;
    }

    public int getKyberPublicKeyBytes() {
        return this.KyberPublicKeyBytes;
    }

    public int getKyberSecretKeyBytes() {
        return this.KyberSecretKeyBytes;
    }

    public void getRandomBytes(byte[] bArr) {
        this.random.nextBytes(bArr);
    }

    public Symmetric getSymmetric() {
        return this.symmetric;
    }

    public void init(SecureRandom secureRandom) {
        this.random = secureRandom;
    }

    public byte[] kemDecrypt(byte[] bArr, byte[] bArr2) {
        byte[] bArr3 = new byte[64];
        byte[] bArr4 = new byte[64];
        byte[] bArrCopyOfRange = Arrays.copyOfRange(bArr2, this.KyberIndCpaSecretKeyBytes, bArr2.length);
        System.arraycopy(this.indCpa.decrypt(bArr, bArr2), 0, bArr3, 0, 32);
        System.arraycopy(bArr2, this.KyberSecretKeyBytes - 64, bArr3, 32, 32);
        this.symmetric.hash_g(bArr4, bArr3);
        boolean z10 = !Arrays.constantTimeAreEqual(bArr, this.indCpa.encrypt(Arrays.copyOfRange(bArr3, 0, 32), bArrCopyOfRange, Arrays.copyOfRange(bArr4, 32, 64)));
        this.symmetric.hash_h(bArr4, bArr, 32);
        int i10 = this.KyberSecretKeyBytes;
        cmov(bArr4, Arrays.copyOfRange(bArr2, i10 - 32, i10), 32, z10);
        return Arrays.copyOfRange(bArr4, 0, this.sessionKeyLength);
    }

    public byte[][] kemEncrypt(byte[] bArr) {
        if (bArr.length != this.KyberIndCpaPublicKeyBytes) {
            throw new IllegalArgumentException("Input validation Error: Type check failed for ml-kem encapsulation");
        }
        PolyVec polyVec = new PolyVec(this);
        if (!Arrays.areEqual(this.indCpa.packPublicKey(polyVec, this.indCpa.unpackPublicKey(polyVec, bArr)), bArr)) {
            throw new IllegalArgumentException("Input validation: Modulus check failed for ml-kem encapsulation");
        }
        byte[] bArr2 = new byte[64];
        byte[] bArr3 = new byte[64];
        byte[] bArr4 = new byte[32];
        this.random.nextBytes(bArr4);
        System.arraycopy(bArr4, 0, bArr2, 0, 32);
        this.symmetric.hash_h(bArr2, bArr, 32);
        this.symmetric.hash_g(bArr3, bArr2);
        byte[] bArrEncrypt = this.indCpa.encrypt(Arrays.copyOfRange(bArr2, 0, 32), bArr, Arrays.copyOfRange(bArr3, 32, 64));
        int i10 = this.sessionKeyLength;
        byte[] bArr5 = new byte[i10];
        System.arraycopy(bArr3, 0, bArr5, 0, i10);
        return new byte[][]{bArr5, bArrEncrypt};
    }
}
