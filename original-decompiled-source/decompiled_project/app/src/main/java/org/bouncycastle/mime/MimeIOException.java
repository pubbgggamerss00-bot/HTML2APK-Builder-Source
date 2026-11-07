package org.bouncycastle.mime;

import java.io.IOException;

/* loaded from: classes3.dex */
public class MimeIOException extends IOException {
    private Throwable cause;

    public MimeIOException(String str) {
        super(str);
    }

    @Override // java.lang.Throwable
    public Throwable getCause() {
        return this.cause;
    }

    public MimeIOException(String str, Throwable th2) {
        super(str);
        this.cause = th2;
    }
}
