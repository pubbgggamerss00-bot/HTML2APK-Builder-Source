package org.bouncycastle.cms;

/* loaded from: classes2.dex */
public class CMSRuntimeException extends RuntimeException {

    /* renamed from: e, reason: collision with root package name */
    Exception f19875e;

    public CMSRuntimeException(String str) {
        super(str);
    }

    @Override // java.lang.Throwable
    public Throwable getCause() {
        return this.f19875e;
    }

    public Exception getUnderlyingException() {
        return this.f19875e;
    }

    public CMSRuntimeException(String str, Exception exc) {
        super(str);
        this.f19875e = exc;
    }
}
