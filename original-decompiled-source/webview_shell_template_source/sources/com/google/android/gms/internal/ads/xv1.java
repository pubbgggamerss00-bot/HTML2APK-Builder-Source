package com.google.android.gms.internal.ads;

import java.util.Objects;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class xv1 extends tt1 {

    /* renamed from: a, reason: collision with root package name */
    public final du1 f10720a;

    public xv1(du1 du1Var) {
        this.f10720a = du1Var;
    }

    @Override // com.google.android.gms.internal.ads.lt1
    public final boolean a() {
        return this.f10720a != du1.f4037j;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof xv1) && ((xv1) obj).f10720a == this.f10720a;
    }

    public final int hashCode() {
        return Objects.hash(xv1.class, this.f10720a);
    }

    public final String toString() {
        return androidx.camera.camera2.internal.v0.b("XChaCha20Poly1305 Parameters (variant: ", this.f10720a.toString(), ")");
    }
}
