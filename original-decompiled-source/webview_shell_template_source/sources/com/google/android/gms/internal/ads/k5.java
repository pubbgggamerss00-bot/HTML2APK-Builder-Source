package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class k5 {

    /* renamed from: a, reason: collision with root package name */
    public final int f6239a;

    /* renamed from: b, reason: collision with root package name */
    public int f6240b;

    /* renamed from: c, reason: collision with root package name */
    public int f6241c;

    /* renamed from: d, reason: collision with root package name */
    public long f6242d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f6243e;

    /* renamed from: f, reason: collision with root package name */
    public final ex0 f6244f;

    /* renamed from: g, reason: collision with root package name */
    public final ex0 f6245g;
    public int h;

    /* renamed from: i, reason: collision with root package name */
    public int f6246i;

    public k5(ex0 ex0Var, ex0 ex0Var2, boolean z6) throws rn {
        this.f6245g = ex0Var;
        this.f6244f = ex0Var2;
        this.f6243e = z6;
        ex0Var2.j(12);
        this.f6239a = ex0Var2.y();
        ex0Var.j(12);
        this.f6246i = ex0Var.y();
        me0.l("first_chunk must be 1", ex0Var.q() == 1);
        this.f6240b = -1;
    }

    public final boolean a() {
        int i6 = this.f6240b + 1;
        this.f6240b = i6;
        if (i6 == this.f6239a) {
            return false;
        }
        boolean z6 = this.f6243e;
        ex0 ex0Var = this.f6244f;
        this.f6242d = z6 ? ex0Var.E() : ex0Var.D();
        if (this.f6240b == this.h) {
            ex0 ex0Var2 = this.f6245g;
            this.f6241c = ex0Var2.y();
            ex0Var2.k(4);
            int i7 = this.f6246i - 1;
            this.f6246i = i7;
            this.h = i7 > 0 ? (-1) + ex0Var2.y() : -1;
        }
        return true;
    }
}
