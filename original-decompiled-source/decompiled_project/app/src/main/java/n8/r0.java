package n8;

import v4.e;

@vg.e(c = "com.basitce.htmltoapk.data.repository.SettingsRepository$setUpdatePromptedLaunchCount$2", f = "SettingsRepository.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class r0 extends vg.i implements eh.p<v4.b, tg.e<? super pg.f0>, Object> {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f18581a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f18582b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r0(int i10, tg.e<? super r0> eVar) {
        super(2, eVar);
        this.f18582b = i10;
    }

    @Override // vg.a
    public final tg.e<pg.f0> create(Object obj, tg.e<?> eVar) {
        r0 r0Var = new r0(this.f18582b, eVar);
        r0Var.f18581a = obj;
        return r0Var;
    }

    @Override // eh.p
    public final Object invoke(v4.b bVar, tg.e<? super pg.f0> eVar) {
        return ((r0) create(bVar, eVar)).invokeSuspend(pg.f0.f21461a);
    }

    @Override // vg.a
    public final Object invokeSuspend(Object obj) {
        ug.a aVar = ug.a.f29706a;
        pg.q.b(obj);
        v4.b bVar = (v4.b) this.f18581a;
        e.a<String> aVar2 = m1.f18520v;
        bVar.e(m1.J, new Integer(this.f18582b));
        return pg.f0.f21461a;
    }
}
