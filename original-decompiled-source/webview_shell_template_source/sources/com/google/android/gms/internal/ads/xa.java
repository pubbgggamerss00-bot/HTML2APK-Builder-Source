package com.google.android.gms.internal.ads;

import android.util.Pair;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class xa {
    public static Pair a(RandomAccessFile randomAccessFile, int i6) throws IOException {
        int i7;
        long length = randomAccessFile.length();
        if (length < 22) {
            return null;
        }
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(((int) Math.min(i6, (-22) + length)) + 22);
        byteBufferAllocate.order(ByteOrder.LITTLE_ENDIAN);
        long jCapacity = length - byteBufferAllocate.capacity();
        randomAccessFile.seek(jCapacity);
        randomAccessFile.readFully(byteBufferAllocate.array(), byteBufferAllocate.arrayOffset(), byteBufferAllocate.capacity());
        b(byteBufferAllocate);
        int iCapacity = byteBufferAllocate.capacity();
        if (iCapacity < 22) {
            i7 = -1;
        } else {
            int i8 = iCapacity - 22;
            int iMin = Math.min(i8, 65535);
            for (int i9 = 0; i9 < iMin; i9++) {
                i7 = i8 - i9;
                if (byteBufferAllocate.getInt(i7) == 101010256 && ((char) byteBufferAllocate.getShort(i7 + 20)) == i9) {
                    break;
                }
            }
            i7 = -1;
        }
        if (i7 == -1) {
            return null;
        }
        byteBufferAllocate.position(i7);
        ByteBuffer byteBufferSlice = byteBufferAllocate.slice();
        byteBufferSlice.order(ByteOrder.LITTLE_ENDIAN);
        return Pair.create(byteBufferSlice, Long.valueOf(jCapacity + i7));
    }

    public static void b(ByteBuffer byteBuffer) {
        if (byteBuffer.order() != ByteOrder.LITTLE_ENDIAN) {
            throw new IllegalArgumentException("ByteBuffer byte order must be little endian");
        }
    }
}
