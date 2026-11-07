package v;

@vg.e(c = "androidx.compose.foundation.gestures.MouseWheelScrollingLogic$userScroll$2", f = "MouseWheelScrollable.kt", l = {122}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class q0 extends vg.i implements eh.p<ph.i0, tg.e<? super pg.f0>, Object> {

    /* renamed from: a, reason: collision with root package name */
    public int f30030a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ s1 f30031b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ eh.p<s0, tg.e<? super pg.f0>, Object> f30032c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public q0(s1 s1Var, eh.p<? super s0, ? super tg.e<? super pg.f0>, ? extends Object> pVar, tg.e<? super q0> eVar) {
        super(2, eVar);
        this.f30031b = s1Var;
        this.f30032c = pVar;
    }

    @Override // vg.a
    public final tg.e<pg.f0> create(Object obj, tg.e<?> eVar) {
        return new q0(this.f30031b, this.f30032c, eVar);
    }

    @Override // eh.p
    public final Object invoke(ph.i0 i0Var, tg.e<? super pg.f0> eVar) {
        return ((q0) create(i0Var, eVar)).invokeSuspend(pg.f0.f21461a);
    }

    @Override // vg.a
    public final Object invokeSuspend(Object obj) {
        ug.a aVar = ug.a.f29706a;
        int i10 = this.f30030a;
        if (i10 == 0) {
            pg.q.b(obj);
            t.b1 b1Var = t.b1.f25168b;
            this.f30030a = 1;
            if (this.f30031b.f(b1Var, this.f30032c, this) == aVar) {
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
