package n8;

import v4.e;

@vg.e(c = "com.basitce.htmltoapk.data.repository.SettingsRepository$setAppTheme$2", f = "SettingsRepository.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class z extends vg.i implements eh.p<v4.b, tg.e<? super pg.f0>, Object> {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f18632a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ k9.a f18633b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(k9.a aVar, tg.e<? super z> eVar) {
        super(2, eVar);
        this.f18633b = aVar;
    }

    @Override // vg.a
    public final tg.e<pg.f0> create(Object obj, tg.e<?> eVar) {
        z zVar = new z(this.f18633b, eVar);
        zVar.f18632a = obj;
        return zVar;
    }

    @Override // eh.p
    public final Object invoke(v4.b bVar, tg.e<? super pg.f0> eVar) {
        return ((z) create(bVar, eVar)).invokeSuspend(pg.f0.f21461a);
    }

    @Override // vg.a
    public final Object invokeSuspend(Object obj) {
        ug.a aVar = ug.a.f29706a;
        pg.q.b(obj);
        v4.b bVar = (v4.b) this.f18632a;
        e.a<String> aVar2 = m1.f18520v;
        bVar.e(m1.f18522x, this.f18633b.f16175a);
        return pg.f0.f21461a;
    }
}
