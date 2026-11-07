package com.android.apksig.internal.apk;

import com.android.apksig.apk.ApkFormatException;
import com.android.apksig.apk.ApkSigningBlockNotFoundException;
import com.android.apksig.apk.ApkUtilsLite;
import com.android.apksig.internal.util.Pair;
import com.android.apksig.util.DataSource;
import com.android.apksig.zip.ZipSections;
import j2.y;
import java.io.IOException;
import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import org.jf.dexlib2.analysis.RegisterType;
import p.g0;
import p.i0;

/* loaded from: classes.dex */
public class ApkSigningBlockUtilsLite {
    private static final char[] HEX_DIGITS = "0123456789abcdef".toCharArray();

    /* renamed from: com.android.apksig.internal.apk.ApkSigningBlockUtilsLite$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$android$apksig$internal$apk$ContentDigestAlgorithm;

        static {
            int[] iArr = new int[ContentDigestAlgorithm.values().length];
            $SwitchMap$com$android$apksig$internal$apk$ContentDigestAlgorithm = iArr;
            try {
                iArr[ContentDigestAlgorithm.CHUNKED_SHA256.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$android$apksig$internal$apk$ContentDigestAlgorithm[ContentDigestAlgorithm.CHUNKED_SHA512.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$android$apksig$internal$apk$ContentDigestAlgorithm[ContentDigestAlgorithm.VERITY_CHUNKED_SHA256.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    private ApkSigningBlockUtilsLite() {
    }

    public static void checkByteOrderLittleEndian(ByteBuffer byteBuffer) {
        if (byteBuffer.order() != ByteOrder.LITTLE_ENDIAN) {
            throw new IllegalArgumentException("ByteBuffer byte order must be little endian");
        }
    }

    private static int compareContentDigestAlgorithm(ContentDigestAlgorithm contentDigestAlgorithm, ContentDigestAlgorithm contentDigestAlgorithm2) {
        int[] iArr = AnonymousClass1.$SwitchMap$com$android$apksig$internal$apk$ContentDigestAlgorithm;
        int i10 = iArr[contentDigestAlgorithm.ordinal()];
        if (i10 == 1) {
            int i11 = iArr[contentDigestAlgorithm2.ordinal()];
            if (i11 == 1) {
                return 0;
            }
            if (i11 == 2 || i11 == 3) {
                return -1;
            }
            throw new IllegalArgumentException("Unknown alg2: " + contentDigestAlgorithm2);
        }
        if (i10 == 2) {
            int i12 = iArr[contentDigestAlgorithm2.ordinal()];
            if (i12 != 1) {
                if (i12 == 2) {
                    return 0;
                }
                if (i12 != 3) {
                    throw new IllegalArgumentException("Unknown alg2: " + contentDigestAlgorithm2);
                }
            }
            return 1;
        }
        if (i10 != 3) {
            throw new IllegalArgumentException("Unknown alg1: " + contentDigestAlgorithm);
        }
        int i13 = iArr[contentDigestAlgorithm2.ordinal()];
        if (i13 == 1) {
            return 1;
        }
        if (i13 == 2) {
            return -1;
        }
        if (i13 == 3) {
            return 0;
        }
        throw new IllegalArgumentException("Unknown alg2: " + contentDigestAlgorithm2);
    }

    public static int compareSignatureAlgorithm(SignatureAlgorithm signatureAlgorithm, SignatureAlgorithm signatureAlgorithm2) {
        return compareContentDigestAlgorithm(signatureAlgorithm.getContentDigestAlgorithm(), signatureAlgorithm2.getContentDigestAlgorithm());
    }

    public static byte[] encodeAsSequenceOfLengthPrefixedPairsOfIntAndLengthPrefixedBytes(List<Pair<Integer, byte[]>> list) {
        Iterator<Pair<Integer, byte[]>> it = list.iterator();
        int length = 0;
        while (it.hasNext()) {
            length += it.next().getSecond().length + 12;
        }
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(length);
        byteBufferAllocate.order(ByteOrder.LITTLE_ENDIAN);
        for (Pair<Integer, byte[]> pair : list) {
            byte[] second = pair.getSecond();
            byteBufferAllocate.putInt(second.length + 8);
            byteBufferAllocate.putInt(pair.getFirst().intValue());
            byteBufferAllocate.putInt(second.length);
            byteBufferAllocate.put(second);
        }
        return byteBufferAllocate.array();
    }

    public static ByteBuffer findApkSignatureSchemeBlock(ByteBuffer byteBuffer, int i10) throws SignatureNotFoundException {
        checkByteOrderLittleEndian(byteBuffer);
        ByteBuffer byteBufferSliceFromTo = sliceFromTo(byteBuffer, 8, byteBuffer.capacity() - 24);
        int i11 = 0;
        while (byteBufferSliceFromTo.hasRemaining()) {
            i11++;
            if (byteBufferSliceFromTo.remaining() < 8) {
                throw new SignatureNotFoundException(y.a(i11, "Insufficient data to read size of APK Signing Block entry #"));
            }
            long j10 = byteBufferSliceFromTo.getLong();
            if (j10 < 4 || j10 > 2147483647L) {
                throw new SignatureNotFoundException("APK Signing Block entry #" + i11 + " size out of range: " + j10);
            }
            int i12 = (int) j10;
            int iPosition = byteBufferSliceFromTo.position() + i12;
            if (i12 > byteBufferSliceFromTo.remaining()) {
                StringBuilder sbA = g0.a(i11, i12, "APK Signing Block entry #", " size out of range: ", ", available: ");
                sbA.append(byteBufferSliceFromTo.remaining());
                throw new SignatureNotFoundException(sbA.toString());
            }
            if (byteBufferSliceFromTo.getInt() == i10) {
                return getByteBuffer(byteBufferSliceFromTo, i12 - 4);
            }
            byteBufferSliceFromTo.position(iPosition);
        }
        throw new SignatureNotFoundException(y.a(i10, "No APK Signature Scheme block in APK Signing Block with ID: "));
    }

    public static SignatureInfo findSignature(DataSource dataSource, ZipSections zipSections, int i10) throws SignatureNotFoundException, IOException {
        try {
            ApkUtilsLite.ApkSigningBlock apkSigningBlockFindApkSigningBlock = ApkUtilsLite.findApkSigningBlock(dataSource, zipSections);
            long startOffset = apkSigningBlockFindApkSigningBlock.getStartOffset();
            DataSource contents = apkSigningBlockFindApkSigningBlock.getContents();
            ByteBuffer byteBuffer = contents.getByteBuffer(0L, (int) contents.size());
            byteBuffer.order(ByteOrder.LITTLE_ENDIAN);
            return new SignatureInfo(findApkSignatureSchemeBlock(byteBuffer, i10), startOffset, zipSections.getZipCentralDirectoryOffset(), zipSections.getZipEndOfCentralDirectoryOffset(), zipSections.getZipEndOfCentralDirectory());
        } catch (ApkSigningBlockNotFoundException e10) {
            throw new SignatureNotFoundException(e10.getMessage(), e10);
        }
    }

    private static ByteBuffer getByteBuffer(ByteBuffer byteBuffer, int i10) {
        if (i10 < 0) {
            throw new IllegalArgumentException(y.a(i10, "size: "));
        }
        int iLimit = byteBuffer.limit();
        int iPosition = byteBuffer.position();
        int i11 = i10 + iPosition;
        if (i11 < iPosition || i11 > iLimit) {
            throw new BufferUnderflowException();
        }
        byteBuffer.limit(i11);
        try {
            ByteBuffer byteBufferSlice = byteBuffer.slice();
            byteBufferSlice.order(byteBuffer.order());
            byteBuffer.position(i11);
            return byteBufferSlice;
        } finally {
            byteBuffer.limit(iLimit);
        }
    }

    public static ByteBuffer getLengthPrefixedSlice(ByteBuffer byteBuffer) throws ApkFormatException {
        if (byteBuffer.remaining() < 4) {
            throw new ApkFormatException("Remaining buffer too short to contain length of length-prefixed field. Remaining: " + byteBuffer.remaining());
        }
        int i10 = byteBuffer.getInt();
        if (i10 < 0) {
            throw new IllegalArgumentException("Negative length");
        }
        if (i10 <= byteBuffer.remaining()) {
            return getByteBuffer(byteBuffer, i10);
        }
        StringBuilder sbB = i0.b(i10, "Length-prefixed field longer than remaining buffer. Field length: ", ", remaining: ");
        sbB.append(byteBuffer.remaining());
        throw new ApkFormatException(sbB.toString());
    }

    public static <T extends ApkSupportedSignature> List<T> getSignaturesToVerify(List<T> list, int i10, int i11) throws NoApkSupportedSignaturesException {
        return getSignaturesToVerify(list, i10, i11, false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ int lambda$getSignaturesToVerify$0(ApkSupportedSignature apkSupportedSignature, ApkSupportedSignature apkSupportedSignature2) {
        return Integer.compare(apkSupportedSignature.algorithm.getId(), apkSupportedSignature2.algorithm.getId());
    }

    public static byte[] readLengthPrefixedByteArray(ByteBuffer byteBuffer) throws ApkFormatException {
        int i10 = byteBuffer.getInt();
        if (i10 < 0) {
            throw new ApkFormatException("Negative length");
        }
        if (i10 <= byteBuffer.remaining()) {
            byte[] bArr = new byte[i10];
            byteBuffer.get(bArr);
            return bArr;
        }
        StringBuilder sbB = i0.b(i10, "Underflow while reading length-prefixed value. Length: ", ", available: ");
        sbB.append(byteBuffer.remaining());
        throw new ApkFormatException(sbB.toString());
    }

    private static ByteBuffer sliceFromTo(ByteBuffer byteBuffer, int i10, int i11) {
        if (i10 < 0) {
            throw new IllegalArgumentException(y.a(i10, "start: "));
        }
        if (i11 < i10) {
            throw new IllegalArgumentException(e1.c.a(i11, i10, "end < start: ", " < "));
        }
        int iCapacity = byteBuffer.capacity();
        if (i11 > byteBuffer.capacity()) {
            throw new IllegalArgumentException(e1.c.a(i11, iCapacity, "end > capacity: ", " > "));
        }
        int iLimit = byteBuffer.limit();
        int iPosition = byteBuffer.position();
        try {
            byteBuffer.position(0);
            byteBuffer.limit(i11);
            byteBuffer.position(i10);
            ByteBuffer byteBufferSlice = byteBuffer.slice();
            byteBufferSlice.order(byteBuffer.order());
            return byteBufferSlice;
        } finally {
            byteBuffer.position(0);
            byteBuffer.limit(iLimit);
            byteBuffer.position(iPosition);
        }
    }

    public static String toHex(byte[] bArr) {
        StringBuilder sb = new StringBuilder(bArr.length * 2);
        for (byte b10 : bArr) {
            int i10 = (b10 & 255) >>> 4;
            int i11 = b10 & RegisterType.DOUBLE_HI;
            char[] cArr = HEX_DIGITS;
            sb.append(cArr[i10]);
            sb.append(cArr[i11]);
        }
        return sb.toString();
    }

    public static <T extends ApkSupportedSignature> List<T> getSignaturesToVerify(List<T> list, int i10, int i11, boolean z10) throws NoApkSupportedSignaturesException {
        HashMap map = new HashMap();
        int i12 = Integer.MAX_VALUE;
        for (T t3 : list) {
            SignatureAlgorithm signatureAlgorithm = t3.algorithm;
            int jcaSigAlgMinSdkVersion = z10 ? signatureAlgorithm.getJcaSigAlgMinSdkVersion() : signatureAlgorithm.getMinSdkVersion();
            if (jcaSigAlgMinSdkVersion <= i11) {
                if (jcaSigAlgMinSdkVersion < i12) {
                    i12 = jcaSigAlgMinSdkVersion;
                }
                ApkSupportedSignature apkSupportedSignature = (ApkSupportedSignature) map.get(Integer.valueOf(jcaSigAlgMinSdkVersion));
                if (apkSupportedSignature == null || compareSignatureAlgorithm(signatureAlgorithm, apkSupportedSignature.algorithm) > 0) {
                    map.put(Integer.valueOf(jcaSigAlgMinSdkVersion), t3);
                }
            }
        }
        if (i10 < i12) {
            throw new NoApkSupportedSignaturesException(e1.c.a(i12, i10, "Minimum provided signature version ", " > minSdkVersion "));
        }
        if (map.isEmpty()) {
            throw new NoApkSupportedSignaturesException("No supported signature");
        }
        ArrayList arrayList = new ArrayList(map.values());
        Collections.sort(arrayList, new c());
        return arrayList;
    }
}
