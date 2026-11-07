package v;

import v.j;

@vg.e(c = "androidx.compose.foundation.gestures.DefaultScrollableState$scroll$2", f = "ScrollableState.kt", l = {198}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class i extends vg.i implements eh.p<ph.i0, tg.e<? super pg.f0>, Object> {

    /* renamed from: a, reason: collision with root package name */
    public int f29907a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ j f29908b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ t.b1 f29909c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ eh.p<b1, tg.e<? super pg.f0>, Object> f29910d;

    @vg.e(c = "androidx.compose.foundation.gestures.DefaultScrollableState$scroll$2$1", f = "ScrollableState.kt", l = {201}, m = "invokeSuspend")
    public static final class a extends vg.i implements eh.p<b1, tg.e<? super pg.f0>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f29911a;

        /* renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f29912b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ j f29913c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ eh.p<b1, tg.e<? super pg.f0>, Object> f29914d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(j jVar, eh.p<? super b1, ? super tg.e<? super pg.f0>, ? extends Object> pVar, tg.e<? super a> eVar) {
            super(2, eVar);
            this.f29913c = jVar;
            this.f29914d = pVar;
        }

        @Override // vg.a
        public final tg.e<pg.f0> create(Object obj, tg.e<?> eVar) {
            a aVar = new a(this.f29913c, this.f29914d, eVar);
            aVar.f29912b = obj;
            return aVar;
        }

        @Override // eh.p
        public final Object invoke(b1 b1Var, tg.e<? super pg.f0> eVar) {
            return ((a) create(b1Var, eVar)).invokeSuspend(pg.f0.f21461a);
        }

        @Override // vg.a
        public final Object invokeSuspend(Object obj) {
            x0.x1 x1Var = this.f29913c.f29932d;
            ug.a aVar = ug.a.f29706a;
            int i10 = this.f29911a;
            try {
                if (i10 == 0) {
                    pg.q.b(obj);
                    b1 b1Var = (b1) this.f29912b;
                    x1Var.setValue(Boolean.TRUE);
                    eh.p<b1, tg.e<? super pg.f0>, Object> pVar = this.f29914d;
                    this.f29911a = 1;
                    if (pVar.invoke(b1Var, this) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    pg.q.b(obj);
                }
                x1Var.setValue(Boolean.FALSE);
                return pg.f0.f21461a;
            } catch (Throwable th2) {
                x1Var.setValue(Boolean.FALSE);
                throw th2;
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public i(j jVar, t.b1 b1Var, eh.p<? super b1, ? super tg.e<? super pg.f0>, ? extends Object> pVar, tg.e<? super i> eVar) {
        super(2, eVar);
        this.f29908b = jVar;
        this.f29909c = b1Var;
        this.f29910d = pVar;
    }

    @Override // vg.a
    public final tg.e<pg.f0> create(Object obj, tg.e<?> eVar) {
        return new i(this.f29908b, this.f29909c, this.f29910d, eVar);
    }

    @Override // eh.p
    public final Object invoke(ph.i0 i0Var, tg.e<? super pg.f0> eVar) {
        return ((i) create(i0Var, eVar)).invokeSuspend(pg.f0.f21461a);
    }

    @Override // vg.a
    public final Object invokeSuspend(Object obj) {
        ug.a aVar = ug.a.f29706a;
        int i10 = this.f29907a;
        if (i10 == 0) {
            pg.q.b(obj);
            j jVar = this.f29908b;
            t.d1 d1Var = jVar.f29931c;
            j.a aVar2 = jVar.f29930b;
            a aVar3 = new a(jVar, this.f29910d, null);
            this.f29907a = 1;
            d1Var.getClass();
            if (ph.j0.c(new t.e1(this.f29909c, d1Var, aVar3, aVar2, null), this) == aVar) {
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
