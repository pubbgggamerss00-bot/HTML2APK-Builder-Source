package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.Objects;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class tv1 extends tt1 {

    /* renamed from: a, reason: collision with root package name */
    public final jv1 f9389a;

    /* renamed from: b, reason: collision with root package name */
    public final int f9390b;

    public tv1(jv1 jv1Var, int i6) {
        this.f9389a = jv1Var;
        this.f9390b = i6;
    }

    public static tv1 b(jv1 jv1Var, int i6) throws GeneralSecurityException {
        if (i6 < 8 || i6 > 12) {
            throw new GeneralSecurityException("Salt size must be between 8 and 12 bytes");
        }
        return new tv1(jv1Var, i6);
    }

    @Override // com.google.android.gms.internal.ads.lt1
    public final boolean a() {
        return this.f9389a != jv1.f6173x;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof tv1)) {
            return false;
        }
        tv1 tv1Var = (tv1) obj;
        return tv1Var.f9389a == this.f9389a && tv1Var.f9390b == this.f9390b;
    }

    public final int hashCode() {
        return Objects.hash(tv1.class, this.f9389a, Integer.valueOf(this.f9390b));
    }

    public final String toString() {
        String string = this.f9389a.toString();
        StringBuilder sb = new StringBuilder("X-AES-GCM Parameters (variant: ");
        sb.append(string);
        sb.append("salt_size_bytes: ");
        return androidx.camera.camera2.internal.p0.a(sb, this.f9390b, ")");
    }
}
