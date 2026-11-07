package t8;

@vg.e(c = "com.basitce.htmltoapk.ui.screens.ai.AiCreateScreenKt$AiCreateScreen$2$1", f = "AiCreateScreen.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class g extends vg.i implements eh.p<ph.i0, tg.e<? super pg.f0>, Object> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ g8.u f28223a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(g8.u uVar, tg.e<? super g> eVar) {
        super(2, eVar);
        this.f28223a = uVar;
    }

    @Override // vg.a
    public final tg.e<pg.f0> create(Object obj, tg.e<?> eVar) {
        return new g(this.f28223a, eVar);
    }

    @Override // eh.p
    public final Object invoke(ph.i0 i0Var, tg.e<? super pg.f0> eVar) {
        return ((g) create(i0Var, eVar)).invokeSuspend(pg.f0.f21461a);
    }

    @Override // vg.a
    public final Object invokeSuspend(Object obj) {
        ug.a aVar = ug.a.f29706a;
        pg.q.b(obj);
        this.f28223a.f11633b.l();
        return pg.f0.f21461a;
    }
}
