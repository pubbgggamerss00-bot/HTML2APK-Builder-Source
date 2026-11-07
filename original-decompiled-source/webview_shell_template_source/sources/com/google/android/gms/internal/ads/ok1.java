package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class ok1 extends el1 {

    /* renamed from: a, reason: collision with root package name */
    public final String f7803a;

    /* renamed from: b, reason: collision with root package name */
    public final String f7804b;

    public ok1(String str, String str2) {
        this.f7803a = str;
        this.f7804b = str2;
    }

    @Override // com.google.android.gms.internal.ads.el1
    public final String a() {
        return this.f7804b;
    }

    @Override // com.google.android.gms.internal.ads.el1
    public final String b() {
        return this.f7803a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof el1)) {
            return false;
        }
        el1 el1Var = (el1) obj;
        String str = this.f7803a;
        if (str == null) {
            if (el1Var.b() != null) {
                return false;
            }
        } else if (!str.equals(el1Var.b())) {
            return false;
        }
        String str2 = this.f7804b;
        return str2 == null ? el1Var.a() == null : str2.equals(el1Var.a());
    }

    public final int hashCode() {
        String str = this.f7803a;
        int iHashCode = str == null ? 0 : str.hashCode();
        String str2 = this.f7804b;
        return (str2 != null ? str2.hashCode() : 0) ^ ((iHashCode ^ 1000003) * 1000003);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("OverlayDisplayUpdateRequest{sessionToken=");
        sb.append(this.f7803a);
        sb.append(", appId=");
        return androidx.activity.m.e(sb, this.f7804b, "}");
    }
}
