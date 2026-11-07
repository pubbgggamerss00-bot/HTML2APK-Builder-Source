package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.List;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class b5 {

    /* renamed from: d, reason: collision with root package name */
    public static final long[] f2914d = {128, 64, 32, 16, 8, 4, 2, 1};

    /* renamed from: e, reason: collision with root package name */
    public static final byte[] f2915e = {79, 103, 103, 83, 0, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 28, -43, -59, -9, 1, 19, 79, 112, 117, 115, 72, 101, 97, 100, 1, 2, 56, 1, Byte.MIN_VALUE, -69, 0, 0, 0, 0, 0};

    /* renamed from: f, reason: collision with root package name */
    public static final byte[] f2916f = {79, 103, 103, 83, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 11, -103, 87, 83, 1, 16, 79, 112, 117, 115, 84, 97, 103, 115, 0, 0, 0, 0, 0, 0, 0, 0};

    /* renamed from: a, reason: collision with root package name */
    public int f2917a;

    /* renamed from: b, reason: collision with root package name */
    public int f2918b;

    /* renamed from: c, reason: collision with root package name */
    public Object f2919c = new byte[8];

    public static long b(int i6, boolean z6, byte[] bArr) {
        long j6 = bArr[0] & 255;
        if (z6) {
            j6 &= ~f2914d[i6 - 1];
        }
        for (int i7 = 1; i7 < i6; i7++) {
            j6 = (j6 << 8) | (bArr[i7] & 255);
        }
        return j6;
    }

    public static final void c(ByteBuffer byteBuffer, long j6, int i6, int i7, boolean z6) {
        byteBuffer.put((byte) 79);
        byteBuffer.put((byte) 103);
        byteBuffer.put((byte) 103);
        byteBuffer.put((byte) 83);
        byteBuffer.put((byte) 0);
        byteBuffer.put(true != z6 ? (byte) 0 : (byte) 2);
        byteBuffer.putLong(j6);
        byteBuffer.putInt(0);
        byteBuffer.putInt(i6);
        byteBuffer.putInt(0);
        long j7 = i7;
        sl1.f((j7 >> 8) == 0, "out of range: %s", j7);
        byteBuffer.put((byte) j7);
    }

    public void a(ja2 ja2Var, List list) {
        int length;
        ByteBuffer byteBuffer;
        int i6;
        ByteBuffer byteBuffer2 = ja2Var.f6003d;
        byteBuffer2.getClass();
        if (byteBuffer2.limit() - ja2Var.f6003d.position() == 0) {
            return;
        }
        byte[] bArr = null;
        if (this.f2917a == 2 && (list.size() == 1 || list.size() == 3)) {
            bArr = (byte[]) list.get(0);
        }
        ByteBuffer byteBuffer3 = ja2Var.f6003d;
        int iPosition = byteBuffer3.position();
        int iLimit = byteBuffer3.limit();
        int i7 = iLimit - iPosition;
        int i8 = (i7 + 255) / 255;
        int i9 = i8 + 27 + i7;
        if (this.f2917a == 2) {
            length = bArr != null ? bArr.length + 28 : 47;
            i9 += length + 44;
        } else {
            length = 0;
        }
        if (((ByteBuffer) this.f2919c).capacity() < i9) {
            this.f2919c = ByteBuffer.allocate(i9).order(ByteOrder.LITTLE_ENDIAN);
        } else {
            ((ByteBuffer) this.f2919c).clear();
        }
        ByteBuffer byteBuffer4 = (ByteBuffer) this.f2919c;
        if (this.f2917a == 2) {
            if (bArr != null) {
                byteBuffer = byteBuffer4;
                c(byteBuffer, 0L, 0, 1, true);
                int length2 = bArr.length;
                long j6 = length2;
                sl1.f((j6 >> 8) == 0, "out of range: %s", j6);
                byteBuffer.put((byte) j6);
                byteBuffer.put(bArr);
                int i10 = length2 + 28;
                i6 = 22;
                byteBuffer.putInt(22, j31.k(byteBuffer.arrayOffset(), byteBuffer.array(), i10, 0));
                byteBuffer.position(i10);
            } else {
                byteBuffer = byteBuffer4;
                i6 = 22;
                byteBuffer.put(f2915e);
            }
            byteBuffer.put(f2916f);
        } else {
            byteBuffer = byteBuffer4;
            i6 = 22;
        }
        int iR = this.f2918b + ((int) ((me0.r(byteBuffer3.get(0), byteBuffer3.limit() > 1 ? byteBuffer3.get(1) : (byte) 0) * 48000) / 1000000));
        this.f2918b = iR;
        int i11 = i6;
        ByteBuffer byteBuffer5 = byteBuffer;
        c(byteBuffer5, iR, this.f2917a, i8, false);
        for (int i12 = 0; i12 < i8; i12++) {
            if (i7 >= 255) {
                byteBuffer5.put((byte) -1);
                i7 -= 255;
            } else {
                byteBuffer5.put((byte) i7);
                i7 = 0;
            }
        }
        while (iPosition < iLimit) {
            byteBuffer5.put(byteBuffer3.get(iPosition));
            iPosition++;
        }
        byteBuffer3.position(byteBuffer3.limit());
        byteBuffer5.flip();
        if (this.f2917a == 2) {
            byteBuffer5.putInt(length + 66, j31.k(byteBuffer5.arrayOffset() + length + 44, byteBuffer5.array(), byteBuffer5.limit() - byteBuffer5.position(), 0));
        } else {
            byteBuffer5.putInt(i11, j31.k(byteBuffer5.arrayOffset(), byteBuffer5.array(), byteBuffer5.limit() - byteBuffer5.position(), 0));
        }
        this.f2917a++;
        this.f2919c = byteBuffer5;
        ja2Var.c();
        ja2Var.d(((ByteBuffer) this.f2919c).remaining());
        ja2Var.f6003d.put((ByteBuffer) this.f2919c);
        ja2Var.e();
    }

    public long d(y0 y0Var, boolean z6, boolean z7, int i6) {
        int i7;
        byte[] bArr = (byte[]) this.f2919c;
        if (this.f2917a == 0) {
            if (!y0Var.f(bArr, 0, 1, z6)) {
                return -1L;
            }
            int i8 = bArr[0] & 255;
            int i9 = 0;
            while (true) {
                if (i9 >= 8) {
                    i7 = -1;
                    break;
                }
                i7 = i9 + 1;
                if ((f2914d[i9] & i8) != 0) {
                    break;
                }
                i9 = i7;
            }
            this.f2918b = i7;
            if (i7 == -1) {
                throw new IllegalStateException("No valid varint length mask found");
            }
            this.f2917a = 1;
        }
        int i10 = this.f2918b;
        if (i10 > i6) {
            this.f2917a = 0;
            return -2L;
        }
        if (i10 != 1) {
            y0Var.i(1, i10 - 1, bArr);
        }
        this.f2917a = 0;
        return b(this.f2918b, z7, bArr);
    }
}
