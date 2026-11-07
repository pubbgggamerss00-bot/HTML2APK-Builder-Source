package com.google.android.gms.internal.ads;

import java.util.Objects;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class kv1 extends tt1 {

    /* renamed from: a, reason: collision with root package name */
    public final String f6503a;

    /* renamed from: b, reason: collision with root package name */
    public final jv1 f6504b;

    public kv1(String str, jv1 jv1Var) {
        this.f6503a = str;
        this.f6504b = jv1Var;
    }

    @Override // com.google.android.gms.internal.ads.lt1
    public final boolean a() {
        return this.f6504b != jv1.f6171v;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof kv1)) {
            return false;
        }
        kv1 kv1Var = (kv1) obj;
        return kv1Var.f6503a.equals(this.f6503a) && kv1Var.f6504b.equals(this.f6504b);
    }

    public final int hashCode() {
        return Objects.hash(kv1.class, this.f6503a, this.f6504b);
    }

    public final String toString() {
        return "LegacyKmsAead Parameters (keyUri: " + this.f6503a + ", variant: " + this.f6504b.toString() + ")";
    }
}
