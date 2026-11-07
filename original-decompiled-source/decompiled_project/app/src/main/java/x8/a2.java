package x8;

@vg.e(c = "com.basitce.htmltoapk.ui.screens.home.HomeScreenKt$HomeScreen$1$1", f = "HomeScreen.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class a2 extends vg.i implements eh.p<ph.i0, tg.e<? super pg.f0>, Object> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ x0.n1 f32216a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ x0.n1<String> f32217b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a2(x0.n1 n1Var, x0.n1 n1Var2, tg.e eVar) {
        super(2, eVar);
        this.f32216a = n1Var;
        this.f32217b = n1Var2;
    }

    @Override // vg.a
    public final tg.e<pg.f0> create(Object obj, tg.e<?> eVar) {
        return new a2(this.f32216a, this.f32217b, eVar);
    }

    @Override // eh.p
    public final Object invoke(ph.i0 i0Var, tg.e<? super pg.f0> eVar) {
        return ((a2) create(i0Var, eVar)).invokeSuspend(pg.f0.f21461a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // vg.a
    public final Object invokeSuspend(Object obj) {
        ug.a aVar = ug.a.f29706a;
        pg.q.b(obj);
        boolean z10 = g5.f32665a;
        if (!((Boolean) this.f32216a.getValue()).booleanValue()) {
            this.f32217b.setValue(null);
        }
        return pg.f0.f21461a;
    }
}
