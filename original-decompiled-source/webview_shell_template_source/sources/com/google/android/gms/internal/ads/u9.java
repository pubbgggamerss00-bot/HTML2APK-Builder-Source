package com.google.android.gms.internal.ads;

import android.util.SparseArray;
import androidx.camera.camera2.internal.compat.CameraAccessExceptionCompat;
import java.io.EOFException;
import java.io.InterruptedIOException;
import java.util.List;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class u9 implements x0 {

    /* renamed from: e, reason: collision with root package name */
    public boolean f9497e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f9498f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f9499g;
    public long h;

    /* renamed from: i, reason: collision with root package name */
    public r9 f9500i;

    /* renamed from: j, reason: collision with root package name */
    public z0 f9501j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f9502k;

    /* renamed from: a, reason: collision with root package name */
    public final m11 f9493a = new m11();

    /* renamed from: c, reason: collision with root package name */
    public final ex0 f9495c = new ex0(4096);

    /* renamed from: b, reason: collision with root package name */
    public final SparseArray f9494b = new SparseArray();

    /* renamed from: d, reason: collision with root package name */
    public final s9 f9496d = new s9();

    /* JADX WARN: Removed duplicated region for block: B:14:0x0023  */
    @Override // com.google.android.gms.internal.ads.x0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void c(long j6, long j7) {
        long j8;
        SparseArray sparseArray = this.f9494b;
        m11 m11Var = this.f9493a;
        synchronized (m11Var) {
            j8 = m11Var.f6902b;
        }
        if (j8 != -9223372036854775807L) {
            long jD = m11Var.d();
            if (jD != -9223372036854775807L && jD != 0 && jD != j7) {
                m11Var.e(j7);
            }
        }
        r9 r9Var = this.f9500i;
        if (r9Var != null) {
            r9Var.b(j7);
        }
        for (int i6 = 0; i6 < sparseArray.size(); i6++) {
            t9 t9Var = (t9) sparseArray.valueAt(i6);
            t9Var.f9143f = false;
            t9Var.f9138a.zze();
        }
    }

    @Override // com.google.android.gms.internal.ads.x0
    public final boolean d(y0 y0Var) throws EOFException, InterruptedIOException {
        byte[] bArr = new byte[14];
        p0 p0Var = (p0) y0Var;
        p0Var.g(bArr, 0, 14, false);
        if ((((bArr[0] & 255) << 24) | ((bArr[1] & 255) << 16) | ((bArr[2] & 255) << 8) | (bArr[3] & 255)) == 442 && (bArr[4] & 196) == 68 && (bArr[6] & 4) == 4 && (bArr[8] & 4) == 4 && (bArr[9] & 1) == 1 && (bArr[12] & 3) == 3) {
            p0Var.k(bArr[13] & 7, false);
            p0Var.g(bArr, 0, 3, false);
            if ((((bArr[0] & 255) << 16) | ((bArr[1] & 255) << 8) | (bArr[2] & 255)) == 1) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.x0
    public final int e(y0 y0Var, b1 b1Var) {
        int i6;
        long jB;
        z8 b9Var;
        long j6;
        y5.k(this.f9501j);
        long jZzd = y0Var.zzd();
        long j7 = -9223372036854775807L;
        s9 s9Var = this.f9496d;
        if (jZzd != -1) {
            boolean z6 = s9Var.f8847c;
            ex0 ex0Var = s9Var.f8846b;
            if (!z6) {
                if (!s9Var.f8849e) {
                    long jZzd2 = y0Var.zzd();
                    int iMin = (int) Math.min(20000L, jZzd2);
                    long j8 = jZzd2 - iMin;
                    if (y0Var.zzf() != j8) {
                        b1Var.f2886a = j8;
                        return 1;
                    }
                    ex0Var.g(iMin);
                    y0Var.zzj();
                    y0Var.h(0, iMin, ex0Var.f4416a);
                    int i7 = ex0Var.f4417b;
                    int i8 = ex0Var.f4418c - 4;
                    while (true) {
                        if (i8 < i7) {
                            break;
                        }
                        if (s9.b(i8, ex0Var.f4416a) == 442) {
                            ex0Var.j(i8 + 4);
                            long jA = s9.a(ex0Var);
                            if (jA != -9223372036854775807L) {
                                j7 = jA;
                                break;
                            }
                        }
                        i8--;
                    }
                    s9Var.f8851g = j7;
                    s9Var.f8849e = true;
                    return 0;
                }
                if (s9Var.f8851g == -9223372036854775807L) {
                    byte[] bArr = j31.f5919f;
                    int length = bArr.length;
                    ex0Var.h(0, bArr);
                    s9Var.f8847c = true;
                    y0Var.zzj();
                    return 0;
                }
                if (s9Var.f8848d) {
                    long j9 = s9Var.f8850f;
                    if (j9 == -9223372036854775807L) {
                        byte[] bArr2 = j31.f5919f;
                        int length2 = bArr2.length;
                        ex0Var.h(0, bArr2);
                        s9Var.f8847c = true;
                        y0Var.zzj();
                        return 0;
                    }
                    m11 m11Var = s9Var.f8845a;
                    s9Var.h = m11Var.c(s9Var.f8851g) - m11Var.b(j9);
                    byte[] bArr3 = j31.f5919f;
                    int length3 = bArr3.length;
                    ex0Var.h(0, bArr3);
                    s9Var.f8847c = true;
                    y0Var.zzj();
                    return 0;
                }
                int iMin2 = (int) Math.min(20000L, y0Var.zzd());
                if (y0Var.zzf() != 0) {
                    b1Var.f2886a = 0L;
                    return 1;
                }
                ex0Var.g(iMin2);
                y0Var.zzj();
                y0Var.h(0, iMin2, ex0Var.f4416a);
                int i9 = ex0Var.f4417b;
                int i10 = ex0Var.f4418c;
                while (true) {
                    if (i9 >= i10 - 3) {
                        j6 = -9223372036854775807L;
                        break;
                    }
                    if (s9.b(i9, ex0Var.f4416a) == 442) {
                        ex0Var.j(i9 + 4);
                        long jA2 = s9.a(ex0Var);
                        if (jA2 != -9223372036854775807L) {
                            j6 = jA2;
                            break;
                        }
                    }
                    i9++;
                }
                s9Var.f8850f = j6;
                s9Var.f8848d = true;
                return 0;
            }
        }
        if (!this.f9502k) {
            this.f9502k = true;
            long j10 = s9Var.h;
            if (j10 != -9223372036854775807L) {
                m11 m11Var2 = s9Var.f8845a;
                y5 y5Var = new y5(13);
                ro0 ro0Var = new ro0();
                ro0Var.s = m11Var2;
                ro0Var.f8673t = new ex0();
                r9 r9Var = new r9(y5Var, ro0Var, j10, j10 + 1, 0L, jZzd, 188L, CameraAccessExceptionCompat.CAMERA_DEPRECATED_HAL);
                this.f9500i = r9Var;
                this.f9501j.f(r9Var.f6893a);
            } else {
                this.f9501j.f(new l1(j10, 0L));
            }
        }
        r9 r9Var2 = this.f9500i;
        if (r9Var2 != null && r9Var2.f6895c != null) {
            return r9Var2.a(y0Var, b1Var);
        }
        y0Var.zzj();
        long jZze = jZzd != -1 ? jZzd - y0Var.zze() : -1L;
        if (jZze != -1 && jZze < 4) {
            return -1;
        }
        ex0 ex0Var2 = this.f9495c;
        if (!y0Var.g(ex0Var2.f4416a, 0, 4, true)) {
            return -1;
        }
        ex0Var2.j(0);
        int iQ = ex0Var2.q();
        if (iQ == 441) {
            return -1;
        }
        if (iQ == 442) {
            y0Var.h(0, 10, ex0Var2.f4416a);
            ex0Var2.j(9);
            y0Var.b((ex0Var2.v() & 7) + 14);
            return 0;
        }
        if (iQ == 443) {
            y0Var.h(0, 2, ex0Var2.f4416a);
            ex0Var2.j(0);
            y0Var.b(ex0Var2.z() + 6);
            return 0;
        }
        if ((iQ >> 8) != 1) {
            y0Var.b(1);
            return 0;
        }
        int i11 = iQ & 255;
        SparseArray sparseArray = this.f9494b;
        t9 t9Var = (t9) sparseArray.get(i11);
        if (!this.f9497e) {
            if (t9Var == null) {
                z8 z8Var = null;
                if (i11 == 189) {
                    s8 s8Var = new s8(null, 0);
                    this.f9498f = true;
                    this.h = y0Var.zzf();
                    z8Var = s8Var;
                } else {
                    if ((iQ & 224) == 192) {
                        b9Var = new l9(null, 0);
                        this.f9498f = true;
                        this.h = y0Var.zzf();
                    } else if ((iQ & 240) == 224) {
                        b9Var = new b9(null);
                        this.f9499g = true;
                        this.h = y0Var.zzf();
                    }
                    z8Var = b9Var;
                }
                if (z8Var != null) {
                    z8Var.d(this.f9501j, new ea(Integer.MIN_VALUE, i11, 256));
                    t9Var = new t9(z8Var, this.f9493a);
                    sparseArray.put(i11, t9Var);
                }
            }
            long j11 = 1048576;
            if (this.f9498f && this.f9499g) {
                j11 = 8192 + this.h;
            }
            if (y0Var.zzf() > j11) {
                this.f9497e = true;
                this.f9501j.d();
            }
        }
        y0Var.h(0, 2, ex0Var2.f4416a);
        ex0Var2.j(0);
        int iZ = ex0Var2.z() + 6;
        if (t9Var == null) {
            y0Var.b(iZ);
            return 0;
        }
        ex0Var2.g(iZ);
        y0Var.i(0, iZ, ex0Var2.f4416a);
        ex0Var2.j(6);
        m11 m11Var3 = t9Var.f9139b;
        z8 z8Var2 = t9Var.f9138a;
        l42 l42Var = t9Var.f9140c;
        ex0Var2.f(0, 3, (byte[]) l42Var.f6576d);
        l42Var.B(0);
        l42Var.D(8);
        t9Var.f9141d = l42Var.G();
        t9Var.f9142e = l42Var.G();
        l42Var.D(6);
        ex0Var2.f(0, l42Var.w(8), (byte[]) l42Var.f6576d);
        l42Var.B(0);
        if (t9Var.f9141d) {
            l42Var.D(4);
            long jW = l42Var.w(3);
            l42Var.D(1);
            int iW = l42Var.w(15) << 15;
            l42Var.D(1);
            long jW2 = l42Var.w(15);
            l42Var.D(1);
            if (!t9Var.f9143f && t9Var.f9142e) {
                l42Var.D(4);
                l42Var.D(1);
                int iW2 = l42Var.w(15) << 15;
                l42Var.D(1);
                long jW3 = l42Var.w(15);
                l42Var.D(1);
                m11Var3.b((l42Var.w(3) << 30) | iW2 | jW3);
                t9Var.f9143f = true;
            }
            jB = m11Var3.b((jW << 30) | iW | jW2);
            i6 = 4;
        } else {
            i6 = 4;
            jB = 0;
        }
        z8Var2.e(i6, jB);
        z8Var2.c(ex0Var2);
        z8Var2.a(false);
        ex0Var2.i(ex0Var2.f4416a.length);
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.x0
    public final void f(z0 z0Var) {
        this.f9501j = z0Var;
    }

    @Override // com.google.android.gms.internal.ads.x0
    public final List zzd() {
        zn1 zn1Var = bo1.f3236t;
        return cp1.f3636w;
    }
}
