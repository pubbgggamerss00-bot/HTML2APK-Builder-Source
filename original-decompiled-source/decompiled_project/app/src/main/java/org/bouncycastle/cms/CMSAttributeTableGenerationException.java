package org.bouncycastle.cms;

/* loaded from: classes2.dex */
public class CMSAttributeTableGenerationException extends CMSRuntimeException {

    /* renamed from: e, reason: collision with root package name */
    Exception f19873e;

    public CMSAttributeTableGenerationException(String str) {
        super(str);
    }

    @Override // org.bouncycastle.cms.CMSRuntimeException, java.lang.Throwable
    public Throwable getCause() {
        return this.f19873e;
    }

    @Override // org.bouncycastle.cms.CMSRuntimeException
    public Exception getUnderlyingException() {
        return this.f19873e;
    }

    public CMSAttributeTableGenerationException(String str, Exception exc) {
        super(str);
        this.f19873e = exc;
    }
}
