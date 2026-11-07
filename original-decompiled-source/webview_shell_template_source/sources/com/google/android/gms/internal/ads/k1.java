package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.RequestConfiguration;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class k1 {

    /* renamed from: a, reason: collision with root package name */
    public final n1 f6212a;

    /* renamed from: b, reason: collision with root package name */
    public final n1 f6213b;

    public k1(n1 n1Var, n1 n1Var2) {
        this.f6212a = n1Var;
        this.f6213b = n1Var2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && k1.class == obj.getClass()) {
            k1 k1Var = (k1) obj;
            if (this.f6212a.equals(k1Var.f6212a) && this.f6213b.equals(k1Var.f6213b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f6213b.hashCode() + (this.f6212a.hashCode() * 31);
    }

    public final String toString() {
        n1 n1Var = this.f6212a;
        String string = n1Var.toString();
        n1 n1Var2 = this.f6213b;
        return "[" + string + (n1Var.equals(n1Var2) ? RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED : ", ".concat(n1Var2.toString())) + "]";
    }
}
