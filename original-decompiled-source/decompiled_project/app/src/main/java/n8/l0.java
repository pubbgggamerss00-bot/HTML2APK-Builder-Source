package n8;

import v4.e;

@vg.e(c = "com.basitce.htmltoapk.data.repository.SettingsRepository$setRichAnimations$2", f = "SettingsRepository.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class l0 extends vg.i implements eh.p<v4.b, tg.e<? super pg.f0>, Object> {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f18513a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f18514b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l0(boolean z10, tg.e<? super l0> eVar) {
        super(2, eVar);
        this.f18514b = z10;
    }

    @Override // vg.a
    public final tg.e<pg.f0> create(Object obj, tg.e<?> eVar) {
        l0 l0Var = new l0(this.f18514b, eVar);
        l0Var.f18513a = obj;
        return l0Var;
    }

    @Override // eh.p
    public final Object invoke(v4.b bVar, tg.e<? super pg.f0> eVar) {
        return ((l0) create(bVar, eVar)).invokeSuspend(pg.f0.f21461a);
    }

    @Override // vg.a
    public final Object invokeSuspend(Object obj) {
        ug.a aVar = ug.a.f29706a;
        pg.q.b(obj);
        v4.b bVar = (v4.b) this.f18513a;
        e.a<String> aVar2 = m1.f18520v;
        bVar.e(m1.R, Boolean.valueOf(this.f18514b));
        return pg.f0.f21461a;
    }
}
