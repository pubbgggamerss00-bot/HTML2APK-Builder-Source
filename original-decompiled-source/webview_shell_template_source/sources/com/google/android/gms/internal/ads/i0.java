package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class i0 {

    /* renamed from: a, reason: collision with root package name */
    public final long f5523a;

    /* renamed from: b, reason: collision with root package name */
    public final long f5524b;

    /* renamed from: c, reason: collision with root package name */
    public final long f5525c;

    /* renamed from: d, reason: collision with root package name */
    public long f5526d = 0;

    /* renamed from: e, reason: collision with root package name */
    public long f5527e;

    /* renamed from: f, reason: collision with root package name */
    public long f5528f;

    /* renamed from: g, reason: collision with root package name */
    public long f5529g;
    public long h;

    public i0(long j6, long j7, long j8, long j9, long j10, long j11) {
        this.f5523a = j6;
        this.f5524b = j7;
        this.f5527e = j8;
        this.f5528f = j9;
        this.f5529g = j10;
        this.f5525c = j11;
        this.h = a(j7, 0L, j8, j9, j10, j11);
    }

    public static long a(long j6, long j7, long j8, long j9, long j10, long j11) {
        if (j9 + 1 >= j10 || 1 + j7 >= j8) {
            return j9;
        }
        long j12 = (long) (((j10 - j9) / (j8 - j7)) * (j6 - j7));
        return Math.max(j9, Math.min(((j9 + j12) - j11) - (j12 / 20), j10 - 1));
    }
}
