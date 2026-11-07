package com.google.android.gms.internal.ads;

import java.util.Objects;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class qz1 extends tz1 {

    /* renamed from: a, reason: collision with root package name */
    public final int f8488a;

    /* renamed from: b, reason: collision with root package name */
    public final int f8489b;

    /* renamed from: c, reason: collision with root package name */
    public final pz1 f8490c;

    /* renamed from: d, reason: collision with root package name */
    public final oz1 f8491d;

    public qz1(int i6, int i7, pz1 pz1Var, oz1 oz1Var) {
        this.f8488a = i6;
        this.f8489b = i7;
        this.f8490c = pz1Var;
        this.f8491d = oz1Var;
    }

    @Override // com.google.android.gms.internal.ads.lt1
    public final boolean a() {
        return this.f8490c != pz1.f8185e;
    }

    public final int b() {
        pz1 pz1Var = pz1.f8185e;
        int i6 = this.f8489b;
        pz1 pz1Var2 = this.f8490c;
        if (pz1Var2 == pz1Var) {
            return i6;
        }
        if (pz1Var2 == pz1.f8182b || pz1Var2 == pz1.f8183c || pz1Var2 == pz1.f8184d) {
            return i6 + 5;
        }
        throw new IllegalStateException("Unknown variant");
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof qz1)) {
            return false;
        }
        qz1 qz1Var = (qz1) obj;
        return qz1Var.f8488a == this.f8488a && qz1Var.b() == b() && qz1Var.f8490c == this.f8490c && qz1Var.f8491d == this.f8491d;
    }

    public final int hashCode() {
        return Objects.hash(qz1.class, Integer.valueOf(this.f8488a), Integer.valueOf(this.f8489b), this.f8490c, this.f8491d);
    }

    public final String toString() {
        StringBuilder sbA = androidx.camera.camera2.internal.i0.a("HMAC Parameters (variant: ", String.valueOf(this.f8490c), ", hashType: ", String.valueOf(this.f8491d), ", ");
        sbA.append(this.f8489b);
        sbA.append("-byte tags, and ");
        return androidx.camera.camera2.internal.p0.a(sbA, this.f8488a, "-byte key)");
    }
}
