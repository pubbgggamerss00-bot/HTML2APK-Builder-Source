package com.google.android.gms.internal.ads;

import java.util.ArrayDeque;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class x4 {

    /* renamed from: a, reason: collision with root package name */
    public final byte[] f10349a = new byte[8];

    /* renamed from: b, reason: collision with root package name */
    public final ArrayDeque f10350b = new ArrayDeque();

    /* renamed from: c, reason: collision with root package name */
    public final b5 f10351c = new b5();

    /* renamed from: d, reason: collision with root package name */
    public l2 f10352d;

    /* renamed from: e, reason: collision with root package name */
    public int f10353e;

    /* renamed from: f, reason: collision with root package name */
    public int f10354f;

    /* renamed from: g, reason: collision with root package name */
    public long f10355g;

    public final long a(y0 y0Var, int i6) {
        y0Var.i(0, i6, this.f10349a);
        long j6 = 0;
        for (int i7 = 0; i7 < i6; i7++) {
            j6 = (j6 << 8) | (r1[i7] & 255);
        }
        return j6;
    }
}
