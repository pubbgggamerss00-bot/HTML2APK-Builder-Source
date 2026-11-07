package t;

import androidx.compose.ui.d;
import g2.g1;
import h1.h;
import i2.k2;

/* loaded from: classes.dex */
public final class s1 extends d.c implements i2.b0, k2 {

    /* renamed from: q, reason: collision with root package name */
    public u1 f25345q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f25346r;

    public static final class a extends kotlin.jvm.internal.s implements eh.a<Float> {
        public a() {
            super(0);
        }

        @Override // eh.a
        public final Float invoke() {
            return Float.valueOf(s1.this.f25345q.f25376a.g());
        }
    }

    public static final class b extends kotlin.jvm.internal.s implements eh.a<Float> {
        public b() {
            super(0);
        }

        @Override // eh.a
        public final Float invoke() {
            return Float.valueOf(s1.this.f25345q.f25379d.g());
        }
    }

    public static final class c extends kotlin.jvm.internal.s implements eh.l<g1.a, pg.f0> {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ int f25350b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ g2.g1 f25351c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(int i10, g2.g1 g1Var) {
            super(1);
            this.f25350b = i10;
            this.f25351c = g1Var;
        }

        @Override // eh.l
        public final pg.f0 invoke(g1.a aVar) {
            g1.a aVar2 = aVar;
            s1 s1Var = s1.this;
            int iG = s1Var.f25345q.f25376a.g();
            if (iG < 0) {
                iG = 0;
            }
            int i10 = this.f25350b;
            if (iG > i10) {
                iG = i10;
            }
            int i11 = -iG;
            boolean z10 = s1Var.f25346r;
            int i12 = z10 ? 0 : i11;
            if (!z10) {
                i11 = 0;
            }
            t1 t1Var = new t1(i12, i11, this.f25351c);
            aVar2.f11387a = true;
            t1Var.invoke(aVar2);
            aVar2.f11387a = false;
            return pg.f0.f21461a;
        }
    }

    @Override // i2.b0
    public final int F(i2.l0 l0Var, g2.p pVar, int i10) {
        if (this.f25346r) {
            i10 = Integer.MAX_VALUE;
        }
        return pVar.O(i10);
    }

    @Override // i2.b0
    public final int G(i2.l0 l0Var, g2.p pVar, int i10) {
        if (this.f25346r) {
            i10 = Integer.MAX_VALUE;
        }
        return pVar.J(i10);
    }

    @Override // i2.k2
    public final void X(q2.d0 d0Var) {
        q2.a0.f(d0Var);
        q2.j jVar = new q2.j(new a(), new b());
        if (this.f25346r) {
            q2.c0<q2.j> c0Var = q2.w.f21839t;
            kh.i<Object> iVar = q2.a0.f21754a[11];
            c0Var.getClass();
            d0Var.c(c0Var, jVar);
            return;
        }
        q2.c0<q2.j> c0Var2 = q2.w.f21838s;
        kh.i<Object> iVar2 = q2.a0.f21754a[10];
        c0Var2.getClass();
        d0Var.c(c0Var2, jVar);
    }

    @Override // i2.b0
    public final g2.m0 m(g2.o0 o0Var, g2.k0 k0Var, long j10) {
        aa.b.c(j10, this.f25346r ? v.t0.f30083a : v.t0.f30084b);
        g2.g1 g1VarP = k0Var.P(f3.b.b(j10, 0, this.f25346r ? f3.b.i(j10) : Integer.MAX_VALUE, 0, this.f25346r ? Integer.MAX_VALUE : f3.b.h(j10), 5));
        int i10 = g1VarP.f11382a;
        int i11 = f3.b.i(j10);
        if (i10 > i11) {
            i10 = i11;
        }
        int i12 = g1VarP.f11383b;
        int iH = f3.b.h(j10);
        if (i12 > iH) {
            i12 = iH;
        }
        int i13 = g1VarP.f11383b - i12;
        int i14 = g1VarP.f11382a - i10;
        if (!this.f25346r) {
            i13 = i14;
        }
        u1 u1Var = this.f25345q;
        x0.v1 v1Var = u1Var.f25379d;
        x0.v1 v1Var2 = u1Var.f25376a;
        v1Var.f(i13);
        h1.h hVarA = h.a.a();
        eh.l<Object, pg.f0> lVarE = hVarA != null ? hVarA.e() : null;
        h1.h hVarB = h.a.b(hVarA);
        try {
            if (v1Var2.g() > i13) {
                v1Var2.f(i13);
            }
            pg.f0 f0Var = pg.f0.f21461a;
            h.a.d(hVarA, hVarB, lVarE);
            this.f25345q.f25377b.f(this.f25346r ? i12 : i10);
            return o0Var.i0(i10, i12, qg.a0.f22708a, new c(i13, g1VarP));
        } catch (Throwable th2) {
            h.a.d(hVarA, hVarB, lVarE);
            throw th2;
        }
    }

    @Override // i2.b0
    public final int r(i2.l0 l0Var, g2.p pVar, int i10) {
        if (!this.f25346r) {
            i10 = Integer.MAX_VALUE;
        }
        return pVar.z(i10);
    }

    @Override // i2.b0
    public final int w(i2.l0 l0Var, g2.p pVar, int i10) {
        if (!this.f25346r) {
            i10 = Integer.MAX_VALUE;
        }
        return pVar.b0(i10);
    }
}
