package d0;

@vg.e(c = "androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimation$cancelPlacementAnimation$1", f = "LazyLayoutItemAnimation.kt", l = {106}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class s extends vg.i implements eh.p<ph.i0, tg.e<? super pg.f0>, Object> {

    /* renamed from: a, reason: collision with root package name */
    public int f7273a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ p f7274b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(p pVar, tg.e<? super s> eVar) {
        super(2, eVar);
        this.f7274b = pVar;
    }

    @Override // vg.a
    public final tg.e<pg.f0> create(Object obj, tg.e<?> eVar) {
        return new s(this.f7274b, eVar);
    }

    @Override // eh.p
    public final Object invoke(ph.i0 i0Var, tg.e<? super pg.f0> eVar) {
        return ((s) create(i0Var, eVar)).invokeSuspend(pg.f0.f21461a);
    }

    @Override // vg.a
    public final Object invokeSuspend(Object obj) {
        ug.a aVar = ug.a.f29706a;
        int i10 = this.f7273a;
        p pVar = this.f7274b;
        if (i10 == 0) {
            pg.q.b(obj);
            s.b<f3.m, s.p> bVar = pVar.f7230o;
            f3.m mVar = new f3.m(0L);
            this.f7273a = 1;
            if (bVar.f(mVar, this) == aVar) {
                return aVar;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            pg.q.b(obj);
        }
        int i11 = p.f7215t;
        pVar.g(0L);
        pVar.f(false);
        return pg.f0.f21461a;
    }
}
