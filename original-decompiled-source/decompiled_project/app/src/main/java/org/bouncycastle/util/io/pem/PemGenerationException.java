package org.bouncycastle.util.io.pem;

import java.io.IOException;

/* loaded from: classes3.dex */
public class PemGenerationException extends IOException {
    private Throwable cause;

    public PemGenerationException(String str) {
        super(str);
    }

    @Override // java.lang.Throwable
    public Throwable getCause() {
        return this.cause;
    }

    public PemGenerationException(String str, Throwable th2) {
        super(str);
        this.cause = th2;
    }
}
