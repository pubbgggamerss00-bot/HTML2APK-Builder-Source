package n8;

import v4.e;

@vg.e(c = "com.basitce.htmltoapk.data.repository.SettingsRepository$setOfferDismissedAt$2", f = "SettingsRepository.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class e0 extends vg.i implements eh.p<v4.b, tg.e<? super pg.f0>, Object> {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f18427a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ long f18428b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e0(long j10, tg.e<? super e0> eVar) {
        super(2, eVar);
        this.f18428b = j10;
    }

    @Override // vg.a
    public final tg.e<pg.f0> create(Object obj, tg.e<?> eVar) {
        e0 e0Var = new e0(this.f18428b, eVar);
        e0Var.f18427a = obj;
        return e0Var;
    }

    @Override // eh.p
    public final Object invoke(v4.b bVar, tg.e<? super pg.f0> eVar) {
        return ((e0) create(bVar, eVar)).invokeSuspend(pg.f0.f21461a);
    }

    @Override // vg.a
    public final Object invokeSuspend(Object obj) {
        ug.a aVar = ug.a.f29706a;
        pg.q.b(obj);
        v4.b bVar = (v4.b) this.f18427a;
        e.a<String> aVar2 = m1.f18520v;
        bVar.e(m1.E, new Long(this.f18428b));
        return pg.f0.f21461a;
    }
}
