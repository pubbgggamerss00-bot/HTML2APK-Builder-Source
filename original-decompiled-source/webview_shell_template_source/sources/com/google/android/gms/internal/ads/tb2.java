package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class tb2 {

    /* renamed from: a, reason: collision with root package name */
    public final long f9219a;

    /* renamed from: b, reason: collision with root package name */
    public final float f9220b;

    /* renamed from: c, reason: collision with root package name */
    public final long f9221c;

    public /* synthetic */ tb2(sb2 sb2Var) {
        this.f9219a = sb2Var.f8889a;
        this.f9220b = sb2Var.f8890b;
        this.f9221c = sb2Var.f8891c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tb2)) {
            return false;
        }
        tb2 tb2Var = (tb2) obj;
        return this.f9219a == tb2Var.f9219a && this.f9220b == tb2Var.f9220b && this.f9221c == tb2Var.f9221c;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.f9219a), Float.valueOf(this.f9220b), Long.valueOf(this.f9221c)});
    }
}
