package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class u1 {

    /* renamed from: a, reason: collision with root package name */
    public int f9421a;

    /* renamed from: b, reason: collision with root package name */
    public int f9422b;

    /* renamed from: c, reason: collision with root package name */
    public int f9423c = 0;

    /* renamed from: d, reason: collision with root package name */
    public Object f9424d = new hk2[100];

    public int a(int i6) {
        int i7 = this.f9422b;
        int i8 = 8 - this.f9423c;
        int i9 = i7 + 1;
        byte[] bArr = (byte[]) this.f9424d;
        int iMin = Math.min(i6, i8);
        int i10 = ((bArr[i7] & 255) >> this.f9423c) & (255 >> (8 - iMin));
        while (iMin < i6) {
            i10 |= (bArr[i9] & 255) << iMin;
            iMin += 8;
            i9++;
        }
        int i11 = i10 & ((-1) >>> (32 - i6));
        b(i6);
        return i11;
    }

    public void b(int i6) {
        int i7;
        int i8 = i6 / 8;
        int i9 = this.f9422b + i8;
        this.f9422b = i9;
        int i10 = (i6 - (i8 * 8)) + this.f9423c;
        this.f9423c = i10;
        if (i10 > 7) {
            i9++;
            this.f9422b = i9;
            i10 -= 8;
            this.f9423c = i10;
        }
        boolean z6 = false;
        if (i9 >= 0 && (i9 < (i7 = this.f9421a) || (i9 == i7 && i10 == 0))) {
            z6 = true;
        }
        y5.r(z6);
    }

    public boolean c() {
        int i6 = (((byte[]) this.f9424d)[this.f9422b] & 255) >> this.f9423c;
        b(1);
        return 1 == (i6 & 1);
    }

    public synchronized void d(int i6) {
        int i7 = this.f9421a;
        this.f9421a = i6;
        if (i6 < i7) {
            e();
        }
    }

    public synchronized void e() {
        int i6 = this.f9421a;
        int i7 = j31.f5914a;
        int iMax = Math.max(0, ((i6 + 65535) / 65536) - this.f9422b);
        int i8 = this.f9423c;
        if (iMax >= i8) {
            return;
        }
        Arrays.fill((hk2[]) this.f9424d, iMax, i8, (Object) null);
        this.f9423c = iMax;
    }
}
