package com.google.android.gms.internal.ads;

import android.text.TextUtils;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class ig2 {

    /* renamed from: a, reason: collision with root package name */
    public final String f5754a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f5755b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f5756c;

    public ig2(boolean z6, boolean z7, String str) {
        this.f5754a = str;
        this.f5755b = z6;
        this.f5756c = z7;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || obj.getClass() != ig2.class) {
            return false;
        }
        ig2 ig2Var = (ig2) obj;
        return TextUtils.equals(this.f5754a, ig2Var.f5754a) && this.f5755b == ig2Var.f5755b && this.f5756c == ig2Var.f5756c;
    }

    public final int hashCode() {
        return ((((this.f5754a.hashCode() + 31) * 31) + (true != this.f5755b ? 1237 : 1231)) * 31) + (true != this.f5756c ? 1237 : 1231);
    }
}
