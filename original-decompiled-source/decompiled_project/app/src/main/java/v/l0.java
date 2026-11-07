package v;

import v.f0;

@vg.e(c = "androidx.compose.foundation.gestures.MouseWheelScrollingLogic$dispatchMouseWheelScroll$waitNextScrollDelta$2", f = "MouseWheelScrollable.kt", l = {227}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class l0 extends vg.i implements eh.p<ph.i0, tg.e<? super f0.a>, Object> {

    /* renamed from: a, reason: collision with root package name */
    public int f29984a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ f0 f29985b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l0(f0 f0Var, tg.e<? super l0> eVar) {
        super(2, eVar);
        this.f29985b = f0Var;
    }

    @Override // vg.a
    public final tg.e<pg.f0> create(Object obj, tg.e<?> eVar) {
        return new l0(this.f29985b, eVar);
    }

    @Override // eh.p
    public final Object invoke(ph.i0 i0Var, tg.e<? super f0.a> eVar) {
        return ((l0) create(i0Var, eVar)).invokeSuspend(pg.f0.f21461a);
    }

    @Override // vg.a
    public final Object invokeSuspend(Object obj) {
        ug.a aVar = ug.a.f29706a;
        int i10 = this.f29984a;
        if (i10 != 0) {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            pg.q.b(obj);
            return obj;
        }
        pg.q.b(obj);
        rh.c cVar = this.f29985b.f29859e;
        this.f29984a = 1;
        Object objC = ph.j0.c(new h0(cVar, null), this);
        return objC == aVar ? aVar : objC;
    }
}
