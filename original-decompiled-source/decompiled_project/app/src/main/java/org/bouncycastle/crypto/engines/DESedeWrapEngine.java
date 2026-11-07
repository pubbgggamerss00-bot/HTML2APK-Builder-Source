package org.bouncycastle.crypto.engines;

import j2.y;
import java.security.SecureRandom;
import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.CryptoServicesRegistrar;
import org.bouncycastle.crypto.DataLengthException;
import org.bouncycastle.crypto.Digest;
import org.bouncycastle.crypto.InvalidCipherTextException;
import org.bouncycastle.crypto.Wrapper;
import org.bouncycastle.crypto.modes.CBCBlockCipher;
import org.bouncycastle.crypto.params.KeyParameter;
import org.bouncycastle.crypto.params.ParametersWithIV;
import org.bouncycastle.crypto.params.ParametersWithRandom;
import org.bouncycastle.crypto.util.DigestFactory;
import org.bouncycastle.util.Arrays;

/* loaded from: classes2.dex */
public class DESedeWrapEngine implements Wrapper {
    private static final byte[] IV2 = {74, -35, -94, 44, 121, -24, 33, 5};
    private CBCBlockCipher engine;
    private boolean forWrapping;
    private byte[] iv;
    private KeyParameter param;
    private ParametersWithIV paramPlusIV;
    Digest sha1 = DigestFactory.createSHA1();
    byte[] digest = new byte[20];

    private byte[] calculateCMSKeyChecksum(byte[] bArr) {
        byte[] bArr2 = new byte[8];
        this.sha1.update(bArr, 0, bArr.length);
        this.sha1.doFinal(this.digest, 0);
        System.arraycopy(this.digest, 0, bArr2, 0, 8);
        return bArr2;
    }

    private boolean checkCMSKeyChecksum(byte[] bArr, byte[] bArr2) {
        return Arrays.constantTimeAreEqual(calculateCMSKeyChecksum(bArr), bArr2);
    }

    @Override // org.bouncycastle.crypto.Wrapper
    public String getAlgorithmName() {
        return "DESede";
    }

    @Override // org.bouncycastle.crypto.Wrapper
    public void init(boolean z10, CipherParameters cipherParameters) {
        SecureRandom secureRandom;
        this.forWrapping = z10;
        this.engine = new CBCBlockCipher(new DESedeEngine());
        if (cipherParameters instanceof ParametersWithRandom) {
            ParametersWithRandom parametersWithRandom = (ParametersWithRandom) cipherParameters;
            CipherParameters parameters = parametersWithRandom.getParameters();
            SecureRandom random = parametersWithRandom.getRandom();
            cipherParameters = parameters;
            secureRandom = random;
        } else {
            secureRandom = CryptoServicesRegistrar.getSecureRandom();
        }
        if (cipherParameters instanceof KeyParameter) {
            this.param = (KeyParameter) cipherParameters;
            if (this.forWrapping) {
                byte[] bArr = new byte[8];
                this.iv = bArr;
                secureRandom.nextBytes(bArr);
                this.paramPlusIV = new ParametersWithIV(this.param, this.iv);
                return;
            }
            return;
        }
        if (cipherParameters instanceof ParametersWithIV) {
            ParametersWithIV parametersWithIV = (ParametersWithIV) cipherParameters;
            this.paramPlusIV = parametersWithIV;
            this.iv = parametersWithIV.getIV();
            this.param = (KeyParameter) this.paramPlusIV.getParameters();
            if (!this.forWrapping) {
                throw new IllegalArgumentException("You should not supply an IV for unwrapping");
            }
            byte[] bArr2 = this.iv;
            if (bArr2 == null || bArr2.length != 8) {
                throw new IllegalArgumentException("IV is not 8 octets");
            }
        }
    }

    @Override // org.bouncycastle.crypto.Wrapper
    public byte[] unwrap(byte[] bArr, int i10, int i11) throws InvalidCipherTextException, IllegalStateException, DataLengthException, IllegalArgumentException {
        if (this.forWrapping) {
            throw new IllegalStateException("Not set for unwrapping");
        }
        if (bArr == null) {
            throw new InvalidCipherTextException("Null pointer as ciphertext");
        }
        int blockSize = this.engine.getBlockSize();
        if (i11 % blockSize != 0) {
            throw new InvalidCipherTextException(y.a(blockSize, "Ciphertext not multiple of "));
        }
        this.engine.init(false, new ParametersWithIV(this.param, IV2));
        byte[] bArr2 = new byte[i11];
        for (int i12 = 0; i12 != i11; i12 += blockSize) {
            this.engine.processBlock(bArr, i10 + i12, bArr2, i12);
        }
        Arrays.reverseInPlace(bArr2);
        byte[] bArr3 = new byte[8];
        this.iv = bArr3;
        int i13 = i11 - 8;
        byte[] bArr4 = new byte[i13];
        System.arraycopy(bArr2, 0, bArr3, 0, 8);
        System.arraycopy(bArr2, 8, bArr4, 0, i13);
        ParametersWithIV parametersWithIV = new ParametersWithIV(this.param, this.iv);
        this.paramPlusIV = parametersWithIV;
        this.engine.init(false, parametersWithIV);
        byte[] bArr5 = new byte[i13];
        for (int i14 = 0; i14 != i13; i14 += blockSize) {
            this.engine.processBlock(bArr4, i14, bArr5, i14);
        }
        int i15 = i11 - 16;
        byte[] bArr6 = new byte[i15];
        byte[] bArr7 = new byte[8];
        System.arraycopy(bArr5, 0, bArr6, 0, i15);
        System.arraycopy(bArr5, i15, bArr7, 0, 8);
        if (checkCMSKeyChecksum(bArr6, bArr7)) {
            return bArr6;
        }
        throw new InvalidCipherTextException("Checksum inside ciphertext is corrupted");
    }

    @Override // org.bouncycastle.crypto.Wrapper
    public byte[] wrap(byte[] bArr, int i10, int i11) throws IllegalStateException, DataLengthException, IllegalArgumentException {
        if (!this.forWrapping) {
            throw new IllegalStateException("Not initialized for wrapping");
        }
        byte[] bArr2 = new byte[i11];
        System.arraycopy(bArr, i10, bArr2, 0, i11);
        byte[] bArrCalculateCMSKeyChecksum = calculateCMSKeyChecksum(bArr2);
        int length = bArrCalculateCMSKeyChecksum.length + i11;
        byte[] bArr3 = new byte[length];
        System.arraycopy(bArr2, 0, bArr3, 0, i11);
        System.arraycopy(bArrCalculateCMSKeyChecksum, 0, bArr3, i11, bArrCalculateCMSKeyChecksum.length);
        int blockSize = this.engine.getBlockSize();
        if (length % blockSize != 0) {
            throw new IllegalStateException("Not multiple of block length");
        }
        this.engine.init(true, this.paramPlusIV);
        byte[] bArr4 = new byte[length];
        for (int i12 = 0; i12 != length; i12 += blockSize) {
            this.engine.processBlock(bArr3, i12, bArr4, i12);
        }
        byte[] bArr5 = this.iv;
        int length2 = bArr5.length + length;
        byte[] bArr6 = new byte[length2];
        System.arraycopy(bArr5, 0, bArr6, 0, bArr5.length);
        System.arraycopy(bArr4, 0, bArr6, this.iv.length, length);
        Arrays.reverseInPlace(bArr6);
        this.engine.init(true, new ParametersWithIV(this.param, IV2));
        for (int i13 = 0; i13 != length2; i13 += blockSize) {
            this.engine.processBlock(bArr6, i13, bArr6, i13);
        }
        return bArr6;
    }
}
