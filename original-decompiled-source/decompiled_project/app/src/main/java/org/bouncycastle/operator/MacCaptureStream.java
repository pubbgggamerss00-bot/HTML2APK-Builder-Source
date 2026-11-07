package org.bouncycastle.operator;

import java.io.IOException;
import java.io.OutputStream;
import org.bouncycastle.util.Arrays;

/* loaded from: classes3.dex */
public class MacCaptureStream extends OutputStream {
    private final OutputStream cOut;
    private final byte[] mac;
    int macIndex = 0;

    public MacCaptureStream(OutputStream outputStream, int i10) {
        this.cOut = outputStream;
        this.mac = new byte[i10];
    }

    public byte[] getMac() {
        return Arrays.clone(this.mac);
    }

    @Override // java.io.OutputStream
    public void write(int i10) throws IOException {
        int i11 = this.macIndex;
        byte[] bArr = this.mac;
        if (i11 != bArr.length) {
            this.macIndex = i11 + 1;
            bArr[i11] = (byte) i10;
            return;
        }
        byte b10 = bArr[0];
        System.arraycopy(bArr, 1, bArr, 0, bArr.length - 1);
        byte[] bArr2 = this.mac;
        bArr2[bArr2.length - 1] = (byte) i10;
        this.cOut.write(b10);
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr, int i10, int i11) throws IOException {
        byte[] bArr2 = this.mac;
        if (i11 < bArr2.length) {
            for (int i12 = 0; i12 != i11; i12++) {
                write(bArr[i10 + i12]);
            }
        } else {
            this.cOut.write(bArr2, 0, this.macIndex);
            byte[] bArr3 = this.mac;
            this.macIndex = bArr3.length;
            System.arraycopy(bArr, (i10 + i11) - bArr3.length, bArr3, 0, bArr3.length);
            this.cOut.write(bArr, i10, i11 - this.mac.length);
        }
    }
}
