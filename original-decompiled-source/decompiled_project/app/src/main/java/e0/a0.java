package e0;

@vg.e(c = "androidx.compose.foundation.pager.PagerKt$pagerSemantics$performForwardPaging$1", f = "Pager.kt", l = {545}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class a0 extends vg.i implements eh.p<ph.i0, tg.e<? super pg.f0>, Object> {

    /* renamed from: a, reason: collision with root package name */
    public int f8115a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ b f8116b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a0(b bVar, tg.e eVar) {
        super(2, eVar);
        this.f8116b = bVar;
    }

    @Override // vg.a
    public final tg.e<pg.f0> create(Object obj, tg.e<?> eVar) {
        return new a0(this.f8116b, eVar);
    }

    @Override // eh.p
    public final Object invoke(ph.i0 i0Var, tg.e<? super pg.f0> eVar) {
        return ((a0) create(i0Var, eVar)).invokeSuspend(pg.f0.f21461a);
    }

    @Override // vg.a
    public final Object invokeSuspend(Object obj) {
        Object objG;
        Object obj2 = ug.a.f29706a;
        int i10 = this.f8115a;
        if (i10 == 0) {
            pg.q.b(obj);
            this.f8115a = 1;
            float f10 = e1.f8172a;
            b bVar = this.f8116b;
            if (bVar.j() + 1 >= bVar.m() || (objG = d1.g(bVar, bVar.j() + 1, null, this, 6)) != obj2) {
                objG = pg.f0.f21461a;
            }
            if (objG == obj2) {
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
