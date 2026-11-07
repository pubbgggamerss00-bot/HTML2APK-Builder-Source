package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class n1 {

    /* renamed from: c, reason: collision with root package name */
    public static final n1 f7276c = new n1(0, 0);

    /* renamed from: a, reason: collision with root package name */
    public final long f7277a;

    /* renamed from: b, reason: collision with root package name */
    public final long f7278b;

    public n1(long j6, long j7) {
        this.f7277a = j6;
        this.f7278b = j7;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && n1.class == obj.getClass()) {
            n1 n1Var = (n1) obj;
            if (this.f7277a == n1Var.f7277a && this.f7278b == n1Var.f7278b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((int) this.f7277a) * 31) + ((int) this.f7278b);
    }

    public final String toString() {
        return "[timeUs=" + this.f7277a + ", position=" + this.f7278b + "]";
    }
}
