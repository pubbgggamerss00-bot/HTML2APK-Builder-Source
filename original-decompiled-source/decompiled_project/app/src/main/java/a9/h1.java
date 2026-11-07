package a9;

import i8.a;

@vg.e(c = "com.basitce.htmltoapk.ui.screens.premium.PremiumScreenKt$PremiumScreen$2$1", f = "PremiumScreen.kt", l = {158}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class h1 extends vg.i implements eh.p<ph.i0, tg.e<? super pg.f0>, Object> {

    /* renamed from: a, reason: collision with root package name */
    public int f232a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f233b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ x0.n1<Boolean> f234c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ x0.n1 f235d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h1(boolean z10, x0.n1 n1Var, x0.n1 n1Var2, tg.e eVar) {
        super(2, eVar);
        this.f233b = z10;
        this.f234c = n1Var;
        this.f235d = n1Var2;
    }

    @Override // vg.a
    public final tg.e<pg.f0> create(Object obj, tg.e<?> eVar) {
        return new h1(this.f233b, this.f234c, this.f235d, eVar);
    }

    @Override // eh.p
    public final Object invoke(ph.i0 i0Var, tg.e<? super pg.f0> eVar) {
        return ((h1) create(i0Var, eVar)).invokeSuspend(pg.f0.f21461a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // vg.a
    public final Object invokeSuspend(Object obj) {
        ug.a aVar = ug.a.f29706a;
        int i10 = this.f232a;
        x0.n1<Boolean> n1Var = this.f234c;
        if (i10 == 0) {
            pg.q.b(obj);
            n1Var.setValue(Boolean.TRUE);
            if ((((i8.a) this.f235d.getValue()) instanceof a.C0133a) && this.f233b) {
                this.f232a = 1;
                if (ph.t0.b(8000L, this) == aVar) {
                    return aVar;
                }
            }
            return pg.f0.f21461a;
        }
        if (i10 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        pg.q.b(obj);
        n1Var.setValue(Boolean.FALSE);
        return pg.f0.f21461a;
    }
}
