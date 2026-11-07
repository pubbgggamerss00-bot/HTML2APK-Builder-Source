package org.bouncycastle.crypto.digests;

import java.io.ByteArrayOutputStream;
import org.bouncycastle.crypto.DataLengthException;
import org.bouncycastle.crypto.Digest;
import org.bouncycastle.crypto.OutputLengthException;
import org.bouncycastle.util.Pack;

/* loaded from: classes2.dex */
public class ISAPDigest implements Digest {
    private ByteArrayOutputStream buffer = new ByteArrayOutputStream();

    /* renamed from: t0, reason: collision with root package name */
    private long f19924t0;

    /* renamed from: t1, reason: collision with root package name */
    private long f19925t1;

    /* renamed from: t2, reason: collision with root package name */
    private long f19926t2;
    private long t3;

    /* renamed from: t4, reason: collision with root package name */
    private long f19927t4;

    /* renamed from: x0, reason: collision with root package name */
    private long f19928x0;

    /* renamed from: x1, reason: collision with root package name */
    private long f19929x1;

    /* renamed from: x2, reason: collision with root package name */
    private long f19930x2;

    /* renamed from: x3, reason: collision with root package name */
    private long f19931x3;

    /* renamed from: x4, reason: collision with root package name */
    private long f19932x4;

    private void P12() {
        ROUND(240L);
        ROUND(225L);
        ROUND(210L);
        ROUND(195L);
        ROUND(180L);
        ROUND(165L);
        ROUND(150L);
        ROUND(135L);
        ROUND(120L);
        ROUND(105L);
        ROUND(90L);
        ROUND(75L);
    }

    private long ROTR(long j10, long j11) {
        return (j10 << ((int) (64 - j11))) | (j10 >>> ((int) j11));
    }

    private void ROUND(long j10) {
        long j11 = this.f19928x0;
        long j12 = this.f19929x1;
        long j13 = this.f19930x2;
        long j14 = this.f19931x3;
        long j15 = this.f19932x4;
        long j16 = ((((j11 ^ j12) ^ j13) ^ j14) ^ j10) ^ ((((j11 ^ j13) ^ j15) ^ j10) & j12);
        this.f19924t0 = j16;
        this.f19925t1 = ((((j11 ^ j13) ^ j14) ^ j15) ^ j10) ^ (((j12 ^ j13) ^ j10) & (j12 ^ j14));
        this.f19926t2 = (((j12 ^ j13) ^ j15) ^ j10) ^ (j14 & j15);
        this.t3 = ((j13 ^ (j11 ^ j12)) ^ j10) ^ ((~j11) & (j14 ^ j15));
        this.f19927t4 = ((j11 ^ j15) & j12) ^ ((j12 ^ j14) ^ j15);
        this.f19928x0 = (ROTR(j16, 19L) ^ j16) ^ ROTR(this.f19924t0, 28L);
        long j17 = this.f19925t1;
        this.f19929x1 = (j17 ^ ROTR(j17, 39L)) ^ ROTR(this.f19925t1, 61L);
        long j18 = this.f19926t2;
        this.f19930x2 = ~((j18 ^ ROTR(j18, 1L)) ^ ROTR(this.f19926t2, 6L));
        long j19 = this.t3;
        this.f19931x3 = (j19 ^ ROTR(j19, 10L)) ^ ROTR(this.t3, 17L);
        long j20 = this.f19927t4;
        this.f19932x4 = (j20 ^ ROTR(j20, 7L)) ^ ROTR(this.f19927t4, 41L);
    }

    public long U64BIG(long j10) {
        return (ROTR(j10, 56L) & 1095216660735L) | (ROTR(j10, 8L) & (-72057589759737856L)) | (ROTR(j10, 24L) & 71776119077928960L) | (ROTR(j10, 40L) & 280375465148160L);
    }

    @Override // org.bouncycastle.crypto.Digest
    public int doFinal(byte[] bArr, int i10) {
        if (i10 + 32 > bArr.length) {
            throw new OutputLengthException("output buffer is too short");
        }
        this.f19927t4 = 0L;
        this.t3 = 0L;
        this.f19926t2 = 0L;
        this.f19925t1 = 0L;
        this.f19924t0 = 0L;
        this.f19928x0 = -1255492011513352131L;
        this.f19929x1 = -8380609354527731710L;
        this.f19930x2 = -5437372128236807582L;
        this.f19931x3 = 4834782570098516968L;
        this.f19932x4 = 3787428097924915520L;
        byte[] byteArray = this.buffer.toByteArray();
        int length = byteArray.length;
        int i11 = length >> 3;
        long[] jArr = new long[i11];
        int i12 = 0;
        Pack.littleEndianToLong(byteArray, 0, jArr, 0, i11);
        int i13 = 0;
        while (length >= 8) {
            this.f19928x0 ^= U64BIG(jArr[i13]);
            P12();
            length -= 8;
            i13++;
        }
        long j10 = this.f19928x0;
        int i14 = (7 - length) << 3;
        long j11 = 128;
        while (true) {
            this.f19928x0 = j10 ^ (j11 << i14);
            if (length <= 0) {
                break;
            }
            j10 = this.f19928x0;
            length--;
            j11 = byteArray[(i13 << 3) + length] & 255;
            i14 = (7 - length) << 3;
        }
        P12();
        long[] jArr2 = new long[4];
        while (true) {
            long jU64BIG = U64BIG(this.f19928x0);
            if (i12 >= 3) {
                jArr2[i12] = jU64BIG;
                Pack.longToLittleEndian(jArr2, bArr, i10);
                this.buffer.reset();
                return 32;
            }
            jArr2[i12] = jU64BIG;
            P12();
            i12++;
        }
    }

    @Override // org.bouncycastle.crypto.Digest
    public String getAlgorithmName() {
        return "ISAP Hash";
    }

    @Override // org.bouncycastle.crypto.Digest
    public int getDigestSize() {
        return 32;
    }

    @Override // org.bouncycastle.crypto.Digest
    public void reset() {
        this.buffer.reset();
    }

    @Override // org.bouncycastle.crypto.Digest
    public void update(byte b10) {
        this.buffer.write(b10);
    }

    @Override // org.bouncycastle.crypto.Digest
    public void update(byte[] bArr, int i10, int i11) {
        if (i10 + i11 > bArr.length) {
            throw new DataLengthException("input buffer too short");
        }
        this.buffer.write(bArr, i10, i11);
    }
}
