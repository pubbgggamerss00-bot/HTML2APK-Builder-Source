package u0;

@vg.e(c = "androidx.compose.material3.internal.AnchoredDraggableState$anchoredDrag$4", f = "AnchoredDraggable.kt", l = {569}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class t extends vg.i implements eh.l<tg.e<? super pg.f0>, Object> {

    /* renamed from: a, reason: collision with root package name */
    public int f29137a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ a0<Object> f29138b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f29139c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ eh.r<m, c0<Object>, Object, tg.e<? super pg.f0>, Object> f29140d;

    public static final class a extends kotlin.jvm.internal.s implements eh.a<pg.n<? extends c0<Object>, Object>> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ a0<Object> f29141a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(a0<Object> a0Var) {
            super(0);
            this.f29141a = a0Var;
        }

        @Override // eh.a
        public final pg.n<? extends c0<Object>, Object> invoke() {
            a0<Object> a0Var = this.f29141a;
            return new pg.n<>(a0Var.e(), a0Var.f28948h.getValue());
        }
    }

    @vg.e(c = "androidx.compose.material3.internal.AnchoredDraggableState$anchoredDrag$4$2", f = "AnchoredDraggable.kt", l = {571}, m = "invokeSuspend")
    public static final class b extends vg.i implements eh.p<pg.n<? extends c0<Object>, Object>, tg.e<? super pg.f0>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f29142a;

        /* renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f29143b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ eh.r<m, c0<Object>, Object, tg.e<? super pg.f0>, Object> f29144c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ a0<Object> f29145d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public b(eh.r<? super m, ? super c0<Object>, Object, ? super tg.e<? super pg.f0>, ? extends Object> rVar, a0<Object> a0Var, tg.e<? super b> eVar) {
            super(2, eVar);
            this.f29144c = rVar;
            this.f29145d = a0Var;
        }

        @Override // vg.a
        public final tg.e<pg.f0> create(Object obj, tg.e<?> eVar) {
            b bVar = new b(this.f29144c, this.f29145d, eVar);
            bVar.f29143b = obj;
            return bVar;
        }

        @Override // eh.p
        public final Object invoke(pg.n<? extends c0<Object>, Object> nVar, tg.e<? super pg.f0> eVar) {
            return ((b) create(nVar, eVar)).invokeSuspend(pg.f0.f21461a);
        }

        @Override // vg.a
        public final Object invokeSuspend(Object obj) {
            ug.a aVar = ug.a.f29706a;
            int i10 = this.f29142a;
            if (i10 == 0) {
                pg.q.b(obj);
                pg.n nVar = (pg.n) this.f29143b;
                c0<Object> c0Var = (c0) nVar.f21469a;
                Object obj2 = nVar.f21470b;
                u uVar = this.f29145d.f28954n;
                this.f29142a = 1;
                if (this.f29144c.f(uVar, c0Var, obj2, this) == aVar) {
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
    public t(a0<Object> a0Var, Object obj, eh.r<? super m, ? super c0<Object>, Object, ? super tg.e<? super pg.f0>, ? extends Object> rVar, tg.e<? super t> eVar) {
        super(1, eVar);
        this.f29138b = a0Var;
        this.f29139c = obj;
        this.f29140d = rVar;
    }

    @Override // vg.a
    public final tg.e<pg.f0> create(tg.e<?> eVar) {
        return new t(this.f29138b, this.f29139c, this.f29140d, eVar);
    }

    @Override // eh.l
    public final Object invoke(tg.e<? super pg.f0> eVar) {
        return ((t) create(eVar)).invokeSuspend(pg.f0.f21461a);
    }

    @Override // vg.a
    public final Object invokeSuspend(Object obj) {
        ug.a aVar = ug.a.f29706a;
        int i10 = this.f29137a;
        if (i10 == 0) {
            pg.q.b(obj);
            Object obj2 = this.f29139c;
            a0<Object> a0Var = this.f29138b;
            a0Var.i(obj2);
            a aVar2 = new a(a0Var);
            b bVar = new b(this.f29140d, a0Var, null);
            this.f29137a = 1;
            if (androidx.compose.material3.internal.a.a(aVar2, bVar, this) == aVar) {
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
