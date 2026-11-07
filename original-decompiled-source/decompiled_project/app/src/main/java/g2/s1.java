package g2;

import d0.e2;

/* loaded from: classes.dex */
public final class s1 {

    /* renamed from: a, reason: collision with root package name */
    public final u1 f11440a;

    /* renamed from: b, reason: collision with root package name */
    public d0 f11441b;

    /* renamed from: c, reason: collision with root package name */
    public final d f11442c;

    /* renamed from: d, reason: collision with root package name */
    public final b f11443d;

    /* renamed from: e, reason: collision with root package name */
    public final c f11444e;

    public interface a {
        void a();

        default int b() {
            return 0;
        }

        default void c(int i10, long j10) {
        }

        default void d(e2.a.b bVar) {
        }
    }

    public static final class b extends kotlin.jvm.internal.s implements eh.p<i2.e0, x0.s, pg.f0> {
        public b() {
            super(2);
        }

        @Override // eh.p
        public final pg.f0 invoke(i2.e0 e0Var, x0.s sVar) {
            s1.this.a().f11325b = sVar;
            return pg.f0.f21461a;
        }
    }

    public static final class c extends kotlin.jvm.internal.s implements eh.p<i2.e0, eh.p<? super t1, ? super f3.b, ? extends m0>, pg.f0> {
        public c() {
            super(2);
        }

        @Override // eh.p
        public final pg.f0 invoke(i2.e0 e0Var, eh.p<? super t1, ? super f3.b, ? extends m0> pVar) {
            d0 d0VarA = s1.this.a();
            e0Var.l(new f0(d0VarA, pVar, d0VarA.f11339r));
            return pg.f0.f21461a;
        }
    }

    public static final class d extends kotlin.jvm.internal.s implements eh.p<i2.e0, s1, pg.f0> {
        public d() {
            super(2);
        }

        @Override // eh.p
        public final pg.f0 invoke(i2.e0 e0Var, s1 s1Var) {
            i2.e0 e0Var2 = e0Var;
            s1 s1Var2 = s1.this;
            u1 u1Var = s1Var2.f11440a;
            d0 d0Var = e0Var2.L;
            if (d0Var == null) {
                d0Var = new d0(e0Var2, u1Var);
                e0Var2.L = d0Var;
            }
            s1Var2.f11441b = d0Var;
            s1Var2.a().c();
            d0 d0VarA = s1Var2.a();
            if (d0VarA.f11326c != u1Var) {
                d0VarA.f11326c = u1Var;
                d0VarA.e(false);
                i2.e0.f0(d0VarA.f11324a, false, 7);
            }
            return pg.f0.f21461a;
        }
    }

    public s1(u1 u1Var) {
        this.f11440a = u1Var;
        this.f11442c = new d();
        this.f11443d = new b();
        this.f11444e = new c();
    }

    public final d0 a() {
        d0 d0Var = this.f11441b;
        if (d0Var != null) {
            return d0Var;
        }
        throw new IllegalArgumentException("SubcomposeLayoutState is not attached to SubcomposeLayout");
    }

    public s1() {
        this(w0.f11458a);
    }
}
