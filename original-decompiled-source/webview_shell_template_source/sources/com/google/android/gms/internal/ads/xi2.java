package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class xi2 {

    /* renamed from: a, reason: collision with root package name */
    public final long f10608a;

    /* renamed from: b, reason: collision with root package name */
    public final long f10609b;

    public xi2(long j6, long j7) {
        this.f10608a = j6;
        this.f10609b = j7;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xi2)) {
            return false;
        }
        xi2 xi2Var = (xi2) obj;
        return this.f10608a == xi2Var.f10608a && this.f10609b == xi2Var.f10609b;
    }

    public final int hashCode() {
        return (((int) this.f10608a) * 31) + ((int) this.f10609b);
    }
}
