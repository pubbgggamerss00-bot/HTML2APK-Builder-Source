package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class a5 {

    /* renamed from: a, reason: collision with root package name */
    public final ex0 f2573a = new ex0(8);

    /* renamed from: b, reason: collision with root package name */
    public int f2574b;

    public final long a(p0 p0Var) {
        int i6;
        ex0 ex0Var = this.f2573a;
        int i7 = 0;
        p0Var.g(ex0Var.f4416a, 0, 1, false);
        int i8 = ex0Var.f4416a[0] & 255;
        if (i8 == 0) {
            return Long.MIN_VALUE;
        }
        int i9 = 128;
        int i10 = 0;
        while (true) {
            i6 = i10 + 1;
            if ((i8 & i9) != 0) {
                break;
            }
            i9 >>= 1;
            i10 = i6;
        }
        int i11 = i8 & (~i9);
        p0Var.g(ex0Var.f4416a, 1, i10, false);
        while (i7 < i10) {
            i7++;
            i11 = (ex0Var.f4416a[i7] & 255) + (i11 << 8);
        }
        this.f2574b += i6;
        return i11;
    }
}
