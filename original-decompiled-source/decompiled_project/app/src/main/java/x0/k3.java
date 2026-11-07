package x0;

import org.bouncycastle.asn1.eac.EACTags;

@vg.e(c = "androidx.compose.runtime.SnapshotStateKt__ProduceStateKt$produceState$1$1", f = "ProduceState.kt", l = {EACTags.INTEGRATED_CIRCUIT_MANUFACTURER_ID}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class k3 extends vg.i implements eh.p<ph.i0, tg.e<? super pg.f0>, Object> {

    /* renamed from: a, reason: collision with root package name */
    public int f31797a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f31798b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ eh.p<c2<Object>, tg.e<? super pg.f0>, Object> f31799c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ n1<Object> f31800d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public k3(eh.p<? super c2<Object>, ? super tg.e<? super pg.f0>, ? extends Object> pVar, n1<Object> n1Var, tg.e<? super k3> eVar) {
        super(2, eVar);
        this.f31799c = pVar;
        this.f31800d = n1Var;
    }

    @Override // vg.a
    public final tg.e<pg.f0> create(Object obj, tg.e<?> eVar) {
        k3 k3Var = new k3(this.f31799c, this.f31800d, eVar);
        k3Var.f31798b = obj;
        return k3Var;
    }

    @Override // eh.p
    public final Object invoke(ph.i0 i0Var, tg.e<? super pg.f0> eVar) {
        return ((k3) create(i0Var, eVar)).invokeSuspend(pg.f0.f21461a);
    }

    @Override // vg.a
    public final Object invokeSuspend(Object obj) {
        ug.a aVar = ug.a.f29706a;
        int i10 = this.f31797a;
        if (i10 == 0) {
            pg.q.b(obj);
            d2 d2Var = new d2(this.f31800d, ((ph.i0) this.f31798b).getCoroutineContext());
            this.f31797a = 1;
            if (this.f31799c.invoke(d2Var, this) == aVar) {
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
