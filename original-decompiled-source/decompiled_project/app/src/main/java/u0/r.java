package u0;

@vg.e(c = "androidx.compose.material3.internal.AnchoredDraggableState$anchoredDrag$2", f = "AnchoredDraggable.kt", l = {521}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class r extends vg.i implements eh.l<tg.e<? super pg.f0>, Object> {

    /* renamed from: a, reason: collision with root package name */
    public int f29123a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ a0<Object> f29124b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ eh.q<m, c0<Object>, tg.e<? super pg.f0>, Object> f29125c;

    public static final class a extends kotlin.jvm.internal.s implements eh.a<c0<Object>> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ a0<Object> f29126a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(a0<Object> a0Var) {
            super(0);
            this.f29126a = a0Var;
        }

        @Override // eh.a
        public final c0<Object> invoke() {
            return this.f29126a.e();
        }
    }

    @vg.e(c = "androidx.compose.material3.internal.AnchoredDraggableState$anchoredDrag$2$2", f = "AnchoredDraggable.kt", l = {522}, m = "invokeSuspend")
    public static final class b extends vg.i implements eh.p<c0<Object>, tg.e<? super pg.f0>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f29127a;

        /* renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f29128b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ eh.q<m, c0<Object>, tg.e<? super pg.f0>, Object> f29129c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ a0<Object> f29130d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(eh.q qVar, tg.e eVar, a0 a0Var) {
            super(2, eVar);
            this.f29129c = qVar;
            this.f29130d = a0Var;
        }

        @Override // vg.a
        public final tg.e<pg.f0> create(Object obj, tg.e<?> eVar) {
            b bVar = new b(this.f29129c, eVar, this.f29130d);
            bVar.f29128b = obj;
            return bVar;
        }

        @Override // eh.p
        public final Object invoke(c0<Object> c0Var, tg.e<? super pg.f0> eVar) {
            return ((b) create(c0Var, eVar)).invokeSuspend(pg.f0.f21461a);
        }

        @Override // vg.a
        public final Object invokeSuspend(Object obj) {
            ug.a aVar = ug.a.f29706a;
            int i10 = this.f29127a;
            if (i10 == 0) {
                pg.q.b(obj);
                c0<Object> c0Var = (c0) this.f29128b;
                u uVar = this.f29130d.f28954n;
                this.f29127a = 1;
                if (this.f29129c.b(uVar, c0Var, this) == aVar) {
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
    public r(eh.q qVar, tg.e eVar, a0 a0Var) {
        super(1, eVar);
        this.f29124b = a0Var;
        this.f29125c = qVar;
    }

    @Override // vg.a
    public final tg.e<pg.f0> create(tg.e<?> eVar) {
        return new r(this.f29125c, eVar, this.f29124b);
    }

    @Override // eh.l
    public final Object invoke(tg.e<? super pg.f0> eVar) {
        return ((r) create(eVar)).invokeSuspend(pg.f0.f21461a);
    }

    @Override // vg.a
    public final Object invokeSuspend(Object obj) {
        ug.a aVar = ug.a.f29706a;
        int i10 = this.f29123a;
        if (i10 == 0) {
            pg.q.b(obj);
            a0<Object> a0Var = this.f29124b;
            a aVar2 = new a(a0Var);
            b bVar = new b(this.f29125c, null, a0Var);
            this.f29123a = 1;
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
