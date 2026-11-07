package com.android.apksig.internal.zip;

import androidx.datastore.preferences.protobuf.h;
import com.android.apksig.internal.util.ByteBufferSink;
import com.android.apksig.util.DataSink;
import com.android.apksig.util.DataSource;
import com.android.apksig.zip.ZipFormatException;
import e.e;
import java.io.Closeable;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.StandardCharsets;
import java.util.zip.DataFormatException;
import java.util.zip.Inflater;
import org.bouncycastle.asn1.cmc.BodyPartID;
import p5.g0;
import x0.a;

/* loaded from: classes.dex */
public class LocalFileRecord {
    private static final int COMPRESSED_SIZE_OFFSET = 18;
    private static final int CRC32_OFFSET = 14;
    private static final int DATA_DESCRIPTOR_SIGNATURE = 134695760;
    private static final int DATA_DESCRIPTOR_SIZE_BYTES_WITHOUT_SIGNATURE = 12;
    private static final ByteBuffer EMPTY_BYTE_BUFFER = ByteBuffer.allocate(0);
    private static final int EXTRA_LENGTH_OFFSET = 28;
    private static final int GP_FLAGS_OFFSET = 6;
    private static final int HEADER_SIZE_BYTES = 30;
    private static final int NAME_LENGTH_OFFSET = 26;
    private static final int NAME_OFFSET = 30;
    private static final int RECORD_SIGNATURE = 67324752;
    private static final int UNCOMPRESSED_SIZE_OFFSET = 22;
    private final boolean mDataCompressed;
    private final long mDataSize;
    private final int mDataStartOffset;
    private final ByteBuffer mExtra;
    private final String mName;
    private final int mNameSizeBytes;
    private final long mSize;
    private final long mStartOffsetInArchive;
    private final long mUncompressedDataSize;

    public static class InflateSinkAdapter implements DataSink, Closeable {
        private boolean mClosed;
        private final DataSink mDelegate;
        private Inflater mInflater;
        private byte[] mInputBuffer;
        private byte[] mOutputBuffer;
        private long mOutputByteCount;

        private void checkNotClosed() {
            if (this.mClosed) {
                throw new IllegalStateException("Closed");
            }
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            this.mClosed = true;
            this.mInputBuffer = null;
            this.mOutputBuffer = null;
            Inflater inflater = this.mInflater;
            if (inflater != null) {
                inflater.end();
                this.mInflater = null;
            }
        }

        @Override // com.android.apksig.util.DataSink
        public void consume(byte[] bArr, int i10, int i11) throws DataFormatException, IOException {
            checkNotClosed();
            this.mInflater.setInput(bArr, i10, i11);
            if (this.mOutputBuffer == null) {
                this.mOutputBuffer = new byte[65536];
            }
            while (!this.mInflater.finished()) {
                try {
                    int iInflate = this.mInflater.inflate(this.mOutputBuffer);
                    if (iInflate == 0) {
                        return;
                    }
                    this.mDelegate.consume(this.mOutputBuffer, 0, iInflate);
                    this.mOutputByteCount += iInflate;
                } catch (DataFormatException e10) {
                    throw new IOException("Failed to inflate data", e10);
                }
            }
        }

        public long getOutputByteCount() {
            return this.mOutputByteCount;
        }

        private InflateSinkAdapter(DataSink dataSink) {
            this.mInflater = new Inflater(true);
            this.mDelegate = dataSink;
        }

        @Override // com.android.apksig.util.DataSink
        public void consume(ByteBuffer byteBuffer) throws DataFormatException, IOException {
            checkNotClosed();
            if (byteBuffer.hasArray()) {
                consume(byteBuffer.array(), byteBuffer.position() + byteBuffer.arrayOffset(), byteBuffer.remaining());
                byteBuffer.position(byteBuffer.limit());
                return;
            }
            if (this.mInputBuffer == null) {
                this.mInputBuffer = new byte[65536];
            }
            while (byteBuffer.hasRemaining()) {
                int iMin = Math.min(byteBuffer.remaining(), this.mInputBuffer.length);
                byteBuffer.get(this.mInputBuffer, 0, iMin);
                consume(this.mInputBuffer, 0, iMin);
            }
        }
    }

    private LocalFileRecord(String str, int i10, ByteBuffer byteBuffer, long j10, long j11, int i11, long j12, boolean z10, long j13) {
        this.mName = str;
        this.mNameSizeBytes = i10;
        this.mExtra = byteBuffer;
        this.mStartOffsetInArchive = j10;
        this.mSize = j11;
        this.mDataStartOffset = i11;
        this.mDataSize = j12;
        this.mDataCompressed = z10;
        this.mUncompressedDataSize = j13;
    }

    public static LocalFileRecord getRecord(DataSource dataSource, CentralDirectoryRecord centralDirectoryRecord, long j10) throws IOException, ZipFormatException {
        return getRecord(dataSource, centralDirectoryRecord, j10, true, true);
    }

    public static byte[] getUncompressedData(DataSource dataSource, CentralDirectoryRecord centralDirectoryRecord, long j10) throws IOException, ZipFormatException {
        if (centralDirectoryRecord.getUncompressedSize() <= 2147483647L) {
            byte[] bArr = new byte[(int) centralDirectoryRecord.getUncompressedSize()];
            outputUncompressedData(dataSource, centralDirectoryRecord, j10, new ByteBufferSink(ByteBuffer.wrap(bArr)));
            return bArr;
        }
        throw new IOException(centralDirectoryRecord.getName() + " too large: " + centralDirectoryRecord.getUncompressedSize());
    }

    public static long outputRecordWithDeflateCompressedData(String str, int i10, int i11, byte[] bArr, long j10, long j11, DataSink dataSink) throws IOException {
        byte[] bytes = str.getBytes(StandardCharsets.UTF_8);
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(bytes.length + 30);
        byteBufferAllocate.order(ByteOrder.LITTLE_ENDIAN);
        byteBufferAllocate.putInt(RECORD_SIGNATURE);
        ZipUtils.putUnsignedInt16(byteBufferAllocate, 20);
        byteBufferAllocate.putShort(ZipUtils.GP_FLAG_EFS);
        byteBufferAllocate.putShort((short) 8);
        ZipUtils.putUnsignedInt16(byteBufferAllocate, i10);
        ZipUtils.putUnsignedInt16(byteBufferAllocate, i11);
        ZipUtils.putUnsignedInt32(byteBufferAllocate, j10);
        ZipUtils.putUnsignedInt32(byteBufferAllocate, bArr.length);
        ZipUtils.putUnsignedInt32(byteBufferAllocate, j11);
        ZipUtils.putUnsignedInt16(byteBufferAllocate, bytes.length);
        ZipUtils.putUnsignedInt16(byteBufferAllocate, 0);
        byteBufferAllocate.put(bytes);
        if (byteBufferAllocate.hasRemaining()) {
            throw new RuntimeException("pos: " + byteBufferAllocate.position() + ", limit: " + byteBufferAllocate.limit());
        }
        byteBufferAllocate.flip();
        long jRemaining = byteBufferAllocate.remaining();
        dataSink.consume(byteBufferAllocate);
        long length = jRemaining + bArr.length;
        dataSink.consume(bArr, 0, bArr.length);
        return length;
    }

    public int getDataStartOffsetInRecord() {
        return this.mDataStartOffset;
    }

    public ByteBuffer getExtra() {
        return this.mExtra.capacity() > 0 ? this.mExtra.slice() : this.mExtra;
    }

    public int getExtraFieldStartOffsetInsideRecord() {
        return this.mNameSizeBytes + 30;
    }

    public String getName() {
        return this.mName;
    }

    public long getSize() {
        return this.mSize;
    }

    public long getStartOffsetInArchive() {
        return this.mStartOffsetInArchive;
    }

    public boolean isDataCompressed() {
        return this.mDataCompressed;
    }

    public long outputRecord(DataSource dataSource, DataSink dataSink) throws IOException {
        long size = getSize();
        dataSource.feed(getStartOffsetInArchive(), size, dataSink);
        return size;
    }

    public long outputRecordWithModifiedExtra(DataSource dataSource, ByteBuffer byteBuffer, DataSink dataSink) throws IOException {
        long startOffsetInArchive = getStartOffsetInArchive();
        int extraFieldStartOffsetInsideRecord = getExtraFieldStartOffsetInsideRecord();
        int iRemaining = byteBuffer.remaining();
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(extraFieldStartOffsetInsideRecord + iRemaining);
        byteBufferAllocate.order(ByteOrder.LITTLE_ENDIAN);
        dataSource.copyTo(startOffsetInArchive, extraFieldStartOffsetInsideRecord, byteBufferAllocate);
        byteBufferAllocate.put(byteBuffer.slice());
        byteBufferAllocate.flip();
        ZipUtils.setUnsignedInt16(byteBufferAllocate, 28, iRemaining);
        long jRemaining = byteBufferAllocate.remaining();
        dataSink.consume(byteBufferAllocate);
        long size = getSize();
        int i10 = this.mDataStartOffset;
        long j10 = size - i10;
        dataSource.feed(startOffsetInArchive + i10, j10, dataSink);
        return jRemaining + j10;
    }

    public void outputUncompressedData(DataSource dataSource, DataSink dataSink) throws IOException, ZipFormatException {
        long j10 = this.mStartOffsetInArchive + this.mDataStartOffset;
        try {
            if (!this.mDataCompressed) {
                dataSource.feed(j10, this.mDataSize, dataSink);
                return;
            }
            try {
                InflateSinkAdapter inflateSinkAdapter = new InflateSinkAdapter(dataSink);
                try {
                    dataSource.feed(j10, this.mDataSize, inflateSinkAdapter);
                    long outputByteCount = inflateSinkAdapter.getOutputByteCount();
                    if (outputByteCount == this.mUncompressedDataSize) {
                        inflateSinkAdapter.close();
                        return;
                    }
                    throw new ZipFormatException("Unexpected size of uncompressed data of " + this.mName + ". Expected: " + this.mUncompressedDataSize + " bytes, actual: " + outputByteCount + " bytes");
                } finally {
                }
            } catch (IOException e10) {
                if (!(e10.getCause() instanceof DataFormatException)) {
                    throw e10;
                }
                throw new ZipFormatException("Data of entry " + this.mName + " malformed", e10);
            }
        } catch (IOException e11) {
            StringBuilder sb = new StringBuilder("Failed to read data of ");
            sb.append(this.mDataCompressed ? "compressed" : "uncompressed");
            sb.append(" entry ");
            sb.append(this.mName);
            throw new IOException(sb.toString(), e11);
        }
    }

    private static LocalFileRecord getRecord(DataSource dataSource, CentralDirectoryRecord centralDirectoryRecord, long j10, boolean z10, boolean z11) throws IOException, ZipFormatException {
        ByteOrder byteOrder;
        int i10;
        long j11;
        String name = centralDirectoryRecord.getName();
        int nameSizeBytes = centralDirectoryRecord.getNameSizeBytes();
        int i11 = nameSizeBytes + 30;
        long localFileHeaderOffset = centralDirectoryRecord.getLocalFileHeaderOffset();
        long j12 = i11 + localFileHeaderOffset;
        if (j12 > j10) {
            throw new ZipFormatException("Local File Header of " + name + " extends beyond start of Central Directory. LFH end: " + j12 + ", CD start: " + j10);
        }
        try {
            ByteBuffer byteBuffer = dataSource.getByteBuffer(localFileHeaderOffset, i11);
            ByteOrder byteOrder2 = ByteOrder.LITTLE_ENDIAN;
            byteBuffer.order(byteOrder2);
            int i12 = byteBuffer.getInt();
            if (i12 != RECORD_SIGNATURE) {
                StringBuilder sbA = e.a("Not a Local File Header record for entry ", name, ". Signature: 0x");
                sbA.append(Long.toHexString(i12 & BodyPartID.bodyIdMax));
                throw new ZipFormatException(sbA.toString());
            }
            int i13 = byteBuffer.getShort(6) & 8;
            boolean z12 = i13 != 0;
            boolean z13 = (centralDirectoryRecord.getGpFlags() & 8) != 0;
            if (z12 != z13) {
                throw new ZipFormatException("Data Descriptor presence mismatch between Local File Header and Central Directory for entry " + name + ". LFH: " + z12 + ", CD: " + z13);
            }
            boolean z14 = z12;
            long crc32 = centralDirectoryRecord.getCrc32();
            long compressedSize = centralDirectoryRecord.getCompressedSize();
            long uncompressedSize = centralDirectoryRecord.getUncompressedSize();
            if (z14) {
                byteOrder = byteOrder2;
                i10 = i13;
            } else {
                byteOrder = byteOrder2;
                i10 = i13;
                long unsignedInt32 = ZipUtils.getUnsignedInt32(byteBuffer, 14);
                if (unsignedInt32 != crc32) {
                    throw new ZipFormatException("CRC-32 mismatch between Local File Header and Central Directory for entry " + name + ". LFH: " + unsignedInt32 + ", CD: " + crc32);
                }
                long unsignedInt322 = ZipUtils.getUnsignedInt32(byteBuffer, 18);
                if (unsignedInt322 != compressedSize) {
                    throw new ZipFormatException("Compressed size mismatch between Local File Header and Central Directory for entry " + name + ". LFH: " + unsignedInt322 + ", CD: " + compressedSize);
                }
                long unsignedInt323 = ZipUtils.getUnsignedInt32(byteBuffer, 22);
                if (unsignedInt323 != uncompressedSize) {
                    throw new ZipFormatException("Uncompressed size mismatch between Local File Header and Central Directory for entry " + name + ". LFH: " + unsignedInt323 + ", CD: " + uncompressedSize);
                }
            }
            int unsignedInt16 = ZipUtils.getUnsignedInt16(byteBuffer, 26);
            if (unsignedInt16 > nameSizeBytes) {
                throw new ZipFormatException(a.a(h.a(unsignedInt16, "Name mismatch between Local File Header and Central Directory for entry", name, ". LFH: ", " bytes, CD: "), nameSizeBytes, " bytes"));
            }
            String name2 = CentralDirectoryRecord.getName(byteBuffer, 30, unsignedInt16);
            if (!name.equals(name2)) {
                throw new ZipFormatException(g0.a("Name mismatch between Local File Header and Central Directory. LFH: \"", name2, "\", CD: \"", name, "\""));
            }
            int unsignedInt162 = ZipUtils.getUnsignedInt16(byteBuffer, 28);
            long j13 = localFileHeaderOffset + 30 + unsignedInt16;
            long j14 = unsignedInt162 + j13;
            boolean z15 = centralDirectoryRecord.getCompressionMethod() != 0;
            if (!z15) {
                compressedSize = uncompressedSize;
            }
            boolean z16 = z15;
            long j15 = j14 + compressedSize;
            if (j15 > j10) {
                throw new ZipFormatException("Local File Header data of " + name + " overlaps with Central Directory. LFH data start: " + j14 + ", LFH data end: " + j15 + ", CD start: " + j10);
            }
            ByteBuffer byteBuffer2 = EMPTY_BYTE_BUFFER;
            if (z10 && unsignedInt162 > 0) {
                byteBuffer2 = dataSource.getByteBuffer(j13, unsignedInt162);
            }
            if (!z11 || i10 == 0) {
                j11 = uncompressedSize;
            } else {
                long j16 = 12 + j15;
                j11 = uncompressedSize;
                if (j16 > j10) {
                    throw new ZipFormatException("Data Descriptor of " + name + " overlaps with Central Directory. Data Descriptor end: " + j15 + ", CD start: " + j10);
                }
                ByteBuffer byteBuffer3 = dataSource.getByteBuffer(j15, 4);
                byteBuffer3.order(byteOrder);
                if (byteBuffer3.getInt() == DATA_DESCRIPTOR_SIGNATURE) {
                    j16 = 16 + j15;
                    if (j16 > j10) {
                        throw new ZipFormatException("Data Descriptor of " + name + " overlaps with Central Directory. Data Descriptor end: " + j15 + ", CD start: " + j10);
                    }
                }
                j15 = j16;
            }
            return new LocalFileRecord(name, nameSizeBytes, byteBuffer2, localFileHeaderOffset, j15 - localFileHeaderOffset, unsignedInt16 + 30 + unsignedInt162, compressedSize, z16, j11);
        } catch (IOException e10) {
            throw new IOException(m3.a.a("Failed to read Local File Header of ", name), e10);
        }
    }

    public static void outputUncompressedData(DataSource dataSource, CentralDirectoryRecord centralDirectoryRecord, long j10, DataSink dataSink) throws IOException, ZipFormatException {
        getRecord(dataSource, centralDirectoryRecord, j10, false, false).outputUncompressedData(dataSource, dataSink);
    }
}
