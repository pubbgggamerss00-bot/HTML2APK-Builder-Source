package d0;

import androidx.compose.ui.d;

/* loaded from: classes.dex */
public final class n1 extends d.c implements i2.k2 {

    /* renamed from: q, reason: collision with root package name */
    public eh.a<? extends g0> f7196q;

    /* renamed from: r, reason: collision with root package name */
    public m1 f7197r;

    /* renamed from: s, reason: collision with root package name */
    public v.t0 f7198s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f7199t;

    /* renamed from: v, reason: collision with root package name */
    public q2.j f7200v;

    /* renamed from: w, reason: collision with root package name */
    public final o1 f7201w = new o1(this, 0);

    /* renamed from: x, reason: collision with root package name */
    public d f7202x;

    public static final class a extends kotlin.jvm.internal.s implements eh.a<Float> {
        public a() {
            super(0);
        }

        @Override // eh.a
        public final Float invoke() {
            n1 n1Var = n1.this;
            return Float.valueOf(n1Var.f7197r.a() - n1Var.f7197r.c());
        }
    }

    public static final class b extends kotlin.jvm.internal.s implements eh.a<Float> {
        public b() {
            super(0);
        }

        @Override // eh.a
        public final Float invoke() {
            return Float.valueOf(n1.this.f7197r.b());
        }
    }

    public static final class c extends kotlin.jvm.internal.s implements eh.a<Float> {
        public c() {
            super(0);
        }

        @Override // eh.a
        public final Float invoke() {
            return Float.valueOf(n1.this.f7197r.e());
        }
    }

    public static final class d extends kotlin.jvm.internal.s implements eh.l<Integer, Boolean> {
        public d() {
            super(1);
        }

        @Override // eh.l
        public final Boolean invoke(Integer num) {
            int iIntValue = num.intValue();
            n1 n1Var = n1.this;
            g0 g0VarInvoke = n1Var.f7196q.invoke();
            if (iIntValue < 0 || iIntValue >= g0VarInvoke.getItemCount()) {
                StringBuilder sbB = p.i0.b(iIntValue, "Can't scroll to index ", ", it is out of bounds [0, ");
                sbB.append(g0VarInvoke.getItemCount());
                sbB.append(')');
                y.c.a(sbB.toString());
            }
            ph.h.c(n1Var.H1(), null, null, new p1(n1Var, iIntValue, null), 3);
            return Boolean.TRUE;
        }
    }

    public n1(eh.a aVar, m1 m1Var, v.t0 t0Var, boolean z10) {
        this.f7196q = aVar;
        this.f7197r = m1Var;
        this.f7198s = t0Var;
        this.f7199t = z10;
        T1();
    }

    @Override // androidx.compose.ui.d.c
    public final boolean I1() {
        return false;
    }

    public final void T1() {
        this.f7200v = new q2.j(new b(), new c());
        this.f7202x = this.f7199t ? new d() : null;
    }

    @Override // i2.k2
    public final void X(q2.d0 d0Var) {
        q2.a0.f(d0Var);
        d0Var.c(q2.w.K, this.f7201w);
        if (this.f7198s == v.t0.f30083a) {
            q2.j jVar = this.f7200v;
            if (jVar == null) {
                kotlin.jvm.internal.r.h("scrollAxisRange");
                throw null;
            }
            q2.c0<q2.j> c0Var = q2.w.f21839t;
            kh.i<Object> iVar = q2.a0.f21754a[11];
            c0Var.getClass();
            d0Var.c(c0Var, jVar);
        } else {
            q2.j jVar2 = this.f7200v;
            if (jVar2 == null) {
                kotlin.jvm.internal.r.h("scrollAxisRange");
                throw null;
            }
            q2.c0<q2.j> c0Var2 = q2.w.f21838s;
            kh.i<Object> iVar2 = q2.a0.f21754a[10];
            c0Var2.getClass();
            d0Var.c(c0Var2, jVar2);
        }
        d dVar = this.f7202x;
        if (dVar != null) {
            d0Var.c(q2.k.f21778f, new q2.a(null, dVar));
        }
        d0Var.c(q2.k.B, new q2.a(null, new q2.z(new a(), 0)));
        q2.b bVarF = this.f7197r.f();
        q2.c0<q2.b> c0Var3 = q2.w.f21825f;
        kh.i<Object> iVar3 = q2.a0.f21754a[21];
        c0Var3.getClass();
        d0Var.c(c0Var3, bVarF);
    }
}
