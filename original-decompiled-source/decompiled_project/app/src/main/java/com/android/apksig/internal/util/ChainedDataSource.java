package com.android.apksig.internal.util;

import com.android.apksig.util.DataSink;
import com.android.apksig.util.DataSource;
import h1.y;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.ArrayList;

/* loaded from: classes.dex */
public class ChainedDataSource implements DataSource {
    private final DataSource[] mSources;
    private final long mTotalSize;

    public ChainedDataSource(DataSource... dataSourceArr) {
        this.mSources = dataSourceArr;
        long size = 0;
        for (DataSource dataSource : dataSourceArr) {
            size += dataSource.size();
        }
        this.mTotalSize = size;
    }

    private Pair<Integer, Long> locateDataSource(long j10) {
        int i10 = 0;
        long size = j10;
        while (true) {
            DataSource[] dataSourceArr = this.mSources;
            if (i10 >= dataSourceArr.length) {
                StringBuilder sbA = y.a("Access is out of bound, offset: ", ", totalSize: ", j10);
                sbA.append(this.mTotalSize);
                throw new IndexOutOfBoundsException(sbA.toString());
            }
            if (size < dataSourceArr[i10].size()) {
                return Pair.of(Integer.valueOf(i10), Long.valueOf(size));
            }
            size -= this.mSources[i10].size();
            i10++;
        }
    }

    @Override // com.android.apksig.util.DataSource
    public void copyTo(long j10, int i10, ByteBuffer byteBuffer) throws IOException {
        feed(j10, i10, new ByteBufferSink(byteBuffer));
    }

    @Override // com.android.apksig.util.DataSource
    public void feed(long j10, long j11, DataSink dataSink) throws IOException {
        DataSink dataSink2;
        if (j10 + j11 > this.mTotalSize) {
            throw new IndexOutOfBoundsException("Requested more than available");
        }
        DataSource[] dataSourceArr = this.mSources;
        int length = dataSourceArr.length;
        int i10 = 0;
        long size = j10;
        long j12 = j11;
        while (i10 < length) {
            DataSource dataSource = dataSourceArr[i10];
            if (size >= dataSource.size()) {
                size -= dataSource.size();
                dataSink2 = dataSink;
            } else {
                long size2 = dataSource.size() - size;
                if (size2 >= j12) {
                    dataSource.feed(size, j12, dataSink);
                    return;
                }
                dataSink2 = dataSink;
                dataSource.feed(size, size2, dataSink2);
                j12 -= size2;
                size = 0;
            }
            i10++;
            dataSink = dataSink2;
        }
    }

    @Override // com.android.apksig.util.DataSource
    public ByteBuffer getByteBuffer(long j10, int i10) throws IOException {
        long j11 = i10;
        if (j10 + j11 > this.mTotalSize) {
            throw new IndexOutOfBoundsException("Requested more than available");
        }
        Pair<Integer, Long> pairLocateDataSource = locateDataSource(j10);
        int iIntValue = pairLocateDataSource.getFirst().intValue();
        long jLongValue = pairLocateDataSource.getSecond().longValue();
        if (j11 + jLongValue <= this.mSources[iIntValue].size()) {
            return this.mSources[iIntValue].getByteBuffer(jLongValue, i10);
        }
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(i10);
        while (iIntValue < this.mSources.length && byteBufferAllocate.hasRemaining()) {
            this.mSources[iIntValue].copyTo(jLongValue, Math.toIntExact(Math.min(this.mSources[iIntValue].size() - jLongValue, byteBufferAllocate.remaining())), byteBufferAllocate);
            iIntValue++;
            jLongValue = 0;
        }
        byteBufferAllocate.rewind();
        return byteBufferAllocate;
    }

    @Override // com.android.apksig.util.DataSource
    public long size() {
        return this.mTotalSize;
    }

    @Override // com.android.apksig.util.DataSource
    public DataSource slice(long j10, long j11) {
        Pair<Integer, Long> pairLocateDataSource = locateDataSource(j10);
        int iIntValue = pairLocateDataSource.getFirst().intValue();
        long jLongValue = pairLocateDataSource.getSecond().longValue();
        DataSource dataSource = this.mSources[iIntValue];
        if (jLongValue + j11 <= dataSource.size()) {
            return dataSource.slice(jLongValue, j11);
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(dataSource.slice(jLongValue, dataSource.size() - jLongValue));
        Pair<Integer, Long> pairLocateDataSource2 = locateDataSource((j10 + j11) - 1);
        int iIntValue2 = pairLocateDataSource2.getFirst().intValue();
        long jLongValue2 = pairLocateDataSource2.getSecond().longValue();
        while (true) {
            iIntValue++;
            if (iIntValue >= iIntValue2) {
                arrayList.add(this.mSources[iIntValue2].slice(0L, jLongValue2 + 1));
                return new ChainedDataSource((DataSource[]) arrayList.toArray(new DataSource[0]));
            }
            arrayList.add(this.mSources[iIntValue]);
        }
    }
}
