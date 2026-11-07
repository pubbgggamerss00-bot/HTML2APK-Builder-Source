package t0;

import androidx.compose.ui.d;
import g2.g1;
import x.o;

/* loaded from: classes.dex */
public final class kf extends d.c implements i2.b0 {

    /* renamed from: q, reason: collision with root package name */
    public x.l f26299q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f26300r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f26301s;

    /* renamed from: t, reason: collision with root package name */
    public s.b<Float, s.o> f26302t;

    /* renamed from: v, reason: collision with root package name */
    public s.b<Float, s.o> f26303v;

    /* renamed from: w, reason: collision with root package name */
    public float f26304w;

    /* renamed from: x, reason: collision with root package name */
    public float f26305x;

    @vg.e(c = "androidx.compose.material3.ThumbNode$measure$1", f = "Switch.kt", l = {265}, m = "invokeSuspend")
    public static final class a extends vg.i implements eh.p<ph.i0, tg.e<? super pg.f0>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f26306a;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ float f26308c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(float f10, tg.e<? super a> eVar) {
            super(2, eVar);
            this.f26308c = f10;
        }

        @Override // vg.a
        public final tg.e<pg.f0> create(Object obj, tg.e<?> eVar) {
            return kf.this.new a(this.f26308c, eVar);
        }

        @Override // eh.p
        public final Object invoke(ph.i0 i0Var, tg.e<? super pg.f0> eVar) {
            return ((a) create(i0Var, eVar)).invokeSuspend(pg.f0.f21461a);
        }

        @Override // vg.a
        public final Object invokeSuspend(Object obj) {
            ug.a aVar = ug.a.f29706a;
            int i10 = this.f26306a;
            if (i10 == 0) {
                pg.q.b(obj);
                kf kfVar = kf.this;
                s.b<Float, s.o> bVar = kfVar.f26303v;
                if (bVar != null) {
                    Float f10 = new Float(this.f26308c);
                    s.l lVar = kfVar.f26301s ? androidx.compose.material3.a.f1131f : androidx.compose.material3.a.f1132g;
                    this.f26306a = 1;
                    obj = s.b.c(bVar, f10, lVar, null, this, 12);
                    if (obj == aVar) {
                        return aVar;
                    }
                }
                return pg.f0.f21461a;
            }
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            pg.q.b(obj);
            return pg.f0.f21461a;
        }
    }

    @vg.e(c = "androidx.compose.material3.ThumbNode$measure$2", f = "Switch.kt", l = {271}, m = "invokeSuspend")
    public static final class b extends vg.i implements eh.p<ph.i0, tg.e<? super pg.f0>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f26309a;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ float f26311c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(float f10, tg.e<? super b> eVar) {
            super(2, eVar);
            this.f26311c = f10;
        }

        @Override // vg.a
        public final tg.e<pg.f0> create(Object obj, tg.e<?> eVar) {
            return kf.this.new b(this.f26311c, eVar);
        }

        @Override // eh.p
        public final Object invoke(ph.i0 i0Var, tg.e<? super pg.f0> eVar) {
            return ((b) create(i0Var, eVar)).invokeSuspend(pg.f0.f21461a);
        }

        @Override // vg.a
        public final Object invokeSuspend(Object obj) {
            ug.a aVar = ug.a.f29706a;
            int i10 = this.f26309a;
            if (i10 == 0) {
                pg.q.b(obj);
                kf kfVar = kf.this;
                s.b<Float, s.o> bVar = kfVar.f26302t;
                if (bVar != null) {
                    Float f10 = new Float(this.f26311c);
                    s.l lVar = kfVar.f26301s ? androidx.compose.material3.a.f1131f : androidx.compose.material3.a.f1132g;
                    this.f26309a = 1;
                    obj = s.b.c(bVar, f10, lVar, null, this, 12);
                    if (obj == aVar) {
                        return aVar;
                    }
                }
                return pg.f0.f21461a;
            }
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            pg.q.b(obj);
            return pg.f0.f21461a;
        }
    }

    public static final class c extends kotlin.jvm.internal.s implements eh.l<g1.a, pg.f0> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ g2.g1 f26312a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ kf f26313b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ float f26314c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(g2.g1 g1Var, kf kfVar, float f10) {
            super(1);
            this.f26312a = g1Var;
            this.f26313b = kfVar;
            this.f26314c = f10;
        }

        @Override // eh.l
        public final pg.f0 invoke(g1.a aVar) {
            g1.a aVar2 = aVar;
            s.b<Float, s.o> bVar = this.f26313b.f26302t;
            g1.a.g(aVar2, this.f26312a, (int) (bVar != null ? bVar.d().floatValue() : this.f26314c), 0);
            return pg.f0.f21461a;
        }
    }

    @vg.e(c = "androidx.compose.material3.ThumbNode$onAttach$1", f = "Switch.kt", l = {220}, m = "invokeSuspend")
    public static final class d extends vg.i implements eh.p<ph.i0, tg.e<? super pg.f0>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f26315a;

        public static final class a<T> implements sh.g {

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ kotlin.jvm.internal.e0 f26317a;

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ kf f26318b;

            public a(kotlin.jvm.internal.e0 e0Var, kf kfVar) {
                this.f26317a = e0Var;
                this.f26318b = kfVar;
            }

            @Override // sh.g
            public final Object c(Object obj, tg.e eVar) {
                x.k kVar = (x.k) obj;
                boolean z10 = kVar instanceof o.b;
                kotlin.jvm.internal.e0 e0Var = this.f26317a;
                if (z10) {
                    e0Var.f16324a++;
                } else if ((kVar instanceof o.c) || (kVar instanceof o.a)) {
                    e0Var.f16324a--;
                }
                boolean z11 = e0Var.f16324a > 0;
                kf kfVar = this.f26318b;
                if (kfVar.f26301s != z11) {
                    kfVar.f26301s = z11;
                    i2.k.f(kfVar).O();
                }
                return pg.f0.f21461a;
            }
        }

        public d(tg.e<? super d> eVar) {
            super(2, eVar);
        }

        @Override // vg.a
        public final tg.e<pg.f0> create(Object obj, tg.e<?> eVar) {
            return kf.this.new d(eVar);
        }

        @Override // eh.p
        public final Object invoke(ph.i0 i0Var, tg.e<? super pg.f0> eVar) {
            return ((d) create(i0Var, eVar)).invokeSuspend(pg.f0.f21461a);
        }

        @Override // vg.a
        public final Object invokeSuspend(Object obj) {
            ug.a aVar = ug.a.f29706a;
            int i10 = this.f26315a;
            if (i10 == 0) {
                pg.q.b(obj);
                kotlin.jvm.internal.e0 e0Var = new kotlin.jvm.internal.e0();
                kf kfVar = kf.this;
                sh.f<x.k> fVarB = kfVar.f26299q.b();
                a aVar2 = new a(e0Var, kfVar);
                this.f26315a = 1;
                if (fVarB.b(aVar2, this) == aVar) {
                    return aVar;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                pg.q.b(obj);
            }
            return pg.f0.f21461a;
        }
    }

    @Override // androidx.compose.ui.d.c
    public final boolean I1() {
        return false;
    }

    @Override // androidx.compose.ui.d.c
    public final void L1() {
        ph.h.c(H1(), null, null, new d(null), 3);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // i2.b0
    public final g2.m0 m(g2.o0 o0Var, g2.k0 k0Var, long j10) {
        float fN0 = o0Var.N0(this.f26301s ? v0.i0.f30305a : ((k0Var.z(f3.b.i(j10)) != 0 && k0Var.O(f3.b.h(j10)) != 0) || this.f26300r) ? androidx.compose.material3.a.f1126a : androidx.compose.material3.a.f1127b);
        s.b<Float, s.o> bVar = this.f26303v;
        int iFloatValue = (int) (bVar != null ? bVar.d().floatValue() : fN0);
        if (!((iFloatValue >= 0) & (iFloatValue >= 0))) {
            f3.l.a("width and height must be >= 0");
        }
        g2.g1 g1VarP = k0Var.P(f3.c.h(iFloatValue, iFloatValue, iFloatValue, iFloatValue));
        float fN02 = o0Var.N0((androidx.compose.material3.a.f1129d - o0Var.v(fN0)) / 2.0f);
        float fN03 = o0Var.N0((androidx.compose.material3.a.f1128c - androidx.compose.material3.a.f1126a) - androidx.compose.material3.a.f1130e);
        boolean z10 = this.f26301s;
        if (z10 && this.f26300r) {
            fN02 = fN03 - o0Var.N0(v0.i0.f30309e);
        } else if (z10 && !this.f26300r) {
            fN02 = o0Var.N0(v0.i0.f30309e);
        } else if (this.f26300r) {
            fN02 = fN03;
        }
        s.b<Float, s.o> bVar2 = this.f26303v;
        Float f10 = bVar2 != null ? (Float) bVar2.f23656e.getValue() : null;
        if (f10 == null || f10.floatValue() != fN0) {
            ph.h.c(H1(), null, null, new a(fN0, null), 3);
        }
        s.b<Float, s.o> bVar3 = this.f26302t;
        Float f11 = bVar3 != null ? (Float) bVar3.f23656e.getValue() : null;
        if (f11 == null || f11.floatValue() != fN02) {
            ph.h.c(H1(), null, null, new b(fN02, null), 3);
        }
        if (Float.isNaN(this.f26305x) && Float.isNaN(this.f26304w)) {
            this.f26305x = fN0;
            this.f26304w = fN02;
        }
        return o0Var.i0(iFloatValue, iFloatValue, qg.a0.f22708a, new c(g1VarP, this, fN02));
    }
}
