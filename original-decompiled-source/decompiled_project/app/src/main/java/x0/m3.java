package x0;

@vg.e(c = "androidx.compose.runtime.SnapshotStateKt__ProduceStateKt$produceState$5$1", f = "ProduceState.kt", l = {201}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class m3 extends vg.i implements eh.p<ph.i0, tg.e<? super pg.f0>, Object> {

    /* renamed from: a, reason: collision with root package name */
    public int f31814a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f31815b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ eh.p<c2<Object>, tg.e<? super pg.f0>, Object> f31816c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ n1<Object> f31817d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public m3(eh.p<? super c2<Object>, ? super tg.e<? super pg.f0>, ? extends Object> pVar, n1<Object> n1Var, tg.e<? super m3> eVar) {
        super(2, eVar);
        this.f31816c = pVar;
        this.f31817d = n1Var;
    }

    @Override // vg.a
    public final tg.e<pg.f0> create(Object obj, tg.e<?> eVar) {
        m3 m3Var = new m3(this.f31816c, this.f31817d, eVar);
        m3Var.f31815b = obj;
        return m3Var;
    }

    @Override // eh.p
    public final Object invoke(ph.i0 i0Var, tg.e<? super pg.f0> eVar) {
        return ((m3) create(i0Var, eVar)).invokeSuspend(pg.f0.f21461a);
    }

    @Override // vg.a
    public final Object invokeSuspend(Object obj) {
        ug.a aVar = ug.a.f29706a;
        int i10 = this.f31814a;
        if (i10 == 0) {
            pg.q.b(obj);
            d2 d2Var = new d2(this.f31817d, ((ph.i0) this.f31815b).getCoroutineContext());
            this.f31814a = 1;
            if (this.f31816c.invoke(d2Var, this) == aVar) {
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
