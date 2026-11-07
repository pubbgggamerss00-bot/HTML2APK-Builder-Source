package com.google.android.gms.internal.ads;

import java.util.Objects;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class vy1 {

    /* renamed from: a, reason: collision with root package name */
    public final Class f9963a;

    /* renamed from: b, reason: collision with root package name */
    public final r32 f9964b;

    public /* synthetic */ vy1(Class cls, r32 r32Var) {
        this.f9963a = cls;
        this.f9964b = r32Var;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof vy1)) {
            return false;
        }
        vy1 vy1Var = (vy1) obj;
        return vy1Var.f9963a.equals(this.f9963a) && vy1Var.f9964b.equals(this.f9964b);
    }

    public final int hashCode() {
        return Objects.hash(this.f9963a, this.f9964b);
    }

    public final String toString() {
        return androidx.activity.m.d(this.f9963a.getSimpleName(), ", object identifier: ", String.valueOf(this.f9964b));
    }
}
