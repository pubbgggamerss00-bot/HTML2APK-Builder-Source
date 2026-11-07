package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class sx0 {

    /* renamed from: c, reason: collision with root package name */
    public static final sx0 f9043c = new sx0(-1, -1);

    /* renamed from: a, reason: collision with root package name */
    public final int f9044a;

    /* renamed from: b, reason: collision with root package name */
    public final int f9045b;

    static {
        new sx0(0, 0);
    }

    public sx0(int i6, int i7) {
        boolean z6 = false;
        if ((i6 == -1 || i6 >= 0) && (i7 == -1 || i7 >= 0)) {
            z6 = true;
        }
        y5.n(z6);
        this.f9044a = i6;
        this.f9045b = i7;
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (obj instanceof sx0) {
            sx0 sx0Var = (sx0) obj;
            if (this.f9044a == sx0Var.f9044a && this.f9045b == sx0Var.f9045b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i6 = this.f9044a;
        return ((i6 >>> 16) | (i6 << 16)) ^ this.f9045b;
    }

    public final String toString() {
        return this.f9044a + "x" + this.f9045b;
    }
}
