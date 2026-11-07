package com.google.android.gms.internal.ads;

import java.util.Objects;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class gz1 extends tz1 {

    /* renamed from: a, reason: collision with root package name */
    public final int f5191a;

    /* renamed from: b, reason: collision with root package name */
    public final int f5192b;

    /* renamed from: c, reason: collision with root package name */
    public final jv1 f5193c;

    public gz1(int i6, int i7, jv1 jv1Var) {
        this.f5191a = i6;
        this.f5192b = i7;
        this.f5193c = jv1Var;
    }

    @Override // com.google.android.gms.internal.ads.lt1
    public final boolean a() {
        return this.f5193c != jv1.B;
    }

    public final int b() {
        jv1 jv1Var = jv1.B;
        int i6 = this.f5192b;
        jv1 jv1Var2 = this.f5193c;
        if (jv1Var2 == jv1Var) {
            return i6;
        }
        if (jv1Var2 == jv1.f6174y || jv1Var2 == jv1.f6175z || jv1Var2 == jv1.A) {
            return i6 + 5;
        }
        throw new IllegalStateException("Unknown variant");
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof gz1)) {
            return false;
        }
        gz1 gz1Var = (gz1) obj;
        return gz1Var.f5191a == this.f5191a && gz1Var.b() == b() && gz1Var.f5193c == this.f5193c;
    }

    public final int hashCode() {
        return Objects.hash(gz1.class, Integer.valueOf(this.f5191a), Integer.valueOf(this.f5192b), this.f5193c);
    }

    public final String toString() {
        String strValueOf = String.valueOf(this.f5193c);
        StringBuilder sb = new StringBuilder("AES-CMAC Parameters (variant: ");
        sb.append(strValueOf);
        sb.append(", ");
        sb.append(this.f5192b);
        sb.append("-byte tags, and ");
        return androidx.camera.camera2.internal.p0.a(sb, this.f5191a, "-byte key)");
    }
}
