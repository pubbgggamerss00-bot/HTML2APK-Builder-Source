package com.google.android.gms.internal.ads;

import android.text.TextUtils;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class ra2 {

    /* renamed from: a, reason: collision with root package name */
    public final String f8596a;

    /* renamed from: b, reason: collision with root package name */
    public final w f8597b;

    /* renamed from: c, reason: collision with root package name */
    public final w f8598c;

    /* renamed from: d, reason: collision with root package name */
    public final int f8599d;

    /* renamed from: e, reason: collision with root package name */
    public final int f8600e;

    public ra2(String str, w wVar, w wVar2, int i6, int i7) {
        boolean z6 = true;
        if (i6 != 0) {
            if (i7 == 0) {
                i7 = 0;
            } else {
                z6 = false;
            }
        }
        y5.n(z6);
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException();
        }
        this.f8596a = str;
        this.f8597b = wVar;
        wVar2.getClass();
        this.f8598c = wVar2;
        this.f8599d = i6;
        this.f8600e = i7;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && ra2.class == obj.getClass()) {
            ra2 ra2Var = (ra2) obj;
            if (this.f8599d == ra2Var.f8599d && this.f8600e == ra2Var.f8600e && this.f8596a.equals(ra2Var.f8596a) && this.f8597b.equals(ra2Var.f8597b) && this.f8598c.equals(ra2Var.f8598c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f8598c.hashCode() + ((this.f8597b.hashCode() + ((this.f8596a.hashCode() + ((((this.f8599d + 527) * 31) + this.f8600e) * 31)) * 31)) * 31);
    }
}
