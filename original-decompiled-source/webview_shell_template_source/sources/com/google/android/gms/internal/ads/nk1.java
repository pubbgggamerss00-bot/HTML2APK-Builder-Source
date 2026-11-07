package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class nk1 extends cl1 {

    /* renamed from: a, reason: collision with root package name */
    public final int f7459a;

    /* renamed from: b, reason: collision with root package name */
    public final String f7460b;

    public nk1(int i6, String str) {
        this.f7459a = i6;
        this.f7460b = str;
    }

    @Override // com.google.android.gms.internal.ads.cl1
    public final int a() {
        return this.f7459a;
    }

    @Override // com.google.android.gms.internal.ads.cl1
    public final String b() {
        return this.f7460b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof cl1)) {
            return false;
        }
        cl1 cl1Var = (cl1) obj;
        if (this.f7459a != cl1Var.a()) {
            return false;
        }
        String str = this.f7460b;
        return str == null ? cl1Var.b() == null : str.equals(cl1Var.b());
    }

    public final int hashCode() {
        String str = this.f7460b;
        return (str == null ? 0 : str.hashCode()) ^ ((this.f7459a ^ 1000003) * 1000003);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("OverlayDisplayState{statusCode=");
        sb.append(this.f7459a);
        sb.append(", sessionToken=");
        return androidx.activity.m.e(sb, this.f7460b, "}");
    }
}
