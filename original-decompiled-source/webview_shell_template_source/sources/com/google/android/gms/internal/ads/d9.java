package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class d9 {

    /* renamed from: a, reason: collision with root package name */
    public final s1 f3795a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f3796b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f3797c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f3798d;

    /* renamed from: e, reason: collision with root package name */
    public int f3799e;

    /* renamed from: f, reason: collision with root package name */
    public int f3800f;

    /* renamed from: g, reason: collision with root package name */
    public long f3801g;
    public long h;

    public d9(s1 s1Var) {
        this.f3795a = s1Var;
    }

    public final void a(int i6, int i7, byte[] bArr) {
        if (this.f3797c) {
            int i8 = this.f3800f;
            int i9 = (i6 + 1) - i8;
            if (i9 >= i7) {
                this.f3800f = (i7 - i6) + i8;
            } else {
                this.f3798d = ((bArr[i9] & 192) >> 6) == 0;
                this.f3797c = false;
            }
        }
    }

    public final void b(int i6, long j6, boolean z6) {
        y5.r(this.h != -9223372036854775807L);
        if (this.f3799e == 182 && z6 && this.f3796b) {
            long j7 = j6 - this.f3801g;
            this.f3795a.a(this.h, this.f3798d ? 1 : 0, (int) j7, i6, null);
        }
        if (this.f3799e != 179) {
            this.f3801g = j6;
        }
    }
}
