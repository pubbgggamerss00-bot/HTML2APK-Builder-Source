package org.bouncycastle.crypto.modes.gcm;

/* loaded from: classes2.dex */
public class BasicGCMExponentiator implements GCMExponentiator {

    /* renamed from: x, reason: collision with root package name */
    private long[] f20049x;

    @Override // org.bouncycastle.crypto.modes.gcm.GCMExponentiator
    public void exponentiateX(long j10, byte[] bArr) {
        long[] jArrOneAsLongs = GCMUtil.oneAsLongs();
        if (j10 > 0) {
            long[] jArr = new long[2];
            GCMUtil.copy(this.f20049x, jArr);
            do {
                if ((1 & j10) != 0) {
                    GCMUtil.multiply(jArrOneAsLongs, jArr);
                }
                GCMUtil.square(jArr, jArr);
                j10 >>>= 1;
            } while (j10 > 0);
        }
        GCMUtil.asBytes(jArrOneAsLongs, bArr);
    }

    @Override // org.bouncycastle.crypto.modes.gcm.GCMExponentiator
    public void init(byte[] bArr) {
        this.f20049x = GCMUtil.asLongs(bArr);
    }
}
