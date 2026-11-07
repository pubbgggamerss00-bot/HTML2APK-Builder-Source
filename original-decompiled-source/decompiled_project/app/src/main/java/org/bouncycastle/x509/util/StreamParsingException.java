package org.bouncycastle.x509.util;

/* loaded from: classes3.dex */
public class StreamParsingException extends Exception {
    Throwable _e;

    public StreamParsingException(String str, Throwable th2) {
        super(str);
        this._e = th2;
    }

    @Override // java.lang.Throwable
    public Throwable getCause() {
        return this._e;
    }
}
