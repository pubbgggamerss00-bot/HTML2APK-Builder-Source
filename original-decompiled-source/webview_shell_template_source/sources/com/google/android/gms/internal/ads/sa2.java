package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class sa2 {

    /* renamed from: a, reason: collision with root package name */
    public final long f8863a;

    /* renamed from: b, reason: collision with root package name */
    public final long f8864b;

    /* renamed from: c, reason: collision with root package name */
    public long f8865c = -9223372036854775807L;

    /* renamed from: d, reason: collision with root package name */
    public long f8866d = -9223372036854775807L;

    /* renamed from: f, reason: collision with root package name */
    public long f8868f = -9223372036854775807L;

    /* renamed from: g, reason: collision with root package name */
    public long f8869g = -9223372036854775807L;

    /* renamed from: i, reason: collision with root package name */
    public float f8870i = 1.0f;

    /* renamed from: j, reason: collision with root package name */
    public long f8871j = -9223372036854775807L;

    /* renamed from: e, reason: collision with root package name */
    public long f8867e = -9223372036854775807L;
    public long h = -9223372036854775807L;

    /* renamed from: k, reason: collision with root package name */
    public long f8872k = -9223372036854775807L;

    /* renamed from: l, reason: collision with root package name */
    public long f8873l = -9223372036854775807L;

    public /* synthetic */ sa2(long j6, long j7) {
        this.f8863a = j6;
        this.f8864b = j7;
    }

    public final long a() {
        return this.h;
    }

    public final void b() {
        long j6 = this.h;
        if (j6 == -9223372036854775807L) {
            return;
        }
        long j7 = j6 + this.f8864b;
        this.h = j7;
        long j8 = this.f8869g;
        if (j8 != -9223372036854775807L && j7 > j8) {
            this.h = j8;
        }
        this.f8871j = -9223372036854775807L;
    }

    public final void c() {
        long j6;
        long j7 = this.f8865c;
        if (j7 != -9223372036854775807L) {
            j6 = this.f8866d;
            if (j6 == -9223372036854775807L) {
                long j8 = this.f8868f;
                if (j8 != -9223372036854775807L && j7 < j8) {
                    j7 = j8;
                }
                j6 = this.f8869g;
                if (j6 == -9223372036854775807L || j7 <= j6) {
                    j6 = j7;
                }
            }
        } else {
            j6 = -9223372036854775807L;
        }
        if (this.f8867e == j6) {
            return;
        }
        this.f8867e = j6;
        this.h = j6;
        this.f8872k = -9223372036854775807L;
        this.f8873l = -9223372036854775807L;
        this.f8871j = -9223372036854775807L;
    }
}
