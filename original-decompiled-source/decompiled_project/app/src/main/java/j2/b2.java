package j2;

@vg.e(c = "androidx.compose.ui.platform.ChainedPlatformTextInputInterceptor$textInputSession$2$scope$1$startInputMethod$3", f = "PlatformTextInputModifierNode.kt", l = {237}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class b2 extends vg.i implements eh.p<pg.f0, tg.e<?>, Object> {

    /* renamed from: a, reason: collision with root package name */
    public int f14652a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ d2 f14653b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ s3 f14654c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ y3 f14655d;

    public static final class a extends kotlin.jvm.internal.s implements eh.a<r3> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ d2 f14656a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(d2 d2Var) {
            super(0);
            this.f14656a = d2Var;
        }

        @Override // eh.a
        public final r3 invoke() {
            this.f14656a.getClass();
            throw null;
        }
    }

    @vg.e(c = "androidx.compose.ui.platform.ChainedPlatformTextInputInterceptor$textInputSession$2$scope$1$startInputMethod$3$2", f = "PlatformTextInputModifierNode.kt", l = {238}, m = "invokeSuspend")
    public static final class b extends vg.i implements eh.p<r3, tg.e<? super pg.f0>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f14657a;

        /* renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f14658b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ s3 f14659c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ y3 f14660d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(s3 s3Var, y3 y3Var, tg.e<? super b> eVar) {
            super(2, eVar);
            this.f14659c = s3Var;
            this.f14660d = y3Var;
        }

        @Override // vg.a
        public final tg.e<pg.f0> create(Object obj, tg.e<?> eVar) {
            b bVar = new b(this.f14659c, this.f14660d, eVar);
            bVar.f14658b = obj;
            return bVar;
        }

        @Override // eh.p
        public final Object invoke(r3 r3Var, tg.e<? super pg.f0> eVar) {
            ((b) create(r3Var, eVar)).invokeSuspend(pg.f0.f21461a);
            return ug.a.f29706a;
        }

        @Override // vg.a
        public final Object invokeSuspend(Object obj) {
            ug.a aVar = ug.a.f29706a;
            int i10 = this.f14657a;
            if (i10 == 0) {
                pg.q.b(obj);
                r3 r3Var = (r3) this.f14658b;
                this.f14657a = 1;
                if (r3Var.a() == aVar) {
                    return aVar;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                pg.q.b(obj);
            }
            throw new pg.g();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b2(d2 d2Var, s3 s3Var, y3 y3Var, tg.e<? super b2> eVar) {
        super(2, eVar);
        this.f14653b = d2Var;
        this.f14654c = s3Var;
        this.f14655d = y3Var;
    }

    @Override // vg.a
    public final tg.e<pg.f0> create(Object obj, tg.e<?> eVar) {
        return new b2(this.f14653b, this.f14654c, this.f14655d, eVar);
    }

    @Override // eh.p
    public final Object invoke(pg.f0 f0Var, tg.e<?> eVar) {
        ((b2) create(f0Var, eVar)).invokeSuspend(pg.f0.f21461a);
        return ug.a.f29706a;
    }

    @Override // vg.a
    public final Object invokeSuspend(Object obj) {
        ug.a aVar = ug.a.f29706a;
        int i10 = this.f14652a;
        if (i10 == 0) {
            pg.q.b(obj);
            sh.m0 m0VarL = bg.b.l(new a(this.f14653b));
            b bVar = new b(this.f14654c, this.f14655d, null);
            this.f14652a = 1;
            int i11 = sh.w.f25117a;
            Object objB = gg.a.b(new th.k(new sh.v(bVar, null), m0VarL, tg.i.f28768a, -2, rh.a.f23576a), 0).b(th.t.f28847a, this);
            if (objB != aVar) {
                objB = pg.f0.f21461a;
            }
            if (objB != aVar) {
                objB = pg.f0.f21461a;
            }
            if (objB == aVar) {
                return aVar;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            pg.q.b(obj);
        }
        throw new IllegalStateException("Interceptors flow should never terminate.");
    }
}
