package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class tc2 {

    /* renamed from: c, reason: collision with root package name */
    public static final tc2 f9228c;

    /* renamed from: a, reason: collision with root package name */
    public final long f9229a;

    /* renamed from: b, reason: collision with root package name */
    public final long f9230b;

    static {
        tc2 tc2Var = new tc2(0L, 0L);
        new tc2(Long.MAX_VALUE, Long.MAX_VALUE);
        new tc2(Long.MAX_VALUE, 0L);
        new tc2(0L, Long.MAX_VALUE);
        f9228c = tc2Var;
    }

    public tc2(long j6, long j7) {
        y5.n(j6 >= 0);
        y5.n(j7 >= 0);
        this.f9229a = j6;
        this.f9230b = j7;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && tc2.class == obj.getClass()) {
            tc2 tc2Var = (tc2) obj;
            if (this.f9229a == tc2Var.f9229a && this.f9230b == tc2Var.f9230b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((int) this.f9229a) * 31) + ((int) this.f9230b);
    }
}
