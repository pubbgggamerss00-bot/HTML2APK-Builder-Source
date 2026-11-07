package org.bouncycastle.x509;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.math.BigInteger;
import java.net.HttpURLConnection;
import java.net.InetAddress;
import java.net.URL;
import java.security.GeneralSecurityException;
import java.security.PublicKey;
import java.security.SignatureException;
import java.security.cert.CertPath;
import java.security.cert.CertPathValidatorException;
import java.security.cert.Certificate;
import java.security.cert.CertificateExpiredException;
import java.security.cert.CertificateFactory;
import java.security.cert.CertificateNotYetValidException;
import java.security.cert.PKIXCertPathChecker;
import java.security.cert.PKIXParameters;
import java.security.cert.PolicyNode;
import java.security.cert.TrustAnchor;
import java.security.cert.X509CRL;
import java.security.cert.X509CRLEntry;
import java.security.cert.X509CertSelector;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.Vector;
import javax.security.auth.x500.X500Principal;
import org.bouncycastle.asn1.ASN1Enumerated;
import org.bouncycastle.asn1.ASN1IA5String;
import org.bouncycastle.asn1.ASN1InputStream;
import org.bouncycastle.asn1.ASN1Integer;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.ASN1OctetString;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.ASN1TaggedObject;
import org.bouncycastle.asn1.DEROctetString;
import org.bouncycastle.asn1.x509.AccessDescription;
import org.bouncycastle.asn1.x509.AlgorithmIdentifier;
import org.bouncycastle.asn1.x509.AuthorityInformationAccess;
import org.bouncycastle.asn1.x509.AuthorityKeyIdentifier;
import org.bouncycastle.asn1.x509.BasicConstraints;
import org.bouncycastle.asn1.x509.CRLDistPoint;
import org.bouncycastle.asn1.x509.DistributionPoint;
import org.bouncycastle.asn1.x509.DistributionPointName;
import org.bouncycastle.asn1.x509.Extension;
import org.bouncycastle.asn1.x509.GeneralName;
import org.bouncycastle.asn1.x509.GeneralNames;
import org.bouncycastle.asn1.x509.GeneralSubtree;
import org.bouncycastle.asn1.x509.IssuingDistributionPoint;
import org.bouncycastle.asn1.x509.NameConstraints;
import org.bouncycastle.asn1.x509.PolicyInformation;
import org.bouncycastle.asn1.x509.qualified.ETSIQCObjectIdentifiers;
import org.bouncycastle.asn1.x509.qualified.MonetaryValue;
import org.bouncycastle.asn1.x509.qualified.QCStatement;
import org.bouncycastle.asn1.x509.qualified.RFC3739QCObjectIdentifiers;
import org.bouncycastle.i18n.ErrorBundle;
import org.bouncycastle.i18n.LocaleString;
import org.bouncycastle.i18n.filter.TrustedInput;
import org.bouncycastle.i18n.filter.UntrustedInput;
import org.bouncycastle.i18n.filter.UntrustedUrlInput;
import org.bouncycastle.jce.provider.AnnotatedException;
import org.bouncycastle.jce.provider.BouncyCastleProvider;
import org.bouncycastle.jce.provider.PKIXNameConstraintValidator;
import org.bouncycastle.jce.provider.PKIXNameConstraintValidatorException;
import org.bouncycastle.jce.provider.PKIXPolicyNode;
import org.bouncycastle.jce.provider.RFC3280CertPathUtilities;
import org.bouncycastle.util.Integers;
import org.bouncycastle.util.Objects;

/* loaded from: classes3.dex */
public class PKIXCertPathReviewer extends CertPathValidatorUtilities {
    private static final String RESOURCE_NAME = "org.bouncycastle.x509.CertPathReviewerMessages";
    protected CertPath certPath;
    protected List certs;
    protected Date currentDate;
    protected List[] errors;
    private boolean initialized;

    /* renamed from: n, reason: collision with root package name */
    protected int f20547n;
    protected List[] notifications;
    protected PKIXParameters pkixParams;
    protected PolicyNode policyTree;
    protected PublicKey subjectPublicKey;
    protected TrustAnchor trustAnchor;
    protected Date validDate;
    private static final String QC_STATEMENT = Extension.qCStatements.getId();
    private static final String CRL_DIST_POINTS = Extension.cRLDistributionPoints.getId();
    private static final String AUTH_INFO_ACCESS = Extension.authorityInfoAccess.getId();

    public PKIXCertPathReviewer() {
    }

    private String IPtoString(byte[] bArr) {
        try {
            return InetAddress.getByAddress(bArr).getHostAddress();
        } catch (Exception unused) {
            StringBuffer stringBuffer = new StringBuffer();
            for (int i10 = 0; i10 != bArr.length; i10++) {
                stringBuffer.append(Integer.toHexString(bArr[i10] & 255));
                stringBuffer.append(' ');
            }
            return stringBuffer.toString();
        }
    }

    private void checkCriticalExtensions() throws CertPathReviewerException, CertPathValidatorException {
        List<PKIXCertPathChecker> certPathCheckers = this.pkixParams.getCertPathCheckers();
        Iterator<PKIXCertPathChecker> it = certPathCheckers.iterator();
        while (it.hasNext()) {
            try {
                try {
                    it.next().init(false);
                } catch (CertPathValidatorException e10) {
                    throw new CertPathReviewerException(new ErrorBundle(RESOURCE_NAME, "CertPathReviewer.certPathCheckerError", new Object[]{e10.getMessage(), e10, e10.getClass().getName()}), e10);
                }
            } catch (CertPathReviewerException e11) {
                addError(e11.getErrorMessage(), e11.getIndex());
                return;
            }
        }
        for (int size = this.certs.size() - 1; size >= 0; size--) {
            X509Certificate x509Certificate = (X509Certificate) this.certs.get(size);
            Set<String> criticalExtensionOIDs = x509Certificate.getCriticalExtensionOIDs();
            if (criticalExtensionOIDs != null && !criticalExtensionOIDs.isEmpty()) {
                criticalExtensionOIDs.remove(CertPathValidatorUtilities.KEY_USAGE);
                criticalExtensionOIDs.remove(CertPathValidatorUtilities.CERTIFICATE_POLICIES);
                criticalExtensionOIDs.remove(CertPathValidatorUtilities.POLICY_MAPPINGS);
                criticalExtensionOIDs.remove(CertPathValidatorUtilities.INHIBIT_ANY_POLICY);
                criticalExtensionOIDs.remove(CertPathValidatorUtilities.ISSUING_DISTRIBUTION_POINT);
                criticalExtensionOIDs.remove(CertPathValidatorUtilities.DELTA_CRL_INDICATOR);
                criticalExtensionOIDs.remove(CertPathValidatorUtilities.POLICY_CONSTRAINTS);
                criticalExtensionOIDs.remove(CertPathValidatorUtilities.BASIC_CONSTRAINTS);
                criticalExtensionOIDs.remove(CertPathValidatorUtilities.SUBJECT_ALTERNATIVE_NAME);
                criticalExtensionOIDs.remove(CertPathValidatorUtilities.NAME_CONSTRAINTS);
                if (size == 0) {
                    criticalExtensionOIDs.remove(Extension.extendedKeyUsage.getId());
                }
                String str = QC_STATEMENT;
                if (criticalExtensionOIDs.contains(str) && processQcStatements(x509Certificate, size)) {
                    criticalExtensionOIDs.remove(str);
                }
                Iterator<PKIXCertPathChecker> it2 = certPathCheckers.iterator();
                while (it2.hasNext()) {
                    try {
                        it2.next().check(x509Certificate, criticalExtensionOIDs);
                    } catch (CertPathValidatorException e12) {
                        throw new CertPathReviewerException(new ErrorBundle(RESOURCE_NAME, "CertPathReviewer.criticalExtensionError", new Object[]{e12.getMessage(), e12, e12.getClass().getName()}), e12.getCause(), this.certPath, size);
                    }
                }
                if (!criticalExtensionOIDs.isEmpty()) {
                    Iterator<String> it3 = criticalExtensionOIDs.iterator();
                    while (it3.hasNext()) {
                        addError(new ErrorBundle(RESOURCE_NAME, "CertPathReviewer.unknownCriticalExt", new Object[]{new ASN1ObjectIdentifier(it3.next())}), size);
                    }
                }
            }
        }
    }

    private void checkNameConstraints() throws CertPathReviewerException {
        PKIXNameConstraintValidator pKIXNameConstraintValidator = new PKIXNameConstraintValidator();
        try {
            for (int size = this.certs.size() - 1; size > 0; size--) {
                X509Certificate x509Certificate = (X509Certificate) this.certs.get(size);
                if (!CertPathValidatorUtilities.isSelfIssued(x509Certificate)) {
                    X500Principal subjectPrincipal = CertPathValidatorUtilities.getSubjectPrincipal(x509Certificate);
                    try {
                        ASN1Sequence aSN1Sequence = (ASN1Sequence) new ASN1InputStream(new ByteArrayInputStream(subjectPrincipal.getEncoded())).readObject();
                        try {
                            pKIXNameConstraintValidator.checkPermittedDN(aSN1Sequence);
                            try {
                                pKIXNameConstraintValidator.checkExcludedDN(aSN1Sequence);
                                try {
                                    ASN1Sequence aSN1Sequence2 = (ASN1Sequence) CertPathValidatorUtilities.getExtensionValue(x509Certificate, CertPathValidatorUtilities.SUBJECT_ALTERNATIVE_NAME);
                                    if (aSN1Sequence2 != null) {
                                        for (int i10 = 0; i10 < aSN1Sequence2.size(); i10++) {
                                            GeneralName generalName = GeneralName.getInstance(aSN1Sequence2.getObjectAt(i10));
                                            try {
                                                pKIXNameConstraintValidator.checkPermitted(generalName);
                                                pKIXNameConstraintValidator.checkExcluded(generalName);
                                            } catch (PKIXNameConstraintValidatorException e10) {
                                                throw new CertPathReviewerException(new ErrorBundle(RESOURCE_NAME, "CertPathReviewer.notPermittedEmail", new Object[]{new UntrustedInput(generalName)}), e10, this.certPath, size);
                                            }
                                        }
                                    }
                                } catch (AnnotatedException e11) {
                                    throw new CertPathReviewerException(new ErrorBundle(RESOURCE_NAME, "CertPathReviewer.subjAltNameExtError"), e11, this.certPath, size);
                                }
                            } catch (PKIXNameConstraintValidatorException e12) {
                                throw new CertPathReviewerException(new ErrorBundle(RESOURCE_NAME, "CertPathReviewer.excludedDN", new Object[]{new UntrustedInput(subjectPrincipal.getName())}), e12, this.certPath, size);
                            }
                        } catch (PKIXNameConstraintValidatorException e13) {
                            throw new CertPathReviewerException(new ErrorBundle(RESOURCE_NAME, "CertPathReviewer.notPermittedDN", new Object[]{new UntrustedInput(subjectPrincipal.getName())}), e13, this.certPath, size);
                        }
                    } catch (IOException e14) {
                        throw new CertPathReviewerException(new ErrorBundle(RESOURCE_NAME, "CertPathReviewer.ncSubjectNameError", new Object[]{new UntrustedInput(subjectPrincipal)}), e14, this.certPath, size);
                    }
                }
                try {
                    ASN1Sequence aSN1Sequence3 = (ASN1Sequence) CertPathValidatorUtilities.getExtensionValue(x509Certificate, CertPathValidatorUtilities.NAME_CONSTRAINTS);
                    if (aSN1Sequence3 != null) {
                        NameConstraints nameConstraints = NameConstraints.getInstance(aSN1Sequence3);
                        GeneralSubtree[] permittedSubtrees = nameConstraints.getPermittedSubtrees();
                        if (permittedSubtrees != null) {
                            pKIXNameConstraintValidator.intersectPermittedSubtree(permittedSubtrees);
                        }
                        GeneralSubtree[] excludedSubtrees = nameConstraints.getExcludedSubtrees();
                        if (excludedSubtrees != null) {
                            for (int i11 = 0; i11 != excludedSubtrees.length; i11++) {
                                pKIXNameConstraintValidator.addExcludedSubtree(excludedSubtrees[i11]);
                            }
                        }
                    }
                } catch (AnnotatedException e15) {
                    throw new CertPathReviewerException(new ErrorBundle(RESOURCE_NAME, "CertPathReviewer.ncExtError"), e15, this.certPath, size);
                }
            }
        } catch (CertPathReviewerException e16) {
            addError(e16.getErrorMessage(), e16.getIndex());
        }
    }

    private void checkPathLength() {
        BasicConstraints basicConstraints;
        ASN1Integer pathLenConstraintInteger;
        int iMin = this.f20547n;
        int i10 = 0;
        for (int size = this.certs.size() - 1; size > 0; size--) {
            X509Certificate x509Certificate = (X509Certificate) this.certs.get(size);
            if (!CertPathValidatorUtilities.isSelfIssued(x509Certificate)) {
                if (iMin <= 0) {
                    addError(new ErrorBundle(RESOURCE_NAME, "CertPathReviewer.pathLengthExtended"));
                }
                iMin--;
                i10++;
            }
            try {
                basicConstraints = BasicConstraints.getInstance(CertPathValidatorUtilities.getExtensionValue(x509Certificate, CertPathValidatorUtilities.BASIC_CONSTRAINTS));
            } catch (AnnotatedException unused) {
                addError(new ErrorBundle(RESOURCE_NAME, "CertPathReviewer.processLengthConstError"), size);
                basicConstraints = null;
            }
            if (basicConstraints != null && basicConstraints.isCA() && (pathLenConstraintInteger = basicConstraints.getPathLenConstraintInteger()) != null) {
                iMin = Math.min(iMin, pathLenConstraintInteger.intPositiveValueExact());
            }
        }
        addNotification(new ErrorBundle(RESOURCE_NAME, "CertPathReviewer.totalPathLength", new Object[]{Integers.valueOf(i10)}));
    }

    /* JADX WARN: Code restructure failed: missing block: B:65:0x0147, code lost:
    
        r22 = org.bouncycastle.x509.CertPathValidatorUtilities.getQualifierSet(r10.getPolicyQualifiers());
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0151, code lost:
    
        r9 = r5[r14 - 1];
        r10 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x0158, code lost:
    
        if (r10 >= r9.size()) goto L376;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x015a, code lost:
    
        r21 = (org.bouncycastle.jce.provider.PKIXPolicyNode) r9.get(r10);
        r11 = r21.getExpectedPolicies().iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x016e, code lost:
    
        if (r11.hasNext() == false) goto L377;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x0170, code lost:
    
        r30 = r9;
        r9 = r11.next();
        r31 = r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x017a, code lost:
    
        if ((r9 instanceof java.lang.String) == false) goto L76;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x017c, code lost:
    
        r9 = (java.lang.String) r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x0181, code lost:
    
        if ((r9 instanceof org.bouncycastle.asn1.ASN1ObjectIdentifier) == false) goto L379;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x0183, code lost:
    
        r9 = ((org.bouncycastle.asn1.ASN1ObjectIdentifier) r9).getId();
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x0189, code lost:
    
        r10 = r21.getChildren();
        r17 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x0193, code lost:
    
        if (r10.hasNext() == false) goto L381;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x0195, code lost:
    
        r19 = r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x01a5, code lost:
    
        if (r9.equals(((org.bouncycastle.jce.provider.PKIXPolicyNode) r10.next()).getValidPolicy()) == false) goto L383;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x01a7, code lost:
    
        r17 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x01a9, code lost:
    
        r10 = r19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x01ac, code lost:
    
        if (r17 != false) goto L380;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x01ae, code lost:
    
        r10 = new java.util.HashSet();
        r10.add(r9);
        r17 = new org.bouncycastle.jce.provider.PKIXPolicyNode(new java.util.ArrayList(), r14, r10, r21, r22, r9, false);
        r9 = r21;
        r9.addChild(r17);
        r21 = r9;
        r5[r14].add(r17);
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x01d6, code lost:
    
        r9 = r30;
        r10 = r31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x01db, code lost:
    
        r10 = r10 + 1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void checkPolicy() throws CertPathReviewerException {
        PKIXPolicyNode pKIXPolicyNodeRemovePolicyNode;
        PKIXPolicyNode pKIXPolicyNode;
        int i10;
        int i11;
        int i12;
        ASN1Primitive aSN1Primitive;
        Set<String> set;
        HashSet hashSet;
        int iIntValueExact;
        int iIntValueExact2;
        HashSet hashSet2;
        Set<String> initialPolicies = this.pkixParams.getInitialPolicies();
        int i13 = this.f20547n + 1;
        ArrayList[] arrayListArr = new ArrayList[i13];
        for (int i14 = 0; i14 < i13; i14++) {
            arrayListArr[i14] = new ArrayList();
        }
        HashSet hashSet3 = new HashSet();
        hashSet3.add(RFC3280CertPathUtilities.ANY_POLICY);
        PKIXPolicyNode pKIXPolicyNode2 = new PKIXPolicyNode(new ArrayList(), 0, hashSet3, null, new HashSet(), RFC3280CertPathUtilities.ANY_POLICY, false);
        arrayListArr[0].add(pKIXPolicyNode2);
        int i15 = this.pkixParams.isExplicitPolicyRequired() ? 0 : this.f20547n + 1;
        int i16 = this.pkixParams.isAnyPolicyInhibited() ? 0 : this.f20547n + 1;
        int i17 = this.pkixParams.isPolicyMappingInhibited() ? 0 : this.f20547n + 1;
        try {
            int size = this.certs.size() - 1;
            X509Certificate x509Certificate = null;
            HashSet hashSet4 = null;
            while (size >= 0) {
                int i18 = this.f20547n - size;
                X509Certificate x509Certificate2 = (X509Certificate) this.certs.get(size);
                PKIXPolicyNode pKIXPolicyNode3 = pKIXPolicyNode2;
                try {
                    ASN1Sequence aSN1Sequence = (ASN1Sequence) CertPathValidatorUtilities.getExtensionValue(x509Certificate2, CertPathValidatorUtilities.CERTIFICATE_POLICIES);
                    if (aSN1Sequence == null || pKIXPolicyNode3 == null) {
                        i10 = i15;
                        i11 = i16;
                        i12 = i17;
                    } else {
                        Enumeration objects = aSN1Sequence.getObjects();
                        i10 = i15;
                        HashSet hashSet5 = new HashSet();
                        while (objects.hasMoreElements()) {
                            PolicyInformation policyInformation = PolicyInformation.getInstance(objects.nextElement());
                            int i19 = i16;
                            ASN1ObjectIdentifier policyIdentifier = policyInformation.getPolicyIdentifier();
                            int i20 = i17;
                            hashSet5.add(policyIdentifier.getId());
                            if (!RFC3280CertPathUtilities.ANY_POLICY.equals(policyIdentifier.getId())) {
                                try {
                                    Set qualifierSet = CertPathValidatorUtilities.getQualifierSet(policyInformation.getPolicyQualifiers());
                                    if (!CertPathValidatorUtilities.processCertD1i(i18, arrayListArr, policyIdentifier, qualifierSet)) {
                                        CertPathValidatorUtilities.processCertD1ii(i18, arrayListArr, policyIdentifier, qualifierSet);
                                    }
                                } catch (CertPathValidatorException e10) {
                                    throw new CertPathReviewerException(new ErrorBundle(RESOURCE_NAME, "CertPathReviewer.policyQualifierError"), e10, this.certPath, size);
                                }
                            }
                            i16 = i19;
                            i17 = i20;
                        }
                        i11 = i16;
                        i12 = i17;
                        if (hashSet4 == null || hashSet4.contains(RFC3280CertPathUtilities.ANY_POLICY)) {
                            hashSet2 = hashSet5;
                        } else {
                            HashSet hashSet6 = new HashSet();
                            for (Object obj : hashSet4) {
                                if (hashSet5.contains(obj)) {
                                    hashSet6.add(obj);
                                }
                            }
                            hashSet2 = hashSet6;
                        }
                        if (i11 > 0 || (i18 < this.f20547n && CertPathValidatorUtilities.isSelfIssued(x509Certificate2))) {
                            Enumeration objects2 = aSN1Sequence.getObjects();
                            while (true) {
                                if (!objects2.hasMoreElements()) {
                                    break;
                                }
                                PolicyInformation policyInformation2 = PolicyInformation.getInstance(objects2.nextElement());
                                if (RFC3280CertPathUtilities.ANY_POLICY.equals(policyInformation2.getPolicyIdentifier().getId())) {
                                    try {
                                        break;
                                    } catch (CertPathValidatorException e11) {
                                        throw new CertPathReviewerException(new ErrorBundle(RESOURCE_NAME, "CertPathReviewer.policyQualifierError"), e11, this.certPath, size);
                                    }
                                }
                            }
                        }
                        int i21 = i18 - 1;
                        while (i21 >= 0) {
                            ArrayList arrayList = arrayListArr[i21];
                            int i22 = i21;
                            HashSet hashSet7 = hashSet2;
                            PKIXPolicyNode pKIXPolicyNodeRemovePolicyNode2 = pKIXPolicyNode3;
                            for (int i23 = 0; i23 < arrayList.size(); i23++) {
                                PKIXPolicyNode pKIXPolicyNode4 = (PKIXPolicyNode) arrayList.get(i23);
                                if (!pKIXPolicyNode4.hasChildren() && (pKIXPolicyNodeRemovePolicyNode2 = CertPathValidatorUtilities.removePolicyNode(pKIXPolicyNodeRemovePolicyNode2, arrayListArr, pKIXPolicyNode4)) == null) {
                                    break;
                                }
                            }
                            pKIXPolicyNode3 = pKIXPolicyNodeRemovePolicyNode2;
                            i21 = i22 - 1;
                            hashSet2 = hashSet7;
                        }
                        HashSet hashSet8 = hashSet2;
                        Set<String> criticalExtensionOIDs = x509Certificate2.getCriticalExtensionOIDs();
                        if (criticalExtensionOIDs != null) {
                            boolean zContains = criticalExtensionOIDs.contains(CertPathValidatorUtilities.CERTIFICATE_POLICIES);
                            ArrayList arrayList2 = arrayListArr[i18];
                            for (int i24 = 0; i24 < arrayList2.size(); i24++) {
                                ((PKIXPolicyNode) arrayList2.get(i24)).setCritical(zContains);
                            }
                        }
                        hashSet4 = hashSet8;
                    }
                    if (aSN1Sequence == null) {
                        pKIXPolicyNode3 = null;
                    }
                    if (i10 <= 0 && pKIXPolicyNode3 == null) {
                        throw new CertPathReviewerException(new ErrorBundle(RESOURCE_NAME, "CertPathReviewer.noValidPolicyTree"));
                    }
                    if (i18 != this.f20547n) {
                        try {
                            ASN1Primitive extensionValue = CertPathValidatorUtilities.getExtensionValue(x509Certificate2, CertPathValidatorUtilities.POLICY_MAPPINGS);
                            if (extensionValue != null) {
                                ASN1Sequence aSN1Sequence2 = (ASN1Sequence) extensionValue;
                                aSN1Primitive = extensionValue;
                                int i25 = 0;
                                while (i25 < aSN1Sequence2.size()) {
                                    ASN1Sequence aSN1Sequence3 = (ASN1Sequence) aSN1Sequence2.getObjectAt(i25);
                                    ASN1Sequence aSN1Sequence4 = aSN1Sequence2;
                                    ASN1ObjectIdentifier aSN1ObjectIdentifier = (ASN1ObjectIdentifier) aSN1Sequence3.getObjectAt(0);
                                    ASN1ObjectIdentifier aSN1ObjectIdentifier2 = (ASN1ObjectIdentifier) aSN1Sequence3.getObjectAt(1);
                                    if (RFC3280CertPathUtilities.ANY_POLICY.equals(aSN1ObjectIdentifier.getId())) {
                                        throw new CertPathReviewerException(new ErrorBundle(RESOURCE_NAME, "CertPathReviewer.invalidPolicyMapping"), this.certPath, size);
                                    }
                                    if (RFC3280CertPathUtilities.ANY_POLICY.equals(aSN1ObjectIdentifier2.getId())) {
                                        throw new CertPathReviewerException(new ErrorBundle(RESOURCE_NAME, "CertPathReviewer.invalidPolicyMapping"), this.certPath, size);
                                    }
                                    i25++;
                                    aSN1Sequence2 = aSN1Sequence4;
                                }
                            } else {
                                aSN1Primitive = extensionValue;
                            }
                            if (aSN1Primitive != null) {
                                ASN1Sequence aSN1Sequence5 = (ASN1Sequence) aSN1Primitive;
                                HashMap map = new HashMap();
                                HashSet hashSet9 = new HashSet();
                                set = initialPolicies;
                                hashSet = hashSet4;
                                int i26 = 0;
                                while (i26 < aSN1Sequence5.size()) {
                                    ASN1Sequence aSN1Sequence6 = (ASN1Sequence) aSN1Sequence5.getObjectAt(i26);
                                    ASN1Sequence aSN1Sequence7 = aSN1Sequence5;
                                    String id2 = ((ASN1ObjectIdentifier) aSN1Sequence6.getObjectAt(0)).getId();
                                    int i27 = i26;
                                    String id3 = ((ASN1ObjectIdentifier) aSN1Sequence6.getObjectAt(1)).getId();
                                    if (map.containsKey(id2)) {
                                        ((Set) map.get(id2)).add(id3);
                                    } else {
                                        HashSet hashSet10 = new HashSet();
                                        hashSet10.add(id3);
                                        map.put(id2, hashSet10);
                                        hashSet9.add(id2);
                                    }
                                    i26 = i27 + 1;
                                    aSN1Sequence5 = aSN1Sequence7;
                                }
                                Iterator it = hashSet9.iterator();
                                PKIXPolicyNode pKIXPolicyNodePrepareNextCertB2 = pKIXPolicyNode3;
                                while (it.hasNext()) {
                                    String str = (String) it.next();
                                    if (i12 > 0) {
                                        try {
                                            CertPathValidatorUtilities.prepareNextCertB1(i18, arrayListArr, str, map, x509Certificate2);
                                        } catch (CertPathValidatorException e12) {
                                            throw new CertPathReviewerException(new ErrorBundle(RESOURCE_NAME, "CertPathReviewer.policyQualifierError"), e12, this.certPath, size);
                                        } catch (AnnotatedException e13) {
                                            throw new CertPathReviewerException(new ErrorBundle(RESOURCE_NAME, "CertPathReviewer.policyExtError"), e13, this.certPath, size);
                                        }
                                    } else if (i12 <= 0) {
                                        pKIXPolicyNodePrepareNextCertB2 = CertPathValidatorUtilities.prepareNextCertB2(i18, arrayListArr, str, pKIXPolicyNodePrepareNextCertB2);
                                    }
                                }
                                pKIXPolicyNode3 = pKIXPolicyNodePrepareNextCertB2;
                            } else {
                                set = initialPolicies;
                                hashSet = hashSet4;
                            }
                            if (CertPathValidatorUtilities.isSelfIssued(x509Certificate2)) {
                                i15 = i10;
                                i16 = i11;
                                i17 = i12;
                            } else {
                                i15 = i10 != 0 ? i10 - 1 : i10;
                                i17 = i12 != 0 ? i12 - 1 : i12;
                                i16 = i11 != 0 ? i11 - 1 : i11;
                            }
                            try {
                                ASN1Sequence aSN1Sequence8 = (ASN1Sequence) CertPathValidatorUtilities.getExtensionValue(x509Certificate2, CertPathValidatorUtilities.POLICY_CONSTRAINTS);
                                if (aSN1Sequence8 != null) {
                                    Enumeration objects3 = aSN1Sequence8.getObjects();
                                    while (objects3.hasMoreElements()) {
                                        ASN1TaggedObject aSN1TaggedObject = (ASN1TaggedObject) objects3.nextElement();
                                        int tagNo = aSN1TaggedObject.getTagNo();
                                        if (tagNo == 0) {
                                            int iIntValueExact3 = ASN1Integer.getInstance(aSN1TaggedObject, false).intValueExact();
                                            if (iIntValueExact3 < i15) {
                                                i15 = iIntValueExact3;
                                            }
                                        } else if (tagNo == 1 && (iIntValueExact2 = ASN1Integer.getInstance(aSN1TaggedObject, false).intValueExact()) < i17) {
                                            i17 = iIntValueExact2;
                                        }
                                    }
                                }
                                try {
                                    ASN1Integer aSN1Integer = (ASN1Integer) CertPathValidatorUtilities.getExtensionValue(x509Certificate2, CertPathValidatorUtilities.INHIBIT_ANY_POLICY);
                                    if (aSN1Integer != null && (iIntValueExact = aSN1Integer.intValueExact()) < i16) {
                                        i16 = iIntValueExact;
                                    }
                                } catch (AnnotatedException unused) {
                                    throw new CertPathReviewerException(new ErrorBundle(RESOURCE_NAME, "CertPathReviewer.policyInhibitExtError"), this.certPath, size);
                                }
                            } catch (AnnotatedException unused2) {
                                throw new CertPathReviewerException(new ErrorBundle(RESOURCE_NAME, "CertPathReviewer.policyConstExtError"), this.certPath, size);
                            }
                        } catch (AnnotatedException e14) {
                            throw new CertPathReviewerException(new ErrorBundle(RESOURCE_NAME, "CertPathReviewer.policyMapExtError"), e14, this.certPath, size);
                        }
                    } else {
                        set = initialPolicies;
                        hashSet = hashSet4;
                        i15 = i10;
                        i16 = i11;
                        i17 = i12;
                    }
                    pKIXPolicyNode2 = pKIXPolicyNode3;
                    size--;
                    x509Certificate = x509Certificate2;
                    hashSet4 = hashSet;
                    initialPolicies = set;
                } catch (AnnotatedException e15) {
                    throw new CertPathReviewerException(new ErrorBundle(RESOURCE_NAME, "CertPathReviewer.policyExtError"), e15, this.certPath, size);
                }
            }
            Set<String> set2 = initialPolicies;
            PKIXPolicyNode pKIXPolicyNode5 = pKIXPolicyNode2;
            int i28 = i15;
            int i29 = (CertPathValidatorUtilities.isSelfIssued(x509Certificate) || i28 <= 0) ? i28 : i28 - 1;
            try {
                ASN1Sequence aSN1Sequence9 = (ASN1Sequence) CertPathValidatorUtilities.getExtensionValue(x509Certificate, CertPathValidatorUtilities.POLICY_CONSTRAINTS);
                if (aSN1Sequence9 != null) {
                    Enumeration objects4 = aSN1Sequence9.getObjects();
                    int i30 = i29;
                    while (objects4.hasMoreElements()) {
                        ASN1TaggedObject aSN1TaggedObject2 = (ASN1TaggedObject) objects4.nextElement();
                        if (aSN1TaggedObject2.getTagNo() == 0 && ASN1Integer.getInstance(aSN1TaggedObject2, false).intValueExact() == 0) {
                            i30 = 0;
                        }
                    }
                    i29 = i30;
                }
                if (pKIXPolicyNode5 != null) {
                    if (!CertPathValidatorUtilities.isAnyPolicy(set2)) {
                        HashSet hashSet11 = new HashSet();
                        for (int i31 = 0; i31 < i13; i31++) {
                            ArrayList arrayList3 = arrayListArr[i31];
                            for (int i32 = 0; i32 < arrayList3.size(); i32++) {
                                PKIXPolicyNode pKIXPolicyNode6 = (PKIXPolicyNode) arrayList3.get(i32);
                                if (RFC3280CertPathUtilities.ANY_POLICY.equals(pKIXPolicyNode6.getValidPolicy())) {
                                    Iterator children = pKIXPolicyNode6.getChildren();
                                    while (children.hasNext()) {
                                        PKIXPolicyNode pKIXPolicyNode7 = (PKIXPolicyNode) children.next();
                                        if (!RFC3280CertPathUtilities.ANY_POLICY.equals(pKIXPolicyNode7.getValidPolicy())) {
                                            hashSet11.add(pKIXPolicyNode7);
                                        }
                                    }
                                }
                            }
                        }
                        Iterator it2 = hashSet11.iterator();
                        pKIXPolicyNodeRemovePolicyNode = pKIXPolicyNode5;
                        while (it2.hasNext()) {
                            PKIXPolicyNode pKIXPolicyNode8 = (PKIXPolicyNode) it2.next();
                            Set<String> set3 = set2;
                            if (!set3.contains(pKIXPolicyNode8.getValidPolicy())) {
                                pKIXPolicyNodeRemovePolicyNode = CertPathValidatorUtilities.removePolicyNode(pKIXPolicyNodeRemovePolicyNode, arrayListArr, pKIXPolicyNode8);
                            }
                            set2 = set3;
                        }
                        if (pKIXPolicyNodeRemovePolicyNode != null) {
                            for (int i33 = this.f20547n - 1; i33 >= 0; i33--) {
                                ArrayList arrayList4 = arrayListArr[i33];
                                for (int i34 = 0; i34 < arrayList4.size(); i34++) {
                                    PKIXPolicyNode pKIXPolicyNode9 = (PKIXPolicyNode) arrayList4.get(i34);
                                    if (!pKIXPolicyNode9.hasChildren()) {
                                        pKIXPolicyNodeRemovePolicyNode = CertPathValidatorUtilities.removePolicyNode(pKIXPolicyNodeRemovePolicyNode, arrayListArr, pKIXPolicyNode9);
                                    }
                                }
                            }
                        }
                    } else if (!this.pkixParams.isExplicitPolicyRequired()) {
                        pKIXPolicyNode = pKIXPolicyNode5;
                    } else {
                        if (hashSet4.isEmpty()) {
                            throw new CertPathReviewerException(new ErrorBundle(RESOURCE_NAME, "CertPathReviewer.explicitPolicy"), this.certPath, size);
                        }
                        HashSet hashSet12 = new HashSet();
                        for (int i35 = 0; i35 < i13; i35++) {
                            ArrayList arrayList5 = arrayListArr[i35];
                            for (int i36 = 0; i36 < arrayList5.size(); i36++) {
                                PKIXPolicyNode pKIXPolicyNode10 = (PKIXPolicyNode) arrayList5.get(i36);
                                if (RFC3280CertPathUtilities.ANY_POLICY.equals(pKIXPolicyNode10.getValidPolicy())) {
                                    Iterator children2 = pKIXPolicyNode10.getChildren();
                                    while (children2.hasNext()) {
                                        hashSet12.add(children2.next());
                                    }
                                }
                            }
                        }
                        Iterator it3 = hashSet12.iterator();
                        while (it3.hasNext()) {
                            hashSet4.contains(((PKIXPolicyNode) it3.next()).getValidPolicy());
                        }
                        pKIXPolicyNodeRemovePolicyNode = pKIXPolicyNode5;
                        for (int i37 = this.f20547n - 1; i37 >= 0; i37--) {
                            ArrayList arrayList6 = arrayListArr[i37];
                            for (int i38 = 0; i38 < arrayList6.size(); i38++) {
                                PKIXPolicyNode pKIXPolicyNode11 = (PKIXPolicyNode) arrayList6.get(i38);
                                if (!pKIXPolicyNode11.hasChildren()) {
                                    pKIXPolicyNodeRemovePolicyNode = CertPathValidatorUtilities.removePolicyNode(pKIXPolicyNodeRemovePolicyNode, arrayListArr, pKIXPolicyNode11);
                                }
                            }
                        }
                    }
                    pKIXPolicyNode = pKIXPolicyNodeRemovePolicyNode;
                } else {
                    if (this.pkixParams.isExplicitPolicyRequired()) {
                        throw new CertPathReviewerException(new ErrorBundle(RESOURCE_NAME, "CertPathReviewer.explicitPolicy"), this.certPath, size);
                    }
                    pKIXPolicyNode = null;
                }
                if (i29 <= 0 && pKIXPolicyNode == null) {
                    throw new CertPathReviewerException(new ErrorBundle(RESOURCE_NAME, "CertPathReviewer.invalidPolicy"));
                }
            } catch (AnnotatedException unused3) {
                throw new CertPathReviewerException(new ErrorBundle(RESOURCE_NAME, "CertPathReviewer.policyConstExtError"), this.certPath, size);
            }
        } catch (CertPathReviewerException e16) {
            addError(e16.getErrorMessage(), e16.getIndex());
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(13:57|(2:162|59)(2:64|(2:150|66)(3:70|(2:74|(1:76))|77))|(2:175|78)|83|(16:166|85|(1:87)(1:90)|152|91|(1:93)(1:96)|97|(2:100|98)|181|101|(2:104|102)|160|105|106|171|107)(1:114)|(1:118)|119|(1:141)(7:121|(1:125)|156|126|(2:128|(1:130))(1:131)|134|(2:136|(1:140))(0))|142|164|143|180|146) */
    /* JADX WARN: Code restructure failed: missing block: B:145:0x0399, code lost:
    
        addError(new org.bouncycastle.i18n.ErrorBundle(org.bouncycastle.x509.PKIXCertPathReviewer.RESOURCE_NAME, "CertPathReviewer.pubKeyError"), r9);
     */
    /* JADX WARN: Removed duplicated region for block: B:114:0x02fd  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0300  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0328  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x0383  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x026a A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0138  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x013b  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0160  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x016f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void checkSignatures() throws Exception {
        TrustAnchor trustAnchor;
        TrustAnchor trustAnchor2;
        X500Principal subjectPrincipal;
        X509Certificate trustedCert;
        PublicKey publicKey;
        int size;
        ErrorBundle errorBundle;
        ErrorBundle errorBundle2;
        int i10;
        ASN1Primitive extensionValue;
        ASN1Primitive extensionValue2;
        char c10;
        AuthorityKeyIdentifier authorityKeyIdentifier;
        GeneralNames authorityCertIssuer;
        boolean[] keyUsage;
        X509Certificate x509Certificate;
        Collection trustAnchors;
        addNotification(new ErrorBundle(RESOURCE_NAME, "CertPathReviewer.certPathValidDate", new Object[]{new TrustedInput(this.validDate), new TrustedInput(this.currentDate)}));
        try {
            List list = this.certs;
            x509Certificate = (X509Certificate) list.get(list.size() - 1);
            trustAnchors = getTrustAnchors(x509Certificate, this.pkixParams.getTrustAnchors());
        } catch (CertPathReviewerException e10) {
            e = e10;
            trustAnchor = null;
        } catch (Throwable th2) {
            th = th2;
            trustAnchor = null;
        }
        if (trustAnchors.size() > 1) {
            addError(new ErrorBundle(RESOURCE_NAME, "CertPathReviewer.conflictingTrustAnchors", new Object[]{Integers.valueOf(trustAnchors.size()), new UntrustedInput(x509Certificate.getIssuerX500Principal())}));
        } else {
            if (!trustAnchors.isEmpty()) {
                trustAnchor = (TrustAnchor) trustAnchors.iterator().next();
                try {
                    try {
                        try {
                            CertPathValidatorUtilities.verifyX509Certificate(x509Certificate, trustAnchor.getTrustedCert() != null ? trustAnchor.getTrustedCert().getPublicKey() : trustAnchor.getCAPublicKey(), this.pkixParams.getSigProvider());
                        } catch (SignatureException unused) {
                            addError(new ErrorBundle(RESOURCE_NAME, "CertPathReviewer.trustButInvalidCert"));
                        } catch (Exception unused2) {
                        }
                    } catch (Throwable th3) {
                        th = th3;
                        addError(new ErrorBundle(RESOURCE_NAME, "CertPathReviewer.unknown", new Object[]{new UntrustedInput(th.getMessage()), new UntrustedInput(th)}));
                        trustAnchor2 = trustAnchor;
                        if (trustAnchor2 == null) {
                        }
                        if (trustAnchor2 == null) {
                        }
                        X509Certificate x509Certificate2 = trustedCert;
                        X500Principal subjectX500Principal = subjectPrincipal;
                        PublicKey nextWorkingKey = publicKey;
                        size = this.certs.size() - 1;
                        while (size >= 0) {
                        }
                        this.trustAnchor = trustAnchor2;
                        this.subjectPublicKey = nextWorkingKey;
                    }
                } catch (CertPathReviewerException e11) {
                    e = e11;
                    addError(e.getErrorMessage());
                    trustAnchor2 = trustAnchor;
                    if (trustAnchor2 == null) {
                    }
                    if (trustAnchor2 == null) {
                    }
                    X509Certificate x509Certificate22 = trustedCert;
                    X500Principal subjectX500Principal2 = subjectPrincipal;
                    PublicKey nextWorkingKey2 = publicKey;
                    size = this.certs.size() - 1;
                    while (size >= 0) {
                    }
                    this.trustAnchor = trustAnchor2;
                    this.subjectPublicKey = nextWorkingKey2;
                }
                trustAnchor2 = trustAnchor;
                if (trustAnchor2 == null) {
                    X509Certificate trustedCert2 = trustAnchor2.getTrustedCert();
                    try {
                        subjectPrincipal = trustedCert2 != null ? CertPathValidatorUtilities.getSubjectPrincipal(trustedCert2) : new X500Principal(trustAnchor2.getCAName());
                    } catch (IllegalArgumentException unused3) {
                        addError(new ErrorBundle(RESOURCE_NAME, "CertPathReviewer.trustDNInvalid", new Object[]{new UntrustedInput(trustAnchor2.getCAName())}));
                        subjectPrincipal = null;
                    }
                    if (trustedCert2 != null && (keyUsage = trustedCert2.getKeyUsage()) != null && (keyUsage.length <= 5 || !keyUsage[5])) {
                        addNotification(new ErrorBundle(RESOURCE_NAME, "CertPathReviewer.trustKeyUsage"));
                    }
                } else {
                    subjectPrincipal = null;
                }
                if (trustAnchor2 == null) {
                    trustedCert = trustAnchor2.getTrustedCert();
                    publicKey = trustedCert != null ? trustedCert.getPublicKey() : trustAnchor2.getCAPublicKey();
                    try {
                        AlgorithmIdentifier algorithmIdentifier = CertPathValidatorUtilities.getAlgorithmIdentifier(publicKey);
                        algorithmIdentifier.getAlgorithm();
                        algorithmIdentifier.getParameters();
                    } catch (CertPathValidatorException unused4) {
                        addError(new ErrorBundle(RESOURCE_NAME, "CertPathReviewer.trustPubKeyError"));
                    }
                } else {
                    trustedCert = null;
                    publicKey = null;
                }
                X509Certificate x509Certificate222 = trustedCert;
                X500Principal subjectX500Principal22 = subjectPrincipal;
                PublicKey nextWorkingKey22 = publicKey;
                size = this.certs.size() - 1;
                while (size >= 0) {
                    int i11 = this.f20547n - size;
                    X509Certificate x509Certificate3 = (X509Certificate) this.certs.get(size);
                    if (nextWorkingKey22 != null) {
                        try {
                            CertPathValidatorUtilities.verifyX509Certificate(x509Certificate3, nextWorkingKey22, this.pkixParams.getSigProvider());
                        } catch (GeneralSecurityException e12) {
                            errorBundle = new ErrorBundle(RESOURCE_NAME, "CertPathReviewer.signatureNotVerified", new Object[]{e12.getMessage(), e12, e12.getClass().getName()});
                            addError(errorBundle, size);
                            x509Certificate3.checkValidity(this.validDate);
                            if (this.pkixParams.isRevocationEnabled()) {
                            }
                            if (subjectX500Principal22 != null) {
                            }
                            if (i10 == this.f20547n) {
                            }
                            subjectX500Principal22 = x509Certificate3.getSubjectX500Principal();
                            nextWorkingKey22 = CertPathValidatorUtilities.getNextWorkingKey(this.certs, size);
                            AlgorithmIdentifier algorithmIdentifier2 = CertPathValidatorUtilities.getAlgorithmIdentifier(nextWorkingKey22);
                            algorithmIdentifier2.getAlgorithm();
                            algorithmIdentifier2.getParameters();
                            size--;
                            x509Certificate222 = x509Certificate3;
                        }
                    } else if (CertPathValidatorUtilities.isSelfIssued(x509Certificate3)) {
                        try {
                            CertPathValidatorUtilities.verifyX509Certificate(x509Certificate3, x509Certificate3.getPublicKey(), this.pkixParams.getSigProvider());
                            addError(new ErrorBundle(RESOURCE_NAME, "CertPathReviewer.rootKeyIsValidButNotATrustAnchor"), size);
                        } catch (GeneralSecurityException e13) {
                            errorBundle = new ErrorBundle(RESOURCE_NAME, "CertPathReviewer.signatureNotVerified", new Object[]{e13.getMessage(), e13, e13.getClass().getName()});
                            addError(errorBundle, size);
                            x509Certificate3.checkValidity(this.validDate);
                            if (this.pkixParams.isRevocationEnabled()) {
                            }
                            if (subjectX500Principal22 != null) {
                                addError(new ErrorBundle(RESOURCE_NAME, "CertPathReviewer.certWrongIssuer", new Object[]{subjectX500Principal22.getName(), x509Certificate3.getIssuerX500Principal().getName()}), size);
                            }
                            if (i10 == this.f20547n) {
                            }
                            subjectX500Principal22 = x509Certificate3.getSubjectX500Principal();
                            nextWorkingKey22 = CertPathValidatorUtilities.getNextWorkingKey(this.certs, size);
                            AlgorithmIdentifier algorithmIdentifier22 = CertPathValidatorUtilities.getAlgorithmIdentifier(nextWorkingKey22);
                            algorithmIdentifier22.getAlgorithm();
                            algorithmIdentifier22.getParameters();
                            size--;
                            x509Certificate222 = x509Certificate3;
                        }
                    } else {
                        ErrorBundle errorBundle3 = new ErrorBundle(RESOURCE_NAME, "CertPathReviewer.NoIssuerPublicKey");
                        byte[] extensionValue3 = x509Certificate3.getExtensionValue(Extension.authorityKeyIdentifier.getId());
                        if (extensionValue3 != null && (authorityCertIssuer = (authorityKeyIdentifier = AuthorityKeyIdentifier.getInstance(ASN1OctetString.getInstance(extensionValue3).getOctets())).getAuthorityCertIssuer()) != null) {
                            GeneralName generalName = authorityCertIssuer.getNames()[0];
                            BigInteger authorityCertSerialNumber = authorityKeyIdentifier.getAuthorityCertSerialNumber();
                            if (authorityCertSerialNumber != null) {
                                errorBundle3.setExtraArguments(new Object[]{new LocaleString(RESOURCE_NAME, "missingIssuer"), " \"", generalName, "\" ", new LocaleString(RESOURCE_NAME, "missingSerial"), " ", authorityCertSerialNumber});
                            }
                        }
                        addError(errorBundle3, size);
                    }
                    try {
                        x509Certificate3.checkValidity(this.validDate);
                    } catch (CertificateExpiredException unused5) {
                        errorBundle2 = new ErrorBundle(RESOURCE_NAME, "CertPathReviewer.certificateExpired", new Object[]{new TrustedInput(x509Certificate3.getNotAfter())});
                        addError(errorBundle2, size);
                        if (this.pkixParams.isRevocationEnabled()) {
                        }
                        if (subjectX500Principal22 != null) {
                        }
                        if (i10 == this.f20547n) {
                        }
                        subjectX500Principal22 = x509Certificate3.getSubjectX500Principal();
                        nextWorkingKey22 = CertPathValidatorUtilities.getNextWorkingKey(this.certs, size);
                        AlgorithmIdentifier algorithmIdentifier222 = CertPathValidatorUtilities.getAlgorithmIdentifier(nextWorkingKey22);
                        algorithmIdentifier222.getAlgorithm();
                        algorithmIdentifier222.getParameters();
                        size--;
                        x509Certificate222 = x509Certificate3;
                    } catch (CertificateNotYetValidException unused6) {
                        errorBundle2 = new ErrorBundle(RESOURCE_NAME, "CertPathReviewer.certificateNotYetValid", new Object[]{new TrustedInput(x509Certificate3.getNotBefore())});
                        addError(errorBundle2, size);
                        if (this.pkixParams.isRevocationEnabled()) {
                        }
                        if (subjectX500Principal22 != null) {
                        }
                        if (i10 == this.f20547n) {
                        }
                        subjectX500Principal22 = x509Certificate3.getSubjectX500Principal();
                        nextWorkingKey22 = CertPathValidatorUtilities.getNextWorkingKey(this.certs, size);
                        AlgorithmIdentifier algorithmIdentifier2222 = CertPathValidatorUtilities.getAlgorithmIdentifier(nextWorkingKey22);
                        algorithmIdentifier2222.getAlgorithm();
                        algorithmIdentifier2222.getParameters();
                        size--;
                        x509Certificate222 = x509Certificate3;
                    }
                    if (this.pkixParams.isRevocationEnabled()) {
                        try {
                            extensionValue2 = CertPathValidatorUtilities.getExtensionValue(x509Certificate3, CRL_DIST_POINTS);
                        } catch (AnnotatedException unused7) {
                            addError(new ErrorBundle(RESOURCE_NAME, "CertPathReviewer.crlDistPtExtError"), size);
                        }
                        CRLDistPoint cRLDistPoint = extensionValue2 != null ? CRLDistPoint.getInstance(extensionValue2) : null;
                        try {
                            extensionValue = CertPathValidatorUtilities.getExtensionValue(x509Certificate3, AUTH_INFO_ACCESS);
                        } catch (AnnotatedException unused8) {
                            addError(new ErrorBundle(RESOURCE_NAME, "CertPathReviewer.crlAuthInfoAccError"), size);
                        }
                        AuthorityInformationAccess authorityInformationAccess = extensionValue != null ? AuthorityInformationAccess.getInstance(extensionValue) : null;
                        Vector cRLDistUrls = getCRLDistUrls(cRLDistPoint);
                        Vector oCSPUrls = getOCSPUrls(authorityInformationAccess);
                        Iterator it = cRLDistUrls.iterator();
                        while (it.hasNext()) {
                            addNotification(new ErrorBundle(RESOURCE_NAME, "CertPathReviewer.crlDistPoint", new Object[]{new UntrustedUrlInput(it.next())}), size);
                        }
                        Iterator it2 = oCSPUrls.iterator();
                        while (it2.hasNext()) {
                            addNotification(new ErrorBundle(RESOURCE_NAME, "CertPathReviewer.ocspLocation", new Object[]{new UntrustedUrlInput(it2.next())}), size);
                        }
                        try {
                            i10 = i11;
                        } catch (CertPathReviewerException e14) {
                            e = e14;
                            i10 = i11;
                        }
                        try {
                            checkRevocation(this.pkixParams, x509Certificate3, this.validDate, x509Certificate222, nextWorkingKey22, cRLDistUrls, oCSPUrls, size);
                        } catch (CertPathReviewerException e15) {
                            e = e15;
                            addError(e.getErrorMessage(), size);
                            if (subjectX500Principal22 != null) {
                            }
                            if (i10 == this.f20547n) {
                            }
                            subjectX500Principal22 = x509Certificate3.getSubjectX500Principal();
                            nextWorkingKey22 = CertPathValidatorUtilities.getNextWorkingKey(this.certs, size);
                            AlgorithmIdentifier algorithmIdentifier22222 = CertPathValidatorUtilities.getAlgorithmIdentifier(nextWorkingKey22);
                            algorithmIdentifier22222.getAlgorithm();
                            algorithmIdentifier22222.getParameters();
                            size--;
                            x509Certificate222 = x509Certificate3;
                        }
                    } else {
                        i10 = i11;
                    }
                    if (subjectX500Principal22 != null && !x509Certificate3.getIssuerX500Principal().equals(subjectX500Principal22)) {
                        addError(new ErrorBundle(RESOURCE_NAME, "CertPathReviewer.certWrongIssuer", new Object[]{subjectX500Principal22.getName(), x509Certificate3.getIssuerX500Principal().getName()}), size);
                    }
                    if (i10 == this.f20547n) {
                        c10 = 5;
                    } else {
                        if (x509Certificate3 != null && x509Certificate3.getVersion() == 1) {
                            addError(new ErrorBundle(RESOURCE_NAME, "CertPathReviewer.noCACert"), size);
                        }
                        try {
                            BasicConstraints basicConstraints = BasicConstraints.getInstance(CertPathValidatorUtilities.getExtensionValue(x509Certificate3, CertPathValidatorUtilities.BASIC_CONSTRAINTS));
                            if (basicConstraints == null) {
                                addError(new ErrorBundle(RESOURCE_NAME, "CertPathReviewer.noBasicConstraints"), size);
                            } else if (!basicConstraints.isCA()) {
                                addError(new ErrorBundle(RESOURCE_NAME, "CertPathReviewer.noCACert"), size);
                            }
                        } catch (AnnotatedException unused9) {
                            addError(new ErrorBundle(RESOURCE_NAME, "CertPathReviewer.errorProcesingBC"), size);
                        }
                        boolean[] keyUsage2 = x509Certificate3.getKeyUsage();
                        if (keyUsage2 != null) {
                            c10 = 5;
                            if (keyUsage2.length <= 5 || !keyUsage2[5]) {
                                addError(new ErrorBundle(RESOURCE_NAME, "CertPathReviewer.noCertSign"), size);
                            }
                        }
                    }
                    subjectX500Principal22 = x509Certificate3.getSubjectX500Principal();
                    nextWorkingKey22 = CertPathValidatorUtilities.getNextWorkingKey(this.certs, size);
                    AlgorithmIdentifier algorithmIdentifier222222 = CertPathValidatorUtilities.getAlgorithmIdentifier(nextWorkingKey22);
                    algorithmIdentifier222222.getAlgorithm();
                    algorithmIdentifier222222.getParameters();
                    size--;
                    x509Certificate222 = x509Certificate3;
                }
                this.trustAnchor = trustAnchor2;
                this.subjectPublicKey = nextWorkingKey22;
            }
            addError(new ErrorBundle(RESOURCE_NAME, "CertPathReviewer.noTrustAnchorFound", new Object[]{new UntrustedInput(x509Certificate.getIssuerX500Principal()), Integers.valueOf(this.pkixParams.getTrustAnchors().size())}));
        }
        trustAnchor = null;
        trustAnchor2 = trustAnchor;
        if (trustAnchor2 == null) {
        }
        if (trustAnchor2 == null) {
        }
        X509Certificate x509Certificate2222 = trustedCert;
        X500Principal subjectX500Principal222 = subjectPrincipal;
        PublicKey nextWorkingKey222 = publicKey;
        size = this.certs.size() - 1;
        while (size >= 0) {
        }
        this.trustAnchor = trustAnchor2;
        this.subjectPublicKey = nextWorkingKey222;
    }

    private X509CRL getCRL(String str) throws Exception {
        try {
            URL url = new URL(str);
            if (!url.getProtocol().equals("http") && !url.getProtocol().equals("https")) {
                return null;
            }
            HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
            httpURLConnection.setUseCaches(false);
            httpURLConnection.setDoInput(true);
            httpURLConnection.connect();
            if (httpURLConnection.getResponseCode() == 200) {
                return (X509CRL) CertificateFactory.getInstance("X.509", BouncyCastleProvider.PROVIDER_NAME).generateCRL(httpURLConnection.getInputStream());
            }
            throw new Exception(httpURLConnection.getResponseMessage());
        } catch (Exception e10) {
            throw new CertPathReviewerException(new ErrorBundle(RESOURCE_NAME, "CertPathReviewer.loadCrlDistPointError", new Object[]{new UntrustedInput(str), e10.getMessage(), e10, e10.getClass().getName()}));
        }
    }

    private boolean processQcStatements(X509Certificate x509Certificate, int i10) {
        ErrorBundle errorBundle;
        try {
            ASN1Sequence aSN1Sequence = (ASN1Sequence) CertPathValidatorUtilities.getExtensionValue(x509Certificate, QC_STATEMENT);
            boolean z10 = false;
            for (int i11 = 0; i11 < aSN1Sequence.size(); i11++) {
                QCStatement qCStatement = QCStatement.getInstance(aSN1Sequence.getObjectAt(i11));
                if (ETSIQCObjectIdentifiers.id_etsi_qcs_QcCompliance.equals((ASN1Primitive) qCStatement.getStatementId())) {
                    errorBundle = new ErrorBundle(RESOURCE_NAME, "CertPathReviewer.QcEuCompliance");
                } else {
                    if (!RFC3739QCObjectIdentifiers.id_qcs_pkixQCSyntax_v1.equals((ASN1Primitive) qCStatement.getStatementId())) {
                        if (ETSIQCObjectIdentifiers.id_etsi_qcs_QcSSCD.equals((ASN1Primitive) qCStatement.getStatementId())) {
                            errorBundle = new ErrorBundle(RESOURCE_NAME, "CertPathReviewer.QcSSCD");
                        } else if (ETSIQCObjectIdentifiers.id_etsi_qcs_LimiteValue.equals((ASN1Primitive) qCStatement.getStatementId())) {
                            MonetaryValue monetaryValue = MonetaryValue.getInstance(qCStatement.getStatementInfo());
                            monetaryValue.getCurrency();
                            double dDoubleValue = monetaryValue.getAmount().doubleValue() * Math.pow(10.0d, monetaryValue.getExponent().doubleValue());
                            addNotification(monetaryValue.getCurrency().isAlphabetic() ? new ErrorBundle(RESOURCE_NAME, "CertPathReviewer.QcLimitValueAlpha", new Object[]{monetaryValue.getCurrency().getAlphabetic(), new TrustedInput(new Double(dDoubleValue)), monetaryValue}) : new ErrorBundle(RESOURCE_NAME, "CertPathReviewer.QcLimitValueNum", new Object[]{Integers.valueOf(monetaryValue.getCurrency().getNumeric()), new TrustedInput(new Double(dDoubleValue)), monetaryValue}), i10);
                        } else {
                            addNotification(new ErrorBundle(RESOURCE_NAME, "CertPathReviewer.QcUnknownStatement", new Object[]{qCStatement.getStatementId(), new UntrustedInput(qCStatement)}), i10);
                            z10 = true;
                        }
                    }
                }
                addNotification(errorBundle, i10);
            }
            return !z10;
        } catch (AnnotatedException unused) {
            addError(new ErrorBundle(RESOURCE_NAME, "CertPathReviewer.QcStatementExtError"), i10);
            return false;
        }
    }

    public void addError(ErrorBundle errorBundle) {
        this.errors[0].add(errorBundle);
    }

    public void addNotification(ErrorBundle errorBundle) {
        this.notifications[0].add(errorBundle);
    }

    /* JADX WARN: Removed duplicated region for block: B:93:0x0239  */
    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void checkCRLs(PKIXParameters pKIXParameters, X509Certificate x509Certificate, Date date, X509Certificate x509Certificate2, PublicKey publicKey, Vector vector, int i10) throws Exception {
        Iterator it;
        X509CRL x509crl;
        boolean z10;
        boolean z11;
        boolean[] keyUsage;
        X509CRL x509crl2;
        X500Principal x500Principal;
        Iterator it2;
        boolean z12;
        ErrorBundle errorBundle;
        X509CRLStoreSelector x509CRLStoreSelector = new X509CRLStoreSelector();
        try {
            x509CRLStoreSelector.addIssuerName(CertPathValidatorUtilities.getEncodedIssuerPrincipal(x509Certificate).getEncoded());
            x509CRLStoreSelector.setCertificateChecking(x509Certificate);
            try {
                Set setFindCRLs = PKIXCRLUtil.findCRLs(x509CRLStoreSelector, pKIXParameters);
                it = setFindCRLs.iterator();
                if (setFindCRLs.isEmpty()) {
                    Iterator it3 = PKIXCRLUtil.findCRLs(new X509CRLStoreSelector(), pKIXParameters).iterator();
                    ArrayList arrayList = new ArrayList();
                    while (it3.hasNext()) {
                        arrayList.add(((X509CRL) it3.next()).getIssuerX500Principal());
                    }
                    addNotification(new ErrorBundle(RESOURCE_NAME, "CertPathReviewer.noCrlInCertstore", new Object[]{new UntrustedInput(x509CRLStoreSelector.getIssuerNames()), new UntrustedInput(arrayList), Integers.valueOf(arrayList.size())}), i10);
                }
            } catch (AnnotatedException e10) {
                addError(new ErrorBundle(RESOURCE_NAME, "CertPathReviewer.crlExtractionError", new Object[]{e10.getCause().getMessage(), e10.getCause(), e10.getCause().getClass().getName()}), i10);
                it = new ArrayList().iterator();
            }
            X509CRL x509crl3 = null;
            while (it.hasNext()) {
                x509crl3 = (X509CRL) it.next();
                Date thisUpdate = x509crl3.getThisUpdate();
                Date nextUpdate = x509crl3.getNextUpdate();
                Object[] objArr = {new TrustedInput(thisUpdate), new TrustedInput(nextUpdate)};
                if (nextUpdate == null || date.before(nextUpdate)) {
                    addNotification(new ErrorBundle(RESOURCE_NAME, "CertPathReviewer.localValidCRL", objArr), i10);
                    x509crl = x509crl3;
                    z10 = true;
                    break;
                }
                addNotification(new ErrorBundle(RESOURCE_NAME, "CertPathReviewer.localInvalidCRL", objArr), i10);
            }
            x509crl = x509crl3;
            z10 = false;
            if (!z10) {
                X500Principal issuerX500Principal = x509Certificate.getIssuerX500Principal();
                Iterator it4 = vector.iterator();
                boolean z13 = z10;
                while (true) {
                    if (!it4.hasNext()) {
                        z11 = z13;
                        break;
                    }
                    try {
                        String str = (String) it4.next();
                        X509CRL crl = getCRL(str);
                        if (crl != null) {
                            X500Principal issuerX500Principal2 = crl.getIssuerX500Principal();
                            if (issuerX500Principal.equals(issuerX500Principal2)) {
                                x509crl2 = x509crl;
                                x500Principal = issuerX500Principal;
                                it2 = it4;
                                z12 = z13;
                                Date thisUpdate2 = crl.getThisUpdate();
                                Date nextUpdate2 = crl.getNextUpdate();
                                Object[] objArr2 = {new TrustedInput(thisUpdate2), new TrustedInput(nextUpdate2), new UntrustedUrlInput(str)};
                                if (nextUpdate2 != null && !date.before(nextUpdate2)) {
                                    errorBundle = new ErrorBundle(RESOURCE_NAME, "CertPathReviewer.onlineInvalidCRL", objArr2);
                                }
                                try {
                                    addNotification(new ErrorBundle(RESOURCE_NAME, "CertPathReviewer.onlineValidCRL", objArr2), i10);
                                    x509crl = crl;
                                    z11 = true;
                                    break;
                                } catch (CertPathReviewerException e11) {
                                    e = e11;
                                    z13 = true;
                                    addNotification(e.getErrorMessage(), i10);
                                    it4 = it2;
                                    x509crl = x509crl2;
                                    issuerX500Principal = x500Principal;
                                }
                            } else {
                                x509crl2 = x509crl;
                                try {
                                    x500Principal = issuerX500Principal;
                                    it2 = it4;
                                    try {
                                        z12 = z13;
                                    } catch (CertPathReviewerException e12) {
                                        e = e12;
                                        addNotification(e.getErrorMessage(), i10);
                                        it4 = it2;
                                        x509crl = x509crl2;
                                        issuerX500Principal = x500Principal;
                                    }
                                } catch (CertPathReviewerException e13) {
                                    e = e13;
                                    x500Principal = issuerX500Principal;
                                    it2 = it4;
                                    addNotification(e.getErrorMessage(), i10);
                                    it4 = it2;
                                    x509crl = x509crl2;
                                    issuerX500Principal = x500Principal;
                                }
                                try {
                                    errorBundle = new ErrorBundle(RESOURCE_NAME, "CertPathReviewer.onlineCRLWrongCA", new Object[]{new UntrustedInput(issuerX500Principal2.getName()), new UntrustedInput(x500Principal.getName()), new UntrustedUrlInput(str)});
                                } catch (CertPathReviewerException e14) {
                                    e = e14;
                                    z13 = z12;
                                    addNotification(e.getErrorMessage(), i10);
                                    it4 = it2;
                                    x509crl = x509crl2;
                                    issuerX500Principal = x500Principal;
                                }
                            }
                            addNotification(errorBundle, i10);
                        } else {
                            x509crl2 = x509crl;
                            x500Principal = issuerX500Principal;
                            it2 = it4;
                            z12 = z13;
                        }
                        it4 = it2;
                        x509crl = x509crl2;
                        issuerX500Principal = x500Principal;
                        z13 = z12;
                    } catch (CertPathReviewerException e15) {
                        e = e15;
                        x509crl2 = x509crl;
                    }
                }
            } else {
                z11 = z10;
            }
            if (x509crl != null) {
                if (x509Certificate2 != null && (keyUsage = x509Certificate2.getKeyUsage()) != null && (keyUsage.length <= 6 || !keyUsage[6])) {
                    throw new CertPathReviewerException(new ErrorBundle(RESOURCE_NAME, "CertPathReviewer.noCrlSigningPermited"));
                }
                if (publicKey == null) {
                    throw new CertPathReviewerException(new ErrorBundle(RESOURCE_NAME, "CertPathReviewer.crlNoIssuerPublicKey"));
                }
                try {
                    x509crl.verify(publicKey, BouncyCastleProvider.PROVIDER_NAME);
                    X509CRLEntry revokedCertificate = x509crl.getRevokedCertificate(x509Certificate.getSerialNumber());
                    if (revokedCertificate == null) {
                        addNotification(new ErrorBundle(RESOURCE_NAME, "CertPathReviewer.notRevoked"), i10);
                    } else if (revokedCertificate.hasExtensions()) {
                        try {
                            ASN1Enumerated aSN1Enumerated = ASN1Enumerated.getInstance(CertPathValidatorUtilities.getExtensionValue(revokedCertificate, Extension.reasonCode.getId()));
                            String str2 = aSN1Enumerated != null ? CertPathValidatorUtilities.crlReasons[aSN1Enumerated.intValueExact()] : null;
                            if (str2 == null) {
                                str2 = CertPathValidatorUtilities.crlReasons[7];
                            }
                            LocaleString localeString = new LocaleString(RESOURCE_NAME, str2);
                            if (!date.before(revokedCertificate.getRevocationDate())) {
                                throw new CertPathReviewerException(new ErrorBundle(RESOURCE_NAME, "CertPathReviewer.certRevoked", new Object[]{new TrustedInput(revokedCertificate.getRevocationDate()), localeString}));
                            }
                            addNotification(new ErrorBundle(RESOURCE_NAME, "CertPathReviewer.revokedAfterValidation", new Object[]{new TrustedInput(revokedCertificate.getRevocationDate()), localeString}), i10);
                        } catch (AnnotatedException e16) {
                            throw new CertPathReviewerException(new ErrorBundle(RESOURCE_NAME, "CertPathReviewer.crlReasonExtError"), e16);
                        }
                    }
                    Date nextUpdate3 = x509crl.getNextUpdate();
                    if (nextUpdate3 != null && !date.before(nextUpdate3)) {
                        addNotification(new ErrorBundle(RESOURCE_NAME, "CertPathReviewer.crlUpdateAvailable", new Object[]{new TrustedInput(nextUpdate3)}), i10);
                    }
                    try {
                        ASN1Primitive extensionValue = CertPathValidatorUtilities.getExtensionValue(x509crl, CertPathValidatorUtilities.ISSUING_DISTRIBUTION_POINT);
                        try {
                            ASN1Primitive extensionValue2 = CertPathValidatorUtilities.getExtensionValue(x509crl, CertPathValidatorUtilities.DELTA_CRL_INDICATOR);
                            if (extensionValue2 != null) {
                                X509CRLStoreSelector x509CRLStoreSelector2 = new X509CRLStoreSelector();
                                try {
                                    x509CRLStoreSelector2.addIssuerName(CertPathValidatorUtilities.getIssuerPrincipal(x509crl).getEncoded());
                                    x509CRLStoreSelector2.setMinCRLNumber(((ASN1Integer) extensionValue2).getPositiveValue());
                                    try {
                                        x509CRLStoreSelector2.setMaxCRLNumber(((ASN1Integer) CertPathValidatorUtilities.getExtensionValue(x509crl, CertPathValidatorUtilities.CRL_NUMBER)).getPositiveValue().subtract(BigInteger.valueOf(1L)));
                                        try {
                                            Iterator it5 = PKIXCRLUtil.findCRLs(x509CRLStoreSelector2, pKIXParameters).iterator();
                                            while (it5.hasNext()) {
                                                try {
                                                    if (Objects.areEqual(extensionValue, CertPathValidatorUtilities.getExtensionValue((X509CRL) it5.next(), CertPathValidatorUtilities.ISSUING_DISTRIBUTION_POINT))) {
                                                    }
                                                } catch (AnnotatedException e17) {
                                                    throw new CertPathReviewerException(new ErrorBundle(RESOURCE_NAME, "CertPathReviewer.distrPtExtError"), e17);
                                                }
                                            }
                                            throw new CertPathReviewerException(new ErrorBundle(RESOURCE_NAME, "CertPathReviewer.noBaseCRL"));
                                        } catch (AnnotatedException e18) {
                                            throw new CertPathReviewerException(new ErrorBundle(RESOURCE_NAME, "CertPathReviewer.crlExtractionError"), e18);
                                        }
                                    } catch (AnnotatedException e19) {
                                        throw new CertPathReviewerException(new ErrorBundle(RESOURCE_NAME, "CertPathReviewer.crlNbrExtError"), e19);
                                    }
                                } catch (IOException e20) {
                                    throw new CertPathReviewerException(new ErrorBundle(RESOURCE_NAME, "CertPathReviewer.crlIssuerException"), e20);
                                }
                            }
                            if (extensionValue != null) {
                                IssuingDistributionPoint issuingDistributionPoint = IssuingDistributionPoint.getInstance(extensionValue);
                                try {
                                    BasicConstraints basicConstraints = BasicConstraints.getInstance(CertPathValidatorUtilities.getExtensionValue(x509Certificate, CertPathValidatorUtilities.BASIC_CONSTRAINTS));
                                    if (issuingDistributionPoint.onlyContainsUserCerts() && basicConstraints != null && basicConstraints.isCA()) {
                                        throw new CertPathReviewerException(new ErrorBundle(RESOURCE_NAME, "CertPathReviewer.crlOnlyUserCert"));
                                    }
                                    if (issuingDistributionPoint.onlyContainsCACerts() && (basicConstraints == null || !basicConstraints.isCA())) {
                                        throw new CertPathReviewerException(new ErrorBundle(RESOURCE_NAME, "CertPathReviewer.crlOnlyCaCert"));
                                    }
                                    if (issuingDistributionPoint.onlyContainsAttributeCerts()) {
                                        throw new CertPathReviewerException(new ErrorBundle(RESOURCE_NAME, "CertPathReviewer.crlOnlyAttrCert"));
                                    }
                                } catch (AnnotatedException e21) {
                                    throw new CertPathReviewerException(new ErrorBundle(RESOURCE_NAME, "CertPathReviewer.crlBCExtError"), e21);
                                }
                            }
                        } catch (AnnotatedException unused) {
                            throw new CertPathReviewerException(new ErrorBundle(RESOURCE_NAME, "CertPathReviewer.deltaCrlExtError"));
                        }
                    } catch (AnnotatedException unused2) {
                        throw new CertPathReviewerException(new ErrorBundle(RESOURCE_NAME, "CertPathReviewer.distrPtExtError"));
                    }
                } catch (Exception e22) {
                    throw new CertPathReviewerException(new ErrorBundle(RESOURCE_NAME, "CertPathReviewer.crlVerifyFailed"), e22);
                }
            }
            if (!z11) {
                throw new CertPathReviewerException(new ErrorBundle(RESOURCE_NAME, "CertPathReviewer.noValidCrlFound"));
            }
        } catch (IOException e23) {
            throw new CertPathReviewerException(new ErrorBundle(RESOURCE_NAME, "CertPathReviewer.crlIssuerException"), e23);
        }
    }

    public void checkRevocation(PKIXParameters pKIXParameters, X509Certificate x509Certificate, Date date, X509Certificate x509Certificate2, PublicKey publicKey, Vector vector, Vector vector2, int i10) throws Exception {
        checkCRLs(pKIXParameters, x509Certificate, date, x509Certificate2, publicKey, vector, i10);
    }

    public void doChecks() throws Exception {
        if (!this.initialized) {
            throw new IllegalStateException("Object not initialized. Call init() first.");
        }
        if (this.notifications != null) {
            return;
        }
        int i10 = this.f20547n;
        this.notifications = new List[i10 + 1];
        this.errors = new List[i10 + 1];
        int i11 = 0;
        while (true) {
            List[] listArr = this.notifications;
            if (i11 >= listArr.length) {
                checkSignatures();
                checkNameConstraints();
                checkPathLength();
                checkPolicy();
                checkCriticalExtensions();
                return;
            }
            listArr[i11] = new ArrayList();
            this.errors[i11] = new ArrayList();
            i11++;
        }
    }

    public Vector getCRLDistUrls(CRLDistPoint cRLDistPoint) {
        Vector vector = new Vector();
        if (cRLDistPoint != null) {
            for (DistributionPoint distributionPoint : cRLDistPoint.getDistributionPoints()) {
                DistributionPointName distributionPoint2 = distributionPoint.getDistributionPoint();
                if (distributionPoint2.getType() == 0) {
                    GeneralName[] names = GeneralNames.getInstance(distributionPoint2.getName()).getNames();
                    for (int i10 = 0; i10 < names.length; i10++) {
                        if (names[i10].getTagNo() == 6) {
                            vector.add(((ASN1IA5String) names[i10].getName()).getString());
                        }
                    }
                }
            }
        }
        return vector;
    }

    public CertPath getCertPath() {
        return this.certPath;
    }

    public int getCertPathSize() {
        return this.f20547n;
    }

    public List getErrors(int i10) throws Exception {
        doChecks();
        return this.errors[i10 + 1];
    }

    public List getNotifications(int i10) throws Exception {
        doChecks();
        return this.notifications[i10 + 1];
    }

    public Vector getOCSPUrls(AuthorityInformationAccess authorityInformationAccess) {
        Vector vector = new Vector();
        if (authorityInformationAccess != null) {
            AccessDescription[] accessDescriptions = authorityInformationAccess.getAccessDescriptions();
            for (int i10 = 0; i10 < accessDescriptions.length; i10++) {
                if (accessDescriptions[i10].getAccessMethod().equals((ASN1Primitive) AccessDescription.id_ad_ocsp)) {
                    GeneralName accessLocation = accessDescriptions[i10].getAccessLocation();
                    if (accessLocation.getTagNo() == 6) {
                        vector.add(((ASN1IA5String) accessLocation.getName()).getString());
                    }
                }
            }
        }
        return vector;
    }

    public PolicyNode getPolicyTree() throws Exception {
        doChecks();
        return this.policyTree;
    }

    public PublicKey getSubjectPublicKey() throws Exception {
        doChecks();
        return this.subjectPublicKey;
    }

    public TrustAnchor getTrustAnchor() throws Exception {
        doChecks();
        return this.trustAnchor;
    }

    public Collection getTrustAnchors(X509Certificate x509Certificate, Set set) throws CertPathReviewerException, IOException {
        ArrayList arrayList = new ArrayList();
        Iterator it = set.iterator();
        X509CertSelector x509CertSelector = new X509CertSelector();
        try {
            x509CertSelector.setSubject(CertPathValidatorUtilities.getEncodedIssuerPrincipal(x509Certificate).getEncoded());
            byte[] extensionValue = x509Certificate.getExtensionValue(Extension.authorityKeyIdentifier.getId());
            if (extensionValue != null) {
                AuthorityKeyIdentifier authorityKeyIdentifier = AuthorityKeyIdentifier.getInstance(ASN1Primitive.fromByteArray(((ASN1OctetString) ASN1Primitive.fromByteArray(extensionValue)).getOctets()));
                if (authorityKeyIdentifier.getAuthorityCertSerialNumber() != null) {
                    x509CertSelector.setSerialNumber(authorityKeyIdentifier.getAuthorityCertSerialNumber());
                } else {
                    byte[] keyIdentifier = authorityKeyIdentifier.getKeyIdentifier();
                    if (keyIdentifier != null) {
                        x509CertSelector.setSubjectKeyIdentifier(new DEROctetString(keyIdentifier).getEncoded());
                    }
                }
            }
            while (it.hasNext()) {
                TrustAnchor trustAnchor = (TrustAnchor) it.next();
                if (trustAnchor.getTrustedCert() != null) {
                    if (x509CertSelector.match(trustAnchor.getTrustedCert())) {
                        arrayList.add(trustAnchor);
                    }
                } else if (trustAnchor.getCAName() != null && trustAnchor.getCAPublicKey() != null && CertPathValidatorUtilities.getEncodedIssuerPrincipal(x509Certificate).equals(new X500Principal(trustAnchor.getCAName()))) {
                    arrayList.add(trustAnchor);
                }
            }
            return arrayList;
        } catch (IOException unused) {
            throw new CertPathReviewerException(new ErrorBundle(RESOURCE_NAME, "CertPathReviewer.trustAnchorIssuerError"));
        }
    }

    public void init(CertPath certPath, PKIXParameters pKIXParameters) throws CertPathReviewerException {
        if (this.initialized) {
            throw new IllegalStateException("object is already initialized!");
        }
        this.initialized = true;
        if (certPath == null) {
            throw new NullPointerException("certPath was null");
        }
        List<? extends Certificate> certificates = certPath.getCertificates();
        if (certificates.size() != 1) {
            HashSet hashSet = new HashSet();
            Iterator<TrustAnchor> it = pKIXParameters.getTrustAnchors().iterator();
            while (it.hasNext()) {
                hashSet.add(it.next().getTrustedCert());
            }
            ArrayList arrayList = new ArrayList();
            for (int i10 = 0; i10 != certificates.size(); i10++) {
                if (!hashSet.contains(certificates.get(i10))) {
                    arrayList.add(certificates.get(i10));
                }
            }
            try {
                this.certPath = CertificateFactory.getInstance("X.509", BouncyCastleProvider.PROVIDER_NAME).generateCertPath(arrayList);
                this.certs = arrayList;
            } catch (GeneralSecurityException unused) {
                throw new IllegalStateException("unable to rebuild certpath");
            }
        } else {
            this.certPath = certPath;
            this.certs = certPath.getCertificates();
        }
        this.f20547n = this.certs.size();
        if (this.certs.isEmpty()) {
            throw new CertPathReviewerException(new ErrorBundle(RESOURCE_NAME, "CertPathReviewer.emptyCertPath"));
        }
        this.pkixParams = (PKIXParameters) pKIXParameters.clone();
        Date date = new Date();
        this.currentDate = date;
        this.validDate = CertPathValidatorUtilities.getValidityDate(this.pkixParams, date);
        this.notifications = null;
        this.errors = null;
        this.trustAnchor = null;
        this.subjectPublicKey = null;
        this.policyTree = null;
    }

    public boolean isValidCertPath() throws Exception {
        doChecks();
        int i10 = 0;
        while (true) {
            List[] listArr = this.errors;
            if (i10 >= listArr.length) {
                return true;
            }
            if (!listArr[i10].isEmpty()) {
                return false;
            }
            i10++;
        }
    }

    public PKIXCertPathReviewer(CertPath certPath, PKIXParameters pKIXParameters) throws CertPathReviewerException {
        init(certPath, pKIXParameters);
    }

    public void addError(ErrorBundle errorBundle, int i10) {
        if (i10 < -1 || i10 >= this.f20547n) {
            throw new IndexOutOfBoundsException();
        }
        this.errors[i10 + 1].add(errorBundle);
    }

    public void addNotification(ErrorBundle errorBundle, int i10) {
        if (i10 < -1 || i10 >= this.f20547n) {
            throw new IndexOutOfBoundsException();
        }
        this.notifications[i10 + 1].add(errorBundle);
    }

    public List[] getErrors() throws Exception {
        doChecks();
        return this.errors;
    }

    public List[] getNotifications() throws Exception {
        doChecks();
        return this.notifications;
    }
}
