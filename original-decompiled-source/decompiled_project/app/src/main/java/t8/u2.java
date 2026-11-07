package t8;

@vg.e(c = "com.basitce.htmltoapk.ui.screens.ai.AiSessionScreenKt$AiSessionScreen$followReveal$1$1$1", f = "AiSessionScreen.kt", l = {142}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class u2 extends vg.i implements eh.p<ph.i0, tg.e<? super pg.f0>, Object> {

    /* renamed from: a, reason: collision with root package name */
    public int f28479a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ b0.m0 f28480b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u2(b0.m0 m0Var, tg.e<? super u2> eVar) {
        super(2, eVar);
        this.f28480b = m0Var;
    }

    @Override // vg.a
    public final tg.e<pg.f0> create(Object obj, tg.e<?> eVar) {
        return new u2(this.f28480b, eVar);
    }

    @Override // eh.p
    public final Object invoke(ph.i0 i0Var, tg.e<? super pg.f0> eVar) {
        return ((u2) create(i0Var, eVar)).invokeSuspend(pg.f0.f21461a);
    }

    @Override // vg.a
    public final Object invokeSuspend(Object obj) {
        ug.a aVar = ug.a.f29706a;
        int i10 = this.f28479a;
        if (i10 == 0) {
            pg.q.b(obj);
            b0.m0 m0Var = this.f28480b;
            int iF = m0Var.i().f() - 1;
            this.f28479a = 1;
            Object objC = m0Var.c(t.b1.f25167a, new b0.s0(m0Var, iF, 1073741823, null), this);
            if (objC != aVar) {
                objC = pg.f0.f21461a;
            }
            if (objC == aVar) {
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
