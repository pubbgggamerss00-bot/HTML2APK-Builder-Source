package x8;

@vg.e(c = "com.basitce.htmltoapk.ui.screens.home.HomeViewModel$markFolderIntroSeen$1", f = "HomeViewModel.kt", l = {366}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class h7 extends vg.i implements eh.p<ph.i0, tg.e<? super pg.f0>, Object> {

    /* renamed from: a, reason: collision with root package name */
    public int f32729a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ j6 f32730b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h7(j6 j6Var, tg.e<? super h7> eVar) {
        super(2, eVar);
        this.f32730b = j6Var;
    }

    @Override // vg.a
    public final tg.e<pg.f0> create(Object obj, tg.e<?> eVar) {
        return new h7(this.f32730b, eVar);
    }

    @Override // eh.p
    public final Object invoke(ph.i0 i0Var, tg.e<? super pg.f0> eVar) {
        return ((h7) create(i0Var, eVar)).invokeSuspend(pg.f0.f21461a);
    }

    @Override // vg.a
    public final Object invokeSuspend(Object obj) {
        Object obj2 = ug.a.f29706a;
        int i10 = this.f32729a;
        if (i10 == 0) {
            pg.q.b(obj);
            n8.m1 m1Var = this.f32730b.f32777d;
            this.f32729a = 1;
            Object objA = v4.g.a(m1Var.f18526b, new n8.m0(2, null), this);
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
