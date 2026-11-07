package org.bouncycastle.tsp.ers;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import org.bouncycastle.operator.DigestCalculator;

/* loaded from: classes3.dex */
public class ERSInputStreamData extends ERSCachingData {
    private final InputStream content;

    public ERSInputStreamData(File file) throws FileNotFoundException {
        if (file.isDirectory()) {
            throw new IllegalArgumentException("directory not allowed");
        }
        this.content = new FileInputStream(file);
    }

    @Override // org.bouncycastle.tsp.ers.ERSCachingData
    public byte[] calculateHash(DigestCalculator digestCalculator, byte[] bArr) throws IOException {
        byte[] bArrCalculateDigest = ERSUtil.calculateDigest(digestCalculator, this.content);
        return bArr != null ? ERSUtil.concatPreviousHashes(digestCalculator, bArr, bArrCalculateDigest) : bArrCalculateDigest;
    }

    public ERSInputStreamData(InputStream inputStream) {
        this.content = inputStream;
    }
}
