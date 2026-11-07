package n8;

import v4.e;

@vg.e(c = "com.basitce.htmltoapk.data.repository.SettingsRepository$consumeThirdLaunchProPrompt$2", f = "SettingsRepository.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class u extends vg.i implements eh.p<v4.b, tg.e<? super pg.f0>, Object> {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f18598a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.b0 f18599b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(kotlin.jvm.internal.b0 b0Var, tg.e<? super u> eVar) {
        super(2, eVar);
        this.f18599b = b0Var;
    }

    @Override // vg.a
    public final tg.e<pg.f0> create(Object obj, tg.e<?> eVar) {
        u uVar = new u(this.f18599b, eVar);
        uVar.f18598a = obj;
        return uVar;
    }

    @Override // eh.p
    public final Object invoke(v4.b bVar, tg.e<? super pg.f0> eVar) {
        return ((u) create(bVar, eVar)).invokeSuspend(pg.f0.f21461a);
    }

    @Override // vg.a
    public final Object invokeSuspend(Object obj) {
        ug.a aVar = ug.a.f29706a;
        pg.q.b(obj);
        v4.b bVar = (v4.b) this.f18598a;
        e.a<String> aVar2 = m1.f18520v;
        Integer num = (Integer) bVar.b(m1.C);
        if ((num != null ? num.intValue() : 0) >= 3) {
            e.a<Boolean> aVar3 = m1.B;
            Object objB = bVar.b(aVar3);
            Boolean bool = Boolean.TRUE;
            if (!kotlin.jvm.internal.r.a(objB, bool)) {
                bVar.e(aVar3, bool);
                this.f18599b.f16318a = true;
            }
        }
        return pg.f0.f21461a;
    }
}
