package org.bouncycastle.jce.exception;

import java.security.cert.CertPath;
import java.security.cert.CertPathValidatorException;

/* loaded from: classes.dex */
public class ExtCertPathValidatorException extends CertPathValidatorException implements ExtException {
    private Throwable cause;

    public ExtCertPathValidatorException(String str) {
        super(str);
    }

    @Override // java.lang.Throwable, org.bouncycastle.jce.exception.ExtException
    public Throwable getCause() {
        return this.cause;
    }

    public ExtCertPathValidatorException(String str, Throwable th2) {
        super(str);
        this.cause = th2;
    }

    public ExtCertPathValidatorException(String str, Throwable th2, CertPath certPath, int i10) {
        super(str, th2, certPath, i10);
        this.cause = th2;
    }
}
