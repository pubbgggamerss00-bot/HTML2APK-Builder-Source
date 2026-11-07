package com.android.apksig.util;

import java.io.IOException;
import java.nio.ByteBuffer;

/* loaded from: classes.dex */
public interface DataSource {
    void copyTo(long j10, int i10, ByteBuffer byteBuffer) throws IOException;

    void feed(long j10, long j11, DataSink dataSink) throws IOException;

    ByteBuffer getByteBuffer(long j10, int i10) throws IOException;

    long size();

    DataSource slice(long j10, long j11);
}
