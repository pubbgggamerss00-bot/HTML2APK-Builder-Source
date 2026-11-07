package s0;

import android.view.View;
import androidx.compose.ui.d;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import i2.a0;
import p.h0;
import pg.f0;
import ph.i0;
import q1.c0;
import q1.w0;
import t0.q2;
import t0.r2;
import x.o;

/* loaded from: classes.dex */
public abstract class r extends d.c implements i2.h, i2.r, a0 {

    /* renamed from: q, reason: collision with root package name */
    public final x.l f24138q;

    /* renamed from: r, reason: collision with root package name */
    public final boolean f24139r;

    /* renamed from: s, reason: collision with root package name */
    public final float f24140s;

    /* renamed from: t, reason: collision with root package name */
    public final q2 f24141t;

    /* renamed from: v, reason: collision with root package name */
    public final r2 f24142v;

    /* renamed from: w, reason: collision with root package name */
    public u f24143w;

    /* renamed from: x, reason: collision with root package name */
    public float f24144x;

    /* renamed from: z, reason: collision with root package name */
    public boolean f24146z;

    /* renamed from: y, reason: collision with root package name */
    public long f24145y = 0;
    public final h0<x.o> A = new h0<>((Object) null);

    @vg.e(c = "androidx.compose.material.ripple.RippleNode$onAttach$1", f = "Ripple.kt", l = {364}, m = "invokeSuspend")
    public static final class a extends vg.i implements eh.p<i0, tg.e<? super f0>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f24147a;

        /* renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f24148b;

        /* renamed from: s0.r$a$a, reason: collision with other inner class name */
        public static final class C0269a<T> implements sh.g {

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ r f24150a;

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ i0 f24151b;

            public C0269a(r rVar, i0 i0Var) {
                this.f24150a = rVar;
                this.f24151b = i0Var;
            }

            @Override // sh.g
            public final Object c(Object obj, tg.e eVar) {
                x.k kVar = (x.k) obj;
                boolean z10 = kVar instanceof x.o;
                r rVar = this.f24150a;
                if (!z10) {
                    u uVar = rVar.f24143w;
                    if (uVar == null) {
                        uVar = new u(rVar.f24142v, rVar.f24139r);
                        i2.s.a(rVar);
                        rVar.f24143w = uVar;
                    }
                    uVar.b(kVar, this.f24151b);
                } else if (rVar.f24146z) {
                    rVar.T1((x.o) kVar);
                } else {
                    rVar.A.g(kVar);
                }
                return f0.f21461a;
            }
        }

        public a(tg.e<? super a> eVar) {
            super(2, eVar);
        }

        @Override // vg.a
        public final tg.e<f0> create(Object obj, tg.e<?> eVar) {
            a aVar = r.this.new a(eVar);
            aVar.f24148b = obj;
            return aVar;
        }

        @Override // eh.p
        public final Object invoke(i0 i0Var, tg.e<? super f0> eVar) {
            return ((a) create(i0Var, eVar)).invokeSuspend(f0.f21461a);
        }

        @Override // vg.a
        public final Object invokeSuspend(Object obj) {
            ug.a aVar = ug.a.f29706a;
            int i10 = this.f24147a;
            if (i10 == 0) {
                pg.q.b(obj);
                i0 i0Var = (i0) this.f24148b;
                r rVar = r.this;
                sh.f<x.k> fVarB = rVar.f24138q.b();
                C0269a c0269a = new C0269a(rVar, i0Var);
                this.f24147a = 1;
                if (fVarB.b(c0269a, this) == aVar) {
                    return aVar;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                pg.q.b(obj);
            }
            return f0.f21461a;
        }
    }

    public r(x.l lVar, boolean z10, float f10, q2 q2Var, r2 r2Var) {
        this.f24138q = lVar;
        this.f24139r = z10;
        this.f24140s = f10;
        this.f24141t = q2Var;
        this.f24142v = r2Var;
    }

    @Override // androidx.compose.ui.d.c
    public final boolean I1() {
        return false;
    }

    @Override // androidx.compose.ui.d.c
    public final void L1() {
        ph.h.c(H1(), null, null, new a(null), 3);
    }

    @Override // i2.a0
    public final void O(long j10) {
        this.f24146z = true;
        f3.d dVar = i2.k.f(this).B;
        this.f24145y = f3.q.e(j10);
        float f10 = this.f24140s;
        this.f24144x = Float.isNaN(f10) ? i.a(dVar, this.f24139r, this.f24145y) : dVar.N0(f10);
        h0<x.o> h0Var = this.A;
        Object[] objArr = h0Var.f20706a;
        int i10 = h0Var.f20707b;
        for (int i11 = 0; i11 < i10; i11++) {
            T1((x.o) objArr[i11]);
        }
        h0Var.i();
    }

    public final void T1(x.o oVar) {
        n nVar;
        if (!(oVar instanceof o.b)) {
            if (oVar instanceof o.c) {
                n nVar2 = ((d) this).C;
                if (nVar2 != null) {
                    nVar2.d();
                    return;
                }
                return;
            }
            if (!(oVar instanceof o.a) || (nVar = ((d) this).C) == null) {
                return;
            }
            nVar.d();
            return;
        }
        o.b bVar = (o.b) oVar;
        long j10 = this.f24145y;
        float f10 = this.f24144x;
        d dVar = (d) this;
        j jVarB = dVar.B;
        if (jVarB == null) {
            jVarB = ah.l.b(ah.l.c((View) i2.i.a(dVar, AndroidCompositionLocals_androidKt.f1285f)));
            dVar.B = jVarB;
        }
        n nVarA = jVarB.a(dVar);
        int iB = gh.a.b(f10);
        long jA = dVar.f24141t.a();
        dVar.f24142v.invoke();
        nVarA.b(bVar, dVar.f24139r, j10, iB, jA, 0.1f, new c(dVar));
        dVar.C = nVarA;
        i2.s.a(dVar);
    }

    @Override // i2.r
    public final void z(i2.h0 h0Var) {
        h0Var.z1();
        u uVar = this.f24143w;
        if (uVar != null) {
            uVar.a(h0Var, this.f24144x, this.f24141t.a());
        }
        d dVar = (d) this;
        w0 w0VarA = h0Var.f13901a.f24173b.a();
        n nVar = dVar.C;
        if (nVar != null) {
            long j10 = dVar.f24145y;
            int iB = gh.a.b(dVar.f24144x);
            long jA = dVar.f24141t.a();
            dVar.f24142v.invoke();
            nVar.e(j10, iB, jA, 0.1f);
            nVar.draw(c0.a(w0VarA));
        }
    }
}
