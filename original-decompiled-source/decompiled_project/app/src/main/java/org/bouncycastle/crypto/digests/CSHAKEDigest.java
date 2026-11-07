package org.bouncycastle.crypto.digests;

import org.bouncycastle.crypto.CryptoServicePurpose;
import org.bouncycastle.util.Arrays;

/* loaded from: classes2.dex */
public class CSHAKEDigest extends SHAKEDigest {
    private static final byte[] padding = new byte[100];
    private final byte[] diff;

    public CSHAKEDigest(int i10, CryptoServicePurpose cryptoServicePurpose, byte[] bArr, byte[] bArr2) {
        super(i10, cryptoServicePurpose);
        if ((bArr == null || bArr.length == 0) && (bArr2 == null || bArr2.length == 0)) {
            this.diff = null;
        } else {
            this.diff = Arrays.concatenate(XofUtils.leftEncode(this.rate / 8), encodeString(bArr), encodeString(bArr2));
            diffPadAndAbsorb();
        }
    }

    private void diffPadAndAbsorb() {
        int i10 = this.rate / 8;
        byte[] bArr = this.diff;
        absorb(bArr, 0, bArr.length);
        int length = this.diff.length % i10;
        if (length == 0) {
            return;
        }
        while (true) {
            i10 -= length;
            byte[] bArr2 = padding;
            if (i10 <= bArr2.length) {
                absorb(bArr2, 0, i10);
                return;
            } else {
                absorb(bArr2, 0, bArr2.length);
                length = bArr2.length;
            }
        }
    }

    private byte[] encodeString(byte[] bArr) {
        return (bArr == null || bArr.length == 0) ? XofUtils.leftEncode(0L) : Arrays.concatenate(XofUtils.leftEncode(bArr.length * 8), bArr);
    }

    @Override // org.bouncycastle.crypto.digests.SHAKEDigest, org.bouncycastle.crypto.Xof
    public int doOutput(byte[] bArr, int i10, int i11) {
        if (this.diff == null) {
            return super.doOutput(bArr, i10, i11);
        }
        if (!this.squeezing) {
            absorbBits(0, 2);
        }
        squeeze(bArr, i10, i11 * 8);
        return i11;
    }

    @Override // org.bouncycastle.crypto.digests.SHAKEDigest, org.bouncycastle.crypto.digests.KeccakDigest, org.bouncycastle.crypto.Digest
    public String getAlgorithmName() {
        return "CSHAKE" + this.fixedOutputLength;
    }

    @Override // org.bouncycastle.crypto.digests.KeccakDigest, org.bouncycastle.crypto.Digest
    public void reset() {
        super.reset();
        if (this.diff != null) {
            diffPadAndAbsorb();
        }
    }

    public CSHAKEDigest(int i10, byte[] bArr, byte[] bArr2) {
        this(i10, CryptoServicePurpose.ANY, bArr, bArr2);
    }

    public CSHAKEDigest(CSHAKEDigest cSHAKEDigest) {
        super(cSHAKEDigest);
        this.diff = Arrays.clone(cSHAKEDigest.diff);
    }
}
