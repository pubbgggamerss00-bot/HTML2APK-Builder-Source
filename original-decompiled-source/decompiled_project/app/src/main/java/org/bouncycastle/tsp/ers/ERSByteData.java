package org.bouncycastle.tsp.ers;

import java.io.IOException;
import org.bouncycastle.operator.DigestCalculator;

/* loaded from: classes3.dex */
public class ERSByteData extends ERSCachingData {
    private final byte[] content;

    public ERSByteData(byte[] bArr) {
        this.content = bArr;
    }

    @Override // org.bouncycastle.tsp.ers.ERSCachingData
    public byte[] calculateHash(DigestCalculator digestCalculator, byte[] bArr) throws IOException {
        byte[] bArrCalculateDigest = ERSUtil.calculateDigest(digestCalculator, this.content);
        return bArr != null ? ERSUtil.concatPreviousHashes(digestCalculator, bArr, bArrCalculateDigest) : bArrCalculateDigest;
    }
}
