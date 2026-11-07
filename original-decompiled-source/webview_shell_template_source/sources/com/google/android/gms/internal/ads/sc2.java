package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class sc2 {

    /* renamed from: a, reason: collision with root package name */
    public final pa2 f8897a;

    /* renamed from: b, reason: collision with root package name */
    public final int f8898b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f8899c = false;

    public sc2(pa2 pa2Var, int i6) {
        this.f8897a = pa2Var;
        this.f8898b = i6;
    }

    public static boolean l(pa2 pa2Var) {
        return pa2Var.f8014z != 0;
    }

    public final int a() {
        return l(this.f8897a) ? 1 : 0;
    }

    public final void b() {
        pa2 pa2Var = this.f8897a;
        if (l(pa2Var)) {
            pa2Var.w();
        }
    }

    public final void c() {
        pa2 pa2Var = this.f8897a;
        y5.r(pa2Var.f8014z == 0);
        pa2Var.c();
        this.f8899c = false;
    }

    public final void d(long j6, long j7) {
        pa2 pa2Var = this.f8897a;
        if (l(pa2Var)) {
            pa2Var.l(j6, j7);
        }
    }

    public final void e(w[] wVarArr, mi2 mi2Var, long j6, long j7, oh2 oh2Var) {
        this.f8897a.h(wVarArr, mi2Var, j6, j7, oh2Var);
    }

    public final void f() {
        if (this.f8899c) {
            pa2 pa2Var = this.f8897a;
            y5.r(pa2Var.f8014z == 0);
            ro0 ro0Var = pa2Var.f8009u;
            ro0Var.f8673t = null;
            ro0Var.s = null;
            pa2Var.d();
            this.f8899c = false;
        }
    }

    public final void g(Object obj) {
        pa2 pa2Var = this.f8897a;
        if (pa2Var.f8008t == 2) {
            pa2Var.b(1, obj);
        }
    }

    public final boolean h(vb2 vb2Var) {
        mi2 mi2Var = vb2Var.f9793c[this.f8898b];
        pa2 pa2Var = this.f8897a;
        boolean z6 = mi2Var != pa2Var.A;
        return z6 || (!z6 && pa2Var.j()) || pa2Var.n() || pa2Var.m();
    }

    public final boolean i(vb2 vb2Var) {
        mi2 mi2Var = vb2Var.f9793c[this.f8898b];
        pa2 pa2Var = this.f8897a;
        if (pa2Var.A == mi2Var) {
            return mi2Var == null || pa2Var.j();
        }
        return false;
    }

    public final boolean j() {
        return this.f8897a.j();
    }

    public final boolean k(vb2 vb2Var) {
        pa2 pa2Var = null;
        if (vb2Var != null) {
            mi2 mi2Var = vb2Var.f9793c[this.f8898b];
            if (mi2Var != null) {
                pa2 pa2Var2 = this.f8897a;
                if (pa2Var2.A == mi2Var) {
                    pa2Var = pa2Var2;
                }
            }
        }
        return pa2Var != null;
    }
}
