package n8;

import v4.e;

@vg.e(c = "com.basitce.htmltoapk.data.repository.SettingsRepository$incrementLaunchCount$2", f = "SettingsRepository.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class w extends vg.i implements eh.p<v4.b, tg.e<? super pg.f0>, Object> {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f18611a;

    @Override // vg.a
    public final tg.e<pg.f0> create(Object obj, tg.e<?> eVar) {
        w wVar = new w(2, eVar);
        wVar.f18611a = obj;
        return wVar;
    }

    @Override // eh.p
    public final Object invoke(v4.b bVar, tg.e<? super pg.f0> eVar) {
        return ((w) create(bVar, eVar)).invokeSuspend(pg.f0.f21461a);
    }

    @Override // vg.a
    public final Object invokeSuspend(Object obj) {
        ug.a aVar = ug.a.f29706a;
        pg.q.b(obj);
        v4.b bVar = (v4.b) this.f18611a;
        e.a<String> aVar2 = m1.f18520v;
        e.a<Integer> aVar3 = m1.C;
        Integer num = (Integer) bVar.b(aVar3);
        bVar.e(aVar3, new Integer((num != null ? num.intValue() : 0) + 1));
        return pg.f0.f21461a;
    }
}
