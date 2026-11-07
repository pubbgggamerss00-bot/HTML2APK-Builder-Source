package n8;

import v4.e;

@vg.e(c = "com.basitce.htmltoapk.data.repository.SettingsRepository$setPrimaryUseCase$2", f = "SettingsRepository.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class h0 extends vg.i implements eh.p<v4.b, tg.e<? super pg.f0>, Object> {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f18462a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f18463b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h0(String str, tg.e<? super h0> eVar) {
        super(2, eVar);
        this.f18463b = str;
    }

    @Override // vg.a
    public final tg.e<pg.f0> create(Object obj, tg.e<?> eVar) {
        h0 h0Var = new h0(this.f18463b, eVar);
        h0Var.f18462a = obj;
        return h0Var;
    }

    @Override // eh.p
    public final Object invoke(v4.b bVar, tg.e<? super pg.f0> eVar) {
        return ((h0) create(bVar, eVar)).invokeSuspend(pg.f0.f21461a);
    }

    @Override // vg.a
    public final Object invokeSuspend(Object obj) {
        ug.a aVar = ug.a.f29706a;
        pg.q.b(obj);
        v4.b bVar = (v4.b) this.f18462a;
        e.a<String> aVar2 = m1.f18520v;
        bVar.e(m1.N, this.f18463b);
        return pg.f0.f21461a;
    }
}
