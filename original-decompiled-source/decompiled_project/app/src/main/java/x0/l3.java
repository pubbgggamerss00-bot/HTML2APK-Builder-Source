package x0;

@vg.e(c = "androidx.compose.runtime.SnapshotStateKt__ProduceStateKt$produceState$3$1", f = "ProduceState.kt", l = {138}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class l3 extends vg.i implements eh.p<ph.i0, tg.e<? super pg.f0>, Object> {

    /* renamed from: a, reason: collision with root package name */
    public int f31804a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f31805b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ eh.p<c2<Object>, tg.e<? super pg.f0>, Object> f31806c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ n1<Object> f31807d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public l3(eh.p<? super c2<Object>, ? super tg.e<? super pg.f0>, ? extends Object> pVar, n1<Object> n1Var, tg.e<? super l3> eVar) {
        super(2, eVar);
        this.f31806c = pVar;
        this.f31807d = n1Var;
    }

    @Override // vg.a
    public final tg.e<pg.f0> create(Object obj, tg.e<?> eVar) {
        l3 l3Var = new l3(this.f31806c, this.f31807d, eVar);
        l3Var.f31805b = obj;
        return l3Var;
    }

    @Override // eh.p
    public final Object invoke(ph.i0 i0Var, tg.e<? super pg.f0> eVar) {
        return ((l3) create(i0Var, eVar)).invokeSuspend(pg.f0.f21461a);
    }

    @Override // vg.a
    public final Object invokeSuspend(Object obj) {
        ug.a aVar = ug.a.f29706a;
        int i10 = this.f31804a;
        if (i10 == 0) {
            pg.q.b(obj);
            d2 d2Var = new d2(this.f31807d, ((ph.i0) this.f31805b).getCoroutineContext());
            this.f31804a = 1;
            if (this.f31806c.invoke(d2Var, this) == aVar) {
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
