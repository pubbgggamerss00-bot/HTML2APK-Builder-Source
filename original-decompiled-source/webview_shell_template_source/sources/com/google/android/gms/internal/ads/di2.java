package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class di2 {

    /* renamed from: a, reason: collision with root package name */
    public final int f3946a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f3947b;

    public di2(int i6, boolean z6) {
        this.f3946a = i6;
        this.f3947b = z6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || di2.class != obj.getClass()) {
            return false;
        }
        di2 di2Var = (di2) obj;
        return this.f3946a == di2Var.f3946a && this.f3947b == di2Var.f3947b;
    }

    public final int hashCode() {
        return (this.f3946a * 31) + (this.f3947b ? 1 : 0);
    }
}
