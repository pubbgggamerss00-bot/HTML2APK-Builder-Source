package i2;

import i2.e0;

/* loaded from: classes.dex */
public final class j0 {

    /* renamed from: a, reason: collision with root package name */
    public final e0 f13914a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f13915b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f13916c;

    /* renamed from: e, reason: collision with root package name */
    public boolean f13918e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f13919f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f13920g;

    /* renamed from: h, reason: collision with root package name */
    public int f13921h;

    /* renamed from: i, reason: collision with root package name */
    public int f13922i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f13923j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f13924k;

    /* renamed from: l, reason: collision with root package name */
    public int f13925l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f13926m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f13927n;

    /* renamed from: o, reason: collision with root package name */
    public int f13928o;

    /* renamed from: q, reason: collision with root package name */
    public p0 f13930q;

    /* renamed from: d, reason: collision with root package name */
    public e0.d f13917d = e0.d.f13837e;

    /* renamed from: p, reason: collision with root package name */
    public final x0 f13929p = new x0(this);

    public j0(e0 e0Var) {
        this.f13914a = e0Var;
    }

    public final g1 a() {
        return this.f13914a.I.f13791c;
    }

    public final void b(int i10) {
        int i11 = this.f13925l;
        this.f13925l = i10;
        if ((i11 == 0) != (i10 == 0)) {
            e0 e0VarG = this.f13914a.G();
            j0 j0Var = e0VarG != null ? e0VarG.K : null;
            if (j0Var != null) {
                if (i10 == 0) {
                    j0Var.b(j0Var.f13925l - 1);
                } else {
                    j0Var.b(j0Var.f13925l + 1);
                }
            }
        }
    }

    public final void c(int i10) {
        int i11 = this.f13928o;
        this.f13928o = i10;
        if ((i11 == 0) != (i10 == 0)) {
            e0 e0VarG = this.f13914a.G();
            j0 j0Var = e0VarG != null ? e0VarG.K : null;
            if (j0Var != null) {
                if (i10 == 0) {
                    j0Var.c(j0Var.f13928o - 1);
                } else {
                    j0Var.c(j0Var.f13928o + 1);
                }
            }
        }
    }

    public final void d(boolean z10) {
        if (this.f13924k != z10) {
            this.f13924k = z10;
            if (z10 && !this.f13923j) {
                b(this.f13925l + 1);
            } else {
                if (z10 || this.f13923j) {
                    return;
                }
                b(this.f13925l - 1);
            }
        }
    }

    public final void e(boolean z10) {
        if (this.f13923j != z10) {
            this.f13923j = z10;
            if (z10 && !this.f13924k) {
                b(this.f13925l + 1);
            } else {
                if (z10 || this.f13924k) {
                    return;
                }
                b(this.f13925l - 1);
            }
        }
    }

    public final void f(boolean z10) {
        if (this.f13927n != z10) {
            this.f13927n = z10;
            if (z10 && !this.f13926m) {
                c(this.f13928o + 1);
            } else {
                if (z10 || this.f13926m) {
                    return;
                }
                c(this.f13928o - 1);
            }
        }
    }

    public final void g(boolean z10) {
        if (this.f13926m != z10) {
            this.f13926m = z10;
            if (z10 && !this.f13927n) {
                c(this.f13928o + 1);
            } else {
                if (z10 || this.f13927n) {
                    return;
                }
                c(this.f13928o - 1);
            }
        }
    }

    public final void h() {
        x0 x0Var = this.f13929p;
        j0 j0Var = x0Var.f14047f;
        Object obj = x0Var.f14060v;
        e0 e0Var = this.f13914a;
        if ((obj != null || j0Var.a().w() != null) && x0Var.f14059t) {
            x0Var.f14059t = false;
            x0Var.f14060v = j0Var.a().w();
            e0 e0VarG = e0Var.G();
            if (e0VarG != null) {
                e0.f0(e0VarG, false, 7);
            }
        }
        p0 p0Var = this.f13930q;
        if (p0Var != null) {
            j0 j0Var2 = p0Var.f13976f;
            if (p0Var.A == null) {
                o0 o0VarG1 = j0Var2.a().g1();
                kotlin.jvm.internal.r.b(o0VarG1);
                if (o0VarG1.f13968n.w() == null) {
                    return;
                }
            }
            if (p0Var.f13993z) {
                p0Var.f13993z = false;
                o0 o0VarG12 = j0Var2.a().g1();
                kotlin.jvm.internal.r.b(o0VarG12);
                p0Var.A = o0VarG12.f13968n.w();
                if (f3.u.d(e0Var)) {
                    e0 e0VarG2 = e0Var.G();
                    if (e0VarG2 != null) {
                        e0.f0(e0VarG2, false, 7);
                        return;
                    }
                    return;
                }
                e0 e0VarG3 = e0Var.G();
                if (e0VarG3 != null) {
                    e0.d0(e0VarG3, false, 7);
                }
            }
        }
    }
}
