package com.google.android.gms.internal.ads;

import java.util.Objects;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class fu1 extends tt1 {

    /* renamed from: a, reason: collision with root package name */
    public final int f4781a;

    /* renamed from: b, reason: collision with root package name */
    public final int f4782b;

    /* renamed from: c, reason: collision with root package name */
    public final int f4783c;

    /* renamed from: d, reason: collision with root package name */
    public final int f4784d;

    /* renamed from: e, reason: collision with root package name */
    public final eu1 f4785e;

    /* renamed from: f, reason: collision with root package name */
    public final du1 f4786f;

    public /* synthetic */ fu1(int i6, int i7, int i8, int i9, eu1 eu1Var, du1 du1Var) {
        this.f4781a = i6;
        this.f4782b = i7;
        this.f4783c = i8;
        this.f4784d = i9;
        this.f4785e = eu1Var;
        this.f4786f = du1Var;
    }

    @Override // com.google.android.gms.internal.ads.lt1
    public final boolean a() {
        return this.f4785e != eu1.f4403w;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof fu1)) {
            return false;
        }
        fu1 fu1Var = (fu1) obj;
        return fu1Var.f4781a == this.f4781a && fu1Var.f4782b == this.f4782b && fu1Var.f4783c == this.f4783c && fu1Var.f4784d == this.f4784d && fu1Var.f4785e == this.f4785e && fu1Var.f4786f == this.f4786f;
    }

    public final int hashCode() {
        return Objects.hash(fu1.class, Integer.valueOf(this.f4781a), Integer.valueOf(this.f4782b), Integer.valueOf(this.f4783c), Integer.valueOf(this.f4784d), this.f4785e, this.f4786f);
    }

    public final String toString() {
        StringBuilder sbA = androidx.camera.camera2.internal.i0.a("AesCtrHmacAead Parameters (variant: ", String.valueOf(this.f4785e), ", hashType: ", String.valueOf(this.f4786f), ", ");
        sbA.append(this.f4783c);
        sbA.append("-byte IV, and ");
        sbA.append(this.f4784d);
        sbA.append("-byte tags, and ");
        sbA.append(this.f4781a);
        sbA.append("-byte AES key, and ");
        return androidx.camera.camera2.internal.p0.a(sbA, this.f4782b, "-byte HMAC key)");
    }
}
