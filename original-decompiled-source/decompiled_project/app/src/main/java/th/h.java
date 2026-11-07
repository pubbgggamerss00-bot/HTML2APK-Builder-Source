package th;

import pg.f0;

@vg.e(c = "kotlinx.coroutines.flow.internal.ChannelFlowOperator$collectWithContextUndispatched$2", f = "ChannelFlow.kt", l = {148}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class h extends vg.i implements eh.p<sh.g<Object>, tg.e<? super f0>, Object> {

    /* renamed from: a, reason: collision with root package name */
    public int f28793a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f28794b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ i<Object, Object> f28795c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(i<Object, Object> iVar, tg.e<? super h> eVar) {
        super(2, eVar);
        this.f28795c = iVar;
    }

    @Override // vg.a
    public final tg.e<f0> create(Object obj, tg.e<?> eVar) {
        h hVar = new h(this.f28795c, eVar);
        hVar.f28794b = obj;
        return hVar;
    }

    @Override // eh.p
    public final Object invoke(sh.g<Object> gVar, tg.e<? super f0> eVar) {
        return ((h) create(gVar, eVar)).invokeSuspend(f0.f21461a);
    }

    @Override // vg.a
    public final Object invokeSuspend(Object obj) {
        ug.a aVar = ug.a.f29706a;
        int i10 = this.f28793a;
        if (i10 == 0) {
            pg.q.b(obj);
            sh.g<? super Object> gVar = (sh.g) this.f28794b;
            this.f28793a = 1;
            if (this.f28795c.i(gVar, this) == aVar) {
                return aVar;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            pg.q.b(obj);
        }
        return f0.f21461a;
    }
}
