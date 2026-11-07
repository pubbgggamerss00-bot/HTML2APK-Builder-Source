package com.android.apksig.internal.zip;

import com.android.apksig.apk.ApkFormatException;
import com.android.apksig.internal.util.Pair;
import com.android.apksig.util.DataSource;
import com.android.apksig.zip.ZipFormatException;
import com.android.apksig.zip.ZipSections;
import j2.y;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.List;
import java.util.zip.CRC32;
import java.util.zip.Deflater;
import m0.r;
import org.bouncycastle.asn1.cmc.BodyPartID;
import org.bouncycastle.crypto.hpke.HPKE;

/* loaded from: classes.dex */
public abstract class ZipUtils {
    public static final short COMPRESSION_METHOD_DEFLATED = 8;
    public static final short COMPRESSION_METHOD_STORED = 0;
    public static final short GP_FLAG_DATA_DESCRIPTOR_USED = 8;
    public static final short GP_FLAG_EFS = 2048;
    private static final int UINT16_MAX_VALUE = 65535;
    private static final int ZIP_EOCD_CENTRAL_DIR_OFFSET_FIELD_OFFSET = 16;
    private static final int ZIP_EOCD_CENTRAL_DIR_SIZE_FIELD_OFFSET = 12;
    private static final int ZIP_EOCD_CENTRAL_DIR_TOTAL_RECORD_COUNT_OFFSET = 10;
    private static final int ZIP_EOCD_COMMENT_LENGTH_FIELD_OFFSET = 20;
    private static final int ZIP_EOCD_REC_MIN_SIZE = 22;
    private static final int ZIP_EOCD_REC_SIG = 101010256;

    public static class DeflateResult {
        public final long inputCrc32;
        public final int inputSizeBytes;
        public final byte[] output;

        public DeflateResult(int i10, long j10, byte[] bArr) {
            this.inputSizeBytes = i10;
            this.inputCrc32 = j10;
            this.output = bArr;
        }
    }

    private ZipUtils() {
    }

    public static void assertByteOrderLittleEndian(ByteBuffer byteBuffer) {
        if (byteBuffer.order() != ByteOrder.LITTLE_ENDIAN) {
            throw new IllegalArgumentException("ByteBuffer byte order must be little endian");
        }
    }

    public static DeflateResult deflate(ByteBuffer byteBuffer) {
        byte[] bArrArray;
        int iPosition;
        int iRemaining = byteBuffer.remaining();
        if (byteBuffer.hasArray()) {
            bArrArray = byteBuffer.array();
            iPosition = byteBuffer.position() + byteBuffer.arrayOffset();
            byteBuffer.position(byteBuffer.limit());
        } else {
            bArrArray = new byte[iRemaining];
            byteBuffer.get(bArrArray);
            iPosition = 0;
        }
        CRC32 crc32 = new CRC32();
        crc32.update(bArrArray, iPosition, iRemaining);
        long value = crc32.getValue();
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        Deflater deflater = new Deflater(9, true);
        deflater.setInput(bArrArray, iPosition, iRemaining);
        deflater.finish();
        byte[] bArr = new byte[65536];
        while (!deflater.finished()) {
            byteArrayOutputStream.write(bArr, 0, deflater.deflate(bArr));
        }
        return new DeflateResult(iRemaining, value, byteArrayOutputStream.toByteArray());
    }

    public static Pair<ByteBuffer, Long> findZipEndOfCentralDirectoryRecord(DataSource dataSource) throws IOException {
        if (dataSource.size() < 22) {
            return null;
        }
        Pair<ByteBuffer, Long> pairFindZipEndOfCentralDirectoryRecord = findZipEndOfCentralDirectoryRecord(dataSource, 0);
        return pairFindZipEndOfCentralDirectoryRecord != null ? pairFindZipEndOfCentralDirectoryRecord : findZipEndOfCentralDirectoryRecord(dataSource, 65535);
    }

    public static int getUnsignedInt16(ByteBuffer byteBuffer, int i10) {
        return byteBuffer.getShort(i10) & HPKE.aead_EXPORT_ONLY;
    }

    public static long getUnsignedInt32(ByteBuffer byteBuffer, int i10) {
        return byteBuffer.getInt(i10) & BodyPartID.bodyIdMax;
    }

    public static long getZipEocdCentralDirectoryOffset(ByteBuffer byteBuffer) {
        assertByteOrderLittleEndian(byteBuffer);
        return getUnsignedInt32(byteBuffer, byteBuffer.position() + 16);
    }

    public static long getZipEocdCentralDirectorySizeBytes(ByteBuffer byteBuffer) {
        assertByteOrderLittleEndian(byteBuffer);
        return getUnsignedInt32(byteBuffer, byteBuffer.position() + 12);
    }

    public static int getZipEocdCentralDirectoryTotalRecordCount(ByteBuffer byteBuffer) {
        assertByteOrderLittleEndian(byteBuffer);
        return getUnsignedInt16(byteBuffer, byteBuffer.position() + 10);
    }

    public static List<CentralDirectoryRecord> parseZipCentralDirectory(DataSource dataSource, ZipSections zipSections) throws IOException, ApkFormatException {
        long zipCentralDirectorySizeBytes = zipSections.getZipCentralDirectorySizeBytes();
        if (zipCentralDirectorySizeBytes > 2147483647L) {
            throw new ApkFormatException(r.a("ZIP Central Directory too large: ", zipCentralDirectorySizeBytes));
        }
        long zipCentralDirectoryOffset = zipSections.getZipCentralDirectoryOffset();
        ByteBuffer byteBuffer = dataSource.getByteBuffer(zipCentralDirectoryOffset, (int) zipCentralDirectorySizeBytes);
        byteBuffer.order(ByteOrder.LITTLE_ENDIAN);
        int zipCentralDirectoryRecordCount = zipSections.getZipCentralDirectoryRecordCount();
        ArrayList arrayList = new ArrayList(zipCentralDirectoryRecordCount);
        for (int i10 = 0; i10 < zipCentralDirectoryRecordCount; i10++) {
            int iPosition = byteBuffer.position();
            try {
                CentralDirectoryRecord record = CentralDirectoryRecord.getRecord(byteBuffer);
                if (!record.getName().endsWith("/")) {
                    arrayList.add(record);
                }
            } catch (ZipFormatException e10) {
                throw new ApkFormatException("Malformed ZIP Central Directory record #" + (i10 + 1) + " at file offset " + (zipCentralDirectoryOffset + iPosition), e10);
            }
        }
        return arrayList;
    }

    public static void putUnsignedInt16(ByteBuffer byteBuffer, int i10) {
        if (i10 < 0 || i10 > 65535) {
            throw new IllegalArgumentException(y.a(i10, "uint16 value of out range: "));
        }
        byteBuffer.putShort((short) i10);
    }

    public static void putUnsignedInt32(ByteBuffer byteBuffer, long j10) {
        if (j10 < 0 || j10 > BodyPartID.bodyIdMax) {
            throw new IllegalArgumentException(r.a("uint32 value of out range: ", j10));
        }
        byteBuffer.putInt((int) j10);
    }

    public static void setUnsignedInt16(ByteBuffer byteBuffer, int i10, int i11) {
        if (i11 < 0 || i11 > 65535) {
            throw new IllegalArgumentException(y.a(i11, "uint16 value of out range: "));
        }
        byteBuffer.putShort(i10, (short) i11);
    }

    public static void setUnsignedInt32(ByteBuffer byteBuffer, int i10, long j10) {
        if (j10 < 0 || j10 > BodyPartID.bodyIdMax) {
            throw new IllegalArgumentException(r.a("uint32 value of out range: ", j10));
        }
        byteBuffer.putInt(i10, (int) j10);
    }

    public static void setZipEocdCentralDirectoryOffset(ByteBuffer byteBuffer, long j10) {
        assertByteOrderLittleEndian(byteBuffer);
        setUnsignedInt32(byteBuffer, byteBuffer.position() + 16, j10);
    }

    public static void updateZipEocdCommentLen(ByteBuffer byteBuffer) {
        assertByteOrderLittleEndian(byteBuffer);
        setUnsignedInt16(byteBuffer, byteBuffer.position() + 20, byteBuffer.remaining() - 22);
    }

    public static int getUnsignedInt16(ByteBuffer byteBuffer) {
        return byteBuffer.getShort() & HPKE.aead_EXPORT_ONLY;
    }

    public static long getUnsignedInt32(ByteBuffer byteBuffer) {
        return byteBuffer.getInt() & BodyPartID.bodyIdMax;
    }

    private static Pair<ByteBuffer, Long> findZipEndOfCentralDirectoryRecord(DataSource dataSource, int i10) throws IOException {
        if (i10 >= 0 && i10 <= 65535) {
            long size = dataSource.size();
            if (size < 22) {
                return null;
            }
            int iMin = ((int) Math.min(i10, size - 22)) + 22;
            long j10 = size - iMin;
            ByteBuffer byteBuffer = dataSource.getByteBuffer(j10, iMin);
            ByteOrder byteOrder = ByteOrder.LITTLE_ENDIAN;
            byteBuffer.order(byteOrder);
            int iFindZipEndOfCentralDirectoryRecord = findZipEndOfCentralDirectoryRecord(byteBuffer);
            if (iFindZipEndOfCentralDirectoryRecord == -1) {
                return null;
            }
            byteBuffer.position(iFindZipEndOfCentralDirectoryRecord);
            ByteBuffer byteBufferSlice = byteBuffer.slice();
            byteBufferSlice.order(byteOrder);
            return Pair.of(byteBufferSlice, Long.valueOf(j10 + iFindZipEndOfCentralDirectoryRecord));
        }
        throw new IllegalArgumentException(y.a(i10, "maxCommentSize: "));
    }

    private static int findZipEndOfCentralDirectoryRecord(ByteBuffer byteBuffer) {
        assertByteOrderLittleEndian(byteBuffer);
        int iCapacity = byteBuffer.capacity();
        if (iCapacity < 22) {
            return -1;
        }
        int i10 = iCapacity - 22;
        int iMin = Math.min(i10, 65535);
        for (int i11 = 0; i11 <= iMin; i11++) {
            int i12 = i10 - i11;
            if (byteBuffer.getInt(i12) == ZIP_EOCD_REC_SIG && getUnsignedInt16(byteBuffer, i12 + 20) == i11) {
                return i12;
            }
        }
        return -1;
    }
}
