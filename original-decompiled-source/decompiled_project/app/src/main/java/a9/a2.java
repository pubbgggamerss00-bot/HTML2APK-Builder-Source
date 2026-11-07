package a9;

@vg.e(c = "com.basitce.htmltoapk.ui.screens.premium.PremiumViewModel$restorePurchases$1$1", f = "PremiumViewModel.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class a2 extends vg.i implements eh.p<ph.i0, tg.e<? super pg.f0>, Object> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ t1 f129a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f130b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f131c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a2(t1 t1Var, boolean z10, String str, tg.e eVar) {
        super(2, eVar);
        this.f129a = t1Var;
        this.f130b = z10;
        this.f131c = str;
    }

    @Override // vg.a
    public final tg.e<pg.f0> create(Object obj, tg.e<?> eVar) {
        return new a2(this.f129a, this.f130b, this.f131c, eVar);
    }

    @Override // eh.p
    public final Object invoke(ph.i0 i0Var, tg.e<? super pg.f0> eVar) {
        return ((a2) create(i0Var, eVar)).invokeSuspend(pg.f0.f21461a);
    }

    @Override // vg.a
    public final Object invokeSuspend(Object obj) {
        ug.a aVar = ug.a.f29706a;
        pg.q.b(obj);
        this.f129a.invoke(Boolean.valueOf(this.f130b), this.f131c);
        return pg.f0.f21461a;
    }
}
