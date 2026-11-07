package org.bouncycastle.mime.encoding;

import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import org.bouncycastle.util.encoders.Base64Encoder;
import org.jf.dexlib2.analysis.RegisterType;

/* loaded from: classes3.dex */
public class Base64OutputStream extends FilterOutputStream {
    private static final Base64Encoder ENCODER = new Base64Encoder();
    private static final int INBUF_SIZE = 54;
    private static final int OUTBUF_SIZE = 74;
    private final byte[] inBuf;
    private int inPos;
    private final byte[] outBuf;

    public Base64OutputStream(OutputStream outputStream) {
        super(outputStream);
        this.inBuf = new byte[54];
        byte[] bArr = new byte[74];
        this.outBuf = bArr;
        this.inPos = 0;
        bArr[72] = RegisterType.LONG_HI;
        bArr[73] = 10;
    }

    private void encodeBlock(byte[] bArr, int i10) throws IOException {
        ENCODER.encode(bArr, i10, 54, this.outBuf, 0);
        ((FilterOutputStream) this).out.write(this.outBuf, 0, 74);
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        int i10 = this.inPos;
        if (i10 > 0) {
            int iEncode = ENCODER.encode(this.inBuf, 0, i10, this.outBuf, 0);
            this.inPos = 0;
            byte[] bArr = this.outBuf;
            bArr[iEncode] = RegisterType.LONG_HI;
            bArr[iEncode + 1] = 10;
            ((FilterOutputStream) this).out.write(bArr, 0, iEncode + 2);
        }
        ((FilterOutputStream) this).out.close();
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public void write(int i10) throws IOException {
        byte[] bArr = this.inBuf;
        int i11 = this.inPos;
        int i12 = i11 + 1;
        this.inPos = i12;
        bArr[i11] = (byte) i10;
        if (i12 == 54) {
            encodeBlock(bArr, 0);
            this.inPos = 0;
        }
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public void write(byte[] bArr) throws IOException {
        write(bArr, 0, bArr.length);
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public void write(byte[] bArr, int i10, int i11) throws IOException {
        int i12 = this.inPos;
        int i13 = 54 - i12;
        if (i11 < i13) {
            System.arraycopy(bArr, i10, this.inBuf, i12, i11);
            this.inPos += i11;
            return;
        }
        if (i12 > 0) {
            System.arraycopy(bArr, i10, this.inBuf, i12, i13);
            encodeBlock(this.inBuf, 0);
        } else {
            i13 = 0;
        }
        while (true) {
            int i14 = i11 - i13;
            if (i14 < 54) {
                System.arraycopy(bArr, i10 + i13, this.inBuf, 0, i14);
                this.inPos = i14;
                return;
            } else {
                encodeBlock(bArr, i10 + i13);
                i13 += 54;
            }
        }
    }
}
