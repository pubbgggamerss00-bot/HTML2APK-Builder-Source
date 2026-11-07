package d0;

import androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimator;
import com.yalantis.ucrop.view.CropImageView;
import org.bouncycastle.asn1.cmc.BodyPartID;
import s.p2;

/* loaded from: classes.dex */
public final class p {

    /* renamed from: s, reason: collision with root package name */
    public static final long f7214s;

    /* renamed from: t, reason: collision with root package name */
    public static final /* synthetic */ int f7215t = 0;

    /* renamed from: a, reason: collision with root package name */
    public final ph.i0 f7216a;

    /* renamed from: b, reason: collision with root package name */
    public final q1.k1 f7217b;

    /* renamed from: c, reason: collision with root package name */
    public final LazyLayoutItemAnimator.b.a f7218c;

    /* renamed from: d, reason: collision with root package name */
    public s.e0<Float> f7219d;

    /* renamed from: e, reason: collision with root package name */
    public s.e0<f3.m> f7220e;

    /* renamed from: f, reason: collision with root package name */
    public s.e0<Float> f7221f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f7222g;

    /* renamed from: h, reason: collision with root package name */
    public final x0.x1 f7223h;

    /* renamed from: i, reason: collision with root package name */
    public final x0.x1 f7224i;

    /* renamed from: j, reason: collision with root package name */
    public final x0.x1 f7225j;

    /* renamed from: k, reason: collision with root package name */
    public final x0.x1 f7226k;

    /* renamed from: l, reason: collision with root package name */
    public long f7227l;

    /* renamed from: m, reason: collision with root package name */
    public long f7228m;

    /* renamed from: n, reason: collision with root package name */
    public t1.d f7229n;

    /* renamed from: o, reason: collision with root package name */
    public final s.b<f3.m, s.p> f7230o;

    /* renamed from: p, reason: collision with root package name */
    public final s.b<Float, s.o> f7231p;

    /* renamed from: q, reason: collision with root package name */
    public final x0.x1 f7232q;

    /* renamed from: r, reason: collision with root package name */
    public long f7233r;

    @vg.e(c = "androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimation$animateAppearance$1", f = "LazyLayoutItemAnimation.kt", l = {171}, m = "invokeSuspend")
    public static final class a extends vg.i implements eh.p<ph.i0, tg.e<? super pg.f0>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f7234a;

        public a(tg.e<? super a> eVar) {
            super(2, eVar);
        }

        @Override // vg.a
        public final tg.e<pg.f0> create(Object obj, tg.e<?> eVar) {
            return p.this.new a(eVar);
        }

        @Override // eh.p
        public final Object invoke(ph.i0 i0Var, tg.e<? super pg.f0> eVar) {
            return ((a) create(i0Var, eVar)).invokeSuspend(pg.f0.f21461a);
        }

        @Override // vg.a
        public final Object invokeSuspend(Object obj) {
            ug.a aVar = ug.a.f29706a;
            int i10 = this.f7234a;
            if (i10 == 0) {
                pg.q.b(obj);
                s.b<Float, s.o> bVar = p.this.f7231p;
                Float f10 = new Float(1.0f);
                this.f7234a = 1;
                if (bVar.f(f10, this) == aVar) {
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

    @vg.e(c = "androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimation$animateAppearance$2", f = "LazyLayoutItemAnimation.kt", l = {183, 185}, m = "invokeSuspend")
    public static final class b extends vg.i implements eh.p<ph.i0, tg.e<? super pg.f0>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f7236a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ boolean f7237b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ p f7238c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ s.e0<Float> f7239d;

        /* renamed from: e, reason: collision with root package name */
        public final /* synthetic */ t1.d f7240e;

        public static final class a extends kotlin.jvm.internal.s implements eh.l<s.b<Float, s.o>, pg.f0> {

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ t1.d f7241a;

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ p f7242b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(t1.d dVar, p pVar) {
                super(1);
                this.f7241a = dVar;
                this.f7242b = pVar;
            }

            @Override // eh.l
            public final pg.f0 invoke(s.b<Float, s.o> bVar) {
                this.f7241a.f(bVar.d().floatValue());
                this.f7242b.f7218c.invoke();
                return pg.f0.f21461a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(boolean z10, p pVar, s.e0<Float> e0Var, t1.d dVar, tg.e<? super b> eVar) {
            super(2, eVar);
            this.f7237b = z10;
            this.f7238c = pVar;
            this.f7239d = e0Var;
            this.f7240e = dVar;
        }

        @Override // vg.a
        public final tg.e<pg.f0> create(Object obj, tg.e<?> eVar) {
            return new b(this.f7237b, this.f7238c, this.f7239d, this.f7240e, eVar);
        }

        @Override // eh.p
        public final Object invoke(ph.i0 i0Var, tg.e<? super pg.f0> eVar) {
            return ((b) create(i0Var, eVar)).invokeSuspend(pg.f0.f21461a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:21:0x0054, code lost:
        
            if (s.b.c(r6, r7, r8, r9, r12, 4) == r0) goto L22;
         */
        @Override // vg.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            ug.a aVar = ug.a.f29706a;
            int i10 = this.f7236a;
            p pVar = this.f7238c;
            try {
                if (i10 == 0) {
                    pg.q.b(obj);
                    if (this.f7237b) {
                        s.b<Float, s.o> bVar = pVar.f7231p;
                        Float f10 = new Float(CropImageView.DEFAULT_ASPECT_RATIO);
                        this.f7236a = 1;
                        if (bVar.f(f10, this) == aVar) {
                        }
                        return aVar;
                    }
                } else {
                    if (i10 != 1) {
                        if (i10 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        pg.q.b(obj);
                        int i11 = p.f7215t;
                        pVar.d(false);
                        return pg.f0.f21461a;
                    }
                    pg.q.b(obj);
                }
                s.b<Float, s.o> bVar2 = pVar.f7231p;
                Float f11 = new Float(1.0f);
                s.e0<Float> e0Var = this.f7239d;
                a aVar2 = new a(this.f7240e, pVar);
                this.f7236a = 2;
            } catch (Throwable th2) {
                int i12 = p.f7215t;
                pVar.d(false);
                throw th2;
            }
        }
    }

    @vg.e(c = "androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimation$release$1", f = "LazyLayoutItemAnimation.kt", l = {218}, m = "invokeSuspend")
    public static final class c extends vg.i implements eh.p<ph.i0, tg.e<? super pg.f0>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f7243a;

        public c(tg.e<? super c> eVar) {
            super(2, eVar);
        }

        @Override // vg.a
        public final tg.e<pg.f0> create(Object obj, tg.e<?> eVar) {
            return p.this.new c(eVar);
        }

        @Override // eh.p
        public final Object invoke(ph.i0 i0Var, tg.e<? super pg.f0> eVar) {
            return ((c) create(i0Var, eVar)).invokeSuspend(pg.f0.f21461a);
        }

        @Override // vg.a
        public final Object invokeSuspend(Object obj) {
            ug.a aVar = ug.a.f29706a;
            int i10 = this.f7243a;
            if (i10 == 0) {
                pg.q.b(obj);
                s.b<f3.m, s.p> bVar = p.this.f7230o;
                this.f7243a = 1;
                if (bVar.g(this) == aVar) {
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

    @vg.e(c = "androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimation$release$2", f = "LazyLayoutItemAnimation.kt", l = {222}, m = "invokeSuspend")
    public static final class d extends vg.i implements eh.p<ph.i0, tg.e<? super pg.f0>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f7245a;

        public d(tg.e<? super d> eVar) {
            super(2, eVar);
        }

        @Override // vg.a
        public final tg.e<pg.f0> create(Object obj, tg.e<?> eVar) {
            return p.this.new d(eVar);
        }

        @Override // eh.p
        public final Object invoke(ph.i0 i0Var, tg.e<? super pg.f0> eVar) {
            return ((d) create(i0Var, eVar)).invokeSuspend(pg.f0.f21461a);
        }

        @Override // vg.a
        public final Object invokeSuspend(Object obj) {
            ug.a aVar = ug.a.f29706a;
            int i10 = this.f7245a;
            if (i10 == 0) {
                pg.q.b(obj);
                s.b<Float, s.o> bVar = p.this.f7231p;
                this.f7245a = 1;
                if (bVar.g(this) == aVar) {
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

    @vg.e(c = "androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimation$release$3", f = "LazyLayoutItemAnimation.kt", l = {226}, m = "invokeSuspend")
    public static final class e extends vg.i implements eh.p<ph.i0, tg.e<? super pg.f0>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f7247a;

        public e(tg.e<? super e> eVar) {
            super(2, eVar);
        }

        @Override // vg.a
        public final tg.e<pg.f0> create(Object obj, tg.e<?> eVar) {
            return p.this.new e(eVar);
        }

        @Override // eh.p
        public final Object invoke(ph.i0 i0Var, tg.e<? super pg.f0> eVar) {
            return ((e) create(i0Var, eVar)).invokeSuspend(pg.f0.f21461a);
        }

        @Override // vg.a
        public final Object invokeSuspend(Object obj) {
            ug.a aVar = ug.a.f29706a;
            int i10 = this.f7247a;
            if (i10 == 0) {
                pg.q.b(obj);
                s.b<Float, s.o> bVar = p.this.f7231p;
                this.f7247a = 1;
                if (bVar.g(this) == aVar) {
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

    static {
        long j10 = Integer.MAX_VALUE;
        f7214s = (j10 & BodyPartID.bodyIdMax) | (j10 << 32);
    }

    public p(ph.i0 i0Var, q1.k1 k1Var, LazyLayoutItemAnimator.b.a aVar) {
        this.f7216a = i0Var;
        this.f7217b = k1Var;
        this.f7218c = aVar;
        Boolean bool = Boolean.FALSE;
        this.f7223h = bg.b.h(bool);
        this.f7224i = bg.b.h(bool);
        this.f7225j = bg.b.h(bool);
        this.f7226k = bg.b.h(bool);
        long j10 = f7214s;
        this.f7227l = j10;
        this.f7228m = 0L;
        Object obj = null;
        this.f7229n = k1Var != null ? k1Var.b() : null;
        int i10 = 12;
        this.f7230o = new s.b<>(new f3.m(0L), p2.f23874g, obj, i10);
        this.f7231p = new s.b<>(Float.valueOf(1.0f), p2.f23868a, obj, i10);
        this.f7232q = bg.b.h(new f3.m(0L));
        this.f7233r = j10;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void a() {
        t1.d dVar = this.f7229n;
        s.e0<Float> e0Var = this.f7219d;
        boolean zBooleanValue = ((Boolean) this.f7224i.getValue()).booleanValue();
        ph.i0 i0Var = this.f7216a;
        if (zBooleanValue || e0Var == null || dVar == null) {
            if (b()) {
                if (dVar != null) {
                    dVar.f(1.0f);
                }
                ph.h.c(i0Var, null, null, new a(null), 3);
                return;
            }
            return;
        }
        d(true);
        boolean zB = b();
        boolean z10 = !zB;
        if (!zB) {
            dVar.f(CropImageView.DEFAULT_ASPECT_RATIO);
        }
        ph.h.c(i0Var, null, null, new b(z10, this, e0Var, dVar, null), 3);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean b() {
        return ((Boolean) this.f7225j.getValue()).booleanValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void c() {
        q1.k1 k1Var;
        boolean zBooleanValue = ((Boolean) this.f7223h.getValue()).booleanValue();
        ph.i0 i0Var = this.f7216a;
        if (zBooleanValue) {
            f(false);
            ph.h.c(i0Var, null, null, new c(null), 3);
        }
        if (((Boolean) this.f7224i.getValue()).booleanValue()) {
            d(false);
            ph.h.c(i0Var, null, null, new d(null), 3);
        }
        if (b()) {
            e(false);
            ph.h.c(i0Var, null, null, new e(null), 3);
        }
        this.f7222g = false;
        g(0L);
        this.f7227l = f7214s;
        t1.d dVar = this.f7229n;
        if (dVar != null && (k1Var = this.f7217b) != null) {
            k1Var.a(dVar);
        }
        this.f7229n = null;
        this.f7219d = null;
        this.f7221f = null;
        this.f7220e = null;
    }

    public final void d(boolean z10) {
        this.f7224i.setValue(Boolean.valueOf(z10));
    }

    public final void e(boolean z10) {
        this.f7225j.setValue(Boolean.valueOf(z10));
    }

    public final void f(boolean z10) {
        this.f7223h.setValue(Boolean.valueOf(z10));
    }

    public final void g(long j10) {
        this.f7232q.setValue(new f3.m(j10));
    }
}
