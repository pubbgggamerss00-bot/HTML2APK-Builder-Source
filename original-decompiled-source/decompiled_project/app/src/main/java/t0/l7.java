package t0;

@vg.e(c = "androidx.compose.material3.ModalBottomSheetKt$Scrim$dismissSheet$1$1", f = "ModalBottomSheet.kt", l = {415}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class l7 extends vg.i implements eh.p<c2.j0, tg.e<? super pg.f0>, Object> {

    /* renamed from: a, reason: collision with root package name */
    public int f26363a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f26364b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ eh.a<pg.f0> f26365c;

    public static final class a extends kotlin.jvm.internal.s implements eh.l<p1.c, pg.f0> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ eh.a<pg.f0> f26366a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(eh.a<pg.f0> aVar) {
            super(1);
            this.f26366a = aVar;
        }

        @Override // eh.l
        public final pg.f0 invoke(p1.c cVar) {
            long j10 = cVar.f21129a;
            this.f26366a.invoke();
            return pg.f0.f21461a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l7(eh.a<pg.f0> aVar, tg.e<? super l7> eVar) {
        super(2, eVar);
        this.f26365c = aVar;
    }

    @Override // vg.a
    public final tg.e<pg.f0> create(Object obj, tg.e<?> eVar) {
        l7 l7Var = new l7(this.f26365c, eVar);
        l7Var.f26364b = obj;
        return l7Var;
    }

    @Override // eh.p
    public final Object invoke(c2.j0 j0Var, tg.e<? super pg.f0> eVar) {
        return ((l7) create(j0Var, eVar)).invokeSuspend(pg.f0.f21461a);
    }

    @Override // vg.a
    public final Object invokeSuspend(Object obj) {
        ug.a aVar = ug.a.f29706a;
        int i10 = this.f26363a;
        if (i10 == 0) {
            pg.q.b(obj);
            c2.j0 j0Var = (c2.j0) this.f26364b;
            a aVar2 = new a(this.f26365c);
            this.f26363a = 1;
            if (v.t1.e(j0Var, null, aVar2, this, 7) == aVar) {
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
