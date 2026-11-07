package org.bouncycastle.cms.jcajce;

import java.io.IOException;
import java.io.OutputStream;
import javax.crypto.Cipher;

/* loaded from: classes2.dex */
class JceAADStream extends OutputStream {
    private static final byte[] SINGLE_BYTE = new byte[1];
    private Cipher cipher;

    public JceAADStream(Cipher cipher) {
        this.cipher = cipher;
    }

    @Override // java.io.OutputStream
    public void write(int i10) throws IOException {
        byte[] bArr = SINGLE_BYTE;
        bArr[0] = (byte) i10;
        this.cipher.updateAAD(bArr, 0, 1);
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr, int i10, int i11) throws IOException {
        this.cipher.updateAAD(bArr, i10, i11);
    }
}
