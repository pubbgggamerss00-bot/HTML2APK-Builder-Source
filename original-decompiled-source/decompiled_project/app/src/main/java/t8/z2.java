package t8;

@vg.e(c = "com.basitce.htmltoapk.ui.screens.ai.AiSessionScreenKt$rememberFollowBottom$1$1", f = "AiSessionScreen.kt", l = {398}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class z2 extends vg.i implements eh.p<ph.i0, tg.e<? super pg.f0>, Object> {

    /* renamed from: a, reason: collision with root package name */
    public int f28608a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ b0.m0 f28609b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ x0.n1<Boolean> f28610c;

    public static final class a<T> implements sh.g {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ x0.n1<Boolean> f28611a;

        public a(x0.n1<Boolean> n1Var) {
            this.f28611a = n1Var;
        }

        @Override // sh.g
        public final Object c(Object obj, tg.e eVar) {
            if (((x.k) obj) instanceof x.b) {
                this.f28611a.setValue(Boolean.FALSE);
            }
            return pg.f0.f21461a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z2(b0.m0 m0Var, x0.n1<Boolean> n1Var, tg.e<? super z2> eVar) {
        super(2, eVar);
        this.f28609b = m0Var;
        this.f28610c = n1Var;
    }

    @Override // vg.a
    public final tg.e<pg.f0> create(Object obj, tg.e<?> eVar) {
        return new z2(this.f28609b, this.f28610c, eVar);
    }

    @Override // eh.p
    public final Object invoke(ph.i0 i0Var, tg.e<? super pg.f0> eVar) {
        return ((z2) create(i0Var, eVar)).invokeSuspend(pg.f0.f21461a);
    }

    @Override // vg.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        ug.a aVar = ug.a.f29706a;
        int i10 = this.f28608a;
        if (i10 != 0) {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            pg.q.b(obj);
            return pg.f0.f21461a;
        }
        pg.q.b(obj);
        sh.o0 o0Var = this.f28609b.f3387f.f31597a;
        a aVar2 = new a(this.f28610c);
        this.f28608a = 1;
        o0Var.getClass();
        sh.o0.l(o0Var, aVar2, this);
        return aVar;
    }
}
