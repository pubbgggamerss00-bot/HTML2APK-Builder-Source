package com.android.apksig.internal.util;

import com.android.apksig.util.DataSink;
import java.io.IOException;
import java.nio.ByteBuffer;

/* loaded from: classes.dex */
public class TeeDataSink implements DataSink {
    private final DataSink[] mSinks;

    public TeeDataSink(DataSink[] dataSinkArr) {
        this.mSinks = dataSinkArr;
    }

    @Override // com.android.apksig.util.DataSink
    public void consume(byte[] bArr, int i10, int i11) throws IOException {
        for (DataSink dataSink : this.mSinks) {
            dataSink.consume(bArr, i10, i11);
        }
    }

    @Override // com.android.apksig.util.DataSink
    public void consume(ByteBuffer byteBuffer) throws IOException {
        int iPosition = byteBuffer.position();
        for (int i10 = 0; i10 < this.mSinks.length; i10++) {
            if (i10 > 0) {
                byteBuffer.position(iPosition);
            }
            this.mSinks[i10].consume(byteBuffer);
        }
    }
}
