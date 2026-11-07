package e9;

@vg.e(c = "com.basitce.htmltoapk.ui.screens.project.build.BuildViewModel$loadProject$1", f = "BuildViewModel.kt", l = {105}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class u0 extends vg.i implements eh.p<ph.i0, tg.e<? super pg.f0>, Object> {

    /* renamed from: a, reason: collision with root package name */
    public sh.z0 f8569a;

    /* renamed from: b, reason: collision with root package name */
    public int f8570b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ s0 f8571c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f8572d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u0(long j10, s0 s0Var, tg.e eVar) {
        super(2, eVar);
        this.f8571c = s0Var;
        this.f8572d = j10;
    }

    @Override // vg.a
    public final tg.e<pg.f0> create(Object obj, tg.e<?> eVar) {
        return new u0(this.f8572d, this.f8571c, eVar);
    }

    @Override // eh.p
    public final Object invoke(ph.i0 i0Var, tg.e<? super pg.f0> eVar) {
        return ((u0) create(i0Var, eVar)).invokeSuspend(pg.f0.f21461a);
    }

    @Override // vg.a
    public final Object invokeSuspend(Object obj) {
        sh.z0 z0Var;
        ug.a aVar = ug.a.f29706a;
        int i10 = this.f8570b;
        if (i10 == 0) {
            pg.q.b(obj);
            s0 s0Var = this.f8571c;
            sh.z0 z0Var2 = s0Var.f8525l;
            n8.s sVar = s0Var.f8516c;
            this.f8569a = z0Var2;
            this.f8570b = 1;
            obj = sVar.f18583a.getById(this.f8572d, this);
            if (obj == aVar) {
                return aVar;
            }
            z0Var = z0Var2;
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            z0Var = this.f8569a;
            pg.q.b(obj);
        }
        z0Var.setValue(obj);
        return pg.f0.f21461a;
    }
}
