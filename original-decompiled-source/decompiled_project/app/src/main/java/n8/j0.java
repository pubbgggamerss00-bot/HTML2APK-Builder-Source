package n8;

import java.util.ArrayList;

@vg.e(c = "com.basitce.htmltoapk.data.repository.SettingsRepository$setProjectOrder$2", f = "SettingsRepository.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class j0 extends vg.i implements eh.p<v4.b, tg.e<? super pg.f0>, Object> {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f18481a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ArrayList f18482b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j0(ArrayList arrayList, tg.e eVar) {
        super(2, eVar);
        this.f18482b = arrayList;
    }

    @Override // vg.a
    public final tg.e<pg.f0> create(Object obj, tg.e<?> eVar) {
        j0 j0Var = new j0(this.f18482b, eVar);
        j0Var.f18481a = obj;
        return j0Var;
    }

    @Override // eh.p
    public final Object invoke(v4.b bVar, tg.e<? super pg.f0> eVar) {
        return ((j0) create(bVar, eVar)).invokeSuspend(pg.f0.f21461a);
    }

    @Override // vg.a
    public final Object invokeSuspend(Object obj) {
        ug.a aVar = ug.a.f29706a;
        pg.q.b(obj);
        ((v4.b) this.f18481a).e(m1.f18520v, qg.x.I(qg.x.x(this.f18482b), ",", null, null, null, 62));
        return pg.f0.f21461a;
    }
}
