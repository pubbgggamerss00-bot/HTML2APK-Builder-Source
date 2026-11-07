package org.bouncycastle.cert.crmf;

/* loaded from: classes2.dex */
public class CRMFRuntimeException extends RuntimeException {
    private Throwable cause;

    public CRMFRuntimeException(String str, Throwable th2) {
        super(str);
        this.cause = th2;
    }

    @Override // java.lang.Throwable
    public Throwable getCause() {
        return this.cause;
    }
}
