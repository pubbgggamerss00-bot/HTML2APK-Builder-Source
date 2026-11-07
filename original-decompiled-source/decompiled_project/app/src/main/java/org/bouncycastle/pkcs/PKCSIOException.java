package org.bouncycastle.pkcs;

import java.io.IOException;

/* loaded from: classes3.dex */
public class PKCSIOException extends IOException {
    private Throwable cause;

    public PKCSIOException(String str) {
        super(str);
    }

    @Override // java.lang.Throwable
    public Throwable getCause() {
        return this.cause;
    }

    public PKCSIOException(String str, Throwable th2) {
        super(str);
        this.cause = th2;
    }
}
