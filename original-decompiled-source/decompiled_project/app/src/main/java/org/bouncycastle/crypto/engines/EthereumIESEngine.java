package org.bouncycastle.crypto.engines;

import i8.n;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import org.bouncycastle.asn1.b;
import org.bouncycastle.crypto.BasicAgreement;
import org.bouncycastle.crypto.BufferedBlockCipher;
import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.DataLengthException;
import org.bouncycastle.crypto.DerivationFunction;
import org.bouncycastle.crypto.DerivationParameters;
import org.bouncycastle.crypto.Digest;
import org.bouncycastle.crypto.DigestDerivationFunction;
import org.bouncycastle.crypto.EphemeralKeyPair;
import org.bouncycastle.crypto.InvalidCipherTextException;
import org.bouncycastle.crypto.KeyParser;
import org.bouncycastle.crypto.Mac;
import org.bouncycastle.crypto.OutputLengthException;
import org.bouncycastle.crypto.SavableDigest;
import org.bouncycastle.crypto.digests.SHA256Digest;
import org.bouncycastle.crypto.generators.EphemeralKeyPairGenerator;
import org.bouncycastle.crypto.params.AsymmetricKeyParameter;
import org.bouncycastle.crypto.params.IESParameters;
import org.bouncycastle.crypto.params.IESWithCipherParameters;
import org.bouncycastle.crypto.params.ISO18033KDFParameters;
import org.bouncycastle.crypto.params.KDFParameters;
import org.bouncycastle.crypto.params.KeyParameter;
import org.bouncycastle.crypto.params.ParametersWithIV;
import org.bouncycastle.util.Arrays;
import org.bouncycastle.util.BigIntegers;
import org.bouncycastle.util.Pack;

/* loaded from: classes2.dex */
public class EthereumIESEngine {
    private byte[] IV;
    byte[] V;
    BasicAgreement agree;
    BufferedBlockCipher cipher;
    byte[] commonMac;
    boolean forEncryption;
    DerivationFunction kdf;
    private EphemeralKeyPairGenerator keyPairGenerator;
    private KeyParser keyParser;
    Mac mac;
    byte[] macBuf;
    IESParameters param;
    CipherParameters privParam;
    CipherParameters pubParam;

    public static class HandshakeKDFFunction implements DigestDerivationFunction {
        private int counterStart;
        private Digest digest;
        private byte[] iv;
        private byte[] shared;

        public HandshakeKDFFunction(int i10, Digest digest) {
            this.counterStart = i10;
            this.digest = digest;
        }

        @Override // org.bouncycastle.crypto.DerivationFunction
        public int generateBytes(byte[] bArr, int i10, int i11) throws DataLengthException, IllegalArgumentException {
            int i12 = i11;
            int i13 = i10;
            if (bArr.length - i12 < i13) {
                throw new OutputLengthException("output buffer too small");
            }
            long j10 = i12;
            int digestSize = this.digest.getDigestSize();
            if (j10 > 8589934591L) {
                throw new IllegalArgumentException("output length too large");
            }
            long j11 = digestSize;
            int i14 = (int) (((j10 + j11) - 1) / j11);
            byte[] bArr2 = new byte[this.digest.getDigestSize()];
            int i15 = 4;
            byte[] bArr3 = new byte[4];
            Pack.intToBigEndian(this.counterStart, bArr3, 0);
            int i16 = this.counterStart & (-256);
            int i17 = 0;
            while (i17 < i14) {
                this.digest.update(bArr3, 0, i15);
                Digest digest = this.digest;
                byte[] bArr4 = this.shared;
                digest.update(bArr4, 0, bArr4.length);
                byte[] bArr5 = this.iv;
                if (bArr5 != null) {
                    this.digest.update(bArr5, 0, bArr5.length);
                }
                this.digest.doFinal(bArr2, 0);
                if (i12 > digestSize) {
                    System.arraycopy(bArr2, 0, bArr, i13, digestSize);
                    i13 += digestSize;
                    i12 -= digestSize;
                } else {
                    System.arraycopy(bArr2, 0, bArr, i13, i12);
                }
                byte b10 = (byte) (bArr3[3] + 1);
                bArr3[3] = b10;
                if (b10 == 0) {
                    i16 += 256;
                    Pack.intToBigEndian(i16, bArr3, 0);
                }
                i17++;
                i15 = 4;
            }
            this.digest.reset();
            return (int) j10;
        }

        @Override // org.bouncycastle.crypto.DigestDerivationFunction
        public Digest getDigest() {
            return this.digest;
        }

        @Override // org.bouncycastle.crypto.DerivationFunction
        public void init(DerivationParameters derivationParameters) {
            if (derivationParameters instanceof KDFParameters) {
                KDFParameters kDFParameters = (KDFParameters) derivationParameters;
                this.shared = kDFParameters.getSharedSecret();
                this.iv = kDFParameters.getIV();
            } else {
                if (!(derivationParameters instanceof ISO18033KDFParameters)) {
                    throw new IllegalArgumentException("KDF parameters required for generator");
                }
                this.shared = ((ISO18033KDFParameters) derivationParameters).getSeed();
                this.iv = null;
            }
        }
    }

    public EthereumIESEngine(BasicAgreement basicAgreement, DerivationFunction derivationFunction, Mac mac, byte[] bArr) {
        this.agree = basicAgreement;
        this.kdf = derivationFunction;
        this.mac = mac;
        this.macBuf = new byte[mac.getMacSize()];
        this.commonMac = bArr;
        this.cipher = null;
    }

    private byte[] decryptBlock(byte[] bArr, int i10, int i11) throws InvalidCipherTextException, IllegalStateException, DataLengthException, IllegalArgumentException {
        byte[] bArr2;
        byte[] bArr3;
        int iProcessBytes;
        byte[] bArr4;
        if (i11 < this.mac.getMacSize() + this.V.length) {
            throw new InvalidCipherTextException("length of input must be greater than the MAC and V combined");
        }
        if (this.cipher == null) {
            int length = (i11 - this.V.length) - this.mac.getMacSize();
            byte[] bArr5 = new byte[length];
            int macKeySize = this.param.getMacKeySize() / 8;
            bArr2 = new byte[macKeySize];
            int i12 = length + macKeySize;
            byte[] bArr6 = new byte[i12];
            this.kdf.generateBytes(bArr6, 0, i12);
            if (this.V.length != 0) {
                System.arraycopy(bArr6, 0, bArr2, 0, macKeySize);
                System.arraycopy(bArr6, macKeySize, bArr5, 0, length);
            } else {
                System.arraycopy(bArr6, 0, bArr5, 0, length);
                System.arraycopy(bArr6, length, bArr2, 0, macKeySize);
            }
            bArr4 = new byte[length];
            for (int i13 = 0; i13 != length; i13++) {
                bArr4[i13] = (byte) (bArr[(this.V.length + i10) + i13] ^ bArr5[i13]);
            }
            bArr3 = bArr;
            iProcessBytes = 0;
        } else {
            int cipherKeySize = ((IESWithCipherParameters) this.param).getCipherKeySize() / 8;
            byte[] bArr7 = new byte[cipherKeySize];
            int macKeySize2 = this.param.getMacKeySize() / 8;
            bArr2 = new byte[macKeySize2];
            int i14 = cipherKeySize + macKeySize2;
            byte[] bArr8 = new byte[i14];
            this.kdf.generateBytes(bArr8, 0, i14);
            System.arraycopy(bArr8, 0, bArr7, 0, cipherKeySize);
            System.arraycopy(bArr8, cipherKeySize, bArr2, 0, macKeySize2);
            CipherParameters keyParameter = new KeyParameter(bArr7);
            byte[] bArr9 = this.IV;
            if (bArr9 != null) {
                keyParameter = new ParametersWithIV(keyParameter, bArr9);
            }
            this.cipher.init(false, keyParameter);
            byte[] bArr10 = new byte[this.cipher.getOutputSize((i11 - this.V.length) - this.mac.getMacSize())];
            BufferedBlockCipher bufferedBlockCipher = this.cipher;
            byte[] bArr11 = this.V;
            bArr3 = bArr;
            iProcessBytes = bufferedBlockCipher.processBytes(bArr3, i10 + bArr11.length, (i11 - bArr11.length) - this.mac.getMacSize(), bArr10, 0);
            bArr4 = bArr10;
        }
        byte[] encodingV = this.param.getEncodingV();
        byte[] lengthTag = this.V.length != 0 ? getLengthTag(encodingV) : null;
        int i15 = i10 + i11;
        byte[] bArrCopyOfRange = Arrays.copyOfRange(bArr3, i15 - this.mac.getMacSize(), i15);
        int length2 = bArrCopyOfRange.length;
        byte[] bArr12 = new byte[length2];
        SavableDigest savableDigestNewInstance = SHA256Digest.newInstance();
        byte[] bArr13 = new byte[savableDigestNewInstance.getDigestSize()];
        savableDigestNewInstance.reset();
        savableDigestNewInstance.update(bArr2, 0, bArr2.length);
        savableDigestNewInstance.doFinal(bArr13, 0);
        this.mac.init(new KeyParameter(bArr13));
        Mac mac = this.mac;
        byte[] bArr14 = this.IV;
        mac.update(bArr14, 0, bArr14.length);
        Mac mac2 = this.mac;
        byte[] bArr15 = this.V;
        mac2.update(bArr3, i10 + bArr15.length, (i11 - bArr15.length) - length2);
        if (encodingV != null) {
            this.mac.update(encodingV, 0, encodingV.length);
        }
        if (this.V.length != 0) {
            this.mac.update(lengthTag, 0, lengthTag.length);
        }
        Mac mac3 = this.mac;
        byte[] bArr16 = this.commonMac;
        mac3.update(bArr16, 0, bArr16.length);
        this.mac.doFinal(bArr12, 0);
        if (!Arrays.constantTimeAreEqual(bArrCopyOfRange, bArr12)) {
            throw new InvalidCipherTextException("invalid MAC");
        }
        BufferedBlockCipher bufferedBlockCipher2 = this.cipher;
        return bufferedBlockCipher2 == null ? bArr4 : Arrays.copyOfRange(bArr4, 0, bufferedBlockCipher2.doFinal(bArr4, iProcessBytes) + iProcessBytes);
    }

    private byte[] encryptBlock(byte[] bArr, int i10, int i11) throws InvalidCipherTextException, IllegalStateException, DataLengthException, IllegalArgumentException {
        BufferedBlockCipher bufferedBlockCipher;
        CipherParameters keyParameter;
        byte[] bArr2;
        byte[] bArr3;
        if (this.cipher == null) {
            byte[] bArr4 = new byte[i11];
            int macKeySize = this.param.getMacKeySize() / 8;
            bArr2 = new byte[macKeySize];
            int i12 = i11 + macKeySize;
            byte[] bArr5 = new byte[i12];
            this.kdf.generateBytes(bArr5, 0, i12);
            if (this.V.length != 0) {
                System.arraycopy(bArr5, 0, bArr2, 0, macKeySize);
                System.arraycopy(bArr5, macKeySize, bArr4, 0, i11);
            } else {
                System.arraycopy(bArr5, 0, bArr4, 0, i11);
                System.arraycopy(bArr5, i11, bArr2, 0, macKeySize);
            }
            bArr3 = new byte[i11];
            for (int i13 = 0; i13 != i11; i13++) {
                bArr3[i13] = (byte) (bArr[i10 + i13] ^ bArr4[i13]);
            }
        } else {
            int cipherKeySize = ((IESWithCipherParameters) this.param).getCipherKeySize() / 8;
            byte[] bArr6 = new byte[cipherKeySize];
            int macKeySize2 = this.param.getMacKeySize() / 8;
            byte[] bArr7 = new byte[macKeySize2];
            int i14 = cipherKeySize + macKeySize2;
            byte[] bArr8 = new byte[i14];
            this.kdf.generateBytes(bArr8, 0, i14);
            System.arraycopy(bArr8, 0, bArr6, 0, cipherKeySize);
            System.arraycopy(bArr8, cipherKeySize, bArr7, 0, macKeySize2);
            if (this.IV != null) {
                bufferedBlockCipher = this.cipher;
                keyParameter = new ParametersWithIV(new KeyParameter(bArr6), this.IV);
            } else {
                bufferedBlockCipher = this.cipher;
                keyParameter = new KeyParameter(bArr6);
            }
            bufferedBlockCipher.init(true, keyParameter);
            byte[] bArr9 = new byte[this.cipher.getOutputSize(i11)];
            int iProcessBytes = this.cipher.processBytes(bArr, i10, i11, bArr9, 0);
            i11 = this.cipher.doFinal(bArr9, iProcessBytes) + iProcessBytes;
            bArr2 = bArr7;
            bArr3 = bArr9;
        }
        byte[] encodingV = this.param.getEncodingV();
        byte[] lengthTag = this.V.length != 0 ? getLengthTag(encodingV) : null;
        int macSize = this.mac.getMacSize();
        byte[] bArr10 = new byte[macSize];
        SavableDigest savableDigestNewInstance = SHA256Digest.newInstance();
        byte[] bArr11 = new byte[savableDigestNewInstance.getDigestSize()];
        savableDigestNewInstance.reset();
        savableDigestNewInstance.update(bArr2, 0, bArr2.length);
        savableDigestNewInstance.doFinal(bArr11, 0);
        this.mac.init(new KeyParameter(bArr11));
        Mac mac = this.mac;
        byte[] bArr12 = this.IV;
        mac.update(bArr12, 0, bArr12.length);
        this.mac.update(bArr3, 0, bArr3.length);
        if (encodingV != null) {
            this.mac.update(encodingV, 0, encodingV.length);
        }
        if (this.V.length != 0) {
            this.mac.update(lengthTag, 0, lengthTag.length);
        }
        Mac mac2 = this.mac;
        byte[] bArr13 = this.commonMac;
        mac2.update(bArr13, 0, bArr13.length);
        this.mac.doFinal(bArr10, 0);
        byte[] bArr14 = this.V;
        byte[] bArr15 = new byte[bArr14.length + i11 + macSize];
        System.arraycopy(bArr14, 0, bArr15, 0, bArr14.length);
        System.arraycopy(bArr3, 0, bArr15, this.V.length, i11);
        System.arraycopy(bArr10, 0, bArr15, this.V.length + i11, macSize);
        return bArr15;
    }

    private void extractParams(CipherParameters cipherParameters) {
        if (cipherParameters instanceof ParametersWithIV) {
            ParametersWithIV parametersWithIV = (ParametersWithIV) cipherParameters;
            this.IV = parametersWithIV.getIV();
            cipherParameters = parametersWithIV.getParameters();
        } else {
            this.IV = null;
        }
        this.param = (IESParameters) cipherParameters;
    }

    public BufferedBlockCipher getCipher() {
        return this.cipher;
    }

    public byte[] getLengthTag(byte[] bArr) {
        byte[] bArr2 = new byte[8];
        if (bArr != null) {
            Pack.longToBigEndian(bArr.length * 8, bArr2, 0);
        }
        return bArr2;
    }

    public Mac getMac() {
        return this.mac;
    }

    public void init(AsymmetricKeyParameter asymmetricKeyParameter, CipherParameters cipherParameters, KeyParser keyParser) {
        this.forEncryption = false;
        this.privParam = asymmetricKeyParameter;
        this.keyParser = keyParser;
        extractParams(cipherParameters);
    }

    public byte[] processBlock(byte[] bArr, int i10, int i11) throws InvalidCipherTextException {
        if (this.forEncryption) {
            EphemeralKeyPairGenerator ephemeralKeyPairGenerator = this.keyPairGenerator;
            if (ephemeralKeyPairGenerator != null) {
                EphemeralKeyPair ephemeralKeyPairGenerate = ephemeralKeyPairGenerator.generate();
                this.privParam = ephemeralKeyPairGenerate.getKeyPair().getPrivate();
                this.V = ephemeralKeyPairGenerate.getEncodedPublicKey();
            }
        } else if (this.keyParser != null) {
            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr, i10, i11);
            try {
                this.pubParam = this.keyParser.readKey(byteArrayInputStream);
                this.V = Arrays.copyOfRange(bArr, i10, (i11 - byteArrayInputStream.available()) + i10);
            } catch (IOException e10) {
                throw new InvalidCipherTextException(b.a(e10, new StringBuilder("unable to recover ephemeral public key: ")), e10);
            } catch (IllegalArgumentException e11) {
                throw new InvalidCipherTextException(n.c(e11, new StringBuilder("unable to recover ephemeral public key: ")), e11);
            }
        }
        this.agree.init(this.privParam);
        byte[] bArrAsUnsignedByteArray = BigIntegers.asUnsignedByteArray(this.agree.getFieldSize(), this.agree.calculateAgreement(this.pubParam));
        byte[] bArr2 = this.V;
        if (bArr2.length != 0) {
            byte[] bArrConcatenate = Arrays.concatenate(bArr2, bArrAsUnsignedByteArray);
            Arrays.fill(bArrAsUnsignedByteArray, (byte) 0);
            bArrAsUnsignedByteArray = bArrConcatenate;
        }
        try {
            this.kdf.init(new KDFParameters(bArrAsUnsignedByteArray, this.param.getDerivationV()));
            byte[] bArrEncryptBlock = this.forEncryption ? encryptBlock(bArr, i10, i11) : decryptBlock(bArr, i10, i11);
            Arrays.fill(bArrAsUnsignedByteArray, (byte) 0);
            return bArrEncryptBlock;
        } catch (Throwable th2) {
            Arrays.fill(bArrAsUnsignedByteArray, (byte) 0);
            throw th2;
        }
    }

    public EthereumIESEngine(BasicAgreement basicAgreement, DerivationFunction derivationFunction, Mac mac, byte[] bArr, BufferedBlockCipher bufferedBlockCipher) {
        this.agree = basicAgreement;
        this.kdf = derivationFunction;
        this.mac = mac;
        this.macBuf = new byte[mac.getMacSize()];
        this.commonMac = bArr;
        this.cipher = bufferedBlockCipher;
    }

    public void init(AsymmetricKeyParameter asymmetricKeyParameter, CipherParameters cipherParameters, EphemeralKeyPairGenerator ephemeralKeyPairGenerator) {
        this.forEncryption = true;
        this.pubParam = asymmetricKeyParameter;
        this.keyPairGenerator = ephemeralKeyPairGenerator;
        extractParams(cipherParameters);
    }

    public void init(boolean z10, CipherParameters cipherParameters, CipherParameters cipherParameters2, CipherParameters cipherParameters3) {
        this.forEncryption = z10;
        this.privParam = cipherParameters;
        this.pubParam = cipherParameters2;
        this.V = new byte[0];
        extractParams(cipherParameters3);
    }
}
