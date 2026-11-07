package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class xc2 {

    /* renamed from: a, reason: collision with root package name */
    public final long f10497a;

    /* renamed from: b, reason: collision with root package name */
    public final zy f10498b;

    /* renamed from: c, reason: collision with root package name */
    public final int f10499c;

    /* renamed from: d, reason: collision with root package name */
    public final oh2 f10500d;

    /* renamed from: e, reason: collision with root package name */
    public final long f10501e;

    /* renamed from: f, reason: collision with root package name */
    public final zy f10502f;

    /* renamed from: g, reason: collision with root package name */
    public final int f10503g;
    public final oh2 h;

    /* renamed from: i, reason: collision with root package name */
    public final long f10504i;

    /* renamed from: j, reason: collision with root package name */
    public final long f10505j;

    public xc2(long j6, zy zyVar, int i6, oh2 oh2Var, long j7, zy zyVar2, int i7, oh2 oh2Var2, long j8, long j9) {
        this.f10497a = j6;
        this.f10498b = zyVar;
        this.f10499c = i6;
        this.f10500d = oh2Var;
        this.f10501e = j7;
        this.f10502f = zyVar2;
        this.f10503g = i7;
        this.h = oh2Var2;
        this.f10504i = j8;
        this.f10505j = j9;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && xc2.class == obj.getClass()) {
            xc2 xc2Var = (xc2) obj;
            if (this.f10497a == xc2Var.f10497a && this.f10499c == xc2Var.f10499c && this.f10501e == xc2Var.f10501e && this.f10503g == xc2Var.f10503g && this.f10504i == xc2Var.f10504i && this.f10505j == xc2Var.f10505j && aa1.k(this.f10498b, xc2Var.f10498b) && aa1.k(this.f10500d, xc2Var.f10500d) && aa1.k(this.f10502f, xc2Var.f10502f) && aa1.k(this.h, xc2Var.h)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.f10497a), this.f10498b, Integer.valueOf(this.f10499c), this.f10500d, Long.valueOf(this.f10501e), this.f10502f, Integer.valueOf(this.f10503g), this.h, Long.valueOf(this.f10504i), Long.valueOf(this.f10505j)});
    }
}
