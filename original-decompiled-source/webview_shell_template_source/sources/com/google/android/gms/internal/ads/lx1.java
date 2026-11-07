package com.google.android.gms.internal.ads;

import java.util.Objects;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class lx1 {

    /* renamed from: a, reason: collision with root package name */
    public final dt1 f6872a;

    /* renamed from: b, reason: collision with root package name */
    public final int f6873b;

    /* renamed from: c, reason: collision with root package name */
    public final String f6874c;

    /* renamed from: d, reason: collision with root package name */
    public final String f6875d;

    public /* synthetic */ lx1(dt1 dt1Var, int i6, String str, String str2) {
        this.f6872a = dt1Var;
        this.f6873b = i6;
        this.f6874c = str;
        this.f6875d = str2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof lx1)) {
            return false;
        }
        lx1 lx1Var = (lx1) obj;
        return this.f6872a == lx1Var.f6872a && this.f6873b == lx1Var.f6873b && this.f6874c.equals(lx1Var.f6874c) && this.f6875d.equals(lx1Var.f6875d);
    }

    public final int hashCode() {
        return Objects.hash(this.f6872a, Integer.valueOf(this.f6873b), this.f6874c, this.f6875d);
    }

    public final String toString() {
        return "(status=" + this.f6872a + ", keyId=" + this.f6873b + ", keyType='" + this.f6874c + "', keyPrefix='" + this.f6875d + "')";
    }
}
