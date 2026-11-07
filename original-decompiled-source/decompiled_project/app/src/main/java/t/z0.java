package t;

import android.view.View;
import androidx.compose.ui.d;
import i2.k2;

/* loaded from: classes.dex */
public final class z0 extends d.c implements i2.t, i2.r, k2, i2.o1 {
    public View A;
    public f3.d B;
    public l1 C;
    public final x0.x1 D;
    public x0.g0 E;
    public long F;
    public f3.p G;
    public rh.c H;

    /* renamed from: q, reason: collision with root package name */
    public eh.l<? super f3.d, p1.c> f25413q;

    /* renamed from: r, reason: collision with root package name */
    public eh.l<? super f3.k, pg.f0> f25414r;

    /* renamed from: s, reason: collision with root package name */
    public float f25415s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f25416t;

    /* renamed from: v, reason: collision with root package name */
    public long f25417v;

    /* renamed from: w, reason: collision with root package name */
    public float f25418w;

    /* renamed from: x, reason: collision with root package name */
    public float f25419x;

    /* renamed from: y, reason: collision with root package name */
    public boolean f25420y;

    /* renamed from: z, reason: collision with root package name */
    public m1 f25421z;

    public static final class a extends kotlin.jvm.internal.s implements eh.a<p1.c> {
        public a() {
            super(0);
        }

        @Override // eh.a
        public final p1.c invoke() {
            g2.v vVar = (g2.v) z0.this.D.getValue();
            return new p1.c(vVar != null ? vVar.Y(0L) : 9205357640488583168L);
        }
    }

    public static final class b extends kotlin.jvm.internal.s implements eh.a<p1.c> {
        public b() {
            super(0);
        }

        @Override // eh.a
        public final p1.c invoke() {
            return new p1.c(z0.this.F);
        }
    }

    @vg.e(c = "androidx.compose.foundation.MagnifierNode$onAttach$1", f = "Magnifier.android.kt", l = {382, 386}, m = "invokeSuspend")
    public static final class c extends vg.i implements eh.p<ph.i0, tg.e<? super pg.f0>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f25424a;

        public static final class a extends kotlin.jvm.internal.s implements eh.l<Long, pg.f0> {

            /* renamed from: a, reason: collision with root package name */
            public static final a f25426a = new a(1);

            @Override // eh.l
            public final /* bridge */ /* synthetic */ pg.f0 invoke(Long l10) {
                l10.longValue();
                return pg.f0.f21461a;
            }
        }

        public c(tg.e<? super c> eVar) {
            super(2, eVar);
        }

        @Override // vg.a
        public final tg.e<pg.f0> create(Object obj, tg.e<?> eVar) {
            return z0.this.new c(eVar);
        }

        @Override // eh.p
        public final Object invoke(ph.i0 i0Var, tg.e<? super pg.f0> eVar) {
            ((c) create(i0Var, eVar)).invokeSuspend(pg.f0.f21461a);
            return ug.a.f29706a;
        }

        /* JADX WARN: Code restructure failed: missing block: B:19:0x003a, code lost:
        
            if (x0.f1.b(t.z0.c.a.f25426a, r5) == r0) goto L20;
         */
        /* JADX WARN: Path cross not found for [B:13:0x0025, B:16:0x002e], limit reached: 23 */
        /* JADX WARN: Path cross not found for [B:16:0x002e, B:13:0x0025], limit reached: 23 */
        /* JADX WARN: Removed duplicated region for block: B:11:0x0021  */
        /* JADX WARN: Removed duplicated region for block: B:13:0x0025  */
        /* JADX WARN: Removed duplicated region for block: B:18:0x0032  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x0030 -> B:11:0x0021). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:19:0x003a -> B:21:0x003d). Please report as a decompilation issue!!! */
        @Override // vg.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            rh.c cVar;
            ug.a aVar = ug.a.f29706a;
            int i10 = this.f25424a;
            z0 z0Var = z0.this;
            if (i10 == 0) {
                pg.q.b(obj);
                cVar = z0Var.H;
                if (cVar != null) {
                }
                if (z0Var.C == null) {
                }
                return aVar;
            }
            if (i10 == 1) {
                pg.q.b(obj);
                if (z0Var.C == null) {
                }
                return aVar;
            }
            if (i10 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            pg.q.b(obj);
            l1 l1Var = z0Var.C;
            if (l1Var != null) {
                l1Var.c();
            }
            cVar = z0Var.H;
            if (cVar != null) {
                this.f25424a = 1;
                if (cVar.b(this) != aVar) {
                }
                return aVar;
            }
            if (z0Var.C == null) {
                this.f25424a = 2;
            } else {
                cVar = z0Var.H;
                if (cVar != null) {
                }
                if (z0Var.C == null) {
                }
            }
            return aVar;
        }
    }

    public static final class d extends kotlin.jvm.internal.s implements eh.a<pg.f0> {
        public d() {
            super(0);
        }

        @Override // eh.a
        public final pg.f0 invoke() {
            z0.this.V1();
            return pg.f0.f21461a;
        }
    }

    public z0() {
        throw null;
    }

    public z0(eh.l lVar, eh.l lVar2, float f10, boolean z10, long j10, float f11, float f12, boolean z11, m1 m1Var) {
        this.f25413q = lVar;
        this.f25414r = lVar2;
        this.f25415s = f10;
        this.f25416t = z10;
        this.f25417v = j10;
        this.f25418w = f11;
        this.f25419x = f12;
        this.f25420y = z11;
        this.f25421z = m1Var;
        this.D = new x0.x1(null, x0.q1.f31878a);
        this.F = 9205357640488583168L;
    }

    @Override // androidx.compose.ui.d.c
    public final void L1() {
        V0();
        this.H = rh.k.a(0, 7, null);
        ph.h.c(H1(), null, ph.k0.f21556d, new c(null), 1);
    }

    @Override // androidx.compose.ui.d.c
    public final void M1() {
        l1 l1Var = this.C;
        if (l1Var != null) {
            l1Var.dismiss();
        }
        this.C = null;
    }

    public final long T1() {
        if (this.E == null) {
            this.E = bg.b.d(new a());
        }
        x0.g0 g0Var = this.E;
        if (g0Var != null) {
            return ((p1.c) g0Var.getValue()).f21129a;
        }
        return 9205357640488583168L;
    }

    public final void U1() {
        l1 l1Var = this.C;
        if (l1Var != null) {
            l1Var.dismiss();
        }
        View viewA = this.A;
        if (viewA == null) {
            viewA = i2.l.a(this);
        }
        View view = viewA;
        this.A = view;
        f3.d dVar = this.B;
        if (dVar == null) {
            dVar = i2.k.f(this).B;
        }
        f3.d dVar2 = dVar;
        this.B = dVar2;
        this.C = this.f25421z.b(view, this.f25416t, this.f25417v, this.f25418w, this.f25419x, this.f25420y, dVar2, this.f25415s);
        W1();
    }

    @Override // i2.o1
    public final void V0() {
        i2.p1.a(this, new d());
    }

    public final void V1() {
        f3.d dVar = this.B;
        if (dVar == null) {
            dVar = i2.k.f(this).B;
            this.B = dVar;
        }
        long j10 = this.f25413q.invoke(dVar).f21129a;
        if ((j10 & 9223372034707292159L) == 9205357640488583168L || (9223372034707292159L & T1()) == 9205357640488583168L) {
            this.F = 9205357640488583168L;
            l1 l1Var = this.C;
            if (l1Var != null) {
                l1Var.dismiss();
                return;
            }
            return;
        }
        this.F = p1.c.g(T1(), j10);
        if (this.C == null) {
            U1();
        }
        l1 l1Var2 = this.C;
        if (l1Var2 != null) {
            l1Var2.b(this.F, 9205357640488583168L, this.f25415s);
        }
        W1();
    }

    public final void W1() {
        f3.d dVar;
        l1 l1Var = this.C;
        if (l1Var == null || (dVar = this.B) == null) {
            return;
        }
        if (f3.p.a(this.G, l1Var.a())) {
            return;
        }
        eh.l<? super f3.k, pg.f0> lVar = this.f25414r;
        if (lVar != null) {
            lVar.invoke(new f3.k(dVar.p(f3.q.e(l1Var.a()))));
        }
        this.G = new f3.p(l1Var.a());
    }

    @Override // i2.k2
    public final void X(q2.d0 d0Var) {
        d0Var.c(a1.f25160a, new b());
    }

    @Override // i2.t
    public final void g0(i2.g1 g1Var) {
        this.D.setValue(g1Var);
    }

    @Override // i2.r
    public final void z(i2.h0 h0Var) {
        h0Var.z1();
        rh.c cVar = this.H;
        if (cVar != null) {
            cVar.g(pg.f0.f21461a);
        }
    }
}
