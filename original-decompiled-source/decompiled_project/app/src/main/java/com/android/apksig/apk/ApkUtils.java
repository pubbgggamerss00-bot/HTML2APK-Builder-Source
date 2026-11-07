package com.android.apksig.apk;

import com.android.apksig.apk.ApkUtilsLite;
import com.android.apksig.internal.apk.AndroidBinXmlParser;
import com.android.apksig.internal.apk.v1.V1SchemeVerifier;
import com.android.apksig.internal.util.Pair;
import com.android.apksig.internal.zip.CentralDirectoryRecord;
import com.android.apksig.internal.zip.LocalFileRecord;
import com.android.apksig.internal.zip.ZipUtils;
import com.android.apksig.util.DataSource;
import com.android.apksig.zip.ZipFormatException;
import i8.n;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Iterator;
import org.bouncycastle.pqc.legacy.math.linearalgebra.Matrix;

/* loaded from: classes.dex */
public abstract class ApkUtils {
    public static final String ANDROID_MANIFEST_ZIP_ENTRY_NAME = "AndroidManifest.xml";
    private static final int DEBUGGABLE_ATTR_ID = 16842767;
    private static final String MANIFEST_ELEMENT_TAG = "manifest";
    private static final int MIN_SDK_VERSION_ATTR_ID = 16843276;
    public static final String SOURCE_STAMP_CERTIFICATE_HASH_ZIP_ENTRY_NAME = "stamp-cert-sha256";
    private static final int TARGET_SANDBOX_VERSION_ATTR_ID = 16844108;
    private static final int TARGET_SDK_VERSION_ATTR_ID = 16843376;
    private static final String USES_SDK_ELEMENT_TAG = "uses-sdk";
    private static final int VERSION_CODE_ATTR_ID = 16843291;
    private static final int VERSION_CODE_MAJOR_ATTR_ID = 16844150;

    public static class ApkSigningBlock extends ApkUtilsLite.ApkSigningBlock {
        public ApkSigningBlock(long j10, DataSource dataSource) {
            super(j10, dataSource);
        }
    }

    public static class CodenamesLazyInitializer {
        private static final Pair<Character, Integer>[] SORTED_CODENAMES_FIRST_CHAR_TO_API_LEVEL = {Pair.of('C', 2), Pair.of('D', 3), Pair.of('E', 4), Pair.of('F', 7), Pair.of('G', 8), Pair.of('H', 10), Pair.of('I', 13), Pair.of('J', 15), Pair.of('K', 18), Pair.of(Character.valueOf(Matrix.MATRIX_TYPE_RANDOM_LT), 20), Pair.of('M', 22), Pair.of('N', 23), Pair.of('O', 25)};
        private static final Comparator<Pair<Character, Integer>> CODENAME_FIRST_CHAR_COMPARATOR = new ByFirstComparator();

        public static class ByFirstComparator implements Comparator<Pair<Character, Integer>> {
            private ByFirstComparator() {
            }

            @Override // java.util.Comparator
            public int compare(Pair<Character, Integer> pair, Pair<Character, Integer> pair2) {
                return pair.getFirst().charValue() - pair2.getFirst().charValue();
            }
        }

        private CodenamesLazyInitializer() {
        }
    }

    public static class ZipSections extends com.android.apksig.zip.ZipSections {
        public ZipSections(long j10, long j11, int i10, long j12, ByteBuffer byteBuffer) {
            super(j10, j11, i10, j12, byteBuffer);
        }
    }

    private ApkUtils() {
    }

    public static byte[] computeSha256DigestBytes(byte[] bArr) {
        return ApkUtilsLite.computeSha256DigestBytes(bArr);
    }

    public static ApkSigningBlock findApkSigningBlock(DataSource dataSource) throws ApkSigningBlockNotFoundException, IOException, ApkFormatException {
        try {
            return findApkSigningBlock(dataSource, findZipSections(dataSource));
        } catch (ZipFormatException e10) {
            throw new ApkFormatException("Malformed APK: not a ZIP archive", e10);
        }
    }

    public static ZipSections findZipSections(DataSource dataSource) throws IOException, ZipFormatException {
        com.android.apksig.zip.ZipSections zipSectionsFindZipSections = ApkUtilsLite.findZipSections(dataSource);
        return new ZipSections(zipSectionsFindZipSections.getZipCentralDirectoryOffset(), zipSectionsFindZipSections.getZipCentralDirectorySizeBytes(), zipSectionsFindZipSections.getZipCentralDirectoryRecordCount(), zipSectionsFindZipSections.getZipEndOfCentralDirectoryOffset(), zipSectionsFindZipSections.getZipEndOfCentralDirectory());
    }

    public static ByteBuffer getAndroidManifest(DataSource dataSource) throws IOException, ApkFormatException {
        CentralDirectoryRecord next;
        try {
            ZipSections zipSectionsFindZipSections = findZipSections(dataSource);
            Iterator<CentralDirectoryRecord> it = V1SchemeVerifier.parseZipCentralDirectory(dataSource, zipSectionsFindZipSections).iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                if (ANDROID_MANIFEST_ZIP_ENTRY_NAME.equals(next.getName())) {
                    break;
                }
            }
            if (next == null) {
                throw new ApkFormatException("Missing AndroidManifest.xml");
            }
            DataSource dataSourceSlice = dataSource.slice(0L, zipSectionsFindZipSections.getZipCentralDirectoryOffset());
            try {
                return ByteBuffer.wrap(LocalFileRecord.getUncompressedData(dataSourceSlice, next, dataSourceSlice.size()));
            } catch (ZipFormatException e10) {
                throw new ApkFormatException("Failed to read AndroidManifest.xml", e10);
            }
        } catch (ZipFormatException e11) {
            throw new ApkFormatException("Not a valid ZIP archive", e11);
        }
    }

    private static int getAttributeValueFromBinaryAndroidManifest(ByteBuffer byteBuffer, String str, int i10) throws ApkFormatException {
        if (str == null) {
            throw new NullPointerException("elementName cannot be null");
        }
        try {
            AndroidBinXmlParser androidBinXmlParser = new AndroidBinXmlParser(byteBuffer);
            for (int eventType = androidBinXmlParser.getEventType(); eventType != 2; eventType = androidBinXmlParser.next()) {
                if (eventType == 3 && str.equals(androidBinXmlParser.getName())) {
                    for (int i11 = 0; i11 < androidBinXmlParser.getAttributeCount(); i11++) {
                        if (androidBinXmlParser.getAttributeNameResourceId(i11) == i10) {
                            int attributeValueType = androidBinXmlParser.getAttributeValueType(i11);
                            if (attributeValueType != 1 && attributeValueType != 2) {
                                throw new ApkFormatException("Unsupported value type, " + attributeValueType + ", for attribute " + String.format("0x%08X", Integer.valueOf(i10)) + " under element " + str);
                            }
                            return androidBinXmlParser.getAttributeIntValue(i11);
                        }
                    }
                }
            }
            throw new ApkFormatException("Failed to determine APK's " + str + " attribute " + String.format("0x%08X", Integer.valueOf(i10)) + " value");
        } catch (AndroidBinXmlParser.XmlParserException e10) {
            throw new ApkFormatException("Unable to determine value for attribute " + String.format("0x%08X", Integer.valueOf(i10)) + " under element " + str + "; malformed binary resource: AndroidManifest.xml", e10);
        }
    }

    public static boolean getDebuggableFromBinaryAndroidManifest(ByteBuffer byteBuffer) throws ApkFormatException {
        try {
            AndroidBinXmlParser androidBinXmlParser = new AndroidBinXmlParser(byteBuffer);
            for (int eventType = androidBinXmlParser.getEventType(); eventType != 2; eventType = androidBinXmlParser.next()) {
                if (eventType == 3 && androidBinXmlParser.getDepth() == 2 && "application".equals(androidBinXmlParser.getName()) && androidBinXmlParser.getNamespace().isEmpty()) {
                    for (int i10 = 0; i10 < androidBinXmlParser.getAttributeCount(); i10++) {
                        if (androidBinXmlParser.getAttributeNameResourceId(i10) == 16842767) {
                            int attributeValueType = androidBinXmlParser.getAttributeValueType(i10);
                            if (attributeValueType != 1 && attributeValueType != 2) {
                                if (attributeValueType == 3) {
                                    throw new ApkFormatException("Unable to determine whether APK is debuggable: AndroidManifest.xml's android:debuggable attribute references a resource. References are not supported for security reasons. Only constant boolean, string and int values are supported.");
                                }
                                if (attributeValueType != 4) {
                                    throw new ApkFormatException("Unable to determine whether APK is debuggable: AndroidManifest.xml's android:debuggable attribute uses unsupported value type. Only boolean, string and int values are supported.");
                                }
                            }
                            String attributeStringValue = androidBinXmlParser.getAttributeStringValue(i10);
                            return "true".equals(attributeStringValue) || "TRUE".equals(attributeStringValue) || "1".equals(attributeStringValue);
                        }
                    }
                    return false;
                }
            }
            return false;
        } catch (AndroidBinXmlParser.XmlParserException e10) {
            throw new ApkFormatException("Unable to determine whether APK is debuggable: malformed binary resource: AndroidManifest.xml", e10);
        }
    }

    public static long getLongVersionCodeFromBinaryAndroidManifest(ByteBuffer byteBuffer) throws ApkFormatException {
        long attributeValueFromBinaryAndroidManifest;
        int versionCodeFromBinaryAndroidManifest = getVersionCodeFromBinaryAndroidManifest(byteBuffer);
        try {
            byteBuffer.rewind();
            attributeValueFromBinaryAndroidManifest = getAttributeValueFromBinaryAndroidManifest(byteBuffer, MANIFEST_ELEMENT_TAG, 16844150);
        } catch (ApkFormatException unused) {
            attributeValueFromBinaryAndroidManifest = 0;
        }
        return (attributeValueFromBinaryAndroidManifest << 32) | versionCodeFromBinaryAndroidManifest;
    }

    public static int getMinSdkVersionForCodename(String str) throws CodenameMinSdkVersionException {
        char cCharAt = str.isEmpty() ? ' ' : str.charAt(0);
        if (cCharAt < 'A' || cCharAt > 'Z') {
            throw new CodenameMinSdkVersionException(n.d("Unable to determine APK's minimum supported Android platform version : Unsupported codename in AndroidManifest.xml's minSdkVersion: \"", str, "\""), str);
        }
        Pair[] pairArr = CodenamesLazyInitializer.SORTED_CODENAMES_FIRST_CHAR_TO_API_LEVEL;
        int iBinarySearch = Arrays.binarySearch(pairArr, Pair.of(Character.valueOf(cCharAt), null), CodenamesLazyInitializer.CODENAME_FIRST_CHAR_COMPARATOR);
        if (iBinarySearch >= 0) {
            return ((Integer) pairArr[iBinarySearch].getSecond()).intValue();
        }
        if ((-1) - iBinarySearch == 0) {
            return 1;
        }
        Pair pair = pairArr[(-2) - iBinarySearch];
        return (cCharAt - ((Character) pair.getFirst()).charValue()) + ((Integer) pair.getSecond()).intValue();
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x003d, code lost:
    
        r4 = r0.getAttributeValueType(r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0041, code lost:
    
        if (r4 == 1) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0043, code lost:
    
        if (r4 != 2) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0045, code lost:
    
        r6 = r0.getAttributeIntValue(r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0051, code lost:
    
        throw new com.android.apksig.apk.MinSdkVersionException("Unable to determine APK's minimum supported Android: unsupported value type in AndroidManifest.xml's minSdkVersion. Only integer values supported.");
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0052, code lost:
    
        r6 = getMinSdkVersionForCodename(r0.getAttributeStringValue(r6));
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static int getMinSdkVersionFromBinaryAndroidManifest(ByteBuffer byteBuffer) throws MinSdkVersionException {
        int minSdkVersionForCodename;
        try {
            AndroidBinXmlParser androidBinXmlParser = new AndroidBinXmlParser(byteBuffer);
            int iMax = 1;
            for (int eventType = androidBinXmlParser.getEventType(); eventType != 2; eventType = androidBinXmlParser.next()) {
                if (eventType == 3 && androidBinXmlParser.getDepth() == 2 && USES_SDK_ELEMENT_TAG.equals(androidBinXmlParser.getName()) && androidBinXmlParser.getNamespace().isEmpty()) {
                    int i10 = 0;
                    while (true) {
                        if (i10 >= androidBinXmlParser.getAttributeCount()) {
                            minSdkVersionForCodename = 1;
                            break;
                        }
                        if (androidBinXmlParser.getAttributeNameResourceId(i10) == 16843276) {
                            break;
                        }
                        i10++;
                    }
                    iMax = Math.max(iMax, minSdkVersionForCodename);
                }
            }
            return iMax;
        } catch (AndroidBinXmlParser.XmlParserException e10) {
            throw new MinSdkVersionException("Unable to determine APK's minimum supported Android platform version: malformed binary resource: AndroidManifest.xml", e10);
        }
    }

    public static String getPackageNameFromBinaryAndroidManifest(ByteBuffer byteBuffer) throws ApkFormatException {
        try {
            AndroidBinXmlParser androidBinXmlParser = new AndroidBinXmlParser(byteBuffer);
            for (int eventType = androidBinXmlParser.getEventType(); eventType != 2; eventType = androidBinXmlParser.next()) {
                if (eventType == 3 && androidBinXmlParser.getDepth() == 1 && MANIFEST_ELEMENT_TAG.equals(androidBinXmlParser.getName()) && androidBinXmlParser.getNamespace().isEmpty()) {
                    for (int i10 = 0; i10 < androidBinXmlParser.getAttributeCount(); i10++) {
                        if ("package".equals(androidBinXmlParser.getAttributeName(i10)) && androidBinXmlParser.getNamespace().isEmpty()) {
                            return androidBinXmlParser.getAttributeStringValue(i10);
                        }
                    }
                    return null;
                }
            }
            return null;
        } catch (AndroidBinXmlParser.XmlParserException e10) {
            throw new ApkFormatException("Unable to determine APK package name: malformed binary resource: AndroidManifest.xml", e10);
        }
    }

    public static int getTargetSandboxVersionFromBinaryAndroidManifest(ByteBuffer byteBuffer) {
        try {
            return getAttributeValueFromBinaryAndroidManifest(byteBuffer, MANIFEST_ELEMENT_TAG, 16844108);
        } catch (ApkFormatException unused) {
            return 1;
        }
    }

    public static int getTargetSdkVersionFromBinaryAndroidManifest(ByteBuffer byteBuffer) {
        try {
            return getAttributeValueFromBinaryAndroidManifest(byteBuffer, USES_SDK_ELEMENT_TAG, 16843376);
        } catch (ApkFormatException unused) {
            byteBuffer.rewind();
            try {
                return getMinSdkVersionFromBinaryAndroidManifest(byteBuffer);
            } catch (ApkFormatException unused2) {
                return 1;
            }
        }
    }

    public static int getVersionCodeFromBinaryAndroidManifest(ByteBuffer byteBuffer) throws ApkFormatException {
        return getAttributeValueFromBinaryAndroidManifest(byteBuffer, MANIFEST_ELEMENT_TAG, 16843291);
    }

    public static void setZipEocdCentralDirectoryOffset(ByteBuffer byteBuffer, long j10) {
        ByteBuffer byteBufferSlice = byteBuffer.slice();
        byteBufferSlice.order(ByteOrder.LITTLE_ENDIAN);
        ZipUtils.setZipEocdCentralDirectoryOffset(byteBufferSlice, j10);
    }

    public static void updateZipEocdCommentLen(ByteBuffer byteBuffer) {
        ByteBuffer byteBufferSlice = byteBuffer.slice();
        byteBufferSlice.order(ByteOrder.LITTLE_ENDIAN);
        ZipUtils.updateZipEocdCommentLen(byteBufferSlice);
    }

    public static ApkSigningBlock findApkSigningBlock(DataSource dataSource, ZipSections zipSections) throws ApkSigningBlockNotFoundException, IOException {
        ApkUtilsLite.ApkSigningBlock apkSigningBlockFindApkSigningBlock = ApkUtilsLite.findApkSigningBlock(dataSource, zipSections);
        return new ApkSigningBlock(apkSigningBlockFindApkSigningBlock.getStartOffset(), apkSigningBlockFindApkSigningBlock.getContents());
    }
}
