package com.android.apksig;

import c2.u;
import com.android.apksig.ApkSignerEngine;
import com.android.apksig.DefaultApkSignerEngine;
import com.android.apksig.Hints;
import com.android.apksig.apk.ApkFormatException;
import com.android.apksig.apk.ApkSigningBlockNotFoundException;
import com.android.apksig.apk.ApkUtils;
import com.android.apksig.apk.MinSdkVersionException;
import com.android.apksig.internal.util.ByteBufferDataSource;
import com.android.apksig.internal.zip.CentralDirectoryRecord;
import com.android.apksig.internal.zip.EocdRecord;
import com.android.apksig.internal.zip.LocalFileRecord;
import com.android.apksig.internal.zip.ZipUtils;
import com.android.apksig.util.DataSink;
import com.android.apksig.util.DataSinks;
import com.android.apksig.util.DataSource;
import com.android.apksig.util.DataSources;
import com.android.apksig.util.ReadableDataSink;
import com.android.apksig.zip.ZipFormatException;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.PrivateKey;
import java.security.SignatureException;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import m0.r;
import m3.a;

/* loaded from: classes.dex */
public class ApkSigner {
    private static final short ALIGNMENT_ZIP_EXTRA_DATA_FIELD_HEADER_ID = -9931;
    private static final short ALIGNMENT_ZIP_EXTRA_DATA_FIELD_MIN_SIZE_BYTES = 6;
    private static final short ANDROID_COMMON_PAGE_ALIGNMENT_BYTES = 4096;
    private static final short ANDROID_FILE_ALIGNMENT_BYTES = 4096;
    private static final String ANDROID_MANIFEST_ZIP_ENTRY_NAME = "AndroidManifest.xml";
    private final boolean mAlignFileSize;
    private final String mCreatedBy;
    private final boolean mDebuggableApkPermitted;
    private final boolean mForceSourceStampOverwrite;
    private final DataSource mInputApkDataSource;
    private final File mInputApkFile;
    private final Integer mMinSdkVersion;
    private final boolean mOtherSignersSignaturesPreserved;
    private final DataSink mOutputApkDataSink;
    private final DataSource mOutputApkDataSource;
    private final File mOutputApkFile;
    private final File mOutputV4File;
    private final int mRotationMinSdkVersion;
    private final boolean mRotationTargetsDevRelease;
    private final List<SignerConfig> mSignerConfigs;
    private final ApkSignerEngine mSignerEngine;
    private final SigningCertificateLineage mSigningCertificateLineage;
    private final SignerConfig mSourceStampSignerConfig;
    private final SigningCertificateLineage mSourceStampSigningCertificateLineage;
    private final boolean mV1SigningEnabled;
    private final boolean mV2SigningEnabled;
    private final boolean mV3SigningEnabled;
    private final boolean mV4ErrorReportingEnabled;
    private final boolean mV4SigningEnabled;
    private final boolean mVerityEnabled;

    /* renamed from: com.android.apksig.ApkSigner$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$android$apksig$ApkSignerEngine$InputJarEntryInstructions$OutputPolicy;

        static {
            int[] iArr = new int[ApkSignerEngine.InputJarEntryInstructions.OutputPolicy.values().length];
            $SwitchMap$com$android$apksig$ApkSignerEngine$InputJarEntryInstructions$OutputPolicy = iArr;
            try {
                iArr[ApkSignerEngine.InputJarEntryInstructions.OutputPolicy.OUTPUT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$android$apksig$ApkSignerEngine$InputJarEntryInstructions$OutputPolicy[ApkSignerEngine.InputJarEntryInstructions.OutputPolicy.OUTPUT_BY_ENGINE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$android$apksig$ApkSignerEngine$InputJarEntryInstructions$OutputPolicy[ApkSignerEngine.InputJarEntryInstructions.OutputPolicy.SKIP.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public static class OutputSizeAndDataOffset {
        public long dataOffsetBytes;
        public long outputBytes;

        public OutputSizeAndDataOffset(long j10, long j11) {
            this.outputBytes = j10;
            this.dataOffsetBytes = j11;
        }
    }

    public static class SignerConfig {
        private final List<X509Certificate> mCertificates;
        private boolean mDeterministicDsaSigning;
        private final String mName;
        private final PrivateKey mPrivateKey;

        public static class Builder {
            private final List<X509Certificate> mCertificates;
            private final boolean mDeterministicDsaSigning;
            private final String mName;
            private final PrivateKey mPrivateKey;

            public Builder(String str, PrivateKey privateKey, List<X509Certificate> list) {
                this(str, privateKey, list, false);
            }

            public SignerConfig build() {
                return new SignerConfig(this.mName, this.mPrivateKey, this.mCertificates, this.mDeterministicDsaSigning, null);
            }

            public Builder(String str, PrivateKey privateKey, List<X509Certificate> list, boolean z10) {
                if (str.isEmpty()) {
                    throw new IllegalArgumentException("Empty name");
                }
                this.mName = str;
                this.mPrivateKey = privateKey;
                this.mCertificates = new ArrayList(list);
                this.mDeterministicDsaSigning = z10;
            }
        }

        public /* synthetic */ SignerConfig(String str, PrivateKey privateKey, List list, boolean z10, AnonymousClass1 anonymousClass1) {
            this(str, privateKey, list, z10);
        }

        public List<X509Certificate> getCertificates() {
            return this.mCertificates;
        }

        public boolean getDeterministicDsaSigning() {
            return this.mDeterministicDsaSigning;
        }

        public String getName() {
            return this.mName;
        }

        public PrivateKey getPrivateKey() {
            return this.mPrivateKey;
        }

        private SignerConfig(String str, PrivateKey privateKey, List<X509Certificate> list, boolean z10) {
            this.mName = str;
            this.mPrivateKey = privateKey;
            this.mCertificates = Collections.unmodifiableList(new ArrayList(list));
            this.mDeterministicDsaSigning = z10;
        }
    }

    public /* synthetic */ ApkSigner(List list, SignerConfig signerConfig, SigningCertificateLineage signingCertificateLineage, boolean z10, Integer num, int i10, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15, boolean z16, boolean z17, boolean z18, boolean z19, boolean z20, String str, ApkSignerEngine apkSignerEngine, File file, DataSource dataSource, File file2, DataSink dataSink, DataSource dataSource2, File file3, SigningCertificateLineage signingCertificateLineage2, AnonymousClass1 anonymousClass1) {
        this(list, signerConfig, signingCertificateLineage, z10, num, i10, z11, z12, z13, z14, z15, z16, z17, z18, z19, z20, str, apkSignerEngine, file, dataSource, file2, dataSink, dataSource2, file3, signingCertificateLineage2);
    }

    private static ByteBuffer createExtraFieldToAlignData(ByteBuffer byteBuffer, long j10, int i10) {
        if (i10 <= 1) {
            return byteBuffer;
        }
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(byteBuffer.remaining() + 5 + i10);
        byteBufferAllocate.order(ByteOrder.LITTLE_ENDIAN);
        while (byteBuffer.remaining() >= 4) {
            short s10 = byteBuffer.getShort();
            int unsignedInt16 = ZipUtils.getUnsignedInt16(byteBuffer);
            if (unsignedInt16 > byteBuffer.remaining()) {
                break;
            }
            if ((s10 == 0 && unsignedInt16 == 0) || s10 == -9931) {
                byteBuffer.position(byteBuffer.position() + unsignedInt16);
            } else {
                byteBuffer.position(byteBuffer.position() - 4);
                int iLimit = byteBuffer.limit();
                byteBuffer.limit(byteBuffer.position() + 4 + unsignedInt16);
                byteBufferAllocate.put(byteBuffer);
                byteBuffer.limit(iLimit);
            }
        }
        int iPosition = (i10 - ((int) (((j10 + byteBufferAllocate.position()) + 6) % i10))) % i10;
        byteBufferAllocate.putShort(ALIGNMENT_ZIP_EXTRA_DATA_FIELD_HEADER_ID);
        ZipUtils.putUnsignedInt16(byteBufferAllocate, iPosition + 2);
        ZipUtils.putUnsignedInt16(byteBufferAllocate, i10);
        byteBufferAllocate.position(byteBufferAllocate.position() + iPosition);
        byteBufferAllocate.flip();
        return byteBufferAllocate;
    }

    private static List<Hints.PatternWithRange> extractPinPatterns(List<CentralDirectoryRecord> list, DataSource dataSource) throws IOException, ApkFormatException {
        CentralDirectoryRecord centralDirectoryRecordFindCdRecord = findCdRecord(list, Hints.PIN_HINT_ASSET_ZIP_ENTRY_NAME);
        if (centralDirectoryRecordFindCdRecord == null) {
            return null;
        }
        new ArrayList();
        try {
            return Hints.parsePinPatterns(LocalFileRecord.getUncompressedData(dataSource, centralDirectoryRecordFindCdRecord, dataSource.size()));
        } catch (ZipFormatException unused) {
            throw new ApkFormatException("Bad " + centralDirectoryRecordFindCdRecord);
        }
    }

    private static CentralDirectoryRecord findCdRecord(List<CentralDirectoryRecord> list, String str) {
        for (CentralDirectoryRecord centralDirectoryRecord : list) {
            if (str.equals(centralDirectoryRecord.getName())) {
                return centralDirectoryRecord;
            }
        }
        return null;
    }

    private static void fulfillInspectInputJarEntryRequest(DataSource dataSource, LocalFileRecord localFileRecord, ApkSignerEngine.InspectJarEntryRequest inspectJarEntryRequest) throws IOException, ApkFormatException {
        try {
            localFileRecord.outputUncompressedData(dataSource, inspectJarEntryRequest.getDataSink());
            inspectJarEntryRequest.done();
        } catch (ZipFormatException e10) {
            throw new ApkFormatException("Malformed ZIP entry: " + localFileRecord.getName(), e10);
        }
    }

    public static ByteBuffer getAndroidManifestFromApk(List<CentralDirectoryRecord> list, DataSource dataSource) throws IOException, ApkFormatException, ZipFormatException {
        CentralDirectoryRecord centralDirectoryRecordFindCdRecord = findCdRecord(list, "AndroidManifest.xml");
        if (centralDirectoryRecordFindCdRecord != null) {
            return ByteBuffer.wrap(LocalFileRecord.getUncompressedData(dataSource, centralDirectoryRecordFindCdRecord, dataSource.size()));
        }
        throw new ApkFormatException("Missing AndroidManifest.xml");
    }

    private static int getInputJarEntryDataAlignmentMultiple(LocalFileRecord localFileRecord) {
        if (localFileRecord.isDataCompressed()) {
            return 1;
        }
        ByteBuffer extra = localFileRecord.getExtra();
        if (extra.hasRemaining()) {
            extra.order(ByteOrder.LITTLE_ENDIAN);
            while (true) {
                if (extra.remaining() < 4) {
                    break;
                }
                short s10 = extra.getShort();
                int unsignedInt16 = ZipUtils.getUnsignedInt16(extra);
                if (unsignedInt16 > extra.remaining()) {
                    break;
                }
                if (s10 != -9931) {
                    extra.position(extra.position() + unsignedInt16);
                } else if (unsignedInt16 >= 2) {
                    return ZipUtils.getUnsignedInt16(extra);
                }
            }
        }
        return localFileRecord.getName().endsWith(".so") ? 4096 : 4;
    }

    private static int getMinSdkVersionFromApk(List<CentralDirectoryRecord> list, DataSource dataSource) throws MinSdkVersionException, IOException {
        try {
            return ApkUtils.getMinSdkVersionFromBinaryAndroidManifest(getAndroidManifestFromApk(list, dataSource));
        } catch (ApkFormatException | ZipFormatException e10) {
            throw new MinSdkVersionException("Failed to determine APK's minimum supported Android platform version", e10);
        }
    }

    private static ByteBuffer getZipCentralDirectory(DataSource dataSource, ApkUtils.ZipSections zipSections) throws IOException, ApkFormatException {
        long zipCentralDirectorySizeBytes = zipSections.getZipCentralDirectorySizeBytes();
        if (zipCentralDirectorySizeBytes > 2147483647L) {
            throw new ApkFormatException(r.a("ZIP Central Directory too large: ", zipCentralDirectorySizeBytes));
        }
        ByteBuffer byteBuffer = dataSource.getByteBuffer(zipSections.getZipCentralDirectoryOffset(), (int) zipCentralDirectorySizeBytes);
        byteBuffer.order(ByteOrder.LITTLE_ENDIAN);
        return byteBuffer;
    }

    private static long outputDataToOutputApk(String str, byte[] bArr, long j10, List<CentralDirectoryRecord> list, int i10, int i11, DataSink dataSink) throws IOException {
        ZipUtils.DeflateResult deflateResultDeflate = ZipUtils.deflate(ByteBuffer.wrap(bArr));
        byte[] bArr2 = deflateResultDeflate.output;
        long j11 = deflateResultDeflate.inputCrc32;
        long jOutputRecordWithDeflateCompressedData = LocalFileRecord.outputRecordWithDeflateCompressedData(str, i10, i11, bArr2, j11, bArr.length, dataSink);
        list.add(CentralDirectoryRecord.createWithDeflateCompressedData(str, i10, i11, j11, bArr2.length, bArr.length, j10));
        return jOutputRecordWithDeflateCompressedData;
    }

    private static OutputSizeAndDataOffset outputInputJarEntryLfhRecordPreservingDataAlignment(DataSource dataSource, LocalFileRecord localFileRecord, DataSink dataSink, long j10) throws IOException {
        long startOffsetInArchive = localFileRecord.getStartOffsetInArchive();
        if (startOffsetInArchive == j10) {
            return new OutputSizeAndDataOffset(localFileRecord.outputRecord(dataSource, dataSink), localFileRecord.getDataStartOffsetInRecord());
        }
        int inputJarEntryDataAlignmentMultiple = getInputJarEntryDataAlignmentMultiple(localFileRecord);
        if (inputJarEntryDataAlignmentMultiple > 1) {
            long j11 = inputJarEntryDataAlignmentMultiple;
            if (startOffsetInArchive % j11 != j10 % j11) {
                if ((startOffsetInArchive + localFileRecord.getDataStartOffsetInRecord()) % j11 != 0) {
                    return new OutputSizeAndDataOffset(localFileRecord.outputRecord(dataSource, dataSink), localFileRecord.getDataStartOffsetInRecord());
                }
                return new OutputSizeAndDataOffset(localFileRecord.outputRecordWithModifiedExtra(dataSource, createExtraFieldToAlignData(localFileRecord.getExtra(), j10 + localFileRecord.getExtraFieldStartOffsetInsideRecord(), inputJarEntryDataAlignmentMultiple), dataSink), (localFileRecord.getDataStartOffsetInRecord() + r12.remaining()) - localFileRecord.getExtra().remaining());
            }
        }
        return new OutputSizeAndDataOffset(localFileRecord.outputRecord(dataSource, dataSink), localFileRecord.getDataStartOffsetInRecord());
    }

    private static List<CentralDirectoryRecord> parseZipCentralDirectory(ByteBuffer byteBuffer, ApkUtils.ZipSections zipSections) throws ApkFormatException {
        long zipCentralDirectoryOffset = zipSections.getZipCentralDirectoryOffset();
        int zipCentralDirectoryRecordCount = zipSections.getZipCentralDirectoryRecordCount();
        ArrayList arrayList = new ArrayList(zipCentralDirectoryRecordCount);
        HashSet hashSet = new HashSet(zipCentralDirectoryRecordCount);
        for (int i10 = 0; i10 < zipCentralDirectoryRecordCount; i10++) {
            int iPosition = byteBuffer.position();
            try {
                CentralDirectoryRecord record = CentralDirectoryRecord.getRecord(byteBuffer);
                String name = record.getName();
                if (!hashSet.add(name)) {
                    throw new ApkFormatException(a.a("Multiple ZIP entries with the same name: ", name));
                }
                arrayList.add(record);
            } catch (ZipFormatException e10) {
                throw new ApkFormatException("Malformed ZIP Central Directory record #" + (i10 + 1) + " at file offset " + (zipCentralDirectoryOffset + iPosition), e10);
            }
        }
        if (!byteBuffer.hasRemaining()) {
            return arrayList;
        }
        throw new ApkFormatException("Unused space at the end of ZIP Central Directory: " + byteBuffer.remaining() + " bytes starting at file offset " + (zipCentralDirectoryOffset + byteBuffer.position()));
    }

    private static void requestOutputEntryInspection(ApkSignerEngine apkSignerEngine, String str, byte[] bArr) throws IllegalStateException, IOException {
        ApkSignerEngine.InspectJarEntryRequest inspectJarEntryRequestOutputJarEntry = apkSignerEngine.outputJarEntry(str);
        if (inspectJarEntryRequestOutputJarEntry != null) {
            inspectJarEntryRequestOutputJarEntry.getDataSink().consume(bArr, 0, bArr.length);
            inspectJarEntryRequestOutputJarEntry.done();
        }
    }

    public void sign() throws Throwable {
        RandomAccessFile randomAccessFile;
        Throwable th2;
        DataSource dataSourceAsDataSource;
        DataSource dataSourceAsDataSource2;
        RandomAccessFile randomAccessFile2 = null;
        try {
            DataSource dataSource = this.mInputApkDataSource;
            if (dataSource != null) {
                dataSourceAsDataSource = dataSource;
                randomAccessFile = null;
            } else {
                if (this.mInputApkFile == null) {
                    throw new IllegalStateException("Input APK not specified");
                }
                randomAccessFile = new RandomAccessFile(this.mInputApkFile, "r");
                try {
                    dataSourceAsDataSource = DataSources.asDataSource(randomAccessFile);
                } catch (Throwable th3) {
                    th2 = th3;
                    if (randomAccessFile != null) {
                        randomAccessFile.close();
                    }
                    throw th2;
                }
            }
            try {
                DataSink dataSink = this.mOutputApkDataSink;
                if (dataSink != null) {
                    dataSourceAsDataSource2 = this.mOutputApkDataSource;
                } else {
                    if (this.mOutputApkFile == null) {
                        throw new IllegalStateException("Output APK not specified");
                    }
                    RandomAccessFile randomAccessFile3 = new RandomAccessFile(this.mOutputApkFile, "rw");
                    try {
                        randomAccessFile3.setLength(0L);
                        DataSink dataSinkAsDataSink = DataSinks.asDataSink(randomAccessFile3);
                        dataSourceAsDataSource2 = DataSources.asDataSource(randomAccessFile3);
                        dataSink = dataSinkAsDataSink;
                        randomAccessFile2 = randomAccessFile3;
                    } catch (Throwable th4) {
                        th = th4;
                        randomAccessFile2 = randomAccessFile3;
                        if (randomAccessFile2 != null) {
                            randomAccessFile2.close();
                        }
                        throw th;
                    }
                }
                sign(dataSourceAsDataSource, dataSink, dataSourceAsDataSource2);
                if (randomAccessFile2 != null) {
                    randomAccessFile2.close();
                }
                if (randomAccessFile != null) {
                    randomAccessFile.close();
                }
            } catch (Throwable th5) {
                th = th5;
            }
        } catch (Throwable th6) {
            randomAccessFile = null;
            th2 = th6;
        }
    }

    private ApkSigner(List<SignerConfig> list, SignerConfig signerConfig, SigningCertificateLineage signingCertificateLineage, boolean z10, Integer num, int i10, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15, boolean z16, boolean z17, boolean z18, boolean z19, boolean z20, String str, ApkSignerEngine apkSignerEngine, File file, DataSource dataSource, File file2, DataSink dataSink, DataSource dataSource2, File file3, SigningCertificateLineage signingCertificateLineage2) {
        this.mSignerConfigs = list;
        this.mSourceStampSignerConfig = signerConfig;
        this.mSourceStampSigningCertificateLineage = signingCertificateLineage;
        this.mForceSourceStampOverwrite = z10;
        this.mMinSdkVersion = num;
        this.mRotationMinSdkVersion = i10;
        this.mRotationTargetsDevRelease = z11;
        this.mV1SigningEnabled = z12;
        this.mV2SigningEnabled = z13;
        this.mV3SigningEnabled = z14;
        this.mV4SigningEnabled = z15;
        this.mAlignFileSize = z16;
        this.mVerityEnabled = z17;
        this.mV4ErrorReportingEnabled = z18;
        this.mDebuggableApkPermitted = z19;
        this.mOtherSignersSignaturesPreserved = z20;
        this.mCreatedBy = str;
        this.mSignerEngine = apkSignerEngine;
        this.mInputApkFile = file;
        this.mInputApkDataSource = dataSource;
        this.mOutputApkFile = file2;
        this.mOutputApkDataSink = dataSink;
        this.mOutputApkDataSource = dataSource2;
        this.mOutputV4File = file3;
        this.mSigningCertificateLineage = signingCertificateLineage2;
    }

    public static class Builder {
        private boolean mAlignFileSize;
        private String mCreatedBy;
        private boolean mDebuggableApkPermitted;
        private boolean mForceSourceStampOverwrite;
        private DataSource mInputApkDataSource;
        private File mInputApkFile;
        private Integer mMinSdkVersion;
        private boolean mOtherSignersSignaturesPreserved;
        private DataSink mOutputApkDataSink;
        private DataSource mOutputApkDataSource;
        private File mOutputApkFile;
        private File mOutputV4File;
        private int mRotationMinSdkVersion;
        private boolean mRotationTargetsDevRelease;
        private final List<SignerConfig> mSignerConfigs;
        private final ApkSignerEngine mSignerEngine;
        private SigningCertificateLineage mSigningCertificateLineage;
        private SignerConfig mSourceStampSignerConfig;
        private SigningCertificateLineage mSourceStampSigningCertificateLineage;
        private boolean mV1SigningEnabled;
        private boolean mV2SigningEnabled;
        private boolean mV3SigningEnabled;
        private boolean mV3SigningExplicitlyDisabled;
        private boolean mV3SigningExplicitlyEnabled;
        private boolean mV4ErrorReportingEnabled;
        private boolean mV4SigningEnabled;
        private boolean mVerityEnabled;

        public Builder(List<SignerConfig> list) {
            this.mForceSourceStampOverwrite = false;
            this.mV1SigningEnabled = true;
            this.mV2SigningEnabled = true;
            this.mV3SigningEnabled = true;
            this.mV4SigningEnabled = true;
            this.mAlignFileSize = false;
            this.mVerityEnabled = false;
            this.mV4ErrorReportingEnabled = false;
            this.mDebuggableApkPermitted = true;
            this.mRotationMinSdkVersion = 33;
            this.mRotationTargetsDevRelease = false;
            this.mV3SigningExplicitlyDisabled = false;
            this.mV3SigningExplicitlyEnabled = false;
            if (list.isEmpty()) {
                throw new IllegalArgumentException("At least one signer config must be provided");
            }
            if (list.size() > 1) {
                this.mV3SigningEnabled = false;
            }
            this.mSignerConfigs = new ArrayList(list);
            this.mSignerEngine = null;
        }

        private void checkInitializedWithoutEngine() {
            if (this.mSignerEngine != null) {
                throw new IllegalStateException("Operation is not available when builder initialized with an engine");
            }
        }

        public ApkSigner build() {
            boolean z10 = this.mV3SigningExplicitlyDisabled;
            if (z10 && this.mV3SigningExplicitlyEnabled) {
                throw new IllegalStateException("Builder configured to both enable and disable APK Signature Scheme v3 signing");
            }
            if (z10) {
                this.mV3SigningEnabled = false;
            }
            if (this.mV3SigningExplicitlyEnabled) {
                this.mV3SigningEnabled = true;
            }
            if (this.mV4SigningEnabled && !this.mV2SigningEnabled && !this.mV3SigningEnabled) {
                if (this.mV4ErrorReportingEnabled) {
                    throw new IllegalStateException("APK Signature Scheme v4 signing requires at least v2 or v3 signing to be enabled");
                }
                this.mV4SigningEnabled = false;
            }
            return new ApkSigner(this.mSignerConfigs, this.mSourceStampSignerConfig, this.mSourceStampSigningCertificateLineage, this.mForceSourceStampOverwrite, this.mMinSdkVersion, this.mRotationMinSdkVersion, this.mRotationTargetsDevRelease, this.mV1SigningEnabled, this.mV2SigningEnabled, this.mV3SigningEnabled, this.mV4SigningEnabled, this.mAlignFileSize, this.mVerityEnabled, this.mV4ErrorReportingEnabled, this.mDebuggableApkPermitted, this.mOtherSignersSignaturesPreserved, this.mCreatedBy, this.mSignerEngine, this.mInputApkFile, this.mInputApkDataSource, this.mOutputApkFile, this.mOutputApkDataSink, this.mOutputApkDataSource, this.mOutputV4File, this.mSigningCertificateLineage, null);
        }

        public Builder setAlignFileSize(boolean z10) {
            checkInitializedWithoutEngine();
            this.mAlignFileSize = z10;
            return this;
        }

        public Builder setCreatedBy(String str) {
            checkInitializedWithoutEngine();
            str.getClass();
            this.mCreatedBy = str;
            return this;
        }

        public Builder setDebuggableApkPermitted(boolean z10) {
            checkInitializedWithoutEngine();
            this.mDebuggableApkPermitted = z10;
            return this;
        }

        public Builder setForceSourceStampOverwrite(boolean z10) {
            this.mForceSourceStampOverwrite = z10;
            return this;
        }

        public Builder setInputApk(File file) {
            if (file == null) {
                throw new NullPointerException("inputApk == null");
            }
            this.mInputApkFile = file;
            this.mInputApkDataSource = null;
            return this;
        }

        public Builder setMinSdkVersion(int i10) {
            checkInitializedWithoutEngine();
            this.mMinSdkVersion = Integer.valueOf(i10);
            return this;
        }

        public Builder setMinSdkVersionForRotation(int i10) {
            checkInitializedWithoutEngine();
            if (i10 < 33) {
                this.mRotationMinSdkVersion = 28;
                return this;
            }
            this.mRotationMinSdkVersion = i10;
            return this;
        }

        public Builder setOtherSignersSignaturesPreserved(boolean z10) {
            checkInitializedWithoutEngine();
            this.mOtherSignersSignaturesPreserved = z10;
            return this;
        }

        public Builder setOutputApk(File file) {
            if (file == null) {
                throw new NullPointerException("outputApk == null");
            }
            this.mOutputApkFile = file;
            this.mOutputApkDataSink = null;
            this.mOutputApkDataSource = null;
            return this;
        }

        public Builder setRotationTargetsDevRelease(boolean z10) {
            checkInitializedWithoutEngine();
            this.mRotationTargetsDevRelease = z10;
            return this;
        }

        public Builder setSigningCertificateLineage(SigningCertificateLineage signingCertificateLineage) {
            if (signingCertificateLineage != null) {
                this.mV3SigningEnabled = true;
                this.mSigningCertificateLineage = signingCertificateLineage;
            }
            return this;
        }

        public Builder setSourceStampSignerConfig(SignerConfig signerConfig) {
            this.mSourceStampSignerConfig = signerConfig;
            return this;
        }

        public Builder setSourceStampSigningCertificateLineage(SigningCertificateLineage signingCertificateLineage) {
            this.mSourceStampSigningCertificateLineage = signingCertificateLineage;
            return this;
        }

        public Builder setV1SigningEnabled(boolean z10) {
            checkInitializedWithoutEngine();
            this.mV1SigningEnabled = z10;
            return this;
        }

        public Builder setV2SigningEnabled(boolean z10) {
            checkInitializedWithoutEngine();
            this.mV2SigningEnabled = z10;
            return this;
        }

        public Builder setV3SigningEnabled(boolean z10) {
            checkInitializedWithoutEngine();
            this.mV3SigningEnabled = z10;
            if (z10) {
                this.mV3SigningExplicitlyEnabled = true;
                return this;
            }
            this.mV3SigningExplicitlyDisabled = true;
            return this;
        }

        public Builder setV4ErrorReportingEnabled(boolean z10) {
            checkInitializedWithoutEngine();
            this.mV4ErrorReportingEnabled = z10;
            return this;
        }

        public Builder setV4SignatureOutputFile(File file) {
            if (file == null) {
                throw new NullPointerException("v4HashRootOutputFile == null");
            }
            this.mOutputV4File = file;
            return this;
        }

        public Builder setV4SigningEnabled(boolean z10) {
            checkInitializedWithoutEngine();
            this.mV4SigningEnabled = z10;
            this.mV4ErrorReportingEnabled = z10;
            return this;
        }

        public Builder setVerityEnabled(boolean z10) {
            checkInitializedWithoutEngine();
            this.mVerityEnabled = z10;
            return this;
        }

        public Builder setInputApk(DataSource dataSource) {
            if (dataSource != null) {
                this.mInputApkDataSource = dataSource;
                this.mInputApkFile = null;
                return this;
            }
            throw new NullPointerException("inputApk == null");
        }

        public Builder setOutputApk(ReadableDataSink readableDataSink) {
            if (readableDataSink != null) {
                return setOutputApk(readableDataSink, readableDataSink);
            }
            throw new NullPointerException("outputApk == null");
        }

        public Builder setOutputApk(DataSink dataSink, DataSource dataSource) {
            if (dataSink == null) {
                throw new NullPointerException("outputApkOut == null");
            }
            if (dataSource != null) {
                this.mOutputApkFile = null;
                this.mOutputApkDataSink = dataSink;
                this.mOutputApkDataSource = dataSource;
                return this;
            }
            throw new NullPointerException("outputApkIn == null");
        }

        public Builder(ApkSignerEngine apkSignerEngine) {
            this.mForceSourceStampOverwrite = false;
            this.mV1SigningEnabled = true;
            this.mV2SigningEnabled = true;
            this.mV3SigningEnabled = true;
            this.mV4SigningEnabled = true;
            this.mAlignFileSize = false;
            this.mVerityEnabled = false;
            this.mV4ErrorReportingEnabled = false;
            this.mDebuggableApkPermitted = true;
            this.mRotationMinSdkVersion = 33;
            this.mRotationTargetsDevRelease = false;
            this.mV3SigningExplicitlyDisabled = false;
            this.mV3SigningExplicitlyEnabled = false;
            if (apkSignerEngine != null) {
                this.mSignerEngine = apkSignerEngine;
                this.mSignerConfigs = null;
                return;
            }
            throw new NullPointerException("signerEngine == null");
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:112:0x02df  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x02ff  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0318  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x031d  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0325  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x034b  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x036e  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x001e  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x03a6  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x03b2 A[LOOP:4: B:147:0x03b0->B:148:0x03b2, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:151:0x03c8  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x047c  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0138  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void sign(DataSource dataSource, DataSink dataSink, DataSource dataSource2) throws IllegalStateException, SignatureException, NoSuchAlgorithmException, IOException, InvalidKeyException, ApkFormatException {
        long zipCentralDirectoryOffset;
        DataSource contents;
        ArrayList arrayList;
        ApkSignerEngine apkSignerEngineBuild;
        int minSdkVersionFromApk;
        long j10;
        ApkSignerEngine apkSignerEngine;
        int size;
        int i10;
        long j11;
        int i11;
        long size2;
        Iterator<CentralDirectoryRecord> it;
        int i12;
        ApkSignerEngine.OutputJarSignatureRequest outputJarSignatureRequestOutputJarEntries;
        DataSink dataSink2;
        int size3;
        long size4;
        int i13;
        boolean z10;
        ApkUtils.ZipSections zipSections;
        long j12;
        ArrayList arrayList2;
        int i14;
        byte[] bArr;
        CentralDirectoryRecord centralDirectoryRecord;
        List<Hints.PatternWithRange> list;
        DataSink dataSink3;
        int i15;
        int i16;
        DataSource dataSource3;
        long j13;
        byte[] bArr2;
        long j14;
        int i17;
        LocalFileRecord localFileRecord;
        Hints.ByteRange byteRangeClampToAbsoluteByteRange;
        try {
            ApkUtils.ZipSections zipSectionsFindZipSections = ApkUtils.findZipSections(dataSource);
            try {
                ApkUtils.ApkSigningBlock apkSigningBlockFindApkSigningBlock = ApkUtils.findApkSigningBlock(dataSource, zipSectionsFindZipSections);
                zipCentralDirectoryOffset = apkSigningBlockFindApkSigningBlock.getStartOffset();
                try {
                    contents = apkSigningBlockFindApkSigningBlock.getContents();
                } catch (ApkSigningBlockNotFoundException unused) {
                    contents = null;
                    if (zipCentralDirectoryOffset == -1) {
                    }
                    long j15 = 0;
                    DataSource dataSourceSlice = dataSource.slice(0L, zipCentralDirectoryOffset);
                    List<CentralDirectoryRecord> zipCentralDirectory = parseZipCentralDirectory(getZipCentralDirectory(dataSource, zipSectionsFindZipSections), zipSectionsFindZipSections);
                    List<Hints.PatternWithRange> listExtractPinPatterns = extractPinPatterns(zipCentralDirectory, dataSourceSlice);
                    if (listExtractPinPatterns != null) {
                    }
                    apkSignerEngineBuild = this.mSignerEngine;
                    if (apkSignerEngineBuild == null) {
                    }
                    apkSignerEngine = apkSignerEngineBuild;
                    if (contents != null) {
                    }
                    ArrayList arrayList3 = new ArrayList(zipCentralDirectory);
                    Collections.sort(arrayList3, CentralDirectoryRecord.BY_LOCAL_FILE_HEADER_OFFSET_COMPARATOR);
                    HashMap map = new HashMap(zipCentralDirectory.size());
                    size = arrayList3.size();
                    int i18 = -1;
                    int i19 = -1;
                    char c10 = 65535;
                    i10 = 0;
                    boolean z11 = false;
                    j11 = j10;
                    long j16 = j11;
                    byte[] uncompressedData = null;
                    while (i10 < size) {
                    }
                    i11 = i18;
                    int i20 = i19;
                    ApkUtils.ZipSections zipSections2 = zipSectionsFindZipSections;
                    byte[] bArr3 = uncompressedData;
                    DataSource dataSource4 = dataSourceSlice;
                    size2 = dataSource4.size();
                    if (j11 < size2) {
                    }
                    long jOutputDataToOutputApk = j16;
                    ArrayList arrayList4 = new ArrayList(zipCentralDirectory.size() + 10);
                    it = zipCentralDirectory.iterator();
                    while (it.hasNext()) {
                    }
                    if (i11 != -1) {
                    }
                    int i21 = i11;
                    if (apkSignerEngine.isEligibleForSourceStamp()) {
                    }
                    if (arrayList != null) {
                    }
                    outputJarSignatureRequestOutputJarEntries = apkSignerEngine.outputJarEntries();
                    if (outputJarSignatureRequestOutputJarEntries == null) {
                    }
                    long j17 = jOutputDataToOutputApk;
                    size3 = arrayList4.size();
                    size4 = j10;
                    i13 = 0;
                    while (i13 < size3) {
                    }
                    if (size4 > 2147483647L) {
                    }
                }
            } catch (ApkSigningBlockNotFoundException unused2) {
                zipCentralDirectoryOffset = -1;
            }
            if (zipCentralDirectoryOffset == -1) {
                zipCentralDirectoryOffset = zipSectionsFindZipSections.getZipCentralDirectoryOffset();
            }
            long j152 = 0;
            DataSource dataSourceSlice2 = dataSource.slice(0L, zipCentralDirectoryOffset);
            List<CentralDirectoryRecord> zipCentralDirectory2 = parseZipCentralDirectory(getZipCentralDirectory(dataSource, zipSectionsFindZipSections), zipSectionsFindZipSections);
            List<Hints.PatternWithRange> listExtractPinPatterns2 = extractPinPatterns(zipCentralDirectory2, dataSourceSlice2);
            arrayList = listExtractPinPatterns2 != null ? null : new ArrayList();
            apkSignerEngineBuild = this.mSignerEngine;
            if (apkSignerEngineBuild == null) {
                j10 = 0;
            } else {
                Integer num = this.mMinSdkVersion;
                if (num != null) {
                    minSdkVersionFromApk = num.intValue();
                } else {
                    minSdkVersionFromApk = getMinSdkVersionFromApk(zipCentralDirectory2, dataSourceSlice2);
                }
                ArrayList arrayList5 = new ArrayList(this.mSignerConfigs.size());
                for (SignerConfig signerConfig : this.mSignerConfigs) {
                    arrayList5.add(new DefaultApkSignerEngine.SignerConfig.Builder(signerConfig.getName(), signerConfig.getPrivateKey(), signerConfig.getCertificates(), signerConfig.getDeterministicDsaSigning()).build());
                    j152 = j152;
                }
                j10 = j152;
                DefaultApkSignerEngine.Builder rotationTargetsDevRelease = new DefaultApkSignerEngine.Builder(arrayList5, minSdkVersionFromApk).setV1SigningEnabled(this.mV1SigningEnabled).setV2SigningEnabled(this.mV2SigningEnabled).setV3SigningEnabled(this.mV3SigningEnabled).setVerityEnabled(this.mVerityEnabled).setDebuggableApkPermitted(this.mDebuggableApkPermitted).setOtherSignersSignaturesPreserved(this.mOtherSignersSignaturesPreserved).setSigningCertificateLineage(this.mSigningCertificateLineage).setMinSdkVersionForRotation(this.mRotationMinSdkVersion).setRotationTargetsDevRelease(this.mRotationTargetsDevRelease);
                String str = this.mCreatedBy;
                if (str != null) {
                    rotationTargetsDevRelease.setCreatedBy(str);
                }
                SignerConfig signerConfig2 = this.mSourceStampSignerConfig;
                if (signerConfig2 != null) {
                    rotationTargetsDevRelease.setStampSignerConfig(new DefaultApkSignerEngine.SignerConfig.Builder(signerConfig2.getName(), this.mSourceStampSignerConfig.getPrivateKey(), this.mSourceStampSignerConfig.getCertificates(), this.mSourceStampSignerConfig.getDeterministicDsaSigning()).build());
                }
                SigningCertificateLineage signingCertificateLineage = this.mSourceStampSigningCertificateLineage;
                if (signingCertificateLineage != null) {
                    rotationTargetsDevRelease.setSourceStampSigningCertificateLineage(signingCertificateLineage);
                }
                apkSignerEngineBuild = rotationTargetsDevRelease.build();
            }
            apkSignerEngine = apkSignerEngineBuild;
            if (contents != null) {
                apkSignerEngine.inputApkSigningBlock(contents);
            }
            ArrayList arrayList32 = new ArrayList(zipCentralDirectory2);
            Collections.sort(arrayList32, CentralDirectoryRecord.BY_LOCAL_FILE_HEADER_OFFSET_COMPARATOR);
            HashMap map2 = new HashMap(zipCentralDirectory2.size());
            size = arrayList32.size();
            int i182 = -1;
            int i192 = -1;
            char c102 = 65535;
            i10 = 0;
            boolean z112 = false;
            j11 = j10;
            long j162 = j11;
            byte[] uncompressedData2 = null;
            while (i10 < size) {
                int i22 = i10 + 1;
                CentralDirectoryRecord centralDirectoryRecord2 = (CentralDirectoryRecord) arrayList32.get(i10);
                String name = centralDirectoryRecord2.getName();
                long j18 = j11;
                if (!Hints.PIN_BYTE_RANGE_ZIP_ENTRY_NAME.equals(name)) {
                    if ("stamp-cert-sha256".equals(name)) {
                        try {
                            uncompressedData2 = LocalFileRecord.getUncompressedData(dataSourceSlice2, centralDirectoryRecord2, dataSourceSlice2.size());
                        } catch (ZipFormatException unused3) {
                            throw new ApkFormatException("Bad source stamp entry");
                        }
                    } else {
                        ApkSignerEngine.InputJarEntryInstructions inputJarEntryInstructionsInputJarEntry = apkSignerEngine.inputJarEntry(name);
                        int i23 = AnonymousClass1.$SwitchMap$com$android$apksig$ApkSignerEngine$InputJarEntryInstructions$OutputPolicy[inputJarEntryInstructionsInputJarEntry.getOutputPolicy().ordinal()];
                        if (i23 == 1) {
                            z10 = true;
                        } else {
                            if (i23 != 2 && i23 != 3) {
                                throw new RuntimeException("Unknown output policy: " + inputJarEntryInstructionsInputJarEntry.getOutputPolicy());
                            }
                            z10 = z112;
                        }
                        long localFileHeaderOffset = centralDirectoryRecord2.getLocalFileHeaderOffset();
                        if (localFileHeaderOffset > j18) {
                            int i24 = i182;
                            long j19 = localFileHeaderOffset - j18;
                            zipSections = zipSectionsFindZipSections;
                            arrayList2 = arrayList32;
                            centralDirectoryRecord = centralDirectoryRecord2;
                            dataSink3 = dataSink;
                            List<Hints.PatternWithRange> list2 = listExtractPinPatterns2;
                            i15 = i192;
                            i14 = size;
                            bArr = uncompressedData2;
                            list = list2;
                            dataSourceSlice2.feed(j18, j19, dataSink3);
                            j162 += j19;
                            i16 = i24;
                            j12 = localFileHeaderOffset;
                        } else {
                            zipSections = zipSectionsFindZipSections;
                            j12 = j18;
                            arrayList2 = arrayList32;
                            i14 = size;
                            bArr = uncompressedData2;
                            centralDirectoryRecord = centralDirectoryRecord2;
                            list = listExtractPinPatterns2;
                            dataSink3 = dataSink;
                            i15 = i192;
                            i16 = i182;
                        }
                        long j20 = j162;
                        try {
                            LocalFileRecord record = LocalFileRecord.getRecord(dataSourceSlice2, centralDirectoryRecord, dataSourceSlice2.size());
                            long size5 = record.getSize() + j12;
                            ApkSignerEngine.InspectJarEntryRequest inspectJarEntryRequest = inputJarEntryInstructionsInputJarEntry.getInspectJarEntryRequest();
                            if (inspectJarEntryRequest != null) {
                                fulfillInspectInputJarEntryRequest(dataSourceSlice2, record, inspectJarEntryRequest);
                            }
                            if (z10) {
                                int lastModificationDate = centralDirectoryRecord.getLastModificationDate();
                                j13 = size5;
                                int lastModificationTime = centralDirectoryRecord.getLastModificationTime();
                                int i25 = i16;
                                bArr2 = bArr;
                                if (i25 == -1 || lastModificationDate > i25 || (lastModificationDate == i25 && lastModificationTime > i15)) {
                                    i25 = lastModificationDate;
                                } else {
                                    lastModificationTime = i15;
                                }
                                ApkSignerEngine.InspectJarEntryRequest inspectJarEntryRequestOutputJarEntry = apkSignerEngine.outputJarEntry(name);
                                if (inspectJarEntryRequestOutputJarEntry != null) {
                                    fulfillInspectInputJarEntryRequest(dataSourceSlice2, record, inspectJarEntryRequestOutputJarEntry);
                                }
                                OutputSizeAndDataOffset outputSizeAndDataOffsetOutputInputJarEntryLfhRecordPreservingDataAlignment = outputInputJarEntryLfhRecordPreservingDataAlignment(dataSourceSlice2, record, dataSink3, j20);
                                dataSource3 = dataSourceSlice2;
                                int i26 = lastModificationTime;
                                j14 = outputSizeAndDataOffsetOutputInputJarEntryLfhRecordPreservingDataAlignment.outputBytes + j20;
                                long j21 = outputSizeAndDataOffsetOutputInputJarEntryLfhRecordPreservingDataAlignment.dataOffsetBytes + j20;
                                if (list != null) {
                                    boolean z12 = false;
                                    for (Hints.PatternWithRange patternWithRange : list) {
                                        int i27 = i25;
                                        LocalFileRecord localFileRecord2 = record;
                                        if (patternWithRange.matcher(centralDirectoryRecord.getName()).matches() && (byteRangeClampToAbsoluteByteRange = patternWithRange.ClampToAbsoluteByteRange(new Hints.ByteRange(j21, j14))) != null) {
                                            arrayList.add(byteRangeClampToAbsoluteByteRange);
                                            z12 = true;
                                        }
                                        record = localFileRecord2;
                                        i25 = i27;
                                    }
                                    i17 = i25;
                                    localFileRecord = record;
                                    if (z12) {
                                        arrayList.add(new Hints.ByteRange(j20, j21));
                                    }
                                } else {
                                    i17 = i25;
                                    localFileRecord = record;
                                }
                                map2.put(name, j20 == localFileRecord.getStartOffsetInArchive() ? centralDirectoryRecord : centralDirectoryRecord.createWithModifiedLocalFileHeaderOffset(j20));
                                i192 = i26;
                                i182 = i17;
                            } else {
                                dataSource3 = dataSourceSlice2;
                                j13 = size5;
                                int i28 = i16;
                                bArr2 = bArr;
                                j14 = j20;
                                i192 = i15;
                                i182 = i28;
                            }
                            long j22 = j13;
                            j162 = j14;
                            j11 = j22;
                            dataSourceSlice2 = dataSource3;
                            listExtractPinPatterns2 = list;
                            arrayList32 = arrayList2;
                            i10 = i22;
                            size = i14;
                            uncompressedData2 = bArr2;
                            zipSectionsFindZipSections = zipSections;
                            c102 = 65535;
                            z112 = false;
                        } catch (ZipFormatException e10) {
                            throw new ApkFormatException("Malformed ZIP entry: " + centralDirectoryRecord.getName(), e10);
                        }
                    }
                }
                i10 = i22;
                j11 = j18;
            }
            i11 = i182;
            int i202 = i192;
            ApkUtils.ZipSections zipSections22 = zipSectionsFindZipSections;
            byte[] bArr32 = uncompressedData2;
            DataSource dataSource42 = dataSourceSlice2;
            size2 = dataSource42.size();
            if (j11 < size2) {
                long j23 = size2 - j11;
                dataSource42.feed(j11, j23, dataSink);
                j162 += j23;
            }
            long jOutputDataToOutputApk2 = j162;
            ArrayList arrayList42 = new ArrayList(zipCentralDirectory2.size() + 10);
            it = zipCentralDirectory2.iterator();
            while (it.hasNext()) {
                CentralDirectoryRecord centralDirectoryRecord3 = (CentralDirectoryRecord) map2.get(it.next().getName());
                if (centralDirectoryRecord3 != null) {
                    arrayList42.add(centralDirectoryRecord3);
                }
            }
            if (i11 != -1) {
                i11 = 14881;
                i12 = 0;
            } else {
                i12 = i202;
            }
            int i212 = i11;
            if (apkSignerEngine.isEligibleForSourceStamp()) {
                byte[] bArrGenerateSourceStampCertificateDigest = apkSignerEngine.generateSourceStampCertificateDigest();
                if (!this.mForceSourceStampOverwrite && bArr32 != null && !Arrays.equals(bArrGenerateSourceStampCertificateDigest, bArr32)) {
                    throw new ApkFormatException("Cannot generate SourceStamp. APK contains an existing entry with the name: stamp-cert-sha256, and it is different than the provided source stamp certificate");
                }
                jOutputDataToOutputApk2 += outputDataToOutputApk("stamp-cert-sha256", bArrGenerateSourceStampCertificateDigest, jOutputDataToOutputApk2, arrayList42, i12, i212, dataSink);
            }
            if (arrayList != null) {
                arrayList.add(new Hints.ByteRange(jOutputDataToOutputApk2, Long.MAX_VALUE));
                byte[] bArrEncodeByteRangeList = Hints.encodeByteRangeList(arrayList);
                requestOutputEntryInspection(apkSignerEngine, Hints.PIN_BYTE_RANGE_ZIP_ENTRY_NAME, bArrEncodeByteRangeList);
                jOutputDataToOutputApk2 += outputDataToOutputApk(Hints.PIN_BYTE_RANGE_ZIP_ENTRY_NAME, bArrEncodeByteRangeList, jOutputDataToOutputApk2, arrayList42, i12, i212, dataSink);
            }
            outputJarSignatureRequestOutputJarEntries = apkSignerEngine.outputJarEntries();
            if (outputJarSignatureRequestOutputJarEntries == null) {
                for (ApkSignerEngine.OutputJarSignatureRequest.JarEntry jarEntry : outputJarSignatureRequestOutputJarEntries.getAdditionalJarEntries()) {
                    String name2 = jarEntry.getName();
                    byte[] data = jarEntry.getData();
                    requestOutputEntryInspection(apkSignerEngine, name2, data);
                    jOutputDataToOutputApk2 += outputDataToOutputApk(name2, data, jOutputDataToOutputApk2, arrayList42, i12, i212, dataSink);
                    i12 = i12;
                    i212 = i212;
                }
                dataSink2 = dataSink;
                outputJarSignatureRequestOutputJarEntries.done();
            } else {
                dataSink2 = dataSink;
            }
            long j172 = jOutputDataToOutputApk2;
            size3 = arrayList42.size();
            size4 = j10;
            i13 = 0;
            while (i13 < size3) {
                Object obj = arrayList42.get(i13);
                i13++;
                size4 += ((CentralDirectoryRecord) obj).getSize();
            }
            if (size4 > 2147483647L) {
                ByteBuffer byteBufferAllocate = ByteBuffer.allocate((int) size4);
                int size6 = arrayList42.size();
                int i29 = 0;
                while (i29 < size6) {
                    Object obj2 = arrayList42.get(i29);
                    i29++;
                    ((CentralDirectoryRecord) obj2).copyTo(byteBufferAllocate);
                }
                byteBufferAllocate.flip();
                ByteBufferDataSource byteBufferDataSource = new ByteBufferDataSource(byteBufferAllocate);
                ByteBuffer byteBufferCreateWithModifiedCentralDirectoryInfo = EocdRecord.createWithModifiedCentralDirectoryInfo(zipSections22.getZipEndOfCentralDirectory(), arrayList42.size(), byteBufferDataSource.size(), j172);
                ApkSignerEngine.OutputApkSigningBlockRequest2 outputApkSigningBlockRequest2OutputZipSections2 = apkSignerEngine.outputZipSections2(dataSource2, byteBufferDataSource, DataSources.asDataSource(byteBufferCreateWithModifiedCentralDirectoryInfo));
                if (outputApkSigningBlockRequest2OutputZipSections2 != null) {
                    int paddingSizeBeforeApkSigningBlock = outputApkSigningBlockRequest2OutputZipSections2.getPaddingSizeBeforeApkSigningBlock();
                    byte[] apkSigningBlock = outputApkSigningBlockRequest2OutputZipSections2.getApkSigningBlock();
                    outputApkSigningBlockRequest2OutputZipSections2.done();
                    long j24 = paddingSizeBeforeApkSigningBlock;
                    long size7 = byteBufferDataSource.size() + j172 + j24 + apkSigningBlock.length + byteBufferCreateWithModifiedCentralDirectoryInfo.remaining();
                    if (this.mAlignFileSize) {
                        long j25 = size7 % 4096;
                        if (j25 != j10) {
                            byteBufferCreateWithModifiedCentralDirectoryInfo = EocdRecord.createWithPaddedComment(byteBufferCreateWithModifiedCentralDirectoryInfo, (int) (4096 - j25));
                            ApkSignerEngine.OutputApkSigningBlockRequest2 outputApkSigningBlockRequest2OutputZipSections22 = apkSignerEngine.outputZipSections2(dataSource2, new ByteBufferDataSource(byteBufferAllocate), DataSources.asDataSource(byteBufferCreateWithModifiedCentralDirectoryInfo));
                            apkSigningBlock = outputApkSigningBlockRequest2OutputZipSections22.getApkSigningBlock();
                            outputApkSigningBlockRequest2OutputZipSections22.done();
                        }
                    }
                    dataSink2.consume(ByteBuffer.allocate(paddingSizeBeforeApkSigningBlock));
                    dataSink2.consume(apkSigningBlock, 0, apkSigningBlock.length);
                    ZipUtils.setZipEocdCentralDirectoryOffset(byteBufferCreateWithModifiedCentralDirectoryInfo, j172 + j24 + apkSigningBlock.length);
                }
                byteBufferDataSource.feed(0L, byteBufferDataSource.size(), dataSink2);
                dataSink2.consume(byteBufferCreateWithModifiedCentralDirectoryInfo);
                apkSignerEngine.outputDone();
                if (this.mV4SigningEnabled) {
                    apkSignerEngine.signV4(dataSource2, this.mOutputV4File, !this.mV4ErrorReportingEnabled);
                    return;
                }
                return;
            }
            throw new IOException(u.a("Output ZIP Central Directory too large: ", " bytes", size4));
        } catch (ZipFormatException e11) {
            throw new ApkFormatException("Malformed APK: not a ZIP archive", e11);
        }
    }
}
