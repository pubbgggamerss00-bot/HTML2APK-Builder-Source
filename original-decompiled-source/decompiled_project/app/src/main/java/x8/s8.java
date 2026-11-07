package x8;

@vg.e(c = "com.basitce.htmltoapk.ui.screens.home.ProjectReorderStateKt$rememberProjectReorderState$3$1", f = "ProjectReorderState.kt", l = {167}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class s8 extends vg.i implements eh.p<ph.i0, tg.e<? super pg.f0>, Object> {

    /* renamed from: a, reason: collision with root package name */
    public int f33183a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ n8 f33184b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s8(n8 n8Var, tg.e<? super s8> eVar) {
        super(2, eVar);
        this.f33184b = n8Var;
    }

    @Override // vg.a
    public final tg.e<pg.f0> create(Object obj, tg.e<?> eVar) {
        return new s8(this.f33184b, eVar);
    }

    @Override // eh.p
    public final Object invoke(ph.i0 i0Var, tg.e<? super pg.f0> eVar) {
        return ((s8) create(i0Var, eVar)).invokeSuspend(pg.f0.f21461a);
    }

    @Override // vg.a
    public final Object invokeSuspend(Object obj) {
        ug.a aVar = ug.a.f29706a;
        int i10 = this.f33183a;
        if (i10 == 0) {
            pg.q.b(obj);
            n8 n8Var = this.f33184b;
            if (n8Var.g() != null) {
                this.f33183a = 1;
                if (n8Var.h(this) == aVar) {
                    return aVar;
                }
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
