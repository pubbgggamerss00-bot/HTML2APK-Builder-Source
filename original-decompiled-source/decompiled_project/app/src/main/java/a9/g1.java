package a9;

@vg.e(c = "com.basitce.htmltoapk.ui.screens.premium.PremiumScreenKt$PremiumScreen$1$1", f = "PremiumScreen.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class g1 extends vg.i implements eh.p<ph.i0, tg.e<? super pg.f0>, Object> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ x0.n1<Boolean> f214a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g1(x0.n1<Boolean> n1Var, tg.e<? super g1> eVar) {
        super(2, eVar);
        this.f214a = n1Var;
    }

    @Override // vg.a
    public final tg.e<pg.f0> create(Object obj, tg.e<?> eVar) {
        return new g1(this.f214a, eVar);
    }

    @Override // eh.p
    public final Object invoke(ph.i0 i0Var, tg.e<? super pg.f0> eVar) {
        return ((g1) create(i0Var, eVar)).invokeSuspend(pg.f0.f21461a);
    }

    @Override // vg.a
    public final Object invokeSuspend(Object obj) {
        ug.a aVar = ug.a.f29706a;
        pg.q.b(obj);
        this.f214a.setValue(Boolean.TRUE);
        return pg.f0.f21461a;
    }
}
