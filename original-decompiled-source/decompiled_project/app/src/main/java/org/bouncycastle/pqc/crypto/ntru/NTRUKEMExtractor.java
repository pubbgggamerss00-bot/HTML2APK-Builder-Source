package org.bouncycastle.pqc.crypto.ntru;

import org.bouncycastle.crypto.EncapsulatedSecretExtractor;
import org.bouncycastle.crypto.digests.SHA3Digest;
import org.bouncycastle.pqc.math.ntru.parameters.NTRUParameterSet;
import org.bouncycastle.util.Arrays;

/* loaded from: classes3.dex */
public class NTRUKEMExtractor implements EncapsulatedSecretExtractor {
    private final NTRUPrivateKeyParameters ntruPrivateKey;
    private final NTRUParameters params;

    public NTRUKEMExtractor(NTRUPrivateKeyParameters nTRUPrivateKeyParameters) {
        this.params = nTRUPrivateKeyParameters.getParameters();
        this.ntruPrivateKey = nTRUPrivateKeyParameters;
    }

    private void cmov(byte[] bArr, byte[] bArr2, byte b10) {
        byte b11 = (byte) ((~b10) + 1);
        for (int i10 = 0; i10 < bArr.length; i10++) {
            byte b12 = bArr[i10];
            bArr[i10] = (byte) (b12 ^ ((bArr2[i10] ^ b12) & b11));
        }
    }

    @Override // org.bouncycastle.crypto.EncapsulatedSecretExtractor
    public byte[] extractSecret(byte[] bArr) {
        NTRUParameterSet nTRUParameterSet = this.params.parameterSet;
        byte[] bArr2 = this.ntruPrivateKey.privateKey;
        int iNtruCiphertextBytes = nTRUParameterSet.ntruCiphertextBytes() + nTRUParameterSet.prfKeyBytes();
        byte[] bArr3 = new byte[iNtruCiphertextBytes];
        OWCPADecryptResult oWCPADecryptResultDecrypt = new NTRUOWCPA(nTRUParameterSet).decrypt(bArr, this.ntruPrivateKey.privateKey);
        byte[] bArr4 = oWCPADecryptResultDecrypt.rm;
        int i10 = oWCPADecryptResultDecrypt.fail;
        SHA3Digest sHA3Digest = new SHA3Digest(256);
        byte[] bArr5 = new byte[sHA3Digest.getDigestSize()];
        sHA3Digest.update(bArr4, 0, bArr4.length);
        sHA3Digest.doFinal(bArr5, 0);
        for (int i11 = 0; i11 < nTRUParameterSet.prfKeyBytes(); i11++) {
            bArr3[i11] = bArr2[nTRUParameterSet.owcpaSecretKeyBytes() + i11];
        }
        for (int i12 = 0; i12 < nTRUParameterSet.ntruCiphertextBytes(); i12++) {
            bArr3[nTRUParameterSet.prfKeyBytes() + i12] = bArr[i12];
        }
        sHA3Digest.reset();
        sHA3Digest.update(bArr3, 0, iNtruCiphertextBytes);
        sHA3Digest.doFinal(bArr4, 0);
        cmov(bArr5, bArr4, (byte) i10);
        byte[] bArrCopyOfRange = Arrays.copyOfRange(bArr5, 0, nTRUParameterSet.sharedKeyBytes());
        Arrays.clear(bArr5);
        return bArrCopyOfRange;
    }

    @Override // org.bouncycastle.crypto.EncapsulatedSecretExtractor
    public int getEncapsulationLength() {
        return this.params.parameterSet.ntruCiphertextBytes();
    }
}
