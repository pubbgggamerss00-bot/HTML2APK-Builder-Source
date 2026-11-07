package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class oh2 {

    /* renamed from: a, reason: collision with root package name */
    public final Object f7769a;

    /* renamed from: b, reason: collision with root package name */
    public final int f7770b;

    /* renamed from: c, reason: collision with root package name */
    public final int f7771c;

    /* renamed from: d, reason: collision with root package name */
    public final long f7772d;

    /* renamed from: e, reason: collision with root package name */
    public final int f7773e;

    public oh2(Object obj, int i6, int i7, long j6, int i8) {
        this.f7769a = obj;
        this.f7770b = i6;
        this.f7771c = i7;
        this.f7772d = j6;
        this.f7773e = i8;
    }

    public final oh2 a(Object obj) {
        return this.f7769a.equals(obj) ? this : new oh2(obj, this.f7770b, this.f7771c, this.f7772d, this.f7773e);
    }

    public final boolean b() {
        return this.f7770b != -1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof oh2)) {
            return false;
        }
        oh2 oh2Var = (oh2) obj;
        return this.f7769a.equals(oh2Var.f7769a) && this.f7770b == oh2Var.f7770b && this.f7771c == oh2Var.f7771c && this.f7772d == oh2Var.f7772d && this.f7773e == oh2Var.f7773e;
    }

    public final int hashCode() {
        return ((((((((this.f7769a.hashCode() + 527) * 31) + this.f7770b) * 31) + this.f7771c) * 31) + ((int) this.f7772d)) * 31) + this.f7773e;
    }

    public oh2(long j6, Object obj) {
        this(obj, -1, -1, j6, -1);
    }

    public oh2(Object obj, long j6, int i6) {
        this(obj, -1, -1, j6, i6);
    }
}
