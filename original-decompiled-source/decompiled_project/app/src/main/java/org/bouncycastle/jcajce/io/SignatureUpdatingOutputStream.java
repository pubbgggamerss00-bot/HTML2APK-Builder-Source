package org.bouncycastle.jcajce.io;

import java.io.IOException;
import java.io.OutputStream;
import java.security.Signature;
import java.security.SignatureException;
import org.bouncycastle.util.Exceptions;

/* loaded from: classes.dex */
class SignatureUpdatingOutputStream extends OutputStream {
    private Signature sig;

    public SignatureUpdatingOutputStream(Signature signature) {
        this.sig = signature;
    }

    @Override // java.io.OutputStream
    public void write(int i10) throws SignatureException, IOException {
        try {
            this.sig.update((byte) i10);
        } catch (SignatureException e10) {
            throw Exceptions.ioException(e10.getMessage(), e10);
        }
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr) throws SignatureException, IOException {
        try {
            this.sig.update(bArr);
        } catch (SignatureException e10) {
            throw Exceptions.ioException(e10.getMessage(), e10);
        }
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr, int i10, int i11) throws SignatureException, IOException {
        try {
            this.sig.update(bArr, i10, i11);
        } catch (SignatureException e10) {
            throw Exceptions.ioException(e10.getMessage(), e10);
        }
    }
}
