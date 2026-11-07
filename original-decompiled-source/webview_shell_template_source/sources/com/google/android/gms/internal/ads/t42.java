package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class t42 {

    /* renamed from: a, reason: collision with root package name */
    public final Object f9102a;

    /* renamed from: b, reason: collision with root package name */
    public final int f9103b;

    public t42(int i6, m62 m62Var) {
        this.f9102a = m62Var;
        this.f9103b = i6;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof t42)) {
            return false;
        }
        t42 t42Var = (t42) obj;
        return this.f9102a == t42Var.f9102a && this.f9103b == t42Var.f9103b;
    }

    public final int hashCode() {
        return (System.identityHashCode(this.f9102a) * 65535) + this.f9103b;
    }
}
