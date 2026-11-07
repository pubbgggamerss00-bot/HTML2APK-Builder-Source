package n8;

import v4.e;

@vg.e(c = "com.basitce.htmltoapk.data.repository.SettingsRepository$forgetLegacyJankAutoOff$2", f = "SettingsRepository.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class v extends vg.i implements eh.p<v4.b, tg.e<? super pg.f0>, Object> {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f18605a;

    @Override // vg.a
    public final tg.e<pg.f0> create(Object obj, tg.e<?> eVar) {
        v vVar = new v(2, eVar);
        vVar.f18605a = obj;
        return vVar;
    }

    @Override // eh.p
    public final Object invoke(v4.b bVar, tg.e<? super pg.f0> eVar) {
        return ((v) create(bVar, eVar)).invokeSuspend(pg.f0.f21461a);
    }

    @Override // vg.a
    public final Object invokeSuspend(Object obj) {
        ug.a aVar = ug.a.f29706a;
        pg.q.b(obj);
        v4.b bVar = (v4.b) this.f18605a;
        e.a<Boolean> aVar2 = m1.T;
        if (kotlin.jvm.internal.r.a(bVar.b(aVar2), Boolean.TRUE)) {
            bVar.d(aVar2);
            bVar.d(m1.R);
        }
        return pg.f0.f21461a;
    }
}
