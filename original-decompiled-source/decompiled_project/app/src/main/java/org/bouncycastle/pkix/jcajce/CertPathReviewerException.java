package org.bouncycastle.pkix.jcajce;

import java.security.cert.CertPath;
import org.bouncycastle.pkix.util.ErrorBundle;
import org.bouncycastle.pkix.util.LocalizedException;

/* loaded from: classes3.dex */
public class CertPathReviewerException extends LocalizedException {
    private CertPath certPath;
    private int index;

    public CertPathReviewerException(ErrorBundle errorBundle) {
        super(errorBundle);
        this.index = -1;
        this.certPath = null;
    }

    public CertPath getCertPath() {
        return this.certPath;
    }

    public int getIndex() {
        return this.index;
    }

    public CertPathReviewerException(ErrorBundle errorBundle, Throwable th2) {
        super(errorBundle, th2);
        this.index = -1;
        this.certPath = null;
    }

    public CertPathReviewerException(ErrorBundle errorBundle, Throwable th2, CertPath certPath, int i10) {
        super(errorBundle, th2);
        this.index = -1;
        this.certPath = null;
        if (certPath == null || i10 == -1) {
            throw new IllegalArgumentException();
        }
        if (i10 < -1 || i10 >= certPath.getCertificates().size()) {
            throw new IndexOutOfBoundsException();
        }
        this.certPath = certPath;
        this.index = i10;
    }

    public CertPathReviewerException(ErrorBundle errorBundle, CertPath certPath, int i10) {
        super(errorBundle);
        this.index = -1;
        this.certPath = null;
        if (certPath == null || i10 == -1) {
            throw new IllegalArgumentException();
        }
        if (i10 < -1 || i10 >= certPath.getCertificates().size()) {
            throw new IndexOutOfBoundsException();
        }
        this.certPath = certPath;
        this.index = i10;
    }
}
