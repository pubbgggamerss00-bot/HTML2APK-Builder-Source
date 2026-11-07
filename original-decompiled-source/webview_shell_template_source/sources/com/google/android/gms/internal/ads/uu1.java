package com.google.android.gms.internal.ads;

import java.util.Objects;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class uu1 extends tt1 {

    /* renamed from: a, reason: collision with root package name */
    public final int f9634a;

    /* renamed from: b, reason: collision with root package name */
    public final tu1 f9635b;

    public /* synthetic */ uu1(int i6, tu1 tu1Var) {
        this.f9634a = i6;
        this.f9635b = tu1Var;
    }

    @Override // com.google.android.gms.internal.ads.lt1
    public final boolean a() {
        return this.f9635b != tu1.f9377w;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof uu1)) {
            return false;
        }
        uu1 uu1Var = (uu1) obj;
        return uu1Var.f9634a == this.f9634a && uu1Var.f9635b == this.f9635b;
    }

    public final int hashCode() {
        return Objects.hash(uu1.class, Integer.valueOf(this.f9634a), 12, 16, this.f9635b);
    }

    public final String toString() {
        String strValueOf = String.valueOf(this.f9635b);
        StringBuilder sb = new StringBuilder("AesGcm Parameters (variant: ");
        sb.append(strValueOf);
        sb.append(", 12-byte IV, 16-byte tag, and ");
        return androidx.camera.camera2.internal.p0.a(sb, this.f9634a, "-byte key)");
    }
}
