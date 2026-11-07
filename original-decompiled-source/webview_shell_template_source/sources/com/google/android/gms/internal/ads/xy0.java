package com.google.android.gms.internal.ads;

import android.graphics.drawable.Drawable;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class xy0 extends az0 {

    /* renamed from: a, reason: collision with root package name */
    public final String f10745a;

    /* renamed from: b, reason: collision with root package name */
    public final String f10746b;

    /* renamed from: c, reason: collision with root package name */
    public final Drawable f10747c;

    public xy0(String str, String str2, Drawable drawable) {
        this.f10745a = str;
        if (str2 == null) {
            throw new NullPointerException("Null imageUrl");
        }
        this.f10746b = str2;
        this.f10747c = drawable;
    }

    @Override // com.google.android.gms.internal.ads.az0
    public final Drawable a() {
        return this.f10747c;
    }

    @Override // com.google.android.gms.internal.ads.az0
    public final String b() {
        return this.f10745a;
    }

    @Override // com.google.android.gms.internal.ads.az0
    public final String c() {
        return this.f10746b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof az0)) {
            return false;
        }
        az0 az0Var = (az0) obj;
        String str = this.f10745a;
        if (str == null) {
            if (az0Var.b() != null) {
                return false;
            }
        } else if (!str.equals(az0Var.b())) {
            return false;
        }
        if (!this.f10746b.equals(az0Var.c())) {
            return false;
        }
        Drawable drawable = this.f10747c;
        return drawable == null ? az0Var.a() == null : drawable.equals(az0Var.a());
    }

    public final int hashCode() {
        String str = this.f10745a;
        int iHashCode = (((str == null ? 0 : str.hashCode()) ^ 1000003) * 1000003) ^ this.f10746b.hashCode();
        Drawable drawable = this.f10747c;
        return (drawable != null ? drawable.hashCode() : 0) ^ (iHashCode * 1000003);
    }

    public final String toString() {
        return "OfflineAdAssets{advertiserName=" + this.f10745a + ", imageUrl=" + this.f10746b + ", icon=" + String.valueOf(this.f10747c) + "}";
    }
}
