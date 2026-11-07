package com.android.apksig.internal.apk.v3;

import com.android.apksig.ApkVerifier;
import com.android.apksig.SigningCertificateLineage;
import com.android.apksig.apk.ApkFormatException;
import com.android.apksig.apk.ApkUtils;
import com.android.apksig.internal.apk.ApkSigningBlockUtils;
import com.android.apksig.internal.apk.ContentDigestAlgorithm;
import com.android.apksig.internal.apk.SignatureAlgorithm;
import com.android.apksig.internal.apk.SignatureInfo;
import com.android.apksig.internal.compat.OptionalIntCompat;
import com.android.apksig.internal.util.ByteBufferUtils;
import com.android.apksig.internal.util.GuaranteedEncodedFormX509Certificate;
import com.android.apksig.internal.util.X509CertificateUtils;
import com.android.apksig.util.DataSource;
import com.android.apksig.util.RunnablesExecutor;
import java.io.IOException;
import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.KeyFactory;
import java.security.NoSuchAlgorithmException;
import java.security.PublicKey;
import java.security.Signature;
import java.security.SignatureException;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.security.spec.AlgorithmParameterSpec;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.X509EncodedKeySpec;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeMap;

/* loaded from: classes.dex */
public class V3SchemeVerifier {
    private final DataSource mApk;
    private ByteBuffer mApkSignatureSchemeV3Block;
    private final int mBlockId;
    private final Set<ContentDigestAlgorithm> mContentDigestsToVerify;
    private final RunnablesExecutor mExecutor;
    private final boolean mFullVerification;
    private final int mMaxSdkVersion;
    private final int mMinSdkVersion;
    private final OptionalIntCompat mOptionalRotationMinSdkVersion;
    private final ApkSigningBlockUtils.Result mResult;
    private final ApkUtils.ZipSections mZipSections;

    private void parseSigner(ByteBuffer byteBuffer, CertificateFactory certificateFactory, ApkSigningBlockUtils.Result.SignerInfo signerInfo) throws InvalidKeySpecException, NoSuchAlgorithmException, SignatureException, InvalidKeyException, ApkFormatException, InvalidAlgorithmParameterException {
        byte[] encoded;
        ByteBuffer lengthPrefixedSlice = ApkSigningBlockUtils.getLengthPrefixedSlice(byteBuffer);
        byte[] bArr = new byte[lengthPrefixedSlice.remaining()];
        lengthPrefixedSlice.get(bArr);
        lengthPrefixedSlice.flip();
        signerInfo.signedData = bArr;
        int i10 = byteBuffer.getInt();
        int i11 = byteBuffer.getInt();
        signerInfo.minSdkVersion = i10;
        signerInfo.maxSdkVersion = i11;
        if (i10 < 0 || i10 > i11) {
            signerInfo.addError(ApkVerifier.Issue.V3_SIG_INVALID_SDK_VERSIONS, Integer.valueOf(i10), Integer.valueOf(i11));
        }
        ByteBuffer lengthPrefixedSlice2 = ApkSigningBlockUtils.getLengthPrefixedSlice(byteBuffer);
        byte[] lengthPrefixedByteArray = ApkSigningBlockUtils.readLengthPrefixedByteArray(byteBuffer);
        ArrayList arrayList = new ArrayList(1);
        int i12 = 0;
        while (lengthPrefixedSlice2.hasRemaining()) {
            i12++;
            try {
                ByteBuffer lengthPrefixedSlice3 = ApkSigningBlockUtils.getLengthPrefixedSlice(lengthPrefixedSlice2);
                int i13 = lengthPrefixedSlice3.getInt();
                byte[] lengthPrefixedByteArray2 = ApkSigningBlockUtils.readLengthPrefixedByteArray(lengthPrefixedSlice3);
                signerInfo.signatures.add(new ApkSigningBlockUtils.Result.SignerInfo.Signature(i13, lengthPrefixedByteArray2));
                SignatureAlgorithm signatureAlgorithmFindById = SignatureAlgorithm.findById(i13);
                if (signatureAlgorithmFindById == null) {
                    signerInfo.addWarning(ApkVerifier.Issue.V3_SIG_UNKNOWN_SIG_ALGORITHM, Integer.valueOf(i13));
                } else {
                    arrayList.add(new ApkSigningBlockUtils.SupportedSignature(signatureAlgorithmFindById, lengthPrefixedByteArray2));
                }
            } catch (ApkFormatException | BufferUnderflowException unused) {
                signerInfo.addError(ApkVerifier.Issue.V3_SIG_MALFORMED_SIGNATURE, Integer.valueOf(i12));
                return;
            }
        }
        if (signerInfo.signatures.isEmpty()) {
            signerInfo.addError(ApkVerifier.Issue.V3_SIG_NO_SIGNATURES, new Object[0]);
            return;
        }
        try {
            for (ApkSigningBlockUtils.SupportedSignature supportedSignature : ApkSigningBlockUtils.getSignaturesToVerify(arrayList, signerInfo.minSdkVersion, signerInfo.maxSdkVersion)) {
                SignatureAlgorithm signatureAlgorithm = supportedSignature.algorithm;
                String first = signatureAlgorithm.getJcaSignatureAlgorithmAndParams().getFirst();
                AlgorithmParameterSpec second = signatureAlgorithm.getJcaSignatureAlgorithmAndParams().getSecond();
                try {
                    PublicKey publicKeyGeneratePublic = KeyFactory.getInstance(signatureAlgorithm.getJcaKeyAlgorithm()).generatePublic(new X509EncodedKeySpec(lengthPrefixedByteArray));
                    try {
                        Signature signature = Signature.getInstance(first);
                        signature.initVerify(publicKeyGeneratePublic);
                        if (second != null) {
                            signature.setParameter(second);
                        }
                        lengthPrefixedSlice.position(0);
                        signature.update(lengthPrefixedSlice);
                        byte[] bArr2 = supportedSignature.signature;
                        if (!signature.verify(bArr2)) {
                            signerInfo.addError(ApkVerifier.Issue.V3_SIG_DID_NOT_VERIFY, signatureAlgorithm);
                            return;
                        } else {
                            signerInfo.verifiedSignatures.put(signatureAlgorithm, bArr2);
                            this.mContentDigestsToVerify.add(signatureAlgorithm.getContentDigestAlgorithm());
                        }
                    } catch (InvalidAlgorithmParameterException e10) {
                        e = e10;
                        signerInfo.addError(ApkVerifier.Issue.V3_SIG_VERIFY_EXCEPTION, signatureAlgorithm, e);
                        return;
                    } catch (InvalidKeyException e11) {
                        e = e11;
                        signerInfo.addError(ApkVerifier.Issue.V3_SIG_VERIFY_EXCEPTION, signatureAlgorithm, e);
                        return;
                    } catch (SignatureException e12) {
                        e = e12;
                        signerInfo.addError(ApkVerifier.Issue.V3_SIG_VERIFY_EXCEPTION, signatureAlgorithm, e);
                        return;
                    }
                } catch (Exception e13) {
                    signerInfo.addError(ApkVerifier.Issue.V3_SIG_MALFORMED_PUBLIC_KEY, e13);
                    return;
                }
            }
            lengthPrefixedSlice.position(0);
            ByteBuffer lengthPrefixedSlice4 = ApkSigningBlockUtils.getLengthPrefixedSlice(lengthPrefixedSlice);
            ByteBuffer lengthPrefixedSlice5 = ApkSigningBlockUtils.getLengthPrefixedSlice(lengthPrefixedSlice);
            int i14 = lengthPrefixedSlice.getInt();
            if (i14 != i10) {
                signerInfo.addError(ApkVerifier.Issue.V3_MIN_SDK_VERSION_MISMATCH_BETWEEN_SIGNER_AND_SIGNED_DATA_RECORD, Integer.valueOf(i10), Integer.valueOf(i14));
            }
            int i15 = lengthPrefixedSlice.getInt();
            if (i15 != i11) {
                signerInfo.addError(ApkVerifier.Issue.V3_MAX_SDK_VERSION_MISMATCH_BETWEEN_SIGNER_AND_SIGNED_DATA_RECORD, Integer.valueOf(i11), Integer.valueOf(i15));
            }
            ByteBuffer lengthPrefixedSlice6 = ApkSigningBlockUtils.getLengthPrefixedSlice(lengthPrefixedSlice);
            int i16 = -1;
            while (lengthPrefixedSlice5.hasRemaining()) {
                int i17 = i16 + 1;
                byte[] lengthPrefixedByteArray3 = ApkSigningBlockUtils.readLengthPrefixedByteArray(lengthPrefixedSlice5);
                try {
                    signerInfo.certs.add(new GuaranteedEncodedFormX509Certificate(X509CertificateUtils.generateCertificate(lengthPrefixedByteArray3, certificateFactory), lengthPrefixedByteArray3));
                    i16 = i17;
                } catch (CertificateException e14) {
                    signerInfo.addError(ApkVerifier.Issue.V3_SIG_MALFORMED_CERTIFICATE, Integer.valueOf(i17), Integer.valueOf(i16 + 2), e14);
                    return;
                }
            }
            if (signerInfo.certs.isEmpty()) {
                signerInfo.addError(ApkVerifier.Issue.V3_SIG_NO_CERTIFICATES, new Object[0]);
                return;
            }
            X509Certificate x509Certificate = signerInfo.certs.get(0);
            try {
                encoded = ApkSigningBlockUtils.encodePublicKey(x509Certificate.getPublicKey());
            } catch (InvalidKeyException e15) {
                System.out.println("Caught an exception encoding the public key: " + e15);
                e15.printStackTrace();
                encoded = x509Certificate.getPublicKey().getEncoded();
            }
            if (!Arrays.equals(lengthPrefixedByteArray, encoded)) {
                signerInfo.addError(ApkVerifier.Issue.V3_SIG_PUBLIC_KEY_MISMATCH_BETWEEN_CERTIFICATE_AND_SIGNATURES_RECORD, ApkSigningBlockUtils.toHex(encoded), ApkSigningBlockUtils.toHex(lengthPrefixedByteArray));
                return;
            }
            int i18 = 0;
            while (lengthPrefixedSlice4.hasRemaining()) {
                i18++;
                try {
                    ByteBuffer lengthPrefixedSlice7 = ApkSigningBlockUtils.getLengthPrefixedSlice(lengthPrefixedSlice4);
                    signerInfo.contentDigests.add(new ApkSigningBlockUtils.Result.SignerInfo.ContentDigest(lengthPrefixedSlice7.getInt(), ApkSigningBlockUtils.readLengthPrefixedByteArray(lengthPrefixedSlice7)));
                } catch (ApkFormatException | BufferUnderflowException unused2) {
                    signerInfo.addError(ApkVerifier.Issue.V3_SIG_MALFORMED_DIGEST, Integer.valueOf(i18));
                    return;
                }
            }
            ArrayList arrayList2 = new ArrayList(signerInfo.signatures.size());
            Iterator<ApkSigningBlockUtils.Result.SignerInfo.Signature> it = signerInfo.signatures.iterator();
            while (it.hasNext()) {
                arrayList2.add(Integer.valueOf(it.next().getAlgorithmId()));
            }
            ArrayList arrayList3 = new ArrayList(signerInfo.contentDigests.size());
            Iterator<ApkSigningBlockUtils.Result.SignerInfo.ContentDigest> it2 = signerInfo.contentDigests.iterator();
            while (it2.hasNext()) {
                arrayList3.add(Integer.valueOf(it2.next().getSignatureAlgorithmId()));
            }
            if (!arrayList2.equals(arrayList3)) {
                signerInfo.addError(ApkVerifier.Issue.V3_SIG_SIG_ALG_MISMATCH_BETWEEN_SIGNATURES_AND_DIGESTS_RECORDS, arrayList2, arrayList3);
                return;
            }
            int i19 = 0;
            boolean z10 = false;
            while (lengthPrefixedSlice6.hasRemaining()) {
                i19++;
                try {
                    ByteBuffer lengthPrefixedSlice8 = ApkSigningBlockUtils.getLengthPrefixedSlice(lengthPrefixedSlice6);
                    int i20 = lengthPrefixedSlice8.getInt();
                    byte[] byteArray = ByteBufferUtils.toByteArray(lengthPrefixedSlice8);
                    signerInfo.additionalAttributes.add(new ApkSigningBlockUtils.Result.SignerInfo.AdditionalAttribute(i20, byteArray));
                    if (i20 == 1000370060) {
                        try {
                            SigningCertificateLineage fromV3AttributeValue = SigningCertificateLineage.readFromV3AttributeValue(byteArray);
                            signerInfo.signingCertificateLineage = fromV3AttributeValue;
                            if (signerInfo.signingCertificateLineage.size() != fromV3AttributeValue.getSubLineage(signerInfo.certs.get(0)).size()) {
                                signerInfo.addError(ApkVerifier.Issue.V3_SIG_POR_CERT_MISMATCH, new Object[0]);
                            }
                        } catch (IllegalArgumentException unused3) {
                            signerInfo.addError(ApkVerifier.Issue.V3_SIG_POR_CERT_MISMATCH, new Object[0]);
                        } catch (SecurityException unused4) {
                            signerInfo.addError(ApkVerifier.Issue.V3_SIG_POR_DID_NOT_VERIFY, new Object[0]);
                        } catch (Exception unused5) {
                            signerInfo.addError(ApkVerifier.Issue.V3_SIG_MALFORMED_LINEAGE, new Object[0]);
                        }
                    } else if (i20 == 1436519170) {
                        if (this.mMaxSdkVersion >= 33 && this.mFullVerification) {
                            int i21 = ByteBuffer.wrap(byteArray).order(ByteOrder.LITTLE_ENDIAN).getInt();
                            if (this.mOptionalRotationMinSdkVersion.isPresent()) {
                                int asInt = this.mOptionalRotationMinSdkVersion.getAsInt();
                                if (i21 != asInt) {
                                    signerInfo.addError(ApkVerifier.Issue.V31_ROTATION_MIN_SDK_MISMATCH, Integer.valueOf(i21), Integer.valueOf(asInt));
                                }
                            } else {
                                signerInfo.addError(ApkVerifier.Issue.V31_BLOCK_MISSING, Integer.valueOf(i21));
                            }
                        }
                        z10 = true;
                    } else if (i20 != -1029262406) {
                        signerInfo.addWarning(ApkVerifier.Issue.V3_SIG_UNKNOWN_ADDITIONAL_ATTRIBUTE, Integer.valueOf(i20));
                    } else if (this.mBlockId != 462663009) {
                        signerInfo.addWarning(ApkVerifier.Issue.V31_ROTATION_TARGETS_DEV_RELEASE_ATTR_ON_V3_SIGNER, new Object[0]);
                    }
                } catch (ApkFormatException | BufferUnderflowException unused6) {
                    signerInfo.addError(ApkVerifier.Issue.V3_SIG_MALFORMED_ADDITIONAL_ATTRIBUTE, Integer.valueOf(i19));
                    return;
                }
            }
            if (this.mFullVerification && this.mOptionalRotationMinSdkVersion.isPresent() && !z10) {
                signerInfo.addWarning(ApkVerifier.Issue.V31_ROTATION_MIN_SDK_ATTR_MISSING, Integer.valueOf(this.mOptionalRotationMinSdkVersion.getAsInt()));
            }
        } catch (ApkSigningBlockUtils.NoSupportedSignaturesException unused7) {
            signerInfo.addError(ApkVerifier.Issue.V3_SIG_NO_SUPPORTED_SIGNATURES, new Object[0]);
        }
    }

    public static void parseSigners(ByteBuffer byteBuffer, Set<ContentDigestAlgorithm> set, ApkSigningBlockUtils.Result result) throws NoSuchAlgorithmException {
        try {
            new Builder(byteBuffer).setResult(result).setContentDigestsToVerify(set).setFullVerification(false).build().parseSigners();
        } catch (ApkSigningBlockUtils.SignatureNotFoundException | IOException e10) {
            throw new IllegalStateException("An exception was encountered when attempting to parse the signers from the provided APK Signature Scheme v3 block", e10);
        }
    }

    public static ApkSigningBlockUtils.Result verify(RunnablesExecutor runnablesExecutor, DataSource dataSource, ApkUtils.ZipSections zipSections, int i10, int i11) throws ApkSigningBlockUtils.SignatureNotFoundException, NoSuchAlgorithmException, IOException {
        return new Builder(dataSource, zipSections, i10, i11).setRunnablesExecutor(runnablesExecutor).setBlockId(-262969152).build().verify();
    }

    private V3SchemeVerifier(RunnablesExecutor runnablesExecutor, DataSource dataSource, ApkUtils.ZipSections zipSections, Set<ContentDigestAlgorithm> set, ApkSigningBlockUtils.Result result, int i10, int i11, int i12, OptionalIntCompat optionalIntCompat, boolean z10) {
        this.mExecutor = runnablesExecutor;
        this.mApk = dataSource;
        this.mZipSections = zipSections;
        this.mContentDigestsToVerify = set;
        this.mResult = result;
        this.mMinSdkVersion = i10;
        this.mMaxSdkVersion = i11;
        this.mBlockId = i12;
        this.mOptionalRotationMinSdkVersion = optionalIntCompat;
        this.mFullVerification = z10;
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x00d6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public ApkSigningBlockUtils.Result verify() throws ApkSigningBlockUtils.SignatureNotFoundException, NoSuchAlgorithmException, IOException {
        ApkUtils.ZipSections zipSections;
        DataSource dataSource = this.mApk;
        if (dataSource != null && (zipSections = this.mZipSections) != null) {
            SignatureInfo signatureInfoFindSignature = ApkSigningBlockUtils.findSignature(dataSource, zipSections, this.mBlockId, this.mResult);
            this.mApkSignatureSchemeV3Block = signatureInfoFindSignature.signatureBlock;
            DataSource dataSourceSlice = this.mApk.slice(0L, signatureInfoFindSignature.apkSigningBlockOffset);
            DataSource dataSource2 = this.mApk;
            long j10 = signatureInfoFindSignature.centralDirOffset;
            DataSource dataSourceSlice2 = dataSource2.slice(j10, signatureInfoFindSignature.eocdOffset - j10);
            ByteBuffer byteBuffer = signatureInfoFindSignature.eocd;
            parseSigners();
            if (this.mResult.containsErrors()) {
                return this.mResult;
            }
            ApkSigningBlockUtils.verifyIntegrity(this.mExecutor, dataSourceSlice, dataSourceSlice2, byteBuffer, this.mContentDigestsToVerify, this.mResult);
            TreeMap treeMap = new TreeMap();
            for (ApkSigningBlockUtils.Result.SignerInfo signerInfo : this.mResult.signers) {
                treeMap.put(Integer.valueOf(signerInfo.minSdkVersion), signerInfo);
            }
            ArrayList arrayList = new ArrayList(this.mResult.signers.size());
            Iterator it = treeMap.values().iterator();
            int i10 = 0;
            int i11 = 0;
            int i12 = 0;
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                ApkSigningBlockUtils.Result.SignerInfo signerInfo2 = (ApkSigningBlockUtils.Result.SignerInfo) it.next();
                int i13 = signerInfo2.minSdkVersion;
                int i14 = signerInfo2.maxSdkVersion;
                if (i10 != 0) {
                    if (i13 != i11 + 1) {
                        this.mResult.addError(ApkVerifier.Issue.V3_INCONSISTENT_SDK_VERSIONS, new Object[0]);
                        break;
                    }
                } else {
                    i10 = i13;
                }
                SigningCertificateLineage signingCertificateLineage = signerInfo2.signingCertificateLineage;
                if (signingCertificateLineage != null) {
                    int size = signingCertificateLineage.size();
                    if (size < i12) {
                        this.mResult.addError(ApkVerifier.Issue.V3_INCONSISTENT_LINEAGES, new Object[0]);
                        i11 = i14;
                        break;
                    }
                    arrayList.add(signerInfo2.signingCertificateLineage);
                    i12 = size;
                }
                i11 = i14;
            }
            if (i10 <= this.mMinSdkVersion) {
                if (i11 < (this.mOptionalRotationMinSdkVersion.isPresent() ? this.mOptionalRotationMinSdkVersion.getAsInt() - 1 : this.mMaxSdkVersion)) {
                }
            } else {
                this.mResult.addError(ApkVerifier.Issue.V3_MISSING_SDK_VERSIONS, Integer.valueOf(i10), Integer.valueOf(i11));
            }
            try {
                this.mResult.signingCertificateLineage = SigningCertificateLineage.consolidateLineages(arrayList);
            } catch (IllegalArgumentException unused) {
                this.mResult.addError(ApkVerifier.Issue.V3_INCONSISTENT_LINEAGES, new Object[0]);
            }
            if (!this.mResult.containsErrors()) {
                this.mResult.verified = true;
            }
            return this.mResult;
        }
        throw new IllegalStateException("A non-null apk and zip sections must be specified to verify an APK's v3 signatures");
    }

    public ApkSigningBlockUtils.Result parseSigners() throws ApkSigningBlockUtils.SignatureNotFoundException, NoSuchAlgorithmException, IOException, CertificateException {
        try {
            if (this.mApkSignatureSchemeV3Block == null) {
                this.mApkSignatureSchemeV3Block = ApkSigningBlockUtils.findSignature(this.mApk, this.mZipSections, this.mBlockId, this.mResult).signatureBlock;
            }
            ByteBuffer lengthPrefixedSlice = ApkSigningBlockUtils.getLengthPrefixedSlice(this.mApkSignatureSchemeV3Block);
            if (!lengthPrefixedSlice.hasRemaining()) {
                this.mResult.addError(ApkVerifier.Issue.V3_SIG_NO_SIGNERS, new Object[0]);
                return this.mResult;
            }
            try {
                CertificateFactory certificateFactory = CertificateFactory.getInstance("X.509");
                int i10 = 0;
                while (lengthPrefixedSlice.hasRemaining()) {
                    int i11 = i10 + 1;
                    ApkSigningBlockUtils.Result.SignerInfo signerInfo = new ApkSigningBlockUtils.Result.SignerInfo();
                    signerInfo.index = i10;
                    this.mResult.signers.add(signerInfo);
                    try {
                        parseSigner(ApkSigningBlockUtils.getLengthPrefixedSlice(lengthPrefixedSlice), certificateFactory, signerInfo);
                        i10 = i11;
                    } catch (ApkFormatException | BufferUnderflowException unused) {
                        signerInfo.addError(ApkVerifier.Issue.V3_SIG_MALFORMED_SIGNER, new Object[0]);
                        return this.mResult;
                    }
                }
                return this.mResult;
            } catch (CertificateException e10) {
                throw new RuntimeException("Failed to obtain X.509 CertificateFactory", e10);
            }
        } catch (ApkFormatException unused2) {
            this.mResult.addError(ApkVerifier.Issue.V3_SIG_MALFORMED_SIGNERS, new Object[0]);
            return this.mResult;
        }
    }

    public static class Builder {
        private DataSource mApk;
        private ByteBuffer mApkSignatureSchemeV3Block;
        private Set<ContentDigestAlgorithm> mContentDigestsToVerify;
        private int mMaxSdkVersion;
        private int mMinSdkVersion;
        private ApkSigningBlockUtils.Result mResult;
        private ApkUtils.ZipSections mZipSections;
        private RunnablesExecutor mExecutor = RunnablesExecutor.SINGLE_THREADED;
        private int mBlockId = -262969152;
        private boolean mFullVerification = true;
        private OptionalIntCompat mOptionalRotationMinSdkVersion = OptionalIntCompat.empty();

        public Builder(DataSource dataSource, ApkUtils.ZipSections zipSections, int i10, int i11) {
            this.mApk = dataSource;
            this.mZipSections = zipSections;
            this.mMinSdkVersion = i10;
            this.mMaxSdkVersion = i11;
        }

        public V3SchemeVerifier build() {
            int i10;
            int i11 = this.mBlockId;
            if (i11 == -262969152) {
                this.mMinSdkVersion = Math.max(this.mMinSdkVersion, 28);
                i10 = 3;
            } else {
                if (i11 != 462663009) {
                    throw new IllegalArgumentException(String.format("Unsupported APK Signature Scheme V3 block ID: 0x%08x", Integer.valueOf(this.mBlockId)));
                }
                this.mMinSdkVersion = this.mMaxSdkVersion;
                i10 = 31;
            }
            if (this.mResult == null) {
                this.mResult = new ApkSigningBlockUtils.Result(i10);
            }
            if (this.mContentDigestsToVerify == null) {
                this.mContentDigestsToVerify = new HashSet(1);
            }
            V3SchemeVerifier v3SchemeVerifier = new V3SchemeVerifier(this.mExecutor, this.mApk, this.mZipSections, this.mContentDigestsToVerify, this.mResult, this.mMinSdkVersion, this.mMaxSdkVersion, this.mBlockId, this.mOptionalRotationMinSdkVersion, this.mFullVerification);
            ByteBuffer byteBuffer = this.mApkSignatureSchemeV3Block;
            if (byteBuffer != null) {
                v3SchemeVerifier.mApkSignatureSchemeV3Block = byteBuffer;
            }
            return v3SchemeVerifier;
        }

        public Builder setBlockId(int i10) {
            this.mBlockId = i10;
            return this;
        }

        public Builder setContentDigestsToVerify(Set<ContentDigestAlgorithm> set) {
            this.mContentDigestsToVerify = set;
            return this;
        }

        public Builder setFullVerification(boolean z10) {
            this.mFullVerification = z10;
            return this;
        }

        public Builder setResult(ApkSigningBlockUtils.Result result) {
            this.mResult = result;
            return this;
        }

        public Builder setRotationMinSdkVersion(int i10) {
            this.mOptionalRotationMinSdkVersion = OptionalIntCompat.of(i10);
            return this;
        }

        public Builder setRunnablesExecutor(RunnablesExecutor runnablesExecutor) {
            this.mExecutor = runnablesExecutor;
            return this;
        }

        public Builder(ByteBuffer byteBuffer) {
            this.mApkSignatureSchemeV3Block = byteBuffer;
        }
    }
}
