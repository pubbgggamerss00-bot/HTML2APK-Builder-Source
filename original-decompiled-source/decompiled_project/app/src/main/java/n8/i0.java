package n8;

import v4.e;

@vg.e(c = "com.basitce.htmltoapk.data.repository.SettingsRepository$setProWatermarkResetDone$2", f = "SettingsRepository.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class i0 extends vg.i implements eh.p<v4.b, tg.e<? super pg.f0>, Object> {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f18472a;

    @Override // vg.a
    public final tg.e<pg.f0> create(Object obj, tg.e<?> eVar) {
        i0 i0Var = new i0(2, eVar);
        i0Var.f18472a = obj;
        return i0Var;
    }

    @Override // eh.p
    public final Object invoke(v4.b bVar, tg.e<? super pg.f0> eVar) {
        return ((i0) create(bVar, eVar)).invokeSuspend(pg.f0.f21461a);
    }

    @Override // vg.a
    public final Object invokeSuspend(Object obj) {
        ug.a aVar = ug.a.f29706a;
        pg.q.b(obj);
        v4.b bVar = (v4.b) this.f18472a;
        e.a<String> aVar2 = m1.f18520v;
        bVar.e(m1.L, Boolean.TRUE);
        return pg.f0.f21461a;
    }
}
