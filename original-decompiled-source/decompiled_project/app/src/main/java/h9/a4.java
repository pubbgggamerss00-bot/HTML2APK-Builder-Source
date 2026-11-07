package h9;

@vg.e(c = "com.basitce.htmltoapk.ui.screens.settings.SettingsViewModel$setRichAnimations$1", f = "SettingsViewModel.kt", l = {29}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class a4 extends vg.i implements eh.p<ph.i0, tg.e<? super pg.f0>, Object> {

    /* renamed from: a, reason: collision with root package name */
    public int f12516a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ b4 f12517b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f12518c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a4(b4 b4Var, boolean z10, tg.e<? super a4> eVar) {
        super(2, eVar);
        this.f12517b = b4Var;
        this.f12518c = z10;
    }

    @Override // vg.a
    public final tg.e<pg.f0> create(Object obj, tg.e<?> eVar) {
        return new a4(this.f12517b, this.f12518c, eVar);
    }

    @Override // eh.p
    public final Object invoke(ph.i0 i0Var, tg.e<? super pg.f0> eVar) {
        return ((a4) create(i0Var, eVar)).invokeSuspend(pg.f0.f21461a);
    }

    @Override // vg.a
    public final Object invokeSuspend(Object obj) {
        Object obj2 = ug.a.f29706a;
        int i10 = this.f12516a;
        if (i10 == 0) {
            pg.q.b(obj);
            n8.m1 m1Var = this.f12517b.f12538b;
            this.f12516a = 1;
            Object objA = v4.g.a(m1Var.f18526b, new n8.l0(this.f12518c, null), this);
            if (objA != obj2) {
                objA = pg.f0.f21461a;
            }
            if (objA == obj2) {
                return obj2;
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
