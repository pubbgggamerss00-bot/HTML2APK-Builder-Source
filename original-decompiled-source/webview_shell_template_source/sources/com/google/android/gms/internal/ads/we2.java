package com.google.android.gms.internal.ads;

import androidx.camera.camera2.internal.compat.CameraAccessExceptionCompat;
import java.nio.ByteBuffer;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class we2 extends gd0 {

    /* renamed from: i, reason: collision with root package name */
    public int f10180i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f10181j;

    /* renamed from: k, reason: collision with root package name */
    public int f10182k;

    /* renamed from: l, reason: collision with root package name */
    public long f10183l;

    /* renamed from: m, reason: collision with root package name */
    public int f10184m;

    /* renamed from: n, reason: collision with root package name */
    public byte[] f10185n;

    /* renamed from: o, reason: collision with root package name */
    public int f10186o;

    /* renamed from: p, reason: collision with root package name */
    public int f10187p;

    /* renamed from: q, reason: collision with root package name */
    public byte[] f10188q;

    @Override // com.google.android.gms.internal.ads.jc0
    public final void a(ByteBuffer byteBuffer) {
        int iLimit;
        int i6;
        int iPosition;
        while (byteBuffer.hasRemaining() && !this.f4999g.hasRemaining()) {
            if (this.f10182k != 0) {
                y5.r(this.f10186o < this.f10185n.length);
                int iLimit2 = byteBuffer.limit();
                int iPosition2 = byteBuffer.position() + 1;
                while (true) {
                    if (iPosition2 >= byteBuffer.limit()) {
                        iLimit = byteBuffer.limit();
                        break;
                    }
                    if (Math.abs((byteBuffer.get(iPosition2) << 8) | (byteBuffer.get(iPosition2 - 1) & 255)) > 1024) {
                        int i7 = this.f10180i;
                        iLimit = (iPosition2 / i7) * i7;
                        break;
                    }
                    iPosition2 += 2;
                }
                int iPosition3 = iLimit - byteBuffer.position();
                int i8 = this.f10186o;
                int i9 = this.f10187p;
                int i10 = i8 + i9;
                int length = this.f10185n.length;
                if (i10 < length) {
                    i6 = length - i10;
                } else {
                    i10 = i9 - (length - i8);
                    i6 = i8 - i10;
                }
                int iMin = Math.min(iPosition3, i6);
                byteBuffer.limit(byteBuffer.position() + iMin);
                byteBuffer.get(this.f10185n, i10, iMin);
                int i11 = this.f10187p + iMin;
                this.f10187p = i11;
                y5.r(i11 <= this.f10185n.length);
                boolean z6 = iLimit < iLimit2 && iPosition3 < i6;
                i(z6);
                if (z6) {
                    this.f10182k = 0;
                    this.f10184m = 0;
                }
                byteBuffer.limit(iLimit2);
            } else {
                int iLimit3 = byteBuffer.limit();
                byteBuffer.limit(Math.min(iLimit3, byteBuffer.position() + this.f10185n.length));
                int iLimit4 = byteBuffer.limit() - 1;
                while (true) {
                    if (iLimit4 < byteBuffer.position()) {
                        iPosition = byteBuffer.position();
                        break;
                    }
                    if (Math.abs((byteBuffer.get(iLimit4) << 8) | (byteBuffer.get(iLimit4 - 1) & 255)) > 1024) {
                        int i12 = this.f10180i;
                        iPosition = ((iLimit4 / i12) * i12) + i12;
                        break;
                    }
                    iLimit4 -= 2;
                }
                if (iPosition == byteBuffer.position()) {
                    this.f10182k = 1;
                } else {
                    byteBuffer.limit(Math.min(iPosition, byteBuffer.capacity()));
                    d(byteBuffer.remaining()).put(byteBuffer).flip();
                }
                byteBuffer.limit(iLimit3);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.gd0
    public final za0 c(za0 za0Var) throws pb0 {
        if (za0Var.f11243c == 2) {
            return za0Var.f11241a == -1 ? za0.f11240e : za0Var;
        }
        throw new pb0(za0Var);
    }

    @Override // com.google.android.gms.internal.ads.gd0
    public final void e() {
        if (zzg()) {
            int i6 = this.f4994b.f11242b;
            int i7 = i6 + i6;
            this.f10180i = i7;
            int i8 = ((((int) ((100000 * r0.f11241a) / 1000000)) / 2) / i7) * i7;
            int i9 = i8 + i8;
            if (this.f10185n.length != i9) {
                this.f10185n = new byte[i9];
                this.f10188q = new byte[i9];
            }
        }
        this.f10182k = 0;
        this.f10183l = 0L;
        this.f10184m = 0;
        this.f10186o = 0;
        this.f10187p = 0;
    }

    @Override // com.google.android.gms.internal.ads.gd0
    public final void f() {
        if (this.f10187p > 0) {
            i(true);
            this.f10184m = 0;
        }
    }

    @Override // com.google.android.gms.internal.ads.gd0
    public final void g() {
        this.f10181j = false;
        byte[] bArr = j31.f5919f;
        this.f10185n = bArr;
        this.f10188q = bArr;
    }

    public final int h(int i6) {
        int length = ((((int) ((2000000 * this.f4994b.f11241a) / 1000000)) - this.f10184m) * this.f10180i) - (this.f10185n.length >> 1);
        y5.r(length >= 0);
        int iMin = (int) Math.min((i6 * 0.2f) + 0.5f, length);
        int i7 = this.f10180i;
        return (iMin / i7) * i7;
    }

    public final void i(boolean z6) {
        int i6;
        int length;
        int i7 = this.f10187p;
        int length2 = this.f10185n.length;
        if (i7 != length2) {
            if (!z6) {
                return;
            } else {
                z6 = true;
            }
        }
        if (this.f10184m == 0) {
            if (z6) {
                j(i7, 3);
                length = i7;
            } else {
                y5.r(i7 >= (length2 >> 1));
                length = this.f10185n.length >> 1;
                j(length, 0);
            }
            i6 = length;
        } else {
            int i8 = length2 >> 1;
            int i9 = i7 - i8;
            if (z6) {
                int iH = h(i9) + (this.f10185n.length >> 1);
                j(iH, 2);
                int i10 = i8 + i9;
                i6 = iH;
                length = i10;
            } else {
                int iH2 = h(i9);
                j(iH2, 1);
                i6 = iH2;
                length = i9;
            }
        }
        boolean z7 = length % this.f10180i == 0;
        String strD = androidx.camera.camera2.internal.compat.workaround.c.d(length, "bytesConsumed is not aligned to frame size: %s");
        if (!z7) {
            throw new IllegalStateException(String.valueOf(strD));
        }
        y5.r(i7 >= i6);
        this.f10187p -= length;
        int i11 = this.f10186o + length;
        this.f10186o = i11;
        this.f10186o = i11 % this.f10185n.length;
        this.f10184m = (i6 / this.f10180i) + this.f10184m;
        this.f10183l += (length - i6) / r2;
    }

    public final void j(int i6, int i7) {
        int i8;
        if (i6 == 0) {
            return;
        }
        y5.n(this.f10187p >= i6);
        if (i7 == 2) {
            int i9 = this.f10186o;
            int i10 = this.f10187p;
            int i11 = i9 + i10;
            byte[] bArr = this.f10185n;
            int length = bArr.length;
            if (i11 <= length) {
                System.arraycopy(bArr, i11 - i6, this.f10188q, 0, i6);
            } else {
                int i12 = i10 - (length - i9);
                if (i12 >= i6) {
                    System.arraycopy(bArr, i12 - i6, this.f10188q, 0, i6);
                } else {
                    int i13 = i6 - i12;
                    System.arraycopy(bArr, length - i13, this.f10188q, 0, i13);
                    System.arraycopy(this.f10185n, 0, this.f10188q, i13, i12);
                }
            }
        } else {
            int i14 = this.f10186o;
            int i15 = i14 + i6;
            byte[] bArr2 = this.f10185n;
            int length2 = bArr2.length;
            if (i15 <= length2) {
                System.arraycopy(bArr2, i14, this.f10188q, 0, i6);
            } else {
                int i16 = length2 - i14;
                System.arraycopy(bArr2, i14, this.f10188q, 0, i16);
                System.arraycopy(this.f10185n, 0, this.f10188q, i16, i6 - i16);
            }
        }
        y5.p("sizeToOutput is not aligned to frame size: " + i6, i6 % this.f10180i == 0);
        y5.r(this.f10186o < this.f10185n.length);
        byte[] bArr3 = this.f10188q;
        y5.p(androidx.camera.camera2.internal.compat.workaround.c.d(i6, "byteOutput size is not aligned to frame size "), i6 % this.f10180i == 0);
        if (i7 != 3) {
            for (int i17 = 0; i17 < i6; i17 += 2) {
                int i18 = i17 + 1;
                int i19 = (bArr3[i18] << 8) | (bArr3[i17] & 255);
                if (i7 == 0) {
                    i8 = ((((i17 * CameraAccessExceptionCompat.CAMERA_DEPRECATED_HAL) / (i6 - 1)) * (-90)) / CameraAccessExceptionCompat.CAMERA_DEPRECATED_HAL) + 100;
                } else {
                    i8 = 10;
                    if (i7 == 2) {
                        i8 = 10 + (((90000 * i17) / (i6 - 1)) / CameraAccessExceptionCompat.CAMERA_DEPRECATED_HAL);
                    }
                }
                int i20 = (i19 * i8) / 100;
                if (i20 >= 32767) {
                    bArr3[i17] = -1;
                    bArr3[i18] = Byte.MAX_VALUE;
                } else if (i20 <= -32768) {
                    bArr3[i17] = 0;
                    bArr3[i18] = Byte.MIN_VALUE;
                } else {
                    bArr3[i17] = (byte) (i20 & 255);
                    bArr3[i18] = (byte) (i20 >> 8);
                }
            }
        }
        d(i6).put(bArr3, 0, i6).flip();
    }

    @Override // com.google.android.gms.internal.ads.gd0, com.google.android.gms.internal.ads.jc0
    public final boolean zzg() {
        return super.zzg() && this.f10181j;
    }
}
