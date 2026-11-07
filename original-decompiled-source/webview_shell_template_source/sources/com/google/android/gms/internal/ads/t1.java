package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class t1 {

    /* renamed from: a, reason: collision with root package name */
    public final byte[] f9058a = new byte[10];

    /* renamed from: b, reason: collision with root package name */
    public boolean f9059b;

    /* renamed from: c, reason: collision with root package name */
    public int f9060c;

    /* renamed from: d, reason: collision with root package name */
    public long f9061d;

    /* renamed from: e, reason: collision with root package name */
    public int f9062e;

    /* renamed from: f, reason: collision with root package name */
    public int f9063f;

    /* renamed from: g, reason: collision with root package name */
    public int f9064g;

    public final void a(s1 s1Var, r1 r1Var) {
        if (this.f9060c > 0) {
            s1Var.a(this.f9061d, this.f9062e, this.f9063f, this.f9064g, r1Var);
            this.f9060c = 0;
        }
    }

    public final void b(s1 s1Var, long j6, int i6, int i7, int i8, r1 r1Var) {
        if (!(this.f9064g <= i7 + i8)) {
            throw new IllegalStateException("TrueHD chunk samples must be contiguous in the sample queue.");
        }
        if (this.f9059b) {
            int i9 = this.f9060c;
            int i10 = i9 + 1;
            this.f9060c = i10;
            if (i9 == 0) {
                this.f9061d = j6;
                this.f9062e = i6;
                this.f9063f = 0;
            }
            this.f9063f += i7;
            this.f9064g = i8;
            if (i10 >= 16) {
                a(s1Var, r1Var);
            }
        }
    }

    public final void c(y0 y0Var) {
        if (this.f9059b) {
            return;
        }
        byte[] bArr = this.f9058a;
        y0Var.h(0, 10, bArr);
        y0Var.zzj();
        if (bArr[4] == -8 && bArr[5] == 114 && bArr[6] == 111 && (bArr[7] & 254) == 186) {
            this.f9059b = true;
        }
    }
}
