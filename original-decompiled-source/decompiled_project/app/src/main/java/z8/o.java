package z8;

import ph.i0;
import x0.l1;

@vg.e(c = "com.basitce.htmltoapk.ui.screens.onboarding.OnboardingScreenKt$OnboardingScreen$1$1", f = "OnboardingScreen.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class o extends vg.i implements eh.p<i0, tg.e<? super pg.f0>, Object> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ e0.b f34839a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ l1 f34840b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(e0.b bVar, l1 l1Var, tg.e eVar) {
        super(2, eVar);
        this.f34839a = bVar;
        this.f34840b = l1Var;
    }

    @Override // vg.a
    public final tg.e<pg.f0> create(Object obj, tg.e<?> eVar) {
        return new o(this.f34839a, this.f34840b, eVar);
    }

    @Override // eh.p
    public final Object invoke(i0 i0Var, tg.e<? super pg.f0> eVar) {
        return ((o) create(i0Var, eVar)).invokeSuspend(pg.f0.f21461a);
    }

    @Override // vg.a
    public final Object invokeSuspend(Object obj) {
        ug.a aVar = ug.a.f29706a;
        pg.q.b(obj);
        this.f34840b.f(this.f34839a.j());
        return pg.f0.f21461a;
    }
}
