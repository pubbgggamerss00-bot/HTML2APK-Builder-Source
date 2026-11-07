package x8;

@vg.e(c = "com.basitce.htmltoapk.ui.screens.home.HomeViewModel$deleteFolder$1", f = "HomeViewModel.kt", l = {386}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class r6 extends vg.i implements eh.p<ph.i0, tg.e<? super pg.f0>, Object> {

    /* renamed from: a, reason: collision with root package name */
    public int f33125a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ j6 f33126b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f33127c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r6(j6 j6Var, long j10, tg.e<? super r6> eVar) {
        super(2, eVar);
        this.f33126b = j6Var;
        this.f33127c = j10;
    }

    @Override // vg.a
    public final tg.e<pg.f0> create(Object obj, tg.e<?> eVar) {
        return new r6(this.f33126b, this.f33127c, eVar);
    }

    @Override // eh.p
    public final Object invoke(ph.i0 i0Var, tg.e<? super pg.f0> eVar) {
        return ((r6) create(i0Var, eVar)).invokeSuspend(pg.f0.f21461a);
    }

    @Override // vg.a
    public final Object invokeSuspend(Object obj) {
        ug.a aVar = ug.a.f29706a;
        int i10 = this.f33125a;
        if (i10 == 0) {
            pg.q.b(obj);
            n8.i iVar = this.f33126b.f32779f;
            this.f33125a = 1;
            Object objDelete = iVar.f18469a.delete(this.f33127c, this);
            if (objDelete != aVar) {
                objDelete = pg.f0.f21461a;
            }
            if (objDelete == aVar) {
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
