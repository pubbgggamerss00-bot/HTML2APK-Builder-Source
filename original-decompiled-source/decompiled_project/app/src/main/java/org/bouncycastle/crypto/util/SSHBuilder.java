package org.bouncycastle.crypto.util;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.math.BigInteger;
import org.bouncycastle.util.Strings;

/* loaded from: classes2.dex */
class SSHBuilder {
    private final ByteArrayOutputStream bos = new ByteArrayOutputStream();

    public byte[] getBytes() {
        return this.bos.toByteArray();
    }

    public byte[] getPaddedBytes() {
        return getPaddedBytes(8);
    }

    public void u32(int i10) {
        this.bos.write((i10 >>> 24) & 255);
        this.bos.write((i10 >>> 16) & 255);
        this.bos.write((i10 >>> 8) & 255);
        this.bos.write(i10 & 255);
    }

    public void writeBigNum(BigInteger bigInteger) throws IOException {
        writeBlock(bigInteger.toByteArray());
    }

    public void writeBlock(byte[] bArr) throws IOException {
        u32(bArr.length);
        try {
            this.bos.write(bArr);
        } catch (IOException e10) {
            throw new IllegalStateException(e10.getMessage(), e10);
        }
    }

    public void writeBytes(byte[] bArr) throws IOException {
        try {
            this.bos.write(bArr);
        } catch (IOException e10) {
            throw new IllegalStateException(e10.getMessage(), e10);
        }
    }

    public void writeString(String str) throws IOException {
        writeBlock(Strings.toByteArray(str));
    }

    public byte[] getPaddedBytes(int i10) {
        int size = this.bos.size() % i10;
        if (size != 0) {
            int i11 = i10 - size;
            for (int i12 = 1; i12 <= i11; i12++) {
                this.bos.write(i12);
            }
        }
        return this.bos.toByteArray();
    }
}
