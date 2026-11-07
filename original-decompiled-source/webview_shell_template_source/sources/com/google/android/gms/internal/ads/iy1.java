package com.google.android.gms.internal.ads;

import java.util.Objects;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class iy1 {

    /* renamed from: a, reason: collision with root package name */
    public final Class f5877a;

    /* renamed from: b, reason: collision with root package name */
    public final Class f5878b;

    public /* synthetic */ iy1(Class cls, Class cls2) {
        this.f5877a = cls;
        this.f5878b = cls2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof iy1)) {
            return false;
        }
        iy1 iy1Var = (iy1) obj;
        return iy1Var.f5877a.equals(this.f5877a) && iy1Var.f5878b.equals(this.f5878b);
    }

    public final int hashCode() {
        return Objects.hash(this.f5877a, this.f5878b);
    }

    public final String toString() {
        return androidx.activity.m.d(this.f5877a.getSimpleName(), " with primitive type: ", this.f5878b.getSimpleName());
    }
}
