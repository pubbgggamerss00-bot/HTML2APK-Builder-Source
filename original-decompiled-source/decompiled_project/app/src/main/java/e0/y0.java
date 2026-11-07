package e0;

@vg.e(c = "androidx.compose.foundation.pager.PagerState$requestScrollToPage$1", f = "PagerState.kt", l = {581}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class y0 extends vg.i implements eh.p<ph.i0, tg.e<? super pg.f0>, Object> {

    /* renamed from: a, reason: collision with root package name */
    public int f8328a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ b f8329b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y0(b bVar, tg.e eVar) {
        super(2, eVar);
        this.f8329b = bVar;
    }

    @Override // vg.a
    public final tg.e<pg.f0> create(Object obj, tg.e<?> eVar) {
        return new y0(this.f8329b, eVar);
    }

    @Override // eh.p
    public final Object invoke(ph.i0 i0Var, tg.e<? super pg.f0> eVar) {
        return ((y0) create(i0Var, eVar)).invokeSuspend(pg.f0.f21461a);
    }

    @Override // vg.a
    public final Object invokeSuspend(Object obj) {
        Object obj2 = ug.a.f29706a;
        int i10 = this.f8328a;
        if (i10 == 0) {
            pg.q.b(obj);
            this.f8328a = 1;
            Object objS = d1.s(this.f8329b, t.b1.f25167a, new v.a1(2, null), this);
            if (objS != obj2) {
                objS = pg.f0.f21461a;
            }
            if (objS == obj2) {
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
