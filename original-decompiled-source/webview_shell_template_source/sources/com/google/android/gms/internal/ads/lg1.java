package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class lg1 {

    /* renamed from: a, reason: collision with root package name */
    public final byte[] f6720a;

    /* renamed from: b, reason: collision with root package name */
    public final int f6721b;

    /* renamed from: c, reason: collision with root package name */
    public int f6722c;

    /* renamed from: d, reason: collision with root package name */
    public int f6723d = 0;

    public lg1(byte[] bArr, int i6, int i7) {
        this.f6720a = bArr;
        this.f6722c = i6;
        this.f6721b = i7;
        h();
    }

    public final int a(int i6) {
        int i7;
        byte[] bArr;
        this.f6723d += i6;
        int i8 = 0;
        while (true) {
            i7 = this.f6723d;
            bArr = this.f6720a;
            if (i7 <= 8) {
                break;
            }
            int i9 = i7 - 8;
            this.f6723d = i9;
            int i10 = this.f6722c;
            i8 |= (bArr[i10] & 255) << i9;
            if (true != i(i10 + 1)) {
                i = 1;
            }
            this.f6722c = i10 + i;
        }
        int i11 = this.f6722c;
        int i12 = i8 | ((bArr[i11] & 255) >> (8 - i7));
        int i13 = 32 - i6;
        if (i7 == 8) {
            this.f6723d = 0;
            this.f6722c = i11 + (true != i(i11 + 1) ? 1 : 2);
        }
        int i14 = ((-1) >>> i13) & i12;
        h();
        return i14;
    }

    public final int b() {
        int iG = g();
        int i6 = iG % 2;
        return ((iG + 1) / 2) * (i6 == 0 ? -1 : 1);
    }

    public final void c() {
        int i6 = this.f6723d + 1;
        this.f6723d = i6;
        if (i6 == 8) {
            this.f6723d = 0;
            int i7 = this.f6722c;
            this.f6722c = i7 + (true == i(i7 + 1) ? 2 : 1);
        }
        h();
    }

    public final void d(int i6) {
        int i7 = this.f6722c;
        int i8 = i6 / 8;
        int i9 = i7 + i8;
        this.f6722c = i9;
        int i10 = (i6 - (i8 * 8)) + this.f6723d;
        this.f6723d = i10;
        if (i10 > 7) {
            this.f6722c = i9 + 1;
            this.f6723d = i10 - 8;
        }
        while (true) {
            i7++;
            if (i7 > this.f6722c) {
                h();
                return;
            } else if (i(i7)) {
                this.f6722c++;
                i7 += 2;
            }
        }
    }

    public final boolean e(int i6) {
        int i7;
        int i8 = this.f6722c;
        int i9 = i6 / 8;
        int i10 = i8 + i9;
        int i11 = (this.f6723d + i6) - (i9 * 8);
        if (i11 > 7) {
            i10++;
            i11 -= 8;
        }
        while (true) {
            i8++;
            i7 = this.f6721b;
            if (i8 > i10 || i10 >= i7) {
                break;
            }
            if (i(i8)) {
                i10++;
                i8 += 2;
            }
        }
        if (i10 >= i7) {
            return i10 == i7 && i11 == 0;
        }
        return true;
    }

    public final boolean f() {
        int i6 = this.f6720a[this.f6722c] & (128 >> this.f6723d);
        c();
        return i6 != 0;
    }

    public final int g() {
        int i6 = 0;
        while (!f()) {
            i6++;
        }
        return ((1 << i6) - 1) + (i6 > 0 ? a(i6) : 0);
    }

    public final void h() {
        int i6;
        int i7 = this.f6722c;
        boolean z6 = false;
        if (i7 >= 0 && (i7 < (i6 = this.f6721b) || (i7 == i6 && this.f6723d == 0))) {
            z6 = true;
        }
        y5.r(z6);
    }

    public final boolean i(int i6) {
        if (i6 < 2 || i6 >= this.f6721b) {
            return false;
        }
        byte[] bArr = this.f6720a;
        return bArr[i6] == 3 && bArr[i6 + (-2)] == 0 && bArr[i6 + (-1)] == 0;
    }
}
