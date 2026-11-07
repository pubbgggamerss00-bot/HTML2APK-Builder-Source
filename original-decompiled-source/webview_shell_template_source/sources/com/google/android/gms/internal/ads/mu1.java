package com.google.android.gms.internal.ads;

import java.util.Objects;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class mu1 extends tt1 {

    /* renamed from: a, reason: collision with root package name */
    public final int f7222a;

    /* renamed from: b, reason: collision with root package name */
    public final int f7223b;

    /* renamed from: c, reason: collision with root package name */
    public final lu1 f7224c;

    public /* synthetic */ mu1(int i6, int i7, lu1 lu1Var) {
        this.f7222a = i6;
        this.f7223b = i7;
        this.f7224c = lu1Var;
    }

    @Override // com.google.android.gms.internal.ads.lt1
    public final boolean a() {
        return this.f7224c != lu1.f6858w;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof mu1)) {
            return false;
        }
        mu1 mu1Var = (mu1) obj;
        return mu1Var.f7222a == this.f7222a && mu1Var.f7223b == this.f7223b && mu1Var.f7224c == this.f7224c;
    }

    public final int hashCode() {
        return Objects.hash(mu1.class, Integer.valueOf(this.f7222a), Integer.valueOf(this.f7223b), 16, this.f7224c);
    }

    public final String toString() {
        String strValueOf = String.valueOf(this.f7224c);
        StringBuilder sb = new StringBuilder("AesEax Parameters (variant: ");
        sb.append(strValueOf);
        sb.append(", ");
        sb.append(this.f7223b);
        sb.append("-byte IV, 16-byte tag, and ");
        return androidx.camera.camera2.internal.p0.a(sb, this.f7222a, "-byte key)");
    }
}
