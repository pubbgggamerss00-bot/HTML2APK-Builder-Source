package s;

@vg.e(c = "androidx.compose.animation.core.AnimateAsStateKt$animateValueAsState$3$1", f = "AnimateAsState.kt", l = {418}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class f extends vg.i implements eh.p<ph.i0, tg.e<? super pg.f0>, Object> {

    /* renamed from: a, reason: collision with root package name */
    public rh.j f23720a;

    /* renamed from: b, reason: collision with root package name */
    public int f23721b;

    /* renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f23722c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ rh.h<Object> f23723d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ b<Object, Object> f23724e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ x0.n1 f23725f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ x0.n1 f23726g;

    @vg.e(c = "androidx.compose.animation.core.AnimateAsStateKt$animateValueAsState$3$1$1", f = "AnimateAsState.kt", l = {427}, m = "invokeSuspend")
    public static final class a extends vg.i implements eh.p<ph.i0, tg.e<? super pg.f0>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f23727a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Object f23728b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ b<Object, Object> f23729c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ x0.n1 f23730d;

        /* renamed from: e, reason: collision with root package name */
        public final /* synthetic */ x0.n1 f23731e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Object obj, b bVar, x0.n1 n1Var, x0.n1 n1Var2, tg.e eVar) {
            super(2, eVar);
            this.f23728b = obj;
            this.f23729c = bVar;
            this.f23730d = n1Var;
            this.f23731e = n1Var2;
        }

        @Override // vg.a
        public final tg.e<pg.f0> create(Object obj, tg.e<?> eVar) {
            return new a(this.f23728b, this.f23729c, this.f23730d, this.f23731e, eVar);
        }

        @Override // eh.p
        public final Object invoke(ph.i0 i0Var, tg.e<? super pg.f0> eVar) {
            return ((a) create(i0Var, eVar)).invokeSuspend(pg.f0.f21461a);
        }

        @Override // vg.a
        public final Object invokeSuspend(Object obj) {
            a aVar;
            ug.a aVar2 = ug.a.f29706a;
            int i10 = this.f23727a;
            b<Object, Object> bVar = this.f23729c;
            if (i10 == 0) {
                pg.q.b(obj);
                if (kotlin.jvm.internal.r.a(this.f23728b, bVar.f23656e.getValue())) {
                    return pg.f0.f21461a;
                }
                l1<Float> l1Var = g.f23749a;
                l lVar = (l) this.f23730d.getValue();
                this.f23727a = 1;
                aVar = this;
                if (b.c(this.f23729c, this.f23728b, lVar, null, aVar, 12) == aVar2) {
                    return aVar2;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                pg.q.b(obj);
                aVar = this;
            }
            l1<Float> l1Var2 = g.f23749a;
            eh.l lVar2 = (eh.l) aVar.f23731e.getValue();
            if (lVar2 != null) {
                lVar2.invoke(bVar.d());
            }
            return pg.f0.f21461a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(rh.h hVar, b bVar, x0.n1 n1Var, x0.n1 n1Var2, tg.e eVar) {
        super(2, eVar);
        this.f23723d = hVar;
        this.f23724e = bVar;
        this.f23725f = n1Var;
        this.f23726g = n1Var2;
    }

    @Override // vg.a
    public final tg.e<pg.f0> create(Object obj, tg.e<?> eVar) {
        f fVar = new f(this.f23723d, this.f23724e, this.f23725f, this.f23726g, eVar);
        fVar.f23722c = obj;
        return fVar;
    }

    @Override // eh.p
    public final Object invoke(ph.i0 i0Var, tg.e<? super pg.f0> eVar) {
        return ((f) create(i0Var, eVar)).invokeSuspend(pg.f0.f21461a);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0035 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0061  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0033 -> B:12:0x0036). Please report as a decompilation issue!!! */
    @Override // vg.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        rh.j<Object> it;
        ph.i0 i0Var;
        ug.a aVar = ug.a.f29706a;
        int i10 = this.f23721b;
        rh.h<Object> hVar = this.f23723d;
        if (i10 == 0) {
            pg.q.b(obj);
            ph.i0 i0Var2 = (ph.i0) this.f23722c;
            it = hVar.iterator();
            i0Var = i0Var2;
            this.f23722c = i0Var;
            this.f23720a = it;
            this.f23721b = 1;
            obj = it.a(this);
            if (obj == aVar) {
            }
            if (((Boolean) obj).booleanValue()) {
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            it = this.f23720a;
            i0Var = (ph.i0) this.f23722c;
            pg.q.b(obj);
            if (((Boolean) obj).booleanValue()) {
                Object next = it.next();
                Object objA = rh.l.a(hVar.c());
                ph.h.c(i0Var, null, null, new a(objA == null ? next : objA, this.f23724e, this.f23725f, this.f23726g, null), 3);
                this.f23722c = i0Var;
                this.f23720a = it;
                this.f23721b = 1;
                obj = it.a(this);
                if (obj == aVar) {
                    return aVar;
                }
                if (((Boolean) obj).booleanValue()) {
                    return pg.f0.f21461a;
                }
            }
        }
    }
}
