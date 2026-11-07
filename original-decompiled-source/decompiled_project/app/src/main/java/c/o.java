package c;

import pg.f0;
import ph.i0;

@vg.e(c = "androidx.activity.compose.PredictiveBackHandlerKt$PredictiveBackHandler$2$1", f = "PredictiveBackHandler.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class o extends vg.i implements eh.p<i0, tg.e<? super f0>, Object> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ n f4326a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f4327b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(n nVar, boolean z10, tg.e<? super o> eVar) {
        super(2, eVar);
        this.f4326a = nVar;
        this.f4327b = z10;
    }

    @Override // vg.a
    public final tg.e<f0> create(Object obj, tg.e<?> eVar) {
        return new o(this.f4326a, this.f4327b, eVar);
    }

    @Override // eh.p
    public final Object invoke(i0 i0Var, tg.e<? super f0> eVar) {
        return ((o) create(i0Var, eVar)).invokeSuspend(f0.f21461a);
    }

    @Override // vg.a
    public final Object invokeSuspend(Object obj) {
        m mVar;
        ug.a aVar = ug.a.f29706a;
        pg.q.b(obj);
        n nVar = this.f4326a;
        boolean z10 = this.f4327b;
        if (!z10 && !nVar.f4325g && nVar.f3277a && (mVar = nVar.f4324f) != null) {
            mVar.a();
        }
        nVar.f(z10);
        return f0.f21461a;
    }
}
