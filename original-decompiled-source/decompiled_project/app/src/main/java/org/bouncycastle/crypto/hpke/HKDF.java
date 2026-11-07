package org.bouncycastle.crypto.hpke;

import org.bouncycastle.crypto.DataLengthException;
import org.bouncycastle.crypto.Digest;
import org.bouncycastle.crypto.digests.SHA256Digest;
import org.bouncycastle.crypto.digests.SHA384Digest;
import org.bouncycastle.crypto.digests.SHA512Digest;
import org.bouncycastle.crypto.generators.HKDFBytesGenerator;
import org.bouncycastle.crypto.params.HKDFParameters;
import org.bouncycastle.util.Arrays;
import org.bouncycastle.util.Pack;

/* loaded from: classes2.dex */
class HKDF {
    private static final String versionLabel = "HPKE-v1";
    private final int hashLength;
    private final HKDFBytesGenerator kdf;

    public HKDF(short s10) {
        Digest sHA256Digest;
        if (s10 == 1) {
            sHA256Digest = new SHA256Digest();
        } else if (s10 == 2) {
            sHA256Digest = new SHA384Digest();
        } else {
            if (s10 != 3) {
                throw new IllegalArgumentException("invalid kdf id");
            }
            sHA256Digest = new SHA512Digest();
        }
        this.kdf = new HKDFBytesGenerator(sHA256Digest);
        this.hashLength = sHA256Digest.getDigestSize();
    }

    public byte[] Expand(byte[] bArr, byte[] bArr2, int i10) throws DataLengthException, IllegalArgumentException {
        if (i10 > 65536) {
            throw new IllegalArgumentException("Expand length cannot be larger than 2^16");
        }
        this.kdf.init(HKDFParameters.skipExtractParameters(bArr, bArr2));
        byte[] bArr3 = new byte[i10];
        this.kdf.generateBytes(bArr3, 0, i10);
        return bArr3;
    }

    public byte[] Extract(byte[] bArr, byte[] bArr2) {
        if (bArr == null) {
            bArr = new byte[this.hashLength];
        }
        return this.kdf.extractPRK(bArr, bArr2);
    }

    public byte[] LabeledExpand(byte[] bArr, byte[] bArr2, String str, byte[] bArr3, int i10) throws DataLengthException, IllegalArgumentException {
        if (i10 > 65536) {
            throw new IllegalArgumentException("Expand length cannot be larger than 2^16");
        }
        this.kdf.init(HKDFParameters.skipExtractParameters(bArr, Arrays.concatenate(Arrays.concatenate(Pack.shortToBigEndian((short) i10), versionLabel.getBytes(), bArr2, str.getBytes()), bArr3)));
        byte[] bArr4 = new byte[i10];
        this.kdf.generateBytes(bArr4, 0, i10);
        return bArr4;
    }

    public byte[] LabeledExtract(byte[] bArr, byte[] bArr2, String str, byte[] bArr3) {
        if (bArr == null) {
            bArr = new byte[this.hashLength];
        }
        return this.kdf.extractPRK(bArr, Arrays.concatenate(versionLabel.getBytes(), bArr2, str.getBytes(), bArr3));
    }

    public int getHashSize() {
        return this.hashLength;
    }
}
