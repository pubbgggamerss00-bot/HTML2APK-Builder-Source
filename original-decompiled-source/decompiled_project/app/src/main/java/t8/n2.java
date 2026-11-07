package t8;

@vg.e(c = "com.basitce.htmltoapk.ui.screens.ai.AiSessionScreenKt$AiSessionScreen$2$1", f = "AiSessionScreen.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class n2 extends vg.i implements eh.p<ph.i0, tg.e<? super pg.f0>, Object> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ x0.n1<Boolean> f28351a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n2(x0.n1<Boolean> n1Var, tg.e<? super n2> eVar) {
        super(2, eVar);
        this.f28351a = n1Var;
    }

    @Override // vg.a
    public final tg.e<pg.f0> create(Object obj, tg.e<?> eVar) {
        return new n2(this.f28351a, eVar);
    }

    @Override // eh.p
    public final Object invoke(ph.i0 i0Var, tg.e<? super pg.f0> eVar) {
        return ((n2) create(i0Var, eVar)).invokeSuspend(pg.f0.f21461a);
    }

    @Override // vg.a
    public final Object invokeSuspend(Object obj) {
        ug.a aVar = ug.a.f29706a;
        pg.q.b(obj);
        this.f28351a.setValue(Boolean.TRUE);
        return pg.f0.f21461a;
    }
}
