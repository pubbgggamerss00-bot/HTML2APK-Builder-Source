package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class bt {

    /* renamed from: a, reason: collision with root package name */
    public final Object f3262a;

    /* renamed from: b, reason: collision with root package name */
    public final int f3263b;

    /* renamed from: c, reason: collision with root package name */
    public final tc f3264c;

    /* renamed from: d, reason: collision with root package name */
    public final Object f3265d;

    /* renamed from: e, reason: collision with root package name */
    public final int f3266e;

    /* renamed from: f, reason: collision with root package name */
    public final long f3267f;

    /* renamed from: g, reason: collision with root package name */
    public final long f3268g;
    public final int h;

    /* renamed from: i, reason: collision with root package name */
    public final int f3269i;

    static {
        Integer.toString(0, 36);
        Integer.toString(1, 36);
        Integer.toString(2, 36);
        Integer.toString(3, 36);
        Integer.toString(4, 36);
        Integer.toString(5, 36);
        Integer.toString(6, 36);
    }

    public bt(Object obj, int i6, tc tcVar, Object obj2, int i7, long j6, long j7, int i8, int i9) {
        this.f3262a = obj;
        this.f3263b = i6;
        this.f3264c = tcVar;
        this.f3265d = obj2;
        this.f3266e = i7;
        this.f3267f = j6;
        this.f3268g = j7;
        this.h = i8;
        this.f3269i = i9;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && bt.class == obj.getClass()) {
            bt btVar = (bt) obj;
            if (this.f3263b == btVar.f3263b && this.f3266e == btVar.f3266e && this.f3267f == btVar.f3267f && this.f3268g == btVar.f3268g && this.h == btVar.h && this.f3269i == btVar.f3269i && aa1.k(this.f3264c, btVar.f3264c) && aa1.k(this.f3262a, btVar.f3262a) && aa1.k(this.f3265d, btVar.f3265d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f3262a, Integer.valueOf(this.f3263b), this.f3264c, this.f3265d, Integer.valueOf(this.f3266e), Long.valueOf(this.f3267f), Long.valueOf(this.f3268g), Integer.valueOf(this.h), Integer.valueOf(this.f3269i)});
    }
}
