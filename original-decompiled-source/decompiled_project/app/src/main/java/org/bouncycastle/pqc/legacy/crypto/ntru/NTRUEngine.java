package org.bouncycastle.pqc.legacy.crypto.ntru;

import e1.c;
import java.security.SecureRandom;
import org.bouncycastle.crypto.AsymmetricBlockCipher;
import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.CryptoServicesRegistrar;
import org.bouncycastle.crypto.DataLengthException;
import org.bouncycastle.crypto.Digest;
import org.bouncycastle.crypto.InvalidCipherTextException;
import org.bouncycastle.crypto.params.ParametersWithRandom;
import org.bouncycastle.pqc.legacy.math.ntru.polynomial.DenseTernaryPolynomial;
import org.bouncycastle.pqc.legacy.math.ntru.polynomial.IntegerPolynomial;
import org.bouncycastle.pqc.legacy.math.ntru.polynomial.Polynomial;
import org.bouncycastle.pqc.legacy.math.ntru.polynomial.ProductFormPolynomial;
import org.bouncycastle.pqc.legacy.math.ntru.polynomial.SparseTernaryPolynomial;
import org.bouncycastle.pqc.legacy.math.ntru.polynomial.TernaryPolynomial;
import org.bouncycastle.util.Arrays;

/* loaded from: classes3.dex */
public class NTRUEngine implements AsymmetricBlockCipher {
    private boolean forEncryption;
    private NTRUEncryptionParameters params;
    private NTRUEncryptionPrivateKeyParameters privKey;
    private NTRUEncryptionPublicKeyParameters pubKey;
    private SecureRandom random;

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0061, code lost:
    
        if (r4 < r12) goto L28;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private IntegerPolynomial MGF(byte[] bArr, int i10, int i11, boolean z10) {
        Digest digest = this.params.hashAlg;
        int digestSize = digest.getDigestSize();
        byte[] bArrCalcHash = new byte[i11 * digestSize];
        if (z10) {
            bArr = calcHash(digest, bArr);
        }
        int i12 = 0;
        while (i12 < i11) {
            digest.update(bArr, 0, bArr.length);
            putInt(digest, i12);
            System.arraycopy(calcHash(digest), 0, bArrCalcHash, i12 * digestSize, digestSize);
            i12++;
        }
        IntegerPolynomial integerPolynomial = new IntegerPolynomial(i10);
        loop1: while (true) {
            int i13 = 0;
            int i14 = 0;
            while (true) {
                if (i13 == bArrCalcHash.length) {
                    break;
                }
                int i15 = bArrCalcHash[i13] & 255;
                if (i15 < 243) {
                    int i16 = 0;
                    while (true) {
                        if (i16 < 4) {
                            int i17 = i15 % 3;
                            integerPolynomial.coeffs[i14] = i17 - 1;
                            i14++;
                            if (i14 == i10) {
                                break loop1;
                            }
                            i15 = (i15 - i17) / 3;
                            i16++;
                        } else {
                            integerPolynomial.coeffs[i14] = i15 - 1;
                            i14++;
                            if (i14 == i10) {
                                break loop1;
                            }
                        }
                    }
                }
                i13++;
            }
            digest.update(bArr, 0, bArr.length);
            putInt(digest, i12);
            bArrCalcHash = calcHash(digest);
            i12++;
        }
        return integerPolynomial;
    }

    private byte[] buildSData(byte[] bArr, byte[] bArr2, int i10, byte[] bArr3, byte[] bArr4) {
        byte[] bArr5 = new byte[bArr.length + i10 + bArr3.length + bArr4.length];
        System.arraycopy(bArr, 0, bArr5, 0, bArr.length);
        System.arraycopy(bArr2, 0, bArr5, bArr.length, bArr2.length);
        System.arraycopy(bArr3, 0, bArr5, bArr.length + bArr2.length, bArr3.length);
        System.arraycopy(bArr4, 0, bArr5, bArr.length + bArr2.length + bArr3.length, bArr4.length);
        return bArr5;
    }

    private byte[] calcHash(Digest digest) {
        byte[] bArr = new byte[digest.getDigestSize()];
        digest.doFinal(bArr, 0);
        return bArr;
    }

    private byte[] copyOf(byte[] bArr, int i10) {
        byte[] bArr2 = new byte[i10];
        if (i10 >= bArr.length) {
            i10 = bArr.length;
        }
        System.arraycopy(bArr, 0, bArr2, 0, i10);
        return bArr2;
    }

    private int[] generateBlindingCoeffs(IndexGenerator indexGenerator, int i10) {
        int[] iArr = new int[this.params.N];
        for (int i11 = -1; i11 <= 1; i11 += 2) {
            int i12 = 0;
            while (i12 < i10) {
                int iNextIndex = indexGenerator.nextIndex();
                if (iArr[iNextIndex] == 0) {
                    iArr[iNextIndex] = i11;
                    i12++;
                }
            }
        }
        return iArr;
    }

    private Polynomial generateBlindingPoly(byte[] bArr, byte[] bArr2) {
        IndexGenerator indexGenerator = new IndexGenerator(bArr, this.params);
        NTRUEncryptionParameters nTRUEncryptionParameters = this.params;
        if (nTRUEncryptionParameters.polyType == 1) {
            return new ProductFormPolynomial(new SparseTernaryPolynomial(generateBlindingCoeffs(indexGenerator, nTRUEncryptionParameters.dr1)), new SparseTernaryPolynomial(generateBlindingCoeffs(indexGenerator, this.params.dr2)), new SparseTernaryPolynomial(generateBlindingCoeffs(indexGenerator, this.params.dr3)));
        }
        int i10 = nTRUEncryptionParameters.dr;
        boolean z10 = nTRUEncryptionParameters.sparse;
        int[] iArrGenerateBlindingCoeffs = generateBlindingCoeffs(indexGenerator, i10);
        return z10 ? new SparseTernaryPolynomial(iArrGenerateBlindingCoeffs) : new DenseTernaryPolynomial(iArrGenerateBlindingCoeffs);
    }

    private int log2(int i10) {
        if (i10 == 2048) {
            return 11;
        }
        throw new IllegalStateException("log2 not fully implemented");
    }

    private void putInt(Digest digest, int i10) {
        digest.update((byte) (i10 >> 24));
        digest.update((byte) (i10 >> 16));
        digest.update((byte) (i10 >> 8));
        digest.update((byte) i10);
    }

    public IntegerPolynomial decrypt(IntegerPolynomial integerPolynomial, Polynomial polynomial, IntegerPolynomial integerPolynomial2) {
        NTRUEncryptionParameters nTRUEncryptionParameters = this.params;
        boolean z10 = nTRUEncryptionParameters.fastFp;
        IntegerPolynomial integerPolynomialMult = polynomial.mult(integerPolynomial, nTRUEncryptionParameters.f20508q);
        if (z10) {
            integerPolynomialMult.mult(3);
            integerPolynomialMult.add(integerPolynomial);
        }
        integerPolynomialMult.center0(this.params.f20508q);
        integerPolynomialMult.mod3();
        if (!this.params.fastFp) {
            integerPolynomialMult = new DenseTernaryPolynomial(integerPolynomialMult).mult(integerPolynomial2, 3);
        }
        integerPolynomialMult.center0(3);
        return integerPolynomialMult;
    }

    public IntegerPolynomial encrypt(IntegerPolynomial integerPolynomial, TernaryPolynomial ternaryPolynomial, IntegerPolynomial integerPolynomial2) {
        IntegerPolynomial integerPolynomialMult = ternaryPolynomial.mult(integerPolynomial2, this.params.f20508q);
        integerPolynomialMult.add(integerPolynomial, this.params.f20508q);
        integerPolynomialMult.ensurePositive(this.params.f20508q);
        return integerPolynomialMult;
    }

    @Override // org.bouncycastle.crypto.AsymmetricBlockCipher
    public int getInputBlockSize() {
        return this.params.maxMsgLenBytes;
    }

    @Override // org.bouncycastle.crypto.AsymmetricBlockCipher
    public int getOutputBlockSize() {
        NTRUEncryptionParameters nTRUEncryptionParameters = this.params;
        return ((nTRUEncryptionParameters.N * log2(nTRUEncryptionParameters.f20508q)) + 7) / 8;
    }

    @Override // org.bouncycastle.crypto.AsymmetricBlockCipher
    public void init(boolean z10, CipherParameters cipherParameters) {
        SecureRandom random;
        this.forEncryption = z10;
        if (cipherParameters instanceof ParametersWithRandom) {
            ParametersWithRandom parametersWithRandom = (ParametersWithRandom) cipherParameters;
            random = parametersWithRandom.getRandom();
            cipherParameters = parametersWithRandom.getParameters();
        } else {
            random = null;
        }
        if (z10) {
            NTRUEncryptionPublicKeyParameters nTRUEncryptionPublicKeyParameters = (NTRUEncryptionPublicKeyParameters) cipherParameters;
            this.pubKey = nTRUEncryptionPublicKeyParameters;
            this.privKey = null;
            this.params = nTRUEncryptionPublicKeyParameters.getParameters();
            this.random = CryptoServicesRegistrar.getSecureRandom(random);
            return;
        }
        this.pubKey = null;
        NTRUEncryptionPrivateKeyParameters nTRUEncryptionPrivateKeyParameters = (NTRUEncryptionPrivateKeyParameters) cipherParameters;
        this.privKey = nTRUEncryptionPrivateKeyParameters;
        this.params = nTRUEncryptionPrivateKeyParameters.getParameters();
        this.random = null;
    }

    @Override // org.bouncycastle.crypto.AsymmetricBlockCipher
    public byte[] processBlock(byte[] bArr, int i10, int i11) throws InvalidCipherTextException {
        byte[] bArr2 = new byte[i11];
        System.arraycopy(bArr, i10, bArr2, 0, i11);
        return this.forEncryption ? encrypt(bArr2, this.pubKey) : decrypt(bArr2, this.privKey);
    }

    private byte[] calcHash(Digest digest, byte[] bArr) {
        byte[] bArr2 = new byte[digest.getDigestSize()];
        digest.update(bArr, 0, bArr.length);
        digest.doFinal(bArr2, 0);
        return bArr2;
    }

    private byte[] decrypt(byte[] bArr, NTRUEncryptionPrivateKeyParameters nTRUEncryptionPrivateKeyParameters) throws InvalidCipherTextException {
        Polynomial polynomial = nTRUEncryptionPrivateKeyParameters.f20510t;
        IntegerPolynomial integerPolynomial = nTRUEncryptionPrivateKeyParameters.fp;
        IntegerPolynomial integerPolynomial2 = nTRUEncryptionPrivateKeyParameters.f20509h;
        NTRUEncryptionParameters nTRUEncryptionParameters = this.params;
        int i10 = nTRUEncryptionParameters.N;
        int i11 = nTRUEncryptionParameters.f20508q;
        int i12 = nTRUEncryptionParameters.f20506db;
        int i13 = nTRUEncryptionParameters.maxMsgLenBytes;
        int i14 = nTRUEncryptionParameters.dm0;
        int i15 = nTRUEncryptionParameters.pkLen;
        int i16 = nTRUEncryptionParameters.minCallsMask;
        boolean z10 = nTRUEncryptionParameters.hashSeed;
        byte[] bArr2 = nTRUEncryptionParameters.oid;
        if (i13 > 255) {
            throw new DataLengthException("maxMsgLenBytes values bigger than 255 are not supported");
        }
        int i17 = i12 / 8;
        IntegerPolynomial integerPolynomialFromBinary = IntegerPolynomial.fromBinary(bArr, i10, i11);
        IntegerPolynomial integerPolynomialDecrypt = decrypt(integerPolynomialFromBinary, polynomial, integerPolynomial);
        if (integerPolynomialDecrypt.count(-1) < i14) {
            throw new InvalidCipherTextException("Less than dm0 coefficients equal -1");
        }
        if (integerPolynomialDecrypt.count(0) < i14) {
            throw new InvalidCipherTextException("Less than dm0 coefficients equal 0");
        }
        if (integerPolynomialDecrypt.count(1) < i14) {
            throw new InvalidCipherTextException("Less than dm0 coefficients equal 1");
        }
        IntegerPolynomial integerPolynomial3 = (IntegerPolynomial) integerPolynomialFromBinary.clone();
        integerPolynomial3.sub(integerPolynomialDecrypt);
        integerPolynomial3.modPositive(i11);
        IntegerPolynomial integerPolynomial4 = (IntegerPolynomial) integerPolynomial3.clone();
        integerPolynomial4.modPositive(4);
        integerPolynomialDecrypt.sub(MGF(integerPolynomial4.toBinary(4), i10, i16, z10));
        integerPolynomialDecrypt.mod3();
        byte[] binary3Sves = integerPolynomialDecrypt.toBinary3Sves();
        byte[] bArr3 = new byte[i17];
        System.arraycopy(binary3Sves, 0, bArr3, 0, i17);
        int i18 = binary3Sves[i17] & 255;
        if (i18 > i13) {
            throw new InvalidCipherTextException(c.a(i18, i13, "Message too long: ", ">"));
        }
        byte[] bArr4 = new byte[i18];
        int i19 = i17 + 1;
        System.arraycopy(binary3Sves, i19, bArr4, 0, i18);
        int i20 = i19 + i18;
        int length = binary3Sves.length - i20;
        byte[] bArr5 = new byte[length];
        System.arraycopy(binary3Sves, i20, bArr5, 0, length);
        if (!Arrays.constantTimeAreEqual(bArr5, new byte[length])) {
            throw new InvalidCipherTextException("The message is not followed by zeroes");
        }
        IntegerPolynomial integerPolynomialMult = generateBlindingPoly(buildSData(bArr2, bArr4, i18, bArr3, copyOf(integerPolynomial2.toBinary(i11), i15 / 8)), bArr4).mult(integerPolynomial2);
        integerPolynomialMult.modPositive(i11);
        if (integerPolynomialMult.equals(integerPolynomial3)) {
            return bArr4;
        }
        throw new InvalidCipherTextException("Invalid message encoding");
    }

    private byte[] encrypt(byte[] bArr, NTRUEncryptionPublicKeyParameters nTRUEncryptionPublicKeyParameters) {
        byte[] bArr2 = bArr;
        IntegerPolynomial integerPolynomial = nTRUEncryptionPublicKeyParameters.f20511h;
        NTRUEncryptionParameters nTRUEncryptionParameters = this.params;
        int i10 = nTRUEncryptionParameters.N;
        int i11 = nTRUEncryptionParameters.f20508q;
        int i12 = nTRUEncryptionParameters.maxMsgLenBytes;
        int i13 = nTRUEncryptionParameters.f20506db;
        int i14 = nTRUEncryptionParameters.bufferLenBits;
        int i15 = nTRUEncryptionParameters.dm0;
        int i16 = nTRUEncryptionParameters.pkLen;
        int i17 = nTRUEncryptionParameters.minCallsMask;
        boolean z10 = nTRUEncryptionParameters.hashSeed;
        byte[] bArr3 = nTRUEncryptionParameters.oid;
        int length = bArr2.length;
        if (i12 > 255) {
            throw new IllegalArgumentException("llen values bigger than 1 are not supported");
        }
        if (length > i12) {
            throw new DataLengthException(c.a(length, i12, "Message too long: ", ">"));
        }
        while (true) {
            int i18 = i13 / 8;
            byte[] bArr4 = new byte[i18];
            byte[] bArr5 = bArr3;
            this.random.nextBytes(bArr4);
            int i19 = (i12 + 1) - length;
            int i20 = i13;
            int i21 = i14;
            byte[] bArr6 = new byte[i21 / 8];
            int i22 = i16;
            System.arraycopy(bArr4, 0, bArr6, 0, i18);
            bArr6[i18] = (byte) length;
            int i23 = i18 + 1;
            System.arraycopy(bArr2, 0, bArr6, i23, bArr2.length);
            System.arraycopy(new byte[i19], 0, bArr6, i23 + bArr2.length, i19);
            IntegerPolynomial integerPolynomialFromBinary3Sves = IntegerPolynomial.fromBinary3Sves(bArr6, i10);
            length = length;
            bArr3 = bArr5;
            IntegerPolynomial integerPolynomialMult = generateBlindingPoly(buildSData(bArr3, bArr2, length, bArr4, copyOf(integerPolynomial.toBinary(i11), i22 / 8)), bArr6).mult(integerPolynomial, i11);
            IntegerPolynomial integerPolynomial2 = (IntegerPolynomial) integerPolynomialMult.clone();
            integerPolynomial2.modPositive(4);
            integerPolynomialFromBinary3Sves.add(MGF(integerPolynomial2.toBinary(4), i10, i17, z10));
            integerPolynomialFromBinary3Sves.mod3();
            if (integerPolynomialFromBinary3Sves.count(-1) >= i15 && integerPolynomialFromBinary3Sves.count(0) >= i15 && integerPolynomialFromBinary3Sves.count(1) >= i15) {
                integerPolynomialMult.add(integerPolynomialFromBinary3Sves, i11);
                integerPolynomialMult.ensurePositive(i11);
                return integerPolynomialMult.toBinary(i11);
            }
            bArr2 = bArr;
            i13 = i20;
            i14 = i21;
            i16 = i22;
        }
    }
}
