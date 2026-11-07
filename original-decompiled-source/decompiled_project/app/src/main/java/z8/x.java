package z8;

import ph.i0;
import s8.e2;
import x8.c2;

@vg.e(c = "com.basitce.htmltoapk.ui.screens.onboarding.OnboardingScreenKt$OnboardingScreen$finish$1", f = "OnboardingScreen.kt", l = {119}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class x extends vg.i implements eh.p<i0, tg.e<? super pg.f0>, Object> {

    /* renamed from: a, reason: collision with root package name */
    public int f34870a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ e0 f34871b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f34872c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ p5.x f34873d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(e0 e0Var, String str, p5.x xVar, tg.e<? super x> eVar) {
        super(2, eVar);
        this.f34871b = e0Var;
        this.f34872c = str;
        this.f34873d = xVar;
    }

    @Override // vg.a
    public final tg.e<pg.f0> create(Object obj, tg.e<?> eVar) {
        return new x(this.f34871b, this.f34872c, this.f34873d, eVar);
    }

    @Override // eh.p
    public final Object invoke(i0 i0Var, tg.e<? super pg.f0> eVar) {
        return ((x) create(i0Var, eVar)).invokeSuspend(pg.f0.f21461a);
    }

    @Override // vg.a
    public final Object invokeSuspend(Object obj) {
        ug.a aVar = ug.a.f29706a;
        int i10 = this.f34870a;
        if (i10 == 0) {
            pg.q.b(obj);
            String str = this.f34872c;
            boolean z10 = str != null;
            this.f34870a = 1;
            if (this.f34871b.f(str, z10, this) == aVar) {
                return aVar;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            pg.q.b(obj);
        }
        this.f34873d.b(new c2(1), e2.j.f24640c.f24627a);
        return pg.f0.f21461a;
    }
}
