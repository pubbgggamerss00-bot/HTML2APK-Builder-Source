package androidx.lifecycle;

import androidx.lifecycle.l;
import java.util.concurrent.CancellationException;
import ph.s1;

@vg.e(c = "androidx.lifecycle.RepeatOnLifecycleKt$repeatOnLifecycle$3", f = "RepeatOnLifecycle.kt", l = {83}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class h0 extends vg.i implements eh.p<ph.i0, tg.e<? super pg.f0>, Object> {

    /* renamed from: a, reason: collision with root package name */
    public int f2282a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f2283b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ l f2284c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ l.b f2285d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ vg.i f2286e;

    @vg.e(c = "androidx.lifecycle.RepeatOnLifecycleKt$repeatOnLifecycle$3$1", f = "RepeatOnLifecycle.kt", l = {161}, m = "invokeSuspend")
    public static final class a extends vg.i implements eh.p<ph.i0, tg.e<? super pg.f0>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public kotlin.jvm.internal.g0 f2287a;

        /* renamed from: b, reason: collision with root package name */
        public kotlin.jvm.internal.g0 f2288b;

        /* renamed from: c, reason: collision with root package name */
        public ph.i0 f2289c;

        /* renamed from: d, reason: collision with root package name */
        public int f2290d;

        /* renamed from: e, reason: collision with root package name */
        public final /* synthetic */ l f2291e;

        /* renamed from: f, reason: collision with root package name */
        public final /* synthetic */ l.b f2292f;

        /* renamed from: g, reason: collision with root package name */
        public final /* synthetic */ ph.i0 f2293g;

        /* renamed from: h, reason: collision with root package name */
        public final /* synthetic */ vg.i f2294h;

        /* renamed from: androidx.lifecycle.h0$a$a, reason: collision with other inner class name */
        public static final class C0030a implements r {

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ l.a f2295a;

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ kotlin.jvm.internal.g0<s1> f2296b;

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ ph.i0 f2297c;

            /* renamed from: d, reason: collision with root package name */
            public final /* synthetic */ l.a f2298d;

            /* renamed from: e, reason: collision with root package name */
            public final /* synthetic */ ph.m f2299e;

            /* renamed from: f, reason: collision with root package name */
            public final /* synthetic */ yh.c f2300f;

            /* renamed from: g, reason: collision with root package name */
            public final /* synthetic */ vg.i f2301g;

            @vg.e(c = "androidx.lifecycle.RepeatOnLifecycleKt$repeatOnLifecycle$3$1$1$1$1", f = "RepeatOnLifecycle.kt", l = {166, 110}, m = "invokeSuspend")
            /* renamed from: androidx.lifecycle.h0$a$a$a, reason: collision with other inner class name */
            public static final class C0031a extends vg.i implements eh.p<ph.i0, tg.e<? super pg.f0>, Object> {

                /* renamed from: a, reason: collision with root package name */
                public yh.a f2302a;

                /* renamed from: b, reason: collision with root package name */
                public vg.i f2303b;

                /* renamed from: c, reason: collision with root package name */
                public int f2304c;

                /* renamed from: d, reason: collision with root package name */
                public final /* synthetic */ yh.c f2305d;

                /* renamed from: e, reason: collision with root package name */
                public final /* synthetic */ vg.i f2306e;

                @vg.e(c = "androidx.lifecycle.RepeatOnLifecycleKt$repeatOnLifecycle$3$1$1$1$1$1$1", f = "RepeatOnLifecycle.kt", l = {110}, m = "invokeSuspend")
                /* renamed from: androidx.lifecycle.h0$a$a$a$a, reason: collision with other inner class name */
                public static final class C0032a extends vg.i implements eh.p<ph.i0, tg.e<? super pg.f0>, Object> {

                    /* renamed from: a, reason: collision with root package name */
                    public int f2307a;

                    /* renamed from: b, reason: collision with root package name */
                    public /* synthetic */ Object f2308b;

                    /* renamed from: c, reason: collision with root package name */
                    public final /* synthetic */ eh.p<ph.i0, tg.e<? super pg.f0>, Object> f2309c;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    public C0032a(eh.p<? super ph.i0, ? super tg.e<? super pg.f0>, ? extends Object> pVar, tg.e<? super C0032a> eVar) {
                        super(2, eVar);
                        this.f2309c = pVar;
                    }

                    @Override // vg.a
                    public final tg.e<pg.f0> create(Object obj, tg.e<?> eVar) {
                        C0032a c0032a = new C0032a(this.f2309c, eVar);
                        c0032a.f2308b = obj;
                        return c0032a;
                    }

                    @Override // eh.p
                    public final Object invoke(ph.i0 i0Var, tg.e<? super pg.f0> eVar) {
                        return ((C0032a) create(i0Var, eVar)).invokeSuspend(pg.f0.f21461a);
                    }

                    @Override // vg.a
                    public final Object invokeSuspend(Object obj) {
                        ug.a aVar = ug.a.f29706a;
                        int i10 = this.f2307a;
                        if (i10 == 0) {
                            pg.q.b(obj);
                            ph.i0 i0Var = (ph.i0) this.f2308b;
                            this.f2307a = 1;
                            if (this.f2309c.invoke(i0Var, this) == aVar) {
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

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                public C0031a(yh.c cVar, eh.p pVar, tg.e eVar) {
                    super(2, eVar);
                    this.f2305d = cVar;
                    this.f2306e = (vg.i) pVar;
                }

                /* JADX WARN: Type inference failed for: r1v0, types: [eh.p, vg.i] */
                @Override // vg.a
                public final tg.e<pg.f0> create(Object obj, tg.e<?> eVar) {
                    return new C0031a(this.f2305d, this.f2306e, eVar);
                }

                @Override // eh.p
                public final Object invoke(ph.i0 i0Var, tg.e<? super pg.f0> eVar) {
                    return ((C0031a) create(i0Var, eVar)).invokeSuspend(pg.f0.f21461a);
                }

                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Type inference failed for: r1v2, types: [eh.p] */
                /* JADX WARN: Type inference failed for: r1v6 */
                /* JADX WARN: Type inference failed for: r1v7 */
                /* JADX WARN: Type inference failed for: r3v3, types: [yh.a] */
                @Override // vg.a
                public final Object invokeSuspend(Object obj) throws Throwable {
                    yh.c cVar;
                    ?? r12;
                    yh.a aVar;
                    Throwable th2;
                    ug.a aVar2 = ug.a.f29706a;
                    int i10 = this.f2304c;
                    try {
                        if (i10 == 0) {
                            pg.q.b(obj);
                            cVar = this.f2305d;
                            this.f2302a = cVar;
                            vg.i iVar = this.f2306e;
                            this.f2303b = iVar;
                            this.f2304c = 1;
                            r12 = iVar;
                            if (cVar.h(this) != aVar2) {
                            }
                            return aVar2;
                        }
                        if (i10 != 1) {
                            if (i10 != 2) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            aVar = this.f2302a;
                            try {
                                pg.q.b(obj);
                                pg.f0 f0Var = pg.f0.f21461a;
                                aVar.l(null);
                                return pg.f0.f21461a;
                            } catch (Throwable th3) {
                                th2 = th3;
                                aVar.l(null);
                                throw th2;
                            }
                        }
                        eh.p pVar = (eh.p) this.f2303b;
                        ?? r32 = this.f2302a;
                        pg.q.b(obj);
                        cVar = r32;
                        r12 = pVar;
                        C0032a c0032a = new C0032a(r12, null);
                        this.f2302a = cVar;
                        this.f2303b = null;
                        this.f2304c = 2;
                        if (ph.j0.c(c0032a, this) != aVar2) {
                            aVar = cVar;
                            pg.f0 f0Var2 = pg.f0.f21461a;
                            aVar.l(null);
                            return pg.f0.f21461a;
                        }
                        return aVar2;
                    } catch (Throwable th4) {
                        aVar = cVar;
                        th2 = th4;
                        aVar.l(null);
                        throw th2;
                    }
                }
            }

            /* JADX WARN: Multi-variable type inference failed */
            public C0030a(l.a aVar, kotlin.jvm.internal.g0 g0Var, ph.i0 i0Var, l.a aVar2, ph.m mVar, yh.c cVar, eh.p pVar) {
                this.f2295a = aVar;
                this.f2296b = g0Var;
                this.f2297c = i0Var;
                this.f2298d = aVar2;
                this.f2299e = mVar;
                this.f2300f = cVar;
                this.f2301g = (vg.i) pVar;
            }

            /* JADX WARN: Type inference failed for: r2v0, types: [eh.p, vg.i] */
            /* JADX WARN: Type inference failed for: r4v8, types: [T, ph.l2] */
            @Override // androidx.lifecycle.r
            public final void l(t tVar, l.a aVar) {
                l.a aVar2 = this.f2295a;
                kotlin.jvm.internal.g0<s1> g0Var = this.f2296b;
                if (aVar == aVar2) {
                    g0Var.f16327a = ph.h.c(this.f2297c, null, null, new C0031a(this.f2300f, this.f2301g, null), 3);
                    return;
                }
                if (aVar == this.f2298d) {
                    s1 s1Var = g0Var.f16327a;
                    if (s1Var != null) {
                        s1Var.cancel((CancellationException) null);
                    }
                    g0Var.f16327a = null;
                }
                if (aVar == l.a.ON_DESTROY) {
                    this.f2299e.resumeWith(pg.f0.f21461a);
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(l lVar, l.b bVar, ph.i0 i0Var, eh.p<? super ph.i0, ? super tg.e<? super pg.f0>, ? extends Object> pVar, tg.e<? super a> eVar) {
            super(2, eVar);
            this.f2291e = lVar;
            this.f2292f = bVar;
            this.f2293g = i0Var;
            this.f2294h = (vg.i) pVar;
        }

        /* JADX WARN: Type inference failed for: r4v0, types: [eh.p, vg.i] */
        @Override // vg.a
        public final tg.e<pg.f0> create(Object obj, tg.e<?> eVar) {
            return new a(this.f2291e, this.f2292f, this.f2293g, this.f2294h, eVar);
        }

        @Override // eh.p
        public final Object invoke(ph.i0 i0Var, tg.e<? super pg.f0> eVar) {
            return ((a) create(i0Var, eVar)).invokeSuspend(pg.f0.f21461a);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:23:0x007c  */
        /* JADX WARN: Removed duplicated region for block: B:26:0x0085  */
        /* JADX WARN: Removed duplicated region for block: B:33:0x0094  */
        /* JADX WARN: Removed duplicated region for block: B:36:0x009d  */
        /* JADX WARN: Removed duplicated region for block: B:42:? A[SYNTHETIC] */
        /* JADX WARN: Type inference failed for: r11v0, types: [eh.p, vg.i] */
        /* JADX WARN: Type inference failed for: r4v3, types: [T, androidx.lifecycle.h0$a$a, androidx.lifecycle.s] */
        @Override // vg.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) throws Throwable {
            kotlin.jvm.internal.g0 g0Var;
            Throwable th2;
            kotlin.jvm.internal.g0 g0Var2;
            s1 s1Var;
            r rVar;
            s1 s1Var2;
            r rVar2;
            ug.a aVar = ug.a.f29706a;
            int i10 = this.f2290d;
            l lVar = this.f2291e;
            if (i10 != 0) {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                g0Var = this.f2288b;
                g0Var2 = this.f2287a;
                try {
                    pg.q.b(obj);
                    s1Var2 = (s1) g0Var2.f16327a;
                    if (s1Var2 != null) {
                        s1Var2.cancel((CancellationException) null);
                    }
                    rVar2 = (r) g0Var.f16327a;
                    if (rVar2 != null) {
                        lVar.c(rVar2);
                    }
                    return pg.f0.f21461a;
                } catch (Throwable th3) {
                    th2 = th3;
                    s1Var = (s1) g0Var2.f16327a;
                    if (s1Var != null) {
                        s1Var.cancel((CancellationException) null);
                    }
                    rVar = (r) g0Var.f16327a;
                    if (rVar != null) {
                        throw th2;
                    }
                    lVar.c(rVar);
                    throw th2;
                }
            }
            pg.q.b(obj);
            if (lVar.b() == l.b.f2319a) {
                return pg.f0.f21461a;
            }
            kotlin.jvm.internal.g0 g0Var3 = new kotlin.jvm.internal.g0();
            g0Var = new kotlin.jvm.internal.g0();
            try {
                l.b bVar = this.f2292f;
                ph.i0 i0Var = this.f2293g;
                ?? r11 = this.f2294h;
                this.f2287a = g0Var3;
                this.f2288b = g0Var;
                this.f2289c = i0Var;
                this.f2290d = 1;
                ph.m mVar = new ph.m(1, ah.p.c(this));
                mVar.p();
                l.a.Companion.getClass();
                ?? c0030a = new C0030a(l.a.C0033a.b(bVar), g0Var3, i0Var, l.a.C0033a.a(bVar), mVar, new yh.c(), r11);
                g0Var.f16327a = c0030a;
                lVar.a(c0030a);
                if (mVar.o() == aVar) {
                    return aVar;
                }
                g0Var2 = g0Var3;
                s1Var2 = (s1) g0Var2.f16327a;
                if (s1Var2 != null) {
                }
                rVar2 = (r) g0Var.f16327a;
                if (rVar2 != null) {
                }
                return pg.f0.f21461a;
            } catch (Throwable th4) {
                th2 = th4;
                g0Var2 = g0Var3;
                s1Var = (s1) g0Var2.f16327a;
                if (s1Var != null) {
                }
                rVar = (r) g0Var.f16327a;
                if (rVar != null) {
                }
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public h0(l lVar, l.b bVar, eh.p<? super ph.i0, ? super tg.e<? super pg.f0>, ? extends Object> pVar, tg.e<? super h0> eVar) {
        super(2, eVar);
        this.f2284c = lVar;
        this.f2285d = bVar;
        this.f2286e = (vg.i) pVar;
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [eh.p, vg.i] */
    @Override // vg.a
    public final tg.e<pg.f0> create(Object obj, tg.e<?> eVar) {
        h0 h0Var = new h0(this.f2284c, this.f2285d, this.f2286e, eVar);
        h0Var.f2283b = obj;
        return h0Var;
    }

    @Override // eh.p
    public final Object invoke(ph.i0 i0Var, tg.e<? super pg.f0> eVar) {
        return ((h0) create(i0Var, eVar)).invokeSuspend(pg.f0.f21461a);
    }

    /* JADX WARN: Type inference failed for: r7v0, types: [eh.p, vg.i] */
    @Override // vg.a
    public final Object invokeSuspend(Object obj) {
        ug.a aVar = ug.a.f29706a;
        int i10 = this.f2282a;
        if (i10 == 0) {
            pg.q.b(obj);
            ph.i0 i0Var = (ph.i0) this.f2283b;
            wh.c cVar = ph.z0.f21632a;
            qh.g gVarH0 = uh.o.f29764a.H0();
            a aVar2 = new a(this.f2284c, this.f2285d, i0Var, this.f2286e, null);
            this.f2282a = 1;
            if (ph.h.e(gVarH0, aVar2, this) == aVar) {
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
