package org.bouncycastle.pqc.legacy.crypto.mceliece;

import java.security.SecureRandom;
import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.CryptoServicesRegistrar;
import org.bouncycastle.crypto.Digest;
import org.bouncycastle.crypto.InvalidCipherTextException;
import org.bouncycastle.crypto.digests.SHA1Digest;
import org.bouncycastle.crypto.params.ParametersWithRandom;
import org.bouncycastle.crypto.prng.DigestRandomGenerator;
import org.bouncycastle.pqc.crypto.MessageEncryptor;
import org.bouncycastle.pqc.legacy.math.linearalgebra.ByteUtils;
import org.bouncycastle.pqc.legacy.math.linearalgebra.GF2Vector;
import org.bouncycastle.pqc.legacy.math.linearalgebra.IntegerFunctions;

/* loaded from: classes3.dex */
public class McElieceKobaraImaiCipher implements MessageEncryptor {
    private static final String DEFAULT_PRNG_NAME = "SHA1PRNG";
    public static final String OID = "1.3.6.1.4.1.8301.3.1.3.4.2.3";
    public static final byte[] PUBLIC_CONSTANT = "a predetermined public constant".getBytes();
    private boolean forEncryption;

    /* renamed from: k, reason: collision with root package name */
    private int f20483k;
    McElieceCCA2KeyParameters key;
    private Digest messDigest;

    /* renamed from: n, reason: collision with root package name */
    private int f20484n;
    private SecureRandom sr;

    /* renamed from: t, reason: collision with root package name */
    private int f20485t;

    private void initCipherDecrypt(McElieceCCA2PrivateKeyParameters mcElieceCCA2PrivateKeyParameters) {
        this.messDigest = Utils.getDigest(mcElieceCCA2PrivateKeyParameters.getDigest());
        this.f20484n = mcElieceCCA2PrivateKeyParameters.getN();
        this.f20483k = mcElieceCCA2PrivateKeyParameters.getK();
        this.f20485t = mcElieceCCA2PrivateKeyParameters.getT();
    }

    private void initCipherEncrypt(McElieceCCA2PublicKeyParameters mcElieceCCA2PublicKeyParameters) {
        this.messDigest = Utils.getDigest(mcElieceCCA2PublicKeyParameters.getDigest());
        this.f20484n = mcElieceCCA2PublicKeyParameters.getN();
        this.f20483k = mcElieceCCA2PublicKeyParameters.getK();
        this.f20485t = mcElieceCCA2PublicKeyParameters.getT();
    }

    public int getKeySize(McElieceCCA2KeyParameters mcElieceCCA2KeyParameters) {
        if (mcElieceCCA2KeyParameters instanceof McElieceCCA2PublicKeyParameters) {
            return ((McElieceCCA2PublicKeyParameters) mcElieceCCA2KeyParameters).getN();
        }
        if (mcElieceCCA2KeyParameters instanceof McElieceCCA2PrivateKeyParameters) {
            return ((McElieceCCA2PrivateKeyParameters) mcElieceCCA2KeyParameters).getN();
        }
        throw new IllegalArgumentException("unsupported type");
    }

    @Override // org.bouncycastle.pqc.crypto.MessageEncryptor
    public void init(boolean z10, CipherParameters cipherParameters) {
        this.forEncryption = z10;
        if (!z10) {
            McElieceCCA2PrivateKeyParameters mcElieceCCA2PrivateKeyParameters = (McElieceCCA2PrivateKeyParameters) cipherParameters;
            this.key = mcElieceCCA2PrivateKeyParameters;
            initCipherDecrypt(mcElieceCCA2PrivateKeyParameters);
        } else {
            if (!(cipherParameters instanceof ParametersWithRandom)) {
                this.sr = CryptoServicesRegistrar.getSecureRandom();
                McElieceCCA2PublicKeyParameters mcElieceCCA2PublicKeyParameters = (McElieceCCA2PublicKeyParameters) cipherParameters;
                this.key = mcElieceCCA2PublicKeyParameters;
                initCipherEncrypt(mcElieceCCA2PublicKeyParameters);
                return;
            }
            ParametersWithRandom parametersWithRandom = (ParametersWithRandom) cipherParameters;
            this.sr = parametersWithRandom.getRandom();
            McElieceCCA2PublicKeyParameters mcElieceCCA2PublicKeyParameters2 = (McElieceCCA2PublicKeyParameters) parametersWithRandom.getParameters();
            this.key = mcElieceCCA2PublicKeyParameters2;
            initCipherEncrypt(mcElieceCCA2PublicKeyParameters2);
        }
    }

    @Override // org.bouncycastle.pqc.crypto.MessageEncryptor
    public byte[] messageDecrypt(byte[] bArr) throws InvalidCipherTextException, ArrayIndexOutOfBoundsException {
        byte[] bArr2;
        if (this.forEncryption) {
            throw new IllegalStateException("cipher initialised for decryption");
        }
        int i10 = this.f20484n >> 3;
        if (bArr.length < i10) {
            throw new InvalidCipherTextException("Bad Padding: Ciphertext too short.");
        }
        int digestSize = this.messDigest.getDigestSize();
        int i11 = this.f20483k >> 3;
        int iBitLength = (IntegerFunctions.binomial(this.f20484n, this.f20485t).bitLength() - 1) >> 3;
        int length = bArr.length - i10;
        if (length > 0) {
            byte[][] bArrSplit = ByteUtils.split(bArr, length);
            bArr2 = bArrSplit[0];
            bArr = bArrSplit[1];
        } else {
            bArr2 = new byte[0];
        }
        GF2Vector[] gF2VectorArrDecryptionPrimitive = McElieceCCA2Primitives.decryptionPrimitive((McElieceCCA2PrivateKeyParameters) this.key, GF2Vector.OS2VP(this.f20484n, bArr));
        byte[] encoded = gF2VectorArrDecryptionPrimitive[0].getEncoded();
        GF2Vector gF2Vector = gF2VectorArrDecryptionPrimitive[1];
        if (encoded.length > i11) {
            encoded = ByteUtils.subArray(encoded, 0, i11);
        }
        byte[] bArrDecode = Conversions.decode(this.f20484n, this.f20485t, gF2Vector);
        if (bArrDecode.length < iBitLength) {
            byte[] bArr3 = new byte[iBitLength];
            System.arraycopy(bArrDecode, 0, bArr3, iBitLength - bArrDecode.length, bArrDecode.length);
            bArrDecode = bArr3;
        }
        byte[] bArrConcatenate = ByteUtils.concatenate(ByteUtils.concatenate(bArr2, bArrDecode), encoded);
        int length2 = bArrConcatenate.length - digestSize;
        byte[][] bArrSplit2 = ByteUtils.split(bArrConcatenate, digestSize);
        byte[] bArr4 = bArrSplit2[0];
        byte[] bArr5 = bArrSplit2[1];
        byte[] bArr6 = new byte[this.messDigest.getDigestSize()];
        this.messDigest.update(bArr5, 0, bArr5.length);
        this.messDigest.doFinal(bArr6, 0);
        for (int i12 = digestSize - 1; i12 >= 0; i12--) {
            bArr6[i12] = (byte) (bArr6[i12] ^ bArr4[i12]);
        }
        DigestRandomGenerator digestRandomGenerator = new DigestRandomGenerator(new SHA1Digest());
        digestRandomGenerator.addSeedMaterial(bArr6);
        byte[] bArr7 = new byte[length2];
        digestRandomGenerator.nextBytes(bArr7);
        for (int i13 = length2 - 1; i13 >= 0; i13--) {
            bArr7[i13] = (byte) (bArr7[i13] ^ bArr5[i13]);
        }
        byte[] bArr8 = PUBLIC_CONSTANT;
        byte[][] bArrSplit3 = ByteUtils.split(bArr7, length2 - bArr8.length);
        byte[] bArr9 = bArrSplit3[0];
        if (ByteUtils.equals(bArrSplit3[1], bArr8)) {
            return bArr9;
        }
        throw new InvalidCipherTextException("Bad Padding: invalid ciphertext");
    }

    @Override // org.bouncycastle.pqc.crypto.MessageEncryptor
    public byte[] messageEncrypt(byte[] bArr) {
        if (!this.forEncryption) {
            throw new IllegalStateException("cipher initialised for decryption");
        }
        int digestSize = this.messDigest.getDigestSize();
        int i10 = this.f20483k >> 3;
        int iBitLength = (IntegerFunctions.binomial(this.f20484n, this.f20485t).bitLength() - 1) >> 3;
        byte[] bArr2 = PUBLIC_CONSTANT;
        int length = ((i10 + iBitLength) - digestSize) - bArr2.length;
        if (bArr.length > length) {
            length = bArr.length;
        }
        int length2 = bArr2.length + length;
        int i11 = ((length2 + digestSize) - i10) - iBitLength;
        byte[] bArr3 = new byte[length2];
        System.arraycopy(bArr, 0, bArr3, 0, bArr.length);
        System.arraycopy(bArr2, 0, bArr3, length, bArr2.length);
        byte[] bArr4 = new byte[digestSize];
        this.sr.nextBytes(bArr4);
        DigestRandomGenerator digestRandomGenerator = new DigestRandomGenerator(new SHA1Digest());
        digestRandomGenerator.addSeedMaterial(bArr4);
        byte[] bArr5 = new byte[length2];
        digestRandomGenerator.nextBytes(bArr5);
        for (int i12 = length2 - 1; i12 >= 0; i12--) {
            bArr5[i12] = (byte) (bArr5[i12] ^ bArr3[i12]);
        }
        byte[] bArr6 = new byte[this.messDigest.getDigestSize()];
        this.messDigest.update(bArr5, 0, length2);
        this.messDigest.doFinal(bArr6, 0);
        for (int i13 = digestSize - 1; i13 >= 0; i13--) {
            bArr6[i13] = (byte) (bArr6[i13] ^ bArr4[i13]);
        }
        byte[] bArrConcatenate = ByteUtils.concatenate(bArr6, bArr5);
        byte[] bArr7 = new byte[0];
        if (i11 > 0) {
            bArr7 = new byte[i11];
            System.arraycopy(bArrConcatenate, 0, bArr7, 0, i11);
        }
        byte[] bArr8 = new byte[iBitLength];
        System.arraycopy(bArrConcatenate, i11, bArr8, 0, iBitLength);
        byte[] bArr9 = new byte[i10];
        System.arraycopy(bArrConcatenate, iBitLength + i11, bArr9, 0, i10);
        byte[] encoded = McElieceCCA2Primitives.encryptionPrimitive((McElieceCCA2PublicKeyParameters) this.key, GF2Vector.OS2VP(this.f20483k, bArr9), Conversions.encode(this.f20484n, this.f20485t, bArr8)).getEncoded();
        return i11 > 0 ? ByteUtils.concatenate(bArr7, encoded) : encoded;
    }
}
