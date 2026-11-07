package org.bouncycastle.cmc;

/* loaded from: classes2.dex */
public class CMCException extends Exception {
    private final Throwable cause;

    public CMCException(String str) {
        this(str, null);
    }

    @Override // java.lang.Throwable
    public Throwable getCause() {
        return this.cause;
    }

    public CMCException(String str, Throwable th2) {
        super(str);
        this.cause = th2;
    }
}
