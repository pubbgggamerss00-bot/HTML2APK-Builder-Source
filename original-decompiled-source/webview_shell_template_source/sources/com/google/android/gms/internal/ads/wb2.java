package com.google.android.gms.internal.ads;

import java.util.Objects;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class wb2 {

    /* renamed from: a, reason: collision with root package name */
    public final oh2 f10148a;

    /* renamed from: b, reason: collision with root package name */
    public final long f10149b;

    /* renamed from: c, reason: collision with root package name */
    public final long f10150c;

    /* renamed from: d, reason: collision with root package name */
    public final long f10151d;

    /* renamed from: e, reason: collision with root package name */
    public final long f10152e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f10153f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f10154g;
    public final boolean h;

    public wb2(oh2 oh2Var, long j6, long j7, long j8, long j9, boolean z6, boolean z7, boolean z8) {
        y5.n(!z8 || z6);
        y5.n(!z7 || z6);
        this.f10148a = oh2Var;
        this.f10149b = j6;
        this.f10150c = j7;
        this.f10151d = j8;
        this.f10152e = j9;
        this.f10153f = z6;
        this.f10154g = z7;
        this.h = z8;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && wb2.class == obj.getClass()) {
            wb2 wb2Var = (wb2) obj;
            if (this.f10149b == wb2Var.f10149b && this.f10150c == wb2Var.f10150c && this.f10151d == wb2Var.f10151d && this.f10152e == wb2Var.f10152e && this.f10153f == wb2Var.f10153f && this.f10154g == wb2Var.f10154g && this.h == wb2Var.h && Objects.equals(this.f10148a, wb2Var.f10148a)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((((((((((this.f10148a.hashCode() + 527) * 31) + ((int) this.f10149b)) * 31) + ((int) this.f10150c)) * 31) + ((int) this.f10151d)) * 31) + ((int) this.f10152e)) * 961) + (this.f10153f ? 1 : 0)) * 31) + (this.f10154g ? 1 : 0)) * 31) + (this.h ? 1 : 0);
    }
}
