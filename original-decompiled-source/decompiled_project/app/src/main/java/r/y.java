package r;

@vg.e(c = "androidx.compose.animation.AnimatedVisibilityKt$AnimatedEnterExitImpl$shouldDisposeAfterExit$2$1", f = "AnimatedVisibility.kt", l = {739}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class y extends vg.i implements eh.p<x0.c2<Boolean>, tg.e<? super pg.f0>, Object> {

    /* renamed from: a, reason: collision with root package name */
    public int f22992a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f22993b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ s.y1<u0> f22994c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ x0.n1 f22995d;

    public static final class a extends kotlin.jvm.internal.s implements eh.a<Boolean> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ s.y1<u0> f22996a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(s.y1<u0> y1Var) {
            super(0);
            this.f22996a = y1Var;
        }

        @Override // eh.a
        public final Boolean invoke() {
            s.y1<u0> y1Var = this.f22996a;
            Object objV = y1Var.f24001a.V();
            u0 u0Var = u0.f22957c;
            return Boolean.valueOf(objV == u0Var && y1Var.f24004d.getValue() == u0Var);
        }
    }

    public static final class b<T> implements sh.g {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ x0.c2<Boolean> f22997a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ s.y1<u0> f22998b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ x0.n1 f22999c;

        public b(x0.c2 c2Var, s.y1 y1Var, x0.n1 n1Var) {
            this.f22997a = c2Var;
            this.f22998b = y1Var;
            this.f22999c = n1Var;
        }

        @Override // sh.g
        public final Object c(Object obj, tg.e eVar) {
            boolean zBooleanValue;
            if (((Boolean) obj).booleanValue()) {
                eh.p pVar = (eh.p) this.f22999c.getValue();
                s.y1<u0> y1Var = this.f22998b;
                zBooleanValue = ((Boolean) pVar.invoke(y1Var.f24001a.V(), y1Var.f24004d.getValue())).booleanValue();
            } else {
                zBooleanValue = false;
            }
            this.f22997a.setValue(Boolean.valueOf(zBooleanValue));
            return pg.f0.f21461a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(s.y1 y1Var, x0.n1 n1Var, tg.e eVar) {
        super(2, eVar);
        this.f22994c = y1Var;
        this.f22995d = n1Var;
    }

    @Override // vg.a
    public final tg.e<pg.f0> create(Object obj, tg.e<?> eVar) {
        y yVar = new y(this.f22994c, this.f22995d, eVar);
        yVar.f22993b = obj;
        return yVar;
    }

    @Override // eh.p
    public final Object invoke(x0.c2<Boolean> c2Var, tg.e<? super pg.f0> eVar) {
        return ((y) create(c2Var, eVar)).invokeSuspend(pg.f0.f21461a);
    }

    @Override // vg.a
    public final Object invokeSuspend(Object obj) {
        ug.a aVar = ug.a.f29706a;
        int i10 = this.f22992a;
        if (i10 == 0) {
            pg.q.b(obj);
            x0.c2 c2Var = (x0.c2) this.f22993b;
            s.y1<u0> y1Var = this.f22994c;
            sh.m0 m0VarL = bg.b.l(new a(y1Var));
            b bVar = new b(c2Var, y1Var, this.f22995d);
            this.f22992a = 1;
            if (m0VarL.b(bVar, this) == aVar) {
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
