package org.bouncycastle.tsp.ers;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import org.bouncycastle.operator.DigestCalculator;

/* loaded from: classes3.dex */
public class ERSFileData extends ERSCachingData {
    private final File content;

    public ERSFileData(File file) throws FileNotFoundException {
        if (file.isDirectory()) {
            throw new IllegalArgumentException("directory not allowed as ERSFileData");
        }
        if (!file.exists()) {
            throw new FileNotFoundException(file.getAbsolutePath() + " does not exist");
        }
        if (file.canRead()) {
            this.content = file;
            return;
        }
        throw new FileNotFoundException(file.getAbsolutePath() + " is not readable");
    }

    @Override // org.bouncycastle.tsp.ers.ERSCachingData
    public byte[] calculateHash(DigestCalculator digestCalculator, byte[] bArr) throws IOException {
        try {
            FileInputStream fileInputStream = new FileInputStream(this.content);
            byte[] bArrCalculateDigest = ERSUtil.calculateDigest(digestCalculator, fileInputStream);
            fileInputStream.close();
            return bArr != null ? ERSUtil.concatPreviousHashes(digestCalculator, bArr, bArrCalculateDigest) : bArrCalculateDigest;
        } catch (IOException unused) {
            throw new IllegalStateException("unable to process " + this.content.getAbsolutePath());
        }
    }
}
