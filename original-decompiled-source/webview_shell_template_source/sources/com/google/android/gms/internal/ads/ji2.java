package com.google.android.gms.internal.ads;

import android.media.MediaCodec;
import java.nio.ByteBuffer;
import java.util.Arrays;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class ji2 {

    /* renamed from: a, reason: collision with root package name */
    public final ex0 f6077a = new ex0(32);

    /* renamed from: b, reason: collision with root package name */
    public ii2 f6078b;

    /* renamed from: c, reason: collision with root package name */
    public ii2 f6079c;

    /* renamed from: d, reason: collision with root package name */
    public ii2 f6080d;

    /* renamed from: e, reason: collision with root package name */
    public long f6081e;

    /* renamed from: f, reason: collision with root package name */
    public final u1 f6082f;

    public ji2(u1 u1Var) {
        this.f6082f = u1Var;
        ii2 ii2Var = new ii2(0L);
        this.f6078b = ii2Var;
        this.f6079c = ii2Var;
        this.f6080d = ii2Var;
    }

    public static ii2 c(ii2 ii2Var, long j6, ByteBuffer byteBuffer, int i6) {
        while (j6 >= ii2Var.f5779b) {
            ii2Var = ii2Var.f5781d;
        }
        while (i6 > 0) {
            int iMin = Math.min(i6, (int) (ii2Var.f5779b - j6));
            hk2 hk2Var = ii2Var.f5780c;
            byte[] bArr = hk2Var.f5436a;
            long j7 = j6 - ii2Var.f5778a;
            hk2Var.getClass();
            byteBuffer.put(bArr, (int) j7, iMin);
            i6 -= iMin;
            j6 += iMin;
            if (j6 == ii2Var.f5779b) {
                ii2Var = ii2Var.f5781d;
            }
        }
        return ii2Var;
    }

    public static ii2 d(ii2 ii2Var, long j6, byte[] bArr, int i6) {
        while (j6 >= ii2Var.f5779b) {
            ii2Var = ii2Var.f5781d;
        }
        int i7 = i6;
        while (i7 > 0) {
            int iMin = Math.min(i7, (int) (ii2Var.f5779b - j6));
            hk2 hk2Var = ii2Var.f5780c;
            byte[] bArr2 = hk2Var.f5436a;
            long j7 = j6 - ii2Var.f5778a;
            hk2Var.getClass();
            System.arraycopy(bArr2, (int) j7, bArr, i6 - i7, iMin);
            i7 -= iMin;
            j6 += iMin;
            if (j6 == ii2Var.f5779b) {
                ii2Var = ii2Var.f5781d;
            }
        }
        return ii2Var;
    }

    public static ii2 e(ii2 ii2Var, ja2 ja2Var, c7 c7Var, ex0 ex0Var) {
        if (ja2Var.a(1073741824)) {
            long j6 = c7Var.f3444u;
            int iZ = 1;
            ex0Var.g(1);
            ii2 ii2VarD = d(ii2Var, j6, ex0Var.f4416a, 1);
            long j7 = j6 + 1;
            byte b7 = ex0Var.f4416a[0];
            int i6 = b7 & 128;
            int i7 = b7 & Byte.MAX_VALUE;
            n92 n92Var = ja2Var.f6002c;
            byte[] bArr = n92Var.f7352a;
            if (bArr == null) {
                n92Var.f7352a = new byte[16];
            } else {
                Arrays.fill(bArr, (byte) 0);
            }
            boolean z6 = i6 != 0;
            ii2Var = d(ii2VarD, j7, n92Var.f7352a, i7);
            long j8 = j7 + i7;
            if (z6) {
                ex0Var.g(2);
                ii2Var = d(ii2Var, j8, ex0Var.f4416a, 2);
                j8 += 2;
                iZ = ex0Var.z();
            }
            int[] iArr = n92Var.f7355d;
            if (iArr == null || iArr.length < iZ) {
                iArr = new int[iZ];
            }
            int[] iArr2 = n92Var.f7356e;
            if (iArr2 == null || iArr2.length < iZ) {
                iArr2 = new int[iZ];
            }
            if (z6) {
                int i8 = iZ * 6;
                ex0Var.g(i8);
                ii2Var = d(ii2Var, j8, ex0Var.f4416a, i8);
                j8 += i8;
                ex0Var.j(0);
                for (int i9 = 0; i9 < iZ; i9++) {
                    iArr[i9] = ex0Var.z();
                    iArr2[i9] = ex0Var.y();
                }
            } else {
                iArr[0] = 0;
                iArr2[0] = c7Var.f3443t - ((int) (j8 - c7Var.f3444u));
            }
            r1 r1Var = (r1) c7Var.f3445v;
            int i10 = j31.f5914a;
            byte[] bArr2 = r1Var.f8503b;
            byte[] bArr3 = n92Var.f7352a;
            int i11 = r1Var.f8502a;
            int i12 = r1Var.f8504c;
            int i13 = r1Var.f8505d;
            n92Var.f7357f = iZ;
            n92Var.f7355d = iArr;
            n92Var.f7356e = iArr2;
            n92Var.f7353b = bArr2;
            n92Var.f7352a = bArr3;
            n92Var.f7354c = i11;
            n92Var.f7358g = i12;
            n92Var.h = i13;
            MediaCodec.CryptoInfo cryptoInfo = n92Var.f7359i;
            cryptoInfo.numSubSamples = iZ;
            cryptoInfo.numBytesOfClearData = iArr;
            cryptoInfo.numBytesOfEncryptedData = iArr2;
            cryptoInfo.key = bArr2;
            cryptoInfo.iv = bArr3;
            cryptoInfo.mode = i11;
            if (j31.f5914a >= 24) {
                o82 o82Var = n92Var.f7360j;
                o82Var.getClass();
                MediaCodec.CryptoInfo.Pattern pattern = o82Var.f7647b;
                pattern.set(i12, i13);
                o82Var.f7646a.setPattern(pattern);
            }
            long j9 = c7Var.f3444u;
            int i14 = (int) (j8 - j9);
            c7Var.f3444u = j9 + i14;
            c7Var.f3443t -= i14;
        }
        if (!ja2Var.a(268435456)) {
            ja2Var.d(c7Var.f3443t);
            return c(ii2Var, c7Var.f3444u, ja2Var.f6003d, c7Var.f3443t);
        }
        ex0Var.g(4);
        ii2 ii2VarD2 = d(ii2Var, c7Var.f3444u, ex0Var.f4416a, 4);
        int iY = ex0Var.y();
        c7Var.f3444u += 4;
        c7Var.f3443t -= 4;
        ja2Var.d(iY);
        ii2 ii2VarC = c(ii2VarD2, c7Var.f3444u, ja2Var.f6003d, iY);
        c7Var.f3444u += iY;
        int i15 = c7Var.f3443t - iY;
        c7Var.f3443t = i15;
        ByteBuffer byteBuffer = ja2Var.f6006g;
        if (byteBuffer == null || byteBuffer.capacity() < i15) {
            ja2Var.f6006g = ByteBuffer.allocate(i15);
        } else {
            ja2Var.f6006g.clear();
        }
        return c(ii2VarC, c7Var.f3444u, ja2Var.f6006g, c7Var.f3443t);
    }

    public final void a(long j6) {
        ii2 ii2Var;
        if (j6 != -1) {
            while (true) {
                ii2Var = this.f6078b;
                if (j6 < ii2Var.f5779b) {
                    break;
                }
                u1 u1Var = this.f6082f;
                hk2 hk2Var = ii2Var.f5780c;
                synchronized (u1Var) {
                    hk2[] hk2VarArr = (hk2[]) u1Var.f9424d;
                    int i6 = u1Var.f9423c;
                    u1Var.f9423c = i6 + 1;
                    hk2VarArr[i6] = hk2Var;
                    u1Var.f9422b--;
                    u1Var.notifyAll();
                }
                ii2 ii2Var2 = this.f6078b;
                ii2Var2.f5780c = null;
                ii2 ii2Var3 = ii2Var2.f5781d;
                ii2Var2.f5781d = null;
                this.f6078b = ii2Var3;
            }
            if (this.f6079c.f5778a < ii2Var.f5778a) {
                this.f6079c = ii2Var;
            }
        }
    }

    public final int b(int i6) {
        hk2 hk2Var;
        ii2 ii2Var = this.f6080d;
        if (ii2Var.f5780c == null) {
            u1 u1Var = this.f6082f;
            synchronized (u1Var) {
                try {
                    int i7 = u1Var.f9422b + 1;
                    u1Var.f9422b = i7;
                    int i8 = u1Var.f9423c;
                    if (i8 > 0) {
                        hk2[] hk2VarArr = (hk2[]) u1Var.f9424d;
                        int i9 = i8 - 1;
                        u1Var.f9423c = i9;
                        hk2Var = hk2VarArr[i9];
                        if (hk2Var == null) {
                            throw null;
                        }
                        hk2VarArr[i9] = null;
                    } else {
                        hk2Var = new hk2(new byte[65536]);
                        hk2[] hk2VarArr2 = (hk2[]) u1Var.f9424d;
                        int length = hk2VarArr2.length;
                        if (i7 > length) {
                            u1Var.f9424d = (hk2[]) Arrays.copyOf(hk2VarArr2, length + length);
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            ii2 ii2Var2 = new ii2(this.f6080d.f5779b);
            ii2Var.f5780c = hk2Var;
            ii2Var.f5781d = ii2Var2;
        }
        return Math.min(i6, (int) (this.f6080d.f5779b - this.f6081e));
    }
}
