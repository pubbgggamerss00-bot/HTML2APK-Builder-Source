package s8;

@vg.e(c = "com.basitce.htmltoapk.ui.navigation.AppNavigationKt$AppNavigation$5$1", f = "AppNavigation.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class p1 extends vg.i implements eh.p<ph.i0, tg.e<? super pg.f0>, Object> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ eh.l<String, pg.f0> f24714a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f24715b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public p1(eh.l<? super String, pg.f0> lVar, String str, tg.e<? super p1> eVar) {
        super(2, eVar);
        this.f24714a = lVar;
        this.f24715b = str;
    }

    @Override // vg.a
    public final tg.e<pg.f0> create(Object obj, tg.e<?> eVar) {
        return new p1(this.f24714a, this.f24715b, eVar);
    }

    @Override // eh.p
    public final Object invoke(ph.i0 i0Var, tg.e<? super pg.f0> eVar) {
        return ((p1) create(i0Var, eVar)).invokeSuspend(pg.f0.f21461a);
    }

    @Override // vg.a
    public final Object invokeSuspend(Object obj) {
        ug.a aVar = ug.a.f29706a;
        pg.q.b(obj);
        this.f24714a.invoke(this.f24715b);
        return pg.f0.f21461a;
    }
}
