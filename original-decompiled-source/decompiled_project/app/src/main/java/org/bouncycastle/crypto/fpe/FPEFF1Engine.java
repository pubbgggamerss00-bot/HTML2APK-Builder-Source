package org.bouncycastle.crypto.fpe;

import org.bouncycastle.crypto.BlockCipher;
import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.engines.AESEngine;
import org.bouncycastle.crypto.params.FPEParameters;
import org.bouncycastle.util.Properties;

/* loaded from: classes2.dex */
public class FPEFF1Engine extends FPEEngine {
    public FPEFF1Engine() {
        this(AESEngine.newInstance());
    }

    @Override // org.bouncycastle.crypto.fpe.FPEEngine
    public int decryptBlock(byte[] bArr, int i10, int i11, byte[] bArr2, int i12) {
        int i13;
        byte[] bArrDecryptFF1;
        if (this.fpeParameters.getRadix() > 256) {
            bArrDecryptFF1 = FPEEngine.toByteArray(SP80038G.decryptFF1w(this.baseCipher, this.fpeParameters.getRadixConverter(), this.fpeParameters.getTweak(), FPEEngine.toShortArray(bArr), i10, i11 / 2));
            i13 = i11;
        } else {
            i13 = i11;
            bArrDecryptFF1 = SP80038G.decryptFF1(this.baseCipher, this.fpeParameters.getRadixConverter(), this.fpeParameters.getTweak(), bArr, i10, i13);
        }
        System.arraycopy(bArrDecryptFF1, 0, bArr2, i12, i13);
        return i13;
    }

    @Override // org.bouncycastle.crypto.fpe.FPEEngine
    public int encryptBlock(byte[] bArr, int i10, int i11, byte[] bArr2, int i12) {
        int i13;
        byte[] bArrEncryptFF1;
        if (this.fpeParameters.getRadix() > 256) {
            bArrEncryptFF1 = FPEEngine.toByteArray(SP80038G.encryptFF1w(this.baseCipher, this.fpeParameters.getRadixConverter(), this.fpeParameters.getTweak(), FPEEngine.toShortArray(bArr), i10, i11 / 2));
            i13 = i11;
        } else {
            i13 = i11;
            bArrEncryptFF1 = SP80038G.encryptFF1(this.baseCipher, this.fpeParameters.getRadixConverter(), this.fpeParameters.getTweak(), bArr, i10, i13);
        }
        System.arraycopy(bArrEncryptFF1, 0, bArr2, i12, i13);
        return i13;
    }

    @Override // org.bouncycastle.crypto.fpe.FPEEngine
    public String getAlgorithmName() {
        return "FF1";
    }

    @Override // org.bouncycastle.crypto.fpe.FPEEngine
    public void init(boolean z10, CipherParameters cipherParameters) throws IllegalArgumentException {
        this.forEncryption = z10;
        this.fpeParameters = (FPEParameters) cipherParameters;
        this.baseCipher.init(!r3.isUsingInverseFunction(), this.fpeParameters.getKey());
    }

    public FPEFF1Engine(BlockCipher blockCipher) {
        super(blockCipher);
        if (blockCipher.getBlockSize() != 16) {
            throw new IllegalArgumentException("base cipher needs to be 128 bits");
        }
        if (Properties.isOverrideSet("org.bouncycastle.fpe.disable") || Properties.isOverrideSet("org.bouncycastle.fpe.disable_ff1")) {
            throw new UnsupportedOperationException("FF1 encryption disabled");
        }
    }
}
