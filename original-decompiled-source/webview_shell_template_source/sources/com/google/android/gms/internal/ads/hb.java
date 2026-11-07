package com.google.android.gms.internal.ads;

import android.text.TextUtils;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class hb {

    /* renamed from: a, reason: collision with root package name */
    public final String f5314a;

    /* renamed from: b, reason: collision with root package name */
    public final String f5315b;

    public hb(String str, String str2) {
        this.f5314a = str;
        this.f5315b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && hb.class == obj.getClass()) {
            hb hbVar = (hb) obj;
            if (TextUtils.equals(this.f5314a, hbVar.f5314a) && TextUtils.equals(this.f5315b, hbVar.f5315b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f5315b.hashCode() + (this.f5314a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Header[name=");
        sb.append(this.f5314a);
        sb.append(",value=");
        return androidx.activity.m.e(sb, this.f5315b, "]");
    }
}
