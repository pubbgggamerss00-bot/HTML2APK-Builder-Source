package com.google.android.gms.internal.ads;

import java.util.Objects;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class zu1 extends tt1 {

    /* renamed from: a, reason: collision with root package name */
    public final int f11583a;

    /* renamed from: b, reason: collision with root package name */
    public final eu1 f11584b;

    public /* synthetic */ zu1(int i6, eu1 eu1Var) {
        this.f11583a = i6;
        this.f11584b = eu1Var;
    }

    @Override // com.google.android.gms.internal.ads.lt1
    public final boolean a() {
        return this.f11584b != eu1.f4406z;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zu1)) {
            return false;
        }
        zu1 zu1Var = (zu1) obj;
        return zu1Var.f11583a == this.f11583a && zu1Var.f11584b == this.f11584b;
    }

    public final int hashCode() {
        return Objects.hash(zu1.class, Integer.valueOf(this.f11583a), this.f11584b);
    }

    public final String toString() {
        String strValueOf = String.valueOf(this.f11584b);
        StringBuilder sb = new StringBuilder("AesGcmSiv Parameters (variant: ");
        sb.append(strValueOf);
        sb.append(", ");
        return androidx.camera.camera2.internal.p0.a(sb, this.f11583a, "-byte key)");
    }
}
