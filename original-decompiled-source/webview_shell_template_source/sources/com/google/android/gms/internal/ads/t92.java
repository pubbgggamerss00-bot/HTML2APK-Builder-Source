package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class t92 {

    /* renamed from: j, reason: collision with root package name */
    public static final t92 f9150j = new t92(1.0d, 0.0d, 0.0d, 1.0d, 0.0d, 0.0d, 1.0d, 0.0d, 0.0d);

    /* renamed from: k, reason: collision with root package name */
    public static final t92 f9151k = new t92(0.0d, 1.0d, -1.0d, 0.0d, 0.0d, 0.0d, 1.0d, 0.0d, 0.0d);

    /* renamed from: l, reason: collision with root package name */
    public static final t92 f9152l = new t92(-1.0d, 0.0d, 0.0d, -1.0d, 0.0d, 0.0d, 1.0d, 0.0d, 0.0d);

    /* renamed from: m, reason: collision with root package name */
    public static final t92 f9153m = new t92(0.0d, -1.0d, 1.0d, 0.0d, 0.0d, 0.0d, 1.0d, 0.0d, 0.0d);

    /* renamed from: a, reason: collision with root package name */
    public final double f9154a;

    /* renamed from: b, reason: collision with root package name */
    public final double f9155b;

    /* renamed from: c, reason: collision with root package name */
    public final double f9156c;

    /* renamed from: d, reason: collision with root package name */
    public final double f9157d;

    /* renamed from: e, reason: collision with root package name */
    public final double f9158e;

    /* renamed from: f, reason: collision with root package name */
    public final double f9159f;

    /* renamed from: g, reason: collision with root package name */
    public final double f9160g;
    public final double h;

    /* renamed from: i, reason: collision with root package name */
    public final double f9161i;

    public t92(double d7, double d8, double d9, double d10, double d11, double d12, double d13, double d14, double d15) {
        this.f9154a = d11;
        this.f9155b = d12;
        this.f9156c = d13;
        this.f9157d = d7;
        this.f9158e = d8;
        this.f9159f = d9;
        this.f9160g = d10;
        this.h = d14;
        this.f9161i = d15;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || t92.class != obj.getClass()) {
            return false;
        }
        t92 t92Var = (t92) obj;
        return Double.compare(t92Var.f9157d, this.f9157d) == 0 && Double.compare(t92Var.f9158e, this.f9158e) == 0 && Double.compare(t92Var.f9159f, this.f9159f) == 0 && Double.compare(t92Var.f9160g, this.f9160g) == 0 && Double.compare(t92Var.h, this.h) == 0 && Double.compare(t92Var.f9161i, this.f9161i) == 0 && Double.compare(t92Var.f9154a, this.f9154a) == 0 && Double.compare(t92Var.f9155b, this.f9155b) == 0 && Double.compare(t92Var.f9156c, this.f9156c) == 0;
    }

    public final int hashCode() {
        long jDoubleToLongBits = Double.doubleToLongBits(this.f9154a);
        long j6 = jDoubleToLongBits ^ (jDoubleToLongBits >>> 32);
        long jDoubleToLongBits2 = Double.doubleToLongBits(this.f9155b);
        long j7 = jDoubleToLongBits2 ^ (jDoubleToLongBits2 >>> 32);
        long jDoubleToLongBits3 = Double.doubleToLongBits(this.f9156c);
        long j8 = jDoubleToLongBits3 ^ (jDoubleToLongBits3 >>> 32);
        long jDoubleToLongBits4 = Double.doubleToLongBits(this.f9157d);
        long j9 = jDoubleToLongBits4 ^ (jDoubleToLongBits4 >>> 32);
        long jDoubleToLongBits5 = Double.doubleToLongBits(this.f9158e);
        long j10 = jDoubleToLongBits5 ^ (jDoubleToLongBits5 >>> 32);
        long jDoubleToLongBits6 = Double.doubleToLongBits(this.f9159f);
        long j11 = jDoubleToLongBits6 ^ (jDoubleToLongBits6 >>> 32);
        long jDoubleToLongBits7 = Double.doubleToLongBits(this.f9160g);
        long jDoubleToLongBits8 = Double.doubleToLongBits(this.h);
        long j12 = jDoubleToLongBits8 ^ (jDoubleToLongBits8 >>> 32);
        long jDoubleToLongBits9 = Double.doubleToLongBits(this.f9161i);
        return (((((((((((((((((int) j6) * 31) + ((int) j7)) * 31) + ((int) j8)) * 31) + ((int) j9)) * 31) + ((int) j10)) * 31) + ((int) j11)) * 31) + ((int) (jDoubleToLongBits7 ^ (jDoubleToLongBits7 >>> 32)))) * 31) + ((int) j12)) * 31) + ((int) (jDoubleToLongBits9 ^ (jDoubleToLongBits9 >>> 32)));
    }

    public final String toString() {
        if (equals(f9150j)) {
            return "Rotate 0°";
        }
        if (equals(f9151k)) {
            return "Rotate 90°";
        }
        if (equals(f9152l)) {
            return "Rotate 180°";
        }
        if (equals(f9153m)) {
            return "Rotate 270°";
        }
        StringBuilder sb = new StringBuilder(260);
        sb.append("Matrix{u=");
        sb.append(this.f9154a);
        sb.append(", v=");
        sb.append(this.f9155b);
        sb.append(", w=");
        sb.append(this.f9156c);
        sb.append(", a=");
        sb.append(this.f9157d);
        sb.append(", b=");
        sb.append(this.f9158e);
        sb.append(", c=");
        sb.append(this.f9159f);
        sb.append(", d=");
        sb.append(this.f9160g);
        sb.append(", tx=");
        sb.append(this.h);
        sb.append(", ty=");
        sb.append(this.f9161i);
        sb.append("}");
        return sb.toString();
    }
}
