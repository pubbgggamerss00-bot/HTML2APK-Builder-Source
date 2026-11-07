package z8;

import e0.d1;
import ph.i0;

@vg.e(c = "com.basitce.htmltoapk.ui.screens.onboarding.OnboardingScreenKt$OnboardingScreen$2$2$3$1$1", f = "OnboardingScreen.kt", l = {197}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class u extends vg.i implements eh.p<i0, tg.e<? super pg.f0>, Object> {

    /* renamed from: a, reason: collision with root package name */
    public int f34857a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ e0.b f34858b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(e0.b bVar, tg.e eVar) {
        super(2, eVar);
        this.f34858b = bVar;
    }

    @Override // vg.a
    public final tg.e<pg.f0> create(Object obj, tg.e<?> eVar) {
        return new u(this.f34858b, eVar);
    }

    @Override // eh.p
    public final Object invoke(i0 i0Var, tg.e<? super pg.f0> eVar) {
        return ((u) create(i0Var, eVar)).invokeSuspend(pg.f0.f21461a);
    }

    @Override // vg.a
    public final Object invokeSuspend(Object obj) {
        ug.a aVar = ug.a.f29706a;
        int i10 = this.f34857a;
        if (i10 == 0) {
            pg.q.b(obj);
            e0.b bVar = this.f34858b;
            int iJ = bVar.j() + 1;
            this.f34857a = 1;
            if (d1.g(bVar, iJ, null, this, 6) == aVar) {
                return aVar;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            pg.q.b(obj);
        }
        return pg.f0.f21461a;
    }
}
