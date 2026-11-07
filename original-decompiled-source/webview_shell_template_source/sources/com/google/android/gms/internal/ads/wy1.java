package com.google.android.gms.internal.ads;

import java.util.Objects;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class wy1 {

    /* renamed from: a, reason: collision with root package name */
    public final Class f10316a;

    /* renamed from: b, reason: collision with root package name */
    public final Class f10317b;

    public /* synthetic */ wy1(Class cls, Class cls2) {
        this.f10316a = cls;
        this.f10317b = cls2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof wy1)) {
            return false;
        }
        wy1 wy1Var = (wy1) obj;
        return wy1Var.f10316a.equals(this.f10316a) && wy1Var.f10317b.equals(this.f10317b);
    }

    public final int hashCode() {
        return Objects.hash(this.f10316a, this.f10317b);
    }

    public final String toString() {
        return androidx.activity.m.d(this.f10316a.getSimpleName(), " with serialization type: ", this.f10317b.getSimpleName());
    }
}
