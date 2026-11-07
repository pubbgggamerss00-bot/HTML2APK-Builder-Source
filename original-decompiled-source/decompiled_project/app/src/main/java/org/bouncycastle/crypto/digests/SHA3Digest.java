package org.bouncycastle.crypto.digests;

import ad.b;
import org.bouncycastle.crypto.CryptoServicePurpose;

/* loaded from: classes2.dex */
public class SHA3Digest extends KeccakDigest {
    public SHA3Digest() {
        this(256, CryptoServicePurpose.ANY);
    }

    private static int checkBitLength(int i10) {
        if (i10 == 224 || i10 == 256 || i10 == 384 || i10 == 512) {
            return i10;
        }
        throw new IllegalArgumentException(b.b(i10, "'bitLength' ", " not supported for SHA-3"));
    }

    @Override // org.bouncycastle.crypto.digests.KeccakDigest, org.bouncycastle.crypto.Digest
    public int doFinal(byte[] bArr, int i10) {
        absorbBits(2, 2);
        return super.doFinal(bArr, i10);
    }

    @Override // org.bouncycastle.crypto.digests.KeccakDigest, org.bouncycastle.crypto.Digest
    public String getAlgorithmName() {
        return "SHA3-" + this.fixedOutputLength;
    }

    public SHA3Digest(int i10) {
        super(checkBitLength(i10), CryptoServicePurpose.ANY);
    }

    @Override // org.bouncycastle.crypto.digests.KeccakDigest
    public int doFinal(byte[] bArr, int i10, byte b10, int i11) {
        if (i11 < 0 || i11 > 7) {
            throw new IllegalArgumentException("'partialBits' must be in the range [0,7]");
        }
        int i12 = (b10 & ((1 << i11) - 1)) | (2 << i11);
        int i13 = i11 + 2;
        if (i13 >= 8) {
            absorb((byte) i12);
            i13 = i11 - 6;
            i12 >>>= 8;
        }
        return super.doFinal(bArr, i10, (byte) i12, i13);
    }

    public SHA3Digest(int i10, CryptoServicePurpose cryptoServicePurpose) {
        super(checkBitLength(i10), cryptoServicePurpose);
    }

    public SHA3Digest(CryptoServicePurpose cryptoServicePurpose) {
        this(256, cryptoServicePurpose);
    }

    public SHA3Digest(SHA3Digest sHA3Digest) {
        super(sHA3Digest);
    }
}
