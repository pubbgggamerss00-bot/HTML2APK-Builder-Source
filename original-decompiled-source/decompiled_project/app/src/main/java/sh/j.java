package sh;

@vg.e(c = "kotlinx.coroutines.flow.FlowKt__CollectKt$launchIn$1", f = "Collect.kt", l = {46}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class j extends vg.i implements eh.p<ph.i0, tg.e<? super pg.f0>, Object> {

    /* renamed from: a, reason: collision with root package name */
    public int f24993a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ c0 f24994b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(c0 c0Var, tg.e eVar) {
        super(2, eVar);
        this.f24994b = c0Var;
    }

    @Override // vg.a
    public final tg.e<pg.f0> create(Object obj, tg.e<?> eVar) {
        return new j(this.f24994b, eVar);
    }

    @Override // eh.p
    public final Object invoke(ph.i0 i0Var, tg.e<? super pg.f0> eVar) {
        return ((j) create(i0Var, eVar)).invokeSuspend(pg.f0.f21461a);
    }

    @Override // vg.a
    public final Object invokeSuspend(Object obj) {
        ug.a aVar = ug.a.f29706a;
        int i10 = this.f24993a;
        if (i10 == 0) {
            pg.q.b(obj);
            this.f24993a = 1;
            Object objB = this.f24994b.b(th.t.f28847a, this);
            if (objB != aVar) {
                objB = pg.f0.f21461a;
            }
            if (objB == aVar) {
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
