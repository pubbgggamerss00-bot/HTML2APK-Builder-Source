package org.bouncycastle.jcajce.io;

import java.io.IOException;
import java.io.OutputStream;
import javax.crypto.Mac;

/* loaded from: classes.dex */
public final class MacOutputStream extends OutputStream {
    private Mac mac;

    public MacOutputStream(Mac mac) {
        this.mac = mac;
    }

    public byte[] getMac() {
        return this.mac.doFinal();
    }

    @Override // java.io.OutputStream
    public void write(int i10) throws IllegalStateException, IOException {
        this.mac.update((byte) i10);
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr, int i10, int i11) throws IllegalStateException, IOException {
        this.mac.update(bArr, i10, i11);
    }
}
