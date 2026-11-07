package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public class d40 {

    /* renamed from: a, reason: collision with root package name */
    public final int f3749a;

    /* renamed from: b, reason: collision with root package name */
    public final int f3750b;

    /* renamed from: c, reason: collision with root package name */
    public final bo1 f3751c;

    /* renamed from: d, reason: collision with root package name */
    public final bo1 f3752d;

    /* renamed from: e, reason: collision with root package name */
    public final bo1 f3753e;

    /* renamed from: f, reason: collision with root package name */
    public final bo1 f3754f;

    /* renamed from: g, reason: collision with root package name */
    public final m20 f3755g;
    public final bo1 h;

    /* renamed from: i, reason: collision with root package name */
    public final int f3756i;

    /* renamed from: j, reason: collision with root package name */
    public final ip1 f3757j;

    /* renamed from: k, reason: collision with root package name */
    public final go1 f3758k;

    static {
        new d40(new h30());
        Integer.toString(1, 36);
        Integer.toString(2, 36);
        Integer.toString(3, 36);
        Integer.toString(4, 36);
        Integer.toString(5, 36);
        Integer.toString(6, 36);
        Integer.toString(7, 36);
        Integer.toString(8, 36);
        Integer.toString(9, 36);
        Integer.toString(10, 36);
        Integer.toString(11, 36);
        Integer.toString(12, 36);
        Integer.toString(13, 36);
        Integer.toString(14, 36);
        Integer.toString(15, 36);
        Integer.toString(16, 36);
        Integer.toString(17, 36);
        Integer.toString(18, 36);
        Integer.toString(19, 36);
        Integer.toString(20, 36);
        Integer.toString(21, 36);
        Integer.toString(22, 36);
        Integer.toString(23, 36);
        Integer.toString(24, 36);
        Integer.toString(25, 36);
        Integer.toString(26, 36);
        Integer.toString(27, 36);
        Integer.toString(28, 36);
        Integer.toString(29, 36);
        Integer.toString(30, 36);
        Integer.toString(31, 36);
        Integer.toString(32, 36);
    }

    public d40(h30 h30Var) {
        this.f3749a = h30Var.f5228a;
        this.f3750b = h30Var.f5229b;
        this.f3751c = h30Var.f5230c;
        this.f3752d = h30Var.f5231d;
        this.f3753e = h30Var.f5232e;
        this.f3754f = h30Var.f5233f;
        this.f3755g = h30Var.f5234g;
        this.h = h30Var.h;
        this.f3756i = h30Var.f5235i;
        this.f3757j = eo1.b(h30Var.f5236j);
        Object[] array = h30Var.f5237k.toArray();
        this.f3758k = go1.m(array, array.length);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        d40 d40Var = (d40) obj;
        if (this.f3749a != d40Var.f3749a || this.f3750b != d40Var.f3750b || !this.f3751c.equals(d40Var.f3751c) || !this.f3752d.equals(d40Var.f3752d) || !this.f3753e.equals(d40Var.f3753e) || !this.f3754f.equals(d40Var.f3754f) || !this.f3755g.equals(d40Var.f3755g) || !this.h.equals(d40Var.h) || this.f3756i != d40Var.f3756i) {
            return false;
        }
        ip1 ip1Var = d40Var.f3757j;
        ip1 ip1Var2 = this.f3757j;
        ip1Var2.getClass();
        return uo1.a(ip1Var, ip1Var2) && this.f3758k.equals(d40Var.f3758k);
    }

    public int hashCode() {
        return this.f3758k.hashCode() + ((this.f3757j.hashCode() + ((((this.h.hashCode() + ((((this.f3754f.hashCode() + ((((((this.f3753e.hashCode() + ((this.f3752d.hashCode() + ((this.f3751c.hashCode() + ((((1871669920 + this.f3749a) * 31) + this.f3750b) * 31)) * 31)) * 961)) * 961) + Integer.MAX_VALUE) * 31) + Integer.MAX_VALUE) * 31)) * 31) + 29791) * 31)) * 31) + this.f3756i) * 887503681)) * 31);
    }
}
