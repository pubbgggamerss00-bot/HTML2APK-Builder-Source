package sh;

@vg.e(c = "kotlinx.coroutines.flow.FlowKt__ShareKt$launchSharing$1", f = "Share.kt", l = {210, 214, 215, 221}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class b0 extends vg.i implements eh.p<ph.i0, tg.e<? super pg.f0>, Object> {

    /* renamed from: a, reason: collision with root package name */
    public int f24936a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ x0 f24937b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ f<Object> f24938c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ z0 f24939d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f24940e;

    @vg.e(c = "kotlinx.coroutines.flow.FlowKt__ShareKt$launchSharing$1$1", f = "Share.kt", l = {}, m = "invokeSuspend")
    public static final class a extends vg.i implements eh.p<Integer, tg.e<? super Boolean>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public /* synthetic */ int f24941a;

        @Override // vg.a
        public final tg.e<pg.f0> create(Object obj, tg.e<?> eVar) {
            a aVar = new a(2, eVar);
            aVar.f24941a = ((Number) obj).intValue();
            return aVar;
        }

        @Override // eh.p
        public final Object invoke(Integer num, tg.e<? super Boolean> eVar) {
            return ((a) create(Integer.valueOf(num.intValue()), eVar)).invokeSuspend(pg.f0.f21461a);
        }

        @Override // vg.a
        public final Object invokeSuspend(Object obj) {
            ug.a aVar = ug.a.f29706a;
            pg.q.b(obj);
            return Boolean.valueOf(this.f24941a > 0);
        }
    }

    @vg.e(c = "kotlinx.coroutines.flow.FlowKt__ShareKt$launchSharing$1$2", f = "Share.kt", l = {223}, m = "invokeSuspend")
    public static final class b extends vg.i implements eh.p<s0, tg.e<? super pg.f0>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f24942a;

        /* renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f24943b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ f<Object> f24944c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ z0 f24945d;

        /* renamed from: e, reason: collision with root package name */
        public final /* synthetic */ Object f24946e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(f fVar, z0 z0Var, Object obj, tg.e eVar) {
            super(2, eVar);
            this.f24944c = fVar;
            this.f24945d = z0Var;
            this.f24946e = obj;
        }

        @Override // vg.a
        public final tg.e<pg.f0> create(Object obj, tg.e<?> eVar) {
            b bVar = new b(this.f24944c, this.f24945d, this.f24946e, eVar);
            bVar.f24943b = obj;
            return bVar;
        }

        @Override // eh.p
        public final Object invoke(s0 s0Var, tg.e<? super pg.f0> eVar) {
            return ((b) create(s0Var, eVar)).invokeSuspend(pg.f0.f21461a);
        }

        @Override // vg.a
        public final Object invokeSuspend(Object obj) {
            ug.a aVar = ug.a.f29706a;
            int i10 = this.f24942a;
            if (i10 == 0) {
                pg.q.b(obj);
                int iOrdinal = ((s0) this.f24943b).ordinal();
                z0 z0Var = this.f24945d;
                if (iOrdinal == 0) {
                    this.f24942a = 1;
                    if (this.f24944c.b(z0Var, this) == aVar) {
                        return aVar;
                    }
                } else if (iOrdinal != 1) {
                    if (iOrdinal != 2) {
                        throw new pg.l();
                    }
                    uh.v vVar = q0.f25075a;
                    Object obj2 = this.f24946e;
                    if (obj2 == vVar) {
                        z0Var.getClass();
                        throw new UnsupportedOperationException("MutableStateFlow.resetReplayCache is not supported");
                    }
                    z0Var.setValue(obj2);
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
    public b0(x0 x0Var, f fVar, z0 z0Var, Object obj, tg.e eVar) {
        super(2, eVar);
        this.f24937b = x0Var;
        this.f24938c = fVar;
        this.f24939d = z0Var;
        this.f24940e = obj;
    }

    @Override // vg.a
    public final tg.e<pg.f0> create(Object obj, tg.e<?> eVar) {
        return new b0(this.f24937b, this.f24938c, this.f24939d, this.f24940e, eVar);
    }

    @Override // eh.p
    public final Object invoke(ph.i0 i0Var, tg.e<? super pg.f0> eVar) {
        return ((b0) create(i0Var, eVar)).invokeSuspend(pg.f0.f21461a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0039, code lost:
    
        if (r6.b(r8, r18) == r1) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x005a, code lost:
    
        if (r6.b(r8, r18) != r1) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00b2, code lost:
    
        if (r2 == r1) goto L34;
     */
    @Override // vg.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        ug.a aVar = ug.a.f29706a;
        int i10 = this.f24936a;
        f<Object> fVar = this.f24938c;
        z0 z0Var = this.f24939d;
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 == 2) {
                    pg.q.b(obj);
                    this.f24936a = 3;
                } else if (i10 != 3 && i10 != 4) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }
            pg.q.b(obj);
            return pg.f0.f21461a;
        }
        pg.q.b(obj);
        e9.x0 x0Var = u0.f25107a;
        x0 x0Var2 = this.f24937b;
        if (x0Var2 != x0Var) {
            if (x0Var2 == u0.f25108b) {
                th.a0 a0VarI = z0Var.i();
                a aVar2 = new a(2, null);
                this.f24936a = 2;
                if (gg.a.e(a0VarI, aVar2, this) != aVar) {
                    this.f24936a = 3;
                }
            } else {
                th.a0 a0VarI2 = z0Var.i();
                v0 v0Var = new v0(x0Var2, null);
                int i11 = w.f25117a;
                rh.a aVar3 = rh.a.f23576a;
                tg.i iVar = tg.i.f28768a;
                f fVarD = gg.a.d(gg.a.d(new r(new th.k(v0Var, a0VarI2, iVar, -2, aVar3), new w0(2, null))));
                b bVar = new b(fVar, z0Var, this.f24940e, null);
                this.f24936a = 4;
                Object objB = gg.a.b(new th.k(new v(bVar, null), fVarD, iVar, -2, aVar3), 0).b(th.t.f28847a, this);
                if (objB != aVar) {
                    objB = pg.f0.f21461a;
                }
                if (objB != aVar) {
                    objB = pg.f0.f21461a;
                }
            }
            return aVar;
        }
        this.f24936a = 1;
    }
}
