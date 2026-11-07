package org.bouncycastle.crypto.modes.gcm;

import java.lang.reflect.Array;
import org.bouncycastle.util.Pack;

/* loaded from: classes2.dex */
public class Tables8kGCMMultiplier implements GCMMultiplier {
    private byte[] H;
    private long[][][] T;

    @Override // org.bouncycastle.crypto.modes.gcm.GCMMultiplier
    public void init(byte[] bArr) {
        if (this.T == null) {
            this.T = (long[][][]) Array.newInstance((Class<?>) Long.TYPE, 2, 256, 2);
        } else if (GCMUtil.areEqual(this.H, bArr) != 0) {
            return;
        }
        byte[] bArr2 = new byte[16];
        this.H = bArr2;
        GCMUtil.copy(bArr, bArr2);
        for (int i10 = 0; i10 < 2; i10++) {
            long[][][] jArr = this.T;
            long[][] jArr2 = jArr[i10];
            if (i10 == 0) {
                GCMUtil.asLongs(this.H, jArr2[1]);
                long[] jArr3 = jArr2[1];
                GCMUtil.multiplyP7(jArr3, jArr3);
            } else {
                GCMUtil.multiplyP8(jArr[i10 - 1][1], jArr2[1]);
            }
            for (int i11 = 2; i11 < 256; i11 += 2) {
                GCMUtil.divideP(jArr2[i11 >> 1], jArr2[i11]);
                GCMUtil.xor(jArr2[i11], jArr2[1], jArr2[i11 + 1]);
            }
        }
    }

    @Override // org.bouncycastle.crypto.modes.gcm.GCMMultiplier
    public void multiplyH(byte[] bArr) {
        long[][][] jArr = this.T;
        long[][] jArr2 = jArr[0];
        long[][] jArr3 = jArr[1];
        long[] jArr4 = jArr2[bArr[14] & 255];
        long[] jArr5 = jArr3[bArr[15] & 255];
        long j10 = jArr4[0] ^ jArr5[0];
        long j11 = jArr5[1] ^ jArr4[1];
        for (int i10 = 12; i10 >= 0; i10 -= 2) {
            long[] jArr6 = jArr2[bArr[i10] & 255];
            long[] jArr7 = jArr3[bArr[i10 + 1] & 255];
            long j12 = j11 << 48;
            j11 = (jArr6[1] ^ jArr7[1]) ^ ((j11 >>> 16) | (j10 << 48));
            j10 = (((((j10 >>> 16) ^ (jArr6[0] ^ jArr7[0])) ^ j12) ^ (j12 >>> 1)) ^ (j12 >>> 2)) ^ (j12 >>> 7);
        }
        Pack.longToBigEndian(j10, bArr, 0);
        Pack.longToBigEndian(j11, bArr, 8);
    }
}
