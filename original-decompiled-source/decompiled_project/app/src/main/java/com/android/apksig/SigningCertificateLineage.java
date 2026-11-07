package com.android.apksig;

import com.android.apksig.DefaultApkSignerEngine;
import com.android.apksig.apk.ApkFormatException;
import com.android.apksig.apk.ApkUtils;
import com.android.apksig.internal.apk.ApkSigningBlockUtils;
import com.android.apksig.internal.apk.SignatureAlgorithm;
import com.android.apksig.internal.apk.SignatureInfo;
import com.android.apksig.internal.apk.v3.V3SchemeSigner;
import com.android.apksig.internal.apk.v3.V3SigningCertificateLineage;
import com.android.apksig.internal.util.ByteBufferUtils;
import com.android.apksig.internal.util.Pair;
import com.android.apksig.internal.util.RandomAccessFileDataSink;
import com.android.apksig.util.DataSink;
import com.android.apksig.util.DataSource;
import com.android.apksig.util.DataSources;
import com.android.apksig.zip.ZipFormatException;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.PrivateKey;
import java.security.SignatureException;
import java.security.cert.CertificateEncodingException;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public class SigningCertificateLineage {
    private static final int CURRENT_VERSION = 1;
    private static final int FIRST_VERSION = 1;
    public static final int MAGIC = 1056913873;
    private static final int PAST_CERT_AUTH = 16;
    private static final int PAST_CERT_INSTALLED_DATA = 1;
    private static final int PAST_CERT_PERMISSION = 4;
    private static final int PAST_CERT_ROLLBACK = 8;
    private static final int PAST_CERT_SHARED_USER_ID = 2;
    private final int mMinSdkVersion;
    private final List<V3SigningCertificateLineage.SigningCertificateNode> mSigningLineage;

    public static class Builder {
        private int mMinSdkVersion;
        private SignerCapabilities mNewCapabilities;
        private final SignerConfig mNewSignerConfig;
        private SignerCapabilities mOriginalCapabilities;
        private final SignerConfig mOriginalSignerConfig;

        public Builder(SignerConfig signerConfig, SignerConfig signerConfig2) {
            if (signerConfig == null || signerConfig2 == null) {
                throw new NullPointerException("Can't pass null SignerConfigs when constructing a new SigningCertificateLineage");
            }
            this.mOriginalSignerConfig = signerConfig;
            this.mNewSignerConfig = signerConfig2;
        }

        public SigningCertificateLineage build() throws NoSuchAlgorithmException, SignatureException, InvalidKeyException, CertificateEncodingException {
            if (this.mMinSdkVersion < 28) {
                this.mMinSdkVersion = 28;
            }
            if (this.mOriginalCapabilities == null) {
                this.mOriginalCapabilities = new SignerCapabilities.Builder().build();
            }
            if (this.mNewCapabilities == null) {
                this.mNewCapabilities = new SignerCapabilities.Builder().build();
            }
            return SigningCertificateLineage.createSigningLineage(this.mMinSdkVersion, this.mOriginalSignerConfig, this.mOriginalCapabilities, this.mNewSignerConfig, this.mNewCapabilities);
        }

        public Builder setMinSdkVersion(int i10) {
            this.mMinSdkVersion = i10;
            return this;
        }

        public Builder setNewCapabilities(SignerCapabilities signerCapabilities) {
            if (signerCapabilities == null) {
                throw new NullPointerException("signerCapabilities == null");
            }
            this.mNewCapabilities = signerCapabilities;
            return this;
        }

        public Builder setOriginalCapabilities(SignerCapabilities signerCapabilities) {
            if (signerCapabilities == null) {
                throw new NullPointerException("signerCapabilities == null");
            }
            this.mOriginalCapabilities = signerCapabilities;
            return this;
        }
    }

    public static class SignerCapabilities {
        private final int mCallerConfiguredFlags;
        private final int mFlags;

        /* JADX INFO: Access modifiers changed from: private */
        public int getFlags() {
            return this.mFlags;
        }

        public boolean equals(SignerCapabilities signerCapabilities) {
            return this.mFlags == signerCapabilities.mFlags;
        }

        public boolean hasAuth() {
            return (this.mFlags & 16) != 0;
        }

        public boolean hasInstalledData() {
            return (this.mFlags & 1) != 0;
        }

        public boolean hasPermission() {
            return (this.mFlags & 4) != 0;
        }

        public boolean hasRollback() {
            return (this.mFlags & 8) != 0;
        }

        public boolean hasSharedUid() {
            return (this.mFlags & 2) != 0;
        }

        public static class Builder {
            private int mCallerConfiguredFlags;
            private int mFlags;

            public Builder() {
                this.mFlags = SigningCertificateLineage.calculateDefaultFlags();
            }

            public SignerCapabilities build() {
                return new SignerCapabilities(this.mFlags, this.mCallerConfiguredFlags);
            }

            public Builder setAuth(boolean z10) {
                this.mCallerConfiguredFlags |= 16;
                if (z10) {
                    this.mFlags |= 16;
                    return this;
                }
                this.mFlags &= -17;
                return this;
            }

            public Builder setCallerConfiguredCapabilities(SignerCapabilities signerCapabilities) {
                this.mFlags = (signerCapabilities.mCallerConfiguredFlags & signerCapabilities.mFlags) | (this.mFlags & (~signerCapabilities.mCallerConfiguredFlags));
                return this;
            }

            public Builder setInstalledData(boolean z10) {
                this.mCallerConfiguredFlags |= 1;
                if (z10) {
                    this.mFlags |= 1;
                    return this;
                }
                this.mFlags &= -2;
                return this;
            }

            public Builder setPermission(boolean z10) {
                this.mCallerConfiguredFlags |= 4;
                if (z10) {
                    this.mFlags |= 4;
                    return this;
                }
                this.mFlags &= -5;
                return this;
            }

            public Builder setRollback(boolean z10) {
                this.mCallerConfiguredFlags |= 8;
                if (z10) {
                    this.mFlags |= 8;
                    return this;
                }
                this.mFlags &= -9;
                return this;
            }

            public Builder setSharedUid(boolean z10) {
                this.mCallerConfiguredFlags |= 2;
                if (z10) {
                    this.mFlags |= 2;
                    return this;
                }
                this.mFlags &= -3;
                return this;
            }

            public Builder(int i10) {
                this.mFlags = i10;
            }
        }

        private SignerCapabilities(int i10) {
            this(i10, 0);
        }

        private SignerCapabilities(int i10, int i11) {
            this.mFlags = i10;
            this.mCallerConfiguredFlags = i11;
        }
    }

    public static class SignerConfig {
        private final X509Certificate mCertificate;
        private final PrivateKey mPrivateKey;

        public static class Builder {
            private final X509Certificate mCertificate;
            private final PrivateKey mPrivateKey;

            public Builder(PrivateKey privateKey, X509Certificate x509Certificate) {
                this.mPrivateKey = privateKey;
                this.mCertificate = x509Certificate;
            }

            public SignerConfig build() {
                return new SignerConfig(this.mPrivateKey, this.mCertificate);
            }
        }

        public X509Certificate getCertificate() {
            return this.mCertificate;
        }

        public PrivateKey getPrivateKey() {
            return this.mPrivateKey;
        }

        private SignerConfig(PrivateKey privateKey, X509Certificate x509Certificate) {
            this.mPrivateKey = privateKey;
            this.mCertificate = x509Certificate;
        }
    }

    private SigningCertificateLineage(int i10, List<V3SigningCertificateLineage.SigningCertificateNode> list) {
        this.mMinSdkVersion = i10;
        this.mSigningLineage = list;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int calculateDefaultFlags() {
        return 23;
    }

    private static int calculateMinSdkVersion(List<V3SigningCertificateLineage.SigningCertificateNode> list) {
        int minSdkVersion;
        if (list == null) {
            throw new IllegalArgumentException("Can't calculate minimum SDK version of null nodes");
        }
        Iterator<V3SigningCertificateLineage.SigningCertificateNode> it = list.iterator();
        int i10 = 28;
        while (it.hasNext()) {
            SignatureAlgorithm signatureAlgorithm = it.next().sigAlgorithm;
            if (signatureAlgorithm != null && (minSdkVersion = signatureAlgorithm.getMinSdkVersion()) > i10) {
                i10 = minSdkVersion;
            }
        }
        return i10;
    }

    public static SigningCertificateLineage consolidateLineages(List<SigningCertificateLineage> list) {
        if (list == null || list.isEmpty()) {
            return null;
        }
        int i10 = 0;
        int i11 = 0;
        for (int i12 = 0; i12 < list.size(); i12++) {
            int size = list.get(i12).size();
            if (size > i11) {
                i10 = i12;
                i11 = size;
            }
        }
        List<V3SigningCertificateLineage.SigningCertificateNode> list2 = list.get(i10).mSigningLineage;
        for (int i13 = 0; i13 < list.size(); i13++) {
            if (i13 != i10) {
                List<V3SigningCertificateLineage.SigningCertificateNode> list3 = list.get(i13).mSigningLineage;
                if (!list3.equals(list2.subList(0, list3.size()))) {
                    throw new IllegalArgumentException("Inconsistent SigningCertificateLineages. Not all lineages are subsets of each other.");
                }
            }
        }
        return list.get(i10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static SigningCertificateLineage createSigningLineage(int i10, SignerConfig signerConfig, SignerCapabilities signerCapabilities, SignerConfig signerConfig2, SignerCapabilities signerCapabilities2) throws NoSuchAlgorithmException, SignatureException, InvalidKeyException, CertificateEncodingException {
        return new SigningCertificateLineage(i10, new ArrayList()).spawnFirstDescendant(signerConfig, signerCapabilities).spawnDescendant(signerConfig, signerConfig2, signerCapabilities2);
    }

    private SignatureAlgorithm getSignatureAlgorithm(SignerConfig signerConfig) throws InvalidKeyException {
        return V3SchemeSigner.getSuggestedSignatureAlgorithms(signerConfig.getCertificate().getPublicKey(), this.mMinSdkVersion, false, false).get(0);
    }

    private static SigningCertificateLineage read(ByteBuffer byteBuffer) throws IOException {
        ApkSigningBlockUtils.checkByteOrderLittleEndian(byteBuffer);
        if (byteBuffer.remaining() < 8) {
            throw new IllegalArgumentException("Improper SigningCertificateLineage format: insufficient data for header.");
        }
        if (byteBuffer.getInt() == 1056913873) {
            return read(byteBuffer, byteBuffer.getInt());
        }
        throw new IllegalArgumentException("Improper SigningCertificateLineage format: MAGIC header mismatch.");
    }

    public static SigningCertificateLineage readFromApkDataSource(DataSource dataSource) throws IOException, ApkFormatException {
        try {
            ApkUtils.ZipSections zipSectionsFindZipSections = ApkUtils.findZipSections(dataSource);
            ArrayList arrayList = new ArrayList();
            try {
                arrayList.add(ApkSigningBlockUtils.findSignature(dataSource, zipSectionsFindZipSections, 462663009, new ApkSigningBlockUtils.Result(31)));
            } catch (ApkSigningBlockUtils.SignatureNotFoundException unused) {
            }
            try {
                arrayList.add(ApkSigningBlockUtils.findSignature(dataSource, zipSectionsFindZipSections, -262969152, new ApkSigningBlockUtils.Result(3)));
            } catch (ApkSigningBlockUtils.SignatureNotFoundException unused2) {
            }
            if (arrayList.isEmpty()) {
                throw new IllegalArgumentException("The provided APK does not contain a valid V3 signature block.");
            }
            ArrayList arrayList2 = new ArrayList(1);
            int size = arrayList.size();
            int i10 = 0;
            while (i10 < size) {
                Object obj = arrayList.get(i10);
                i10++;
                ByteBuffer lengthPrefixedSlice = ApkSigningBlockUtils.getLengthPrefixedSlice(((SignatureInfo) obj).signatureBlock);
                while (lengthPrefixedSlice.hasRemaining()) {
                    try {
                        arrayList2.add(readFromSignedData(ApkSigningBlockUtils.getLengthPrefixedSlice(ApkSigningBlockUtils.getLengthPrefixedSlice(lengthPrefixedSlice))));
                    } catch (IllegalArgumentException unused3) {
                    }
                }
            }
            if (arrayList2.isEmpty()) {
                throw new IllegalArgumentException("The provided APK does not contain a valid lineage.");
            }
            return arrayList2.size() > 1 ? consolidateLineages(arrayList2) : (SigningCertificateLineage) arrayList2.get(0);
        } catch (ZipFormatException e10) {
            throw new ApkFormatException(e10.getMessage());
        }
    }

    public static SigningCertificateLineage readFromApkFile(File file) throws IOException, ApkFormatException {
        RandomAccessFile randomAccessFile = new RandomAccessFile(file, "r");
        try {
            SigningCertificateLineage fromApkDataSource = readFromApkDataSource(DataSources.asDataSource(randomAccessFile, 0L, randomAccessFile.length()));
            randomAccessFile.close();
            return fromApkDataSource;
        } catch (Throwable th2) {
            try {
                randomAccessFile.close();
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
            throw th2;
        }
    }

    public static SigningCertificateLineage readFromBytes(byte[] bArr) throws IOException {
        return readFromDataSource(DataSources.asDataSource(ByteBuffer.wrap(bArr)));
    }

    public static SigningCertificateLineage readFromDataSource(DataSource dataSource) throws IOException {
        if (dataSource == null) {
            throw new NullPointerException("dataSource == null");
        }
        ByteBuffer byteBuffer = dataSource.getByteBuffer(0L, (int) dataSource.size());
        byteBuffer.order(ByteOrder.LITTLE_ENDIAN);
        return read(byteBuffer);
    }

    public static SigningCertificateLineage readFromFile(File file) throws IOException {
        if (file != null) {
            return readFromDataSource(DataSources.asDataSource(new RandomAccessFile(file, "r")));
        }
        throw new NullPointerException("file == null");
    }

    public static SigningCertificateLineage readFromSignedData(ByteBuffer byteBuffer) throws IOException, ApkFormatException {
        ApkSigningBlockUtils.getLengthPrefixedSlice(byteBuffer);
        ApkSigningBlockUtils.getLengthPrefixedSlice(byteBuffer);
        byteBuffer.getInt();
        byteBuffer.getInt();
        ByteBuffer lengthPrefixedSlice = ApkSigningBlockUtils.getLengthPrefixedSlice(byteBuffer);
        ArrayList arrayList = new ArrayList(1);
        while (lengthPrefixedSlice.hasRemaining()) {
            ByteBuffer lengthPrefixedSlice2 = ApkSigningBlockUtils.getLengthPrefixedSlice(lengthPrefixedSlice);
            if (lengthPrefixedSlice2.getInt() == 1000370060) {
                arrayList.add(readFromV3AttributeValue(ByteBufferUtils.toByteArray(lengthPrefixedSlice2)));
            }
        }
        if (arrayList.isEmpty()) {
            throw new IllegalArgumentException("The signed data does not contain a valid lineage.");
        }
        return arrayList.size() > 1 ? consolidateLineages(arrayList) : (SigningCertificateLineage) arrayList.get(0);
    }

    public static SigningCertificateLineage readFromV3AttributeValue(byte[] bArr) throws IOException {
        List<V3SigningCertificateLineage.SigningCertificateNode> signingCertificateLineage = V3SigningCertificateLineage.readSigningCertificateLineage(ByteBuffer.wrap(bArr).order(ByteOrder.LITTLE_ENDIAN));
        return new SigningCertificateLineage(calculateMinSdkVersion(signingCertificateLineage), signingCertificateLineage);
    }

    private SigningCertificateLineage spawnFirstDescendant(SignerConfig signerConfig, SignerCapabilities signerCapabilities) {
        if (!this.mSigningLineage.isEmpty()) {
            throw new IllegalStateException("SigningCertificateLineage already has its first node");
        }
        try {
            getSignatureAlgorithm(signerConfig);
            return new SigningCertificateLineage(this.mMinSdkVersion, Collections.singletonList(new V3SigningCertificateLineage.SigningCertificateNode(signerConfig.getCertificate(), null, null, new byte[0], signerCapabilities.getFlags())));
        } catch (InvalidKeyException e10) {
            throw new IllegalArgumentException("Algorithm associated with first signing certificate invalid on desired platform versions", e10);
        }
    }

    private ByteBuffer write() {
        byte[] bArrEncodeSigningCertificateLineage = V3SigningCertificateLineage.encodeSigningCertificateLineage(this.mSigningLineage);
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(bArrEncodeSigningCertificateLineage.length + 12);
        byteBufferAllocate.order(ByteOrder.LITTLE_ENDIAN);
        byteBufferAllocate.putInt(MAGIC);
        byteBufferAllocate.putInt(1);
        byteBufferAllocate.putInt(bArrEncodeSigningCertificateLineage.length);
        byteBufferAllocate.put(bArrEncodeSigningCertificateLineage);
        byteBufferAllocate.flip();
        return byteBufferAllocate;
    }

    public byte[] encodeSigningCertificateLineage() {
        return V3SigningCertificateLineage.encodeSigningCertificateLineage(this.mSigningLineage);
    }

    public byte[] getBytes() {
        return write().array();
    }

    public List<X509Certificate> getCertificatesInLineage() {
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < this.mSigningLineage.size(); i10++) {
            arrayList.add(this.mSigningLineage.get(i10).signingCert);
        }
        return arrayList;
    }

    public SignerCapabilities getSignerCapabilities(SignerConfig signerConfig) {
        if (signerConfig != null) {
            return getSignerCapabilities(signerConfig.getCertificate());
        }
        throw new NullPointerException("config == null");
    }

    public SigningCertificateLineage getSubLineage(X509Certificate x509Certificate) {
        if (x509Certificate == null) {
            throw new NullPointerException("x509Certificate == null");
        }
        for (int i10 = 0; i10 < this.mSigningLineage.size(); i10++) {
            if (this.mSigningLineage.get(i10).signingCert.equals(x509Certificate)) {
                return new SigningCertificateLineage(this.mMinSdkVersion, new ArrayList(this.mSigningLineage.subList(0, i10 + 1)));
            }
        }
        throw new IllegalArgumentException("Certificate not found in SigningCertificateLineage");
    }

    public boolean isCertificateInLineage(X509Certificate x509Certificate) {
        if (x509Certificate == null) {
            throw new NullPointerException("cert == null");
        }
        for (int i10 = 0; i10 < this.mSigningLineage.size(); i10++) {
            if (this.mSigningLineage.get(i10).signingCert.equals(x509Certificate)) {
                return true;
            }
        }
        return false;
    }

    public boolean isSignerInLineage(SignerConfig signerConfig) {
        if (signerConfig != null) {
            return isCertificateInLineage(signerConfig.getCertificate());
        }
        throw new NullPointerException("config == null");
    }

    public int size() {
        return this.mSigningLineage.size();
    }

    public List<DefaultApkSignerEngine.SignerConfig> sortSignerConfigs(List<DefaultApkSignerEngine.SignerConfig> list) {
        if (list == null) {
            throw new NullPointerException("signerConfigs == null");
        }
        ArrayList arrayList = new ArrayList(list.size());
        for (int i10 = 0; i10 < this.mSigningLineage.size(); i10++) {
            int i11 = 0;
            while (true) {
                if (i11 < list.size()) {
                    DefaultApkSignerEngine.SignerConfig signerConfig = list.get(i11);
                    if (this.mSigningLineage.get(i10).signingCert.equals(signerConfig.getCertificates().get(0))) {
                        arrayList.add(signerConfig);
                        break;
                    }
                    i11++;
                }
            }
        }
        if (arrayList.size() == list.size()) {
            return arrayList;
        }
        throw new IllegalArgumentException("SignerConfigs supplied which are not present in the SigningCertificateLineage");
    }

    public SigningCertificateLineage spawnDescendant(SignerConfig signerConfig, SignerConfig signerConfig2) throws NoSuchAlgorithmException, SignatureException, InvalidKeyException, CertificateEncodingException {
        if (signerConfig == null || signerConfig2 == null) {
            throw new NullPointerException("can't add new descendant to lineage with null inputs");
        }
        return spawnDescendant(signerConfig, signerConfig2, new SignerCapabilities.Builder().build());
    }

    public void updateSignerCapabilities(SignerConfig signerConfig, SignerCapabilities signerCapabilities) {
        if (signerConfig == null) {
            throw new NullPointerException("config == null");
        }
        X509Certificate certificate = signerConfig.getCertificate();
        for (int i10 = 0; i10 < this.mSigningLineage.size(); i10++) {
            V3SigningCertificateLineage.SigningCertificateNode signingCertificateNode = this.mSigningLineage.get(i10);
            if (signingCertificateNode.signingCert.equals(certificate)) {
                signingCertificateNode.flags = new SignerCapabilities.Builder(signingCertificateNode.flags).setCallerConfiguredCapabilities(signerCapabilities).build().getFlags();
                return;
            }
        }
        throw new IllegalArgumentException("Certificate (" + certificate.getSubjectDN() + ") not found in the SigningCertificateLineage");
    }

    public void writeToDataSink(DataSink dataSink) throws IOException {
        if (dataSink == null) {
            throw new NullPointerException("dataSink == null");
        }
        dataSink.consume(write());
    }

    public void writeToFile(File file) throws IOException {
        if (file == null) {
            throw new NullPointerException("file == null");
        }
        writeToDataSink(new RandomAccessFileDataSink(new RandomAccessFile(file, "rw")));
    }

    public SignerCapabilities getSignerCapabilities(X509Certificate x509Certificate) {
        if (x509Certificate != null) {
            for (int i10 = 0; i10 < this.mSigningLineage.size(); i10++) {
                V3SigningCertificateLineage.SigningCertificateNode signingCertificateNode = this.mSigningLineage.get(i10);
                if (signingCertificateNode.signingCert.equals(x509Certificate)) {
                    return new SignerCapabilities.Builder(signingCertificateNode.flags).build();
                }
            }
            throw new IllegalArgumentException("Certificate (" + x509Certificate.getSubjectDN() + ") not found in the SigningCertificateLineage");
        }
        throw new NullPointerException("cert == null");
    }

    public SigningCertificateLineage spawnDescendant(SignerConfig signerConfig, SignerConfig signerConfig2, SignerCapabilities signerCapabilities) throws NoSuchAlgorithmException, SignatureException, InvalidKeyException, InvalidAlgorithmParameterException, CertificateEncodingException {
        if (signerConfig == null) {
            throw new NullPointerException("parent == null");
        }
        if (signerConfig2 == null) {
            throw new NullPointerException("child == null");
        }
        if (signerCapabilities != null) {
            if (!this.mSigningLineage.isEmpty()) {
                List<V3SigningCertificateLineage.SigningCertificateNode> list = this.mSigningLineage;
                V3SigningCertificateLineage.SigningCertificateNode signingCertificateNode = list.get(list.size() - 1);
                if (Arrays.equals(signingCertificateNode.signingCert.getEncoded(), signerConfig.getCertificate().getEncoded())) {
                    SignatureAlgorithm signatureAlgorithm = getSignatureAlgorithm(signerConfig);
                    ByteBuffer byteBufferWrap = ByteBuffer.wrap(V3SigningCertificateLineage.encodeSignedData(signerConfig2.getCertificate(), signatureAlgorithm.getId()));
                    byteBufferWrap.position(4);
                    ByteBuffer byteBufferAllocate = ByteBuffer.allocate(byteBufferWrap.remaining());
                    byteBufferAllocate.put(byteBufferWrap);
                    byte[] bArrArray = byteBufferAllocate.array();
                    ArrayList arrayList = new ArrayList(1);
                    arrayList.add(signerConfig.getCertificate());
                    ApkSigningBlockUtils.SignerConfig signerConfig3 = new ApkSigningBlockUtils.SignerConfig();
                    signerConfig3.privateKey = signerConfig.getPrivateKey();
                    signerConfig3.certificates = arrayList;
                    signerConfig3.signatureAlgorithms = Collections.singletonList(signatureAlgorithm);
                    List<Pair<Integer, byte[]>> listGenerateSignaturesOverData = ApkSigningBlockUtils.generateSignaturesOverData(signerConfig3, bArrArray);
                    SignatureAlgorithm signatureAlgorithmFindById = SignatureAlgorithm.findById(listGenerateSignaturesOverData.get(0).getFirst().intValue());
                    byte[] second = listGenerateSignaturesOverData.get(0).getSecond();
                    signingCertificateNode.sigAlgorithm = signatureAlgorithmFindById;
                    V3SigningCertificateLineage.SigningCertificateNode signingCertificateNode2 = new V3SigningCertificateLineage.SigningCertificateNode(signerConfig2.getCertificate(), signatureAlgorithmFindById, null, second, signerCapabilities.getFlags());
                    ArrayList arrayList2 = new ArrayList(this.mSigningLineage);
                    arrayList2.add(signingCertificateNode2);
                    return new SigningCertificateLineage(this.mMinSdkVersion, arrayList2);
                }
                throw new IllegalArgumentException("SignerConfig Certificate containing private key to sign the new SigningCertificateLineage record does not match the existing most recent record");
            }
            throw new IllegalArgumentException("Cannot spawn descendant signing certificate on an empty SigningCertificateLineage: no parent node");
        }
        throw new NullPointerException("childCapabilities == null");
    }

    private static SigningCertificateLineage read(ByteBuffer byteBuffer, int i10) throws IOException {
        if (i10 == 1) {
            try {
                List<V3SigningCertificateLineage.SigningCertificateNode> signingCertificateLineage = V3SigningCertificateLineage.readSigningCertificateLineage(ApkSigningBlockUtils.getLengthPrefixedSlice(byteBuffer));
                return new SigningCertificateLineage(calculateMinSdkVersion(signingCertificateLineage), signingCertificateLineage);
            } catch (ApkFormatException e10) {
                throw new IOException("Unable to read list of signing certificate nodes in SigningCertificateLineage", e10);
            }
        }
        throw new IllegalArgumentException("Improper SigningCertificateLineage format: unrecognized version.");
    }
}
