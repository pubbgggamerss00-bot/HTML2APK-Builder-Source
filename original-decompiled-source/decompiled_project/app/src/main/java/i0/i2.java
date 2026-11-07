package i0;

/* loaded from: classes.dex */
public final class i2 {
    public final x0.x1 A;

    /* renamed from: a, reason: collision with root package name */
    public z2 f13337a;

    /* renamed from: b, reason: collision with root package name */
    public final x0.g2 f13338b;

    /* renamed from: c, reason: collision with root package name */
    public final j2.z4 f13339c;

    /* renamed from: d, reason: collision with root package name */
    public final y2.j f13340d;

    /* renamed from: e, reason: collision with root package name */
    public y2.n0 f13341e;

    /* renamed from: f, reason: collision with root package name */
    public final x0.x1 f13342f;

    /* renamed from: g, reason: collision with root package name */
    public final x0.x1 f13343g;

    /* renamed from: h, reason: collision with root package name */
    public g2.v f13344h;

    /* renamed from: i, reason: collision with root package name */
    public final x0.x1 f13345i;

    /* renamed from: j, reason: collision with root package name */
    public t2.b f13346j;

    /* renamed from: k, reason: collision with root package name */
    public final x0.x1 f13347k;

    /* renamed from: l, reason: collision with root package name */
    public final x0.x1 f13348l;

    /* renamed from: m, reason: collision with root package name */
    public final x0.x1 f13349m;

    /* renamed from: n, reason: collision with root package name */
    public final x0.x1 f13350n;

    /* renamed from: o, reason: collision with root package name */
    public final x0.x1 f13351o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f13352p;

    /* renamed from: q, reason: collision with root package name */
    public final x0.x1 f13353q;

    /* renamed from: r, reason: collision with root package name */
    public final e2 f13354r;

    /* renamed from: s, reason: collision with root package name */
    public final x0.x1 f13355s;

    /* renamed from: t, reason: collision with root package name */
    public final x0.x1 f13356t;

    /* renamed from: u, reason: collision with root package name */
    public eh.l<? super y2.c0, pg.f0> f13357u;

    /* renamed from: v, reason: collision with root package name */
    public final b f13358v;

    /* renamed from: w, reason: collision with root package name */
    public final a f13359w;

    /* renamed from: x, reason: collision with root package name */
    public final q1.h0 f13360x;

    /* renamed from: y, reason: collision with root package name */
    public long f13361y;

    /* renamed from: z, reason: collision with root package name */
    public final x0.x1 f13362z;

    public static final class a extends kotlin.jvm.internal.s implements eh.l<y2.n, pg.f0> {
        public a() {
            super(1);
        }

        @Override // eh.l
        public final pg.f0 invoke(y2.n nVar) {
            eh.l<f2, pg.f0> lVar;
            pg.f0 f0Var;
            j2.z4 z4Var;
            int i10 = nVar.f33749a;
            e2 e2Var = i2.this.f13354r;
            e2Var.getClass();
            if (i10 == 7) {
                lVar = e2Var.a().f13295a;
            } else if (i10 == 2) {
                lVar = e2Var.a().f13296b;
            } else {
                if (i10 == 6 || i10 == 5 || i10 == 3 || i10 == 4) {
                    e2Var.a();
                } else if (i10 != 1 && i10 != 0) {
                    throw new IllegalStateException("invalid ImeAction");
                }
                lVar = null;
            }
            if (lVar != null) {
                lVar.invoke(e2Var);
                f0Var = pg.f0.f21461a;
            } else {
                f0Var = null;
            }
            if (f0Var == null) {
                if (i10 == 6) {
                    o1.n nVar2 = e2Var.f13270c;
                    if (nVar2 == null) {
                        kotlin.jvm.internal.r.h("focusManager");
                        throw null;
                    }
                    nVar2.n(1);
                } else if (i10 == 5) {
                    o1.n nVar3 = e2Var.f13270c;
                    if (nVar3 == null) {
                        kotlin.jvm.internal.r.h("focusManager");
                        throw null;
                    }
                    nVar3.n(2);
                } else if (i10 == 7 && (z4Var = e2Var.f13268a) != null) {
                    z4Var.b();
                }
            }
            return pg.f0.f21461a;
        }
    }

    public static final class b extends kotlin.jvm.internal.s implements eh.l<y2.c0, pg.f0> {
        public b() {
            super(1);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // eh.l
        public final pg.f0 invoke(y2.c0 c0Var) {
            y2.c0 c0Var2 = c0Var;
            String str = c0Var2.f33682a.f27761b;
            i2 i2Var = i2.this;
            x0.x1 x1Var = i2Var.f13356t;
            t2.b bVar = i2Var.f13346j;
            if (!kotlin.jvm.internal.r.a(str, bVar != null ? bVar.f27761b : null)) {
                i2Var.f13347k.setValue(v1.f13646a);
                if (((Boolean) x1Var.getValue()).booleanValue()) {
                    x1Var.setValue(Boolean.FALSE);
                } else {
                    i2Var.f13355s.setValue(Boolean.FALSE);
                }
            }
            long j10 = t2.j0.f27837b;
            i2Var.f(j10);
            i2Var.e(j10);
            i2Var.f13357u.invoke(c0Var2);
            i2Var.f13338b.invalidate();
            return pg.f0.f21461a;
        }
    }

    public static final class c extends kotlin.jvm.internal.s implements eh.l<y2.c0, pg.f0> {

        /* renamed from: a, reason: collision with root package name */
        public static final c f13365a = new c(1);

        @Override // eh.l
        public final /* bridge */ /* synthetic */ pg.f0 invoke(y2.c0 c0Var) {
            return pg.f0.f21461a;
        }
    }

    public i2(z2 z2Var, x0.g2 g2Var, j2.z4 z4Var) {
        this.f13337a = z2Var;
        this.f13338b = g2Var;
        this.f13339c = z4Var;
        y2.j jVar = new y2.j();
        t2.b bVar = t2.e.f27797a;
        long j10 = t2.j0.f27837b;
        y2.c0 c0Var = new y2.c0(bVar, j10, (t2.j0) null);
        jVar.f33734a = c0Var;
        jVar.f33735b = new y2.k(bVar, c0Var.f33683b);
        this.f13340d = jVar;
        Boolean bool = Boolean.FALSE;
        this.f13342f = bg.b.h(bool);
        this.f13343g = bg.b.h(new f3.h(0));
        this.f13345i = bg.b.h(null);
        this.f13347k = bg.b.h(v1.f13646a);
        this.f13348l = bg.b.h(bool);
        this.f13349m = bg.b.h(bool);
        this.f13350n = bg.b.h(bool);
        this.f13351o = bg.b.h(bool);
        this.f13352p = true;
        this.f13353q = bg.b.h(Boolean.TRUE);
        this.f13354r = new e2(z4Var);
        this.f13355s = bg.b.h(bool);
        this.f13356t = bg.b.h(bool);
        this.f13357u = c.f13365a;
        this.f13358v = new b();
        this.f13359w = new a();
        this.f13360x = q1.i0.a();
        this.f13361y = q1.b1.f21654h;
        this.f13362z = bg.b.h(new t2.j0(j10));
        this.A = bg.b.h(new t2.j0(j10));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final v1 a() {
        return (v1) this.f13347k.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean b() {
        return ((Boolean) this.f13342f.getValue()).booleanValue();
    }

    public final g2.v c() {
        g2.v vVar = this.f13344h;
        if (vVar == null || !vVar.m()) {
            return null;
        }
        return vVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final l4 d() {
        return (l4) this.f13345i.getValue();
    }

    public final void e(long j10) {
        this.A.setValue(new t2.j0(j10));
    }

    public final void f(long j10) {
        this.f13362z.setValue(new t2.j0(j10));
    }
}
