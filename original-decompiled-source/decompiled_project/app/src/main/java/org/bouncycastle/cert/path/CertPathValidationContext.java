package org.bouncycastle.cert.path;

import java.util.HashSet;
import java.util.Set;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.util.Memoable;

/* loaded from: classes2.dex */
public class CertPathValidationContext implements Memoable {
    private Set criticalExtensions;
    private boolean endEntity;
    private Set handledExtensions = new HashSet();
    private int index;

    public CertPathValidationContext(Set set) {
        this.criticalExtensions = set;
    }

    public void addHandledExtension(ASN1ObjectIdentifier aSN1ObjectIdentifier) {
        this.handledExtensions.add(aSN1ObjectIdentifier);
    }

    @Override // org.bouncycastle.util.Memoable
    public Memoable copy() {
        CertPathValidationContext certPathValidationContext = new CertPathValidationContext(new HashSet(this.criticalExtensions));
        certPathValidationContext.handledExtensions = new HashSet(this.handledExtensions);
        certPathValidationContext.endEntity = this.endEntity;
        certPathValidationContext.index = this.index;
        return certPathValidationContext;
    }

    public Set getUnhandledCriticalExtensionOIDs() {
        HashSet hashSet = new HashSet(this.criticalExtensions);
        hashSet.removeAll(this.handledExtensions);
        return hashSet;
    }

    public boolean isEndEntity() {
        return this.endEntity;
    }

    @Override // org.bouncycastle.util.Memoable
    public void reset(Memoable memoable) {
        CertPathValidationContext certPathValidationContext = (CertPathValidationContext) memoable;
        this.criticalExtensions = new HashSet(certPathValidationContext.criticalExtensions);
        this.handledExtensions = new HashSet(certPathValidationContext.handledExtensions);
        this.endEntity = certPathValidationContext.endEntity;
        this.index = certPathValidationContext.index;
    }

    public void setIsEndEntity(boolean z10) {
        this.endEntity = z10;
    }
}
