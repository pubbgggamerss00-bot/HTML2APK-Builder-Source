package q1;

/* loaded from: classes.dex */
public final class c2 implements l1 {

    /* renamed from: a, reason: collision with root package name */
    public int f21659a;

    /* renamed from: b, reason: collision with root package name */
    public float f21660b;

    /* renamed from: c, reason: collision with root package name */
    public float f21661c;

    /* renamed from: d, reason: collision with root package name */
    public float f21662d;

    /* renamed from: e, reason: collision with root package name */
    public float f21663e;

    /* renamed from: f, reason: collision with root package name */
    public float f21664f;

    /* renamed from: g, reason: collision with root package name */
    public float f21665g;

    /* renamed from: h, reason: collision with root package name */
    public long f21666h;

    /* renamed from: j, reason: collision with root package name */
    public long f21667j;

    /* renamed from: k, reason: collision with root package name */
    public float f21668k;

    /* renamed from: l, reason: collision with root package name */
    public float f21669l;

    /* renamed from: m, reason: collision with root package name */
    public long f21670m;

    /* renamed from: n, reason: collision with root package name */
    public f2 f21671n;

    /* renamed from: p, reason: collision with root package name */
    public boolean f21672p;

    /* renamed from: q, reason: collision with root package name */
    public int f21673q;

    /* renamed from: r, reason: collision with root package name */
    public long f21674r;

    /* renamed from: s, reason: collision with root package name */
    public f3.d f21675s;

    /* renamed from: t, reason: collision with root package name */
    public f3.r f21676t;

    /* renamed from: v, reason: collision with root package name */
    public z1 f21677v;

    /* renamed from: w, reason: collision with root package name */
    public s1 f21678w;

    @Override // q1.l1
    public final void A(long j10) {
        if (b1.d(this.f21666h, j10)) {
            return;
        }
        this.f21659a |= 64;
        this.f21666h = j10;
    }

    @Override // q1.l1
    public final void C(boolean z10) {
        if (this.f21672p != z10) {
            this.f21659a |= 16384;
            this.f21672p = z10;
        }
    }

    @Override // q1.l1
    public final void D(long j10) {
        if (b1.d(this.f21667j, j10)) {
            return;
        }
        this.f21659a |= 128;
        this.f21667j = j10;
    }

    @Override // f3.d
    public final float G0() {
        return this.f21675s.G0();
    }

    @Override // q1.l1
    public final void b(float f10) {
        if (this.f21668k == f10) {
            return;
        }
        this.f21659a |= 1024;
        this.f21668k = f10;
    }

    @Override // q1.l1
    public final void c(float f10) {
        if (this.f21664f == f10) {
            return;
        }
        this.f21659a |= 16;
        this.f21664f = f10;
    }

    @Override // q1.l1
    public final void c1(long j10) {
        if (l2.a(this.f21670m, j10)) {
            return;
        }
        this.f21659a |= 4096;
        this.f21670m = j10;
    }

    @Override // q1.l1
    public final void d(float f10) {
        if (this.f21661c == f10) {
            return;
        }
        this.f21659a |= 2;
        this.f21661c = f10;
    }

    @Override // q1.l1
    public final void e() {
    }

    @Override // q1.l1
    public final void f(float f10) {
        if (this.f21662d == f10) {
            return;
        }
        this.f21659a |= 4;
        this.f21662d = f10;
    }

    @Override // q1.l1
    public final void g() {
    }

    @Override // f3.d
    public final float getDensity() {
        return this.f21675s.getDensity();
    }

    @Override // q1.l1
    public final void h(float f10) {
        if (this.f21660b == f10) {
            return;
        }
        this.f21659a |= 1;
        this.f21660b = f10;
    }

    @Override // q1.l1
    public final long i() {
        return this.f21674r;
    }

    @Override // q1.l1
    public final void j(float f10) {
        if (this.f21663e == f10) {
            return;
        }
        this.f21659a |= 8;
        this.f21663e = f10;
    }

    @Override // q1.l1
    public final void k(float f10) {
        if (this.f21669l == f10) {
            return;
        }
        this.f21659a |= 2048;
        this.f21669l = f10;
    }

    @Override // q1.l1
    public final void l(z1 z1Var) {
        if (kotlin.jvm.internal.r.a(this.f21677v, z1Var)) {
            return;
        }
        this.f21659a |= 131072;
        this.f21677v = z1Var;
    }

    @Override // q1.l1
    public final void n(float f10) {
        if (this.f21665g == f10) {
            return;
        }
        this.f21659a |= 32;
        this.f21665g = f10;
    }

    @Override // q1.l1
    public final void p1(f2 f2Var) {
        if (kotlin.jvm.internal.r.a(this.f21671n, f2Var)) {
            return;
        }
        this.f21659a |= 8192;
        this.f21671n = f2Var;
    }

    @Override // q1.l1
    public final void s(int i10) {
        if (this.f21673q == i10) {
            return;
        }
        this.f21659a |= 32768;
        this.f21673q = i10;
    }
}
