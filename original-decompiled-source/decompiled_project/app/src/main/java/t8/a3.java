package t8;

@vg.e(c = "com.basitce.htmltoapk.ui.screens.ai.AiSessionScreenKt$rememberFollowBottom$2$1", f = "AiSessionScreen.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class a3 extends vg.i implements eh.p<ph.i0, tg.e<? super pg.f0>, Object> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ b0.m0 f28086a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ x0.n1<Boolean> f28087b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a3(b0.m0 m0Var, x0.n1<Boolean> n1Var, tg.e<? super a3> eVar) {
        super(2, eVar);
        this.f28086a = m0Var;
        this.f28087b = n1Var;
    }

    @Override // vg.a
    public final tg.e<pg.f0> create(Object obj, tg.e<?> eVar) {
        return new a3(this.f28086a, this.f28087b, eVar);
    }

    @Override // eh.p
    public final Object invoke(ph.i0 i0Var, tg.e<? super pg.f0> eVar) {
        return ((a3) create(i0Var, eVar)).invokeSuspend(pg.f0.f21461a);
    }

    @Override // vg.a
    public final Object invokeSuspend(Object obj) {
        ug.a aVar = ug.a.f29706a;
        pg.q.b(obj);
        b0.m0 m0Var = this.f28086a;
        if (!m0Var.f3389h.a() && !m0Var.d()) {
            this.f28087b.setValue(Boolean.TRUE);
        }
        return pg.f0.f21461a;
    }
}
