package org.bouncycastle.pkix.jcajce;

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
import org.bouncycastle.jce.provider.BouncyCastleProvider;
import org.bouncycastle.pkix.PKIXNameConstraintValidator;
import org.bouncycastle.pkix.PKIXNameConstraintValidatorException;
import org.bouncycastle.pkix.util.ErrorBundle;
import org.bouncycastle.pkix.util.LocaleString;
import org.bouncycastle.pkix.util.filter.TrustedInput;
import org.bouncycastle.pkix.util.filter.UntrustedInput;
import org.bouncycastle.pkix.util.filter.UntrustedUrlInput;
import org.bouncycastle.util.Integers;
import org.bouncycastle.util.Objects;

/* loaded from: classes3.dex */
public class PKIXCertPathReviewer extends CertPathValidatorUtilities {
    private static final String RESOURCE_NAME = "org.bouncycastle.pkix.CertPathReviewerMessages";
    protected CertPath certPath;
    protected List certs;
    protected Date currentDate;
    protected List[] errors;
    private boolean initialized;

    /* renamed from: n, reason: collision with root package name */
    protected int f20280n;
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
                    throw new CertPathReviewerException(createErrorBundle("CertPathReviewer.certPathCheckerError", new Object[]{e10.getMessage(), e10, e10.getClass().getName()}), e10);
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
                        throw new CertPathReviewerException(createErrorBundle("CertPathReviewer.criticalExtensionError", new Object[]{e12.getMessage(), e12, e12.getClass().getName()}), e12.getCause(), this.certPath, size);
                    }
                }
                if (!criticalExtensionOIDs.isEmpty()) {
                    Iterator<String> it3 = criticalExtensionOIDs.iterator();
                    while (it3.hasNext()) {
                        addError(createErrorBundle("CertPathReviewer.unknownCriticalExt", new Object[]{new ASN1ObjectIdentifier(it3.next())}), size);
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
                                                throw new CertPathReviewerException(createErrorBundle("CertPathReviewer.notPermittedEmail", new Object[]{new UntrustedInput(generalName)}), e10, this.certPath, size);
                                            }
                                        }
                                    }
                                } catch (AnnotatedException e11) {
                                    throw new CertPathReviewerException(createErrorBundle("CertPathReviewer.subjAltNameExtError"), e11, this.certPath, size);
                                }
                            } catch (PKIXNameConstraintValidatorException e12) {
                                throw new CertPathReviewerException(createErrorBundle("CertPathReviewer.excludedDN", new Object[]{new UntrustedInput(subjectPrincipal.getName())}), e12, this.certPath, size);
                            }
                        } catch (PKIXNameConstraintValidatorException e13) {
                            throw new CertPathReviewerException(createErrorBundle("CertPathReviewer.notPermittedDN", new Object[]{new UntrustedInput(subjectPrincipal.getName())}), e13, this.certPath, size);
                        }
                    } catch (IOException e14) {
                        throw new CertPathReviewerException(createErrorBundle("CertPathReviewer.ncSubjectNameError", new Object[]{new UntrustedInput(subjectPrincipal)}), e14, this.certPath, size);
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
                    throw new CertPathReviewerException(createErrorBundle("CertPathReviewer.ncExtError"), e15, this.certPath, size);
                }
            }
        } catch (CertPathReviewerException e16) {
            addError(e16.getErrorMessage(), e16.getIndex());
        }
    }

    private void checkPathLength() {
        BasicConstraints basicConstraints;
        ASN1Integer pathLenConstraintInteger;
        int iMin = this.f20280n;
        int i10 = 0;
        for (int size = this.certs.size() - 1; size > 0; size--) {
            X509Certificate x509Certificate = (X509Certificate) this.certs.get(size);
            if (!CertPathValidatorUtilities.isSelfIssued(x509Certificate)) {
                if (iMin <= 0) {
                    addError(createErrorBundle("CertPathReviewer.pathLengthExtended"));
                }
                iMin--;
                i10++;
            }
            try {
                basicConstraints = BasicConstraints.getInstance(CertPathValidatorUtilities.getExtensionValue(x509Certificate, CertPathValidatorUtilities.BASIC_CONSTRAINTS));
            } catch (AnnotatedException unused) {
                addError(createErrorBundle("CertPathReviewer.processLengthConstError"), size);
                basicConstraints = null;
            }
            if (basicConstraints != null && basicConstraints.isCA() && (pathLenConstraintInteger = basicConstraints.getPathLenConstraintInteger()) != null) {
                iMin = Math.min(iMin, pathLenConstraintInteger.intPositiveValueExact());
            }
        }
        addNotification(createErrorBundle("CertPathReviewer.totalPathLength", new Object[]{Integers.valueOf(i10)}));
    }

    /* JADX WARN: Code restructure failed: missing block: B:64:0x013e, code lost:
    
        r22 = org.bouncycastle.pkix.jcajce.CertPathValidatorUtilities.getQualifierSet(r4.getPolicyQualifiers());
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x0148, code lost:
    
        r2 = r5[r14 - 1];
        r4 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x014f, code lost:
    
        if (r4 >= r2.size()) goto L375;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x0151, code lost:
    
        r21 = (org.bouncycastle.pkix.jcajce.PKIXPolicyNode) r2.get(r4);
        r6 = r21.getExpectedPolicies().iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x0165, code lost:
    
        if (r6.hasNext() == false) goto L376;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x0167, code lost:
    
        r29 = r2;
        r2 = r6.next();
        r30 = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x0171, code lost:
    
        if ((r2 instanceof java.lang.String) == false) goto L75;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x0173, code lost:
    
        r2 = (java.lang.String) r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x0178, code lost:
    
        if ((r2 instanceof org.bouncycastle.asn1.ASN1ObjectIdentifier) == false) goto L378;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x017a, code lost:
    
        r2 = ((org.bouncycastle.asn1.ASN1ObjectIdentifier) r2).getId();
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x0180, code lost:
    
        r4 = r21.getChildren();
        r17 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x018a, code lost:
    
        if (r4.hasNext() == false) goto L380;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x018c, code lost:
    
        r19 = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x019c, code lost:
    
        if (r2.equals(((org.bouncycastle.pkix.jcajce.PKIXPolicyNode) r4.next()).getValidPolicy()) == false) goto L382;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x019e, code lost:
    
        r17 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x01a0, code lost:
    
        r4 = r19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x01a3, code lost:
    
        if (r17 != false) goto L379;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x01a5, code lost:
    
        r4 = new java.util.HashSet();
        r4.add(r2);
        r17 = new org.bouncycastle.pkix.jcajce.PKIXPolicyNode(new java.util.ArrayList(), r14, r4, r21, r22, r2, false);
        r2 = r21;
        r2.addChild(r17);
        r21 = r2;
        r5[r14].add(r17);
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x01cd, code lost:
    
        r2 = r29;
        r4 = r30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x01d2, code lost:
    
        r4 = r4 + 1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void checkPolicy() throws CertPathReviewerException {
        PKIXPolicyNode pKIXPolicyNode;
        String str;
        ASN1Sequence aSN1Sequence;
        ASN1Primitive aSN1Primitive;
        int i10;
        int iIntValueExact;
        int iIntValueExact2;
        PKIXPolicyNode pKIXPolicyNode2;
        String str2 = "CertPathReviewer.policyExtError";
        Set<String> initialPolicies = this.pkixParams.getInitialPolicies();
        int i11 = this.f20280n + 1;
        ArrayList[] arrayListArr = new ArrayList[i11];
        for (int i12 = 0; i12 < i11; i12++) {
            arrayListArr[i12] = new ArrayList();
        }
        HashSet hashSet = new HashSet();
        hashSet.add(org.bouncycastle.jce.provider.RFC3280CertPathUtilities.ANY_POLICY);
        PKIXPolicyNode pKIXPolicyNode3 = new PKIXPolicyNode(new ArrayList(), 0, hashSet, null, new HashSet(), org.bouncycastle.jce.provider.RFC3280CertPathUtilities.ANY_POLICY, false);
        arrayListArr[0].add(pKIXPolicyNode3);
        int i13 = this.pkixParams.isExplicitPolicyRequired() ? 0 : this.f20280n + 1;
        int i14 = this.pkixParams.isAnyPolicyInhibited() ? 0 : this.f20280n + 1;
        int i15 = this.pkixParams.isPolicyMappingInhibited() ? 0 : this.f20280n + 1;
        try {
            int size = this.certs.size() - 1;
            X509Certificate x509Certificate = null;
            HashSet hashSet2 = null;
            while (size >= 0) {
                int i16 = this.f20280n - size;
                X509Certificate x509Certificate2 = (X509Certificate) this.certs.get(size);
                try {
                    ASN1Sequence aSN1Sequence2 = (ASN1Sequence) CertPathValidatorUtilities.getExtensionValue(x509Certificate2, CertPathValidatorUtilities.CERTIFICATE_POLICIES);
                    if (aSN1Sequence2 == null || pKIXPolicyNode3 == null) {
                        str = str2;
                        aSN1Sequence = aSN1Sequence2;
                    } else {
                        Enumeration objects = aSN1Sequence2.getObjects();
                        HashSet hashSet3 = new HashSet();
                        while (objects.hasMoreElements()) {
                            PolicyInformation policyInformation = PolicyInformation.getInstance(objects.nextElement());
                            String str3 = str2;
                            ASN1ObjectIdentifier policyIdentifier = policyInformation.getPolicyIdentifier();
                            ASN1Sequence aSN1Sequence3 = aSN1Sequence2;
                            hashSet3.add(policyIdentifier.getId());
                            if (!org.bouncycastle.jce.provider.RFC3280CertPathUtilities.ANY_POLICY.equals(policyIdentifier.getId())) {
                                try {
                                    Set qualifierSet = CertPathValidatorUtilities.getQualifierSet(policyInformation.getPolicyQualifiers());
                                    if (!CertPathValidatorUtilities.processCertD1i(i16, arrayListArr, policyIdentifier, qualifierSet)) {
                                        CertPathValidatorUtilities.processCertD1ii(i16, arrayListArr, policyIdentifier, qualifierSet);
                                    }
                                } catch (CertPathValidatorException e10) {
                                    throw new CertPathReviewerException(createErrorBundle("CertPathReviewer.policyQualifierError"), e10, this.certPath, size);
                                }
                            }
                            str2 = str3;
                            aSN1Sequence2 = aSN1Sequence3;
                        }
                        str = str2;
                        aSN1Sequence = aSN1Sequence2;
                        if (hashSet2 == null || hashSet2.contains(org.bouncycastle.jce.provider.RFC3280CertPathUtilities.ANY_POLICY)) {
                            hashSet2 = hashSet3;
                        } else {
                            HashSet hashSet4 = new HashSet();
                            for (Object obj : hashSet2) {
                                if (hashSet3.contains(obj)) {
                                    hashSet4.add(obj);
                                }
                            }
                            hashSet2 = hashSet4;
                        }
                        if (i14 > 0 || (i16 < this.f20280n && CertPathValidatorUtilities.isSelfIssued(x509Certificate2))) {
                            Enumeration objects2 = aSN1Sequence.getObjects();
                            while (true) {
                                if (!objects2.hasMoreElements()) {
                                    break;
                                }
                                PolicyInformation policyInformation2 = PolicyInformation.getInstance(objects2.nextElement());
                                if (org.bouncycastle.jce.provider.RFC3280CertPathUtilities.ANY_POLICY.equals(policyInformation2.getPolicyIdentifier().getId())) {
                                    try {
                                        break;
                                    } catch (CertPathValidatorException e11) {
                                        throw new CertPathReviewerException(createErrorBundle("CertPathReviewer.policyQualifierError"), e11, this.certPath, size);
                                    }
                                }
                            }
                        }
                        int i17 = i16 - 1;
                        while (i17 >= 0) {
                            ArrayList arrayList = arrayListArr[i17];
                            int i18 = i17;
                            for (int i19 = 0; i19 < arrayList.size(); i19++) {
                                PKIXPolicyNode pKIXPolicyNode4 = (PKIXPolicyNode) arrayList.get(i19);
                                if (!pKIXPolicyNode4.hasChildren()) {
                                    PKIXPolicyNode pKIXPolicyNodeRemovePolicyNode = CertPathValidatorUtilities.removePolicyNode(pKIXPolicyNode3, arrayListArr, pKIXPolicyNode4);
                                    pKIXPolicyNode3 = pKIXPolicyNodeRemovePolicyNode;
                                    if (pKIXPolicyNodeRemovePolicyNode == null) {
                                        break;
                                    }
                                }
                            }
                            i17 = i18 - 1;
                        }
                        Set<String> criticalExtensionOIDs = x509Certificate2.getCriticalExtensionOIDs();
                        if (criticalExtensionOIDs != null) {
                            boolean zContains = criticalExtensionOIDs.contains(CertPathValidatorUtilities.CERTIFICATE_POLICIES);
                            ArrayList arrayList2 = arrayListArr[i16];
                            pKIXPolicyNode2 = pKIXPolicyNode3;
                            for (int i20 = 0; i20 < arrayList2.size(); i20++) {
                                ((PKIXPolicyNode) arrayList2.get(i20)).setCritical(zContains);
                            }
                        } else {
                            pKIXPolicyNode2 = pKIXPolicyNode3;
                        }
                        pKIXPolicyNode3 = pKIXPolicyNode2;
                    }
                    if (aSN1Sequence == null) {
                        pKIXPolicyNode3 = null;
                    }
                    if (i13 <= 0 && pKIXPolicyNode3 == null) {
                        throw new CertPathReviewerException(createErrorBundle("CertPathReviewer.noValidPolicyTree"));
                    }
                    if (i16 != this.f20280n) {
                        try {
                            ASN1Primitive extensionValue = CertPathValidatorUtilities.getExtensionValue(x509Certificate2, CertPathValidatorUtilities.POLICY_MAPPINGS);
                            if (extensionValue != null) {
                                ASN1Sequence aSN1Sequence4 = (ASN1Sequence) extensionValue;
                                aSN1Primitive = extensionValue;
                                int i21 = 0;
                                while (i21 < aSN1Sequence4.size()) {
                                    ASN1Sequence aSN1Sequence5 = (ASN1Sequence) aSN1Sequence4.getObjectAt(i21);
                                    ASN1Sequence aSN1Sequence6 = aSN1Sequence4;
                                    ASN1ObjectIdentifier aSN1ObjectIdentifier = (ASN1ObjectIdentifier) aSN1Sequence5.getObjectAt(0);
                                    ASN1ObjectIdentifier aSN1ObjectIdentifier2 = (ASN1ObjectIdentifier) aSN1Sequence5.getObjectAt(1);
                                    if (org.bouncycastle.jce.provider.RFC3280CertPathUtilities.ANY_POLICY.equals(aSN1ObjectIdentifier.getId())) {
                                        throw new CertPathReviewerException(createErrorBundle("CertPathReviewer.invalidPolicyMapping"), this.certPath, size);
                                    }
                                    if (org.bouncycastle.jce.provider.RFC3280CertPathUtilities.ANY_POLICY.equals(aSN1ObjectIdentifier2.getId())) {
                                        throw new CertPathReviewerException(createErrorBundle("CertPathReviewer.invalidPolicyMapping"), this.certPath, size);
                                    }
                                    i21++;
                                    aSN1Sequence4 = aSN1Sequence6;
                                }
                            } else {
                                aSN1Primitive = extensionValue;
                            }
                            if (aSN1Primitive != null) {
                                ASN1Sequence aSN1Sequence7 = (ASN1Sequence) aSN1Primitive;
                                HashMap map = new HashMap();
                                HashSet hashSet5 = new HashSet();
                                PKIXPolicyNode pKIXPolicyNode5 = pKIXPolicyNode3;
                                i10 = i13;
                                int i22 = 0;
                                while (i22 < aSN1Sequence7.size()) {
                                    ASN1Sequence aSN1Sequence8 = (ASN1Sequence) aSN1Sequence7.getObjectAt(i22);
                                    ASN1Sequence aSN1Sequence9 = aSN1Sequence7;
                                    String id2 = ((ASN1ObjectIdentifier) aSN1Sequence8.getObjectAt(0)).getId();
                                    int i23 = i22;
                                    String id3 = ((ASN1ObjectIdentifier) aSN1Sequence8.getObjectAt(1)).getId();
                                    if (map.containsKey(id2)) {
                                        ((Set) map.get(id2)).add(id3);
                                    } else {
                                        HashSet hashSet6 = new HashSet();
                                        hashSet6.add(id3);
                                        map.put(id2, hashSet6);
                                        hashSet5.add(id2);
                                    }
                                    i22 = i23 + 1;
                                    aSN1Sequence7 = aSN1Sequence9;
                                }
                                Iterator it = hashSet5.iterator();
                                pKIXPolicyNode3 = pKIXPolicyNode5;
                                while (it.hasNext()) {
                                    String str4 = (String) it.next();
                                    if (i15 > 0) {
                                        try {
                                            CertPathValidatorUtilities.prepareNextCertB1(i16, arrayListArr, str4, map, x509Certificate2);
                                        } catch (CertPathValidatorException e12) {
                                            throw new CertPathReviewerException(createErrorBundle("CertPathReviewer.policyQualifierError"), e12, this.certPath, size);
                                        } catch (AnnotatedException e13) {
                                            throw new CertPathReviewerException(createErrorBundle(str), e13, this.certPath, size);
                                        }
                                    } else if (i15 <= 0) {
                                        pKIXPolicyNode3 = CertPathValidatorUtilities.prepareNextCertB2(i16, arrayListArr, str4, pKIXPolicyNode3);
                                    }
                                }
                            } else {
                                i10 = i13;
                            }
                            if (CertPathValidatorUtilities.isSelfIssued(x509Certificate2)) {
                                i13 = i10;
                            } else {
                                i13 = i10 != 0 ? i10 - 1 : i10;
                                if (i15 != 0) {
                                    i15--;
                                }
                                if (i14 != 0) {
                                    i14--;
                                }
                            }
                            try {
                                ASN1Sequence aSN1Sequence10 = (ASN1Sequence) CertPathValidatorUtilities.getExtensionValue(x509Certificate2, CertPathValidatorUtilities.POLICY_CONSTRAINTS);
                                if (aSN1Sequence10 != null) {
                                    Enumeration objects3 = aSN1Sequence10.getObjects();
                                    while (objects3.hasMoreElements()) {
                                        ASN1TaggedObject aSN1TaggedObject = (ASN1TaggedObject) objects3.nextElement();
                                        int tagNo = aSN1TaggedObject.getTagNo();
                                        if (tagNo == 0) {
                                            int iIntValueExact3 = ASN1Integer.getInstance(aSN1TaggedObject, false).intValueExact();
                                            if (iIntValueExact3 < i13) {
                                                i13 = iIntValueExact3;
                                            }
                                        } else if (tagNo == 1 && (iIntValueExact2 = ASN1Integer.getInstance(aSN1TaggedObject, false).intValueExact()) < i15) {
                                            i15 = iIntValueExact2;
                                        }
                                    }
                                }
                                try {
                                    ASN1Integer aSN1Integer = (ASN1Integer) CertPathValidatorUtilities.getExtensionValue(x509Certificate2, CertPathValidatorUtilities.INHIBIT_ANY_POLICY);
                                    if (aSN1Integer != null && (iIntValueExact = aSN1Integer.intValueExact()) < i14) {
                                        i14 = iIntValueExact;
                                    }
                                } catch (AnnotatedException unused) {
                                    throw new CertPathReviewerException(createErrorBundle("CertPathReviewer.policyInhibitExtError"), this.certPath, size);
                                }
                            } catch (AnnotatedException unused2) {
                                throw new CertPathReviewerException(createErrorBundle("CertPathReviewer.policyConstExtError"), this.certPath, size);
                            }
                        } catch (AnnotatedException e14) {
                            throw new CertPathReviewerException(createErrorBundle("CertPathReviewer.policyMapExtError"), e14, this.certPath, size);
                        }
                    }
                    size--;
                    x509Certificate = x509Certificate2;
                    str2 = str;
                } catch (AnnotatedException e15) {
                    throw new CertPathReviewerException(createErrorBundle(str2), e15, this.certPath, size);
                }
            }
            int i24 = i13;
            int i25 = (CertPathValidatorUtilities.isSelfIssued(x509Certificate) || i24 <= 0) ? i24 : i24 - 1;
            try {
                ASN1Sequence aSN1Sequence11 = (ASN1Sequence) CertPathValidatorUtilities.getExtensionValue(x509Certificate, CertPathValidatorUtilities.POLICY_CONSTRAINTS);
                if (aSN1Sequence11 != null) {
                    Enumeration objects4 = aSN1Sequence11.getObjects();
                    int i26 = i25;
                    while (objects4.hasMoreElements()) {
                        ASN1TaggedObject aSN1TaggedObject2 = (ASN1TaggedObject) objects4.nextElement();
                        if (aSN1TaggedObject2.getTagNo() == 0 && ASN1Integer.getInstance(aSN1TaggedObject2, false).intValueExact() == 0) {
                            i26 = 0;
                        }
                    }
                    i25 = i26;
                }
                if (pKIXPolicyNode3 != null) {
                    if (!CertPathValidatorUtilities.isAnyPolicy(initialPolicies)) {
                        HashSet hashSet7 = new HashSet();
                        for (int i27 = 0; i27 < i11; i27++) {
                            ArrayList arrayList3 = arrayListArr[i27];
                            for (int i28 = 0; i28 < arrayList3.size(); i28++) {
                                PKIXPolicyNode pKIXPolicyNode6 = (PKIXPolicyNode) arrayList3.get(i28);
                                if (org.bouncycastle.jce.provider.RFC3280CertPathUtilities.ANY_POLICY.equals(pKIXPolicyNode6.getValidPolicy())) {
                                    Iterator children = pKIXPolicyNode6.getChildren();
                                    while (children.hasNext()) {
                                        PKIXPolicyNode pKIXPolicyNode7 = (PKIXPolicyNode) children.next();
                                        if (!org.bouncycastle.jce.provider.RFC3280CertPathUtilities.ANY_POLICY.equals(pKIXPolicyNode7.getValidPolicy())) {
                                            hashSet7.add(pKIXPolicyNode7);
                                        }
                                    }
                                }
                            }
                        }
                        Iterator it2 = hashSet7.iterator();
                        while (it2.hasNext()) {
                            PKIXPolicyNode pKIXPolicyNode8 = (PKIXPolicyNode) it2.next();
                            if (!initialPolicies.contains(pKIXPolicyNode8.getValidPolicy())) {
                                pKIXPolicyNode3 = CertPathValidatorUtilities.removePolicyNode(pKIXPolicyNode3, arrayListArr, pKIXPolicyNode8);
                            }
                        }
                        if (pKIXPolicyNode3 != null) {
                            for (int i29 = this.f20280n - 1; i29 >= 0; i29--) {
                                ArrayList arrayList4 = arrayListArr[i29];
                                for (int i30 = 0; i30 < arrayList4.size(); i30++) {
                                    PKIXPolicyNode pKIXPolicyNode9 = (PKIXPolicyNode) arrayList4.get(i30);
                                    if (!pKIXPolicyNode9.hasChildren()) {
                                        pKIXPolicyNode3 = CertPathValidatorUtilities.removePolicyNode(pKIXPolicyNode3, arrayListArr, pKIXPolicyNode9);
                                    }
                                }
                            }
                        }
                    } else if (this.pkixParams.isExplicitPolicyRequired()) {
                        if (hashSet2.isEmpty()) {
                            throw new CertPathReviewerException(createErrorBundle("CertPathReviewer.explicitPolicy"), this.certPath, size);
                        }
                        HashSet hashSet8 = new HashSet();
                        for (int i31 = 0; i31 < i11; i31++) {
                            ArrayList arrayList5 = arrayListArr[i31];
                            for (int i32 = 0; i32 < arrayList5.size(); i32++) {
                                PKIXPolicyNode pKIXPolicyNode10 = (PKIXPolicyNode) arrayList5.get(i32);
                                if (org.bouncycastle.jce.provider.RFC3280CertPathUtilities.ANY_POLICY.equals(pKIXPolicyNode10.getValidPolicy())) {
                                    Iterator children2 = pKIXPolicyNode10.getChildren();
                                    while (children2.hasNext()) {
                                        hashSet8.add(children2.next());
                                    }
                                }
                            }
                        }
                        Iterator it3 = hashSet8.iterator();
                        while (it3.hasNext()) {
                            hashSet2.contains(((PKIXPolicyNode) it3.next()).getValidPolicy());
                        }
                        for (int i33 = this.f20280n - 1; i33 >= 0; i33--) {
                            ArrayList arrayList6 = arrayListArr[i33];
                            for (int i34 = 0; i34 < arrayList6.size(); i34++) {
                                PKIXPolicyNode pKIXPolicyNode11 = (PKIXPolicyNode) arrayList6.get(i34);
                                if (!pKIXPolicyNode11.hasChildren()) {
                                    pKIXPolicyNode3 = CertPathValidatorUtilities.removePolicyNode(pKIXPolicyNode3, arrayListArr, pKIXPolicyNode11);
                                }
                            }
                        }
                    }
                    pKIXPolicyNode = pKIXPolicyNode3;
                } else {
                    if (this.pkixParams.isExplicitPolicyRequired()) {
                        throw new CertPathReviewerException(createErrorBundle("CertPathReviewer.explicitPolicy"), this.certPath, size);
                    }
                    pKIXPolicyNode = null;
                }
                if (i25 <= 0 && pKIXPolicyNode == null) {
                    throw new CertPathReviewerException(createErrorBundle("CertPathReviewer.invalidPolicy"));
                }
            } catch (AnnotatedException unused3) {
                throw new CertPathReviewerException(createErrorBundle("CertPathReviewer.policyConstExtError"), this.certPath, size);
            }
        } catch (CertPathReviewerException e16) {
            addError(e16.getErrorMessage(), e16.getIndex());
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(13:59|(2:148|61)(3:66|(2:161|68)(2:72|(2:76|(1:78)))|65)|(2:165|79)|84|(13:146|86|(1:88)(1:91)|159|92|(1:94)(1:97)|98|(2:101|99)|173|102|(2:105|103)|153|106)|(1:113)|114|(8:116|(1:120)|163|121|(4:123|(0)|129|(1:135))(1:126)|125|129|(2:131|135))|136|157|137|172|140) */
    /* JADX WARN: Code restructure failed: missing block: B:139:0x036a, code lost:
    
        addError(createErrorBundle("CertPathReviewer.pubKeyError"), r9);
     */
    /* JADX WARN: Removed duplicated region for block: B:111:0x02e1  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0308  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x0257 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x012e  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0152  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0161  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void checkSignatures() throws Exception {
        TrustAnchor trustAnchor;
        ErrorBundle errorMessage;
        TrustAnchor trustAnchor2;
        X500Principal subjectPrincipal;
        X509Certificate trustedCert;
        PublicKey publicKey;
        int size;
        ErrorBundle errorBundleCreateErrorBundle;
        ErrorBundle errorBundleCreateErrorBundle2;
        ASN1Primitive extensionValue;
        ASN1Primitive extensionValue2;
        boolean[] keyUsage;
        BasicConstraints basicConstraints;
        AuthorityKeyIdentifier authorityKeyIdentifier;
        GeneralNames authorityCertIssuer;
        boolean[] keyUsage2;
        X509Certificate x509Certificate;
        Collection trustAnchors;
        ErrorBundle errorBundleCreateErrorBundle3;
        addNotification(createErrorBundle("CertPathReviewer.certPathValidDate", new Object[]{new TrustedInput(this.validDate), new TrustedInput(this.currentDate)}));
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
            errorBundleCreateErrorBundle3 = createErrorBundle("CertPathReviewer.conflictingTrustAnchors", new Object[]{Integers.valueOf(trustAnchors.size()), new UntrustedInput(x509Certificate.getIssuerX500Principal())});
        } else {
            if (!trustAnchors.isEmpty()) {
                trustAnchor = (TrustAnchor) trustAnchors.iterator().next();
                try {
                    try {
                        try {
                            CertPathValidatorUtilities.verifyX509Certificate(x509Certificate, trustAnchor.getTrustedCert() != null ? trustAnchor.getTrustedCert().getPublicKey() : trustAnchor.getCAPublicKey(), this.pkixParams.getSigProvider());
                        } catch (SignatureException unused) {
                            addError(createErrorBundle("CertPathReviewer.trustButInvalidCert"));
                        } catch (Exception unused2) {
                        }
                    } catch (Throwable th3) {
                        th = th3;
                        errorMessage = createErrorBundle("CertPathReviewer.unknown", new Object[]{new UntrustedInput(th.getMessage()), new UntrustedInput(th)});
                        addError(errorMessage);
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
                    errorMessage = e.getErrorMessage();
                    addError(errorMessage);
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
                        addError(createErrorBundle("CertPathReviewer.trustDNInvalid", new Object[]{new UntrustedInput(trustAnchor2.getCAName())}));
                        subjectPrincipal = null;
                    }
                    if (trustedCert2 != null && (keyUsage2 = trustedCert2.getKeyUsage()) != null && (keyUsage2.length <= 5 || !keyUsage2[5])) {
                        addNotification(createErrorBundle("CertPathReviewer.trustKeyUsage"));
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
                        addError(createErrorBundle("CertPathReviewer.trustPubKeyError"));
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
                    int i10 = this.f20280n - size;
                    X509Certificate x509Certificate3 = (X509Certificate) this.certs.get(size);
                    if (nextWorkingKey22 != null) {
                        try {
                            CertPathValidatorUtilities.verifyX509Certificate(x509Certificate3, nextWorkingKey22, this.pkixParams.getSigProvider());
                        } catch (GeneralSecurityException e12) {
                            errorBundleCreateErrorBundle = createErrorBundle("CertPathReviewer.signatureNotVerified", new Object[]{e12.getMessage(), e12, e12.getClass().getName()});
                        }
                    } else {
                        if (CertPathValidatorUtilities.isSelfIssued(x509Certificate3)) {
                            try {
                                CertPathValidatorUtilities.verifyX509Certificate(x509Certificate3, x509Certificate3.getPublicKey(), this.pkixParams.getSigProvider());
                                addError(createErrorBundle("CertPathReviewer.rootKeyIsValidButNotATrustAnchor"), size);
                            } catch (GeneralSecurityException e13) {
                                errorBundleCreateErrorBundle = createErrorBundle("CertPathReviewer.signatureNotVerified", new Object[]{e13.getMessage(), e13, e13.getClass().getName()});
                            }
                        } else {
                            errorBundleCreateErrorBundle = createErrorBundle("CertPathReviewer.NoIssuerPublicKey");
                            byte[] extensionValue3 = x509Certificate3.getExtensionValue(Extension.authorityKeyIdentifier.getId());
                            if (extensionValue3 != null && (authorityCertIssuer = (authorityKeyIdentifier = AuthorityKeyIdentifier.getInstance(ASN1OctetString.getInstance(extensionValue3).getOctets())).getAuthorityCertIssuer()) != null) {
                                GeneralName generalName = authorityCertIssuer.getNames()[0];
                                BigInteger authorityCertSerialNumber = authorityKeyIdentifier.getAuthorityCertSerialNumber();
                                if (authorityCertSerialNumber != null) {
                                    errorBundleCreateErrorBundle.setExtraArguments(new Object[]{new LocaleString(RESOURCE_NAME, "missingIssuer"), " \"", generalName, "\" ", new LocaleString(RESOURCE_NAME, "missingSerial"), " ", authorityCertSerialNumber});
                                }
                            }
                        }
                        addError(errorBundleCreateErrorBundle, size);
                    }
                    try {
                        x509Certificate3.checkValidity(this.validDate);
                    } catch (CertificateExpiredException unused5) {
                        errorBundleCreateErrorBundle2 = createErrorBundle("CertPathReviewer.certificateExpired", new Object[]{new TrustedInput(x509Certificate3.getNotAfter())});
                        addError(errorBundleCreateErrorBundle2, size);
                        if (this.pkixParams.isRevocationEnabled()) {
                        }
                        if (subjectX500Principal22 != null) {
                            addError(createErrorBundle("CertPathReviewer.certWrongIssuer", new Object[]{subjectX500Principal22.getName(), x509Certificate3.getIssuerX500Principal().getName()}), size);
                        }
                        if (i10 != this.f20280n) {
                        }
                        subjectX500Principal22 = x509Certificate3.getSubjectX500Principal();
                        nextWorkingKey22 = CertPathValidatorUtilities.getNextWorkingKey(this.certs, size);
                        AlgorithmIdentifier algorithmIdentifier2 = CertPathValidatorUtilities.getAlgorithmIdentifier(nextWorkingKey22);
                        algorithmIdentifier2.getAlgorithm();
                        algorithmIdentifier2.getParameters();
                        size--;
                        x509Certificate222 = x509Certificate3;
                    } catch (CertificateNotYetValidException unused6) {
                        errorBundleCreateErrorBundle2 = createErrorBundle("CertPathReviewer.certificateNotYetValid", new Object[]{new TrustedInput(x509Certificate3.getNotBefore())});
                        addError(errorBundleCreateErrorBundle2, size);
                        if (this.pkixParams.isRevocationEnabled()) {
                        }
                        if (subjectX500Principal22 != null) {
                        }
                        if (i10 != this.f20280n) {
                        }
                        subjectX500Principal22 = x509Certificate3.getSubjectX500Principal();
                        nextWorkingKey22 = CertPathValidatorUtilities.getNextWorkingKey(this.certs, size);
                        AlgorithmIdentifier algorithmIdentifier22 = CertPathValidatorUtilities.getAlgorithmIdentifier(nextWorkingKey22);
                        algorithmIdentifier22.getAlgorithm();
                        algorithmIdentifier22.getParameters();
                        size--;
                        x509Certificate222 = x509Certificate3;
                    }
                    if (this.pkixParams.isRevocationEnabled()) {
                        try {
                            extensionValue2 = CertPathValidatorUtilities.getExtensionValue(x509Certificate3, CRL_DIST_POINTS);
                        } catch (AnnotatedException unused7) {
                            addError(createErrorBundle("CertPathReviewer.crlDistPtExtError"), size);
                        }
                        CRLDistPoint cRLDistPoint = extensionValue2 != null ? CRLDistPoint.getInstance(extensionValue2) : null;
                        try {
                            extensionValue = CertPathValidatorUtilities.getExtensionValue(x509Certificate3, AUTH_INFO_ACCESS);
                        } catch (AnnotatedException unused8) {
                            addError(createErrorBundle("CertPathReviewer.crlAuthInfoAccError"), size);
                        }
                        AuthorityInformationAccess authorityInformationAccess = extensionValue != null ? AuthorityInformationAccess.getInstance(extensionValue) : null;
                        Vector cRLDistUrls = getCRLDistUrls(cRLDistPoint);
                        Vector oCSPUrls = getOCSPUrls(authorityInformationAccess);
                        Iterator it = cRLDistUrls.iterator();
                        while (it.hasNext()) {
                            addNotification(createErrorBundle("CertPathReviewer.crlDistPoint", new Object[]{new UntrustedUrlInput(it.next())}), size);
                        }
                        Iterator it2 = oCSPUrls.iterator();
                        while (it2.hasNext()) {
                            addNotification(createErrorBundle("CertPathReviewer.ocspLocation", new Object[]{new UntrustedUrlInput(it2.next())}), size);
                        }
                        try {
                            checkRevocation(this.pkixParams, x509Certificate3, this.validDate, x509Certificate222, nextWorkingKey22, cRLDistUrls, oCSPUrls, size);
                        } catch (CertPathReviewerException e14) {
                            addError(e14.getErrorMessage(), size);
                        }
                    }
                    if (subjectX500Principal22 != null && !x509Certificate3.getIssuerX500Principal().equals(subjectX500Principal22)) {
                        addError(createErrorBundle("CertPathReviewer.certWrongIssuer", new Object[]{subjectX500Principal22.getName(), x509Certificate3.getIssuerX500Principal().getName()}), size);
                    }
                    if (i10 != this.f20280n) {
                        String str = "CertPathReviewer.noCACert";
                        if (x509Certificate3 != null && x509Certificate3.getVersion() == 1) {
                            addError(createErrorBundle("CertPathReviewer.noCACert"), size);
                        }
                        try {
                            basicConstraints = BasicConstraints.getInstance(CertPathValidatorUtilities.getExtensionValue(x509Certificate3, CertPathValidatorUtilities.BASIC_CONSTRAINTS));
                        } catch (AnnotatedException unused9) {
                            addError(createErrorBundle("CertPathReviewer.errorProcesingBC"), size);
                        }
                        if (basicConstraints != null) {
                            if (!basicConstraints.isCA()) {
                            }
                            keyUsage = x509Certificate3.getKeyUsage();
                            if (keyUsage != null && (keyUsage.length <= 5 || !keyUsage[5])) {
                                addError(createErrorBundle("CertPathReviewer.noCertSign"), size);
                            }
                        } else {
                            str = "CertPathReviewer.noBasicConstraints";
                        }
                        addError(createErrorBundle(str), size);
                        keyUsage = x509Certificate3.getKeyUsage();
                        if (keyUsage != null) {
                            addError(createErrorBundle("CertPathReviewer.noCertSign"), size);
                        }
                    }
                    subjectX500Principal22 = x509Certificate3.getSubjectX500Principal();
                    nextWorkingKey22 = CertPathValidatorUtilities.getNextWorkingKey(this.certs, size);
                    AlgorithmIdentifier algorithmIdentifier222 = CertPathValidatorUtilities.getAlgorithmIdentifier(nextWorkingKey22);
                    algorithmIdentifier222.getAlgorithm();
                    algorithmIdentifier222.getParameters();
                    size--;
                    x509Certificate222 = x509Certificate3;
                }
                this.trustAnchor = trustAnchor2;
                this.subjectPublicKey = nextWorkingKey22;
            }
            errorBundleCreateErrorBundle3 = createErrorBundle("CertPathReviewer.noTrustAnchorFound", new Object[]{new UntrustedInput(x509Certificate.getIssuerX500Principal()), Integers.valueOf(this.pkixParams.getTrustAnchors().size())});
        }
        addError(errorBundleCreateErrorBundle3);
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

    private static ErrorBundle createErrorBundle(String str) {
        ErrorBundle errorBundle = new ErrorBundle(RESOURCE_NAME, str);
        errorBundle.setClassLoader(PKIXCertPathReviewer.class.getClassLoader());
        return errorBundle;
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
            throw new CertPathReviewerException(createErrorBundle("CertPathReviewer.loadCrlDistPointError", new Object[]{new UntrustedInput(str), e10.getMessage(), e10, e10.getClass().getName()}));
        }
    }

    private boolean processQcStatements(X509Certificate x509Certificate, int i10) {
        ErrorBundle errorBundleCreateErrorBundle;
        String str;
        try {
            ASN1Sequence aSN1Sequence = (ASN1Sequence) CertPathValidatorUtilities.getExtensionValue(x509Certificate, QC_STATEMENT);
            boolean z10 = false;
            for (int i11 = 0; i11 < aSN1Sequence.size(); i11++) {
                QCStatement qCStatement = QCStatement.getInstance(aSN1Sequence.getObjectAt(i11));
                if (ETSIQCObjectIdentifiers.id_etsi_qcs_QcCompliance.equals((ASN1Primitive) qCStatement.getStatementId())) {
                    str = "CertPathReviewer.QcEuCompliance";
                } else {
                    if (!RFC3739QCObjectIdentifiers.id_qcs_pkixQCSyntax_v1.equals((ASN1Primitive) qCStatement.getStatementId())) {
                        if (ETSIQCObjectIdentifiers.id_etsi_qcs_QcSSCD.equals((ASN1Primitive) qCStatement.getStatementId())) {
                            str = "CertPathReviewer.QcSSCD";
                        } else if (ETSIQCObjectIdentifiers.id_etsi_qcs_LimiteValue.equals((ASN1Primitive) qCStatement.getStatementId())) {
                            MonetaryValue monetaryValue = MonetaryValue.getInstance(qCStatement.getStatementInfo());
                            monetaryValue.getCurrency();
                            double dDoubleValue = monetaryValue.getAmount().doubleValue() * Math.pow(10.0d, monetaryValue.getExponent().doubleValue());
                            errorBundleCreateErrorBundle = monetaryValue.getCurrency().isAlphabetic() ? createErrorBundle("CertPathReviewer.QcLimitValueAlpha", new Object[]{monetaryValue.getCurrency().getAlphabetic(), new TrustedInput(new Double(dDoubleValue)), monetaryValue}) : createErrorBundle("CertPathReviewer.QcLimitValueNum", new Object[]{Integers.valueOf(monetaryValue.getCurrency().getNumeric()), new TrustedInput(new Double(dDoubleValue)), monetaryValue});
                            addNotification(errorBundleCreateErrorBundle, i10);
                        } else {
                            addNotification(createErrorBundle("CertPathReviewer.QcUnknownStatement", new Object[]{qCStatement.getStatementId(), new UntrustedInput(qCStatement)}), i10);
                            z10 = true;
                        }
                    }
                }
                errorBundleCreateErrorBundle = createErrorBundle(str);
                addNotification(errorBundleCreateErrorBundle, i10);
            }
            return !z10;
        } catch (AnnotatedException unused) {
            addError(createErrorBundle("CertPathReviewer.QcStatementExtError"), i10);
            return false;
        }
    }

    public void addError(ErrorBundle errorBundle) {
        this.errors[0].add(errorBundle);
    }

    public void addNotification(ErrorBundle errorBundle) {
        this.notifications[0].add(errorBundle);
    }

    /* JADX WARN: Removed duplicated region for block: B:86:0x0205  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void checkCRLs(PKIXParameters pKIXParameters, X509Certificate x509Certificate, Date date, X509Certificate x509Certificate2, PublicKey publicKey, Vector vector, int i10) throws Exception {
        Iterator it;
        X509CRL x509crl;
        boolean z10;
        String str;
        String str2;
        boolean z11;
        ErrorBundle errorBundleCreateErrorBundle;
        boolean[] keyUsage;
        ErrorBundle errorBundleCreateErrorBundle2;
        String str3 = "CertPathReviewer.crlIssuerException";
        String str4 = "CertPathReviewer.distrPtExtError";
        X509CRLStoreSelector x509CRLStoreSelector = new X509CRLStoreSelector();
        try {
            x509CRLStoreSelector.addIssuerName(CertPathValidatorUtilities.getEncodedIssuerPrincipal(x509Certificate).getEncoded());
            x509CRLStoreSelector.setCertificateChecking(x509Certificate);
            try {
                Set setFindCRLs = PKIXCRLUtil.findCRLs(x509CRLStoreSelector, pKIXParameters);
                it = setFindCRLs.iterator();
                if (setFindCRLs.isEmpty()) {
                    Iterator it2 = PKIXCRLUtil.findCRLs(new X509CRLStoreSelector(), pKIXParameters).iterator();
                    ArrayList arrayList = new ArrayList();
                    while (it2.hasNext()) {
                        arrayList.add(((X509CRL) it2.next()).getIssuerX500Principal());
                    }
                    addNotification(createErrorBundle("CertPathReviewer.noCrlInCertstore", new Object[]{new UntrustedInput(x509CRLStoreSelector.getIssuerNames()), new UntrustedInput(arrayList), Integers.valueOf(arrayList.size())}), i10);
                }
            } catch (AnnotatedException e10) {
                addError(createErrorBundle("CertPathReviewer.crlExtractionError", new Object[]{e10.getCause().getMessage(), e10.getCause(), e10.getCause().getClass().getName()}), i10);
                it = new ArrayList().iterator();
            }
            X509CRL x509crl2 = null;
            while (it.hasNext()) {
                x509crl2 = (X509CRL) it.next();
                Date thisUpdate = x509crl2.getThisUpdate();
                Date nextUpdate = x509crl2.getNextUpdate();
                Object[] objArr = {new TrustedInput(thisUpdate), new TrustedInput(nextUpdate)};
                if (nextUpdate == null || date.before(nextUpdate)) {
                    addNotification(createErrorBundle("CertPathReviewer.localValidCRL", objArr), i10);
                    x509crl = x509crl2;
                    z10 = true;
                    break;
                }
                addNotification(createErrorBundle("CertPathReviewer.localInvalidCRL", objArr), i10);
            }
            x509crl = x509crl2;
            z10 = false;
            if (!z10) {
                X500Principal issuerX500Principal = x509Certificate.getIssuerX500Principal();
                Iterator it3 = vector.iterator();
                boolean z12 = z10;
                while (true) {
                    if (!it3.hasNext()) {
                        str = str3;
                        str2 = str4;
                        z11 = z12;
                        break;
                    }
                    try {
                        String str5 = (String) it3.next();
                        X509CRL crl = getCRL(str5);
                        if (crl != null) {
                            X500Principal issuerX500Principal2 = crl.getIssuerX500Principal();
                            if (issuerX500Principal.equals(issuerX500Principal2)) {
                                str = str3;
                                str2 = str4;
                                Date thisUpdate2 = crl.getThisUpdate();
                                Date nextUpdate2 = crl.getNextUpdate();
                                Object[] objArr2 = {new TrustedInput(thisUpdate2), new TrustedInput(nextUpdate2), new UntrustedUrlInput(str5)};
                                if (nextUpdate2 != null && !date.before(nextUpdate2)) {
                                    errorBundleCreateErrorBundle2 = createErrorBundle("CertPathReviewer.onlineInvalidCRL", objArr2);
                                }
                                try {
                                    addNotification(createErrorBundle("CertPathReviewer.onlineValidCRL", objArr2), i10);
                                    x509crl = crl;
                                    z11 = true;
                                    break;
                                } catch (CertPathReviewerException e11) {
                                    e = e11;
                                    z12 = true;
                                    addNotification(e.getErrorMessage(), i10);
                                    str3 = str;
                                    str4 = str2;
                                }
                            } else {
                                str = str3;
                                try {
                                    str2 = str4;
                                    try {
                                        errorBundleCreateErrorBundle2 = createErrorBundle("CertPathReviewer.onlineCRLWrongCA", new Object[]{new UntrustedInput(issuerX500Principal2.getName()), new UntrustedInput(issuerX500Principal.getName()), new UntrustedUrlInput(str5)});
                                    } catch (CertPathReviewerException e12) {
                                        e = e12;
                                        addNotification(e.getErrorMessage(), i10);
                                        str3 = str;
                                        str4 = str2;
                                    }
                                } catch (CertPathReviewerException e13) {
                                    e = e13;
                                    str2 = str4;
                                    addNotification(e.getErrorMessage(), i10);
                                    str3 = str;
                                    str4 = str2;
                                }
                            }
                            addNotification(errorBundleCreateErrorBundle2, i10);
                        } else {
                            str = str3;
                            str2 = str4;
                        }
                    } catch (CertPathReviewerException e14) {
                        e = e14;
                        str = str3;
                    }
                    str3 = str;
                    str4 = str2;
                }
            } else {
                str = "CertPathReviewer.crlIssuerException";
                str2 = "CertPathReviewer.distrPtExtError";
                z11 = z10;
            }
            if (x509crl != null) {
                if (x509Certificate2 != null && (keyUsage = x509Certificate2.getKeyUsage()) != null && (keyUsage.length <= 6 || !keyUsage[6])) {
                    throw new CertPathReviewerException(createErrorBundle("CertPathReviewer.noCrlSigningPermited"));
                }
                if (publicKey == null) {
                    throw new CertPathReviewerException(createErrorBundle("CertPathReviewer.crlNoIssuerPublicKey"));
                }
                try {
                    x509crl.verify(publicKey, BouncyCastleProvider.PROVIDER_NAME);
                    X509CRLEntry revokedCertificate = x509crl.getRevokedCertificate(x509Certificate.getSerialNumber());
                    if (revokedCertificate == null) {
                        errorBundleCreateErrorBundle = createErrorBundle("CertPathReviewer.notRevoked");
                    } else if (revokedCertificate.hasExtensions()) {
                        try {
                            ASN1Enumerated aSN1Enumerated = ASN1Enumerated.getInstance(CertPathValidatorUtilities.getExtensionValue(revokedCertificate, Extension.reasonCode.getId()));
                            String str6 = aSN1Enumerated != null ? CertPathValidatorUtilities.crlReasons[aSN1Enumerated.intValueExact()] : null;
                            if (str6 == null) {
                                str6 = CertPathValidatorUtilities.crlReasons[7];
                            }
                            LocaleString localeString = new LocaleString(RESOURCE_NAME, str6);
                            if (!date.before(revokedCertificate.getRevocationDate())) {
                                throw new CertPathReviewerException(createErrorBundle("CertPathReviewer.certRevoked", new Object[]{new TrustedInput(revokedCertificate.getRevocationDate()), localeString}));
                            }
                            errorBundleCreateErrorBundle = createErrorBundle("CertPathReviewer.revokedAfterValidation", new Object[]{new TrustedInput(revokedCertificate.getRevocationDate()), localeString});
                        } catch (AnnotatedException e15) {
                            throw new CertPathReviewerException(createErrorBundle("CertPathReviewer.crlReasonExtError"), e15);
                        }
                    }
                    addNotification(errorBundleCreateErrorBundle, i10);
                    Date nextUpdate3 = x509crl.getNextUpdate();
                    if (nextUpdate3 != null && !date.before(nextUpdate3)) {
                        addNotification(createErrorBundle("CertPathReviewer.crlUpdateAvailable", new Object[]{new TrustedInput(nextUpdate3)}), i10);
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
                                            Iterator it4 = PKIXCRLUtil.findCRLs(x509CRLStoreSelector2, pKIXParameters).iterator();
                                            while (it4.hasNext()) {
                                                try {
                                                    if (Objects.areEqual(extensionValue, CertPathValidatorUtilities.getExtensionValue((X509CRL) it4.next(), CertPathValidatorUtilities.ISSUING_DISTRIBUTION_POINT))) {
                                                    }
                                                } catch (AnnotatedException e16) {
                                                    throw new CertPathReviewerException(createErrorBundle(str2), e16);
                                                }
                                            }
                                            throw new CertPathReviewerException(createErrorBundle("CertPathReviewer.noBaseCRL"));
                                        } catch (AnnotatedException e17) {
                                            throw new CertPathReviewerException(createErrorBundle("CertPathReviewer.crlExtractionError"), e17);
                                        }
                                    } catch (AnnotatedException e18) {
                                        throw new CertPathReviewerException(createErrorBundle("CertPathReviewer.crlNbrExtError"), e18);
                                    }
                                } catch (IOException e19) {
                                    throw new CertPathReviewerException(createErrorBundle(str), e19);
                                }
                            }
                            if (extensionValue != null) {
                                IssuingDistributionPoint issuingDistributionPoint = IssuingDistributionPoint.getInstance(extensionValue);
                                try {
                                    BasicConstraints basicConstraints = BasicConstraints.getInstance(CertPathValidatorUtilities.getExtensionValue(x509Certificate, CertPathValidatorUtilities.BASIC_CONSTRAINTS));
                                    if (issuingDistributionPoint.onlyContainsUserCerts() && basicConstraints != null && basicConstraints.isCA()) {
                                        throw new CertPathReviewerException(createErrorBundle("CertPathReviewer.crlOnlyUserCert"));
                                    }
                                    if (issuingDistributionPoint.onlyContainsCACerts() && (basicConstraints == null || !basicConstraints.isCA())) {
                                        throw new CertPathReviewerException(createErrorBundle("CertPathReviewer.crlOnlyCaCert"));
                                    }
                                    if (issuingDistributionPoint.onlyContainsAttributeCerts()) {
                                        throw new CertPathReviewerException(createErrorBundle("CertPathReviewer.crlOnlyAttrCert"));
                                    }
                                } catch (AnnotatedException e20) {
                                    throw new CertPathReviewerException(createErrorBundle("CertPathReviewer.crlBCExtError"), e20);
                                }
                            }
                        } catch (AnnotatedException unused) {
                            throw new CertPathReviewerException(createErrorBundle("CertPathReviewer.deltaCrlExtError"));
                        }
                    } catch (AnnotatedException unused2) {
                        throw new CertPathReviewerException(createErrorBundle(str2));
                    }
                } catch (Exception e21) {
                    throw new CertPathReviewerException(createErrorBundle("CertPathReviewer.crlVerifyFailed"), e21);
                }
            }
            if (!z11) {
                throw new CertPathReviewerException(createErrorBundle("CertPathReviewer.noValidCrlFound"));
            }
        } catch (IOException e22) {
            throw new CertPathReviewerException(createErrorBundle("CertPathReviewer.crlIssuerException"), e22);
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
        int i10 = this.f20280n;
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
        return this.f20280n;
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
            throw new CertPathReviewerException(createErrorBundle("CertPathReviewer.trustAnchorIssuerError"));
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
        this.f20280n = this.certs.size();
        if (this.certs.isEmpty()) {
            throw new CertPathReviewerException(createErrorBundle("CertPathReviewer.emptyCertPath"));
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

    private static ErrorBundle createErrorBundle(String str, Object[] objArr) {
        ErrorBundle errorBundle = new ErrorBundle(RESOURCE_NAME, str, objArr);
        errorBundle.setClassLoader(PKIXCertPathReviewer.class.getClassLoader());
        return errorBundle;
    }

    public void addError(ErrorBundle errorBundle, int i10) {
        if (i10 < -1 || i10 >= this.f20280n) {
            throw new IndexOutOfBoundsException();
        }
        this.errors[i10 + 1].add(errorBundle);
    }

    public void addNotification(ErrorBundle errorBundle, int i10) {
        if (i10 < -1 || i10 >= this.f20280n) {
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
