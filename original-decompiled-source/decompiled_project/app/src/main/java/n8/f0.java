package n8;

@vg.e(c = "com.basitce.htmltoapk.data.repository.SettingsRepository$setOnboardingCompleted$2", f = "SettingsRepository.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class f0 extends vg.i implements eh.p<v4.b, tg.e<? super pg.f0>, Object> {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f18439a;

    @Override // vg.a
    public final tg.e<pg.f0> create(Object obj, tg.e<?> eVar) {
        f0 f0Var = new f0(2, eVar);
        f0Var.f18439a = obj;
        return f0Var;
    }

    @Override // eh.p
    public final Object invoke(v4.b bVar, tg.e<? super pg.f0> eVar) {
        return ((f0) create(bVar, eVar)).invokeSuspend(pg.f0.f21461a);
    }

    @Override // vg.a
    public final Object invokeSuspend(Object obj) {
        ug.a aVar = ug.a.f29706a;
        pg.q.b(obj);
        ((v4.b) this.f18439a).e(m1.A, Boolean.TRUE);
        return pg.f0.f21461a;
    }
}
