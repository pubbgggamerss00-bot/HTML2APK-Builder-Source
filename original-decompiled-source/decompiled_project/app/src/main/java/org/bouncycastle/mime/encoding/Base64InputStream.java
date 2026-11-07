package org.bouncycastle.mime.encoding;

import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;

/* loaded from: classes3.dex */
public class Base64InputStream extends InputStream {
    private static final byte[] decodingTable = new byte[128];
    InputStream in;
    int[] outBuf = new int[3];
    int bufPtr = 3;

    static {
        for (int i10 = 65; i10 <= 90; i10++) {
            decodingTable[i10] = (byte) (i10 - 65);
        }
        for (int i11 = 97; i11 <= 122; i11++) {
            decodingTable[i11] = (byte) (i11 - 71);
        }
        for (int i12 = 48; i12 <= 57; i12++) {
            decodingTable[i12] = (byte) (i12 + 4);
        }
        byte[] bArr = decodingTable;
        bArr[43] = 62;
        bArr[47] = 63;
    }

    public Base64InputStream(InputStream inputStream) {
        this.in = inputStream;
    }

    private int decode(int i10, int i11, int i12, int i13, int[] iArr) throws EOFException {
        if (i13 < 0) {
            throw new EOFException("unexpected end of file in armored stream.");
        }
        if (i12 == 61) {
            byte[] bArr = decodingTable;
            iArr[2] = (((bArr[i10] & 255) << 2) | ((bArr[i11] & 255) >> 4)) & 255;
            return 2;
        }
        if (i13 == 61) {
            byte[] bArr2 = decodingTable;
            byte b10 = bArr2[i10];
            byte b11 = bArr2[i11];
            byte b12 = bArr2[i12];
            iArr[1] = ((b10 << 2) | (b11 >> 4)) & 255;
            iArr[2] = ((b11 << 4) | (b12 >> 2)) & 255;
            return 1;
        }
        byte[] bArr3 = decodingTable;
        byte b13 = bArr3[i10];
        byte b14 = bArr3[i11];
        byte b15 = bArr3[i12];
        byte b16 = bArr3[i13];
        iArr[0] = ((b13 << 2) | (b14 >> 4)) & 255;
        iArr[1] = ((b14 << 4) | (b15 >> 2)) & 255;
        iArr[2] = ((b15 << 6) | b16) & 255;
        return 0;
    }

    private int readIgnoreSpace() throws IOException {
        while (true) {
            int i10 = this.in.read();
            if (i10 != 9 && i10 != 32) {
                return i10;
            }
        }
    }

    private int readIgnoreSpaceFirst() throws IOException {
        while (true) {
            int i10 = this.in.read();
            if (i10 != 9 && i10 != 10 && i10 != 13 && i10 != 32) {
                return i10;
            }
        }
    }

    @Override // java.io.InputStream
    public int available() throws IOException {
        return 0;
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.in.close();
    }

    @Override // java.io.InputStream
    public int read() throws IOException {
        Base64InputStream base64InputStream;
        if (this.bufPtr > 2) {
            int ignoreSpaceFirst = readIgnoreSpaceFirst();
            if (ignoreSpaceFirst < 0) {
                return -1;
            }
            base64InputStream = this;
            base64InputStream.bufPtr = base64InputStream.decode(ignoreSpaceFirst, readIgnoreSpace(), readIgnoreSpace(), readIgnoreSpace(), this.outBuf);
        } else {
            base64InputStream = this;
        }
        int[] iArr = base64InputStream.outBuf;
        int i10 = base64InputStream.bufPtr;
        base64InputStream.bufPtr = i10 + 1;
        return iArr[i10];
    }
}
