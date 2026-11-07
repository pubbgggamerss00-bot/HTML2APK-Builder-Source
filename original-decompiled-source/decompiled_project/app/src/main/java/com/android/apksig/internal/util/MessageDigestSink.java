package com.android.apksig.internal.util;

import com.android.apksig.util.DataSink;
import java.nio.ByteBuffer;
import java.security.MessageDigest;

/* loaded from: classes.dex */
public class MessageDigestSink implements DataSink {
    private final MessageDigest[] mMessageDigests;

    public MessageDigestSink(MessageDigest[] messageDigestArr) {
        this.mMessageDigests = messageDigestArr;
    }

    @Override // com.android.apksig.util.DataSink
    public void consume(byte[] bArr, int i10, int i11) {
        for (MessageDigest messageDigest : this.mMessageDigests) {
            messageDigest.update(bArr, i10, i11);
        }
    }

    @Override // com.android.apksig.util.DataSink
    public void consume(ByteBuffer byteBuffer) {
        int iPosition = byteBuffer.position();
        for (MessageDigest messageDigest : this.mMessageDigests) {
            byteBuffer.position(iPosition);
            messageDigest.update(byteBuffer);
        }
    }
}
