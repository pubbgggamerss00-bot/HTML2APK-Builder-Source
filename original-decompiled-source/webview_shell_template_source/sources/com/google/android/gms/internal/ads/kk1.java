package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class kk1 extends pk1 {

    /* renamed from: a, reason: collision with root package name */
    public final String f6443a;

    /* renamed from: b, reason: collision with root package name */
    public final String f6444b;

    public kk1(String str, String str2) {
        this.f6443a = str;
        this.f6444b = str2;
    }

    @Override // com.google.android.gms.internal.ads.pk1
    public final String a() {
        return this.f6444b;
    }

    @Override // com.google.android.gms.internal.ads.pk1
    public final String b() {
        return this.f6443a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof pk1)) {
            return false;
        }
        pk1 pk1Var = (pk1) obj;
        String str = this.f6443a;
        if (str == null) {
            if (pk1Var.b() != null) {
                return false;
            }
        } else if (!str.equals(pk1Var.b())) {
            return false;
        }
        String str2 = this.f6444b;
        return str2 == null ? pk1Var.a() == null : str2.equals(pk1Var.a());
    }

    public final int hashCode() {
        String str = this.f6443a;
        int iHashCode = str == null ? 0 : str.hashCode();
        String str2 = this.f6444b;
        return (str2 != null ? str2.hashCode() : 0) ^ ((iHashCode ^ 1000003) * 1000003);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("OverlayDisplayDismissRequest{sessionToken=");
        sb.append(this.f6443a);
        sb.append(", appId=");
        return androidx.activity.m.e(sb, this.f6444b, "}");
    }
}
