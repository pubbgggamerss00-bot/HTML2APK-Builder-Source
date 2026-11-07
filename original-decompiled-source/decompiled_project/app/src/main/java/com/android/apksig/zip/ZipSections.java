package com.android.apksig.zip;

import java.nio.ByteBuffer;

/* loaded from: classes.dex */
public class ZipSections {
    private final long mCentralDirectoryOffset;
    private final int mCentralDirectoryRecordCount;
    private final long mCentralDirectorySizeBytes;
    private final ByteBuffer mEocd;
    private final long mEocdOffset;

    public ZipSections(long j10, long j11, int i10, long j12, ByteBuffer byteBuffer) {
        this.mCentralDirectoryOffset = j10;
        this.mCentralDirectorySizeBytes = j11;
        this.mCentralDirectoryRecordCount = i10;
        this.mEocdOffset = j12;
        this.mEocd = byteBuffer;
    }

    public long getZipCentralDirectoryOffset() {
        return this.mCentralDirectoryOffset;
    }

    public int getZipCentralDirectoryRecordCount() {
        return this.mCentralDirectoryRecordCount;
    }

    public long getZipCentralDirectorySizeBytes() {
        return this.mCentralDirectorySizeBytes;
    }

    public ByteBuffer getZipEndOfCentralDirectory() {
        return this.mEocd;
    }

    public long getZipEndOfCentralDirectoryOffset() {
        return this.mEocdOffset;
    }
}
