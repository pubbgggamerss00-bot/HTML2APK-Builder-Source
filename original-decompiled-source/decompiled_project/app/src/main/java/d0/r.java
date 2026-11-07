package d0;

@vg.e(c = "androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimation$animatePlacementDelta$1", f = "LazyLayoutItemAnimation.kt", l = {141, 148}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class r extends vg.i implements eh.p<ph.i0, tg.e<? super pg.f0>, Object> {

    /* renamed from: a, reason: collision with root package name */
    public s.e0 f7258a;

    /* renamed from: b, reason: collision with root package name */
    public int f7259b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ p f7260c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ s.e0<f3.m> f7261d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f7262e;

    public static final class a extends kotlin.jvm.internal.s implements eh.l<s.b<f3.m, s.p>, pg.f0> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ p f7263a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ long f7264b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(p pVar, long j10) {
            super(1);
            this.f7263a = pVar;
            this.f7264b = j10;
        }

        @Override // eh.l
        public final pg.f0 invoke(s.b<f3.m, s.p> bVar) {
            long jC = f3.m.c(bVar.d().f8820a, this.f7264b);
            int i10 = p.f7215t;
            p pVar = this.f7263a;
            pVar.g(jC);
            pVar.f7218c.invoke();
            return pg.f0.f21461a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(p pVar, s.e0<f3.m> e0Var, long j10, tg.e<? super r> eVar) {
        super(2, eVar);
        this.f7260c = pVar;
        this.f7261d = e0Var;
        this.f7262e = j10;
    }

    @Override // vg.a
    public final tg.e<pg.f0> create(Object obj, tg.e<?> eVar) {
        return new r(this.f7260c, this.f7261d, this.f7262e, eVar);
    }

    @Override // eh.p
    public final Object invoke(ph.i0 i0Var, tg.e<? super pg.f0> eVar) {
        return ((r) create(i0Var, eVar)).invokeSuspend(pg.f0.f21461a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x0077, code lost:
    
        if (s.b.c(r7, r8, r9, r10, r13, 4) != r2) goto L30;
     */
    @Override // vg.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        s.e0 e0Var;
        p pVar = this.f7260c;
        s.b<f3.m, s.p> bVar = pVar.f7230o;
        ug.a aVar = ug.a.f29706a;
        int i10 = this.f7259b;
        long j10 = this.f7262e;
        if (i10 == 0) {
            pg.q.b(obj);
            boolean zE = bVar.e();
            e0Var = this.f7261d;
            if (zE) {
                e0Var = e0Var instanceof s.l1 ? (s.l1) e0Var : t.f7276a;
            }
            if (bVar.e()) {
                s.e0 e0Var2 = e0Var;
                long jC = f3.m.c(bVar.d().f8820a, j10);
                s.b<f3.m, s.p> bVar2 = pVar.f7230o;
                f3.m mVar = new f3.m(jC);
                a aVar2 = new a(pVar, jC);
                this.f7258a = null;
                this.f7259b = 2;
            } else {
                f3.m mVar2 = new f3.m(j10);
                this.f7258a = e0Var;
                this.f7259b = 1;
                if (bVar.f(mVar2, this) == aVar) {
                }
            }
            return aVar;
        }
        if (i10 != 1) {
            if (i10 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            pg.q.b(obj);
            int i11 = p.f7215t;
            pVar.f(false);
            pVar.f7222g = false;
            return pg.f0.f21461a;
        }
        e0Var = this.f7258a;
        pg.q.b(obj);
        pVar.f7218c.invoke();
        s.e0 e0Var22 = e0Var;
        long jC2 = f3.m.c(bVar.d().f8820a, j10);
        s.b<f3.m, s.p> bVar22 = pVar.f7230o;
        f3.m mVar3 = new f3.m(jC2);
        a aVar22 = new a(pVar, jC2);
        this.f7258a = null;
        this.f7259b = 2;
    }
}
