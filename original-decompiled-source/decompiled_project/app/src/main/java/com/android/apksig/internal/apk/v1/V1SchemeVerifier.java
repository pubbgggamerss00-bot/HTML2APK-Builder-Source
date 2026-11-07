package com.android.apksig.internal.apk.v1;

import android.util.Base64;
import com.android.apksig.ApkVerifier;
import com.android.apksig.apk.ApkFormatException;
import com.android.apksig.apk.ApkUtils;
import com.android.apksig.internal.apk.ApkSigningBlockUtils;
import com.android.apksig.internal.asn1.Asn1BerParser;
import com.android.apksig.internal.asn1.Asn1Class;
import com.android.apksig.internal.asn1.Asn1DecodingException;
import com.android.apksig.internal.asn1.Asn1Field;
import com.android.apksig.internal.asn1.Asn1OpaqueObject;
import com.android.apksig.internal.asn1.Asn1Type;
import com.android.apksig.internal.jar.ManifestParser;
import com.android.apksig.internal.oid.OidConstants;
import com.android.apksig.internal.pkcs7.AlgorithmIdentifier;
import com.android.apksig.internal.pkcs7.Attribute;
import com.android.apksig.internal.pkcs7.ContentInfo;
import com.android.apksig.internal.pkcs7.Pkcs7Constants;
import com.android.apksig.internal.pkcs7.Pkcs7DecodingException;
import com.android.apksig.internal.pkcs7.SignedData;
import com.android.apksig.internal.pkcs7.SignerInfo;
import com.android.apksig.internal.util.ByteBufferUtils;
import com.android.apksig.internal.util.InclusiveIntRange;
import com.android.apksig.internal.util.Pair;
import com.android.apksig.internal.x509.Certificate;
import com.android.apksig.internal.zip.CentralDirectoryRecord;
import com.android.apksig.internal.zip.LocalFileRecord;
import com.android.apksig.internal.zip.ZipUtils;
import com.android.apksig.util.DataSinks;
import com.android.apksig.util.DataSource;
import com.android.apksig.zip.ZipFormatException;
import i8.n;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.security.InvalidKeyException;
import java.security.KeyFactory;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.Principal;
import java.security.PublicKey;
import java.security.Signature;
import java.security.SignatureException;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.X509EncodedKeySpec;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.StringTokenizer;
import java.util.jar.Attributes;
import m3.a;
import org.bouncycastle.pqc.jcajce.spec.McElieceCCA2KeyGenParameterSpec;
import r1.f;

/* loaded from: classes.dex */
public abstract class V1SchemeVerifier {
    private static final String[] JB_MR2_AND_NEWER_DIGEST_ALGS = {"SHA-512", McElieceCCA2KeyGenParameterSpec.SHA384, "SHA-256", McElieceCCA2KeyGenParameterSpec.SHA1};
    private static final Map<String, Integer> MIN_SDK_VESION_FROM_WHICH_DIGEST_SUPPORTED_IN_MANIFEST;
    private static final Map<String, String> UPPER_CASE_JCA_DIGEST_ALG_TO_CANONICAL;

    public static class NamedDigest {
        public final byte[] digest;
        public final String jcaDigestAlgorithm;

        private NamedDigest(String str, byte[] bArr) {
            this.jcaDigestAlgorithm = str;
            this.digest = bArr;
        }
    }

    @Asn1Class(type = Asn1Type.CHOICE)
    public static class ObjectIdentifierChoice {

        @Asn1Field(type = Asn1Type.OBJECT_IDENTIFIER)
        public String value;
    }

    @Asn1Class(type = Asn1Type.CHOICE)
    public static class OctetStringChoice {

        @Asn1Field(type = Asn1Type.OCTET_STRING)
        public byte[] value;
    }

    public static class Result {
        public boolean verified;
        public final List<SignerInfo> signers = new ArrayList();
        public final List<SignerInfo> ignoredSigners = new ArrayList();
        private final List<ApkVerifier.IssueWithParams> mWarnings = new ArrayList();
        private final List<ApkVerifier.IssueWithParams> mErrors = new ArrayList();

        public static class SignerInfo {
            public final List<X509Certificate> certChain;
            private final List<ApkVerifier.IssueWithParams> mErrors;
            private final List<ApkVerifier.IssueWithParams> mWarnings;
            public final String name;
            public final String signatureBlockFileName;
            public final String signatureFileName;

            /* JADX INFO: Access modifiers changed from: private */
            public void addError(ApkVerifier.Issue issue, Object... objArr) {
                this.mErrors.add(new ApkVerifier.IssueWithParams(issue, objArr));
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void addWarning(ApkVerifier.Issue issue, Object... objArr) {
                this.mWarnings.add(new ApkVerifier.IssueWithParams(issue, objArr));
            }

            /* JADX INFO: Access modifiers changed from: private */
            public boolean containsErrors() {
                return !this.mErrors.isEmpty();
            }

            public List<ApkVerifier.IssueWithParams> getErrors() {
                return this.mErrors;
            }

            public List<ApkVerifier.IssueWithParams> getWarnings() {
                return this.mWarnings;
            }

            private SignerInfo(String str, String str2, String str3) {
                this.certChain = new ArrayList();
                this.mWarnings = new ArrayList();
                this.mErrors = new ArrayList();
                this.name = str;
                this.signatureBlockFileName = str2;
                this.signatureFileName = str3;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addError(ApkVerifier.Issue issue, Object... objArr) {
            this.mErrors.add(new ApkVerifier.IssueWithParams(issue, objArr));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addWarning(ApkVerifier.Issue issue, Object... objArr) {
            this.mWarnings.add(new ApkVerifier.IssueWithParams(issue, objArr));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public boolean containsErrors() {
            if (!this.mErrors.isEmpty()) {
                return true;
            }
            Iterator<SignerInfo> it = this.signers.iterator();
            while (it.hasNext()) {
                if (it.next().containsErrors()) {
                    return true;
                }
            }
            return false;
        }

        public List<ApkVerifier.IssueWithParams> getErrors() {
            return this.mErrors;
        }

        public List<ApkVerifier.IssueWithParams> getWarnings() {
            return this.mWarnings;
        }
    }

    public static class SignedAttributes {
        private Map<String, List<Asn1OpaqueObject>> mAttrs;

        public SignedAttributes(Collection<Attribute> collection) throws Pkcs7DecodingException {
            HashMap map = new HashMap(collection.size());
            for (Attribute attribute : collection) {
                if (map.put(attribute.attrType, attribute.attrValues) != null) {
                    throw new Pkcs7DecodingException("Duplicate signed attribute: " + attribute.attrType);
                }
            }
            this.mAttrs = map;
        }

        private Asn1OpaqueObject getSingleValue(String str) throws Pkcs7DecodingException {
            List<Asn1OpaqueObject> list = this.mAttrs.get(str);
            if (list == null || list.isEmpty()) {
                return null;
            }
            if (list.size() <= 1) {
                return list.get(0);
            }
            throw new Pkcs7DecodingException(n.d("Attribute ", str, " has multiple values"));
        }

        public String getSingleObjectIdentifierValue(String str) throws Pkcs7DecodingException {
            Asn1OpaqueObject singleValue = getSingleValue(str);
            if (singleValue == null) {
                return null;
            }
            try {
                return ((ObjectIdentifierChoice) Asn1BerParser.parse(singleValue.getEncoded(), ObjectIdentifierChoice.class)).value;
            } catch (Asn1DecodingException e10) {
                throw new Pkcs7DecodingException("Failed to decode OBJECT IDENTIFIER", e10);
            }
        }

        public byte[] getSingleOctetStringValue(String str) throws Pkcs7DecodingException {
            Asn1OpaqueObject singleValue = getSingleValue(str);
            if (singleValue == null) {
                return null;
            }
            try {
                return ((OctetStringChoice) Asn1BerParser.parse(singleValue.getEncoded(), OctetStringChoice.class)).value;
            } catch (Asn1DecodingException e10) {
                throw new Pkcs7DecodingException("Failed to decode OBJECT IDENTIFIER", e10);
            }
        }
    }

    public static class Signer {
        private boolean mIgnored;
        private final String mName;
        private final Result.SignerInfo mResult;
        private byte[] mSigFileBytes;
        private Set<String> mSigFileEntryNames;
        private final CentralDirectoryRecord mSignatureBlockEntry;
        private final CentralDirectoryRecord mSignatureFileEntry;

        private void checkForStrippedApkSignatures(ManifestParser.Section section, Map<Integer, String> map, Set<Integer> set) throws NumberFormatException {
            String attributeValue = section.getAttributeValue(V1SchemeConstants.SF_ATTRIBUTE_NAME_ANDROID_APK_SIGNED_NAME_STR);
            if (attributeValue == null) {
                if (set.isEmpty()) {
                    return;
                }
                this.mResult.addWarning(ApkVerifier.Issue.JAR_SIG_NO_APK_SIG_STRIP_PROTECTION, this.mSignatureFileEntry.getName());
                return;
            }
            if (map.isEmpty()) {
                return;
            }
            Set<Integer> setKeySet = map.keySet();
            HashSet hashSet = new HashSet(1);
            StringTokenizer stringTokenizer = new StringTokenizer(attributeValue, ",");
            while (stringTokenizer.hasMoreTokens()) {
                String strTrim = stringTokenizer.nextToken().trim();
                if (!strTrim.isEmpty()) {
                    try {
                        int i10 = Integer.parseInt(strTrim);
                        if (setKeySet.contains(Integer.valueOf(i10))) {
                            hashSet.add(Integer.valueOf(i10));
                        } else {
                            this.mResult.addWarning(ApkVerifier.Issue.JAR_SIG_UNKNOWN_APK_SIG_SCHEME_ID, this.mSignatureFileEntry.getName(), Integer.valueOf(i10));
                        }
                    } catch (Exception unused) {
                    }
                }
            }
            Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                Integer num = (Integer) it.next();
                num.intValue();
                if (!set.contains(num)) {
                    this.mResult.addError(ApkVerifier.Issue.JAR_SIG_MISSING_APK_SIG_REFERENCED, this.mSignatureFileEntry.getName(), num, map.get(num));
                }
            }
        }

        public static List<X509Certificate> getCertificateChain(List<X509Certificate> list, X509Certificate x509Certificate) {
            ArrayList arrayList = new ArrayList(list);
            ArrayList arrayList2 = new ArrayList(1);
            arrayList2.add(x509Certificate);
            arrayList.remove(x509Certificate);
            while (!x509Certificate.getSubjectDN().equals(x509Certificate.getIssuerDN())) {
                Principal issuerDN = x509Certificate.getIssuerDN();
                boolean z10 = false;
                int i10 = 0;
                while (true) {
                    if (i10 >= arrayList.size()) {
                        break;
                    }
                    X509Certificate x509Certificate2 = (X509Certificate) arrayList.get(i10);
                    if (issuerDN.equals(x509Certificate2.getSubjectDN())) {
                        arrayList.remove(i10);
                        arrayList2.add(x509Certificate2);
                        z10 = true;
                        x509Certificate = x509Certificate2;
                        break;
                    }
                    i10++;
                }
                if (!z10) {
                    break;
                }
            }
            return arrayList2;
        }

        private boolean verifyManifestDigest(ManifestParser.Section section, boolean z10, byte[] bArr, int i10, int i11) throws NoSuchAlgorithmException {
            Collection<NamedDigest> digestsToVerify = V1SchemeVerifier.getDigestsToVerify(section, z10 ? "-Digest" : "-Digest-Manifest", i10, i11);
            if (digestsToVerify.isEmpty()) {
                this.mResult.addWarning(ApkVerifier.Issue.JAR_SIG_NO_MANIFEST_DIGEST_IN_SIG_FILE, this.mSignatureFileEntry.getName());
                return false;
            }
            boolean z11 = true;
            for (NamedDigest namedDigest : digestsToVerify) {
                String str = namedDigest.jcaDigestAlgorithm;
                byte[] bArrDigest = V1SchemeVerifier.digest(str, bArr);
                byte[] bArr2 = namedDigest.digest;
                if (!Arrays.equals(bArr2, bArrDigest)) {
                    this.mResult.addWarning(ApkVerifier.Issue.JAR_SIG_ZIP_ENTRY_DIGEST_DID_NOT_VERIFY, "META-INF/MANIFEST.MF", str, this.mSignatureFileEntry.getName(), Base64.encodeToString(bArrDigest, 2), Base64.encodeToString(bArr2, 2));
                    z11 = false;
                }
            }
            return z11;
        }

        private void verifyManifestIndividualSectionDigest(ManifestParser.Section section, boolean z10, ManifestParser.Section section2, byte[] bArr, int i10, int i11) throws NoSuchAlgorithmException {
            String name = section.getName();
            Collection<NamedDigest> digestsToVerify = V1SchemeVerifier.getDigestsToVerify(section, "-Digest", i10, i11);
            if (digestsToVerify.isEmpty()) {
                this.mResult.addError(ApkVerifier.Issue.JAR_SIG_NO_ZIP_ENTRY_DIGEST_IN_SIG_FILE, name, this.mSignatureFileEntry.getName());
                return;
            }
            int startOffset = section2.getStartOffset();
            int sizeBytes = section2.getSizeBytes();
            if (z10) {
                int i12 = startOffset + sizeBytes;
                if (bArr[i12 - 1] == 10 && bArr[i12 - 2] == 10) {
                    sizeBytes--;
                }
            }
            for (NamedDigest namedDigest : digestsToVerify) {
                String str = namedDigest.jcaDigestAlgorithm;
                byte[] bArrDigest = V1SchemeVerifier.digest(str, bArr, startOffset, sizeBytes);
                byte[] bArr2 = namedDigest.digest;
                if (!Arrays.equals(bArr2, bArrDigest)) {
                    this.mResult.addError(ApkVerifier.Issue.JAR_SIG_MANIFEST_SECTION_DIGEST_DID_NOT_VERIFY, name, str, this.mSignatureFileEntry.getName(), Base64.encodeToString(bArrDigest, 2), Base64.encodeToString(bArr2, 2));
                }
            }
        }

        private void verifyManifestMainSectionDigest(ManifestParser.Section section, ManifestParser.Section section2, byte[] bArr, int i10, int i11) throws NoSuchAlgorithmException {
            Collection<NamedDigest> digestsToVerify = V1SchemeVerifier.getDigestsToVerify(section, "-Digest-Manifest-Main-Attributes", i10, i11);
            if (digestsToVerify.isEmpty()) {
                return;
            }
            for (NamedDigest namedDigest : digestsToVerify) {
                String str = namedDigest.jcaDigestAlgorithm;
                byte[] bArrDigest = V1SchemeVerifier.digest(str, bArr, section2.getStartOffset(), section2.getSizeBytes());
                byte[] bArr2 = namedDigest.digest;
                if (!Arrays.equals(bArr2, bArrDigest)) {
                    this.mResult.addError(ApkVerifier.Issue.JAR_SIG_MANIFEST_MAIN_SECTION_DIGEST_DID_NOT_VERIFY, str, this.mSignatureFileEntry.getName(), Base64.encodeToString(bArrDigest, 2), Base64.encodeToString(bArr2, 2));
                }
            }
        }

        private X509Certificate verifySignerInfoAgainstSigFile(SignedData signedData, Collection<X509Certificate> collection, SignerInfo signerInfo, byte[] bArr, int i10, int i11) throws InvalidKeySpecException, SignatureException, NoSuchAlgorithmException, InvalidKeyException, Pkcs7DecodingException {
            String str = signerInfo.digestAlgorithm.algorithm;
            String str2 = signerInfo.signatureAlgorithm.algorithm;
            List<InclusiveIntRange> valuesNotIn = InclusiveIntRange.fromTo(i10, i11).getValuesNotIn(OidConstants.getSigAlgSupportedApiLevels(str, str2));
            if (!valuesNotIn.isEmpty()) {
                String userFriendlyNameForOid = OidConstants.OidToUserFriendlyNameMapper.getUserFriendlyNameForOid(str);
                String str3 = userFriendlyNameForOid == null ? str : userFriendlyNameForOid;
                String userFriendlyNameForOid2 = OidConstants.OidToUserFriendlyNameMapper.getUserFriendlyNameForOid(str2);
                String str4 = userFriendlyNameForOid2 == null ? str2 : userFriendlyNameForOid2;
                StringBuilder sb = new StringBuilder();
                for (InclusiveIntRange inclusiveIntRange : valuesNotIn) {
                    if (sb.length() > 0) {
                        sb.append(", ");
                    }
                    if (inclusiveIntRange.getMin() == inclusiveIntRange.getMax()) {
                        sb.append(String.valueOf(inclusiveIntRange.getMin()));
                    } else if (inclusiveIntRange.getMax() == Integer.MAX_VALUE) {
                        sb.append(inclusiveIntRange.getMin() + "+");
                    } else {
                        sb.append(inclusiveIntRange.getMin() + "-" + inclusiveIntRange.getMax());
                    }
                }
                this.mResult.addError(ApkVerifier.Issue.JAR_SIG_UNSUPPORTED_SIG_ALG, this.mSignatureBlockEntry.getName(), str, str2, sb.toString(), str3, str4);
                return null;
            }
            X509Certificate x509CertificateFindCertificate = Certificate.findCertificate(collection, signerInfo.sid);
            if (x509CertificateFindCertificate == null) {
                throw new SignatureException("Signing certificate referenced in SignerInfo not found in SignedData");
            }
            if (x509CertificateFindCertificate.hasUnsupportedCriticalExtension()) {
                throw new SignatureException("Signing certificate has unsupported critical extensions");
            }
            boolean[] keyUsage = x509CertificateFindCertificate.getKeyUsage();
            if (keyUsage != null) {
                boolean z10 = false;
                boolean z11 = keyUsage.length >= 1 && keyUsage[0];
                if (keyUsage.length >= 2 && keyUsage[1]) {
                    z10 = true;
                }
                if (!z11 && !z10) {
                    throw new SignatureException("Signing certificate not authorized for use in digital signatures: keyUsage extension missing digitalSignature and nonRepudiation");
                }
            }
            String jcaSignatureAlgorithm = AlgorithmIdentifier.getJcaSignatureAlgorithm(str, str2);
            Signature signature = Signature.getInstance(jcaSignatureAlgorithm);
            PublicKey publicKey = x509CertificateFindCertificate.getPublicKey();
            try {
                signature.initVerify(publicKey);
            } catch (InvalidKeyException e10) {
                try {
                    PublicKey publicKeyGeneratePublic = KeyFactory.getInstance(publicKey.getAlgorithm()).generatePublic(new X509EncodedKeySpec(ApkSigningBlockUtils.encodePublicKey(publicKey)));
                    Signature signature2 = Signature.getInstance(jcaSignatureAlgorithm);
                    signature2.initVerify(publicKeyGeneratePublic);
                    signature = signature2;
                } catch (InvalidKeySpecException unused) {
                    throw e10;
                }
            }
            Asn1OpaqueObject asn1OpaqueObject = signerInfo.signedAttrs;
            if (asn1OpaqueObject == null) {
                signature.update(bArr);
            } else {
                if (i10 < 19) {
                    throw new SignatureException("APKs with Signed Attributes broken on platforms with API Level < 19");
                }
                try {
                    SignedAttributes signedAttributes = new SignedAttributes(Asn1BerParser.parseImplicitSetOf(asn1OpaqueObject.getEncoded(), Attribute.class));
                    if (i11 >= 24) {
                        String singleObjectIdentifierValue = signedAttributes.getSingleObjectIdentifierValue(Pkcs7Constants.OID_CONTENT_TYPE);
                        if (singleObjectIdentifierValue == null) {
                            throw new SignatureException("No Content Type in signed attributes");
                        }
                        if (!singleObjectIdentifierValue.equals(signedData.encapContentInfo.contentType)) {
                            return null;
                        }
                    }
                    byte[] singleOctetStringValue = signedAttributes.getSingleOctetStringValue(Pkcs7Constants.OID_MESSAGE_DIGEST);
                    if (singleOctetStringValue == null) {
                        throw new SignatureException("No content digest in signed attributes");
                    }
                    if (!Arrays.equals(singleOctetStringValue, MessageDigest.getInstance(AlgorithmIdentifier.getJcaDigestAlgorithm(str)).digest(bArr))) {
                        return null;
                    }
                    ByteBuffer encoded = signerInfo.signedAttrs.getEncoded();
                    signature.update((byte) 49);
                    encoded.position(1);
                    signature.update(encoded);
                } catch (Asn1DecodingException e11) {
                    throw new SignatureException("Failed to parse signed attributes", e11);
                }
            }
            if (signature.verify(ByteBufferUtils.toByteArray(signerInfo.signature.slice()))) {
                return x509CertificateFindCertificate;
            }
            return null;
        }

        public String getName() {
            return this.mName;
        }

        public Result.SignerInfo getResult() {
            return this.mResult;
        }

        public Set<String> getSigFileEntryNames() {
            return this.mSigFileEntryNames;
        }

        public String getSignatureBlockEntryName() {
            return this.mSignatureBlockEntry.getName();
        }

        public String getSignatureFileEntryName() {
            return this.mSignatureFileEntry.getName();
        }

        public boolean isIgnored() {
            return this.mIgnored;
        }

        public void setIgnored() {
            this.mIgnored = true;
        }

        public void verifySigBlockAgainstSigFile(DataSource dataSource, long j10, int i10, int i11) throws InvalidKeySpecException, NoSuchAlgorithmException, IOException, ApkFormatException, Asn1DecodingException {
            Signer signer;
            Signer signer2;
            int i12;
            int i13;
            X509Certificate x509CertificateVerifySignerInfoAgainstSigFile;
            try {
                byte[] uncompressedData = LocalFileRecord.getUncompressedData(dataSource, this.mSignatureBlockEntry, j10);
                try {
                    this.mSigFileBytes = LocalFileRecord.getUncompressedData(dataSource, this.mSignatureFileEntry, j10);
                    try {
                        ContentInfo contentInfo = (ContentInfo) Asn1BerParser.parse(ByteBuffer.wrap(uncompressedData), ContentInfo.class);
                        if (!Pkcs7Constants.OID_SIGNED_DATA.equals(contentInfo.contentType)) {
                            signer = this;
                            try {
                                throw new Asn1DecodingException("Unsupported ContentInfo.contentType: " + contentInfo.contentType);
                            } catch (Asn1DecodingException e10) {
                                e = e10;
                                Asn1DecodingException asn1DecodingException = e;
                                asn1DecodingException.printStackTrace();
                                signer.mResult.addError(ApkVerifier.Issue.JAR_SIG_PARSE_EXCEPTION, signer.mSignatureBlockEntry.getName(), asn1DecodingException);
                                return;
                            }
                        }
                        SignedData signedData = (SignedData) Asn1BerParser.parse(contentInfo.content.getEncoded(), SignedData.class);
                        if (signedData.signerInfos.isEmpty()) {
                            this.mResult.addError(ApkVerifier.Issue.JAR_SIG_NO_SIGNERS, this.mSignatureBlockEntry.getName());
                            return;
                        }
                        SignerInfo signerInfo = null;
                        List<X509Certificate> certificates = null;
                        X509Certificate x509Certificate = null;
                        for (SignerInfo signerInfo2 : i10 < 24 ? Collections.singletonList(signedData.signerInfos.get(0)) : signedData.signerInfos) {
                            if (certificates == null) {
                                try {
                                    certificates = Certificate.parseCertificates(signedData.certificates);
                                } catch (CertificateException e11) {
                                    this.mResult.addError(ApkVerifier.Issue.JAR_SIG_PARSE_EXCEPTION, this.mSignatureBlockEntry.getName(), e11);
                                    return;
                                }
                            }
                            List<X509Certificate> list = certificates;
                            try {
                                i12 = i10;
                                i13 = i11;
                            } catch (Pkcs7DecodingException e12) {
                                e = e12;
                                signer2 = this;
                            } catch (InvalidKeyException e13) {
                                e = e13;
                                signer2 = this;
                                signer2.mResult.addError(ApkVerifier.Issue.JAR_SIG_VERIFY_EXCEPTION, signer2.mSignatureBlockEntry.getName(), signer2.mSignatureFileEntry.getName(), e);
                                return;
                            } catch (SignatureException e14) {
                                e = e14;
                                signer2 = this;
                                signer2.mResult.addError(ApkVerifier.Issue.JAR_SIG_VERIFY_EXCEPTION, signer2.mSignatureBlockEntry.getName(), signer2.mSignatureFileEntry.getName(), e);
                                return;
                            }
                            try {
                                x509CertificateVerifySignerInfoAgainstSigFile = verifySignerInfoAgainstSigFile(signedData, list, signerInfo2, this.mSigFileBytes, i12, i13);
                                signer2 = this;
                            } catch (Pkcs7DecodingException e15) {
                                e = e15;
                                signer2 = this;
                            } catch (InvalidKeyException e16) {
                                e = e16;
                                signer2 = this;
                                signer2.mResult.addError(ApkVerifier.Issue.JAR_SIG_VERIFY_EXCEPTION, signer2.mSignatureBlockEntry.getName(), signer2.mSignatureFileEntry.getName(), e);
                                return;
                            } catch (SignatureException e17) {
                                e = e17;
                                signer2 = this;
                                signer2.mResult.addError(ApkVerifier.Issue.JAR_SIG_VERIFY_EXCEPTION, signer2.mSignatureBlockEntry.getName(), signer2.mSignatureFileEntry.getName(), e);
                                return;
                            }
                            try {
                                if (signer2.mResult.containsErrors()) {
                                    return;
                                }
                                if (x509CertificateVerifySignerInfoAgainstSigFile != null && signerInfo == null) {
                                    x509Certificate = x509CertificateVerifySignerInfoAgainstSigFile;
                                    signerInfo = signerInfo2;
                                }
                                certificates = list;
                                i10 = i12;
                                i11 = i13;
                            } catch (Pkcs7DecodingException e18) {
                                e = e18;
                                signer2.mResult.addError(ApkVerifier.Issue.JAR_SIG_PARSE_EXCEPTION, signer2.mSignatureBlockEntry.getName(), e);
                                return;
                            } catch (InvalidKeyException e19) {
                                e = e19;
                                signer2.mResult.addError(ApkVerifier.Issue.JAR_SIG_VERIFY_EXCEPTION, signer2.mSignatureBlockEntry.getName(), signer2.mSignatureFileEntry.getName(), e);
                                return;
                            } catch (SignatureException e20) {
                                e = e20;
                                signer2.mResult.addError(ApkVerifier.Issue.JAR_SIG_VERIFY_EXCEPTION, signer2.mSignatureBlockEntry.getName(), signer2.mSignatureFileEntry.getName(), e);
                                return;
                            }
                        }
                        if (signerInfo == null) {
                            this.mResult.addError(ApkVerifier.Issue.JAR_SIG_DID_NOT_VERIFY, this.mSignatureBlockEntry.getName(), this.mSignatureFileEntry.getName());
                            return;
                        }
                        List<X509Certificate> certificateChain = getCertificateChain(certificates, x509Certificate);
                        this.mResult.certChain.clear();
                        this.mResult.certChain.addAll(certificateChain);
                    } catch (Asn1DecodingException e21) {
                        e = e21;
                        signer = this;
                    }
                } catch (ZipFormatException e22) {
                    throw new ApkFormatException("Malformed ZIP entry: " + this.mSignatureFileEntry.getName(), e22);
                }
            } catch (ZipFormatException e23) {
                throw new ApkFormatException("Malformed ZIP entry: " + this.mSignatureBlockEntry.getName(), e23);
            }
        }

        public void verifySigFileAgainstManifest(byte[] bArr, ManifestParser.Section section, Map<String, ManifestParser.Section> map, Map<Integer, String> map2, Set<Integer> set, int i10, int i11) throws NoSuchAlgorithmException, NumberFormatException {
            ManifestParser manifestParser = new ManifestParser(this.mSigFileBytes);
            ManifestParser.Section section2 = manifestParser.readSection();
            if (section2.getAttributeValue(Attributes.Name.SIGNATURE_VERSION) == null) {
                this.mResult.addError(ApkVerifier.Issue.JAR_SIG_MISSING_VERSION_ATTR_IN_SIG_FILE, this.mSignatureFileEntry.getName());
                setIgnored();
                return;
            }
            if (i11 >= 24) {
                checkForStrippedApkSignatures(section2, map2, set);
                if (this.mResult.containsErrors()) {
                    return;
                }
            }
            String attributeValue = section2.getAttributeValue("Created-By");
            int i12 = 0;
            boolean z10 = attributeValue != null ? attributeValue.indexOf("signtool") != -1 : false;
            boolean zVerifyManifestDigest = verifyManifestDigest(section2, z10, bArr, i10, i11);
            boolean z11 = z10;
            if (!z11) {
                verifyManifestMainSectionDigest(section2, section, bArr, i10, i11);
            }
            if (this.mResult.containsErrors()) {
                return;
            }
            List<ManifestParser.Section> allSections = manifestParser.readAllSections();
            HashSet hashSet = new HashSet(allSections.size());
            for (ManifestParser.Section section3 : allSections) {
                int i13 = i12 + 1;
                String name = section3.getName();
                if (name == null) {
                    this.mResult.addError(ApkVerifier.Issue.JAR_SIG_UNNNAMED_SIG_FILE_SECTION, this.mSignatureFileEntry.getName(), Integer.valueOf(i13));
                    setIgnored();
                    return;
                }
                if (!hashSet.add(name)) {
                    this.mResult.addError(ApkVerifier.Issue.JAR_SIG_DUPLICATE_SIG_FILE_SECTION, this.mSignatureFileEntry.getName(), name);
                    setIgnored();
                    return;
                }
                if (!zVerifyManifestDigest) {
                    ManifestParser.Section section4 = map.get(name);
                    if (section4 == null) {
                        this.mResult.addError(ApkVerifier.Issue.JAR_SIG_NO_ZIP_ENTRY_DIGEST_IN_SIG_FILE, name, this.mSignatureFileEntry.getName());
                        setIgnored();
                    } else {
                        boolean z12 = z11;
                        verifyManifestIndividualSectionDigest(section3, z12, section4, bArr, i10, i11);
                        z11 = z12;
                    }
                }
                i12 = i13;
            }
            this.mSigFileEntryNames = hashSet;
        }

        private Signer(String str, CentralDirectoryRecord centralDirectoryRecord, CentralDirectoryRecord centralDirectoryRecord2, Result.SignerInfo signerInfo) {
            this.mName = str;
            this.mResult = signerInfo;
            this.mSignatureBlockEntry = centralDirectoryRecord;
            this.mSignatureFileEntry = centralDirectoryRecord2;
        }
    }

    public static class Signers {
        private Signers() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static void verify(DataSource dataSource, long j10, List<CentralDirectoryRecord> list, Set<String> set, Map<Integer, String> map, Set<Integer> set2, int i10, int i11, Result result) throws InvalidKeySpecException, NoSuchAlgorithmException, IOException, NumberFormatException, ApkFormatException, Asn1DecodingException {
            HashMap map2 = new HashMap(1);
            ArrayList arrayList = new ArrayList(1);
            CentralDirectoryRecord centralDirectoryRecord = null;
            for (CentralDirectoryRecord centralDirectoryRecord2 : list) {
                String name = centralDirectoryRecord2.getName();
                if (name.startsWith("META-INF/")) {
                    if (centralDirectoryRecord == null && "META-INF/MANIFEST.MF".equals(name)) {
                        centralDirectoryRecord = centralDirectoryRecord2;
                    } else if (name.endsWith(".SF")) {
                        map2.put(name, centralDirectoryRecord2);
                    } else if (name.endsWith(".RSA") || name.endsWith(".DSA") || name.endsWith(".EC")) {
                        arrayList.add(centralDirectoryRecord2);
                    }
                }
            }
            if (centralDirectoryRecord == null) {
                result.addError(ApkVerifier.Issue.JAR_SIG_NO_MANIFEST, new Object[0]);
                return;
            }
            long j11 = j10;
            try {
                byte[] uncompressedData = LocalFileRecord.getUncompressedData(dataSource, centralDirectoryRecord, j11);
                Pair<ManifestParser.Section, Map<String, ManifestParser.Section>> manifest = V1SchemeVerifier.parseManifest(uncompressedData, set, result);
                if (result.containsErrors()) {
                    return;
                }
                ManifestParser.Section first = manifest.getFirst();
                Map<String, ManifestParser.Section> second = manifest.getSecond();
                ArrayList arrayList2 = new ArrayList(arrayList.size());
                int size = arrayList.size();
                int i12 = 0;
                while (i12 < size) {
                    Object obj = arrayList.get(i12);
                    i12++;
                    CentralDirectoryRecord centralDirectoryRecord3 = (CentralDirectoryRecord) obj;
                    String name2 = centralDirectoryRecord3.getName();
                    int iLastIndexOf = name2.lastIndexOf(46);
                    ArrayList arrayList3 = arrayList;
                    if (iLastIndexOf == -1) {
                        throw new RuntimeException("Signature block file name does not contain extension: ".concat(name2));
                    }
                    String str = name2.substring(0, iLastIndexOf) + ".SF";
                    CentralDirectoryRecord centralDirectoryRecord4 = (CentralDirectoryRecord) map2.get(str);
                    if (centralDirectoryRecord4 == null) {
                        result.addWarning(ApkVerifier.Issue.JAR_SIG_MISSING_FILE, name2, str);
                        arrayList = arrayList3;
                    } else {
                        String strSubstring = name2.substring(9);
                        arrayList2.add(new Signer(strSubstring, centralDirectoryRecord3, centralDirectoryRecord4, new Result.SignerInfo(strSubstring, name2, centralDirectoryRecord4.getName())));
                        arrayList = arrayList3;
                        map2 = map2;
                    }
                }
                if (arrayList2.isEmpty()) {
                    result.addError(ApkVerifier.Issue.JAR_SIG_NO_SIGNATURES, new Object[0]);
                    return;
                }
                int size2 = arrayList2.size();
                int i13 = 0;
                while (i13 < size2) {
                    int i14 = i13 + 1;
                    Signer signer = (Signer) arrayList2.get(i13);
                    signer.verifySigBlockAgainstSigFile(dataSource, j11, i10, i11);
                    if (signer.getResult().containsErrors()) {
                        result.signers.add(signer.getResult());
                    }
                    j11 = j10;
                    i13 = i14;
                }
                if (result.containsErrors()) {
                    return;
                }
                ArrayList arrayList4 = new ArrayList(arrayList2.size());
                int size3 = arrayList2.size();
                int i15 = 0;
                while (i15 < size3) {
                    Object obj2 = arrayList2.get(i15);
                    i15++;
                    Signer signer2 = (Signer) obj2;
                    ArrayList arrayList5 = arrayList2;
                    signer2.verifySigFileAgainstManifest(uncompressedData, first, second, map, set2, i10, i11);
                    if (signer2.isIgnored()) {
                        result.ignoredSigners.add(signer2.getResult());
                    } else if (signer2.getResult().containsErrors()) {
                        result.signers.add(signer2.getResult());
                    } else {
                        arrayList4.add(signer2);
                    }
                    arrayList2 = arrayList5;
                }
                if (result.containsErrors()) {
                    return;
                }
                if (arrayList4.isEmpty()) {
                    result.addError(ApkVerifier.Issue.JAR_SIG_NO_SIGNATURES, new Object[0]);
                    return;
                }
                Set<Signer> setVerifyJarEntriesAgainstManifestAndSigners = V1SchemeVerifier.verifyJarEntriesAgainstManifestAndSigners(dataSource, j10, list, second, arrayList4, i10, i11, result);
                if (result.containsErrors()) {
                    return;
                }
                HashSet hashSet = new HashSet((result.signers.size() * 2) + 1);
                hashSet.add(centralDirectoryRecord.getName());
                for (Signer signer3 : setVerifyJarEntriesAgainstManifestAndSigners) {
                    hashSet.add(signer3.getSignatureBlockEntryName());
                    hashSet.add(signer3.getSignatureFileEntryName());
                }
                Iterator<CentralDirectoryRecord> it = list.iterator();
                while (it.hasNext()) {
                    String name3 = it.next().getName();
                    if (name3.startsWith("META-INF/") && !name3.endsWith("/") && !hashSet.contains(name3)) {
                        result.addWarning(ApkVerifier.Issue.JAR_SIG_UNPROTECTED_ZIP_ENTRY, name3);
                    }
                }
                int size4 = arrayList4.size();
                int i16 = 0;
                while (i16 < size4) {
                    Object obj3 = arrayList4.get(i16);
                    i16++;
                    Signer signer4 = (Signer) obj3;
                    if (setVerifyJarEntriesAgainstManifestAndSigners.contains(signer4)) {
                        result.signers.add(signer4.getResult());
                    } else {
                        result.ignoredSigners.add(signer4.getResult());
                    }
                }
                result.verified = true;
            } catch (ZipFormatException e10) {
                throw new ApkFormatException("Malformed ZIP entry: " + centralDirectoryRecord.getName(), e10);
            }
        }
    }

    static {
        HashMap map = new HashMap(8);
        UPPER_CASE_JCA_DIGEST_ALG_TO_CANONICAL = map;
        map.put("MD5", "MD5");
        map.put("SHA", McElieceCCA2KeyGenParameterSpec.SHA1);
        map.put("SHA1", McElieceCCA2KeyGenParameterSpec.SHA1);
        map.put(McElieceCCA2KeyGenParameterSpec.SHA1, McElieceCCA2KeyGenParameterSpec.SHA1);
        map.put("SHA-256", "SHA-256");
        map.put(McElieceCCA2KeyGenParameterSpec.SHA384, McElieceCCA2KeyGenParameterSpec.SHA384);
        map.put("SHA-512", "SHA-512");
        HashMap map2 = new HashMap(5);
        MIN_SDK_VESION_FROM_WHICH_DIGEST_SUPPORTED_IN_MANIFEST = map2;
        map2.put("MD5", 0);
        map2.put(McElieceCCA2KeyGenParameterSpec.SHA1, 0);
        map2.put("SHA-256", 0);
        map2.put(McElieceCCA2KeyGenParameterSpec.SHA384, 9);
        map2.put("SHA-512", 9);
    }

    private V1SchemeVerifier() {
    }

    private static Set<String> checkForDuplicateEntries(List<CentralDirectoryRecord> list, Result result) {
        HashSet hashSet = new HashSet(list.size());
        Iterator<CentralDirectoryRecord> it = list.iterator();
        HashSet hashSet2 = null;
        while (it.hasNext()) {
            String name = it.next().getName();
            if (!hashSet.add(name)) {
                if (hashSet2 == null) {
                    hashSet2 = new HashSet();
                }
                if (hashSet2.add(name)) {
                    result.addError(ApkVerifier.Issue.JAR_SIG_DUPLICATE_ZIP_ENTRY, name);
                }
            }
        }
        return hashSet;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static byte[] digest(String str, byte[] bArr, int i10, int i11) throws NoSuchAlgorithmException {
        MessageDigest messageDigest = getMessageDigest(str);
        messageDigest.update(bArr, i10, i11);
        return messageDigest.digest();
    }

    private static String getCanonicalJcaMessageDigestAlgorithm(String str) {
        return UPPER_CASE_JCA_DIGEST_ALG_TO_CANONICAL.get(str.toUpperCase(Locale.US));
    }

    private static byte[] getDigest(Collection<NamedDigest> collection, String str) {
        for (NamedDigest namedDigest : collection) {
            if (namedDigest.jcaDigestAlgorithm.equalsIgnoreCase(str)) {
                return namedDigest.digest;
            }
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x005b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Collection<NamedDigest> getDigestsToVerify(ManifestParser.Section section, String str, int i10, int i11) {
        String canonicalJcaMessageDigestAlgorithm;
        ArrayList arrayList = new ArrayList(1);
        if (i10 < 18) {
            String attributeValue = section.getAttributeValue("Digest-Algorithms");
            if (attributeValue == null) {
                attributeValue = "SHA SHA1";
            }
            StringTokenizer stringTokenizer = new StringTokenizer(attributeValue);
            while (true) {
                if (!stringTokenizer.hasMoreTokens()) {
                    break;
                }
                String strNextToken = stringTokenizer.nextToken();
                String attributeValue2 = section.getAttributeValue(strNextToken + str);
                if (attributeValue2 != null && (canonicalJcaMessageDigestAlgorithm = getCanonicalJcaMessageDigestAlgorithm(strNextToken)) != null && getMinSdkVersionFromWhichSupportedInManifestOrSignatureFile(canonicalJcaMessageDigestAlgorithm) <= i10) {
                    arrayList.add(new NamedDigest(canonicalJcaMessageDigestAlgorithm, Base64.decode(attributeValue2, 2)));
                    break;
                }
            }
            if (!arrayList.isEmpty()) {
            }
        } else if (i11 >= 18) {
            String[] strArr = JB_MR2_AND_NEWER_DIGEST_ALGS;
            int length = strArr.length;
            int i12 = 0;
            while (true) {
                if (i12 >= length) {
                    break;
                }
                String str2 = strArr[i12];
                String attributeValue3 = section.getAttributeValue(getJarDigestAttributeName(str2, str));
                if (attributeValue3 == null) {
                    i12++;
                } else {
                    byte[] bArrDecode = Base64.decode(attributeValue3, 2);
                    byte[] digest = getDigest(arrayList, str2);
                    if (digest == null || !Arrays.equals(digest, bArrDecode)) {
                        arrayList.add(new NamedDigest(str2, bArrDecode));
                    }
                }
            }
        }
        return arrayList;
    }

    private static String getJarDigestAttributeName(String str, String str2) {
        return McElieceCCA2KeyGenParameterSpec.SHA1.equalsIgnoreCase(str) ? a.a("SHA1", str2) : k3.a.a(str, str2);
    }

    private static MessageDigest getMessageDigest(String str) throws NoSuchAlgorithmException {
        return MessageDigest.getInstance(str);
    }

    public static int getMinSdkVersionFromWhichSupportedInManifestOrSignatureFile(String str) {
        Integer num = MIN_SDK_VESION_FROM_WHICH_DIGEST_SUPPORTED_IN_MANIFEST.get(str.toUpperCase(Locale.US));
        if (num != null) {
            return num.intValue();
        }
        return Integer.MAX_VALUE;
    }

    private static List<String> getSignerNames(List<Signer> list) {
        if (list.isEmpty()) {
            return Collections.EMPTY_LIST;
        }
        ArrayList arrayList = new ArrayList(list.size());
        Iterator<Signer> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().getName());
        }
        return arrayList;
    }

    private static boolean isJarEntryDigestNeededInManifest(String str) {
        if (str.startsWith("META-INF/")) {
            return false;
        }
        return !str.endsWith("/");
    }

    public static Pair<ManifestParser.Section, Map<String, ManifestParser.Section>> parseManifest(byte[] bArr, Set<String> set, Result result) {
        ManifestParser manifestParser = new ManifestParser(bArr);
        ManifestParser.Section section = manifestParser.readSection();
        List<ManifestParser.Section> allSections = manifestParser.readAllSections();
        HashMap map = new HashMap(allSections.size());
        int i10 = 0;
        for (ManifestParser.Section section2 : allSections) {
            i10++;
            String name = section2.getName();
            if (name == null) {
                result.addError(ApkVerifier.Issue.JAR_SIG_UNNNAMED_MANIFEST_SECTION, Integer.valueOf(i10));
            } else if (map.put(name, section2) != null) {
                result.addError(ApkVerifier.Issue.JAR_SIG_DUPLICATE_MANIFEST_SECTION, name);
            } else if (!set.contains(name)) {
                result.addError(ApkVerifier.Issue.JAR_SIG_MISSING_ZIP_ENTRY_REFERENCED_IN_MANIFEST, name);
            }
        }
        return Pair.of(section, map);
    }

    public static List<CentralDirectoryRecord> parseZipCentralDirectory(DataSource dataSource, ApkUtils.ZipSections zipSections) throws IOException, ApkFormatException {
        return ZipUtils.parseZipCentralDirectory(dataSource, zipSections);
    }

    public static Result verify(DataSource dataSource, ApkUtils.ZipSections zipSections, Map<Integer, String> map, Set<Integer> set, int i10, int i11) throws InvalidKeySpecException, NoSuchAlgorithmException, IOException, NumberFormatException, ApkFormatException, Asn1DecodingException {
        if (i10 > i11) {
            throw new IllegalArgumentException(f.a(i10, i11, "minSdkVersion (", ") > maxSdkVersion (", ")"));
        }
        Result result = new Result();
        List<CentralDirectoryRecord> zipCentralDirectory = parseZipCentralDirectory(dataSource, zipSections);
        Set<String> setCheckForDuplicateEntries = checkForDuplicateEntries(zipCentralDirectory, result);
        if (result.containsErrors()) {
            return result;
        }
        Signers.verify(dataSource, zipSections.getZipCentralDirectoryOffset(), zipCentralDirectory, setCheckForDuplicateEntries, map, set, i10, i11, result);
        return result;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static Set<Signer> verifyJarEntriesAgainstManifestAndSigners(DataSource dataSource, long j10, Collection<CentralDirectoryRecord> collection, Map<String, ManifestParser.Section> map, List<Signer> list, int i10, int i11, Result result) throws NoSuchAlgorithmException, IOException, ApkFormatException {
        String str;
        ArrayList arrayList;
        ArrayList arrayList2 = new ArrayList(collection);
        Collections.sort(arrayList2, CentralDirectoryRecord.BY_LOCAL_FILE_HEADER_OFFSET_COMPARATOR);
        int size = arrayList2.size();
        ArrayList arrayList3 = null;
        String str2 = null;
        int i12 = 0;
        while (i12 < size) {
            Object obj = arrayList2.get(i12);
            i12++;
            CentralDirectoryRecord centralDirectoryRecord = (CentralDirectoryRecord) obj;
            String name = centralDirectoryRecord.getName();
            if (isJarEntryDigestNeededInManifest(name)) {
                ManifestParser.Section section = map.get(name);
                if (section == null) {
                    result.addError(ApkVerifier.Issue.JAR_SIG_NO_ZIP_ENTRY_DIGEST_IN_MANIFEST, name);
                } else {
                    ArrayList arrayList4 = new ArrayList(list.size());
                    for (Signer signer : list) {
                        if (signer.getSigFileEntryNames().contains(name)) {
                            arrayList4.add(signer);
                        }
                    }
                    if (arrayList4.isEmpty()) {
                        result.addError(ApkVerifier.Issue.JAR_SIG_ZIP_ENTRY_NOT_SIGNED, name);
                    } else {
                        if (arrayList3 == null) {
                            str2 = name;
                            arrayList3 = arrayList4;
                        } else if (!arrayList4.equals(arrayList3)) {
                            result.addError(ApkVerifier.Issue.JAR_SIG_ZIP_ENTRY_SIGNERS_MISMATCH, str2, getSignerNames(arrayList3), name, getSignerNames(arrayList4));
                        }
                        ArrayList arrayList5 = new ArrayList(getDigestsToVerify(section, "-Digest", i10, i11));
                        if (arrayList5.isEmpty()) {
                            result.addError(ApkVerifier.Issue.JAR_SIG_NO_ZIP_ENTRY_DIGEST_IN_MANIFEST, name);
                            str = str2;
                        } else {
                            MessageDigest[] messageDigestArr = new MessageDigest[arrayList5.size()];
                            for (int i13 = 0; i13 < arrayList5.size(); i13++) {
                                messageDigestArr[i13] = getMessageDigest(((NamedDigest) arrayList5.get(i13)).jcaDigestAlgorithm);
                            }
                            try {
                                str = str2;
                                LocalFileRecord.outputUncompressedData(dataSource, centralDirectoryRecord, j10, DataSinks.asDataSink(messageDigestArr));
                                int i14 = 0;
                                while (i14 < arrayList5.size()) {
                                    NamedDigest namedDigest = (NamedDigest) arrayList5.get(i14);
                                    ArrayList arrayList6 = arrayList2;
                                    byte[] bArrDigest = messageDigestArr[i14].digest();
                                    int i15 = size;
                                    if (Arrays.equals(namedDigest.digest, bArrDigest)) {
                                        arrayList = arrayList3;
                                    } else {
                                        arrayList = arrayList3;
                                        result.addError(ApkVerifier.Issue.JAR_SIG_ZIP_ENTRY_DIGEST_DID_NOT_VERIFY, name, namedDigest.jcaDigestAlgorithm, "META-INF/MANIFEST.MF", Base64.encodeToString(bArrDigest, 2), Base64.encodeToString(namedDigest.digest, 2));
                                    }
                                    i14++;
                                    size = i15;
                                    arrayList2 = arrayList6;
                                    arrayList3 = arrayList;
                                }
                            } catch (ZipFormatException e10) {
                                throw new ApkFormatException(a.a("Malformed ZIP entry: ", name), e10);
                            } catch (IOException e11) {
                                throw new IOException(a.a("Failed to read entry: ", name), e11);
                            }
                        }
                        str2 = str;
                        size = size;
                        arrayList2 = arrayList2;
                        arrayList3 = arrayList3;
                    }
                }
            }
        }
        if (arrayList3 != null) {
            return new HashSet(arrayList3);
        }
        result.addError(ApkVerifier.Issue.JAR_SIG_NO_SIGNED_ZIP_ENTRIES, new Object[0]);
        return Collections.EMPTY_SET;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static byte[] digest(String str, byte[] bArr) throws NoSuchAlgorithmException {
        return getMessageDigest(str).digest(bArr);
    }
}
