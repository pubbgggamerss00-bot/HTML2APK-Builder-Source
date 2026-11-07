package s;

@vg.e(c = "androidx.compose.animation.core.SeekableTransitionState$seekTo$3", f = "Transition.kt", l = {488}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class f1 extends vg.i implements eh.l<tg.e<? super pg.f0>, Object> {

    /* renamed from: a, reason: collision with root package name */
    public int f23732a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f23733b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f23734c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ z0<Object> f23735d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ y1<Object> f23736e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ float f23737f;

    @vg.e(c = "androidx.compose.animation.core.SeekableTransitionState$seekTo$3$1", f = "Transition.kt", l = {510}, m = "invokeSuspend")
    public static final class a extends vg.i implements eh.p<ph.i0, tg.e<? super pg.f0>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f23738a;

        /* renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f23739b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ Object f23740c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ Object f23741d;

        /* renamed from: e, reason: collision with root package name */
        public final /* synthetic */ z0<Object> f23742e;

        /* renamed from: f, reason: collision with root package name */
        public final /* synthetic */ y1<Object> f23743f;

        /* renamed from: g, reason: collision with root package name */
        public final /* synthetic */ float f23744g;

        @vg.e(c = "androidx.compose.animation.core.SeekableTransitionState$seekTo$3$1$1", f = "Transition.kt", l = {506}, m = "invokeSuspend")
        /* renamed from: s.f1$a$a, reason: collision with other inner class name */
        public static final class C0266a extends vg.i implements eh.p<ph.i0, tg.e<? super pg.f0>, Object> {

            /* renamed from: a, reason: collision with root package name */
            public int f23745a;

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ z0<Object> f23746b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0266a(z0<Object> z0Var, tg.e<? super C0266a> eVar) {
                super(2, eVar);
                this.f23746b = z0Var;
            }

            @Override // vg.a
            public final tg.e<pg.f0> create(Object obj, tg.e<?> eVar) {
                return new C0266a(this.f23746b, eVar);
            }

            @Override // eh.p
            public final Object invoke(ph.i0 i0Var, tg.e<? super pg.f0> eVar) {
                return ((C0266a) create(i0Var, eVar)).invokeSuspend(pg.f0.f21461a);
            }

            @Override // vg.a
            public final Object invokeSuspend(Object obj) {
                ug.a aVar = ug.a.f29706a;
                int i10 = this.f23745a;
                if (i10 == 0) {
                    pg.q.b(obj);
                    this.f23745a = 1;
                    if (z0.e0(this.f23746b, this) == aVar) {
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
        public a(Object obj, Object obj2, z0<Object> z0Var, y1<Object> y1Var, float f10, tg.e<? super a> eVar) {
            super(2, eVar);
            this.f23740c = obj;
            this.f23741d = obj2;
            this.f23742e = z0Var;
            this.f23743f = y1Var;
            this.f23744g = f10;
        }

        @Override // vg.a
        public final tg.e<pg.f0> create(Object obj, tg.e<?> eVar) {
            a aVar = new a(this.f23740c, this.f23741d, this.f23742e, this.f23743f, this.f23744g, eVar);
            aVar.f23739b = obj;
            return aVar;
        }

        @Override // eh.p
        public final Object invoke(ph.i0 i0Var, tg.e<? super pg.f0> eVar) {
            return ((a) create(i0Var, eVar)).invokeSuspend(pg.f0.f21461a);
        }

        @Override // vg.a
        public final Object invokeSuspend(Object obj) {
            ug.a aVar = ug.a.f29706a;
            int i10 = this.f23738a;
            z0<Object> z0Var = this.f23742e;
            if (i10 == 0) {
                pg.q.b(obj);
                ph.i0 i0Var = (ph.i0) this.f23739b;
                Object obj2 = this.f23740c;
                Object obj3 = this.f23741d;
                if (kotlin.jvm.internal.r.a(obj2, obj3)) {
                    z0Var.f24060p = null;
                    if (kotlin.jvm.internal.r.a(z0Var.f24049c.getValue(), obj2)) {
                        return pg.f0.f21461a;
                    }
                } else {
                    z0.c0(z0Var);
                }
                boolean zA = kotlin.jvm.internal.r.a(obj2, obj3);
                float f10 = this.f23744g;
                if (!zA) {
                    y1<Object> y1Var = this.f23743f;
                    y1Var.p(obj2);
                    y1Var.n(0L);
                    z0Var.f24048b.setValue(obj2);
                    y1Var.j(f10);
                }
                o oVar = z0.f24046t;
                z0Var.l0(f10);
                if (z0Var.f24059n.e()) {
                    ph.h.c(i0Var, null, null, new C0266a(z0Var, null), 3);
                } else {
                    z0Var.f24058m = Long.MIN_VALUE;
                }
                this.f23738a = 1;
                if (z0.g0(z0Var, this) == aVar) {
                    return aVar;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                pg.q.b(obj);
            }
            o oVar2 = z0.f24046t;
            z0Var.k0();
            return pg.f0.f21461a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f1(Object obj, Object obj2, z0<Object> z0Var, y1<Object> y1Var, float f10, tg.e<? super f1> eVar) {
        super(1, eVar);
        this.f23733b = obj;
        this.f23734c = obj2;
        this.f23735d = z0Var;
        this.f23736e = y1Var;
        this.f23737f = f10;
    }

    @Override // vg.a
    public final tg.e<pg.f0> create(tg.e<?> eVar) {
        return new f1(this.f23733b, this.f23734c, this.f23735d, this.f23736e, this.f23737f, eVar);
    }

    @Override // eh.l
    public final Object invoke(tg.e<? super pg.f0> eVar) {
        return ((f1) create(eVar)).invokeSuspend(pg.f0.f21461a);
    }

    @Override // vg.a
    public final Object invokeSuspend(Object obj) {
        ug.a aVar = ug.a.f29706a;
        int i10 = this.f23732a;
        if (i10 == 0) {
            pg.q.b(obj);
            a aVar2 = new a(this.f23733b, this.f23734c, this.f23735d, this.f23736e, this.f23737f, null);
            this.f23732a = 1;
            if (ph.j0.c(aVar2, this) == aVar) {
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
