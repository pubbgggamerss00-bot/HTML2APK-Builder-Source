package com.google.android.gms.internal.ads;

import java.util.Objects;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class cv1 extends tt1 {

    /* renamed from: a, reason: collision with root package name */
    public final tu1 f3674a;

    public cv1(tu1 tu1Var) {
        this.f3674a = tu1Var;
    }

    @Override // com.google.android.gms.internal.ads.lt1
    public final boolean a() {
        return this.f3674a != tu1.f9380z;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof cv1) && ((cv1) obj).f3674a == this.f3674a;
    }

    public final int hashCode() {
        return Objects.hash(cv1.class, this.f3674a);
    }

    public final String toString() {
        return androidx.camera.camera2.internal.v0.b("ChaCha20Poly1305 Parameters (variant: ", this.f3674a.toString(), ")");
    }
}
