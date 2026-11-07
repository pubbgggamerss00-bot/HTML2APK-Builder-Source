package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class j1 {

    /* renamed from: a, reason: collision with root package name */
    public int f5896a;

    /* renamed from: b, reason: collision with root package name */
    public String f5897b;

    /* renamed from: c, reason: collision with root package name */
    public int f5898c;

    /* renamed from: d, reason: collision with root package name */
    public int f5899d;

    /* renamed from: e, reason: collision with root package name */
    public int f5900e;

    /* renamed from: f, reason: collision with root package name */
    public int f5901f;

    /* renamed from: g, reason: collision with root package name */
    public int f5902g;

    public final boolean a(int i6) {
        int i7;
        int i8;
        int i9;
        int i10;
        if ((i6 & (-2097152)) != -2097152 || (i7 = (i6 >>> 19) & 3) == 1 || (i8 = (i6 >>> 17) & 3) == 0 || (i9 = (i6 >>> 12) & 15) == 0 || i9 == 15 || (i10 = (i6 >>> 10) & 3) == 3) {
            return false;
        }
        int i11 = i9 - 1;
        this.f5896a = i7;
        this.f5897b = fo.f4734t[3 - i8];
        int i12 = fo.f4735u[i10];
        this.f5899d = i12;
        if (i7 == 2) {
            i12 /= 2;
            this.f5899d = i12;
        } else if (i7 == 0) {
            i12 /= 4;
            this.f5899d = i12;
        }
        int i13 = (i6 >>> 9) & 1;
        int i14 = 1152;
        if (i8 != 1) {
            if (i8 != 2) {
                i14 = 384;
            }
        } else if (i7 != 3) {
            i14 = 576;
        }
        this.f5902g = i14;
        if (i8 == 3) {
            int i15 = i7 == 3 ? fo.f4736v[i11] : fo.f4737w[i11];
            this.f5901f = i15;
            this.f5898c = (((i15 * 12) / i12) + i13) * 4;
        } else {
            if (i7 == 3) {
                int i16 = i8 == 2 ? fo.f4738x[i11] : fo.f4739y[i11];
                this.f5901f = i16;
                this.f5898c = ((i16 * 144) / i12) + i13;
            } else {
                int i17 = fo.f4740z[i11];
                this.f5901f = i17;
                this.f5898c = (((i8 == 1 ? 72 : 144) * i17) / i12) + i13;
            }
        }
        this.f5900e = ((i6 >> 6) & 3) == 3 ? 1 : 2;
        return true;
    }
}
