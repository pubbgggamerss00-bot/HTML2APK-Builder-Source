package t0;

@vg.e(c = "androidx.compose.material3.ExposedDropdownMenu_androidKt$expandable$1", f = "ExposedDropdownMenu.android.kt", l = {1426}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class p3 extends vg.i implements eh.p<c2.j0, tg.e<? super pg.f0>, Object> {

    /* renamed from: a, reason: collision with root package name */
    public int f26668a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f26669b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ l3 f26670c;

    @vg.e(c = "androidx.compose.material3.ExposedDropdownMenu_androidKt$expandable$1$1", f = "ExposedDropdownMenu.android.kt", l = {1430, 1434}, m = "invokeSuspend")
    public static final class a extends vg.h implements eh.p<c2.c, tg.e<? super pg.f0>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f26671a;

        /* renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f26672b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ l3 f26673c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(l3 l3Var, tg.e eVar) {
            super(2, eVar);
            this.f26673c = l3Var;
        }

        @Override // vg.a
        public final tg.e<pg.f0> create(Object obj, tg.e<?> eVar) {
            a aVar = new a(this.f26673c, eVar);
            aVar.f26672b = obj;
            return aVar;
        }

        @Override // eh.p
        public final Object invoke(c2.c cVar, tg.e<? super pg.f0> eVar) {
            return ((a) create(cVar, eVar)).invokeSuspend(pg.f0.f21461a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:14:0x0042, code lost:
        
            if (r5 == r0) goto L15;
         */
        @Override // vg.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            c2.c cVar;
            ug.a aVar = ug.a.f29706a;
            int i10 = this.f26671a;
            if (i10 == 0) {
                pg.q.b(obj);
                cVar = (c2.c) this.f26672b;
                c2.t tVar = c2.t.f4694a;
                this.f26672b = cVar;
                this.f26671a = 1;
                obj = v.t1.c(cVar, this, 1);
                if (obj != aVar) {
                }
                return aVar;
            }
            if (i10 != 1) {
                if (i10 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                pg.q.b(obj);
                if (((c2.b0) obj) != null) {
                    this.f26673c.invoke();
                }
                return pg.f0.f21461a;
            }
            cVar = (c2.c) this.f26672b;
            pg.q.b(obj);
            c2.t tVar2 = c2.t.f4694a;
            this.f26672b = null;
            this.f26671a = 2;
            obj = v.t1.i(cVar, tVar2, this);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p3(l3 l3Var, tg.e eVar) {
        super(2, eVar);
        this.f26670c = l3Var;
    }

    @Override // vg.a
    public final tg.e<pg.f0> create(Object obj, tg.e<?> eVar) {
        p3 p3Var = new p3(this.f26670c, eVar);
        p3Var.f26669b = obj;
        return p3Var;
    }

    @Override // eh.p
    public final Object invoke(c2.j0 j0Var, tg.e<? super pg.f0> eVar) {
        return ((p3) create(j0Var, eVar)).invokeSuspend(pg.f0.f21461a);
    }

    @Override // vg.a
    public final Object invokeSuspend(Object obj) {
        ug.a aVar = ug.a.f29706a;
        int i10 = this.f26668a;
        if (i10 == 0) {
            pg.q.b(obj);
            c2.j0 j0Var = (c2.j0) this.f26669b;
            a aVar2 = new a(this.f26670c, null);
            this.f26668a = 1;
            if (v.c0.c(j0Var, aVar2, this) == aVar) {
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
