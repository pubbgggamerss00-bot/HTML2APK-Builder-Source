package com.android.apksig.util;

import com.android.apksig.internal.util.ByteBufferDataSource;
import com.android.apksig.internal.util.FileChannelDataSource;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

/* loaded from: classes.dex */
public abstract class DataSources {
    private DataSources() {
    }

    public static DataSource asDataSource(ByteBuffer byteBuffer) {
        byteBuffer.getClass();
        return new ByteBufferDataSource(byteBuffer);
    }

    public static DataSource asDataSource(RandomAccessFile randomAccessFile) {
        return asDataSource(randomAccessFile.getChannel());
    }

    public static DataSource asDataSource(RandomAccessFile randomAccessFile, long j10, long j11) {
        return asDataSource(randomAccessFile.getChannel(), j10, j11);
    }

    public static DataSource asDataSource(FileChannel fileChannel) {
        fileChannel.getClass();
        return new FileChannelDataSource(fileChannel);
    }

    public static DataSource asDataSource(FileChannel fileChannel, long j10, long j11) {
        fileChannel.getClass();
        return new FileChannelDataSource(fileChannel, j10, j11);
    }
}
