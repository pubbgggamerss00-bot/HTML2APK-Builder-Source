package n8;

@vg.e(c = "com.basitce.htmltoapk.data.repository.SettingsRepository$setDismissedCreateProjectHint$2", f = "SettingsRepository.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class a0 extends vg.i implements eh.p<v4.b, tg.e<? super pg.f0>, Object> {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f18369a;

    @Override // vg.a
    public final tg.e<pg.f0> create(Object obj, tg.e<?> eVar) {
        a0 a0Var = new a0(2, eVar);
        a0Var.f18369a = obj;
        return a0Var;
    }

    @Override // eh.p
    public final Object invoke(v4.b bVar, tg.e<? super pg.f0> eVar) {
        return ((a0) create(bVar, eVar)).invokeSuspend(pg.f0.f21461a);
    }

    @Override // vg.a
    public final Object invokeSuspend(Object obj) {
        ug.a aVar = ug.a.f29706a;
        pg.q.b(obj);
        ((v4.b) this.f18369a).e(m1.K, Boolean.TRUE);
        return pg.f0.f21461a;
    }
}
