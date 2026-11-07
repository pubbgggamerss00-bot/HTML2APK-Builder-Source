package com.android.apksig.internal.zip;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* loaded from: classes.dex */
public class EocdRecord {
    private static final int CD_OFFSET_OFFSET = 16;
    private static final int CD_RECORD_COUNT_ON_DISK_OFFSET = 8;
    private static final int CD_RECORD_COUNT_TOTAL_OFFSET = 10;
    private static final int CD_SIZE_OFFSET = 12;

    public static ByteBuffer createWithModifiedCentralDirectoryInfo(ByteBuffer byteBuffer, int i10, long j10, long j11) {
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(byteBuffer.remaining());
        byteBufferAllocate.order(ByteOrder.LITTLE_ENDIAN);
        byteBufferAllocate.put(byteBuffer.slice());
        byteBufferAllocate.flip();
        ZipUtils.setUnsignedInt16(byteBufferAllocate, 8, i10);
        ZipUtils.setUnsignedInt16(byteBufferAllocate, 10, i10);
        ZipUtils.setUnsignedInt32(byteBufferAllocate, 12, j10);
        ZipUtils.setUnsignedInt32(byteBufferAllocate, 16, j11);
        return byteBufferAllocate;
    }

    public static ByteBuffer createWithPaddedComment(ByteBuffer byteBuffer, int i10) {
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(byteBuffer.remaining() + i10);
        byteBufferAllocate.order(ByteOrder.LITTLE_ENDIAN);
        byteBufferAllocate.put(byteBuffer.slice());
        byteBufferAllocate.rewind();
        ZipUtils.updateZipEocdCommentLen(byteBufferAllocate);
        return byteBufferAllocate;
    }
}
