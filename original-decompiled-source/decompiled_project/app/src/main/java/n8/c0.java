package n8;

import v4.e;

@vg.e(c = "com.basitce.htmltoapk.data.repository.SettingsRepository$setLanguage$2", f = "SettingsRepository.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class c0 extends vg.i implements eh.p<v4.b, tg.e<? super pg.f0>, Object> {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f18401a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f18402b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c0(String str, tg.e<? super c0> eVar) {
        super(2, eVar);
        this.f18402b = str;
    }

    @Override // vg.a
    public final tg.e<pg.f0> create(Object obj, tg.e<?> eVar) {
        c0 c0Var = new c0(this.f18402b, eVar);
        c0Var.f18401a = obj;
        return c0Var;
    }

    @Override // eh.p
    public final Object invoke(v4.b bVar, tg.e<? super pg.f0> eVar) {
        return ((c0) create(bVar, eVar)).invokeSuspend(pg.f0.f21461a);
    }

    @Override // vg.a
    public final Object invokeSuspend(Object obj) {
        ug.a aVar = ug.a.f29706a;
        pg.q.b(obj);
        v4.b bVar = (v4.b) this.f18401a;
        e.a<String> aVar2 = m1.f18520v;
        bVar.e(m1.f18521w, this.f18402b);
        return pg.f0.f21461a;
    }
}
